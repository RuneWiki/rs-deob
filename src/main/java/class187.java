import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class187 {

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field3640 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public int field3631;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public int field3635;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lqd;")
    public static class148 field3632;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lsg;")
    public class169 field3641;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Z")
    public boolean field3638;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static final void method1231(byte arg0) {
        class114.field2084.method1205(true);
        int var1 = 31 / ((arg0 + 39) / 41);
        field3629++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBII)V")
    public static final void method1232(int arg0, byte arg1, int arg2, int arg3) {
        field3643++;
        if (class32.field676 != 0 && arg2 != 0 && class103.field1886 < 50) {
            class118.field2200[class103.field1886] = arg3;
            class66.field1245[class103.field1886] = arg2;
            class158.field3031[class103.field1886] = arg0;
            class51.field894[class103.field1886] = null;
            class90.field1640[class103.field1886] = 0;
            class103.field1886++;
        }
        int var4 = -88 / ((arg1 - 20) / 32);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lqf;I)Z")
    public static final boolean method1233(class150 arg0, int arg1) {
        field3639++;
        if (class172.field3335) {
            if (class70.method436(arg0, 30) != 0) {
                return false;
            }
            if (arg0.field2882 == 0) {
                return false;
            }
        }
        if (arg1 != 0) {
            field3640 = -71;
        }
        return arg0.field2844;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public static void method1234(byte arg0) {
        if (arg0 >= -68) {
            method1231((byte) 73);
        }
        field3632 = null;
    }
}
