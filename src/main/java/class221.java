import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class221 extends class213 {

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field3967 = 0;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3966 = 0;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3964 = Calendar.getInstance();

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lvf;")
    public static class265 field3969 = class87.method582(-46, " x ");

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field3970 = 0;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lvf;")
    public static class265 field3971 = class87.method582(-46, "Polices charg-Bes");

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lrd;")
    public static class145 field3962;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lfl;")
    public static class192 field3960;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lfl;")
    public static class192 field3963;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field3962 = null;
        field3960 = null;
        field3964 = null;
        field3963 = null;
        if (arg0 != -16471) {
            field3971 = null;
        }
        field3971 = null;
        field3969 = null;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public static final void method1511(byte arg0) {
        field3965++;
        if (arg0 != 100 || class218.field3927 != null || class207.field3722 != null) {
            return;
        }
        int var1 = class141.field2620;
        if (!class50.field1049) {
            if (var1 == 1 && class120.field2129 > 0) {
                short var12 = class118.field2079[class120.field2129 - 1];
                if (var12 == 59 || var12 == 17 || var12 == 42 || var12 == 13 || var12 == 10 || var12 == 11 || var12 == 32 || var12 == 26 || var12 == 4 || var12 == 14 || var12 == 22 || var12 == 1003) {
                    int var13 = class1.field4[class120.field2129 - 1];
                    int var14 = class170.field3070[class120.field2129 - 1];
                    class6 var15 = class21.method204(var14, -16257);
                    if (class118.method797((byte) -92, client.method1474(var15)) || class119.method800((byte) -39, client.method1474(var15))) {
                        class77.field1474 = false;
                        class137.field2494 = 0;
                        if (class218.field3927 != null) {
                            class176.method1145((byte) 103, class218.field3927);
                        }
                        class218.field3927 = class21.method204(var14, -16257);
                        class208.field3747 = var13;
                        class272.field4832 = class192.field3427;
                        class25.field692 = class122.field2193;
                        class176.method1145((byte) 61, class218.field3927);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class143.field2659 == 1 && class120.field2129 > 2 || class195.method1349(class120.field2129 - 1, 31955))) {
                var1 = 2;
            }
            if (var1 == 2 && class120.field2129 > 0 || class183.field3286 == 1) {
                class163.method1080((byte) 90);
            }
            if ((var1 != 1 || class120.field2129 <= 0) && class183.field3286 != 2) {
                return;
            }
            class267.method1820(false);
            return;
        }
        if (var1 != 1) {
            int var2 = class268.field4722;
            int var3 = class79.field1497;
            if (class130.field2335 - 10 > var3 || var3 > class130.field2335 + class279.field4926 + 10 || (class182.field3227 - 10) > var2 || (class182.field3227 + class172.field3103 + 10) < var2) {
                class50.field1049 = false;
                class169.method1117(arg0 ^ 0xFFFFFFBC, class172.field3103, class182.field3227, class130.field2335, class279.field4926);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class279.field4926;
        int var5 = class182.field3227;
        int var6 = class130.field2335;
        int var7 = class192.field3427;
        int var8 = -1;
        int var9 = class122.field2193;
        for (int var10 = 0; var10 < class120.field2129; var10++) {
            int var11;
            if (class97.field1711) {
                var11 = var5 + ((class120.field2129 - (var10 + 1)) * 15) + 35;
            } else {
                var11 = (class120.field2129 - var10 - 1) * 15 + var5 + 31;
            }
            if (var6 < var9 && var9 < var6 + var4 && (var11 - 13) < var7 && var7 < (var11 + 3)) {
                var8 = var10;
            }
        }
        if (var8 != -1) {
            class182.method1214(var8, (byte) 11);
        }
        class50.field1049 = false;
        class169.method1117(-44, class172.field3103, class182.field3227, class130.field2335, class279.field4926);
        return;
    }
}
