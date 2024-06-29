import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class638 {

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "[I")
    public static int[] field9257;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public int field9256;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public int field9259;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public int field9260;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public int field9261;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public static final void method3673(int arg0) {
        class368.field5130.method3472((byte) -128);
        field9255++;
        if (arg0 > -59) {
            method3676(120, -128, -104);
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
    public static void method3674(int arg0) {
        field9257 = null;
        if (arg0 != 7084) {
            field9257 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method3675(int arg0, int arg1, String arg2) {
        field9254++;
        class632 var3 = class641.method3699(arg0 ^ 0xFFFFFF98, arg0, arg1);
        var3.method3656(0);
        var3.field9204 = arg2;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Z")
    public static final boolean method3676(int arg0, int arg1, int arg2) {
        if (arg0 >= -29) {
            return false;
        } else {
            field9258++;
            boolean var3 = (arg2 & 0x37) == 0 ? class211.method1343(arg1, 0, arg2) : class143.method780(arg1, arg2, -10181);
            return (arg1 & 0x10000) != 0 | class83.method468(true, arg1, arg2) | var3;
        }
    }

    static {
        new class344("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
        field9257 = new int[4096];
    }
}
