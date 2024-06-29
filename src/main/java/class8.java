import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CMELCUKG")
public class class8 extends class2 {

    @OriginalMember(owner = "client!CMELCUKG", name = "y", descriptor = "Z")
    private boolean field639 = false;

    @OriginalMember(owner = "client!CMELCUKG", name = "z", descriptor = "Z")
    private boolean field640 = false;

    @OriginalMember(owner = "client!CMELCUKG", name = "A", descriptor = "I")
    private int field641 = -3548;

    @OriginalMember(owner = "client!CMELCUKG", name = "B", descriptor = "I")
    private int field642 = 8;

    @OriginalMember(owner = "client!CMELCUKG", name = "C", descriptor = "Z")
    private boolean field643 = false;

    @OriginalMember(owner = "client!CMELCUKG", name = "D", descriptor = "Z")
    private boolean field644 = false;

    @OriginalMember(owner = "client!CMELCUKG", name = "K", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!CMELCUKG", name = "L", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!CMELCUKG", name = "F", descriptor = "[I")
    public int[] field646;

    @OriginalMember(owner = "client!CMELCUKG", name = "I", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!CMELCUKG", name = "J", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!CMELCUKG", name = "G", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!CMELCUKG", name = "H", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!CMELCUKG", name = "E", descriptor = "[B")
    public byte[] field645;

    @OriginalMember(owner = "client!CMELCUKG", name = "<init>", descriptor = "(LMAARFNGV;Ljava/lang/String;I)V")
    public class8(class29 arg0, String arg1, int arg2) {
        class14 var4 = new class14(arg0.method332(arg1 + ".dat", null), true);
        class14 var5 = new class14(arg0.method332("index.dat", null), true);
        var5.field707 = var4.method219();
        this.field651 = var5.method219();
        this.field652 = var5.method219();
        int var6 = var5.method217();
        this.field646 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field646[var7 + 1] = var5.method221();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field707 += 2;
            var4.field707 += var5.method219() * var5.method219();
            var5.field707++;
        }
        this.field649 = var5.method217();
        this.field650 = var5.method217();
        this.field647 = var5.method219();
        this.field648 = var5.method219();
        int var9 = var5.method217();
        int var10 = this.field648 * this.field647;
        this.field645 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field645[var11] = var4.method218();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field647; var12++) {
                for (int var13 = 0; var13 < this.field648; var13++) {
                    this.field645[this.field647 * var13 + var12] = var4.method218();
                }
            }
        }
    }

    @OriginalMember(owner = "client!CMELCUKG", name = "b", descriptor = "(I)V")
    public void method193(int arg0) {
        this.field651 /= 2;
        if (this.field641 != arg0) {
            return;
        }
        this.field652 /= 2;
        byte[] var2 = new byte[this.field652 * this.field651];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field648; var4++) {
            for (int var5 = 0; var5 < this.field647; var5++) {
                var2[(this.field649 + var5 >> 1) + (this.field650 + var4 >> 1) * this.field651] = this.field645[var3++];
            }
        }
        this.field645 = var2;
        this.field647 = this.field651;
        this.field648 = this.field652;
        this.field649 = 0;
        this.field650 = 0;
    }

    @OriginalMember(owner = "client!CMELCUKG", name = "c", descriptor = "(I)V")
    public void method194(int arg0) {
        if (this.field651 == this.field647 && this.field652 == this.field648) {
            return;
        }
        byte[] var2 = new byte[this.field652 * this.field651];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field648; var4++) {
            for (int var5 = 0; var5 < this.field647; var5++) {
                var2[(this.field650 + var4) * this.field651 + this.field649 + var5] = this.field645[var3++];
            }
        }
        this.field645 = var2;
        this.field647 = this.field651;
        this.field648 = this.field652;
        if (arg0 < 4 || arg0 > 4) {
            this.field639 = !this.field639;
        }
        this.field649 = 0;
        this.field650 = 0;
    }

    @OriginalMember(owner = "client!CMELCUKG", name = "b", descriptor = "(Z)V")
    public void method195(boolean arg0) {
        byte[] var2 = new byte[this.field648 * this.field647];
        int var3 = 0;
        if (!arg0) {
            return;
        }
        for (int var4 = 0; var4 < this.field648; var4++) {
            for (int var5 = this.field647 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field645[this.field647 * var4 + var5];
            }
        }
        this.field645 = var2;
        this.field649 = this.field651 - this.field647 - this.field649;
    }

    @OriginalMember(owner = "client!CMELCUKG", name = "a", descriptor = "(B)V")
    public void method196(byte arg0) {
        byte[] var2 = new byte[this.field648 * this.field647];
        int var3 = 0;
        for (int var4 = this.field648 - 1; var4 >= 0; var4--) {
            for (int var7 = 0; var7 < this.field647; var7++) {
                var2[var3++] = this.field645[this.field647 * var4 + var7];
            }
        }
        this.field645 = var2;
        this.field650 = this.field652 - this.field648 - this.field650;
        if (arg0 == 6) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!CMELCUKG", name = "a", descriptor = "(IIZI)V")
    public void method197(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field646.length; var6++) {
            int var7 = this.field646[var6] >> 16 & 0xFF;
            int var8 = arg0 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field646[var6] >> 8 & 0xFF;
            int var10 = arg3 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field646[var6] & 0xFF;
            int var12 = arg1 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field646[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "client!CMELCUKG", name = "a", descriptor = "(III)V")
    public void method198(int arg0, int arg1, int arg2) {
        int var4 = this.field649 + arg1;
        int var5 = this.field650 + arg2;
        int var6 = class2.field58 * var5 + var4;
        int var7 = 0;
        int var8 = this.field648;
        int var9 = this.field647;
        int var10 = class2.field58 - var9;
        int var11 = 0;
        if (arg0 != -24669) {
            return;
        }
        if (var5 < class2.field60) {
            int var12 = class2.field60 - var5;
            var8 -= var12;
            var5 = class2.field60;
            var7 += var9 * var12;
            var6 += class2.field58 * var12;
        }
        if (var5 + var8 > class2.field61) {
            var8 -= var5 + var8 - class2.field61;
        }
        if (var4 < class2.field62) {
            int var13 = class2.field62 - var4;
            var9 -= var13;
            var4 = class2.field62;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class2.field63) {
            int var14 = var4 + var9 - class2.field63;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method199(var10, var8, var9, var11, 8, this.field645, var6, class2.field57, var7, this.field646);
        }
    }

    @OriginalMember(owner = "client!CMELCUKG", name = "a", descriptor = "(IIIII[BI[II[I)V")
    private void method199(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int[] arg9) {
        if (this.field642 != arg4) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = -(arg2 >> 2);
        int var13 = -(arg2 & 0x3);
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                byte var18 = arg5[arg8++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg7[arg6++] = arg9[var18 & 0xFF];
                }
                byte var19 = arg5[arg8++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg7[arg6++] = arg9[var19 & 0xFF];
                }
                byte var20 = arg5[arg8++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg7[arg6++] = arg9[var20 & 0xFF];
                }
                byte var21 = arg5[arg8++];
                if (var21 == 0) {
                    arg6++;
                } else {
                    arg7[arg6++] = arg9[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg5[arg8++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg7[arg6++] = arg9[var17 & 0xFF];
                }
            }
            arg6 += arg0;
            arg8 += arg3;
        }
    }
}
