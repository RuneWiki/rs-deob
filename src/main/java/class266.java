import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class266 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Z")
    public static boolean field4676 = false;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lsf;")
    public static class108 field4678 = class140.method973(255, "comp-Btence ");

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4677 = 0;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "[I")
    public static int[] field4681 = new int[50];

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Lsf;")
    private static class108 field4684 = class140.method973(255, "document)3cookie=(R");

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Lsf;")
    public static class108 field4682 = class140.method973(255, "overlay");

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Lsf;")
    public static class108 field4685 = class140.method973(255, ")4p=");

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V", line = 39)
    public static final void method1920(int arg0, byte arg1) {
        if (arg1 > -75) {
            field4681 = (int[]) null;
        }
        field4680++;
        if (arg0 == -1 || !class219.method1508(arg0, -123)) {
            return;
        }
        class98[] var2 = class320.field5485[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class98 var4 = var2[var3];
            if (var4.field1697 != null) {
                class286 var5 = new class286();
                var5.field4993 = var4.field1697;
                var5.field5006 = var4;
                class213.method1470(2000000, -26586, var5);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lsf;I)V", line = 80)
    public static final void method1921(class108 arg0, int arg1) {
        class160.field2869 = arg0;
        field4679++;
        if (class289.field5052.field2441 == null) {
            return;
        }
        try {
            class108 var2 = class167.field3009.method748(255, class289.field5052.field2441);
            int var3 = -20 / ((-arg1 - 69) / 51);
            class108 var4 = class88.field1402.method748(255, class289.field5052.field2441);
            class108 var5 = class117.method833(new class108[] { var2, class29.field446, arg0, class146.field2628, var4 }, false);
            class108 var6;
            if (arg0.method776(0) == 0) {
                var6 = class117.method833(new class108[] { var5, class207.field3710 }, false);
            } else {
                var6 = class117.method833(new class108[] { var5, class81.field1271, class42.method277(class118.method835(-1272) + 94608000000L, -112), class96.field1549, class261.method1851(1, 94608000L) }, false);
            }
            class117.method833(new class108[] { field4684, var6, class154.field2769 }, false).method785((byte) -124, class289.field5052.field2441);
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 113)
    public static void method1922(boolean arg0) {
        field4678 = null;
        field4681 = null;
        field4684 = null;
        field4685 = null;
        field4682 = null;
        if (!arg0) {
            field4677 = -17;
        }
    }
}
