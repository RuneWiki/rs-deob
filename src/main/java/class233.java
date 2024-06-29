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

@OriginalClass("client!uc")
public class class233 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lne;")
    public static class137 field4072 = new class137(4);

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lda;")
    public static class275 field4078 = class255.method1672(116, "http:)4)4");

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lda;")
    public static class275 field4076 = class255.method1672(100, "zap");

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lda;")
    public static class275 field4077 = class255.method1672(108, "<)4col> x");

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lkk;")
    public static class225 field4075;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "[[[B")
    public static byte[][][] field4079;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILbj;)V")
    public static final void method1515(int arg0, int arg1, class80 arg2) {
        if (arg1 != 5178) {
            method1518((class85) null, 54);
        }
        field4074++;
        while (true) {
            class204 var3 = (class204) class169.field2942.method550(arg1 ^ 0xFFFFEBDE);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3460; var5++) {
                if (var3.field3463[var5] != null) {
                    if (var3.field3463[var5].field4623 == 2) {
                        var3.field3462[var5] = -5;
                    }
                    if (var3.field3463[var5].field4623 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3469[var5] != null) {
                    if (var3.field3469[var5].field4623 == 2) {
                        var3.field3462[var5] = -6;
                    }
                    if (var3.field3469[var5].field4623 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method526((byte) -65, arg0);
            arg2.method575((byte) 127, 0);
            int var6 = arg2.field1392;
            arg2.method586(82, var3.field3471);
            for (int var7 = 0; var7 < var3.field3460; var7++) {
                if (var3.field3462[var7] == 0) {
                    try {
                        int var8 = var3.field3467[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3463[var7].field4625;
                            int var10 = var9.getInt((Object) null);
                            arg2.method575((byte) 124, 0);
                            arg2.method586(25, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field3463[var7].field4625;
                            var13.setInt((Object) null, var3.field3472[var7]);
                            arg2.method575((byte) 127, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field3463[var7].field4625;
                            int var12 = var11.getModifiers();
                            arg2.method575((byte) 126, 0);
                            arg2.method586(89, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3469[var7].field4625;
                            byte[][] var17 = var3.field3473[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method575((byte) 125, 0);
                            } else if ((var21 instanceof Number)) {
                                arg2.method575((byte) 124, 1);
                                arg2.method560(((Number) var21).longValue(), -61);
                            } else if ((var21 instanceof class275)) {
                                arg2.method575((byte) 126, 2);
                                arg2.method584((byte) 116, (class275) var21);
                            } else {
                                arg2.method575((byte) 125, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3469[var7].field4625;
                            int var15 = var14.getModifiers();
                            arg2.method575((byte) 124, 0);
                            arg2.method586(arg1 ^ 0x145B, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method575((byte) 125, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method575((byte) 125, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method575((byte) 124, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method575((byte) 124, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method575((byte) 124, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method575((byte) 124, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method575((byte) 127, -16);
                    } catch (SecurityException var29) {
                        arg2.method575((byte) 126, -17);
                    } catch (IOException var30) {
                        arg2.method575((byte) 127, -18);
                    } catch (NullPointerException var31) {
                        arg2.method575((byte) 127, -19);
                    } catch (Exception var32) {
                        arg2.method575((byte) 126, -20);
                    } catch (Throwable var33) {
                        arg2.method575((byte) 125, -21);
                    }
                } else {
                    arg2.method575((byte) 124, var3.field3462[var7]);
                }
            }
            arg2.method595((byte) 20, var6);
            arg2.method594(false, arg2.field1392 - var6);
            var3.method741(arg1 - 5175);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method1516(boolean arg0) {
        field4073++;
        for (class169 var1 = (class169) class216.field3696.method550(-127); var1 != null; var1 = (class169) class216.field3696.method545(104)) {
            class156 var2 = var1.field2943;
            if (class159.field2790 != var2.field2746 || class35.field576 > var2.field2725) {
                var1.method741(3);
            } else if (var2.field2724 <= class35.field576) {
                if (var2.field2714 > 0) {
                    class165 var3 = class31.field478[var2.field2714 - 1];
                    if (var3 != null && var3.field1770 >= 0 && var3.field1770 < 13312 && var3.field1758 >= 0 && var3.field1758 < 13312) {
                        var2.method1103(class35.field576, var3.field1758, var3.field1770, -5, class89.method647(var3.field1758, var2.field2746, var3.field1770, 120) - var2.field2721);
                    }
                }
                if (var2.field2714 < 0) {
                    int var4 = -var2.field2714 - 1;
                    class109 var5;
                    if (class11.field167 == var4) {
                        var5 = class66.field1094;
                    } else {
                        var5 = class16.field238[var4];
                    }
                    if (var5 != null && var5.field1770 >= 0 && var5.field1770 < 13312 && var5.field1758 >= 0 && var5.field1758 < 13312) {
                        var2.method1103(class35.field576, var5.field1758, var5.field1770, 100, class89.method647(var5.field1758, var2.field2746, var5.field1770, 119) - var2.field2721);
                    }
                }
                var2.method1106(-80, class105.field1829);
                class82.method533(class159.field2790, (int) var2.field2739, (int) var2.field2726, (int) var2.field2737, 60, var2, var2.field2731, -1L, false);
            }
        }
        if (arg0) {
            field4076 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)V")
    public static final void method1517(boolean arg0, int arg1) {
        field4070++;
        int var2 = -7 / ((63 - arg1) / 61);
        byte var3 = 4;
        byte[][] var4 = class115.field2045;
        for (int var5 = 0; var5 < var3; var5++) {
            class160.method1116(true);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class90.field1536[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class61.field1031.length; var14++) {
                                if (class61.field1031[var14] == var13 && var4[var14] != null) {
                                    class232.method1502(var5, (var12 & 0x7) * 8, var9, class173.field3003, arg0, var10, var7 * 8, var6 * 8, -24591, (var11 & 0x7) * 8, var4[var14]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lij;I)Lda;")
    public static final class275 method1518(class85 arg0, int arg1) {
        field4071++;
        if (arg1 != -519) {
            field4078 = null;
        }
        return class6.method24(32767, (byte) 68, arg0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1519(int arg0) {
        field4079 = null;
        field4072 = null;
        if (arg0 != -6) {
            method1516(true);
        }
        field4078 = null;
        field4077 = null;
        field4075 = null;
        field4076 = null;
    }
}
