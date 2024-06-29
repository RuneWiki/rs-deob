import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class168 {

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
    public int field2446;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "[B")
    public byte[] field2447;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "[B")
    public byte[] field2450;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "[I")
    public int[] field2442;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "([B)[Lqga;", line = 4)
    private static final class168[] method1181(byte[] arg0) {
        class501 var1 = new class501(arg0);
        var1.field6892 = arg0.length - 2;
        int var2 = var1.method2845(-1);
        class168[] var3 = new class168[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class168();
        }
        var1.field6892 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2845(-1);
        int var6 = var1.method2845(-1);
        int var7 = (var1.method2874((byte) -75) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field2446 = var1.method2845(-1);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field2448 = var1.method2845(-1);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field2445 = var1.method2845(-1);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field2449 = var1.method2845(-1);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class168 var32 = var3[var12];
            var32.field2443 = var5 - var32.field2445 - var32.field2446;
            var32.field2444 = var6 - var32.field2449 - var32.field2448;
        }
        var1.field6892 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2819((byte) 72);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field2442 = var13;
        }
        var1.field6892 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class168 var17 = var3[var16];
            int var18 = var17.field2449 * var17.field2445;
            var17.field2450 = new byte[var18];
            int var19 = var1.method2874((byte) -75);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field2447 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field2450[var24] = var1.method2863(110);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field2447[var25] = var1.method2863(119);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field2445; var27++) {
                        for (int var31 = 0; var31 < var17.field2449; var31++) {
                            var17.field2450[var17.field2445 * var31 + var27] = var1.method2863(112);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field2445; var28++) {
                        for (int var29 = 0; var29 < var17.field2449; var29++) {
                            byte var30 = var17.field2447[var17.field2445 * var29 + var28] = var1.method2863(101);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field2447 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field2450[var20] = var1.method2863(106);
                }
            } else {
                for (int var21 = 0; var21 < var17.field2445; var21++) {
                    for (int var22 = 0; var22 < var17.field2449; var22++) {
                        var17.field2450[var17.field2445 * var22 + var21] = var1.method2863(110);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "()[I", line = 213)
    public final int[] method1182() {
        int var1 = this.method1185();
        int[] var2 = new int[var1 * this.method1194()];
        if (this.field2447 == null) {
            for (int var7 = 0; var7 < this.field2449; var7++) {
                int var8 = this.field2445 * var7;
                int var9 = (this.field2448 + var7) * var1 + this.field2446;
                for (int var10 = 0; var10 < this.field2445; var10++) {
                    int var11 = this.field2442[this.field2450[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field2449; var3++) {
                int var4 = this.field2445 * var3;
                int var5 = (this.field2448 + var3) * var1 + this.field2446;
                for (int var6 = 0; var6 < this.field2445; var6++) {
                    var2[var5++] = this.field2447[var4] << 24 | this.field2442[this.field2450[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "()V", line = 276)
    public final void method1183() {
        byte[] var1 = new byte[this.field2449 * this.field2445];
        int var2 = 0;
        if (this.field2447 == null) {
            for (int var3 = 0; var3 < this.field2445; var3++) {
                for (int var4 = this.field2449 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field2450[this.field2445 * var4 + var3];
                }
            }
            this.field2450 = var1;
        } else {
            byte[] var5 = new byte[this.field2449 * this.field2445];
            for (int var6 = 0; var6 < this.field2445; var6++) {
                for (int var9 = this.field2449 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field2450[this.field2445 * var9 + var6];
                    var5[var2++] = this.field2447[this.field2445 * var9 + var6];
                }
            }
            this.field2450 = var1;
            this.field2447 = var5;
        }
        int var7 = this.field2448;
        this.field2448 = this.field2446;
        this.field2446 = this.field2444;
        this.field2444 = this.field2443;
        this.field2443 = this.field2448;
        int var8 = this.field2449;
        this.field2449 = this.field2445;
        this.field2445 = var8;
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "()V", line = 336)
    public final void method1184() {
        int var1 = this.method1185();
        int var2 = this.method1194();
        if (this.field2445 == var1 && this.field2449 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field2447 == null) {
            for (int var9 = 0; var9 < this.field2449; var9++) {
                int var10 = this.field2445 * var9;
                int var11 = (this.field2448 + var9) * var1 + this.field2446;
                for (int var12 = 0; var12 < this.field2445; var12++) {
                    var3[var11++] = this.field2450[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field2449; var5++) {
                int var6 = this.field2445 * var5;
                int var7 = (this.field2448 + var5) * var1 + this.field2446;
                for (int var8 = 0; var8 < this.field2445; var8++) {
                    var3[var7] = this.field2450[var6];
                    var4[var7++] = this.field2447[var6++];
                }
            }
            this.field2447 = var4;
        }
        this.field2446 = this.field2443 = this.field2448 = this.field2444 = 0;
        this.field2445 = var1;
        this.field2449 = var2;
        this.field2450 = var3;
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "()I", line = 406)
    public final int method1185() {
        return this.field2446 + this.field2445 + this.field2443;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lsea;II)[Lqga;", line = 410)
    public static final class168[] method1186(class648 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3654(-15615, arg1, arg2);
        return var3 == null ? null : method1181(var3);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V", line = 419)
    public final void method1187(int arg0) {
        int var2 = -1;
        if (this.field2442.length < 255) {
            for (int var3 = 0; var3 < this.field2442.length; var3++) {
                if (this.field2442[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2442.length;
                int[] var4 = new int[this.field2442.length + 1];
                class359.method2054(this.field2442, 0, var4, 0, this.field2442.length);
                this.field2442 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2442.length; var9++) {
                int var13 = this.field2442[var9];
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
        for (int var10 = this.field2449 - 1; var10 > 0; var10--) {
            int var11 = this.field2445 * var10;
            for (int var12 = this.field2445 - 1; var12 > 0; var12--) {
                if (this.field2442[this.field2450[var11 + var12] & 0xFF] == 0 && this.field2442[this.field2450[var11 + var12 - this.field2445 - 1] & 0xFF] != 0) {
                    this.field2450[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lsea;I)Lqga;", line = 524)
    public static final class168 method1188(class648 arg0, int arg1) {
        byte[] var2 = arg0.method3632(true, arg1);
        return var2 == null ? null : method1181(var2)[0];
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V", line = 533)
    public final void method1189(int arg0) {
        int var2 = -1;
        if (this.field2442.length < 255) {
            for (int var3 = 0; var3 < this.field2442.length; var3++) {
                if (this.field2442[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2442.length;
                int[] var4 = new int[this.field2442.length + 1];
                class359.method2054(this.field2442, 0, var4, 0, this.field2442.length);
                this.field2442 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2442.length; var9++) {
                int var15 = this.field2442[var9];
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
        byte[] var11 = new byte[this.field2449 * this.field2445];
        for (int var12 = 0; var12 < this.field2449; var12++) {
            for (int var13 = 0; var13 < this.field2445; var13++) {
                int var14 = this.field2450[var10] & 0xFF;
                if (this.field2442[var14] == 0) {
                    if (var13 > 0 && this.field2442[this.field2450[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field2442[this.field2450[var10 - this.field2445] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field2445 - 1 && this.field2442[this.field2450[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field2449 - 1 && this.field2442[this.field2450[this.field2445 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field2450 = var11;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(Lsea;I)[Lqga;", line = 658)
    public static final class168[] method1190(class648 arg0, int arg1) {
        byte[] var2 = arg0.method3632(true, arg1);
        return var2 == null ? null : method1181(var2);
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(I)V", line = 667)
    public final void method1191(int arg0) {
        int var2 = this.method1185();
        int var3 = this.method1194();
        if (this.field2445 == var2 && this.field2449 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field2446) {
            var4 = this.field2446;
        }
        int var5 = arg0;
        if (this.field2446 + arg0 + this.field2445 > var2) {
            var5 = var2 - this.field2446 - this.field2445;
        }
        int var6 = arg0;
        if (arg0 > this.field2448) {
            var6 = this.field2448;
        }
        int var7 = arg0;
        if (this.field2448 + arg0 + this.field2449 > var3) {
            var7 = var3 - this.field2448 - this.field2449;
        }
        int var8 = this.field2445 + var4 + var5;
        int var9 = this.field2449 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field2447 == null) {
            for (int var11 = 0; var11 < this.field2449; var11++) {
                int var12 = this.field2445 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field2445; var14++) {
                    var10[var13++] = this.field2450[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field2449; var16++) {
                int var17 = this.field2445 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field2445; var19++) {
                    var15[var18] = this.field2447[var17];
                    var10[var18++] = this.field2450[var17++];
                }
            }
            this.field2447 = var15;
        }
        this.field2446 -= var4;
        this.field2448 -= var6;
        this.field2443 -= var5;
        this.field2444 -= var7;
        this.field2445 = var8;
        this.field2449 = var9;
        this.field2450 = var10;
    }

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "()V", line = 763)
    public final void method1192() {
        byte[] var1 = this.field2450;
        if (this.field2447 == null) {
            for (int var2 = this.field2449 - 1; var2 >= 0; var2--) {
                int var3 = this.field2445 * var2;
                int var4 = (var2 + 1) * this.field2445;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field2447;
            for (int var7 = this.field2449 - 1; var7 >= 0; var7--) {
                int var9 = this.field2445 * var7;
                int var10 = (var7 + 1) * this.field2445;
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
        int var8 = this.field2446;
        this.field2446 = this.field2443;
        this.field2443 = var8;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(Lsea;II)Lqga;", line = 825)
    public static final class168 method1193(class648 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3654(-15615, arg1, arg2);
        return var3 == null ? null : method1181(var3)[0];
    }

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "()I", line = 835)
    public final int method1194() {
        return this.field2449 + this.field2448 + this.field2444;
    }

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "()V", line = 843)
    public final void method1195() {
        byte[] var1 = this.field2450;
        if (this.field2447 == null) {
            for (int var2 = (this.field2449 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field2445 * var2;
                int var4 = (this.field2449 - var2 - 1) * this.field2445;
                for (int var5 = -this.field2445; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field2447;
            for (int var8 = (this.field2449 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field2445 * var8;
                int var11 = (this.field2449 - var8 - 1) * this.field2445;
                for (int var12 = -this.field2445; var12 < 0; var12++) {
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
        int var9 = this.field2448;
        this.field2448 = this.field2444;
        this.field2444 = var9;
    }
}
