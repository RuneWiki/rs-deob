import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class116 extends class510 {

    @OriginalMember(owner = "client!hu", name = "P", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!hu", name = "R", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!hu", name = "S", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!hu", name = "T", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!hu", name = "Q", descriptor = "[Lf;")
    public static class702[] field1586;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)V", line = 4)
    public static void method825(int arg0) {
        field1586 = null;
        if (arg0 >= -112) {
            field1586 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)V", line = 14)
    public static final void method826(int arg0) {
        field1589++;
        if (class36.method313(class285.field3921, arg0 ^ 0x2CF1) || class680.method3860(arg0 - 1992, class285.field3921)) {
            class525.method2991(class11.field114 >> 12, class666.field9335 >> 12, true, 5000);
        } else {
            int var1 = class143.field2063.field1807[0] >> 3;
            int var2 = class143.field2063.field1801[0] >> 3;
            if (var1 >= 0 && class401.field5620 >> 3 > var1 && var2 >= 0 && var2 < (class257.field3508 >> 3)) {
                class525.method2991(var2, var1, true, 5000);
            } else {
                class525.method2991(class257.field3508 >> 4, class401.field5620 >> 4, true, 0);
            }
        }
        class485.method2757(true);
        class593.method3353(false);
        if (arg0 == 2000) {
            class328.method1953(-61);
            class127.method908(arg0 - 2001);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)Ljba;", line = 47)
    public static final class364 method827(byte arg0) {
        field1585++;
        if (arg0 != -96) {
            field1586 = null;
        }
        return class224.field3124;
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)Z", line = 58)
    public static final boolean method828(int arg0) {
        field1588++;
        class401 var1 = class588.field8265.field3151.field5621;
        if (var1 == null || class588.field8265.field3151 == var1) {
            return false;
        }
        class499 var2 = (class499) var1;
        if (var2.field6780 >= 2000) {
            var2.field6780 -= 2000;
        }
        if (arg0 != 1006094723) {
            method825(13);
        }
        return var2.field6780 == 1011;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z[B)Z", line = 87)
    public static final boolean method829(boolean arg0, byte[] arg1) {
        field1587++;
        class501 var2 = new class501(arg1);
        if (!arg0) {
            return true;
        }
        int var3 = var2.method2874((byte) -75);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2874((byte) -75) == 1;
        if (var4) {
            class629.method3518(var2, true);
        }
        class42.method366(var2, 0);
        return true;
    }
}
