import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class41 extends class331 {

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Z")
    public boolean field495 = true;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "C")
    private char field503;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Ltq;")
    public static class376 field498;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "Ltq;")
    public static class376 field501;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Ljava/lang/String;")
    public String field500;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public static void method251(int arg0) {
        field498 = null;
        field501 = null;
        int var1 = 14 / ((arg0 + 24) / 41);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    public static final void method252(int arg0, int arg1) {
        if (arg1 != -26941) {
            field501 = null;
        }
        class69.field796.method1629(arg0, 91);
        field494++;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)Z")
    public final boolean method253(boolean arg0) {
        if (!arg0) {
            this.method255(-52, (class236) null);
        }
        field502++;
        return this.field503 == 's';
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILdg;Z)V")
    private final void method254(int arg0, class236 arg1, boolean arg2) {
        if (arg2) {
            method251(69);
        }
        field493++;
        if (arg0 == 1) {
            this.field503 = class8.method57(arg1.method1589(arg2), 16);
        } else if (arg0 == 2) {
            this.field499 = arg1.method1597(3641);
        } else if (arg0 == 4) {
            this.field495 = false;
        } else if (arg0 == 5) {
            this.field500 = arg1.method1562(false);
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILdg;)V")
    public final void method255(int arg0, class236 arg1) {
        while (true) {
            int var3 = arg1.method1574(-119);
            if (var3 == 0) {
                if (arg0 <= 38) {
                    method252(-41, 9);
                }
                field497++;
                return;
            }
            this.method254(var3, arg1, false);
        }
    }
}
