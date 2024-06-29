import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class226 extends class666 {

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
    private int field2886 = 2048;

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
    private int field2887 = 5;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
    private int field2885 = 5;

    @OriginalMember(owner = "client!kw", name = "M", descriptor = "[B")
    private byte[] field2893 = new byte[512];

    @OriginalMember(owner = "client!kw", name = "Q", descriptor = "I")
    private int field2896 = 1;

    @OriginalMember(owner = "client!kw", name = "O", descriptor = "I")
    private int field2894 = 2;

    @OriginalMember(owner = "client!kw", name = "P", descriptor = "I")
    private int field2895 = 0;

    @OriginalMember(owner = "client!kw", name = "L", descriptor = "[S")
    private short[] field2892 = new short[512];

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "[I")
    public static int[] field2890 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!kw", name = "K", descriptor = "Z")
    public static boolean field2891 = false;

    @OriginalMember(owner = "client!kw", name = "T", descriptor = "I")
    public static int field2899 = 0;

    @OriginalMember(owner = "client!kw", name = "S", descriptor = "[S")
    public static short[] field2898 = new short[256];

    @OriginalMember(owner = "client!kw", name = "R", descriptor = "[I")
    public static int[] field2897 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!kw", name = "H", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!kw", name = "U", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!kw", name = "V", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "(I)V")
    private final void method1322(int arg0) {
        ++field2888;
        Random var2 = new Random((long) this.field2895);
        this.field2892 = new short[512];
        int var3 = 15 % ((-49 - arg0) / 39);
        if (this.field2886 > 0) {
            for (int var4 = 0; var4 < 512; ++var4) {
                this.field2892[var4] = (short) class252.method1448(var2, this.field2886, (byte) 50);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field2889;
        int[] var3 = super.field9466.method1811(arg1, 16);
        if (super.field9466.field4172) {
            int var4 = class476.field6935[arg1] * this.field2887 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class501.field7222; ++var7) {
                class462.field6412 = Integer.MAX_VALUE;
                class50.field527 = Integer.MAX_VALUE;
                class44.field500 = Integer.MAX_VALUE;
                class580.field8247 = Integer.MAX_VALUE;
                int var8 = class579.field8246[var7] * this.field2885 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field2893[(~var11 <= ~this.field2887 ? var11 - this.field2887 : var11) & 255];
                    for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                        int var15 = (255 & this.field2893[255 & (this.field2885 <= var14 ? -this.field2885 + var14 : var14) + var13]) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field2892[var15] + (var14 << 12));
                        int var17 = -(var11 << 12) + -this.field2892[var27] + var4;
                        int var18 = this.field2896;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var16 > -1 ? -var16 : var16) - -(~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 < 0 ? -var17 : var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = var26 > var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class580.field8247 > var19) {
                            class462.field6412 = class50.field527;
                            class50.field527 = class44.field500;
                            class44.field500 = class580.field8247;
                            class580.field8247 = var19;
                        } else if (~class44.field500 < ~var19) {
                            class462.field6412 = class50.field527;
                            class50.field527 = class44.field500;
                            class44.field500 = var19;
                        } else if (~class50.field527 >= ~var19) {
                            if (var19 < class462.field6412) {
                                class462.field6412 = var19;
                            }
                        } else {
                            class462.field6412 = class50.field527;
                            class50.field527 = var19;
                        }
                    }
                }
                int var12 = this.field2894;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class580.field8247 + class44.field500;
                                }
                            } else {
                                var3[var7] = class462.field6412;
                            }
                        } else {
                            var3[var7] = class50.field527;
                        }
                    } else {
                        var3[var7] = class44.field500;
                    }
                } else {
                    var3[var7] = class580.field8247;
                }
            }
        }
        if (arg0 > -21) {
            method1323((byte) 28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public final void method118(int arg0) {
        this.field2893 = class498.method2863(this.field2895, 0);
        ++field2900;
        this.method1322(arg0 ^ 95);
        if (arg0 != -9) {
            this.method118(106);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        ++field2901;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field2887 = arg1.method2541(119);
                                }
                            } else {
                                this.field2885 = arg1.method2541(34);
                            }
                        } else {
                            this.field2896 = arg1.method2541(65);
                        }
                    } else {
                        this.field2894 = arg1.method2541(51);
                    }
                } else {
                    this.field2886 = arg1.method2574(-1758460248);
                }
            } else {
                this.field2895 = arg1.method2541(72);
            }
        } else {
            this.field2885 = this.field2887 = arg1.method2541(77);
        }
        if (!arg2) {
            field2897 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
    public static void method1323(byte arg0) {
        if (arg0 == -73) {
            field2897 = null;
            field2890 = null;
            field2898 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "()V")
    public class226() {
        super(0, true);
    }
}
