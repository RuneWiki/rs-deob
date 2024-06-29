import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class437 {

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public int field6444;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public int field6443;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public int field6438;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public int field6445;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "Laa;")
    public static class76 field6441 = new class76(32, 3);

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Laa;")
    public static class76 field6446 = new class76(68, 7);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
    public static final int method2568(int arg0) {
        field6440++;
        if (arg0 > -2) {
            field6446 = null;
        }
        if (class237.field3314 == null) {
            return class129.field1922 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIII)V")
    public static final void method2569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 29905) {
            field6446 = null;
        }
        field6442++;
        if (class297.field4427 <= arg4 && class102.field1544 >= arg5 && class305.field4555 <= arg2 && arg0 <= class286.field4290) {
            class300.method1863(arg0, arg4, arg5, arg1, arg2, 0);
        } else {
            class365.method2182(arg2, arg4, (byte) -94, arg0, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public static void method2570(byte arg0) {
        field6441 = null;
        field6446 = null;
        if (arg0 <= 11) {
            field6441 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6439++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIII)V")
    public class437(int arg0, int arg1, int arg2, int arg3) {
        this.field6444 = arg2;
        this.field6443 = arg0;
        this.field6438 = arg3;
        this.field6445 = arg1;
    }
}
