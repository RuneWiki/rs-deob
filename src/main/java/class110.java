import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class110 {

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1633 = 0;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1629 = " has logged out.";

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lgi;")
    public static class109 field1628 = new class109(64);

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Ldb;")
    public static class102 field1637 = new class102(64);

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field1640 = 0;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "[I")
    public static int[] field1639 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
    public static boolean field1638 = false;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Z")
    public static boolean field1634;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "[I")
    public static int[] field1635;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "[I")
    public static int[] field1641;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[[[I")
    public static int[][][] field1642;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZ)Lin;", line = 6)
    public static final class344 method759(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method760(true);
        }
        class344 var3 = (class344) class66.field952.method451((long) arg1 | (long) arg0 << 32, (byte) 100);
        if (var3 == null) {
            var3 = new class344(arg0, arg1);
            class66.field952.method461(93, var3.field2744, var3);
        }
        field1630++;
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 28)
    public static final String method760(boolean arg0) {
        if (arg0) {
            method760(false);
        }
        field1636++;
        String var1;
        if (class8.field119 == 1 && class185.field3070 < 2) {
            var1 = class64.field925 + class343.field5332 + class229.field3644 + " ->";
        } else if (class142.field2216 && class185.field3070 < 2) {
            var1 = class141.field2204 + class343.field5332 + class200.field3247 + " ->";
        } else if (class13.field151 && class117.field1770[81] && class185.field3070 > 2) {
            var1 = class129.method935(class185.field3070 - 2, 2017);
        } else {
            var1 = class129.method935(class185.field3070 - 1, 2017);
        }
        if (class185.field3070 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class185.field3070 - 2) + class286.field4591;
        }
        return var1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 63)
    public static final void method761(int arg0) {
        class25.field337.method707(0);
        field1631++;
        if (arg0 != Integer.MAX_VALUE) {
            method762((byte) 67);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 82)
    public static void method762(byte arg0) {
        field1635 = null;
        field1639 = null;
        field1629 = null;
        field1642 = (int[][][]) null;
        field1628 = null;
        if (arg0 >= -32) {
            method760(true);
        }
        field1637 = null;
        field1641 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 100)
    public static final void method763(String arg0, int arg1, boolean arg2) {
        if (arg1 != -20206) {
            method760(false);
        }
        field1632++;
        if (!arg2) {
            try {
                class308.method2181("loggedout", 32627, class14.field159.field1951);
            } catch (Throwable var9) {
            }
            try {
                class265.field4289.getAppletContext().showDocument(new URL(class265.field4289.getCodeBase(), arg0), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class232.field3690 && field1634) {
            try {
                class308.method2183("openjs", class14.field159.field1951, arg1 + 20317, new Object[] { (new URL(class265.field4289.getCodeBase(), arg0)).toString() });
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class265.field4289.getAppletContext().showDocument(new URL(class265.field4289.getCodeBase(), arg0), "_blank");
        } catch (Exception var7) {
        }
    }
}
