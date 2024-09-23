import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TAIXVIBM")
public class class47 extends class29 {

    @OriginalMember(owner = "TAIXVIBM", name = "A", descriptor = "I")
    private int field1428 = 3;

    @OriginalMember(owner = "TAIXVIBM", name = "B", descriptor = "Z")
    private boolean field1429 = false;

    @OriginalMember(owner = "TAIXVIBM", name = "C", descriptor = "Z")
    private boolean field1430 = true;

    @OriginalMember(owner = "TAIXVIBM", name = "D", descriptor = "I")
    private int field1431 = 3;

    @OriginalMember(owner = "TAIXVIBM", name = "K", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "TAIXVIBM", name = "L", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "TAIXVIBM", name = "F", descriptor = "[I")
    public int[] field1433;

    @OriginalMember(owner = "TAIXVIBM", name = "I", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "TAIXVIBM", name = "J", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "TAIXVIBM", name = "G", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "TAIXVIBM", name = "H", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "TAIXVIBM", name = "E", descriptor = "[B")
    public byte[] field1432;

    @OriginalMember(owner = "TAIXVIBM", name = "z", descriptor = "I")
    private static int field1427 = -302;

    @OriginalMember(owner = "TAIXVIBM", name = "<init>", descriptor = "(LLYZBHNJP;Ljava/lang/String;I)V")
    public class47(class31 arg0, String arg1, int arg2) {
        class69 var4 = new class69(arg0.method290(arg1 + ".dat", null), field1427);
        class69 var5 = new class69(arg0.method290("index.dat", null), field1427);
        var5.field1700 = var4.method549();
        this.field1438 = var5.method549();
        this.field1439 = var5.method549();
        int var6 = var5.method547();
        this.field1433 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1433[var7 + 1] = var5.method551();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1700 += 2;
            var4.field1700 += var5.method549() * var5.method549();
            var5.field1700++;
        }
        this.field1436 = var5.method547();
        this.field1437 = var5.method547();
        this.field1434 = var5.method549();
        this.field1435 = var5.method549();
        int var9 = var5.method547();
        int var10 = this.field1435 * this.field1434;
        this.field1432 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1432[var11] = var4.method548();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1434; var12++) {
                for (int var13 = 0; var13 < this.field1435; var13++) {
                    this.field1432[this.field1434 * var13 + var12] = var4.method548();
                }
            }
        }
    }

    @OriginalMember(owner = "TAIXVIBM", name = "b", descriptor = "(I)V")
    public void method423(int arg0) {
        this.field1438 /= 2;
        this.field1439 /= 2;
        byte[] var2 = new byte[this.field1439 * this.field1438];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1435; var4++) {
            for (int var5 = 0; var5 < this.field1434; var5++) {
                var2[(this.field1436 + var5 >> 1) + (this.field1437 + var4 >> 1) * this.field1438] = this.field1432[var3++];
            }
        }
        this.field1432 = var2;
        this.field1434 = this.field1438;
        this.field1435 = this.field1439;
        this.field1436 = 0;
        this.field1437 = 0;
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "TAIXVIBM", name = "c", descriptor = "(I)V")
    public void method424(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1438 == this.field1434 && this.field1439 == this.field1435) {
            return;
        }
        byte[] var3 = new byte[this.field1439 * this.field1438];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1435; var5++) {
            for (int var6 = 0; var6 < this.field1434; var6++) {
                var3[(this.field1437 + var5) * this.field1438 + this.field1436 + var6] = this.field1432[var4++];
            }
        }
        this.field1432 = var3;
        this.field1434 = this.field1438;
        this.field1435 = this.field1439;
        this.field1436 = 0;
        this.field1437 = 0;
    }

    @OriginalMember(owner = "TAIXVIBM", name = "d", descriptor = "(I)V")
    public void method425(int arg0) {
        byte[] var2 = new byte[this.field1435 * this.field1434];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1435; var4++) {
            for (int var5 = this.field1434 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1432[this.field1434 * var4 + var5];
            }
        }
        this.field1432 = var2;
        if (arg0 < 7 || arg0 > 7) {
            this.field1431 = 287;
        }
        this.field1436 = this.field1438 - this.field1434 - this.field1436;
    }

    @OriginalMember(owner = "TAIXVIBM", name = "a", descriptor = "(Z)V")
    public void method426(boolean arg0) {
        if (arg0) {
            return;
        }
        byte[] var2 = new byte[this.field1435 * this.field1434];
        int var3 = 0;
        for (int var4 = this.field1435 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1434; var5++) {
                var2[var3++] = this.field1432[this.field1434 * var4 + var5];
            }
        }
        this.field1432 = var2;
        this.field1437 = this.field1439 - this.field1435 - this.field1437;
    }

    @OriginalMember(owner = "TAIXVIBM", name = "a", descriptor = "(IZII)V")
    public void method427(int arg0, boolean arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1433.length; var5++) {
            int var6 = this.field1433[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1433[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1433[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1433[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "TAIXVIBM", name = "a", descriptor = "(III)V")
    public void method428(int arg0, int arg1, int arg2) {
        int var4 = this.field1436 + arg2;
        int var5 = this.field1437 + arg1;
        int var6 = class29.field1003 * var5 + var4;
        int var7 = 0;
        if (arg0 < this.field1428 || arg0 > this.field1428) {
            return;
        }
        int var8 = this.field1435;
        int var9 = this.field1434;
        int var10 = class29.field1003 - var9;
        int var11 = 0;
        if (var5 < class29.field1005) {
            int var12 = class29.field1005 - var5;
            var8 -= var12;
            var5 = class29.field1005;
            var7 += var9 * var12;
            var6 += class29.field1003 * var12;
        }
        if (var5 + var8 > class29.field1006) {
            var8 -= var5 + var8 - class29.field1006;
        }
        if (var4 < class29.field1007) {
            int var13 = class29.field1007 - var4;
            var9 -= var13;
            var4 = class29.field1007;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class29.field1008) {
            int var14 = var4 + var9 - class29.field1008;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method429(var6, class29.field1002, var11, (byte) 6, this.field1433, var10, var9, this.field1432, var7, var8);
        }
    }

    @OriginalMember(owner = "TAIXVIBM", name = "a", descriptor = "(I[IIB[III[BII)V")
    private void method429(int arg0, int[] arg1, int arg2, byte arg3, int[] arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        int var11 = -(arg6 >> 2);
        int var12 = -(arg6 & 0x3);
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg7[arg8++];
                if (var17 == 0) {
                    arg0++;
                } else {
                    arg1[arg0++] = arg4[var17 & 0xFF];
                }
                byte var18 = arg7[arg8++];
                if (var18 == 0) {
                    arg0++;
                } else {
                    arg1[arg0++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg7[arg8++];
                if (var19 == 0) {
                    arg0++;
                } else {
                    arg1[arg0++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg7[arg8++];
                if (var20 == 0) {
                    arg0++;
                } else {
                    arg1[arg0++] = arg4[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg7[arg8++];
                if (var16 == 0) {
                    arg0++;
                } else {
                    arg1[arg0++] = arg4[var16 & 0xFF];
                }
            }
            arg0 += arg5;
            arg8 += arg2;
        }
        if (arg3 == 6) {
            ;
        }
    }
}
