import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BVXAXAEI")
public class class4 extends class52 {

    @OriginalMember(owner = "client!BVXAXAEI", name = "x", descriptor = "Z")
    private boolean field52 = false;

    @OriginalMember(owner = "client!BVXAXAEI", name = "y", descriptor = "I")
    private int field53 = 10685;

    @OriginalMember(owner = "client!BVXAXAEI", name = "z", descriptor = "I")
    private int field54 = -44900;

    @OriginalMember(owner = "client!BVXAXAEI", name = "A", descriptor = "B")
    private byte field55 = 92;

    @OriginalMember(owner = "client!BVXAXAEI", name = "B", descriptor = "B")
    private byte field56 = 92;

    @OriginalMember(owner = "client!BVXAXAEI", name = "C", descriptor = "I")
    private int field57 = 186;

    @OriginalMember(owner = "client!BVXAXAEI", name = "J", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!BVXAXAEI", name = "K", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!BVXAXAEI", name = "E", descriptor = "[I")
    public int[] field59;

    @OriginalMember(owner = "client!BVXAXAEI", name = "H", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!BVXAXAEI", name = "I", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!BVXAXAEI", name = "F", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!BVXAXAEI", name = "G", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!BVXAXAEI", name = "D", descriptor = "[B")
    public byte[] field58;

    @OriginalMember(owner = "client!BVXAXAEI", name = "<init>", descriptor = "(LNXFIIFAD;Ljava/lang/String;I)V")
    public class4(class41 arg0, String arg1, int arg2) {
        class37 var4 = new class37(arg0.method431(arg1 + ".dat", null), -670);
        class37 var5 = new class37(arg0.method431("index.dat", null), -670);
        var5.field1212 = var4.method388();
        this.field64 = var5.method388();
        this.field65 = var5.method388();
        int var6 = var5.method386();
        this.field59 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field59[var7 + 1] = var5.method390();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1212 += 2;
            var4.field1212 += var5.method388() * var5.method388();
            var5.field1212++;
        }
        this.field62 = var5.method386();
        this.field63 = var5.method386();
        this.field60 = var5.method388();
        this.field61 = var5.method388();
        int var9 = var5.method386();
        int var10 = this.field61 * this.field60;
        this.field58 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field58[var11] = var4.method387();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field60; var12++) {
                    for (int var13 = 0; var13 < this.field61; var13++) {
                        this.field58[this.field60 * var13 + var12] = var4.method387();
                    }
                }
            }
            if (class3.field51) {
            }
        }
    }

    @OriginalMember(owner = "client!BVXAXAEI", name = "b", descriptor = "(I)V")
    public void method15(int arg0) {
        this.field64 /= 2;
        this.field65 /= 2;
        byte[] var2 = new byte[this.field65 * this.field64];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field61; var4++) {
            for (int var6 = 0; var6 < this.field60; var6++) {
                var2[(this.field62 + var6 >> 1) + (this.field63 + var4 >> 1) * this.field64] = this.field58[var3++];
            }
        }
        this.field58 = var2;
        this.field60 = this.field64;
        this.field61 = this.field65;
        this.field62 = 0;
        this.field63 = 0;
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "client!BVXAXAEI", name = "a", descriptor = "(Z)V")
    public void method16(boolean arg0) {
        if (arg0 || this.field64 == this.field60 && this.field65 == this.field61) {
            return;
        }
        byte[] var2 = new byte[this.field65 * this.field64];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field61; var4++) {
            for (int var5 = 0; var5 < this.field60; var5++) {
                var2[(this.field63 + var4) * this.field64 + this.field62 + var5] = this.field58[var3++];
            }
        }
        this.field58 = var2;
        this.field60 = this.field64;
        this.field61 = this.field65;
        this.field62 = 0;
        this.field63 = 0;
    }

    @OriginalMember(owner = "client!BVXAXAEI", name = "b", descriptor = "(B)V")
    public void method17(byte arg0) {
        byte[] var2 = new byte[this.field61 * this.field60];
        int var3 = 0;
        if (arg0 != 6) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < this.field61; var5++) {
            for (int var6 = this.field60 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field58[this.field60 * var5 + var6];
            }
        }
        this.field58 = var2;
        this.field62 = this.field64 - this.field60 - this.field62;
    }

    @OriginalMember(owner = "client!BVXAXAEI", name = "b", descriptor = "(Z)V")
    public void method18(boolean arg0) {
        byte[] var2 = new byte[this.field61 * this.field60];
        int var3 = 0;
        if (arg0) {
            return;
        }
        for (int var4 = this.field61 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field60; var5++) {
                var2[var3++] = this.field58[this.field60 * var4 + var5];
            }
        }
        this.field58 = var2;
        this.field63 = this.field65 - this.field61 - this.field63;
    }

    @OriginalMember(owner = "client!BVXAXAEI", name = "a", descriptor = "(IIIZ)V")
    public void method19(int arg0, int arg1, int arg2, boolean arg3) {
        for (int var5 = 0; var5 < this.field59.length; var5++) {
            int var6 = this.field59[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field59[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field59[var5] & 0xFF;
            int var11 = arg2 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field59[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3) {
            ;
        }
    }

    @OriginalMember(owner = "client!BVXAXAEI", name = "a", descriptor = "(III)V")
    public void method20(int arg0, int arg1, int arg2) {
        int var4 = this.field62 + arg2;
        if (arg0 != 48946) {
            this.field52 = !this.field52;
        }
        int var5 = this.field63 + arg1;
        int var6 = class52.field1437 * var5 + var4;
        int var7 = 0;
        int var8 = this.field61;
        int var9 = this.field60;
        int var10 = class52.field1437 - var9;
        int var11 = 0;
        if (var5 < class52.field1439) {
            int var12 = class52.field1439 - var5;
            var8 -= var12;
            var5 = class52.field1439;
            var7 += var9 * var12;
            var6 += class52.field1437 * var12;
        }
        if (var5 + var8 > class52.field1440) {
            var8 -= var5 + var8 - class52.field1440;
        }
        if (var4 < class52.field1441) {
            int var13 = class52.field1441 - var4;
            var9 -= var13;
            var4 = class52.field1441;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class52.field1442) {
            int var14 = var4 + var9 - class52.field1442;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method21(var6, var10, this.field59, var11, class52.field1436, var9, 0, var7, var8, this.field58);
        }
    }

    @OriginalMember(owner = "client!BVXAXAEI", name = "a", descriptor = "(II[II[IIIII[B)V")
    private void method21(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        int var11 = -(arg5 >> 2);
        int var12 = -(arg5 & 0x3);
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg9[arg7++];
                if (var17 == 0) {
                    arg0++;
                } else {
                    arg4[arg0++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg9[arg7++];
                if (var18 == 0) {
                    arg0++;
                } else {
                    arg4[arg0++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg9[arg7++];
                if (var19 == 0) {
                    arg0++;
                } else {
                    arg4[arg0++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg9[arg7++];
                if (var20 == 0) {
                    arg0++;
                } else {
                    arg4[arg0++] = arg2[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg9[arg7++];
                if (var16 == 0) {
                    arg0++;
                } else {
                    arg4[arg0++] = arg2[var16 & 0xFF];
                }
            }
            arg0 += arg1;
            arg7 += arg3;
        }
        if (arg6 != 0) {
            this.field52 = !this.field52;
        }
    }
}
