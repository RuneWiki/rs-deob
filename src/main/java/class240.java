import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class240 extends class190 {

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Lwc;")
    public static class232 field4104 = new class232(64);

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field4107 = 0;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Lmj;")
    public static class129 field4106 = null;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "J")
    public static long field4109;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "Loe;")
    public static class256 field4112;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "Ljava/awt/Frame;")
    public static Frame field4110;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1566(int arg0, boolean arg1) {
        field4108++;
        if (arg1) {
            return false;
        } else {
            return (arg0 & -arg0) == arg0;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V")
    public static void method1567(boolean arg0) {
        field4106 = null;
        field4112 = null;
        if (arg0) {
            method1566(7, true);
        }
        field4110 = null;
        field4104 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)I")
    public static final int method1568(int arg0, int arg1) {
        if (arg0 == 1303579025) {
            field4114++;
            return arg1 >> 17 & 0x7;
        } else {
            return -15;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II)V")
    public class240(int arg0, int arg1) {
        this.field4113 = arg0;
        this.field4105 = arg1;
    }
}
