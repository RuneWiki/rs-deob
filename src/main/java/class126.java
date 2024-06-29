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

@OriginalClass("client!tb")
public class class126 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lmb;")
    public static class84 field3036 = class79.method672(true, "gleiten:");

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lmb;")
    public static class84 field3041 = class79.method672(true, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lmb;")
    private static class84 field3042 = class79.method672(true, "Enter object name");

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lmb;")
    public static class84 field3038 = class79.method672(true, "backvmid2");

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[J")
    public static long[] field3040 = new long[32];

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lmb;")
    private static class84 field3046 = class79.method672(true, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lmb;")
    public static class84 field3045 = class79.method672(true, "Classic");

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Lmb;")
    public static class84 field3052 = class79.method672(true, "Aus");

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lmb;")
    public static class84 field3044 = class79.method672(true, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lmb;")
    public static class84 field3054 = field3042;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lmb;")
    public static class84 field3039 = field3046;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Lmb;")
    private static class84 field3056 = class79.method672(true, "No response from server)3");

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lmb;")
    public static class84 field3050 = field3056;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lsa;")
    public static class119 field3053 = new class119(100);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lsd;")
    public static class122 field3043;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lsd;")
    public static class122 field3058;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lge;")
    public static class47 field3051;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method1032(int arg0) {
        field3048++;
        for (int var1 = 0; var1 < class96.field2385; var1++) {
            int var2 = class125.field3033[var1];
            class62 var3 = class44.field978[var2];
            int var4 = class87.field2148.method373(arg0 ^ 0x7AF5764E);
            if ((var4 & 0x8) != 0) {
                var4 += class87.field2148.method373(arg0 - 2062856770) << 8;
            }
            class143.method1173(var3, true, var4, var2);
        }
        if (arg0 != 2062881864) {
            field3050 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBLr;)V")
    public static final void method1033(int arg0, int arg1, byte arg2, class112 arg3) {
        int var4 = arg0 * arg0 + arg1 * arg1;
        field3049++;
        int var5 = -73 % ((-arg2 - 23) / 42);
        if (var4 <= 4225 || var4 >= 90000) {
            class86.method744(arg0, arg1, (byte) -70, arg3);
            return;
        }
        int var6 = class136.field3300 + class120.field2892 & 0x7FF;
        int var7 = class104.field2520[var6];
        int var8 = var7 * 256 / (class6.field106 + 256);
        int var9 = class104.field2527[var6];
        int var10 = var9 * 256 / (class6.field106 + 256);
        int var11 = arg1 * var8 + arg0 * var10 >> 16;
        int var12 = arg1 * var10 - arg0 * var8 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        class103.field2503.method924(var15 + 94 + 4 - 10, -var16 + 63, 20, 20, 15, 15, var13, 256);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static final void method1034(byte arg0) {
        field3037++;
        int var1 = 90 / ((arg0 + 49) / 55);
        for (class144 var2 = (class144) class91.field2281.method104((byte) 101); var2 != null; var2 = (class144) class91.field2281.method107(-2)) {
            if (var2.field3458 > 0) {
                var2.field3458--;
            }
            if (var2.field3458 != 0) {
                if (var2.field3468 > 0) {
                    var2.field3468--;
                }
                if (var2.field3468 == 0 && var2.field3461 >= 1 && var2.field3470 >= 1 && var2.field3461 <= 102 && var2.field3470 <= 102 && (var2.field3477 < 0 || class89.method760(var2.field3474, var2.field3477, -122))) {
                    class140.method1137(var2.field3477, var2.field3461, var2.field3474, var2.field3478, var2.field3457, var2.field3470, 18963, var2.field3473);
                    var2.field3468 = -1;
                    if (var2.field3477 == var2.field3476 && var2.field3476 == -1) {
                        var2.method121(false);
                    } else if (var2.field3477 == var2.field3476 && var2.field3478 == var2.field3455 && var2.field3474 == var2.field3466) {
                        var2.method121(false);
                    }
                }
            } else if (var2.field3476 < 0 || class89.method760(var2.field3466, var2.field3476, -126)) {
                class140.method1137(var2.field3476, var2.field3461, var2.field3466, var2.field3455, var2.field3457, var2.field3470, 18963, var2.field3473);
                var2.method121(false);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method1035(int arg0) {
        field3046 = null;
        field3050 = null;
        field3040 = null;
        field3054 = null;
        field3052 = null;
        field3039 = null;
        field3038 = null;
        field3043 = null;
        field3036 = null;
        field3058 = null;
        field3042 = null;
        field3044 = null;
        field3053 = null;
        field3045 = null;
        field3051 = null;
        field3041 = null;
        field3056 = null;
        int var1 = -6 / ((-arg0 - 11) / 55);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILna;I)V")
    public static final void method1036(int arg0, class89 arg1, int arg2) {
        field3047++;
        if (arg0 != 20) {
            method1034((byte) 123);
        }
        while (true) {
            class123 var3 = (class123) class124.field2997.method104((byte) 101);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2966; var5++) {
                if (var3.field2962[var5] != null) {
                    if (var3.field2962[var5].field2117 == 2) {
                        var3.field2976[var5] = -5;
                    }
                    if (var3.field2962[var5].field2117 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2975[var5] != null) {
                    if (var3.field2975[var5].field2117 == 2) {
                        var3.field2976[var5] = -6;
                    }
                    if (var3.field2975[var5].field2117 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method769((byte) -113, arg2);
            arg1.method393(0, arg0 - 17363);
            int var6 = arg1.field1128;
            arg1.method378(2, var3.field2981);
            for (int var7 = 0; var7 < var3.field2966; var7++) {
                if (var3.field2976[var7] == 0) {
                    try {
                        int var8 = var3.field2985[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2962[var7].field2118;
                            int var10 = var9.getInt(null);
                            arg1.method393(0, arg0 - 17363);
                            arg1.method378(arg0 - 18, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2962[var7].field2118;
                            var13.setInt(null, var3.field2963[var7]);
                            arg1.method393(0, arg0 - 17363);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2962[var7].field2118;
                            int var12 = var11.getModifiers();
                            arg1.method393(0, -17343);
                            arg1.method378(arg0 ^ 0x16, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2975[var7].field2118;
                            byte[][] var15 = var3.field2967[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg1.method393(0, -17343);
                            } else if (var19 instanceof Number) {
                                arg1.method393(1, -17343);
                                arg1.method419(false, ((Number) var19).longValue());
                            } else if (var19 instanceof class84) {
                                arg1.method393(2, arg0 ^ 0xFFFFBC55);
                                arg1.method367(-128, (class84) var19);
                            } else {
                                arg1.method393(4, -17343);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2975[var7].field2118;
                            int var21 = var20.getModifiers();
                            arg1.method393(0, -17343);
                            arg1.method378(2, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method393(-10, -17343);
                    } catch (InvalidClassException var23) {
                        arg1.method393(-11, -17343);
                    } catch (StreamCorruptedException var24) {
                        arg1.method393(-12, -17343);
                    } catch (OptionalDataException var25) {
                        arg1.method393(-13, -17343);
                    } catch (IllegalAccessException var26) {
                        arg1.method393(-14, arg0 - 17363);
                    } catch (IllegalArgumentException var27) {
                        arg1.method393(-15, arg0 ^ -17323);
                    } catch (InvocationTargetException var28) {
                        arg1.method393(-16, -17343);
                    } catch (SecurityException var29) {
                        arg1.method393(-17, -17343);
                    } catch (IOException var30) {
                        arg1.method393(-18, -17343);
                    } catch (NullPointerException var31) {
                        arg1.method393(-19, arg0 - 17363);
                    } catch (Exception var32) {
                        arg1.method393(-20, -17343);
                    } catch (Throwable var33) {
                        arg1.method393(-21, -17343);
                    }
                } else {
                    arg1.method393(var3.field2976[var7], -17343);
                }
            }
            arg1.method402((byte) 95, var6);
            arg1.method405(arg1.field1128 - var6, (byte) 59);
            var3.method121(false);
        }
    }
}
