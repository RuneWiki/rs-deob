import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class626 implements class454 {

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "Lcb;")
    private class544 field8834;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lpa;")
    public static class387 field8831 = new class387(8);

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lke;")
    public static class622 field8835 = new class622(53, 6);

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "Lke;")
    public static class622 field8836 = new class622(40, 4);

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "Lke;")
    public static class622 field8837 = new class622(6, 6);

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
    public static int field8838 = -1;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "[[[I")
    public static int[][][] field8833;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method3588(boolean arg0) {
        field8830++;
        if (arg0) {
            field8838 = 53;
        }
        for (class4 var1 = (class4) class174.field2456.method2480(381); var1 != null; var1 = (class4) class174.field2456.method2476((byte) 18)) {
            if (var1.field49 > 1) {
                var1.field49 = 0;
                class648.field9117.method2362(var1, 0, ((class312) var1.field46.field5842.field3126).field4635);
                var1.field46.method2477(true);
            }
        }
        class27.field394 = 0;
        class543.field7608 = 0;
        class551.field7826.method2503(10);
        class634.field8942.method387(-21125);
        class174.field2456.method2477(true);
        class235.method1620(-103, class90.field1165);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)I", line = 34)
    public final int method1558(int arg0) {
        int var2 = 95 % ((44 - arg0) / 57);
        field8829++;
        return this.field8834.method3132(true) ? 100 : this.field8834.method3155(-86);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)Lbja;", line = 52)
    public final class34 method1557(int arg0) {
        field8832++;
        if (arg0 != -29120) {
            field8838 = 37;
        }
        return class34.field443;
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)V", line = 74)
    public static void method3589(int arg0) {
        field8835 = null;
        field8836 = null;
        field8833 = null;
        field8831 = null;
        if (arg0 == 0) {
            field8837 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lcb;)V", line = 87)
    public class626(class544 arg0) {
        this.field8834 = arg0;
    }
}
