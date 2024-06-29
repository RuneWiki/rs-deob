import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class270 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Z")
    public static boolean field4825 = false;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Llc;")
    public static class143 field4826 = class66.method374(" ", -1);

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Llc;")
    public static class143 field4829 = class66.method374("", -1);

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field4831 = 0;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field4833 = 0;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Llc;")
    public static class143 field4828 = class66.method374(" weitere Optionen", -1);

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Llc;")
    public static class143 field4830 = class66.method374("gr-Un:", -1);

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I)Llc;")
    public static final class143 method1785(String arg0, int arg1) {
        int var2 = -99 % ((-arg1 - 81) / 36);
        field4832++;
        byte[] var3;
        try {
            var3 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var3 = arg0.getBytes();
        }
        class143 var4 = new class143();
        var4.field2548 = 0;
        var4.field2503 = var3;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != 0) {
                var3[var4.field2548++] = var3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static void method1786(boolean arg0) {
        if (!arg0) {
            field4833 = -8;
        }
        field4829 = null;
        field4830 = null;
        field4828 = null;
        field4826 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILlc;)V")
    public static final void method1787(int arg0, class143 arg1) {
        field4827++;
        int var2 = class139.method831(arg1, (byte) 71);
        if (~var2 != arg0) {
            class116.method705(class90.field1628.field2378[var2], (byte) -15, class90.field1628.field2368[var2]);
        }
    }
}
