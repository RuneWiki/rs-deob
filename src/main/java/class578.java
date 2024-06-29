import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class578 {

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lfba;")
    public static class27 field8146 = new class27(25, 4);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    private int field8140;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field8141;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public int field8142;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Lhv;")
    public class543 field8147;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Lha;")
    public static class65 field8148;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "[Ljd;")
    public static class241[] field8145;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 4)
    public static void method3391(int arg0) {
        field8148 = null;
        field8146 = null;
        field8145 = null;
        if (arg0 != 13101) {
            field8145 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method3392(int arg0, int arg1, int arg2) {
        field8144++;
        if (arg2 == 25) {
            return class574.method3369((byte) -120, arg0, arg1) || class346.method2194(arg0, arg1, (byte) -73);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILso;)V", line = 30)
    public final void method3393(int arg0, class494 arg1) {
        while (true) {
            int var3 = arg1.method2964((byte) 111);
            if (var3 == 0) {
                if (arg0 != -1) {
                    field8145 = null;
                }
                field8143++;
                return;
            }
            this.method3395(arg1, var3, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)Lus;", line = 50)
    public final synchronized class1 method3394(boolean arg0) {
        field8138++;
        if (!arg0) {
            this.method3393(-16, null);
        }
        class1 var2 = (class1) this.field8147.field7811.method3742((byte) 67, (long) this.field8140);
        if (var2 != null) {
            return var2;
        }
        class1 var3 = class1.method5(this.field8147.field7796, this.field8140, 0);
        if (var3 != null) {
            this.field8147.field7811.method3739((long) this.field8140, (byte) 49, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lso;IB)V", line = 72)
    private final void method3395(class494 arg0, int arg1, byte arg2) {
        field8139++;
        if (arg2 >= -113) {
            method3391(117);
        }
        if (arg1 == 1) {
            this.field8140 = arg0.method2998(true);
        } else if (arg1 == 2) {
            this.field8141 = arg0.method2964((byte) 100);
            this.field8142 = arg0.method2964((byte) 93);
        }
    }
}
