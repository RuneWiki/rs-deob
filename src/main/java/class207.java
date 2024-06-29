import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class207 extends class83 {

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "[B")
    private byte[] field2795 = new byte[512];

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    private int field2792 = 5;

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "I")
    private int field2796 = 2;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    private int field2793 = 0;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    private int field2789 = 1;

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "I")
    private int field2800 = 2048;

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "[S")
    private short[] field2799 = new short[512];

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    private int field2787 = 5;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "Ljp;")
    public static class402 field2798;

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class207() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        ++field2788;
        this.field2795 = class427.method2645((byte) -93, this.field2793);
        this.method1121(0);
        if (arg0) {
            this.field2792 = 112;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field2790;
        int var4 = -51 / ((-27 - arg1) / 50);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field2787 = arg2.method1350(31351);
                                }
                            } else {
                                this.field2792 = arg2.method1350(31351);
                            }
                        } else {
                            this.field2789 = arg2.method1350(31351);
                        }
                    } else {
                        this.field2796 = arg2.method1350(31351);
                    }
                } else {
                    this.field2800 = arg2.method1374(-2);
                }
            } else {
                this.field2793 = arg2.method1350(31351);
            }
        } else {
            this.field2792 = this.field2787 = arg2.method1350(31351);
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(Z)V")
    public static void method1120(boolean arg0) {
        if (!arg0) {
            method1120(true);
        }
        field2798 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field2791;
            int[] var3 = super.field916.method1813(arg1, (byte) -83);
            if (super.field916.field4174) {
                int var4 = class225.field3036[arg1] * this.field2787 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; class420.field6139 > var7; ++var7) {
                    class421.field6167 = Integer.MAX_VALUE;
                    class87.field965 = Integer.MAX_VALUE;
                    class206.field2778 = Integer.MAX_VALUE;
                    class235.field3237 = Integer.MAX_VALUE;
                    int var8 = class402.field5863[var7] * this.field2792 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 - -1;
                    for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                        int var13 = 255 & this.field2795[255 & (var11 >= this.field2787 ? -this.field2787 + var11 : var11)];
                        for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                            int var15 = (255 & this.field2795[var13 - -(~this.field2792 >= ~var14 ? -this.field2792 + var14 : var14) & 255]) * 2;
                            int var27 = var15 + 1;
                            int var16 = -this.field2799[var15] - (var14 << 12) + var8;
                            int var17 = -this.field2799[var27] - (var11 << 12) + var4;
                            int var18 = this.field2789;
                            int var19;
                            if (~var18 != -2) {
                                if (~var18 != -4) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (var18 == 2) {
                                                var19 = (~var17 <= -1 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var17 >= 0 ? var17 : -var17;
                                    int var26 = ~var16 > -1 ? -var16 : var16;
                                    var19 = var25 >= var26 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 - -(var17 * var17) >> 12;
                            }
                            if (class235.field3237 <= var19) {
                                if (var19 < class206.field2778) {
                                    class421.field6167 = class87.field965;
                                    class87.field965 = class206.field2778;
                                    class206.field2778 = var19;
                                } else if (~var19 <= ~class87.field965) {
                                    if (~var19 > ~class421.field6167) {
                                        class421.field6167 = var19;
                                    }
                                } else {
                                    class421.field6167 = class87.field965;
                                    class87.field965 = var19;
                                }
                            } else {
                                class421.field6167 = class87.field965;
                                class87.field965 = class206.field2778;
                                class206.field2778 = class235.field3237;
                                class235.field3237 = var19;
                            }
                        }
                    }
                    int var12 = this.field2796;
                    if (~var12 != -1) {
                        if (~var12 != -2) {
                            if (~var12 != -4) {
                                if (var12 != 4) {
                                    if (var12 == 2) {
                                        var3[var7] = class206.field2778 - class235.field3237;
                                    }
                                } else {
                                    var3[var7] = class421.field6167;
                                }
                            } else {
                                var3[var7] = class87.field965;
                            }
                        } else {
                            var3[var7] = class206.field2778;
                        }
                    } else {
                        var3[var7] = class235.field3237;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
    private final void method1121(int arg0) {
        ++field2801;
        Random var2 = new Random((long) this.field2793);
        this.field2799 = new short[512];
        if (arg0 < this.field2800) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2799[var3] = (short) class409.method2546(18992, var2, this.field2800);
            }
        }
    }
}
