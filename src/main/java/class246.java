import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class246 extends class288 {

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "[B")
    private byte[] field3939 = new byte[512];

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    private int field3944 = 1;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    private int field3942 = 5;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "[S")
    private short[] field3951 = new short[512];

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    private int field3943 = 2;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    private int field3936 = 0;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    private int field3955 = 5;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    private int field3960 = 2048;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "Leg;")
    public static class272 field3947 = new class272(64);

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "[I")
    public static int[] field3950 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3954 = "Continue";

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "[Lrk;")
    public static class158[] field3957 = new class158[4];

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "Ljava/lang/String;")
    public static String field3956 = "Loaded world list data";

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "Ljj;")
    public static class134 field3948;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "[I")
    public static int[] field3958;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)I")
    public static final int method1621(int arg0, int arg1) {
        ++field3945;
        return arg0 != -760058068 ? -49 : arg1 & 255;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)V")
    public static final void method1622(int arg0, int arg1) {
        class254.field4067.method1832(arg1, (byte) 108);
        if (arg0 > 51) {
            ++field3940;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field3938;
        if (arg0 != 0) {
            method1627(-87);
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int var4 = class1.field15[arg1] * this.field3955 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class186.field2986 > var7; ++var7) {
                class105.field1809 = Integer.MAX_VALUE;
                class108.field1869 = Integer.MAX_VALUE;
                class28.field334 = Integer.MAX_VALUE;
                class134.field2252 = Integer.MAX_VALUE;
                int var8 = 2048 - -(field3958[var7] * this.field3942);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field3939[255 & (var11 >= this.field3955 ? var11 - this.field3955 : var11)] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field3939[255 & (~this.field3942 >= ~var14 ? -this.field3942 + var14 : var14) + var13] & 255);
                        int var27 = var15 + 1;
                        int var16 = var8 - this.field3951[var15] - (var14 << 12);
                        int var17 = -this.field3951[var27] - ((var11 << 12) - var4);
                        int var18 = this.field3944;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = var25 > var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (~class134.field2252 < ~var19) {
                            class105.field1809 = class108.field1869;
                            class108.field1869 = class28.field334;
                            class28.field334 = class134.field2252;
                            class134.field2252 = var19;
                        } else if (var19 < class28.field334) {
                            class105.field1809 = class108.field1869;
                            class108.field1869 = class28.field334;
                            class28.field334 = var19;
                        } else if (class108.field1869 <= var19) {
                            if (~var19 > ~class105.field1809) {
                                class105.field1809 = var19;
                            }
                        } else {
                            class105.field1809 = class108.field1869;
                            class108.field1869 = var19;
                        }
                    }
                }
                int var12 = this.field3943;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class134.field2252 + class28.field334;
                                }
                            } else {
                                var3[var7] = class105.field1809;
                            }
                        } else {
                            var3[var7] = class108.field1869;
                        }
                    } else {
                        var3[var7] = class28.field334;
                    }
                } else {
                    var3[var7] = class134.field2252;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public static void method1623(int arg0) {
        field3957 = null;
        field3950 = null;
        field3956 = null;
        if (arg0 != 1) {
            field3958 = null;
        }
        field3947 = null;
        field3958 = null;
        field3954 = null;
        field3948 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field3955 = arg0.method1779(-114);
                                }
                            } else {
                                this.field3942 = arg0.method1779(-60);
                            }
                        } else {
                            this.field3944 = arg0.method1779(-60);
                        }
                    } else {
                        this.field3943 = arg0.method1779(-100);
                    }
                } else {
                    this.field3960 = arg0.method1777(-38);
                }
            } else {
                this.field3936 = arg0.method1779(-60);
            }
        } else {
            this.field3942 = this.field3955 = arg0.method1779(arg1 ^ 117);
        }
        if (arg1 != -19) {
            method1625((class103) null, (String) null, 42);
        }
        ++field3952;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1624(String arg0, int arg1) {
        ++field3949;
        if (class69.field961 != null) {
            int var2 = arg1;
            long var3 = class238.method1570(arg0, (byte) 99);
            if (~var3 != -1L) {
                while (~class69.field961.length < ~var2 && class69.field961[var2].field962 != var3) {
                    ++var2;
                }
                if (var2 < class69.field961.length && class69.field961[var2] != null) {
                    ++class209.field3439;
                    class83.field1148.method1238(122, -136478397);
                    class83.field1148.method1762(class69.field961[var2].field962, (byte) 125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Leb;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1625(class103 arg0, String arg1, int arg2) {
        ++field3937;
        if (arg2 != -9255) {
            field3947 = null;
        }
        if (~arg1.indexOf("%") != 0) {
            while (true) {
                int var3 = arg1.indexOf("%1");
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (~var4 == 0) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (~var8 == 0) {
                                                            return arg1;
                                                        }
                                                        String var9 = "";
                                                        if (class184.field2953 != null) {
                                                            if (class184.field2953.field2266 == null) {
                                                                var9 = class238.method1564(126, class184.field2953.field2270);
                                                            } else {
                                                                var9 = (String) class184.field2953.field2266;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class95.method674((byte) 115, class124.method863((byte) 121, arg0, 4)) + arg1.substring(var7 - -2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class95.method674((byte) 115, class124.method863((byte) 127, arg0, 3)) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class95.method674((byte) 115, class124.method863((byte) 116, arg0, 2)) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class95.method674((byte) 115, class124.method863((byte) 126, arg0, 1)) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class95.method674((byte) 115, class124.method863((byte) 116, arg0, 0)) + arg1.substring(var3 + 2);
            }
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        ++field3959;
        this.field3939 = class184.method1262(true, this.field3936);
        this.method1626((byte) 32);
        if (arg0 != -125) {
            method1625((class103) null, (String) null, -93);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class246() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
    private final void method1626(byte arg0) {
        ++field3941;
        if (arg0 != 32) {
            method1625((class103) null, (String) null, 51);
        }
        Random var2 = new Random((long) this.field3936);
        this.field3951 = new short[512];
        if (this.field3960 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field3951[var3] = (short) class256.method1680(var2, (byte) -46, this.field3960);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
    public static final void method1627(int arg0) {
        ++field3946;
        class202.field3239.method1831(-121);
        if (arg0 <= 116) {
            method1623(126);
        }
    }
}
