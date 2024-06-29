import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class489 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    private int field6830 = 0;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lwaa;")
    private class652 field6831;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "S")
    public static short field6841 = 205;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public static int[] field6833 = new int[13];

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lii;")
    private class513 field6832;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Ljn;")
    public static class668 field6839;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lob;")
    public static class685 field6835;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Lf;")
    public static class701 field6829;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static final void method2847(int arg0) {
        field6836++;
        if (arg0 == -1) {
            class681.field9746 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2848(String arg0, int arg1) {
        field6844++;
        if (!class186.field2279.field3404) {
            return -1;
        } else if (class540.field7845.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class493.method2866((byte) 116, arg0);
            if (var2 == null) {
                return -1;
            }
            String var3 = class540.field7854 + var2;
            if (!class427.field6135.method3812("", var3, arg1 ^ 0xFFFF8E91)) {
                return -1;
            } else if (class427.field6135.method3810(30416, var3)) {
                byte[] var4 = class427.field6135.method3778(-121, var3, "");
                if (arg1 != -28944) {
                    method2853(-35, -95, false);
                }
                Object var5 = null;
                File var6;
                try {
                    var6 = class292.method1735(var2, 31025);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class372.method2165(var6, false);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class186.field2279.method1519((byte) 114, var4, var6);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class77.method651(var6, -984, arg0);
                return 100;
            } else {
                return class427.field6135.method3789(var3, arg1 + 28947);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class489() {
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Lii;")
    public final class513 method2849(boolean arg0) {
        field6838++;
        if (this.field6830 > 0 && this.field6831.field9222[this.field6830 - 1] != this.field6832) {
            class513 var2 = this.field6832;
            this.field6832 = var2.field7520;
            return var2;
        }
        while (this.field6830 < this.field6831.field9233) {
            class513 var3 = this.field6831.field9222[this.field6830++].field7520;
            if (this.field6831.field9222[this.field6830 - 1] != var3) {
                this.field6832 = var3.field7520;
                return var3;
            }
        }
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method2850(byte arg0) {
        field6829 = null;
        if (arg0 < 78) {
            method2847(-122);
        }
        field6835 = null;
        field6833 = null;
        field6839 = null;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lii;")
    public final class513 method2851(int arg0) {
        if (arg0 >= -33) {
            return null;
        } else {
            this.field6830 = 0;
            field6840++;
            return this.method2849(false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IFIIIIII[FIIFF)V")
    public static final void method2852(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9, int arg10, float arg11, float arg12) {
        int var13 = arg0 - arg2;
        field6842++;
        int var14 = arg7 - arg10;
        int var15 = arg5 - arg9;
        float var16 = arg8[2] * (float) var15 + arg8[1] * (float) var13 + arg8[0] * (float) var14;
        float var17 = arg8[5] * (float) var15 + arg8[arg6] * (float) var13 + arg8[3] * (float) var14;
        float var18 = arg8[8] * (float) var15 + arg8[7] * (float) var13 + arg8[6] * (float) var14;
        float var19;
        float var20;
        if (arg3 == 0) {
            var19 = arg12 + 0.5F - var18;
            var20 = arg1 + var16 + 0.5F;
        } else if (arg3 == 1) {
            var19 = arg12 + var18 + 0.5F;
            var20 = arg1 + var16 + 0.5F;
        } else if (arg3 == 2) {
            var19 = arg11 + 0.5F - var17;
            var20 = arg1 + 0.5F - var16;
        } else if (arg3 == 3) {
            var20 = arg1 + var16 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg3 == 4) {
            var19 = arg11 + 0.5F - var17;
            var20 = arg12 + var18 + 0.5F;
        } else {
            var20 = arg12 + 0.5F - var18;
            var19 = arg11 + 0.5F - var17;
        }
        if (arg4 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg4 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg4 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class282.field3846 = var19;
        class510.field7443 = var20;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lwaa;)V")
    public class489(class652 arg0) {
        this.field6831 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2853(int arg0, int arg1, boolean arg2) {
        field6837++;
        if (arg2) {
            method2853(79, 96, true);
        }
        return class337.method1945(arg0, arg1, 0) | (arg0 & 0x70000) != 0 || class436.method2611(arg0, arg1, 65535);
    }
}
