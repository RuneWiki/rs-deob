import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class231 implements Runnable {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lia;")
    private static class257 field3871 = class28.method234(109, " ");

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lia;")
    public static class257 field3879 = field3871;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lie;")
    public static class117 field3875 = new class117(100);

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field3880 = 0;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field3883 = -1;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Z")
    public static boolean field3882 = false;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lia;")
    public static class257 field3886 = class28.method234(-73, "(U1");

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lte;")
    public static class184 field3881;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lme;")
    public static class44 field3884;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILmb;I)Z")
    public static final boolean method1505(int arg0, class178 arg1, int arg2) {
        if (arg0 != -23917) {
            field3878 = -74;
        }
        field3874++;
        byte[] var3 = arg1.method1212(-27194, arg2);
        if (var3 == null) {
            return false;
        } else {
            class56.method425(var3, 90);
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lmb;IBI)[Llc;")
    public static final class90[] method1506(class178 arg0, int arg1, byte arg2, int arg3) {
        field3872++;
        if (arg2 > -67) {
            field3882 = true;
        }
        return class156.method1093(arg1, 122, arg3, arg0) ? class233.method1533((byte) -105) : null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method1507(int arg0) {
        field3873++;
        if (!class257.field4404) {
            return;
        }
        class44 var1 = class148.method996(class29.field556, -1, class10.field191);
        if (arg0 < 27) {
            field3878 = 19;
        }
        if (var1 != null && var1.field996 != null) {
            class164 var2 = new class164();
            var2.field2864 = var1;
            var2.field2867 = var1.field996;
            class57.method441(var2, -10305);
        }
        class257.field4404 = false;
        class257.method1718(false, var1);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static void method1508(int arg0) {
        field3884 = null;
        field3871 = null;
        field3875 = null;
        field3881 = null;
        field3879 = null;
        field3886 = null;
        if (arg0 != 1) {
            method1506((class178) null, 0, (byte) -17, 68);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)V")
    public static final void method1509(int arg0, boolean arg1) {
        if (arg0 != -1) {
            method1507(2);
        }
        field3877++;
        class222.method1464(class5.field114, class12.field241, -8480, arg1, class166.field2897);
    }

    @OriginalMember(owner = "client!le", name = "run", descriptor = "()V")
    public final void run() {
        field3876++;
        try {
            while (true) {
                class33 var1 = class34.field659;
                class108 var2;
                synchronized (class34.field659) {
                    var2 = (class108) class34.field659.method288(26111);
                }
                if (var2 == null) {
                    class33.method283(-70, 100L);
                    Object var3 = class189.field3254;
                    synchronized (class189.field3254) {
                        if (class159.field2786 <= 1) {
                            class159.field2786 = 0;
                            class189.field3254.notifyAll();
                            return;
                        }
                        class159.field2786--;
                    }
                } else {
                    if (var2.field2010 == 0) {
                        var2.field2018.method1492((int) var2.field573, var2.field2016, var2.field2016.length, true);
                        class33 var5 = class34.field659;
                        synchronized (class34.field659) {
                            var2.method254(1);
                        }
                    } else if (var2.field2010 == 1) {
                        var2.field2016 = var2.field2018.method1497(0, (int) var2.field573);
                        class33 var4 = class34.field659;
                        synchronized (class34.field659) {
                            class10.field187.method287(var2, 0);
                        }
                    }
                    Object var6 = class189.field3254;
                    synchronized (class189.field3254) {
                        if (class159.field2786 <= 1) {
                            class159.field2786 = 0;
                            class189.field3254.notifyAll();
                            return;
                        }
                        class159.field2786 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class198.method1325((String) null, var17, -21);
        }
    }
}
