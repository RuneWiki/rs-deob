import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class474 extends class415 {

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field6693;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "Llu;")
    public static class610 field6695 = new class610(29, 15);

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "[I")
    public static int[] field6697 = new int[1];

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "[I")
    public static int[] field6696 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "[Lha;")
    public static class53[] field6699;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)V")
    public static void method2853(boolean arg0) {
        field6699 = null;
        field6695 = null;
        field6696 = null;
        field6697 = null;
        if (arg0) {
            method2853(true);
        }
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)Z")
    public final boolean method2447(int arg0) {
        field6692++;
        if (arg0 != 28) {
            method2854(76, 28, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lnba;Ljava/lang/Object;I)V")
    public class474(class249 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6693 = arg1;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2446(int arg0) {
        if (arg0 == -10061) {
            field6694++;
            return this.field6693;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II[F)[F")
    public static final float[] method2854(int arg0, int arg1, float[] arg2) {
        field6698++;
        float[] var3 = new float[arg0];
        class648.method3734(arg2, 0, var3, 0, arg0);
        if (arg1 != 144) {
            method2854(104, 106, null);
        }
        return var3;
    }
}
