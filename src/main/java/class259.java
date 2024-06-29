import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class259 extends class141 {

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public int field4431;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field4433 = 0;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Lhi;")
    private static class82 field4428 = class95.method664((byte) -93, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[I")
    public static int[] field4437 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "Lhi;")
    public static class82 field4435 = field4428;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Lei;")
    public static class70 field4434;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "[Ljf;")
    public static class86[] field4430;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V", line = 4)
    public static final void method1845(int arg0, int arg1, int arg2) {
        field4429++;
        class227 var3 = class215.method1531(-1, 5, arg2);
        if (arg0 <= -94) {
            var3.method1616(64);
            var3.field3923 = arg1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 27)
    public static void method1846(byte arg0) {
        field4435 = null;
        field4428 = null;
        field4437 = null;
        field4430 = null;
        int var1 = 100 % ((arg0 + 5) / 62);
        field4434 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILum;Lum;)Lsc;", line = 40)
    public static final class145 method1847(int arg0, int arg1, int arg2, class222 arg3, class222 arg4) {
        field4436++;
        if (client.method866(arg0, arg2, (byte) 49, arg3)) {
            if (arg1 != 4) {
                field4430 = (class86[]) null;
            }
            return class215.method1537(arg4.method1577(arg2, arg0, -29569), 128);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 66)
    public class259() {
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V", line = 84)
    public static final void method1848(int arg0, int arg1) {
        class263.field4493.method2177(arg0, -125);
        field4432++;
        class149.field2525.method2177(arg0, 69);
        class164.field2861.method2177(arg0, 122);
        if (arg1 != 2) {
            field4428 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V", line = 98)
    public class259(int arg0) {
        this.field4431 = arg0;
    }
}
