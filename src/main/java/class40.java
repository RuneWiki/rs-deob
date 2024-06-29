import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OCPHNIUN")
public class class40 extends class6 {

    @OriginalMember(owner = "client!OCPHNIUN", name = "z", descriptor = "Z")
    private boolean field1169 = true;

    @OriginalMember(owner = "client!OCPHNIUN", name = "A", descriptor = "Z")
    private boolean field1170 = false;

    @OriginalMember(owner = "client!OCPHNIUN", name = "H", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!OCPHNIUN", name = "I", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!OCPHNIUN", name = "C", descriptor = "[I")
    public int[] field1172;

    @OriginalMember(owner = "client!OCPHNIUN", name = "F", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!OCPHNIUN", name = "G", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!OCPHNIUN", name = "D", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!OCPHNIUN", name = "E", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!OCPHNIUN", name = "B", descriptor = "[B")
    public byte[] field1171;

    @OriginalMember(owner = "client!OCPHNIUN", name = "y", descriptor = "I")
    private static int field1168 = 536;

    @OriginalMember(owner = "client!OCPHNIUN", name = "<init>", descriptor = "(LUUIGNTAD;Ljava/lang/String;I)V")
    public class40(class59 arg0, String arg1, int arg2) {
        class10 var4 = new class10(arg0.method545(arg1 + ".dat", null), field1168);
        class10 var5 = new class10(arg0.method545("index.dat", null), field1168);
        var5.field646 = var4.method196();
        this.field1177 = var5.method196();
        this.field1178 = var5.method196();
        int var6 = var5.method194();
        this.field1172 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1172[var7 + 1] = var5.method198();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field646 += 2;
            var4.field646 += var5.method196() * var5.method196();
            var5.field646++;
        }
        this.field1175 = var5.method194();
        this.field1176 = var5.method194();
        this.field1173 = var5.method196();
        this.field1174 = var5.method196();
        int var9 = var5.method194();
        int var10 = this.field1174 * this.field1173;
        this.field1171 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1171[var11] = var4.method195();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1173; var12++) {
                for (int var13 = 0; var13 < this.field1174; var13++) {
                    this.field1171[this.field1173 * var13 + var12] = var4.method195();
                }
            }
        }
    }

    @OriginalMember(owner = "client!OCPHNIUN", name = "c", descriptor = "(I)V")
    public void method419(int arg0) {
        this.field1177 /= 2;
        if (arg0 != -49186) {
            return;
        }
        this.field1178 /= 2;
        byte[] var2 = new byte[this.field1178 * this.field1177];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1174; var4++) {
            for (int var5 = 0; var5 < this.field1173; var5++) {
                var2[(this.field1175 + var5 >> 1) + (this.field1176 + var4 >> 1) * this.field1177] = this.field1171[var3++];
            }
        }
        this.field1171 = var2;
        this.field1173 = this.field1177;
        this.field1174 = this.field1178;
        this.field1175 = 0;
        this.field1176 = 0;
    }

    @OriginalMember(owner = "client!OCPHNIUN", name = "d", descriptor = "(I)V")
    public void method420(int arg0) {
        if (arg0 != 0 || this.field1177 == this.field1173 && this.field1178 == this.field1174) {
            return;
        }
        byte[] var2 = new byte[this.field1178 * this.field1177];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1174; var4++) {
            for (int var5 = 0; var5 < this.field1173; var5++) {
                var2[(this.field1176 + var4) * this.field1177 + this.field1175 + var5] = this.field1171[var3++];
            }
        }
        this.field1171 = var2;
        this.field1173 = this.field1177;
        this.field1174 = this.field1178;
        this.field1175 = 0;
        this.field1176 = 0;
    }

    @OriginalMember(owner = "client!OCPHNIUN", name = "e", descriptor = "(I)V")
    public void method421(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        byte[] var2 = new byte[this.field1174 * this.field1173];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1174; var4++) {
            for (int var5 = this.field1173 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1171[this.field1173 * var4 + var5];
            }
        }
        this.field1171 = var2;
        this.field1175 = this.field1177 - this.field1173 - this.field1175;
    }

    @OriginalMember(owner = "client!OCPHNIUN", name = "a", descriptor = "(B)V")
    public void method422(byte arg0) {
        byte[] var2 = new byte[this.field1174 * this.field1173];
        int var3 = 0;
        for (int var4 = this.field1174 - 1; var4 >= 0; var4--) {
            for (int var6 = 0; var6 < this.field1173; var6++) {
                var2[var3++] = this.field1171[this.field1173 * var4 + var6];
            }
        }
        this.field1171 = var2;
        if (arg0 == 6) {
            boolean var5 = false;
            this.field1176 = this.field1178 - this.field1174 - this.field1176;
        }
    }

    @OriginalMember(owner = "client!OCPHNIUN", name = "a", descriptor = "(IZII)V")
    public void method423(int arg0, boolean arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1172.length; var5++) {
            int var6 = this.field1172[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1172[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1172[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1172[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg1) {
            this.field1169 = !this.field1169;
        }
    }

    @OriginalMember(owner = "client!OCPHNIUN", name = "a", descriptor = "(IBI)V")
    public void method424(int arg0, byte arg1, int arg2) {
        int var4 = this.field1175 + arg0;
        int var5 = this.field1176 + arg2;
        int var6 = class6.field49 * var5 + var4;
        int var7 = 0;
        if (arg1 != 2) {
            return;
        }
        int var8 = this.field1174;
        int var9 = this.field1173;
        int var10 = class6.field49 - var9;
        int var11 = 0;
        if (var5 < class6.field51) {
            int var12 = class6.field51 - var5;
            var8 -= var12;
            var5 = class6.field51;
            var7 += var9 * var12;
            var6 += class6.field49 * var12;
        }
        if (var5 + var8 > class6.field52) {
            var8 -= var5 + var8 - class6.field52;
        }
        if (var4 < class6.field53) {
            int var13 = class6.field53 - var4;
            var9 -= var13;
            var4 = class6.field53;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class6.field54) {
            int var14 = var4 + var9 - class6.field54;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method425(var7, (byte) 105, this.field1172, var9, var11, var6, class6.field48, var10, var8, this.field1171);
        }
    }

    @OriginalMember(owner = "client!OCPHNIUN", name = "a", descriptor = "(IB[IIII[III[B)V")
    private void method425(int arg0, byte arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, byte[] arg9) {
        int var11 = -(arg3 >> 2);
        int var12 = -(arg3 & 0x3);
        if (arg1 != 105) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg9[arg0++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg9[arg0++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg9[arg0++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg2[var20 & 0xFF];
                }
                byte var21 = arg9[arg0++];
                if (var21 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg2[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg9[arg0++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg2[var17 & 0xFF];
                }
            }
            arg5 += arg7;
            arg0 += arg4;
        }
    }
}
