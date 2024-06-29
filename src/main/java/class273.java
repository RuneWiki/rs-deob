import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class273 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field3443 = 0;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field3449 = 0;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "[I")
    public static int[] field3450 = new int[3];

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "F")
    public static float field3444;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!lt", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field3446++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method1566(boolean arg0) {
        field3445++;
        if (class51.field774 != -1) {
            class239.method1431(class51.field774, -1, -1, false, -1);
            class51.field774 = -1;
        }
        if (arg0) {
            field3444 = -1.7855922F;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method1567(int arg0, int arg1, int arg2) {
        field3447++;
        if (arg1 == 1024) {
            return (arg0 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V", line = 46)
    public static void method1568(byte arg0) {
        field3450 = null;
        int var1 = -122 / ((39 - arg0) / 50);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)V", line = 58)
    public static final void method1569(byte arg0, int arg1) {
        field3448++;
        for (class329 var2 = class39.field523.method407((byte) 124); var2 != null; var2 = class39.field523.method403(12561)) {
            if ((var2.field4199 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method1871(-69);
            }
        }
        if (arg0 != 79) {
            method1567(-22, -36, -30);
        }
    }
}
