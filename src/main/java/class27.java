import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class27 {

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Llj;")
    public class565 field337;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public abstract void method256(byte arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILvf;)V")
    public abstract void method257(int arg0, int arg1, class136 arg2);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BZ)V")
    public abstract void method258(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method259(int arg0, int arg1, byte arg2) {
        field334++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class301 var3 = class475.field6543.method2685(arg1, -73);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return arg2 < 116 ? true : var3.method1825(arg0, (byte) -116);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)Z")
    public abstract boolean method260(boolean arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public abstract void method261(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
    public static final int method262(int arg0, int arg1) {
        field336++;
        if (arg0 < ~arg1) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)V")
    public abstract void method263(boolean arg0, int arg1);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V")
    public static final void method264(int arg0, int arg1) {
        if (arg1 != -5048) {
            method262(-103, 93);
        }
        field333++;
        class371.field4990 = arg0;
        class48.field566.method3749(7648);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Llj;)V")
    public class27(class565 arg0) {
        this.field337 = arg0;
    }
}
