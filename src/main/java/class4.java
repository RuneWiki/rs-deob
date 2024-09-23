import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BKYZHYRW")
public class class4 extends class53 {

    @OriginalMember(owner = "BKYZHYRW", name = "A", descriptor = "I")
    private int field28 = -210;

    @OriginalMember(owner = "BKYZHYRW", name = "B", descriptor = "Z")
    private boolean field29 = true;

    @OriginalMember(owner = "BKYZHYRW", name = "C", descriptor = "Z")
    private boolean field30 = true;

    @OriginalMember(owner = "BKYZHYRW", name = "D", descriptor = "Z")
    private boolean field31 = true;

    @OriginalMember(owner = "BKYZHYRW", name = "K", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "BKYZHYRW", name = "L", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "BKYZHYRW", name = "F", descriptor = "[I")
    public int[] field33;

    @OriginalMember(owner = "BKYZHYRW", name = "I", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "BKYZHYRW", name = "J", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "BKYZHYRW", name = "G", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "BKYZHYRW", name = "H", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "BKYZHYRW", name = "E", descriptor = "[B")
    public byte[] field32;

    @OriginalMember(owner = "BKYZHYRW", name = "<init>", descriptor = "(LDYBMLHQM;Ljava/lang/String;I)V")
    public class4(class16 arg0, String arg1, int arg2) {
        class29 var4 = new class29((byte) -28, arg0.method248(arg1 + ".dat", null));
        class29 var5 = new class29((byte) -28, arg0.method248("index.dat", null));
        var5.field1107 = var4.method310();
        this.field38 = var5.method310();
        this.field39 = var5.method310();
        int var6 = var5.method308();
        this.field33 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field33[var7 + 1] = var5.method312();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1107 += 2;
            var4.field1107 += var5.method310() * var5.method310();
            var5.field1107++;
        }
        this.field36 = var5.method308();
        this.field37 = var5.method308();
        this.field34 = var5.method310();
        this.field35 = var5.method310();
        int var9 = var5.method308();
        int var10 = this.field35 * this.field34;
        this.field32 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field32[var11] = var4.method309();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field34; var12++) {
                for (int var13 = 0; var13 < this.field35; var13++) {
                    this.field32[this.field34 * var13 + var12] = var4.method309();
                }
            }
        }
    }

    @OriginalMember(owner = "BKYZHYRW", name = "c", descriptor = "(Z)V")
    public void method5(boolean arg0) {
        this.field38 /= 2;
        this.field39 /= 2;
        byte[] var2 = new byte[this.field39 * this.field38];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field35; var4++) {
            for (int var5 = 0; var5 < this.field34; var5++) {
                var2[(this.field36 + var5 >> 1) + (this.field37 + var4 >> 1) * this.field38] = this.field32[var3++];
            }
        }
        this.field32 = var2;
        this.field34 = this.field38;
        this.field35 = this.field39;
        if (!arg0) {
            this.field36 = 0;
            this.field37 = 0;
        }
    }

    @OriginalMember(owner = "BKYZHYRW", name = "a", descriptor = "(I)V")
    public void method6(int arg0) {
        if (this.field38 == this.field34 && this.field39 == this.field35) {
            return;
        }
        byte[] var2 = new byte[this.field39 * this.field38];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field35; var4++) {
            for (int var5 = 0; var5 < this.field34; var5++) {
                var2[(this.field37 + var4) * this.field38 + this.field36 + var5] = this.field32[var3++];
            }
        }
        this.field32 = var2;
        this.field34 = this.field38;
        this.field35 = this.field39;
        this.field36 = 0;
        if (arg0 >= 0) {
            this.field30 = !this.field30;
        }
        this.field37 = 0;
    }

    @OriginalMember(owner = "BKYZHYRW", name = "b", descriptor = "(I)V")
    public void method7(int arg0) {
        byte[] var2 = new byte[this.field35 * this.field34];
        if (arg0 != 0) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field35; var4++) {
            for (int var5 = this.field34 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field32[this.field34 * var4 + var5];
            }
        }
        this.field32 = var2;
        this.field36 = this.field38 - this.field34 - this.field36;
    }

    @OriginalMember(owner = "BKYZHYRW", name = "a", descriptor = "(B)V")
    public void method8(byte arg0) {
        byte[] var2 = new byte[this.field35 * this.field34];
        int var3 = 0;
        for (int var4 = this.field35 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field34; var5++) {
                var2[var3++] = this.field32[this.field34 * var4 + var5];
            }
        }
        if (arg0 == 6) {
            this.field32 = var2;
            this.field37 = this.field39 - this.field35 - this.field37;
        }
    }

    @OriginalMember(owner = "BKYZHYRW", name = "a", descriptor = "(IIII)V")
    public void method9(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field33.length; var5++) {
            int var6 = this.field33[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field33[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field33[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field33[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "BKYZHYRW", name = "a", descriptor = "(IZI)V")
    public void method10(int arg0, boolean arg1, int arg2) {
        int var4 = this.field36 + arg2;
        if (!arg1) {
            this.field31 = !this.field31;
        }
        int var5 = this.field37 + arg0;
        int var6 = class53.field1382 * var5 + var4;
        int var7 = 0;
        int var8 = this.field35;
        int var9 = this.field34;
        int var10 = class53.field1382 - var9;
        int var11 = 0;
        if (var5 < class53.field1384) {
            int var12 = class53.field1384 - var5;
            var8 -= var12;
            var5 = class53.field1384;
            var7 += var9 * var12;
            var6 += class53.field1382 * var12;
        }
        if (var5 + var8 > class53.field1385) {
            var8 -= var5 + var8 - class53.field1385;
        }
        if (var4 < class53.field1386) {
            int var13 = class53.field1386 - var4;
            var9 -= var13;
            var4 = class53.field1386;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class53.field1387) {
            int var14 = var4 + var9 - class53.field1387;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method11(this.field33, var8, var6, 0, var10, var11, var7, var9, class53.field1381, this.field32);
        }
    }

    @OriginalMember(owner = "BKYZHYRW", name = "a", descriptor = "([IIIIIIII[I[B)V")
    private void method11(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9) {
        int var11 = -(arg7 >> 2);
        int var12 = -(arg7 & 0x3);
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg9[arg6++];
                if (var17 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg0[var17 & 0xFF];
                }
                byte var18 = arg9[arg6++];
                if (var18 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg0[var18 & 0xFF];
                }
                byte var19 = arg9[arg6++];
                if (var19 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg0[var19 & 0xFF];
                }
                byte var20 = arg9[arg6++];
                if (var20 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg0[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg9[arg6++];
                if (var16 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg0[var16 & 0xFF];
                }
            }
            arg2 += arg4;
            arg6 += arg5;
        }
        if (arg3 != 0) {
            this.field29 = !this.field29;
        }
    }
}
