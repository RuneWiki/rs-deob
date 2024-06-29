import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class52 {

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!oia", name = "i", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "[B")
    public byte[] field759;

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "[B")
    public byte[] field763;

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "[I")
    public int[] field760;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Luu;II)Loia;")
    public static final class52 method374(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1572(arg1, 0, arg2);
        return var3 == null ? null : method380(var3)[0];
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "()V")
    public final void method375() {
        byte[] var1 = this.field763;
        if (this.field759 == null) {
            for (int var2 = this.field766 - 1; var2 >= 0; var2--) {
                int var3 = this.field767 * var2;
                int var4 = (var2 + 1) * this.field767;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field759;
            for (int var7 = this.field766 - 1; var7 >= 0; var7--) {
                int var9 = this.field767 * var7;
                int var10 = (var7 + 1) * this.field767;
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
        int var8 = this.field765;
        this.field765 = this.field762;
        this.field762 = var8;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "()I")
    public final int method376() {
        return this.field767 + this.field765 + this.field762;
    }

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "()V")
    public final void method377() {
        int var1 = this.method376();
        int var2 = this.method383();
        if (this.field767 == var1 && this.field766 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field759 == null) {
            for (int var9 = 0; var9 < this.field766; var9++) {
                int var10 = this.field767 * var9;
                int var11 = (this.field761 + var9) * var1 + this.field765;
                for (int var12 = 0; var12 < this.field767; var12++) {
                    var3[var11++] = this.field763[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field766; var5++) {
                int var6 = this.field767 * var5;
                int var7 = (this.field761 + var5) * var1 + this.field765;
                for (int var8 = 0; var8 < this.field767; var8++) {
                    var3[var7] = this.field763[var6];
                    var4[var7++] = this.field759[var6++];
                }
            }
            this.field759 = var4;
        }
        this.field765 = this.field762 = this.field761 = this.field764 = 0;
        this.field767 = var1;
        this.field766 = var2;
        this.field763 = var3;
    }

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "()V")
    public final void method378() {
        byte[] var1 = this.field763;
        if (this.field759 == null) {
            for (int var2 = (this.field766 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field767 * var2;
                int var4 = (this.field766 - var2 - 1) * this.field767;
                for (int var5 = -this.field767; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field759;
            for (int var8 = (this.field766 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field767 * var8;
                int var11 = (this.field766 - var8 - 1) * this.field767;
                for (int var12 = -this.field767; var12 < 0; var12++) {
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
        int var9 = this.field761;
        this.field761 = this.field764;
        this.field764 = var9;
    }

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "()[I")
    public final int[] method379() {
        int var1 = this.method376();
        int[] var2 = new int[var1 * this.method383()];
        if (this.field759 == null) {
            for (int var7 = 0; var7 < this.field766; var7++) {
                int var8 = this.field767 * var7;
                int var9 = (this.field761 + var7) * var1 + this.field765;
                for (int var10 = 0; var10 < this.field767; var10++) {
                    int var11 = this.field760[this.field763[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field766; var3++) {
                int var4 = this.field767 * var3;
                int var5 = (this.field761 + var3) * var1 + this.field765;
                for (int var6 = 0; var6 < this.field767; var6++) {
                    var2[var5++] = this.field759[var4] << 24 | this.field760[this.field763[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "([B)[Loia;")
    private static final class52[] method380(byte[] arg0) {
        class63 var1 = new class63(arg0);
        var1.field956 = arg0.length - 2;
        int var2 = var1.method482(-772591672);
        class52[] var3 = new class52[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class52();
        }
        var1.field956 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method482(-772591672);
        int var6 = var1.method482(-772591672);
        int var7 = (var1.method505((byte) -119) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field765 = var1.method482(-772591672);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field761 = var1.method482(-772591672);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field767 = var1.method482(-772591672);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field766 = var1.method482(-772591672);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class52 var32 = var3[var12];
            var32.field762 = var5 - var32.field767 - var32.field765;
            var32.field764 = var6 - var32.field766 - var32.field761;
        }
        var1.field956 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method476((byte) -125);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field760 = var13;
        }
        var1.field956 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class52 var17 = var3[var16];
            int var18 = var17.field767 * var17.field766;
            var17.field763 = new byte[var18];
            int var19 = var1.method505((byte) -119);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field759 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field763[var24] = var1.method491(false);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field759[var25] = var1.method491(false);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field767; var27++) {
                        for (int var31 = 0; var31 < var17.field766; var31++) {
                            var17.field763[var17.field767 * var31 + var27] = var1.method491(false);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field767; var28++) {
                        for (int var29 = 0; var29 < var17.field766; var29++) {
                            byte var30 = var17.field759[var17.field767 * var29 + var28] = var1.method491(false);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field759 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field763[var20] = var1.method491(false);
                }
            } else {
                for (int var21 = 0; var21 < var17.field767; var21++) {
                    for (int var22 = 0; var22 < var17.field766; var22++) {
                        var17.field763[var17.field767 * var22 + var21] = var1.method491(false);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(Luu;II)[Loia;")
    public static final class52[] method381(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1572(arg1, 0, arg2);
        return var3 == null ? null : method380(var3);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Luu;I)Loia;")
    public static final class52 method382(class237 arg0, int arg1) {
        byte[] var2 = arg0.method1583(arg1, -117);
        return var2 == null ? null : method380(var2)[0];
    }

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "()I")
    public final int method383() {
        return this.field766 + this.field761 + this.field764;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(Luu;I)[Loia;")
    public static final class52[] method384(class237 arg0, int arg1) {
        byte[] var2 = arg0.method1583(arg1, -107);
        return var2 == null ? null : method380(var2);
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
    public final void method385(int arg0) {
        int var2 = this.method376();
        int var3 = this.method383();
        if (this.field767 == var2 && this.field766 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field765) {
            var4 = this.field765;
        }
        int var5 = arg0;
        if (this.field765 + arg0 + this.field767 > var2) {
            var5 = var2 - this.field765 - this.field767;
        }
        int var6 = arg0;
        if (arg0 > this.field761) {
            var6 = this.field761;
        }
        int var7 = arg0;
        if (this.field761 + arg0 + this.field766 > var3) {
            var7 = var3 - this.field761 - this.field766;
        }
        int var8 = this.field767 + var4 + var5;
        int var9 = this.field766 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field759 == null) {
            for (int var11 = 0; var11 < this.field766; var11++) {
                int var12 = this.field767 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field767; var14++) {
                    var10[var13++] = this.field763[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field766; var16++) {
                int var17 = this.field767 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field767; var19++) {
                    var15[var18] = this.field759[var17];
                    var10[var18++] = this.field763[var17++];
                }
            }
            this.field759 = var15;
        }
        this.field765 -= var4;
        this.field761 -= var6;
        this.field762 -= var5;
        this.field764 -= var7;
        this.field767 = var8;
        this.field766 = var9;
        this.field763 = var10;
    }

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "()V")
    public final void method386() {
        byte[] var1 = new byte[this.field767 * this.field766];
        int var2 = 0;
        if (this.field759 == null) {
            for (int var3 = 0; var3 < this.field767; var3++) {
                for (int var4 = this.field766 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field763[this.field767 * var4 + var3];
                }
            }
            this.field763 = var1;
        } else {
            byte[] var5 = new byte[this.field767 * this.field766];
            for (int var6 = 0; var6 < this.field767; var6++) {
                for (int var9 = this.field766 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field763[this.field767 * var9 + var6];
                    var5[var2++] = this.field759[this.field767 * var9 + var6];
                }
            }
            this.field763 = var1;
            this.field759 = var5;
        }
        int var7 = this.field761;
        this.field761 = this.field765;
        this.field765 = this.field764;
        this.field764 = this.field762;
        this.field762 = this.field761;
        int var8 = this.field766;
        this.field766 = this.field767;
        this.field767 = var8;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)V")
    public final void method387(int arg0) {
        int var2 = -1;
        if (this.field760.length < 255) {
            for (int var3 = 0; var3 < this.field760.length; var3++) {
                if (this.field760[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field760.length;
                int[] var4 = new int[this.field760.length + 1];
                class245.method1647(this.field760, 0, var4, 0, this.field760.length);
                this.field760 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field760.length; var9++) {
                int var15 = this.field760[var9];
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
        byte[] var11 = new byte[this.field767 * this.field766];
        for (int var12 = 0; var12 < this.field766; var12++) {
            for (int var13 = 0; var13 < this.field767; var13++) {
                int var14 = this.field763[var10] & 0xFF;
                if (this.field760[var14] == 0) {
                    if (var13 > 0 && this.field760[this.field763[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field760[this.field763[var10 - this.field767] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field767 - 1 && this.field760[this.field763[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field766 - 1 && this.field760[this.field763[this.field767 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field763 = var11;
    }

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "(I)V")
    public final void method388(int arg0) {
        int var2 = -1;
        if (this.field760.length < 255) {
            for (int var3 = 0; var3 < this.field760.length; var3++) {
                if (this.field760[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field760.length;
                int[] var4 = new int[this.field760.length + 1];
                class245.method1647(this.field760, 0, var4, 0, this.field760.length);
                this.field760 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field760.length; var9++) {
                int var13 = this.field760[var9];
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
        for (int var10 = this.field766 - 1; var10 > 0; var10--) {
            int var11 = this.field767 * var10;
            for (int var12 = this.field767 - 1; var12 > 0; var12--) {
                if (this.field760[this.field763[var11 + var12] & 0xFF] == 0 && this.field760[this.field763[var11 + var12 - this.field767 - 1] & 0xFF] != 0) {
                    this.field763[var11 + var12] = (byte) var2;
                }
            }
        }
    }
}
