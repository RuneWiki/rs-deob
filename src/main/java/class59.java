import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UZETOFZZ")
public class class59 extends class61 {

    @OriginalMember(owner = "client!UZETOFZZ", name = "B", descriptor = "Z")
    private boolean field1401 = false;

    @OriginalMember(owner = "client!UZETOFZZ", name = "C", descriptor = "I")
    private int field1402 = -962;

    @OriginalMember(owner = "client!UZETOFZZ", name = "D", descriptor = "I")
    private int field1403 = -447;

    @OriginalMember(owner = "client!UZETOFZZ", name = "E", descriptor = "I")
    private int field1404 = -171;

    @OriginalMember(owner = "client!UZETOFZZ", name = "F", descriptor = "I")
    private int field1405 = 43335;

    @OriginalMember(owner = "client!UZETOFZZ", name = "N", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!UZETOFZZ", name = "O", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!UZETOFZZ", name = "I", descriptor = "[I")
    public int[] field1408;

    @OriginalMember(owner = "client!UZETOFZZ", name = "L", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!UZETOFZZ", name = "M", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!UZETOFZZ", name = "J", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!UZETOFZZ", name = "K", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!UZETOFZZ", name = "H", descriptor = "[B")
    public byte[] field1407;

    @OriginalMember(owner = "client!UZETOFZZ", name = "G", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!UZETOFZZ", name = "<init>", descriptor = "(LRSPRYUFS;Ljava/lang/String;I)V")
    public class59(class49 arg0, String arg1, int arg2) {
        class36 var4 = new class36(-587, arg0.method427(arg1 + ".dat", null));
        class36 var5 = new class36(-587, arg0.method427("index.dat", null));
        var5.field1072 = var4.method341();
        this.field1413 = var5.method341();
        this.field1414 = var5.method341();
        int var6 = var5.method339();
        this.field1408 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1408[var7 + 1] = var5.method343();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1072 += 2;
            var4.field1072 += var5.method341() * var5.method341();
            var5.field1072++;
        }
        this.field1411 = var5.method339();
        this.field1412 = var5.method339();
        this.field1409 = var5.method341();
        this.field1410 = var5.method341();
        int var9 = var5.method339();
        int var10 = this.field1410 * this.field1409;
        this.field1407 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1407[var11] = var4.method340();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1409; var12++) {
                    for (int var13 = 0; var13 < this.field1410; var13++) {
                        this.field1407[this.field1409 * var13 + var12] = var4.method340();
                    }
                }
            }
            if (class35.field1047) {
            }
        }
    }

    @OriginalMember(owner = "client!UZETOFZZ", name = "b", descriptor = "(I)V")
    public void method525(int arg0) {
        this.field1413 /= 2;
        this.field1414 /= 2;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        byte[] var3 = new byte[this.field1414 * this.field1413];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1410; var5++) {
            for (int var6 = 0; var6 < this.field1409; var6++) {
                var3[(this.field1411 + var6 >> 1) + (this.field1412 + var5 >> 1) * this.field1413] = this.field1407[var4++];
            }
        }
        this.field1407 = var3;
        this.field1409 = this.field1413;
        this.field1410 = this.field1414;
        this.field1411 = 0;
        this.field1412 = 0;
    }

    @OriginalMember(owner = "client!UZETOFZZ", name = "c", descriptor = "(I)V")
    public void method526(int arg0) {
        if (this.field1413 == this.field1409 && this.field1414 == this.field1410) {
            return;
        }
        byte[] var2 = new byte[this.field1414 * this.field1413];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1410; var4++) {
            for (int var5 = 0; var5 < this.field1409; var5++) {
                var2[(this.field1412 + var4) * this.field1413 + this.field1411 + var5] = this.field1407[var3++];
            }
        }
        this.field1407 = var2;
        this.field1409 = this.field1413;
        this.field1410 = this.field1414;
        while (arg0 >= 0) {
            this.field1403 = 436;
        }
        this.field1411 = 0;
        this.field1412 = 0;
    }

    @OriginalMember(owner = "client!UZETOFZZ", name = "a", descriptor = "(Z)V")
    public void method527(boolean arg0) {
        if (arg0) {
            this.field1406 = 228;
        }
        byte[] var2 = new byte[this.field1410 * this.field1409];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1410; var4++) {
            for (int var5 = this.field1409 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1407[this.field1409 * var4 + var5];
            }
        }
        this.field1407 = var2;
        this.field1411 = this.field1413 - this.field1409 - this.field1411;
    }

    @OriginalMember(owner = "client!UZETOFZZ", name = "b", descriptor = "(Z)V")
    public void method528(boolean arg0) {
        byte[] var2 = new byte[this.field1410 * this.field1409];
        if (!arg0) {
            return;
        }
        int var3 = 0;
        for (int var4 = this.field1410 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1409; var5++) {
                var2[var3++] = this.field1407[this.field1409 * var4 + var5];
            }
        }
        this.field1407 = var2;
        this.field1412 = this.field1414 - this.field1410 - this.field1412;
    }

    @OriginalMember(owner = "client!UZETOFZZ", name = "a", descriptor = "(IIII)V")
    public void method529(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1408.length; var5++) {
            int var6 = this.field1408[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1408[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1408[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1408[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg1 <= 0) {
            this.field1403 = 188;
        }
    }

    @OriginalMember(owner = "client!UZETOFZZ", name = "a", descriptor = "(III)V")
    public void method530(int arg0, int arg1, int arg2) {
        if (arg0 != 3) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = this.field1411 + arg2;
        int var6 = this.field1412 + arg1;
        int var7 = class61.field1499 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1410;
        int var10 = this.field1409;
        int var11 = class61.field1499 - var10;
        int var12 = 0;
        if (var6 < class61.field1501) {
            int var13 = class61.field1501 - var6;
            var9 -= var13;
            var6 = class61.field1501;
            var8 += var10 * var13;
            var7 += class61.field1499 * var13;
        }
        if (var6 + var9 > class61.field1502) {
            var9 -= var6 + var9 - class61.field1502;
        }
        if (var5 < class61.field1503) {
            int var14 = class61.field1503 - var5;
            var10 -= var14;
            var5 = class61.field1503;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class61.field1504) {
            int var15 = var5 + var10 - class61.field1504;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method531(this.field1407, var12, (byte) -94, var7, var9, var10, class61.field1498, var11, this.field1408, var8);
        }
    }

    @OriginalMember(owner = "client!UZETOFZZ", name = "a", descriptor = "([BIBIII[II[II)V")
    private void method531(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9) {
        int var11 = -(arg5 >> 2);
        int var12 = -(arg5 & 0x3);
        if (arg2 != -94) {
            this.field1406 = 22;
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg0[arg9++];
                if (var17 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg8[var17 & 0xFF];
                }
                byte var18 = arg0[arg9++];
                if (var18 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg8[var18 & 0xFF];
                }
                byte var19 = arg0[arg9++];
                if (var19 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg8[var19 & 0xFF];
                }
                byte var20 = arg0[arg9++];
                if (var20 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg8[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg0[arg9++];
                if (var16 == 0) {
                    arg3++;
                } else {
                    arg6[arg3++] = arg8[var16 & 0xFF];
                }
            }
            arg3 += arg7;
            arg9 += arg1;
        }
    }
}
