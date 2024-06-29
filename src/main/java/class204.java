import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class204 extends class166 {

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Ldh;")
    public static class36 field4014 = new class36(4096);

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "Lcd;")
    public static class23 field4020 = class54.method414("Fps:", -1);

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Ldh;")
    public static class36 field4021 = new class36(32);

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "[Z")
    public static boolean[] field4024 = new boolean[100];

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field4022 = 0;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field4023 = -1;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(II)V")
    public class204(int arg0, int arg1) {
        this.field4017 = arg1;
        this.field4018 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZ)V")
    public static final void method1333(int arg0, int arg1, int arg2, boolean arg3) {
        field4019++;
        if (class160.field3209 != 0 && arg0 != 0 && class51.field1216 < 50) {
            class62.field1441[class51.field1216] = arg2;
            class122.field2527[class51.field1216] = arg0;
            class29.field621[class51.field1216] = arg1;
            client.field572[class51.field1216] = null;
            class117.field2441[class51.field1216] = 0;
            class51.field1216++;
        }
        if (arg3) {
            field4021 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static void method1334(boolean arg0) {
        field4014 = null;
        field4024 = null;
        if (arg0) {
            field4020 = null;
            field4021 = null;
        }
    }
}
