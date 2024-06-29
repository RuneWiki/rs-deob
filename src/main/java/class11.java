import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class11 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lr;")
    private static class66 field126 = class93.method641(43, "Loaded sprites");

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lr;")
    private static class66 field129 = class93.method641(43, "flash3:");

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lr;")
    public static class66 field132 = class93.method641(43, "<col=80ff00>");

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[J")
    public static long[] field133 = new long[100];

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lr;")
    public static class66 field138 = field129;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lr;")
    public static class66 field135 = class93.method641(43, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lr;")
    public static class66 field140 = field126;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lr;")
    public static class66 field127 = class93.method641(43, "Hidden)2use");

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Lr;")
    public static class66 field141 = field129;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Luf;")
    public static class240 field124;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)I")
    public abstract int method45(boolean arg0);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method46(int arg0, Component arg1);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method47(int arg0) {
        field140 = null;
        field141 = null;
        field129 = null;
        field135 = null;
        field124 = null;
        field138 = null;
        field127 = null;
        if (arg0 == 1) {
            field132 = null;
            field133 = null;
            field126 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZII)V")
    public static final void method48(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field130++;
        class28.field412.field4335 = 0;
        class28.field412.method1638(32, 85);
        class28.field412.method1638(32, arg0);
        class28.field412.method1638(32, arg1);
        class28.field412.method1650(false, arg3);
        class28.field412.method1650(false, arg4);
        if (!arg2) {
            method48(85, -77, true, 110, 112);
        }
        class47.field858 = 0;
        class91.field1750 = -3;
        class121.field2289 = 0;
        class69.field1400 = 1;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static final void method49(int arg0) {
        class85.field1667.method1614(-37);
        field131++;
        if (arg0 < 60) {
            field126 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method50(Component arg0, boolean arg1);
}
