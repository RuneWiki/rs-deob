import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class366 extends class114 {

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public int field5607;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lsv;")
    public class477 field5606;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lsv;I)V", line = 8)
    public class366(class477 arg0, int arg1) {
        this.field5607 = arg1;
        this.field5606 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)I", line = 18)
    public static final int method2333(byte arg0) {
        field5612++;
        if (arg0 != 64) {
            field5609 = -59;
        }
        return 16;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V", line = 29)
    public static final void method2334(int arg0, int arg1) {
        if (arg1 != 0) {
            field5609 = 32;
        }
        class503.field7427 = arg0;
        field5611++;
        class81.field1184.method2127((byte) -49);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)I", line = 46)
    public static final int method2335(int arg0, String arg1) {
        field5610++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class454.field6834; var2++) {
            if (arg1.equalsIgnoreCase(class466.field6946[var2])) {
                return var2;
            }
        }
        if (arg0 != -1) {
            method2334(5, -32);
        }
        return -1;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method656(int arg0);

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)Z")
    public abstract boolean method657(int arg0);
}
