import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 extends class1 {

    @OriginalMember(owner = "mapview!d", name = "E", descriptor = "I")
    private int field85 = 0;

    @OriginalMember(owner = "mapview!d", name = "F", descriptor = "[[B")
    private byte[][] field86 = new byte[256][];

    @OriginalMember(owner = "mapview!d", name = "N", descriptor = "[I")
    private int[] field94;

    @OriginalMember(owner = "mapview!d", name = "S", descriptor = "[I")
    private int[] field99;

    @OriginalMember(owner = "mapview!d", name = "C", descriptor = "[I")
    private int[] field83;

    @OriginalMember(owner = "mapview!d", name = "A", descriptor = "Lr;")
    private static class33 field81 = class29.method192("or3", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "G", descriptor = "Lr;")
    private static class33 field87 = class29.method192("lre", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "L", descriptor = "Z")
    private static boolean field92 = false;

    @OriginalMember(owner = "mapview!d", name = "H", descriptor = "Lr;")
    private static class33 field88 = class29.method192("or2", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "M", descriptor = "Lr;")
    private static class33 field93 = class29.method192("bla", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "Q", descriptor = "Lr;")
    private static class33 field97 = class29.method192("dbl", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "D", descriptor = "Lr;")
    private static class33 field84 = class29.method192("str", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "J", descriptor = "Lr;")
    private static class33 field90 = class29.method192("red", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "K", descriptor = "Lr;")
    private static class33 field91 = class29.method192("gr3", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "I", descriptor = "Lr;")
    private static class33 field89 = class29.method192("blu", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "P", descriptor = "Lr;")
    private static class33 field96 = class29.method192("cya", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "T", descriptor = "Lr;")
    private static class33 field100 = class29.method192("or1", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "O", descriptor = "Lr;")
    private static class33 field95 = class29.method192("yel", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "B", descriptor = "Lr;")
    private static class33 field82 = class29.method192("dre", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "V", descriptor = "Lr;")
    private static class33 field102 = class29.method192("whi", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "U", descriptor = "Lr;")
    private static class33 field101 = class29.method192("gre", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "W", descriptor = "Lr;")
    private static class33 field103 = class29.method192("mag", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "R", descriptor = "Lr;")
    private static class33 field98 = class29.method192("gr1", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "X", descriptor = "Lr;")
    private static class33 field104 = class29.method192("gr2", (byte) 126);

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "()V", line = 18)
    public static void method40() {
        field84 = null;
        field90 = null;
        field101 = null;
        field89 = null;
        field95 = null;
        field96 = null;
        field103 = null;
        field102 = null;
        field93 = null;
        field87 = null;
        field82 = null;
        field97 = null;
        field100 = null;
        field88 = null;
        field81 = null;
        field98 = null;
        field104 = null;
        field91 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([I[BIIIIIII)V", line = 39)
    private static final void method41(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Lr;)I", line = 97)
    private final int method42(class33 arg0) {
        if (arg0.method222(field90, (byte) 67)) {
            return 16711680;
        } else if (arg0.method222(field101, (byte) 81)) {
            return 65280;
        } else if (arg0.method222(field89, (byte) 33)) {
            return 255;
        } else if (arg0.method222(field95, (byte) 102)) {
            return 16776960;
        } else if (arg0.method222(field96, (byte) 66)) {
            return 65535;
        } else if (arg0.method222(field103, (byte) 98)) {
            return 16711935;
        } else if (arg0.method222(field102, (byte) 109)) {
            return 16777215;
        } else if (arg0.method222(field93, (byte) 58)) {
            return 0;
        } else if (arg0.method222(field87, (byte) 96)) {
            return 16748608;
        } else if (arg0.method222(field82, (byte) 100)) {
            return 8388608;
        } else if (arg0.method222(field97, (byte) 72)) {
            return 128;
        } else if (arg0.method222(field100, (byte) 78)) {
            return 16756736;
        } else if (arg0.method222(field88, (byte) 104)) {
            return 16740352;
        } else if (arg0.method222(field81, (byte) 100)) {
            return 16723968;
        } else if (arg0.method222(field98, (byte) 36)) {
            return 12648192;
        } else if (arg0.method222(field104, (byte) 45)) {
            return 8453888;
        } else if (arg0.method222(field91, (byte) 67)) {
            return 4259584;
        } else {
            if (arg0.method222(field84, (byte) 48)) {
                field92 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([BIIIII)V", line = 175)
    private static final void method43(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class1.field3 * arg2 + arg1;
        int var7 = class1.field3 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class1.field4) {
            int var10 = class1.field4 - arg2;
            arg4 -= var10;
            arg2 = class1.field4;
            var9 += arg3 * var10;
            var6 += class1.field3 * var10;
        }
        if (arg2 + arg4 > class1.field2) {
            arg4 -= arg2 + arg4 - class1.field2;
        }
        if (arg1 < class1.field5) {
            int var11 = class1.field5 - arg1;
            arg3 -= var11;
            arg1 = class1.field5;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class1.field7) {
            int var12 = arg1 + arg3 - class1.field7;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method41(class1.field6, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Lr;III)V", line = 224)
    public final void method44(class33 arg0, int arg1, int arg2, int arg3) {
        this.method46(arg0, arg1 - this.method45(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(Lr;)I", line = 239)
    public final int method45(class33 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field470; var3++) {
            var2 += this.field99[arg0.field465[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(Lr;III)V", line = 262)
    public final void method46(class33 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field85;
        for (int var6 = 0; var6 < arg0.field470; var6++) {
            int var7 = arg0.field465[var6] & 0xFF;
            if (var7 != 32) {
                method43(this.field86[var7], arg1, this.field94[var7] + var5, this.field99[var7], this.field83[var7], arg3);
            }
            arg1 += this.field99[var7];
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Lr;IIIZ)V", line = 294)
    public final void method47(class33 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field92 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field85;
        for (int var8 = 0; var8 < arg0.field470; var8++) {
            if (arg0.field465[var8] == 64 && var8 + 4 < arg0.field470 && arg0.field465[var8 + 4] == 64) {
                int var9 = this.method42(arg0.method225(var8 + 1, var8 + 4, (byte) -74));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field465[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method43(this.field86[var10], arg1 + 1, this.field94[var10] + var7 + 1, this.field99[var10], this.field83[var10], 0);
                    }
                    method43(this.field86[var10], arg1, this.field94[var10] + var7, this.field99[var10], this.field83[var10], arg3);
                }
                arg1 += this.field99[var10];
            }
        }
        if (field92) {
            class1.method4(var6, (int) ((double) this.field85 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 399)
    public class7(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field94 = arg0;
        this.field99 = arg1;
        this.field83 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field86 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field94[var10] < var8 && this.field83[var10] != 0) {
                var8 = this.field94[var10];
            }
            if (this.field94[var10] + this.field83[var10] > var9) {
                var9 = this.field94[var10] + this.field83[var10];
            }
            byte[] var11 = this.field86[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field85 = this.field94[32] + this.field83[32];
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(Lr;III)V", line = 355)
    public final void method48(class33 arg0, int arg1, int arg2, int arg3) {
        this.method46(arg0, arg1 - this.method45(arg0) / 2, arg2, arg3);
    }
}
