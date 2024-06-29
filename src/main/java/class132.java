import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class132 {

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2185 = "Continue";

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2182 = "Loading - please wait.";

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lng;")
    public static class78 field2181;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Llc;")
    public static class86 field2178;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[Lsi;")
    public static class204[] field2180;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
    public static final void method956(int arg0, int arg1) {
        class201 var2 = class94.method738(-69, arg0, 1);
        var2.method1475(-743577184);
        field2179++;
        int var3 = -121 / ((arg1 + 33) / 58);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method957(int arg0) {
        field2185 = null;
        field2180 = null;
        field2178 = null;
        field2181 = null;
        if (arg0 != 5495) {
            field2180 = null;
        }
        field2182 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Llc;I)V")
    public static final void method958(class86 arg0, int arg1) {
        field2186++;
        if (arg1 != 4) {
            field2178 = null;
        }
        class106.field1541 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method959(int arg0) {
        field2177++;
        class115.field1666.method1556((byte) 95);
        if (arg0 <= 63) {
            method957(103);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
    public static final void method960(int arg0, int arg1) {
        field2183++;
        if (arg0 > -47) {
            method958((class86) null, 91);
        }
        class235.field3794.method1548(arg1, 0);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)I")
    public static final int method961(int arg0) {
        field2184++;
        return arg0 <= 119 ? 25 : ((class139.field2246 ? 1 : 0) << 19) + ((class42.field595 ? 1 : 0) << 9) + ((class5.field40 ? 1 : 0) << 4) + ((class3.field29 ? 1 : 0) << 3) + ((class213.field3408 & 0x7) - -((class207.field3334 ? 1 : 0) << 5)) - (-((class206.field3314 ? 1 : 0) << 6) - (((class144.field2328 ? 1 : 0) << 7) - -((class84.field1224 ? 1 : 0) << 8) + (((class25.field287 ? 1 : 0) << 10) + ((class184.field2953 & 0x3) << 11) - (-((class269.field4338 ? 1 : 0) << 13) + -((class188.field3039 ? 1 : 0) << 15) - (((class23.field264 ? 1 : 0) << 16) - -(class256.field4221 << 17)))))) - (-((class171.field2757 == 0 ? 0 : 1) << 20) - ((class241.field3845 == 0 ? 0 : 1) << 21) + -((class212.field3402 == 0 ? 0 : 1) << 22) + -(class157.method1161() << 23));
    }
}
