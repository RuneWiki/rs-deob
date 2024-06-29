import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class145 implements Runnable {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2955 = 0;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lcd;")
    private static class23 field2953 = class54.method414("RuneScape has been updated(Q", -1);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "J")
    public static long field2954 = 0L;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lcd;")
    private static class23 field2967 = class54.method414("World", -1);

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static volatile int field2966 = 0;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lcd;")
    public static class23 field2962 = field2967;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lcd;")
    public static class23 field2969 = field2953;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lcd;")
    public static class23 field2965 = field2967;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lcd;")
    public static class23 field2961 = class54.method414("_", -1);

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2956 = 0;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Lcd;")
    private static class23 field2968 = class54.method414("Sorry invited players only)3", -1);

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Lcd;")
    public static class23 field2971 = field2968;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field2973 = 0;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lkh;")
    public static class97 field2960;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method918(int arg0) {
        field2970++;
        Object var1 = class60.field1396;
        synchronized (class60.field1396) {
            if (class144.field2936 == 0) {
                class60.field1398.method870(new class145(), 5, true);
            }
            class144.field2936 = arg0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    private class145() {
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method919(int arg0, byte[] arg1) {
        if (arg0 >= -110) {
            return null;
        }
        int var2 = arg1.length;
        field2958++;
        byte[] var3 = new byte[var2];
        class93.method611(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Z")
    public static final boolean method920(int arg0, int arg1) {
        if (arg1 == -1019631074) {
            field2972++;
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "run", descriptor = "()V")
    public final void run() {
        field2964++;
        try {
            while (true) {
                class25 var1 = class36.field740;
                class20 var2;
                synchronized (class36.field740) {
                    var2 = (class20) class36.field740.method188((byte) 54);
                }
                if (var2 == null) {
                    class53.method409(100L, -25391);
                    Object var6 = class60.field1396;
                    synchronized (class60.field1396) {
                        if (class144.field2936 <= 1) {
                            class144.field2936 = 0;
                            class60.field1396.notifyAll();
                            return;
                        }
                        class144.field2936--;
                    }
                } else {
                    if (var2.field427 == 0) {
                        var2.field411.method1142(true, var2.field413, var2.field413.length, (int) var2.field3317);
                        class25 var4 = class36.field740;
                        synchronized (class36.field740) {
                            var2.method1018(15789);
                        }
                    } else if (var2.field427 == 1) {
                        var2.field413 = var2.field411.method1146(21947, (int) var2.field3317);
                        class25 var3 = class36.field740;
                        synchronized (class36.field740) {
                            class100.field2109.method186(var2, -26692);
                        }
                    }
                    Object var5 = class60.field1396;
                    synchronized (class60.field1396) {
                        if (class144.field2936 <= 1) {
                            class144.field2936 = 0;
                            class60.field1396.notifyAll();
                            return;
                        }
                        class144.field2936 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class186.method1145(null, var17, 46);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method921(byte arg0) {
        field2960 = null;
        field2967 = null;
        field2969 = null;
        field2965 = null;
        field2961 = null;
        int var1 = 55 / ((57 - arg0) / 47);
        field2962 = null;
        field2953 = null;
        field2971 = null;
        field2968 = null;
    }
}
