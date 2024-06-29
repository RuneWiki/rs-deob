import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class183 extends class190 {

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Z")
    private boolean field2635 = false;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Lab;")
    private class290 field2641;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
    public static volatile boolean field2633 = false;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field2638 = 0;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "[[Z")
    public static boolean[][] field2645;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZB)V")
    public final void method919(boolean arg0, byte arg1) {
        ++field2636;
        int var3 = 90 % ((-55 - arg1) / 47);
        class498 var4 = super.field2722.method630((byte) -13);
        if (this.field2641 != null && var4 != null && arg0) {
            this.field2641.method1835((byte) 96, '\u0000');
            super.field2722.method654(false, 1);
            super.field2722.method648(-127, var4);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2722.field1236.method1578(43), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field2722.method654(false, 0);
            this.field2635 = true;
        } else {
            super.field2722.method643(770, 0, -31364, 34168);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
    public static final void method1228(int arg0, int arg1, int arg2, int arg3) {
        ++field2632;
        int var4 = class202.field2854.field7921 * arg1 >> 8;
        int var5 = -69 / ((40 - arg0) / 36);
        if (arg3 == -1 && !class331.field4757) {
            class89.method801(127);
        } else if (arg3 != -1 && (~class93.field1643 != ~arg3 || !class499.method2840((byte) -109)) && ~var4 != -1 && !class331.field4757) {
            class2.method9(var4, false, class115.field1890, arg2, true, arg3, 0);
        }
        class93.field1643 = arg3;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Ljj;)V")
    public class183(class66 arg0) {
        super(arg0);
        if (arg0.field1185) {
            this.field2641 = new class290(arg0, 2);
            this.field2641.method1833((byte) 95, 0);
            super.field2722.method654(false, 1);
            super.field2722.method656(-12645, 7681, 34165);
            super.field2722.method607(34168, 2, 770, -103);
            super.field2722.method643(770, 0, -31364, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2722.method654(false, 0);
            this.field2641.method1838(0);
            this.field2641.method1833((byte) 91, 1);
            super.field2722.method654(false, 1);
            super.field2722.method656(-12645, 8448, 8448);
            super.field2722.method607(34166, 2, 770, -115);
            super.field2722.method643(770, 0, -31364, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2722.method654(false, 0);
            this.field2641.method1838(0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static final void method1229(byte arg0) {
        ++field2643;
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class574.field8178[var1] = false;
        }
        if (arg0 == -20) {
            class134.field2162 = class265.field3862;
            class377.field5547 = 5;
            class106.field1777 = 0;
            class548.field7622 = class448.field6535;
            class561.field8026 = class310.field4553;
            class216.field3264 = class217.field3284;
            class459.field6615 = -1;
            class141.field2212 = class545.field7584;
            class112.field1866 = -1;
            class95.field1675 = class216.field3274;
            class378.field5560 = 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
    public final void method921(boolean arg0, int arg1) {
        super.field2722.method656(-12645, 7681, 8448);
        if (arg1 != 25747) {
            this.method919(false, (byte) 0);
        }
        ++field2639;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public final void method926(byte arg0) {
        ++field2634;
        if (!this.field2635) {
            super.field2722.method643(770, 0, -31364, 5890);
        } else {
            this.field2641.method1835((byte) 122, '\u0001');
            super.field2722.method654(false, 1);
            super.field2722.method648(94, (class222) null);
            super.field2722.method654(false, 0);
        }
        if (arg0 >= -102) {
            this.method925(72, -107, -66);
        }
        super.field2722.method656(-12645, 8448, 8448);
        this.field2635 = false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    public final void method925(int arg0, int arg1, int arg2) {
        ++field2640;
        if (arg1 != 0) {
            field2644 = -88;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
    public static void method1230(int arg0) {
        field2645 = null;
        int var1 = 74 / ((51 - arg0) / 63);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILaba;I)V")
    public final void method927(int arg0, class222 arg1, int arg2) {
        ++field2637;
        if (arg2 != 20731) {
            field2644 = 58;
        }
        super.field2722.method648(arg2 + -20660, arg1);
        super.field2722.method634(8, arg0);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)Z")
    public final boolean method928(int arg0) {
        ++field2642;
        int var2 = 105 % ((arg0 - -7) / 57);
        return true;
    }

    static {
        new class567("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }
}
