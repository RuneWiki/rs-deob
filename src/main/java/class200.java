import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class200 extends class503 {

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public int field2659;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "Ltm;")
    public static class412 field2655 = new class412();

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "Z")
    public static boolean field2658 = false;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "[Lnb;")
    public static class319[] field2657;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 4)
    public static void method1359(int arg0) {
        if (arg0 != 0) {
            method1361(false, -88);
        }
        field2657 = null;
        field2655 = null;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIILkp;Lkp;)V", line = 20)
    public static final void method1360(int arg0, int arg1, int arg2, class516 arg3, class516 arg4) {
        class243 var5 = class501.method2895(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field3270 = arg3;
        var5.field3269 = arg4;
        int var6 = class538.field7317 == class528.field7227 ? 1 : 0;
        if (!arg3.method19(-119)) {
            arg3.field2252 = class503.field6961[var6];
            class503.field6961[var6] = arg3;
        } else if (arg3.method21(0)) {
            arg3.field2252 = class563.field7549[var6];
            class563.field7549[var6] = arg3;
        } else {
            arg3.field2252 = class308.field4450[var6];
            class308.field4450[var6] = arg3;
            class768.field10591 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method19(-95)) {
            if (arg4.method21(0)) {
                arg4.field2252 = class563.field7549[var6];
                class563.field7549[var6] = arg4;
                return;
            }
            arg4.field2252 = class308.field4450[var6];
            class308.field4450[var6] = arg4;
            class768.field10591 = true;
            return;
        }
        arg4.field2252 = class503.field6961[var6];
        class503.field6961[var6] = arg4;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZI)V", line = 82)
    public static final void method1361(boolean arg0, int arg1) {
        for (class39 var2 = (class39) class255.field3809.method2551((byte) -108); var2 != null; var2 = (class39) class255.field3809.method2542(-121)) {
            if (var2.field611 != null) {
                class686.field9647.method590(var2.field611);
                var2.field611 = null;
            }
            if (var2.field616 != null) {
                class686.field9647.method590(var2.field616);
                var2.field616 = null;
            }
            var2.method792((byte) -110);
        }
        if (arg1 > -27) {
            method1361(true, 78);
        }
        field2656++;
        if (!arg0) {
            return;
        }
        for (class39 var3 = (class39) class573.field7696.method2551((byte) -108); var3 != null; var3 = (class39) class573.field7696.method2542(-101)) {
            if (var3.field611 != null) {
                class686.field9647.method590(var3.field611);
                var3.field611 = null;
            }
            var3.method792((byte) -110);
        }
        for (class39 var4 = (class39) class680.field9518.method3960(0); var4 != null; var4 = (class39) class680.field9518.method3955((byte) 25)) {
            if (var4.field611 != null) {
                class686.field9647.method590(var4.field611);
                var4.field611 = null;
            }
            var4.method792((byte) -96);
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I)V", line = 154)
    public class200(int arg0) {
        this.field2659 = arg0;
    }
}
