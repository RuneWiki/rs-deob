import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class154 extends class43 {

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    private int field2797 = 5;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    private int field2803 = 2048;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    private int field2807 = 1;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    private int field2804 = 0;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "[B")
    private byte[] field2808 = new byte[512];

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
    private int field2809 = 5;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "[S")
    private short[] field2805 = new short[512];

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
    private int field2810 = 2;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public static int field2806 = 0;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "Lkg;")
    public static class115 field2800 = new class115(64);

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lmb;")
    private static class132 field2816 = class166.method1092("Prepared sound engine", 116);

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "Lmb;")
    public static class132 field2815 = field2816;

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "Z")
    public static boolean field2818 = false;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2814;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "[[[B")
    public static byte[][][] field2813;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
    private final void method1004(int arg0) {
        if (arg0 <= 96) {
            method1006(55, -2);
        }
        ++field2801;
        Random var2 = new Random((long) this.field2804);
        this.field2805 = new short[512];
        if (~this.field2803 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field2805[var3] = (short) class133.method914((byte) 53, var2, this.field2803);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 <= 21) {
            method1005((class165) null, true, 103);
        }
        this.field2808 = class231.method1467(this.field2804, (byte) 119);
        ++field2811;
        this.method1004(119);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lpb;ZI)[Lrd;")
    public static final class188[] method1005(class165 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field2806 = 104;
        }
        ++field2799;
        return !class43.method293(arg2, arg0, -20993) ? null : class102.method628(128);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)I")
    public static final int method1006(int arg0, int arg1) {
        int var2 = -24 / ((arg0 - -78) / 34);
        ++field2812;
        return arg1 & 1023;
    }

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2814 = null;
        if (arg0 == 2048) {
            field2816 = null;
            field2815 = null;
            field2800 = null;
            field2813 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field2798;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field2809 = arg2.method716(-1308);
                                }
                            } else {
                                this.field2797 = arg2.method716(arg1 ^ 1363);
                            }
                        } else {
                            this.field2807 = arg2.method716(-1308);
                        }
                    } else {
                        this.field2810 = arg2.method716(-1308);
                    }
                } else {
                    this.field2803 = arg2.method739(arg1 ^ 67);
                }
            } else {
                this.field2804 = arg2.method716(-1308);
            }
        } else {
            this.field2797 = this.field2809 = arg2.method716(-1308);
        }
        if (arg1 != -73) {
            this.method1004(-113);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field2802;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int var4 = class2.field35[arg0] * this.field2809 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class131.field2427; ++var7) {
                class209.field3830 = Integer.MAX_VALUE;
                class161.field2917 = Integer.MAX_VALUE;
                class67.field1107 = Integer.MAX_VALUE;
                class173.field3238 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class156.field2849[var7] * this.field2797);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = this.field2808[255 & (var11 >= this.field2809 ? -this.field2809 + var11 : var11)] & 255;
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (255 & this.field2808[(~this.field2797 < ~var14 ? var14 : -this.field2797 + var14) + var13 & 255]) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field2805[var15] + var8;
                        int var17 = -(var11 << 12) + -this.field2805[var27] + var4;
                        int var18 = this.field2807;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 < 0 ? -var16 : var16) - -(var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = var26 >= var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class173.field3238) {
                            if (var19 >= class67.field1107) {
                                if (~class161.field2917 < ~var19) {
                                    class209.field3830 = class161.field2917;
                                    class161.field2917 = var19;
                                } else if (class209.field3830 > var19) {
                                    class209.field3830 = var19;
                                }
                            } else {
                                class209.field3830 = class161.field2917;
                                class161.field2917 = class67.field1107;
                                class67.field1107 = var19;
                            }
                        } else {
                            class209.field3830 = class161.field2917;
                            class161.field2917 = class67.field1107;
                            class67.field1107 = class173.field3238;
                            class173.field3238 = var19;
                        }
                    }
                }
                int var12 = this.field2810;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class173.field3238 + class67.field1107;
                                }
                            } else {
                                var3[var7] = class209.field3830;
                            }
                        } else {
                            var3[var7] = class161.field2917;
                        }
                    } else {
                        var3[var7] = class67.field1107;
                    }
                } else {
                    var3[var7] = class173.field3238;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class154() {
        super(0, true);
    }
}
