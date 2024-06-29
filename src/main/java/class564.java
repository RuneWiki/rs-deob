import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class564 extends class354 {

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "Lkg;")
    public static class275 field7928 = new class275(83, 8);

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "Lkg;")
    public static class275 field7934 = new class275(53, -1);

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "[I")
    public static int[] field7931;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)I")
    public final int method3250(byte arg0) {
        ++field7927;
        int var2 = -60 / ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lwo;)V")
    public class564(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        int var2 = -9 / ((arg0 - 37) / 63);
        ++field7930;
        return 0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 == 6384) {
            ++field7929;
            if (~super.field4545 != -2 && super.field4545 != 0) {
                super.field4545 = this.method393((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        ++field7932;
        if (arg0 == -1) {
            super.field4545 = arg1;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field7926;
        if (arg0 != 3) {
            field7934 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(ILwo;)V")
    public class564(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V")
    public static void method3251(int arg0) {
        if (arg0 != 0) {
            field7931 = null;
        }
        field7934 = null;
        field7928 = null;
        field7931 = null;
    }
}
