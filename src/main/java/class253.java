import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class253 extends class166 {

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    private int field4563 = 2048;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    private int field4567 = 5;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    private int field4556 = 0;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "[B")
    private byte[] field4562 = new byte[512];

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "[S")
    private short[] field4568 = new short[512];

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    private int field4570 = 5;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    private int field4559 = 1;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "I")
    private int field4574 = 2;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "Lhj;")
    public static class69 field4564 = class181.method1318("Fertigkeit)2", (byte) -107);

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "Lhj;")
    private static class69 field4555 = class181.method1318("Cancel", (byte) -120);

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field4569 = 0;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "Lhj;")
    public static class69 field4571 = field4555;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "Lhj;")
    private static class69 field4573 = class181.method1318("Loading title screen )2 ", (byte) -107);

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lhj;")
    public static class69 field4572 = field4573;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "[[[B")
    public static byte[][][] field4560;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field4570 = arg1.method937(false);
                                }
                            } else {
                                this.field4567 = arg1.method937(false);
                            }
                        } else {
                            this.field4559 = arg1.method937(false);
                        }
                    } else {
                        this.field4574 = arg1.method937(false);
                    }
                } else {
                    this.field4563 = arg1.method912(arg0 ^ -25);
                }
            } else {
                this.field4556 = arg1.method937(false);
            }
        } else {
            this.field4567 = this.field4570 = arg1.method937(false);
        }
        if (arg0 != 96) {
            this.field4568 = null;
        }
        ++field4557;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
    public static void method1759(byte arg0) {
        field4564 = null;
        if (arg0 >= -26) {
            field4572 = null;
        }
        field4572 = null;
        field4571 = null;
        field4560 = null;
        field4555 = null;
        field4573 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILnc;I)Lej;")
    public static final class48 method1760(int arg0, class83 arg1, int arg2) {
        if (arg2 != 0) {
            method1759((byte) 118);
        }
        ++field4561;
        return !class240.method1702(-128, arg1, arg0) ? null : class145.method1103(0);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        ++field4554;
        int var2 = -40 % ((arg0 - 58) / 50);
        this.field4562 = class181.method1320(-27019, this.field4556);
        this.method1761(-1);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field4576;
        if (arg1 != 8388607) {
            return null;
        } else {
            int[] var3 = super.field3071.method1252(arg0, true);
            if (super.field3071.field3142) {
                int var4 = 2048 - -(class13.field187[arg0] * this.field4570);
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < field4565; ++var7) {
                    class147.field2712 = Integer.MAX_VALUE;
                    class258.field4633 = Integer.MAX_VALUE;
                    class208.field3784 = Integer.MAX_VALUE;
                    class199.field3603 = Integer.MAX_VALUE;
                    int var8 = class24.field347[var7] * this.field4567 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                        int var13 = 255 & this.field4562[255 & (~this.field4570 >= ~var11 ? var11 - this.field4570 : var11)];
                        for (int var14 = var9 - 1; ~var10 <= ~var14; ++var14) {
                            int var15 = (255 & this.field4562[255 & (~this.field4567 >= ~var14 ? var14 - this.field4567 : var14) + var13]) * 2;
                            int var27 = var15 + 1;
                            int var16 = -this.field4568[var15] + -(var14 << 12) + var8;
                            int var17 = var4 - (this.field4568[var27] - -(var11 << 12));
                            int var18 = this.field4559;
                            int var19;
                            if (~var18 != -2) {
                                if (~var18 != -4) {
                                    if (var18 != 4) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (var17 < 0 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var17 >= 0 ? var17 : -var17;
                                    int var26 = ~var16 > -1 ? -var16 : var16;
                                    var19 = var25 >= var26 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (class199.field3603 <= var19) {
                                if (var19 < class208.field3784) {
                                    class147.field2712 = class258.field4633;
                                    class258.field4633 = class208.field3784;
                                    class208.field3784 = var19;
                                } else if (class258.field4633 <= var19) {
                                    if (class147.field2712 > var19) {
                                        class147.field2712 = var19;
                                    }
                                } else {
                                    class147.field2712 = class258.field4633;
                                    class258.field4633 = var19;
                                }
                            } else {
                                class147.field2712 = class258.field4633;
                                class258.field4633 = class208.field3784;
                                class208.field3784 = class199.field3603;
                                class199.field3603 = var19;
                            }
                        }
                    }
                    int var12 = this.field4574;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (~var12 != -4) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class199.field3603 + class208.field3784;
                                    }
                                } else {
                                    var3[var7] = class147.field2712;
                                }
                            } else {
                                var3[var7] = class258.field4633;
                            }
                        } else {
                            var3[var7] = class208.field3784;
                        }
                    } else {
                        var3[var7] = class199.field3603;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    private final void method1761(int arg0) {
        ++field4558;
        Random var2 = new Random((long) this.field4556);
        this.field4568 = new short[512];
        if (~this.field4563 < arg0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field4568[var3] = (short) client.method1149(85, this.field4563, var2);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(BI)V")
    public static final void method1762(byte arg0, int arg1) {
        class65 var2 = (class65) class4.field25.method769(true, (long) arg1);
        ++field4575;
        if (var2 != null) {
            int var3 = 0;
            if (arg0 != 28) {
                method1762((byte) 24, 11);
            }
            while (var2.field1261.length > var3) {
                var2.field1261[var3] = -1;
                var2.field1257[var3] = 0;
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(III)Lfc;")
    public static final class118 method1763(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class118 var4 = var3.field3932;
            var3.field3932 = null;
            return var4;
        }
    }
}
