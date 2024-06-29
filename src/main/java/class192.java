import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class192 implements Runnable {

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field3743 = 0;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lkb;")
    private static class93 field3740 = class76.method390("Enter your username (V password)3", 0);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lkb;")
    public static class93 field3741 = field3740;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[Lna;")
    public static class119[] field3742;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method1239(byte arg0) {
        field3740 = null;
        field3741 = null;
        field3742 = null;
        if (arg0 != -60) {
            method1240((byte) -112, null);
        }
    }

    @OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
    public final void run() {
        field3739++;
        try {
            while (true) {
                class122 var1 = class182.field3590;
                class155 var2;
                synchronized (class182.field3590) {
                    var2 = (class155) class182.field3590.method692(false);
                }
                if (var2 == null) {
                    class39.method212(-23, 100L);
                    Object var6 = class30.field505;
                    synchronized (class30.field505) {
                        if (class167.field3337 <= 1) {
                            class167.field3337 = 0;
                            class30.field505.notifyAll();
                            return;
                        }
                        class167.field3337--;
                    }
                } else {
                    if (var2.field3047 == 0) {
                        var2.field3053.method318(var2.field3045, (byte) -66, var2.field3045.length, (int) var2.field718);
                        class122 var4 = class182.field3590;
                        synchronized (class182.field3590) {
                            var2.method235(false);
                        }
                    } else if (var2.field3047 == 1) {
                        var2.field3045 = var2.field3053.method320((byte) 97, (int) var2.field718);
                        class122 var3 = class182.field3590;
                        synchronized (class182.field3590) {
                            class166.field3305.method691(var2, (byte) 51);
                        }
                    }
                    Object var5 = class30.field505;
                    synchronized (class30.field505) {
                        if (class167.field3337 <= 1) {
                            class167.field3337 = 0;
                            class30.field505.notifyAll();
                            return;
                        }
                        class167.field3337 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class141.method882(true, null, var17);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLmc;)V")
    public static final void method1240(byte arg0, class112 arg1) {
        field3744++;
        if (arg1.field2014 == 0) {
            return;
        }
        if (arg1.field2059 != -1 && arg1.field2059 < 32768) {
            class76 var2 = class143.field2791[arg1.field2059];
            if (var2 != null) {
                int var3 = arg1.field2045 - var2.field2045;
                int var4 = arg1.field2032 - var2.field2032;
                if (var4 != 0 || var3 != 0) {
                    arg1.field2071 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2059 >= 32768) {
            int var5 = arg1.field2059 - 32768;
            if (class6.field111 == var5) {
                var5 = 2047;
            }
            class34 var6 = class206.field4035[var5];
            if (var6 != null) {
                int var7 = arg1.field2032 - var6.field2032;
                int var8 = arg1.field2045 - var6.field2045;
                if (var7 != 0 || var8 != 0) {
                    arg1.field2071 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2053 != 0 || arg1.field2042 != 0) && (arg1.field2060 == 0 || arg1.field2043 > 0)) {
            int var9 = arg1.field2032 - (arg1.field2053 - class49.field787 - class49.field787) * 64;
            int var10 = arg1.field2045 - (arg1.field2042 - class68.field1242 - class68.field1242) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field2071 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field2053 = 0;
            arg1.field2042 = 0;
        }
        int var11 = arg1.field2071 - arg1.field2075 & 0x7FF;
        if (arg0 < 103) {
            method1239((byte) -113);
        }
        if (var11 == 0) {
            arg1.field2034 = 0;
            return;
        }
        arg1.field2034++;
        if (var11 <= 1024) {
            arg1.field2075 += arg1.field2014;
            boolean var12 = true;
            if (arg1.field2014 > var11 || 2048 - arg1.field2014 < var11) {
                arg1.field2075 = arg1.field2071;
                var12 = false;
            }
            if (arg1.field2054 == arg1.field2015 && (arg1.field2034 > 25 || var12)) {
                if (arg1.field2048 == -1) {
                    arg1.field2054 = arg1.field2047;
                } else {
                    arg1.field2054 = arg1.field2048;
                }
            }
        } else {
            arg1.field2075 -= arg1.field2014;
            boolean var13 = true;
            if (var11 < arg1.field2014 || 2048 - arg1.field2014 < var11) {
                var13 = false;
                arg1.field2075 = arg1.field2071;
            }
            if (arg1.field2054 == arg1.field2015 && (arg1.field2034 > 25 || var13)) {
                if (arg1.field2031 == -1) {
                    arg1.field2054 = arg1.field2047;
                } else {
                    arg1.field2054 = arg1.field2031;
                }
            }
        }
        arg1.field2075 &= 0x7FF;
    }
}
