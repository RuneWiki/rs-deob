import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GLPEJJEY")
public class class19 extends class39 {

    @OriginalMember(owner = "GLPEJJEY", name = "w", descriptor = "Z")
    private boolean field885 = false;

    @OriginalMember(owner = "GLPEJJEY", name = "x", descriptor = "Z")
    private boolean field886 = false;

    @OriginalMember(owner = "GLPEJJEY", name = "y", descriptor = "Z")
    private boolean field887 = false;

    @OriginalMember(owner = "GLPEJJEY", name = "z", descriptor = "I")
    private int field888 = 432;

    @OriginalMember(owner = "GLPEJJEY", name = "A", descriptor = "I")
    private int field889 = -906;

    @OriginalMember(owner = "GLPEJJEY", name = "B", descriptor = "Z")
    private boolean field890 = true;

    @OriginalMember(owner = "GLPEJJEY", name = "C", descriptor = "I")
    private int field891 = -630;

    @OriginalMember(owner = "GLPEJJEY", name = "D", descriptor = "I")
    private int field892 = 23626;

    @OriginalMember(owner = "GLPEJJEY", name = "K", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "GLPEJJEY", name = "L", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "GLPEJJEY", name = "F", descriptor = "[I")
    public int[] field894;

    @OriginalMember(owner = "GLPEJJEY", name = "I", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "GLPEJJEY", name = "J", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "GLPEJJEY", name = "G", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "GLPEJJEY", name = "H", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "GLPEJJEY", name = "E", descriptor = "[B")
    public byte[] field893;

    @OriginalMember(owner = "GLPEJJEY", name = "<init>", descriptor = "(LSYUGXMZF;Ljava/lang/String;I)V")
    public class19(class55 arg0, String arg1, int arg2) {
        class30 var4 = new class30(arg0.method551(arg1 + ".dat", null), -982);
        class30 var5 = new class30(arg0.method551("index.dat", null), -982);
        var5.field1065 = var4.method351();
        this.field899 = var5.method351();
        this.field900 = var5.method351();
        int var6 = var5.method349();
        this.field894 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field894[var7 + 1] = var5.method353();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1065 += 2;
            var4.field1065 += var5.method351() * var5.method351();
            var5.field1065++;
        }
        this.field897 = var5.method349();
        this.field898 = var5.method349();
        this.field895 = var5.method351();
        this.field896 = var5.method351();
        int var9 = var5.method349();
        int var10 = this.field896 * this.field895;
        this.field893 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field893[var11] = var4.method350();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field895; var12++) {
                    for (int var13 = 0; var13 < this.field896; var13++) {
                        this.field893[this.field895 * var13 + var12] = var4.method350();
                    }
                }
            }
            if (class1.field4) {
            }
        }
    }

    @OriginalMember(owner = "GLPEJJEY", name = "a", descriptor = "(B)V")
    public void method314(byte arg0) {
        this.field899 /= 2;
        this.field900 /= 2;
        byte[] var2 = new byte[this.field900 * this.field899];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field896; var4++) {
            for (int var5 = 0; var5 < this.field895; var5++) {
                var2[(this.field897 + var5 >> 1) + (this.field898 + var4 >> 1) * this.field899] = this.field893[var3++];
            }
        }
        this.field893 = var2;
        this.field895 = this.field899;
        if (arg0 == 7) {
            this.field896 = this.field900;
            this.field897 = 0;
            this.field898 = 0;
        }
    }

    @OriginalMember(owner = "GLPEJJEY", name = "c", descriptor = "(I)V")
    public void method315(int arg0) {
        if (this.field899 == this.field895 && this.field900 == this.field896) {
            return;
        }
        byte[] var2 = new byte[this.field900 * this.field899];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field896; var4++) {
            for (int var5 = 0; var5 < this.field895; var5++) {
                var2[(this.field898 + var4) * this.field899 + this.field897 + var5] = this.field893[var3++];
            }
        }
        this.field893 = var2;
        this.field895 = this.field899;
        this.field896 = this.field900;
        if (arg0 >= 0) {
            this.field885 = !this.field885;
        }
        this.field897 = 0;
        this.field898 = 0;
    }

    @OriginalMember(owner = "GLPEJJEY", name = "a", descriptor = "(Z)V")
    public void method316(boolean arg0) {
        byte[] var2 = new byte[this.field896 * this.field895];
        int var3 = 0;
        if (arg0) {
            return;
        }
        for (int var4 = 0; var4 < this.field896; var4++) {
            for (int var5 = this.field895 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field893[this.field895 * var4 + var5];
            }
        }
        this.field893 = var2;
        this.field897 = this.field899 - this.field895 - this.field897;
    }

    @OriginalMember(owner = "GLPEJJEY", name = "d", descriptor = "(I)V")
    public void method317(int arg0) {
        byte[] var2 = new byte[this.field896 * this.field895];
        int var3 = 0;
        for (int var4 = this.field896 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field895; var5++) {
                var2[var3++] = this.field893[this.field895 * var4 + var5];
            }
        }
        this.field893 = var2;
        if (arg0 != 0) {
            this.field892 = 95;
        }
        this.field898 = this.field900 - this.field896 - this.field898;
    }

    @OriginalMember(owner = "GLPEJJEY", name = "a", descriptor = "(IIBI)V")
    public void method318(int arg0, int arg1, byte arg2, int arg3) {
        for (int var5 = 0; var5 < this.field894.length; var5++) {
            int var6 = this.field894[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field894[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field894[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field894[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg2 == -39) {
            ;
        }
    }

    @OriginalMember(owner = "GLPEJJEY", name = "a", descriptor = "(IIB)V")
    public void method319(int arg0, int arg1, byte arg2) {
        int var4 = this.field897 + arg1;
        int var5 = this.field898 + arg0;
        int var6 = class39.field1203 * var5 + var4;
        int var7 = 0;
        if (arg2 != 71) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = this.field896;
        int var10 = this.field895;
        int var11 = class39.field1203 - var10;
        int var12 = 0;
        if (var5 < class39.field1205) {
            int var13 = class39.field1205 - var5;
            var9 -= var13;
            var5 = class39.field1205;
            var7 += var10 * var13;
            var6 += class39.field1203 * var13;
        }
        if (var5 + var9 > class39.field1206) {
            var9 -= var5 + var9 - class39.field1206;
        }
        if (var4 < class39.field1207) {
            int var14 = class39.field1207 - var4;
            var10 -= var14;
            var4 = class39.field1207;
            var7 += var14;
            var6 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class39.field1208) {
            int var15 = var4 + var10 - class39.field1208;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method320(var7, class39.field1202, this.field894, var12, var9, var10, this.field893, var11, var6, false);
        }
    }

    @OriginalMember(owner = "GLPEJJEY", name = "a", descriptor = "(I[I[IIII[BIIZ)V")
    private void method320(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, boolean arg9) {
        int var11 = -(arg5 >> 2);
        int var12 = -(arg5 & 0x3);
        if (arg9) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg6[arg0++];
                if (var18 == 0) {
                    arg8++;
                } else {
                    arg1[arg8++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg6[arg0++];
                if (var19 == 0) {
                    arg8++;
                } else {
                    arg1[arg8++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg6[arg0++];
                if (var20 == 0) {
                    arg8++;
                } else {
                    arg1[arg8++] = arg2[var20 & 0xFF];
                }
                byte var21 = arg6[arg0++];
                if (var21 == 0) {
                    arg8++;
                } else {
                    arg1[arg8++] = arg2[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg6[arg0++];
                if (var17 == 0) {
                    arg8++;
                } else {
                    arg1[arg8++] = arg2[var17 & 0xFF];
                }
            }
            arg8 += arg7;
            arg0 += arg3;
        }
    }
}
