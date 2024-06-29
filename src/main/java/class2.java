import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field16 = -1;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "[I")
    public static int[] field14;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field14 = null;
        int var1 = -55 % ((arg0 - 67) / 44);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lk;BZLjava/lang/String;Z)V")
    public static final void method9(class525 arg0, byte arg1, boolean arg2, String arg3, boolean arg4) {
        if (arg1 < 21) {
            field14 = null;
        }
        field12++;
        if (!arg4) {
            class680.method3877(arg0, arg3, false, 3);
            return;
        }
        if (class525.field7660.startsWith("win") && arg0.field7655) {
            String var5 = null;
            if (class450.field6772 != null) {
                var5 = class450.field6772.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class701 var6 = class680.method3877(arg0, arg3, false, 0);
                class268.field4359 = arg0;
                class148.field2467 = arg3;
                class331.field5129 = var6;
                return;
            }
        }
        if (class525.field7660.startsWith("mac")) {
            String var7 = null;
            if (class450.field6772 != null) {
                var7 = class450.field6772.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg2) {
                class680.method3877(arg0, arg3, false, 1);
                return;
            }
        }
        class680.method3877(arg0, arg3, false, 2);
    }
}
