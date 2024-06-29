import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class231 extends class529 {

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "[[I")
    public int[][] field3824;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "[I")
    public int[] field3826;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "[I")
    public int[] field3820;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "[Z")
    public boolean[] field3818;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field3821 = -2;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "[I")
    public static int[] field3819 = new int[1];

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "Lof;")
    public static class328 field3825 = new class328(200);

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZIIIBI)V")
    public static final void method1649(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3816++;
        if (class217.field3699 == null) {
            class19.field198.method3042(arg5, (byte) -110, arg2, -16777216, arg1, arg3);
        } else if (class358.field5565.field6417 >= 0 && class358.field5565.field6417 < (class135.field1839 * 128) && class358.field5565.field6410 >= 0 && class358.field5565.field6410 < class197.field3038 * 128) {
            class479.field7323++;
            if (class358.field5565 != null && (class358.field5565.field6417 + 64 - class358.field5565.method415(-4) * 64 >> 7) == class454.field7026 && (class358.field5565.field6410 - (class358.field5565.method415(-4) - 1) * 64 >> 7) == class535.field7842) {
                class535.field7842 = -1;
                class454.field7026 = -1;
                class304.method2051((byte) 110);
            }
            class350.method2307((byte) -110);
            if (!arg0) {
                class147.method893((byte) -93);
            }
            class219.method1604((byte) 122);
            class329.method2206(arg5, (byte) 98, true, arg2, arg3, arg1);
            int var6 = class235.field3863;
            int var7 = class314.field4917;
            int var8 = class15.field163;
            int var9 = class21.field247;
            if (class334.field5222 == 1) {
                int var10 = (int) class135.field1824;
                if (var10 < (class204.field3124 >> 8)) {
                    var10 = class204.field3124 >> 8;
                }
                if (class51.field689[4] && (class453.field7023[4] + 128) > var10) {
                    var10 = class453.field7023[4] + 128;
                }
                int var11 = (int) class388.field5918 + class33.field339 & 0x3FFF;
                class295.method1977(class532.method3165(class201.field3057, class358.field5565.field6417, false, class358.field5565.field6410) - 50, class254.field4115, 25034, class290.field4578, ((var10 >> 3) * 3) + 600 << 0, var10, var6, var11);
            } else if (class334.field5222 == 4) {
                int var12 = (int) class135.field1824;
                if ((class204.field3124 >> 8) > var12) {
                    var12 = class204.field3124 >> 8;
                }
                if (class51.field689[4] && class453.field7023[4] + 128 > var12) {
                    var12 = class453.field7023[4] + 128;
                }
                int var13 = (int) class388.field5918 & 0x3FFF;
                class295.method1977(class532.method3165(class201.field3057, class433.field6538, false, class5.field61) - 50, class254.field4115, 25034, class290.field4578, (var12 >> 3) * 3 + 600 << 0, var12, var6, var13);
            } else if (class334.field5222 == 5) {
                class42.method266(-126, var6);
            }
            int var14 = class163.field2367;
            int var15 = class371.field5703;
            if (arg4 > -84) {
                method1649(true, 90, -76, 121, (byte) 6, -27);
            }
            int var16 = class98.field1404;
            int var17 = class220.field3723;
            int var18 = class387.field5912;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class51.field689[var19]) {
                    int var22 = (int) ((double) (class216.field3676[var19] * 2 + 1) * Math.random() + Math.sin((double) class188.field2736[var19] / 100.0D * (double) class19.field202[var19]) * (double) class453.field7023[var19] - (double) class216.field3676[var19]);
                    if (var19 == 2) {
                        class98.field1404 += var22;
                    }
                    if (var19 == 4) {
                        class220.field3723 += var22;
                        if (class220.field3723 < 1024) {
                            class220.field3723 = 1024;
                        } else if (class220.field3723 > 3072) {
                            class220.field3723 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class163.field2367 += var22;
                    }
                    if (var19 == 3) {
                        class387.field5912 = class387.field5912 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class371.field5703 += var22;
                    }
                }
            }
            if (class163.field2367 < 0) {
                class163.field2367 = 0;
            }
            if (class98.field1404 < 0) {
                class98.field1404 = 0;
            }
            if (class163.field2367 > ((class252.field4075 << 7) - 1)) {
                class163.field2367 = (class252.field4075 << 7) - 1;
            }
            if (class98.field1404 > (class131.field1773 << 7) - 1) {
                class98.field1404 = (class131.field1773 << 7) - 1;
            }
            class406.method2605((byte) -124);
            class131.method816(17797);
            class19.field198.method1307(var8, var9, var8 + var7, var6 + var9);
            class19.field198.method1316();
            int var20 = class428.field6486;
            if (class302.field4737 == null) {
                class19.field198.method1317(var20);
            } else {
                class302.field4737.method1385(class220.field3723, class387.field5912, var6, var7, -1, var20, class386.field5898 << 3, var9, class19.field198, var8);
            }
            class500.method3052(0);
            class520.field7712.method165(class163.field2367, class371.field5703, class98.field1404, -class220.field3723 & 0x3FFF, -class387.field5912 & 0x3FFF, -class253.field4106 & 0x3FFF);
            class19.field198.method1314(class520.field7712);
            class19.field198.method1277(var7 / 2 + var8, var9 - -(var6 / 2), class116.field1611 << 1, class116.field1611 << 1);
            class339.method2247(class116.field1611 << 1, (byte) -110, class116.field1611 << 1, var9 + (var6 / 2), var8 - -(var7 / 2));
            class421.method2688(class163.field2367, (byte) -24, -class253.field4106 & 0x3FFF, -class220.field3723 & 0x3FFF, -class387.field5912 & 0x3FFF, class371.field5703, class98.field1404);
            byte var21 = class141.field1911.method1636(308, class452.field7013) == 2 ? (byte) class479.field7323 : 1;
            class135.method830(class19.field198, class88.field1278, class190.field2765, class520.field7712, class163.field2367, class371.field5703, class98.field1404, class240.field3908, class279.field4424, class180.field2623, class421.field6390, class160.field2187, class16.field170, class358.field5565.field6419 + 1, var21, class358.field5565.field6417 >> 7, class358.field5565.field6410 >> 7, !class141.field1911.field6087);
            class500.method3052(0);
            if (class148.field1994 == 9) {
                class297.method1993(var8, var9, var7, var6, 256, 256, false);
                class239.method1675(var6, var7, var8, 16776960, var9, 256, 256);
                class289.method1951(var9, 127, var8, 256, var6, 256, var7);
                class280.method1885(var7, var6, (byte) 6, var9, var8);
            }
            class129.method802();
            class163.field2367 = var14;
            class371.field5703 = var15;
            class387.field5912 = var18;
            class98.field1404 = var16;
            class220.field3723 = var17;
            if (class359.field5570 && class104.field1525.method1400((byte) 124) == 0) {
                class359.field5570 = false;
            }
            if (class359.field5570) {
                class19.field198.method3042(var6, (byte) -103, var9, -16777216, var8, var7);
                class57.method439(false, class382.field5862.method1583(84, class12.field131), (byte) -60, class128.field1741);
            }
        } else {
            class19.field198.method3042(arg5, (byte) -119, arg2, -16777216, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public static void method1650(int arg0) {
        field3825 = null;
        field3819 = null;
        if (arg0 != 9) {
            field3821 = 50;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I[B)V")
    public class231(int arg0, byte[] arg1) {
        this.field3823 = arg0;
        class208 var3 = new class208(arg1);
        this.field3827 = var3.method1445(58);
        this.field3824 = new int[this.field3827][];
        this.field3826 = new int[this.field3827];
        this.field3820 = new int[this.field3827];
        this.field3818 = new boolean[this.field3827];
        for (int var4 = 0; var4 < this.field3827; var4++) {
            this.field3820[var4] = var3.method1445(-123);
        }
        for (int var5 = 0; var5 < this.field3827; var5++) {
            this.field3818[var5] = var3.method1445(-88) == 1;
        }
        for (int var6 = 0; var6 < this.field3827; var6++) {
            this.field3826[var6] = var3.method1455(-3387);
        }
        for (int var7 = 0; var7 < this.field3827; var7++) {
            this.field3824[var7] = new int[var3.method1445(118)];
        }
        for (int var8 = 0; var8 < this.field3827; var8++) {
            for (int var9 = 0; var9 < this.field3824[var8].length; var9++) {
                this.field3824[var8][var9] = var3.method1445(77);
            }
        }
    }
}
