import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class470 extends class618 {

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    private int field6120 = 0;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "Z")
    public boolean field6126 = false;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "Ldh;")
    public class683 field6116 = new class683();

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "Ldh;")
    private class683 field6131 = new class683();

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "Z")
    private boolean field6134 = false;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "Lsba;")
    public class581 field6118;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Lnia;")
    public class513 field6117;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "J")
    private long field6113;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Lvb;")
    public class657 field6115;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "Lhv;")
    public class151 field6119;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "Ltn;")
    public static class749 field6127 = new class749(2);

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    public static int field6129 = 0;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
    public static int field6132 = 0;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public int field6124;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "I")
    private int field6133;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    private int field6135;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    private int field6136;

    @OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
    private int field6137;

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
    private int field6138;

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
    private int field6139;

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
    private int field6140;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "Lwm;")
    public static class30 field6128;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static void method2654(int arg0) {
        field6128 = null;
        int var1 = 18 / ((-arg0 - 1) / 43);
        field6127 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public final void method2655(byte arg0) {
        this.field6116.field8810 = this.field6118.field7358;
        this.field6116.field8803 = this.field6118.field7349;
        this.field6116.field8805 = this.field6118.field7357;
        this.field6116.field8816 = this.field6118.field7343;
        field6114++;
        this.field6116.field8817 = this.field6118.field7350;
        this.field6116.field8804 = this.field6118.field7344;
        this.field6116.field8806 = this.field6118.field7356;
        if (arg0 != 47) {
            this.field6113 = -55L;
        }
        this.field6116.field8808 = this.field6118.field7342;
        this.field6116.field8813 = this.field6118.field7345;
        if (this.field6116.field8816 == this.field6116.field8806 && this.field6116.field8817 == this.field6116.field8806 && this.field6116.field8810 == this.field6116.field8808 && this.field6116.field8808 == this.field6116.field8805 && this.field6116.field8804 == this.field6116.field8803 && this.field6116.field8813 == this.field6116.field8803) {
            this.field6134 = true;
        } else if (this.field6134) {
            this.field6131.field8803 = this.field6116.field8803;
            this.field6131.field8804 = this.field6116.field8804;
            this.field6134 = false;
            this.field6131.field8808 = this.field6116.field8808;
            this.field6131.field8805 = this.field6116.field8805;
            this.field6131.field8806 = this.field6116.field8806;
            this.field6131.field8810 = this.field6116.field8810;
            this.field6131.field8813 = this.field6116.field8813;
            this.field6131.field8817 = this.field6116.field8817;
            this.field6131.field8816 = this.field6116.field8816;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIILd;Lha;II)V")
    public static final void method2656(int arg0, int arg1, int arg2, class284 arg3, class570 arg4, int arg5, int arg6) {
        field6123++;
        if (class562.field7147 < 100) {
            class493.method2747(arg4, arg3, (byte) -119);
        }
        arg4.method915(arg1, arg5, arg1 + arg2, arg5 - -arg6);
        if (class562.field7147 < 100) {
            byte var7 = 20;
            int var8 = arg2 / 2 + arg1;
            arg4.method921(arg1, arg5, arg2, arg6, -16777216, 0);
            int var9 = arg6 / 2 + arg5 - var7 - 18;
            arg4.method911(var8 - 152, var9, 304, 34, class496.field6337[class673.field8709].getRGB(), 0);
            arg4.method921(var8 - 150, var9 + 2, class562.field7147 * 3, 30, class256.field3475[class673.field8709].getRGB(), 0);
            class595.field7562.method2427(class659.field8562.method3589(class496.field6338, -22395), var7 + var9, arg0 + 88, var8, -1, class13.field136[class673.field8709].getRGB());
            return;
        }
        int var10 = class669.field8692 - ((int) ((float) arg2 / class402.field5335));
        int var11 = (int) ((float) arg6 / class402.field5335) + class238.field3238;
        int var12 = (int) ((float) arg2 / class402.field5335) + class669.field8692;
        class580.field7341 = (int) ((float) (arg6 * 2) / class402.field5335);
        class187.field2613 = class238.field3238 - ((int) ((float) arg6 / class402.field5335));
        class522.field6628 = class669.field8692 - ((int) ((float) arg2 / class402.field5335));
        class152.field1936 = (int) ((float) (arg2 * 2) / class402.field5335);
        int var13 = class238.field3238 - (int) ((float) arg6 / class402.field5335);
        class402.method2349(class402.field5357 + var10, var11 - -class402.field5347, var12 + class402.field5357, class402.field5347 + var13, arg1, arg5, arg1 + arg2, arg6 + 1 + arg5);
        class402.method2351(arg4);
        class661 var14 = class402.method2330(arg4);
        if (arg0 != 20) {
            return;
        }
        class585.method3134(arg4, 0, 0, arg0 ^ 0x5777, var14);
        if (class568.field7179 > 0) {
            class317.field3954--;
            if (class317.field3954 == 0) {
                class317.field3954 = 20;
                class568.field7179--;
            }
        }
        if (!class520.field6621) {
            return;
        }
        int var15 = arg1 + arg2 - 5;
        int var16 = arg6 + arg5 - 8;
        class225.field3058.method2422(-1, var16, var15, "Fps:" + class92.field1254, 16776960, (byte) 96);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class225.field3058.method2422(-1, var20, var15, "Mem:" + var18 + "k", var19, (byte) 37);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZIIJLha;)V")
    public final void method2657(boolean arg0, int arg1, int arg2, long arg3, class570 arg4) {
        field6121++;
        if (this.field6126) {
            arg0 = false;
        } else if (this.field6115.field8491 > class298.field3765) {
            arg0 = false;
        } else if (class464.field6030 > class644.field8234[class298.field3765]) {
            arg0 = false;
        } else if (this.field6134) {
            arg0 = false;
        } else if (this.field6115.field8518 != -1) {
            int var7 = (int) (arg3 - this.field6113);
            if (this.field6115.field8472 || var7 <= this.field6115.field8518) {
                var7 %= this.field6115.field8518;
            } else {
                arg0 = false;
            }
            if (!this.field6115.field8478 && this.field6115.field8492 > var7) {
                arg0 = false;
            }
            if (this.field6115.field8478 && var7 >= this.field6115.field8492) {
                arg0 = false;
            }
        }
        if (arg0) {
            class405.field5377++;
            int var8 = (this.field6116.field8816 + this.field6116.field8806 + this.field6116.field8817) / 3;
            int var9 = (this.field6116.field8810 + this.field6116.field8808 + this.field6116.field8805) / 3;
            int var10 = (this.field6116.field8804 + this.field6116.field8803 + this.field6116.field8813) / 3;
            if (this.field6116.field8819 != var8 || this.field6116.field8818 != var9 || this.field6116.field8802 != var10) {
                this.field6116.field8802 = var10;
                this.field6116.field8818 = var9;
                this.field6116.field8819 = var8;
                int var11 = this.field6116.field8806 - this.field6116.field8816;
                int var12 = this.field6116.field8808 - this.field6116.field8810;
                int var13 = this.field6116.field8803 - this.field6116.field8804;
                int var14 = this.field6116.field8817 - this.field6116.field8816;
                int var15 = this.field6116.field8805 - this.field6116.field8810;
                int var16 = this.field6116.field8813 - this.field6116.field8804;
                this.field6140 = var13 * var14 - (var11 * var16);
                this.field6139 = var11 * var15 - (var12 * var14);
                this.field6133 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field6133 <= 32767 && this.field6140 <= 32767 && this.field6139 <= 32767 && this.field6133 >= -32767 && this.field6140 >= -32767 && this.field6139 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field6140 * this.field6140 + this.field6139 * this.field6139 + this.field6133 * this.field6133));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field6140 = this.field6140 * 32767 / var17;
                        this.field6139 = this.field6139 * 32767 / var17;
                        this.field6133 = this.field6133 * 32767 / var17;
                        if (this.field6115.field8482 > 0 || this.field6115.field8519 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field6139, (double) this.field6133) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field6140, Math.sqrt((double) (this.field6139 * this.field6139 + this.field6133 * this.field6133))) * 2607.5945876176133D);
                            this.field6135 = this.field6115.field8482 - this.field6115.field8531;
                            this.field6138 = this.field6115.field8519 - this.field6115.field8530;
                            this.field6136 = var18 + this.field6115.field8531 - (this.field6135 >> 1);
                            this.field6137 = this.field6115.field8530 + var19 - (this.field6138 >> 1);
                        }
                        break;
                    }
                    this.field6139 >>= 0x1;
                    this.field6140 >>= 0x1;
                    this.field6133 >>= 0x1;
                }
            }
            this.field6120 += (int) ((double) arg1 * ((double) this.field6115.field8537 + Math.random() * (double) (this.field6115.field8523 - this.field6115.field8537)));
            if (this.field6120 > 63) {
                int var20 = this.field6120 >> 6;
                this.field6120 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field6115.field8482 <= 0 && this.field6115.field8519 <= 0) {
                        var22 = this.field6133;
                        var23 = this.field6140;
                        var24 = this.field6139;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field6135) + this.field6136;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class541.field6805[var26];
                        int var28 = class541.field6806[var26];
                        int var29 = (int) (Math.random() * (double) this.field6138) + this.field6137;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class541.field6805[var30];
                        int var32 = class541.field6806[var30];
                        byte var33 = 13;
                        var23 = (var32 << 1) * -1;
                        var22 = var28 * var31 >> var33;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field6116.field8817 * var36 + (float) this.field6116.field8816 * var34 + (float) this.field6116.field8806 * var35);
                    int var38 = (int) ((float) this.field6116.field8805 * var36 + (float) this.field6116.field8810 * var34 + (float) this.field6116.field8808 * var35);
                    int var39 = (int) ((float) this.field6116.field8813 * var36 + (float) this.field6116.field8804 * var34 + (float) this.field6116.field8803 * var35);
                    int var40 = (int) ((float) this.field6131.field8817 * var36 + (float) this.field6131.field8816 * var34 + (float) this.field6131.field8806 * var35);
                    int var41 = (int) ((float) this.field6131.field8805 * var36 + (float) this.field6131.field8810 * var34 + (float) this.field6131.field8808 * var35);
                    int var42 = (int) ((float) this.field6131.field8813 * var36 + (float) this.field6131.field8804 * var34 + (float) this.field6131.field8803 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + Math.random() * (double) var43);
                    int var47 = (int) (Math.random() * (double) var44 + (double) var41);
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = this.field6115.field8496 + ((int) (Math.random() * (double) (this.field6115.field8489 - this.field6115.field8496)));
                    int var50 = this.field6115.field8493 + ((int) (Math.random() * (double) (this.field6115.field8494 - this.field6115.field8493)));
                    int var51 = this.field6115.field8485 + (int) ((double) (this.field6115.field8513 - this.field6115.field8485) * Math.random());
                    int var52;
                    if (this.field6115.field8509) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field6115.field8480 * var53 + (double) this.field6115.field8511) << 8 | (int) ((double) this.field6115.field8486 * var53 + (double) this.field6115.field8524) << 16 | (int) ((double) this.field6115.field8512 * var53 + (double) this.field6115.field8528) | (int) ((double) this.field6115.field8538 + Math.random() * (double) this.field6115.field8504) << 24;
                    } else {
                        var52 = (int) ((double) this.field6115.field8528 + (double) this.field6115.field8512 * Math.random()) | (int) ((double) this.field6115.field8480 * Math.random() + (double) this.field6115.field8511) << 8 | (int) ((double) this.field6115.field8486 * Math.random() + (double) this.field6115.field8524) << 16 | (int) ((double) this.field6115.field8538 + (double) this.field6115.field8504 * Math.random()) << 24;
                    }
                    int var55 = this.field6115.field8469;
                    if (!arg4.method879() && !this.field6115.field8535) {
                        var55 = -1;
                    }
                    if (class664.field8662 == class627.field7964) {
                        new class355(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field6115.field8526, this.field6115.field8501);
                    } else {
                        class355 var57 = class479.field6197[class664.field8662];
                        class664.field8662 = class664.field8662 + 1 & 0x3FF;
                        var57.method2042(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field6115.field8526, this.field6115.field8501);
                    }
                }
            }
        }
        if (!this.field6116.method3665(1111, this.field6131)) {
            class683 var58 = this.field6131;
            this.field6131 = this.field6116;
            this.field6116 = var58;
            this.field6116.field8804 = this.field6118.field7344;
            this.field6116.field8810 = this.field6118.field7358;
            this.field6116.field8803 = this.field6118.field7349;
            this.field6116.field8816 = this.field6118.field7343;
            this.field6116.field8818 = this.field6131.field8818;
            this.field6116.field8802 = this.field6131.field8802;
            this.field6116.field8806 = this.field6118.field7356;
            this.field6116.field8805 = this.field6118.field7357;
            this.field6116.field8817 = this.field6118.field7350;
            this.field6116.field8819 = this.field6131.field8819;
            this.field6116.field8813 = this.field6118.field7345;
            this.field6116.field8808 = this.field6118.field7342;
        }
        if (arg2 != 21375) {
            this.method2657(false, 49, -6, -66L, null);
        }
        this.field6124 = 0;
        for (class355 var59 = (class355) this.field6119.method857(arg2 - 21492); var59 != null; var59 = (class355) this.field6119.method864(true)) {
            var59.method2041(arg3, arg1);
            this.field6124++;
        }
        class70.field959 += this.field6124;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
    public static final void method2658(int arg0) {
        field6125++;
        if (!class525.field6678) {
            class269.field3555 = class113.field1502 != -1 && class628.field7982 >= class113.field1502 || class463.field6021 < (class689.field8857 ? 26 : 22) + class628.field7982 * 16;
        }
        class483.field6232.method3594(83);
        class416.field5496.method3594(-120);
        for (class765 var1 = (class765) class595.field7563.method3591(0); var1 != null; var1 = (class765) class595.field7563.method3600((byte) 49)) {
            int var38 = var1.field10412;
            if (var38 < 1000) {
                var1.method1946(arg0 ^ 0xFFFFD7A5);
                if (var38 == 5 || var38 == 53 || var38 == 44 || var38 == 21 || var38 == 12 || var38 == 49 || var38 == 9) {
                    class416.field5496.method3593(var1, 15);
                } else {
                    class483.field6232.method3593(var1, 15);
                }
            }
        }
        class483.field6232.method3602(true, class595.field7563);
        class416.field5496.method3602(true, class595.field7563);
        if (class628.field7982 <= 1) {
            class7.field72 = null;
            class643.field8232 = null;
        } else {
            if (class698.field9249 && class679.field8781.method271((byte) 127, 81) && class628.field7982 > 2) {
                class643.field8232 = (class765) class595.field7563.field8613.field4103.field4103;
            } else {
                class643.field8232 = (class765) class595.field7563.field8613.field4103;
            }
            class7.field72 = (class765) class595.field7563.field8613.field4103;
        }
        if (arg0 != 33) {
            method2654(-70);
        }
        int var2 = -1;
        class793 var3 = (class793) class600.field7629.method3591(0);
        if (var3 != null) {
            var2 = var3.method1593(20259);
        }
        if (!class525.field6678) {
            if (var2 == 0 && (class484.field6248 == 1 && class628.field7982 > 2 || class631.method3367(true))) {
                var2 = 2;
            }
            if (var2 == 2 && class628.field7982 > 0 && var3 != null) {
                if (class430.field5649 == null && class412.field5459 == 0) {
                    class774.method4229(110, var3.method1592(-19898), var3.method1591(-54));
                } else {
                    class484.field6250 = 2;
                }
            }
            if (var2 == 0) {
                if (class643.field8232 != null) {
                    class747.method4060(30479);
                } else if (class47.field549) {
                    class38.method230((byte) 126);
                }
            }
            if (class430.field5649 != null || class412.field5459 != 0) {
                return;
            }
            class597.field7584 = null;
            class484.field6250 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class737.field9980.method210(arg0 - 33);
            int var5 = class737.field9980.method208(-43);
            boolean var6 = false;
            if (class223.field3036 != null) {
                if (var4 >= class29.field256 - 10 && var4 <= (class650.field8290 + class29.field256 + 10) && (class256.field3472 - 10) <= var5 && var5 <= class400.field5303 + class256.field3472 + 10) {
                    var6 = true;
                } else {
                    class755.method4097(8218);
                }
            }
            if (!var6) {
                if (var4 < class283.field3665 - 10 || var4 > (class283.field3665 + class71.field968 + 10) || class721.field9471 - 10 > var5 || var5 > class721.field9471 + class167.field2225 + 10) {
                    class581.method3111(arg0 ^ 0xFFFFFFB2);
                } else if (class269.field3555) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class486.field6268; var9++) {
                        if (class689.field8857) {
                            int var10 = class721.field9471 + (var9 * 16) + 33;
                            if (var5 > (var10 - 13) && var5 < var10 + 4) {
                                var8 = var10 - 13;
                                var7 = var9;
                                break;
                            }
                        } else {
                            int var11 = var9 * 16 + class721.field9471 + 31;
                            if (var11 - 13 < var5 && var5 < var11 + 3) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class695 var13 = new class695(class253.field3440);
                        for (class403 var14 = (class403) var13.method3703(-28643); var14 != null; var14 = (class403) var13.method3704((byte) 121)) {
                            if (var7 == var12) {
                                if (var14.field5360 > 1) {
                                    class648.method3503(var14, var8, var5, true);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method1592(-19898);
        int var16 = var3.method1591(arg0 - 35);
        if (class223.field3036 != null && class29.field256 <= var15 && class29.field256 + class650.field8290 >= var15 && var16 >= class256.field3472 && var16 <= (class400.field5303 + class256.field3472)) {
            int var17 = -1;
            for (int var18 = 0; var18 < class223.field3036.field5360; var18++) {
                if (class689.field8857) {
                    int var22 = class256.field3472 + (var18 * 16) + 33;
                    if ((var22 - 13) < var16 && var16 < (var22 + 4)) {
                        var17 = var18;
                    }
                } else {
                    int var23 = var18 * 16 + class256.field3472 + 31;
                    if ((var23 - 13) < var16 && var16 < var23 + 3) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class695 var20 = new class695(class223.field3036.field5365);
                for (class765 var21 = (class765) var20.method3703(-28643); var21 != null; var21 = (class765) var20.method3704((byte) 121)) {
                    if (var17 == var19) {
                        class576.method3097(var16, (byte) -81, var15, var21);
                        break;
                    }
                    var19++;
                }
            }
            class581.method3111(-110);
            return;
        }
        if (class283.field3665 > var15 || var15 > (class283.field3665 + class71.field968) || var16 < class721.field9471 || var16 > (class721.field9471 + class167.field2225)) {
            return;
        }
        if (class269.field3555) {
            int var24 = -1;
            for (int var25 = 0; var25 < class486.field6268; var25++) {
                if (class689.field8857) {
                    int var26 = var25 * 16 + class721.field9471 + 33;
                    if (var16 > var26 - 13 && var16 < (var26 + 4)) {
                        var24 = var25;
                        break;
                    }
                } else {
                    int var27 = var25 * 16 + class721.field9471 + 31;
                    if ((var27 - 13) < var16 && var16 < var27 + 3) {
                        var24 = var25;
                        break;
                    }
                }
            }
            if (var24 != -1) {
                int var28 = 0;
                class695 var29 = new class695(class253.field3440);
                for (class403 var30 = (class403) var29.method3703(-28643); var30 != null; var30 = (class403) var29.method3704((byte) 121)) {
                    if (var24 == var28) {
                        class576.method3097(var16, (byte) -81, var15, (class765) var30.field5365.field9453.field2279);
                        class581.method3111(-53);
                        return;
                    }
                    var28++;
                }
                return;
            }
        } else {
            int var31 = -1;
            for (int var32 = 0; var32 < class628.field7982; var32++) {
                if (class689.field8857) {
                    int var37 = (class628.field7982 - var32 - 1) * 16 + class721.field9471 + 33;
                    if (var16 > var37 - 13 && var16 < (var37 + 4)) {
                        var31 = var32;
                    }
                } else {
                    int var36 = class721.field9471 - (-(class628.field7982 - var32 - 1) * 16 - 31);
                    if ((var36 - 13) < var16 && var16 < (var36 + 3)) {
                        var31 = var32;
                    }
                }
            }
            if (var31 != -1) {
                int var33 = 0;
                class454 var34 = new class454(class595.field7563);
                for (class765 var35 = (class765) var34.method2583((byte) -30); var35 != null; var35 = (class765) var34.method2580(-92)) {
                    if (var31 == var33) {
                        class576.method3097(var16, (byte) -81, var15, var35);
                        break;
                    }
                    var33++;
                }
            }
            class581.method3111(arg0 - 114);
        }
        return;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILha;J)V")
    public final void method2659(int arg0, class570 arg1, long arg2) {
        field6122++;
        class355 var5 = (class355) this.field6119.method857(-83);
        if (arg0 != -22305) {
            method2656(17, 24, 62, null, null, 102, -119);
        }
        while (var5 != null) {
            var5.method2044(arg1, arg2);
            var5 = (class355) this.field6119.method864(true);
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lha;Lsba;Lnia;J)V")
    public class470(class570 arg0, class581 arg1, class513 arg2, long arg3) {
        this.field6118 = arg1;
        this.field6117 = arg2;
        this.field6113 = arg3;
        this.field6115 = this.field6118.method3112((byte) -122);
        if (!arg0.method879() && this.field6115.field8488 != -1) {
            this.field6115 = class596.method3213(this.field6115.field8488, (byte) -114);
        }
        this.field6119 = new class151();
        this.field6120 = (int) ((double) this.field6120 + Math.random() * 64.0D);
        this.method2655((byte) 47);
        this.field6131.field8804 = this.field6116.field8804;
        this.field6131.field8810 = this.field6116.field8810;
        this.field6131.field8808 = this.field6116.field8808;
        this.field6131.field8805 = this.field6116.field8805;
        this.field6131.field8803 = this.field6116.field8803;
        this.field6131.field8817 = this.field6116.field8817;
        this.field6131.field8813 = this.field6116.field8813;
        this.field6131.field8806 = this.field6116.field8806;
        this.field6131.field8816 = this.field6116.field8816;
    }
}
