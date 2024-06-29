import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 extends class17 {

    @OriginalMember(owner = "mapview!n", name = "Q", descriptor = "I")
    private int field354 = 0;

    @OriginalMember(owner = "mapview!n", name = "X", descriptor = "[[B")
    private byte[][] field361 = new byte[256][];

    @OriginalMember(owner = "mapview!n", name = "ab", descriptor = "Z")
    private boolean field364;

    @OriginalMember(owner = "mapview!n", name = "G", descriptor = "[I")
    private int[] field344;

    @OriginalMember(owner = "mapview!n", name = "T", descriptor = "[I")
    private int[] field357;

    @OriginalMember(owner = "mapview!n", name = "D", descriptor = "[I")
    private int[] field341;

    @OriginalMember(owner = "mapview!n", name = "J", descriptor = "Ld;")
    private static class7 field347 = class37.method242("or2", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "K", descriptor = "Ld;")
    private static class7 field348 = class37.method242("dbl", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "H", descriptor = "Ld;")
    private static class7 field345 = class37.method242("or1", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "M", descriptor = "Ld;")
    private static class7 field350 = class37.method242("or3", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "N", descriptor = "Ld;")
    private static class7 field351 = class37.method242("cya", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "I", descriptor = "Ld;")
    private static class7 field346 = class37.method242("gr1", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "E", descriptor = "Ld;")
    private static class7 field342 = class37.method242("yel", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "L", descriptor = "Ld;")
    private static class7 field349 = class37.method242("str", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "U", descriptor = "Ld;")
    private static class7 field358 = class37.method242("gr3", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "W", descriptor = "Ld;")
    private static class7 field360 = class37.method242("bla", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "R", descriptor = "Ld;")
    private static class7 field355 = class37.method242("lre", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "O", descriptor = "Ld;")
    private static class7 field352 = class37.method242("gre", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "P", descriptor = "Ld;")
    private static class7 field353 = class37.method242("red", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "F", descriptor = "Ld;")
    private static class7 field343 = class37.method242("dre", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "S", descriptor = "Ld;")
    private static class7 field356 = class37.method242("blu", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "Y", descriptor = "Ld;")
    private static class7 field362 = class37.method242("gr2", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "V", descriptor = "Ld;")
    private static class7 field359 = class37.method242("mag", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "Z", descriptor = "Ld;")
    private static class7 field363 = class37.method242("whi", 1333943984);

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ld;)I", line = 4)
    private final int method181(class7 arg0) {
        if (arg0.method70((byte) 108, field353)) {
            return 16711680;
        } else if (arg0.method70((byte) 121, field352)) {
            return 65280;
        } else if (arg0.method70((byte) 97, field356)) {
            return 255;
        } else if (arg0.method70((byte) 100, field342)) {
            return 16776960;
        } else if (arg0.method70((byte) 109, field351)) {
            return 65535;
        } else if (arg0.method70((byte) 88, field359)) {
            return 16711935;
        } else if (arg0.method70((byte) 108, field363)) {
            return 16777215;
        } else if (arg0.method70((byte) 83, field360)) {
            return 0;
        } else if (arg0.method70((byte) 93, field355)) {
            return 16748608;
        } else if (arg0.method70((byte) 84, field343)) {
            return 8388608;
        } else if (arg0.method70((byte) 112, field348)) {
            return 128;
        } else if (arg0.method70((byte) 83, field345)) {
            return 16756736;
        } else if (arg0.method70((byte) 120, field347)) {
            return 16740352;
        } else if (arg0.method70((byte) 124, field350)) {
            return 16723968;
        } else if (arg0.method70((byte) 105, field346)) {
            return 12648192;
        } else if (arg0.method70((byte) 105, field362)) {
            return 8453888;
        } else if (arg0.method70((byte) 123, field358)) {
            return 4259584;
        } else {
            if (arg0.method70((byte) 121, field349)) {
                this.field364 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ld;IIIZ)V", line = 63)
    public final void method182(class7 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field364 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field354;
        for (int var8 = 0; var8 < arg0.field90; var8++) {
            if (arg0.field79[var8] == 64 && var8 + 4 < arg0.field90 && arg0.field79[var8 + 4] == 64) {
                int var9 = this.method181(arg0.method53(103, var8 + 1, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field79[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method187(this.field361[var10], arg1 + 1, this.field344[var10] + var7 + 1, this.field357[var10], this.field341[var10], 0);
                    }
                    this.method187(this.field361[var10], arg1, this.field344[var10] + var7, this.field357[var10], this.field341[var10], arg3);
                }
                arg1 += this.field357[var10];
            }
        }
        if (this.field364) {
            class17.method122(var6, (int) ((double) this.field354 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "()V", line = 116)
    public static void method183() {
        field349 = null;
        field353 = null;
        field352 = null;
        field356 = null;
        field342 = null;
        field351 = null;
        field359 = null;
        field363 = null;
        field360 = null;
        field355 = null;
        field343 = null;
        field348 = null;
        field345 = null;
        field347 = null;
        field350 = null;
        field346 = null;
        field362 = null;
        field358 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ld;III)V", line = 136)
    public final void method184(class7 arg0, int arg1, int arg2, int arg3) {
        this.method185(arg0, arg1 - this.method188(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(Ld;III)V", line = 155)
    public final void method185(class7 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field354;
        for (int var6 = 0; var6 < arg0.field90; var6++) {
            int var7 = arg0.field79[var6] & 0xFF;
            if (var7 != 32) {
                this.method187(this.field361[var7], arg1, this.field344[var7] + var5, this.field357[var7], this.field341[var7], arg3);
            }
            arg1 += this.field357[var7];
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([I[BIIIIIII)V", line = 184)
    private final void method186(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([BIIIII)V", line = 240)
    private final void method187(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class17.field181 * arg2 + arg1;
        int var8 = class17.field181 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class17.field177) {
            int var11 = class17.field177 - arg2;
            arg4 -= var11;
            arg2 = class17.field177;
            var10 += arg3 * var11;
            var7 += class17.field181 * var11;
        }
        if (arg2 + arg4 > class17.field178) {
            arg4 -= arg2 + arg4 - class17.field178;
        }
        if (arg1 < class17.field179) {
            int var12 = class17.field179 - arg1;
            arg3 -= var12;
            arg1 = class17.field179;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class17.field182) {
            int var13 = arg1 + arg3 - class17.field182;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method186(class17.field180, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(Ld;)I", line = 291)
    public final int method188(class7 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field90; var3++) {
            var2 += this.field357[arg0.field79[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 403)
    public class26(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field364 = false;
        this.field344 = arg0;
        this.field357 = arg1;
        this.field341 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field361 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field344[var10] < var8) {
                var8 = this.field344[var10];
            }
            if (this.field344[var10] + this.field341[var10] > var9) {
                var9 = this.field344[var10] + this.field341[var10];
            }
            byte[] var11 = this.field361[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field354 = this.field344[32] + this.field341[32];
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(Ld;III)V", line = 368)
    public final void method189(class7 arg0, int arg1, int arg2, int arg3) {
        this.method185(arg0, arg1 - this.method188(arg0) / 2, arg2, arg3);
    }
}
