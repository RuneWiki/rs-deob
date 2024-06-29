import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MRCVLIXG")
public class class38 extends class5 {

    @OriginalMember(owner = "client!MRCVLIXG", name = "x", descriptor = "I")
    private int field1136 = 670;

    @OriginalMember(owner = "client!MRCVLIXG", name = "y", descriptor = "Z")
    private boolean field1137 = false;

    @OriginalMember(owner = "client!MRCVLIXG", name = "z", descriptor = "I")
    private int field1138 = -28345;

    @OriginalMember(owner = "client!MRCVLIXG", name = "A", descriptor = "Z")
    private boolean field1139 = false;

    @OriginalMember(owner = "client!MRCVLIXG", name = "B", descriptor = "Z")
    private boolean field1140 = false;

    @OriginalMember(owner = "client!MRCVLIXG", name = "C", descriptor = "Z")
    private boolean field1141 = false;

    @OriginalMember(owner = "client!MRCVLIXG", name = "J", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!MRCVLIXG", name = "K", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!MRCVLIXG", name = "E", descriptor = "[I")
    public int[] field1143;

    @OriginalMember(owner = "client!MRCVLIXG", name = "H", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!MRCVLIXG", name = "I", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "client!MRCVLIXG", name = "F", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!MRCVLIXG", name = "G", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!MRCVLIXG", name = "D", descriptor = "[B")
    public byte[] field1142;

    @OriginalMember(owner = "client!MRCVLIXG", name = "<init>", descriptor = "(LHBJEXSJX;Ljava/lang/String;I)V")
    public class38(class24 arg0, String arg1, int arg2) {
        class18 var4 = new class18(arg0.method348(arg1 + ".dat", null), 0);
        class18 var5 = new class18(arg0.method348("index.dat", null), 0);
        var5.field794 = var4.method241();
        this.field1148 = var5.method241();
        this.field1149 = var5.method241();
        int var6 = var5.method239();
        this.field1143 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1143[var7 + 1] = var5.method243();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field794 += 2;
            var4.field794 += var5.method241() * var5.method241();
            var5.field794++;
        }
        this.field1146 = var5.method239();
        this.field1147 = var5.method239();
        this.field1144 = var5.method241();
        this.field1145 = var5.method241();
        int var9 = var5.method239();
        int var10 = this.field1145 * this.field1144;
        this.field1142 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1142[var11] = var4.method240();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1144; var12++) {
                    for (int var13 = 0; var13 < this.field1145; var13++) {
                        this.field1142[this.field1144 * var13 + var12] = var4.method240();
                    }
                }
            }
            if (class13.field714) {
            }
        }
    }

    @OriginalMember(owner = "client!MRCVLIXG", name = "c", descriptor = "(I)V")
    public void method396(int arg0) {
        this.field1148 /= 2;
        this.field1149 /= 2;
        byte[] var2 = new byte[this.field1149 * this.field1148];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1145; var4++) {
            for (int var5 = 0; var5 < this.field1144; var5++) {
                var2[(this.field1146 + var5 >> 1) + (this.field1147 + var4 >> 1) * this.field1148] = this.field1142[var3++];
            }
        }
        this.field1142 = var2;
        this.field1144 = this.field1148;
        this.field1145 = this.field1149;
        this.field1146 = 0;
        if (arg0 == 3) {
            this.field1147 = 0;
        }
    }

    @OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "(Z)V")
    public void method397(boolean arg0) {
        if (this.field1148 == this.field1144 && this.field1149 == this.field1145) {
            return;
        }
        byte[] var2 = new byte[this.field1149 * this.field1148];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1145; var4++) {
            for (int var5 = 0; var5 < this.field1144; var5++) {
                var2[(this.field1147 + var4) * this.field1148 + this.field1146 + var5] = this.field1142[var3++];
            }
        }
        if (!arg0) {
            return;
        }
        this.field1142 = var2;
        this.field1144 = this.field1148;
        this.field1145 = this.field1149;
        this.field1146 = 0;
        this.field1147 = 0;
    }

    @OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "(B)V")
    public void method398(byte arg0) {
        byte[] var2 = new byte[this.field1145 * this.field1144];
        if (arg0 != 1) {
            this.field1138 = -387;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1145; var4++) {
            for (int var5 = this.field1144 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1142[this.field1144 * var4 + var5];
            }
        }
        this.field1142 = var2;
        this.field1146 = this.field1148 - this.field1144 - this.field1146;
    }

    @OriginalMember(owner = "client!MRCVLIXG", name = "d", descriptor = "(I)V")
    public void method399(int arg0) {
        byte[] var2 = new byte[this.field1145 * this.field1144];
        int var3 = 0;
        for (int var4 = this.field1145 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1144; var5++) {
                var2[var3++] = this.field1142[this.field1144 * var4 + var5];
            }
        }
        this.field1142 = var2;
        this.field1147 = this.field1149 - this.field1145 - this.field1147;
        if (arg0 < 6 || arg0 > 6) {
            ;
        }
    }

    @OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "(IIIB)V")
    public void method400(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -108) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field1143.length; var6++) {
            int var7 = this.field1143[var6] >> 16 & 0xFF;
            int var8 = arg2 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1143[var6] >> 8 & 0xFF;
            int var10 = arg0 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1143[var6] & 0xFF;
            int var12 = arg1 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1143[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "(III)V")
    public void method401(int arg0, int arg1, int arg2) {
        if (arg0 < 1 || arg0 > 1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = this.field1146 + arg1;
        int var6 = this.field1147 + arg2;
        int var7 = class5.field61 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1145;
        int var10 = this.field1144;
        int var11 = class5.field61 - var10;
        int var12 = 0;
        if (var6 < class5.field63) {
            int var13 = class5.field63 - var6;
            var9 -= var13;
            var6 = class5.field63;
            var8 += var10 * var13;
            var7 += class5.field61 * var13;
        }
        if (var6 + var9 > class5.field64) {
            var9 -= var6 + var9 - class5.field64;
        }
        if (var5 < class5.field65) {
            int var14 = class5.field65 - var5;
            var10 -= var14;
            var5 = class5.field65;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class5.field66) {
            int var15 = var5 + var10 - class5.field66;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method402(class5.field60, var10, var9, var7, var8, var12, this.field1142, 4, var11, this.field1143);
        }
    }

    @OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "([IIIIII[BII[I)V")
    private void method402(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int[] arg9) {
        int var11 = -(arg1 >> 2);
        int var12 = -(arg1 & 0x3);
        for (int var13 = -arg2; var13 < 0; var13++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg6[arg4++];
                if (var18 == 0) {
                    arg3++;
                } else {
                    arg0[arg3++] = arg9[var18 & 0xFF];
                }
                byte var19 = arg6[arg4++];
                if (var19 == 0) {
                    arg3++;
                } else {
                    arg0[arg3++] = arg9[var19 & 0xFF];
                }
                byte var20 = arg6[arg4++];
                if (var20 == 0) {
                    arg3++;
                } else {
                    arg0[arg3++] = arg9[var20 & 0xFF];
                }
                byte var21 = arg6[arg4++];
                if (var21 == 0) {
                    arg3++;
                } else {
                    arg0[arg3++] = arg9[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg6[arg4++];
                if (var17 == 0) {
                    arg3++;
                } else {
                    arg0[arg3++] = arg9[var17 & 0xFF];
                }
            }
            arg3 += arg8;
            arg4 += arg5;
        }
        if (arg7 != 4) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }
}
