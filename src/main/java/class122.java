import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class122 extends class115 {

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "[S")
    private short[] field1617 = new short[512];

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    private int field1615 = 5;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    private int field1620 = 5;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    private int field1619 = 2048;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "[B")
    private byte[] field1625 = new byte[512];

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    private int field1628 = 1;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    private int field1618 = 2;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    private int field1626 = 0;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1623 = "Unable to find ";

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V")
    public static void method687(byte arg0) {
        field1623 = null;
        if (arg0 != 102) {
            field1623 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBII)V")
    public static final void method688(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 > -78) {
            field1623 = null;
        }
        if (class143.field2029 <= arg5 && arg0 <= class128.field1785 && ~arg1 <= ~class20.field209 && ~arg4 >= ~class407.field5914) {
            class318.method1977(arg5, 17777, arg1, arg0, arg4, arg2);
        } else {
            class376.method2365(arg5, -20, arg2, arg1, arg0, arg4);
        }
        ++field1616;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Lka;")
    public static final class276 method689(int arg0, int arg1, int arg2) {
        class302 var3 = class19.field202[arg0][arg1][arg2];
        return var3 != null && var3.field4310 != null ? var3.field4310 : null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field1612;
        int[] var3 = super.field1340.method14(75, arg0);
        if (arg1 != 0) {
            return null;
        } else {
            if (super.field1340.field35) {
                int var4 = class193.field2634[arg0] * this.field1620 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; ~class218.field2979 < ~var7; ++var7) {
                    class19.field192 = Integer.MAX_VALUE;
                    class81.field919 = Integer.MAX_VALUE;
                    class2.field18 = Integer.MAX_VALUE;
                    class58.field700 = Integer.MAX_VALUE;
                    int var8 = class43.field530[var7] * this.field1615 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                        int var13 = 255 & this.field1625[(this.field1620 > var11 ? var11 : var11 - this.field1620) & 255];
                        for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                            int var15 = (255 & this.field1625[(var14 >= this.field1615 ? var14 - this.field1615 : var14) + var13 & 255]) * 2;
                            int var27 = var15 + 1;
                            int var16 = var8 + -this.field1617[var15] + -(var14 << 12);
                            int var17 = -(var11 << 12) + var4 + -this.field1617[var27];
                            int var18 = this.field1628;
                            int var19;
                            if (var18 != 1) {
                                if (~var18 != -4) {
                                    if (var18 != 4) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) + (~var17 > -1 ? -var17 : var17);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var16 >= 0 ? var16 : -var16;
                                    int var26 = ~var17 > -1 ? -var17 : var17;
                                    var19 = var26 >= var25 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (var19 < class58.field700) {
                                class19.field192 = class81.field919;
                                class81.field919 = class2.field18;
                                class2.field18 = class58.field700;
                                class58.field700 = var19;
                            } else if (~var19 > ~class2.field18) {
                                class19.field192 = class81.field919;
                                class81.field919 = class2.field18;
                                class2.field18 = var19;
                            } else if (class81.field919 > var19) {
                                class19.field192 = class81.field919;
                                class81.field919 = var19;
                            } else if (class19.field192 > var19) {
                                class19.field192 = var19;
                            }
                        }
                    }
                    int var12 = this.field1618;
                    if (~var12 != -1) {
                        if (var12 != 1) {
                            if (~var12 != -4) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class58.field700 + class2.field18;
                                    }
                                } else {
                                    var3[var7] = class19.field192;
                                }
                            } else {
                                var3[var7] = class81.field919;
                            }
                        } else {
                            var3[var7] = class2.field18;
                        }
                    } else {
                        var3[var7] = class58.field700;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (arg0 == 0) {
            ++field1614;
            this.field1625 = class403.method2556(false, this.field1626);
            this.method691(true);
        }
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V")
    public static final void method690(int arg0) {
        ++field1613;
        if (!class218.field2991.method927()) {
            client.method1065((byte) -77, class341.field5018);
        } else {
            class40.method250((byte) 121);
            class218.field2991.method950(class348.field5096);
            class109.method609(10);
        }
        if (arg0 != 17026) {
            method687((byte) 50);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    private final void method691(boolean arg0) {
        if (arg0) {
            ++field1621;
            Random var2 = new Random((long) this.field1626);
            this.field1617 = new short[512];
            if (this.field1619 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field1617[var3] = (short) class239.method1529(this.field1619, (byte) -96, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)Lfm;")
    public static final class436 method692(int arg0, int arg1, int arg2) {
        class302 var3 = class19.field202[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4324;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class122() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field1620 = arg1.method1342((byte) -127);
                                }
                            } else {
                                this.field1615 = arg1.method1342((byte) -127);
                            }
                        } else {
                            this.field1628 = arg1.method1342((byte) -127);
                        }
                    } else {
                        this.field1618 = arg1.method1342((byte) -127);
                    }
                } else {
                    this.field1619 = arg1.method1355(32136);
                }
            } else {
                this.field1626 = arg1.method1342((byte) -128);
            }
        } else {
            this.field1615 = this.field1620 = arg1.method1342((byte) -127);
        }
        ++field1624;
        if (arg0 < 83) {
            this.field1617 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "(I)V")
    public static final void method693(int arg0) {
        int var1 = -5 % ((arg0 - -50) / 55);
        class59.field711 = null;
        class71.field807 = null;
        ++field1622;
    }
}
