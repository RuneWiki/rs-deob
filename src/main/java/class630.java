import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class630 {

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    private int field8852 = -1;

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "Z")
    private boolean field8862 = false;

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field8863 = new String[0];

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "I")
    private int field8859;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "[I")
    public static int[] field8851 = new int[1];

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "Ltm;")
    public static class334 field8858 = new class334(8, -1);

    @OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
    public static int field8864 = 2;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)[Ljava/lang/String;", line = 4)
    public final String[] method3567(byte arg0) {
        field8856++;
        String[] var2 = new String[this.field8852 + 1];
        if (arg0 == 80) {
            class571.method3310(this.field8863, 0, var2, 0, this.field8852 + 1);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLjava/lang/String;)V", line = 20)
    public final void method3568(byte arg0, String arg1) {
        field8853++;
        this.method3569(82, this.field8852 + 1, arg1);
        int var3 = 33 / ((arg0 - 71) / 47);
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(IZ)V", line = 196)
    public class630(int arg0, boolean arg1) {
        this.field8859 = arg0;
        this.field8862 = arg1;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILjava/lang/String;)V", line = 34)
    private final void method3569(int arg0, int arg1, String arg2) {
        if (arg1 > this.field8852) {
            this.field8852 = arg1;
        }
        field8860++;
        if (arg1 >= this.field8863.length) {
            this.method3571(arg1, false);
        }
        if (arg0 == 82) {
            this.field8863[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V", line = 52)
    public static void method3570(byte arg0) {
        field8858 = null;
        field8851 = null;
        if (arg0 >= -102) {
            field8858 = null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IZ)V", line = 66)
    private final void method3571(int arg0, boolean arg1) {
        field8854++;
        if (!arg1) {
            String[] var3 = new String[this.method3572(arg0, (byte) 68)];
            class571.method3310(this.field8863, 0, var3, 0, this.field8863.length);
            this.field8863 = var3;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)I", line = 99)
    private final int method3572(int arg0, byte arg1) {
        field8855++;
        int var3 = this.field8863.length;
        while (var3 <= arg0) {
            if (!this.field8862) {
                var3 += this.field8859;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field8859 * var3;
            }
        }
        if (arg1 != 68) {
            this.method3567((byte) 58);
        }
        return var3;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IZII)Lsr;", line = 136)
    public static final class540 method3573(int arg0, boolean arg1, int arg2, int arg3) {
        field8857++;
        class540 var4 = null;
        if (arg3 == 0) {
            var4 = class257.method1732(!arg1, class698.field9883, class655.field9332);
            class577.field8176++;
        }
        if (arg3 == 1) {
            var4 = class257.method1732(!arg1, class364.field5571, class655.field9332);
            class322.field4758++;
        }
        var4.field7707.method1982((byte) 108, class723.field10155 + arg0);
        var4.field7707.method1925(class265.field4123 + arg2, (byte) -58);
        var4.field7707.method1959(-21, class543.field7749.method455(-14469, 82) ? 1 : 0);
        class257.field4036 = arg0;
        class404.field5991 = arg2;
        class382.field5740 = arg1;
        class508.method3061((byte) 116);
        return var4;
    }

    @OriginalMember(owner = "client!naa", name = "toString", descriptor = "()Ljava/lang/String;", line = 168)
    public final String toString() {
        field8861++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field8852; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field8863[var2]);
        }
        var1.append("]");
        return var1.toString();
    }
}
