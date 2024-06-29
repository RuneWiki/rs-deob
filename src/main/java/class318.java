import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class318 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4789 = "skill: ";

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field4792 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[Lin;")
    public static class177[] field4793;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4791;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)I", line = 13)
    public static final int method2222(int arg0, byte arg1) {
        if (arg1 == 85) {
            field4790++;
            return arg0 >>> 7;
        } else {
            return -58;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 25)
    public static void method2223(boolean arg0) {
        field4789 = null;
        field4791 = null;
        if (arg0) {
            field4793 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lph;IIB)[Lin;", line = 62)
    public static final class177[] method2224(class361 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -109) {
            method2224((class361) null, -23, -55, (byte) 123);
        }
        field4787++;
        return class62.method508(0, arg1, arg2, arg0) ? class20.method126(-28044) : null;
    }
}
