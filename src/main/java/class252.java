import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class252 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public int field3505;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public int field3513;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "[B")
    public byte[] field3506;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "[B")
    public byte[] field3511;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "[I")
    public int[] field3508;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()I")
    public final int method1629() {
        return this.field3512 + this.field3509 + this.field3510;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Luu;II)Lmn;")
    public static final class252 method1630(class191 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1281(arg1, arg2, 109);
        return var3 == null ? null : method1641(var3)[0];
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Luu;I)Lmn;")
    public static final class252 method1631(class191 arg0, int arg1) {
        byte[] var2 = arg0.method1289(arg1, 126);
        return var2 == null ? null : method1641(var2)[0];
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public final void method1632(int arg0) {
        int var2 = -1;
        if (this.field3508.length < 255) {
            for (int var3 = 0; var3 < this.field3508.length; var3++) {
                if (this.field3508[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3508.length;
                int[] var4 = new int[this.field3508.length + 1];
                class192.method1298(this.field3508, 0, var4, 0, this.field3508.length);
                this.field3508 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3508.length; var9++) {
                int var15 = this.field3508[var9];
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
        byte[] var11 = new byte[this.field3513 * this.field3512];
        for (int var12 = 0; var12 < this.field3513; var12++) {
            for (int var13 = 0; var13 < this.field3512; var13++) {
                int var14 = this.field3506[var10] & 0xFF;
                if (this.field3508[var14] == 0) {
                    if (var13 > 0 && this.field3508[this.field3506[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field3508[this.field3506[var10 - this.field3512] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field3512 - 1 && this.field3508[this.field3506[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field3513 - 1 && this.field3508[this.field3506[this.field3512 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field3506 = var11;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public final void method1633(int arg0) {
        int var2 = -1;
        if (this.field3508.length < 255) {
            for (int var3 = 0; var3 < this.field3508.length; var3++) {
                if (this.field3508[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3508.length;
                int[] var4 = new int[this.field3508.length + 1];
                class192.method1298(this.field3508, 0, var4, 0, this.field3508.length);
                this.field3508 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3508.length; var9++) {
                int var13 = this.field3508[var9];
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
        for (int var10 = this.field3513 - 1; var10 > 0; var10--) {
            int var11 = this.field3512 * var10;
            for (int var12 = this.field3512 - 1; var12 > 0; var12--) {
                if (this.field3508[this.field3506[var11 + var12] & 0xFF] == 0 && this.field3508[this.field3506[var11 + var12 - this.field3512 - 1] & 0xFF] != 0) {
                    this.field3506[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "()V")
    public final void method1634() {
        byte[] var1 = this.field3506;
        if (this.field3511 == null) {
            for (int var2 = this.field3513 - 1; var2 >= 0; var2--) {
                int var3 = this.field3512 * var2;
                int var4 = (var2 + 1) * this.field3512;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field3511;
            for (int var7 = this.field3513 - 1; var7 >= 0; var7--) {
                int var9 = this.field3512 * var7;
                int var10 = (var7 + 1) * this.field3512;
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
        int var8 = this.field3509;
        this.field3509 = this.field3510;
        this.field3510 = var8;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "()V")
    public final void method1635() {
        byte[] var1 = new byte[this.field3513 * this.field3512];
        int var2 = 0;
        if (this.field3511 == null) {
            for (int var3 = 0; var3 < this.field3512; var3++) {
                for (int var4 = this.field3513 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field3506[this.field3512 * var4 + var3];
                }
            }
            this.field3506 = var1;
        } else {
            byte[] var5 = new byte[this.field3513 * this.field3512];
            for (int var6 = 0; var6 < this.field3512; var6++) {
                for (int var9 = this.field3513 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field3506[this.field3512 * var9 + var6];
                    var5[var2++] = this.field3511[this.field3512 * var9 + var6];
                }
            }
            this.field3506 = var1;
            this.field3511 = var5;
        }
        int var7 = this.field3505;
        this.field3505 = this.field3509;
        this.field3509 = this.field3507;
        this.field3507 = this.field3510;
        this.field3510 = this.field3505;
        int var8 = this.field3513;
        this.field3513 = this.field3512;
        this.field3512 = var8;
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "()[I")
    public final int[] method1636() {
        int var1 = this.method1629();
        int[] var2 = new int[var1 * this.method1640()];
        if (this.field3511 == null) {
            for (int var7 = 0; var7 < this.field3513; var7++) {
                int var8 = this.field3512 * var7;
                int var9 = (this.field3505 + var7) * var1 + this.field3509;
                for (int var10 = 0; var10 < this.field3512; var10++) {
                    int var11 = this.field3508[this.field3506[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field3513; var3++) {
                int var4 = this.field3512 * var3;
                int var5 = (this.field3505 + var3) * var1 + this.field3509;
                for (int var6 = 0; var6 < this.field3512; var6++) {
                    var2[var5++] = this.field3511[var4] << 24 | this.field3508[this.field3506[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
    public final void method1637(int arg0) {
        int var2 = this.method1629();
        int var3 = this.method1640();
        if (this.field3512 == var2 && this.field3513 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field3509) {
            var4 = this.field3509;
        }
        int var5 = arg0;
        if (this.field3509 + arg0 + this.field3512 > var2) {
            var5 = var2 - this.field3509 - this.field3512;
        }
        int var6 = arg0;
        if (arg0 > this.field3505) {
            var6 = this.field3505;
        }
        int var7 = arg0;
        if (this.field3505 + arg0 + this.field3513 > var3) {
            var7 = var3 - this.field3505 - this.field3513;
        }
        int var8 = this.field3512 + var4 + var5;
        int var9 = this.field3513 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field3511 == null) {
            for (int var11 = 0; var11 < this.field3513; var11++) {
                int var12 = this.field3512 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field3512; var14++) {
                    var10[var13++] = this.field3506[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field3513; var16++) {
                int var17 = this.field3512 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field3512; var19++) {
                    var15[var18] = this.field3511[var17];
                    var10[var18++] = this.field3506[var17++];
                }
            }
            this.field3511 = var15;
        }
        this.field3509 -= var4;
        this.field3505 -= var6;
        this.field3510 -= var5;
        this.field3507 -= var7;
        this.field3512 = var8;
        this.field3513 = var9;
        this.field3506 = var10;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Luu;II)[Lmn;")
    public static final class252[] method1638(class191 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1281(arg1, arg2, 100);
        return var3 == null ? null : method1641(var3);
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "()V")
    public final void method1639() {
        byte[] var1 = this.field3506;
        if (this.field3511 == null) {
            for (int var2 = (this.field3513 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field3512 * var2;
                int var4 = (this.field3513 - var2 - 1) * this.field3512;
                for (int var5 = -this.field3512; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field3511;
            for (int var8 = (this.field3513 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field3512 * var8;
                int var11 = (this.field3513 - var8 - 1) * this.field3512;
                for (int var12 = -this.field3512; var12 < 0; var12++) {
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
        int var9 = this.field3505;
        this.field3505 = this.field3507;
        this.field3507 = var9;
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "()I")
    public final int method1640() {
        return this.field3513 + this.field3505 + this.field3507;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "([B)[Lmn;")
    private static final class252[] method1641(byte[] arg0) {
        class164 var1 = new class164(arg0);
        var1.field2185 = arg0.length - 2;
        int var2 = var1.method1074(-635989152);
        class252[] var3 = new class252[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class252();
        }
        var1.field2185 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1074(-635989152);
        int var6 = var1.method1074(-635989152);
        int var7 = (var1.method1087(false) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field3509 = var1.method1074(-635989152);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field3505 = var1.method1074(-635989152);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field3512 = var1.method1074(-635989152);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field3513 = var1.method1074(-635989152);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class252 var32 = var3[var12];
            var32.field3510 = var5 - var32.field3512 - var32.field3509;
            var32.field3507 = var6 - var32.field3513 - var32.field3505;
        }
        var1.field2185 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1090(-1);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field3508 = var13;
        }
        var1.field2185 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class252 var17 = var3[var16];
            int var18 = var17.field3513 * var17.field3512;
            var17.field3506 = new byte[var18];
            int var19 = var1.method1087(false);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field3511 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field3506[var24] = var1.method1088((byte) -112);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field3511[var25] = var1.method1088((byte) 101);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field3512; var27++) {
                        for (int var31 = 0; var31 < var17.field3513; var31++) {
                            var17.field3506[var17.field3512 * var31 + var27] = var1.method1088((byte) -90);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field3512; var28++) {
                        for (int var29 = 0; var29 < var17.field3513; var29++) {
                            byte var30 = var17.field3511[var17.field3512 * var29 + var28] = var1.method1088((byte) -82);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field3511 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field3506[var20] = var1.method1088((byte) 58);
                }
            } else {
                for (int var21 = 0; var21 < var17.field3512; var21++) {
                    for (int var22 = 0; var22 < var17.field3513; var22++) {
                        var17.field3506[var17.field3512 * var22 + var21] = var1.method1088((byte) 72);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "()V")
    public final void method1642() {
        int var1 = this.method1629();
        int var2 = this.method1640();
        if (this.field3512 == var1 && this.field3513 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field3511 == null) {
            for (int var9 = 0; var9 < this.field3513; var9++) {
                int var10 = this.field3512 * var9;
                int var11 = (this.field3505 + var9) * var1 + this.field3509;
                for (int var12 = 0; var12 < this.field3512; var12++) {
                    var3[var11++] = this.field3506[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field3513; var5++) {
                int var6 = this.field3512 * var5;
                int var7 = (this.field3505 + var5) * var1 + this.field3509;
                for (int var8 = 0; var8 < this.field3512; var8++) {
                    var3[var7] = this.field3506[var6];
                    var4[var7++] = this.field3511[var6++];
                }
            }
            this.field3511 = var4;
        }
        this.field3509 = this.field3510 = this.field3505 = this.field3507 = 0;
        this.field3512 = var1;
        this.field3513 = var2;
        this.field3506 = var3;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Luu;I)[Lmn;")
    public static final class252[] method1643(class191 arg0, int arg1) {
        byte[] var2 = arg0.method1289(arg1, 103);
        return var2 == null ? null : method1641(var2);
    }
}
