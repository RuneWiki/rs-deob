import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 implements Runnable {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lid;")
    private static class60 field2875 = class11.method72("Please wait )2 attempting to reestablish", (byte) 112);

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lid;")
    private static class60 field2883 = class11.method72("Please contact customer support)3", (byte) 103);

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lid;")
    public static class60 field2877 = class11.method72("Hidden)2use", (byte) 97);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lid;")
    public static class60 field2876 = field2883;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lid;")
    private static class60 field2873 = class11.method72("glow1:", (byte) 118);

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lid;")
    public static class60 field2880 = field2875;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lid;")
    public static class60 field2878 = field2873;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lid;")
    public static class60 field2884 = field2873;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lpa;")
    public static class105 field2879;

    @OriginalMember(owner = "client!s", name = "run", descriptor = "()V")
    public final void run() {
        field2882++;
        try {
            while (true) {
                class66 var1 = class47.field1243;
                class98 var2;
                synchronized (class47.field1243) {
                    var2 = (class98) class47.field1243.method496(10153);
                }
                if (var2 == null) {
                    class128.method1007((byte) 119, 100L);
                    Object var3 = class1.field3;
                    synchronized (class1.field3) {
                        if (class30.field708 <= 1) {
                            class30.field708 = 0;
                            class1.field3.notifyAll();
                            return;
                        }
                        class30.field708--;
                    }
                } else {
                    if (var2.field2399 == 0) {
                        var2.field2407.method416(var2.field2397, var2.field2397.length, 123, (int) var2.field2929);
                        class66 var4 = class47.field1243;
                        synchronized (class47.field1243) {
                            var2.method1009((byte) 62);
                        }
                    } else if (var2.field2399 == 1) {
                        var2.field2397 = var2.field2407.method417((int) var2.field2929, 65280);
                        class66 var5 = class47.field1243;
                        synchronized (class47.field1243) {
                            class66.field1614.method508(var2, (byte) 123);
                        }
                    }
                    Object var6 = class1.field3;
                    synchronized (class1.field3) {
                        if (class30.field708 <= 1) {
                            class30.field708 = 0;
                            class1.field3.notifyAll();
                            return;
                        }
                        class30.field708 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class73.method558(-1, null, var17);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method984(byte arg0) {
        field2879 = null;
        field2877 = null;
        field2876 = null;
        if (arg0 < 72) {
            return;
        }
        field2873 = null;
        field2875 = null;
        field2878 = null;
        field2883 = null;
        field2884 = null;
        field2880 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[B)I")
    public static final int method985(int arg0, int arg1, byte[] arg2) {
        if (arg0 >= -103) {
            field2879 = null;
        }
        field2874++;
        return class132.method1044(arg1, arg2, true, 0);
    }
}
