import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class17 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lvd;")
    public static class222 field429 = null;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lvd;")
    public static class222 field431 = class212.method1357("Ihr Spielkonto wurde deaktiviert)3", 10731);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lde;")
    public static class38 field432;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method145(int arg0) {
        field431 = null;
        field432 = null;
        if (arg0 != 161) {
            method148(-71, null);
        }
        field429 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public static final void method146(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2300 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
    public static final int method147(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAA) >>> 1);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        field428++;
        if (arg0 <= 4) {
            method146(60, -115, 108);
        }
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;)Lvd;")
    public static final class222 method148(int arg0, String arg1) {
        field430++;
        byte[] var2;
        try {
            if (arg0 != 255) {
                field431 = null;
            }
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class222 var3 = new class222();
        var3.field4163 = var2;
        var3.field4121 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field4121++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)I")
    public static final int method149(int arg0, byte arg1) {
        field427++;
        if (class103.field1915 == 1) {
            return 7;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 191) {
            return 5;
        } else if (arg0 == 69) {
            return 6;
        } else if (arg1 == -32) {
            return 0;
        } else {
            return 14;
        }
    }
}
