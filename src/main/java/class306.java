import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class306 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field4874 = -1;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field4876 = 0;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field4889 = 0;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4886 = "scroll:";

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field4878;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public int field4887;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public int field4888;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public int field4890;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public int field4891;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lfc;")
    public static class213 field4885;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[I")
    public static int[] field4884;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method2044(int arg0) {
        if (arg0 != 32) {
            field4884 = null;
        }
        class274.field4457.method1510(10283);
        field4880++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method2045(int arg0, int arg1, int arg2) {
        if (arg1 != 376) {
            method2045(53, 73, 96);
        }
        field4879++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CI)Z")
    public static final boolean method2046(char arg0, int arg1) {
        field4873++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return (char) arg1 == arg0 || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method2047(int arg0) {
        field4885 = null;
        field4886 = null;
        field4884 = null;
        if (arg0 > -123) {
            field4876 = 12;
        }
    }
}
