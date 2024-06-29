import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class66 {

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "[B")
    public byte[] field976;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "[B")
    public byte[] field982;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "[I")
    public int[] field979;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "()V")
    public final void method691() {
        byte[] var1 = this.field982;
        if (this.field976 == null) {
            for (int var2 = (this.field977 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field981 * var2;
                int var4 = (this.field977 - var2 - 1) * this.field981;
                for (int var5 = -this.field981; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field976;
            for (int var8 = (this.field977 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field981 * var8;
                int var11 = (this.field977 - var8 - 1) * this.field981;
                for (int var12 = -this.field981; var12 < 0; var12++) {
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
        int var9 = this.field983;
        this.field983 = this.field980;
        this.field980 = var9;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
    public final void method692(int arg0) {
        int var2 = -1;
        if (this.field979.length < 255) {
            for (int var3 = 0; var3 < this.field979.length; var3++) {
                if (this.field979[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field979.length;
                int[] var4 = new int[this.field979.length + 1];
                class569.method4248(this.field979, 0, var4, 0, this.field979.length);
                this.field979 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field979.length; var9++) {
                int var13 = this.field979[var9];
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
        for (int var10 = this.field977 - 1; var10 > 0; var10--) {
            int var11 = this.field981 * var10;
            for (int var12 = this.field981 - 1; var12 > 0; var12--) {
                if (this.field979[this.field982[var11 + var12] & 0xFF] == 0 && this.field979[this.field982[var11 + var12 - this.field981 - 1] & 0xFF] != 0) {
                    this.field982[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "()I")
    public final int method693() {
        return this.field984 + this.field981 + this.field978;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(Llga;II)[Lcu;")
    public static final class66[] method694(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method512(arg2, arg1, (byte) -87);
        return var3 == null ? null : method697(var3);
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "()V")
    public final void method695() {
        byte[] var1 = this.field982;
        if (this.field976 == null) {
            for (int var2 = this.field977 - 1; var2 >= 0; var2--) {
                int var3 = this.field981 * var2;
                int var4 = (var2 + 1) * this.field981;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field976;
            for (int var7 = this.field977 - 1; var7 >= 0; var7--) {
                int var9 = this.field981 * var7;
                int var10 = (var7 + 1) * this.field981;
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
        int var8 = this.field984;
        this.field984 = this.field978;
        this.field978 = var8;
    }

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "()V")
    public final void method696() {
        byte[] var1 = new byte[this.field981 * this.field977];
        int var2 = 0;
        if (this.field976 == null) {
            for (int var3 = 0; var3 < this.field981; var3++) {
                for (int var4 = this.field977 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field982[this.field981 * var4 + var3];
                }
            }
            this.field982 = var1;
        } else {
            byte[] var5 = new byte[this.field981 * this.field977];
            for (int var6 = 0; var6 < this.field981; var6++) {
                for (int var9 = this.field977 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field982[this.field981 * var9 + var6];
                    var5[var2++] = this.field976[this.field981 * var9 + var6];
                }
            }
            this.field982 = var1;
            this.field976 = var5;
        }
        int var7 = this.field983;
        this.field983 = this.field984;
        this.field984 = this.field980;
        this.field980 = this.field978;
        this.field978 = this.field983;
        int var8 = this.field977;
        this.field977 = this.field981;
        this.field981 = var8;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "([B)[Lcu;")
    private static final class66[] method697(byte[] arg0) {
        class711 var1 = new class711(arg0);
        var1.field9945 = arg0.length - 2;
        int var2 = var1.method5116((byte) -122);
        class66[] var3 = new class66[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class66();
        }
        var1.field9945 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method5116((byte) -124);
        int var6 = var1.method5116((byte) -123);
        int var7 = (var1.method5128(0) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field984 = var1.method5116((byte) -105);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field983 = var1.method5116((byte) -113);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field981 = var1.method5116((byte) -123);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field977 = var1.method5116((byte) -111);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class66 var32 = var3[var12];
            var32.field978 = var5 - var32.field981 - var32.field984;
            var32.field980 = var6 - var32.field977 - var32.field983;
        }
        var1.field9945 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method5085(true);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field979 = var13;
        }
        var1.field9945 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class66 var17 = var3[var16];
            int var18 = var17.field981 * var17.field977;
            var17.field982 = new byte[var18];
            int var19 = var1.method5128(0);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field976 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field982[var24] = var1.method5125((byte) 123);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field976[var25] = var1.method5125((byte) -66);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field981; var27++) {
                        for (int var31 = 0; var31 < var17.field977; var31++) {
                            var17.field982[var17.field981 * var31 + var27] = var1.method5125((byte) -12);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field981; var28++) {
                        for (int var29 = 0; var29 < var17.field977; var29++) {
                            byte var30 = var17.field976[var17.field981 * var29 + var28] = var1.method5125((byte) -48);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field976 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field982[var20] = var1.method5125((byte) 111);
                }
            } else {
                for (int var21 = 0; var21 < var17.field981; var21++) {
                    for (int var22 = 0; var22 < var17.field977; var22++) {
                        var17.field982[var17.field981 * var22 + var21] = var1.method5125((byte) -101);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
    public final void method698(int arg0) {
        int var2 = this.method693();
        int var3 = this.method699();
        if (this.field981 == var2 && this.field977 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field984) {
            var4 = this.field984;
        }
        int var5 = arg0;
        if (this.field984 + arg0 + this.field981 > var2) {
            var5 = var2 - this.field984 - this.field981;
        }
        int var6 = arg0;
        if (arg0 > this.field983) {
            var6 = this.field983;
        }
        int var7 = arg0;
        if (this.field983 + arg0 + this.field977 > var3) {
            var7 = var3 - this.field983 - this.field977;
        }
        int var8 = this.field981 + var4 + var5;
        int var9 = this.field977 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field976 == null) {
            for (int var11 = 0; var11 < this.field977; var11++) {
                int var12 = this.field981 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field981; var14++) {
                    var10[var13++] = this.field982[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field977; var16++) {
                int var17 = this.field981 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field981; var19++) {
                    var15[var18] = this.field976[var17];
                    var10[var18++] = this.field982[var17++];
                }
            }
            this.field976 = var15;
        }
        this.field984 -= var4;
        this.field983 -= var6;
        this.field978 -= var5;
        this.field980 -= var7;
        this.field981 = var8;
        this.field977 = var9;
        this.field982 = var10;
    }

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "()I")
    public final int method699() {
        return this.field983 + this.field977 + this.field980;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public final void method700(int arg0) {
        int var2 = -1;
        if (this.field979.length < 255) {
            for (int var3 = 0; var3 < this.field979.length; var3++) {
                if (this.field979[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field979.length;
                int[] var4 = new int[this.field979.length + 1];
                class569.method4248(this.field979, 0, var4, 0, this.field979.length);
                this.field979 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field979.length; var9++) {
                int var15 = this.field979[var9];
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
        byte[] var11 = new byte[this.field981 * this.field977];
        for (int var12 = 0; var12 < this.field977; var12++) {
            for (int var13 = 0; var13 < this.field981; var13++) {
                int var14 = this.field982[var10] & 0xFF;
                if (this.field979[var14] == 0) {
                    if (var13 > 0 && this.field979[this.field982[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field979[this.field982[var10 - this.field981] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field981 - 1 && this.field979[this.field982[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field977 - 1 && this.field979[this.field982[this.field981 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field982 = var11;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(Llga;I)Lcu;")
    public static final class66 method701(class47 arg0, int arg1) {
        byte[] var2 = arg0.method520((byte) 108, arg1);
        return var2 == null ? null : method697(var2)[0];
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Llga;I)[Lcu;")
    public static final class66[] method702(class47 arg0, int arg1) {
        byte[] var2 = arg0.method520((byte) 108, arg1);
        return var2 == null ? null : method697(var2);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "()[I")
    public final int[] method703() {
        int var1 = this.method693();
        int[] var2 = new int[var1 * this.method699()];
        if (this.field976 == null) {
            for (int var7 = 0; var7 < this.field977; var7++) {
                int var8 = this.field981 * var7;
                int var9 = (this.field983 + var7) * var1 + this.field984;
                for (int var10 = 0; var10 < this.field981; var10++) {
                    int var11 = this.field979[this.field982[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field977; var3++) {
                int var4 = this.field981 * var3;
                int var5 = (this.field983 + var3) * var1 + this.field984;
                for (int var6 = 0; var6 < this.field981; var6++) {
                    var2[var5++] = this.field976[var4] << 24 | this.field979[this.field982[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Llga;II)Lcu;")
    public static final class66 method704(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method512(arg2, arg1, (byte) -81);
        return var3 == null ? null : method697(var3)[0];
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "()V")
    public final void method705() {
        int var1 = this.method693();
        int var2 = this.method699();
        if (this.field981 == var1 && this.field977 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field976 == null) {
            for (int var9 = 0; var9 < this.field977; var9++) {
                int var10 = this.field981 * var9;
                int var11 = (this.field983 + var9) * var1 + this.field984;
                for (int var12 = 0; var12 < this.field981; var12++) {
                    var3[var11++] = this.field982[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field977; var5++) {
                int var6 = this.field981 * var5;
                int var7 = (this.field983 + var5) * var1 + this.field984;
                for (int var8 = 0; var8 < this.field981; var8++) {
                    var3[var7] = this.field982[var6];
                    var4[var7++] = this.field976[var6++];
                }
            }
            this.field976 = var4;
        }
        this.field984 = this.field978 = this.field983 = this.field980 = 0;
        this.field981 = var1;
        this.field977 = var2;
        this.field982 = var3;
    }
}
