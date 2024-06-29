import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class276 extends class86 {

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Ltn;")
    public static class749 field3599 = new class749(3);

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3602 = 104;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "F")
    public static float field3597;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[Luaa;")
    public static class391[] field3595;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)V")
    public static final void method1700(int arg0, int arg1) {
        if (arg0 != 7446) {
            method1700(53, 126);
        }
        class766.field10417 = arg1;
        ++field3600;
        class456.field5972.method2919(0);
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Z")
    public final boolean method1701(int arg0) {
        ++field3601;
        int var2 = 54 % ((arg0 - -57) / 57);
        return !super.field1203.method2981(-14);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        ++field3593;
        if (arg0 != 0) {
            this.method71((byte) 113);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(ILsf;)V")
    public class276(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        ++field3603;
        if (super.field1203.method2981(arg1 + -12)) {
            return 3;
        } else if (arg1 != -2) {
            return -81;
        } else {
            return arg0 != 0 && super.field1203.field6915.method2297(false) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public static void method1702(int arg0) {
        field3595 = null;
        if (arg0 <= 117) {
            field3597 = 0.042400073F;
        }
        field3599 = null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lsf;)V")
    public class276(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)I")
    public final int method1703(boolean arg0) {
        if (arg0) {
            this.method1703(true);
        }
        ++field3594;
        return super.field1200;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        ++field3596;
        if (super.field1203.method2981(-14)) {
            super.field1200 = 0;
        }
        if (arg0 == -65) {
            if (super.field1200 < 0 && ~super.field1200 < -3) {
                super.field1200 = this.method73(arg0 + 65);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        if (arg1) {
            method1702(-41);
        }
        super.field1200 = arg0;
        ++field3598;
    }
}
