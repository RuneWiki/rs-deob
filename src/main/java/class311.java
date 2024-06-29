import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class311 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public int field3974;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "[B")
    public byte[] field3977;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "[B")
    public byte[] field3979;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "[I")
    public int[] field3981;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "()I")
    public final int method1813() {
        return this.field3980 + this.field3978 + this.field3975;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "()[I")
    public final int[] method1814() {
        int var1 = this.method1820();
        int[] var2 = new int[var1 * this.method1813()];
        if (this.field3977 == null) {
            for (int var7 = 0; var7 < this.field3980; var7++) {
                int var8 = this.field3974 * var7;
                int var9 = (this.field3978 + var7) * var1 + this.field3976;
                for (int var10 = 0; var10 < this.field3974; var10++) {
                    int var11 = this.field3981[this.field3979[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field3980; var3++) {
                int var4 = this.field3974 * var3;
                int var5 = (this.field3978 + var3) * var1 + this.field3976;
                for (int var6 = 0; var6 < this.field3974; var6++) {
                    var2[var5++] = this.field3977[var4] << 24 | this.field3981[this.field3979[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lqn;I)[Lqv;")
    public static final class311[] method1815(class47 arg0, int arg1) {
        byte[] var2 = arg0.method457(arg1, -123);
        return var2 == null ? null : method1821(var2);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lqn;II)Lqv;")
    public static final class311 method1816(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method481(arg1, arg2, -99);
        return var3 == null ? null : method1821(var3)[0];
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public final void method1817(int arg0) {
        int var2 = this.method1820();
        int var3 = this.method1813();
        if (this.field3974 == var2 && this.field3980 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field3976) {
            var4 = this.field3976;
        }
        int var5 = arg0;
        if (this.field3976 + arg0 + this.field3974 > var2) {
            var5 = var2 - this.field3976 - this.field3974;
        }
        int var6 = arg0;
        if (arg0 > this.field3978) {
            var6 = this.field3978;
        }
        int var7 = arg0;
        if (this.field3978 + arg0 + this.field3980 > var3) {
            var7 = var3 - this.field3978 - this.field3980;
        }
        int var8 = this.field3974 + var4 + var5;
        int var9 = this.field3980 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field3977 == null) {
            for (int var11 = 0; var11 < this.field3980; var11++) {
                int var12 = this.field3974 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field3974; var14++) {
                    var10[var13++] = this.field3979[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field3980; var16++) {
                int var17 = this.field3974 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field3974; var19++) {
                    var15[var18] = this.field3977[var17];
                    var10[var18++] = this.field3979[var17++];
                }
            }
            this.field3977 = var15;
        }
        this.field3976 -= var4;
        this.field3978 -= var6;
        this.field3973 -= var5;
        this.field3975 -= var7;
        this.field3974 = var8;
        this.field3980 = var9;
        this.field3979 = var10;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
    public final void method1818(int arg0) {
        int var2 = -1;
        if (this.field3981.length < 255) {
            for (int var3 = 0; var3 < this.field3981.length; var3++) {
                if (this.field3981[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3981.length;
                int[] var4 = new int[this.field3981.length + 1];
                class318.method1872(this.field3981, 0, var4, 0, this.field3981.length);
                this.field3981 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3981.length; var9++) {
                int var15 = this.field3981[var9];
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
        byte[] var11 = new byte[this.field3980 * this.field3974];
        for (int var12 = 0; var12 < this.field3980; var12++) {
            for (int var13 = 0; var13 < this.field3974; var13++) {
                int var14 = this.field3979[var10] & 0xFF;
                if (this.field3981[var14] == 0) {
                    if (var13 > 0 && this.field3981[this.field3979[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field3981[this.field3979[var10 - this.field3974] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field3974 - 1 && this.field3981[this.field3979[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field3980 - 1 && this.field3981[this.field3979[this.field3974 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field3979 = var11;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(Lqn;II)[Lqv;")
    public static final class311[] method1819(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method481(arg1, arg2, -102);
        return var3 == null ? null : method1821(var3);
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "()I")
    public final int method1820() {
        return this.field3976 + this.field3974 + this.field3973;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([B)[Lqv;")
    private static final class311[] method1821(byte[] arg0) {
        class463 var1 = new class463(arg0);
        var1.field6631 = arg0.length - 2;
        int var2 = var1.method2758((byte) 93);
        class311[] var3 = new class311[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class311();
        }
        var1.field6631 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2758((byte) 79);
        int var6 = var1.method2758((byte) 86);
        int var7 = (var1.method2737(false) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field3976 = var1.method2758((byte) 114);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field3978 = var1.method2758((byte) 101);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field3974 = var1.method2758((byte) 83);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field3980 = var1.method2758((byte) 112);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class311 var32 = var3[var12];
            var32.field3973 = var5 - var32.field3974 - var32.field3976;
            var32.field3975 = var6 - var32.field3980 - var32.field3978;
        }
        var1.field6631 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2738(-82);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field3981 = var13;
        }
        var1.field6631 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class311 var17 = var3[var16];
            int var18 = var17.field3980 * var17.field3974;
            var17.field3979 = new byte[var18];
            int var19 = var1.method2737(false);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field3977 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field3979[var24] = var1.method2793(32767);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field3977[var25] = var1.method2793(32767);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field3974; var27++) {
                        for (int var31 = 0; var31 < var17.field3980; var31++) {
                            var17.field3979[var17.field3974 * var31 + var27] = var1.method2793(32767);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field3974; var28++) {
                        for (int var29 = 0; var29 < var17.field3980; var29++) {
                            byte var30 = var17.field3977[var17.field3974 * var29 + var28] = var1.method2793(32767);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field3977 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field3979[var20] = var1.method2793(32767);
                }
            } else {
                for (int var21 = 0; var21 < var17.field3974; var21++) {
                    for (int var22 = 0; var22 < var17.field3980; var22++) {
                        var17.field3979[var17.field3974 * var22 + var21] = var1.method2793(32767);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "()V")
    public final void method1822() {
        byte[] var1 = this.field3979;
        if (this.field3977 == null) {
            for (int var2 = (this.field3980 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field3974 * var2;
                int var4 = (this.field3980 - var2 - 1) * this.field3974;
                for (int var5 = -this.field3974; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field3977;
            for (int var8 = (this.field3980 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field3974 * var8;
                int var11 = (this.field3980 - var8 - 1) * this.field3974;
                for (int var12 = -this.field3974; var12 < 0; var12++) {
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
        int var9 = this.field3978;
        this.field3978 = this.field3975;
        this.field3975 = var9;
    }

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "()V")
    public final void method1823() {
        byte[] var1 = new byte[this.field3980 * this.field3974];
        int var2 = 0;
        if (this.field3977 == null) {
            for (int var3 = 0; var3 < this.field3974; var3++) {
                for (int var4 = this.field3980 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field3979[this.field3974 * var4 + var3];
                }
            }
            this.field3979 = var1;
        } else {
            byte[] var5 = new byte[this.field3980 * this.field3974];
            for (int var6 = 0; var6 < this.field3974; var6++) {
                for (int var9 = this.field3980 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field3979[this.field3974 * var9 + var6];
                    var5[var2++] = this.field3977[this.field3974 * var9 + var6];
                }
            }
            this.field3979 = var1;
            this.field3977 = var5;
        }
        int var7 = this.field3978;
        this.field3978 = this.field3976;
        this.field3976 = this.field3975;
        this.field3975 = this.field3973;
        this.field3973 = this.field3978;
        int var8 = this.field3980;
        this.field3980 = this.field3974;
        this.field3974 = var8;
    }

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "()V")
    public final void method1824() {
        int var1 = this.method1820();
        int var2 = this.method1813();
        if (this.field3974 == var1 && this.field3980 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field3977 == null) {
            for (int var9 = 0; var9 < this.field3980; var9++) {
                int var10 = this.field3974 * var9;
                int var11 = (this.field3978 + var9) * var1 + this.field3976;
                for (int var12 = 0; var12 < this.field3974; var12++) {
                    var3[var11++] = this.field3979[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field3980; var5++) {
                int var6 = this.field3974 * var5;
                int var7 = (this.field3978 + var5) * var1 + this.field3976;
                for (int var8 = 0; var8 < this.field3974; var8++) {
                    var3[var7] = this.field3979[var6];
                    var4[var7++] = this.field3977[var6++];
                }
            }
            this.field3977 = var4;
        }
        this.field3976 = this.field3973 = this.field3978 = this.field3975 = 0;
        this.field3974 = var1;
        this.field3980 = var2;
        this.field3979 = var3;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(Lqn;I)Lqv;")
    public static final class311 method1825(class47 arg0, int arg1) {
        byte[] var2 = arg0.method457(arg1, -104);
        return var2 == null ? null : method1821(var2)[0];
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)V")
    public final void method1826(int arg0) {
        int var2 = -1;
        if (this.field3981.length < 255) {
            for (int var3 = 0; var3 < this.field3981.length; var3++) {
                if (this.field3981[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3981.length;
                int[] var4 = new int[this.field3981.length + 1];
                class318.method1872(this.field3981, 0, var4, 0, this.field3981.length);
                this.field3981 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3981.length; var9++) {
                int var13 = this.field3981[var9];
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
        for (int var10 = this.field3980 - 1; var10 > 0; var10--) {
            int var11 = this.field3974 * var10;
            for (int var12 = this.field3974 - 1; var12 > 0; var12--) {
                if (this.field3981[this.field3979[var11 + var12] & 0xFF] == 0 && this.field3981[this.field3979[var11 + var12 - this.field3974 - 1] & 0xFF] != 0) {
                    this.field3979[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "()V")
    public final void method1827() {
        byte[] var1 = this.field3979;
        if (this.field3977 == null) {
            for (int var2 = this.field3980 - 1; var2 >= 0; var2--) {
                int var3 = this.field3974 * var2;
                int var4 = (var2 + 1) * this.field3974;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field3977;
            for (int var7 = this.field3980 - 1; var7 >= 0; var7--) {
                int var9 = this.field3974 * var7;
                int var10 = (var7 + 1) * this.field3974;
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
        int var8 = this.field3976;
        this.field3976 = this.field3973;
        this.field3973 = var8;
    }
}
