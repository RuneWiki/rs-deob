import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class326 {

    @OriginalMember(owner = "client!dja", name = "h", descriptor = "[I")
    public int[] field4457;

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "[S")
    public short[] field4451;

    @OriginalMember(owner = "client!dja", name = "f", descriptor = "[S")
    public short[] field4455;

    @OriginalMember(owner = "client!dja", name = "g", descriptor = "J")
    public long field4456;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!dja", name = "e", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(III)Lkh;")
    public static final class17 method2066(int arg0, int arg1, int arg2) {
        field4454++;
        class17 var3 = class379.method2309(arg1, 192);
        if (arg2 < 60) {
            method2066(-118, -61, 105);
        }
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field320 == null || var3.field320.length <= arg0) {
            return null;
        } else {
            return var3.field320[arg0];
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIBJIZLgj;)V")
    public static final void method2067(int arg0, int arg1, byte arg2, long arg3, int arg4, boolean arg5, class662 arg6) {
        class691.method3870(arg6, arg4, 0, 10000, arg1, arg5, arg3, arg0);
        field4450++;
        if (arg2 != 3) {
            field4452 = 51;
        }
    }

    @OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(J[I[S[S)V")
    public class326(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field4457 = arg1;
        this.field4451 = arg2;
        this.field4455 = arg3;
        this.field4456 = arg0;
    }

    @OriginalMember(owner = "client!dja", name = "<init>", descriptor = "()V")
    protected class326() {
    }
}
