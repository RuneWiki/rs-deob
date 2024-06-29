import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public abstract class class547 {

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "Ldg;")
    public static class193 field8066 = new class193();

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "Ldc;")
    public static class302 field8071 = new class302();

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "Lf;")
    public static class256 field8065;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "Lll;")
    public static class488 field8069;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "Lmba;")
    public static class70 field8070;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)Z")
    public final boolean method3199(int arg0) {
        if (arg0 != -785833812) {
            field8070 = null;
        }
        field8064++;
        return this.method2337(-59) || this.method2351(arg0 + 785851264) || this.method2348((byte) -69);
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)Z")
    public abstract boolean method2337(int arg0);

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)I")
    public static final int method3200(int arg0, int arg1) {
        field8068++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + arg0;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
    public abstract void method2342(byte arg0);

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(B)I")
    public abstract int method2338(byte arg0);

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)Lls;")
    public abstract class147 method2346(boolean arg0);

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)I")
    public abstract int method2340(int arg0);

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(I)V")
    public static void method3201(int arg0) {
        field8069 = null;
        int var1 = 103 % ((31 - arg0) / 38);
        field8066 = null;
        field8071 = null;
        field8065 = null;
        field8070 = null;
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)Z")
    public abstract boolean method2351(int arg0);

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)V")
    public abstract void method2344(boolean arg0);

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(B)Z")
    public abstract boolean method2348(byte arg0);
}
