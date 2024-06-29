import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class293 extends class338 {

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field3607;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
    public static int field3610 = 0;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "[F")
    public static float[] field3611 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!tr", name = "J", descriptor = "Lpia;")
    public static class94 field3612 = new class94(33, 8);

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "Lbg;")
    public static class463 field3609;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "[I")
    public static int[] field3608;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 6)
    public final Object method753(int arg0) {
        if (arg0 != 15640) {
            method1744(-23, 87, 60, 38, 60);
        }
        field3606++;
        return this.field3607;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V", line = 17)
    public static void method1743(byte arg0) {
        field3609 = null;
        if (arg0 != -4) {
            field3609 = null;
        }
        field3611 = null;
        field3608 = null;
        field3612 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIII)V", line = 33)
    public static final void method1744(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class248.field3011 != null) {
            class248.field3011[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class648.field9262 != null) {
            class648.field9262[arg0][arg1] = (short) arg3;
        }
        if (class703.field9910 != null) {
            class703.field9910[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)Z", line = 49)
    public final boolean method754(int arg0) {
        field3605++;
        if (arg0 != 0) {
            field3609 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lon;Ljava/lang/Object;I)V", line = 69)
    public class293(class335 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3607 = arg1;
    }
}
