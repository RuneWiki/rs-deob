import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class585 {

    @OriginalMember(owner = "client!to", name = "M", descriptor = "I")
    private int field80 = 32768;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "[[B")
    public static byte[][] field79;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "[[S")
    public static short[][] field78;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public final void method52(int arg0) {
        if (arg0 != -4096) {
            this.method52(73);
        }
        class635.method3634((byte) -100);
        ++field73;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)I")
    public static final int method53(byte arg0, int arg1, int arg2) {
        ++field75;
        if (arg2 != 1 && arg2 != 3) {
            if (arg0 >= 0) {
                field78 = null;
            }
            return class205.field3184[3 & arg1];
        } else {
            return class582.field8219[arg1 & 3];
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            method53((byte) 15, 89, 124);
        }
        ++field72;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field8266 = arg0.method2964((byte) 79) == 1;
            }
        } else {
            this.field80 = arg0.method2998(true) << 4;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg1 < 123) {
            return null;
        } else {
            ++field76;
            int[] var3 = super.field8255.method1637(-29827, arg0);
            if (super.field8255.field3677) {
                int[] var4 = this.method3415(-127, 1, arg0);
                int[] var5 = this.method3415(-128, 2, arg0);
                for (int var6 = 0; ~class293.field4278 < ~var6; ++var6) {
                    int var7 = var4[var6] >> 4 & 255;
                    int var8 = var5[var6] * this.field80 >> 12;
                    int var9 = class356.field5015[var7] * var8 >> 12;
                    int var10 = class145.field2121[var7] * var8 >> 12;
                    int var11 = var6 - -(var9 >> 12) & class625.field8759;
                    int var12 = (var10 >> 12) + arg0 & class305.field4391;
                    int[] var13 = this.method3415(-128, 0, var12);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIZI)V")
    public static final void method56(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field77;
        if (class767.field10562 == null) {
            class37.field491.method436(arg3, arg1, -16777216, arg2, true, arg5);
        } else if (~class210.field3250.field5742 <= -1 && ~(class768.field10571 * 512) < ~class210.field3250.field5742 && class210.field3250.field5746 >= 0 && class210.field3250.field5746 < class350.field4898 * 512) {
            ++class746.field10346;
            if (class210.field3250 != null && class210.field3250.field5742 - 256 * (class210.field3250.method2102(true) + -1) >> 9 == class779.field10695 && class210.field3250.field5746 + -(256 * (class210.field3250.method2102(true) - 1)) >> 9 == class530.field7675) {
                class530.field7675 = -1;
                class779.field10695 = -1;
                class22.method225((byte) -66);
            }
            class62.method413(arg0 + -11353);
            if (!arg4) {
                class576.method3382(-83);
            }
            class476.method2830(true);
            class495.method3007(arg2, arg3, true, arg1, 2, arg5);
            int var6 = class670.field9317;
            class740.field10205 = class740.field10197;
            int var7 = class250.field3688;
            int var8 = class6.field66;
            int var9 = class353.field4962;
            if (class416.field5704 == 1) {
                int var10 = (int) class642.field8990;
                if (class527.field7531 >> 8 > var10) {
                    var10 = class527.field7531 >> 8;
                }
                if (class310.field4432[4] && class3.field25[4] + 128 > var10) {
                    var10 = class3.field25[4] + 128;
                }
                int var11 = (int) class758.field10460 + class258.field3805 & 16383;
                class389.method2418((var10 >> 3) * 3 + 600 << 2, class198.field3037, var11, -111, var7, var10, class702.method3970(class210.field3250.field5742, class368.field5113, -20103, class210.field3250.field5746) - 200, class310.field4429);
            } else if (~class416.field5704 == -5) {
                int var12 = (int) class642.field8990;
                if (var12 < class527.field7531 >> 8) {
                    var12 = class527.field7531 >> 8;
                }
                if (class310.field4432[4] && ~var12 > ~(class3.field25[4] + 128)) {
                    var12 = class3.field25[4] + 128;
                }
                int var13 = 16383 & (int) class758.field10460;
                class389.method2418((var12 >> 3) * 3 + 600 << 2, class198.field3037, var13, arg0 ^ -27720, var7, var12, class702.method3970(class574.field8093, class368.field5113, arg0 + -47793, class207.field3211) + -200, class310.field4429);
            } else if (~class416.field5704 == -6) {
                class227.method1545((byte) -38, var7);
            }
            int var14 = class614.field8619;
            int var15 = class546.field7862;
            int var16 = class472.field6622;
            int var17 = class589.field8310;
            int var18 = class544.field7813;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class310.field4432[var19]) {
                    int var22 = (int) ((double) (-class393.field5401[var19]) + (double) (class393.field5401[var19] * 2 - -1) * Math.random() + Math.sin((double) class260.field3825[var19] / 100.0D * (double) class531.field7681[var19]) * (double) class3.field25[var19]);
                    if (~var19 == -5) {
                        class589.field8310 += var22;
                        if (~class589.field8310 > -1025) {
                            class589.field8310 = 1024;
                        } else if (~class589.field8310 < -3073) {
                            class589.field8310 = 3072;
                        }
                    }
                    if (var19 == 1) {
                        class546.field7862 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class544.field7813 = class544.field7813 - -var22 & 16383;
                    }
                    if (~var19 == -3) {
                        class472.field6622 += var22 << 2;
                    }
                    if (var19 == 0) {
                        class614.field8619 += var22 << 2;
                    }
                }
            }
            if (class614.field8619 < 0) {
                class614.field8619 = 0;
            }
            if (class472.field6622 < 0) {
                class472.field6622 = 0;
            }
            if (class614.field8619 > (class81.field902 << 9) + -1) {
                class614.field8619 = (class81.field902 << 9) + -1;
            }
            if (~class472.field6622 < ~((class48.field615 << 9) + -1)) {
                class472.field6622 = (class48.field615 << 9) - 1;
            }
            class54.method378(false);
            class294.method1912(1391655267);
            class37.field491.method434(var8, var6, var8 + var9, var6 + var7);
            class740.method4120(1, true);
            if (!class195.field2997) {
                class37.field491.method518();
                int var20 = class445.field6062;
                if (class416.field5698 != null) {
                    class416.field5698.method3122(var9, (byte) -123, class589.field8310, class37.field491, var20, class212.field3296 << 3, var8, var7, class544.field7813, var6);
                } else {
                    class37.field491.method509(var20);
                }
            } else {
                class682.method3856(class445.field6062, arg0 ^ 6937);
                if (~class740.field10205 != ~class556.field7932) {
                    class98.field1115 = true;
                }
                class556.field7932 = class740.field10205;
            }
            class265.method1722(arg0 ^ 21131);
            class494.field7044.method1870(class614.field8619, class546.field7862, class472.field6622, 16383 & -class589.field8310, -class544.field7813 & 16383, 16383 & -class565.field8018);
            class37.field491.method550(class494.field7044);
            class37.field491.method503(var9 / 2 + var8, var7 / 2 + var6, class193.field2979 << 1, class193.field2979 << 1);
            class83.method635((byte) 52, class193.field2979 << 1, var9 / 2 + var8, var7 / 2 + var6, class193.field2979 << 1);
            class320.method2066(-class565.field8018 & 16383, class614.field8619, -class589.field8310 & 16383, class472.field6622, class546.field7862, (byte) -48, 16383 & -class544.field7813);
            byte var21 = class21.field353.field10073.method1614(-106) != 2 ? 1 : (byte) class746.field10346;
            if (!class195.field2997) {
                class139.method1008(class192.field2961, class614.field8619, class546.field7862, class472.field6622, class724.field10022, class152.field2159, class606.field8481, class503.field7131, class371.field5134, class437.field5898, class210.field3250.field5755 + 1, var21, class210.field3250.field5742 >> 9, class210.field3250.field5746 >> 9, ~class21.field353.field10064.method3719(-96) == -1, true, !class576.field8120 ? -1 : class740.field10205, 0, false);
            } else {
                class306.method1983((byte) -30, -class565.field8018 & 16383, 16383 & -class544.field7813, 16383 & -class589.field8310);
                class145.method1027(class210.field3250.field5755 - -1, class503.field7131, class192.field2961, class437.field5898, true, class614.field8619, class472.field6622, (byte) 35, class740.field10205, ~class21.field353.field10064.method3719(arg0 + -27771) == -1, class210.field3250.field5746 >> 9, var21, class152.field2159, class724.field10022, class606.field8481, class371.field5134, class546.field7862, class210.field3250.field5742 >> 9);
            }
            class265.method1722(16033);
            if (arg0 != 27690) {
                method53((byte) -57, -51, -51);
            }
            if (~class266.field3873 == -11) {
                class211.method1454(var9, var8, (byte) 85, 256, 256, var7, var6);
                class432.method2588(var9, 256, var8, 256, var7, (byte) 20, var6);
                class194.method1351(var8, (byte) -119, var7, 256, 256, var6, var9);
                class300.method1945(var8, var9, var6, 100, var7);
            }
            class133.method981();
            class472.field6622 = var16;
            class544.field7813 = var18;
            class589.field8310 = var17;
            class546.field7862 = var15;
            class614.field8619 = var14;
            if (class207.field3214 && ~class65.field783.method3509(arg0 + -27801) == -1) {
                class207.field3214 = false;
            }
            if (class207.field3214) {
                class37.field491.method436(var8, var9, -16777216, var6, true, var7);
                class66.method569(arg0 + -27792, class449.field6148, false, class37.field491, class620.field8673.method3580(class140.field2081, 12), class368.field5111);
            }
            class740.method4120(arg0 + -27689, false);
        } else {
            class37.field491.method436(arg3, arg1, -16777216, arg2, true, arg5);
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
    public class8() {
        super(3, false);
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    public static void method57(int arg0) {
        int var1 = -103 % ((arg0 - -13) / 57);
        field79 = null;
        field78 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            ++field74;
            int[][] var3 = super.field8265.method1576((byte) 91, arg1);
            if (super.field8265.field3546) {
                int[] var4 = this.method3415(-127, 1, arg1);
                int[] var5 = this.method3415(-128, 2, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; ~class293.field4278 < ~var9; ++var9) {
                    int var10 = 255 & var4[var9] * 255 >> 12;
                    int var11 = var5[var9] * this.field80 >> 12;
                    int var12 = class356.field5015[var10] * var11 >> 12;
                    int var13 = class145.field2121[var10] * var11 >> 12;
                    int var14 = (var12 >> 12) + var9 & class625.field8759;
                    int var15 = class305.field4391 & arg1 - -(var13 >> 12);
                    int[][] var16 = this.method3417(0, var15, (byte) 113);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }
}
