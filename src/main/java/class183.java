import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class183 extends class456 {

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    private int field2709 = 5;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    private int field2707 = 2048;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    private int field2708 = 1;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    private int field2710 = 0;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    private int field2711 = 2;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "[B")
    private byte[] field2712 = new byte[512];

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    private int field2715 = 5;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "[S")
    private short[] field2713 = new short[512];

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "[Ltf;")
    public static class491[] field2717 = new class491[4];

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ol", name = "Y", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    private final void method1254(byte arg0) {
        if (arg0 != -99) {
            this.method33(-113, -119);
        }
        ++field2716;
        Random var2 = new Random((long) this.field2710);
        this.field2713 = new short[512];
        if (~this.field2707 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2713[var3] = (short) class318.method1957(this.field2707, (byte) -64, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "(I)V")
    public static final void method1255(int arg0) {
        ++field2703;
        if (class88.field1240 == 5) {
            if (arg0 != 13104) {
                field2717 = null;
            }
            class88.field1240 = 6;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field2715 = arg2.method2628(arg1 ^ 49207);
                                }
                            } else {
                                this.field2709 = arg2.method2628(49152);
                            }
                        } else {
                            this.field2708 = arg2.method2628(49152);
                        }
                    } else {
                        this.field2711 = arg2.method2628(49152);
                    }
                } else {
                    this.field2707 = arg2.method2631(2530);
                }
            } else {
                this.field2710 = arg2.method2628(49152);
            }
        } else {
            this.field2709 = this.field2715 = arg2.method2628(49152);
        }
        if (arg1 != 55) {
            method1256(87);
        }
        ++field2718;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class183() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field2706;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            this.method1254((byte) 7);
        }
        if (super.field6466.field6153) {
            int var4 = class14.field206[arg1] * this.field2715 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class156.field2169; ++var7) {
                class449.field6348 = Integer.MAX_VALUE;
                class75.field1057 = Integer.MAX_VALUE;
                class76.field1082 = Integer.MAX_VALUE;
                class327.field4914 = Integer.MAX_VALUE;
                int var8 = class288.field4397[var7] * this.field2709 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field2712[(this.field2715 <= var11 ? -this.field2715 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = (255 & this.field2712[255 & (var14 >= this.field2709 ? var14 - this.field2709 : var14) + var13]) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field2713[var15] + (var14 << 12));
                        int var17 = var4 - ((var11 << 12) + this.field2713[var27]);
                        int var18 = this.field2708;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = var26 > var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (~class327.field4914 < ~var19) {
                            class449.field6348 = class75.field1057;
                            class75.field1057 = class76.field1082;
                            class76.field1082 = class327.field4914;
                            class327.field4914 = var19;
                        } else if (~var19 <= ~class76.field1082) {
                            if (var19 < class75.field1057) {
                                class449.field6348 = class75.field1057;
                                class75.field1057 = var19;
                            } else if (~var19 > ~class449.field6348) {
                                class449.field6348 = var19;
                            }
                        } else {
                            class449.field6348 = class75.field1057;
                            class75.field1057 = class76.field1082;
                            class76.field1082 = var19;
                        }
                    }
                }
                int var12 = this.field2711;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class327.field4914 + class76.field1082;
                                }
                            } else {
                                var3[var7] = class449.field6348;
                            }
                        } else {
                            var3[var7] = class75.field1057;
                        }
                    } else {
                        var3[var7] = class76.field1082;
                    }
                } else {
                    var3[var7] = class327.field4914;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "(I)V")
    public static void method1256(int arg0) {
        if (arg0 > -93) {
            method1256(-93);
        }
        field2717 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        this.field2712 = class72.method620(0, this.field2710);
        ++field2719;
        if (!arg0) {
            this.field2707 = -30;
        }
        this.method1254((byte) -99);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)I")
    public static final int method1257(int arg0, int arg1) {
        if (arg0 != 23132) {
            method1255(-62);
        }
        ++field2705;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    static {
        new class332("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }
}
