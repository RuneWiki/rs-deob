import jaggl.OpenGL;
import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class535 extends class751 {

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!jq", name = "I", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "Ljava/applet/Applet;")
    public static Applet field7544;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)V")
    public static void method3096(int arg0) {
        if (arg0 == 127) {
            field7544 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
    public class535() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZLjava/lang/String;Lkv;)Llv;")
    public static final class466 method3097(int arg0, boolean arg1, String arg2, class280 arg3) {
        ++field7546;
        if (!arg1) {
            return null;
        } else {
            long var4 = OpenGL.glCreateShaderObjectARB(arg0);
            OpenGL.glShaderSourceARB(var4, arg2);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class48.field685, 0);
            if (class48.field685[0] == 0) {
                if (class48.field685[0] == 0) {
                    System.out.println("Shader compile failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class48.field685, 1);
                if (class48.field685[1] > 1) {
                    byte[] var6 = new byte[class48.field685[1]];
                    OpenGL.glGetInfoLogARB(var4, class48.field685[1], class48.field685, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (~class48.field685[0] == -1) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class466(arg3, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field7547;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int[] var4 = this.method4173(arg0, (byte) -125, 0);
            int[] var5 = this.method4173(arg0, (byte) -114, 1);
            int[] var6 = this.method4173(arg0, (byte) -127, 2);
            for (int var7 = 0; ~var7 > ~class673.field9452; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return arg1 != 4095 ? null : var3;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method3098(boolean arg0, String arg1) {
        ++field7543;
        if (arg1 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class50.field719; ++var2) {
                if (arg1.equalsIgnoreCase(class662.field9293[var2])) {
                    return var2;
                }
            }
            return arg0 ? -41 : -1;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIIILmja;IIZ)Z")
    public static final boolean method3099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class438 arg7, int arg8, int arg9, boolean arg10) {
        ++field7549;
        int var11 = arg5;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg5;
        int var16 = -var14 + arg0;
        class614.field8676[var13][var14] = 99;
        if (!arg10) {
            field7544 = null;
        }
        class298.field4492[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class696.field9832[var17] = arg5;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class58.field822[var10001] = arg0;
        int[][] var19 = arg7.field6279;
        while (~var26 != ~var18) {
            var11 = class696.field9832[var18];
            var12 = class58.field822[var18];
            int var20 = -arg7.field6262 + var12;
            int var21 = -var16 + var12;
            int var22 = -var15 + var11;
            var18 = var18 - -1 & 4095;
            int var23 = -arg7.field6269 + var11;
            if (~arg9 != 3) {
                if (~arg9 != 2) {
                    if (~arg9 != 1) {
                        if (arg9 != -1) {
                            if (arg9 != 0 && arg9 != 1 && arg9 != 2 && arg9 != 3 && ~arg9 != -10) {
                                if (arg7.method2644(arg8, arg9, arg2, arg4, -12354, 1, var11, var12)) {
                                    class767.field10596 = var11;
                                    class689.field9749 = var12;
                                    return true;
                                }
                            } else if (arg7.method2653(-114, 1, arg9, arg8, var11, var12, arg4, arg2)) {
                                class689.field9749 = var12;
                                class767.field10596 = var11;
                                return true;
                            }
                        } else if (arg7.method2655(arg2, (byte) -126, arg1, var12, 1, arg6, arg3, arg4, var11)) {
                            class767.field10596 = var11;
                            class689.field9749 = var12;
                            return true;
                        }
                    } else if (arg7.method2640(arg4, arg1, 1, -96, var11, arg3, arg2, 1, arg6, var12)) {
                        class767.field10596 = var11;
                        class689.field9749 = var12;
                        return true;
                    }
                } else if (class509.method2977(1, 1, arg1, var12, arg3, arg4, false, arg2, var11)) {
                    class767.field10596 = var11;
                    class689.field9749 = var12;
                    return true;
                }
            } else if (arg4 == var11 && arg2 == var12) {
                class767.field10596 = var11;
                class689.field9749 = var12;
                return true;
            }
            int var25 = class298.field4492[var22][var21] + 1;
            if (~var22 < -1 && class614.field8676[var22 + -1][var21] == 0 && (1109655552 & var19[var23 + -1][var20]) == 0) {
                class696.field9832[var26] = var11 + -1;
                class58.field822[var26] = var12;
                class614.field8676[var22 - 1][var21] = 2;
                var26 = 4095 & var26 - -1;
                class298.field4492[var22 + -1][var21] = var25;
            }
            if (var22 < 127 && ~class614.field8676[var22 - -1][var21] == -1 && (1612972032 & var19[var23 - -1][var20]) == 0) {
                class696.field9832[var26] = var11 + 1;
                class58.field822[var26] = var12;
                class614.field8676[var22 + 1][var21] = 8;
                var26 = var26 + 1 & 4095;
                class298.field4492[var22 + 1][var21] = var25;
            }
            if (var21 > 0 && ~class614.field8676[var22][var21 + -1] == -1 && (1084489728 & var19[var23][var20 + -1]) == 0) {
                class696.field9832[var26] = var11;
                class58.field822[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class614.field8676[var22][var21 + -1] = 1;
                class298.field4492[var22][var21 - 1] = var25;
            }
            if (var21 < 127 && ~class614.field8676[var22][var21 + 1] == -1 && (1210318848 & var19[var23][var20 + 1]) == 0) {
                class696.field9832[var26] = var11;
                class58.field822[var26] = var12 + 1;
                var26 = 4095 & var26 + 1;
                class614.field8676[var22][var21 + 1] = 4;
                class298.field4492[var22][var21 + 1] = var25;
            }
            if (~var22 < -1 && ~var21 < -1 && ~class614.field8676[var22 + -1][var21 + -1] == -1 && ~(var19[var23 + -1][var20 + -1] & 1134821376) == -1 && (var19[var23 + -1][var20] & 1109655552) == 0 && (1084489728 & var19[var23][var20 + -1]) == 0) {
                class696.field9832[var26] = var11 + -1;
                class58.field822[var26] = var12 - 1;
                class614.field8676[var22 - 1][var21 + -1] = 3;
                var26 = 4095 & var26 + 1;
                class298.field4492[var22 + -1][var21 + -1] = var25;
            }
            if (~var22 > -128 && var21 > 0 && ~class614.field8676[var22 + 1][var21 + -1] == -1 && (var19[var23 + 1][var20 - 1] & 1625554944) == 0 && ~(1612972032 & var19[var23 + 1][var20]) == -1 && ~(var19[var23][var20 - 1] & 1084489728) == -1) {
                class696.field9832[var26] = var11 + 1;
                class58.field822[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class614.field8676[var22 + 1][var21 + -1] = 9;
                class298.field4492[var22 - -1][var21 + -1] = var25;
            }
            if (~var22 < -1 && ~var21 > -128 && class614.field8676[var22 - 1][var21 - -1] == 0 && ~(1310982144 & var19[var23 - 1][var20 + 1]) == -1 && ~(1109655552 & var19[var23 - 1][var20]) == -1 && (1210318848 & var19[var23][var20 + 1]) == 0) {
                class696.field9832[var26] = var11 + -1;
                class58.field822[var26] = var12 - -1;
                var26 = var26 + 1 & 4095;
                class614.field8676[var22 + -1][var21 + 1] = 6;
                class298.field4492[var22 - 1][var21 + 1] = var25;
            }
            if (var22 < 127 && var21 < 127 && class614.field8676[var22 + 1][var21 + 1] == 0 && ~(2015625216 & var19[var23 + 1][var20 - -1]) == -1 && (var19[var23 + 1][var20] & 1612972032) == 0 && (var19[var23][var20 - -1] & 1210318848) == 0) {
                class696.field9832[var26] = var11 + 1;
                class58.field822[var26] = var12 + 1;
                class614.field8676[var22 - -1][var21 + 1] = 12;
                var26 = var26 + 1 & 4095;
                class298.field4492[var22 + 1][var21 + 1] = var25;
            }
        }
        class689.field9749 = var12;
        class767.field10596 = var11;
        return false;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILrv;)Lbu;")
    public static final class21 method3100(int arg0, class120 arg1) {
        if (arg0 != 16579) {
            return null;
        } else {
            ++field7548;
            return new class21(arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method833(-3), arg1.method842(2384));
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field7545;
        if (arg2 == 0) {
            super.field10415 = ~arg1.method842(2384) == -2;
        }
        int var4 = 49 % ((arg0 - 25) / 63);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)[[I")
    public final int[][] method147(int arg0, byte arg1) {
        ++field7542;
        if (arg1 != 57) {
            field7544 = null;
        }
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (super.field10409.field8481) {
            int[] var4 = this.method4173(arg0, (byte) -126, 2);
            int[][] var5 = this.method4172(0, arg0, 1);
            int[][] var6 = this.method4172(1, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class673.field9452 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }
}
