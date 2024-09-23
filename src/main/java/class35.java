import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LKEIRLLI")
public class class35 extends class53 {

    @OriginalMember(owner = "LKEIRLLI", name = "B", descriptor = "Z")
    private boolean field1087 = true;

    @OriginalMember(owner = "LKEIRLLI", name = "C", descriptor = "Z")
    private boolean field1088 = true;

    @OriginalMember(owner = "LKEIRLLI", name = "D", descriptor = "I")
    private int field1089 = -22136;

    @OriginalMember(owner = "LKEIRLLI", name = "E", descriptor = "I")
    private int field1090 = 6;

    @OriginalMember(owner = "LKEIRLLI", name = "L", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "LKEIRLLI", name = "M", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "LKEIRLLI", name = "G", descriptor = "[I")
    public int[] field1092;

    @OriginalMember(owner = "LKEIRLLI", name = "J", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "LKEIRLLI", name = "K", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "LKEIRLLI", name = "H", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "LKEIRLLI", name = "I", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "LKEIRLLI", name = "F", descriptor = "[B")
    public byte[] field1091;

    @OriginalMember(owner = "LKEIRLLI", name = "A", descriptor = "I")
    private static int field1086;

    @OriginalMember(owner = "LKEIRLLI", name = "<init>", descriptor = "(LSPZBTZXL;Ljava/lang/String;I)V")
    public class35(class51 arg0, String arg1, int arg2) {
        class34 var4 = new class34(arg0.method515(arg1 + ".dat", null), field1086);
        class34 var5 = new class34(arg0.method515("index.dat", null), field1086);
        var5.field1073 = var4.method404();
        this.field1097 = var5.method404();
        this.field1098 = var5.method404();
        int var6 = var5.method402();
        this.field1092 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1092[var7 + 1] = var5.method406();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1073 += 2;
            var4.field1073 += var5.method404() * var5.method404();
            var5.field1073++;
        }
        this.field1095 = var5.method402();
        this.field1096 = var5.method402();
        this.field1093 = var5.method404();
        this.field1094 = var5.method404();
        int var9 = var5.method402();
        int var10 = this.field1094 * this.field1093;
        this.field1091 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1091[var11] = var4.method403();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1093; var12++) {
                    for (int var13 = 0; var13 < this.field1094; var13++) {
                        this.field1091[this.field1093 * var13 + var12] = var4.method403();
                    }
                }
            }
            if (class6.field545) {
            }
        }
    }

    @OriginalMember(owner = "LKEIRLLI", name = "b", descriptor = "(I)V")
    public void method441(int arg0) {
        this.field1097 /= 2;
        this.field1098 /= 2;
        byte[] var2 = new byte[this.field1098 * this.field1097];
        int var3 = 0;
        while (arg0 >= 0) {
            this.field1090 = 274;
        }
        for (int var4 = 0; var4 < this.field1094; var4++) {
            for (int var5 = 0; var5 < this.field1093; var5++) {
                var2[(this.field1095 + var5 >> 1) + (this.field1096 + var4 >> 1) * this.field1097] = this.field1091[var3++];
            }
        }
        this.field1091 = var2;
        this.field1093 = this.field1097;
        this.field1094 = this.field1098;
        this.field1095 = 0;
        this.field1096 = 0;
    }

    @OriginalMember(owner = "LKEIRLLI", name = "b", descriptor = "(Z)V")
    public void method442(boolean arg0) {
        if (this.field1097 == this.field1093 && this.field1098 == this.field1094) {
            return;
        }
        byte[] var2 = new byte[this.field1098 * this.field1097];
        if (arg0) {
            field1086 = 145;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1094; var4++) {
            for (int var5 = 0; var5 < this.field1093; var5++) {
                var2[(this.field1096 + var4) * this.field1097 + this.field1095 + var5] = this.field1091[var3++];
            }
        }
        this.field1091 = var2;
        this.field1093 = this.field1097;
        this.field1094 = this.field1098;
        this.field1095 = 0;
        this.field1096 = 0;
    }

    @OriginalMember(owner = "LKEIRLLI", name = "c", descriptor = "(I)V")
    public void method443(int arg0) {
        byte[] var2 = new byte[this.field1094 * this.field1093];
        int var3 = 0;
        if (arg0 != 5487) {
            this.field1088 = !this.field1088;
        }
        for (int var4 = 0; var4 < this.field1094; var4++) {
            for (int var5 = this.field1093 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1091[this.field1093 * var4 + var5];
            }
        }
        this.field1091 = var2;
        this.field1095 = this.field1097 - this.field1093 - this.field1095;
    }

    @OriginalMember(owner = "LKEIRLLI", name = "c", descriptor = "(Z)V")
    public void method444(boolean arg0) {
        byte[] var2 = new byte[this.field1094 * this.field1093];
        if (!arg0) {
            return;
        }
        int var3 = 0;
        for (int var4 = this.field1094 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1093; var5++) {
                var2[var3++] = this.field1091[this.field1093 * var4 + var5];
            }
        }
        this.field1091 = var2;
        this.field1096 = this.field1098 - this.field1094 - this.field1096;
    }

    @OriginalMember(owner = "LKEIRLLI", name = "a", descriptor = "(IIII)V")
    public void method445(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 7547) {
            return;
        }
        for (int var5 = 0; var5 < this.field1092.length; var5++) {
            int var6 = this.field1092[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1092[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1092[var5] & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1092[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "LKEIRLLI", name = "a", descriptor = "(III)V")
    public void method446(int arg0, int arg1, int arg2) {
        int var4 = this.field1095 + arg2;
        int var5 = this.field1096 + arg1;
        int var6 = class53.field1348 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1094;
        int var9 = this.field1093;
        int var10 = class53.field1348 - var9;
        int var11 = 0;
        if (var5 < class53.field1350) {
            int var12 = class53.field1350 - var5;
            var8 -= var12;
            var5 = class53.field1350;
            var7 += var9 * var12;
            var6 += class53.field1348 * var12;
        }
        if (var5 + var8 > class53.field1351) {
            var8 -= var5 + var8 - class53.field1351;
        }
        if (var4 < class53.field1352) {
            int var13 = class53.field1352 - var4;
            var9 -= var13;
            var4 = class53.field1352;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class53.field1353) {
            int var14 = var4 + var9 - class53.field1353;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method447(var7, this.field1092, class53.field1347, 356, this.field1091, var11, var6, var10, var9, var8);
            int var15 = 67 / arg0;
        }
    }

    @OriginalMember(owner = "LKEIRLLI", name = "a", descriptor = "(I[I[II[BIIIII)V")
    private void method447(int arg0, int[] arg1, int[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg8 >> 2);
        int var12 = -(arg8 & 0x3);
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg4[arg0++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg1[var17 & 0xFF];
                }
                byte var18 = arg4[arg0++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg1[var18 & 0xFF];
                }
                byte var19 = arg4[arg0++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg1[var19 & 0xFF];
                }
                byte var20 = arg4[arg0++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg1[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg4[arg0++];
                if (var16 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg1[var16 & 0xFF];
                }
            }
            arg6 += arg7;
            arg0 += arg5;
        }
        if (arg3 > 0) {
            ;
        }
    }
}
