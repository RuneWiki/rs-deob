import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NUXLZYAZ")
public class class33 extends class56 {

    @OriginalMember(owner = "NUXLZYAZ", name = "y", descriptor = "I")
    private int field1122 = 7;

    @OriginalMember(owner = "NUXLZYAZ", name = "z", descriptor = "Z")
    private boolean field1123 = true;

    @OriginalMember(owner = "NUXLZYAZ", name = "A", descriptor = "I")
    private int field1124 = -770;

    @OriginalMember(owner = "NUXLZYAZ", name = "H", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "NUXLZYAZ", name = "I", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "NUXLZYAZ", name = "C", descriptor = "[I")
    public int[] field1126;

    @OriginalMember(owner = "NUXLZYAZ", name = "F", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "NUXLZYAZ", name = "G", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "NUXLZYAZ", name = "D", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "NUXLZYAZ", name = "E", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "NUXLZYAZ", name = "B", descriptor = "[B")
    public byte[] field1125;

    @OriginalMember(owner = "NUXLZYAZ", name = "<init>", descriptor = "(LGWOEELWB;Ljava/lang/String;I)V")
    public class33(class18 arg0, String arg1, int arg2) {
        class30 var4 = new class30(true, arg0.method249(arg1 + ".dat", null));
        class30 var5 = new class30(true, arg0.method249("index.dat", null));
        var5.field1092 = var4.method298();
        this.field1131 = var5.method298();
        this.field1132 = var5.method298();
        int var6 = var5.method296();
        this.field1126 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1126[var7 + 1] = var5.method300();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1092 += 2;
            var4.field1092 += var5.method298() * var5.method298();
            var5.field1092++;
        }
        this.field1129 = var5.method296();
        this.field1130 = var5.method296();
        this.field1127 = var5.method298();
        this.field1128 = var5.method298();
        int var9 = var5.method296();
        int var10 = this.field1128 * this.field1127;
        this.field1125 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1125[var11] = var4.method297();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1127; var12++) {
                for (int var13 = 0; var13 < this.field1128; var13++) {
                    this.field1125[this.field1127 * var13 + var12] = var4.method297();
                }
            }
        }
    }

    @OriginalMember(owner = "NUXLZYAZ", name = "a", descriptor = "(Z)V")
    public void method342(boolean arg0) {
        this.field1131 /= 2;
        this.field1132 /= 2;
        byte[] var2 = new byte[this.field1132 * this.field1131];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1128; var4++) {
            for (int var5 = 0; var5 < this.field1127; var5++) {
                var2[(this.field1129 + var5 >> 1) + (this.field1130 + var4 >> 1) * this.field1131] = this.field1125[var3++];
            }
        }
        this.field1125 = var2;
        this.field1127 = this.field1131;
        if (arg0) {
            this.field1128 = this.field1132;
            this.field1129 = 0;
            this.field1130 = 0;
        }
    }

    @OriginalMember(owner = "NUXLZYAZ", name = "b", descriptor = "(I)V")
    public void method343(int arg0) {
        if (this.field1131 == this.field1127 && this.field1132 == this.field1128) {
            return;
        }
        byte[] var2 = new byte[this.field1132 * this.field1131];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1128; var4++) {
            for (int var6 = 0; var6 < this.field1127; var6++) {
                var2[(this.field1130 + var4) * this.field1131 + this.field1129 + var6] = this.field1125[var3++];
            }
        }
        this.field1125 = var2;
        int var5 = 67 / arg0;
        this.field1127 = this.field1131;
        this.field1128 = this.field1132;
        this.field1129 = 0;
        this.field1130 = 0;
    }

    @OriginalMember(owner = "NUXLZYAZ", name = "c", descriptor = "(I)V")
    public void method344(int arg0) {
        byte[] var2 = new byte[this.field1128 * this.field1127];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1128; var4++) {
            for (int var5 = this.field1127 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1125[this.field1127 * var4 + var5];
            }
        }
        if (arg0 < 2 || arg0 > 2) {
            this.field1123 = !this.field1123;
        }
        this.field1125 = var2;
        this.field1129 = this.field1131 - this.field1127 - this.field1129;
    }

    @OriginalMember(owner = "NUXLZYAZ", name = "d", descriptor = "(I)V")
    public void method345(int arg0) {
        byte[] var2 = new byte[this.field1128 * this.field1127];
        int var3 = 0;
        for (int var4 = this.field1128 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1127; var5++) {
                var2[var3++] = this.field1125[this.field1127 * var4 + var5];
            }
        }
        this.field1125 = var2;
        if (arg0 < 0) {
            this.field1130 = this.field1132 - this.field1128 - this.field1130;
        }
    }

    @OriginalMember(owner = "NUXLZYAZ", name = "a", descriptor = "(IIII)V")
    public void method346(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1126.length; var5++) {
            int var6 = this.field1126[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1126[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1126[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1126[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "NUXLZYAZ", name = "a", descriptor = "(IIB)V")
    public void method347(int arg0, int arg1, byte arg2) {
        int var4 = this.field1129 + arg0;
        int var5 = this.field1130 + arg1;
        int var6 = class56.field1556 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1128;
        int var9 = this.field1127;
        int var10 = class56.field1556 - var9;
        int var11 = 0;
        if (arg2 != 2) {
            return;
        }
        if (var5 < class56.field1558) {
            int var12 = class56.field1558 - var5;
            var8 -= var12;
            var5 = class56.field1558;
            var7 += var9 * var12;
            var6 += class56.field1556 * var12;
        }
        if (var5 + var8 > class56.field1559) {
            var8 -= var5 + var8 - class56.field1559;
        }
        if (var4 < class56.field1560) {
            int var13 = class56.field1560 - var4;
            var9 -= var13;
            var4 = class56.field1560;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class56.field1561) {
            int var14 = var4 + var9 - class56.field1561;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method348(var11, var8, this.field1126, false, var7, var6, var9, class56.field1555, var10, this.field1125);
        }
    }

    @OriginalMember(owner = "NUXLZYAZ", name = "a", descriptor = "(II[IZIII[II[B)V")
    private void method348(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, byte[] arg9) {
        int var11 = -(arg6 >> 2);
        int var12 = -(arg6 & 0x3);
        if (arg3) {
            this.field1122 = -185;
        }
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg9[arg4++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg7[arg5++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg9[arg4++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg7[arg5++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg9[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg7[arg5++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg9[arg4++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg7[arg5++] = arg2[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg9[arg4++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg7[arg5++] = arg2[var16 & 0xFF];
                }
            }
            arg5 += arg8;
            arg4 += arg0;
        }
    }
}
