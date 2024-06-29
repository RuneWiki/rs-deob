import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class13 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field199 = 0;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Lqd;")
    public static class37 field203 = new class37(64);

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field207 = 0;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Ljava/lang/String;")
    public static String field208 = "Loaded input handler";

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Lve;")
    public static class233 field205;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lve;")
    public static class233 field209;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lij;")
    public static class69 field204;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static final void method107(byte arg0) {
        class275.field4409 = null;
        class114.method795(false, class250.field3813, class193.field2774, 0, -1, 0, 0, 0, class214.field3080);
        if (class275.field4409 != null) {
            class192.method1231(-1412584499, class107.field1554, class219.field3231.field4061, class45.field632, class275.field4409, false, class214.field3080, class250.field3813, 0, 0);
            class275.field4409 = null;
        }
        field206++;
        if (arg0 != 119) {
            method110((byte) -31);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method108(int arg0) {
        class146.method979(false, true);
        field202++;
        if (arg0 != -5955) {
            method107((byte) -11);
        }
        System.gc();
        class245.method1608((byte) 84, 25);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public static void method109(byte arg0) {
        field203 = null;
        field204 = null;
        if (arg0 != 74) {
            method107((byte) 27);
        }
        field209 = null;
        field208 = null;
        field205 = null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public static final void method110(byte arg0) {
        if (arg0 != 65) {
            method111((class267) null, -74, 98);
        }
        for (int var1 = 0; var1 < class160.field2317; var1++) {
            class108 var2 = class20.method156(arg0 ^ 0x7B72, var1);
            if (var2 != null && var2.field1558 == 0) {
                class43.field616[var1] = 0;
                class20.field276[var1] = 0;
            }
        }
        field200++;
        class51.field749 = new class190(16);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lha;II)Ljava/lang/String;")
    public static final String method111(class267 arg0, int arg1, int arg2) {
        field197++;
        if (arg2 < 17) {
            return null;
        } else if (!client.method1439(arg0).method631((byte) -55, arg1) && arg0.field4147 == null) {
            return null;
        } else if (arg0.field4108 == null || arg0.field4108.length <= arg1 || arg0.field4108[arg1] == null || arg0.field4108[arg1].trim().length() == 0) {
            return class268.field4194 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field4108[arg1];
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lve;Lve;BZ)V")
    public static final void method112(class233 arg0, class233 arg1, byte arg2, boolean arg3) {
        field201++;
        int var4 = 106 / ((81 - arg2) / 35);
        class240.field3610 = arg3;
        class170.field2451 = arg0;
        field205 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class13() {
        new class218();
    }
}
