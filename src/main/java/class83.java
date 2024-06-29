import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class83 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    private int field1025 = 0;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lsb;")
    private class110 field1028;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1027 = "K";

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[I")
    public static int[] field1032 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "[I")
    public static int[] field1038 = new int[14];

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lgl;")
    private class237 field1029;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static void method457(boolean arg0) {
        field1038 = null;
        field1027 = null;
        field1032 = null;
        if (!arg0) {
            method460(63);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Lgl;")
    public final class237 method458(int arg0) {
        field1037++;
        if (arg0 == -1) {
            this.field1025 = 0;
            return this.method459((byte) -65);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lgl;")
    public final class237 method459(byte arg0) {
        field1036++;
        if (this.field1025 > 0 && this.field1028.field1566[this.field1025 - 1] != this.field1029) {
            class237 var2 = this.field1029;
            this.field1029 = var2.field3914;
            return var2;
        }
        while (this.field1028.field1581 > this.field1025) {
            class237 var3 = this.field1028.field1566[this.field1025++].field3914;
            if (this.field1028.field1566[this.field1025 - 1] != var3) {
                this.field1029 = var3.field3914;
                return var3;
            }
        }
        if (arg0 >= -6) {
            method457(false);
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lsb;)V")
    public class83(class110 arg0) {
        this.field1028 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method460(int arg0) {
        field1034++;
        int var1 = -82 % ((28 - arg0) / 45);
        String var2;
        if (class32.field432 == 1 && class34.field437 < 2) {
            var2 = class207.field3316 + class92.field1162 + class138.field2217 + " ->";
        } else if (class247.field4076 && class34.field437 < 2) {
            var2 = class283.field4511 + class92.field1162 + class144.field2284 + " ->";
        } else if (class44.field570 && class36.field467[81] && class34.field437 > 2) {
            var2 = class132.method895(class34.field437 - 2, 0);
        } else {
            var2 = class132.method895(class34.field437 - 1, 0);
        }
        if (class34.field437 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class34.field437 - 2) + class32.field431;
        }
        return var2;
    }
}
