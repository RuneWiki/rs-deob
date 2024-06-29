import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class101 {

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Lmo;")
    public static class779 field1275;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1280;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dba", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field1281;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method708(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dba", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field1277++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)I", line = 17)
    public static final int method706(byte arg0) {
        field1278++;
        int var1 = 0;
        Field[] var2 = (field1280 == null ? (field1280 = method708("mfa")) : field1280).getDeclaredFields();
        if (arg0 != -10) {
            method706((byte) -114);
        }
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field1281 == null ? (field1281 = method708("ok")) : field1281).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(II)V", line = 47)
    public class101(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 59)
    public static void method707(int arg0) {
        field1275 = null;
        if (arg0 <= 91) {
            field1276 = 8;
        }
    }
}
