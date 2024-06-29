import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class268 {

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lad;")
    public static class446 field3896 = new class446();

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lbu;")
    public static class21 field3898 = new class21(61, 3);

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lfba;")
    public static class27 field3899 = new class27(75, 4);

    @OriginalMember(owner = "client!se", name = "g", descriptor = "[I")
    public static int[] field3901 = new int[3];

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3902 = 0;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "[I")
    public static int[] field3903 = new int[4096];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lwia;")
    public static class791 field3900;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)Leo;")
    public static final class312 method1740(int arg0, int arg1, int arg2, int arg3) {
        field3897++;
        int var4 = -38 % ((16 - arg0) / 57);
        class312 var5 = null;
        if (arg2 == 0) {
            class386.field5349++;
            var5 = class353.method2245(class87.field971, class648.field9062, (byte) 17);
        }
        if (arg2 == 1) {
            var5 = class353.method2245(class87.field971, class545.field7825, (byte) 44);
            class621.field8730++;
        }
        var5.field4445.method2992((byte) 127, arg1 + class124.field1922);
        var5.field4445.method2969(class88.field999 + arg3, -414819352);
        var5.field4445.method2952(0, class629.field8820.method2138(82, -6759) ? 1 : 0);
        class416.field5701 = false;
        class779.field10695 = arg1;
        class530.field7675 = arg3;
        class22.method225((byte) -102);
        return var5;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1741(String arg0, byte arg1) {
        field3895++;
        if (arg1 != 117) {
            field3896 = null;
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static void method1742(boolean arg0) {
        field3903 = null;
        field3900 = null;
        field3899 = null;
        field3901 = null;
        field3896 = null;
        field3898 = null;
        if (arg0) {
            field3896 = null;
        }
    }
}
