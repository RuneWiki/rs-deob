import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class589 {

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "Z")
    private boolean field8461 = false;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field8457 = new String[0];

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    private int field8456 = -1;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    private int field8455;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "Laq;")
    public static class494 field8465 = new class494(3000000, 200);

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3451(boolean arg0) {
        if (arg0) {
            field8465 = null;
        }
        field8465 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 14)
    public final String[] method3452(int arg0) {
        if (arg0 != -32597) {
            this.field8455 = -58;
        }
        field8464++;
        String[] var2 = new String[this.field8456 + 1];
        class171.method1265(this.field8457, 0, var2, 0, this.field8456 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 36)
    public final void method3453(String arg0, int arg1) {
        field8463++;
        this.method3454(arg0, 0, this.field8456 - arg1);
    }

    @OriginalMember(owner = "client!dw", name = "toString", descriptor = "()Ljava/lang/String;", line = 46)
    public final String toString() {
        field8458++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field8456; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field8457[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IZ)V", line = 131)
    public class589(int arg0, boolean arg1) {
        this.field8461 = arg1;
        this.field8455 = arg0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 78)
    private final void method3454(String arg0, int arg1, int arg2) {
        if (this.field8456 < arg2) {
            this.field8456 = arg2;
        }
        field8462++;
        if (arg1 != 0) {
            this.toString();
        }
        if (arg2 >= this.field8457.length) {
            this.method3456(arg2, true);
        }
        this.field8457[arg2] = arg0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)I", line = 102)
    private final int method3455(int arg0, int arg1) {
        field8459++;
        if (arg1 != -1) {
            this.field8456 = 63;
        }
        int var3 = this.field8457.length;
        while (arg0 >= var3) {
            if (!this.field8461) {
                var3 += this.field8455;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field8455 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)V", line = 147)
    private final void method3456(int arg0, boolean arg1) {
        field8460++;
        String[] var3 = new String[this.method3455(arg0, -1)];
        if (!arg1) {
            this.toString();
        }
        class171.method1265(this.field8457, 0, var3, 0, this.field8457.length);
        this.field8457 = var3;
    }
}
