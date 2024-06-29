import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BNGXLHWA")
public class class5 extends class15 {

    @OriginalMember(owner = "client!BNGXLHWA", name = "v", descriptor = "I")
    private int field77 = 8868;

    @OriginalMember(owner = "client!BNGXLHWA", name = "w", descriptor = "I")
    private int field78 = 3;

    @OriginalMember(owner = "client!BNGXLHWA", name = "x", descriptor = "Z")
    private boolean field79 = false;

    @OriginalMember(owner = "client!BNGXLHWA", name = "E", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!BNGXLHWA", name = "F", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!BNGXLHWA", name = "z", descriptor = "[I")
    public int[] field81;

    @OriginalMember(owner = "client!BNGXLHWA", name = "C", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "client!BNGXLHWA", name = "D", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!BNGXLHWA", name = "A", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!BNGXLHWA", name = "B", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!BNGXLHWA", name = "y", descriptor = "[B")
    public byte[] field80;

    @OriginalMember(owner = "client!BNGXLHWA", name = "<init>", descriptor = "(LIEMHZJLX;Ljava/lang/String;I)V")
    public class5(class23 arg0, String arg1, int arg2) {
        class38 var4 = new class38(0, arg0.method242(arg1 + ".dat", null));
        class38 var5 = new class38(0, arg0.method242("index.dat", null));
        var5.field1161 = var4.method359();
        this.field86 = var5.method359();
        this.field87 = var5.method359();
        int var6 = var5.method357();
        this.field81 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field81[var7 + 1] = var5.method361();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1161 += 2;
            var4.field1161 += var5.method359() * var5.method359();
            var5.field1161++;
        }
        this.field84 = var5.method357();
        this.field85 = var5.method357();
        this.field82 = var5.method359();
        this.field83 = var5.method359();
        int var9 = var5.method357();
        int var10 = this.field83 * this.field82;
        this.field80 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field80[var11] = var4.method358();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field82; var12++) {
                    for (int var13 = 0; var13 < this.field83; var13++) {
                        this.field80[this.field82 * var13 + var12] = var4.method358();
                    }
                }
            }
            if (class66.field1692) {
            }
        }
    }

    @OriginalMember(owner = "client!BNGXLHWA", name = "b", descriptor = "(I)V")
    public void method33(int arg0) {
        this.field86 /= 2;
        this.field87 /= 2;
        if (arg0 != 0) {
            this.field78 = -142;
        }
        byte[] var2 = new byte[this.field87 * this.field86];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field83; var4++) {
            for (int var5 = 0; var5 < this.field82; var5++) {
                var2[(this.field84 + var5 >> 1) + (this.field85 + var4 >> 1) * this.field86] = this.field80[var3++];
            }
        }
        this.field80 = var2;
        this.field82 = this.field86;
        this.field83 = this.field87;
        this.field84 = 0;
        this.field85 = 0;
    }

    @OriginalMember(owner = "client!BNGXLHWA", name = "c", descriptor = "(I)V")
    public void method34(int arg0) {
        if (arg0 != 1038 || this.field86 == this.field82 && this.field87 == this.field83) {
            return;
        }
        byte[] var2 = new byte[this.field87 * this.field86];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field83; var4++) {
            for (int var5 = 0; var5 < this.field82; var5++) {
                var2[(this.field85 + var4) * this.field86 + this.field84 + var5] = this.field80[var3++];
            }
        }
        this.field80 = var2;
        this.field82 = this.field86;
        this.field83 = this.field87;
        this.field84 = 0;
        this.field85 = 0;
    }

    @OriginalMember(owner = "client!BNGXLHWA", name = "b", descriptor = "(B)V")
    public void method35(byte arg0) {
        byte[] var2 = new byte[this.field83 * this.field82];
        if (arg0 != -18) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        for (int var5 = 0; var5 < this.field83; var5++) {
            for (int var6 = this.field82 - 1; var6 >= 0; var6--) {
                var2[var4++] = this.field80[this.field82 * var5 + var6];
            }
        }
        this.field80 = var2;
        this.field84 = this.field86 - this.field82 - this.field84;
    }

    @OriginalMember(owner = "client!BNGXLHWA", name = "a", descriptor = "(Z)V")
    public void method36(boolean arg0) {
        byte[] var2 = new byte[this.field83 * this.field82];
        int var3 = 0;
        for (int var4 = this.field83 - 1; var4 >= 0; var4--) {
            for (int var6 = 0; var6 < this.field82; var6++) {
                var2[var3++] = this.field80[this.field82 * var4 + var6];
            }
        }
        this.field80 = var2;
        this.field85 = this.field87 - this.field83 - this.field85;
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "client!BNGXLHWA", name = "a", descriptor = "(BIII)V")
    public void method37(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 7) {
            this.field79 = !this.field79;
        }
        for (int var5 = 0; var5 < this.field81.length; var5++) {
            int var6 = this.field81[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field81[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field81[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field81[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "client!BNGXLHWA", name = "a", descriptor = "(III)V")
    public void method38(int arg0, int arg1, int arg2) {
        int var4 = this.field84 + arg1;
        int var5 = this.field85 + arg2;
        int var6 = class15.field723 * var5 + var4;
        int var7 = 0;
        int var8 = this.field83;
        int var9 = this.field82;
        int var10 = class15.field723 - var9;
        int var11 = 0;
        if (var5 < class15.field725) {
            int var12 = class15.field725 - var5;
            var8 -= var12;
            var5 = class15.field725;
            var7 += var9 * var12;
            var6 += class15.field723 * var12;
        }
        if (var5 + var8 > class15.field726) {
            var8 -= var5 + var8 - class15.field726;
        }
        if (var4 < class15.field727) {
            int var13 = class15.field727 - var4;
            var9 -= var13;
            var4 = class15.field727;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class15.field728) {
            int var14 = var4 + var9 - class15.field728;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method39(var8, class15.field722, this.field81, 6, var9, var6, var7, this.field80, var11, var10);
            if (arg0 != -23827) {
                this.field79 = !this.field79;
            }
        }
    }

    @OriginalMember(owner = "client!BNGXLHWA", name = "a", descriptor = "(I[I[IIIII[BII)V")
    private void method39(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        int var11 = -(arg4 >> 2);
        int var12 = -(arg4 & 0x3);
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg7[arg6++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg7[arg6++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg7[arg6++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg7[arg6++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg2[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg7[arg6++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg2[var16 & 0xFF];
                }
            }
            arg5 += arg9;
            arg6 += arg8;
        }
        if (arg3 == 6) {
            ;
        }
    }
}
