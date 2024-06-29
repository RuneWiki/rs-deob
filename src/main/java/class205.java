import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class205 extends class49 {

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "[I")
    public static int[] field3296 = new int[8];

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3297 = null;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3300 = "glow2:";

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "[I")
    public static int[] field3303 = new int[2];

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lgi;")
    public static class164 field3299;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public static final void method1418(int arg0) {
        field3298++;
        class153.field2445.method1873(-7401);
        if (arg0 != 24989) {
            field3297 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method1419(int arg0, byte arg1, String arg2) {
        class291 var3 = class61.method389(arg0, 3, 0);
        field3302++;
        var3.method2009(-67);
        var3.field4774 = arg2;
        if (arg1 <= 54) {
            method1419(25, (byte) -11, (String) null);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;JIIIILjava/lang/String;S)V")
    public static final void method1420(String arg0, long arg1, int arg2, int arg3, int arg4, int arg5, String arg6, short arg7) {
        field3301++;
        if (arg2 <= 100) {
            method1419(16, (byte) -56, (String) null);
        }
        if (class41.field633 || class291.field4776 >= 500) {
            return;
        }
        class188.field3083[class291.field4776] = arg0;
        class226.field3550[class291.field4776] = arg6;
        class275.field4502[class291.field4776] = arg5 == -1 ? class184.field3061 : arg5;
        class26.field478[class291.field4776] = arg7;
        class215.field3392[class291.field4776] = arg1;
        class242.field3840[class291.field4776] = arg3;
        class144.field2320[class291.field4776] = arg4;
        class291.field4776++;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public static void method1421(int arg0) {
        field3296 = null;
        field3303 = null;
        if (arg0 > -77) {
            method1421(-119);
        }
        field3300 = null;
        field3299 = null;
        field3297 = null;
    }
}
