import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class71 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
    public static int[] field1266 = new int[4096];

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lqd;")
    private static class40 field1267 = class147.method1106("Your ignore list is full)3 Max of 100 users)3", (byte) -110);

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lqd;")
    public static class40 field1269 = field1267;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lqd;")
    public static class40 field1264 = class147.method1106("headicons_prayer", (byte) -112);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lqd;")
    public static class40 field1271 = class147.method1106("Musik)2Engine vorbereitet)3", (byte) -108);

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lqd;")
    public static class40 field1268 = class147.method1106("um", (byte) -117);

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1272 = 2;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 4)
    public static void method536(int arg0) {
        field1269 = null;
        field1264 = null;
        field1268 = null;
        field1266 = null;
        field1267 = null;
        field1271 = null;
        if (arg0 != 2) {
            method536(30);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLce;)V", line = 43)
    public static final void method537(byte arg0, class239 arg1) {
        field1263++;
        if (arg0 != -7) {
            field1270 = 31;
        }
        class247.field4084 = arg1.method1665(class89.field1613, (byte) -63);
        class7.field111 = arg1.method1665(class56.field1075, (byte) -14);
    }
}
