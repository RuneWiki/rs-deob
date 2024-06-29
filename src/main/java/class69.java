import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class69 {

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
    public static int[] field1096 = new int[32];

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field1093 = -1;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lma;")
    private static class5 field1094 = class12.method119("Attack", (byte) 91);

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Lma;")
    public static class5 field1097 = class12.method119("Musik)2Engine vorbereitet)3", (byte) 123);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[S")
    public static short[] field1089 = new short[256];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[Lma;")
    public static class5[] field1088 = new class5[8];

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Lma;")
    public static class5 field1099 = field1094;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "Lni;")
    public static class202 field1095;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lpg;")
    public static class295 field1090;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 5)
    public static void method495(int arg0) {
        field1097 = null;
        field1095 = null;
        if (arg0 != 31265) {
            field1089 = (short[]) null;
        }
        field1099 = null;
        field1096 = null;
        field1094 = null;
        field1088 = null;
        field1089 = null;
        field1090 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 25)
    public static final void method496(byte arg0) {
        class113.field1686 = new class218();
        if (arg0 != -26) {
            field1094 = (class5) null;
        }
        field1091++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILma;ILma;)V", line = 57)
    public static final void method497(int arg0, class5 arg1, int arg2, class5 arg3) {
        if (arg0 != 24077) {
            method497(-13, (class5) null, 68, (class5) null);
        }
        class238.method1682(-1, arg3, (class5) null, (byte) -60, arg2, arg1);
        field1092++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 69)
    public static final void method498(boolean arg0) {
        class45.method319();
        field1098++;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class246.method1724((byte) -64, class147.field2141);
        class165.method1106((byte) 121, class147.field2141);
        if (class278.field4721 != null) {
            class278.field4721.method904(class147.field2141, 23375);
        }
        class214.method1413(115);
        class67.method476(-118, class147.field2141);
        class91.method598(32, class147.field2141);
        if (class278.field4721 != null) {
            class278.field4721.method903(99, class147.field2141);
        }
        class127.method854(arg0);
        class45.method307(class147.field2141, class86.field1300 * 2);
        class279.method1894((byte) 18);
        class265.method1821((byte) -91);
        class171.field2626 = 0L;
    }
}
