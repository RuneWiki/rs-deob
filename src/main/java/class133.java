import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class133 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field2137 = 0;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lmb;")
    public static class258 field2141;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[B")
    public byte[] field2140;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[B")
    public byte[] field2147;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
    public static int[] field2145;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
    public static final boolean method1102(int arg0) {
        field2150++;
        class278 var1 = (class278) class276.field4153.field322.field497;
        if (var1 == null || class276.field4153.field322 == var1) {
            return false;
        } else {
            if (arg0 >= ~var1.field4182) {
                var1.field4182 -= 2000;
            }
            return var1.field4182 == 1010;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method1103(int arg0) {
        field2141 = null;
        field2145 = null;
        if (arg0 != -2) {
            field2137 = -6;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(arg1 & 0x1) == arg3) {
            int var7 = arg6;
            arg6 = arg5;
            arg5 = var7;
        }
        field2148++;
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg2;
        } else {
            return 1 - (arg5 - 7) - arg0;
        }
    }
}
