import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class305 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field4844 = -1;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lvc;")
    public static class171 field4841;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Z")
    public static boolean field4842;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method2053(int arg0) {
        if (arg0 != 14994) {
            field4841 = null;
        }
        field4841 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static final void method2054(int arg0) {
        field4839++;
        if (arg0 >= 94) {
            class362.field5525.method335((byte) 105);
            class121.field1663.method335((byte) 67);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
    public static final void method2055(int arg0, int arg1) {
        class397.field5939 = arg1;
        field4843++;
        class52 var2 = class410.field6080;
        synchronized (class410.field6080) {
            class410.field6080.method335((byte) 77);
            if (arg0 != 26504) {
                field4841 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)B")
    public static final byte method2056(byte arg0, int arg1, int arg2) {
        if (arg0 != 74) {
            method2053(32);
        }
        field4840++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
