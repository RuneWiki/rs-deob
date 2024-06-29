import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class173 {

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "[I")
    private int[] field2854 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Lvn;")
    public class286 field2848;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "Lf;")
    public static class702 field2851;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "[I")
    private int[] field2864;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "[Lpg;")
    public static class682[] field2850;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "[S")
    private short[] field2849;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "[S")
    private short[] field2862;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "[S")
    private short[] field2865;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "[S")
    private short[] field2867;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Llk;I)V")
    public static final void method1297(class545 arg0, int arg1) {
        if (arg1 < 82) {
            field2851 = null;
        }
        field2860++;
        if (!class65.field1435) {
            return;
        }
        class317.field4671++;
        if (arg0.field7695 != null) {
            class545 var2 = class183.method1339(class437.field6303, (byte) 85, class273.field4094);
            if (var2 != null) {
                class476 var3 = new class476();
                var3.field6842 = arg0.field7695;
                var3.field6850 = arg0;
                var3.field6851 = var2;
                class683.method3847(var3);
            }
        }
        class275 var4 = class185.method1355(0, class220.field3330, class395.field5772);
        var4.field4103.method715(arg0.field7755, 1949991176);
        var4.field4103.method746(0, arg0.field7697);
        var4.field4103.method746(0, class153.field2604);
        var4.field4103.method709(class273.field4094, -101);
        var4.field4103.method709(arg0.field7702, -71);
        var4.field4103.method701(class437.field6303, (byte) -68);
        class140.method1141(var4, 19321);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;ZJZ)V")
    public static final void method1298(String arg0, boolean arg1, long arg2, boolean arg3) {
        field2861++;
        if (arg1) {
            class598.method3402(-1);
            if (class118.field2098.equals("")) {
                class160.field2715 = 39;
                return;
            }
        }
        class61 var5 = new class61(576);
        var5.method693((byte) 106, 10);
        var5.method745((int) (Math.random() * 65535.0D), 128);
        var5.method738(115, arg2);
        var5.method745(arg1 ? class592.field8517 : class292.field4385, 128);
        var5.method750(121, arg0);
        var5.method738(127, arg1 ? class219.field3326 : class77.field1564);
        if (arg1) {
            var5.method738(118, class312.method2032(true, class118.field2098));
            try {
                var5.method738(122, Long.parseLong(class110.field1925));
            } catch (Exception var9) {
                class160.field2715 = 39;
                return;
            }
        } else {
            var5.method715((int) (Math.random() * 9.9999999E7D), 1949991176);
            var5.method715((int) (Math.random() * 9.9999999E7D), 1949991176);
            var5.method715((int) (Math.random() * 9.9999999E7D), 1949991176);
            var5.method715((int) (Math.random() * 9.9999999E7D), 1949991176);
        }
        var5.method715((int) (Math.random() * 9.9999999E7D), 1949991176);
        var5.method733(true, class648.field9343, class180.field2919);
        if (arg3) {
            field2851 = null;
        }
        class275 var6 = class86.method858(0);
        var6.field4103.method693((byte) 106, arg1 ? class168.field2817.field1542 : class168.field2814.field1542);
        int var7 = 1;
        if (class635.field9133 != null) {
            var7 += class635.field9133.length() + 1;
        }
        var6.field4103.method745(28 - (-var5.field1393 - var7), 128);
        var6.field4103.method745(620, 128);
        var6.field4103.method693((byte) 106, class140.field2466);
        var6.field4103.method693((byte) 106, class78.field1573.field5796);
        class642.method3659(var6.field4103, 0);
        String var8 = arg1 ? class270.field4021 : class635.field9133;
        var6.field4103.method693((byte) 106, var8 == null ? 0 : 1);
        if (var8 != null) {
            var6.field4103.method750(120, var8);
        }
        var6.field4103.method698(-67, var5.field1393, 0, var5.field1397);
        class140.method1141(var6, 19321);
        class605.field8811 = 1;
        class119.field2120 = 0;
        class223.field3351 = 0;
        class160.field2715 = -3;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public static void method1299(int arg0) {
        if (arg0 <= 63) {
            method1297(null, -48);
        }
        field2850 = null;
        field2851 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lqh;I)Lgn;")
    public static final class653 method1300(class61 arg0, int arg1) {
        field2856++;
        class496 var2 = class501.method2989(arg0, 14);
        if (arg1 == 40) {
            int var3 = arg0.method721(arg1 - 461515064);
            return new class653(var2.field3490, var2.field3499, var2.field3497, var2.field3496, var2.field3492, var2.field3491, var2.field3500, var2.field3502, var2.field3498, var2.field7063, var2.field7070, var2.field7065, var2.field7074, var2.field7064, var2.field7066, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
    public static final void method1301(int arg0, int arg1) {
        field2852++;
        if (~arg0 != arg1 && class553.field7840[arg0]) {
            class38.field1055.method2240(arg1 + 13349, arg0);
            class156.field2667[arg0] = null;
            class91.field1668[arg0] = null;
            class553.field7840[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)Lnda;")
    public final class519 method1302(int arg0) {
        field2866++;
        class519[] var2 = new class519[5];
        int var3 = 0;
        class344 var4 = this.field2848.field4262;
        synchronized (this.field2848.field4262) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field2854[var5] != -1) {
                    var2[var3++] = class79.method826(this.field2854[var5], 0, 4096, this.field2848.field4262);
                }
                var5++;
            }
        }
        for (int var6 = arg0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7312 < 13) {
                var2[var6].method3060((byte) 57, 2);
            }
        }
        class519 var7 = new class519(var2, var3);
        if (this.field2867 != null) {
            for (int var8 = 0; var8 < this.field2867.length; var8++) {
                var7.method3059(this.field2867[var8], 0, this.field2862[var8]);
            }
        }
        if (this.field2865 != null) {
            for (int var9 = 0; var9 < this.field2865.length; var9++) {
                var7.method3047(this.field2849[var9], this.field2865[var9], 125);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lqh;B)V")
    public final void method1303(class61 arg0, byte arg1) {
        if (arg1 != -83) {
            return;
        }
        field2857++;
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                return;
            }
            this.method1306(arg0, var3, (byte) 43);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)Z")
    public final boolean method1304(byte arg0) {
        field2853++;
        if (this.field2864 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 < 76) {
            return true;
        }
        class344 var3 = this.field2848.field4262;
        synchronized (this.field2848.field4262) {
            for (int var4 = 0; var4 < this.field2864.length; var4++) {
                if (!this.field2848.field4262.method2217(this.field2864[var4], 106, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)Z")
    public final boolean method1305(int arg0) {
        if (arg0 != -6) {
            this.field2865 = null;
        }
        field2859++;
        boolean var2 = true;
        class344 var3 = this.field2848.field4262;
        synchronized (this.field2848.field4262) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field2854[var4] != -1 && !this.field2848.field4262.method2217(this.field2854[var4], -125, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lqh;IB)V")
    private final void method1306(class61 arg0, int arg1, byte arg2) {
        field2855++;
        int var4 = 8 % ((-arg2 - 5) / 48);
        if (arg1 == 1) {
            arg0.method732(-559537960);
        } else if (arg1 == 2) {
            int var9 = arg0.method732(-559537960);
            this.field2864 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2864[var10] = arg0.method723((byte) -25);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var7 = arg0.method732(-559537960);
                this.field2862 = new short[var7];
                this.field2867 = new short[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field2867[var8] = (short) arg0.method723((byte) -25);
                    this.field2862[var8] = (short) arg0.method723((byte) -25);
                }
            } else if (arg1 == 41) {
                int var5 = arg0.method732(-559537960);
                this.field2849 = new short[var5];
                this.field2865 = new short[var5];
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field2865[var6] = (short) arg0.method723((byte) -25);
                    this.field2849[var6] = (short) arg0.method723((byte) -25);
                }
                return;
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field2854[arg1 - 60] = arg0.method723((byte) -25);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Lnda;")
    public final class519 method1307(int arg0) {
        if (arg0 != -32247) {
            this.field2864 = null;
        }
        field2858++;
        if (this.field2864 == null) {
            return null;
        }
        class519[] var2 = new class519[this.field2864.length];
        class344 var3 = this.field2848.field4262;
        synchronized (this.field2848.field4262) {
            int var4 = 0;
            while (true) {
                if (this.field2864.length <= var4) {
                    break;
                }
                var2[var4] = class79.method826(this.field2864[var4], 0, arg0 + 36343, this.field2848.field4262);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field2864.length; var5++) {
            if (var2[var5].field7312 < 13) {
                var2[var5].method3060((byte) -90, 2);
            }
        }
        class519 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class519(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2867 != null) {
            for (int var7 = 0; var7 < this.field2867.length; var7++) {
                var6.method3059(this.field2867[var7], 0, this.field2862[var7]);
            }
        }
        if (this.field2865 != null) {
            for (int var8 = 0; var8 < this.field2865.length; var8++) {
                var6.method3047(this.field2849[var8], this.field2865[var8], 126);
            }
        }
        return var6;
    }
}
