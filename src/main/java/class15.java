import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class class15 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Lke;", line = 4)
    public static final class337 method139(int arg0, int arg1, int arg2) {
        if (class170.field2427[arg0][arg1][arg2] == null) {
            boolean var3 = class170.field2427[0][arg1][arg2] != null && class170.field2427[0][arg1][arg2].field5062 != null;
            if (var3 && arg0 >= class344.field5192 - 1) {
                return null;
            }
            class13.method127(arg0, arg1, arg2);
        }
        return class170.field2427[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 20)
    public static final boolean method140(String arg0, byte arg1) {
        if (arg1 != -68) {
            field210 = -108;
        }
        field209++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class330.field4951; var2++) {
            if (arg0.equalsIgnoreCase(class456.field6474[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class335.field5012[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IZI)Z", line = 50)
    public static final boolean method141(int arg0, boolean arg1, int arg2) {
        field211++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class271 var3 = class206.field3124.method338((byte) 120, arg0);
        if (arg1) {
            method140((String) null, (byte) -88);
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1760(-28496, arg2);
    }
}
