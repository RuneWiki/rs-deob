import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class209 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field4007 = 0;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field4009 = -2;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
    public static boolean field4012 = false;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field4005 = 0;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
    public static int[] field4014 = new int[4000];

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Z")
    public static boolean field4013 = false;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Loe;")
    public static class137 field4010;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
    public static final boolean method1327(int arg0, int arg1, int arg2) {
        field4015++;
        if (arg1 < 73) {
            field4011 = -68;
        }
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILvb;IIIZI)V")
    public static final void method1328(int arg0, class197 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4006 = arg6;
        class113.field2045 = arg3;
        class111.field2011 = arg4;
        class175.field3325 = arg2;
        field4004++;
        class149.field2678 = arg5;
        class101.field1875 = arg0;
        class122.field2177 = arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1329(int arg0) {
        if (arg0 != 0) {
            field4010 = null;
        }
        field4010 = null;
        field4014 = null;
    }
}
