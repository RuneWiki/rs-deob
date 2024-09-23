import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VSJQVIFL")
public class class63 extends class24 {

    @OriginalMember(owner = "VSJQVIFL", name = "x", descriptor = "I")
    private int field1350 = 6;

    @OriginalMember(owner = "VSJQVIFL", name = "y", descriptor = "B")
    private byte field1351 = 2;

    @OriginalMember(owner = "VSJQVIFL", name = "z", descriptor = "I")
    private int field1352 = -42286;

    @OriginalMember(owner = "VSJQVIFL", name = "A", descriptor = "I")
    private int field1353 = -207;

    @OriginalMember(owner = "VSJQVIFL", name = "B", descriptor = "Z")
    private boolean field1354 = false;

    @OriginalMember(owner = "VSJQVIFL", name = "I", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "VSJQVIFL", name = "J", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "VSJQVIFL", name = "D", descriptor = "[I")
    public int[] field1356;

    @OriginalMember(owner = "VSJQVIFL", name = "G", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "VSJQVIFL", name = "H", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "VSJQVIFL", name = "E", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "VSJQVIFL", name = "F", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "VSJQVIFL", name = "C", descriptor = "[B")
    public byte[] field1355;

    @OriginalMember(owner = "VSJQVIFL", name = "<init>", descriptor = "(LMJLXHQTQ;Ljava/lang/String;I)V")
    public class63(class44 arg0, String arg1, int arg2) {
        class69 var4 = new class69(arg0.method317(arg1 + ".dat", null), -82);
        class69 var5 = new class69(arg0.method317("index.dat", null), -82);
        var5.field1652 = var4.method467();
        this.field1361 = var5.method467();
        this.field1362 = var5.method467();
        int var6 = var5.method465();
        this.field1356 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1356[var7 + 1] = var5.method469();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1652 += 2;
            var4.field1652 += var5.method467() * var5.method467();
            var5.field1652++;
        }
        this.field1359 = var5.method465();
        this.field1360 = var5.method465();
        this.field1357 = var5.method467();
        this.field1358 = var5.method467();
        int var9 = var5.method465();
        int var10 = this.field1358 * this.field1357;
        this.field1355 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1355[var11] = var4.method466();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1357; var12++) {
                    for (int var13 = 0; var13 < this.field1358; var13++) {
                        this.field1355[this.field1357 * var13 + var12] = var4.method466();
                    }
                }
            }
            if (class54.field1301) {
            }
        }
    }

    @OriginalMember(owner = "VSJQVIFL", name = "b", descriptor = "(I)V")
    public void method369(int arg0) {
        this.field1361 /= 2;
        this.field1362 /= 2;
        byte[] var2 = new byte[this.field1362 * this.field1361];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1358; var4++) {
            for (int var5 = 0; var5 < this.field1357; var5++) {
                var2[(this.field1359 + var5 >> 1) + (this.field1360 + var4 >> 1) * this.field1361] = this.field1355[var3++];
            }
        }
        this.field1355 = var2;
        if (arg0 > 0) {
            this.field1357 = this.field1361;
            this.field1358 = this.field1362;
            this.field1359 = 0;
            this.field1360 = 0;
        }
    }

    @OriginalMember(owner = "VSJQVIFL", name = "c", descriptor = "(I)V")
    public void method370(int arg0) {
        if (this.field1361 == this.field1357 && this.field1362 == this.field1358) {
            return;
        }
        byte[] var2 = new byte[this.field1362 * this.field1361];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1358; var4++) {
            for (int var6 = 0; var6 < this.field1357; var6++) {
                var2[(this.field1360 + var4) * this.field1361 + this.field1359 + var6] = this.field1355[var3++];
            }
        }
        if (arg0 != 46806) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1355 = var2;
        this.field1357 = this.field1361;
        this.field1358 = this.field1362;
        this.field1359 = 0;
        this.field1360 = 0;
    }

    @OriginalMember(owner = "VSJQVIFL", name = "d", descriptor = "(I)V")
    public void method371(int arg0) {
        byte[] var2 = new byte[this.field1358 * this.field1357];
        int var3 = 0;
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < this.field1358; var5++) {
            for (int var6 = this.field1357 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field1355[this.field1357 * var5 + var6];
            }
        }
        this.field1355 = var2;
        this.field1359 = this.field1361 - this.field1357 - this.field1359;
    }

    @OriginalMember(owner = "VSJQVIFL", name = "b", descriptor = "(B)V")
    public void method372(byte arg0) {
        if (arg0 != 8) {
            return;
        }
        byte[] var2 = new byte[this.field1358 * this.field1357];
        int var3 = 0;
        for (int var4 = this.field1358 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1357; var5++) {
                var2[var3++] = this.field1355[this.field1357 * var4 + var5];
            }
        }
        this.field1355 = var2;
        this.field1360 = this.field1362 - this.field1358 - this.field1360;
    }

    @OriginalMember(owner = "VSJQVIFL", name = "a", descriptor = "(IZII)V")
    public void method373(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field1356.length; var6++) {
            int var7 = this.field1356[var6] >> 16 & 0xFF;
            int var8 = arg2 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1356[var6] >> 8 & 0xFF;
            int var10 = arg3 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1356[var6] & 0xFF;
            int var12 = arg0 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1356[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "VSJQVIFL", name = "a", descriptor = "(IZI)V")
    public void method374(int arg0, boolean arg1, int arg2) {
        int var4 = this.field1359 + arg2;
        int var5 = this.field1360 + arg0;
        if (arg1) {
            this.field1353 = 300;
        }
        int var6 = class24.field898 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1358;
        int var9 = this.field1357;
        int var10 = class24.field898 - var9;
        int var11 = 0;
        if (var5 < class24.field900) {
            int var12 = class24.field900 - var5;
            var8 -= var12;
            var5 = class24.field900;
            var7 += var9 * var12;
            var6 += class24.field898 * var12;
        }
        if (var5 + var8 > class24.field901) {
            var8 -= var5 + var8 - class24.field901;
        }
        if (var4 < class24.field902) {
            int var13 = class24.field902 - var4;
            var9 -= var13;
            var4 = class24.field902;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class24.field903) {
            int var14 = var4 + var9 - class24.field903;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method375(this.field1356, var9, class24.field897, var10, var8, 0, var6, var11, this.field1355, var7);
        }
    }

    @OriginalMember(owner = "VSJQVIFL", name = "a", descriptor = "([II[IIIIII[BI)V")
    private void method375(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        int var11 = -(arg1 >> 2);
        int var12 = -(arg1 & 0x3);
        if (arg5 != 0) {
            this.field1354 = !this.field1354;
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg8[arg9++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg0[var17 & 0xFF];
                }
                byte var18 = arg8[arg9++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg0[var18 & 0xFF];
                }
                byte var19 = arg8[arg9++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg0[var19 & 0xFF];
                }
                byte var20 = arg8[arg9++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg0[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg8[arg9++];
                if (var16 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg0[var16 & 0xFF];
                }
            }
            arg6 += arg3;
            arg9 += arg7;
        }
    }
}
