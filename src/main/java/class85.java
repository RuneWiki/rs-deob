import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 implements Runnable {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1924 = -1;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lqf;")
    private static class117 field1927 = class72.method514(106, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lqf;")
    public static class117 field1932 = class72.method514(113, "Okay");

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[J")
    public static long[] field1930 = new long[32];

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lqf;")
    public static class117 field1931 = class72.method514(108, "blinken3:");

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "[I")
    public static int[] field1937 = new int[2000];

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field1939 = 0;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lqf;")
    public static class117 field1936 = field1927;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Ldf;")
    public static class28 field1922;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Ljb;")
    public static class64 field1928;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
    public static final void method680(int arg0, boolean arg1) {
        field1925++;
        if (class141.field3395.field1998 >> 7 == class94.field2287 && class141.field3395.field1960 >> 7 == class40.field802) {
            class94.field2287 = 0;
        }
        int var2 = class66.field1387;
        if (arg0 != 1442380142) {
            return;
        }
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class21 var5;
            if (arg1) {
                var4 = 33538048;
                var5 = class141.field3395;
            } else {
                var4 = class20.field326[var3] << 14;
                var5 = class149.field3709[class20.field326[var3]];
            }
            if (var5 != null && var5.method162(true)) {
                var5.field363 = false;
                int var6 = var5.field1998 >> 7;
                if ((class20.field334 && class66.field1387 > 50 || class66.field1387 > 200) && !arg1 && var5.field2019 == var5.field1949) {
                    var5.field363 = true;
                }
                int var7 = var5.field1960 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field357 == null || var5.field341 > class43.field856 || var5.field343 <= class43.field856) {
                        if ((var5.field1998 & 0x7F) == 64 && (var5.field1960 & 0x7F) == 64) {
                            if (class101.field2444[var6][var7] == class153.field3783) {
                                continue;
                            }
                            class101.field2444[var6][var7] = class153.field3783;
                        }
                        var5.field358 = class80.method626(var5.field1998, class140.field3344, var5.field1960, -124);
                        class19.field311.method868(class140.field3344, var5.field1998, var5.field1960, var5.field358, 60, var5, var5.field1999, var4, var5.field1968);
                    } else {
                        var5.field363 = false;
                        var5.field358 = class80.method626(var5.field1998, class140.field3344, var5.field1960, -37);
                        class19.field311.method844(class140.field3344, var5.field1998, var5.field1960, var5.field358, 60, var5, var5.field1999, var4, var5.field349, var5.field373, var5.field366, var5.field338);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method681(int arg0) {
        field1930 = null;
        field1936 = null;
        field1932 = null;
        field1931 = null;
        field1927 = null;
        field1928 = null;
        field1922 = null;
        field1937 = null;
        if (arg0 != 0) {
            field1936 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
    public static final int method682(int arg0) {
        if (arg0 != 20131) {
            method680(-108, true);
        }
        field1926++;
        return class115.field2718++;
    }

    @OriginalMember(owner = "client!mb", name = "run", descriptor = "()V")
    public final void run() {
        field1933++;
        try {
            while (true) {
                class5 var1 = class34.field710;
                class124 var2;
                synchronized (class34.field710) {
                    var2 = (class124) class34.field710.method27(18823);
                }
                if (var2 == null) {
                    class148.method1183(0, 100L);
                    Object var3 = class65.field1346;
                    synchronized (class65.field1346) {
                        if (class116.field2747 <= 1) {
                            class116.field2747 = 0;
                            class65.field1346.notifyAll();
                            return;
                        }
                        class116.field2747--;
                    }
                } else {
                    if (var2.field2929 == 0) {
                        var2.field2914.method140(var2.field2927, (byte) 114, var2.field2927.length, (int) var2.field1495);
                        class5 var4 = class34.field710;
                        synchronized (class34.field710) {
                            var2.method495(-59);
                        }
                    } else if (var2.field2929 == 1) {
                        var2.field2927 = var2.field2914.method134((byte) -101, (int) var2.field1495);
                        class5 var5 = class34.field710;
                        synchronized (class34.field710) {
                            client.field385.method22(var2, (byte) 24);
                        }
                    }
                    Object var6 = class65.field1346;
                    synchronized (class65.field1346) {
                        if (class116.field2747 <= 1) {
                            class116.field2747 = 0;
                            class65.field1346.notifyAll();
                            return;
                        }
                        class116.field2747 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class105.method803((byte) -91, var17, null);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljb;I)V")
    public static final void method683(class64 arg0, int arg1) {
        class47.field945 = arg0;
        if (arg1 != -1089526009) {
            field1927 = null;
        }
        field1934++;
    }
}
