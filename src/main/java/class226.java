import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class226 extends class354 {

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(ILwo;)V", line = 3)
    public class226(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(II)I", line = 6)
    public final int method391(int arg0, int arg1) {
        ++field2997;
        if (arg0 != 3) {
            this.method393((byte) 13);
        }
        return 1;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 18)
    public final void method388(int arg0) {
        if (~super.field4545 > -1 || ~super.field4545 < -5) {
            super.field4545 = this.method393((byte) -46);
        }
        ++field2996;
        if (arg0 == 6384) {
            ;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)I", line = 32)
    public final int method393(byte arg0) {
        ++field2999;
        int var2 = -24 % ((arg0 - 37) / 63);
        return 3;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lwo;)V", line = 42)
    public class226(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(II)V", line = 45)
    public final void method389(int arg0, int arg1) {
        ++field2995;
        super.field4545 = arg1;
        if (arg0 != -1) {
            this.method393((byte) -84);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)I", line = 61)
    public final int method1451(byte arg0) {
        int var2 = 8 / ((arg0 - 7) / 45);
        ++field2998;
        return super.field4545;
    }
}
