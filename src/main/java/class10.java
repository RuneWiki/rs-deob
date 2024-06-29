import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 extends class12 {

    @OriginalMember(owner = "mapview!ea", name = "T", descriptor = "[[B")
    private byte[][] field166 = new byte[256][];

    @OriginalMember(owner = "mapview!ea", name = "eb", descriptor = "I")
    private int field177 = 0;

    @OriginalMember(owner = "mapview!ea", name = "fb", descriptor = "Z")
    private boolean field178;

    @OriginalMember(owner = "mapview!ea", name = "R", descriptor = "[I")
    private int[] field164;

    @OriginalMember(owner = "mapview!ea", name = "X", descriptor = "[I")
    private int[] field170;

    @OriginalMember(owner = "mapview!ea", name = "S", descriptor = "[I")
    private int[] field165;

    @OriginalMember(owner = "mapview!ea", name = "L", descriptor = "Lh;")
    private static class15 field158 = class26.method190(true, "red");

    @OriginalMember(owner = "mapview!ea", name = "J", descriptor = "Lh;")
    private static class15 field156 = class26.method190(true, "or1");

    @OriginalMember(owner = "mapview!ea", name = "K", descriptor = "Lh;")
    private static class15 field157 = class26.method190(true, "or2");

    @OriginalMember(owner = "mapview!ea", name = "N", descriptor = "Lh;")
    private static class15 field160 = class26.method190(true, "gr2");

    @OriginalMember(owner = "mapview!ea", name = "O", descriptor = "Lh;")
    private static class15 field161 = class26.method190(true, "lre");

    @OriginalMember(owner = "mapview!ea", name = "P", descriptor = "Lh;")
    private static class15 field162 = class26.method190(true, "blu");

    @OriginalMember(owner = "mapview!ea", name = "M", descriptor = "Lh;")
    private static class15 field159 = class26.method190(true, "or3");

    @OriginalMember(owner = "mapview!ea", name = "Q", descriptor = "Lh;")
    private static class15 field163 = class26.method190(true, "str");

    @OriginalMember(owner = "mapview!ea", name = "bb", descriptor = "Lh;")
    private static class15 field174 = class26.method190(true, "bla");

    @OriginalMember(owner = "mapview!ea", name = "ab", descriptor = "Lh;")
    private static class15 field173 = class26.method190(true, "dre");

    @OriginalMember(owner = "mapview!ea", name = "Z", descriptor = "Lh;")
    private static class15 field172 = class26.method190(true, "whi");

    @OriginalMember(owner = "mapview!ea", name = "db", descriptor = "Lh;")
    private static class15 field176 = class26.method190(true, "dbl");

    @OriginalMember(owner = "mapview!ea", name = "V", descriptor = "Lh;")
    private static class15 field168 = class26.method190(true, "mag");

    @OriginalMember(owner = "mapview!ea", name = "W", descriptor = "Lh;")
    private static class15 field169 = class26.method190(true, "yel");

    @OriginalMember(owner = "mapview!ea", name = "Y", descriptor = "Lh;")
    private static class15 field171 = class26.method190(true, "gr1");

    @OriginalMember(owner = "mapview!ea", name = "cb", descriptor = "Lh;")
    private static class15 field175 = class26.method190(true, "gre");

    @OriginalMember(owner = "mapview!ea", name = "gb", descriptor = "Lh;")
    private static class15 field179 = class26.method190(true, "gr3");

    @OriginalMember(owner = "mapview!ea", name = "U", descriptor = "Lh;")
    private static class15 field167 = class26.method190(true, "cya");

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "()V", line = 6)
    public static void method80() {
        field158 = null;
        field175 = null;
        field162 = null;
        field169 = null;
        field167 = null;
        field168 = null;
        field172 = null;
        field174 = null;
        field161 = null;
        field173 = null;
        field176 = null;
        field156 = null;
        field157 = null;
        field159 = null;
        field171 = null;
        field160 = null;
        field179 = null;
        field163 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Lh;)I", line = 26)
    private final int method81(class15 arg0) {
        if (arg0.method117(field158, true)) {
            return 16711680;
        } else if (arg0.method117(field175, true)) {
            return 65280;
        } else if (arg0.method117(field162, true)) {
            return 255;
        } else if (arg0.method117(field169, true)) {
            return 16776960;
        } else if (arg0.method117(field167, true)) {
            return 65535;
        } else if (arg0.method117(field168, true)) {
            return 16711935;
        } else if (arg0.method117(field172, true)) {
            return 16777215;
        } else if (arg0.method117(field174, true)) {
            return 0;
        } else if (arg0.method117(field161, true)) {
            return 16748608;
        } else if (arg0.method117(field173, true)) {
            return 8388608;
        } else if (arg0.method117(field176, true)) {
            return 128;
        } else if (arg0.method117(field156, true)) {
            return 16756736;
        } else if (arg0.method117(field157, true)) {
            return 16740352;
        } else if (arg0.method117(field159, true)) {
            return 16723968;
        } else if (arg0.method117(field171, true)) {
            return 12648192;
        } else if (arg0.method117(field160, true)) {
            return 8453888;
        } else if (arg0.method117(field179, true)) {
            return 4259584;
        } else {
            if (arg0.method117(field163, true)) {
                this.field178 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Lh;III)V", line = 111)
    public final void method82(class15 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field177;
        for (int var6 = 0; var6 < arg0.field250; var6++) {
            int var7 = arg0.field247[var6] & 0xFF;
            if (var7 != 32) {
                this.method87(this.field166[var7], arg1, this.field164[var7] + var5, this.field170[var7], this.field165[var7], arg3);
            }
            arg1 += this.field170[var7];
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(Lh;III)V", line = 137)
    public final void method83(class15 arg0, int arg1, int arg2, int arg3) {
        this.method82(arg0, arg1 - this.method84(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(Lh;)I", line = 176)
    public final int method84(class15 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field250; var3++) {
            var2 += this.field170[arg0.field247[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([I[BIIIIIII)V", line = 194)
    private final void method85(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(Lh;III)V", line = 258)
    public final void method86(class15 arg0, int arg1, int arg2, int arg3) {
        this.method82(arg0, arg1 - this.method84(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 392)
    public class10(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field178 = false;
        this.field164 = arg0;
        this.field170 = arg1;
        this.field165 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field166 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field164[var10] < var8) {
                var8 = this.field164[var10];
            }
            if (this.field165[var10] + this.field164[var10] > var9) {
                var9 = this.field165[var10] + this.field164[var10];
            }
            byte[] var11 = this.field166[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field177 = this.field165[32] + this.field164[32];
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([BIIIII)V", line = 268)
    private final void method87(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class12.field223 * arg2 + arg1;
        int var8 = class12.field223 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class12.field224) {
            int var11 = class12.field224 - arg2;
            arg4 -= var11;
            arg2 = class12.field224;
            var10 += arg3 * var11;
            var7 += class12.field223 * var11;
        }
        if (arg2 + arg4 > class12.field225) {
            arg4 -= arg2 + arg4 - class12.field225;
        }
        if (arg1 < class12.field219) {
            int var12 = class12.field219 - arg1;
            arg3 -= var12;
            arg1 = class12.field219;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class12.field221) {
            int var13 = arg1 + arg3 - class12.field221;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method85(class12.field222, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Lh;IIIZ)V", line = 315)
    public final void method88(class15 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field178 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field177;
        for (int var8 = 0; var8 < arg0.field250; var8++) {
            if (arg0.field247[var8] == 64 && var8 + 4 < arg0.field250 && arg0.field247[var8 + 4] == 64) {
                int var9 = this.method81(arg0.method119(var8 + 1, var8 + 4, 118));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field247[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method87(this.field166[var10], arg1 + 1, this.field164[var10] + var7 + 1, this.field170[var10], this.field165[var10], 0);
                    }
                    this.method87(this.field166[var10], arg1, this.field164[var10] + var7, this.field170[var10], this.field165[var10], arg3);
                }
                arg1 += this.field170[var10];
            }
        }
        if (this.field178) {
            class12.method99(var6, (int) ((double) this.field177 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }
}
