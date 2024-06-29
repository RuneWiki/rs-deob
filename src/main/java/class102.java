import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class102 {

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Z")
    public boolean field1709 = true;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1701 = 0;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field1704 = -2;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
    public static boolean field1700;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1703++;
        if (class11.field219 <= arg5 && class124.field2032 >= arg2 && class23.field408 <= arg3 && arg1 <= class125.field2056) {
            class91.method601(arg5, arg2, arg6, arg1, arg0, -21527, arg4, arg3);
        } else {
            class221.method1468(99, arg0, arg4, arg6, arg1, arg3, arg5, arg2);
        }
        if (arg7 != -2) {
            field1704 = 52;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
    public static int method690(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZZ)I")
    public static final int method691(int arg0, boolean arg1, boolean arg2) {
        field1702++;
        int var3 = arg0;
        if (arg1) {
            var3 = class74.field1180 + class214.field3683 + arg0;
        }
        if (arg2) {
            var3 += class19.field348 + class151.field2525;
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1709 = arg6;
        this.field1708 = arg2;
        this.field1706 = arg5;
        this.field1705 = arg0;
        this.field1699 = arg1;
        this.field1710 = arg4;
        this.field1707 = arg3;
    }
}
