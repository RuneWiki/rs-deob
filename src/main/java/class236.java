import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class236 extends class218 {

    @OriginalMember(owner = "client!jo", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field3264;

    @OriginalMember(owner = "client!jo", name = "N", descriptor = "Lsd;")
    public static class74 field3261 = new class74(5, -2);

    @OriginalMember(owner = "client!jo", name = "S", descriptor = "[I")
    public static int[] field3266 = new int[32];

    @OriginalMember(owner = "client!jo", name = "O", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!jo", name = "P", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!jo", name = "T", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!jo", name = "U", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!jo", name = "M", descriptor = "[I")
    public static int[] field3260;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
    public static void method1302(int arg0) {
        field3260 = null;
        field3261 = null;
        if (arg0 != 24790) {
            field3260 = null;
        }
        field3266 = null;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)Z")
    public final boolean method1222(boolean arg0) {
        if (!arg0) {
            this.method1221(-115);
        }
        field3263++;
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1221(int arg0) {
        field3262++;
        if (arg0 < 59) {
            this.method1222(true);
        }
        return this.field3264;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lvl;Ljava/lang/Object;I)V")
    public class236(class407 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3264 = arg1;
    }
}
