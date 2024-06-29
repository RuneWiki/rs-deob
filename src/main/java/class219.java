import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class219 implements Runnable {

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Z")
    public static boolean field3965 = true;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Ldj;")
    private static class44 field3967 = class89.method650(255, "Type");

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Ldj;")
    public static class44 field3963 = class89.method650(255, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Ldj;")
    private static class44 field3968 = class89.method650(255, "purple:");

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Z")
    public static boolean field3972 = true;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Ldj;")
    public static class44 field3966 = field3967;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Ldj;")
    private static class44 field3975 = class89.method650(255, "Please enter your password)3");

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Ldj;")
    public static class44 field3969 = field3968;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Ldj;")
    public static class44 field3974 = field3968;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Ldj;")
    public static class44 field3962 = field3975;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "[I")
    public static int[] field3970;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "[Lle;")
    public static class125[] field3964;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)I")
    public static final int method1418(int arg0) {
        field3971++;
        if (arg0 != 100) {
            field3965 = true;
        }
        int var1 = class40.method278(class102.field1858, class194.field3403, class168.field2878, (byte) 101);
        return var1 - class35.field628 >= 800 || (class47.field875[class194.field3403][class168.field2878 >> 7][class102.field1858 >> 7] & 0x4) == 0 ? 3 : class194.field3403;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static void method1419(int arg0) {
        if (arg0 >= -11) {
            field3963 = null;
        }
        field3970 = null;
        field3974 = null;
        field3964 = null;
        field3967 = null;
        field3962 = null;
        field3966 = null;
        field3975 = null;
        field3968 = null;
        field3969 = null;
        field3963 = null;
    }

    @OriginalMember(owner = "client!ui", name = "run", descriptor = "()V")
    public final void run() {
        field3973++;
        try {
            while (true) {
                class190 var1 = class13.field245;
                class224 var2;
                synchronized (class13.field245) {
                    var2 = (class224) class13.field245.method1189(0);
                }
                if (var2 == null) {
                    class82.method617((byte) 31, 100L);
                    Object var3 = class133.field2377;
                    synchronized (class133.field2377) {
                        if (class57.field1066 <= 1) {
                            class57.field1066 = 0;
                            class133.field2377.notifyAll();
                            return;
                        }
                        class57.field1066--;
                    }
                } else {
                    if (var2.field4185 == 0) {
                        var2.field4179.method72(32570, var2.field4177.length, var2.field4177, (int) var2.field3186);
                        class190 var4 = class13.field245;
                        synchronized (class13.field245) {
                            var2.method1148(-13215);
                        }
                    } else if (var2.field4185 == 1) {
                        var2.field4177 = var2.field4179.method77((int) var2.field3186, (byte) 99);
                        class190 var5 = class13.field245;
                        synchronized (class13.field245) {
                            class96.field1782.method1185(var2, (byte) -110);
                        }
                    }
                    Object var6 = class133.field2377;
                    synchronized (class133.field2377) {
                        if (class57.field1066 <= 1) {
                            class57.field1066 = 0;
                            class133.field2377.notifyAll();
                            return;
                        }
                        class57.field1066 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class173.method1099(106, null, var17);
        }
    }
}
