import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class158 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "J")
    public long field2903 = 0L;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "[I")
    public static int[] field2916 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public int field2910;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lug;")
    public class199 field2911;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Lug;")
    public class199 field2913;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lal;")
    public static class230 field2905;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Lal;")
    public static class230 field2912;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
    public static final int method1141(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lal;Lal;Z)V")
    public static final void method1142(class230 arg0, class230 arg1, boolean arg2) {
        class23.field327 = arg0;
        if (!arg2) {
            method1141(23, 82);
        }
        field2908++;
        class9.field123 = arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field2912 = null;
        if (arg0 != 32) {
            method1142((class230) null, (class230) null, false);
        }
        field2916 = null;
        field2905 = null;
    }
}
