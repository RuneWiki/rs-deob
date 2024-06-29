import java.awt.datatransfer.Clipboard;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class140 {

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Lrn;")
    public static class174 field2232 = new class174(20, 11);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "Lcn;")
    public static class355 field2233;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2229;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILnu;Z)Lok;", line = 6)
    public static final class166 method1044(int arg0, class417 arg1, boolean arg2) {
        if (arg2) {
            field2233 = null;
        }
        field2230++;
        class166 var3;
        if (class261.field3793 == null) {
            var3 = new class166();
        } else {
            var3 = class261.field3793;
            class261.field3793 = class261.field3793.field2572;
            var3.field2572 = null;
            class175.field2678--;
        }
        var3.field2573 = arg0;
        var3.field2576 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 31)
    public static void method1045(int arg0) {
        field2233 = null;
        field2232 = null;
        field2229 = null;
        if (arg0 != 11) {
            field2234 = -97;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 48)
    public static final String method1046(long arg0, int arg1) {
        field2228++;
        class287.field4095.setTime(new Date(arg0));
        int var3 = class287.field4095.get(7);
        int var4 = -86 / ((arg1 + 36) / 54);
        int var5 = class287.field4095.get(5);
        int var6 = class287.field4095.get(2);
        int var7 = class287.field4095.get(1);
        int var8 = class287.field4095.get(11);
        int var9 = class287.field4095.get(12);
        int var10 = class287.field4095.get(13);
        return class488.field7228[var3 - 1] + ", " + var5 / 10 + var5 % 10 + "-" + class79.field1314[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }
}
