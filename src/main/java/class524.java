import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class524 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Ldda;")
    private class597 field7761;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public int field7759;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lhba;")
    public static class404 field7760 = new class404();

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Ldda;")
    public static class597 field7765;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static void method3092(int arg0) {
        field7765 = null;
        field7760 = null;
        if (arg0 != 2) {
            method3093(-55);
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
    public static final void method3093(int arg0) {
        field7762++;
        int var1 = class264.field3925;
        int[] var2 = class533.field7895;
        for (int var3 = 0; var3 < var1; var3++) {
            class179 var5 = class383.field5604[var2[var3]];
            if (var5 != null) {
                class200.method1296(var5.method514(0), -70, var5);
            }
        }
        int var4 = -127 / ((-arg0 - 33) / 60);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)V")
    public static final void method3094(int arg0, int arg1, int arg2, int arg3) {
        class221.field3268.method2576(true, arg0);
        field7763++;
        int var4 = 3 / ((-arg1 - 17) / 52);
        class221.field3268.method2577(arg3, -45066936);
        class221.field3268.method2619(arg2, 1420669333);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V")
    public static final void method3095(int arg0, int arg1) {
        field7764++;
        class621 var2 = class442.method2691(arg1, 2, true);
        if (arg0 != -12124) {
            field7765 = null;
        }
        var2.method3598(255);
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Loda;ILdda;)V")
    public class524(class559 arg0, int arg1, class597 arg2) {
        new class325(64);
        this.field7761 = arg2;
        this.field7759 = this.field7761.method3462(15, -100);
    }
}
