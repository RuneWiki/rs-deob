import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class272 extends class238 {

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "[I")
    public static int[] field3967 = new int[32];

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "Lku;")
    public static class232 field3966 = new class232(20);

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "J")
    public static long field3969 = -1L;

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "Z")
    public static boolean field3970 = false;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "J")
    public long field3960;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "Lss;")
    public class272 field3964;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "Lss;")
    public class272 field3968;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "Lwn;")
    public static class469 field3959;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lrp;Ljava/lang/String;Z)I")
    public static final int method1670(class276 arg0, String arg1, boolean arg2) {
        field3965++;
        if (!arg2) {
            method1670((class276) null, (String) null, true);
        }
        int var3 = arg0.field4021;
        byte[] var4 = class398.method2384(arg1, 2);
        arg0.method1707(var4.length, 2);
        arg0.field4021 += class431.field6044.method1897(var4.length, arg0.field4021, 1, 0, var4, arg0.field4064);
        return arg0.field4021 - var3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method1671(int arg0) {
        if (arg0 <= 75) {
            field3967 = null;
        }
        field3967 = null;
        field3959 = null;
        field3966 = null;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)Z")
    public final boolean method1672(int arg0) {
        if (arg0 < 125) {
            method1670((class276) null, (String) null, false);
        }
        field3963++;
        return this.field3964 != null;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
    public final void method1673(byte arg0) {
        field3961++;
        if (arg0 == 27 && this.field3964 != null) {
            this.field3964.field3968 = this.field3968;
            this.field3968.field3964 = this.field3964;
            this.field3964 = null;
            this.field3968 = null;
        }
    }
}
