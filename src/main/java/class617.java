import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class617 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lbh;")
    public static class538 field8782 = new class538(64);

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
    public static boolean field8783 = false;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field8784 = null;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3619(int arg0, String arg1) {
        field8781++;
        if (arg1.equals("")) {
            return;
        }
        if (arg0 != 1) {
            method3622((byte) 76);
        }
        class145.field2015++;
        class120 var2 = class292.method1716(class608.field8668, true, class448.field6161);
        var2.field1653.method184(class678.method3882(arg1, (byte) 109), -57);
        var2.field1653.method187(arg1, (byte) -87);
        class471.method2805(114, var2);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lbe;")
    public static final class230 method3620(int arg0) {
        if (arg0 == -30782) {
            field8780++;
            return class491.method2868(arg0 + 30814, 1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method3621(String arg0, byte arg1) {
        field8779++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        if (arg1 <= 36) {
            field8784 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)J")
    public abstract long method1445(byte arg0);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
    public static void method3622(byte arg0) {
        if (arg0 >= -127) {
            method3620(-65);
        }
        field8782 = null;
        field8784 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)Lch;")
    public static final class38 method3623(int arg0, int arg1, int arg2) {
        if (class352.field4549[arg0][arg1][arg2] == null) {
            boolean var3 = class352.field4549[0][arg1][arg2] != null && class352.field4549[0][arg1][arg2].field531 != null;
            if (var3 && arg0 >= class214.field3021 - 1) {
                return null;
            }
            class392.method2388(arg0, arg1, arg2);
        }
        return class352.field4549[arg0][arg1][arg2];
    }
}
