import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class393 {

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "[I")
    public static int[] field5254 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)Llr;")
    public static final class277 method2264(int arg0, int arg1) {
        int var2 = 16 % ((-arg1 - 53) / 56);
        field5255++;
        return class367.field4833 && arg0 >= class16.field210 && class663.field9446 >= arg0 ? class233.field3103[arg0 - class16.field210] : null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public static void method2265(int arg0) {
        if (arg0 != 19313) {
            field5254 = null;
        }
        field5254 = null;
    }
}
