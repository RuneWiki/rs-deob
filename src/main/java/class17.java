import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class17 extends class15 {

    @OriginalMember(owner = "mapview!ja", name = "T", descriptor = "[[B")
    private byte[][] field169 = new byte[256][];

    @OriginalMember(owner = "mapview!ja", name = "M", descriptor = "I")
    private int field162 = 0;

    @OriginalMember(owner = "mapview!ja", name = "K", descriptor = "[I")
    private int[] field160;

    @OriginalMember(owner = "mapview!ja", name = "U", descriptor = "[I")
    private int[] field170;

    @OriginalMember(owner = "mapview!ja", name = "W", descriptor = "[I")
    private int[] field172;

    @OriginalMember(owner = "mapview!ja", name = "J", descriptor = "Lw;")
    private static class38 field159 = class35.method219("bla", true);

    @OriginalMember(owner = "mapview!ja", name = "N", descriptor = "Lw;")
    private static class38 field163 = class35.method219("dre", true);

    @OriginalMember(owner = "mapview!ja", name = "I", descriptor = "Lw;")
    private static class38 field158 = class35.method219("gr2", true);

    @OriginalMember(owner = "mapview!ja", name = "P", descriptor = "Lw;")
    private static class38 field165 = class35.method219("gr3", true);

    @OriginalMember(owner = "mapview!ja", name = "X", descriptor = "Lw;")
    private static class38 field173 = class35.method219("str", true);

    @OriginalMember(owner = "mapview!ja", name = "F", descriptor = "Z")
    private static boolean field155 = false;

    @OriginalMember(owner = "mapview!ja", name = "G", descriptor = "Lw;")
    private static class38 field156 = class35.method219("or3", true);

    @OriginalMember(owner = "mapview!ja", name = "R", descriptor = "Lw;")
    private static class38 field167 = class35.method219("whi", true);

    @OriginalMember(owner = "mapview!ja", name = "O", descriptor = "Lw;")
    private static class38 field164 = class35.method219("mag", true);

    @OriginalMember(owner = "mapview!ja", name = "ab", descriptor = "Lw;")
    private static class38 field176 = class35.method219("red", true);

    @OriginalMember(owner = "mapview!ja", name = "Q", descriptor = "Lw;")
    private static class38 field166 = class35.method219("gr1", true);

    @OriginalMember(owner = "mapview!ja", name = "Z", descriptor = "Lw;")
    private static class38 field175 = class35.method219("or2", true);

    @OriginalMember(owner = "mapview!ja", name = "V", descriptor = "Lw;")
    private static class38 field171 = class35.method219("or1", true);

    @OriginalMember(owner = "mapview!ja", name = "Y", descriptor = "Lw;")
    private static class38 field174 = class35.method219("lre", true);

    @OriginalMember(owner = "mapview!ja", name = "H", descriptor = "Lw;")
    private static class38 field157 = class35.method219("dbl", true);

    @OriginalMember(owner = "mapview!ja", name = "bb", descriptor = "Lw;")
    private static class38 field177 = class35.method219("blu", true);

    @OriginalMember(owner = "mapview!ja", name = "L", descriptor = "Lw;")
    private static class38 field161 = class35.method219("yel", true);

    @OriginalMember(owner = "mapview!ja", name = "cb", descriptor = "Lw;")
    private static class38 field178 = class35.method219("cya", true);

    @OriginalMember(owner = "mapview!ja", name = "S", descriptor = "Lw;")
    private static class38 field168 = class35.method219("gre", true);

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Lw;IIIZ)V", line = 12)
    public final void method90(class38 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field155 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field162;
        for (int var8 = 0; var8 < arg0.field502; var8++) {
            if (arg0.field503[var8] == 64 && var8 + 4 < arg0.field502 && arg0.field503[var8 + 4] == 64) {
                int var9 = this.method97(arg0.method244(var8 + 4, var8 + 1, 0));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field503[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method93(this.field169[var10], arg1 + 1, this.field160[var10] + var7 + 1, this.field170[var10], this.field172[var10], 0);
                    }
                    method93(this.field169[var10], arg1, this.field160[var10] + var7, this.field170[var10], this.field172[var10], arg3);
                }
                arg1 += this.field170[var10];
            }
        }
        if (field155) {
            class15.method81(var6, (int) ((double) this.field162 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Lw;III)V", line = 54)
    public final void method91(class38 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field162;
        for (int var6 = 0; var6 < arg0.field502; var6++) {
            int var7 = arg0.field503[var6] & 0xFF;
            if (var7 != 32) {
                method93(this.field169[var7], arg1, this.field160[var7] + var5, this.field170[var7], this.field172[var7], arg3);
            }
            arg1 += this.field170[var7];
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([I[BIIIIIII)V", line = 77)
    private static final void method92(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
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
            for (int var13 = var10; var13 < 0; var13++) {
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

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([BIIIII)V", line = 136)
    private static final void method93(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class15.field139 * arg2 + arg1;
        int var7 = class15.field139 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class15.field134) {
            int var10 = class15.field134 - arg2;
            arg4 -= var10;
            arg2 = class15.field134;
            var9 += arg3 * var10;
            var6 += class15.field139 * var10;
        }
        if (arg2 + arg4 > class15.field136) {
            arg4 -= arg2 + arg4 - class15.field136;
        }
        if (arg1 < class15.field135) {
            int var11 = class15.field135 - arg1;
            arg3 -= var11;
            arg1 = class15.field135;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class15.field133) {
            int var12 = arg1 + arg3 - class15.field133;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method92(class15.field138, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(Lw;III)V", line = 201)
    public final void method94(class38 arg0, int arg1, int arg2, int arg3) {
        this.method91(arg0, arg1 - this.method96(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(Lw;III)V", line = 231)
    public final void method95(class38 arg0, int arg1, int arg2, int arg3) {
        this.method91(arg0, arg1 - this.method96(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Lw;)I", line = 246)
    public final int method96(class38 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field502; var3++) {
            var2 += this.field170[arg0.field503[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 403)
    public class17(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field160 = arg0;
        this.field170 = arg1;
        this.field172 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field169 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field160[var10] < var8 && this.field172[var10] != 0) {
                var8 = this.field160[var10];
            }
            if (this.field172[var10] + this.field160[var10] > var9) {
                var9 = this.field172[var10] + this.field160[var10];
            }
            byte[] var11 = this.field169[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field162 = this.field172[32] + this.field160[32];
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(Lw;)I", line = 305)
    private final int method97(class38 arg0) {
        if (arg0.method236(field176, -115)) {
            return 16711680;
        } else if (arg0.method236(field168, -97)) {
            return 65280;
        } else if (arg0.method236(field177, -104)) {
            return 255;
        } else if (arg0.method236(field161, -125)) {
            return 16776960;
        } else if (arg0.method236(field178, -81)) {
            return 65535;
        } else if (arg0.method236(field164, -87)) {
            return 16711935;
        } else if (arg0.method236(field167, -108)) {
            return 16777215;
        } else if (arg0.method236(field159, -119)) {
            return 0;
        } else if (arg0.method236(field174, -115)) {
            return 16748608;
        } else if (arg0.method236(field163, -87)) {
            return 8388608;
        } else if (arg0.method236(field157, -116)) {
            return 128;
        } else if (arg0.method236(field171, -100)) {
            return 16756736;
        } else if (arg0.method236(field175, -102)) {
            return 16740352;
        } else if (arg0.method236(field156, -116)) {
            return 16723968;
        } else if (arg0.method236(field166, -107)) {
            return 12648192;
        } else if (arg0.method236(field158, -115)) {
            return 8453888;
        } else if (arg0.method236(field165, -117)) {
            return 4259584;
        } else {
            if (arg0.method236(field173, -119)) {
                field155 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "()V", line = 374)
    public static void method98() {
        field173 = null;
        field176 = null;
        field168 = null;
        field177 = null;
        field161 = null;
        field178 = null;
        field164 = null;
        field167 = null;
        field159 = null;
        field174 = null;
        field163 = null;
        field157 = null;
        field171 = null;
        field175 = null;
        field156 = null;
        field166 = null;
        field158 = null;
        field165 = null;
    }
}
