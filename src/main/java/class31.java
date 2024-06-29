import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class31 extends class201 {

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lqg;")
    public static class398 field351 = new class398();

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "[I")
    public static int[] field355 = new int[8];

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "F")
    public static float field353;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 8)
    public static void method181(int arg0) {
        if (arg0 <= 63) {
            method181(-8);
        }
        field351 = null;
        field355 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Lvi;", line = 30)
    public static final class468 method182(int arg0, int arg1, int arg2) {
        field352++;
        class468 var3 = new class468();
        var3.field6943 = -1;
        var3.field6947 = arg0 + 5 + 1;
        var3.field6949 = -1;
        if (arg1 != 29317) {
            field353 = -0.20079686F;
        }
        var3.field6938 = arg2 + 1 + 5;
        var3.field6941 = new int[var3.field6947][var3.field6938];
        var3.method2870(true);
        return var3;
    }
}
