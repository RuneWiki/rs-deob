import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class412 extends class365 implements class216 {

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "Lok;")
    private class256 field6203;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "[I")
    public static int[] field6196 = new int[13];

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
    public static int field6195 = 0;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    public static int field6191 = 1;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)Lok;", line = 5)
    public final class256 method1460(int arg0) {
        ++field6197;
        if (arg0 < 48) {
            field6195 = -41;
        }
        return this.field6203;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Z", line = 16)
    public final boolean method1459(int arg0) {
        if (arg0 != -26499) {
            return true;
        } else {
            ++field6192;
            return super.method2263(super.field5262.field9905, true);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V", line = 30)
    public final void method1284(boolean arg0) {
        super.method1284(arg0);
        ++field6198;
        if (!arg0) {
            field6196 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I", line = 41)
    public final int method1292(int arg0) {
        if (arg0 != 128) {
            field6196 = null;
        }
        ++field6201;
        return super.method1292(arg0);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 59)
    public final Buffer method1457(boolean arg0, int arg1) {
        ++field6200;
        return arg1 >= -109 ? null : super.method2257(arg0, (byte) -54, super.field5262.field9905);
    }

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)V", line = 71)
    public static void method2615(int arg0) {
        if (arg0 == 1) {
            field6196 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "(I)V", line = 81)
    public static final void method2616(int arg0) {
        if (arg0 == -8) {
            class106 var1 = class671.field9364;
            synchronized (class671.field9364) {
                class671.field9364.method809(true);
            }
            ++field6199;
            class106 var2 = class391.field5893;
            synchronized (class391.field5893) {
                class391.field5893.method809(true);
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V", line = 100)
    public final void method1458(byte arg0, int arg1) {
        super.method1458(arg0, this.field6203.field3673 * arg1);
        ++field6193;
    }

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "(I)V", line = 115)
    public static final void method2617(int arg0) {
        if (arg0 != -2) {
            field6195 = 47;
        }
        class54.method380(arg0 + 2);
        ++field6202;
        class256.method1678(class63.field916.field10173.method307(17503) == 1, -19, 2, 22050);
        class176.field2719 = class727.method4101(0, class179.field2759, 22050, 23841, class106.field1476);
        class35.method180(class280.method1783((class336) null, arg0 ^ -54), -76, true);
        class578.field8220 = class727.method4101(1, class179.field2759, 2048, 23841, class106.field1476);
        class578.field8220.method1975((byte) 37, class171.field2666);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(BI)Z", line = 132)
    public static final boolean method2618(byte arg0, int arg1) {
        if (arg0 >= -98) {
            return true;
        } else {
            ++field6194;
            return ~arg1 != -2 && ~arg1 != -8;
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lno;Lok;Z)V", line = 146)
    public class412(class704 arg0, class256 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field6203 = arg1;
    }
}
