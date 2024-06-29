import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SFVBUBEZ")
public class class52 extends class57 {

    @OriginalMember(owner = "client!SFVBUBEZ", name = "w", descriptor = "Z")
    private boolean field1443 = true;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "x", descriptor = "Z")
    private boolean field1444 = false;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "y", descriptor = "I")
    private int field1445 = -324;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "z", descriptor = "I")
    private int field1446 = -81;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "A", descriptor = "Z")
    private boolean field1447 = false;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "B", descriptor = "Z")
    private boolean field1448 = false;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "I", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "J", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "D", descriptor = "[I")
    public int[] field1450;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "G", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "H", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "E", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "F", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "C", descriptor = "[B")
    public byte[] field1449;

    @OriginalMember(owner = "client!SFVBUBEZ", name = "<init>", descriptor = "(LAWEEREDT;Ljava/lang/String;I)V")
    public class52(class2 arg0, String arg1, int arg2) {
        class25 var4 = new class25(arg0.method14(arg1 + ".dat", null), 713);
        class25 var5 = new class25(arg0.method14("index.dat", null), 713);
        var5.field837 = var4.method247();
        this.field1455 = var5.method247();
        this.field1456 = var5.method247();
        int var6 = var5.method245();
        this.field1450 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1450[var7 + 1] = var5.method249();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field837 += 2;
            var4.field837 += var5.method247() * var5.method247();
            var5.field837++;
        }
        this.field1453 = var5.method245();
        this.field1454 = var5.method245();
        this.field1451 = var5.method247();
        this.field1452 = var5.method247();
        int var9 = var5.method245();
        int var10 = this.field1452 * this.field1451;
        this.field1449 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1449[var11] = var4.method246();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1451; var12++) {
                for (int var13 = 0; var13 < this.field1452; var13++) {
                    this.field1449[this.field1451 * var13 + var12] = var4.method246();
                }
            }
        }
    }

    @OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "(Z)V")
    public void method458(boolean arg0) {
        this.field1455 /= 2;
        this.field1456 /= 2;
        byte[] var2 = new byte[this.field1456 * this.field1455];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1452; var4++) {
            for (int var5 = 0; var5 < this.field1451; var5++) {
                var2[(this.field1453 + var5 >> 1) + (this.field1454 + var4 >> 1) * this.field1455] = this.field1449[var3++];
            }
        }
        this.field1449 = var2;
        this.field1451 = this.field1455;
        this.field1452 = this.field1456;
        if (!arg0) {
            this.field1444 = !this.field1444;
        }
        this.field1453 = 0;
        this.field1454 = 0;
    }

    @OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "(B)V")
    public void method459(byte arg0) {
        if (this.field1455 == this.field1451 && this.field1456 == this.field1452) {
            return;
        }
        byte[] var2 = new byte[this.field1456 * this.field1455];
        int var3 = 0;
        if (arg0 == 4) {
            boolean var4 = false;
        } else {
            this.field1448 = !this.field1448;
        }
        for (int var5 = 0; var5 < this.field1452; var5++) {
            for (int var6 = 0; var6 < this.field1451; var6++) {
                var2[(this.field1454 + var5) * this.field1455 + this.field1453 + var6] = this.field1449[var3++];
            }
        }
        this.field1449 = var2;
        this.field1451 = this.field1455;
        this.field1452 = this.field1456;
        this.field1453 = 0;
        this.field1454 = 0;
    }

    @OriginalMember(owner = "client!SFVBUBEZ", name = "b", descriptor = "(Z)V")
    public void method460(boolean arg0) {
        byte[] var2 = new byte[this.field1452 * this.field1451];
        if (!arg0) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1452; var4++) {
            for (int var5 = this.field1451 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1449[this.field1451 * var4 + var5];
            }
        }
        this.field1449 = var2;
        this.field1453 = this.field1455 - this.field1451 - this.field1453;
    }

    @OriginalMember(owner = "client!SFVBUBEZ", name = "c", descriptor = "(Z)V")
    public void method461(boolean arg0) {
        byte[] var2 = new byte[this.field1452 * this.field1451];
        int var3 = 0;
        for (int var4 = this.field1452 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1451; var5++) {
                var2[var3++] = this.field1449[this.field1451 * var4 + var5];
            }
        }
        this.field1449 = var2;
        this.field1454 = this.field1456 - this.field1452 - this.field1454;
        if (arg0) {
            this.field1443 = !this.field1443;
        }
    }

    @OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "(IIII)V")
    public void method462(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 0) {
            return;
        }
        for (int var5 = 0; var5 < this.field1450.length; var5++) {
            int var6 = this.field1450[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1450[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1450[var5] & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1450[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "(III)V")
    public void method463(int arg0, int arg1, int arg2) {
        int var4 = this.field1453 + arg2;
        int var5 = this.field1454 + arg1;
        if (arg0 != -40219) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = class57.field1530 * var5 + var4;
        int var8 = 0;
        int var9 = this.field1452;
        int var10 = this.field1451;
        int var11 = class57.field1530 - var10;
        int var12 = 0;
        if (var5 < class57.field1532) {
            int var13 = class57.field1532 - var5;
            var9 -= var13;
            var5 = class57.field1532;
            var8 += var10 * var13;
            var7 += class57.field1530 * var13;
        }
        if (var5 + var9 > class57.field1533) {
            var9 -= var5 + var9 - class57.field1533;
        }
        if (var4 < class57.field1534) {
            int var14 = class57.field1534 - var4;
            var10 -= var14;
            var4 = class57.field1534;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class57.field1535) {
            int var15 = var4 + var10 - class57.field1535;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method464(this.field1449, var11, var9, var7, this.field1450, var12, class57.field1529, var10, var8, 0);
        }
    }

    @OriginalMember(owner = "client!SFVBUBEZ", name = "a", descriptor = "([BIII[II[IIII)V")
    private void method464(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 0) {
            return;
        }
        int var11 = -(arg7 >> 2);
        int var12 = -(arg7 & 0x3);
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg0[arg8++];
                if (var17 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var17 & 0xFF];
                }
                byte var18 = arg0[arg8++];
                if (var18 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg0[arg8++];
                if (var19 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg0[arg8++];
                if (var20 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg0[arg8++];
                if (var16 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg4[var16 & 0xFF];
                }
            }
            arg3 += arg1;
            arg8 += arg5;
        }
    }
}
