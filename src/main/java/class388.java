import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class388 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public int field4945;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public int field4946;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public int field4950;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public int field4952;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public int field4953;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "[B")
    public byte[] field4947;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[B")
    public byte[] field4949;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "[I")
    public int[] field4951;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lwm;II)[Lvi;")
    public static final class388[] method2226(class30 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method139(arg1, (byte) -94, arg2);
        return var3 == null ? null : method2229(var3);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public final void method2227(int arg0) {
        int var2 = -1;
        if (this.field4951.length < 255) {
            for (int var3 = 0; var3 < this.field4951.length; var3++) {
                if (this.field4951[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4951.length;
                int[] var4 = new int[this.field4951.length + 1];
                class642.method3475(this.field4951, 0, var4, 0, this.field4951.length);
                this.field4951 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4951.length; var9++) {
                int var13 = this.field4951[var9];
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
        for (int var10 = this.field4946 - 1; var10 > 0; var10--) {
            int var11 = this.field4950 * var10;
            for (int var12 = this.field4950 - 1; var12 > 0; var12--) {
                if (this.field4951[this.field4949[var11 + var12] & 0xFF] == 0 && this.field4951[this.field4949[var11 + var12 - this.field4950 - 1] & 0xFF] != 0) {
                    this.field4949[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()I")
    public final int method2228() {
        return this.field4946 + this.field4945 + this.field4952;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([B)[Lvi;")
    private static final class388[] method2229(byte[] arg0) {
        class234 var1 = new class234(arg0);
        var1.field3133 = arg0.length - 2;
        int var2 = var1.method1553((byte) 80);
        class388[] var3 = new class388[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class388();
        }
        var1.field3133 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1553((byte) 18);
        int var6 = var1.method1553((byte) 124);
        int var7 = (var1.method1509(true) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field4948 = var1.method1553((byte) -118);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field4945 = var1.method1553((byte) 36);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field4950 = var1.method1553((byte) 49);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field4946 = var1.method1553((byte) 28);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class388 var32 = var3[var12];
            var32.field4953 = var5 - var32.field4950 - var32.field4948;
            var32.field4952 = var6 - var32.field4946 - var32.field4945;
        }
        var1.field3133 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1500((byte) -77);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field4951 = var13;
        }
        var1.field3133 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class388 var17 = var3[var16];
            int var18 = var17.field4950 * var17.field4946;
            var17.field4949 = new byte[var18];
            int var19 = var1.method1509(true);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field4947 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field4949[var24] = var1.method1554(27806);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field4947[var25] = var1.method1554(27806);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field4950; var27++) {
                        for (int var31 = 0; var31 < var17.field4946; var31++) {
                            var17.field4949[var17.field4950 * var31 + var27] = var1.method1554(27806);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field4950; var28++) {
                        for (int var29 = 0; var29 < var17.field4946; var29++) {
                            byte var30 = var17.field4947[var17.field4950 * var29 + var28] = var1.method1554(27806);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field4947 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field4949[var20] = var1.method1554(27806);
                }
            } else {
                for (int var21 = 0; var21 < var17.field4950; var21++) {
                    for (int var22 = 0; var22 < var17.field4946; var22++) {
                        var17.field4949[var17.field4950 * var22 + var21] = var1.method1554(27806);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()I")
    public final int method2230() {
        return this.field4950 + this.field4948 + this.field4953;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "()V")
    public final void method2231() {
        int var1 = this.method2230();
        int var2 = this.method2228();
        if (this.field4950 == var1 && this.field4946 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field4947 == null) {
            for (int var9 = 0; var9 < this.field4946; var9++) {
                int var10 = this.field4950 * var9;
                int var11 = (this.field4945 + var9) * var1 + this.field4948;
                for (int var12 = 0; var12 < this.field4950; var12++) {
                    var3[var11++] = this.field4949[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field4946; var5++) {
                int var6 = this.field4950 * var5;
                int var7 = (this.field4945 + var5) * var1 + this.field4948;
                for (int var8 = 0; var8 < this.field4950; var8++) {
                    var3[var7] = this.field4949[var6];
                    var4[var7++] = this.field4947[var6++];
                }
            }
            this.field4947 = var4;
        }
        this.field4948 = this.field4953 = this.field4945 = this.field4952 = 0;
        this.field4950 = var1;
        this.field4946 = var2;
        this.field4949 = var3;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Lwm;II)Lvi;")
    public static final class388 method2232(class30 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method139(arg1, (byte) -94, arg2);
        return var3 == null ? null : method2229(var3)[0];
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "()[I")
    public final int[] method2233() {
        int var1 = this.method2230();
        int[] var2 = new int[var1 * this.method2228()];
        if (this.field4947 == null) {
            for (int var7 = 0; var7 < this.field4946; var7++) {
                int var8 = this.field4950 * var7;
                int var9 = (this.field4945 + var7) * var1 + this.field4948;
                for (int var10 = 0; var10 < this.field4950; var10++) {
                    int var11 = this.field4951[this.field4949[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field4946; var3++) {
                int var4 = this.field4950 * var3;
                int var5 = (this.field4945 + var3) * var1 + this.field4948;
                for (int var6 = 0; var6 < this.field4950; var6++) {
                    var2[var5++] = this.field4947[var4] << 24 | this.field4951[this.field4949[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "()V")
    public final void method2234() {
        byte[] var1 = this.field4949;
        if (this.field4947 == null) {
            for (int var2 = this.field4946 - 1; var2 >= 0; var2--) {
                int var3 = this.field4950 * var2;
                int var4 = (var2 + 1) * this.field4950;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field4947;
            for (int var7 = this.field4946 - 1; var7 >= 0; var7--) {
                int var9 = this.field4950 * var7;
                int var10 = (var7 + 1) * this.field4950;
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
        int var8 = this.field4948;
        this.field4948 = this.field4953;
        this.field4953 = var8;
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "()V")
    public final void method2235() {
        byte[] var1 = new byte[this.field4950 * this.field4946];
        int var2 = 0;
        if (this.field4947 == null) {
            for (int var3 = 0; var3 < this.field4950; var3++) {
                for (int var4 = this.field4946 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field4949[this.field4950 * var4 + var3];
                }
            }
            this.field4949 = var1;
        } else {
            byte[] var5 = new byte[this.field4950 * this.field4946];
            for (int var6 = 0; var6 < this.field4950; var6++) {
                for (int var9 = this.field4946 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field4949[this.field4950 * var9 + var6];
                    var5[var2++] = this.field4947[this.field4950 * var9 + var6];
                }
            }
            this.field4949 = var1;
            this.field4947 = var5;
        }
        int var7 = this.field4945;
        this.field4945 = this.field4948;
        this.field4948 = this.field4952;
        this.field4952 = this.field4953;
        this.field4953 = this.field4945;
        int var8 = this.field4946;
        this.field4946 = this.field4950;
        this.field4950 = var8;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public final void method2236(int arg0) {
        int var2 = -1;
        if (this.field4951.length < 255) {
            for (int var3 = 0; var3 < this.field4951.length; var3++) {
                if (this.field4951[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4951.length;
                int[] var4 = new int[this.field4951.length + 1];
                class642.method3475(this.field4951, 0, var4, 0, this.field4951.length);
                this.field4951 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4951.length; var9++) {
                int var15 = this.field4951[var9];
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
        byte[] var11 = new byte[this.field4950 * this.field4946];
        for (int var12 = 0; var12 < this.field4946; var12++) {
            for (int var13 = 0; var13 < this.field4950; var13++) {
                int var14 = this.field4949[var10] & 0xFF;
                if (this.field4951[var14] == 0) {
                    if (var13 > 0 && this.field4951[this.field4949[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field4951[this.field4949[var10 - this.field4950] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field4950 - 1 && this.field4951[this.field4949[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field4946 - 1 && this.field4951[this.field4949[this.field4950 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field4949 = var11;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lwm;I)[Lvi;")
    public static final class388[] method2237(class30 arg0, int arg1) {
        byte[] var2 = arg0.method148((byte) 115, arg1);
        return var2 == null ? null : method2229(var2);
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "()V")
    public final void method2238() {
        byte[] var1 = this.field4949;
        if (this.field4947 == null) {
            for (int var2 = (this.field4946 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field4950 * var2;
                int var4 = (this.field4946 - var2 - 1) * this.field4950;
                for (int var5 = -this.field4950; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field4947;
            for (int var8 = (this.field4946 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field4950 * var8;
                int var11 = (this.field4946 - var8 - 1) * this.field4950;
                for (int var12 = -this.field4950; var12 < 0; var12++) {
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
        int var9 = this.field4945;
        this.field4945 = this.field4952;
        this.field4952 = var9;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Lwm;I)Lvi;")
    public static final class388 method2239(class30 arg0, int arg1) {
        byte[] var2 = arg0.method148((byte) -128, arg1);
        return var2 == null ? null : method2229(var2)[0];
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public final void method2240(int arg0) {
        int var2 = this.method2230();
        int var3 = this.method2228();
        if (this.field4950 == var2 && this.field4946 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field4948) {
            var4 = this.field4948;
        }
        int var5 = arg0;
        if (this.field4948 + arg0 + this.field4950 > var2) {
            var5 = var2 - this.field4948 - this.field4950;
        }
        int var6 = arg0;
        if (arg0 > this.field4945) {
            var6 = this.field4945;
        }
        int var7 = arg0;
        if (this.field4945 + arg0 + this.field4946 > var3) {
            var7 = var3 - this.field4945 - this.field4946;
        }
        int var8 = this.field4950 + var4 + var5;
        int var9 = this.field4946 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field4947 == null) {
            for (int var11 = 0; var11 < this.field4946; var11++) {
                int var12 = this.field4950 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field4950; var14++) {
                    var10[var13++] = this.field4949[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field4946; var16++) {
                int var17 = this.field4950 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field4950; var19++) {
                    var15[var18] = this.field4947[var17];
                    var10[var18++] = this.field4949[var17++];
                }
            }
            this.field4947 = var15;
        }
        this.field4948 -= var4;
        this.field4945 -= var6;
        this.field4953 -= var5;
        this.field4952 -= var7;
        this.field4950 = var8;
        this.field4946 = var9;
        this.field4949 = var10;
    }
}
