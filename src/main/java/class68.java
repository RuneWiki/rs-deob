import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class68 {

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "J")
    public static long field776 = -1L;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lao;")
    public static class191 field779 = new class191(109, -1);

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lhn;")
    public static class509 field784 = new class509(4);

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "F")
    public static float field785;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lgb;")
    public static class145 field777;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lfo;")
    public static class361 field781;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "[[B")
    public static byte[][] field775;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIB)V")
    public static final void method394(int arg0, int arg1, int arg2, byte arg3) {
        field774++;
        class184 var4 = class277.method1682(arg0, 11, -103);
        if (arg3 != -95) {
            method397(-102);
        }
        var4.method1069(true);
        var4.field2393 = arg2;
        var4.field2392 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZ)V")
    public static final void method395(int arg0, int arg1, boolean arg2) {
        class492.method2979(class418.field6076, 65);
        class212.field2861++;
        if (!arg2) {
            field785 = 1.2386308F;
        }
        field773++;
        class106.field1443.method2439(1783527048, arg0);
        class106.field1443.method2446(arg1, (byte) 121);
    }

    @OriginalMember(owner = "client!hk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field780++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method396(byte arg0) {
        if (arg0 != 115) {
            return;
        }
        field775 = null;
        field779 = null;
        field784 = null;
        field777 = null;
        field781 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
    public static final boolean method397(int arg0) {
        if (arg0 != 109) {
            method396((byte) 120);
        }
        field778++;
        return class366.field5009;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(II)V")
    public class68(int arg0, int arg1) {
        this.field782 = arg0;
    }
}
