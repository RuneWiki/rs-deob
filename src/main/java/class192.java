import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class192 extends class119 {

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    private int field3438;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    private int field3440;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    private int field3444;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field3443 = 0;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field3449 = 100;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "[Lvc;")
    public static class190[] field3448;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
    public static final byte[] method1306(boolean arg0, Object arg1, byte arg2) {
        ++field3442;
        if (arg1 == null) {
            return null;
        } else if (arg2 >= -81) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class156.method1122(var3, 0) : var3;
        } else if (arg1 instanceof class267) {
            class267 var4 = (class267) arg1;
            return var4.method1486((byte) 112);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIII)V")
    public class192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3450 = arg3;
        this.field3438 = arg1;
        this.field3440 = arg0;
        this.field3444 = arg2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)V")
    public final void method187(byte arg0, int arg1, int arg2) {
        int var4 = this.field3438 * arg2 >> 12;
        ++field3446;
        int var5 = this.field3444 * arg1 >> 12;
        int var6 = this.field3440 * arg1 >> 12;
        if (arg0 == -36) {
            int var7 = this.field3450 * arg2 >> 12;
            class69.method431(var6, var7, var4, (byte) 8, var5, super.field2045);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(BII)V")
    public final void method186(byte arg0, int arg1, int arg2) {
        ++field3447;
        int var4 = this.field3450 * arg2 >> 12;
        int var5 = this.field3438 * arg2 >> 12;
        int var6 = this.field3444 * arg1 >> 12;
        int var7 = this.field3440 * arg1 >> 12;
        if (arg0 >= -39) {
            method1306(true, (Object) null, (byte) -78);
        }
        class157.method1135(var6, var5, super.field2042, var7, -18752, var4, super.field2038);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)V")
    public final void method188(int arg0, int arg1, byte arg2) {
        ++field3441;
        int var4 = this.field3440 * arg1 >> 12;
        int var5 = this.field3444 * arg1 >> 12;
        int var6 = this.field3450 * arg0 >> 12;
        int var7 = this.field3438 * arg0 >> 12;
        class191.method1300(super.field2038, var5, var6, super.field2045, super.field2042, var7, false, var4);
        if (arg2 != -67) {
            field3449 = 10;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1307(int arg0) {
        field3448 = null;
        if (arg0 >= -98) {
            method1306(false, (Object) null, (byte) 8);
        }
    }
}
