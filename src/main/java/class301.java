import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class301 extends class305 {

    @OriginalMember(owner = "client!qt", name = "N", descriptor = "I")
    private int field4621 = 1;

    @OriginalMember(owner = "client!qt", name = "J", descriptor = "[S")
    private short[] field4618 = new short[512];

    @OriginalMember(owner = "client!qt", name = "R", descriptor = "I")
    private int field4624 = 5;

    @OriginalMember(owner = "client!qt", name = "T", descriptor = "I")
    private int field4626 = 0;

    @OriginalMember(owner = "client!qt", name = "O", descriptor = "I")
    private int field4622 = 2;

    @OriginalMember(owner = "client!qt", name = "S", descriptor = "I")
    private int field4625 = 2048;

    @OriginalMember(owner = "client!qt", name = "X", descriptor = "I")
    private int field4630 = 5;

    @OriginalMember(owner = "client!qt", name = "U", descriptor = "[B")
    private byte[] field4627 = new byte[512];

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "F")
    public static float field4616 = 0.0F;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "Lne;")
    public static class139 field4613 = new class139("LOCAL", 4);

    @OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!qt", name = "L", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!qt", name = "M", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!qt", name = "P", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!qt", name = "V", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!qt", name = "W", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "[I")
    public static int[] field4614;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method15(int arg0, int arg1) {
        ++field4629;
        int[] var3 = super.field4677.method2174(arg0, -102);
        if (super.field4677.field5040) {
            int var4 = 2048 - -(field4614[arg0] * this.field4630);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class91.field1471; ++var7) {
                class33.field394 = Integer.MAX_VALUE;
                class197.field3071 = Integer.MAX_VALUE;
                class148.field2207 = Integer.MAX_VALUE;
                class457.field6787 = Integer.MAX_VALUE;
                int var8 = class78.field1298[var7] * this.field4624 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field4627[255 & (this.field4630 > var11 ? var11 : -this.field4630 + var11)];
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (this.field4627[var13 + (~var14 > ~this.field4624 ? var14 : var14 - this.field4624) & 255] & 255) * 2;
                        int var10000 = var8 - (var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field4618[var15];
                        int var17 = -(var11 << 12) + var4 + -this.field4618[var27];
                        int var18 = this.field4621;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
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
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = ~var25 <= ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class457.field6787 > var19) {
                            class33.field394 = class197.field3071;
                            class197.field3071 = class148.field2207;
                            class148.field2207 = class457.field6787;
                            class457.field6787 = var19;
                        } else if (~class148.field2207 >= ~var19) {
                            if (~class197.field3071 >= ~var19) {
                                if (~class33.field394 < ~var19) {
                                    class33.field394 = var19;
                                }
                            } else {
                                class33.field394 = class197.field3071;
                                class197.field3071 = var19;
                            }
                        } else {
                            class33.field394 = class197.field3071;
                            class197.field3071 = class148.field2207;
                            class148.field2207 = var19;
                        }
                    }
                }
                int var12 = this.field4622;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = class148.field2207 - class457.field6787;
                                }
                            } else {
                                var3[var7] = class33.field394;
                            }
                        } else {
                            var3[var7] = class197.field3071;
                        }
                    } else {
                        var3[var7] = class148.field2207;
                    }
                } else {
                    var3[var7] = class457.field6787;
                }
            }
        }
        return arg1 != 4688 ? null : var3;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIII)I", line = 219)
    public static final int method2000(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -73) {
            field4613 = null;
        }
        ++field4615;
        int var4 = -arg0 + 255;
        int var5 = (-16711936 & (arg3 & 16711935) * arg0 | (arg3 & 65280) * arg0 & 16711680) >>> 8;
        return ((-16711936 & (16711935 & arg2) * var4 | (arg2 & 65280) * var4 & 16711680) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILfh;B)V", line = 233)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field4617;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field4630 = arg1.method1337((byte) -118);
                                }
                            } else {
                                this.field4624 = arg1.method1337((byte) -121);
                            }
                        } else {
                            this.field4621 = arg1.method1337((byte) 113);
                        }
                    } else {
                        this.field4622 = arg1.method1337((byte) 3);
                    }
                } else {
                    this.field4625 = arg1.method1396(-128);
                }
            } else {
                this.field4626 = arg1.method1337((byte) 80);
            }
        } else {
            this.field4624 = this.field4630 = arg1.method1337((byte) -123);
        }
        if (arg2 <= 76) {
            this.field4618 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 312)
    public final void method17(byte arg0) {
        this.field4627 = class367.method2336(this.field4626, 255);
        if (arg0 == -62) {
            ++field4623;
            this.method2001((byte) 118);
        }
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "(B)V", line = 328)
    private final void method2001(byte arg0) {
        ++field4628;
        Random var2 = new Random((long) this.field4626);
        this.field4618 = new short[512];
        if (this.field4625 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field4618[var3] = (short) class58.method378(false, this.field4625, var2);
            }
        }
        int var4 = -100 / ((-21 - arg0) / 55);
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "()V", line = 422)
    public class301() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIB)V", line = 376)
    public static final void method2002(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var9 = arg4 + 1;
        class262.method1831(arg3, class402.field5946[arg4], (byte) 43, arg1, arg0);
        ++field4620;
        int var8 = arg2 - 1;
        class262.method1831(arg3, class402.field5946[arg2], (byte) 43, arg1, arg0);
        if (arg5 > 89) {
            for (int var6 = var9; var6 <= var8; ++var6) {
                int[] var7 = class402.field5946[var6];
                var7[arg0] = var7[arg3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "(B)V", line = 407)
    public static void method2003(byte arg0) {
        field4614 = null;
        field4613 = null;
        int var1 = -29 / ((arg0 - 22) / 50);
    }
}
