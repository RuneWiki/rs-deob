import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class345 extends class297 {

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    private int field5349 = 4096;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    private int field5354 = 4096;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "[I")
    private int[] field5353 = new int[3];

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    private int field5351 = 409;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    private int field5361 = 4096;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Ldn;")
    public static class244 field5350;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "Lpf;")
    public static class92 field5363;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "[I")
    public static int[] field5352;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "[S")
    public static short[] field5362;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[[I", line = 5)
    public final int[][] method172(int arg0, byte arg1) {
        if (arg1 != 63) {
            this.field5353 = (int[]) null;
        }
        field5357++;
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int[][] var4 = this.method2105(arg0, arg1 - 61, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class31.field491; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field5353[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field5351 >= var13) {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field5353[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field5351 >= var15) {
                        int var16 = var6[var11];
                        int var17 = var16 - this.field5353[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field5351 < var17) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field5349 * var12 >> 12;
                            var8[var11] = this.field5361 * var14 >> 12;
                            var10[var11] = this.field5354 * var16 >> 12;
                        }
                    } else {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var6[var11];
                    }
                } else {
                    var9[var11] = var12;
                    var8[var11] = var7[var11];
                    var10[var11] = var6[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILaj;)V", line = 124)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field5351 = arg2.method56(19612);
        } else if (arg0 == 1) {
            this.field5354 = arg2.method56(19612);
        } else if (arg0 == 2) {
            this.field5361 = arg2.method56(19612);
        } else if (arg0 == 3) {
            this.field5349 = arg2.method56(19612);
        } else if (arg0 == 4) {
            int var5 = arg2.method4(true);
            this.field5353[2] = class164.method1234(0, var5 >> 12);
            this.field5353[1] = class164.method1234(var5, 65280) >> 4;
            this.field5353[0] = class164.method1234(var5 << 4, 267386880);
        }
        field5355++;
        if (arg1 != 255) {
            this.field5349 = 8;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 338)
    public class345() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLpk;)I", line = 176)
    public static final int method2392(byte arg0, class120 arg1) {
        if (arg0 >= -124) {
            method2394((byte) -4);
        }
        field5359++;
        int var2 = 0;
        if (arg1.method939((byte) 60, class178.field2840)) {
            var2++;
        }
        if (arg1.method939((byte) 84, class244.field3649)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V", line = 196)
    public static void method2393(byte arg0) {
        field5352 = null;
        int var1 = 49 / ((-arg0 - 85) / 41);
        field5362 = null;
        field5363 = null;
        field5350 = null;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V", line = 212)
    public static final void method2394(byte arg0) {
        if (class4.field109 == 2) {
            if (class95.field1535 == class101.field1633 && class207.field3271 == class146.field2394) {
                class4.field109 = 0;
                if (class281.field4404 && class48.field737[81] && class137.field2225 > 2) {
                    class147.method1123((byte) -111, class137.field2225 - 2);
                } else {
                    class147.method1123((byte) 103, class137.field2225 - 1);
                }
            }
        } else if (class95.field1535 == class170.field2740 && class243.field3639 == class146.field2394) {
            class4.field109 = 0;
            if (class281.field4404 && class48.field737[81] && class137.field2225 > 2) {
                class147.method1123((byte) 91, class137.field2225 - 2);
            } else {
                class147.method1123((byte) -67, class137.field2225 - 1);
            }
        } else {
            class101.field1633 = class170.field2740;
            class207.field3271 = class243.field3639;
            class4.field109 = 2;
        }
        field5358++;
        if (arg0 <= 54) {
            method2394((byte) -98);
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)V", line = 267)
    public static final void method2395(byte arg0) {
        field5360++;
        class42.method381();
        class50.field760 = null;
        class122.field1987 = -1;
        class242.method1714(false);
        class72.field1096.method1176((byte) -64);
        class71.field1070 = new class102();
        ((class277) class40.field614).method1963(255);
        if (arg0 <= 90) {
            return;
        }
        class250.method1733();
        class219.field3426 = new class253[255];
        class219.field3421 = 0;
        class206.method1511();
        class295.method2083();
        class15.method187(117);
        class66.method530((byte) -115, false);
        class313.method2206(-1);
        class19.method206(12962);
        for (int var1 = 0; var1 < 2048; var1++) {
            class92 var2 = class74.field1140[var1];
            if (var2 != null) {
                var2.field4711 = null;
            }
        }
        if (class162.field2623) {
            class295.method2072(104, 104);
            class237.method1691(class151.field2467, 504172684);
            class236.method1689();
        }
        class71.method575(class176.field2815, 14765, class140.field2262);
        class296.method2095((byte) 2, class176.field2815);
        class74.field1141 = null;
        class244.field3656 = null;
        class4.field107 = null;
        class152.field2496 = null;
        class26.field441 = null;
        if (class289.field4548 == 5) {
            class158.method1169((byte) 3, class176.field2815);
        }
        if (class289.field4548 == 10) {
            class198.method1402(false, (byte) 86);
        }
        if (class289.field4548 == 30) {
            class117.method921((byte) -19, 25);
        }
    }
}
