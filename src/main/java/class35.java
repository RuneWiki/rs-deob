import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class35 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field698 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lob;")
    public static class141 field699 = class175.method1195(40, " <col=ffffff>");

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field706 = 1;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lob;")
    private static class141 field708 = class175.method1195(40, "Members object");

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lob;")
    public static class141 field703 = class175.method1195(40, "Registrierter Benutzer");

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field707 = 0;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lob;")
    public static class141 field705 = field708;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lob;")
    private static class141 field709 = class175.method1195(40, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lob;")
    public static class141 field704 = field709;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lob;")
    public static class141 field700 = field709;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lud;I)V")
    public static final void method244(class203 arg0, int arg1) {
        field701++;
        int var2 = arg0.field3843 - class20.field344;
        int var3 = arg0.field3884 * 128 + arg0.field3871 * 64;
        int var4 = arg0.field3871 * 64 + arg0.field3835 * 128;
        arg0.field3854 += (var4 - arg0.field3854) / var2;
        arg0.field3889 += (var3 - arg0.field3889) / var2;
        if (arg1 != 776) {
            field708 = null;
        }
        arg0.field3856 = 0;
        if (arg0.field3847 == 0) {
            arg0.field3833 = 1024;
        }
        if (arg0.field3847 == 1) {
            arg0.field3833 = 1536;
        }
        if (arg0.field3847 == 2) {
            arg0.field3833 = 0;
        }
        if (arg0.field3847 == 3) {
            arg0.field3833 = 512;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method245(int arg0) {
        field700 = null;
        if (arg0 != -7607) {
            return;
        }
        field705 = null;
        field708 = null;
        field709 = null;
        field704 = null;
        field703 = null;
        field699 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static final void method246(int arg0) {
        field702++;
        if (!class61.field1194) {
            return;
        }
        class170 var1 = class204.method1352(class128.field2436, (byte) 56, class158.field3054);
        if (var1 != null && var1.field3343 != null) {
            class220 var2 = new class220();
            var2.field4168 = var1;
            var2.field4177 = var1.field3343;
            class224.method1441(-113, var2);
        }
        class61.field1194 = false;
        int var3 = 88 % ((arg0 - 10) / 45);
        class38.method252(var1, -105);
    }
}
