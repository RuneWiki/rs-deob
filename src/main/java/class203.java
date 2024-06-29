import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class203 extends class11 {

    @OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
    private int field2855 = 2;

    @OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
    private int field2853 = 5;

    @OriginalMember(owner = "client!wt", name = "I", descriptor = "[B")
    private byte[] field2850 = new byte[512];

    @OriginalMember(owner = "client!wt", name = "Q", descriptor = "[S")
    private short[] field2858 = new short[512];

    @OriginalMember(owner = "client!wt", name = "T", descriptor = "I")
    private int field2861 = 5;

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
    private int field2848 = 2048;

    @OriginalMember(owner = "client!wt", name = "P", descriptor = "I")
    private int field2857 = 0;

    @OriginalMember(owner = "client!wt", name = "O", descriptor = "I")
    private int field2856 = 1;

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!wt", name = "J", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!wt", name = "M", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!wt", name = "R", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!wt", name = "S", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!wt", name = "K", descriptor = "J")
    public static long field2852;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field2851;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 >= -42) {
            this.field2850 = null;
        }
        if (super.field158.field2966) {
            int var4 = 2048 - -(class328.field4484[arg1] * this.field2861);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class90.field1316 > var7; ++var7) {
                class52.field628 = Integer.MAX_VALUE;
                class325.field4415 = Integer.MAX_VALUE;
                class335.field4519 = Integer.MAX_VALUE;
                class445.field6564 = Integer.MAX_VALUE;
                int var8 = class448.field6606[var7] * this.field2853 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field2850[(~this.field2861 < ~var11 ? var11 : -this.field2861 + var11) & 255] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (255 & this.field2850[255 & (~var14 <= ~this.field2853 ? -this.field2853 + var14 : var14) + var13]);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field2858[var15] + var8;
                        int var17 = -(var11 << 12) + -this.field2858[var27] + var4;
                        int var18 = this.field2856;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = var26 >= var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class445.field6564 < ~var19) {
                            class52.field628 = class325.field4415;
                            class325.field4415 = class335.field4519;
                            class335.field4519 = class445.field6564;
                            class445.field6564 = var19;
                        } else if (~var19 <= ~class335.field4519) {
                            if (~var19 > ~class325.field4415) {
                                class52.field628 = class325.field4415;
                                class325.field4415 = var19;
                            } else if (~var19 > ~class52.field628) {
                                class52.field628 = var19;
                            }
                        } else {
                            class52.field628 = class325.field4415;
                            class325.field4415 = class335.field4519;
                            class335.field4519 = var19;
                        }
                    }
                }
                int var12 = this.field2855;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class445.field6564 + class335.field4519;
                                }
                            } else {
                                var3[var7] = class52.field628;
                            }
                        } else {
                            var3[var7] = class325.field4415;
                        }
                    } else {
                        var3[var7] = class335.field4519;
                    }
                } else {
                    var3[var7] = class445.field6564;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILta;)V")
    public static final void method1261(int arg0, class142 arg1) {
        class211.field2950[arg0] = arg1;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field2849;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field2861 = arg0.method2348(-2);
                                }
                            } else {
                                this.field2853 = arg0.method2348(-2);
                            }
                        } else {
                            this.field2856 = arg0.method2348(-2);
                        }
                    } else {
                        this.field2855 = arg0.method2348(-2);
                    }
                } else {
                    this.field2848 = arg0.method2353((byte) 117);
                }
            } else {
                this.field2857 = arg0.method2348(-2);
            }
        } else {
            this.field2853 = this.field2861 = arg0.method2348(-2);
        }
        if (arg1 > -40) {
            this.field2857 = -66;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Z)V")
    public final void method42(boolean arg0) {
        if (arg0) {
            this.field2850 = class231.method1425(this.field2857, -117);
            ++field2859;
            this.method1263((byte) 3);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lla;ZLjava/lang/String;I)V")
    public static final void method1262(class315 arg0, boolean arg1, String arg2, int arg3) {
        ++field2854;
        byte var4 = 4;
        int var5 = 6 - -var4;
        if (arg3 != 2048) {
            field2852 = 8L;
        }
        int var6 = var4 + 6;
        int var7 = class278.field3809.method2865(-86, 250, (class16[]) null, arg2);
        int var8 = class278.field3809.method2870(250, 62, (class16[]) null, arg2) * 13;
        class269.field3721.method243(-var4 + var5, var6 - var4, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class269.field3721.method253(-var4 + var5, -var4 + var6, var4 + var7 + var4, var4 + var8 - -var4, -1, 0);
        arg0.method1832(1, (class10) null, var8, var5, -1, 0, arg2, -1, 1, 0, var6, 0, (class16[]) null, var7, (int[]) null, 1);
        class270.method1613(var4 + var8 + var4, var7 - -var4 + var4, -var4 + var5, -var4 + var6, 0);
        if (arg1) {
            class269.field3721.method229();
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)V")
    private final void method1263(byte arg0) {
        ++field2860;
        Random var2 = new Random((long) this.field2857);
        this.field2858 = new short[512];
        if (~this.field2848 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field2858[var3] = (short) class367.method2213(-837693600, this.field2848, var2);
            }
        }
        if (arg0 != 3) {
            this.field2850 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
    public class203() {
        super(0, true);
    }
}
