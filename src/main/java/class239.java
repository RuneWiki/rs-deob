import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class239 extends class84 {

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    private int field3816 = 1024;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    private int field3811 = 3072;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    private int field3822 = 2048;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field3818 = -1;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "[Lv;")
    public static class152[] field3812 = new class152[2048];

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field3821 = null;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "[I")
    public static int[] field3823;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field3817;
        int[][] var3 = super.field1211.method193((byte) 45, arg0);
        if (arg1 != -18) {
            return null;
        } else {
            if (super.field1211.field321) {
                int[][] var4 = this.method611(0, (byte) -113, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class20.field221 > var11; ++var11) {
                    var8[var11] = (var5[var11] * this.field3822 >> 12) + this.field3816;
                    var9[var11] = (var6[var11] * this.field3822 >> 12) + this.field3816;
                    var10[var11] = (var7[var11] * this.field3822 >> 12) + this.field3816;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        ++field3813;
        this.field3822 = -this.field3816 + this.field3811;
        if (arg0) {
            this.field3822 = -74;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class239() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method1673(int arg0, int arg1, int arg2) {
        ++field3810;
        if (arg0 != -23253) {
            field3812 = null;
        }
        int var3 = -arg1 + arg2;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (~var3 > -1) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (~var3 < -4) {
            return "<col=80ff00>";
        } else {
            return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(JI)V")
    public static final void method1674(long arg0, int arg1) {
        ++field3820;
        if (arg1 != 2135) {
            method1676(89, (char) 65444);
        }
        class220.field3532.field2511 = 0;
        class220.field3532.method1074(21, arg1 + -2026);
        class220.field3532.method1069(arg0, -101);
        class213.field3409 = 0;
        class216.field3434 = 0;
        class64.field950 = -3;
        class179.field2890 = 1;
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)V")
    public static void method1675(int arg0) {
        field3823 = null;
        field3812 = null;
        field3821 = null;
        if (arg0 >= -84) {
            field3812 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IC)C")
    public static final char method1676(int arg0, char arg1) {
        ++field3809;
        if (arg1 != 181 && arg1 != 402) {
            return (char) (arg0 != 402 ? 65497 : Character.toTitleCase(arg1));
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public static final void method1677(byte arg0) {
        if (field3823 == null || class24.field282 == null) {
            field3823 = new int[256];
            class24.field282 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                field3823[var1] = (int) (Math.sin(var3) * 4096.0D);
                class24.field282[var1] = (int) (4096.0D * Math.cos(var3));
            }
        }
        ++field3819;
        int var2 = -10 % ((arg0 - -3) / 47);
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "(I)V")
    public static final void method1678(int arg0) {
        ++field3815;
        class229.field3685.method1556((byte) 126);
        if (arg0 > -76) {
            method1676(-32, (char) 65431);
        }
        class109.field1577.method1556((byte) 83);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V")
    public static final void method1679(int arg0, boolean arg1) {
        ++field3814;
        if (arg1) {
            field3812 = null;
        }
        class201 var2 = class94.method738(-118, arg0, 2);
        var2.method1475(-743577184);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field3825;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1217 = arg0.method1111(255) == 1;
                }
            } else {
                this.field3811 = arg0.method1126(false);
            }
        } else {
            this.field3816 = arg0.method1126(false);
        }
        if (arg1 <= 87) {
            field3823 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field3824;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int[] var4 = this.method612(0, arg1, false);
            for (int var5 = 0; ~class20.field221 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field3822 >> 12) + this.field3816;
            }
        }
        if (arg0 > -125) {
            field3818 = 19;
        }
        return var3;
    }
}
