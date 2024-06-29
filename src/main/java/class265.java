import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class265 {

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field3291 = class681.method3859(-51);

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Ljava/lang/String;")
    public String field3293;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/lang/String;")
    public String field3288;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Ljava/lang/String;")
    public String field3296;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Ljava/lang/String;")
    public String field3302;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Ljava/lang/String;")
    public String field3298;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "F")
    public static float field3292 = 1.0F;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Lbq;")
    public static class289 field3289 = new class289();

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Lig;")
    public static class244 field3303;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static final void method1595(int arg0) {
        class284.field3468.method3549(0);
        if (arg0 != -1) {
            method1595(-7);
        }
        field3297++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;BIILjava/lang/String;Ljava/lang/String;I)V")
    public final void method1596(String arg0, String arg1, String arg2, byte arg3, int arg4, int arg5, String arg6, String arg7, int arg8) {
        field3300++;
        this.field3291 = class681.method3859(-51);
        this.field3294 = arg5;
        this.field3299 = class392.field5398;
        this.field3290 = arg8;
        this.field3295 = arg4;
        this.field3298 = arg6;
        this.field3288 = arg0;
        this.field3302 = arg2;
        this.field3296 = arg1;
        this.field3293 = arg7;
        if (arg3 != -36) {
            this.field3291 = -99;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method1597(byte arg0) {
        if (arg0 != 83) {
            method1595(99);
        }
        field3289 = null;
        field3303 = null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static final void method1598(int arg0) {
        if (arg0 != -23030) {
            return;
        }
        class688.field9708 = null;
        class649.field9281 = -1;
        class71.field759 = -1;
        class541.field7790 = null;
        class227.field2589 = null;
        class3.field27 = -1;
        class11.field87 = null;
        class574.field8144 = null;
        class624.field8947 = null;
        class308.field3828 = -1;
        class151.field1667 = null;
        field3301++;
        class413.field5628.method3967((byte) -127);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class265(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field3293 = arg5;
        this.field3290 = arg6;
        this.field3288 = arg3;
        this.field3294 = arg0;
        this.field3296 = arg2;
        this.field3295 = arg1;
        this.field3302 = arg4;
        this.field3299 = class392.field5398;
        this.field3298 = arg7;
    }
}
