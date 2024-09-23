import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PQKEJITK")
public class class47 extends class62 {

    @OriginalMember(owner = "PQKEJITK", name = "y", descriptor = "Z")
    private boolean field1264 = false;

    @OriginalMember(owner = "PQKEJITK", name = "z", descriptor = "I")
    private int field1265 = -24571;

    @OriginalMember(owner = "PQKEJITK", name = "H", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "PQKEJITK", name = "I", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "PQKEJITK", name = "C", descriptor = "[I")
    public int[] field1268;

    @OriginalMember(owner = "PQKEJITK", name = "F", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "PQKEJITK", name = "G", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "PQKEJITK", name = "D", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "PQKEJITK", name = "E", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "PQKEJITK", name = "B", descriptor = "[B")
    public byte[] field1267;

    @OriginalMember(owner = "PQKEJITK", name = "x", descriptor = "Z")
    private static boolean field1263 = true;

    @OriginalMember(owner = "PQKEJITK", name = "A", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "PQKEJITK", name = "<init>", descriptor = "(LFNOQZAYQ;Ljava/lang/String;I)V")
    public class47(class14 arg0, String arg1, int arg2) {
        class11 var4 = new class11(arg0.method246(arg1 + ".dat", null), field1263);
        class11 var5 = new class11(arg0.method246("index.dat", null), field1263);
        var5.field643 = var4.method191();
        this.field1273 = var5.method191();
        this.field1274 = var5.method191();
        int var6 = var5.method189();
        this.field1268 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1268[var7 + 1] = var5.method193();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field643 += 2;
            var4.field643 += var5.method191() * var5.method191();
            var5.field643++;
        }
        this.field1271 = var5.method189();
        this.field1272 = var5.method189();
        this.field1269 = var5.method191();
        this.field1270 = var5.method191();
        int var9 = var5.method189();
        int var10 = this.field1270 * this.field1269;
        this.field1267 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1267[var11] = var4.method190();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1269; var12++) {
                for (int var13 = 0; var13 < this.field1270; var13++) {
                    this.field1267[this.field1269 * var13 + var12] = var4.method190();
                }
            }
        }
    }

    @OriginalMember(owner = "PQKEJITK", name = "a", descriptor = "(Z)V")
    public void method385(boolean arg0) {
        if (!arg0) {
            return;
        }
        this.field1273 /= 2;
        this.field1274 /= 2;
        byte[] var2 = new byte[this.field1274 * this.field1273];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1270; var4++) {
            for (int var5 = 0; var5 < this.field1269; var5++) {
                var2[(this.field1271 + var5 >> 1) + (this.field1272 + var4 >> 1) * this.field1273] = this.field1267[var3++];
            }
        }
        this.field1267 = var2;
        this.field1269 = this.field1273;
        this.field1270 = this.field1274;
        this.field1271 = 0;
        this.field1272 = 0;
    }

    @OriginalMember(owner = "PQKEJITK", name = "b", descriptor = "(B)V")
    public void method386(byte arg0) {
        if (arg0 != -59 || this.field1273 == this.field1269 && this.field1274 == this.field1270) {
            return;
        }
        byte[] var2 = new byte[this.field1274 * this.field1273];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1270; var4++) {
            for (int var5 = 0; var5 < this.field1269; var5++) {
                var2[(this.field1272 + var4) * this.field1273 + this.field1271 + var5] = this.field1267[var3++];
            }
        }
        this.field1267 = var2;
        this.field1269 = this.field1273;
        this.field1270 = this.field1274;
        this.field1271 = 0;
        this.field1272 = 0;
    }

    @OriginalMember(owner = "PQKEJITK", name = "b", descriptor = "(I)V")
    public void method387(int arg0) {
        byte[] var2 = new byte[this.field1270 * this.field1269];
        int var3 = 36 / arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1270; var5++) {
            for (int var6 = this.field1269 - 1; var6 >= 0; var6--) {
                var2[var4++] = this.field1267[this.field1269 * var5 + var6];
            }
        }
        this.field1267 = var2;
        this.field1271 = this.field1273 - this.field1269 - this.field1271;
    }

    @OriginalMember(owner = "PQKEJITK", name = "c", descriptor = "(B)V")
    public void method388(byte arg0) {
        byte[] var2 = new byte[this.field1270 * this.field1269];
        int var3 = 0;
        for (int var4 = this.field1270 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1269; var5++) {
                var2[var3++] = this.field1267[this.field1269 * var4 + var5];
            }
        }
        this.field1267 = var2;
        if (arg0 != 118) {
            this.field1266 = 193;
        }
        this.field1272 = this.field1274 - this.field1270 - this.field1272;
    }

    @OriginalMember(owner = "PQKEJITK", name = "a", descriptor = "(IIII)V")
    public void method389(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1268.length; var5++) {
            int var6 = this.field1268[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1268[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1268[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1268[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3 < 1 || arg3 > 1) {
            ;
        }
    }

    @OriginalMember(owner = "PQKEJITK", name = "a", descriptor = "(BII)V")
    public void method390(byte arg0, int arg1, int arg2) {
        if (arg0 != 50) {
            return;
        }
        int var4 = this.field1271 + arg1;
        int var5 = this.field1272 + arg2;
        int var6 = class62.field1529 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1270;
        int var9 = this.field1269;
        int var10 = class62.field1529 - var9;
        int var11 = 0;
        if (var5 < class62.field1531) {
            int var12 = class62.field1531 - var5;
            var8 -= var12;
            var5 = class62.field1531;
            var7 += var9 * var12;
            var6 += class62.field1529 * var12;
        }
        if (var5 + var8 > class62.field1532) {
            var8 -= var5 + var8 - class62.field1532;
        }
        if (var4 < class62.field1533) {
            int var13 = class62.field1533 - var4;
            var9 -= var13;
            var4 = class62.field1533;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class62.field1534) {
            int var14 = var4 + var9 - class62.field1534;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method391(var10, this.field1268, var6, var9, var8, class62.field1528, var7, this.field1267, var11, (byte) 9);
        }
    }

    @OriginalMember(owner = "PQKEJITK", name = "a", descriptor = "(I[IIII[II[BIB)V")
    private void method391(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, byte[] arg7, int arg8, byte arg9) {
        int var11 = -(arg3 >> 2);
        if (arg9 == 9) {
            boolean var12 = false;
        } else {
            this.field1264 = !this.field1264;
        }
        int var13 = -(arg3 & 0x3);
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg7[arg6++];
                if (var18 == 0) {
                    arg2++;
                } else {
                    arg5[arg2++] = arg1[var18 & 0xFF];
                }
                byte var19 = arg7[arg6++];
                if (var19 == 0) {
                    arg2++;
                } else {
                    arg5[arg2++] = arg1[var19 & 0xFF];
                }
                byte var20 = arg7[arg6++];
                if (var20 == 0) {
                    arg2++;
                } else {
                    arg5[arg2++] = arg1[var20 & 0xFF];
                }
                byte var21 = arg7[arg6++];
                if (var21 == 0) {
                    arg2++;
                } else {
                    arg5[arg2++] = arg1[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg7[arg6++];
                if (var17 == 0) {
                    arg2++;
                } else {
                    arg5[arg2++] = arg1[var17 & 0xFF];
                }
            }
            arg2 += arg0;
            arg6 += arg8;
        }
    }
}
