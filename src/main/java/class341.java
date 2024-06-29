import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class341 extends class461 {

    @OriginalMember(owner = "client!bia", name = "u", descriptor = "I")
    private int field4942 = 0;

    @OriginalMember(owner = "client!bia", name = "o", descriptor = "Z")
    public boolean field4936 = false;

    @OriginalMember(owner = "client!bia", name = "s", descriptor = "Ltea;")
    public class791 field4940 = new class791();

    @OriginalMember(owner = "client!bia", name = "D", descriptor = "Ltea;")
    private class791 field4951 = new class791();

    @OriginalMember(owner = "client!bia", name = "L", descriptor = "Z")
    private boolean field4959 = false;

    @OriginalMember(owner = "client!bia", name = "w", descriptor = "J")
    private long field4944;

    @OriginalMember(owner = "client!bia", name = "q", descriptor = "Lju;")
    public class388 field4938;

    @OriginalMember(owner = "client!bia", name = "p", descriptor = "Lfba;")
    public class626 field4937;

    @OriginalMember(owner = "client!bia", name = "x", descriptor = "Lgda;")
    public class542 field4945;

    @OriginalMember(owner = "client!bia", name = "n", descriptor = "Lbt;")
    public class519 field4935;

    @OriginalMember(owner = "client!bia", name = "A", descriptor = "Ljn;")
    public static class134 field4948 = new class134(45, 3);

    @OriginalMember(owner = "client!bia", name = "E", descriptor = "Z")
    public static boolean field4952 = true;

    @OriginalMember(owner = "client!bia", name = "B", descriptor = "F")
    public static float field4949;

    @OriginalMember(owner = "client!bia", name = "r", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!bia", name = "t", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!bia", name = "v", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!bia", name = "y", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!bia", name = "z", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!bia", name = "F", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!bia", name = "G", descriptor = "I")
    private int field4954;

    @OriginalMember(owner = "client!bia", name = "H", descriptor = "I")
    private int field4955;

    @OriginalMember(owner = "client!bia", name = "I", descriptor = "I")
    private int field4956;

    @OriginalMember(owner = "client!bia", name = "J", descriptor = "I")
    private int field4957;

    @OriginalMember(owner = "client!bia", name = "K", descriptor = "I")
    private int field4958;

    @OriginalMember(owner = "client!bia", name = "M", descriptor = "I")
    private int field4960;

    @OriginalMember(owner = "client!bia", name = "N", descriptor = "I")
    private int field4961;

    @OriginalMember(owner = "client!bia", name = "C", descriptor = "Ljava/lang/Object;")
    public static Object field4950;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V", line = 3)
    public static void method2161(byte arg0) {
        field4950 = null;
        if (arg0 > -108) {
            field4952 = true;
        }
        field4948 = null;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V", line = 15)
    public final void method2162(int arg0) {
        field4947++;
        if (arg0 <= 126) {
            method2161((byte) -61);
        }
        this.field4940.field10843 = this.field4937.field8764;
        this.field4940.field10839 = this.field4937.field8776;
        this.field4940.field10840 = this.field4937.field8777;
        this.field4940.field10845 = this.field4937.field8759;
        this.field4940.field10830 = this.field4937.field8767;
        this.field4940.field10833 = this.field4937.field8773;
        this.field4940.field10832 = this.field4937.field8763;
        this.field4940.field10835 = this.field4937.field8768;
        this.field4940.field10831 = this.field4937.field8762;
        if (this.field4940.field10840 == this.field4940.field10830 && this.field4940.field10831 == this.field4940.field10830 && this.field4940.field10843 == this.field4940.field10839 && this.field4940.field10843 == this.field4940.field10833 && this.field4940.field10835 == this.field4940.field10832 && this.field4940.field10845 == this.field4940.field10835) {
            this.field4959 = true;
        } else if (this.field4959) {
            this.field4951.field10831 = this.field4940.field10831;
            this.field4951.field10832 = this.field4940.field10832;
            this.field4951.field10839 = this.field4940.field10839;
            this.field4951.field10845 = this.field4940.field10845;
            this.field4951.field10833 = this.field4940.field10833;
            this.field4951.field10843 = this.field4940.field10843;
            this.field4951.field10830 = this.field4940.field10830;
            this.field4951.field10835 = this.field4940.field10835;
            this.field4959 = false;
            this.field4951.field10840 = this.field4940.field10840;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IJLha;ZB)V", line = 57)
    public final void method2163(int arg0, long arg1, class473 arg2, boolean arg3, byte arg4) {
        if (this.field4936) {
            arg3 = false;
        } else if (class778.field10694 < this.field4945.field7495) {
            arg3 = false;
        } else if (class184.field2299 > class134.field1719[class778.field10694]) {
            arg3 = false;
        } else if (this.field4959) {
            arg3 = false;
        } else if (this.field4945.field7560 != -1) {
            int var7 = (int) (arg1 - this.field4944);
            if (this.field4945.field7494 || this.field4945.field7560 >= var7) {
                var7 %= this.field4945.field7560;
            } else {
                arg3 = false;
            }
            if (!this.field4945.field7506 && this.field4945.field7542 > var7) {
                arg3 = false;
            }
            if (this.field4945.field7506 && var7 >= this.field4945.field7542) {
                arg3 = false;
            }
        }
        field4939++;
        if (arg3) {
            class656.field9262++;
            int var8 = (this.field4940.field10840 + this.field4940.field10831 + this.field4940.field10830) / 3;
            int var9 = (this.field4940.field10839 - (-this.field4940.field10843 - this.field4940.field10833)) / 3;
            int var10 = (this.field4940.field10835 + this.field4940.field10832 + this.field4940.field10845) / 3;
            if (this.field4940.field10834 != var8 || this.field4940.field10841 != var9 || this.field4940.field10836 != var10) {
                this.field4940.field10841 = var9;
                this.field4940.field10836 = var10;
                this.field4940.field10834 = var8;
                int var11 = this.field4940.field10830 - this.field4940.field10840;
                int var12 = this.field4940.field10843 - this.field4940.field10839;
                int var13 = this.field4940.field10835 - this.field4940.field10832;
                int var14 = this.field4940.field10831 - this.field4940.field10840;
                int var15 = this.field4940.field10833 - this.field4940.field10839;
                int var16 = this.field4940.field10845 - this.field4940.field10832;
                this.field4960 = var11 * var15 - (var12 * var14);
                this.field4956 = var12 * var16 - var13 * var15;
                this.field4958 = var13 * var14 - (var11 * var16);
                while (true) {
                    if (this.field4956 <= 32767 && this.field4958 <= 32767 && this.field4960 <= 32767 && this.field4956 >= -32767 && this.field4958 >= -32767 && this.field4960 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field4956 * this.field4956 + this.field4960 * this.field4960 + this.field4958 * this.field4958));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field4956 = this.field4956 * 32767 / var17;
                        this.field4960 = this.field4960 * 32767 / var17;
                        this.field4958 = this.field4958 * 32767 / var17;
                        if (this.field4945.field7530 > 0 || this.field4945.field7504 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field4960, (double) this.field4956) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field4958, Math.sqrt((double) (this.field4960 * this.field4960 + this.field4956 * this.field4956))) * 2607.5945876176133D);
                            this.field4961 = this.field4945.field7530 - this.field4945.field7507;
                            this.field4954 = this.field4945.field7504 - this.field4945.field7525;
                            this.field4957 = this.field4945.field7507 + var18 - (this.field4961 >> 1);
                            this.field4955 = this.field4945.field7525 + var19 - (this.field4954 >> 1);
                        }
                        break;
                    }
                    this.field4956 >>= 0x1;
                    this.field4960 >>= 0x1;
                    this.field4958 >>= 0x1;
                }
            }
            this.field4942 += (int) ((double) arg0 * ((double) this.field4945.field7526 + (double) (this.field4945.field7547 - this.field4945.field7526) * Math.random()));
            if (this.field4942 > 63) {
                int var20 = this.field4942 >> 6;
                this.field4942 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field4945.field7530 <= 0 && this.field4945.field7504 <= 0) {
                        var22 = this.field4956;
                        var23 = this.field4958;
                        var24 = this.field4960;
                    } else {
                        int var25 = this.field4957 + (int) ((double) this.field4961 * Math.random());
                        int var26 = var25 & 0x3FFF;
                        int var27 = class448.field6265[var26];
                        int var28 = class448.field6270[var26];
                        int var29 = this.field4955 + (int) ((double) this.field4954 * Math.random());
                        int var30 = var29 & 0x1FFF;
                        int var31 = class448.field6265[var30];
                        int var32 = class448.field6270[var30];
                        byte var33 = 13;
                        var22 = var28 * var31 >> var33;
                        var23 = (var32 << 1) * -1;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field4940.field10831 * var36 + (float) this.field4940.field10840 * var34 + (float) this.field4940.field10830 * var35);
                    int var38 = (int) ((float) this.field4940.field10833 * var36 + (float) this.field4940.field10843 * var35 + (float) this.field4940.field10839 * var34);
                    int var39 = (int) ((float) this.field4940.field10845 * var36 + (float) this.field4940.field10835 * var35 + (float) this.field4940.field10832 * var34);
                    int var40 = (int) ((float) this.field4951.field10831 * var36 + (float) this.field4951.field10840 * var34 + (float) this.field4951.field10830 * var35);
                    int var41 = (int) ((float) this.field4951.field10833 * var36 + (float) this.field4951.field10843 * var35 + (float) this.field4951.field10839 * var34);
                    int var42 = (int) ((float) this.field4951.field10845 * var36 + (float) this.field4951.field10835 * var35 + (float) this.field4951.field10832 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + Math.random() * (double) var43);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) (Math.random() * (double) var45 + (double) var42);
                    int var49 = (int) (Math.random() * (double) (this.field4945.field7515 - this.field4945.field7553)) + this.field4945.field7553;
                    int var50 = (int) (Math.random() * (double) (this.field4945.field7513 - this.field4945.field7517)) + this.field4945.field7517;
                    int var51 = (int) ((double) (this.field4945.field7531 - this.field4945.field7550) * Math.random()) + this.field4945.field7550;
                    int var52;
                    if (this.field4945.field7523) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field4945.field7509 * Math.random() + (double) this.field4945.field7535) << 24 | (int) ((double) this.field4945.field7493 * var53 + (double) this.field4945.field7488) << 8 | (int) ((double) this.field4945.field7537 * var53 + (double) this.field4945.field7498) << 16 | (int) ((double) this.field4945.field7533 * var53 + (double) this.field4945.field7528);
                    } else {
                        var52 = (int) ((double) this.field4945.field7509 * Math.random() + (double) this.field4945.field7535) << 24 | (int) (Math.random() * (double) this.field4945.field7493 + (double) this.field4945.field7488) << 8 | (int) ((double) this.field4945.field7498 + Math.random() * (double) this.field4945.field7537) << 16 | (int) ((double) this.field4945.field7533 * Math.random() + (double) this.field4945.field7528);
                    }
                    int var55 = this.field4945.field7502;
                    if (!arg2.method222() && !this.field4945.field7487) {
                        var55 = -1;
                    }
                    if (class588.field8292 == class580.field8151) {
                        new class200(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field4945.field7538, this.field4945.field7559);
                    } else {
                        class200 var56 = class285.field4105[class580.field8151];
                        class580.field8151 = class580.field8151 + 1 & 0x3FF;
                        var56.method1295(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field4945.field7538, this.field4945.field7559);
                    }
                }
            }
        }
        if (!this.field4940.method4332(-87, this.field4951)) {
            class791 var58 = this.field4951;
            this.field4951 = this.field4940;
            this.field4940 = var58;
            this.field4940.field10832 = this.field4937.field8763;
            this.field4940.field10845 = this.field4937.field8759;
            this.field4940.field10840 = this.field4937.field8777;
            this.field4940.field10834 = this.field4951.field10834;
            this.field4940.field10831 = this.field4937.field8762;
            this.field4940.field10833 = this.field4937.field8773;
            this.field4940.field10836 = this.field4951.field10836;
            this.field4940.field10835 = this.field4937.field8768;
            this.field4940.field10843 = this.field4937.field8764;
            this.field4940.field10839 = this.field4937.field8776;
            this.field4940.field10841 = this.field4951.field10841;
            this.field4940.field10830 = this.field4937.field8767;
        }
        this.field4943 = 0;
        int var59 = 82 / ((41 - arg4) / 37);
        for (class200 var60 = (class200) this.field4935.method3103((byte) 72); var60 != null; var60 = (class200) this.field4935.method3104(-10964)) {
            var60.method1292(arg1, arg0);
            this.field4943++;
        }
        class55.field653 += this.field4943;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)I", line = 319)
    public static final int method2164(int arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 != 8191) {
            return -68;
        }
        field4953++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIB)Z", line = 343)
    public static final boolean method2165(int arg0, int arg1, byte arg2) {
        if (arg2 > -14) {
            field4950 = null;
        }
        field4946++;
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lha;Lfba;Lju;J)V", line = 411)
    public class341(class473 arg0, class626 arg1, class388 arg2, long arg3) {
        this.field4944 = arg3;
        this.field4938 = arg2;
        this.field4937 = arg1;
        this.field4945 = this.field4937.method3605(0);
        if (!arg0.method222() && this.field4945.field7551 != -1) {
            this.field4945 = class75.method551(this.field4945.field7551, true);
        }
        this.field4935 = new class519();
        this.field4942 = (int) ((double) this.field4942 + Math.random() * 64.0D);
        this.method2162(127);
        this.field4951.field10830 = this.field4940.field10830;
        this.field4951.field10832 = this.field4940.field10832;
        this.field4951.field10831 = this.field4940.field10831;
        this.field4951.field10843 = this.field4940.field10843;
        this.field4951.field10833 = this.field4940.field10833;
        this.field4951.field10840 = this.field4940.field10840;
        this.field4951.field10839 = this.field4940.field10839;
        this.field4951.field10835 = this.field4940.field10835;
        this.field4951.field10845 = this.field4940.field10845;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IJLha;)V", line = 360)
    public final void method2166(int arg0, long arg1, class473 arg2) {
        for (class200 var5 = (class200) this.field4935.method3103((byte) 72); var5 != null; var5 = (class200) this.field4935.method3104(-10964)) {
            var5.method1291(arg2, arg1);
        }
        if (arg0 != -2040) {
            field4949 = 0.57783294F;
        }
        field4941++;
    }
}
