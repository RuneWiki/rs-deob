import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class329 extends class59 {

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "I")
    private int field5615 = -1;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "Lph;")
    public static class229 field5598 = class266.method1858("::fpson", 0);

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "Lph;")
    public static class229 field5609 = class266.method1858("k", 0);

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "Lph;")
    private static class229 field5610 = class266.method1858("M", 0);

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "Lph;")
    public static class229 field5604 = field5610;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "Lph;")
    public static class229 field5613 = field5610;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "Lph;")
    public static class229 field5616 = class266.method1858(")4p=", 0);

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public int field5602;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public int field5605;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "[I")
    public int[] field5611;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIII)V", line = 5)
    public static final void method2253(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            method2258((byte) -34);
        }
        for (int var5 = 0; var5 < class15.field186; var5++) {
            if ((class311.field5222[var5] + class113.field1921[var5]) > arg3 && arg3 + arg0 > class311.field5222[var5] && class45.field691[var5] + class300.field4875[var5] > arg4 && arg4 + arg2 > class300.field4875[var5]) {
                class187.field3036[var5] = true;
            }
        }
        field5601++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILhb;)V", line = 33)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field5615 = arg2.method1161(true);
        }
        field5606++;
        if (arg0 != 115) {
            this.method390(30);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Z", line = 49)
    public final boolean method2254(byte arg0) {
        field5614++;
        if (arg0 <= 94) {
            return true;
        } else if (this.field5611 != null) {
            return true;
        } else if (this.field5615 < 0) {
            return false;
        } else {
            class327 var2 = class110.field1858 >= 0 ? class191.method1342(this.field5615, class225.field3706, (byte) -68, class110.field1858) : class268.method1862(class225.field3706, this.field5615, -33);
            var2.method2248();
            this.field5605 = var2.field4786;
            this.field5602 = var2.field4785;
            this.field5611 = var2.field5579;
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)I", line = 78)
    public final int method390(int arg0) {
        if (arg0 > -62) {
            this.field5615 = 55;
        }
        field5600++;
        return this.field5615;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V", line = 89)
    public static void method2255(byte arg0) {
        field5610 = null;
        field5613 = null;
        field5609 = null;
        field5616 = null;
        field5604 = null;
        int var1 = -122 % ((9 - arg0) / 55);
        field5598 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIZ)V", line = 116)
    public static final void method2256(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5607++;
        if (arg4) {
            method2258((byte) -3);
        }
        if (arg3 < arg2) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class202.field3337[var5][arg1] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class202.field3337[var6][arg1] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V", line = 157)
    public final void method398(int arg0) {
        field5608++;
        super.method398(arg0);
        this.field5611 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)I", line = 169)
    public static final int method2257(int arg0, int arg1) {
        field5612++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xDB) >> 6;
        if (arg0 != 4197) {
            method2255((byte) 28);
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 228)
    public class329() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[[I", line = 232)
    public int[][] method116(int arg0, int arg1) {
        if (arg1 != 4588) {
            this.field5611 = (int[]) null;
        }
        field5603++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334 && this.method2254((byte) 126)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field5602 * (class241.field3993 == this.field5605 ? arg0 : this.field5605 * arg0 / class241.field3993);
            if (class293.field4789 == this.field5602) {
                for (int var11 = 0; var11 < class293.field4789; var11++) {
                    int var12 = this.field5611[var7++];
                    var6[var11] = class243.method1696(255, var12) << 4;
                    var5[var11] = class243.method1696(65280, var12) >> 4;
                    var4[var11] = class243.method1696(var12, 16711680) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class293.field4789; var8++) {
                    int var9 = this.field5602 * var8 / class293.field4789;
                    int var10 = this.field5611[var7 + var9];
                    var6[var8] = class243.method1696(var10 << 4, 4080);
                    var5[var8] = class243.method1696(var10, 65280) >> 4;
                    var4[var8] = class243.method1696(4080, var10 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)Lka;", line = 301)
    public static final class293 method2258(byte arg0) {
        field5599++;
        int var1 = class36.field597[0] * class288.field4729[0];
        byte[] var2 = class279.field4623[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        int var5 = 38 / ((arg0 - 47) / 43);
        while (var4 < var1) {
            var3[var4] = class314.field5346[class243.method1696(var2[var4], 255)];
            var4++;
        }
        class293 var6;
        if (class99.field1675) {
            var6 = new class87(class266.field4486, class48.field713, class303.field5064[0], class27.field387[0], class36.field597[0], class288.field4729[0], var3);
        } else {
            var6 = new class327(class266.field4486, class48.field713, class303.field5064[0], class27.field387[0], class36.field597[0], class288.field4729[0], var3);
        }
        class214.method1517(-25672);
        return var6;
    }
}
