import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class438 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Z")
    public boolean field6394;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Z")
    public static boolean field6398 = false;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lbca;")
    public class613 field6393;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lbca;")
    public class613 field6396;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Z")
    public boolean field6397;

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Z)V")
    public class438(boolean arg0) {
        this.field6394 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)I")
    public static final int method2601(int arg0, int arg1, int arg2) {
        field6395++;
        int var3 = class41.method462(4, 24638, arg1 + 91923, arg0 + 45365) + (-(-(class41.method462(2, arg2 + 42046, arg1 + 37821, arg0 + 10294) - 128 >> 1) - (class41.method462(1, arg2 + 42046, arg1, arg0) - 128 >> 2)) - 128);
        if (arg2 != -17408) {
            method2601(-22, 111, 10);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Z")
    public final boolean method2602(int arg0) {
        if (arg0 != 2) {
            this.field6397 = true;
        }
        field6400++;
        return this.field6397 && !this.field6394;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public final void method2603(boolean arg0) {
        if (this.field6393 != null) {
            this.field6393.method7(-114);
        }
        field6399++;
        this.field6397 = arg0;
    }
}
