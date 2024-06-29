import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RAOZRSKX")
public class class44 extends class8 {

    @OriginalMember(owner = "client!RAOZRSKX", name = "w", descriptor = "B")
    private byte field1229 = -111;

    @OriginalMember(owner = "client!RAOZRSKX", name = "x", descriptor = "I")
    private int field1230 = 3119;

    @OriginalMember(owner = "client!RAOZRSKX", name = "y", descriptor = "I")
    private int field1231 = -347;

    @OriginalMember(owner = "client!RAOZRSKX", name = "z", descriptor = "Z")
    private boolean field1232 = false;

    @OriginalMember(owner = "client!RAOZRSKX", name = "G", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!RAOZRSKX", name = "H", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client!RAOZRSKX", name = "B", descriptor = "[I")
    public int[] field1234;

    @OriginalMember(owner = "client!RAOZRSKX", name = "E", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!RAOZRSKX", name = "F", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!RAOZRSKX", name = "C", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!RAOZRSKX", name = "D", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!RAOZRSKX", name = "A", descriptor = "[B")
    public byte[] field1233;

    @OriginalMember(owner = "client!RAOZRSKX", name = "<init>", descriptor = "(LVSQMPWOM;Ljava/lang/String;I)V")
    public class44(class59 arg0, String arg1, int arg2) {
        class3 var4 = new class3(arg0.method526(arg1 + ".dat", null), -990);
        class3 var5 = new class3(arg0.method526("index.dat", null), -990);
        var5.field50 = var4.method56();
        this.field1239 = var5.method56();
        this.field1240 = var5.method56();
        int var6 = var5.method54();
        this.field1234 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1234[var7 + 1] = var5.method58();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field50 += 2;
            var4.field50 += var5.method56() * var5.method56();
            var5.field50++;
        }
        this.field1237 = var5.method54();
        this.field1238 = var5.method54();
        this.field1235 = var5.method56();
        this.field1236 = var5.method56();
        int var9 = var5.method54();
        int var10 = this.field1236 * this.field1235;
        this.field1233 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1233[var11] = var4.method55();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1235; var12++) {
                for (int var13 = 0; var13 < this.field1236; var13++) {
                    this.field1233[this.field1235 * var13 + var12] = var4.method55();
                }
            }
        }
    }

    @OriginalMember(owner = "client!RAOZRSKX", name = "b", descriptor = "(I)V")
    public void method441(int arg0) {
        this.field1239 /= 2;
        this.field1240 /= 2;
        byte[] var2 = new byte[this.field1240 * this.field1239];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1236; var4++) {
            for (int var6 = 0; var6 < this.field1235; var6++) {
                var2[(this.field1237 + var6 >> 1) + (this.field1238 + var4 >> 1) * this.field1239] = this.field1233[var3++];
            }
        }
        this.field1233 = var2;
        this.field1235 = this.field1239;
        this.field1236 = this.field1240;
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1237 = 0;
        this.field1238 = 0;
    }

    @OriginalMember(owner = "client!RAOZRSKX", name = "a", descriptor = "(B)V")
    public void method442(byte arg0) {
        if (this.field1239 == this.field1235 && this.field1240 == this.field1236) {
            return;
        }
        byte[] var2 = new byte[this.field1240 * this.field1239];
        if (this.field1229 != arg0) {
            this.field1232 = !this.field1232;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1236; var4++) {
            for (int var5 = 0; var5 < this.field1235; var5++) {
                var2[(this.field1238 + var4) * this.field1239 + this.field1237 + var5] = this.field1233[var3++];
            }
        }
        this.field1233 = var2;
        this.field1235 = this.field1239;
        this.field1236 = this.field1240;
        this.field1237 = 0;
        this.field1238 = 0;
    }

    @OriginalMember(owner = "client!RAOZRSKX", name = "c", descriptor = "(I)V")
    public void method443(int arg0) {
        byte[] var2 = new byte[this.field1236 * this.field1235];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1236; var4++) {
            for (int var6 = this.field1235 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field1233[this.field1235 * var4 + var6];
            }
        }
        int var5 = 72 / arg0;
        this.field1233 = var2;
        this.field1237 = this.field1239 - this.field1235 - this.field1237;
    }

    @OriginalMember(owner = "client!RAOZRSKX", name = "b", descriptor = "(B)V")
    public void method444(byte arg0) {
        byte[] var2 = new byte[this.field1236 * this.field1235];
        if (arg0 != -90) {
            this.field1232 = !this.field1232;
        }
        int var3 = 0;
        for (int var4 = this.field1236 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1235; var5++) {
                var2[var3++] = this.field1233[this.field1235 * var4 + var5];
            }
        }
        this.field1233 = var2;
        this.field1238 = this.field1240 - this.field1236 - this.field1238;
    }

    @OriginalMember(owner = "client!RAOZRSKX", name = "a", descriptor = "(IIII)V")
    public void method445(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1234.length; var5++) {
            int var7 = this.field1234[var5] >> 16 & 0xFF;
            int var8 = arg0 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1234[var5] >> 8 & 0xFF;
            int var10 = arg1 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1234[var5] & 0xFF;
            int var12 = arg3 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1234[var5] = (var8 << 16) + (var10 << 8) + var12;
        }
        int var6 = 12 / arg2;
    }

    @OriginalMember(owner = "client!RAOZRSKX", name = "a", descriptor = "(IBI)V")
    public void method446(int arg0, byte arg1, int arg2) {
        int var4 = this.field1237 + arg2;
        int var5 = this.field1238 + arg0;
        if (arg1 != 3) {
            return;
        }
        int var6 = class8.field152 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1236;
        int var9 = this.field1235;
        int var10 = class8.field152 - var9;
        int var11 = 0;
        if (var5 < class8.field154) {
            int var12 = class8.field154 - var5;
            var8 -= var12;
            var5 = class8.field154;
            var7 += var9 * var12;
            var6 += class8.field152 * var12;
        }
        if (var5 + var8 > class8.field155) {
            var8 -= var5 + var8 - class8.field155;
        }
        if (var4 < class8.field156) {
            int var13 = class8.field156 - var4;
            var9 -= var13;
            var4 = class8.field156;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class8.field157) {
            int var14 = var4 + var9 - class8.field157;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method447(var8, class8.field151, var9, this.field1233, this.field1234, var11, var10, var6, -494, var7);
        }
    }

    @OriginalMember(owner = "client!RAOZRSKX", name = "a", descriptor = "(I[II[B[IIIIII)V")
    private void method447(int arg0, int[] arg1, int arg2, byte[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg2 >> 2);
        int var12 = -(arg2 & 0x3);
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg3[arg9++];
                if (var17 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var17 & 0xFF];
                }
                byte var18 = arg3[arg9++];
                if (var18 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg3[arg9++];
                if (var19 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg3[arg9++];
                if (var20 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg3[arg9++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var16 & 0xFF];
                }
            }
            arg7 += arg6;
            arg9 += arg5;
        }
        if (arg8 >= 0) {
            this.field1231 = -394;
        }
    }
}
