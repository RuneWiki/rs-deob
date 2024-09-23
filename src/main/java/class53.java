import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SFAIBATY")
public class class53 extends class12 {

    @OriginalMember(owner = "SFAIBATY", name = "x", descriptor = "I")
    private int field1385 = -166;

    @OriginalMember(owner = "SFAIBATY", name = "y", descriptor = "I")
    private int field1386 = 6;

    @OriginalMember(owner = "SFAIBATY", name = "z", descriptor = "I")
    private int field1387 = -3665;

    @OriginalMember(owner = "SFAIBATY", name = "A", descriptor = "Z")
    private boolean field1388 = true;

    @OriginalMember(owner = "SFAIBATY", name = "B", descriptor = "I")
    private int field1389 = -71;

    @OriginalMember(owner = "SFAIBATY", name = "C", descriptor = "I")
    private int field1390 = 2;

    @OriginalMember(owner = "SFAIBATY", name = "D", descriptor = "Z")
    private boolean field1391 = true;

    @OriginalMember(owner = "SFAIBATY", name = "E", descriptor = "I")
    private int field1392 = -35541;

    @OriginalMember(owner = "SFAIBATY", name = "L", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "SFAIBATY", name = "M", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "SFAIBATY", name = "G", descriptor = "[I")
    public int[] field1394;

    @OriginalMember(owner = "SFAIBATY", name = "J", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "SFAIBATY", name = "K", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "SFAIBATY", name = "H", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "SFAIBATY", name = "I", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "SFAIBATY", name = "F", descriptor = "[B")
    public byte[] field1393;

    @OriginalMember(owner = "SFAIBATY", name = "<init>", descriptor = "(LTXPLZUUI;Ljava/lang/String;I)V")
    public class53(class60 arg0, String arg1, int arg2) {
        class43 var4 = new class43(arg0.method506(arg1 + ".dat", null), 0);
        class43 var5 = new class43(arg0.method506("index.dat", null), 0);
        var5.field1105 = var4.method332();
        this.field1399 = var5.method332();
        this.field1400 = var5.method332();
        int var6 = var5.method330();
        this.field1394 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1394[var7 + 1] = var5.method334();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1105 += 2;
            var4.field1105 += var5.method332() * var5.method332();
            var5.field1105++;
        }
        this.field1397 = var5.method330();
        this.field1398 = var5.method330();
        this.field1395 = var5.method332();
        this.field1396 = var5.method332();
        int var9 = var5.method330();
        int var10 = this.field1396 * this.field1395;
        this.field1393 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1393[var11] = var4.method331();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1395; var12++) {
                for (int var13 = 0; var13 < this.field1396; var13++) {
                    this.field1393[this.field1395 * var13 + var12] = var4.method331();
                }
            }
        }
    }

    @OriginalMember(owner = "SFAIBATY", name = "c", descriptor = "(I)V")
    public void method468(int arg0) {
        this.field1399 /= 2;
        if (arg0 < 0 || arg0 > 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1400 /= 2;
        byte[] var3 = new byte[this.field1400 * this.field1399];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1396; var5++) {
            for (int var6 = 0; var6 < this.field1395; var6++) {
                var3[(this.field1397 + var6 >> 1) + (this.field1398 + var5 >> 1) * this.field1399] = this.field1393[var4++];
            }
        }
        this.field1393 = var3;
        this.field1395 = this.field1399;
        this.field1396 = this.field1400;
        this.field1397 = 0;
        this.field1398 = 0;
    }

    @OriginalMember(owner = "SFAIBATY", name = "a", descriptor = "(Z)V")
    public void method469(boolean arg0) {
        if (arg0 || this.field1399 == this.field1395 && this.field1400 == this.field1396) {
            return;
        }
        byte[] var2 = new byte[this.field1400 * this.field1399];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1396; var4++) {
            for (int var5 = 0; var5 < this.field1395; var5++) {
                var2[(this.field1398 + var4) * this.field1399 + this.field1397 + var5] = this.field1393[var3++];
            }
        }
        this.field1393 = var2;
        this.field1395 = this.field1399;
        this.field1396 = this.field1400;
        this.field1397 = 0;
        this.field1398 = 0;
    }

    @OriginalMember(owner = "SFAIBATY", name = "d", descriptor = "(I)V")
    public void method470(int arg0) {
        byte[] var2 = new byte[this.field1396 * this.field1395];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1396; var4++) {
            for (int var5 = this.field1395 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1393[this.field1395 * var4 + var5];
            }
        }
        if (this.field1387 != arg0) {
            this.field1385 = 396;
        }
        this.field1393 = var2;
        this.field1397 = this.field1399 - this.field1395 - this.field1397;
    }

    @OriginalMember(owner = "SFAIBATY", name = "b", descriptor = "(Z)V")
    public void method471(boolean arg0) {
        byte[] var2 = new byte[this.field1396 * this.field1395];
        int var3 = 0;
        for (int var4 = this.field1396 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1395; var5++) {
                var2[var3++] = this.field1393[this.field1395 * var4 + var5];
            }
        }
        this.field1393 = var2;
        if (!arg0) {
            this.field1398 = this.field1400 - this.field1396 - this.field1398;
        }
    }

    @OriginalMember(owner = "SFAIBATY", name = "a", descriptor = "(ZIII)V")
    public void method472(boolean arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1394.length; var5++) {
            int var6 = this.field1394[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1394[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1394[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1394[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg0) {
            this.field1391 = !this.field1391;
        }
    }

    @OriginalMember(owner = "SFAIBATY", name = "a", descriptor = "(III)V")
    public void method473(int arg0, int arg1, int arg2) {
        int var4 = this.field1397 + arg0;
        int var5 = this.field1398 + arg1;
        if (arg2 != 30573) {
            return;
        }
        int var6 = class12.field635 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1396;
        int var9 = this.field1395;
        int var10 = class12.field635 - var9;
        int var11 = 0;
        if (var5 < class12.field637) {
            int var12 = class12.field637 - var5;
            var8 -= var12;
            var5 = class12.field637;
            var7 += var9 * var12;
            var6 += class12.field635 * var12;
        }
        if (var5 + var8 > class12.field638) {
            var8 -= var5 + var8 - class12.field638;
        }
        if (var4 < class12.field639) {
            int var13 = class12.field639 - var4;
            var9 -= var13;
            var4 = class12.field639;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class12.field640) {
            int var14 = var4 + var9 - class12.field640;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method474(class12.field634, this.field1394, this.field1393, (byte) 29, var10, var6, var9, var11, var7, var8);
        }
    }

    @OriginalMember(owner = "SFAIBATY", name = "a", descriptor = "([I[I[BBIIIIII)V")
    private void method474(int[] arg0, int[] arg1, byte[] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg6 >> 2);
        int var12 = -(arg6 & 0x3);
        if (arg3 != 29) {
            return;
        }
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg2[arg8++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg1[var17 & 0xFF];
                }
                byte var18 = arg2[arg8++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg1[var18 & 0xFF];
                }
                byte var19 = arg2[arg8++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg1[var19 & 0xFF];
                }
                byte var20 = arg2[arg8++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg1[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg2[arg8++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg1[var16 & 0xFF];
                }
            }
            arg5 += arg4;
            arg8 += arg7;
        }
    }
}
