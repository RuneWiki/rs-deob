import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class49 {

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "[B")
    public byte[] field737;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "[B")
    public byte[] field743;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "[I")
    public int[] field739;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "()V", line = 5)
    public final void method363() {
        byte[] var1 = this.field743;
        if (this.field737 == null) {
            for (int var2 = this.field741 - 1; var2 >= 0; var2--) {
                int var3 = this.field745 * var2;
                int var4 = (var2 + 1) * this.field745;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field737;
            for (int var7 = this.field741 - 1; var7 >= 0; var7--) {
                int var9 = this.field745 * var7;
                int var10 = (var7 + 1) * this.field745;
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
        int var8 = this.field744;
        this.field744 = this.field740;
        this.field740 = var8;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 67)
    public final void method364(int arg0) {
        int var2 = -1;
        if (this.field739.length < 255) {
            for (int var3 = 0; var3 < this.field739.length; var3++) {
                if (this.field739[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field739.length;
                int[] var4 = new int[this.field739.length + 1];
                class275.method1770(this.field739, 0, var4, 0, this.field739.length);
                this.field739 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field739.length; var9++) {
                int var15 = this.field739[var9];
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
        byte[] var11 = new byte[this.field745 * this.field741];
        for (int var12 = 0; var12 < this.field741; var12++) {
            for (int var13 = 0; var13 < this.field745; var13++) {
                int var14 = this.field743[var10] & 0xFF;
                if (this.field739[var14] == 0) {
                    if (var13 > 0 && this.field739[this.field743[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field739[this.field743[var10 - this.field745] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field745 - 1 && this.field739[this.field743[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field741 - 1 && this.field739[this.field743[this.field745 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field743 = var11;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "()V", line = 196)
    public final void method365() {
        byte[] var1 = this.field743;
        if (this.field737 == null) {
            for (int var2 = (this.field741 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field745 * var2;
                int var4 = (this.field741 - var2 - 1) * this.field745;
                for (int var5 = -this.field745; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field737;
            for (int var8 = (this.field741 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field745 * var8;
                int var11 = (this.field741 - var8 - 1) * this.field745;
                for (int var12 = -this.field745; var12 < 0; var12++) {
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
        int var9 = this.field738;
        this.field738 = this.field742;
        this.field742 = var9;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lgj;II)Lgs;", line = 267)
    public static final class49 method366(class662 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3732(arg2, 8906, arg1);
        return var3 == null ? null : method376(var3)[0];
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "()V", line = 275)
    public final void method367() {
        int var1 = this.method369();
        int var2 = this.method371();
        if (this.field745 == var1 && this.field741 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field737 == null) {
            for (int var9 = 0; var9 < this.field741; var9++) {
                int var10 = this.field745 * var9;
                int var11 = (this.field738 + var9) * var1 + this.field744;
                for (int var12 = 0; var12 < this.field745; var12++) {
                    var3[var11++] = this.field743[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field741; var5++) {
                int var6 = this.field745 * var5;
                int var7 = (this.field738 + var5) * var1 + this.field744;
                for (int var8 = 0; var8 < this.field745; var8++) {
                    var3[var7] = this.field743[var6];
                    var4[var7++] = this.field737[var6++];
                }
            }
            this.field737 = var4;
        }
        this.field744 = this.field740 = this.field738 = this.field742 = 0;
        this.field745 = var1;
        this.field741 = var2;
        this.field743 = var3;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V", line = 343)
    public final void method368(int arg0) {
        int var2 = this.method369();
        int var3 = this.method371();
        if (this.field745 == var2 && this.field741 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field744) {
            var4 = this.field744;
        }
        int var5 = arg0;
        if (this.field744 + arg0 + this.field745 > var2) {
            var5 = var2 - this.field744 - this.field745;
        }
        int var6 = arg0;
        if (arg0 > this.field738) {
            var6 = this.field738;
        }
        int var7 = arg0;
        if (this.field738 + arg0 + this.field741 > var3) {
            var7 = var3 - this.field738 - this.field741;
        }
        int var8 = this.field745 + var4 + var5;
        int var9 = this.field741 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field737 == null) {
            for (int var11 = 0; var11 < this.field741; var11++) {
                int var12 = this.field745 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field745; var14++) {
                    var10[var13++] = this.field743[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field741; var16++) {
                int var17 = this.field745 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field745; var19++) {
                    var15[var18] = this.field737[var17];
                    var10[var18++] = this.field743[var17++];
                }
            }
            this.field737 = var15;
        }
        this.field744 -= var4;
        this.field738 -= var6;
        this.field740 -= var5;
        this.field742 -= var7;
        this.field745 = var8;
        this.field741 = var9;
        this.field743 = var10;
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "()I", line = 439)
    public final int method369() {
        return this.field745 + this.field744 + this.field740;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lgj;I)Lgs;", line = 443)
    public static final class49 method370(class662 arg0, int arg1) {
        byte[] var2 = arg0.method3742(5, arg1);
        return var2 == null ? null : method376(var2)[0];
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "()I", line = 450)
    public final int method371() {
        return this.field741 + this.field738 + this.field742;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Lgj;I)[Lgs;", line = 455)
    public static final class49[] method372(class662 arg0, int arg1) {
        byte[] var2 = arg0.method3742(5, arg1);
        return var2 == null ? null : method376(var2);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Lgj;II)[Lgs;", line = 463)
    public static final class49[] method373(class662 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3732(arg2, 8906, arg1);
        return var3 == null ? null : method376(var3);
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "()V", line = 472)
    public final void method374() {
        byte[] var1 = new byte[this.field745 * this.field741];
        int var2 = 0;
        if (this.field737 == null) {
            for (int var3 = 0; var3 < this.field745; var3++) {
                for (int var4 = this.field741 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field743[this.field745 * var4 + var3];
                }
            }
            this.field743 = var1;
        } else {
            byte[] var5 = new byte[this.field745 * this.field741];
            for (int var6 = 0; var6 < this.field745; var6++) {
                for (int var9 = this.field741 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field743[this.field745 * var9 + var6];
                    var5[var2++] = this.field737[this.field745 * var9 + var6];
                }
            }
            this.field743 = var1;
            this.field737 = var5;
        }
        int var7 = this.field738;
        this.field738 = this.field744;
        this.field744 = this.field742;
        this.field742 = this.field740;
        this.field740 = this.field738;
        int var8 = this.field741;
        this.field741 = this.field745;
        this.field745 = var8;
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V", line = 532)
    public final void method375(int arg0) {
        int var2 = -1;
        if (this.field739.length < 255) {
            for (int var3 = 0; var3 < this.field739.length; var3++) {
                if (this.field739[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field739.length;
                int[] var4 = new int[this.field739.length + 1];
                class275.method1770(this.field739, 0, var4, 0, this.field739.length);
                this.field739 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field739.length; var9++) {
                int var13 = this.field739[var9];
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
        for (int var10 = this.field741 - 1; var10 > 0; var10--) {
            int var11 = this.field745 * var10;
            for (int var12 = this.field745 - 1; var12 > 0; var12--) {
                if (this.field739[this.field743[var11 + var12] & 0xFF] == 0 && this.field739[this.field743[var11 + var12 - this.field745 - 1] & 0xFF] != 0) {
                    this.field743[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([B)[Lgs;", line = 635)
    private static final class49[] method376(byte[] arg0) {
        class93 var1 = new class93(arg0);
        var1.field1442 = arg0.length - 2;
        int var2 = var1.method763(112);
        class49[] var3 = new class49[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class49();
        }
        var1.field1442 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method763(-43);
        int var6 = var1.method763(-26);
        int var7 = (var1.method793((byte) 96) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field744 = var1.method763(74);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field738 = var1.method763(-100);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field745 = var1.method763(5);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field741 = var1.method763(100);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class49 var32 = var3[var12];
            var32.field740 = var5 - var32.field745 - var32.field744;
            var32.field742 = var6 - var32.field741 - var32.field738;
        }
        var1.field1442 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method767((byte) -126);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field739 = var13;
        }
        var1.field1442 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class49 var17 = var3[var16];
            int var18 = var17.field745 * var17.field741;
            var17.field743 = new byte[var18];
            int var19 = var1.method793((byte) 95);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field737 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field743[var24] = var1.method766((byte) 122);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field737[var25] = var1.method766((byte) 122);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field745; var27++) {
                        for (int var31 = 0; var31 < var17.field741; var31++) {
                            var17.field743[var17.field745 * var31 + var27] = var1.method766((byte) 122);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field745; var28++) {
                        for (int var29 = 0; var29 < var17.field741; var29++) {
                            byte var30 = var17.field737[var17.field745 * var29 + var28] = var1.method766((byte) 122);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field737 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field743[var20] = var1.method766((byte) 122);
                }
            } else {
                for (int var21 = 0; var21 < var17.field745; var21++) {
                    for (int var22 = 0; var22 < var17.field741; var22++) {
                        var17.field743[var17.field745 * var22 + var21] = var1.method766((byte) 122);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "()[I", line = 844)
    public final int[] method377() {
        int var1 = this.method369();
        int[] var2 = new int[var1 * this.method371()];
        if (this.field737 == null) {
            for (int var7 = 0; var7 < this.field741; var7++) {
                int var8 = this.field745 * var7;
                int var9 = (this.field738 + var7) * var1 + this.field744;
                for (int var10 = 0; var10 < this.field745; var10++) {
                    int var11 = this.field739[this.field743[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field741; var3++) {
                int var4 = this.field745 * var3;
                int var5 = (this.field738 + var3) * var1 + this.field744;
                for (int var6 = 0; var6 < this.field745; var6++) {
                    var2[var5++] = this.field737[var4] << 24 | this.field739[this.field743[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }
}
