import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class439 {

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    private int field6446;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    private int field6447;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    private int field6445;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Z")
    private boolean field6434;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    private int field6444;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    private int field6440;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    private int field6432;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    private int field6442;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "[I")
    private static int[] field6443 = new int[4];

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    private int field6435;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    private int field6436;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public int field6437;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    private int field6439;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    private int field6441;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Lid;")
    private static class348 field6433;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lgl;")
    private static class356 field6431;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lgl;")
    private class356 field6438;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Lgl;")
    private static class356 field6448;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V", line = 3)
    public final void method2699() {
        this.field6438 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Le;Lfl;)Z", line = 7)
    private final boolean method2700(class312 arg0, class439 arg1) {
        if (this.field6438 == null) {
            if (this.field6442 == 0) {
                if (class285.field4583.method985(this.field6444, (byte) -16)) {
                    int[] var3 = class285.field4583.method984(this.field6444, this.field6435, false, false, 0.7F, this.field6435);
                    this.field6438 = arg0.method703(var3, 0, this.field6435, this.field6435, this.field6435);
                }
            } else if (this.field6442 == 2) {
                this.method2706(arg0, arg1);
            } else if (this.field6442 == 1) {
                this.method2705(arg0, arg1);
            }
        }
        return this.field6438 != null;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()V", line = 41)
    public static void method2701() {
        field6433 = null;
        field6431 = null;
        field6448 = null;
        field6443 = null;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Le;Lfl;)Z", line = 47)
    public final boolean method2702(class312 arg0, class439 arg1) {
        return this.field6438 != null || this.method2700(arg0, arg1);
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "()V", line = 50)
    public static final void method2703() {
        field6433 = null;
        field6448 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Le;IIIIII)V", line = 56)
    public final void method2704(class312 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6438 == null) {
            return;
        }
        int var8 = this.field6441 - arg5 & 0x3FFF;
        int var9 = this.field6439 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field6436) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field6436) / 2;
        if (var10 < arg4 && this.field6436 + var10 > 0 && var11 < arg3 && this.field6436 + var11 > 0) {
            this.field6438.method2320(arg1 + var11, arg2 + var10, this.field6436, this.field6436);
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(Le;Lfl;)V", line = 93)
    private final void method2705(class312 arg0, class439 arg1) {
        method2708(arg0);
        method2709(arg0);
        arg0.method654(field6443);
        arg0.method671(0, 0, this.field6435, this.field6435);
        arg0.method558();
        arg0.method563(0, 0, this.field6435, this.field6435, this.field6440 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field6434) {
                var3 = -arg1.field6446;
                var4 = -arg1.field6447;
                var5 = -arg1.field6445;
            } else {
                var3 = arg1.field6446 - this.field6446;
                var4 = arg1.field6447 - this.field6447;
                var5 = arg1.field6445 - this.field6445;
            }
        }
        if (this.field6441 != 0) {
            int var6 = class258.field4177[this.field6441];
            int var7 = class258.field4173[this.field6441];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field6439 != 0) {
            int var9 = class258.field4177[this.field6439];
            int var10 = class258.field4173[this.field6439];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class348 var12 = field6433.method15((byte) 0, 25600, true);
        if (arg0.method634()) {
            var12.method35((short) 0, (short) this.field6444);
        } else {
            var12.method38((short) 127, class285.field4583.method989(this.field6444, (byte) 36).field4284);
            var12.method35((short) 0, (short) -1);
        }
        arg0.method714(1.0F);
        arg0.method683(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field6435 * 1024 / (var12.method54() - var12.method56());
        if (this.field6440 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method589(this.field6435 / 2, this.field6435 / 2, var13, var13);
        arg0.method693(arg0.method704());
        class435 var14 = arg0.method704();
        var14.method1984(0, 0, arg0.method690() - var12.method21());
        var12.method49(var14, (class170) null, 1024, 1);
        int var15 = this.field6435 * 13 / 16;
        int var16 = (this.field6435 - var15) / 2;
        field6431.method420(var16, var16, var15, var15, 1, this.field6440 | 0xFF000000, 1);
        this.field6438 = arg0.method686(0, 0, this.field6435, this.field6435, true);
        arg0.method558();
        arg0.method563(0, 0, this.field6435, this.field6435, 0, 0);
        field6448.method420(0, 0, this.field6435, this.field6435, 0, 0, 0);
        this.field6438.method417(0, 0, 0);
        arg0.method671(field6443[0], field6443[1], field6443[2], field6443[3]);
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(Le;Lfl;)V", line = 189)
    private final void method2706(class312 arg0, class439 arg1) {
        class86 var3 = class21.method154(this.field6444, class300.field4765, 0, (byte) 34);
        if (var3 == null) {
            return;
        }
        arg0.method654(field6443);
        arg0.method671(0, 0, this.field6435, this.field6435);
        arg0.method563(0, 0, this.field6435, this.field6435, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field6434) {
                var4 = -arg1.field6446;
                var5 = -arg1.field6447;
                var6 = -arg1.field6445;
            } else {
                var4 = this.field6446 - arg1.field6446;
                var5 = this.field6447 - arg1.field6447;
                var6 = this.field6445 - arg1.field6445;
            }
        }
        if (this.field6441 != 0) {
            int var7 = -this.field6441 & 0x3FFF;
            int var8 = class258.field4177[var7];
            int var9 = class258.field4173[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field6439 != 0) {
            int var11 = -this.field6439 & 0x3FFF;
            int var12 = class258.field4177[var11];
            int var13 = class258.field4173[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method714(1.0F);
        arg0.method683(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class348 var15 = arg0.method639(var3, 1024, 0, 64, 768);
        int var16 = var15.method54() - var15.method56();
        int var17 = var15.method46() - var15.method57();
        int var18 = var15.method56() + var16 / 2;
        int var19 = var15.method57() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method589(var18, var19, var20, var20);
        arg0.method693(arg0.method704());
        class435 var21 = arg0.method713();
        var21.method1984(0, 0, arg0.method690() - var15.method21());
        var15.method49(var21, (class170) null, arg0.method690(), 1);
        this.field6438 = arg0.method686(0, 0, this.field6435, this.field6435, true);
        this.field6438.method417(0, 0, 3);
        arg0.method671(field6443[0], field6443[1], field6443[2], field6443[3]);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)Z", line = 277)
    public final boolean method2707(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field6434) {
            this.field6437 = 1073741823;
            var8 = this.field6446;
            var9 = this.field6447;
            var10 = this.field6445;
        } else {
            int var5 = this.field6446 - arg0;
            int var6 = this.field6447 - arg1;
            int var7 = this.field6445 - arg2;
            this.field6437 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field6437 == 0) {
                this.field6437 = 1;
            }
            var8 = (var5 << 8) / this.field6437;
            var9 = (var6 << 8) / this.field6437;
            var10 = (var7 << 8) / this.field6437;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field6436 = this.field6432 * arg3 / (this.field6434 ? 1024 : this.field6437);
        } else {
            this.field6436 = 0;
        }
        if (this.field6436 < 8) {
            this.field6438 = null;
            return false;
        }
        int var12 = class111.method822((byte) 122, this.field6436);
        if (var12 > arg3) {
            var12 = class410.method2573(arg3, (byte) -95);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field6435 != var12) {
            this.field6435 = var12;
        }
        this.field6441 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field6439 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field6438 = null;
        return true;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Le;)V", line = 335)
    private static final void method2708(class312 arg0) {
        if (field6433 != null) {
            return;
        }
        class86 var1 = new class86(580, 1104, 1);
        var1.method527((short) 32767, (short) 1024, (byte) 3, (byte) 0, (short) 0, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (short) 0);
        var1.method522(0, 128, 0, (byte) -28);
        var1.method522(0, -128, 0, (byte) -28);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class258.field4177[var3];
            int var5 = class258.field4173[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class258.field4173[var12] >> 8;
                int var14 = class258.field4177[var12] * var4 >> 23;
                int var15 = class258.field4177[var12] * var5 >> 23;
                var1.method522(-var14, var13, var15, (byte) -28);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method532(0, (short) 0, 15499, (short) 127, var8, (byte) 0, var7, (byte) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method532(var8, (short) 0, 15499, (short) 127, var10, (byte) 0, var7, (byte) 0, (byte) 0);
                    var1.method532(var10, (short) 0, 15499, (short) 127, var11, (byte) 0, var7, (byte) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method532(var7, (short) 0, 15499, (short) 127, var8, (byte) 0, 1, (byte) 0, (byte) 0);
            }
        }
        var1.field1054 = var1.field1061;
        var1.field1075 = null;
        var1.field1084 = null;
        var1.field1067 = null;
        field6433 = arg0.method639(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Le;)V", line = 418)
    private static final void method2709(class312 arg0) {
        if (field6448 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field6448 = arg0.method703(var2, 0, 128, 128, 128);
        field6431 = arg0.method703(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
    public class439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field6446 = arg2;
        this.field6447 = arg3;
        this.field6445 = arg4;
        this.field6434 = arg7;
        this.field6444 = arg1;
        this.field6440 = arg6;
        this.field6432 = arg5;
        this.field6442 = arg0;
    }
}
