import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class186 {

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field2989 = new String[0];

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Z")
    private boolean field2994 = false;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    private int field2991 = -1;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    private int field2990;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Lue;")
    public static class213 field2999;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)[Ljava/lang/String;")
    public final String[] method1359(boolean arg0) {
        if (!arg0) {
            this.field2989 = null;
        }
        field2988++;
        String[] var2 = new String[this.field2991 + 1];
        class692.method3875(this.field2989, 0, var2, 0, this.field2991 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!fq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2998++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field2991; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field2989[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static void method1360(int arg0) {
        field2999 = null;
        if (arg0 != -1463) {
            method1360(-126);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
    private final void method1361(byte arg0, int arg1) {
        field2992++;
        int var3 = -91 / ((-arg0 - 21) / 39);
        String[] var4 = new String[this.method1362(arg1, (byte) 107)];
        class692.method3875(this.field2989, 0, var4, 0, this.field2989.length);
        this.field2989 = var4;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB)I")
    private final int method1362(int arg0, byte arg1) {
        if (arg1 != 107) {
            this.method1364(true, null);
        }
        field2995++;
        int var3 = this.field2989.length;
        while (var3 <= arg0) {
            if (!this.field2994) {
                var3 += this.field2990;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field2990 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    private final void method1363(String arg0, byte arg1, int arg2) {
        field2993++;
        if (this.field2991 < arg2) {
            this.field2991 = arg2;
        }
        if (this.field2989.length <= arg2) {
            this.method1361((byte) 90, arg2);
        }
        int var4 = -3 / (arg1 / 46);
        this.field2989[arg2] = arg0;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method1364(boolean arg0, String arg1) {
        if (!arg0) {
            this.field2994 = true;
        }
        field2996++;
        this.method1363(arg1, (byte) -87, this.field2991 + 1);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IZ)V")
    public class186(int arg0, boolean arg1) {
        this.field2990 = arg0;
        this.field2994 = arg1;
    }
}
