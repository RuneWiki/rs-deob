import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class64 implements class276 {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lbe;")
    private static class283 field881 = class153.method941(-58, "Loading fonts )2 ");

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lbe;")
    public static class283 field886 = field881;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lbe;")
    public static class283 field887 = class153.method941(14, "event_opbase");

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lbe;")
    public static class283 field883 = class153.method941(-104, "Okay");

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lek;")
    public static class172 field882;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lkg;")
    public static class69 field880;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI[II)Lbe;", line = 18)
    public final class283 method408(long arg0, int arg1, int[] arg2, int arg3) {
        field884++;
        if (arg3 != 126) {
            field883 = (class283) null;
        }
        if (arg1 == 0) {
            class140 var6 = class202.method1292(arg2[0], (byte) -128);
            return var6.method884((int) arg0, -47);
        } else if (arg1 == 1 || arg1 == 10) {
            class304 var7 = class103.method676((int) arg0, -1);
            return var7.field5155;
        } else if (arg1 == 6 || arg1 == 7) {
            return class202.method1292(arg2[0], (byte) -95).method884((int) arg0, arg3 ^ 0xFFFFFFD9);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I", line = 49)
    public static final int method409(int arg0, int arg1) {
        if (arg0 < 0) {
            return 23;
        }
        field889++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 72)
    public static void method410(boolean arg0) {
        if (!arg0) {
            field882 = (class172) null;
        }
        field883 = null;
        field887 = null;
        field881 = null;
        field882 = null;
        field886 = null;
        field880 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)I", line = 93)
    public static final int method411(int arg0, int arg1, byte arg2) {
        field888++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 <= 43) {
            method412((byte) -102, 55);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V", line = 143)
    public static final void method412(byte arg0, int arg1) {
        field879++;
        class270.field4564.method1637(true, arg1);
        class148.field2414.method1637(true, arg1);
        class30.field452.method1637(true, arg1);
        int var2 = -127 % ((35 - arg0) / 49);
    }
}
