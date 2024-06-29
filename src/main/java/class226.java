import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class226 {

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public int field3032;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "Lmba;")
    public static class646 field3034;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
    public static final void method1334(byte arg0) {
        class690 var1 = class63.field980;
        synchronized (class63.field980) {
            if (arg0 != -116) {
                field3034 = null;
            }
            class63.field980.method3906(arg0 + 8);
        }
        field3036++;
    }

    @OriginalMember(owner = "client!gga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3035++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(II)V")
    public class226(int arg0, int arg1) {
        this.field3032 = arg0;
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)V")
    public static void method1335(byte arg0) {
        field3034 = null;
        if (arg0 != 124) {
            field3034 = null;
        }
    }
}
