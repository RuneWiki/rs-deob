import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class554 {

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "B")
    private byte field7884;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public int field7891;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public int field7894;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public int field7882;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public int field7893;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public int field7888;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
    public static int[] field7892 = new int[1];

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
    public static int field7895 = 0;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "J")
    public static long field7883;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3222(byte arg0) {
        class648.method3703(false, (byte) -60);
        field7885++;
        class358.field5207 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class405.field5709.length; var2++) {
            if (class146.field1866[var2] != -1 && class405.field5709[var2] == null) {
                class405.field5709[var2] = class277.field3850.method3150(0, 63, class146.field1866[var2]);
                if (class405.field5709[var2] == null) {
                    class358.field5207++;
                    var1 = false;
                }
            }
            if (class141.field1823[var2] != -1 && class9.field171[var2] == null) {
                class9.field171[var2] = class277.field3850.method3142(class713.field10063[var2], -2, 0, class141.field1823[var2]);
                if (class9.field171[var2] == null) {
                    var1 = false;
                    class358.field5207++;
                }
            }
            if (class379.field5438[var2] != -1 && class205.field3018[var2] == null) {
                class205.field3018[var2] = class277.field3850.method3150(0, 89, class379.field5438[var2]);
                if (class205.field3018[var2] == null) {
                    var1 = false;
                    class358.field5207++;
                }
            }
            if (class347.field5088[var2] != -1 && class550.field7793[var2] == null) {
                class550.field7793[var2] = class277.field3850.method3150(0, 114, class347.field5088[var2]);
                if (class550.field7793[var2] == null) {
                    class358.field5207++;
                    var1 = false;
                }
            }
            if (class145.field1853 != null && class467.field6632[var2] == null && class145.field1853[var2] != -1) {
                class467.field6632[var2] = class277.field3850.method3142(class713.field10063[var2], -2, 0, class145.field1853[var2]);
                if (class467.field6632[var2] == null) {
                    class358.field5207++;
                    var1 = false;
                }
            }
        }
        if (class663.field9307 == null) {
            if (class273.field3814 == null || !class621.field8752.method3133(class273.field3814.field8665 + "_staticelements", true)) {
                class663.field9307 = new class242(0);
            } else if (class621.field8752.method3156((byte) -90, class273.field3814.field8665 + "_staticelements")) {
                class663.field9307 = class655.method3756(class100.field1266, false, class273.field3814.field8665 + "_staticelements", class621.field8752);
            } else {
                class358.field5207++;
                var1 = false;
            }
        }
        if (!var1) {
            class671.field9407 = 1;
            return;
        }
        boolean var3 = true;
        class696.field9826 = 0;
        for (int var4 = 0; var4 < class405.field5709.length; var4++) {
            byte[] var21 = class9.field171[var4];
            if (var21 != null) {
                int var22 = (class96.field1236[var4] >> 8) * 64 - class103.field1295;
                int var23 = (class96.field1236[var4] & 0xFF) * 64 - class175.field2496;
                if (class64.field867 != 0) {
                    var23 = 10;
                    var22 = 10;
                }
                var3 &= class705.method3996(1, var22, var23, var21, class760.field10479, class109.field1314);
            }
            byte[] var24 = class550.field7793[var4];
            if (var24 != null) {
                int var25 = (class96.field1236[var4] >> 8) * 64 - class103.field1295;
                int var26 = (class96.field1236[var4] & 0xFF) * 64 - class175.field2496;
                if (class64.field867 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class705.method3996(1, var25, var26, var24, class760.field10479, class109.field1314);
            }
        }
        if (!var3) {
            class671.field9407 = 2;
            return;
        }
        if (class671.field9407 != 0) {
            class54.method348(class157.field2343, false, class564.field8008, class638.field8979, true, class674.field9563.method3825((byte) -10, class526.field7494) + "<br>(100%)");
        }
        class84.method611(110);
        class497.method2902((byte) 57);
        class49.method325(-3959);
        boolean var5 = false;
        if (class638.field8979.method426() && class145.field1852.field9011.method2495((byte) -107) == 2) {
            for (int var6 = 0; var6 < class405.field5709.length; var6++) {
                if (class550.field7793[var6] != null || class205.field3018[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class145.field1852.field8996.method1488((byte) -122) == 1) {
            var7 = class664.field9311[class458.field6562];
        } else {
            var7 = class566.field8015[class458.field6562];
        }
        if (class638.field8979.method475()) {
            var7++;
        }
        class664.method3782(class638.field8979, class430.field6131, 9, 4, class109.field1314, class760.field10479, var7, var5, class638.field8979.method471() > 0);
        class494.method2888(class190.field2840);
        if (class190.field2840 == 0) {
            class201.method1450(null);
        } else {
            class201.method1450(class79.field1047);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class234.field3394[var8].method2651(false);
        }
        class522.method3038((byte) 0);
        class256.method1687((byte) 60, false);
        class140.method974(78);
        class118.field1475 = false;
        class656.field9247 = null;
        class84.method611(116);
        System.gc();
        class648.method3703(true, (byte) -47);
        class132.method946((byte) 111);
        class489.field6915 = class145.field1852.field9017.method3212((byte) -86);
        class217.field3115 = class511.field7306 >= 96;
        class644.field9061 = class145.field1852.field9011.method2495((byte) -76) == 2;
        class661.field9288 = class145.field1852.field8986.method968((byte) -56) == 1;
        class332.field4960 = class145.field1852.field9018.method2757((byte) -74) == 1 ? -1 : class573.field8111;
        class599.field8440 = class145.field1852.field9030.method661((byte) -58) == 1;
        class124.field1614 = class145.field1852.field9031.method2235((byte) -64) == 1;
        class663.field9301 = new class487(4, class109.field1314, class760.field10479, false);
        if (class64.field867 == 0) {
            class395.method2409(class405.field5709, class663.field9301, -1);
        } else {
            class278.method1806(class663.field9301, 121, class405.field5709);
        }
        class277.method1796(class109.field1314 >> 4, class760.field10479 >> 4, (byte) 114);
        class498.method2906(false);
        if (var5) {
            class96.method680(true);
            class321.field4741 = new class487(1, class109.field1314, class760.field10479, true);
            if (class64.field867 == 0) {
                class395.method2409(class205.field3018, class321.field4741, -1);
                class648.method3703(true, (byte) -122);
            } else {
                class278.method1806(class321.field4741, 107, class205.field3018);
                class648.method3703(true, (byte) -79);
            }
            class321.field4741.method2447(0, (byte) -99, class663.field9301.field5717[0]);
            class321.field4741.method2446(null, class638.field8979, null, (byte) -83);
            class96.method680(false);
        }
        class663.field9301.method2446(class234.field3394, class638.field8979, var5 ? class321.field4741.field5717 : null, (byte) -115);
        if (class64.field867 == 0) {
            class648.method3703(true, (byte) -62);
            class522.method3043(class663.field9301, class9.field171, -22802);
            if (class467.field6632 != null) {
                class444.method2674(-8670);
            }
        } else {
            class648.method3703(true, (byte) -61);
            class187.method1384(class663.field9301, 126, class9.field171);
        }
        class497.method2902((byte) 68);
        if (class511.field7306 < 96) {
            class791.method4324((byte) 98);
        }
        class648.method3703(true, (byte) -112);
        class663.field9301.method2453(null, var5 ? class311.field4628[0] : null, class638.field8979, 117);
        class663.field9301.method2843(false, class638.field8979, -95);
        class648.method3703(true, (byte) -78);
        if (var5) {
            class96.method680(true);
            class648.method3703(true, (byte) -125);
            if (class64.field867 == 0) {
                class522.method3043(class321.field4741, class550.field7793, -22802);
            } else {
                class187.method1384(class321.field4741, 126, class550.field7793);
            }
            class497.method2902((byte) 100);
            class648.method3703(true, (byte) -81);
            class321.field4741.method2453(class750.field10395[0], null, class638.field8979, 125);
            class321.field4741.method2843(true, class638.field8979, -111);
            class648.method3703(true, (byte) -61);
            class96.method680(false);
        }
        class331.method2143((byte) 46);
        int var9 = class663.field9301.field6892;
        if (class410.field5771 < var9) {
            var9 = class410.field5771;
        }
        if (class410.field5771 - 1 > var9) {
            var9 = class410.field5771 - 1;
        }
        if (class145.field1852.field9018.method2757((byte) -122) == 0) {
            class194.method1411(var9);
        } else {
            class194.method1411(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class109.field1314; var19++) {
                for (int var20 = 0; var20 < class760.field10479; var20++) {
                    class48.method312(var19, var20, true, var10);
                }
            }
        }
        class631.method3607(512);
        class84.method611(0);
        class79.method600(-100);
        class497.method2902((byte) 70);
        class713.method4037((byte) 110);
        if (class463.field6617 != null && class76.field1025 != null && class757.field10456 == 11) {
            class75.field1006++;
            class731 var11 = class155.method1222(260, class636.field8948, class237.field3417);
            var11.field10211.method879((byte) -46, 1057001181);
            class533.method3088(var11, 0);
        }
        if (class64.field867 == 0) {
            int var12 = (class388.field5531 - (class109.field1314 >> 4)) / 8;
            int var13 = (class388.field5531 + (class109.field1314 >> 4)) / 8;
            int var14 = (class481.field6839 - (class760.field10479 >> 4)) / 8;
            int var15 = ((class760.field10479 >> 4) + class481.field6839) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var17 < var14 || var17 > var15) {
                        class277.field3850.method3138((byte) 3, "m" + var16 + "_" + var17);
                        class277.field3850.method3138((byte) 3, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class757.field10456 == 4) {
            class374.method2323(3, (byte) -125);
        } else if (class757.field10456 == 8) {
            class374.method2323(7, (byte) 76);
        } else {
            class374.method2323(10, (byte) -128);
            if (class76.field1025 != null) {
                class731 var18 = class155.method1222(260, class388.field5526, class237.field3417);
                class533.method3088(var18, 0);
            }
        }
        class651.method3724((byte) -89);
        class84.method611(-52);
        class489.method2859(13102);
        class432.field6151 = true;
        if (class204.field2996) {
            class561.method3260("Took: " + (class109.method731(30) - class645.field9078) + "ms", 93);
            class204.field2996 = false;
        }
        if (arg0 >= -61) {
            method3222((byte) -108);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 498)
    public static void method3223(int arg0) {
        field7892 = null;
        if (arg0 != 4) {
            method3223(99);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)I", line = 510)
    public static final int method3224(int arg0, int arg1) {
        return class689.field9755 == null ? 0 : class689.field9755[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)I", line = 524)
    public final int method3225(int arg0) {
        field7889++;
        if (arg0 == -1) {
            return (this.field7884 & 0x8) == 8 ? 1 : 0;
        } else {
            return -76;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZ)V", line = 536)
    public static final void method3226(int arg0, boolean arg1) {
        field7890++;
        if (!class420.method2512((byte) 43, arg0)) {
            return;
        }
        class176[] var2 = class110.field1382[arg0];
        if (arg1) {
            field7886 = 90;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class176 var4 = var2[var3];
            if (var4 != null) {
                var4.field2670 = 1;
                var4.field2668 = 0;
                var4.field2506 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 569)
    public class554() {
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)I", line = 576)
    public final int method3227(int arg0) {
        int var2 = -94 / ((arg0 - 19) / 60);
        field7887++;
        return this.field7884 & 0x7;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lrv;)V", line = 585)
    public class554(class120 arg0) {
        this.field7884 = arg0.method877(-252);
        this.field7891 = arg0.method898((byte) -120);
        this.field7894 = arg0.method871(23995);
        this.field7882 = arg0.method871(23995);
        this.field7893 = arg0.method871(23995);
        this.field7888 = arg0.method871(23995);
    }
}
