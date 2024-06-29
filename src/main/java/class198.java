import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class198 implements Runnable {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3406 = 0;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "J")
    public static long field3405 = 0L;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3410;

    @OriginalMember(owner = "client!ug", name = "run", descriptor = "()V")
    public final void run() {
        field3407++;
        try {
            while (true) {
                class48 var1 = class239.field4123;
                class99 var2;
                synchronized (class239.field4123) {
                    var2 = (class99) class239.field4123.method371((byte) 61);
                }
                if (var2 == null) {
                    class234.method1603(100L, -122);
                    Object var3 = class265.field4634;
                    synchronized (class265.field4634) {
                        if (class134.field2368 <= 1) {
                            class134.field2368 = 0;
                            class265.field4634.notifyAll();
                            return;
                        }
                        class134.field2368--;
                    }
                } else {
                    if (var2.field1743 == 0) {
                        var2.field1748.method1207(-1, var2.field1739.length, var2.field1739, (int) var2.field4061);
                        class48 var5 = class239.field4123;
                        synchronized (class239.field4123) {
                            var2.method1611((byte) -23);
                        }
                    } else if (var2.field1743 == 1) {
                        var2.field1739 = var2.field1748.method1211((int) var2.field4061, (byte) -123);
                        class48 var4 = class239.field4123;
                        synchronized (class239.field4123) {
                            class20.field366.method376((byte) 13, var2);
                        }
                    }
                    Object var6 = class265.field4634;
                    synchronized (class265.field4634) {
                        if (class134.field2368 <= 1) {
                            class134.field2368 = 0;
                            class265.field4634.notifyAll();
                            return;
                        }
                        class134.field2368 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class243.method1678((String) null, var17, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public static final void method1352(int arg0, int arg1, int arg2) {
        class235.field4053 = true;
        class204.field3488 = arg0;
        class157.field2856 = arg1;
        class71.field1130 = arg2;
        class200.field3435 = -1;
        class4.field47 = -1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1353(byte arg0) {
        field3410 = null;
        if (arg0 != -2) {
            field3405 = -77L;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public static final void method1354(byte arg0) {
        if (arg0 != -25) {
            method1353((byte) 101);
        }
        if (class75.field1328 != null) {
            class75.field1328.method790(false);
        }
        field3404++;
    }
}
