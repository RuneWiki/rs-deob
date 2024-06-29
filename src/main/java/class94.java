import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class94 extends class105 {

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    private int field1663 = 2048;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    private int field1667 = 5;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "[S")
    private short[] field1671 = new short[512];

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    private int field1672 = 5;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    private int field1666 = 2;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    private int field1661 = 0;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    private int field1665 = 1;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "[B")
    private byte[] field1662 = new byte[512];

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "Lvf;")
    public static class265 field1670 = class87.method582(-46, "Hidden)2");

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "Lkf;")
    public static class190 field1673 = new class190();

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "Lvf;")
    public static class265 field1676 = class87.method582(-46, "loginscreen");

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        this.field1662 = class57.method432((byte) -109, this.field1661);
        if (arg0) {
            method639((byte) -66);
        }
        ++field1674;
        this.method640((byte) 107);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field1675;
        if (arg0 != 8055) {
            field1670 = null;
        }
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = class219.field3951[arg1] * this.field1667 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; var7 < field1668; ++var7) {
                class205.field3685 = Integer.MAX_VALUE;
                class68.field1307 = Integer.MAX_VALUE;
                class126.field2251 = Integer.MAX_VALUE;
                class252.field4333 = Integer.MAX_VALUE;
                int var8 = class277.field4894[var7] * this.field1672 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field1662[255 & (~this.field1667 >= ~var11 ? -this.field1667 + var11 : var11)] & 255;
                    for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field1662[255 & var13 + (~var14 <= ~this.field1672 ? var14 - this.field1672 : var14)] & 255);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field1671[var15] + var8;
                        int var17 = -(var11 << 12) + -this.field1671[var27] + var4;
                        int var18 = this.field1665;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var16 > -1 ? -var16 : var16) - -(~var17 > -1 ? -var17 : var17);
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
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class252.field4333 <= var19) {
                            if (~var19 <= ~class126.field2251) {
                                if (~var19 > ~class68.field1307) {
                                    class205.field3685 = class68.field1307;
                                    class68.field1307 = var19;
                                } else if (~var19 > ~class205.field3685) {
                                    class205.field3685 = var19;
                                }
                            } else {
                                class205.field3685 = class68.field1307;
                                class68.field1307 = class126.field2251;
                                class126.field2251 = var19;
                            }
                        } else {
                            class205.field3685 = class68.field1307;
                            class68.field1307 = class126.field2251;
                            class126.field2251 = class252.field4333;
                            class252.field4333 = var19;
                        }
                    }
                }
                int var12 = this.field1666;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = class126.field2251 - class252.field4333;
                                }
                            } else {
                                var3[var7] = class205.field3685;
                            }
                        } else {
                            var3[var7] = class68.field1307;
                        }
                    } else {
                        var3[var7] = class126.field2251;
                    }
                } else {
                    var3[var7] = class252.field4333;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method639(byte arg0) {
        field1676 = null;
        if (arg0 != 102) {
            method639((byte) 43);
        }
        field1673 = null;
        field1670 = null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
    private final void method640(byte arg0) {
        int var2 = 15 % ((-20 - arg0) / 45);
        ++field1669;
        Random var3 = new Random((long) this.field1661);
        this.field1671 = new short[512];
        if (~this.field1663 < -1) {
            for (int var4 = 0; ~var4 > -513; ++var4) {
                this.field1671[var4] = (short) class100.method664((byte) -86, var3, this.field1663);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field1664;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field1667 = arg2.method920((byte) 115);
                                }
                            } else {
                                this.field1672 = arg2.method920((byte) 108);
                            }
                        } else {
                            this.field1665 = arg2.method920((byte) 121);
                        }
                    } else {
                        this.field1666 = arg2.method920((byte) 62);
                    }
                } else {
                    this.field1663 = arg2.method927(127);
                }
            } else {
                this.field1661 = arg2.method920((byte) 84);
            }
        } else {
            this.field1672 = this.field1667 = arg2.method920((byte) 58);
        }
        if (arg1 != 255) {
            this.method640((byte) -68);
        }
    }
}
