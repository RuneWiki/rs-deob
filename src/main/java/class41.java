import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OSRLSEOB")
public class class41 extends class32 {

    @OriginalMember(owner = "client!OSRLSEOB", name = "w", descriptor = "Z")
    private boolean field1288 = false;

    @OriginalMember(owner = "client!OSRLSEOB", name = "x", descriptor = "I")
    private int field1289 = -79;

    @OriginalMember(owner = "client!OSRLSEOB", name = "y", descriptor = "Z")
    private boolean field1290 = true;

    @OriginalMember(owner = "client!OSRLSEOB", name = "z", descriptor = "I")
    private int field1291 = 1;

    @OriginalMember(owner = "client!OSRLSEOB", name = "G", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!OSRLSEOB", name = "H", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!OSRLSEOB", name = "B", descriptor = "[I")
    public int[] field1293;

    @OriginalMember(owner = "client!OSRLSEOB", name = "E", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!OSRLSEOB", name = "F", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!OSRLSEOB", name = "C", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!OSRLSEOB", name = "D", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!OSRLSEOB", name = "A", descriptor = "[B")
    public byte[] field1292;

    @OriginalMember(owner = "client!OSRLSEOB", name = "<init>", descriptor = "(LLKPVZAQN;Ljava/lang/String;I)V")
    public class41(class33 arg0, String arg1, int arg2) {
        class58 var4 = new class58((byte) -115, arg0.method323(arg1 + ".dat", null));
        class58 var5 = new class58((byte) -115, arg0.method323("index.dat", null));
        var5.field1615 = var4.method517();
        this.field1298 = var5.method517();
        this.field1299 = var5.method517();
        int var6 = var5.method515();
        this.field1293 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1293[var7 + 1] = var5.method519();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1615 += 2;
            var4.field1615 += var5.method517() * var5.method517();
            var5.field1615++;
        }
        this.field1296 = var5.method515();
        this.field1297 = var5.method515();
        this.field1294 = var5.method517();
        this.field1295 = var5.method517();
        int var9 = var5.method515();
        int var10 = this.field1295 * this.field1294;
        this.field1292 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1292[var11] = var4.method516();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1294; var12++) {
                    for (int var13 = 0; var13 < this.field1295; var13++) {
                        this.field1292[this.field1294 * var13 + var12] = var4.method516();
                    }
                }
            }
            if (class7.field142) {
            }
        }
    }

    @OriginalMember(owner = "client!OSRLSEOB", name = "b", descriptor = "(I)V")
    public void method364(int arg0) {
        this.field1298 /= 2;
        this.field1299 /= 2;
        byte[] var2 = new byte[this.field1299 * this.field1298];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1295; var4++) {
            for (int var6 = 0; var6 < this.field1294; var6++) {
                var2[(this.field1296 + var6 >> 1) + (this.field1297 + var4 >> 1) * this.field1298] = this.field1292[var3++];
            }
        }
        this.field1292 = var2;
        this.field1294 = this.field1298;
        this.field1295 = this.field1299;
        this.field1296 = 0;
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1297 = 0;
    }

    @OriginalMember(owner = "client!OSRLSEOB", name = "c", descriptor = "(I)V")
    public void method365(int arg0) {
        if (this.field1298 == this.field1294 && this.field1299 == this.field1295) {
            return;
        }
        byte[] var2 = new byte[this.field1299 * this.field1298];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1295; var4++) {
            for (int var6 = 0; var6 < this.field1294; var6++) {
                var2[(this.field1297 + var4) * this.field1298 + this.field1296 + var6] = this.field1292[var3++];
            }
        }
        this.field1292 = var2;
        this.field1294 = this.field1298;
        this.field1295 = this.field1299;
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1296 = 0;
        this.field1297 = 0;
    }

    @OriginalMember(owner = "client!OSRLSEOB", name = "d", descriptor = "(I)V")
    public void method366(int arg0) {
        byte[] var2 = new byte[this.field1295 * this.field1294];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1295; var4++) {
            for (int var5 = this.field1294 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1292[this.field1294 * var4 + var5];
            }
        }
        if (arg0 == 0) {
            this.field1292 = var2;
            this.field1296 = this.field1298 - this.field1294 - this.field1296;
        }
    }

    @OriginalMember(owner = "client!OSRLSEOB", name = "e", descriptor = "(I)V")
    public void method367(int arg0) {
        byte[] var2 = new byte[this.field1295 * this.field1294];
        if (arg0 != -17803) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        for (int var5 = this.field1295 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field1294; var6++) {
                var2[var4++] = this.field1292[this.field1294 * var5 + var6];
            }
        }
        this.field1292 = var2;
        this.field1297 = this.field1299 - this.field1295 - this.field1297;
    }

    @OriginalMember(owner = "client!OSRLSEOB", name = "a", descriptor = "(IIBI)V")
    public void method368(int arg0, int arg1, byte arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1293.length; var5++) {
            int var7 = this.field1293[var5] >> 16 & 0xFF;
            int var8 = arg0 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1293[var5] >> 8 & 0xFF;
            int var10 = arg3 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1293[var5] & 0xFF;
            int var12 = arg1 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1293[var5] = (var8 << 16) + (var10 << 8) + var12;
        }
        if (arg2 == 4) {
            boolean var6 = false;
        }
    }

    @OriginalMember(owner = "client!OSRLSEOB", name = "a", descriptor = "(III)V")
    public void method369(int arg0, int arg1, int arg2) {
        int var4 = this.field1296 + arg0;
        if (arg2 >= 0) {
            return;
        }
        int var5 = this.field1297 + arg1;
        int var6 = class32.field1093 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1295;
        int var9 = this.field1294;
        int var10 = class32.field1093 - var9;
        int var11 = 0;
        if (var5 < class32.field1095) {
            int var12 = class32.field1095 - var5;
            var8 -= var12;
            var5 = class32.field1095;
            var7 += var9 * var12;
            var6 += class32.field1093 * var12;
        }
        if (var5 + var8 > class32.field1096) {
            var8 -= var5 + var8 - class32.field1096;
        }
        if (var4 < class32.field1097) {
            int var13 = class32.field1097 - var4;
            var9 -= var13;
            var4 = class32.field1097;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class32.field1098) {
            int var14 = var4 + var9 - class32.field1098;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method370(this.field1293, var7, var8, this.field1292, class32.field1092, var11, var10, var6, (byte) 74, var9);
        }
    }

    @OriginalMember(owner = "client!OSRLSEOB", name = "a", descriptor = "([III[B[IIIIBI)V")
    private void method370(int[] arg0, int arg1, int arg2, byte[] arg3, int[] arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        int var11 = -(arg9 >> 2);
        if (arg8 != 74) {
            this.field1288 = !this.field1288;
        }
        int var12 = -(arg9 & 0x3);
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg3[arg1++];
                if (var17 == 0) {
                    arg7++;
                } else {
                    arg4[arg7++] = arg0[var17 & 0xFF];
                }
                byte var18 = arg3[arg1++];
                if (var18 == 0) {
                    arg7++;
                } else {
                    arg4[arg7++] = arg0[var18 & 0xFF];
                }
                byte var19 = arg3[arg1++];
                if (var19 == 0) {
                    arg7++;
                } else {
                    arg4[arg7++] = arg0[var19 & 0xFF];
                }
                byte var20 = arg3[arg1++];
                if (var20 == 0) {
                    arg7++;
                } else {
                    arg4[arg7++] = arg0[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg3[arg1++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    arg4[arg7++] = arg0[var16 & 0xFF];
                }
            }
            arg7 += arg6;
            arg1 += arg5;
        }
    }
}
