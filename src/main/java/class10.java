import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class10 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Z")
    public static boolean field138 = false;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lve;")
    public static class255 field136 = class87.method607(107, "<col=ffb000>");

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Lve;")
    public static class255 field139 = class87.method607(81, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
    public static int[] field145 = new int[2048];

    @OriginalMember(owner = "client!em", name = "k", descriptor = "[I")
    public static int[] field146 = new int[100];

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field140 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!em", name = "n", descriptor = "[I")
    public static int[] field149 = new int[32];

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Lwl;")
    public static class81 field148 = new class81(64);

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Lsl;", line = 7)
    public static final class91 method51(int arg0, int arg1, int arg2) {
        field142++;
        class91 var3 = (class91) class284.field4884.method1471((byte) 70);
        if (arg0 != 32) {
            method51(106, 118, -24);
        }
        while (var3 != null) {
            if (var3.field1571 && var3.method684(2, arg1, arg2)) {
                return var3;
            }
            var3 = (class91) class284.field4884.method1475((byte) 83);
        }
        return null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 45)
    public static final void method52(int arg0) {
        field137++;
        if (arg0 != 32) {
            field138 = false;
        }
        class70.field1116.method554(0);
        class256.field4371.method554(0);
        class14.field203.method554(0);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 69)
    public static void method53(boolean arg0) {
        field145 = null;
        field149 = null;
        if (arg0) {
            method53(true);
        }
        field148 = null;
        field140 = null;
        field139 = null;
        field146 = null;
        field136 = null;
    }
}
