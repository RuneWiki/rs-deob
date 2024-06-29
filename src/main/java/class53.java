import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class53 extends class14 {

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
    private int field820 = 5;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "[S")
    private short[] field819 = new short[512];

    @OriginalMember(owner = "client!aw", name = "W", descriptor = "I")
    private int field828 = 1;

    @OriginalMember(owner = "client!aw", name = "V", descriptor = "I")
    private int field827 = 0;

    @OriginalMember(owner = "client!aw", name = "U", descriptor = "I")
    private int field826 = 2;

    @OriginalMember(owner = "client!aw", name = "R", descriptor = "[B")
    private byte[] field823 = new byte[512];

    @OriginalMember(owner = "client!aw", name = "Q", descriptor = "I")
    private int field822 = 5;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    private int field818 = 2048;

    @OriginalMember(owner = "client!aw", name = "T", descriptor = "Lvj;")
    public static class304 field825 = new class304("M", "M", "M", "M");

    @OriginalMember(owner = "client!aw", name = "ab", descriptor = "Z")
    public static boolean field832 = false;

    @OriginalMember(owner = "client!aw", name = "Y", descriptor = "Lff;")
    public static class9 field830 = new class9(41, 11);

    @OriginalMember(owner = "client!aw", name = "cb", descriptor = "I")
    public static int field834 = 0;

    @OriginalMember(owner = "client!aw", name = "db", descriptor = "I")
    public static int field835 = -1;

    @OriginalMember(owner = "client!aw", name = "bb", descriptor = "Lcu;")
    public static class145 field833 = new class145(3, 15);

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!aw", name = "S", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!aw", name = "X", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!aw", name = "Z", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!aw", name = "eb", descriptor = "Lcr;")
    public static class403 field836;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "Lpc;")
    public static class473 field816;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)V", line = 3)
    public static void method389(int arg0) {
        if (arg0 != 1) {
            method389(-41);
        }
        field816 = null;
        field825 = null;
        field836 = null;
        field833 = null;
        field830 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IBLmd;)V", line = 18)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field831;
        int var4 = 24 / ((arg1 - -51) / 37);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field822 = arg2.method2238(255);
                                }
                            } else {
                                this.field820 = arg2.method2238(255);
                            }
                        } else {
                            this.field828 = arg2.method2238(255);
                        }
                    } else {
                        this.field826 = arg2.method2238(255);
                    }
                } else {
                    this.field818 = arg2.method2212((byte) 83);
                }
            } else {
                this.field827 = arg2.method2238(255);
            }
        } else {
            this.field820 = this.field822 = arg2.method2238(255);
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)V", line = 97)
    public final void method142(byte arg0) {
        this.field823 = class323.method1861(255, this.field827);
        ++field817;
        this.method391(-5);
        int var2 = -19 % ((arg0 - 39) / 59);
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(IB)Z", line = 109)
    public static final boolean method390(int arg0, byte arg1) {
        ++field829;
        if (arg1 != -38) {
            field825 = null;
        }
        return arg0 == 2 || ~arg0 == -4;
    }

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)V", line = 123)
    private final void method391(int arg0) {
        ++field824;
        Random var2 = new Random((long) this.field827);
        this.field819 = new short[512];
        if (arg0 != -5) {
            this.method147(1, (byte) 5, (class379) null);
        }
        if (~this.field818 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field819[var3] = (short) class363.method2116(this.field818, var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IB)[I", line = 153)
    public final int[] method140(int arg0, byte arg1) {
        ++field821;
        if (arg1 >= -2) {
            return null;
        } else {
            int[] var3 = super.field270.method2263(-29596, arg0);
            if (super.field270.field5222) {
                int var4 = class273.field3590[arg0] * this.field822 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; ~class115.field1637 < ~var7; ++var7) {
                    class458.field6311 = Integer.MAX_VALUE;
                    class4.field118 = Integer.MAX_VALUE;
                    class128.field1872 = Integer.MAX_VALUE;
                    class264.field3475 = Integer.MAX_VALUE;
                    int var8 = class195.field2715[var7] * this.field820 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 - 1; var11 <= var6; ++var11) {
                        int var13 = 255 & this.field823[255 & (~var11 > ~this.field822 ? var11 : -this.field822 + var11)];
                        for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                            int var15 = (this.field823[var13 + (~var14 > ~this.field820 ? var14 : -this.field820 + var14) & 255] & 255) * 2;
                            int var10000 = var8 - (var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 - this.field819[var15];
                            int var17 = -(var11 << 12) + -this.field819[var27] + var4;
                            int var18 = this.field828;
                            int var19;
                            if (~var18 != -2) {
                                if (var18 != 3) {
                                    if (var18 != 4) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (~var17 <= -1 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var16 >= 0 ? var16 : -var16;
                                    int var26 = var17 < 0 ? -var17 : var17;
                                    var19 = var26 >= var25 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~class264.field3475 >= ~var19) {
                                if (class128.field1872 > var19) {
                                    class458.field6311 = class4.field118;
                                    class4.field118 = class128.field1872;
                                    class128.field1872 = var19;
                                } else if (~var19 > ~class4.field118) {
                                    class458.field6311 = class4.field118;
                                    class4.field118 = var19;
                                } else if (class458.field6311 > var19) {
                                    class458.field6311 = var19;
                                }
                            } else {
                                class458.field6311 = class4.field118;
                                class4.field118 = class128.field1872;
                                class128.field1872 = class264.field3475;
                                class264.field3475 = var19;
                            }
                        }
                    }
                    int var12 = this.field826;
                    if (var12 != 0) {
                        if (~var12 != -2) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class264.field3475 + class128.field1872;
                                    }
                                } else {
                                    var3[var7] = class458.field6311;
                                }
                            } else {
                                var3[var7] = class4.field118;
                            }
                        } else {
                            var3[var7] = class128.field1872;
                        }
                    } else {
                        var3[var7] = class264.field3475;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V", line = 378)
    public class53() {
        super(0, true);
    }
}
