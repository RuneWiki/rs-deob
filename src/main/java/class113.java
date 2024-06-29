import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class113 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[B")
    public byte[] field1701;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "[B")
    public byte[] field1709;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public int[] field1702;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()I", line = 3)
    public final int method873() {
        return this.field1706 + this.field1704 + this.field1705;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()I", line = 6)
    public final int method874() {
        return this.field1708 + this.field1707 + this.field1703;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lpu;II)Lfg;", line = 10)
    public static final class113 method875(class522 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3007(arg1, arg2, 5);
        return var3 == null ? null : method877(var3)[0];
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 19)
    public final void method876(int arg0) {
        int var2 = this.method873();
        int var3 = this.method874();
        if (this.field1706 == var2 && this.field1708 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1704) {
            var4 = this.field1704;
        }
        int var5 = arg0;
        if (this.field1704 + arg0 + this.field1706 > var2) {
            var5 = var2 - this.field1704 - this.field1706;
        }
        int var6 = arg0;
        if (arg0 > this.field1707) {
            var6 = this.field1707;
        }
        int var7 = arg0;
        if (this.field1707 + arg0 + this.field1708 > var3) {
            var7 = var3 - this.field1707 - this.field1708;
        }
        int var8 = this.field1706 + var4 + var5;
        int var9 = this.field1708 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1701 == null) {
            for (int var11 = 0; var11 < this.field1708; var11++) {
                int var12 = this.field1706 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1706; var14++) {
                    var10[var13++] = this.field1709[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1708; var16++) {
                int var17 = this.field1706 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1706; var19++) {
                    var15[var18] = this.field1701[var17];
                    var10[var18++] = this.field1709[var17++];
                }
            }
            this.field1701 = var15;
        }
        this.field1704 -= var4;
        this.field1707 -= var6;
        this.field1705 -= var5;
        this.field1703 -= var7;
        this.field1706 = var8;
        this.field1708 = var9;
        this.field1709 = var10;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([B)[Lfg;", line = 114)
    private static final class113[] method877(byte[] arg0) {
        class695 var1 = new class695(arg0);
        var1.field9761 = arg0.length - 2;
        int var2 = var1.method3847((byte) 118);
        class113[] var3 = new class113[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class113();
        }
        var1.field9761 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method3847((byte) 118);
        int var6 = var1.method3847((byte) 118);
        int var7 = (var1.method3826(false) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1704 = var1.method3847((byte) 118);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1707 = var1.method3847((byte) 118);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1706 = var1.method3847((byte) 118);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1708 = var1.method3847((byte) 118);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class113 var32 = var3[var12];
            var32.field1705 = var5 - var32.field1706 - var32.field1704;
            var32.field1703 = var6 - var32.field1708 - var32.field1707;
        }
        var1.field9761 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method3873(255);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1702 = var13;
        }
        var1.field9761 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class113 var17 = var3[var16];
            int var18 = var17.field1708 * var17.field1706;
            var17.field1709 = new byte[var18];
            int var19 = var1.method3826(false);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1701 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1709[var24] = var1.method3827((byte) 113);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1701[var25] = var1.method3827((byte) 98);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1706; var27++) {
                        for (int var31 = 0; var31 < var17.field1708; var31++) {
                            var17.field1709[var17.field1706 * var31 + var27] = var1.method3827((byte) -83);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1706; var28++) {
                        for (int var29 = 0; var29 < var17.field1708; var29++) {
                            byte var30 = var17.field1701[var17.field1706 * var29 + var28] = var1.method3827((byte) -127);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1701 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1709[var20] = var1.method3827((byte) -126);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1706; var21++) {
                    for (int var22 = 0; var22 < var17.field1708; var22++) {
                        var17.field1709[var17.field1706 * var22 + var21] = var1.method3827((byte) -81);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V", line = 322)
    public final void method878() {
        byte[] var1 = this.field1709;
        if (this.field1701 == null) {
            for (int var2 = this.field1708 - 1; var2 >= 0; var2--) {
                int var3 = this.field1706 * var2;
                int var4 = (var2 + 1) * this.field1706;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1701;
            for (int var7 = this.field1708 - 1; var7 >= 0; var7--) {
                int var9 = this.field1706 * var7;
                int var10 = (var7 + 1) * this.field1706;
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
        int var8 = this.field1704;
        this.field1704 = this.field1705;
        this.field1705 = var8;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 386)
    public final void method879(int arg0) {
        int var2 = -1;
        if (this.field1702.length < 255) {
            for (int var3 = 0; var3 < this.field1702.length; var3++) {
                if (this.field1702[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1702.length;
                int[] var4 = new int[this.field1702.length + 1];
                class476.method2793(this.field1702, 0, var4, 0, this.field1702.length);
                this.field1702 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1702.length; var9++) {
                int var15 = this.field1702[var9];
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
        byte[] var11 = new byte[this.field1708 * this.field1706];
        for (int var12 = 0; var12 < this.field1708; var12++) {
            for (int var13 = 0; var13 < this.field1706; var13++) {
                int var14 = this.field1709[var10] & 0xFF;
                if (this.field1702[var14] == 0) {
                    if (var13 > 0 && this.field1702[this.field1709[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1702[this.field1709[var10 - this.field1706] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1706 - 1 && this.field1702[this.field1709[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1708 - 1 && this.field1702[this.field1709[this.field1706 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1709 = var11;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lpu;I)[Lfg;", line = 513)
    public static final class113[] method880(class522 arg0, int arg1) {
        byte[] var2 = arg0.method2994(arg1, (byte) 93);
        return var2 == null ? null : method877(var2);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()V", line = 522)
    public final void method881() {
        int var1 = this.method873();
        int var2 = this.method874();
        if (this.field1706 == var1 && this.field1708 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1701 == null) {
            for (int var9 = 0; var9 < this.field1708; var9++) {
                int var10 = this.field1706 * var9;
                int var11 = (this.field1707 + var9) * var1 + this.field1704;
                for (int var12 = 0; var12 < this.field1706; var12++) {
                    var3[var11++] = this.field1709[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1708; var5++) {
                int var6 = this.field1706 * var5;
                int var7 = (this.field1707 + var5) * var1 + this.field1704;
                for (int var8 = 0; var8 < this.field1706; var8++) {
                    var3[var7] = this.field1709[var6];
                    var4[var7++] = this.field1701[var6++];
                }
            }
            this.field1701 = var4;
        }
        this.field1704 = this.field1705 = this.field1707 = this.field1703 = 0;
        this.field1706 = var1;
        this.field1708 = var2;
        this.field1709 = var3;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V", line = 593)
    public final void method882(int arg0) {
        int var2 = -1;
        if (this.field1702.length < 255) {
            for (int var3 = 0; var3 < this.field1702.length; var3++) {
                if (this.field1702[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1702.length;
                int[] var4 = new int[this.field1702.length + 1];
                class476.method2793(this.field1702, 0, var4, 0, this.field1702.length);
                this.field1702 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1702.length; var9++) {
                int var13 = this.field1702[var9];
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
        for (int var10 = this.field1708 - 1; var10 > 0; var10--) {
            int var11 = this.field1706 * var10;
            for (int var12 = this.field1706 - 1; var12 > 0; var12--) {
                if (this.field1702[this.field1709[var11 + var12] & 0xFF] == 0 && this.field1702[this.field1709[var11 + var12 - this.field1706 - 1] & 0xFF] != 0) {
                    this.field1709[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "()V", line = 697)
    public final void method883() {
        byte[] var1 = this.field1709;
        if (this.field1701 == null) {
            for (int var2 = (this.field1708 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1706 * var2;
                int var4 = (this.field1708 - var2 - 1) * this.field1706;
                for (int var5 = -this.field1706; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1701;
            for (int var8 = (this.field1708 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1706 * var8;
                int var11 = (this.field1708 - var8 - 1) * this.field1706;
                for (int var12 = -this.field1706; var12 < 0; var12++) {
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
        int var9 = this.field1707;
        this.field1707 = this.field1703;
        this.field1703 = var9;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lpu;II)[Lfg;", line = 769)
    public static final class113[] method884(class522 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3007(arg1, arg2, 5);
        return var3 == null ? null : method877(var3);
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "()V", line = 777)
    public final void method885() {
        byte[] var1 = new byte[this.field1708 * this.field1706];
        int var2 = 0;
        if (this.field1701 == null) {
            for (int var3 = 0; var3 < this.field1706; var3++) {
                for (int var4 = this.field1708 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1709[this.field1706 * var4 + var3];
                }
            }
            this.field1709 = var1;
        } else {
            byte[] var5 = new byte[this.field1708 * this.field1706];
            for (int var6 = 0; var6 < this.field1706; var6++) {
                for (int var9 = this.field1708 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1709[this.field1706 * var9 + var6];
                    var5[var2++] = this.field1701[this.field1706 * var9 + var6];
                }
            }
            this.field1709 = var1;
            this.field1701 = var5;
        }
        int var7 = this.field1707;
        this.field1707 = this.field1704;
        this.field1704 = this.field1703;
        this.field1703 = this.field1705;
        this.field1705 = this.field1707;
        int var8 = this.field1708;
        this.field1708 = this.field1706;
        this.field1706 = var8;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lpu;I)Lfg;", line = 839)
    public static final class113 method886(class522 arg0, int arg1) {
        byte[] var2 = arg0.method2994(arg1, (byte) 93);
        return var2 == null ? null : method877(var2)[0];
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "()[I", line = 850)
    public final int[] method887() {
        int var1 = this.method873();
        int[] var2 = new int[var1 * this.method874()];
        if (this.field1701 == null) {
            for (int var7 = 0; var7 < this.field1708; var7++) {
                int var8 = this.field1706 * var7;
                int var9 = (this.field1707 + var7) * var1 + this.field1704;
                for (int var10 = 0; var10 < this.field1706; var10++) {
                    int var11 = this.field1702[this.field1709[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1708; var3++) {
                int var4 = this.field1706 * var3;
                int var5 = (this.field1707 + var3) * var1 + this.field1704;
                for (int var6 = 0; var6 < this.field1706; var6++) {
                    var2[var5++] = this.field1701[var4] << 24 | this.field1702[this.field1709[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }
}
