import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class369 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public int field5304;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Lok;")
    private class256 field5305;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Lvk;")
    public static class369 field5301 = new class369(0, 3, class256.field3681);

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Lvk;")
    public static class369 field5308 = new class369(1, 3, class256.field3681);

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Lvk;")
    public static class369 field5309 = new class369(2, 4, class256.field3677);

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Lvk;")
    public static class369 field5310 = new class369(3, 1, class256.field3681);

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Lvk;")
    public static class369 field5311 = new class369(4, 2, class256.field3681);

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Lvk;")
    public static class369 field5312 = new class369(5, 3, class256.field3681);

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Lvk;")
    public static class369 field5313 = new class369(6, 4, class256.field3681);

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field5314 = class181.method1280(16, 75);

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
    public static int[] field5315 = new int[32];

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 3)
    public static final void method2269(int[] arg0, Object[] arg1, int arg2) {
        field5299++;
        class467.method2832(0, (byte) 117, arg0.length - 1, arg1, arg0);
        if (arg2 != 1) {
            method2270(89);
        }
    }

    @OriginalMember(owner = "client!vk", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field5307++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 27)
    public static void method2270(int arg0) {
        field5308 = null;
        field5309 = null;
        field5311 = null;
        field5315 = null;
        field5310 = null;
        field5313 = null;
        field5312 = null;
        if (arg0 == 64) {
            field5301 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILbs;ILvt;I)V", line = 47)
    public static final void method2271(int arg0, class689 arg1, int arg2, class304 arg3, int arg4) {
        field5303++;
        byte var5 = -1;
        if ((arg2 & 0x1) != 0) {
            class661.field9247[arg4] = arg3.method3724((byte) -44);
        }
        if ((arg2 & 0x1000) != 0) {
            arg1.field6020 = arg3.method3752(-2);
            if (arg1.field6020.charAt(0) == '~') {
                arg1.field6020 = arg1.field6020.substring(1);
                class25.method125(0, arg1.method3917((byte) 104, true), 0, arg1.field6020, 2, arg1.field9522, arg1.method3916((byte) -109, false));
            } else if (class130.field1749 == arg1) {
                class25.method125(0, arg1.method3917((byte) 103, true), 0, arg1.field6020, 2, arg1.field9522, arg1.method3916((byte) -109, false));
            }
            arg1.field6044 = 0;
            arg1.field6099 = 150;
            arg1.field6050 = 0;
        }
        if ((arg2 & 0x100) != 0) {
            int var6 = arg3.method3712((byte) -11);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg3.method3722((byte) 109);
            int var8 = arg3.method3701(-114);
            int var9 = var8 & 0x7;
            int var10 = var8 >> 3 & 0xF;
            if (var10 == 15) {
                var10 = -1;
            }
            arg1.method2583(true, var9, -116, var6, var7, var10);
        }
        if ((arg2 & 0x4000) != 0) {
            int var11 = arg3.method3755(128);
            arg1.field6083 = arg3.method3717(true);
            arg1.field6033 = arg3.method3745(-6314);
            arg1.field6019 = var11 & 0x7FFF;
            arg1.field6024 = (var11 & 0x8000) != 0;
            arg1.field6115 = class357.field5189 + arg1.field6019 + arg1.field6083;
        }
        if ((arg2 & 0x10000) != 0) {
            int var12 = arg3.method3745(-6314);
            int[] var13 = new int[var12];
            int[] var14 = new int[var12];
            for (int var15 = 0; var15 < var12; var15++) {
                int var16 = arg3.method3726(false);
                if ((var16 & 0xC000) == 49152) {
                    int var17 = arg3.method3693(56);
                    var13[var15] = class625.method3600(var17, var16 << 16);
                } else {
                    var13[var15] = var16;
                }
                var14[var15] = arg3.method3693(54);
            }
            arg1.method2574(var13, var14, -1);
        }
        if ((arg2 & 0x80) != 0) {
            int[] var18 = new int[4];
            for (int var19 = 0; var19 < 4; var19++) {
                var18[var19] = arg3.method3755(128);
                if (var18[var19] == 65535) {
                    var18[var19] = -1;
                }
            }
            int var20 = arg3.method3714((byte) 19);
            class528.method3084(arg1, var20, var18, 0);
        }
        if ((arg2 & 0x8000) != 0) {
            var5 = arg3.method3743(true);
        }
        if ((arg2 & 0x40000) != 0) {
            arg1.field6035 = arg3.method3711(16711680);
            arg1.field6043 = arg3.method3731(-380);
            arg1.field6048 = arg3.method3731(-380);
            arg1.field6062 = (byte) arg3.method3745(-6314);
            arg1.field6079 = class357.field5189 + arg3.method3712((byte) 1);
            arg1.field6071 = class357.field5189 + arg3.method3712((byte) -117);
        }
        if ((arg2 & 0x800) != 0) {
            arg1.field9497 = arg3.method3745(-6314) == 1;
        }
        if ((arg2 & 0x20) != 0) {
            int var21 = arg3.method3701(-114);
            if (var21 > 0) {
                for (int var22 = 0; var22 < var21; var22++) {
                    int var23 = -1;
                    int var24 = -1;
                    int var25 = arg3.method3728((byte) 88);
                    int var26 = -1;
                    if (var25 == 32767) {
                        var25 = arg3.method3728((byte) 88);
                        var24 = arg3.method3728((byte) 88);
                        var23 = arg3.method3728((byte) 88);
                        var26 = arg3.method3728((byte) 88);
                    } else if (var25 == 32766) {
                        var25 = -1;
                    } else {
                        var24 = arg3.method3728((byte) 88);
                    }
                    int var27 = arg3.method3728((byte) 88);
                    int var28 = arg3.method3717(true);
                    arg1.method2576(var24, var26, var23, false, var28, var25, var27, class357.field5189);
                }
            }
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field6093 = arg3.method3731(-380);
            arg1.field6113 = arg3.method3743(true);
            arg1.field6086 = arg3.method3711(16711680);
            arg1.field6023 = arg3.method3743(true);
            arg1.field6052 = arg3.method3693(71) + class357.field5189;
            arg1.field6100 = arg3.method3726(false) + class357.field5189;
            arg1.field6068 = arg3.method3701(-110);
            if (arg1.field9528) {
                arg1.field6113 += arg1.field9519;
                arg1.field6093 += arg1.field9515;
                arg1.field6086 += arg1.field9515;
                arg1.field6023 += arg1.field9519;
                arg1.field6130 = 0;
            } else {
                arg1.field6023 += arg1.field6139[0];
                arg1.field6093 += arg1.field6133[0];
                arg1.field6086 += arg1.field6133[0];
                arg1.field6130 = 1;
                arg1.field6113 += arg1.field6139[0];
            }
            arg1.field6134 = 0;
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field9535 = arg3.method3693(86);
            if (arg1.field6130 == 0) {
                arg1.method2584(arg1.field9535, (byte) -122);
                arg1.field9535 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var29 = arg3.method3693(100);
            if (var29 == 65535) {
                var29 = -1;
            }
            arg1.field6125 = var29;
        }
        if ((arg2 & 0x2000) != 0) {
            int var30 = arg3.method3714((byte) 19);
            int[] var31 = new int[var30];
            int[] var32 = new int[var30];
            int[] var33 = new int[var30];
            for (int var34 = 0; var34 < var30; var34++) {
                int var35 = arg3.method3755(128);
                if (var35 == 65535) {
                    var35 = -1;
                }
                var31[var34] = var35;
                var32[var34] = arg3.method3701(-120);
                var33[var34] = arg3.method3726(false);
            }
            class134.method943(34962, var32, arg1, var31, var33);
        }
        if ((arg2 & 0x10) != 0) {
            int var36 = arg3.method3755(128);
            if (var36 == 65535) {
                var36 = -1;
            }
            int var37 = arg3.method3709(true);
            int var38 = arg3.method3745(-6314);
            int var39 = var38 & 0x7;
            int var40 = (var38 & 0x7C) >> 3;
            if (var40 == 15) {
                var40 = -1;
            }
            arg1.method2583(false, var39, -121, var36, var37, var40);
        }
        int var41 = -92 % ((arg0 + 2) / 56);
        if ((arg2 & 0x40) != 0) {
            int var42 = arg3.method3717(true);
            byte[] var43 = new byte[var42];
            class645 var44 = new class645(var43);
            arg3.method3736(-109, var43, var42, 0);
            class470.field6859[arg4] = var44;
            arg1.method3919(47, var44);
        }
        if (!arg1.field9528) {
            return;
        }
        if (var5 == 127) {
            arg1.method3915(arg1.field9519, arg1.field9515, (byte) -28);
            return;
        }
        byte var45;
        if (var5 == -1) {
            var45 = class661.field9247[arg4];
        } else {
            var45 = var5;
        }
        class94.method742((byte) 120, var45, arg1);
        arg1.method3912(var45, arg1.field9515, arg1.field9519, -1);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lvk;", line = 392)
    public static final class369 method2272(int arg0, int arg1) {
        field5302++;
        if (arg1 != 18991) {
            method2271(-69, null, -42, null, 116);
        }
        if (arg0 == 0) {
            return field5301;
        } else if (arg0 == 1) {
            return field5308;
        } else if (arg0 == 2) {
            return field5309;
        } else if (arg0 == 3) {
            return field5310;
        } else if (arg0 == 4) {
            return field5311;
        } else if (arg0 == 5) {
            return field5312;
        } else if (arg0 == 6) {
            return field5313;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IILok;)V", line = 468)
    private class369(int arg0, int arg1, class256 arg2) {
        this.field5300 = arg1;
        this.field5304 = arg0;
        this.field5305 = arg2;
        this.field5306 = this.field5305.field3673 * this.field5300;
        if (this.field5304 >= 16) {
            throw new RuntimeException();
        }
    }
}
