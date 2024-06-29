import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class253 extends class416 {

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lhga;")
    public static class158 field4038 = null;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lcl;")
    public static class245 field4040;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lgf;")
    public class253 field4041;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lgf;")
    public class253 field4042;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method1796(int arg0) {
        field4038 = null;
        if (arg0 <= 46) {
            method1796(-51);
        }
        field4040 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public final void method1797(boolean arg0) {
        field4037++;
        if (!arg0 && this.field4041 != null) {
            this.field4041.field4042 = this.field4042;
            this.field4042.field4041 = this.field4041;
            this.field4041 = null;
            this.field4042 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILpba;ZI)V")
    public static final void method1798(int arg0, class304 arg1, boolean arg2, int arg3) {
        if (arg2) {
            method1798(-97, null, false, -123);
        }
        field4043++;
        int[] var4 = new int[4];
        class398.method2562(var4, 0, var4.length, arg3);
        class163.method1324(var4, arg0, 0, arg1);
    }
}
