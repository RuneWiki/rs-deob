import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class47 {

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Lsb;")
    public static class190 field709 = new class190(new byte[5000]);

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field714 = 0;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "J")
    public long field705;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lh;")
    public class111 field707;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Lh;")
    public class111 field708;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Lh;")
    public class111 field712;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lin;")
    public static class177 field704;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "[I")
    public static int[] field715;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 9)
    public static void method405(byte arg0) {
        field709 = null;
        field704 = null;
        if (arg0 <= 56) {
            field714 = 45;
        }
        field715 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V", line = 23)
    public static final void method406(int arg0, int arg1) {
        field711++;
        class95 var2 = class227.method1699(10, -1855723168, arg0);
        var2.method743(0);
        if (arg1 != -30407) {
            field709 = (class190) null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V", line = 44)
    public static final void method407(int arg0, int arg1) {
        field710++;
        class95 var2 = class227.method1699(arg1, -1855723168, arg0);
        var2.method743(0);
    }
}
