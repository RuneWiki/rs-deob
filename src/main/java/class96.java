import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class96 {

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Lcg;")
    public static class293 field1187;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I", line = 4)
    public static final int method470(int arg0, int arg1) {
        field1186++;
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            if (arg0 != 255) {
                method470(-124, -101);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V", line = 23)
    public static final void method471(byte arg0) {
        if (arg0 > -43) {
            field1190 = -118;
        }
        field1188++;
        if (class432.field6253 > 0) {
            class100.method491((byte) 123);
        } else {
            class79.field951 = class322.field4655;
            class322.field4655 = null;
            class404.method2413(false, 40);
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V", line = 43)
    public static final void method472(byte arg0) {
        class438.field6287 = null;
        class413.field5879 = null;
        field1189++;
        class46.field601 = null;
        class475.field6674 = false;
        class168.field1993 = null;
        class22.field304 = null;
        if (arg0 > 64) {
            class415.method2469((byte) 121);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V", line = 63)
    public static void method473(boolean arg0) {
        if (!arg0) {
            field1187 = null;
        }
        field1187 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 77)
    public static final void method474(int arg0) {
        class297.field4433 = null;
        class372.field5326 = null;
        class470.field6629 = null;
        class127.field1559 = false;
        class206.field2812 = null;
        class334.field4780 = null;
        if (arg0 >= -53) {
            field1190 = -79;
        }
        field1185++;
    }
}
