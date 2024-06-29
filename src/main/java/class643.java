import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class643 {

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field8880 = new String[0];

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    private int field8875 = -1;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Z")
    private boolean field8872 = false;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    private int field8884;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Loh;")
    public static class370 field8874 = new class370(3, 2);

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lbt;")
    public static class40 field8871;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 3)
    private final void method3578(int arg0, int arg1) {
        if (arg0 < 118) {
            this.method3580(null, false);
        }
        field8881++;
        String[] var3 = new String[this.method3585(arg1, -101)];
        class359.method2052(this.field8880, 0, var3, 0, this.field8880.length);
        this.field8880 = var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Z", line = 24)
    public static final boolean method3579(byte arg0, int arg1, int arg2) {
        field8876++;
        if (arg0 != -114) {
            field8878 = -10;
        }
        return class315.method1909(arg2, arg1, (byte) 119) | (arg1 & 0x60000) != 0 || class479.method2698(arg2, arg1, 1);
    }

    @OriginalMember(owner = "client!hg", name = "toString", descriptor = "()Ljava/lang/String;", line = 36)
    public final String toString() {
        field8885++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field8875; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field8880[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 63)
    public final void method3580(String arg0, boolean arg1) {
        field8883++;
        if (!arg1) {
            field8871 = null;
        }
        this.method3582(this.field8875 + 1, (byte) -96, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 82)
    public final String[] method3581(int arg0) {
        if (arg0 == -1) {
            field8877++;
            String[] var2 = new String[this.field8875 + 1];
            class359.method2052(this.field8880, 0, var2, 0, this.field8875 + 1);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 96)
    private final void method3582(int arg0, byte arg1, String arg2) {
        field8879++;
        if (arg0 > this.field8875) {
            this.field8875 = arg0;
        }
        if (this.field8880.length <= arg0) {
            this.method3578(119, arg0);
        }
        if (arg1 > -19) {
            this.field8872 = false;
        }
        this.field8880[arg0] = arg2;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I", line = 114)
    public static final int method3583(int arg0, int arg1) {
        field8882++;
        return arg1 == 1 ? arg0 & 0x3FF : -78;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 125)
    public static void method3584(int arg0) {
        if (arg0 == 1) {
            field8871 = null;
            field8874 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IZ)V", line = 182)
    public class643(int arg0, boolean arg1) {
        this.field8884 = arg0;
        this.field8872 = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)I", line = 144)
    private final int method3585(int arg0, int arg1) {
        field8873++;
        int var3 = -71 % ((-arg1 - 10) / 59);
        int var4 = this.field8880.length;
        while (arg0 >= var4) {
            if (!this.field8872) {
                var4 += this.field8884;
            } else if (var4 == 0) {
                var4 = 1;
            } else {
                var4 = this.field8884 * var4;
            }
        }
        return var4;
    }
}
