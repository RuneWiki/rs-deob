import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class186 extends class424 {

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "Z")
    public boolean field2373;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "Loo;")
    public static class10 field2378;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "Lpe;")
    public static class615 field2370;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Lfi;")
    public static final class237 method1237(int arg0, int arg1, int arg2) {
        class530 var3 = class483.field6438[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6895;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static void method1238(int arg0) {
        field2378 = null;
        field2370 = null;
        if (arg0 != -20919) {
            method1238(-81);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static final void method1239(int arg0) {
        class382.field4895.method3656((byte) 0);
        field2369++;
        if (arg0 != 9329) {
            field2378 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIZ)V")
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2372 = arg1;
        this.field2373 = arg5;
        this.field2371 = arg2;
        this.field2374 = arg3;
        this.field2375 = arg4;
        this.field2379 = arg0;
    }
}
