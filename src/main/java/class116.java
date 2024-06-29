import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class116 extends class239 implements class743 {

    @OriginalMember(owner = "client!qda", name = "x", descriptor = "Lal;")
    private class121 field1795;

    @OriginalMember(owner = "client!qda", name = "u", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "Ltm;")
    public static class334 field1797 = new class334(59, 10);

    @OriginalMember(owner = "client!qda", name = "C", descriptor = "I")
    public static int field1800 = 0;

    @OriginalMember(owner = "client!qda", name = "D", descriptor = "[I")
    public static int[] field1801 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!qda", name = "v", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!qda", name = "y", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!qda", name = "B", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!qda", name = "F", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(Z)V")
    public static void method923(boolean arg0) {
        field1797 = null;
        if (!arg0) {
            method923(false);
        }
        field1801 = null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BI)V")
    public final void method924(byte arg0, int arg1) {
        if (arg0 >= -31) {
            this.method924((byte) -108, -30);
        }
        ++field1799;
        super.method924((byte) -114, this.field1795.field1855 * arg1);
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)Z")
    public final boolean method925(byte arg0) {
        if (arg0 <= 14) {
            this.method697(-29);
        }
        ++field1793;
        return super.method1658(7751, super.field3856.field9157);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method926(boolean arg0, int arg1) {
        if (arg1 != -29944) {
            this.field1795 = null;
        }
        ++field1796;
        return super.method1657(83, super.field3856.field9157, arg0);
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lom;Lal;Z)V")
    public class116(class642 arg0, class121 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field1795 = arg1;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)I")
    public final int method695(byte arg0) {
        if (arg0 <= 37) {
            this.method927(98);
        }
        ++field1802;
        return super.method695((byte) 89);
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
    public final void method697(int arg0) {
        super.method697(arg0);
        ++field1803;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)Lal;")
    public final class121 method927(int arg0) {
        ++field1794;
        if (arg0 != 1592) {
            this.method926(true, -104);
        }
        return this.field1795;
    }
}
