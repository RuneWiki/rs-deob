import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class626 extends class243 {

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
    private int field8750 = 1;

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    private int field8755 = 2048;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "[B")
    private byte[] field8758 = new byte[512];

    @OriginalMember(owner = "client!oo", name = "Q", descriptor = "I")
    private int field8762 = 5;

    @OriginalMember(owner = "client!oo", name = "R", descriptor = "[S")
    private short[] field8763 = new short[512];

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
    private int field8759 = 0;

    @OriginalMember(owner = "client!oo", name = "U", descriptor = "I")
    private int field8766 = 5;

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
    private int field8761 = 2;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    public static int field8756 = -1;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "Lgm;")
    public static class125 field8757 = new class125("", 16);

    @OriginalMember(owner = "client!oo", name = "T", descriptor = "[Ljea;")
    public static class452[] field8765 = new class452[14];

    @OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!oo", name = "S", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
    public static void method3538(int arg0) {
        field8765 = null;
        field8757 = null;
        int var1 = 75 % ((arg0 - 73) / 52);
    }

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V")
    private final void method3539(int arg0) {
        ++field8764;
        Random var2 = new Random((long) this.field8759);
        this.field8763 = new short[512];
        if (arg0 > ~this.field8755) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field8763[var3] = (short) class676.method3842(-28737, this.field8755, var2);
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(B)V")
    public final void method85(byte arg0) {
        ++field8754;
        this.field8758 = class242.method1454(this.field8759, 512);
        this.method3539(-1);
        if (arg0 != 66) {
            method3540(false, (class611) null, 81);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field8760;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            this.field8759 = -69;
        }
        if (super.field3164.field9250) {
            int var4 = 2048 - -(class685.field9613[arg1] * this.field8766);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class687.field9628; ++var7) {
                class325.field4355 = Integer.MAX_VALUE;
                class195.field2331 = Integer.MAX_VALUE;
                class207.field2490 = Integer.MAX_VALUE;
                class746.field10360 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class666.field9279[var7] * this.field8762);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field8758[255 & (this.field8766 <= var11 ? -this.field8766 + var11 : var11)] & 255;
                    for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                        int var15 = 2 * (255 & this.field8758[255 & (var14 >= this.field8762 ? -this.field8762 + var14 : var14) + var13]);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field8763[var15] + var8;
                        int var17 = -(var11 << 12) - (this.field8763[var27] - var4);
                        int var18 = this.field8750;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 < 0 ? -var17 : var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = var26 > var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (~class746.field10360 < ~var19) {
                            class325.field4355 = class195.field2331;
                            class195.field2331 = class207.field2490;
                            class207.field2490 = class746.field10360;
                            class746.field10360 = var19;
                        } else if (~var19 > ~class207.field2490) {
                            class325.field4355 = class195.field2331;
                            class195.field2331 = class207.field2490;
                            class207.field2490 = var19;
                        } else if (~var19 <= ~class195.field2331) {
                            if (~class325.field4355 < ~var19) {
                                class325.field4355 = var19;
                            }
                        } else {
                            class325.field4355 = class195.field2331;
                            class195.field2331 = var19;
                        }
                    }
                }
                int var12 = this.field8761;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class746.field10360 + class207.field2490;
                                }
                            } else {
                                var3[var7] = class325.field4355;
                            }
                        } else {
                            var3[var7] = class195.field2331;
                        }
                    } else {
                        var3[var7] = class207.field2490;
                    }
                } else {
                    var3[var7] = class746.field10360;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field8766 = arg1.method3428((byte) 16);
                                }
                            } else {
                                this.field8762 = arg1.method3428((byte) -103);
                            }
                        } else {
                            this.field8750 = arg1.method3428((byte) 124);
                        }
                    } else {
                        this.field8761 = arg1.method3428((byte) 0);
                    }
                } else {
                    this.field8755 = arg1.method3402((byte) 127);
                }
            } else {
                this.field8759 = arg1.method3428((byte) 27);
            }
        } else {
            this.field8762 = this.field8766 = arg1.method3428((byte) -103);
        }
        if (arg2 <= -92) {
            ++field8752;
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
    public class626() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLji;I)Ljava/lang/String;")
    public static final String method3540(boolean arg0, class611 arg1, int arg2) {
        ++field8753;
        try {
            int var3 = arg1.method3396(1689622712);
            if (~var3 < ~arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field8520 += class78.field1057.method2572(arg1.field8520, var4, -69, var3, arg1.field8529, 0);
            String var5 = class324.method1933(var3, 0, (byte) -101, var4);
            return arg0 ? null : var5;
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
