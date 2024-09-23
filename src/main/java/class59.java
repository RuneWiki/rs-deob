import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TOROBAKX")
public class class59 extends class1 {

    @OriginalMember(owner = "TOROBAKX", name = "D", descriptor = "Z")
    private boolean field1471 = true;

    @OriginalMember(owner = "TOROBAKX", name = "E", descriptor = "B")
    private byte field1472 = 5;

    @OriginalMember(owner = "TOROBAKX", name = "F", descriptor = "Z")
    private boolean field1473 = false;

    @OriginalMember(owner = "TOROBAKX", name = "M", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "TOROBAKX", name = "N", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "TOROBAKX", name = "H", descriptor = "[I")
    public int[] field1475;

    @OriginalMember(owner = "TOROBAKX", name = "K", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "TOROBAKX", name = "L", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "TOROBAKX", name = "I", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "TOROBAKX", name = "J", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "TOROBAKX", name = "G", descriptor = "[B")
    public byte[] field1474;

    @OriginalMember(owner = "TOROBAKX", name = "C", descriptor = "I")
    private static int field1470 = 8;

    @OriginalMember(owner = "TOROBAKX", name = "<init>", descriptor = "(LFIGUVTWB;Ljava/lang/String;I)V")
    public class59(class15 arg0, String arg1, int arg2) {
        class33 var4 = new class33(field1470, arg0.method209(arg1 + ".dat", null));
        class33 var5 = new class33(field1470, arg0.method209("index.dat", null));
        var5.field954 = var4.method294();
        this.field1480 = var5.method294();
        this.field1481 = var5.method294();
        int var6 = var5.method292();
        this.field1475 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1475[var7 + 1] = var5.method296();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field954 += 2;
            var4.field954 += var5.method294() * var5.method294();
            var5.field954++;
        }
        this.field1478 = var5.method292();
        this.field1479 = var5.method292();
        this.field1476 = var5.method294();
        this.field1477 = var5.method294();
        int var9 = var5.method292();
        int var10 = this.field1477 * this.field1476;
        this.field1474 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1474[var11] = var4.method293();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1476; var12++) {
                for (int var13 = 0; var13 < this.field1477; var13++) {
                    this.field1474[this.field1476 * var13 + var12] = var4.method293();
                }
            }
        }
    }

    @OriginalMember(owner = "TOROBAKX", name = "b", descriptor = "(I)V")
    public void method495(int arg0) {
        this.field1480 /= 2;
        this.field1481 /= 2;
        byte[] var2 = new byte[this.field1481 * this.field1480];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1477; var4++) {
            for (int var5 = 0; var5 < this.field1476; var5++) {
                var2[(this.field1478 + var5 >> 1) + (this.field1479 + var4 >> 1) * this.field1480] = this.field1474[var3++];
            }
        }
        this.field1474 = var2;
        this.field1476 = this.field1480;
        if (arg0 == 0) {
            this.field1477 = this.field1481;
            this.field1478 = 0;
            this.field1479 = 0;
        }
    }

    @OriginalMember(owner = "TOROBAKX", name = "c", descriptor = "(I)V")
    public void method496(int arg0) {
        if (this.field1480 == this.field1476 && this.field1481 == this.field1477) {
            return;
        }
        byte[] var2 = new byte[this.field1481 * this.field1480];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1477; var4++) {
            for (int var5 = 0; var5 < this.field1476; var5++) {
                var2[(this.field1479 + var4) * this.field1480 + this.field1478 + var5] = this.field1474[var3++];
            }
        }
        this.field1474 = var2;
        this.field1476 = this.field1480;
        this.field1477 = this.field1481;
        this.field1478 = 0;
        if (arg0 == 44765) {
            this.field1479 = 0;
        }
    }

    @OriginalMember(owner = "TOROBAKX", name = "d", descriptor = "(I)V")
    public void method497(int arg0) {
        byte[] var2 = new byte[this.field1477 * this.field1476];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1477; var4++) {
            for (int var5 = this.field1476 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1474[this.field1476 * var4 + var5];
            }
        }
        this.field1474 = var2;
        if (arg0 < 5 || arg0 > 5) {
            this.field1471 = !this.field1471;
        }
        this.field1478 = this.field1480 - this.field1476 - this.field1478;
    }

    @OriginalMember(owner = "TOROBAKX", name = "e", descriptor = "(I)V")
    public void method498(int arg0) {
        byte[] var2 = new byte[this.field1477 * this.field1476];
        int var3 = 0;
        for (int var4 = this.field1477 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1476; var5++) {
                var2[var3++] = this.field1474[this.field1476 * var4 + var5];
            }
        }
        if (arg0 != 0) {
            this.field1471 = !this.field1471;
        }
        this.field1474 = var2;
        this.field1479 = this.field1481 - this.field1477 - this.field1479;
    }

    @OriginalMember(owner = "TOROBAKX", name = "a", descriptor = "(IIZI)V")
    public void method499(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field1471 = !this.field1471;
        }
        for (int var5 = 0; var5 < this.field1475.length; var5++) {
            int var6 = this.field1475[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1475[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1475[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1475[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "TOROBAKX", name = "a", descriptor = "(III)V")
    public void method500(int arg0, int arg1, int arg2) {
        int var4 = this.field1478 + arg0;
        int var5 = this.field1479 + arg2;
        int var6 = 1 / arg1;
        int var7 = class1.field10 * var5 + var4;
        int var8 = 0;
        int var9 = this.field1477;
        int var10 = this.field1476;
        int var11 = class1.field10 - var10;
        int var12 = 0;
        if (var5 < class1.field12) {
            int var13 = class1.field12 - var5;
            var9 -= var13;
            var5 = class1.field12;
            var8 += var10 * var13;
            var7 += class1.field10 * var13;
        }
        if (var5 + var9 > class1.field13) {
            var9 -= var5 + var9 - class1.field13;
        }
        if (var4 < class1.field14) {
            int var14 = class1.field14 - var4;
            var10 -= var14;
            var4 = class1.field14;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class1.field15) {
            int var15 = var4 + var10 - class1.field15;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method501(var10, var7, var8, var12, this.field1475, var9, class1.field9, this.field1474, (byte) -45, var11);
        }
    }

    @OriginalMember(owner = "TOROBAKX", name = "a", descriptor = "(IIII[II[I[BBI)V")
    private void method501(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, byte[] arg7, byte arg8, int arg9) {
        int var11 = -(arg0 >> 2);
        int var12 = -(arg0 & 0x3);
        if (arg8 != -45) {
            this.field1473 = !this.field1473;
        }
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg7[arg2++];
                if (var17 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg4[var17 & 0xFF];
                }
                byte var18 = arg7[arg2++];
                if (var18 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg7[arg2++];
                if (var19 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg7[arg2++];
                if (var20 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg4[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg7[arg2++];
                if (var16 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg4[var16 & 0xFF];
                }
            }
            arg1 += arg9;
            arg2 += arg3;
        }
    }
}
