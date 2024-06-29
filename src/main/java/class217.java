import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class217 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lff;")
    private class9 field3067 = new class9(64);

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lvh;")
    private class240 field3072;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field3069 = 0;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lqo;")
    public static class19 field3070 = new class19("", 10);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZI)Ljava/lang/String;")
    public static final String method1286(boolean arg0, boolean arg1, int arg2) {
        field3066++;
        if (arg0 && arg2 >= 0) {
            return arg1 ? null : class508.method2987(2, arg2, 10, arg0);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method1287(byte arg0) {
        field3070 = null;
        if (arg0 != -114) {
            field3071 = 82;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)Lak;")
    public final class231 method1288(int arg0, byte arg1) {
        field3068++;
        class9 var3 = this.field3067;
        class231 var4;
        synchronized (this.field3067) {
            var4 = (class231) this.field3067.method56((long) arg0, 92);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3072.method1411(true, arg0, 5);
        if (arg1 > -3) {
            method1289(-68, -38);
        }
        class231 var6 = new class231();
        if (var5 != null) {
            var6.method1351(new class365(var5), -25486);
        }
        class9 var7 = this.field3067;
        synchronized (this.field3067) {
            this.field3067.method73((long) arg0, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Llf;ILvh;)V")
    public class217(class157 arg0, int arg1, class240 arg2) {
        this.field3072 = arg2;
        this.field3072.method1397((byte) -126, 5);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public static final void method1289(int arg0, int arg1) {
        field3065++;
        if (arg1 == 0) {
            class154.field2217 = arg0;
            class454.field6634.method67(70);
        }
    }
}
