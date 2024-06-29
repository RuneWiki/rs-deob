import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class25 extends class37 {

    @OriginalMember(owner = "mapview!ma", name = "O", descriptor = "I")
    private int field283 = 0;

    @OriginalMember(owner = "mapview!ma", name = "J", descriptor = "[[B")
    private byte[][] field278 = new byte[256][];

    @OriginalMember(owner = "mapview!ma", name = "eb", descriptor = "Z")
    private boolean field299;

    @OriginalMember(owner = "mapview!ma", name = "M", descriptor = "[I")
    private int[] field281;

    @OriginalMember(owner = "mapview!ma", name = "Y", descriptor = "[I")
    private int[] field293;

    @OriginalMember(owner = "mapview!ma", name = "X", descriptor = "[I")
    private int[] field292;

    @OriginalMember(owner = "mapview!ma", name = "L", descriptor = "Lt;")
    private static class35 field280 = class3.method28(false, "bla");

    @OriginalMember(owner = "mapview!ma", name = "I", descriptor = "Lt;")
    private static class35 field277 = class3.method28(false, "gr3");

    @OriginalMember(owner = "mapview!ma", name = "P", descriptor = "Lt;")
    private static class35 field284 = class3.method28(false, "blu");

    @OriginalMember(owner = "mapview!ma", name = "K", descriptor = "Lt;")
    private static class35 field279 = class3.method28(false, "or3");

    @OriginalMember(owner = "mapview!ma", name = "Q", descriptor = "Lt;")
    private static class35 field285 = class3.method28(false, "gr1");

    @OriginalMember(owner = "mapview!ma", name = "S", descriptor = "Lt;")
    private static class35 field287 = class3.method28(false, "str");

    @OriginalMember(owner = "mapview!ma", name = "T", descriptor = "Lt;")
    private static class35 field288 = class3.method28(false, "gre");

    @OriginalMember(owner = "mapview!ma", name = "R", descriptor = "Lt;")
    private static class35 field286 = class3.method28(false, "mag");

    @OriginalMember(owner = "mapview!ma", name = "N", descriptor = "Lt;")
    private static class35 field282 = class3.method28(false, "yel");

    @OriginalMember(owner = "mapview!ma", name = "V", descriptor = "Lt;")
    private static class35 field290 = class3.method28(false, "cya");

    @OriginalMember(owner = "mapview!ma", name = "bb", descriptor = "Lt;")
    private static class35 field296 = class3.method28(false, "lre");

    @OriginalMember(owner = "mapview!ma", name = "Z", descriptor = "Lt;")
    private static class35 field294 = class3.method28(false, "or2");

    @OriginalMember(owner = "mapview!ma", name = "W", descriptor = "Lt;")
    private static class35 field291 = class3.method28(false, "gr2");

    @OriginalMember(owner = "mapview!ma", name = "U", descriptor = "Lt;")
    private static class35 field289 = class3.method28(false, "whi");

    @OriginalMember(owner = "mapview!ma", name = "cb", descriptor = "Lt;")
    private static class35 field297 = class3.method28(false, "red");

    @OriginalMember(owner = "mapview!ma", name = "ab", descriptor = "Lt;")
    private static class35 field295 = class3.method28(false, "dbl");

    @OriginalMember(owner = "mapview!ma", name = "db", descriptor = "Lt;")
    private static class35 field298 = class3.method28(false, "or1");

    @OriginalMember(owner = "mapview!ma", name = "fb", descriptor = "Lt;")
    private static class35 field300 = class3.method28(false, "dre");

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Lt;III)V", line = 6)
    public final void method138(class35 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field283;
        for (int var6 = 0; var6 < arg0.field434; var6++) {
            int var7 = arg0.field433[var6] & 0xFF;
            if (var7 != 32) {
                this.method140(this.field278[var7], arg1, this.field281[var7] + var5, this.field293[var7], this.field292[var7], arg3);
            }
            arg1 += this.field293[var7];
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(Lt;III)V", line = 30)
    public final void method139(class35 arg0, int arg1, int arg2, int arg3) {
        this.method138(arg0, arg1 - this.method144(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 395)
    public class25(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field299 = false;
        this.field281 = arg0;
        this.field293 = arg1;
        this.field292 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field278 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field281[var10] < var8) {
                var8 = this.field281[var10];
            }
            if (this.field292[var10] + this.field281[var10] > var9) {
                var9 = this.field292[var10] + this.field281[var10];
            }
            byte[] var11 = this.field278[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field283 = this.field292[32] + this.field281[32];
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "([BIIIII)V", line = 57)
    private final void method140(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class37.field460 * arg2 + arg1;
        int var8 = class37.field460 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class37.field459) {
            int var11 = class37.field459 - arg2;
            arg4 -= var11;
            arg2 = class37.field459;
            var10 += arg3 * var11;
            var7 += class37.field460 * var11;
        }
        if (arg2 + arg4 > class37.field454) {
            arg4 -= arg2 + arg4 - class37.field454;
        }
        if (arg1 < class37.field457) {
            int var12 = class37.field457 - arg1;
            arg3 -= var12;
            arg1 = class37.field457;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class37.field458) {
            int var13 = arg1 + arg3 - class37.field458;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method141(class37.field456, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "([I[BIIIIIII)V", line = 107)
    private final void method141(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "()V", line = 162)
    public static void method142() {
        field297 = null;
        field288 = null;
        field284 = null;
        field282 = null;
        field290 = null;
        field286 = null;
        field289 = null;
        field280 = null;
        field296 = null;
        field300 = null;
        field295 = null;
        field298 = null;
        field294 = null;
        field279 = null;
        field285 = null;
        field291 = null;
        field277 = null;
        field287 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "(Lt;III)V", line = 193)
    public final void method143(class35 arg0, int arg1, int arg2, int arg3) {
        this.method138(arg0, arg1 - this.method144(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Lt;)I", line = 203)
    public final int method144(class35 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field434; var3++) {
            var2 += this.field293[arg0.field433[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Lt;IIIZ)V", line = 222)
    public final void method145(class35 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field299 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field283;
        for (int var8 = 0; var8 < arg0.field434; var8++) {
            if (arg0.field433[var8] == 64 && var8 + 4 < arg0.field434 && arg0.field433[var8 + 4] == 64) {
                int var9 = this.method146(arg0.method216(var8 + 4, true, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field433[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method140(this.field278[var10], arg1 + 1, this.field281[var10] + var7 + 1, this.field293[var10], this.field292[var10], 0);
                    }
                    this.method140(this.field278[var10], arg1, this.field281[var10] + var7, this.field293[var10], this.field292[var10], arg3);
                }
                arg1 += this.field293[var10];
            }
        }
        if (this.field299) {
            class37.method237(var6, (int) ((double) this.field283 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(Lt;)I", line = 276)
    private final int method146(class35 arg0) {
        if (arg0.method207(field297, 122)) {
            return 16711680;
        } else if (arg0.method207(field288, 117)) {
            return 65280;
        } else if (arg0.method207(field284, 92)) {
            return 255;
        } else if (arg0.method207(field282, 72)) {
            return 16776960;
        } else if (arg0.method207(field290, 114)) {
            return 65535;
        } else if (arg0.method207(field286, 103)) {
            return 16711935;
        } else if (arg0.method207(field289, 103)) {
            return 16777215;
        } else if (arg0.method207(field280, 49)) {
            return 0;
        } else if (arg0.method207(field296, 89)) {
            return 16748608;
        } else if (arg0.method207(field300, 72)) {
            return 8388608;
        } else if (arg0.method207(field295, 51)) {
            return 128;
        } else if (arg0.method207(field298, 60)) {
            return 16756736;
        } else if (arg0.method207(field294, 85)) {
            return 16740352;
        } else if (arg0.method207(field279, 88)) {
            return 16723968;
        } else if (arg0.method207(field285, 73)) {
            return 12648192;
        } else if (arg0.method207(field291, 122)) {
            return 8453888;
        } else if (arg0.method207(field277, 96)) {
            return 4259584;
        } else {
            if (arg0.method207(field287, 45)) {
                this.field299 = true;
            }
            return -1;
        }
    }
}
