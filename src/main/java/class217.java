import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class217 extends class265 {

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    private final int field3826;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    private final int field3821;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    private final int field3832;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field3827 = 0;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "[Lmh;")
    public static class128[] field3831 = new class128[8];

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field3833 = 0;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "Lmh;")
    public static class128 field3835 = class22.method156(126, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    private int field3819;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    private int field3824;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "[B")
    private byte[] field3834;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "[[B")
    public static byte[][] field3829;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "[[[B")
    public static byte[][][] field3818;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)Leg;", line = 5)
    public static final class289 method1494(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class289 var4 = var3.field2569;
            var3.field2569 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V", line = 17)
    public static void method1495(int arg0) {
        field3829 = (byte[][]) null;
        field3831 = null;
        if (arg0 < 104) {
            field3829 = (byte[][]) ((byte[][]) null);
        }
        field3818 = (byte[][][]) null;
        field3835 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V", line = 35)
    public void method628(int arg0, byte arg1) {
        this.field3834[arg0] = arg1;
        field3816++;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIFFF)V", line = 42)
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3826 = (int) (arg7 * 4096.0F);
        this.field3821 = (int) (arg6 * 4096.0F);
        this.field3828 = this.field3832 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLdj;)V", line = 56)
    public static final void method1496(byte arg0, class314 arg1) {
        class47.field950 = arg1;
        if (arg0 == -110) {
            field3815++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V", line = 71)
    public final void method1497(int arg0) {
        this.field3828 = this.field3832;
        this.field3824 >>= 0x4;
        field3817++;
        if (this.field3824 < 0) {
            this.field3824 = 0;
        } else if (this.field3824 > 255) {
            this.field3824 = 255;
        }
        this.method628(this.field3819++, (byte) this.field3824);
        if (arg0 != -3) {
            method1496((byte) 86, (class314) null);
        }
        this.field3824 = 0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BII)V", line = 108)
    public static final void method1498(byte arg0, int arg1, int arg2) {
        field3825++;
        if (arg0 != -29) {
            method1498((byte) 48, 16, -62);
        }
        if (arg2 == 4 && !class240.field4101) {
            arg1 = 2;
            arg2 = 2;
        }
        if (class234.field4032 != arg2) {
            if (class287.field4916) {
                return;
            }
            if (class234.field4032 != 0) {
                class79.field1441[class234.field4032].method502();
            }
            if (arg2 != 0) {
                class87 var3 = class79.field1441[arg2];
                var3.method501();
                var3.method503(arg1);
            }
            class234.field4032 = arg2;
            class11.field373 = arg1;
        } else if (arg2 != 0 && class11.field373 != arg1) {
            class79.field1441[arg2].method503(arg1);
            class11.field373 = arg1;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V", line = 154)
    public final void method1499(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1494(-37, 8, -14);
        }
        if (arg0 == 0) {
            this.field3820 = this.field3821 - (arg1 < 0 ? -arg1 : arg1);
            this.field3814 = 4096;
            this.field3820 = this.field3820 * this.field3820 >> 12;
            this.field3824 = this.field3820;
        } else {
            this.field3814 = this.field3826 * this.field3820 >> 12;
            this.field3820 = this.field3821 - (arg1 >= 0 ? arg1 : -arg1);
            if (this.field3814 < 0) {
                this.field3814 = 0;
            } else if (this.field3814 > 4096) {
                this.field3814 = 4096;
            }
            this.field3820 = this.field3820 * this.field3820 >> 12;
            this.field3820 = this.field3820 * this.field3814 >> 12;
            this.field3824 += this.field3828 * this.field3820 >> 12;
            this.field3828 = this.field3832 * this.field3828 >> 12;
        }
        field3823++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 190)
    public final void method1500(int arg0) {
        this.field3824 = 0;
        if (arg0 == -1007506868) {
            field3812++;
            this.field3819 = 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 218)
    public static final void method1501(byte arg0) {
        field3822++;
        if (class139.field2384 == null) {
            return;
        }
        if (class50.field978 < 10) {
            if (!class115.field1944.method2159(class139.field2384.field4130, (byte) -81)) {
                class50.field978 = class188.field3258.method2143(-44, class139.field2384.field4130) / 10;
                return;
            }
            class158.method1037(-32132);
            class50.field978 = 10;
        }
        if (class50.field978 == 10) {
            class39.field836 = class139.field2384.field4124 >> 6 << 6;
            class155.field2671 = (class139.field2384.field4128 >> 6 << 6) + 64 - class39.field836;
            class143.field2438 = 8.0F;
            class3.field64 = 8.0F;
            int var1 = class39.field836 + class155.field2671 - (class163.field2796.field418 >> 7) - class4.field72 - 1;
            class212.field3754 = class139.field2384.field4126 >> 6 << 6;
            int var2 = (class163.field2796.field478 >> 7) + class221.field3889 - class212.field3754;
            class5.field110 = (class139.field2384.field4131 >> 6 << 6) + 64 - class212.field3754;
            int var3 = var2 + (int) (Math.random() * 10.0D) - 5;
            int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
            if (var3 >= 0 && class5.field110 > var3 && var4 >= 0 && var4 < class155.field2671) {
                class143.field2441 = var3;
                class310.field5255 = var4;
            } else {
                class143.field2441 = class139.field2384.field4115 * 64 - class212.field3754;
                class310.field5255 = class155.field2671 - (class139.field2384.field4132 * 64 + -class39.field836) - 1;
            }
            class130.method874(-1);
            int var5 = class261.field4521 >> 2 << 10;
            class45.field909 = new int[class54.field1053 + 1];
            int var6 = class155.field2671 >> 6;
            int var7 = class156.field2684 >> 1;
            int var8 = class5.field110 >> 6;
            class20.field536 = new byte[var8][var6][];
            class107.field1825 = new int[var8][var6][];
            class173.field3047 = new int[var8][var6][];
            class36.field740 = new byte[var8][var6][];
            class273.field4739 = new byte[var8][var6][];
            field3818 = new byte[var8][var6][];
            class183.field3213 = new byte[var8][var6][];
            class206.field3626 = new short[var8][var6][];
            class315.method2175((byte) 65, var7, var5);
            class50.field978 = 20;
        } else if (class50.field978 == 20) {
            class245.method1667(new class194(class115.field1944.method2147(class208.field3703, (byte) 117, class139.field2384.field4130)), -104);
            class50.field978 = 30;
            class192.method1287((byte) -76, true);
            class265.method1855(32);
        } else if (class50.field978 == 30) {
            class145.method969((byte) 13, new class194(class115.field1944.method2147(class295.field5038, (byte) 101, class139.field2384.field4130)));
            class50.field978 = 40;
            class265.method1855(32);
        } else if (class50.field978 == 40) {
            class164.method1079(new class194(class115.field1944.method2147(class57.field1095, (byte) 96, class139.field2384.field4130)), 8);
            class50.field978 = 50;
            class265.method1855(32);
        } else {
            if (arg0 > -1) {
                method1501((byte) 109);
            }
            if (class50.field978 == 50) {
                class5.method29(new class194(class115.field1944.method2147(class65.field1265, (byte) 121, class139.field2384.field4130)), (byte) 86);
                class50.field978 = 60;
                class192.method1287((byte) -84, true);
                class265.method1855(32);
            } else if (class50.field978 == 60) {
                if (class115.field1944.method2150((byte) -105, class28.method177((byte) -96, new class128[] { class139.field2384.field4130, class223.field3914 }))) {
                    if (!class115.field1944.method2159(class28.method177((byte) -88, new class128[] { class139.field2384.field4130, class223.field3914 }), (byte) -81)) {
                        return;
                    }
                    class144.field2465 = class106.method655(class28.method177((byte) -56, new class128[] { class139.field2384.field4130, class223.field3914 }), 113, class115.field1944);
                } else {
                    class144.field2465 = new class54(0);
                }
                class50.field978 = 70;
                class265.method1855(32);
            } else if (class50.field978 == 70) {
                class222.field3902 = new class174(11, true, class203.field3589);
                class50.field978 = 73;
                class192.method1287((byte) 83, true);
                class265.method1855(32);
            } else if (class50.field978 == 73) {
                class27.field588 = new class174(12, true, class203.field3589);
                class50.field978 = 76;
                class192.method1287((byte) 61, true);
                class265.method1855(32);
            } else if (class50.field978 == 76) {
                class261.field4519 = new class174(14, true, class203.field3589);
                class50.field978 = 79;
                class192.method1287((byte) 74, true);
                class265.method1855(32);
            } else if (class50.field978 == 79) {
                class164.field2827 = new class174(17, true, class203.field3589);
                class50.field978 = 82;
                class192.method1287((byte) 89, true);
                class265.method1855(32);
            } else if (class50.field978 == 82) {
                class70.field1312 = new class174(19, true, class203.field3589);
                class50.field978 = 85;
                class192.method1287((byte) 76, true);
                class265.method1855(32);
            } else if (class50.field978 == 85) {
                class115.field1940 = new class174(22, true, class203.field3589);
                class50.field978 = 88;
                class192.method1287((byte) 51, true);
                class265.method1855(32);
            } else if (class50.field978 == 88) {
                class225.field3928 = new class174(26, true, class203.field3589);
                class50.field978 = 91;
                class192.method1287((byte) 98, true);
                class265.method1855(32);
            } else {
                class171.field2994 = new class174(30, true, class203.field3589);
                class50.field978 = 100;
                class192.method1287((byte) -111, true);
                class265.method1855(32);
                class102.field1756 = -1;
                class30.field663 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBIZI)V", line = 426)
    public static final void method1502(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field3811++;
        class245.field4181 = 0L;
        boolean var5 = false;
        int var6 = class166.method1089(2);
        if (arg1 < 6) {
            method1495(16);
        }
        if (arg0 <= 0 == var6 > 0) {
            var5 = true;
        }
        if (arg0 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (class270.field4678.startsWith("mac") && arg0 > 0) {
            arg3 = true;
        }
        if (arg3 && arg0 > 0) {
            var5 = true;
        }
        class97.method609(75, arg2, arg3, arg0, arg4, var5, var6);
    }
}
