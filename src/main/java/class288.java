import java.awt.Color;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class288 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3985 = new Rectangle[100];

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3987;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Z")
    public static final boolean method1864(byte arg0, int arg1) {
        field3986++;
        if (arg1 == 4 || arg1 == 47 || arg1 == 57 || arg1 == 18 || arg1 == 19) {
            return true;
        } else if (arg1 == 2 || arg1 == 1006) {
            return true;
        } else {
            if (arg0 > -39) {
                field3987 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public static void method1865(boolean arg0) {
        field3985 = null;
        field3987 = null;
        if (arg0) {
            field3987 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
    public static final boolean method1866(int arg0) {
        field3984++;
        try {
            if (arg0 > -24) {
                return false;
            }
            if (class568.field8160 == 2) {
                if (class623.field9002 == null) {
                    class623.field9002 = class60.method430(class195.field2647, class22.field221, class509.field7411);
                    if (class623.field9002 == null) {
                        return false;
                    }
                }
                if (class271.field3805 == null) {
                    class271.field3805 = new class464(class82.field919, class224.field3161);
                }
                if (class224.field3145.method2500(22050, class623.field9002, -42, class44.field468, class271.field3805)) {
                    class224.field3145.method2469(true);
                    class224.field3145.method2498(class332.field4779, 128);
                    class224.field3145.method2503(class438.field6508, class623.field9002, 10123);
                    class623.field9002 = null;
                    class568.field8160 = 0;
                    class271.field3805 = null;
                    class195.field2647 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class224.field3145.method2491(8192);
            class623.field9002 = null;
            class271.field3805 = null;
            class568.field8160 = 0;
            class195.field2647 = null;
        }
        return false;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field3985[var0] = new Rectangle();
        }
        field3987 = new Color[] { new Color(9179409), new Color(3289650) };
    }
}
