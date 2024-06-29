import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class30 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lcd;")
    private static class23 field652 = class54.method414("Members only world", -1);

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lcd;")
    public static class23 field651 = field652;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[I")
    public static int[] field653 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lfa;")
    public static class47 field647;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lkh;")
    public static class97 field650;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lkh;")
    public static class97 field655;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILfa;)Lcd;")
    public static final class23 method223(int arg0, int arg1, class47 arg2) {
        field654++;
        if (!method227(arg1, 4095, class141.method909(arg2, -122)) && arg2.field1142 == null) {
            return null;
        } else if (arg2.field1039 == null || arg2.field1039.length <= arg1 || arg2.field1039[arg1] == null || arg2.field1039[arg1].method139(-13).method143(-41) == 0) {
            return class57.field1338 ? class3.method14(true, new class23[] { class21.field430, class184.method1132(-1, arg1) }) : null;
        } else {
            if (arg0 <= 122) {
                method224((byte) 126);
            }
            return arg2.field1039[arg1];
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)J")
    public static final synchronized long method224(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != 95) {
            method227(-18, -115, 34);
        }
        field648++;
        if (var1 < class175.field3494) {
            class23.field498 += class175.field3494 - var1;
        }
        class175.field3494 = var1;
        return var1 + class23.field498;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JB)V")
    public static final void method225(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field656++;
        if (arg1 > -77) {
            method225(-59L, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method226(int arg0) {
        field651 = null;
        field650 = null;
        field655 = null;
        if (arg0 == 4194303) {
            field653 = null;
            field647 = null;
            field652 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
    public static final boolean method227(int arg0, int arg1, int arg2) {
        if (arg1 != 4095) {
            field651 = null;
        }
        field646++;
        return (arg2 >> arg0 + 1 & 0x1) != 0;
    }
}
