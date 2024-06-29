import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class261 extends class78 {

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lab;")
    public static class256 field3763 = null;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lsd;")
    public static class74 field3757 = new class74(70, 12);

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[I")
    public static int[] field3762;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIII)V", line = 12)
    public class261(int arg0, int arg1, int arg2, int arg3) {
        this.field3758 = arg1;
        this.field3760 = arg0;
        this.field3759 = arg2;
        this.field3761 = arg3;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V", line = 27)
    public static void method1600(int arg0) {
        field3762 = null;
        field3757 = null;
        int var1 = -35 / ((38 - arg0) / 32);
        field3763 = null;
    }
}
