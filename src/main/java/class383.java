import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class383 extends class30 {

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    private int field5411 = 0;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    private int field5414 = 2048;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "[S")
    private short[] field5416 = new short[512];

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    private int field5420 = 2;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "[B")
    private byte[] field5415 = new byte[512];

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    private int field5422 = 5;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    private int field5419 = 5;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    private int field5423 = 1;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "Lar;")
    public static class635 field5424 = new class635(128);

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "Lsea;")
    public static class648 field5426;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "[Lin;")
    public static class78[] field5418;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "[[Lvv;")
    public static class295[][] field5425;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 362)
    public class383() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 18)
    public final void method29(byte arg0) {
        if (arg0 <= -10) {
            this.field5415 = class273.method1695(this.field5411, (byte) -95);
            ++field5417;
            this.method2274((byte) -95);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I", line = 30)
    public final int[] method48(int arg0, int arg1) {
        ++field5421;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int var4 = class430.field6016[arg1] * this.field5419 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~var7 > ~class31.field399; ++var7) {
                class475.field6545 = Integer.MAX_VALUE;
                class17.field177 = Integer.MAX_VALUE;
                class498.field6772 = Integer.MAX_VALUE;
                class677.field9702 = Integer.MAX_VALUE;
                int var8 = class48.field568[var7] * this.field5422 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field5415[(this.field5419 > var11 ? var11 : var11 - this.field5419) & 255];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (this.field5415[var13 + (~var14 <= ~this.field5422 ? var14 - this.field5422 : var14) & 255] & 255);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - (this.field5416[var15] - var8);
                        int var17 = var4 - this.field5416[var27] + -(var11 << 12);
                        int var18 = this.field5423;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 < 0 ? -var16 : var16) - -(~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = var26 <= var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class677.field9702 > var19) {
                            class475.field6545 = class17.field177;
                            class17.field177 = class498.field6772;
                            class498.field6772 = class677.field9702;
                            class677.field9702 = var19;
                        } else if (~class498.field6772 >= ~var19) {
                            if (~class17.field177 < ~var19) {
                                class475.field6545 = class17.field177;
                                class17.field177 = var19;
                            } else if (~class475.field6545 < ~var19) {
                                class475.field6545 = var19;
                            }
                        } else {
                            class475.field6545 = class17.field177;
                            class17.field177 = class498.field6772;
                            class498.field6772 = var19;
                        }
                    }
                }
                int var12 = this.field5420;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class677.field9702 + class498.field6772;
                                }
                            } else {
                                var3[var7] = class475.field6545;
                            }
                        } else {
                            var3[var7] = class17.field177;
                        }
                    } else {
                        var3[var7] = class498.field6772;
                    }
                } else {
                    var3[var7] = class677.field9702;
                }
            }
        }
        return arg0 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V", line = 258)
    private final void method2274(byte arg0) {
        ++field5413;
        Random var2 = new Random((long) this.field5411);
        this.field5416 = new short[512];
        if (arg0 != -95) {
            method2275((byte) -92);
        }
        if (~this.field5414 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field5416[var3] = (short) class351.method2023(this.field5414, -109, var2);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BILac;)V", line = 284)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field5419 = arg2.method2874((byte) -75);
                                }
                            } else {
                                this.field5422 = arg2.method2874((byte) -75);
                            }
                        } else {
                            this.field5423 = arg2.method2874((byte) -75);
                        }
                    } else {
                        this.field5420 = arg2.method2874((byte) -75);
                    }
                } else {
                    this.field5414 = arg2.method2845(-1);
                }
            } else {
                this.field5411 = arg2.method2874((byte) -75);
            }
        } else {
            this.field5422 = this.field5419 = arg2.method2874((byte) -75);
        }
        if (arg0 < 100) {
            field5424 = null;
        }
        ++field5410;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)V", line = 366)
    public static void method2275(byte arg0) {
        field5425 = null;
        if (arg0 != -98) {
            field5425 = null;
        }
        field5418 = null;
        field5426 = null;
        field5424 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLhb;)V", line = 388)
    public static final void method2276(byte arg0, class677 arg1) {
        if (arg0 >= -33) {
            method2275((byte) -22);
        }
        ++field5412;
        class389 var2 = (class389) class122.field1683.method970((byte) 89, (long) arg1.field1697);
        if (var2 != null) {
            var2.method2287(-1536);
        } else {
            class7.method22((class301) null, arg1.field1807[0], arg1, (class61) null, arg1.field1801[0], 0, 116, arg1.field4053);
        }
    }
}
