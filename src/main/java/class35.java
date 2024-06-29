import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class35 extends class5 {

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "[S")
    private short[] field475 = new short[512];

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "[B")
    private byte[] field480 = new byte[512];

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    private int field477 = 0;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    private int field484 = 2;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    private int field485 = 2048;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    private int field482 = 5;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    private int field481 = 1;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    private int field487 = 5;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "[[I")
    public static int[][] field478 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class35() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
    private final void method223(int arg0) {
        ++field479;
        Random var2 = new Random((long) this.field477);
        this.field475 = new short[512];
        if (~this.field485 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field475[var3] = (short) class517.method2801(var2, this.field485, class688.method3877(arg0, 120));
            }
        }
        if (arg0 != 5) {
            this.method47(1, (class630) null, -58);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        ++field476;
        this.field480 = class253.method1482(this.field477, (byte) -97);
        int var2 = 102 % ((arg0 - 64) / 60);
        this.method223(5);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field483;
        int[] var3 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int var4 = class272.field3439[arg1] * this.field482 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class657.field9287 < ~var7; ++var7) {
                class255.field3123 = Integer.MAX_VALUE;
                class204.field2597 = Integer.MAX_VALUE;
                class138.field1798 = Integer.MAX_VALUE;
                class260.field3212 = Integer.MAX_VALUE;
                int var8 = class269.field3405[var7] * this.field487 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field480[(~var11 > ~this.field482 ? var11 : -this.field482 + var11) & 255] & 255;
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (this.field480[255 & var13 - -(~var14 <= ~this.field487 ? -this.field487 + var14 : var14)] & 255) * 2;
                        int var10000 = var8 - (var14 << 12);
                        int var28 = var15 + 1;
                        int var16 = var10000 - this.field475[var15];
                        int var17 = var4 - ((var11 << 12) + this.field475[var28]);
                        int var18 = this.field481;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 < 0 ? -var16 : var16) - -(~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = var25 >= var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class260.field3212 > var19) {
                            class255.field3123 = class204.field2597;
                            class204.field2597 = class138.field1798;
                            class138.field1798 = class260.field3212;
                            class260.field3212 = var19;
                        } else if (var19 < class138.field1798) {
                            class255.field3123 = class204.field2597;
                            class204.field2597 = class138.field1798;
                            class138.field1798 = var19;
                        } else if (var19 >= class204.field2597) {
                            if (~var19 > ~class255.field3123) {
                                class255.field3123 = var19;
                            }
                        } else {
                            class255.field3123 = class204.field2597;
                            class204.field2597 = var19;
                        }
                    }
                }
                int var12 = this.field484;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class260.field3212 + class138.field1798;
                                }
                            } else {
                                var3[var7] = class255.field3123;
                            }
                        } else {
                            var3[var7] = class204.field2597;
                        }
                    } else {
                        var3[var7] = class138.field1798;
                    }
                } else {
                    var3[var7] = class260.field3212;
                }
            }
        }
        int var27 = 34 % ((arg0 - 81) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field482 = arg1.method3501(-9268);
                                }
                            } else {
                                this.field487 = arg1.method3501(arg0 ^ -9267);
                            }
                        } else {
                            this.field481 = arg1.method3501(arg0 ^ -9267);
                        }
                    } else {
                        this.field484 = arg1.method3501(-9268);
                    }
                } else {
                    this.field485 = arg1.method3470(13111);
                }
            } else {
                this.field477 = arg1.method3501(arg0 + -9269);
            }
        } else {
            this.field487 = this.field482 = arg1.method3501(-9268);
        }
        if (arg0 != 1) {
            this.field475 = null;
        }
        ++field486;
    }

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "(I)V")
    public static void method224(int arg0) {
        field478 = null;
        if (arg0 >= -109) {
            method224(-89);
        }
    }
}
