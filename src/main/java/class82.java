import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class82 {

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field1066 = new String[0];

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Z")
    private boolean field1062 = false;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    private int field1068 = -1;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Lmq;")
    public static class78 field1069 = new class78(84, 8);

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field1070 = 0;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method580(byte arg0, String arg1) {
        field1059++;
        this.method582(arg1, 0, this.field1068 + 1);
        if (arg0 != -108) {
            field1070 = 30;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)I")
    private final int method581(int arg0, byte arg1) {
        field1060++;
        int var3 = 37 / ((47 - arg1) / 39);
        int var4 = this.field1066.length;
        while (var4 <= arg0) {
            if (!this.field1062) {
                var4 += this.field1061;
            } else if (var4 == 0) {
                var4 = 1;
            } else {
                var4 = this.field1061 * var4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method582(String arg0, int arg1, int arg2) {
        field1067++;
        if (this.field1068 < arg2) {
            this.field1068 = arg2;
        }
        if (arg1 == 0) {
            if (this.field1066.length <= arg2) {
                this.method585((byte) 102, arg2);
            }
            this.field1066[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method583(int arg0) {
        field1058++;
        if (arg0 >= -59) {
            this.field1068 = -99;
        }
        String[] var2 = new String[this.field1068 + 1];
        class617.method3390(this.field1066, 0, var2, 0, this.field1068 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1064++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field1068; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field1066[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public static void method584(int arg0) {
        if (arg0 == 15557) {
            field1069 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IZ)V")
    public class82(int arg0, boolean arg1) {
        this.field1062 = arg1;
        this.field1061 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)V")
    private final void method585(byte arg0, int arg1) {
        if (arg0 <= 78) {
            this.toString();
        }
        field1063++;
        String[] var3 = new String[this.method581(arg1, (byte) -88)];
        class617.method3390(this.field1066, 0, var3, 0, this.field1066.length);
        this.field1066 = var3;
    }
}
