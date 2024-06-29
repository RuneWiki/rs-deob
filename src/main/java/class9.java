import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class119 {

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Lai;")
    private static class10 field107 = class44.method278("RuneScape has been updated(Q", 104);

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Lai;")
    public static class10 field100 = class44.method278("::gc", -97);

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Lai;")
    public static class10 field101 = class44.method278("RuneScape wurde aktualisiert(Q", 100);

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field109 = 0;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Lai;")
    public static class10 field111 = class44.method278("rot:", 120);

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Lai;")
    public static class10 field105 = field107;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Lai;")
    private static class10 field103 = class44.method278("Bad session id)3", 92);

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Lai;")
    public static class10 field104 = field103;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "B")
    public byte field106;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "Lai;")
    public class10 field114;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)I")
    public static final int method31(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field112++;
        int var5 = arg3 - class113.field2120[arg1 * 1024 / arg4] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIB)V")
    public static final void method32(int arg0, int arg1, byte arg2) {
        field102++;
        if (class53.field946 < 2 && class135.field2539 == 0 && !class32.field482) {
            return;
        }
        class10 var3;
        if (class135.field2539 == 1 && class53.field946 < 2) {
            var3 = class67.method440(arg2 ^ 0xFFFFFFCD, new class10[] { class34.field528, class61.field1041, class141.field2660, class184.field3510 });
        } else if (class32.field482 && class53.field946 < 2) {
            var3 = class67.method440(0, new class10[] { class3.field30, class61.field1041, class33.field501, class184.field3510 });
        } else {
            var3 = class35.method234(class53.field946 - 1, arg2 ^ 0xFFFFD96E);
        }
        if (class53.field946 > 2) {
            var3 = class67.method440(0, new class10[] { var3, class94.field1747, class119.method846(0, class53.field946 - 2), class79.field1398 });
        }
        if (arg2 != -51) {
            field103 = null;
        }
        int var4 = class97.field1795.method1257(var3, arg1 + 4, arg0 + 15, 16777215, 0, class40.field667, class205.field3983);
        class147.method1015(false, arg1 + 4, class97.field1795.method1270(var3) + var4, 15, arg0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method33(byte arg0) {
        field101 = null;
        field100 = null;
        field111 = null;
        field104 = null;
        field107 = null;
        int var1 = -49 / ((arg0 + 52) / 41);
        field105 = null;
        field103 = null;
    }
}
