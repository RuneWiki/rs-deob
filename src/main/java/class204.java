import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class204 {

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public int field2418;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "[B")
    public byte[] field2416;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "[B")
    public byte[] field2422;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "[I")
    public int[] field2417;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lni;II)[Ltw;", line = 4)
    public static final class204[] method1124(class522 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2885(arg2, arg1, false);
        return var3 == null ? null : method1134(var3);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "()I", line = 11)
    public final int method1125() {
        return this.field2420 + this.field2419 + this.field2423;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "()V", line = 17)
    public final void method1126() {
        byte[] var1 = this.field2416;
        if (this.field2422 == null) {
            for (int var2 = (this.field2419 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field2421 * var2;
                int var4 = (this.field2419 - var2 - 1) * this.field2421;
                for (int var5 = -this.field2421; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field2422;
            for (int var8 = (this.field2419 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field2421 * var8;
                int var11 = (this.field2419 - var8 - 1) * this.field2421;
                for (int var12 = -this.field2421; var12 < 0; var12++) {
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
        int var9 = this.field2420;
        this.field2420 = this.field2423;
        this.field2423 = var9;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lni;I)Ltw;", line = 88)
    public static final class204 method1127(class522 arg0, int arg1) {
        byte[] var2 = arg0.method2873(arg1, -117);
        return var2 == null ? null : method1134(var2)[0];
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(Lni;I)[Ltw;", line = 96)
    public static final class204[] method1128(class522 arg0, int arg1) {
        byte[] var2 = arg0.method2873(arg1, -127);
        return var2 == null ? null : method1134(var2);
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(Lni;II)Ltw;", line = 105)
    public static final class204 method1129(class522 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2885(arg2, arg1, false);
        return var3 == null ? null : method1134(var3)[0];
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "()[I", line = 113)
    public final int[] method1130() {
        int var1 = this.method1133();
        int[] var2 = new int[var1 * this.method1125()];
        if (this.field2422 == null) {
            for (int var7 = 0; var7 < this.field2419; var7++) {
                int var8 = this.field2421 * var7;
                int var9 = (this.field2420 + var7) * var1 + this.field2424;
                for (int var10 = 0; var10 < this.field2421; var10++) {
                    int var11 = this.field2417[this.field2416[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field2419; var3++) {
                int var4 = this.field2421 * var3;
                int var5 = (this.field2420 + var3) * var1 + this.field2424;
                for (int var6 = 0; var6 < this.field2421; var6++) {
                    var2[var5++] = this.field2422[var4] << 24 | this.field2417[this.field2416[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "()V", line = 176)
    public final void method1131() {
        byte[] var1 = new byte[this.field2421 * this.field2419];
        int var2 = 0;
        if (this.field2422 == null) {
            for (int var3 = 0; var3 < this.field2421; var3++) {
                for (int var4 = this.field2419 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field2416[this.field2421 * var4 + var3];
                }
            }
            this.field2416 = var1;
        } else {
            byte[] var5 = new byte[this.field2421 * this.field2419];
            for (int var6 = 0; var6 < this.field2421; var6++) {
                for (int var9 = this.field2419 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field2416[this.field2421 * var9 + var6];
                    var5[var2++] = this.field2422[this.field2421 * var9 + var6];
                }
            }
            this.field2416 = var1;
            this.field2422 = var5;
        }
        int var7 = this.field2420;
        this.field2420 = this.field2424;
        this.field2424 = this.field2423;
        this.field2423 = this.field2418;
        this.field2418 = this.field2420;
        int var8 = this.field2419;
        this.field2419 = this.field2421;
        this.field2421 = var8;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 236)
    public final void method1132(int arg0) {
        int var2 = this.method1133();
        int var3 = this.method1125();
        if (this.field2421 == var2 && this.field2419 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field2424) {
            var4 = this.field2424;
        }
        int var5 = arg0;
        if (this.field2424 + arg0 + this.field2421 > var2) {
            var5 = var2 - this.field2424 - this.field2421;
        }
        int var6 = arg0;
        if (arg0 > this.field2420) {
            var6 = this.field2420;
        }
        int var7 = arg0;
        if (this.field2420 + arg0 + this.field2419 > var3) {
            var7 = var3 - this.field2420 - this.field2419;
        }
        int var8 = this.field2421 + var4 + var5;
        int var9 = this.field2419 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field2422 == null) {
            for (int var11 = 0; var11 < this.field2419; var11++) {
                int var12 = this.field2421 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field2421; var14++) {
                    var10[var13++] = this.field2416[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field2419; var16++) {
                int var17 = this.field2421 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field2421; var19++) {
                    var15[var18] = this.field2422[var17];
                    var10[var18++] = this.field2416[var17++];
                }
            }
            this.field2422 = var15;
        }
        this.field2424 -= var4;
        this.field2420 -= var6;
        this.field2418 -= var5;
        this.field2423 -= var7;
        this.field2421 = var8;
        this.field2419 = var9;
        this.field2416 = var10;
    }

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "()I", line = 330)
    public final int method1133() {
        return this.field2424 + this.field2421 + this.field2418;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "([B)[Ltw;", line = 334)
    private static final class204[] method1134(byte[] arg0) {
        class611 var1 = new class611(arg0);
        var1.field8520 = arg0.length - 2;
        int var2 = var1.method3402((byte) 127);
        class204[] var3 = new class204[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class204();
        }
        var1.field8520 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method3402((byte) 127);
        int var6 = var1.method3402((byte) 127);
        int var7 = (var1.method3428((byte) 48) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field2424 = var1.method3402((byte) 127);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field2420 = var1.method3402((byte) 127);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field2421 = var1.method3402((byte) 127);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field2419 = var1.method3402((byte) 127);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class204 var32 = var3[var12];
            var32.field2418 = var5 - var32.field2421 - var32.field2424;
            var32.field2423 = var6 - var32.field2419 - var32.field2420;
        }
        var1.field8520 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method3385(-124);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field2417 = var13;
        }
        var1.field8520 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class204 var17 = var3[var16];
            int var18 = var17.field2421 * var17.field2419;
            var17.field2416 = new byte[var18];
            int var19 = var1.method3428((byte) -117);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field2422 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field2416[var24] = var1.method3390((byte) -19);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field2422[var25] = var1.method3390((byte) -19);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field2421; var27++) {
                        for (int var31 = 0; var31 < var17.field2419; var31++) {
                            var17.field2416[var17.field2421 * var31 + var27] = var1.method3390((byte) -19);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field2421; var28++) {
                        for (int var29 = 0; var29 < var17.field2419; var29++) {
                            byte var30 = var17.field2422[var17.field2421 * var29 + var28] = var1.method3390((byte) -19);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field2422 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field2416[var20] = var1.method3390((byte) -19);
                }
            } else {
                for (int var21 = 0; var21 < var17.field2421; var21++) {
                    for (int var22 = 0; var22 < var17.field2419; var22++) {
                        var17.field2416[var17.field2421 * var22 + var21] = var1.method3390((byte) -19);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "()V", line = 544)
    public final void method1135() {
        byte[] var1 = this.field2416;
        if (this.field2422 == null) {
            for (int var2 = this.field2419 - 1; var2 >= 0; var2--) {
                int var3 = this.field2421 * var2;
                int var4 = (var2 + 1) * this.field2421;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field2422;
            for (int var7 = this.field2419 - 1; var7 >= 0; var7--) {
                int var9 = this.field2421 * var7;
                int var10 = (var7 + 1) * this.field2421;
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
        int var8 = this.field2424;
        this.field2424 = this.field2418;
        this.field2418 = var8;
    }

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "()V", line = 606)
    public final void method1136() {
        int var1 = this.method1133();
        int var2 = this.method1125();
        if (this.field2421 == var1 && this.field2419 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field2422 == null) {
            for (int var9 = 0; var9 < this.field2419; var9++) {
                int var10 = this.field2421 * var9;
                int var11 = (this.field2420 + var9) * var1 + this.field2424;
                for (int var12 = 0; var12 < this.field2421; var12++) {
                    var3[var11++] = this.field2416[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field2419; var5++) {
                int var6 = this.field2421 * var5;
                int var7 = (this.field2420 + var5) * var1 + this.field2424;
                for (int var8 = 0; var8 < this.field2421; var8++) {
                    var3[var7] = this.field2416[var6];
                    var4[var7++] = this.field2422[var6++];
                }
            }
            this.field2422 = var4;
        }
        this.field2424 = this.field2418 = this.field2420 = this.field2423 = 0;
        this.field2421 = var1;
        this.field2419 = var2;
        this.field2416 = var3;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V", line = 676)
    public final void method1137(int arg0) {
        int var2 = -1;
        if (this.field2417.length < 255) {
            for (int var3 = 0; var3 < this.field2417.length; var3++) {
                if (this.field2417[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2417.length;
                int[] var4 = new int[this.field2417.length + 1];
                class373.method2191(this.field2417, 0, var4, 0, this.field2417.length);
                this.field2417 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2417.length; var9++) {
                int var13 = this.field2417[var9];
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
        for (int var10 = this.field2419 - 1; var10 > 0; var10--) {
            int var11 = this.field2421 * var10;
            for (int var12 = this.field2421 - 1; var12 > 0; var12--) {
                if (this.field2417[this.field2416[var11 + var12] & 0xFF] == 0 && this.field2417[this.field2416[var11 + var12 - this.field2421 - 1] & 0xFF] != 0) {
                    this.field2416[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)V", line = 788)
    public final void method1138(int arg0) {
        int var2 = -1;
        if (this.field2417.length < 255) {
            for (int var3 = 0; var3 < this.field2417.length; var3++) {
                if (this.field2417[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2417.length;
                int[] var4 = new int[this.field2417.length + 1];
                class373.method2191(this.field2417, 0, var4, 0, this.field2417.length);
                this.field2417 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2417.length; var9++) {
                int var15 = this.field2417[var9];
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
        byte[] var11 = new byte[this.field2421 * this.field2419];
        for (int var12 = 0; var12 < this.field2419; var12++) {
            for (int var13 = 0; var13 < this.field2421; var13++) {
                int var14 = this.field2416[var10] & 0xFF;
                if (this.field2417[var14] == 0) {
                    if (var13 > 0 && this.field2417[this.field2416[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field2417[this.field2416[var10 - this.field2421] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field2421 - 1 && this.field2417[this.field2416[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field2419 - 1 && this.field2417[this.field2416[this.field2421 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field2416 = var11;
    }
}
