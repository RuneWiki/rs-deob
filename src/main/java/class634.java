import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class634 extends class190 {

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Lau;")
    public static class692 field9147 = new class692(8);

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "Lmv;")
    public static class295 field9148;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lew;Ljava/awt/Component;III)Lcv;", line = 4)
    public static final class22 method3633(class226 arg0, Component arg1, int arg2, int arg3, int arg4) {
        ++field9146;
        if (~class82.field1321 == -1) {
            throw new IllegalStateException();
        } else if (~arg4 <= -1 && ~arg4 > -3) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class22 var5 = (class22) Class.forName("sp").newInstance();
                var5.field412 = new int[256 * (!class550.field8108 ? 1 : 2)];
                var5.field421 = arg2;
                var5.method150(arg1);
                if (arg3 != -3) {
                    field9147 = null;
                }
                var5.field424 = (arg2 & -1024) + 1024;
                if (~var5.field424 < -16385) {
                    var5.field424 = 16384;
                }
                var5.method149(var5.field424);
                if (class85.field1334 > 0 && class526.field7480 == null) {
                    class526.field7480 = new class623();
                    class526.field7480.field9005 = arg0;
                    arg0.method1414(16, class526.field7480, class85.field1334);
                }
                if (class526.field7480 != null) {
                    if (class526.field7480.field9012[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class526.field7480.field9012[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class33 var6 = new class33(arg0, arg4);
                    var6.field421 = arg2;
                    var6.field412 = new int[256 * (class550.field8108 ? 2 : 1)];
                    var6.method150(arg1);
                    var6.field424 = 16384;
                    var6.method149(var6.field424);
                    if (~class85.field1334 < -1 && class526.field7480 == null) {
                        class526.field7480 = new class623();
                        class526.field7480.field9005 = arg0;
                        arg0.method1414(16, class526.field7480, class85.field1334);
                    }
                    if (class526.field7480 != null) {
                        if (class526.field7480.field9012[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class526.field7480.field9012[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class22();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V", line = 88)
    public static void method3634(int arg0) {
        field9148 = null;
        field9147 = null;
        if (arg0 != -1024) {
            method3633((class226) null, (Component) null, -110, -12, 29);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lua;Lr;IIIIILps;I)V", line = 105)
    public static final void method3635(class591 arg0, class98 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class5 arg7, int arg8) {
        ++field9149;
        class168 var9 = class189.field2572.method2757(arg5, (byte) -46);
        if (arg6 != 2) {
            field9147 = null;
        }
        if (var9 != null && var9.field2340 && var9.method1173(class308.field4545, arg6 ^ 21)) {
            if (var9.field2361 != null) {
                int[] var10 = new int[var9.field2361.length];
                for (int var11 = 0; ~(var10.length / 2) < ~var11; ++var11) {
                    int var13;
                    if (class684.field9659 == 4) {
                        var13 = 16383 & (int) class311.field4589;
                    } else {
                        var13 = 16383 & (int) class311.field4589 + class53.field817;
                    }
                    int var14 = class271.field3549[var13];
                    int var15 = class271.field3544[var13];
                    if (~class684.field9659 != -5) {
                        var15 = var15 * 256 / (class697.field9826 - -256);
                        var14 = var14 * 256 / (class697.field9826 + 256);
                    }
                    var10[var11 * 2] = arg7.field202 / 2 + (arg3 - -((var9.field2361[var11 * 2] * 4 + arg8) * var15 + (var9.field2361[var11 * 2 + 1] * 4 + arg2) * var14 >> 14));
                    var10[var11 * 2 + 1] = arg7.field76 / 2 + (arg4 - ((var9.field2361[var11 * 2 - -1] * 4 + arg2) * var15 + -((var9.field2361[var11 * 2] * 4 + arg8) * var14) >> 14));
                }
                class156.method1120(arg1, var10, var9.field2364, arg7.field200, arg7.field154);
                for (int var12 = 0; ~(var10.length / 2 + -1) < ~var12; ++var12) {
                    arg1.method643(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 2 + 1], var9.field2365, 1, arg0, arg3, arg4);
                }
                arg1.method643(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field2365, 1, arg0, arg3, arg4);
            }
            class256 var16 = null;
            if (~var9.field2379 != 0) {
                var16 = var9.method1175(false, arg6 + -106, arg1);
                if (var16 != null) {
                    class492.method2815(var16, arg8, arg2, arg4, arg7, arg0, (byte) 62, arg3);
                }
            }
            if (var9.field2372 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method56();
                }
                class393 var18 = class597.field8642;
                class606 var19 = class446.field6477;
                if (var9.field2370 == 1) {
                    var18 = class244.field3236;
                    var19 = class624.field9024;
                }
                if (~var9.field2370 == -3) {
                    var18 = class395.field5976;
                    var19 = class141.field2042;
                }
                class287.method1690(arg2, arg4, var9.field2372, arg0, var19, var17, var18, arg7, var9.field2360, arg3, arg8, arg6 + -105);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[[I", line = 203)
    public final int[][] method138(int arg0, int arg1) {
        ++field9150;
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (arg0 != 21402) {
            return null;
        } else {
            if (super.field9211.field2131 && this.method1251((byte) 96)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field2574 * super.field2574;
                for (int var8 = 0; var8 < class338.field4909; ++var8) {
                    int var9 = super.field2580[var8 % super.field2575 + var7];
                    var6[var8] = class425.method2563(var9, 255) << 4;
                    var5[var8] = class425.method2563(var9 >> 4, 4080);
                    var4[var8] = class425.method2563(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }
}
