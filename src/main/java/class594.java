import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class594 extends class629 {

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
    private int field7530 = 0;

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "Lrda;")
    private class467 field7532 = new class467(16);

    @OriginalMember(owner = "client!lda", name = "J", descriptor = "I")
    private int field7550 = 0;

    @OriginalMember(owner = "client!lda", name = "F", descriptor = "Lfca;")
    private class661 field7546 = new class661();

    @OriginalMember(owner = "client!lda", name = "K", descriptor = "J")
    private long field7551 = 0L;

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "Lcr;")
    private class310 field7540;

    @OriginalMember(owner = "client!lda", name = "y", descriptor = "I")
    private int field7539;

    @OriginalMember(owner = "client!lda", name = "G", descriptor = "Z")
    private boolean field7547;

    @OriginalMember(owner = "client!lda", name = "I", descriptor = "Lfca;")
    private class661 field7549;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "Lhh;")
    private class554 field7524;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "Lcr;")
    private class310 field7520;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "[B")
    private byte[] field7525;

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "Lqv;")
    private class116 field7534;

    @OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
    private int field7543;

    @OriginalMember(owner = "client!lda", name = "L", descriptor = "Z")
    private boolean field7552;

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "I")
    private int field7535;

    @OriginalMember(owner = "client!lda", name = "A", descriptor = "Lnp;")
    private class786 field7541;

    @OriginalMember(owner = "client!lda", name = "v", descriptor = "Lrn;")
    public static class633 field7536 = new class633(67, 7);

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!lda", name = "x", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!lda", name = "D", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!lda", name = "w", descriptor = "Loia;")
    private class56 field7537;

    @OriginalMember(owner = "client!lda", name = "H", descriptor = "Ljava/awt/Image;")
    public static Image field7548;

    @OriginalMember(owner = "client!lda", name = "E", descriptor = "Z")
    private boolean field7545;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "[B")
    private byte[] field7528;

    @OriginalMember(owner = "client!lda", name = "B", descriptor = "[I")
    public static int[] field7542;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)I", line = 8)
    public final int method3193(int arg0) {
        field7529++;
        if (this.field7537 == null) {
            return 0;
        } else if (this.field7547) {
            class337 var2 = this.field7549.method3591(0);
            if (arg0 == 0) {
                return var2 == null ? 0 : (int) var2.field4108;
            } else {
                return 42;
            }
        } else {
            return this.field7537.field731;
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V", line = 35)
    public final void method3194(byte arg0) {
        field7533++;
        if (arg0 != 0) {
            field7536 = null;
        }
        if (this.field7549 != null) {
            if (this.method3195((byte) 75) == null) {
                return;
            }
            if (this.field7547) {
                boolean var6 = true;
                for (class337 var7 = this.field7549.method3591(0); var7 != null; var7 = this.field7549.method3600((byte) 86)) {
                    int var9 = (int) var7.field4108;
                    if (this.field7528[var9] == 0) {
                        this.method3204(-24708, var9, 1);
                    }
                    if (this.field7528[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1946(arg0 ^ 0xFFFFD784);
                    }
                }
                while (this.field7550 < this.field7537.field735.length) {
                    if (this.field7537.field735[this.field7550] == 0) {
                        this.field7550++;
                    } else {
                        if (this.field7524.field7062 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field7528[this.field7550] == 0) {
                            this.method3204(-24708, this.field7550, 1);
                        }
                        if (this.field7528[this.field7550] == 0) {
                            class337 var8 = new class337();
                            var8.field4108 = this.field7550;
                            var6 = false;
                            this.field7549.method3593(var8, arg0 + 15);
                        }
                        this.field7550++;
                    }
                }
                if (var6) {
                    this.field7547 = false;
                    this.field7550 = 0;
                }
            } else if (this.field7545) {
                boolean var2 = true;
                for (class337 var3 = this.field7549.method3591(arg0); var3 != null; var3 = this.field7549.method3600((byte) 87)) {
                    int var5 = (int) var3.field4108;
                    if (this.field7528[var5] != 1) {
                        this.method3204(-24708, var5, 2);
                    }
                    if (this.field7528[var5] == 1) {
                        var3.method1946(arg0 ^ 0xFFFFD784);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field7537.field735.length > this.field7550) {
                    if (this.field7537.field735[this.field7550] == 0) {
                        this.field7550++;
                    } else {
                        if (this.field7534.method688(-21)) {
                            var2 = false;
                            break;
                        }
                        if (this.field7528[this.field7550] != 1) {
                            this.method3204(-24708, this.field7550, 2);
                        }
                        if (this.field7528[this.field7550] != 1) {
                            class337 var4 = new class337();
                            var4.field4108 = this.field7550;
                            var2 = false;
                            this.field7549.method3593(var4, 15);
                        }
                        this.field7550++;
                    }
                }
                if (var2) {
                    this.field7550 = 0;
                    this.field7545 = false;
                }
            } else {
                this.field7549 = null;
            }
        }
        if (!this.field7552 || this.field7551 > class502.method2786(-7114)) {
            return;
        }
        for (class786 var10 = (class786) this.field7532.method2610((byte) -48); var10 != null; var10 = (class786) this.field7532.method2620(0)) {
            if (!var10.field10779) {
                if (var10.field10780) {
                    if (!var10.field10776) {
                        throw new RuntimeException();
                    }
                    var10.method1946(arg0 - 10364);
                } else {
                    var10.field10780 = true;
                }
            }
        }
        this.field7551 = class502.method2786(-7114) + 1000L;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Loia;", line = 215)
    public final class56 method3195(byte arg0) {
        field7518++;
        if (this.field7537 != null) {
            return this.field7537;
        } else if (arg0 < 6) {
            return null;
        } else {
            if (this.field7541 == null) {
                if (this.field7534.method682((byte) 85)) {
                    return null;
                }
                this.field7541 = this.field7534.method681(true, this.field7539, (byte) 0, 255, 20);
            }
            if (this.field7541.field10779) {
                return null;
            }
            byte[] var2 = this.field7541.method629(0);
            if (this.field7541 instanceof class423) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field7537 = new class56(var2, this.field7535, this.field7525);
                    if (this.field7537.field730 != this.field7543) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field7537 = null;
                    if (this.field7534.method682((byte) 17)) {
                        this.field7541 = null;
                    } else {
                        this.field7541 = this.field7534.method681(true, this.field7539, (byte) 0, 255, 20);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field7537 = new class56(var2, this.field7535, this.field7525);
                } catch (RuntimeException var4) {
                    this.field7534.method686((byte) -21);
                    this.field7537 = null;
                    if (this.field7534.method682((byte) 26)) {
                        this.field7541 = null;
                    } else {
                        this.field7541 = this.field7534.method681(true, this.field7539, (byte) 0, 255, 20);
                    }
                    return null;
                }
                if (this.field7520 != null) {
                    this.field7524.method3009(106, this.field7520, this.field7539, var2);
                }
            }
            this.field7541 = null;
            if (this.field7540 != null) {
                this.field7530 = 0;
                this.field7528 = new byte[this.field7537.field719];
            }
            return this.field7537;
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(B)I", line = 310)
    public final int method3196(byte arg0) {
        field7538++;
        if (this.method3195((byte) 94) == null) {
            return this.field7541 == null ? 0 : this.field7541.method630(true);
        } else {
            int var2 = 42 / ((49 - arg0) / 32);
            return 100;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IB)[B", line = 331)
    public final byte[] method3197(int arg0, byte arg1) {
        field7544++;
        class786 var3 = this.method3204(arg1 ^ 0x6083, arg0, 0);
        if (var3 == null) {
            return null;
        } else if (arg1 == -1) {
            byte[] var4 = var3.method629(0);
            var3.method1946(arg1 ^ 0x287B);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(B)V", line = 356)
    public final void method3198(byte arg0) {
        field7519++;
        if (this.field7549 == null || this.method3195((byte) 31) == null) {
            return;
        }
        class337 var2 = this.field7546.method3591(0);
        if (arg0 > -125) {
            this.field7549 = null;
        }
        while (var2 != null) {
            int var3 = (int) var2.field4108;
            if (var3 < 0 || this.field7537.field719 <= var3 || this.field7537.field735[var3] == 0) {
                var2.method1946(-10364);
            } else {
                if (this.field7528[var3] == 0) {
                    this.method3204(-24708, var3, 1);
                }
                if (this.field7528[var3] == -1) {
                    this.method3204(-24708, var3, 2);
                }
                if (this.field7528[var3] == 1) {
                    var2.method1946(-10364);
                }
            }
            var2 = this.field7546.method3600((byte) 45);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BI)V", line = 399)
    public final void method3199(byte arg0, int arg1) {
        field7522++;
        if (this.field7540 == null) {
            return;
        }
        if (arg0 < 51) {
            this.method3196((byte) -94);
        }
        for (class337 var3 = this.field7546.method3591(0); var3 != null; var3 = this.field7546.method3600((byte) 80)) {
            if ((long) arg1 == var3.field4108) {
                return;
            }
        }
        class337 var4 = new class337();
        var4.field4108 = arg1;
        this.field7546.method3593(var4, 15);
    }

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "(B)I", line = 433)
    public final int method3200(byte arg0) {
        field7526++;
        if (arg0 < 31) {
            return -52;
        } else if (this.field7537 == null) {
            return 0;
        } else {
            return this.field7537.field731;
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)I", line = 449)
    public final int method3201(int arg0) {
        field7527++;
        if (arg0 != -22670) {
            this.field7520 = null;
        }
        return this.field7530;
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(ILcr;Lcr;Lqv;Lhh;I[BIZ)V", line = 809)
    public class594(int arg0, class310 arg1, class310 arg2, class116 arg3, class554 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field7540 = arg1;
        this.field7539 = arg0;
        if (this.field7540 == null) {
            this.field7547 = false;
        } else {
            this.field7547 = true;
            this.field7549 = new class661();
        }
        this.field7524 = arg4;
        this.field7520 = arg2;
        this.field7525 = arg6;
        this.field7534 = arg3;
        this.field7543 = arg7;
        this.field7552 = arg8;
        this.field7535 = arg5;
        if (this.field7520 != null) {
            this.field7541 = this.field7524.method3010(this.field7539, this.field7520, -1);
        }
    }

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "(B)V", line = 470)
    public final void method3202(byte arg0) {
        field7531++;
        if (arg0 != 0) {
            this.method3198((byte) -122);
        }
        if (this.field7540 != null) {
            this.field7545 = true;
            if (this.field7549 == null) {
                this.field7549 = new class661();
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)V", line = 491)
    public static void method3203(int arg0) {
        field7548 = null;
        if (arg0 != -23635) {
            method3203(50);
        }
        field7542 = null;
        field7536 = null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)Lnp;", line = 511)
    private final class786 method3204(int arg0, int arg1, int arg2) {
        field7523++;
        class786 var4 = (class786) this.field7532.method2616((long) arg1, (byte) 117);
        if (var4 != null && arg2 == 0 && !var4.field10776 && var4.field10779) {
            var4.method1946(-10364);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field7540 == null || this.field7528[arg1] == -1) {
                    if (this.field7534.method682((byte) 49)) {
                        return null;
                    }
                    var4 = this.field7534.method681(true, arg1, (byte) 2, this.field7539, 20);
                } else {
                    var4 = this.field7524.method3010(arg1, this.field7540, -1);
                }
            } else if (arg2 == 1) {
                if (this.field7540 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field7524.method3013(3, arg1, this.field7540);
            } else if (arg2 == 2) {
                if (this.field7540 == null) {
                    throw new RuntimeException();
                }
                if (this.field7528[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field7534.method688(-21)) {
                    return null;
                }
                var4 = this.field7534.method681(false, arg1, (byte) 2, this.field7539, arg0 ^ 0xFFFF9F68);
            } else {
                throw new RuntimeException();
            }
            this.field7532.method2619(var4, (long) arg1, -1);
        }
        if (var4.field10779) {
            return null;
        }
        if (arg0 != -24708) {
            this.method3195((byte) 50);
        }
        byte[] var5 = var4.method629(0);
        if (!var4 instanceof class423) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class195.field2706.reset();
                        class195.field2706.update(var5, 0, var5.length - 2);
                        int var12 = (int) class195.field2706.getValue();
                        if (this.field7537.field717[arg1] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field7537.field716 == null || this.field7537.field716[arg1] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field7537.field716[arg1];
                        byte[] var14 = class172.method1082(var5, var5.length - 2, arg0 + 24744, 0);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field7534.field1548 = 0;
                this.field7534.field1550 = 0;
            } catch (RuntimeException var18) {
                this.field7534.method686((byte) -21);
                var4.method1946(-10364);
                if (var4.field10776 && !this.field7534.method682((byte) 76)) {
                    class106 var16 = this.field7534.method681(true, arg1, (byte) 2, this.field7539, 20);
                    this.field7532.method2619(var16, (long) arg1, arg0 ^ 0x6083);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field7537.field725[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field7537.field725[arg1];
            if (this.field7540 != null) {
                this.field7524.method3009(-74, this.field7540, arg1, var5);
                if (this.field7528[arg1] != 1) {
                    this.field7530++;
                    this.field7528[arg1] = 1;
                }
            }
            if (!var4.field10776) {
                var4.method1946(arg0 + 14344);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class195.field2706.reset();
            class195.field2706.update(var5, 0, var5.length - 2);
            int var6 = (int) class195.field2706.getValue();
            if (this.field7537.field717[arg1] != var6) {
                throw new RuntimeException();
            }
            if (this.field7537.field716 != null && this.field7537.field716[arg1] != null) {
                byte[] var7 = this.field7537.field716[arg1];
                byte[] var8 = class172.method1082(var5, var5.length - 2, arg0 ^ 0xFFFF9F08, 0);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field7537.field725[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field7528[arg1] != 1) {
                this.field7530++;
                this.field7528[arg1] = 1;
            }
            if (!var4.field10776) {
                var4.method1946(-10364);
            }
            return var4;
        } catch (Exception var17) {
            this.field7528[arg1] = -1;
            var4.method1946(-10364);
            if (var4.field10776 && !this.field7534.method682((byte) 75)) {
                class106 var11 = this.field7534.method681(true, arg1, (byte) 2, this.field7539, arg0 + 24728);
                this.field7532.method2619(var11, (long) arg1, arg0 ^ 0x6083);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(IB)I", line = 776)
    public final int method3205(int arg0, byte arg1) {
        field7521++;
        class786 var3 = (class786) this.field7532.method2616((long) arg0, (byte) -114);
        if (var3 == null) {
            if (arg1 > -96) {
                this.method3197(54, (byte) 103);
            }
            return 0;
        } else {
            return var3.method630(true);
        }
    }
}
