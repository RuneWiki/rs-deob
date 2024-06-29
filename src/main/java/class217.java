import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class217 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "J")
    public long field3418;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lwj;")
    public class217 field3419;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lwj;")
    public class217 field3424;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)Lhg;", line = 4)
    public static final class173 method1552(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        return var3 == null || var3.field1472 == null ? null : var3.field1472;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)Z", line = 15)
    public final boolean method1553(byte arg0) {
        field3420++;
        if (this.field3424 == null) {
            return false;
        } else if (arg0 == -68) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 29)
    public final void method1554(byte arg0) {
        field3422++;
        if (this.field3424 == null) {
            return;
        }
        this.field3424.field3419 = this.field3419;
        this.field3419.field3424 = this.field3424;
        this.field3419 = null;
        this.field3424 = null;
        if (arg0 >= -23) {
            method1552(1, 50, -105);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)Z", line = 49)
    public static final boolean method1555(int arg0, int arg1, int arg2, int arg3) {
        if (class73.method600(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class225.method1604(var4 + 1, class41.field612[arg0][arg1][arg2] + arg3, var5 + 1) && class225.method1604(var4 + 128 - 1, class41.field612[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class225.method1604(var4 + 128 - 1, class41.field612[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class225.method1604(var4 + 1, class41.field612[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
