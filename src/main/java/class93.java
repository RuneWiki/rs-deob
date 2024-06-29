import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class93 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1569 = 500;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Lph;")
    public static class229 field1571 = class266.method1858("clignotant1:", 0);

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lph;")
    public static class229 field1575 = class266.method1858("blaugr-Un:", 0);

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lph;")
    public static class229 field1573 = class266.method1858("n", 0);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I", line = 4)
    public static final int method696(int arg0, int arg1, int arg2) {
        field1577++;
        int var3 = arg0 + (arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        if (arg1 < 62) {
            return -10;
        } else {
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            return (var5 & 0x7FAF52E) >> 19;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 34)
    public static void method697(int arg0) {
        field1575 = null;
        field1571 = null;
        int var1 = -89 / ((-arg0 - 82) / 37);
        field1573 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V", line = 76)
    public static final void method698(int arg0, int arg1) {
        field1572++;
        class281 var2 = class135.method957(0, arg1, 11);
        if (arg0 == 500) {
            var2.method1933(0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V", line = 97)
    public static final void method699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class192.field3172 <= arg6 - arg2 && arg2 + arg6 <= class77.field1289 && arg5 - arg2 >= class206.field3398 && arg2 + arg5 <= class214.field3533) {
            class111.method852(arg2, arg5, 0, arg6, arg3, arg0, arg4);
        } else {
            class17.method105(arg5, arg0, arg1 ^ 0xFFFFA7BE, arg6, arg3, arg4, arg2);
        }
        field1578++;
        if (arg1 != -22594) {
            field1573 = (class229) null;
        }
    }
}
