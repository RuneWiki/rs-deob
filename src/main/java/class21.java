import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class21 {

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field263 = new String[] { method264(method263("n.}k\u000e")), method264(method263("n.}j\u000e")), method264(method263("n.}m\u000e")), method264(method263("xi}\u0001[")), method264(method263("n.}l\u000e")), method264(method263("m2?C")), method264(method263("n.}i\u000e")) };

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lsb;")
    public static class261 field258 = new class261(73, 6);

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lvs;")
    public static class470 field262;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BII)Z")
    public static final boolean method257(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 != -93) {
                method259(18);
            }
            field261++;
            return (arg2 & 0x70000) != 0 | class195.method1696(arg2, (byte) -45, arg1) || class768.method5548(122, arg2, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field263[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[F[II[FBIII[IIII)V")
    public static final void method258(int arg0, float[] arg1, int[] arg2, int arg3, float[] arg4, byte arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12) {
        try {
            field260++;
            int var13 = arg0 * arg12 + arg10;
            int var14 = arg6 * arg7 + arg8;
            int var15 = arg0 - arg3;
            if (arg5 != -72) {
                method262(-66, 29, (byte) 6);
            }
            int var16 = arg7 - arg3;
            if (arg9 == null) {
                for (int var21 = 0; var21 < arg11; var21++) {
                    int var22 = arg3 + var13;
                    while (var13 < var22) {
                        arg4[var14++] = arg1[var13++];
                    }
                    var13 += var15;
                    var14 += var16;
                }
            } else if (arg1 == null) {
                for (int var19 = 0; var19 < arg11; var19++) {
                    int var20 = arg3 + var13;
                    while (var13 < var20) {
                        arg2[var14++] = arg9[var13++];
                    }
                    var14 += var16;
                    var13 += var15;
                }
            } else {
                for (int var17 = 0; var17 < arg11; var17++) {
                    int var18 = arg3 + var13;
                    while (var18 > var13) {
                        arg2[var14] = arg9[var13];
                        arg4[var14++] = arg1[var13++];
                    }
                    var14 += var16;
                    var13 += var15;
                }
            }
        } catch (RuntimeException var24) {
            throw class665.method4799(var24, field263[4] + arg0 + ',' + (arg1 == null ? field263[5] : field263[3]) + ',' + (arg2 == null ? field263[5] : field263[3]) + ',' + arg3 + ',' + (arg4 == null ? field263[5] : field263[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field263[5] : field263[3]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method259(int arg0) {
        try {
            field258 = null;
            field262 = null;
            if (arg0 >= -117) {
                field262 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field263[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
    public static final void method260(int arg0, int arg1) {
        try {
            field257++;
            class294 var2 = class146.method1261((long) arg1, -29, 4);
            var2.method2376(-50);
            if (arg0 != -16777216) {
                method261(16, 63, -117, -20, -113);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field263[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
    public static final void method261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class787.field11366 != null) {
            class787.field11366[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class727.field10425 != null) {
            class727.field10425[arg0][arg1] = (short) arg3;
        }
        if (class492.field7207 != null) {
            class492.field7207[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIB)Z")
    public static final boolean method262(int arg0, int arg1, byte arg2) {
        try {
            field259++;
            if (arg2 != -113) {
                method259(-45);
            }
            return (arg0 & 0x60000) != 0 | class324.method2564(arg1, arg0, -127) || class754.method5469(arg0, arg1, 12529) || class67.method709(arg0, arg1, arg2 ^ 0xFFFFFF8C);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field263[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method263(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method264(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
