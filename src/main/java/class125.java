import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class125 extends class84 {

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
    private int field1830 = 2048;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    private int field1829 = 1;

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
    private int field1833 = 0;

    @OriginalMember(owner = "client!dl", name = "db", descriptor = "I")
    private int field1839 = 2;

    @OriginalMember(owner = "client!dl", name = "gb", descriptor = "I")
    private int field1842 = 5;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "[S")
    private short[] field1831 = new short[512];

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "[B")
    private byte[] field1836 = new byte[512];

    @OriginalMember(owner = "client!dl", name = "hb", descriptor = "I")
    private int field1843 = 5;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field1823 = 0;

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field1837 = " is already on your friend list.";

    @OriginalMember(owner = "client!dl", name = "eb", descriptor = "[Ljava/lang/String;")
    public static String[] field1840 = new String[100];

    @OriginalMember(owner = "client!dl", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field1844 = "wave2:";

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "Lv;")
    public static class152 field1838 = new class152(new byte[5000]);

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "Llc;")
    public static class86 field1827;

    @OriginalMember(owner = "client!dl", name = "fb", descriptor = "Llc;")
    public static class86 field1841;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "Z")
    public static boolean field1822;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        ++field1835;
        this.field1836 = class265.method1850(this.field1833, arg0);
        this.method904(2);
    }

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "(I)V")
    public static void method903(int arg0) {
        field1827 = null;
        if (arg0 != 2048) {
            method905((byte) 19, 75, 75, -28, 8);
        }
        field1844 = null;
        field1841 = null;
        field1837 = null;
        field1840 = null;
        field1838 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field1834;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field1842 = arg0.method1111(255);
                                }
                            } else {
                                this.field1843 = arg0.method1111(255);
                            }
                        } else {
                            this.field1829 = arg0.method1111(255);
                        }
                    } else {
                        this.field1839 = arg0.method1111(255);
                    }
                } else {
                    this.field1830 = arg0.method1126(false);
                }
            } else {
                this.field1833 = arg0.method1111(255);
            }
        } else {
            this.field1843 = this.field1842 = arg0.method1111(255);
        }
        if (arg1 < 87) {
            field1838 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "(I)V")
    private final void method904(int arg0) {
        ++field1832;
        Random var2 = new Random((long) this.field1833);
        this.field1831 = new short[512];
        if (this.field1830 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field1831[var3] = (short) class145.method1041(var2, (byte) 126, this.field1830);
            }
        }
        if (arg0 != 2) {
            field1840 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        int[] var3 = super.field1228.method1627(-1, arg1);
        ++field1826;
        if (super.field1228.field3651) {
            int var4 = 2048 - -(class26.field301[arg1] * this.field1842);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class20.field221; ++var7) {
                class43.field614 = Integer.MAX_VALUE;
                class289.field4582 = Integer.MAX_VALUE;
                class231.field3720 = Integer.MAX_VALUE;
                class220.field3531 = Integer.MAX_VALUE;
                int var8 = class184.field2967[var7] * this.field1843 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field1836[(this.field1842 <= var11 ? -this.field1842 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = 2 * (255 & this.field1836[(~this.field1843 < ~var14 ? var14 : -this.field1843 + var14) + var13 & 255]);
                        int var10000 = var8 - (var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field1831[var15];
                        int var17 = -this.field1831[var27] + var4 + -(var11 << 12);
                        int var18 = this.field1829;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (var17 < 0 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = var16 < 0 ? -var16 : var16;
                                var19 = ~var25 > ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class220.field3531) {
                            if (class231.field3720 <= var19) {
                                if (~class289.field4582 < ~var19) {
                                    class43.field614 = class289.field4582;
                                    class289.field4582 = var19;
                                } else if (~class43.field614 < ~var19) {
                                    class43.field614 = var19;
                                }
                            } else {
                                class43.field614 = class289.field4582;
                                class289.field4582 = class231.field3720;
                                class231.field3720 = var19;
                            }
                        } else {
                            class43.field614 = class289.field4582;
                            class289.field4582 = class231.field3720;
                            class231.field3720 = class220.field3531;
                            class220.field3531 = var19;
                        }
                    }
                }
                int var12 = this.field1839;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class220.field3531 + class231.field3720;
                                }
                            } else {
                                var3[var7] = class43.field614;
                            }
                        } else {
                            var3[var7] = class289.field4582;
                        }
                    } else {
                        var3[var7] = class231.field3720;
                    }
                } else {
                    var3[var7] = class220.field3531;
                }
            }
        }
        return arg0 > -125 ? null : var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIIII)V")
    public static final void method905(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class207.field3328 <= arg4 && ~class228.field3657 <= ~arg4) {
            int var5 = class281.method1924(false, class211.field3386, class272.field4374, arg1);
            int var6 = class281.method1924(false, class211.field3386, class272.field4374, arg2);
            class186.method1377(arg3, var5, (byte) 73, var6, arg4);
        }
        ++field1824;
        if (arg0 != -22) {
            method905((byte) -13, 112, -10, -125, -128);
        }
    }
}
