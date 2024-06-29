import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class667 extends class135 {

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
    private boolean field9375 = false;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
    private boolean field9373;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "[Lhba;")
    private class639[] field9377;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Leda;")
    public static class116 field9374 = new class116(117, 0);

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Lcaa;")
    public static class540 field9380;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[[[Lko;")
    public static class293[][][] field9371;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILwv;Lvo;)V")
    public static final void method3756(int arg0, class705 arg1, class345 arg2) {
        class353.field4948 = arg2;
        if (arg0 != 6627) {
            method3757((byte) 9);
        }
        class392.field5698 = arg1;
        ++field9368;
        class176.field2813 = "";
        if (class627.field8926.startsWith("win")) {
            class176.field2813 = class176.field2813 + "windows/";
        } else if (class627.field8926.startsWith("linux")) {
            class176.field2813 = class176.field2813 + "linux/";
        } else if (class627.field8926.startsWith("mac")) {
            class176.field2813 = class176.field2813 + "macos/";
        }
        if (!class392.field5698.field9985) {
            if (!class627.field8928.startsWith("amd64") && !class627.field8928.startsWith("x86_64")) {
                if (!class627.field8928.startsWith("i386") && !class627.field8928.startsWith("i486") && !class627.field8928.startsWith("i586") && !class627.field8928.startsWith("x86")) {
                    if (!class627.field8928.startsWith("ppc")) {
                        class176.field2813 = class176.field2813 + "universal/";
                    } else {
                        class176.field2813 = class176.field2813 + "ppc/";
                    }
                } else {
                    class176.field2813 = class176.field2813 + "x86/";
                }
            } else {
                class176.field2813 = class176.field2813 + "x86_64/";
            }
        } else {
            class176.field2813 = class176.field2813 + "msjava/";
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
    public final void method375(int arg0, boolean arg1) {
        ++field9372;
        if (arg0 <= 14) {
            field9371 = null;
        }
        super.field2179.method2959(class55.field715, class345.field4866, (byte) -111);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public final void method385(int arg0) {
        int var2 = 114 / ((-29 - arg0) / 45);
        ++field9378;
        if (this.field9375) {
            super.field2179.method2953(1, 105);
            super.field2179.method2924(13528, (class402) null);
            super.field2179.method125(class485.field6913, -104);
            super.field2179.method2954((byte) -58);
            if (this.field9373) {
                super.field2179.method2959(class55.field715, class55.field715, (byte) -109);
                super.field2179.method2914(10, 0, class171.field2763);
                super.field2179.method2937(8, class171.field2763, 0);
            } else {
                super.field2179.method2959(class55.field715, class55.field715, (byte) -105);
                super.field2179.method2914(90, 0, class171.field2763);
                super.field2179.method2953(2, 107);
                super.field2179.method2959(class55.field715, class55.field715, (byte) 81);
                super.field2179.method2914(71, 0, class171.field2763);
                super.field2179.method2914(56, 1, class51.field669);
                super.field2179.method2937(8, class171.field2763, 0);
                super.field2179.method2924(13528, (class402) null);
            }
            super.field2179.method2953(0, 122);
            this.field9375 = false;
        } else {
            super.field2179.method2937(8, class171.field2763, 0);
        }
        super.field2179.method2959(class55.field715, class55.field715, (byte) 98);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            if (this.field9375) {
                super.field2179.method2953(1, 120);
                super.field2179.method2924(13528, this.field9377[arg1 + -1]);
                super.field2179.method2953(0, arg2 ^ 107);
            }
            ++field9369;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
    public static void method3757(byte arg0) {
        field9371 = null;
        int var1 = -18 % ((62 - arg0) / 49);
        field9374 = null;
        field9380 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lnh;)V")
    public class667(class495 arg0) {
        super(arg0);
        if (arg0.field7323) {
            this.field9373 = ~arg0.field7348 > -4;
            int var2 = this.field9373 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 != 1) {
                                if (~var14 == -3) {
                                    var15 = var12;
                                } else if (~var14 == -4) {
                                    var15 = -var12;
                                } else if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field9377 = new class639[3];
            this.field9377[0] = super.field2179.method94(false, var4, 64, (byte) 5);
            this.field9377[1] = super.field2179.method94(false, var5, 64, (byte) 5);
            this.field9377[2] = super.field2179.method94(false, var3, 64, (byte) 5);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
    public final void method376(boolean arg0, int arg1) {
        if (arg1 != -25475) {
            this.field9375 = false;
        }
        ++field9376;
        if (this.field9377 != null && arg0) {
            super.field2179.method2953(1, 120);
            super.field2179.method125(class689.field9778, -117);
            class14 var3 = super.field2179.method2946((byte) -124);
            var3.method165(1024);
            super.field2179.method2949(class316.field4373, (byte) 71);
            if (this.field9373) {
                super.field2179.method2959(class673.field9556, class345.field4866, (byte) 111);
                super.field2179.method143(true, class171.field2763, arg1 ^ 25567, false, 0);
                super.field2179.method2937(8, class521.field7683, 0);
            } else {
                super.field2179.method2959(class345.field4866, class55.field715, (byte) 47);
                super.field2179.method2914(106, 0, class51.field669);
                super.field2179.method2953(2, arg1 ^ -25592);
                super.field2179.method2959(class673.field9556, class345.field4866, (byte) -116);
                super.field2179.method2914(35, 0, class51.field669);
                super.field2179.method143(true, class51.field669, arg1 + 25576, false, 1);
                super.field2179.method2937(8, class521.field7683, 0);
                super.field2179.method2924(13528, super.field2179.field7336);
            }
            super.field2179.method2953(0, 110);
            this.field9375 = true;
        } else {
            super.field2179.method2937(8, class521.field7683, 0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Laj;II)V")
    public final void method384(class402 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            super.field2179.method2924(13528, arg0);
            ++field9379;
            super.field2179.method2956((byte) 47, arg2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)Z")
    public final boolean method379(int arg0) {
        ++field9370;
        if (arg0 != -4931) {
            method3757((byte) 10);
        }
        return true;
    }
}
