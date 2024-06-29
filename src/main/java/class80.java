import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class80 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1537 = -1;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lqe;")
    public static class179 field1540 = class206.method1380("Ung-Ultige Session)2ID)3", (byte) 40);

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1543 = 0;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1545 = 0;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lee;")
    public static class49 field1539;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)J")
    public static final synchronized long method504(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != -1) {
            method505((byte) -83);
        }
        if (var1 < class133.field2416) {
            class133.field2417 += class133.field2416 - var1;
        }
        field1541++;
        class133.field2416 = var1;
        return class133.field2417 + var1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method505(byte arg0) {
        int var1 = 36 % ((arg0 - 70) / 37);
        field1540 = null;
        field1539 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Leh;Lqe;ZLeh;Lqe;)Lod;")
    public static final class156 method506(class52 arg0, class179 arg1, boolean arg2, class52 arg3, class179 arg4) {
        field1544++;
        int var5 = arg3.method359(-1, arg1);
        int var6 = arg3.method362(-9, var5, arg4);
        return arg2 ? null : class54.method372(var5, arg3, -99, var6, arg0);
    }
}
