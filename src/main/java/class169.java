import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class169 {

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2737 = "Loaded interfaces";

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2735 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 9)
    public static void method1278(byte arg0) {
        if (arg0 < 4) {
            field2735 = 53;
        }
        field2737 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z", line = 20)
    public final boolean method1279(int arg0) {
        if (arg0 != 8) {
            this.field2731 = 61;
        }
        field2739++;
        return (this.field2736 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Z", line = 32)
    public final boolean method1280(int arg0) {
        if (arg0 != 27494) {
            this.method1279(72);
        }
        field2740++;
        return (this.field2736 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILpa;ZLpa;ZII)I", line = 46)
    public static final int method1281(int arg0, class163 arg1, boolean arg2, class163 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 >= -25) {
            return 93;
        }
        field2734++;
        int var7 = class71.method501(arg1, arg3, arg6, -78, arg2);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class71.method501(arg1, arg3, arg5, -90, arg4);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Z", line = 80)
    public final boolean method1282(byte arg0) {
        if (arg0 <= 8) {
            return true;
        } else {
            field2733++;
            return (this.field2736 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)Z", line = 96)
    public final boolean method1283(int arg0) {
        if (arg0 != 25247) {
            this.method1280(50);
        }
        field2738++;
        return (this.field2736 & 0x1) != 0;
    }
}
