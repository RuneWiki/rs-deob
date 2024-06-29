import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class587 extends class242 {

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Lkea;")
    private class223 field7877;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    private int field7884;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
    private int field7889;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    private int field7887;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    private int field7881;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    private int field7885;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    private int field7883;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "Lcga;")
    public static class449 field7888 = new class449(67, 15);

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "Lqca;")
    private class105 field7890;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V", line = 3)
    public static void method3258(int arg0) {
        if (arg0 != 23735) {
            method3264(null, 52, 121, -70, 119);
        }
        field7888 = null;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)I", line = 16)
    public static final int method3259(boolean arg0) {
        field7878++;
        if ((double) class604.field8111 == 3.0D) {
            return 37;
        } else if ((double) class604.field8111 == 4.0D) {
            return 50;
        } else if ((double) class604.field8111 == 6.0D) {
            return 75;
        } else if (arg0) {
            return -112;
        } else if ((double) class604.field8111 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lpfa;B)V", line = 45)
    public static final void method3260(class275 arg0, byte arg1) {
        field7879++;
        class356.field4591 = 0;
        class241.field3114 = 0;
        class171.field2002 = new class285();
        class710.field9931 = new class137[1024];
        class701.field9808 = new class18[class1.field2[class477.field5949] + 1];
        if (arg1 >= -35) {
            method3264(null, 102, -79, 14, 63);
        }
        class130.field1568 = 0;
        class191.field2268 = 0;
        class612.method3429(arg0, (byte) 17);
        class523.method2826(arg0, (byte) 126);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Z", line = 70)
    public static final boolean method3261(int arg0, int arg1, int arg2) {
        field7880++;
        if (class226.method1366(arg0, arg1, (byte) -77)) {
            return ~(arg1 & 0x9000) != arg2 | class252.method1518(arg1, arg0, 540800) | class290.method1739(arg0, arg1, (byte) -14) ? true : (class518.method2807(arg1, arg0, -23925) | (arg1 & 0x2000) != 0 | class197.method1152((byte) 19, arg0, arg1)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILld;IIIIIII)Z", line = 88)
    public static final boolean method3262(int arg0, int arg1, int arg2, class158 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field7886++;
        int var11 = arg7;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        int var16 = arg4 - var14;
        class497.field6221[var13][var14] = 99;
        class227.field2937[var13][var14] = 0;
        byte var17 = 0;
        class705.field9867[var17] = arg7;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class144.field1739[var10001] = arg4;
        int[][] var19 = arg3.field1875;
        while (var26 != var18) {
            var12 = class144.field1739[var18];
            var11 = class705.field9867[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg3.field1872;
            int var23 = var12 - arg3.field1864;
            if (arg6 == -4) {
                if (arg2 == var11 && arg8 == var12) {
                    class20.field206 = var12;
                    class189.field2245 = var11;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class500.method2723(arg0, arg2, arg5, var12, 2, -91, 2, var11, arg8)) {
                    class20.field206 = var12;
                    class189.field2245 = var11;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg3.method975(2, arg10, 2, arg8, 12150, arg0, arg2, var11, arg5, var12)) {
                    class189.field2245 = var11;
                    class20.field206 = var12;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg3.method969(var11, arg10, arg0, -79, arg8, arg2, arg5, 2, var12)) {
                    class189.field2245 = var11;
                    class20.field206 = var12;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg3.method970(var12, arg8, 2, (byte) 96, arg1, var11, arg2, arg6)) {
                    class189.field2245 = var11;
                    class20.field206 = var12;
                    return true;
                }
            } else if (arg3.method971(var12, arg1, 2, arg6, arg2, arg8, (byte) -116, var11)) {
                class189.field2245 = var11;
                class20.field206 = var12;
                return true;
            }
            int var25 = class227.field2937[var21][var20] + 1;
            if (var21 > 0 && class497.field6221[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class705.field9867[var26] = var11 - 1;
                class144.field1739[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class497.field6221[var21 - 1][var20] = 2;
                class227.field2937[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class497.field6221[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class705.field9867[var26] = var11 + 1;
                class144.field1739[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class497.field6221[var21 + 1][var20] = 8;
                class227.field2937[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class497.field6221[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class705.field9867[var26] = var11;
                class144.field1739[var26] = var12 - 1;
                class497.field6221[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class227.field2937[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class497.field6221[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class705.field9867[var26] = var11;
                class144.field1739[var26] = var12 + 1;
                class497.field6221[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class227.field2937[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class497.field6221[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class705.field9867[var26] = var11 - 1;
                class144.field1739[var26] = var12 - 1;
                class497.field6221[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class227.field2937[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class497.field6221[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class705.field9867[var26] = var11 + 1;
                class144.field1739[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class497.field6221[var21 + 1][var20 - 1] = 9;
                class227.field2937[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class497.field6221[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class705.field9867[var26] = var11 - 1;
                class144.field1739[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class497.field6221[var21 - 1][var20 + 1] = 6;
                class227.field2937[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class497.field6221[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class705.field9867[var26] = var11 + 1;
                class144.field1739[var26] = var12 + 1;
                class497.field6221[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class227.field2937[var21 + 1][var20 + 1] = var25;
            }
        }
        class189.field2245 = var11;
        if (arg9 != -1) {
            field7888 = null;
        }
        class20.field206 = var12;
        return false;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Lqca;", line = 436)
    public final class105 method1454(int arg0) {
        if (arg0 != 8191) {
            method3259(false);
        }
        field7876++;
        if (this.field7890 == null) {
            class498 var2 = this.field7877.field8781;
            class309.field3903[5] = this.field7885;
            class309.field3903[3] = this.field7883;
            class309.field3903[0] = this.field7889;
            class309.field3903[1] = this.field7881;
            class309.field3903[2] = this.field7887;
            class309.field3903[4] = this.field7884;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2717(class309.field3903[var5], false)) {
                    return null;
                }
                class152 var7 = var2.method2718(class309.field3903[var5], (byte) 72);
                int var8 = var7.field1826 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field1828 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class237.field3064[var6] = var2.method2714(1.0F, class309.field3903[var6], var4, 19991, false, var4);
            }
            this.field7890 = this.field7877.method352(-25, var4, class237.field3064, var3);
        }
        return this.field7890;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZZLsaa;Lsaa;B)I", line = 497)
    public static final int method3263(int arg0, int arg1, boolean arg2, boolean arg3, class305 arg4, class305 arg5, byte arg6) {
        if (arg6 > -39) {
            return 104;
        }
        field7882++;
        int var7 = class84.method637(arg2, -1, arg4, arg5, arg0);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class84.method637(arg3, -1, arg4, arg5, arg1);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lpv;IIII)V", line = 533)
    public static final void method3264(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class500.method2725(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class546.field6871) {
            class500.method2725(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class500.method2725(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class36.field538) {
            class500.method2725(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class36.field538) {
            class500.method2725(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class546.field6871 && arg4 <= class36.field538) {
            class500.method2725(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class500.method2725(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class546.field6871 && arg4 > 0) {
            class500.method2725(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lkea;IIIIII)V", line = 585)
    public class587(class223 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7877 = arg0;
        this.field7884 = arg5;
        this.field7889 = arg1;
        this.field7887 = arg3;
        this.field7881 = arg2;
        this.field7885 = arg6;
        this.field7883 = arg4;
    }
}
