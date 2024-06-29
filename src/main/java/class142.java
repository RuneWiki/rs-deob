import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class142 extends class232 {

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field2027 = new String[] { method1325(method1324(">\u0006q\u0014\u0013")), method1325(method1324(">\u0006q\u001c\u0013")), method1325(method1324(">\u0006q\u001d\u0013")), method1325(method1324("(KqvF")), method1325(method1324("=\u001034")), method1325(method1324(">\u0006q\u0019\u0013")), method1325(method1324(">\u0006q\u001e\u0013")), method1325(method1324(">\u0006q\u001a\u0013")) };

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "[I")
    public static int[] field2020 = new int[200];

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Z")
    public static boolean field2025 = false;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "[Lgba;")
    private class698[] field2022;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[[I")
    public final int[][] method122(int arg0, int arg1) {
        try {
            if (arg0 != -3093) {
                return null;
            } else {
                ++field2026;
                int[][] var3 = super.field3599.method1580(arg1, (byte) -82);
                if (super.field3599.field2743) {
                    int var4 = class449.field6969;
                    int var5 = class742.field10920;
                    int[][] var6 = new int[var5][var4];
                    int[][][] var7 = super.field3599.method1579((byte) 108);
                    this.method1321(var6, (byte) -127);
                    for (int var8 = 0; ~var8 > ~class742.field10920; ++var8) {
                        int[] var9 = var6[var8];
                        int[][] var10 = var7[var8];
                        int[] var11 = var10[0];
                        int[] var12 = var10[1];
                        int[] var13 = var10[2];
                        for (int var14 = 0; ~class449.field6969 < ~var14; ++var14) {
                            int var15 = var9[var14];
                            var13[var14] = class292.method2485(255, var15) << 4;
                            var12[var14] = class292.method2485(4080, var15 >> 4);
                            var11[var14] = class292.method2485(var15, 16711680) >> 12;
                        }
                    }
                }
                return var3;
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field2027[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([[IB)V")
    private final void method1321(int[][] arg0, byte arg1) {
        try {
            ++field2023;
            if (arg1 > -94) {
                this.field2022 = null;
            }
            int var3 = class449.field6969;
            int var4 = class742.field10920;
            class644.method4663(arg0, 0);
            class6.method49(3, 0, 0, class315.field5126, class250.field3824);
            if (this.field2022 != null) {
                for (int var5 = 0; ~var5 > ~this.field2022.length; ++var5) {
                    class698 var6 = this.field2022[var5];
                    int var7 = var6.field10051;
                    int var8 = var6.field10052;
                    if (var7 < 0) {
                        if (~var8 <= -1) {
                            var6.method965(false, var3, var4);
                        }
                    } else if (var8 < 0) {
                        var6.method967(19388, var3, var4);
                    } else {
                        var6.method964(var3, var4, (byte) -66);
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field2027[5] + (arg0 != null ? field2027[3] : field2027[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field2021;
            if (arg1 != 123) {
                field2020 = null;
            }
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                this.method1321(super.field3601.method3465(0), (byte) -100);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2027[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
    public static final void method1322(int arg0, int arg1) {
        try {
            int var2 = -88 % ((arg1 - -44) / 47);
            ++field2024;
            if (class315.field5127 == 7) {
                if (class9.field104 == 0 && ~class494.field7431 == -1) {
                    class42.field477 = arg0;
                    class302.method2598(9, -3);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2027[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field2019;
            if (arg2 == 0) {
                this.field2022 = new class698[arg1.method1645((byte) -93)];
                for (int var4 = 0; ~var4 > ~this.field2022.length; ++var4) {
                    int var5 = arg1.method1645((byte) -96);
                    if (var5 != 0) {
                        if (~var5 != -2) {
                            if (~var5 != -3) {
                                if (var5 == 3) {
                                    this.field2022[var4] = class133.method1252(arg1, false);
                                }
                            } else {
                                this.field2022[var4] = class361.method2983(arg1, (byte) 64);
                            }
                        } else {
                            this.field2022[var4] = class654.method4767(94, arg1);
                        }
                    } else {
                        this.field2022[var4] = class73.method767(arg1, (byte) 104);
                    }
                }
            } else if (~arg2 == -2) {
                super.field3605 = ~arg1.method1645((byte) -127) == -2;
            }
            if (arg0 <= 96) {
                this.method63(-20, (class176) null, -35);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2027[2] + arg0 + ',' + (arg1 != null ? field2027[3] : field2027[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
    public static void method1323(byte arg0) {
        try {
            if (arg0 >= 102) {
                field2020 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2027[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1324(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1325(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 101;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
