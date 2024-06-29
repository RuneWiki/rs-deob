import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class94 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Loc;")
    public static class151 field1755 = class137.method873(2, "null");

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Z")
    public static boolean field1756 = false;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Loc;")
    public static class151 field1760 = class137.method873(2, "loc)3dat");

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field1761 = 0;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1763 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Loc;")
    public static class151 field1764 = class137.method873(2, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Ls;")
    public static class188 field1753;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "[[[B")
    public static byte[][][] field1759;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBILsd;)Lcg;")
    public static final class30 method598(int arg0, byte arg1, int arg2, class192 arg3) {
        int var4 = 124 / ((arg1 + 50) / 32);
        field1757++;
        return class204.method1291(0, arg0, arg3, arg2) ? class148.method938(64) : null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static final void method599(int arg0) {
        class212 var1 = (class212) class180.field3257.method1358(-29726);
        if (arg0 != 0) {
            field1755 = null;
        }
        while (var1 != null) {
            if (var1.field3720 == -1) {
                var1.field3725 = 0;
                class212.method1329(-127, var1);
            } else {
                var1.method636(73);
            }
            var1 = (class212) class180.field3257.method1360(true);
        }
        field1754++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public static void method600(boolean arg0) {
        field1755 = null;
        field1763 = null;
        field1759 = null;
        field1764 = null;
        field1760 = null;
        if (arg0) {
            method601(0, null);
        }
        field1753 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILwa;)Lcf;")
    public static final class29 method601(int arg0, class229 arg1) {
        field1758++;
        if (arg0 != 128) {
            method601(5, null);
        }
        return new class29(arg1.method1466(12435), arg1.method1466(12435), arg1.method1466(12435), arg1.method1466(12435), arg1.method1450(-23209), arg1.method1450(-23209), arg1.method1475(arg0 + 127));
    }
}
