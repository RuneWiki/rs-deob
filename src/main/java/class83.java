import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class83 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field1159;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    public static int[] field1160 = new int[13];

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Luf;")
    public static class310 field1156 = new class310(104, -1);

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "F")
    public static float field1157;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lbs;")
    public static class483 field1158;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
    public static final void method588(byte arg0, int arg1) {
        field1162++;
        class137.field1956 = arg1;
        int var2 = 38 % ((arg0 - 67) / 54);
        class517.field7596 = -1;
        class517.field7596 = -1;
        class510.method2997((byte) 81);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1158 = null;
        field1160 = null;
        field1156 = null;
        if (arg0 < 93) {
            field1157 = 0.6132757F;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method590(int arg0, int arg1) {
        if (arg1 != -22602) {
            field1157 = 2.0652063F;
        }
        field1163++;
        return this.field1159[arg0];
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static final void method591(byte arg0) {
        field1161++;
        if (arg0 != -109) {
            return;
        }
        int var1 = class437.field6374.method562(arg0 + 235, class278.field3761);
        if (var1 == 0) {
            class99.field1369 = null;
            class56.method369((byte) -127, 0);
        } else if (var1 == 1) {
            class368.method2130((byte) 0, (byte) -36);
            class56.method369((byte) -103, 512);
            if (class456.field6661 != null) {
                class403.method2335((byte) -99);
            }
        } else {
            class368.method2130((byte) (class87.field1195 - 4 & 0xFF), (byte) -36);
            class56.method369((byte) -69, 2);
        }
        class84.field1169 = class400.field5571;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class83(String arg0, String arg1, String arg2, String arg3) {
        this.field1159 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!fg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1155++;
        throw new IllegalStateException();
    }
}
