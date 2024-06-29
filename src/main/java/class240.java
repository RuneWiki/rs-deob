import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class240 {

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "[I")
    public static int[] field4231 = new int[200];

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "[I")
    public static int[] field4239 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "Ljf;")
    public static class229 field4238 = class212.method1457((byte) 59, "::");

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "J")
    public long field4233;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Lhg;")
    public class174 field4237;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Lhg;")
    public class174 field4240;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "Lhg;")
    public class174 field4241;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lek;")
    public static class185 field4230;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILtb;ZLtb;IZI)I", line = 21)
    public static final int method1741(int arg0, class222 arg1, boolean arg2, class222 arg3, int arg4, boolean arg5, int arg6) {
        int var7 = class15.method147(arg6, (byte) 92, arg3, arg1, arg2);
        field4234++;
        int var8 = 53 % ((arg0 + 41) / 41);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var9 = class15.method147(arg4, (byte) 92, arg3, arg1, arg5);
            return arg5 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 52)
    public static void method1742(int arg0) {
        field4238 = null;
        int var1 = 13 % ((68 - arg0) / 42);
        field4231 = null;
        field4230 = null;
        field4239 = null;
    }
}
