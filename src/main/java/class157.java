import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class157 extends class377 {

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field2064;

    @OriginalMember(owner = "client!kv", name = "L", descriptor = "I")
    public static int field2069 = 0;

    @OriginalMember(owner = "client!kv", name = "J", descriptor = "[I")
    public static int[] field2067 = new int[50];

    @OriginalMember(owner = "client!kv", name = "O", descriptor = "Ljr;")
    public static class357 field2072 = new class357(16);

    @OriginalMember(owner = "client!kv", name = "Q", descriptor = "I")
    public static int field2074 = 2;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!kv", name = "K", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!kv", name = "N", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!kv", name = "M", descriptor = "Lov;")
    public static class278 field2070;

    @OriginalMember(owner = "client!kv", name = "P", descriptor = "[I")
    public static int[] field2073;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V")
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class421.field5647.field7704 != 0 && arg3 != 0 && class405.field5433 < 50 && arg0 != -1) {
            class46.field673[class405.field5433++] = new class449((byte) 1, arg0, arg3, arg4, arg1, 0);
        }
        if (arg2 == -2) {
            field2071++;
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class157(Object arg0, int arg1) {
        super(arg1);
        this.field2064 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "(I)V")
    public static void method1059(int arg0) {
        field2073 = null;
        if (arg0 > -82) {
            method1062(125, null);
        }
        field2067 = null;
        field2072 = null;
        field2070 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)Z")
    public final boolean method1060(int arg0) {
        field2068++;
        int var2 = 100 % ((-arg0 - 68) / 57);
        return false;
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1061(byte arg0) {
        field2066++;
        if (arg0 != 45) {
            method1062(119, null);
        }
        return this.field2064;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[B)Z")
    public static final boolean method1062(int arg0, byte[] arg1) {
        field2065++;
        class88 var2 = new class88(arg1);
        int var3 = var2.method617(2);
        if (~var3 != arg0) {
            return false;
        }
        boolean var4 = var2.method617(2) == 1;
        if (var4) {
            class254.method1587(var2, true);
        }
        class370.method2159(var2, -8155);
        return true;
    }
}
