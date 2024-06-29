import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class552 {

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    private int field7526 = 32;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "Z")
    private boolean field7543 = false;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "J")
    private long field7539 = class529.method2982((byte) -69);

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
    private int field7547 = 0;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    private int field7548 = 0;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "[Leg;")
    private class48[] field7549 = new class48[8];

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "J")
    private long field7551 = 0L;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "J")
    private long field7552 = 0L;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    private int field7550 = 0;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    private int field7556 = 0;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "Z")
    private boolean field7555 = true;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "[Leg;")
    private class48[] field7557 = new class48[8];

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "Lwo;")
    public static class445 field7525 = new class445();

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public int field7546;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
    private int field7553;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "I")
    public int field7554;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "Leg;")
    private class48 field7537;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "[I")
    public int[] field7528;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "[I")
    public static int[] field7545;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public static void method3083(byte arg0) {
        if (arg0 == 105) {
            field7525 = null;
            field7545 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)I")
    public static final int method3084(int arg0) {
        if (arg0 != -13498) {
            method3084(-32);
        }
        field7533++;
        return class600.field8341 == null ? 0 : class600.field8341.length * 2;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Leg;II)V")
    private final void method3085(class48 arg0, int arg1, int arg2) {
        field7530++;
        if (arg2 != -906414651) {
            return;
        }
        int var4 = arg1 >> 5;
        class48 var5 = this.field7557[var4];
        if (var5 == null) {
            this.field7549[var4] = arg0;
        } else {
            var5.field565 = arg0;
        }
        this.field7557[var4] = arg0;
        arg0.field567 = arg1;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Leg;I)V")
    public final synchronized void method3086(class48 arg0, int arg1) {
        field7541++;
        if (arg1 != 50) {
            this.method2924();
        }
        this.field7537 = arg0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "()V")
    public void method2921() throws Exception {
        field7531++;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public final synchronized void method3087(int arg0) {
        field7527++;
        if (class159.field2299 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class159.field2299.field4948[var3] == this) {
                    class159.field2299.field4948[var3] = null;
                }
                if (class159.field2299.field4948[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class159.field2299.field4951 = true;
                while (class159.field2299.field4947) {
                    class588.method3253(0, 50L);
                }
                class159.field2299 = null;
            }
        }
        if (arg0 < 56) {
            field7545 = null;
        }
        this.method2924();
        this.field7543 = true;
        this.field7528 = null;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
    public final synchronized void method3088(byte arg0) {
        field7535++;
        if (this.field7543) {
            return;
        }
        long var2 = class529.method2982((byte) -69);
        try {
            if ((this.field7539 + 500000L) < var2) {
                this.field7539 = var2 - 500000L;
            }
            while (this.field7539 + 5000L < var2) {
                this.method3090(-1, 256);
                this.field7539 += (256000 / class169.field2422);
            }
        } catch (Exception var7) {
            this.field7539 = var2;
        }
        if (this.field7528 == null || arg0 < 95) {
            return;
        }
        try {
            if (this.field7551 != 0L) {
                if (var2 < this.field7551) {
                    return;
                }
                this.method2923(this.field7554);
                this.field7551 = 0L;
                this.field7555 = true;
            }
            int var4 = this.method2922();
            if (this.field7550 < this.field7556 - var4) {
                this.field7550 = this.field7556 - var4;
            }
            int var5 = this.field7553 + this.field7546;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field7554) {
                this.field7554 += 1024;
                if (this.field7554 > 16384) {
                    this.field7554 = 16384;
                }
                this.method2924();
                this.method2923(this.field7554);
                var4 = 0;
                this.field7555 = true;
                if (var5 + 256 > this.field7554) {
                    var5 = this.field7554 - 256;
                    this.field7553 = var5 - this.field7546;
                }
            }
            while (var5 > var4) {
                this.method3089(this.field7528, 256);
                var4 += 256;
                this.method2921();
            }
            if (this.field7552 < var2) {
                if (this.field7555) {
                    this.field7555 = false;
                } else if (this.field7550 == 0 && this.field7548 == 0) {
                    this.method2924();
                    this.field7551 = var2 + 2000L;
                    return;
                } else {
                    this.field7553 = Math.min(this.field7548, this.field7550);
                    this.field7548 = this.field7550;
                }
                this.field7550 = 0;
                this.field7552 = var2 + 2000L;
            }
            this.field7556 = var4;
        } catch (Exception var6) {
            this.method2924();
            this.field7551 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([II)V")
    private final void method3089(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class59.field747) {
            var3 = arg1 << 1;
        }
        class2.method5(arg0, 0, var3);
        this.field7547 -= arg1;
        if (this.field7537 != null && this.field7547 <= 0) {
            this.field7547 += class169.field2422 >> 4;
            class57.method332(true, this.field7537);
            this.method3085(this.field7537, this.field7537.method256(), -906414651);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class48 var10 = null;
                        class48 var11 = this.field7549[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class644 var12 = var11.field564;
                                if (var12 == null || var12.field8923 <= var8) {
                                    var11.field566 = true;
                                    int var13 = var11.method252();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8923 += var13;
                                    }
                                    if (var4 >= this.field7526) {
                                        break label107;
                                    }
                                    class48 var14 = var11.method257();
                                    if (var14 != null) {
                                        int var15 = var11.field567;
                                        while (var14 != null) {
                                            this.method3085(var14, var15 * var14.method256() >> 8, -906414651);
                                            var14 = var11.method254();
                                        }
                                    }
                                    class48 var16 = var11.field565;
                                    var11.field565 = null;
                                    if (var10 == null) {
                                        this.field7549[var7] = var16;
                                    } else {
                                        var10.field565 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field7557[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field565;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class48 var18 = this.field7549[var17];
                this.field7549[var17] = this.field7557[var17] = null;
                while (var18 != null) {
                    class48 var19 = var18.field565;
                    var18.field565 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field7547 < 0) {
            this.field7547 = 0;
        }
        if (this.field7537 != null) {
            this.field7537.method253(arg0, 0, arg1);
        }
        this.field7539 = class529.method2982((byte) -69);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "()I")
    public int method2922() throws Exception {
        field7532++;
        return this.field7554;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
    public void method2923(int arg0) throws Exception {
        field7534++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method2926(Component arg0) throws Exception {
        field7544++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
    private final void method3090(int arg0, int arg1) {
        field7538++;
        int var3 = -43 / ((arg0 - 61) / 56);
        this.field7547 -= arg1;
        if (this.field7547 < 0) {
            this.field7547 = 0;
        }
        if (this.field7537 != null) {
            this.field7537.method255(arg1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "()V")
    public void method2925() throws Exception {
        field7524++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lwv;I)V")
    public static final void method3091(class423 arg0, int arg1) {
        if (class297.field3932 == arg0.field5708) {
            class325.field4383[arg0.field5604] = true;
        }
        field7542++;
        if (arg1 != 12618) {
            method3091(null, 110);
        }
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "()V")
    public void method2924() {
        field7529++;
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V")
    public final synchronized void method3092(int arg0) {
        this.field7555 = true;
        field7540++;
        try {
            this.method2925();
        } catch (Exception var2) {
            this.method2924();
            this.field7551 = class529.method2982((byte) -69) + 2000L;
        }
        if (arg0 <= 90) {
            this.field7526 = -70;
        }
    }
}
