import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class273 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public int field4523 = -1;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field4522 = 100;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "[I")
    public static int[] field4527 = new int[2500];

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[[Z")
    public static boolean[][] field4524 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lth;")
    public static class57 field4528;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method2044(int arg0, int arg1, int arg2) {
        int var3 = class215.field3440[arg0][arg1][arg2];
        if (-class151.field2404 == var3) {
            return false;
        } else if (class151.field2404 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class326.method2295(var4 + 1, class101.field1656[arg0][arg1][arg2], var5 + 1) && class326.method2295(var4 + 128 - 1, class101.field1656[arg0][arg1 + 1][arg2], var5 + 1) && class326.method2295(var4 + 128 - 1, class101.field1656[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class326.method2295(var4 + 1, class101.field1656[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class215.field3440[arg0][arg1][arg2] = class151.field2404;
                return true;
            } else {
                class215.field3440[arg0][arg1][arg2] = -class151.field2404;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lcn;", line = 42)
    public static final class279 method2045(int arg0, int arg1) {
        class279 var2 = (class279) class166.field2625.method2329((byte) 107, (long) arg1);
        field4533++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class329.field5233.method472(arg1, 84, arg0);
        class279 var4 = new class279();
        if (var3 != null) {
            var4.method2062(arg1, new class227(var3), arg0 ^ 0x64);
        }
        class166.field2625.method2333((long) arg1, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 78)
    public static void method2046(int arg0) {
        field4524 = (boolean[][]) null;
        field4528 = null;
        if (arg0 > -114) {
            field4522 = 8;
        }
        field4527 = null;
    }
}
