import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class87 {

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[S")
    public static short[] field1564 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lcf;")
    public static class93 field1563 = class147.method1066("l", -48);

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1566 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lcd;")
    public static class27 field1565;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[Lwh;")
    public static class193[] field1567;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZI)I")
    public static final int method594(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1564 = null;
        }
        field1561++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method595(int arg0) {
        if (arg0 != 1) {
            method596(-13, (class177) null, (class177) null, (class177) null, (class177) null);
        }
        field1564 = null;
        field1565 = null;
        field1567 = null;
        field1563 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILhg;Lhg;Lhg;Lhg;)V")
    public static final void method596(int arg0, class177 arg1, class177 arg2, class177 arg3, class177 arg4) {
        class49.field790 = arg1;
        class195.field3550 = arg3;
        class264.field4714 = arg4;
        if (arg0 != 0) {
            method595(-70);
        }
        field1562++;
        class126.field2241 = arg2;
        class6.field82 = new class181[class264.field4714.method1279(~arg0)][];
        class205.field3690 = new boolean[class264.field4714.method1279(~arg0)];
    }
}
