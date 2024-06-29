import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class205 implements Runnable {

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Laf;")
    private class168 field3202 = new class168();

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public int field3211 = 0;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Z")
    private boolean field3206 = false;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field3209;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field3200 = 0;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "[[B")
    public static byte[][] field3210 = new byte[50][];

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Ljf;")
    public static class216 field3204 = new class216(5);

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "Lb;")
    public static class56 field3214 = new class56();

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "[[S")
    public static short[][] field3215 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field3218 = 0;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field3216 = -1;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field3217 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Z")
    public static final boolean method1407(byte arg0) {
        field3198++;
        try {
            if (arg0 < 104) {
                return true;
            }
            if (class294.field4712 == 2) {
                if (class197.field3114 == null) {
                    class197.field3114 = class242.method1718(class138.field1992, class105.field1535, class68.field1023);
                    if (class197.field3114 == null) {
                        return false;
                    }
                }
                if (class217.field3388 == null) {
                    class217.field3388 = new class124(class126.field1812, class114.field1669);
                }
                if (class179.field2810.method2069(22050, class197.field3114, 16256, class139.field1998, class217.field3388)) {
                    class179.field2810.method2072((byte) 75);
                    class179.field2810.method2052(1, class93.field1400);
                    class179.field2810.method2054(class261.field4244, class197.field3114, (byte) -38);
                    class138.field1992 = null;
                    class217.field3388 = null;
                    class294.field4712 = 0;
                    class197.field3114 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class179.field2810.method2050(true);
            class217.field3388 = null;
            class138.field1992 = null;
            class294.field4712 = 0;
            class197.field3114 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public static void method1408(byte arg0) {
        field3215 = null;
        field3214 = null;
        field3204 = null;
        field3210 = null;
        if (arg0 != 31) {
            method1415(-89, -11);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public final void method1409(int arg0) {
        field3196++;
        this.field3206 = true;
        if (arg0 <= 67) {
            return;
        }
        class168 var2 = this.field3202;
        synchronized (this.field3202) {
            this.field3202.notifyAll();
        }
        try {
            this.field3209.join();
        } catch (InterruptedException var3) {
        }
        this.field3209 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILhi;)Lbc;")
    public final class111 method1410(int arg0, int arg1, class278 arg2) {
        field3205++;
        class111 var4 = new class111();
        var4.field1598 = arg1;
        class168 var5 = this.field3202;
        synchronized (this.field3202) {
            class111 var6 = (class111) this.field3202.method1146(88);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field874 && var6.field1611 == arg2 && var6.field1598 == 2) {
                    var4.field4700 = false;
                    var4.field1600 = var6.field1600;
                    return var4;
                }
                var6 = (class111) this.field3202.method1148((byte) 113);
            }
        }
        var4.field1600 = arg2.method1923(arg0, 8);
        var4.field4698 = true;
        var4.field4700 = false;
        return var4;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I")
    public static int method1411(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILhi;I)Lbc;")
    public final class111 method1412(int arg0, class278 arg1, int arg2) {
        field3197++;
        if (arg2 != 5392) {
            return null;
        }
        class111 var4 = new class111();
        var4.field1611 = arg1;
        var4.field874 = (long) arg0;
        var4.field4698 = false;
        var4.field1598 = 3;
        this.method1414(var4, 7595);
        return var4;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[BILhi;)Lbc;")
    public final class111 method1413(int arg0, byte[] arg1, int arg2, class278 arg3) {
        class111 var5 = new class111();
        var5.field1600 = arg1;
        var5.field874 = (long) arg2;
        var5.field4698 = false;
        var5.field1611 = arg3;
        field3203++;
        if (arg0 > -107) {
            return null;
        } else {
            var5.field1598 = 2;
            this.method1414(var5, 7595);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lbc;I)V")
    private final void method1414(class111 arg0, int arg1) {
        class168 var3 = this.field3202;
        synchronized (this.field3202) {
            this.field3202.method1149(arg1 - 3259, arg0);
            if (arg1 != 7595) {
                method1415(53, 60);
            }
            this.field3211++;
            this.field3202.notifyAll();
        }
        field3199++;
    }

    @OriginalMember(owner = "client!gi", name = "run", descriptor = "()V")
    public final void run() {
        field3208++;
        while (!this.field3206) {
            class168 var1 = this.field3202;
            class111 var2;
            synchronized (this.field3202) {
                var2 = (class111) this.field3202.method1145(false);
                if (var2 == null) {
                    try {
                        this.field3202.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3211--;
            }
            try {
                if (var2.field1598 == 2) {
                    var2.field1611.method1922(var2.field1600.length, -93, var2.field1600, (int) var2.field874);
                } else if (var2.field1598 == 3) {
                    var2.field1600 = var2.field1611.method1923((int) var2.field874, 8);
                }
            } catch (Exception var6) {
                class285.method1952(var6, (byte) 104, (String) null);
            }
            var2.field4700 = false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)Leb;")
    public static final class109 method1415(int arg0, int arg1) {
        field3212++;
        class109 var2 = (class109) class21.field272.method1517((long) arg0, (byte) 51);
        if (var2 != null) {
            return var2;
        }
        int var3 = 62 % ((-arg1 - 14) / 59);
        byte[] var4 = class281.field4582.method501(-2, 0, arg0);
        class109 var5 = new class109(var4);
        var5.method1468(class76.field1146, (int[]) null);
        class21.field272.method1518(var5, (long) arg0, (byte) 75);
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class205() {
        class160 var1 = class95.field1425.method1684(0, this, 5);
        while (var1.field2399 == 0) {
            class7.method43(-62, 10L);
        }
        if (var1.field2399 == 2) {
            throw new RuntimeException();
        }
        this.field3209 = (Thread) var1.field2401;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)V")
    public static final void method1416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 8526) {
            method1416(-81, -64, 104, 37, 35);
        }
        field3201++;
        if (class96.field1437 == 0 || arg1 == 0 || class210.field3275 >= 50 || arg0 == -1) {
            return;
        }
        class235.field3794[class210.field3275] = arg0;
        class170.field2625[class210.field3275] = arg1;
        class46.field574[class210.field3275] = arg3;
        class112.field1627[class210.field3275] = null;
        class200.field3154[class210.field3275] = 0;
        class250.field4058[class210.field3275] = arg4;
        class210.field3275++;
    }
}
