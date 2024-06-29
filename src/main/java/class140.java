import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class140 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field1835 = 0;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1833 = new String[100];

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "F")
    public static float field1836;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 6)
    public static final void method885(int arg0) {
        class136.field1750.method35((byte) -1);
        field1837++;
        class65.field970.method35((byte) -1);
        class378.field5643.method35((byte) -1);
        class491.field7501.method35((byte) -1);
        if (arg0 >= 34) {
            class392.field5804.method35((byte) -1);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 33)
    public static void method886(byte arg0) {
        field1833 = null;
        if (arg0 >= -33) {
            field1833 = null;
        }
    }
}
