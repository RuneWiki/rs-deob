import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class163 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Z")
    public static boolean field1818 = false;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[[Ljava/lang/String;")
    public static String[][] field1819 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 7)
    public static void method883(int arg0) {
        if (arg0 <= -88) {
            field1819 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILnp;)V", line = 19)
    public static final void method884(int arg0, class115 arg1) {
        field1820++;
        if ((arg1.field1269.length - arg1.field1218) < 1) {
            return;
        }
        int var2 = arg1.method620((byte) -126);
        if (var2 < 0 || var2 > 1) {
            return;
        }
        int var3 = 60 / ((-arg0 - 56) / 63);
        if (arg1.field1269.length - arg1.field1218 < 2) {
            return;
        }
        int var4 = arg1.method643((byte) -77);
        if (arg1.field1269.length - arg1.field1218 < var4 * 6) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method643((byte) -77);
            int var7 = arg1.method631(false);
            if (class371.field5066.length > var6 && class588.field8319[var6] && (class462.field6572.method802(var6, 92).field4801 != '1' || var7 >= -1 && var7 <= 1)) {
                class371.field5066[var6] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)Z", line = 73)
    public static final boolean method885(int arg0, int arg1, byte arg2) {
        field1816++;
        int var3 = 38 % ((32 - arg2) / 50);
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!gb", name = "toString", descriptor = "()Ljava/lang/String;", line = 83)
    public final String toString() {
        field1817++;
        throw new IllegalStateException();
    }
}
