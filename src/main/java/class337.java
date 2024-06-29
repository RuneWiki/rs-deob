import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class337 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
    private boolean field4882 = false;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field4883 = new String[0];

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    private int field4891 = -1;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    private int field4893;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field4889 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lvr;")
    public static class147 field4884;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    private final void method2137(String arg0, int arg1, byte arg2) {
        if (arg1 > this.field4891) {
            this.field4891 = arg1;
        }
        field4888++;
        if (arg2 > -53) {
            field4889 = -64;
        }
        if (arg1 >= this.field4883.length) {
            this.method2143(arg1, (byte) -64);
        }
        this.field4883[arg1] = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method2138(int arg0) {
        if (arg0 >= -102) {
            field4890 = 2;
        }
        field4884 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method2139(int arg0) {
        field4892++;
        if (arg0 != -21445) {
            field4890 = 62;
        }
        String[] var2 = new String[this.field4891 + 1];
        class278.method1799(this.field4883, 0, var2, 0, this.field4891 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method2140(int arg0, String arg1) {
        field4887++;
        if (arg1 == null) {
            return false;
        } else if (arg0 <= 110) {
            return true;
        } else {
            for (int var2 = 0; var2 < class5.field54; var2++) {
                if (arg1.equalsIgnoreCase(class602.field8189[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class768.field10593[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method2141(String arg0, int arg1) {
        field4885++;
        this.method2137(arg0, this.field4891 + 1, (byte) -77);
        if (arg1 < 17) {
            this.field4883 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4886++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field4891; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field4883[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
    private final int method2142(int arg0, int arg1) {
        field4894++;
        int var3 = this.field4883.length;
        while (arg1 >= var3) {
            if (!this.field4882) {
                var3 += this.field4893;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field4893 * var3;
            }
        }
        if (arg0 != 1) {
            this.method2139(121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
    private final void method2143(int arg0, byte arg1) {
        field4881++;
        String[] var3 = new String[this.method2142(1, arg0)];
        class278.method1799(this.field4883, 0, var3, 0, this.field4883.length);
        this.field4883 = var3;
        if (arg1 > -36) {
            this.method2139(-3);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IZ)V")
    public class337(int arg0, boolean arg1) {
        this.field4882 = arg1;
        this.field4893 = arg0;
    }
}
