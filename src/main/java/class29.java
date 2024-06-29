import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class29 extends class8 {

    @OriginalMember(owner = "mapview!o", name = "E", descriptor = "[[B")
    private byte[][] field366 = new byte[256][];

    @OriginalMember(owner = "mapview!o", name = "R", descriptor = "I")
    private int field379 = 0;

    @OriginalMember(owner = "mapview!o", name = "X", descriptor = "Z")
    private boolean field385;

    @OriginalMember(owner = "mapview!o", name = "U", descriptor = "[I")
    private int[] field382;

    @OriginalMember(owner = "mapview!o", name = "C", descriptor = "[I")
    private int[] field364;

    @OriginalMember(owner = "mapview!o", name = "O", descriptor = "[I")
    private int[] field376;

    @OriginalMember(owner = "mapview!o", name = "D", descriptor = "Lh;")
    private static class15 field365 = class18.method153("gr2", 1);

    @OriginalMember(owner = "mapview!o", name = "K", descriptor = "Lh;")
    private static class15 field372 = class18.method153("dre", 1);

    @OriginalMember(owner = "mapview!o", name = "F", descriptor = "Lh;")
    private static class15 field367 = class18.method153("dbl", 1);

    @OriginalMember(owner = "mapview!o", name = "G", descriptor = "Lh;")
    private static class15 field368 = class18.method153("gr1", 1);

    @OriginalMember(owner = "mapview!o", name = "S", descriptor = "Lh;")
    private static class15 field380 = class18.method153("or2", 1);

    @OriginalMember(owner = "mapview!o", name = "M", descriptor = "Lh;")
    private static class15 field374 = class18.method153("bla", 1);

    @OriginalMember(owner = "mapview!o", name = "T", descriptor = "Lh;")
    private static class15 field381 = class18.method153("or1", 1);

    @OriginalMember(owner = "mapview!o", name = "J", descriptor = "Lh;")
    private static class15 field371 = class18.method153("gr3", 1);

    @OriginalMember(owner = "mapview!o", name = "N", descriptor = "Lh;")
    private static class15 field375 = class18.method153("lre", 1);

    @OriginalMember(owner = "mapview!o", name = "Q", descriptor = "Lh;")
    private static class15 field378 = class18.method153("whi", 1);

    @OriginalMember(owner = "mapview!o", name = "W", descriptor = "Lh;")
    private static class15 field384 = class18.method153("mag", 1);

    @OriginalMember(owner = "mapview!o", name = "I", descriptor = "Lh;")
    private static class15 field370 = class18.method153("yel", 1);

    @OriginalMember(owner = "mapview!o", name = "V", descriptor = "Lh;")
    private static class15 field383 = class18.method153("str", 1);

    @OriginalMember(owner = "mapview!o", name = "P", descriptor = "Lh;")
    private static class15 field377 = class18.method153("blu", 1);

    @OriginalMember(owner = "mapview!o", name = "Y", descriptor = "Lh;")
    private static class15 field386 = class18.method153("cya", 1);

    @OriginalMember(owner = "mapview!o", name = "H", descriptor = "Lh;")
    private static class15 field369 = class18.method153("gre", 1);

    @OriginalMember(owner = "mapview!o", name = "L", descriptor = "Lh;")
    private static class15 field373 = class18.method153("or3", 1);

    @OriginalMember(owner = "mapview!o", name = "Z", descriptor = "Lh;")
    private static class15 field387 = class18.method153("red", 1);

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Lh;III)V", line = 3)
    public final void method195(class15 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field379;
        for (int var6 = 0; var6 < arg0.field229; var6++) {
            int var7 = arg0.field219[var6] & 0xFF;
            if (var7 != 32) {
                this.method197(this.field366[var7], arg1, this.field382[var7] + var5, this.field364[var7], this.field376[var7], arg3);
            }
            arg1 += this.field364[var7];
        }
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(Lh;III)V", line = 37)
    public final void method196(class15 arg0, int arg1, int arg2, int arg3) {
        this.method195(arg0, arg1 - this.method199(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "([BIIIII)V", line = 47)
    private final void method197(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class8.field109 * arg2 + arg1;
        int var8 = class8.field109 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class8.field110) {
            int var11 = class8.field110 - arg2;
            arg4 -= var11;
            arg2 = class8.field110;
            var10 += arg3 * var11;
            var7 += class8.field109 * var11;
        }
        if (arg2 + arg4 > class8.field113) {
            arg4 -= arg2 + arg4 - class8.field113;
        }
        if (arg1 < class8.field108) {
            int var12 = class8.field108 - arg1;
            arg3 -= var12;
            arg1 = class8.field108;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class8.field111) {
            int var13 = arg1 + arg3 - class8.field111;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method200(class8.field114, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "(Lh;III)V", line = 95)
    public final void method198(class15 arg0, int arg1, int arg2, int arg3) {
        this.method195(arg0, arg1 - this.method199(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Lh;)I", line = 105)
    public final int method199(class15 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field229; var3++) {
            var2 += this.field364[arg0.field219[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 371)
    public class29(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field385 = false;
        this.field382 = arg0;
        this.field364 = arg1;
        this.field376 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field366 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field382[var10] < var8) {
                var8 = this.field382[var10];
            }
            if (this.field382[var10] + this.field376[var10] > var9) {
                var9 = this.field382[var10] + this.field376[var10];
            }
            byte[] var11 = this.field366[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field379 = this.field382[32] + this.field376[32];
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "([I[BIIIIIII)V", line = 165)
    private final void method200(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Lh;IIIZ)V", line = 230)
    public final void method201(class15 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field385 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field379;
        for (int var8 = 0; var8 < arg0.field229; var8++) {
            if (arg0.field219[var8] == 64 && var8 + 4 < arg0.field229 && arg0.field219[var8 + 4] == 64) {
                int var9 = this.method202(arg0.method126(var8 + 4, (byte) -120, var8 + 1));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field219[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method197(this.field366[var10], arg1 + 1, this.field382[var10] + var7 + 1, this.field364[var10], this.field376[var10], 0);
                    }
                    this.method197(this.field366[var10], arg1, this.field382[var10] + var7, this.field364[var10], this.field376[var10], arg3);
                }
                arg1 += this.field364[var10];
            }
        }
        if (this.field385) {
            class8.method76(var6, (int) ((double) this.field379 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(Lh;)I", line = 306)
    private final int method202(class15 arg0) {
        if (arg0.method114((byte) -46, field387)) {
            return 16711680;
        } else if (arg0.method114((byte) -46, field369)) {
            return 65280;
        } else if (arg0.method114((byte) -46, field377)) {
            return 255;
        } else if (arg0.method114((byte) -46, field370)) {
            return 16776960;
        } else if (arg0.method114((byte) -46, field386)) {
            return 65535;
        } else if (arg0.method114((byte) -46, field384)) {
            return 16711935;
        } else if (arg0.method114((byte) -46, field378)) {
            return 16777215;
        } else if (arg0.method114((byte) -46, field374)) {
            return 0;
        } else if (arg0.method114((byte) -46, field375)) {
            return 16748608;
        } else if (arg0.method114((byte) -46, field372)) {
            return 8388608;
        } else if (arg0.method114((byte) -46, field367)) {
            return 128;
        } else if (arg0.method114((byte) -46, field381)) {
            return 16756736;
        } else if (arg0.method114((byte) -46, field380)) {
            return 16740352;
        } else if (arg0.method114((byte) -46, field373)) {
            return 16723968;
        } else if (arg0.method114((byte) -46, field368)) {
            return 12648192;
        } else if (arg0.method114((byte) -46, field365)) {
            return 8453888;
        } else if (arg0.method114((byte) -46, field371)) {
            return 4259584;
        } else {
            if (arg0.method114((byte) -46, field383)) {
                this.field385 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "()V", line = 431)
    public static void method203() {
        field387 = null;
        field369 = null;
        field377 = null;
        field370 = null;
        field386 = null;
        field384 = null;
        field378 = null;
        field374 = null;
        field375 = null;
        field372 = null;
        field367 = null;
        field381 = null;
        field380 = null;
        field373 = null;
        field368 = null;
        field365 = null;
        field371 = null;
        field383 = null;
    }
}
