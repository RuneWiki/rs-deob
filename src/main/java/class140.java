import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class140 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[B")
    public byte[] field1994;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[B")
    public byte[] field1995;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
    public int[] field1991;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([B)[Lua;")
    private static final class140[] method853(byte[] arg0) {
        class425 var1 = new class425(arg0);
        var1.field5830 = arg0.length - 2;
        int var2 = var1.method2508(true);
        class140[] var3 = new class140[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class140();
        }
        var1.field5830 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2508(true);
        int var6 = var1.method2508(true);
        int var7 = (var1.method2503(true) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1992 = var1.method2508(true);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1988 = var1.method2508(true);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1993 = var1.method2508(true);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1989 = var1.method2508(true);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class140 var32 = var3[var12];
            var32.field1990 = var5 - var32.field1993 - var32.field1992;
            var32.field1996 = var6 - var32.field1989 - var32.field1988;
        }
        var1.field5830 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2498(3);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1991 = var13;
        }
        var1.field5830 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class140 var17 = var3[var16];
            int var18 = var17.field1993 * var17.field1989;
            var17.field1995 = new byte[var18];
            int var19 = var1.method2503(true);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1994 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1995[var24] = var1.method2480(-8315);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1994[var25] = var1.method2480(-8315);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1993; var27++) {
                        for (int var31 = 0; var31 < var17.field1989; var31++) {
                            var17.field1995[var17.field1993 * var31 + var27] = var1.method2480(-8315);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1993; var28++) {
                        for (int var29 = 0; var29 < var17.field1989; var29++) {
                            byte var30 = var17.field1994[var17.field1993 * var29 + var28] = var1.method2480(-8315);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1994 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1995[var20] = var1.method2480(-8315);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1993; var21++) {
                    for (int var22 = 0; var22 < var17.field1989; var22++) {
                        var17.field1995[var17.field1993 * var22 + var21] = var1.method2480(-8315);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lfc;II)Lua;")
    public static final class140 method854(class343 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2029(arg1, arg2, 0);
        return var3 == null ? null : method853(var3)[0];
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public final void method855(int arg0) {
        int var2 = -1;
        if (this.field1991.length < 255) {
            for (int var3 = 0; var3 < this.field1991.length; var3++) {
                if (this.field1991[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1991.length;
                int[] var4 = new int[this.field1991.length + 1];
                class415.method2425(this.field1991, 0, var4, 0, this.field1991.length);
                this.field1991 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1991.length; var9++) {
                int var15 = this.field1991[var9];
                int var16 = var15 >> 16 & 0xFF;
                int var17 = var15 >> 8 & 0xFF;
                int var18 = var15 & 0xFF;
                int var19 = var6 - var16;
                if (var19 < 0) {
                    var19 = -var19;
                }
                int var20 = var7 - var17;
                if (var20 < 0) {
                    var20 = -var20;
                }
                int var21 = var8 - var18;
                if (var21 < 0) {
                    var21 = -var21;
                }
                int var22 = var19 + var20 + var21;
                if (var22 < var5) {
                    var5 = var22;
                    var2 = var9;
                }
            }
        }
        int var10 = 0;
        byte[] var11 = new byte[this.field1993 * this.field1989];
        for (int var12 = 0; var12 < this.field1989; var12++) {
            for (int var13 = 0; var13 < this.field1993; var13++) {
                int var14 = this.field1995[var10] & 0xFF;
                if (this.field1991[var14] == 0) {
                    if (var13 > 0 && this.field1991[this.field1995[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1991[this.field1995[var10 - this.field1993] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1993 - 1 && this.field1991[this.field1995[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1989 - 1 && this.field1991[this.field1995[this.field1993 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1995 = var11;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
    public final void method856() {
        int var1 = this.method863();
        int var2 = this.method859();
        if (this.field1993 == var1 && this.field1989 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1994 == null) {
            for (int var9 = 0; var9 < this.field1989; var9++) {
                int var10 = this.field1993 * var9;
                int var11 = (this.field1988 + var9) * var1 + this.field1992;
                for (int var12 = 0; var12 < this.field1993; var12++) {
                    var3[var11++] = this.field1995[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1989; var5++) {
                int var6 = this.field1993 * var5;
                int var7 = (this.field1988 + var5) * var1 + this.field1992;
                for (int var8 = 0; var8 < this.field1993; var8++) {
                    var3[var7] = this.field1995[var6];
                    var4[var7++] = this.field1994[var6++];
                }
            }
            this.field1994 = var4;
        }
        this.field1992 = this.field1990 = this.field1988 = this.field1996 = 0;
        this.field1993 = var1;
        this.field1989 = var2;
        this.field1995 = var3;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()[I")
    public final int[] method857() {
        int var1 = this.method863();
        int[] var2 = new int[var1 * this.method859()];
        if (this.field1994 == null) {
            for (int var7 = 0; var7 < this.field1989; var7++) {
                int var8 = this.field1993 * var7;
                int var9 = (this.field1988 + var7) * var1 + this.field1992;
                for (int var10 = 0; var10 < this.field1993; var10++) {
                    int var11 = this.field1991[this.field1995[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1989; var3++) {
                int var4 = this.field1993 * var3;
                int var5 = (this.field1988 + var3) * var1 + this.field1992;
                for (int var6 = 0; var6 < this.field1993; var6++) {
                    var2[var5++] = this.field1994[var4] << 24 | this.field1991[this.field1995[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
    public final void method858() {
        byte[] var1 = this.field1995;
        if (this.field1994 == null) {
            for (int var2 = (this.field1989 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1993 * var2;
                int var4 = (this.field1989 - var2 - 1) * this.field1993;
                for (int var5 = -this.field1993; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1994;
            for (int var8 = (this.field1989 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1993 * var8;
                int var11 = (this.field1989 - var8 - 1) * this.field1993;
                for (int var12 = -this.field1993; var12 < 0; var12++) {
                    byte var13 = var1[var10];
                    var1[var10] = var1[var11];
                    var1[var11] = var13;
                    byte var14 = var7[var10];
                    var7[var10] = var7[var11];
                    var7[var11] = var14;
                    var10++;
                    var11++;
                }
            }
        }
        int var9 = this.field1988;
        this.field1988 = this.field1996;
        this.field1996 = var9;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "()I")
    public final int method859() {
        return this.field1989 + this.field1988 + this.field1996;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "()V")
    public final void method860() {
        byte[] var1 = new byte[this.field1993 * this.field1989];
        int var2 = 0;
        if (this.field1994 == null) {
            for (int var3 = 0; var3 < this.field1993; var3++) {
                for (int var4 = this.field1989 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1995[this.field1993 * var4 + var3];
                }
            }
            this.field1995 = var1;
        } else {
            byte[] var5 = new byte[this.field1993 * this.field1989];
            for (int var6 = 0; var6 < this.field1993; var6++) {
                for (int var9 = this.field1989 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1995[this.field1993 * var9 + var6];
                    var5[var2++] = this.field1994[this.field1993 * var9 + var6];
                }
            }
            this.field1995 = var1;
            this.field1994 = var5;
        }
        int var7 = this.field1988;
        this.field1988 = this.field1992;
        this.field1992 = this.field1996;
        this.field1996 = this.field1990;
        this.field1990 = this.field1988;
        int var8 = this.field1989;
        this.field1989 = this.field1993;
        this.field1993 = var8;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "()V")
    public final void method861() {
        byte[] var1 = this.field1995;
        if (this.field1994 == null) {
            for (int var2 = this.field1989 - 1; var2 >= 0; var2--) {
                int var3 = this.field1993 * var2;
                int var4 = (var2 + 1) * this.field1993;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1994;
            for (int var7 = this.field1989 - 1; var7 >= 0; var7--) {
                int var9 = this.field1993 * var7;
                int var10 = (var7 + 1) * this.field1993;
                while (var9 < var10) {
                    var10--;
                    byte var11 = var1[var9];
                    var1[var9] = var1[var10];
                    var1[var10] = var11;
                    byte var12 = var6[var9];
                    var6[var9] = var6[var10];
                    var6[var10] = var12;
                    var9++;
                }
            }
        }
        int var8 = this.field1992;
        this.field1992 = this.field1990;
        this.field1990 = var8;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public final void method862(int arg0) {
        int var2 = -1;
        if (this.field1991.length < 255) {
            for (int var3 = 0; var3 < this.field1991.length; var3++) {
                if (this.field1991[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1991.length;
                int[] var4 = new int[this.field1991.length + 1];
                class415.method2425(this.field1991, 0, var4, 0, this.field1991.length);
                this.field1991 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1991.length; var9++) {
                int var13 = this.field1991[var9];
                int var14 = var13 >> 16 & 0xFF;
                int var15 = var13 >> 8 & 0xFF;
                int var16 = var13 & 0xFF;
                int var17 = var6 - var14;
                if (var17 < 0) {
                    var17 = -var17;
                }
                int var18 = var7 - var15;
                if (var18 < 0) {
                    var18 = -var18;
                }
                int var19 = var8 - var16;
                if (var19 < 0) {
                    var19 = -var19;
                }
                int var20 = var17 + var18 + var19;
                if (var20 < var5) {
                    var5 = var20;
                    var2 = var9;
                }
            }
        }
        for (int var10 = this.field1989 - 1; var10 > 0; var10--) {
            int var11 = this.field1993 * var10;
            for (int var12 = this.field1993 - 1; var12 > 0; var12--) {
                if (this.field1991[this.field1995[var11 + var12] & 0xFF] == 0 && this.field1991[this.field1995[var11 + var12 - this.field1993 - 1] & 0xFF] != 0) {
                    this.field1995[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "()I")
    public final int method863() {
        return this.field1993 + this.field1992 + this.field1990;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lfc;II)[Lua;")
    public static final class140[] method864(class343 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2029(arg1, arg2, 0);
        return var3 == null ? null : method853(var3);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lfc;I)[Lua;")
    public static final class140[] method865(class343 arg0, int arg1) {
        byte[] var2 = arg0.method2038((byte) -58, arg1);
        return var2 == null ? null : method853(var2);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lfc;I)Lua;")
    public static final class140 method866(class343 arg0, int arg1) {
        byte[] var2 = arg0.method2038((byte) -58, arg1);
        return var2 == null ? null : method853(var2)[0];
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public final void method867(int arg0) {
        int var2 = this.method863();
        int var3 = this.method859();
        if (this.field1993 == var2 && this.field1989 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1992) {
            var4 = this.field1992;
        }
        int var5 = arg0;
        if (this.field1992 + arg0 + this.field1993 > var2) {
            var5 = var2 - this.field1992 - this.field1993;
        }
        int var6 = arg0;
        if (arg0 > this.field1988) {
            var6 = this.field1988;
        }
        int var7 = arg0;
        if (this.field1988 + arg0 + this.field1989 > var3) {
            var7 = var3 - this.field1988 - this.field1989;
        }
        int var8 = this.field1993 + var4 + var5;
        int var9 = this.field1989 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1994 == null) {
            for (int var11 = 0; var11 < this.field1989; var11++) {
                int var12 = this.field1993 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1993; var14++) {
                    var10[var13++] = this.field1995[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1989; var16++) {
                int var17 = this.field1993 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1993; var19++) {
                    var15[var18] = this.field1994[var17];
                    var10[var18++] = this.field1995[var17++];
                }
            }
            this.field1994 = var15;
        }
        this.field1992 -= var4;
        this.field1988 -= var6;
        this.field1990 -= var5;
        this.field1996 -= var7;
        this.field1993 = var8;
        this.field1989 = var9;
        this.field1995 = var10;
    }
}
