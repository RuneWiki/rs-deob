import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class66 extends class280 {

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Ljava/lang/String;")
    public String field968;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Ljava/lang/String;")
    public static String field966 = "white:";

    @OriginalMember(owner = "client!e", name = "q", descriptor = "S")
    public static short field967 = 1;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    public static void method472(int arg0) {
        field966 = null;
        if (arg0 != -25046) {
            field966 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILqi;)Z")
    public static final boolean method473(int arg0, class131 arg1) {
        field965++;
        if (arg1.field2005 == 205) {
            class110.field1584 = 250;
            return true;
        } else {
            return arg0 != 1;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JI)V")
    public static final void method474(long arg0, int arg1) {
        field970++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != 1) {
            field967 = -35;
        }
        for (int var3 = 0; var3 < class180.field2895; var3++) {
            if (class81.field1177[var3] == arg0) {
                class180.field2895--;
                for (int var4 = var3; var4 < class180.field2895; var4++) {
                    class81.field1177[var4] = class81.field1177[var4 + 1];
                    class229.field3700[var4] = class229.field3700[var4 + 1];
                    class153.field2536[var4] = class153.field2536[var4 + 1];
                }
                class32.field399++;
                class76.field1089 = class231.field3717;
                class220.field3532.method557(109, 8);
                class220.field3532.method1069(arg0, arg1 - 64);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class66() {
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class66(String arg0, int arg1) {
        this.field968 = arg0;
    }
}
