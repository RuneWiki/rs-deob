import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class14 extends class163 {

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lke;")
    public class256 field184;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lvm;")
    public static class297 field183 = new class297(50);

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lke;")
    public static class256 field186 = class316.method2202("Jeter", 27626);

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Z")
    public static boolean field187 = false;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "[I")
    public static int[] field188 = new int[25];

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field193 = 0;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Lng;")
    public static class138 field191;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V", line = 6)
    public static final void method81(int arg0, int arg1) {
        field182++;
        class77 var2 = class156.method1158(1, false, arg1);
        var2.method586((byte) 98);
        if (arg0 != -20909) {
            method81(-49, 18);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Z", line = 25)
    public static final boolean method82(int arg0, int arg1) {
        field185++;
        if (arg1 < 32) {
            return false;
        } else if (~arg1 == arg0) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 57)
    public class14() {
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 71)
    public static final void method83(int arg0) {
        if (class233.field3981 != null) {
            class48 var1 = class233.field3981;
            synchronized (class233.field3981) {
                class233.field3981 = null;
            }
        }
        field181++;
        if (arg0 != -8083) {
            method81(38, -8);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lke;)V", line = 87)
    public class14(class256 arg0) {
        this.field184 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 111)
    public static void method84(byte arg0) {
        if (arg0 != -112) {
            method83(-90);
        }
        field183 = null;
        field186 = null;
        field188 = null;
        field191 = null;
    }
}
