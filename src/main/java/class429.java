import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class429 extends class325 {

    @OriginalMember(owner = "client!hja", name = "K", descriptor = "I")
    private int field6105 = 0;

    @OriginalMember(owner = "client!hja", name = "F", descriptor = "I")
    private int field6100 = 5;

    @OriginalMember(owner = "client!hja", name = "I", descriptor = "I")
    private int field6103 = 5;

    @OriginalMember(owner = "client!hja", name = "D", descriptor = "[S")
    private short[] field6098 = new short[512];

    @OriginalMember(owner = "client!hja", name = "L", descriptor = "I")
    private int field6106 = 2;

    @OriginalMember(owner = "client!hja", name = "O", descriptor = "I")
    private int field6109 = 2048;

    @OriginalMember(owner = "client!hja", name = "E", descriptor = "I")
    private int field6099 = 1;

    @OriginalMember(owner = "client!hja", name = "M", descriptor = "[B")
    private byte[] field6107 = new byte[512];

    @OriginalMember(owner = "client!hja", name = "N", descriptor = "Ljw;")
    public static class581 field6108 = new class581(71, 12);

    @OriginalMember(owner = "client!hja", name = "Q", descriptor = "[I")
    public static int[] field6111 = new int[13];

    @OriginalMember(owner = "client!hja", name = "C", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!hja", name = "G", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!hja", name = "H", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!hja", name = "J", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!hja", name = "P", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!hja", name = "R", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!hja", name = "e", descriptor = "(B)V", line = 9)
    private final void method2617(byte arg0) {
        if (arg0 != -111) {
            this.method2617((byte) -52);
        }
        ++field6104;
        Random var2 = new Random((long) this.field6105);
        this.field6098 = new short[512];
        if (this.field6109 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field6098[var3] = (short) class739.method4090(var2, -128, this.field6109);
            }
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(Z)V", line = 37)
    public final void method101(boolean arg0) {
        this.field6107 = class398.method2497(this.field6105, false);
        ++field6097;
        if (arg0) {
            this.method2617((byte) -111);
        }
    }

    @OriginalMember(owner = "client!hja", name = "d", descriptor = "(III)V", line = 50)
    public static final void method2618(int arg0, int arg1, int arg2) {
        if (arg0 <= 99) {
            method2618(-123, 53, -69);
        }
        class232.field3167 = -class375.field5434 + arg1;
        ++field6110;
        class587.field7831 = -class375.field5447 + arg2;
    }

    @OriginalMember(owner = "client!hja", name = "<init>", descriptor = "()V", line = 70)
    public class429() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hja", name = "f", descriptor = "(B)V", line = 76)
    public static void method2619(byte arg0) {
        field6111 = null;
        int var1 = 119 / ((arg0 - 39) / 51);
        field6108 = null;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(Ljp;IB)V", line = 91)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field6100 = arg0.method2398(-1372747256);
                                }
                            } else {
                                this.field6103 = arg0.method2398(-1372747256);
                            }
                        } else {
                            this.field6099 = arg0.method2398(-1372747256);
                        }
                    } else {
                        this.field6106 = arg0.method2398(-1372747256);
                    }
                } else {
                    this.field6109 = arg0.method2359(-1);
                }
            } else {
                this.field6105 = arg0.method2398(-1372747256);
            }
        } else {
            this.field6103 = this.field6100 = arg0.method2398(-1372747256);
        }
        if (arg2 > -41) {
            field6111 = null;
        }
        ++field6101;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(BI)[I", line = 170)
    public final int[] method100(byte arg0, int arg1) {
        ++field6112;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 <= 21) {
            method2619((byte) 14);
        }
        if (super.field4727.field6067) {
            int var4 = class621.field8370[arg1] * this.field6100 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class261.field3874 < ~var7; ++var7) {
                class48.field728 = Integer.MAX_VALUE;
                class226.field3087 = Integer.MAX_VALUE;
                class319.field4601 = Integer.MAX_VALUE;
                class740.field10214 = Integer.MAX_VALUE;
                int var8 = class556.field7498[var7] * this.field6103 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field6107[255 & (this.field6100 <= var11 ? -this.field6100 + var11 : var11)];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (255 & this.field6107[255 & (~var14 <= ~this.field6103 ? var14 - this.field6103 : var14) + var13]);
                        int var10000 = -(var14 << 12) + var8;
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field6098[var15];
                        int var17 = -this.field6098[var27] - (var11 << 12) + var4;
                        int var18 = this.field6099;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = ~var25 <= ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 > ~class740.field10214) {
                            class48.field728 = class226.field3087;
                            class226.field3087 = class319.field4601;
                            class319.field4601 = class740.field10214;
                            class740.field10214 = var19;
                        } else if (var19 >= class319.field4601) {
                            if (~var19 > ~class226.field3087) {
                                class48.field728 = class226.field3087;
                                class226.field3087 = var19;
                            } else if (~class48.field728 < ~var19) {
                                class48.field728 = var19;
                            }
                        } else {
                            class48.field728 = class226.field3087;
                            class226.field3087 = class319.field4601;
                            class319.field4601 = var19;
                        }
                    }
                }
                int var12 = this.field6106;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = class319.field4601 - class740.field10214;
                                }
                            } else {
                                var3[var7] = class48.field728;
                            }
                        } else {
                            var3[var7] = class226.field3087;
                        }
                    } else {
                        var3[var7] = class319.field4601;
                    }
                } else {
                    var3[var7] = class740.field10214;
                }
            }
        }
        return var3;
    }
}
