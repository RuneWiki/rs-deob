import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class44 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1149 = 1;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lv;")
    public static class122 field1153 = class55.method425(-98, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Z")
    public static boolean field1151 = false;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1159 = 0;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lab;")
    public static class3 field1157;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lm;")
    public static class72 field1155;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 16)
    public static void method371(boolean arg0) {
        field1155 = null;
        field1153 = null;
        field1157 = null;
        if (!arg0) {
            field1149 = 97;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lv;", line = 35)
    public static final class122 method372(int arg0, int arg1) {
        field1152++;
        if (arg1 < 100000) {
            return class119.method914(arg1, 10);
        } else {
            if (arg0 != 1000) {
                method375(-92);
            }
            return arg1 < 10000000 ? class59.method454(new class122[] { class119.method914(arg1 / 1000, 10), class119.field2861 }, arg0 ^ 0x17D0) : class59.method454(new class122[] { class119.method914(arg1 / 1000000, 10), class19.field477 }, 5176);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILrc;ZII)V", line = 54)
    public static final void method373(int arg0, class105 arg1, boolean arg2, int arg3, int arg4) {
        class37.field964.method473((byte) -4);
        field1158++;
        class2.field64.method63(0, 0);
        if (!arg2) {
            return;
        }
        arg1.method814(class93.field2375, 55, 28, 16777215, true);
        if (arg0 == 0) {
            arg1.method814(class60.field1552, 55, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg1.method814(class88.field2257, 55, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg1.method814(class24.field663, 55, 41, 16711680, true);
        }
        if (arg0 == 3) {
            arg1.method814(class66.field1687, 55, 41, 65535, true);
        }
        arg1.method814(class100.field2491, 184, 28, 16777215, true);
        if (arg3 == 0) {
            arg1.method814(class60.field1552, 184, 41, 65280, true);
        }
        if (arg3 == 1) {
            arg1.method814(class88.field2257, 184, 41, 16776960, true);
        }
        if (arg3 == 2) {
            arg1.method814(class24.field663, 184, 41, 16711680, true);
        }
        arg1.method814(class23.field626, 324, 28, 16777215, true);
        if (arg4 == 0) {
            arg1.method814(class60.field1552, 324, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg1.method814(class88.field2257, 324, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg1.method814(class24.field663, 324, 41, 16711680, true);
        }
        arg1.method814(class64.field1629, 458, 33, 16777215, true);
        try {
            Graphics var5 = class54.field1411.getGraphics();
            class37.field964.method122(121, var5, 0, 453);
        } catch (Exception var6) {
            class54.field1411.repaint();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lv;Lv;Lv;Z)V", line = 117)
    public static final void method374(class122 arg0, class122 arg1, class122 arg2, boolean arg3) {
        field1150++;
        class88.field2253 = arg2;
        if (arg3) {
            method372(52, -115);
        }
        class88.field2254 = arg0;
        class88.field2258 = arg1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I", line = 174)
    public static final int method375(int arg0) {
        field1147++;
        if (arg0 >= -76) {
            method373(-84, null, false, -113, 0);
        }
        return 19;
    }
}
