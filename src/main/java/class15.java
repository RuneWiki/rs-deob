import java.awt.Font;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class15 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Li;")
    public static class88 field222 = class208.method1425(105, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Li;")
    public static class88 field233 = class208.method1425(105, "null");

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
    public static int[] field224 = new int[] { 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 2, 3, -2, 0, 0, 0, -1, -2, 0, -2, 0, -2, 24, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, -2, 2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 8, -1, 0, 1, 0, 0, 0, 6, 0, -1, 2, 0, 10, 0, -2, 0, 0, 0, 0, 1, 0, 3, 0, 2, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 4, -1, 0, 0, 0, 0, 0, 0, 20, 0, -2, 0, 0, 5, 3, 0, -2, -1, 0, 0, 10, 0, 0, 15, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 7, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 12, 1, 0, 5, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 4, -1, 6, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1, -2, 4, 0, 5, 6, 0, 0, 0, 0, 4, 3, 0, 4, 0, 0, -1, 6, -1, 0, 0, 0, 0, 0, 0, 0, 9, -2, 0, 0, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, -2, 7, 0, 7, -1, 0, -1, 0, 3, 0, 8, 0, 2, 4, 4, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Ltj;")
    public static class217 field226;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Ljava/awt/Font;")
    public static Font field228;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[I")
    public static int[] field234;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLae;I)V")
    public static final void method71(boolean arg0, class6 arg1, int arg2) {
        field223++;
        if (arg0) {
            return;
        }
        while (true) {
            class9 var3 = (class9) class89.field1695.method1612(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field124; var5++) {
                if (var3.field139[var5] != null) {
                    if (var3.field139[var5].field3136 == 2) {
                        var3.field132[var5] = -5;
                    }
                    if (var3.field139[var5].field3136 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field138[var5] != null) {
                    if (var3.field138[var5].field3136 == 2) {
                        var3.field132[var5] = -6;
                    }
                    if (var3.field138[var5].field3136 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method30((byte) -54, arg2);
            arg1.method346(255, 0);
            int var6 = arg1.field831;
            arg1.method338(2112555600, var3.field136);
            for (int var7 = 0; var7 < var3.field124; var7++) {
                if (var3.field132[var7] == 0) {
                    try {
                        int var8 = var3.field128[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field139[var7].field3131;
                            int var10 = var9.getInt(null);
                            arg1.method346(255, 0);
                            arg1.method338(2112555600, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field139[var7].field3131;
                            var13.setInt(null, var3.field129[var7]);
                            arg1.method346(255, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field139[var7].field3131;
                            int var12 = var11.getModifiers();
                            arg1.method346(255, 0);
                            arg1.method338(2112555600, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field138[var7].field3131;
                            byte[][] var17 = var3.field131[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method346(255, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method346(255, 1);
                                arg1.method328(((Number) var21).longValue(), (byte) -122);
                            } else if (var21 instanceof class88) {
                                arg1.method346(255, 2);
                                arg1.method336((class88) var21, (byte) 0);
                            } else {
                                arg1.method346(255, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field138[var7].field3131;
                            int var15 = var14.getModifiers();
                            arg1.method346(255, 0);
                            arg1.method338(2112555600, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method346(255, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method346(255, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method346(255, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method346(255, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method346(255, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method346(255, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method346(255, -16);
                    } catch (SecurityException var29) {
                        arg1.method346(255, -17);
                    } catch (IOException var30) {
                        arg1.method346(255, -18);
                    } catch (NullPointerException var31) {
                        arg1.method346(255, -19);
                    } catch (Exception var32) {
                        arg1.method346(255, -20);
                    } catch (Throwable var33) {
                        arg1.method346(255, -21);
                    }
                } else {
                    arg1.method346(255, var3.field132[var7]);
                }
            }
            arg1.method345(var6, (byte) 121);
            arg1.method341(arg1.field831 - var6, 75);
            var3.method460(true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Li;I)I")
    public static final int method72(class88 arg0, int arg1) {
        if (arg1 != 1) {
            method73(-30, -125, -111, -106, (byte) -122);
        }
        field225++;
        return arg0.method604((byte) -53) + 1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIB)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field232++;
        for (class143 var5 = (class143) class66.field1196.method1612(false); var5 != null; var5 = (class143) class66.field1196.method1621(82)) {
            if (var5.field2631 != -1 || var5.field2637 != null) {
                int var6 = 0;
                if (var5.field2641 < arg2) {
                    var6 += arg2 - var5.field2641;
                } else if (arg2 < var5.field2657) {
                    var6 += var5.field2657 - arg2;
                }
                if (arg0 > var5.field2632) {
                    var6 += arg0 - var5.field2632;
                } else if (arg0 < var5.field2634) {
                    var6 += var5.field2634 - arg0;
                }
                if (var5.field2640 < var6 - 64 || class223.field4213 == 0 || var5.field2649 != arg3) {
                    if (var5.field2646 != null) {
                        class226.field4250.method1511(var5.field2646);
                        var5.field2646 = null;
                    }
                    if (var5.field2628 != null) {
                        class226.field4250.method1511(var5.field2628);
                        var5.field2628 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field2640 - var6) * class223.field4213 / var5.field2640;
                    if (var5.field2646 != null) {
                        var5.field2646.method1119(var7);
                    } else if (var5.field2631 >= 0) {
                        class38 var8 = class38.method252(class12.field172, var5.field2631, 0);
                        if (var8 != null) {
                            class213 var9 = var8.method253().method1455(class117.field2126);
                            class162 var10 = class162.method1126(var9, 100, var7);
                            var10.method1121(-1);
                            class226.field4250.method1508(var10);
                            var5.field2646 = var10;
                        }
                    }
                    if (var5.field2628 != null) {
                        var5.field2628.method1119(var7);
                        if (!var5.field2628.method459(arg4 - 5)) {
                            var5.field2628 = null;
                        }
                    } else if (var5.field2637 != null && (var5.field2630 -= arg1) <= 0) {
                        int var11 = (int) ((double) var5.field2637.length * Math.random());
                        class38 var12 = class38.method252(class12.field172, var5.field2637[var11], 0);
                        if (var12 != null) {
                            class213 var13 = var12.method253().method1455(class117.field2126);
                            class162 var14 = class162.method1126(var13, 100, var7);
                            var14.method1121(0);
                            class226.field4250.method1508(var14);
                            var5.field2630 = (int) ((double) (var5.field2642 - var5.field2647) * Math.random()) + var5.field2647;
                            var5.field2628 = var14;
                        }
                    }
                }
            }
        }
        if (arg4 != 6) {
            field233 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method74(int arg0) {
        field227++;
        class241.field4473.method671(103);
        class210.field3991.method671(123);
        if (arg0 != -1669) {
            field226 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Lk;")
    public static final class109 method75(int arg0, byte arg1) {
        field230++;
        class109 var2 = (class109) class241.field4473.method666((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field672.method941((byte) 56, class9.method50(arg0, (byte) -72), class211.method1443(arg0, true));
        class109 var4 = new class109();
        if (var3 != null) {
            var4.method753(new class46(var3), false);
        }
        var4.method759((byte) 62);
        class241.field4473.method664((long) arg0, var4, false);
        int var5 = 127 / ((7 - arg1) / 34);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method76(byte arg0) {
        field234 = null;
        field226 = null;
        field233 = null;
        field224 = null;
        field222 = null;
        field228 = null;
        if (arg0 < 103) {
            method71(false, null, -32);
        }
    }
}
