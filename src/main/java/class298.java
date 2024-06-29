import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class298 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Z")
    public static boolean field4599 = false;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field4598 = 0;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Z")
    public static boolean field4600 = true;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "S")
    public static short field4601 = 256;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4602 = "";

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Ll;")
    public static class133 field4597;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 21)
    public static final void method2019(int arg0, int arg1) {
        field4604++;
        if (arg0 != -20330) {
            field4597 = (class133) null;
        }
        class338 var2 = class195.method1391(5, (byte) -92, arg1);
        var2.method2347(true);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V", line = 52)
    public static final void method2020(int arg0, int arg1) {
        if (arg0 != -11288) {
            field4599 = false;
        }
        field4603++;
        class73.field1193.method2175(arg1, -1401253017);
        class152.field2284.method2175(arg1, -1401253017);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 64)
    public static void method2021(int arg0) {
        if (arg0 <= -84) {
            field4597 = null;
            field4602 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 74)
    public static final void method2022(boolean arg0) {
        if (arg0) {
            class256.field4013 = class316.field4940;
            class218.field3321 = class119.field1816;
            class84.field1307 = class19.field254;
        } else {
            class256.field4013 = class34.field528;
            class218.field3321 = class216.field3293;
            class84.field1307 = class184.field2766;
        }
        class273.field4226 = class256.field4013.length;
    }
}
