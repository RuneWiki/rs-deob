import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class129 {

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lfh;")
    public static class653 field1834 = new class653();

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
    public static int[] field1836 = new int[13];

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
    public static final int method962(int arg0, int arg1, int arg2) {
        field1831++;
        byte var3;
        if (arg0 < arg2) {
            var3 = 4;
            class109.method873(arg0 ^ 0xFFFFB187);
        } else if (arg2 > 10000) {
            var3 = 3;
            class651.method3652(false);
        } else if (arg2 > 5000) {
            class614.method3437((byte) -99);
            var3 = 2;
        } else {
            class699.method3932(arg0 - 20000, true);
            var3 = 1;
        }
        if (class748.field10451.field10399.method1924((byte) -38) != arg1) {
            class748.field10451.method4150(class748.field10451.field10400, arg1, -5);
            class415.method2331(false, arg1, -4);
        }
        class472.method2688(58);
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ldi;B)Z")
    public final boolean method963(class129 arg0, byte arg1) {
        field1822++;
        if (this.field1823 == arg0.field1823 && this.field1830 == arg0.field1830 && this.field1829 == arg0.field1829) {
            return true;
        } else if (arg1 == -114) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method964(int arg0) {
        field1836 = null;
        field1834 = null;
        if (arg0 != 5000) {
            field1834 = null;
        }
    }
}
