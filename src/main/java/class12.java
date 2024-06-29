import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 {

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    private int field320 = 0;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[Lte;")
    private class137[] field313;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Laf;")
    private static class7 field306 = class48.method406(40, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Laf;")
    public static class7 field308 = field306;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Laf;")
    public static class7 field316 = class48.method406(40, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Laf;")
    private static class7 field319 = class48.method406(40, "The server is being updated)3");

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Laf;")
    public static class7 field311 = field319;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lof;")
    public static class103 field317 = null;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lnd;")
    public static class94 field314 = new class94();

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Z")
    public static boolean field323 = false;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "J")
    private long field301;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lte;")
    private class137 field300;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Lte;")
    private class137 field318;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lva;")
    public static class145 field302;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "[I")
    public static int[] field321;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static final void method122(byte arg0) {
        class99.method813((byte) -56);
        class130.method1068(112);
        field309++;
        class127.method1055((byte) -54);
        class122.method941(-11256);
        if (arg0 > -120) {
            field304 = 19;
        }
        class48.method402(0);
        class27.method242((byte) 110);
        class50.method413(-27713);
        class50.method412((byte) -14);
        class148.method1189(-100);
        class55.method442(false);
        class106.method855(-1);
        class82.method693(-115);
        ((class66) class134.field3161).method527(-50);
        class127.field3051.method391((byte) -73);
        class82.field1881.method570(0);
        class53.field1290.method570(0);
        class75.field1754.method570(0);
        class39.field984.method570(0);
        class21.field545.method570(0);
        class113.field2710.method570(0);
        class18.field430.method570(0);
        class127.field3060.method570(0);
        class48.field1169.method570(0);
        class71.field1554.method570(0);
        class142.field3373.method570(0);
        class11.field282.method570(0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Lte;")
    public final class137 method123(boolean arg0) {
        field298++;
        if (this.field320 > 0 && this.field313[this.field320 - 1] != this.field318) {
            class137 var2 = this.field318;
            this.field318 = var2.field3268;
            return var2;
        }
        while (this.field305 > this.field320) {
            class137 var3 = this.field313[this.field320++].field3268;
            if (this.field313[this.field320 - 1] != var3) {
                this.field318 = var3.field3268;
                return var3;
            }
        }
        if (arg0) {
            this.method123(false);
        }
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method124(int arg0) {
        field308 = null;
        field302 = null;
        field321 = null;
        field317 = null;
        if (arg0 != 0) {
            return;
        }
        field306 = null;
        field314 = null;
        field311 = null;
        field316 = null;
        field319 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)[Lqc;")
    public static final class114[] method125(byte arg0) {
        field299++;
        class114[] var1 = new class114[class49.field1177];
        int var2 = 0;
        if (arg0 != 25) {
            return null;
        }
        while (class49.field1177 > var2) {
            class114 var3 = var1[var2] = new class114();
            var3.field2726 = field310;
            var3.field2727 = class136.field3249;
            var3.field2728 = class84.field1990[var2];
            var3.field2725 = class51.field1234[var2];
            var3.field2723 = class127.field3059[var2];
            var3.field2722 = class86.field2005[var2];
            var3.field2729 = class27.field697;
            var3.field2724 = class82.field1879[var2];
            var2++;
        }
        class53.method429(119);
        return var1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(JB)Lte;")
    public final class137 method126(long arg0, byte arg1) {
        field295++;
        this.field301 = arg0;
        class137 var4 = this.field313[(int) (arg0 & (long) (this.field305 - 1))];
        int var5 = -91 % ((-arg1 - 36) / 46);
        for (this.field300 = var4.field3268; this.field300 != var4; this.field300 = this.field300.field3268) {
            if (this.field300.field3261 == arg0) {
                class137 var6 = this.field300;
                this.field300 = this.field300.field3268;
                return var6;
            }
        }
        this.field300 = null;
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lte;")
    public final class137 method127(int arg0) {
        field307++;
        this.field320 = 0;
        if (arg0 >= -40) {
            this.field305 = 47;
        }
        return this.method123(false);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Lte;")
    public final class137 method128(int arg0) {
        field296++;
        if (this.field300 == null) {
            return null;
        }
        class137 var2 = this.field313[(int) ((long) (this.field305 + arg0) & this.field301)];
        while (this.field300 != var2) {
            if (this.field300.field3261 == this.field301) {
                class137 var3 = this.field300;
                this.field300 = this.field300.field3268;
                return var3;
            }
            this.field300 = this.field300.field3268;
        }
        this.field300 = null;
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
    public static final void method129(byte arg0) {
        Object var1 = class145.field3415;
        synchronized (class145.field3415) {
            if (class53.field1309 == 0) {
                class74.field1717.method823((byte) -123, 5, new class21());
            }
            class53.field1309 = 600;
            int var2 = 100 % ((arg0 - 35) / 61);
        }
        field315++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILte;J)V")
    public final void method130(int arg0, class137 arg1, long arg2) {
        field303++;
        if (arg1.field3262 != null) {
            arg1.method1124((byte) 62);
        }
        class137 var5 = this.field313[(int) (arg2 & (long) (this.field305 - 1))];
        arg1.field3262 = var5.field3262;
        arg1.field3261 = arg2;
        arg1.field3268 = var5;
        if (arg0 <= 55) {
            this.method123(true);
        }
        arg1.field3262.field3268 = arg1;
        arg1.field3268.field3262 = arg1;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V")
    public class12(int arg0) {
        this.field305 = arg0;
        this.field313 = new class137[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class137 var3 = this.field313[var2] = new class137();
            var3.field3262 = var3;
            var3.field3268 = var3;
        }
    }
}
