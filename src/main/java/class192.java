import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class192 {

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[S")
    public static short[] field2724 = new short[256];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lhe;")
    public static class239 field2719;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 5)
    public static void method1205(int arg0) {
        if (arg0 == 5716) {
            field2719 = null;
            field2724 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)Z", line = 19)
    public final boolean method1206(int arg0) {
        field2725++;
        if (arg0 != -1) {
            field2722 = 60;
        }
        return (this.field2718 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Z", line = 32)
    public final boolean method1207(byte arg0) {
        field2723++;
        if (arg0 < 117) {
            this.method1206(-53);
        }
        return (this.field2718 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 45)
    public static final void method1208(int arg0) {
        field2727++;
        class270 var1 = (class270) class265.field3759.method2096(-21400);
        boolean var2 = class164.field2146 != null || class184.field2605 > 0;
        if (var2) {
            class140.field1835 = 1;
        }
        if (class23.field303 && class489.field7484.method1877(127, 81) && class383.field5696 > 2) {
            if (var2) {
                class499.field7611 = (class262) class230.field3220.field5018.field1173.field1173;
            } else {
                class52.method384(var1.method1019((byte) -126), (class262) class230.field3220.field5018.field1173.field1173, true, var1.method1018(-30361));
            }
        } else if (var2) {
            class499.field7611 = (class262) class230.field3220.field5018.field1173;
        } else {
            class52.method384(var1.method1019((byte) -107), (class262) class230.field3220.field5018.field1173, true, var1.method1018(-30361));
        }
        if (arg0 != 0) {
            field2719 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIIII)V", line = 84)
    public static final void method1209(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2717++;
        if (arg4 <= arg3) {
            class238.method1440(class41.field629[arg1], arg2, arg3, arg4, -14726);
        } else {
            class238.method1440(class41.field629[arg1], arg2, arg4, arg3, -14726);
        }
        if (!arg0) {
            method1208(-48);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Z", line = 114)
    public final boolean method1210(boolean arg0) {
        field2720++;
        if (arg0) {
            method1208(28);
        }
        return (this.field2718 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Z", line = 126)
    public final boolean method1211(int arg0) {
        int var2 = -121 / (-arg0 / 37);
        field2726++;
        return (this.field2718 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 140)
    public static final void method1212(int arg0) {
        field2716++;
        class235.field3305 = null;
        if (arg0 != -8446) {
            return;
        }
        class100.method605(class223.field3156, 0, 0, -1, arg0 ^ 0x20FD, 0, 0, class207.field2874, class465.field6737);
        if (class235.field3305 != null) {
            class124.method699(class207.field2874, -1412584499, class223.field3156, (byte) 39, class235.field3305, class139.field1821, 0, class65.field965.field5295, class188.field2684, 0);
            class235.field3305 = null;
        }
    }
}
