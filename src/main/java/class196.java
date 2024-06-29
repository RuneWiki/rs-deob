import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class196 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[F")
    public static float[] field3150 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3156 = 0;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZII)V", line = 4)
    public void method1389(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            field3152 = 33;
        }
        field3153++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lbg;", line = 14)
    public class196 method1153(int arg0, int arg1, int arg2) {
        field3154++;
        return this;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()Z", line = 22)
    public boolean method1180() {
        field3151++;
        return false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbg;IIIZ)V", line = 58)
    public void method1159(class196 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3155++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V", line = 74)
    public static void method1390(boolean arg0) {
        if (!arg0) {
            field3150 = (float[]) null;
        }
        field3150 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()I")
    public abstract int method74();

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
