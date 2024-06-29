import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class116 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Z")
    public static boolean field1348 = false;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Z")
    public static final boolean method705(int arg0, int arg1) {
        field1347++;
        int var2 = 110 / ((arg0 + 47) / 59);
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method706(String arg0, byte arg1) {
        field1345++;
        if (arg1 != 66) {
            method706(null, (byte) -89);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + arg0.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V")
    public class116(int arg0) {
        this.field1343 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1346++;
        throw new IllegalStateException();
    }
}
