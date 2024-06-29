import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class515 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZ)Lmg;")
    public static final class103 method3063(int arg0, boolean arg1) {
        field7592++;
        class103[] var2 = class485.method2797(arg1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class103 var4 = var2[var3];
            if (var4.field1360 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3064(String arg0, int arg1) {
        field7595++;
        for (int var2 = arg1; var2 < class254.field3760.length; var2++) {
            if (class254.field3760[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }
}
