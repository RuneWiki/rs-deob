import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class286 {

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field4591;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lce;")
    public class124 field4583;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[I")
    public static int[] field4589 = new int[256];

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lmh;")
    public static class263 field4590 = null;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Llc;")
    public static class270 field4585;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Llc;")
    public static class270 field4588;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILlc;)I")
    public static final int method1960(int arg0, class270 arg1) {
        field4592++;
        int var2 = 0;
        if (arg1.method1885(2, class214.field3148)) {
            var2++;
        }
        if (arg1.method1885(2, class272.field4404)) {
            var2++;
        }
        if (arg1.method1885(2, class282.field4543)) {
            var2++;
        }
        if (arg1.method1885(2, class86.field1370)) {
            var2++;
        }
        if (arg1.method1885(2, class289.field4621)) {
            var2++;
        }
        if (arg1.method1885(2, class238.field3479)) {
            var2++;
        }
        if (arg1.method1885(2, class29.field307)) {
            var2++;
        }
        if (arg1.method1885(2, class1.field2)) {
            var2++;
        }
        if (arg0 <= 95) {
            field4590 = null;
        }
        if (arg1.method1885(2, class108.field1830)) {
            var2++;
        }
        if (arg1.method1885(2, class212.field3128)) {
            var2++;
        }
        if (arg1.method1885(2, class57.field836)) {
            var2++;
        }
        if (arg1.method1885(2, class51.field703)) {
            var2++;
        }
        if (arg1.method1885(2, class126.field2125)) {
            var2++;
        }
        if (arg1.method1885(2, class163.field2528)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
    public static final void method1961(int arg0, int arg1) {
        field4587++;
        class169.field2570.method1416(arg1, 0);
        class33.field413.method1416(arg1, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method1962(byte arg0) {
        if (arg0 > -89) {
            field4588 = null;
        }
        field4590 = null;
        field4589 = null;
        field4585 = null;
        field4588 = null;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIII)V")
    public class286(int arg0, int arg1, int arg2, int arg3) {
        class124 var5 = class180.method1273(arg0, (byte) -27);
        this.field4591 = arg3;
        this.field4586 = arg1;
        this.field4584 = arg2;
        if (var5.field2062 == -1) {
            this.field4583 = var5;
        } else {
            this.field4583 = class180.method1273(var5.field2062, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lce;III)V")
    public class286(class124 arg0, int arg1, int arg2, int arg3) {
        this.field4586 = arg1;
        this.field4591 = arg3;
        this.field4583 = arg0;
        this.field4584 = arg2;
    }
}
