import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class266 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[Ltd;")
    public static class255[] field4196 = new class255[0];

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4200 = "wave2:";

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lag;")
    public class123 field4198;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lh;")
    public class232 field4194;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
    public static int[] field4195;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V", line = 13)
    public static final void method1888(byte arg0, int arg1) {
        field4199++;
        class179 var2 = class319.method2220(arg1, (byte) -67, 5);
        var2.method1239(true);
        if (arg0 >= -50) {
            method1889(-66);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 26)
    public static void method1889(int arg0) {
        field4196 = null;
        field4200 = null;
        field4195 = null;
        int var1 = 99 % ((80 - arg0) / 35);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Ltd;", line = 42)
    public static final class255 method1890(byte arg0) {
        field4193++;
        if (arg0 != 82) {
            method1888((byte) 74, 99);
        }
        return field4196.length > class233.field3720 ? field4196[class233.field3720++] : null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)Lrc;", line = 61)
    public static final class342 method1891(byte arg0, int arg1) {
        field4197++;
        class342 var2 = (class342) class226.field3589.method1619((long) arg1, 42);
        if (arg0 <= 10) {
            method1889(60);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class146.field2188.method250(true, 1, arg1);
        class342 var4 = new class342();
        if (var3 != null) {
            var4.method2360(new class192(var3), arg1, -9535);
        }
        class226.field3589.method1621((long) arg1, -95, var4);
        return var4;
    }
}
