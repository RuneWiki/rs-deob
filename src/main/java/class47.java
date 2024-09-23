import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RZWMPYWU")
public class class47 extends class36 {

    @OriginalMember(owner = "RZWMPYWU", name = "w", descriptor = "I")
    private int field1346 = 7;

    @OriginalMember(owner = "RZWMPYWU", name = "x", descriptor = "Z")
    private boolean field1347 = true;

    @OriginalMember(owner = "RZWMPYWU", name = "E", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "RZWMPYWU", name = "F", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "RZWMPYWU", name = "z", descriptor = "[I")
    public int[] field1349;

    @OriginalMember(owner = "RZWMPYWU", name = "C", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "RZWMPYWU", name = "D", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "RZWMPYWU", name = "A", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "RZWMPYWU", name = "B", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "RZWMPYWU", name = "y", descriptor = "[B")
    public byte[] field1348;

    @OriginalMember(owner = "RZWMPYWU", name = "<init>", descriptor = "(LINOFEYKQ;Ljava/lang/String;I)V")
    public class47(class21 arg0, String arg1, int arg2) {
        class35 var4 = new class35((byte) -103, arg0.method277(arg1 + ".dat", null));
        class35 var5 = new class35((byte) -103, arg0.method277("index.dat", null));
        var5.field1107 = var4.method351();
        this.field1354 = var5.method351();
        this.field1355 = var5.method351();
        int var6 = var5.method349();
        this.field1349 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1349[var7 + 1] = var5.method353();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1107 += 2;
            var4.field1107 += var5.method351() * var5.method351();
            var5.field1107++;
        }
        this.field1352 = var5.method349();
        this.field1353 = var5.method349();
        this.field1350 = var5.method351();
        this.field1351 = var5.method351();
        int var9 = var5.method349();
        int var10 = this.field1351 * this.field1350;
        this.field1348 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1348[var11] = var4.method350();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1350; var12++) {
                for (int var13 = 0; var13 < this.field1351; var13++) {
                    this.field1348[this.field1350 * var13 + var12] = var4.method350();
                }
            }
        }
    }

    @OriginalMember(owner = "RZWMPYWU", name = "a", descriptor = "(B)V")
    public void method437(byte arg0) {
        this.field1354 /= 2;
        this.field1355 /= 2;
        byte[] var2 = new byte[this.field1355 * this.field1354];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1351; var4++) {
            for (int var5 = 0; var5 < this.field1350; var5++) {
                var2[(this.field1352 + var5 >> 1) + (this.field1353 + var4 >> 1) * this.field1354] = this.field1348[var3++];
            }
        }
        this.field1348 = var2;
        this.field1350 = this.field1354;
        this.field1351 = this.field1355;
        this.field1352 = 0;
        this.field1353 = 0;
        if (arg0 == 78) {
            ;
        }
    }

    @OriginalMember(owner = "RZWMPYWU", name = "c", descriptor = "(I)V")
    public void method438(int arg0) {
        if (this.field1354 == this.field1350 && this.field1355 == this.field1351) {
            return;
        }
        byte[] var2 = new byte[this.field1355 * this.field1354];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1351; var4++) {
            for (int var5 = 0; var5 < this.field1350; var5++) {
                var2[(this.field1353 + var4) * this.field1354 + this.field1352 + var5] = this.field1348[var3++];
            }
        }
        this.field1348 = var2;
        this.field1350 = this.field1354;
        this.field1351 = this.field1355;
        this.field1352 = 0;
        if (arg0 < 0) {
            this.field1353 = 0;
        }
    }

    @OriginalMember(owner = "RZWMPYWU", name = "d", descriptor = "(I)V")
    public void method439(int arg0) {
        byte[] var2 = new byte[this.field1351 * this.field1350];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1351; var4++) {
            for (int var5 = this.field1350 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1348[this.field1350 * var4 + var5];
            }
        }
        this.field1348 = var2;
        this.field1352 = this.field1354 - this.field1350 - this.field1352;
        if (arg0 != 0) {
            this.field1347 = !this.field1347;
        }
    }

    @OriginalMember(owner = "RZWMPYWU", name = "e", descriptor = "(I)V")
    public void method440(int arg0) {
        byte[] var2 = new byte[this.field1351 * this.field1350];
        int var3 = 0;
        for (int var4 = this.field1351 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1350; var5++) {
                var2[var3++] = this.field1348[this.field1350 * var4 + var5];
            }
        }
        this.field1348 = var2;
        this.field1353 = this.field1355 - this.field1351 - this.field1353;
        if (arg0 == -29160) {
            ;
        }
    }

    @OriginalMember(owner = "RZWMPYWU", name = "a", descriptor = "(IIIB)V")
    public void method441(int arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < this.field1349.length; var5++) {
            int var7 = this.field1349[var5] >> 16 & 0xFF;
            int var8 = arg0 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1349[var5] >> 8 & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1349[var5] & 0xFF;
            int var12 = arg1 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1349[var5] = (var8 << 16) + (var10 << 8) + var12;
        }
        if (arg3 == 7) {
            boolean var6 = false;
        }
    }

    @OriginalMember(owner = "RZWMPYWU", name = "a", descriptor = "(IIB)V")
    public void method442(int arg0, int arg1, byte arg2) {
        int var4 = this.field1352 + arg0;
        if (arg2 != 8) {
            return;
        }
        int var5 = this.field1353 + arg1;
        int var6 = class36.field1125 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1351;
        int var9 = this.field1350;
        int var10 = class36.field1125 - var9;
        int var11 = 0;
        if (var5 < class36.field1127) {
            int var12 = class36.field1127 - var5;
            var8 -= var12;
            var5 = class36.field1127;
            var7 += var9 * var12;
            var6 += class36.field1125 * var12;
        }
        if (var5 + var8 > class36.field1128) {
            var8 -= var5 + var8 - class36.field1128;
        }
        if (var4 < class36.field1129) {
            int var13 = class36.field1129 - var4;
            var9 -= var13;
            var4 = class36.field1129;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class36.field1130) {
            int var14 = var4 + var9 - class36.field1130;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method443(var10, var8, var7, var9, this.field1348, var11, this.field1349, this.field1346, class36.field1124, var6);
        }
    }

    @OriginalMember(owner = "RZWMPYWU", name = "a", descriptor = "(IIII[BI[II[II)V")
    private void method443(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9) {
        if (arg7 != 7) {
            return;
        }
        int var11 = -(arg3 >> 2);
        int var12 = -(arg3 & 0x3);
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg4[arg2++];
                if (var17 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg6[var17 & 0xFF];
                }
                byte var18 = arg4[arg2++];
                if (var18 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg6[var18 & 0xFF];
                }
                byte var19 = arg4[arg2++];
                if (var19 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg6[var19 & 0xFF];
                }
                byte var20 = arg4[arg2++];
                if (var20 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg6[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg4[arg2++];
                if (var16 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg6[var16 & 0xFF];
                }
            }
            arg9 += arg0;
            arg2 += arg5;
        }
    }
}
