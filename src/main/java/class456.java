import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class456 extends class83 {

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    private int field6570;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    private int field6569;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    private int field6568;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    private int field6561;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field6562 = 0;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lum;")
    public static class365 field6571 = new class365();

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Lwh;")
    public static class100 field6572;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Lrp;")
    public static class302 field6563;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method2707(byte arg0) {
        field6572 = null;
        if (arg0 != -122) {
            method2707((byte) 75);
        }
        field6563 = null;
        field6571 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZI)V")
    public final void method679(int arg0, boolean arg1, int arg2) {
        ++field6567;
        int var4 = this.field6568 * arg0 >> 12;
        int var5 = this.field6570 * arg0 >> 12;
        if (arg1) {
            this.method679(101, false, -84);
        }
        int var6 = this.field6561 * arg2 >> 12;
        int var7 = this.field6569 * arg2 >> 12;
        class100.method755(var7, var6, var4, (byte) -97, var5, super.field1044);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    public final void method676(int arg0, int arg1, int arg2) {
        ++field6566;
        if (arg2 != 22742) {
            method2707((byte) 4);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZIIIIIII)Z")
    public static final boolean method2708(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6564;
        int var9 = class23.field336.field4944[0];
        int var10 = class23.field336.field4936[0];
        if (var9 >= 0 && ~class452.field6526 < ~var9 && ~var10 <= -1 && class440.field6307 > var10) {
            if (arg7 != 30799) {
                method2708(34, true, 124, -31, -102, 17, -72, 3, -41);
            }
            if (~arg2 <= -1 && ~arg2 > ~class452.field6526 && ~arg4 <= -1 && class440.field6307 > arg4) {
                int var11 = class160.method1034(class382.field5038, var10, arg0, arg8, arg6, class23.field336.method1366((byte) -114), (byte) 72, class172.field2185[class23.field336.field2676], arg3, arg1, arg4, var9, arg2, class439.field6296, arg5);
                if (~var11 > -2) {
                    return false;
                } else {
                    class274.field3441 = class439.field6296[var11 - 1];
                    class247.field3176 = class382.field5038[var11 + -1];
                    class199.field2593 = false;
                    class394.method2264((byte) -90);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIII)V")
    public class456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6570 = arg2;
        this.field6569 = arg3;
        this.field6568 = arg0;
        this.field6561 = arg1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V")
    public final void method678(int arg0, int arg1, int arg2) {
        ++field6565;
        if (arg2 != 0) {
            this.method676(76, -79, -33);
        }
    }
}
