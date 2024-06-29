import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class470 {

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "I")
    public static int field6674 = 1;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "Lms;")
    public static class758 field6671 = new class758();

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "Lri;")
    public static class111 field6672;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "Lbr;")
    public static class393 field6666;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V")
    public static void method2804(byte arg0) {
        if (arg0 == -117) {
            field6666 = null;
            field6672 = null;
            field6671 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfl;")
    public static final class738 method2805(Throwable arg0, String arg1) {
        field6667++;
        class738 var2;
        if (arg0 instanceof class738) {
            var2 = (class738) arg0;
            var2.field10271 = var2.field10271 + ' ' + arg1;
        } else {
            var2 = new class738(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public static final void method2806(int arg0) {
        class287.field4061.method4023((byte) 19);
        if (arg0 >= 0) {
            field6675++;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)I")
    public static final int method2807(int arg0, int arg1) {
        int var2 = 122 % ((-arg0 - 32) / 53);
        field6670++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Z)V")
    public static final void method2808(boolean arg0) {
        class714 var1 = class689.field9415;
        synchronized (class689.field9415) {
            class689.field9415.method4023((byte) 121);
            if (!arg0) {
                field6668 = -127;
            }
        }
        field6673++;
    }
}
