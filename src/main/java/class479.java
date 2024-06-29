import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class479 extends class493 {

    @OriginalMember(owner = "client!iea", name = "x", descriptor = "Z")
    private boolean field6622 = false;

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "Z")
    private boolean field6618;

    @OriginalMember(owner = "client!iea", name = "v", descriptor = "[Ltd;")
    private class455[] field6620;

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "Lwr;")
    public static class459 field6613 = new class459(16);

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!iea", name = "y", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "(I)V")
    public static void method2688(int arg0) {
        int var1 = 45 % ((arg0 - 41) / 34);
        field6613 = null;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZI)V")
    public static final void method2689(int arg0, boolean arg1, int arg2) {
        int var3 = -109 % ((-57 - arg2) / 58);
        class361.method2073(true, class755.field10492.method4201(class723.field10095, (byte) 25), arg0, arg1);
        ++field6616;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Luv;)V")
    public class479(class367 arg0) {
        super(arg0);
        if (arg0.field5061) {
            this.field6618 = ~arg0.field5100 > -4;
            int var2 = !this.field6618 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (var14 == 1) {
                            var15 = var12;
                        } else if (~var14 == -3) {
                            var15 = var13;
                        } else if (~var14 == -4) {
                            var15 = -var13;
                        } else if (var14 == 4) {
                            var15 = var11;
                        } else {
                            var15 = -var11;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field6620 = new class455[3];
            this.field6620[0] = super.field6720.method1324(8, false, var4, 64);
            this.field6620[1] = super.field6720.method1324(8, false, var5, 64);
            this.field6620[2] = super.field6720.method1324(8, false, var3, 64);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method2690(boolean arg0, String arg1) {
        ++field6623;
        int var2 = 0;
        if (arg0) {
            return -79;
        } else {
            while (~class68.field744.length < ~var2) {
                if (class68.field744[var2].equalsIgnoreCase(arg1)) {
                    return var2;
                }
                ++var2;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(IZ)V")
    public final void method633(int arg0, boolean arg1) {
        if (arg0 != 69) {
            this.field6622 = true;
        }
        ++field6614;
        if (this.field6620 != null && arg1) {
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method1301(class686.field9624, (byte) 26);
            class648 var3 = super.field6720.method2119((byte) -92);
            var3.method40(1024);
            super.field6720.method2149(class555.field7829, (byte) 125);
            if (!this.field6618) {
                super.field6720.method2156(class199.field2365, class365.field4838, 22831);
                super.field6720.method2174(0, -60, class547.field7717);
                super.field6720.method2114((byte) 120, 2);
                super.field6720.method2156(class365.field4838, class669.field9307, 22831);
                super.field6720.method2174(0, arg0 + -183, class547.field7717);
                super.field6720.method1334(1, true, (byte) 27, class547.field7717, false);
                super.field6720.method2116(arg0 + -177, class293.field3928, 0);
                super.field6720.method2148(super.field6720.field5078, -114);
            } else {
                super.field6720.method2156(class365.field4838, class669.field9307, 22831);
                super.field6720.method1334(0, true, (byte) 27, class71.field769, false);
                super.field6720.method2116(-123, class293.field3928, 0);
            }
            super.field6720.method2114((byte) 120, 0);
            this.field6622 = true;
        } else {
            super.field6720.method2116(-74, class293.field3928, 0);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZ)V")
    public final void method632(int arg0, boolean arg1) {
        if (arg0 <= 93) {
            method2690(false, (String) null);
        }
        super.field6720.method2156(class365.field4838, class199.field2365, 22831);
        ++field6624;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IILbl;)V")
    public final void method629(int arg0, int arg1, class649 arg2) {
        ++field6612;
        super.field6720.method2148(arg2, 89);
        if (arg0 != 6) {
            method2688(49);
        }
        super.field6720.method2153(arg1, (byte) 36);
    }

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "(I)V")
    public final void method628(int arg0) {
        ++field6621;
        if (arg0 != -2) {
            this.field6622 = true;
        }
        if (this.field6622) {
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method2148((class649) null, arg0 ^ 124);
            super.field6720.method1301(class601.field8374, (byte) 26);
            super.field6720.method2135(2);
            if (!this.field6618) {
                super.field6720.method2156(class199.field2365, class199.field2365, 22831);
                super.field6720.method2174(0, -55, class71.field769);
                super.field6720.method2114((byte) 120, 2);
                super.field6720.method2156(class199.field2365, class199.field2365, 22831);
                super.field6720.method2174(0, -110, class71.field769);
                super.field6720.method2174(1, -56, class547.field7717);
                super.field6720.method2116(arg0 ^ 86, class71.field769, 0);
                super.field6720.method2148((class649) null, -120);
            } else {
                super.field6720.method2156(class199.field2365, class199.field2365, 22831);
                super.field6720.method2174(0, -114, class71.field769);
                super.field6720.method2116(-120, class71.field769, 0);
            }
            super.field6720.method2114((byte) 120, 0);
            this.field6622 = false;
        } else {
            super.field6720.method2116(arg0 + -83, class71.field769, 0);
        }
        super.field6720.method2156(class199.field2365, class199.field2365, arg0 + 22833);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)V")
    public final void method627(int arg0, int arg1, int arg2) {
        if (arg2 >= -75) {
            this.field6622 = false;
        }
        if (this.field6622) {
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method2148(this.field6620[arg0 + -1], -125);
            super.field6720.method2114((byte) 120, 0);
        }
        ++field6615;
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)Z")
    public final boolean method634(byte arg0) {
        ++field6617;
        if (arg0 != 27) {
            this.method627(56, 65, -40);
        }
        return true;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2691(int arg0, String arg1) {
        ++field6619;
        if (class723.field10093 != null) {
            if (arg0 >= -60) {
                field6613 = null;
            }
            ++class116.field1537;
            class103 var2 = class752.method4186(260, class501.field6825, class449.field6285);
            var2.field1379.method3393(class601.method3326(arg1, (byte) 98), -118);
            var2.field1379.method3387(arg1, (byte) 113);
            class27.method104(false, var2);
        }
    }
}
