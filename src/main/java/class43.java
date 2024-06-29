import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NPZZPPRD")
public class class43 extends class26 {

    @OriginalMember(owner = "client!NPZZPPRD", name = "z", descriptor = "Z")
    private boolean field1244 = false;

    @OriginalMember(owner = "client!NPZZPPRD", name = "A", descriptor = "Z")
    private boolean field1245 = false;

    @OriginalMember(owner = "client!NPZZPPRD", name = "B", descriptor = "I")
    private int field1246 = 6;

    @OriginalMember(owner = "client!NPZZPPRD", name = "C", descriptor = "I")
    private int field1247 = -20671;

    @OriginalMember(owner = "client!NPZZPPRD", name = "J", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!NPZZPPRD", name = "K", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!NPZZPPRD", name = "E", descriptor = "[I")
    public int[] field1249;

    @OriginalMember(owner = "client!NPZZPPRD", name = "H", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!NPZZPPRD", name = "I", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!NPZZPPRD", name = "F", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!NPZZPPRD", name = "G", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!NPZZPPRD", name = "D", descriptor = "[B")
    public byte[] field1248;

    @OriginalMember(owner = "client!NPZZPPRD", name = "<init>", descriptor = "(LJUPFHAZZ;Ljava/lang/String;I)V")
    public class43(class32 arg0, String arg1, int arg2) {
        class59 var4 = new class59(859, arg0.method372(arg1 + ".dat", null));
        class59 var5 = new class59(859, arg0.method372("index.dat", null));
        var5.field1589 = var4.method531();
        this.field1254 = var5.method531();
        this.field1255 = var5.method531();
        int var6 = var5.method529();
        this.field1249 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1249[var7 + 1] = var5.method533();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1589 += 2;
            var4.field1589 += var5.method531() * var5.method531();
            var5.field1589++;
        }
        this.field1252 = var5.method529();
        this.field1253 = var5.method529();
        this.field1250 = var5.method531();
        this.field1251 = var5.method531();
        int var9 = var5.method529();
        int var10 = this.field1251 * this.field1250;
        this.field1248 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1248[var11] = var4.method530();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1250; var12++) {
                for (int var13 = 0; var13 < this.field1251; var13++) {
                    this.field1248[this.field1250 * var13 + var12] = var4.method530();
                }
            }
        }
    }

    @OriginalMember(owner = "client!NPZZPPRD", name = "a", descriptor = "(B)V")
    public void method416(byte arg0) {
        this.field1254 /= 2;
        this.field1255 /= 2;
        byte[] var2 = new byte[this.field1255 * this.field1254];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1251; var4++) {
            for (int var6 = 0; var6 < this.field1250; var6++) {
                var2[(this.field1252 + var6 >> 1) + (this.field1253 + var4 >> 1) * this.field1254] = this.field1248[var3++];
            }
        }
        this.field1248 = var2;
        this.field1250 = this.field1254;
        this.field1251 = this.field1255;
        this.field1252 = 0;
        if (arg0 == 3) {
            boolean var5 = false;
            this.field1253 = 0;
        }
    }

    @OriginalMember(owner = "client!NPZZPPRD", name = "c", descriptor = "(I)V")
    public void method417(int arg0) {
        if (this.field1254 == this.field1250 && this.field1255 == this.field1251) {
            return;
        }
        byte[] var2 = new byte[this.field1255 * this.field1254];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1251; var4++) {
            for (int var6 = 0; var6 < this.field1250; var6++) {
                var2[(this.field1253 + var4) * this.field1254 + this.field1252 + var6] = this.field1248[var3++];
            }
        }
        this.field1248 = var2;
        this.field1250 = this.field1254;
        this.field1251 = this.field1255;
        if (arg0 != -13293) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1252 = 0;
        this.field1253 = 0;
    }

    @OriginalMember(owner = "client!NPZZPPRD", name = "d", descriptor = "(I)V")
    public void method418(int arg0) {
        byte[] var2 = new byte[this.field1251 * this.field1250];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1251; var4++) {
            for (int var5 = this.field1250 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1248[this.field1250 * var4 + var5];
            }
        }
        this.field1248 = var2;
        if (arg0 > 0) {
            this.field1252 = this.field1254 - this.field1250 - this.field1252;
        }
    }

    @OriginalMember(owner = "client!NPZZPPRD", name = "e", descriptor = "(I)V")
    public void method419(int arg0) {
        byte[] var2 = new byte[this.field1251 * this.field1250];
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        for (int var5 = this.field1251 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field1250; var6++) {
                var2[var4++] = this.field1248[this.field1250 * var5 + var6];
            }
        }
        this.field1248 = var2;
        this.field1253 = this.field1255 - this.field1251 - this.field1253;
    }

    @OriginalMember(owner = "client!NPZZPPRD", name = "a", descriptor = "(IIII)V")
    public void method420(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1249.length; var5++) {
            int var6 = this.field1249[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1249[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1249[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1249[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3 != 0) {
            this.field1245 = !this.field1245;
        }
    }

    @OriginalMember(owner = "client!NPZZPPRD", name = "a", descriptor = "(III)V")
    public void method421(int arg0, int arg1, int arg2) {
        int var4 = this.field1252 + arg2;
        int var5 = this.field1253 + arg0;
        int var6 = class26.field918 * var5 + var4;
        int var7 = 0;
        if (this.field1247 != arg1) {
            this.field1245 = !this.field1245;
        }
        int var8 = this.field1251;
        int var9 = this.field1250;
        int var10 = class26.field918 - var9;
        int var11 = 0;
        if (var5 < class26.field920) {
            int var12 = class26.field920 - var5;
            var8 -= var12;
            var5 = class26.field920;
            var7 += var9 * var12;
            var6 += class26.field918 * var12;
        }
        if (var5 + var8 > class26.field921) {
            var8 -= var5 + var8 - class26.field921;
        }
        if (var4 < class26.field922) {
            int var13 = class26.field922 - var4;
            var9 -= var13;
            var4 = class26.field922;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class26.field923) {
            int var14 = var4 + var9 - class26.field923;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method422(var9, var11, this.field1248, class26.field917, var7, var8, -43221, var10, var6, this.field1249);
        }
    }

    @OriginalMember(owner = "client!NPZZPPRD", name = "a", descriptor = "(II[B[IIIIII[I)V")
    private void method422(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        int var11 = -(arg0 >> 2);
        int var12 = -(arg0 & 0x3);
        if (arg6 != -43221) {
            return;
        }
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg2[arg4++];
                if (var17 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg9[var17 & 0xFF];
                }
                byte var18 = arg2[arg4++];
                if (var18 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg9[var18 & 0xFF];
                }
                byte var19 = arg2[arg4++];
                if (var19 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg9[var19 & 0xFF];
                }
                byte var20 = arg2[arg4++];
                if (var20 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg9[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg2[arg4++];
                if (var16 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg9[var16 & 0xFF];
                }
            }
            arg8 += arg7;
            arg4 += arg1;
        }
    }
}
