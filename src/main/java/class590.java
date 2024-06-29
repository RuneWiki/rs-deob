import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class590 implements class345 {

    @OriginalMember(owner = "client!via", name = "h", descriptor = "Luga;")
    private class221 field7959;

    @OriginalMember(owner = "client!via", name = "g", descriptor = "I")
    public int field7958;

    @OriginalMember(owner = "client!via", name = "i", descriptor = "[I")
    public int[] field7960;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    public int field7954;

    @OriginalMember(owner = "client!via", name = "e", descriptor = "Ljo;")
    private class355 field7956;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "[F")
    public float[] field7952;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!via", name = "f", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "[[[I")
    public static int[][][] field7953;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field7957++;
        class279.method1804(arg5, this.field7959.field3005.field7221, 109, arg7 ? this.field7952 : null, this.field7958, arg7 ? this.field7959.field3023 : null, arg4, arg6 ? this.field7960 : null, arg0, arg1, arg2, arg3, this.field7959.field3005.field7222);
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I)V")
    public static void method3297(int arg0) {
        if (arg0 >= 103) {
            field7953 = null;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field7955++;
        class279.method1804(arg5, this.field7960, 76, arg7 ? this.field7959.field3023 : null, this.field7959.field3005.field7222, arg7 ? this.field7952 : null, arg4, arg6 ? this.field7959.field3005.field7221 : null, arg0, arg1, arg2, arg3, this.field7958);
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Luga;Lvr;Ljo;)V")
    public class590(class221 arg0, class147 arg1, class355 arg2) {
        this.field7959 = arg0;
        if ((arg1 instanceof class690)) {
            class690 var5 = (class690) arg1;
            this.field7960 = var5.field9685;
            this.field7954 = var5.field2856;
            this.field7958 = var5.field2858;
        } else if ((arg1 instanceof class236)) {
            class236 var4 = (class236) arg1;
            this.field7958 = var4.field2858;
            this.field7960 = var4.field3193;
            this.field7954 = var4.field2856;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field7956 = arg2;
            if (this.field7956.field5202 != this.field7958 || this.field7956.field5206 != this.field7954) {
                throw new RuntimeException();
            }
            this.field7952 = this.field7956.field5208;
        }
    }
}
