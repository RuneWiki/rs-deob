import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class class126 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "S")
    public static short field1797;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field1801;

    static {
        new class375("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field1797 = 32767;
        field1798 = -1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIZIIIZI)Z", line = 21)
    public static final boolean method805(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field1796++;
        int var9 = class339.field5365.field5339[0];
        int var10 = class339.field5365.field5344[0];
        if (var9 < 0 || class96.field1403 <= var9 || var10 < 0 || class485.field7122 <= var10) {
            return false;
        } else if (arg8 >= 0 && arg8 < class96.field1403 && arg6 >= 0 && class485.field7122 > arg6) {
            int var11 = class421.method2536(arg5, class444.field6605[class339.field5365.field2210], arg8, class111.field1557, arg1, var10, arg0, arg4, arg2, class168.field2446, class339.field5365.method2091(-15245), arg6, var9, -1, arg3);
            if (var11 < 1) {
                return false;
            }
            class112.field1573 = class111.field1557[var11 - 1];
            class479.field7009 = class168.field2446[var11 - 1];
            class390.field5913 = false;
            if (!arg7) {
                field1797 = -119;
            }
            class515.method3063((byte) -63);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)Z", line = 57)
    public static final boolean method807(byte arg0) {
        field1799++;
        if (arg0 <= 76) {
            return false;
        } else {
            return class74.field999 != class140.field2031 || class528.field7809 >= 2;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)Z", line = 72)
    public static final boolean method809(byte arg0, int arg1) {
        field1800++;
        if (arg0 <= 8) {
            return false;
        } else {
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        }
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(I)Z", line = 84)
    public final boolean method810(int arg0) {
        field1801++;
        if (arg0 != -2) {
            field1798 = -91;
        }
        return this.method802(true) || this.method803((byte) 115) || this.method806(29194);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public abstract void method801(int arg0);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)Z")
    public abstract boolean method802(boolean arg0);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Z")
    public abstract boolean method803(byte arg0);

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
    public abstract void method804(int arg0);

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)Z")
    public abstract boolean method806(int arg0);

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)Luj;")
    public abstract class414 method808(int arg0);

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)I")
    public abstract int method811(boolean arg0);

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(Z)I")
    public abstract int method812(boolean arg0);
}
