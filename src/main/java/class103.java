import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class103 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "[[[Lb;")
    public static class48[][][] field2078 = new class48[4][104][104];

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lsg;")
    public static class30 field2079 = class167.method1221((byte) 33, ")1");

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lsg;")
    public static class30 field2084 = class167.method1221((byte) 33, ")0");

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[J")
    public static long[] field2083 = new long[200];

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lmc;BLmc;)V")
    public static final void method828(class151 arg0, byte arg1, class151 arg2) {
        class174.field3246 = arg2;
        field2080++;
        if (arg1 < 27) {
            method829(4);
        }
        class273.field4789 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I")
    public abstract int method550(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method829(int arg0) {
        field2079 = null;
        field2084 = null;
        field2083 = null;
        if (arg0 == 23726) {
            field2078 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)Lth;")
    public static final class68 method830(int arg0, int arg1, int arg2) {
        field2081++;
        class68 var3 = (class68) class262.field4629.method1168(arg1 - 7, (long) arg0 | (long) arg2 << 32);
        if (var3 == null) {
            var3 = new class68(arg2, arg0);
            class262.field4629.method1164((byte) 49, var3.field4215, var3);
        }
        if (arg1 != 4) {
            field2083 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lce;")
    public static final class205 method831(int arg0, int arg1) {
        if (arg0 == -17028) {
            field2077++;
            return class247.field4402 && arg1 >= class212.field3839 && arg1 <= class197.field3558 ? class236.field4223[arg1 - class212.field3839] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public abstract void method552(int arg0);
}
