import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class106 extends class264 {

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    private int field1829 = 2048;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "[S")
    private short[] field1831 = new short[512];

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    private int field1836 = 1;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    private int field1841 = 5;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "[B")
    private byte[] field1833 = new byte[512];

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    private int field1834 = 2;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
    private int field1840 = 0;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "I")
    private int field1845 = 5;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "Lcf;")
    public static class93 field1842 = class147.method1066(")4p=", -48);

    @OriginalMember(owner = "client!c", name = "P", descriptor = "Lcf;")
    public static class93 field1832 = class147.method1066("Okay", -48);

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public static int field1843 = 0;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "Lcf;")
    public static class93 field1848 = class147.method1066("(Udns", -48);

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "Lhg;")
    public static class177 field1828;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "Llj;")
    public static class25 field1844;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.field1833 = class145.method1056(75, this.field1840);
        this.method765(0);
        if (arg0 == -3) {
            ++field1838;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field1839;
        int[] var3 = super.field4716.method532((byte) 112, arg0);
        if (super.field4716.field1424) {
            int var4 = 2048 - -(class67.field1220[arg0] * this.field1841);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class176.field3060 < ~var7; ++var7) {
                class112.field1903 = Integer.MAX_VALUE;
                class209.field3742 = Integer.MAX_VALUE;
                class271.field4822 = Integer.MAX_VALUE;
                class242.field4369 = Integer.MAX_VALUE;
                int var8 = class144.field2497[var7] * this.field1845 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field1833[(this.field1841 > var11 ? var11 : var11 - this.field1841) & 255];
                    for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                        int var15 = (255 & this.field1833[(this.field1845 <= var14 ? -this.field1845 + var14 : var14) + var13 & 255]) * 2;
                        int var10000 = var8 - (var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field1831[var15];
                        int var17 = -(var11 << 12) + -this.field1831[var27] + var4;
                        int var18 = this.field1836;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (~var16 <= -1 ? var16 : -var16);
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
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = var26 > var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 <= ~class242.field4369) {
                            if (~class271.field4822 >= ~var19) {
                                if (~class209.field3742 >= ~var19) {
                                    if (class112.field1903 > var19) {
                                        class112.field1903 = var19;
                                    }
                                } else {
                                    class112.field1903 = class209.field3742;
                                    class209.field3742 = var19;
                                }
                            } else {
                                class112.field1903 = class209.field3742;
                                class209.field3742 = class271.field4822;
                                class271.field4822 = var19;
                            }
                        } else {
                            class112.field1903 = class209.field3742;
                            class209.field3742 = class271.field4822;
                            class271.field4822 = class242.field4369;
                            class242.field4369 = var19;
                        }
                    }
                }
                int var12 = this.field1834;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = class271.field4822 - class242.field4369;
                                }
                            } else {
                                var3[var7] = class112.field1903;
                            }
                        } else {
                            var3[var7] = class209.field3742;
                        }
                    } else {
                        var3[var7] = class271.field4822;
                    }
                } else {
                    var3[var7] = class242.field4369;
                }
            }
        }
        return arg1 >= -83 ? null : var3;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class106() {
        super(0, true);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lme;B)V")
    public static final void method763(class223 arg0, byte arg1) {
        class178.method1298(200000, -6, arg0);
        int var2 = -92 % ((30 - arg1) / 45);
        ++field1846;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method764(boolean arg0) {
        field1842 = null;
        field1828 = null;
        field1844 = null;
        field1848 = null;
        field1832 = null;
        if (!arg0) {
            field1843 = -10;
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    private final void method765(int arg0) {
        ++field1835;
        Random var2 = new Random((long) this.field1840);
        this.field1831 = new short[512];
        if (arg0 == 0) {
            if (~this.field1829 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field1831[var3] = (short) class42.method238(var2, false, this.field1829);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLhg;)I")
    public static final int method766(byte arg0, class177 arg1) {
        ++field1847;
        int var2 = 0;
        if (arg1.method1280(class280.field5021, (byte) -81)) {
            ++var2;
        }
        int var3 = -13 % ((arg0 - -58) / 40);
        if (arg1.method1280(class161.field2844, (byte) -91)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Lbg;")
    public static final class234 method767(int arg0, int arg1) {
        class234 var2 = (class234) class60.field1013.method1852((long) arg0, (byte) -105);
        ++field1827;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg0 < 32768) {
                var3 = class283.field5080.method1271(0, -2154, arg0);
            } else {
                var3 = class253.field4551.method1271(0, -2154, arg0 & 32767);
            }
            class234 var4 = new class234();
            if (var3 != null) {
                var4.method1598(115, new class280(var3));
            }
            if (arg0 >= 32768) {
                var4.method1596(32768);
            }
            class60.field1013.method1847(var4, 114, (long) arg0);
            return arg1 <= 75 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field1841 = arg2.method1907(16832);
                                }
                            } else {
                                this.field1845 = arg2.method1907(16832);
                            }
                        } else {
                            this.field1836 = arg2.method1907(16832);
                        }
                    } else {
                        this.field1834 = arg2.method1907(16832);
                    }
                } else {
                    this.field1829 = arg2.method1891(-127);
                }
            } else {
                this.field1840 = arg2.method1907(16832);
            }
        } else {
            this.field1845 = this.field1841 = arg2.method1907(16832);
        }
        ++field1837;
        if (arg0 <= 11) {
            method767(-45, -65);
        }
    }
}
