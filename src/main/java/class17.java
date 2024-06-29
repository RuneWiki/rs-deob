import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class17 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static volatile int field234 = -1;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[S")
    public static short[] field239 = new short[256];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Loa;")
    public static class22 field243;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "[Lwj;")
    public static class270[] field242;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 4)
    public static final void method137(int arg0) {
        if (class265.field4119 < 0) {
            class265.field4119 = 0;
            class273.field4228 = -1;
            class54.field911 = -1;
        }
        if (class265.field4119 > class313.field4863) {
            class265.field4119 = class313.field4863;
            class54.field911 = -1;
            class273.field4228 = -1;
        }
        field236++;
        if (class128.field2024 < 0) {
            class54.field911 = -1;
            class273.field4228 = -1;
            class128.field2024 = 0;
        }
        if (class233.field3706 < class128.field2024) {
            class273.field4228 = -1;
            class54.field911 = -1;
            class128.field2024 = class233.field3706;
        }
        if (arg0 != -28707) {
            field238 = -29;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V", line = 45)
    public static final void method138(int arg0, int arg1) {
        if (arg0 != 9572) {
            method138(96, 11);
        }
        field235++;
        class301.field4706--;
        if (class301.field4706 == arg1) {
            return;
        }
        class343.method2371(class32.field468, arg1 + 1, class32.field468, arg1, class301.field4706 - arg1);
        class343.method2371(class275.field4252, arg1 + 1, class275.field4252, arg1, class301.field4706 - arg1);
        class343.method2378(class137.field2167, arg1 + 1, class137.field2167, arg1, class301.field4706 - arg1);
        class343.method2374(class233.field3689, arg1 + 1, class233.field3689, arg1, class301.field4706 - arg1);
        class343.method2377(class224.field3566, arg1 + 1, class224.field3566, arg1, class301.field4706 - arg1);
        class343.method2378(class307.field4774, arg1 + 1, class307.field4774, arg1, class301.field4706 - arg1);
        class343.method2378(class95.field1528, arg1 + 1, class95.field1528, arg1, class301.field4706 - arg1);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)Z", line = 78)
    public static final boolean method139(int arg0, int arg1) {
        field241++;
        if (arg1 != 19193) {
            return false;
        } else if (arg0 < 0) {
            return false;
        } else {
            int var2 = class233.field3689[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1003;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 110)
    public static void method140(int arg0) {
        field239 = null;
        field243 = null;
        if (arg0 == -1) {
            field242 = null;
        }
    }
}
