import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class51 {

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Ljo;")
    private class98 field798 = new class98();

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    private int field789;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Ltm;")
    private class79 field807;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field796 = 255;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "D")
    public static double field791 = -1.0D;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Llg;")
    public static class137 field800 = null;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Ljava/lang/String;")
    public static String field794 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field809 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "Lcg;")
    public static class49 field803;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "[I")
    public static int[] field806;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 8)
    public static final void method464(int arg0) {
        field790++;
        if (class38.field552 == null) {
            return;
        }
        if (class114.field1915 < 10) {
            if (!class122.field2120.method460(class38.field552.field5174, 75)) {
                class114.field1915 = class166.field2895.method433(class38.field552.field5174, 0) / 10;
                return;
            }
            class107.method938(99);
            class114.field1915 = 10;
        }
        if (class114.field1915 == 10) {
            class259.field4201 = class38.field552.field5179 >> 6 << 6;
            int var1 = -1;
            class341.field5444 = class38.field552.field5170 >> 6 << 6;
            class304.field4825 = (class38.field552.field5180 >> 6 << 6) - (class259.field4201 - 64);
            int var2 = -1;
            class113.field1893 = (class38.field552.field5167 >> 6 << 6) + 64 - class341.field5444;
            int[] var3 = class38.field552.method2253((class218.field3632.field1985 >> 7) + class34.field484, (class218.field3632.field2036 >> 7) + class24.field345, class205.field3497, 111);
            if (var3 != null) {
                var2 = class259.field4201 + class304.field4825 - var3[2] - 1;
                var1 = var3[1] - class341.field5444;
            }
            if (var1 >= 0 && class113.field1893 > var1 && var2 >= 0 && var2 < class304.field4825) {
                int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
                class318.field5042 = var4;
                int var5 = var1 + ((int) (Math.random() * 10.0D) - 5);
                class95.field1483 = var5;
            } else if (class146.field2642 == -1 || class25.field347 == -1) {
                int[] var7 = class38.field552.method2260((class38.field552.field5172 & 0xFFFE369) >> 14, class38.field552.field5172 & 0x3FFF, true);
                class95.field1483 = var7[1] - class341.field5444;
                class318.field5042 = class259.field4201 + class304.field4825 - var7[2] - 1;
            } else {
                int[] var6 = class38.field552.method2260(class146.field2642, class25.field347, true);
                if (var6 != null) {
                    class95.field1483 = var6[1] - class341.field5444;
                    class318.field5042 = class304.field4825 + class259.field4201 - var6[2] - 1;
                }
                class25.field347 = -1;
                class146.field2642 = -1;
            }
            if (class38.field552.field5185 == 37) {
                class185.field3143 = 3.0F;
                class305.field4839 = 3.0F;
            } else if (class38.field552.field5185 == 50) {
                class185.field3143 = 4.0F;
                class305.field4839 = 4.0F;
            } else if (class38.field552.field5185 == 75) {
                class185.field3143 = 6.0F;
                class305.field4839 = 6.0F;
            } else if (class38.field552.field5185 == 100) {
                class185.field3143 = 8.0F;
                class305.field4839 = 8.0F;
            } else if (class38.field552.field5185 == 200) {
                class185.field3143 = 16.0F;
                class305.field4839 = 16.0F;
            } else {
                class185.field3143 = 8.0F;
                class305.field4839 = 8.0F;
            }
            class218.method1605(0);
            class282.field4470 = new int[class184.field3118 + 1];
            int var8 = class113.field1893 >> 6;
            int var9 = class304.field4825 >> 6;
            class159.field2812 = new int[var8][var9][];
            class37.field535 = new int[var8][var9][];
            class336.field5368 = new byte[var8][var9][];
            class290.field4636 = new int[var8][var9][];
            class122.field2116 = new byte[var8][var9][];
            class66.field1064 = new byte[var8][var9][];
            class40.field602 = new byte[var8][var9][];
            int var10 = class329.field5245 >> 2 << 10;
            class90.field1425 = new byte[var8][var9][];
            int var11 = class102.field1638 >> 1;
            class1.method1(-1, var11, var10);
            class114.field1915 = 20;
        } else if (class114.field1915 == 20) {
            class66.method640(2, new class336(class122.field2120.method457("underlay", 0, class38.field552.field5174)));
            class114.field1915 = 30;
            class324.method2246(true, (byte) -39);
            class116.method986(arg0 ^ 0x4F6);
        } else if (class114.field1915 == 30) {
            class258.method1792(new class336(class122.field2120.method457("overlay", 0, class38.field552.field5174)), false);
            class114.field1915 = 40;
            class116.method986(0);
        } else if (class114.field1915 == 40) {
            class68.method656(arg0 + 2826, new class336(class122.field2120.method457("overlay2", arg0 + -1270, class38.field552.field5174)));
            class114.field1915 = 50;
            class116.method986(0);
        } else if (class114.field1915 == 50) {
            class253.method1764(new class336(class122.field2120.method457("loc", arg0 ^ 0x4F6, class38.field552.field5174)), -22814);
            class114.field1915 = 60;
            class324.method2246(true, (byte) -39);
            class116.method986(arg0 - 1270);
        } else {
            if (arg0 != 1270) {
                field791 = 1.0678650728394743D;
            }
            if (class114.field1915 == 60) {
                if (class122.field2120.method446(class38.field552.field5174 + "_labels", 0)) {
                    if (!class122.field2120.method460(class38.field552.field5174 + "_labels", 118)) {
                        return;
                    }
                    class222.field3708 = class40.method339(1, class122.field2120, class38.field552.field5174 + "_labels");
                } else {
                    class222.field3708 = new class304(0);
                }
                class114.field1915 = 70;
                class116.method986(0);
            } else if (class114.field1915 == 70) {
                class91.field1438 = new class61(11, true, class42.field616);
                class114.field1915 = 73;
                class324.method2246(true, (byte) -39);
                class116.method986(0);
            } else if (class114.field1915 == 73) {
                class84.field1358 = new class61(12, true, class42.field616);
                class114.field1915 = 76;
                class324.method2246(true, (byte) -39);
                class116.method986(0);
            } else if (class114.field1915 == 76) {
                class168.field2931 = new class61(14, true, class42.field616);
                class114.field1915 = 79;
                class324.method2246(true, (byte) -39);
                class116.method986(0);
            } else if (class114.field1915 == 79) {
                class195.field3306 = new class61(17, true, class42.field616);
                class114.field1915 = 82;
                class324.method2246(true, (byte) -39);
                class116.method986(arg0 - 1270);
            } else if (class114.field1915 == 82) {
                class246.field3991 = new class61(19, true, class42.field616);
                class114.field1915 = 85;
                class324.method2246(true, (byte) -39);
                class116.method986(0);
            } else if (class114.field1915 == 85) {
                class105.field1756 = new class61(22, true, class42.field616);
                class114.field1915 = 88;
                class324.method2246(true, (byte) -39);
                class116.method986(0);
            } else if (class114.field1915 == 88) {
                class282.field4466 = new class61(26, true, class42.field616);
                class114.field1915 = 91;
                class324.method2246(true, (byte) -39);
                class116.method986(0);
            } else {
                class287.field4581 = new class61(30, true, class42.field616);
                class114.field1915 = 100;
                class324.method2246(true, (byte) -39);
                class116.method986(0);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Object;JB)V", line = 260)
    public final void method465(Object arg0, long arg1, byte arg2) {
        this.method473(26, arg1);
        field801++;
        if (this.field789 == 0) {
            class113 var5 = (class113) this.field798.method852(14278);
            var5.method2195(-1);
            var5.method1067(40000);
        } else {
            this.field789--;
        }
        class191 var6 = new class191(arg0);
        this.field807.method725(arg1, var6, 1);
        this.field798.method851(var6, (byte) -44);
        var6.field2214 = 0L;
        if (arg2 < 27) {
            field809 = 76;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 292)
    public final void method466(int arg0) {
        for (class113 var2 = (class113) this.field798.method849(128); var2 != null; var2 = (class113) this.field798.method850(-5714)) {
            if (var2.method691(-9)) {
                var2.method2195(-1);
                var2.method1067(40000);
                this.field789++;
            }
        }
        if (arg0 != -1) {
            this.field793 = 59;
        }
        field805++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZJ)Ljava/lang/Object;", line = 325)
    public final Object method467(boolean arg0, long arg1) {
        if (!arg0) {
            this.method466(21);
        }
        field792++;
        class113 var4 = (class113) this.field807.method732(arg1, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method690(103);
        if (var5 == null) {
            var4.method2195(-1);
            var4.method1067(40000);
            this.field789++;
            return null;
        }
        if (var4.method691(-9)) {
            class191 var6 = new class191(var5);
            this.field807.method725(var4.field5062, var6, 1);
            this.field798.method851(var6, (byte) -44);
            var6.field2214 = 0L;
            var4.method2195(-1);
            var4.method1067(40000);
        } else {
            this.field798.method851(var4, (byte) -44);
            var4.field2214 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)I", line = 373)
    public final int method468(int arg0) {
        field802++;
        int var2 = arg0;
        for (class113 var3 = (class113) this.field798.method849(128); var3 != null; var3 = (class113) this.field798.method850(-5714)) {
            if (!var3.method691(arg0 ^ 0xFFFFFFF7)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V", line = 395)
    public final void method469(int arg0, int arg1) {
        if (arg0 != -11815) {
            this.method468(-19);
        }
        if (class122.field2119 != null) {
            for (class113 var3 = (class113) this.field798.method849(128); var3 != null; var3 = (class113) this.field798.method850(-5714)) {
                if (var3.method691(arg0 ^ 0x2E2E)) {
                    if (var3.method690(94) == null) {
                        var3.method2195(-1);
                        var3.method1067(40000);
                        this.field789++;
                    }
                } else if (++var3.field2214 > (long) arg1) {
                    class113 var4 = class122.field2119.method1089(var3, true);
                    this.field807.method725(var3.field5062, var4, 1);
                    class354.method2463(arg0 + 11932, var4, var3);
                    var3.method2195(-1);
                    var3.method1067(40000);
                }
            }
        }
        field799++;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V", line = 447)
    public final void method470(int arg0) {
        this.field798.method845(-3128);
        if (arg0 == 12) {
            field804++;
            this.field807.method734(1);
            this.field789 = this.field793;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)I", line = 462)
    public static final int method471(int arg0, int arg1) {
        field797++;
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        if (arg0 <= 40) {
            field809 = 123;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V", line = 481)
    public static void method472(int arg0) {
        field806 = null;
        if (arg0 >= 27) {
            field803 = null;
            field800 = null;
            field794 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IJ)V", line = 497)
    public final void method473(int arg0, long arg1) {
        if (arg0 != 26) {
            field796 = 16;
        }
        field787++;
        class113 var4 = (class113) this.field807.method732(arg1, true);
        if (var4 != null) {
            var4.method2195(-1);
            var4.method1067(40000);
            this.field789++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V", line = 524)
    public class51(int arg0) {
        this.field789 = arg0;
        int var2 = 1;
        this.field793 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field807 = new class79(var2);
    }
}
