import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class50 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Llc;")
    public static class86 field720 = new class86(64);

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Llc;")
    public static class86 field727 = new class86(50);

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field728 = "slide:";

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lhc;")
    public static class235 field724;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lhc;")
    public static class235 field726;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "[I")
    public static int[] field729;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method321(Component arg0, int arg1) {
        arg0.removeKeyListener(class287.field4533);
        field721++;
        if (arg1 < 14) {
            method321((Component) null, 114);
        }
        arg0.removeFocusListener(class287.field4533);
        class237.field3604 = -1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method322(int arg0) {
        field720 = null;
        field724 = null;
        field729 = null;
        field728 = null;
        if (arg0 == -24876) {
            field726 = null;
            field727 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lql;B)Ljava/lang/String;")
    public static final String method323(class224 arg0, byte arg1) {
        if (arg1 < 97) {
            field727 = null;
        }
        field722++;
        return class150.method1008(arg0, 32767, -128);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIJ[I)Ljava/lang/String;")
    public static final String method324(byte arg0, int arg1, long arg2, int[] arg3) {
        field725++;
        if (arg0 > -21) {
            return null;
        }
        if (class120.field1683 != null) {
            String var5 = class120.field1683.method247(arg1, 113, arg2, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static final void method325(int arg0) {
        class77.field1073.method546(arg0 - 90762264);
        field719++;
        if (arg0 != 0) {
            field726 = null;
        }
    }
}
