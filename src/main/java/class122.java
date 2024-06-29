import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class122 {

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "Z")
    private boolean field1632;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "Z")
    private boolean field1636;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field1631 = 0;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "Z")
    public static boolean field1639 = false;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)I", line = 3)
    public final int method721(boolean arg0) {
        if (arg0) {
            field1639 = false;
        }
        field1640++;
        return this.field1638;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZ)Z", line = 17)
    public static final boolean method722(int arg0, boolean arg1) {
        field1637++;
        if (arg0 == 8 || arg0 == 51 || arg0 == 48 || arg0 == 30 || arg0 == 20) {
            return true;
        } else if (arg0 == 21 || arg0 == 1003) {
            return true;
        } else if (arg1) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)I", line = 39)
    public final int method723(byte arg0) {
        if (arg0 != 90) {
            this.field1636 = false;
        }
        field1634++;
        return this.field1641;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)Z", line = 50)
    public final boolean method724(byte arg0) {
        field1642++;
        if (arg0 != -97) {
            this.field1641 = 97;
        }
        return this.field1636;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)Z", line = 65)
    public final boolean method725(int arg0) {
        if (arg0 == -49) {
            field1633++;
            return this.field1632;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIIIIIIII)V", line = 83)
    public static final void method726(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg0) {
            field1635++;
            class345.method2001(arg6, arg5, arg2, -4263, arg8, arg3, arg1, arg4, 0, arg7);
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(ZIIZ)V", line = 96)
    public class122(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field1632 = arg0;
        this.field1638 = arg2;
        this.field1641 = arg1;
        this.field1636 = arg3;
    }
}
