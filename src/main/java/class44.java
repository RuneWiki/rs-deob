import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class44 {

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "J")
    public static long field467 = 0L;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "[J")
    public static long[] field464 = new long[32];

    @OriginalMember(owner = "client!dja", name = "f", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!dja", name = "g", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!dja", name = "h", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "Laaa;")
    public class253 field465;

    @OriginalMember(owner = "client!dja", name = "e", descriptor = "Lkca;")
    public static class411 field468;

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "Ldja;")
    public class44 field466;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V", line = 18)
    public final void method347(int arg0) {
        field469++;
        if (class490.field6757 >= 500) {
            return;
        }
        this.field466 = class145.field1875;
        this.field465 = null;
        class490.field6757++;
        class145.field1875 = this;
        if (arg0 != -1) {
            this.field465 = null;
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(III)Z", line = 35)
    public static final boolean method348(int arg0, int arg1, int arg2) {
        field470++;
        if (arg2 != 13982) {
            field468 = null;
        }
        return (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(Z)V", line = 47)
    public static void method349(boolean arg0) {
        if (!arg0) {
            method350(75, -93);
        }
        field468 = null;
        field464 = null;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(II)V", line = 58)
    public static final void method350(int arg0, int arg1) {
        class571.field8023.method308(-1, arg1);
        if (arg0 <= 5) {
            field464 = null;
        }
        field471++;
    }
}
