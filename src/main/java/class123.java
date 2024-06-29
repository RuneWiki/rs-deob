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

@OriginalClass("client!mg")
public class class123 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public int field2699 = -1;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Ldd;")
    public static class35 field2698 = class180.method1196((byte) -43, "sl_flags");

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2705 = 7759444;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lmd;")
    public class120 field2707;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[I")
    public int[] field2697;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "[Ldd;")
    public class35[] field2708;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ID)V")
    public static final void method873(int arg0, double arg1) {
        if (arg0 != -257) {
            field2698 = null;
        }
        if (class48.field1059 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class15.field267[var3] = var4 <= 255 ? var4 : 255;
            }
            class48.field1059 = arg1;
        }
        field2704++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method874(int arg0) {
        field2698 = null;
        if (arg0 != 0) {
            field2705 = 51;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILja;Z)V")
    public static final void method875(int arg0, class90 arg1, boolean arg2) {
        field2703++;
        if (!arg2) {
            method876(-7, -111);
        }
        while (true) {
            class43 var3 = (class43) class172.field3438.method1232(25831);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field932; var5++) {
                if (var3.field933[var5] != null) {
                    if (var3.field933[var5].field1806 == 2) {
                        var3.field946[var5] = -5;
                    }
                    if (var3.field933[var5].field1806 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field950[var5] != null) {
                    if (var3.field950[var5].field1806 == 2) {
                        var3.field946[var5] = -6;
                    }
                    if (var3.field950[var5].field1806 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method659(arg0, arg2);
            arg1.method257((byte) 126, 0);
            int var6 = arg1.field527;
            arg1.method249(var3.field937, 105);
            for (int var7 = 0; var7 < var3.field932; var7++) {
                if (var3.field946[var7] == 0) {
                    try {
                        int var8 = var3.field931[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field933[var7].field1804;
                            int var10 = var9.getInt(null);
                            arg1.method257((byte) 126, 0);
                            arg1.method249(var10, 82);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field933[var7].field1804;
                            var13.setInt(null, var3.field949[var7]);
                            arg1.method257((byte) 126, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field933[var7].field1804;
                            int var12 = var11.getModifiers();
                            arg1.method257((byte) 126, 0);
                            arg1.method249(var12, -106);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field950[var7].field1804;
                            byte[][] var17 = var3.field945[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method257((byte) 126, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method257((byte) 126, 1);
                                arg1.method239((byte) 106, ((Number) var21).longValue());
                            } else if (var21 instanceof class35) {
                                arg1.method257((byte) 126, 2);
                                arg1.method253((class35) var21, (byte) -39);
                            } else {
                                arg1.method257((byte) 126, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field950[var7].field1804;
                            int var15 = var14.getModifiers();
                            arg1.method257((byte) 126, 0);
                            arg1.method249(var15, 81);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method257((byte) 126, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method257((byte) 126, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method257((byte) 126, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method257((byte) 126, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method257((byte) 126, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method257((byte) 126, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method257((byte) 126, -16);
                    } catch (SecurityException var29) {
                        arg1.method257((byte) 126, -17);
                    } catch (IOException var30) {
                        arg1.method257((byte) 126, -18);
                    } catch (NullPointerException var31) {
                        arg1.method257((byte) 126, -19);
                    } catch (Exception var32) {
                        arg1.method257((byte) 126, -20);
                    } catch (Throwable var33) {
                        arg1.method257((byte) 126, -21);
                    }
                } else {
                    arg1.method257((byte) 126, var3.field946[var7]);
                }
            }
            arg1.method229(1781189264, var6);
            arg1.method226(arg1.field527 - var6, -1);
            var3.method799(-24265);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Z")
    public static final boolean method876(int arg0, int arg1) {
        field2702++;
        if (arg1 != -1) {
            field2698 = null;
        }
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BII)I")
    public static final int method877(byte[] arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method875(-95, null, true);
        }
        field2706++;
        return class97.method739(0, arg0, -27530, arg1);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static final void method878(int arg0) {
        class143.field3003 = null;
        class203.field4039 = null;
        class15.field269 = null;
        field2701++;
        if (arg0 <= -6) {
            class207.field4119 = null;
            class118.field2623 = null;
            class116.field2591 = null;
        }
    }
}
