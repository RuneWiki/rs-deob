import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class195 extends class23 {

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lqd;")
    public static class40 field3139 = class147.method1106("Schlie-8en", (byte) -50);

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lqd;")
    private static class40 field3138 = class147.method1106("wishes to trade with you)3", (byte) -61);

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "[I")
    public static int[] field3136 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "Lqd;")
    private static class40 field3146 = class147.method1106(" is already on your friend list)3", (byte) -85);

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lqd;")
    public static class40 field3143 = field3138;

    @OriginalMember(owner = "client!ea", name = "lb", descriptor = "[Lqd;")
    public static class40[] field3149 = new class40[1000];

    @OriginalMember(owner = "client!ea", name = "kb", descriptor = "Lqd;")
    public static class40 field3148 = field3146;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field3145;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "[Lhf;")
    public static class193[] field3137;

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 6)
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)I", line = 13)
    public static final int method1386(int arg0, int arg1) {
        field3140++;
        if (arg1 != 7306) {
            field3139 = (class40) null;
        }
        return arg0 == 16711935 ? -1 : class15.method88(arg0, false);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V", line = 29)
    public static final void method1387(int arg0, int arg1) {
        field3144++;
        class177 var2 = class177.method1310(arg0 + 113, arg0, arg1);
        var2.method1303((byte) 102);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)[I", line = 39)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 == -94) {
            field3141++;
            return class315.field5345;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V", line = 56)
    public static void method1388(byte arg0) {
        field3143 = null;
        field3145 = null;
        if (arg0 > -48) {
            method1386(-94, 10);
        }
        field3139 = null;
        field3136 = null;
        field3138 = null;
        field3137 = null;
        field3148 = null;
        field3146 = null;
        field3149 = null;
    }
}
