import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class254 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lve;")
    public static class255 field4279 = class87.method607(123, "<img=1>");

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lve;")
    public static class255 field4284 = class87.method607(49, " loggt sich aus)3");

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lve;")
    public static class255 field4285 = null;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lve;")
    public static class255 field4290 = class87.method607(48, "gr-Un:");

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lve;")
    private static class255 field4289 = class87.method607(92, "red:");

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lve;")
    public static class255 field4282 = class87.method607(38, " )2> ");

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lve;")
    public static class255 field4287 = field4289;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lve;")
    public static class255 field4280 = field4289;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lff;")
    public static class47 field4286;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lvh;")
    public static class48 field4283;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lrg;")
    public static class88 field4278;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 21)
    public static void method1734(byte arg0) {
        field4287 = null;
        if (arg0 != -55) {
            return;
        }
        field4284 = null;
        field4286 = null;
        field4282 = null;
        field4283 = null;
        field4285 = null;
        field4290 = null;
        field4278 = null;
        field4289 = null;
        field4279 = null;
        field4280 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 58)
    public static final void method1735(int arg0) {
        field4281++;
        int var1 = 114 % ((arg0 - 7) / 41);
        if (class107.field1800 != null && class72.field1188 != null) {
            return;
        }
        class107.field1800 = new int[256];
        class72.field1188 = new int[256];
        for (int var2 = 0; var2 < 256; var2++) {
            double var3 = (double) var2 / 255.0D * 6.283185307179586D;
            class107.field1800[var2] = (int) (Math.sin(var3) * 4096.0D);
            class72.field1188[var2] = (int) (Math.cos(var3) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lrg;ILca;Lrg;Lrg;)Z", line = 107)
    public static final boolean method1736(class88 arg0, int arg1, class90 arg2, class88 arg3, class88 arg4) {
        class33.field538 = arg4;
        class303.field5190 = arg0;
        if (arg1 != 0) {
            field4286 = (class47) null;
        }
        field4288++;
        class33.field531 = arg3;
        class242.field4080 = arg2;
        return true;
    }
}
