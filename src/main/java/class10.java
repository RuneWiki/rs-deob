import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DNACUOZQ")
public class class10 extends class29 {

    @OriginalMember(owner = "DNACUOZQ", name = "w", descriptor = "Z")
    private boolean field589 = false;

    @OriginalMember(owner = "DNACUOZQ", name = "x", descriptor = "I")
    private int field590 = -208;

    @OriginalMember(owner = "DNACUOZQ", name = "y", descriptor = "I")
    private int field591 = -10464;

    @OriginalMember(owner = "DNACUOZQ", name = "z", descriptor = "I")
    private int field592 = 22876;

    @OriginalMember(owner = "DNACUOZQ", name = "A", descriptor = "I")
    private int field593 = 8;

    @OriginalMember(owner = "DNACUOZQ", name = "B", descriptor = "Z")
    private boolean field594 = true;

    @OriginalMember(owner = "DNACUOZQ", name = "I", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "DNACUOZQ", name = "J", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "DNACUOZQ", name = "D", descriptor = "[I")
    public int[] field596;

    @OriginalMember(owner = "DNACUOZQ", name = "G", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "DNACUOZQ", name = "H", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "DNACUOZQ", name = "E", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "DNACUOZQ", name = "F", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "DNACUOZQ", name = "C", descriptor = "[B")
    public byte[] field595;

    @OriginalMember(owner = "DNACUOZQ", name = "<init>", descriptor = "(LCVNWKEAW;Ljava/lang/String;I)V")
    public class10(class7 arg0, String arg1, int arg2) {
        class62 var4 = new class62(-417, arg0.method180(arg1 + ".dat", null));
        class62 var5 = new class62(-417, arg0.method180("index.dat", null));
        var5.field1579 = var4.method523();
        this.field601 = var5.method523();
        this.field602 = var5.method523();
        int var6 = var5.method521();
        this.field596 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field596[var7 + 1] = var5.method525();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1579 += 2;
            var4.field1579 += var5.method523() * var5.method523();
            var5.field1579++;
        }
        this.field599 = var5.method521();
        this.field600 = var5.method521();
        this.field597 = var5.method523();
        this.field598 = var5.method523();
        int var9 = var5.method521();
        int var10 = this.field598 * this.field597;
        this.field595 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field595[var11] = var4.method522();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field597; var12++) {
                for (int var13 = 0; var13 < this.field598; var13++) {
                    this.field595[this.field597 * var13 + var12] = var4.method522();
                }
            }
        }
    }

    @OriginalMember(owner = "DNACUOZQ", name = "c", descriptor = "(I)V")
    public void method181(int arg0) {
        this.field601 /= 2;
        this.field602 /= 2;
        byte[] var2 = new byte[this.field602 * this.field601];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field598; var4++) {
            for (int var6 = 0; var6 < this.field597; var6++) {
                var2[(this.field599 + var6 >> 1) + (this.field600 + var4 >> 1) * this.field601] = this.field595[var3++];
            }
        }
        this.field595 = var2;
        this.field597 = this.field601;
        this.field598 = this.field602;
        this.field599 = 0;
        this.field600 = 0;
        if (this.field592 != arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "DNACUOZQ", name = "a", descriptor = "(Z)V")
    public void method182(boolean arg0) {
        if (this.field601 == this.field597 && this.field602 == this.field598) {
            return;
        }
        byte[] var2 = new byte[this.field602 * this.field601];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field598; var4++) {
            for (int var5 = 0; var5 < this.field597; var5++) {
                var2[(this.field600 + var4) * this.field601 + this.field599 + var5] = this.field595[var3++];
            }
        }
        this.field595 = var2;
        this.field597 = this.field601;
        this.field598 = this.field602;
        if (arg0) {
            this.field599 = 0;
            this.field600 = 0;
        }
    }

    @OriginalMember(owner = "DNACUOZQ", name = "b", descriptor = "(Z)V")
    public void method183(boolean arg0) {
        byte[] var2 = new byte[this.field598 * this.field597];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field598; var4++) {
            for (int var6 = this.field597 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field595[this.field597 * var4 + var6];
            }
        }
        this.field595 = var2;
        this.field599 = this.field601 - this.field597 - this.field599;
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "DNACUOZQ", name = "c", descriptor = "(Z)V")
    public void method184(boolean arg0) {
        if (arg0) {
            return;
        }
        byte[] var2 = new byte[this.field598 * this.field597];
        int var3 = 0;
        for (int var4 = this.field598 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field597; var5++) {
                var2[var3++] = this.field595[this.field597 * var4 + var5];
            }
        }
        this.field595 = var2;
        this.field600 = this.field602 - this.field598 - this.field600;
    }

    @OriginalMember(owner = "DNACUOZQ", name = "a", descriptor = "(ZIII)V")
    public void method185(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            return;
        }
        for (int var5 = 0; var5 < this.field596.length; var5++) {
            int var6 = this.field596[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field596[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field596[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field596[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "DNACUOZQ", name = "a", descriptor = "(III)V")
    public void method186(int arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            return;
        }
        int var4 = this.field599 + arg1;
        int var5 = this.field600 + arg0;
        int var6 = class29.field943 * var5 + var4;
        int var7 = 0;
        int var8 = this.field598;
        int var9 = this.field597;
        int var10 = class29.field943 - var9;
        int var11 = 0;
        if (var5 < class29.field945) {
            int var12 = class29.field945 - var5;
            var8 -= var12;
            var5 = class29.field945;
            var7 += var9 * var12;
            var6 += class29.field943 * var12;
        }
        if (var5 + var8 > class29.field946) {
            var8 -= var5 + var8 - class29.field946;
        }
        if (var4 < class29.field947) {
            int var13 = class29.field947 - var4;
            var9 -= var13;
            var4 = class29.field947;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class29.field948) {
            int var14 = var4 + var9 - class29.field948;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method187(var6, var7, var10, true, var8, var9, this.field596, class29.field942, var11, this.field595);
        }
    }

    @OriginalMember(owner = "DNACUOZQ", name = "a", descriptor = "(IIIZII[I[II[B)V")
    private void method187(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, byte[] arg9) {
        int var11 = -(arg5 >> 2);
        int var12 = -(arg5 & 0x3);
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg9[arg1++];
                if (var17 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg6[var17 & 0xFF];
                }
                byte var18 = arg9[arg1++];
                if (var18 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg6[var18 & 0xFF];
                }
                byte var19 = arg9[arg1++];
                if (var19 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg6[var19 & 0xFF];
                }
                byte var20 = arg9[arg1++];
                if (var20 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg6[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg9[arg1++];
                if (var16 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg6[var16 & 0xFF];
                }
            }
            arg0 += arg2;
            arg1 += arg8;
        }
        if (!arg3) {
            this.field589 = !this.field589;
        }
    }
}
