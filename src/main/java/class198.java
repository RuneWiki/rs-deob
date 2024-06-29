import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class198 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field3227 = 0;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field3229 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Z")
    public static boolean field3226 = false;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lsb;")
    public static class124 field3228;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lqa;")
    public static class73 field3231;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
    public static final void method1347(boolean arg0, int arg1) {
        if (arg0) {
            method1348(88);
        }
        class80.field1326 = -1;
        field3230++;
        class80.field1326 = -1;
        if (arg1 == 37) {
            class199.field3249 = 3.0F;
        } else if (arg1 == 50) {
            class199.field3249 = 4.0F;
        } else if (arg1 == 75) {
            class199.field3249 = 6.0F;
        } else if (arg1 == 100) {
            class199.field3249 = 8.0F;
            return;
        } else if (arg1 == 200) {
            class199.field3249 = 16.0F;
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method1348(int arg0) {
        if (arg0 != -1) {
            method1347(false, 60);
        }
        field3231 = null;
        field3228 = null;
    }
}
