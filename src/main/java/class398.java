import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class398 extends class489 {

    @OriginalMember(owner = "client!qu", name = "P", descriptor = "Z")
    public static boolean field5371 = false;

    @OriginalMember(owner = "client!qu", name = "T", descriptor = "[I")
    public static int[] field5375 = new int[1024];

    @OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!qu", name = "R", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!qu", name = "S", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "[B")
    private byte[] field5370;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILjw;IIIIIZII)Z", line = 7)
    public static final boolean method2245(int arg0, int arg1, class263 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field5373++;
        int var11 = arg1;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        if (!arg8) {
            return false;
        }
        int var15 = arg1 - var13;
        class106.field1145[var13][var14] = 99;
        int var16 = arg7 - var14;
        class378.field5119[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class60.field615[var17] = arg1;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class299.field3729[var10001] = arg7;
        int[][] var19 = arg2.field3286;
        while (var26 != var18) {
            var11 = class60.field615[var18];
            var12 = class299.field3729[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg2.field3289;
            int var23 = var12 - arg2.field3274;
            if (arg4 == -4) {
                if (arg9 == var11 && arg3 == var12) {
                    class572.field8123 = var12;
                    class701.field9839 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class248.method1461(arg10, 2, arg9, arg6, arg3, var12, (byte) 116, 2, var11)) {
                    class572.field8123 = var12;
                    class701.field9839 = var11;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg2.method1552(arg9, var11, arg5, arg3, 2, arg10, arg6, var12, -79, 2)) {
                    class701.field9839 = var11;
                    class572.field8123 = var12;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg2.method1555(arg6, arg10, var11, arg9, 2, 1, arg5, var12, arg3)) {
                    class701.field9839 = var11;
                    class572.field8123 = var12;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg2.method1543(2, arg3, arg4, arg0, var11, 9816, arg9, var12)) {
                    class701.field9839 = var11;
                    class572.field8123 = var12;
                    return true;
                }
            } else if (arg2.method1558(arg0, arg9, 60, arg4, var11, 2, var12, arg3)) {
                class701.field9839 = var11;
                class572.field8123 = var12;
                return true;
            }
            int var25 = class378.field5119[var21][var20] + 1;
            if (var21 > 0 && class106.field1145[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class60.field615[var26] = var11 - 1;
                class299.field3729[var26] = var12;
                class106.field1145[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class378.field5119[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class106.field1145[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class60.field615[var26] = var11 + 1;
                class299.field3729[var26] = var12;
                class106.field1145[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class378.field5119[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class106.field1145[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class60.field615[var26] = var11;
                class299.field3729[var26] = var12 - 1;
                class106.field1145[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class378.field5119[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class106.field1145[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class60.field615[var26] = var11;
                class299.field3729[var26] = var12 + 1;
                class106.field1145[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class378.field5119[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class106.field1145[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class60.field615[var26] = var11 - 1;
                class299.field3729[var26] = var12 - 1;
                class106.field1145[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class378.field5119[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class106.field1145[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class60.field615[var26] = var11 + 1;
                class299.field3729[var26] = var12 - 1;
                class106.field1145[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class378.field5119[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class106.field1145[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class60.field615[var26] = var11 - 1;
                class299.field3729[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1145[var21 - 1][var20 + 1] = 6;
                class378.field5119[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class106.field1145[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class60.field615[var26] = var11 + 1;
                class299.field3729[var26] = var12 + 1;
                class106.field1145[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class378.field5119[var21 + 1][var20 + 1] = var25;
            }
        }
        class572.field8123 = var12;
        class701.field9839 = var11;
        return false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "()V", line = 360)
    public static final void method2246() {
        byte var0 = 10;
        byte var1 = 30;
        if (class653.field9162 == null) {
            return;
        }
        class568.field8078.method963(class287.field3588);
        for (int var2 = 0; var2 < class494.field7162.length; var2++) {
            class568.field8078.method3202(1, class287.field3588[1], -256, class61.field625[var2] + class494.field7162[var2], class287.field3588[3] - class287.field3588[1]);
        }
        for (int var3 = 0; var3 < class108.field1173; var3++) {
            class603 var11 = class246.field3033[var3];
            class568.field8078.method970(var11.field8486[0], var11.field8478[0], var11.field8476[0], class26.field233);
            class568.field8078.method970(var11.field8486[1], var11.field8478[1], var11.field8476[1], class324.field3981);
            class568.field8078.method970(var11.field8486[2], var11.field8478[2], var11.field8476[2], class549.field7857);
            class568.field8078.method970(var11.field8486[3], var11.field8478[3], var11.field8476[3], class60.field613);
            if (class26.field233[2] != -1 && class324.field3981[2] != -1 && class549.field7857[2] != -1 && class60.field613[2] != -1) {
                int var12 = -65536;
                if (var11.field8488 == 4) {
                    var12 = -16776961;
                }
                class568.field8078.method3204((byte) -55, class324.field3981[0], class26.field233[1], var12, class26.field233[0], class324.field3981[1]);
                class568.field8078.method3204((byte) -55, class549.field7857[0], class324.field3981[1], var12, class324.field3981[0], class549.field7857[1]);
                class568.field8078.method3204((byte) -55, class60.field613[0], class549.field7857[1], var12, class549.field7857[0], class60.field613[1]);
                class568.field8078.method3204((byte) -55, class26.field233[0], class60.field613[1], var12, class60.field613[0], class26.field233[1]);
                class568.field8078.method3204((byte) -55, class549.field7857[0], class26.field233[1], var12, class26.field233[0], class549.field7857[1]);
            }
        }
        class653.field9162.method2318("Static Opaque: OW: " + class321.field3949[0] + "/" + class674.field9393[0] + " UW: " + class321.field3949[1] + "/" + class674.field9393[1], -16777216, var0, 0, -256, var1);
        class653.field9162.method2318("Static Trans: OW: " + class635.field8946[0] + "/" + class161.field1798[0] + " UW: " + class635.field8946[1] + "/" + class161.field1798[1], -16777216, var0, 0, -256, var1 + 15);
        class653.field9162.method2318("Static Anim: OW: " + class701.field9822[0] + "/" + class241.field2992[0] + " UW: " + class701.field9822[1] + "/" + class241.field2992[1], -16777216, var0, 0, -256, var1 + 30);
        class653.field9162.method2318("Dynamic: " + class282.field3532 + "/" + 5000, -16777216, var0, 0, -256, var1 + 45);
        class653.field9162.method2318("Total Opaque Onscreen: " + class446.field6294 + "/" + 10000, -16777216, var0, 0, -256, var1 + 60);
        class653.field9162.method2318("Total Trans Onscreen: " + class361.field4846 + "/" + 5000, -16777216, var0, 0, -256, var1 + 75);
        class653.field9162.method2318("Occluders: " + (class581.field8265 + class394.field5341) + " Active: " + class108.field1173, -16777216, var0, 0, -256, var1 + 90);
        class653.field9162.method2318("Occluded: Ground:" + class302.field3751 + " Walls: " + class602.field8471 + " CPs: " + class676.field9402 + " Pixels: " + class697.field9783, -16777216, var0, 0, -256, var1 + 105);
        class653.field9162.method2318("Occlude Calc Took: " + class530.field7455 / 1000L + "us", -16777216, var0, 0, -256, var1 + 120);
        if (class560.field7990 == null) {
            return;
        }
        for (int var4 = 0; var4 < class560.field7990.length; var4++) {
            float var6 = (float) class560.field7990[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class560.field7990[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class534 var5 = class568.field8078.method1017(class560.field7990, 0, class148.field1637, class148.field1637, class303.field3755);
        var5.method314(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BII)V", line = 442)
    public final void method2247(byte arg0, int arg1, int arg2) {
        if (arg2 != 24982) {
            return;
        }
        field5372++;
        byte var4 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field5370[var10001] = var4;
        this.field5370[var6] = var4;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IBII)[B", line = 457)
    public final byte[] method2248(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 117) {
            method2246();
        }
        field5374++;
        this.field5370 = new byte[arg0 * arg2 * arg3 * 2];
        this.method774(arg1 ^ 0xFFFFFFE7, arg3, arg0, arg2);
        return this.field5370;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V", line = 474)
    public class398() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V", line = 477)
    public static void method2249(int arg0) {
        if (arg0 < 52) {
            field5371 = true;
        }
        field5375 = null;
    }
}
