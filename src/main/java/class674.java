import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class674 extends class392 {

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Z")
    public static boolean field9436 = false;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I")
    public final int method3773(int arg0) {
        if (arg0 != 17539) {
            this.method286((byte) 57, 47);
        }
        ++field9437;
        return super.field5452;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method3774(byte arg0) {
        ++field9439;
        class42.method319(98);
        int var1 = -29 % ((arg0 - 12) / 56);
        class193.method1378(-66);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        ++field9440;
        if (!arg0) {
            field9436 = false;
        }
        return super.field5454.method3784(21).method4162(-65536) ? 3 : 2;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        if (arg1 >= -124) {
            return -59;
        } else {
            ++field9441;
            return 1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        ++field9435;
        if (!arg0) {
            if (super.field5452 < 1 || ~super.field5452 < -4) {
                super.field5452 = this.method292(true);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(ILw;)V")
    public class674(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lw;)V")
    public class674(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        int var3 = 101 / ((-80 - arg0) / 38);
        super.field5452 = arg1;
        ++field9438;
    }
}
