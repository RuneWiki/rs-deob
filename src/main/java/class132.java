import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class132 {

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "[B")
    public byte[] field1501;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "[B")
    public byte[] field1503;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "[I")
    public int[] field1505;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lwo;II)Liq;", line = 5)
    public static final class132 method849(class285 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1794(5860, arg1, arg2);
        return var3 == null ? null : method856(var3)[0];
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V", line = 13)
    public final void method850(int arg0) {
        int var2 = -1;
        if (this.field1505.length < 255) {
            for (int var3 = 0; var3 < this.field1505.length; var3++) {
                if (this.field1505[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1505.length;
                int[] var4 = new int[this.field1505.length + 1];
                class114.method669(this.field1505, 0, var4, 0, this.field1505.length);
                this.field1505 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1505.length; var9++) {
                int var13 = this.field1505[var9];
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
        for (int var10 = this.field1509 - 1; var10 > 0; var10--) {
            int var11 = this.field1507 * var10;
            for (int var12 = this.field1507 - 1; var12 > 0; var12--) {
                if (this.field1505[this.field1503[var11 + var12] & 0xFF] == 0 && this.field1505[this.field1503[var11 + var12 - this.field1507 - 1] & 0xFF] != 0) {
                    this.field1503[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lwo;I)[Liq;", line = 116)
    public static final class132[] method851(class285 arg0, int arg1) {
        byte[] var2 = arg0.method1805(arg1, true);
        return var2 == null ? null : method856(var2);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V", line = 125)
    public final void method852(int arg0) {
        int var2 = -1;
        if (this.field1505.length < 255) {
            for (int var3 = 0; var3 < this.field1505.length; var3++) {
                if (this.field1505[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1505.length;
                int[] var4 = new int[this.field1505.length + 1];
                class114.method669(this.field1505, 0, var4, 0, this.field1505.length);
                this.field1505 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1505.length; var9++) {
                int var15 = this.field1505[var9];
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
        byte[] var11 = new byte[this.field1509 * this.field1507];
        for (int var12 = 0; var12 < this.field1509; var12++) {
            for (int var13 = 0; var13 < this.field1507; var13++) {
                int var14 = this.field1503[var10] & 0xFF;
                if (this.field1505[var14] == 0) {
                    if (var13 > 0 && this.field1505[this.field1503[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1505[this.field1503[var10 - this.field1507] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1507 - 1 && this.field1505[this.field1503[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1509 - 1 && this.field1505[this.field1503[this.field1507 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1503 = var11;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Lwo;II)[Liq;", line = 259)
    public static final class132[] method853(class285 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1794(5860, arg1, arg2);
        return var3 == null ? null : method856(var3);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "()V", line = 268)
    public final void method854() {
        byte[] var1 = this.field1503;
        if (this.field1501 == null) {
            for (int var2 = this.field1509 - 1; var2 >= 0; var2--) {
                int var3 = this.field1507 * var2;
                int var4 = (var2 + 1) * this.field1507;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1501;
            for (int var7 = this.field1509 - 1; var7 >= 0; var7--) {
                int var9 = this.field1507 * var7;
                int var10 = (var7 + 1) * this.field1507;
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
        int var8 = this.field1506;
        this.field1506 = this.field1502;
        this.field1502 = var8;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Lwo;I)Liq;", line = 330)
    public static final class132 method855(class285 arg0, int arg1) {
        byte[] var2 = arg0.method1805(arg1, true);
        return var2 == null ? null : method856(var2)[0];
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([B)[Liq;", line = 338)
    private static final class132[] method856(byte[] arg0) {
        class242 var1 = new class242(arg0);
        var1.field3211 = arg0.length - 2;
        int var2 = var1.method1587((byte) -102);
        class132[] var3 = new class132[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class132();
        }
        var1.field3211 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1587((byte) -102);
        int var6 = var1.method1587((byte) -102);
        int var7 = (var1.method1563(-128) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1506 = var1.method1587((byte) -102);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1508 = var1.method1587((byte) -102);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1507 = var1.method1587((byte) -102);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1509 = var1.method1587((byte) -102);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class132 var32 = var3[var12];
            var32.field1502 = var5 - var32.field1507 - var32.field1506;
            var32.field1504 = var6 - var32.field1509 - var32.field1508;
        }
        var1.field3211 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1545(8);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1505 = var13;
        }
        var1.field3211 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class132 var17 = var3[var16];
            int var18 = var17.field1509 * var17.field1507;
            var17.field1503 = new byte[var18];
            int var19 = var1.method1563(-128);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1501 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1503[var24] = var1.method1589(false);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1501[var25] = var1.method1589(false);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1507; var27++) {
                        for (int var31 = 0; var31 < var17.field1509; var31++) {
                            var17.field1503[var17.field1507 * var31 + var27] = var1.method1589(false);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1507; var28++) {
                        for (int var29 = 0; var29 < var17.field1509; var29++) {
                            byte var30 = var17.field1501[var17.field1507 * var29 + var28] = var1.method1589(false);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1501 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1503[var20] = var1.method1589(false);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1507; var21++) {
                    for (int var22 = 0; var22 < var17.field1509; var22++) {
                        var17.field1503[var17.field1507 * var22 + var21] = var1.method1589(false);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "()V", line = 545)
    public final void method857() {
        byte[] var1 = new byte[this.field1509 * this.field1507];
        int var2 = 0;
        if (this.field1501 == null) {
            for (int var3 = 0; var3 < this.field1507; var3++) {
                for (int var4 = this.field1509 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1503[this.field1507 * var4 + var3];
                }
            }
            this.field1503 = var1;
        } else {
            byte[] var5 = new byte[this.field1509 * this.field1507];
            for (int var6 = 0; var6 < this.field1507; var6++) {
                for (int var9 = this.field1509 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1503[this.field1507 * var9 + var6];
                    var5[var2++] = this.field1501[this.field1507 * var9 + var6];
                }
            }
            this.field1503 = var1;
            this.field1501 = var5;
        }
        int var7 = this.field1508;
        this.field1508 = this.field1506;
        this.field1506 = this.field1504;
        this.field1504 = this.field1502;
        this.field1502 = this.field1508;
        int var8 = this.field1509;
        this.field1509 = this.field1507;
        this.field1507 = var8;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "()[I", line = 605)
    public final int[] method858() {
        int var1 = this.method863();
        int[] var2 = new int[var1 * this.method860()];
        if (this.field1501 == null) {
            for (int var7 = 0; var7 < this.field1509; var7++) {
                int var8 = this.field1507 * var7;
                int var9 = (this.field1508 + var7) * var1 + this.field1506;
                for (int var10 = 0; var10 < this.field1507; var10++) {
                    int var11 = this.field1505[this.field1503[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1509; var3++) {
                int var4 = this.field1507 * var3;
                int var5 = (this.field1508 + var3) * var1 + this.field1506;
                for (int var6 = 0; var6 < this.field1507; var6++) {
                    var2[var5++] = this.field1501[var4] << 24 | this.field1505[this.field1503[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V", line = 668)
    public final void method859(int arg0) {
        int var2 = this.method863();
        int var3 = this.method860();
        if (this.field1507 == var2 && this.field1509 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1506) {
            var4 = this.field1506;
        }
        int var5 = arg0;
        if (this.field1506 + arg0 + this.field1507 > var2) {
            var5 = var2 - this.field1506 - this.field1507;
        }
        int var6 = arg0;
        if (arg0 > this.field1508) {
            var6 = this.field1508;
        }
        int var7 = arg0;
        if (this.field1508 + arg0 + this.field1509 > var3) {
            var7 = var3 - this.field1508 - this.field1509;
        }
        int var8 = this.field1507 + var4 + var5;
        int var9 = this.field1509 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1501 == null) {
            for (int var11 = 0; var11 < this.field1509; var11++) {
                int var12 = this.field1507 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1507; var14++) {
                    var10[var13++] = this.field1503[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1509; var16++) {
                int var17 = this.field1507 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1507; var19++) {
                    var15[var18] = this.field1501[var17];
                    var10[var18++] = this.field1503[var17++];
                }
            }
            this.field1501 = var15;
        }
        this.field1506 -= var4;
        this.field1508 -= var6;
        this.field1502 -= var5;
        this.field1504 -= var7;
        this.field1507 = var8;
        this.field1509 = var9;
        this.field1503 = var10;
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "()I", line = 762)
    public final int method860() {
        return this.field1509 + this.field1508 + this.field1504;
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "()V", line = 767)
    public final void method861() {
        byte[] var1 = this.field1503;
        if (this.field1501 == null) {
            for (int var2 = (this.field1509 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1507 * var2;
                int var4 = (this.field1509 - var2 - 1) * this.field1507;
                for (int var5 = -this.field1507; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1501;
            for (int var8 = (this.field1509 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1507 * var8;
                int var11 = (this.field1509 - var8 - 1) * this.field1507;
                for (int var12 = -this.field1507; var12 < 0; var12++) {
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
        int var9 = this.field1508;
        this.field1508 = this.field1504;
        this.field1504 = var9;
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "()V", line = 840)
    public final void method862() {
        int var1 = this.method863();
        int var2 = this.method860();
        if (this.field1507 == var1 && this.field1509 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1501 == null) {
            for (int var9 = 0; var9 < this.field1509; var9++) {
                int var10 = this.field1507 * var9;
                int var11 = (this.field1508 + var9) * var1 + this.field1506;
                for (int var12 = 0; var12 < this.field1507; var12++) {
                    var3[var11++] = this.field1503[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1509; var5++) {
                int var6 = this.field1507 * var5;
                int var7 = (this.field1508 + var5) * var1 + this.field1506;
                for (int var8 = 0; var8 < this.field1507; var8++) {
                    var3[var7] = this.field1503[var6];
                    var4[var7++] = this.field1501[var6++];
                }
            }
            this.field1501 = var4;
        }
        this.field1506 = this.field1502 = this.field1508 = this.field1504 = 0;
        this.field1507 = var1;
        this.field1509 = var2;
        this.field1503 = var3;
    }

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "()I", line = 907)
    public final int method863() {
        return this.field1507 + this.field1506 + this.field1502;
    }
}
