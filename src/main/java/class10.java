import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class10 implements class28 {

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "[F")
    public float[] field99;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "Lfe;")
    public static class636 field100 = new class636("LIVE", 0);

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method43(int arg0, int arg1, int arg2) {
        field102++;
        if (arg1 != 0) {
            method44(-80);
        }
        return class650.method3662(2, arg0, arg2) & class390.method2433(arg2, arg1 ^ 0x800, arg0);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 21)
    public static void method44(int arg0) {
        if (arg0 > 65) {
            field100 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(II)V", line = 33)
    public class10(int arg0, int arg1) {
        this.field101 = arg1;
        this.field103 = arg0;
        this.field99 = new float[arg0 * arg1];
    }
}
