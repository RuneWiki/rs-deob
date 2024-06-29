import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class620 extends class513 {

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public int field8825 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public int field8830 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public int field8827 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public int field8826 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public int field8832 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
    public int field8833 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public int field8835 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public int field8834 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "Lgfa;")
    public class753 field8836;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "Z")
    public static boolean field8828 = false;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method3631(int arg0, int arg1, int arg2) {
        if (arg1 != 55) {
            method3633(-51, 5);
        }
        field8837++;
        if (class755.method4186(arg0, arg2, (byte) 73)) {
            return class71.method449(arg0, arg2, false) | (arg2 & 0x9000) != 0 | class664.method3812(256, arg2, arg0) ? true : ((arg2 & 0x2000) != 0 | class440.method2633(arg2, (byte) -124, arg0) | class295.method1725(arg2, arg1 ^ 0xFFFFFF9E, arg0)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 25)
    public static final void method3632(int arg0) {
        class538 var1 = class440.field6036;
        synchronized (class440.field6036) {
            class440.field6036.method3210(false);
        }
        if (arg0 > -108) {
            field8828 = false;
        }
        field8824++;
        class538 var2 = class111.field1592;
        synchronized (class111.field1592) {
            class111.field1592.method3210(false);
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lgfa;)V", line = 113)
    public class620(class753 arg0) {
        this.field8836 = arg0;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V", line = 56)
    public static final void method3633(int arg0, int arg1) {
        if (arg0 == 36864) {
            field8831++;
            class118 var2 = class126.method814(true, arg1, 12);
            var2.method778(27970);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIB)Z", line = 72)
    public final boolean method3634(int arg0, int arg1, byte arg2) {
        field8829++;
        if (arg2 >= -61) {
            return false;
        } else if (arg1 >= this.field8825 && this.field8834 >= arg1 && arg0 >= this.field8833 && arg0 <= this.field8827) {
            return true;
        } else {
            return this.field8835 <= arg1 && arg1 <= this.field8832 && this.field8826 <= arg0 && this.field8830 >= arg0;
        }
    }
}
