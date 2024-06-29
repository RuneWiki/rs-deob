import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class387 {

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Lql;")
    public class121 field5689;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "B")
    public byte field5687;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "S")
    public short field5692;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "B")
    public byte field5691;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field5690 = 0;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lql;III)V")
    public class387(class121 arg0, int arg1, int arg2, int arg3) {
        this.field5689 = arg0;
        this.field5687 = (byte) arg3;
        this.field5692 = (short) arg1;
        this.field5691 = (byte) arg2;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2459(String arg0, byte arg1) {
        field5688++;
        if (arg1 != -95) {
            field5690 = -64;
        }
        for (int var2 = 0; var2 < class215.field3251.length; var2++) {
            if (class215.field3251[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }
}
