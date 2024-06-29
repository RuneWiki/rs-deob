import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class161 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2050 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Ljk;")
    public static class449 field2047 = new class449(32);

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lap;")
    public static class335 field2054 = new class335("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "[I")
    public static int[] field2055 = new int[32];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)I", line = 10)
    public static final int method1035(byte arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        field2048++;
        int var3 = 79 / ((14 - arg0) / 56);
        int var4 = (var2 & 0x33333333) + (var2 >>> 2 & 0x73333333);
        int var5 = (var4 >>> 4) + var4 & 0xF0F0F0F;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lft;[[BZ)V", line = 25)
    public static final void method1036(class4 arg0, byte[][] arg1, boolean arg2) {
        field2051++;
        int var3 = class42.field521.length;
        if (arg2) {
            method1036(null, null, true);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class79.field1025[var4] >> 8) * 64 - class441.field6317;
                int var7 = (class79.field1025[var4] & 0xFF) * 64 - class320.field4064;
                class139.method946(-107);
                arg0.method22(class33.field416, 28476, var7, var5, class172.field2185, var6);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILhd;II)V", line = 62)
    public static final void method1037(int arg0, class523 arg1, int arg2, int arg3) {
        if (arg1.field7670 == 0) {
            arg1.field7660 = arg1.field7619;
        } else if (arg1.field7670 == 1) {
            arg1.field7660 = (arg3 - arg1.field7574) / 2 + arg1.field7619;
        } else if (arg1.field7670 == 2) {
            arg1.field7660 = arg3 - arg1.field7619 - arg1.field7574;
        } else if (arg1.field7670 == 3) {
            arg1.field7660 = arg1.field7619 * arg3 >> 14;
        } else if (arg1.field7670 == 4) {
            arg1.field7660 = (arg1.field7619 * arg3 >> 14) + (arg3 - arg1.field7574) / 2;
        } else {
            arg1.field7660 = arg3 - arg1.field7574 - (arg1.field7619 * arg3 >> 14);
        }
        if (arg1.field7675 == 0) {
            arg1.field7623 = arg1.field7649;
        } else if (arg1.field7675 == 1) {
            arg1.field7623 = (arg0 - arg1.field7617) / 2 + arg1.field7649;
        } else if (arg1.field7675 == 2) {
            arg1.field7623 = arg0 - (arg1.field7617 + arg1.field7649);
        } else if (arg1.field7675 == 3) {
            arg1.field7623 = arg1.field7649 * arg0 >> 14;
        } else if (arg1.field7675 == 4) {
            arg1.field7623 = (arg1.field7649 * arg0 >> 14) + (arg0 - arg1.field7617) / 2;
        } else {
            arg1.field7623 = arg0 - arg1.field7617 - (arg1.field7649 * arg0 >> 14);
        }
        if (arg2 != 441050190) {
            field2056 = 101;
        }
        field2049++;
        if (!class191.field2480 || client.method1226(arg1).field942 == 0 && arg1.field7632 != 0) {
            return;
        }
        if (arg1.field7623 < 0) {
            arg1.field7623 = 0;
        } else if (arg0 < (arg1.field7623 + arg1.field7617)) {
            arg1.field7623 = arg0 - arg1.field7617;
        }
        if (arg1.field7660 < 0) {
            arg1.field7660 = 0;
        } else if ((arg1.field7660 + arg1.field7574) > arg3) {
            arg1.field7660 = arg3 - arg1.field7574;
            return;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lrd;IIILtf;)V", line = 136)
    public static final void method1038(class223 arg0, int arg1, int arg2, int arg3, class194 arg4) {
        field2053++;
        byte var5 = -1;
        if ((arg1 & 0x40) != 0) {
            int var6 = arg4.method2772((byte) 122);
            if (var6 == 65535) {
                var6 = -1;
            }
            arg0.field4895 = var6;
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field4869 = arg4.method2768((byte) -36);
            if (arg0.field4869.charAt(0) == '~') {
                arg0.field4869 = arg0.field4869.substring(1);
                class443.method2616(arg0.method1363(true, false), arg0.field4869, 0, false, arg0.method1355(true, arg3 + 28918), 2);
            } else if (class23.field336 == arg0) {
                class443.method2616(arg0.method1363(true, false), arg0.field4869, 0, false, arg0.method1355(true, -66), 2);
            }
            arg0.field4924 = 0;
            arg0.field4897 = 0;
            arg0.field4932 = 150;
        }
        if (arg3 != -29030) {
            return;
        }
        if ((arg1 & 0x10000) != 0) {
            int var7 = arg4.method2743(false);
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            for (int var11 = 0; var11 < var7; var11++) {
                int var12 = arg4.method2772((byte) 125);
                if (var12 == 65535) {
                    var12 = -1;
                }
                var8[var11] = var12;
                var9[var11] = arg4.method2742((byte) -116);
                var10[var11] = arg4.method2758((byte) 90);
            }
            class470.method2839(-105, var8, var10, arg0, var9);
        }
        if ((arg1 & 0x20) != 0) {
            class191.field2482[arg2] = arg4.method2752(2);
        }
        if ((arg1 & 0x80) != 0) {
            arg0.field2841 = arg4.method2775(-4672);
            if (arg0.field4941 == 0) {
                arg0.method2123(arg0.field2841, 0);
                arg0.field2841 = -1;
            }
        }
        if ((arg1 & 0x20000) != 0) {
            arg0.field4867 = arg4.method2756(arg3 ^ 0xFFFF8EE2);
            arg0.field4914 = arg4.method2752(2);
            arg0.field4847 = arg4.method2741((byte) 89);
            arg0.field4922 = (byte) arg4.method2743(false);
            arg0.field4929 = class163.field2065 + arg4.method2786(255);
            arg0.field4868 = class163.field2065 + arg4.method2772((byte) 126);
        }
        if ((arg1 & 0x4) != 0) {
            int var13 = arg4.method2772((byte) 127);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = arg4.method2742((byte) -116);
            class370.method2108(var13, var14, -16032, arg0);
        }
        if ((arg1 & 0x10) != 0) {
            int var15 = arg4.method2763(-514944944);
            int var16 = arg4.method2742((byte) -114);
            arg0.method2130(var15, var16, class163.field2065, -4867);
            arg0.field4921 = class163.field2065 + 300;
            arg0.field4856 = arg4.method2737(false);
        }
        if ((arg1 & 0x40000) != 0) {
            int var17 = arg4.method2772((byte) 125);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = arg4.method2746((byte) 34);
            int var19 = arg4.method2737(false);
            arg0.method2127(var18, 32042, var17, var19, true);
        }
        if ((arg1 & 0x8000) != 0) {
            var5 = arg4.method2793(32767);
        }
        if ((arg1 & 0x4000) != 0) {
            arg0.field2820 = arg4.method2743(false) == 1;
        }
        if ((arg1 & 0x800) != 0) {
            int var20 = class163.field2065;
            int var21 = arg4.method2763(-514944944);
            int var22 = arg4.method2776((byte) -27);
            arg0.method2130(var21, var22, var20, -4867);
        }
        if ((arg1 & 0x100) != 0) {
            int var23 = arg4.method2775(-4672);
            arg0.field4898 = arg4.method2743(false);
            arg0.field4855 = arg4.method2742((byte) -119);
            arg0.field4850 = var23 & 0x7FFF;
            arg0.field4891 = (var23 & 0x8000) != 0;
            arg0.field4877 = arg0.field4898 + arg0.field4850 + class163.field2065;
        }
        if ((arg1 & 0x2) != 0) {
            int var24 = arg4.method2758((byte) 117);
            int var25 = arg4.method2742((byte) -89);
            int var26 = arg4.method2776((byte) -27);
            int var27 = arg4.field6631;
            boolean var28 = (var24 & 0x8000) != 0;
            if (arg0.field2852 != null && arg0.field2823 != null) {
                boolean var29 = false;
                if (var25 <= 1) {
                    if (!var28 && (class293.field3726 && !class284.field3608 || class122.field1641)) {
                        var29 = true;
                    } else if (class530.method3144(arg3 + 28936, arg0.field2852)) {
                        var29 = true;
                    }
                }
                if (!var29 && class25.field358 == 0) {
                    class433.field6135.field6631 = 0;
                    arg4.method2735(class433.field6135.field6618, var26, 0, -447463096);
                    class433.field6135.field6631 = 0;
                    int var30 = -1;
                    String var32;
                    if (var28) {
                        var24 &= 0x7FFF;
                        class483 var31 = class47.method478(class433.field6135, (byte) 56);
                        var30 = var31.field7066;
                        var32 = var31.field7064.method1555(class433.field6135, -85);
                    } else {
                        var32 = class163.method1051(class334.method1932(class433.field6135, 28462), 21670);
                    }
                    arg0.field4869 = var32.trim();
                    arg0.field4924 = var24 & 0xFF;
                    arg0.field4897 = var24 >> 8;
                    arg0.field4932 = 150;
                    int var33;
                    if (var25 == 1 || var25 == 2) {
                        var33 = var28 ? 17 : 1;
                    } else {
                        var33 = var28 ? 17 : 2;
                    }
                    if (var25 == 2) {
                        class515.method3076(null, "<img=1>" + arg0.method1355(true, -6), "<img=1>" + arg0.method1363(true, false), var30, var32, 0, (byte) -95, var33);
                    } else if (var25 == 1) {
                        class515.method3076(null, "<img=0>" + arg0.method1355(true, arg3 + 29151), "<img=0>" + arg0.method1363(true, false), var30, var32, 0, (byte) -61, var33);
                    } else {
                        class515.method3076(null, arg0.method1355(true, arg3 + 28914), arg0.method1363(true, false), var30, var32, 0, (byte) -42, var33);
                    }
                }
            }
            arg4.field6631 = var26 + var27;
        }
        if ((arg1 & 0x1000) != 0) {
            arg0.field4843 = arg4.method2793(32767);
            arg0.field4917 = arg4.method2741((byte) 96);
            arg0.field4919 = arg4.method2741((byte) 74);
            arg0.field4931 = arg4.method2752(arg3 ^ 0xFFFF8E98);
            arg0.field4844 = arg4.method2758((byte) 124) + class163.field2065;
            arg0.field4842 = arg4.method2786(255) + class163.field2065;
            arg0.field4863 = arg4.method2742((byte) -119);
            if (arg0.field2860) {
                arg0.field4843 += arg0.field2818;
                arg0.field4917 += arg0.field2844;
                arg0.field4919 += arg0.field2818;
                arg0.field4931 += arg0.field2844;
                arg0.field4941 = 0;
            } else {
                arg0.field4931 += arg0.field4936[0];
                arg0.field4843 += arg0.field4944[0];
                arg0.field4919 += arg0.field4944[0];
                arg0.field4941 = 1;
                arg0.field4917 += arg0.field4936[0];
            }
            arg0.field4943 = 0;
        }
        if ((arg1 & 0x1) != 0) {
            int var34 = arg4.method2737(false);
            byte[] var35 = new byte[var34];
            class463 var36 = new class463(var35);
            arg4.method2774(var34, 0, -128, var35);
            class424.field5991[arg2] = var36;
            arg0.method1358(-1, var36);
        }
        if ((arg1 & 0x2000) != 0) {
            int var37 = arg4.method2786(255);
            if (var37 == 65535) {
                var37 = -1;
            }
            int var38 = arg4.method2727(-80);
            int var39 = arg4.method2743(false);
            arg0.method2127(var38, 32042, var37, var39, false);
        }
        if (!arg0.field2860) {
            return;
        }
        if (var5 == 127) {
            arg0.method1362(arg0.field2844, arg0.field2818, (byte) 40);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class191.field2482[arg2];
        } else {
            var40 = var5;
        }
        arg0.method1370(arg0.field2844, (byte) -113, var40, arg0.field2818);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)V", line = 475)
    public static final void method1039(boolean arg0, int arg1) {
        field2052++;
        if (arg1 <= 35) {
            method1036(null, null, false);
        }
        class91.method712(class174.field2262, class277.field3510, false, class390.field5236, arg0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 486)
    public static void method1040(int arg0) {
        if (arg0 == 3) {
            field2047 = null;
            field2054 = null;
            field2055 = null;
        }
    }
}
