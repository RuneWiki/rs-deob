import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class145 {

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public int field2052 = 2048;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public int field2050 = 2048;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public int field2047 = 0;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public int field2055 = 0;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2057 = new String[] { method1338(method1337("\u001f(Qf\u0001")), method1338(method1337("\u0011.\u0007iL\u0011 \r]")), method1338(method1337("\u0016.\tE\u0007\u0010.\u0011C\u0007.:\u0011P@\u0011*")), method1338(method1337("\u0007aQ\nT")), method1338(method1337("\u001f(Qg\u0001")), method1338(method1337("\u0012:\u0013H")), method1338(method1337("\u001f(Q`\u0001")), method1338(method1337("\u001f(Qa\u0001")), method1338(method1337("\u001f(Qe\u0001")) };

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lmj;")
    public static class683 field2053 = null;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field2054;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field2056;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1331(int arg0) {
        try {
            field2053 = null;
            if (arg0 != 2048) {
                method1335((byte) 118);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2057[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIILoe;IILha;IILka;II)Lka;")
    public static final class499 method1332(int arg0, int arg1, int arg2, int arg3, int arg4, class210 arg5, int arg6, int arg7, class63 arg8, int arg9, int arg10, class499 arg11, int arg12, int arg13) {
        try {
            field2051++;
            if (arg11 == null) {
                return null;
            }
            int var14 = 2055;
            if (arg5 != null) {
                int var15 = var14 | arg5.method1902((byte) 115, false, -1, arg0);
                var14 = var15 & 0xFFFFFDFF;
            }
            long var16 = ((long) arg13 << 32) + (long) ((arg10 << 24) + arg9 + (arg1 << 16)) + ((long) arg3 << 48);
            class29 var18 = class159.field2287;
            class499 var19;
            synchronized (class159.field2287) {
                var19 = (class499) class159.field2287.method302(-103, var16);
            }
            if (var19 == null || arg8.method151(var19.method433(), var14) != 0) {
                if (var19 != null) {
                    var14 = arg8.method169(var14, var19.method433());
                }
                byte var20;
                if (arg9 == 1) {
                    var20 = 9;
                } else if (arg9 == 2) {
                    var20 = 12;
                } else if (arg9 == 3) {
                    var20 = 15;
                } else if (arg9 == 4) {
                    var20 = 18;
                } else {
                    var20 = 21;
                }
                byte var21 = 3;
                int[] var22 = new int[] { 64, 96, 128 };
                class141 var23 = new class141((var20 * var21) + 1, var20 * 2 * var21 + -var20, 0);
                int var24 = var23.method1307(0, 0, 0, 0);
                int[][] var25 = new int[var21][var20];
                for (int var26 = 0; var26 < var21; var26++) {
                    int var27 = var22[var26];
                    int var28 = var22[var26];
                    for (int var29 = 0; var29 < var20; var29++) {
                        int var30 = (var29 << 14) / var20;
                        int var31 = class763.field11199[var30] * var27 >> 14;
                        int var32 = class763.field11200[var30] * var28 >> 14;
                        var25[var26][var29] = var23.method1307(0, var32, var31, 0);
                    }
                }
                for (int var33 = 0; var33 < var21; var33++) {
                    int var34 = (var33 * 256 + 128) / var21;
                    int var35 = 256 - var34;
                    byte var36 = (byte) (arg1 * var35 + arg10 * var34 >> 8);
                    short var37 = (short) (((arg3 & 0x380) * var34 + (arg13 & 0x380) * var35 & 0x38000) + ((arg3 & 0x7F) * var34 + (arg13 & 0x7F) * var35 & 0x7F00) + ((arg3 & 0xFC00) * var34 + (arg13 & 0xFC00) * var35 & 0xFC0000) >> 8);
                    for (int var38 = 0; var38 < var20; var38++) {
                        if (var33 == 0) {
                            var23.method1316((byte) -1, var24, var36, (byte) 1, -2, (short) -1, var25[0][(var38 + 1) % var20], var37, var25[0][var38]);
                        } else {
                            var23.method1316((byte) -1, var25[var33 - 1][var38], var36, (byte) 1, -2, (short) -1, var25[var33 - 1][(var38 + 1) % var20], var37, var25[var33][(var38 + 1) % var20]);
                            var23.method1316((byte) -1, var25[var33 - 1][var38], var36, (byte) 1, -2, (short) -1, var25[var33][(var38 + 1) % var20], var37, var25[var33][var38]);
                        }
                    }
                }
                var19 = arg8.method192(var23, var14, class467.field7178, 64, 768);
                class29 var39 = class159.field2287;
                synchronized (class159.field2287) {
                    class159.field2287.method295(false, var16, var19);
                }
            }
            int var40 = arg11.method417();
            int var41 = arg11.method396();
            int var42 = arg11.method388();
            if (arg12 > -55) {
                field2053 = null;
            }
            int var43 = arg11.method422();
            class356 var44 = null;
            if (arg5 != null) {
                int var50 = arg5.field3327[arg0];
                var44 = class397.field6293.method2052(78, var50 >> 16);
                arg0 = var50 & 0xFFFF;
            }
            class499 var45;
            if (var44 == null) {
                var45 = var19.method394((byte) 3, var14, true);
                var45.method435(var41 - var40 >> 1, 128, var43 - var42 >> 1);
                var45.method395(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            } else {
                var45 = var19.method394((byte) 3, var14, true);
                var45.method435(var41 - var40 >> 1, 128, var43 - var42 >> 1);
                var45.method395(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                var45.method3770(arg0, true, var44);
            }
            if (arg7 != 0) {
                var45.method386(arg7);
            }
            if (arg6 != 0) {
                var45.method404(arg6);
            }
            if (arg4 != 0) {
                var45.method395(0, arg4, 0);
            }
            return var45;
        } catch (RuntimeException var49) {
            throw class590.method4333(var49, field2057[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field2057[5] : field2057[3]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field2057[5] : field2057[3]) + ',' + arg9 + ',' + arg10 + ',' + (arg11 == null ? field2057[5] : field2057[3]) + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILwq;)V")
    private final void method1333(int arg0, int arg1, class176 arg2) {
        try {
            int var4 = -92 / ((8 - arg0) / 53);
            if (arg1 == 1) {
                this.field2047 = arg2.method1645((byte) -128);
            } else if (arg1 == 2) {
                this.field2052 = arg2.method1687((byte) -99);
            } else if (arg1 == 3) {
                this.field2050 = arg2.method1687((byte) -81);
            } else if (arg1 == 4) {
                this.field2055 = arg2.method1657(78);
            }
            field2049++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2057[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field2057[5] : field2057[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLwq;)V")
    public final void method1334(byte arg0, class176 arg1) {
        try {
            field2048++;
            if (arg0 >= -122) {
                method1331(-93);
            }
            while (true) {
                int var3 = arg1.method1645((byte) -76);
                if (var3 == 0) {
                    return;
                }
                this.method1333(123, var3, arg1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2057[6] + arg0 + ',' + (arg1 == null ? field2057[5] : field2057[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static final void method1335(byte arg0) {
        try {
            if (arg0 < -97) {
                field2054++;
                if (class393.field6256.field808) {
                    class168.field2721 = 96;
                } else {
                    try {
                        Method var1 = (field2056 == null ? (field2056 = method1336(field2057[2])) : field2056).getMethod(field2057[1]);
                        if (var1 != null) {
                            try {
                                Runtime var2 = Runtime.getRuntime();
                                Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                                class168.field2721 = (int) (var3 / 1048576L) + 1;
                                return;
                            } catch (Throwable var5) {
                                return;
                            }
                        }
                    } catch (Exception var6) {
                        return;
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2057[0] + arg0 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1336(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1337(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1338(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
