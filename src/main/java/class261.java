import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class261 extends class133 {

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lok;")
    private static class146 field4333 = class235.method1724(-12908, "Choose Option");

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lok;")
    public static class146 field4334 = field4333;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
    public static int[] field4335 = new int[4096];

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lok;")
    private static class146 field4339;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Lok;")
    public static class146 field4340;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "Lok;")
    public static class146 field4342;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[[Lhi;")
    public static class286[][] field4338;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V", line = 7)
    public static final void method1887(byte arg0) {
        if (arg0 == -118) {
            class159.field2681.method793((byte) -63);
            field4332++;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I", line = 18)
    public static final int method1888(byte arg0, int arg1) {
        field4337++;
        if (arg1 < 0) {
            return 0;
        }
        class258 var2 = (class258) class115.field1854.method810((byte) -88, (long) arg1);
        if (var2 == null) {
            return class192.method1486(arg1, (byte) -112).field769;
        }
        int var3 = 87 % ((arg0) / 48);
        int var4 = 0;
        for (int var5 = 0; var5 < var2.field4293.length; var5++) {
            if (var2.field4293[var5] == -1) {
                var4++;
            }
        }
        return var4 + class192.method1486(arg1, (byte) -104).field769 - var2.field4293.length;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V", line = 70)
    public static final void method1889(int arg0, int arg1) {
        field4331++;
        class119.field1920.method794(-17435, arg1);
        class280.field4797.method794(-17435, arg1);
        if (arg0 == -1) {
            class7.field141.method794(-17435, arg1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 86)
    public static void method1890(boolean arg0) {
        field4340 = null;
        if (arg0) {
            method1887((byte) 18);
        }
        field4334 = null;
        field4335 = null;
        field4342 = null;
        field4339 = null;
        field4333 = null;
        field4338 = (class286[][]) null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4335[var0] = class17.method133(false, var0);
        }
        field4339 = class235.method1724(-12908, "level: ");
        field4340 = class235.method1724(-12908, "<col=ffffff> )4 ");
        field4342 = field4339;
        field4343 = 0;
    }
}
