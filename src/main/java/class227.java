import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class227 extends class86 {

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "Z")
    public static boolean field3073 = false;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            this.method73(49);
        }
        ++field3069;
        return super.field1203.method2981(-14) ? 3 : 1;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)Z")
    public static final boolean method1460(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return true;
        } else {
            ++field3067;
            return ~(384 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (arg0 != -65) {
            method1460(121, 62, 5);
        }
        if (super.field1203.method2981(arg0 ^ 77)) {
            super.field1200 = 2;
        }
        ++field3074;
        if (super.field1200 < 0 || super.field1200 > 2) {
            super.field1200 = this.method73(arg0 ^ -65);
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lsf;)V")
    public class227(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)Z")
    public final boolean method1461(int arg0) {
        ++field3072;
        int var2 = -120 / ((-57 - arg0) / 57);
        return !super.field1203.method2981(-14);
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(ILsf;)V")
    public class227(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        if (arg0 != 0) {
            field3073 = true;
        }
        ++field3070;
        if (super.field1203.method2981(-14)) {
            return 2;
        } else {
            return super.field1203.field6949.method2400(-25176) && class448.method2563(super.field1203.field6949.method2402(false), (byte) -66) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)I")
    public final int method1462(boolean arg0) {
        ++field3068;
        if (arg0) {
            this.method73(112);
        }
        return super.field1200;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        if (arg1) {
            field3073 = false;
        }
        ++field3071;
    }
}
