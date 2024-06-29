import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class20 extends class61 {

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "[B")
    public byte[] field269;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "Z")
    public static boolean field270 = false;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "Lwm;")
    private static class152 field271 = class157.method1048("", 95);

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "Lwm;")
    public static class152 field262 = field271;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "[Luj;")
    public static class141[] field272 = new class141[14];

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "Lka;")
    public static class188 field265;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)Lwm;", line = 6)
    public static final class152 method123(byte arg0, int arg1) {
        field268++;
        class152 var2 = class38.method280(71, arg1);
        if (arg0 < 47) {
            return (class152) null;
        }
        for (int var3 = var2.method1000(0) - 3; var3 > 0; var3 -= 3) {
            var2 = class195.method1307(new class152[] { var2.method1015(0, 19197, var3), class140.field2126, var2.method983((byte) 88, var3) }, (byte) 29);
        }
        if (var2.method1000(0) > 9) {
            return class195.method1307(new class152[] { class213.field3486, var2.method1015(0, 19197, var2.method1000(0) - 8), class197.field3169, class74.field1071, var2, class63.field951 }, (byte) 29);
        } else if (var2.method1000(0) <= 6) {
            return class195.method1307(new class152[] { class314.field5441, var2, class307.field5279 }, (byte) 29);
        } else {
            return class195.method1307(new class152[] { class238.field3909, var2.method1015(0, 19197, var2.method1000(0) - 4), class193.field3063, class74.field1071, var2, class63.field951 }, (byte) 29);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V", line = 35)
    public static final void method124(byte arg0) {
        field264++;
        if (class37.field618 == 5) {
            class37.field618 = 6;
            if (arg0 <= 110) {
                field265 = (class188) null;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)V", line = 52)
    public static void method125(byte arg0) {
        field265 = null;
        field262 = null;
        field271 = null;
        if (arg0 != 70) {
            method124((byte) 85);
        }
        field272 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)I", line = 72)
    public static final int method126(boolean arg0) {
        if (!arg0) {
            field262 = (class152) null;
        }
        field267++;
        return 6;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILah;Lah;Lah;Lah;)V", line = 100)
    public static final void method127(int arg0, class205 arg1, class205 arg2, class205 arg3, class205 arg4) {
        class160.field2547 = arg4;
        class176.field2837 = arg3;
        class23.field408 = arg2;
        class174.field2794 = arg1;
        if (arg0 != 6) {
            field270 = true;
        }
        field263++;
        class215.field3501 = new class127[class23.field408.method1380((byte) 12)][];
        class132.field2005 = new boolean[class23.field408.method1380((byte) 12)];
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "([B)V", line = 117)
    public class20(byte[] arg0) {
        this.field269 = arg0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lwm;B)I", line = 131)
    public static final int method128(class152 arg0, byte arg1) {
        field266++;
        if (class194.field3086 == null || arg0.method1000(0) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class194.field3086.field4773; var2++) {
            if (class194.field3086.field4766[var2].method987(class114.field1617, class26.field449, -1).method1003(22008, arg0)) {
                return var2;
            }
        }
        if (arg1 != 76) {
            method123((byte) -71, -22);
        }
        return -1;
    }
}
