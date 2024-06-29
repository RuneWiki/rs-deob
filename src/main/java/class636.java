import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class636 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Lqfa;")
    public static class85 field9174 = new class85(37, -2);

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "[I")
    public static int[] field9175 = null;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "Lvr;")
    public class122 field9172;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Lar;")
    public class636 field9171;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "[Lrd;")
    public static class310[] field9176;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public final void method3632(byte arg0) {
        field9173++;
        if (arg0 >= -121) {
            this.field9172 = null;
        }
        if (class27.field928 < 500) {
            this.field9172 = null;
            this.field9171 = class640.field9214;
            class27.field928++;
            class640.field9214 = this;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method3633(int arg0) {
        field9174 = null;
        field9175 = null;
        int var1 = 8 / ((-arg0 - 60) / 48);
        field9176 = null;
    }
}
