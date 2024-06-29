import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class25 extends class23 {

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "Lt;")
    public static class31 field281 = class14.method84(111, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "I")
    public static int field284 = 0;

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "Lt;")
    public static class31 field283 = class14.method84(108, "codeversion");

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "Lt;")
    public static class31 field280 = class14.method84(126, "Next page");

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "Lt;")
    public static class31 field282 = class14.method84(114, "Loading ");

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "I")
    public static int field285 = 20;

    @OriginalMember(owner = "mapview!n", name = "o", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "mapview!n", name = "m", descriptor = "Lt;")
    public static class31 field287 = class14.method84(125, "???");

    @OriginalMember(owner = "mapview!n", name = "n", descriptor = "Lt;")
    public static class31 field288 = class14.method84(113, "u_pass");

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "Lt;")
    public static class31 field286 = class14.method84(114, "overlay)3dat");

    @OriginalMember(owner = "mapview!n", name = "q", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "mapview!n", name = "p", descriptor = "Ljava/lang/String;")
    public static String field290;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([Lt;B)V", line = 7)
    public static final void method162(class31[] arg0, byte arg1) {
        class34.method211(0, arg0.length, (byte) -123, arg0);
        if (arg1 != 105) {
            method163(null, -35);
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/lang/String;I)Lt;", line = 47)
    public static final class31 method163(String arg0, int arg1) {
        if (arg1 != -1) {
            method166((byte) -85);
        }
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class31 var4 = new class31();
        var4.field339 = 0;
        var4.field336 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field339++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)V", line = 101)
    public static void method164(byte arg0) {
        field286 = null;
        field282 = null;
        field290 = null;
        field287 = null;
        field283 = null;
        field281 = null;
        if (arg0 >= -12) {
            field290 = null;
        }
        field288 = null;
        field280 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Lt;ZLca;Lt;)[Lu;", line = 126)
    public static final class32[] method165(class31 arg0, boolean arg1, class6 arg2, class31 arg3) {
        int var4 = arg2.method32(arg3, arg1);
        int var5 = arg2.method36(var4, !arg1, arg0);
        return class22.method129(var4, var5, arg2, 86);
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(B)V", line = 150)
    public static final void method166(byte arg0) {
        if (class6.field39 != null) {
            class18 var1 = class6.field39;
            synchronized (class6.field39) {
                class6.field39 = null;
            }
        }
        int var3 = -69 % ((arg0 + 75) / 39);
    }
}
