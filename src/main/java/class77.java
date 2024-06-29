import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class77 {

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field1490 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Lbd;")
    public static class305 field1492;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "[I")
    public static int[] field1493;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "[I")
    public static int[] field1494;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "[Lfa;")
    public static class195[] field1495;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 15)
    public static void method650(int arg0) {
        field1495 = null;
        field1494 = null;
        field1492 = null;
        if (arg0 != -4643) {
            method650(40);
        }
        field1493 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lud;I)Lud;", line = 28)
    public static final class279 method651(class279 arg0, int arg1) {
        if (arg1 >= -10) {
            method652(-36, -30, 24);
        }
        field1491++;
        int var2 = class166.method1296(74, arg0);
        return var2 == -1 ? class238.field4180 : class62.field1274.field2438[var2].method2007((byte) -118, class311.field5506, class96.field1787);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V", line = 49)
    public static final void method652(int arg0, int arg1, int arg2) {
        field1489++;
        if (arg2 != 0) {
            method652(-38, 112, -56);
        }
        class326.field5679[arg0] = arg1;
        class273 var3 = (class273) class162.field2920.method610((long) arg0, ~arg2);
        if (var3 == null) {
            class273 var4 = new class273(class127.method1015(arg2 ^ 0x5400) + 500L);
            class162.field2920.method612(false, var4, (long) arg0);
        } else {
            var3.field4858 = class127.method1015(arg2 + 21504) + 500L;
        }
    }
}
