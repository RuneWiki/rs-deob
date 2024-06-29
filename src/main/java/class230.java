import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class230 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field3194 = new String[0];

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    private int field3198 = -1;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Z")
    private boolean field3203 = false;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    private int field3195;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lqk;")
    public static class148 field3199 = new class148(9, -2);

    @OriginalMember(owner = "client!be", name = "j", descriptor = "J")
    public static long field3201 = 20000000L;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 6)
    private final void method1481(byte arg0, String arg1, int arg2) {
        if (arg2 > this.field3198) {
            this.field3198 = arg2;
        }
        field3193++;
        if (arg2 >= this.field3194.length) {
            this.method1482(24988, arg2);
        }
        if (arg0 != 58) {
            this.method1482(59, 41);
        }
        this.field3194[arg2] = arg1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V", line = 24)
    private final void method1482(int arg0, int arg1) {
        field3204++;
        if (arg0 != 24988) {
            this.field3194 = null;
        }
        String[] var3 = new String[this.method1484(arg1, 103)];
        class34.method242(this.field3194, 0, var3, 0, this.field3194.length);
        this.field3194 = var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V", line = 41)
    public static final void method1483(int arg0, byte arg1) {
        field3200++;
        class118 var2 = class126.method814(true, arg0, 11);
        if (arg1 > -107) {
            method1483(-3, (byte) -122);
        }
        var2.method778(27970);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I", line = 57)
    private final int method1484(int arg0, int arg1) {
        if (arg1 <= 100) {
            this.toString();
        }
        field3196++;
        int var3 = this.field3194.length;
        while (var3 <= arg0) {
            if (!this.field3203) {
                var3 += this.field3195;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field3195 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;", line = 87)
    public final String toString() {
        field3202++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field3198; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field3194[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 113)
    public static void method1485(boolean arg0) {
        field3199 = null;
        if (!arg0) {
            method1485(false);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 131)
    public final String[] method1486(int arg0) {
        field3197++;
        String[] var2 = new String[this.field3198 + 1];
        class34.method242(this.field3194, 0, var2, 0, this.field3198 + 1);
        return arg0 >= -64 ? null : var2;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IZ)V", line = 161)
    public class230(int arg0, boolean arg1) {
        this.field3195 = arg0;
        this.field3203 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;)V", line = 172)
    public final void method1487(int arg0, String arg1) {
        field3192++;
        this.method1481((byte) 58, arg1, this.field3198 + 1);
        if (arg0 > -110) {
            this.toString();
        }
    }
}
