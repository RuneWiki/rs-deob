import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class640 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lwu;")
    public static class557 field9093;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[J")
    public static long[] field9092;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method3718(int arg0) {
        field9093 = null;
        field9092 = null;
        if (arg0 != -25985) {
            method3720(-83, 104, 12, true, -63, 125, -19, -126, 90, -14);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static final void method3719(boolean arg0) {
        field9088++;
        if (class356.field4572 == null) {
            class172 var1 = new class172();
            byte[] var2 = var1.method1076(128, 16, 128, 122);
            class356.field4572 = class192.method1273(false, -105, var2);
        }
        if (arg0) {
            method3718(-59);
        }
        if (class19.field238 == null) {
            class485 var3 = new class485();
            byte[] var4 = var3.method2844(128, 16, 24683, 128);
            class19.field238 = class192.method1273(false, -89, var4);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIZIIIIII)Z")
    public static final boolean method3720(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9089++;
        if (!class533.method3181(arg6, arg8, arg1, 0)) {
            return false;
        } else if (arg3) {
            int var10 = class712.field10058[2];
            int var11 = class712.field10058[0];
            int var12 = class712.field10058[1];
            if (!class533.method3181(arg4, arg2, arg7, 0)) {
                return false;
            }
            int var13 = class712.field10058[2];
            int var14 = class712.field10058[0];
            int var15 = class712.field10058[1];
            if (class533.method3181(arg9, arg5, arg0, 0)) {
                int var16 = class712.field10058[2];
                int var17 = class712.field10058[1];
                int var18 = class712.field10058[0];
                return class435.method2617(var16, var15, var10, var17, var12, var14, -25506, var13, var18, var11);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9090++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3721(String arg0, byte arg1) {
        field9091++;
        if (arg0 == null) {
            return false;
        } else if (arg1 == 117) {
            for (int var2 = 0; var2 < class458.field6302; var2++) {
                if (arg0.equalsIgnoreCase(class144.field1996[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class545.field7697[var2])) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(II)V")
    public class640(int arg0, int arg1) {
    }
}
