import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AGTHLVTI")
public class class3 extends class11 {

    @OriginalMember(owner = "AGTHLVTI", name = "z", descriptor = "I")
    private int field21 = 99;

    @OriginalMember(owner = "AGTHLVTI", name = "A", descriptor = "Z")
    private boolean field22 = false;

    @OriginalMember(owner = "AGTHLVTI", name = "B", descriptor = "I")
    private int field23 = 46583;

    @OriginalMember(owner = "AGTHLVTI", name = "C", descriptor = "I")
    private int field24 = -925;

    @OriginalMember(owner = "AGTHLVTI", name = "D", descriptor = "I")
    private int field25 = 317;

    @OriginalMember(owner = "AGTHLVTI", name = "K", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "AGTHLVTI", name = "L", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "AGTHLVTI", name = "F", descriptor = "[I")
    public int[] field27;

    @OriginalMember(owner = "AGTHLVTI", name = "I", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "AGTHLVTI", name = "J", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "AGTHLVTI", name = "G", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "AGTHLVTI", name = "H", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "AGTHLVTI", name = "E", descriptor = "[B")
    public byte[] field26;

    @OriginalMember(owner = "AGTHLVTI", name = "<init>", descriptor = "(LBYZSQZUF;Ljava/lang/String;I)V")
    public class3(class7 arg0, String arg1, int arg2) {
        class24 var4 = new class24(0, arg0.method29(arg1 + ".dat", null));
        class24 var5 = new class24(0, arg0.method29("index.dat", null));
        var5.field832 = var4.method240();
        this.field32 = var5.method240();
        this.field33 = var5.method240();
        int var6 = var5.method238();
        this.field27 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field27[var7 + 1] = var5.method242();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field832 += 2;
            var4.field832 += var5.method240() * var5.method240();
            var5.field832++;
        }
        this.field30 = var5.method238();
        this.field31 = var5.method238();
        this.field28 = var5.method240();
        this.field29 = var5.method240();
        int var9 = var5.method238();
        int var10 = this.field29 * this.field28;
        this.field26 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field26[var11] = var4.method239();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field28; var12++) {
                    for (int var13 = 0; var13 < this.field29; var13++) {
                        this.field26[this.field28 * var13 + var12] = var4.method239();
                    }
                }
            }
            if (class64.field1590) {
            }
        }
    }

    @OriginalMember(owner = "AGTHLVTI", name = "b", descriptor = "(I)V")
    public void method8(int arg0) {
        this.field32 /= 2;
        this.field33 /= 2;
        byte[] var2 = new byte[this.field33 * this.field32];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field29; var4++) {
            for (int var6 = 0; var6 < this.field28; var6++) {
                var2[(this.field30 + var6 >> 1) + (this.field31 + var4 >> 1) * this.field32] = this.field26[var3++];
            }
        }
        this.field26 = var2;
        this.field28 = this.field32;
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field29 = this.field33;
        this.field30 = 0;
        this.field31 = 0;
    }

    @OriginalMember(owner = "AGTHLVTI", name = "c", descriptor = "(I)V")
    public void method9(int arg0) {
        if (this.field32 == this.field28 && this.field33 == this.field29) {
            return;
        }
        byte[] var2 = new byte[this.field33 * this.field32];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field29; var4++) {
            for (int var5 = 0; var5 < this.field28; var5++) {
                var2[(this.field31 + var4) * this.field32 + this.field30 + var5] = this.field26[var3++];
            }
        }
        this.field26 = var2;
        this.field28 = this.field32;
        this.field29 = this.field33;
        this.field30 = 0;
        if (arg0 < 0) {
            this.field31 = 0;
        }
    }

    @OriginalMember(owner = "AGTHLVTI", name = "b", descriptor = "(B)V")
    public void method10(byte arg0) {
        byte[] var2 = new byte[this.field29 * this.field28];
        if (arg0 != 5) {
            return;
        }
        boolean var3 = false;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field29; var5++) {
            for (int var6 = this.field28 - 1; var6 >= 0; var6--) {
                var2[var4++] = this.field26[this.field28 * var5 + var6];
            }
        }
        this.field26 = var2;
        this.field30 = this.field32 - this.field28 - this.field30;
    }

    @OriginalMember(owner = "AGTHLVTI", name = "d", descriptor = "(I)V")
    public void method11(int arg0) {
        byte[] var2 = new byte[this.field29 * this.field28];
        int var3 = 0;
        if (arg0 >= 0) {
            return;
        }
        for (int var4 = this.field29 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field28; var5++) {
                var2[var3++] = this.field26[this.field28 * var4 + var5];
            }
        }
        this.field26 = var2;
        this.field31 = this.field33 - this.field29 - this.field31;
    }

    @OriginalMember(owner = "AGTHLVTI", name = "a", descriptor = "(IIII)V")
    public void method12(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            return;
        }
        for (int var5 = 0; var5 < this.field27.length; var5++) {
            int var6 = this.field27[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field27[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field27[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field27[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "AGTHLVTI", name = "a", descriptor = "(III)V")
    public void method13(int arg0, int arg1, int arg2) {
        int var4 = this.field30 + arg0;
        int var5 = this.field31 + arg1;
        int var6 = class11.field649 * var5 + var4;
        int var7 = 0;
        int var8 = this.field29;
        int var9 = this.field28;
        int var10 = class11.field649 - var9;
        int var11 = 0;
        if (arg2 != 4) {
            this.field21 = -149;
        }
        if (var5 < class11.field651) {
            int var12 = class11.field651 - var5;
            var8 -= var12;
            var5 = class11.field651;
            var7 += var9 * var12;
            var6 += class11.field649 * var12;
        }
        if (var5 + var8 > class11.field652) {
            var8 -= var5 + var8 - class11.field652;
        }
        if (var4 < class11.field653) {
            int var13 = class11.field653 - var4;
            var9 -= var13;
            var4 = class11.field653;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class11.field654) {
            int var14 = var4 + var9 - class11.field654;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method14(this.field27, var9, this.field26, -925, var10, var7, var11, var6, class11.field648, var8);
        }
    }

    @OriginalMember(owner = "AGTHLVTI", name = "a", descriptor = "([II[BIIIII[II)V")
    private void method14(int[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        int var11 = -(arg1 >> 2);
        int var12 = -(arg1 & 0x3);
        while (arg3 >= 0) {
            for (int var21 = 1; var21 > 0; var21++) {
            }
        }
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg2[arg5++];
                if (var17 == 0) {
                    arg7++;
                } else {
                    arg8[arg7++] = arg0[var17 & 0xFF];
                }
                byte var18 = arg2[arg5++];
                if (var18 == 0) {
                    arg7++;
                } else {
                    arg8[arg7++] = arg0[var18 & 0xFF];
                }
                byte var19 = arg2[arg5++];
                if (var19 == 0) {
                    arg7++;
                } else {
                    arg8[arg7++] = arg0[var19 & 0xFF];
                }
                byte var20 = arg2[arg5++];
                if (var20 == 0) {
                    arg7++;
                } else {
                    arg8[arg7++] = arg0[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg2[arg5++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    arg8[arg7++] = arg0[var16 & 0xFF];
                }
            }
            arg7 += arg4;
            arg5 += arg6;
        }
    }
}
