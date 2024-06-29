import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class418 {

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field6294;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field6297;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field6295;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Z")
    public static boolean field6298 = false;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lclient;")
    public static client field6296;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lo;")
    public static class24[] field6291;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static void method2557(boolean arg0) {
        if (arg0) {
            field6293 = 124;
        }
        field6296 = null;
        field6291 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZI)V")
    public abstract void method1302(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BII)V")
    public abstract void method1300(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
    public static int method2558(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(III)V")
    public class418(int arg0, int arg1, int arg2) {
        this.field6294 = arg0;
        this.field6297 = arg1;
        this.field6295 = arg2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ)V")
    public static final void method2559(int arg0, int arg1, boolean arg2) {
        field6292++;
        if (arg0 == 0) {
            class262.field4006 = class288.method1807(class497.field7305, arg0, class262.field4007, class186.field2990.field2542 * 2, arg1, class173.field2792);
        } else {
            if (arg2) {
                class262.field4006 = class288.method1807(class497.field7305, 0, class262.field4007, 0, arg1, class173.field2792);
                class262.field4006.method294(0);
                class470 var3 = class299.method1929(0, class387.field5664, arg1 + 79, class483.field7117);
                class317 var4 = class262.field4006.method357(var3, class340.method2146(class455.field6758, class387.field5664, 0), true);
                class361.method2216((byte) -59, true, var4, class166.field2685.method1977(class146.field2452, -124));
                class262.field4006.method355();
                class183.method1253(arg1 + 123);
                class262.field4006.method1802((byte) -65);
            }
            try {
                class262.field4006 = class288.method1807(class497.field7305, arg0, class262.field4007, class186.field2990.field2542 * 2, arg1, class173.field2792);
                if (class262.field4006.method284()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class15 var6;
                    if (var5) {
                        var6 = class262.field4006.method404(146800640);
                    } else {
                        var6 = class262.field4006.method404(104857600);
                    }
                    class262.field4006.method432(var6);
                }
            } catch (Throwable var8) {
                arg0 = 0;
                class262.field4006 = class288.method1807(class497.field7305, 0, class262.field4007, 0, 0, class173.field2792);
            }
        }
        class133.field2236 = arg0;
        class258.method1664(arg1 + 18915);
        if (!class262.field4006.method351()) {
            class327.field4949 = 1;
        }
        class262.field4006.method358(class327.field4949);
        class262.field4006.method316(arg1);
        class262.field4006.method346(8);
        class123.field2143 = class262.field4006.method399();
        class535.field7858 = class262.field4006.method399();
        class368.method2256((byte) 110);
        class262.field4006.method287(!class186.field2990.field2558);
        if (class262.field4006.method338()) {
            class27.method193(0, class186.field2990.field2530);
        }
        class508.method3045(class484.field7129 >> 3, class262.field4006, 191, class339.field5099 >> 3);
        class237.method1550((byte) -115);
        class1.field46 = false;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
    public abstract void method1301(int arg0, int arg1, int arg2);
}
