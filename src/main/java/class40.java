import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OJMMOVXV")
public class class40 extends class45 {

    @OriginalMember(owner = "client!OJMMOVXV", name = "w", descriptor = "Z")
    private boolean field1055 = true;

    @OriginalMember(owner = "client!OJMMOVXV", name = "x", descriptor = "Z")
    private boolean field1056 = true;

    @OriginalMember(owner = "client!OJMMOVXV", name = "y", descriptor = "I")
    private int field1057 = 165;

    @OriginalMember(owner = "client!OJMMOVXV", name = "F", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!OJMMOVXV", name = "G", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!OJMMOVXV", name = "A", descriptor = "[I")
    public int[] field1059;

    @OriginalMember(owner = "client!OJMMOVXV", name = "D", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!OJMMOVXV", name = "E", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!OJMMOVXV", name = "B", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!OJMMOVXV", name = "C", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!OJMMOVXV", name = "z", descriptor = "[B")
    public byte[] field1058;

    @OriginalMember(owner = "client!OJMMOVXV", name = "<init>", descriptor = "(LFXNTEMPE;Ljava/lang/String;I)V")
    public class40(class18 arg0, String arg1, int arg2) {
        class50 var4 = new class50(arg0.method212(arg1 + ".dat", null), -46859);
        class50 var5 = new class50(arg0.method212("index.dat", null), -46859);
        var5.field1225 = var4.method390();
        this.field1064 = var5.method390();
        this.field1065 = var5.method390();
        int var6 = var5.method388();
        this.field1059 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1059[var7 + 1] = var5.method392();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1225 += 2;
            var4.field1225 += var5.method390() * var5.method390();
            var5.field1225++;
        }
        this.field1062 = var5.method388();
        this.field1063 = var5.method388();
        this.field1060 = var5.method390();
        this.field1061 = var5.method390();
        int var9 = var5.method388();
        int var10 = this.field1061 * this.field1060;
        this.field1058 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1058[var11] = var4.method389();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1060; var12++) {
                for (int var13 = 0; var13 < this.field1061; var13++) {
                    this.field1058[this.field1060 * var13 + var12] = var4.method389();
                }
            }
        }
    }

    @OriginalMember(owner = "client!OJMMOVXV", name = "a", descriptor = "(Z)V")
    public void method315(boolean arg0) {
        this.field1064 /= 2;
        this.field1065 /= 2;
        byte[] var2 = new byte[this.field1065 * this.field1064];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1061; var4++) {
            for (int var6 = 0; var6 < this.field1060; var6++) {
                var2[(this.field1062 + var6 >> 1) + (this.field1063 + var4 >> 1) * this.field1064] = this.field1058[var3++];
            }
        }
        this.field1058 = var2;
        this.field1060 = this.field1064;
        this.field1061 = this.field1065;
        this.field1062 = 0;
        this.field1063 = 0;
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "client!OJMMOVXV", name = "b", descriptor = "(Z)V")
    public void method316(boolean arg0) {
        if (this.field1064 == this.field1060 && this.field1065 == this.field1061) {
            return;
        }
        byte[] var2 = new byte[this.field1065 * this.field1064];
        int var3 = 0;
        if (!arg0) {
            return;
        }
        for (int var4 = 0; var4 < this.field1061; var4++) {
            for (int var5 = 0; var5 < this.field1060; var5++) {
                var2[(this.field1063 + var4) * this.field1064 + this.field1062 + var5] = this.field1058[var3++];
            }
        }
        this.field1058 = var2;
        this.field1060 = this.field1064;
        this.field1061 = this.field1065;
        this.field1062 = 0;
        this.field1063 = 0;
    }

    @OriginalMember(owner = "client!OJMMOVXV", name = "c", descriptor = "(Z)V")
    public void method317(boolean arg0) {
        byte[] var2 = new byte[this.field1061 * this.field1060];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1061; var4++) {
            for (int var5 = this.field1060 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1058[this.field1060 * var4 + var5];
            }
        }
        this.field1058 = var2;
        this.field1062 = this.field1064 - this.field1060 - this.field1062;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!OJMMOVXV", name = "b", descriptor = "(I)V")
    public void method318(int arg0) {
        byte[] var2 = new byte[this.field1061 * this.field1060];
        int var3 = 0;
        for (int var4 = this.field1061 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1060; var5++) {
                var2[var3++] = this.field1058[this.field1060 * var4 + var5];
            }
        }
        this.field1058 = var2;
        if (arg0 != 22940) {
            this.field1057 = -347;
        }
        this.field1063 = this.field1065 - this.field1061 - this.field1063;
    }

    @OriginalMember(owner = "client!OJMMOVXV", name = "a", descriptor = "(IIIZ)V")
    public void method319(int arg0, int arg1, int arg2, boolean arg3) {
        for (int var5 = 0; var5 < this.field1059.length; var5++) {
            int var6 = this.field1059[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1059[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1059[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1059[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3) {
            ;
        }
    }

    @OriginalMember(owner = "client!OJMMOVXV", name = "a", descriptor = "(BII)V")
    public void method320(byte arg0, int arg1, int arg2) {
        if (arg0 != -91) {
            return;
        }
        int var4 = this.field1062 + arg1;
        int var5 = this.field1063 + arg2;
        int var6 = class45.field1110 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1061;
        int var9 = this.field1060;
        int var10 = class45.field1110 - var9;
        int var11 = 0;
        if (var5 < class45.field1112) {
            int var12 = class45.field1112 - var5;
            var8 -= var12;
            var5 = class45.field1112;
            var7 += var9 * var12;
            var6 += class45.field1110 * var12;
        }
        if (var5 + var8 > class45.field1113) {
            var8 -= var5 + var8 - class45.field1113;
        }
        if (var4 < class45.field1114) {
            int var13 = class45.field1114 - var4;
            var9 -= var13;
            var4 = class45.field1114;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class45.field1115) {
            int var14 = var4 + var9 - class45.field1115;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method321(var8, var9, class45.field1109, this.field1059, var6, 912, this.field1058, var11, var10, var7);
        }
    }

    @OriginalMember(owner = "client!OJMMOVXV", name = "a", descriptor = "(II[I[III[BIII)V")
    private void method321(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg1 >> 2);
        int var12 = -(arg1 & 0x3);
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg6[arg9++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg3[var17 & 0xFF];
                }
                byte var18 = arg6[arg9++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg3[var18 & 0xFF];
                }
                byte var19 = arg6[arg9++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg3[var19 & 0xFF];
                }
                byte var20 = arg6[arg9++];
                if (var20 == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg3[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg6[arg9++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg3[var16 & 0xFF];
                }
            }
            arg4 += arg8;
            arg9 += arg7;
        }
        if (arg5 > 0) {
            ;
        }
    }
}
