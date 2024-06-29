import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class370 extends class6 {

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "Ljava/lang/Object;")
    private Object field5342;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "Lpk;")
    public static class136 field5337 = new class136();

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)I", line = 3)
    public static final int method2265(int arg0) {
        if (arg0 != 0) {
            field5338 = -85;
        }
        field5343++;
        return class275.field4112++;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V", line = 15)
    public static void method2266(byte arg0) {
        if (arg0 == -7) {
            field5337 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 28)
    public final Object method17(int arg0) {
        field5340++;
        if (arg0 != 0) {
            field5338 = -94;
        }
        return this.field5342;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lnt;IIII)V", line = 39)
    public static final void method2267(class152 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class176.method1225(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class394.field5608) {
            class176.method1225(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class176.method1225(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class337.field5000) {
            class176.method1225(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class337.field5000) {
            class176.method1225(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class394.field5608 && arg4 <= class337.field5000) {
            class176.method1225(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class176.method1225(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class394.field5608 && arg4 > 0) {
            class176.method1225(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)Z", line = 98)
    public final boolean method19(byte arg0) {
        field5341++;
        int var2 = -10 % ((arg0 - 20) / 55);
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 108)
    public class370(Object arg0, int arg1) {
        super(arg1);
        this.field5342 = arg0;
    }
}
