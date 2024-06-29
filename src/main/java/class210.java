import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class210 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lkh;")
    public static class117 field3763 = class224.method1450((byte) -106, "mapdots");

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "S")
    public static short field3765 = 32767;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lkh;")
    public static class117 field3762 = class224.method1450((byte) 4, "<col=ffffff>");

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lkh;")
    public static class117 field3761 = class224.method1450((byte) 109, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lkh;")
    public static class117 field3768 = class224.method1450((byte) -61, "<)4col> x");

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "B")
    public static byte field3764;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1373(int arg0) {
        if (arg0 != 0) {
            field3764 = -27;
        }
        field3768 = null;
        field3761 = null;
        field3763 = null;
        field3762 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/lang/String;)Lkh;")
    public static final class117 method1374(int arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class117 var3 = new class117();
        field3767++;
        var3.field2196 = var2;
        var3.field2213 = 0;
        for (int var4 = arg0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field2213++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
    public static final int method1375(int arg0, int arg1, int arg2) {
        field3766++;
        class248 var3 = (class248) class136.field2457.method460((long) arg1, 1);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = -70 % ((64 - arg2) / 32);
            for (int var6 = 0; var6 < var3.field4553.length; var6++) {
                if (var3.field4552[var6] == arg0) {
                    var4 += var3.field4553[var6];
                }
            }
            return var4;
        }
    }
}
