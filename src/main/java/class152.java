import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class152 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field2332 = -1;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field2335 = -1;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lwh;")
    public class100 field2330;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method1017(byte arg0, int arg1) {
        if (arg0 > -15) {
            return 92;
        } else {
            field2334++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLsi;I)V", line = 14)
    private final void method1018(boolean arg0, class391 arg1, int arg2) {
        if (arg0) {
            this.method1019(23);
        }
        if (arg2 == 1) {
            this.field2337 = arg1.method2353((byte) 83);
        } else if (arg2 == 2) {
            this.field2329 = arg1.method2348(-2);
            this.field2328 = arg1.method2348(-2);
        }
        field2331++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Lft;", line = 41)
    public final synchronized class4 method1019(int arg0) {
        field2336++;
        class4 var2 = (class4) this.field2330.field1502.method1073((long) this.field2337, false);
        if (var2 != null) {
            return var2;
        }
        class4 var3 = class4.method22(this.field2330.field1495, this.field2337, arg0);
        if (var3 != null) {
            this.field2330.field1502.method1072((long) this.field2337, var3, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLsi;)V", line = 63)
    public final void method1020(byte arg0, class391 arg1) {
        if (arg0 <= 48) {
            return;
        }
        while (true) {
            int var3 = arg1.method2348(-2);
            if (var3 == 0) {
                field2333++;
                return;
            }
            this.method1018(false, arg1, var3);
        }
    }
}
