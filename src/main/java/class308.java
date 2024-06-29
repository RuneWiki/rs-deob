import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class308 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lts;")
    public static class357 field4662;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Ljava/lang/String;")
    public String field4663;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILlt;)V", line = 5)
    public static final void method1850(int arg0, class458 arg1) {
        field4661++;
        class146.field2370 = arg1;
        if (arg0 != 0) {
            method1851(14, -125, 90);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Z", line = 17)
    public static final boolean method1851(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field4659++;
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 38)
    public static void method1852(int arg0) {
        field4662 = null;
        if (arg0 < 58) {
            method1851(10, -112, -109);
        }
    }
}
