import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JQZFCGYF")
public class class38 extends class35 {

    @OriginalMember(owner = "JQZFCGYF", name = "z", descriptor = "B")
    private byte field1180 = 5;

    @OriginalMember(owner = "JQZFCGYF", name = "A", descriptor = "I")
    private int field1181 = 4;

    @OriginalMember(owner = "JQZFCGYF", name = "B", descriptor = "I")
    private int field1182 = 817;

    @OriginalMember(owner = "JQZFCGYF", name = "C", descriptor = "Z")
    private boolean field1183 = true;

    @OriginalMember(owner = "JQZFCGYF", name = "J", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "JQZFCGYF", name = "K", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "JQZFCGYF", name = "E", descriptor = "[I")
    public int[] field1185;

    @OriginalMember(owner = "JQZFCGYF", name = "H", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "JQZFCGYF", name = "I", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "JQZFCGYF", name = "F", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "JQZFCGYF", name = "G", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "JQZFCGYF", name = "D", descriptor = "[B")
    public byte[] field1184;

    @OriginalMember(owner = "JQZFCGYF", name = "<init>", descriptor = "(LEAXVDNXA;Ljava/lang/String;I)V")
    public class38(class12 arg0, String arg1, int arg2) {
        class5 var4 = new class5(2, arg0.method255(arg1 + ".dat", null));
        class5 var5 = new class5(2, arg0.method255("index.dat", null));
        var5.field123 = var4.method46();
        this.field1190 = var5.method46();
        this.field1191 = var5.method46();
        int var6 = var5.method44();
        this.field1185 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1185[var7 + 1] = var5.method48();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field123 += 2;
            var4.field123 += var5.method46() * var5.method46();
            var5.field123++;
        }
        this.field1188 = var5.method44();
        this.field1189 = var5.method44();
        this.field1186 = var5.method46();
        this.field1187 = var5.method46();
        int var9 = var5.method44();
        int var10 = this.field1187 * this.field1186;
        this.field1184 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1184[var11] = var4.method45();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1186; var12++) {
                for (int var13 = 0; var13 < this.field1187; var13++) {
                    this.field1184[this.field1186 * var13 + var12] = var4.method45();
                }
            }
        }
    }

    @OriginalMember(owner = "JQZFCGYF", name = "b", descriptor = "(I)V")
    public void method437(int arg0) {
        this.field1190 /= 2;
        this.field1191 /= 2;
        byte[] var2 = new byte[this.field1191 * this.field1190];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1187; var4++) {
            for (int var5 = 0; var5 < this.field1186; var5++) {
                var2[(this.field1188 + var5 >> 1) + (this.field1189 + var4 >> 1) * this.field1190] = this.field1184[var3++];
            }
        }
        this.field1184 = var2;
        this.field1186 = this.field1190;
        if (arg0 < this.field1181 || arg0 > this.field1181) {
            this.field1182 = 66;
        }
        this.field1187 = this.field1191;
        this.field1188 = 0;
        this.field1189 = 0;
    }

    @OriginalMember(owner = "JQZFCGYF", name = "a", descriptor = "(Z)V")
    public void method438(boolean arg0) {
        if (this.field1190 == this.field1186 && this.field1191 == this.field1187) {
            return;
        }
        byte[] var2 = new byte[this.field1191 * this.field1190];
        if (!arg0) {
            this.field1181 = 193;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1187; var4++) {
            for (int var5 = 0; var5 < this.field1186; var5++) {
                var2[(this.field1189 + var4) * this.field1190 + this.field1188 + var5] = this.field1184[var3++];
            }
        }
        this.field1184 = var2;
        this.field1186 = this.field1190;
        this.field1187 = this.field1191;
        this.field1188 = 0;
        this.field1189 = 0;
    }

    @OriginalMember(owner = "JQZFCGYF", name = "b", descriptor = "(B)V")
    public void method439(byte arg0) {
        byte[] var2 = new byte[this.field1187 * this.field1186];
        if (arg0 != -6) {
            this.field1181 = -201;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1187; var4++) {
            for (int var5 = this.field1186 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1184[this.field1186 * var4 + var5];
            }
        }
        this.field1184 = var2;
        this.field1188 = this.field1190 - this.field1186 - this.field1188;
    }

    @OriginalMember(owner = "JQZFCGYF", name = "b", descriptor = "(Z)V")
    public void method440(boolean arg0) {
        byte[] var2 = new byte[this.field1187 * this.field1186];
        int var3 = 0;
        for (int var4 = this.field1187 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1186; var5++) {
                var2[var3++] = this.field1184[this.field1186 * var4 + var5];
            }
        }
        this.field1184 = var2;
        if (arg0) {
            this.field1181 = -302;
        }
        this.field1189 = this.field1191 - this.field1187 - this.field1189;
    }

    @OriginalMember(owner = "JQZFCGYF", name = "a", descriptor = "(IIII)V")
    public void method441(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1185.length; var5++) {
            int var6 = this.field1185[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1185[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1185[var5] & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1185[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "JQZFCGYF", name = "a", descriptor = "(IIZ)V")
    public void method442(int arg0, int arg1, boolean arg2) {
        int var4 = this.field1188 + arg1;
        int var5 = this.field1189 + arg0;
        int var6 = class35.field1130 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1187;
        int var9 = this.field1186;
        int var10 = class35.field1130 - var9;
        int var11 = 0;
        if (arg2) {
            return;
        }
        if (var5 < class35.field1132) {
            int var12 = class35.field1132 - var5;
            var8 -= var12;
            var5 = class35.field1132;
            var7 += var9 * var12;
            var6 += class35.field1130 * var12;
        }
        if (var5 + var8 > class35.field1133) {
            var8 -= var5 + var8 - class35.field1133;
        }
        if (var4 < class35.field1134) {
            int var13 = class35.field1134 - var4;
            var9 -= var13;
            var4 = class35.field1134;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class35.field1135) {
            int var14 = var4 + var9 - class35.field1135;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method443(var10, this.field1184, var6, this.field1185, var8, var7, true, class35.field1129, var11, var9);
        }
    }

    @OriginalMember(owner = "JQZFCGYF", name = "a", descriptor = "(I[BI[IIIZ[III)V")
    private void method443(int arg0, byte[] arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6, int[] arg7, int arg8, int arg9) {
        int var11 = -(arg9 >> 2);
        int var12 = -(arg9 & 0x3);
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg1[arg5++];
                if (var17 == 0) {
                    arg2++;
                } else {
                    arg7[arg2++] = arg3[var17 & 0xFF];
                }
                byte var18 = arg1[arg5++];
                if (var18 == 0) {
                    arg2++;
                } else {
                    arg7[arg2++] = arg3[var18 & 0xFF];
                }
                byte var19 = arg1[arg5++];
                if (var19 == 0) {
                    arg2++;
                } else {
                    arg7[arg2++] = arg3[var19 & 0xFF];
                }
                byte var20 = arg1[arg5++];
                if (var20 == 0) {
                    arg2++;
                } else {
                    arg7[arg2++] = arg3[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg1[arg5++];
                if (var16 == 0) {
                    arg2++;
                } else {
                    arg7[arg2++] = arg3[var16 & 0xFF];
                }
            }
            arg2 += arg0;
            arg5 += arg8;
        }
        if (arg6) {
            ;
        }
    }
}
