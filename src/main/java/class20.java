import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class20 {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lsl;ZI)V", line = 3)
    private final void method95(class479 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method95(null, true, 98);
        }
        if (arg2 == 1) {
            this.field191 = arg0.method2882(-1);
            this.field190 = arg0.method2886(true);
            this.field189 = arg0.method2886(true);
        }
        field192++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILsl;)V", line = 28)
    public final void method96(int arg0, class479 arg1) {
        field188++;
        while (true) {
            int var3 = arg1.method2886(true);
            if (var3 == 0) {
                if (arg0 >= -38) {
                    this.field189 = 105;
                    return;
                } else {
                    return;
                }
            }
            this.method95(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)I", line = 49)
    public static final int method97(byte arg0, int arg1) {
        field193++;
        if (arg1 == 16711935) {
            return -1;
        } else if (arg0 == 125) {
            return class37.method189(arg1, true);
        } else {
            return 123;
        }
    }
}
