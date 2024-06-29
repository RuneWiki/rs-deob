import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class644 {

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public int field9228 = -1;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public int field9236 = -1;

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9237 = new String[] { method4668(method4667("\u0002e\b_l")), method4668(method4667("\u0018*G_TQ")), method4668(method4667("\u0017>J\u001d")), method4668(method4667("\u0018*G_RQ")), method4668(method4667("\u0018*G_SQ")), method4668(method4667("\u0018*G_WQ")), method4668(method4667("\u0018*G_UQ")), method4668(method4667("\u0018*G_VQ")) };

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field9230 = 1;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "[I")
    public int[] field9229;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method4660(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class147.field2062 = true;
        class787.field11502 = class120.field1734.method177() > 0;
        class588.field8527 = arg15;
        class54.field689 = arg1 >> class165.field2688;
        class316.field5137 = arg3 >> class165.field2688;
        class764.field11211 = arg1;
        class97.field1421 = arg3;
        class655.field9375 = arg2;
        class588.field8521 = class54.field689 - class297.field4835;
        if (class588.field8521 < 0) {
            class751.field11057 = -class588.field8521;
            class588.field8521 = 0;
        } else {
            class751.field11057 = 0;
        }
        class764.field11207 = class316.field5137 - class297.field4835;
        if (class764.field11207 < 0) {
            class697.field10044 = -class764.field11207;
            class764.field11207 = 0;
        } else {
            class697.field10044 = 0;
        }
        class83.field1266 = class54.field689 + class297.field4835;
        if (class83.field1266 > class150.field2096) {
            class83.field1266 = class150.field2096;
        }
        class490.field7385 = class316.field5137 + class297.field4835;
        if (class490.field7385 > class117.field1705) {
            class490.field7385 = class117.field1705;
        }
        boolean[][] var19 = class441.field6890;
        boolean[][] var20 = class483.field7334;
        if (class588.field8527) {
            for (int var21 = 0; var21 < class297.field4835 + class297.field4835 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class297.field4835 + class297.field4835 + 2; var24++) {
                    if (var24 > 1) {
                        class528.field7782[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class54.field689 + var21 - class297.field4835;
                    int var26 = class316.field5137 + var24 - class297.field4835;
                    if (var25 >= 0 && var26 >= 0 && var25 < class150.field2096 && var26 < class117.field1705) {
                        int var27 = var25 << class165.field2688;
                        int var28 = var26 << class165.field2688;
                        int var29 = class493.field7420[class493.field7420.length - 1].method2495(var26, 1, var25) - (0x3E8 << class165.field2688 - 7);
                        int var30 = class757.field11125 == null ? class493.field7420[0].method2495(var26, 1, var25) + class152.field2131 : class757.field11125[0].method2495(var26, 1, var25) + class152.field2131;
                        var23 = arg16 >= 0 ? class120.field1734.method183(var27, var29, var28, var27, var30, var28, arg16) : class120.field1734.method252(var27, var29, var28, var27, var30, var28);
                        class483.field7334[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class483.field7334[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class528.field7782[var24 - 1] & class528.field7782[var24] & var22 & var23;
                        class441.field6890[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class528.field7782[class297.field4835 + class297.field4835] = var22;
                class528.field7782[class297.field4835 + class297.field4835 + 1] = var23;
            }
            if (arg16 >= 0) {
                class147.field2062 = false;
            } else {
                class195.field3106 = arg5;
                class320.field5214 = arg6;
                class559.field8137 = arg7;
                class476.field7254 = arg8;
                class247.field3817 = arg9;
                class229.method2005(class120.field1734, arg10, (byte) -101);
            }
        } else {
            if (class201.field3182 == null) {
                class201.field3182 = new boolean[class150.field2096 + class150.field2096 + 1][class150.field2096 + class117.field1705 + 1];
            }
            for (int var32 = 0; var32 < class201.field3182.length; var32++) {
                for (int var42 = 0; var42 < class201.field3182[0].length; var42++) {
                    class201.field3182[var32][var42] = true;
                }
            }
            class483.field7334 = class201.field3182;
            class441.field6890 = class201.field3182;
            class588.field8521 = 0;
            class764.field11207 = 0;
            class83.field1266 = class150.field2096;
            class490.field7385 = class117.field1705;
            class147.field2062 = false;
        }
        class173.method1598((byte) 44, class120.field1734);
        if (!class239.field3687.field3375) {
            class71 var33 = class239.field3687.field3374;
            for (class281 var34 = (class281) var33.method749(0); var34 != null; var34 = (class281) var33.method747((byte) 21)) {
                var34.method1715(-20685);
                class234.method2033(var34, (byte) 28);
            }
        }
        if (class787.field11502) {
            for (int var35 = 0; var35 < class642.field9210; var35++) {
                class782.field11417[var35].method4452((byte) 89, arg14, arg0);
            }
        }
        if (class9.field103) {
            class150.field2093 = class120.field1734.method212();
            class120.field1734.method201(class52.field642);
            int var36 = (class52.field642[2] - class52.field642[0]) / class582.field8380;
            for (int var37 = 0; var37 < class582.field8380 - 1; var37++) {
                class498.field7471[var37] = (var37 + 1) * var36 + class721.field10578[var37];
            }
            for (int var38 = 0; var38 < class780.field11382.length; var38++) {
                class780.field11382[var38].method3310();
            }
        }
        if (class393.field6261 != null) {
            if (class9.field103) {
                class18.method124(0);
            }
            class492.method3725(true);
            class120.field1734.method259(-1, 1583160, 40, 127);
            class718.method5215(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class9.field103) {
                class396.method3202();
            }
            class120.field1734.method181();
            class492.method3725(false);
        }
        class718.method5215(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class9.field103) {
            for (int var39 = 0; var39 < class612.field8806; var39++) {
                class590.field8555[var39] = class245.field3795[var39];
            }
            class18.method124(0);
            for (int var40 = 0; var40 < class780.field11382.length; var40++) {
                class780.field11382[var40].method3310();
            }
        }
        if (class9.field103) {
            class396.method3202();
            for (int var41 = 0; var41 < class612.field8806; var41++) {
                class245.field3795[var41] = class590.field8555[var41];
            }
            if (class586.field8501 == 2) {
                int var10002;
                if (class155.field2158[0] < class155.field2158[1]) {
                    if (class721.field10578[0] + class498.field7471[0] > class52.field642[0]) {
                        var10002 = class721.field10578[0]++;
                    }
                } else if (class155.field2158[0] > class155.field2158[1] && class721.field10578[0] + class498.field7471[0] < class52.field642[2]) {
                    var10002 = class721.field10578[0]--;
                }
            }
        }
        if (!class588.field8527) {
            class441.field6890 = var19;
            class483.field7334 = var20;
        }
        class639.method4617();
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lwq;I)V")
    public final void method4661(class176 arg0, int arg1) {
        try {
            while (true) {
                int var3 = arg0.method1645((byte) -127);
                if (var3 == 0) {
                    field9227++;
                    if (arg1 > -73) {
                        this.method4661(null, 6);
                        return;
                    }
                    return;
                }
                this.method4664(var3, true, arg0);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9237[6] + (arg0 == null ? field9237[2] : field9237[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)Leg;")
    public static final class114 method4662(boolean arg0) {
        try {
            field9232++;
            if (arg0) {
                field9230 = 119;
            }
            return class350.field5661;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9237[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "([[II)V")
    public static final void method4663(int[][] arg0, int arg1) {
        try {
            if (arg1 == 0) {
                field9231++;
                class193.field3047 = arg0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9237[3] + (arg0 == null ? field9237[2] : field9237[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZLwq;)V")
    private final void method4664(int arg0, boolean arg1, class176 arg2) {
        try {
            field9233++;
            if (!arg1) {
                this.field9236 = 120;
            }
            if (arg0 == 1) {
                this.field9236 = arg2.method1687((byte) -121);
            } else if (arg0 == 2) {
                this.field9229 = new int[arg2.method1645((byte) -116)];
                for (int var4 = 0; var4 < this.field9229.length; var4++) {
                    this.field9229[var4] = arg2.method1687((byte) -41);
                }
            } else if (arg0 == 3) {
                this.field9228 = arg2.method1645((byte) -93);
                return;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9237[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9237[2] : field9237[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILwq;)Lnga;")
    public static final class541 method4665(int arg0, class176 arg1) {
        try {
            field9235++;
            int var2 = arg1.method1687((byte) -52);
            int var3 = 80 % ((arg0 - 40) / 61);
            class662 var4 = class268.method2315(false)[arg1.method1645((byte) -120)];
            class666 var5 = class395.method3197(false)[arg1.method1645((byte) -122)];
            int var6 = arg1.method1657(108);
            int var7 = arg1.method1657(121);
            return new class541(var2, var4, var5, var6, var7);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9237[4] + arg0 + ',' + (arg1 == null ? field9237[2] : field9237[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(JI)I")
    public static final int method4666(long arg0, int arg1) {
        try {
            if (arg1 == 0) {
                field9234++;
                return (int) (arg0 / 86400000L) - 11745;
            } else {
                return 110;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9237[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4667(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4668(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
