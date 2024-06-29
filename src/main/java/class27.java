import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class27 extends class273 {

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    private int field463 = 1;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    private int field464 = 0;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "[B")
    private byte[] field467 = new byte[512];

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    private int field475 = 2048;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    private int field469 = 2;

    @OriginalMember(owner = "client!il", name = "X", descriptor = "I")
    private int field477 = 5;

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "[S")
    private short[] field480 = new short[512];

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "I")
    private int field478 = 5;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field466 = 0;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field465 = 0;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "Ljava/lang/String;")
    public static String field476 = "Connection lost.";

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V")
    public static final void method239(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class63.method477(arg3, arg1, arg2 + arg3, arg1 - -arg0);
        class63.method493(arg3, arg1, arg2, arg0, 0);
        if (arg4 != 25) {
            method241(-93, (class136) null);
        }
        ++field468;
        if (~class5.field63 <= -101) {
            if (class269.field4322 == null || class269.field4322.field1564 != arg2 || class269.field4322.field1560 != arg0) {
                class17 var5 = new class17(arg2, arg0);
                class63.method484(var5.field244, arg2, arg0);
                class287.method1931(class159.field2574, class31.field524, 0, 0, arg0, (byte) -73, arg2, 0, 0);
                class269.field4322 = var5;
                class263.field4173.method943(128);
            }
            class269.field4322.method111(arg3, arg1);
            int var6 = class94.field1469 * arg2 / class159.field2574 + arg3;
            int var7 = arg1 - -(class279.field4428 * arg0 / class31.field524);
            int var8 = class206.field3311 * arg2 / class159.field2574;
            int var9 = 16711680;
            if (~class238.field3752 == -2) {
                var9 = 16777215;
            }
            int var10 = class139.field2331 * arg0 / class31.field524;
            class63.method491(var6, var7, var8, var10, var9, 128);
            class63.method492(var6, var7, var8, var10, var9);
            if (~class124.field2066 < -1) {
                int var11;
                if (class165.field2714 <= 10) {
                    var11 = class165.field2714 * 25;
                } else {
                    var11 = -(class165.field2714 * 25) + 500;
                }
                for (class61 var12 = (class61) class187.field3057.method1807(-118); var12 != null; var12 = (class61) class187.field3057.method1808((byte) 105)) {
                    if (class240.field3777 == var12.field1043) {
                        int var13 = var12.field1038 * arg2 / class159.field2574 + arg3;
                        int var14 = var12.field1042 * arg0 / class31.field524 + arg1;
                        class63.method491(var13 + -2, var14 + -2, 4, 4, 16776960, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            ++field472;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (arg1 == 6) {
                                        this.field478 = arg0.method1012(4);
                                    }
                                } else {
                                    this.field477 = arg0.method1012(4);
                                }
                            } else {
                                this.field463 = arg0.method1012(4);
                            }
                        } else {
                            this.field469 = arg0.method1012(4);
                        }
                    } else {
                        this.field475 = arg0.method996(arg2 ^ 65285);
                    }
                } else {
                    this.field464 = arg0.method1012(arg2 ^ 1);
                }
            } else {
                this.field477 = this.field478 = arg0.method1012(arg2 ^ 1);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field481;
        if (arg0) {
            this.field475 = 119;
        }
        int[] var3 = super.field4359.method387((byte) 120, arg1);
        if (super.field4359.field833) {
            int var4 = class255.field4068[arg1] * this.field478 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class26.field458; ++var7) {
                class297.field4695 = Integer.MAX_VALUE;
                class10.field138 = Integer.MAX_VALUE;
                class174.field2935 = Integer.MAX_VALUE;
                class22.field342 = Integer.MAX_VALUE;
                int var8 = class265.field4234[var7] * this.field477 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field467[255 & (~var11 > ~this.field478 ? var11 : -this.field478 + var11)] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field467[var13 + (~var14 <= ~this.field477 ? -this.field477 + var14 : var14) & 255] & 255);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - (this.field480[var15] - var8);
                        int var17 = var4 - ((var11 << 12) + this.field480[var27]);
                        int var18 = this.field463;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = var26 < var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class22.field342 > var19) {
                            class297.field4695 = class10.field138;
                            class10.field138 = class174.field2935;
                            class174.field2935 = class22.field342;
                            class22.field342 = var19;
                        } else if (~class174.field2935 < ~var19) {
                            class297.field4695 = class10.field138;
                            class10.field138 = class174.field2935;
                            class174.field2935 = var19;
                        } else if (~var19 <= ~class10.field138) {
                            if (~class297.field4695 < ~var19) {
                                class297.field4695 = var19;
                            }
                        } else {
                            class297.field4695 = class10.field138;
                            class10.field138 = var19;
                        }
                    }
                }
                int var12 = this.field469;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class22.field342 + class174.field2935;
                                }
                            } else {
                                var3[var7] = class297.field4695;
                            }
                        } else {
                            var3[var7] = class10.field138;
                        }
                    } else {
                        var3[var7] = class174.field2935;
                    }
                } else {
                    var3[var7] = class22.field342;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    private final void method240(int arg0) {
        ++field474;
        int var2 = -76 / ((-64 - arg0) / 51);
        Random var3 = new Random((long) this.field464);
        this.field480 = new short[512];
        if (this.field475 > 0) {
            for (int var4 = 0; var4 < 512; ++var4) {
                this.field480[var4] = (short) class111.method824(0, var3, this.field475);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILig;)V")
    public static final void method241(int arg0, class136 arg1) {
        ++field473;
        for (int var2 = 0; var2 < class35.field579; ++var2) {
            int var3 = arg1.method1004(122);
            int var4 = arg1.method996(65280);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class15.field235[var3] != null) {
                class15.field235[var3].field4591 = var4;
            }
        }
        if (arg0 != 255) {
            method242(45);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        this.field467 = class154.method1113(33, this.field464);
        if (arg0 < -94) {
            this.method240(-122);
            ++field470;
        }
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)[Lbf;")
    public static final class102[] method242(int arg0) {
        ++field479;
        class102[] var1 = new class102[class132.field2195];
        for (int var2 = 0; class132.field2195 > var2; ++var2) {
            int var3 = class4.field56[var2] * class19.field268[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class66.field1082[var2];
            for (int var6 = 0; var6 < var3; ++var6) {
                var4[var6] = class244.field3857[class64.method498(var5[var6], 255)];
            }
            var1[var2] = new class17(class287.field4592, class20.field315, class193.field3155[var2], class197.field3224[var2], class4.field56[var2], class19.field268[var2], var4);
        }
        class213.method1410(arg0);
        return var1;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class27() {
        super(0, true);
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V")
    public static void method243(int arg0) {
        field476 = null;
        if (arg0 > -87) {
            method242(-63);
        }
    }
}
