import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class192 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2906 = 1;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2905 = new String[100];

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
    public static boolean field2903 = true;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "F")
    public static float field2907;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    public static int[] field2908;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[Lph;")
    public static class79[] field2904;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1310(byte arg0) {
        if (arg0 != -110) {
            method1312((Component) null, -28, 116, -29);
        }
        class91.field1386.method1298((byte) 110);
        field2902++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 27)
    public static void method1311(boolean arg0) {
        field2904 = null;
        field2905 = null;
        if (arg0) {
            field2908 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;III)Lcd;", line = 39)
    public static final class4 method1312(Component arg0, int arg1, int arg2, int arg3) {
        field2909++;
        try {
            if (arg2 == 1) {
                Class var4 = Class.forName("vm");
                class4 var5 = (class4) var4.getDeclaredConstructor().newInstance();
                var5.method30((byte) -98, arg0, arg1, arg3);
                return var5;
            } else {
                return (class4) null;
            }
        } catch (Throwable var8) {
            class259 var7 = new class259();
            var7.method30((byte) -98, arg0, arg1, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)J", line = 63)
    public static final long method1313(byte arg0) {
        field2910++;
        int var1 = 76 / ((arg0 - 27) / 33);
        return class63.field950.method496(4398);
    }
}
