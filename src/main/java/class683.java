import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class683 extends class487 {

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Leba;")
    public class588 field9252;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[I")
    public static int[] field9251;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "[Ls;")
    public static class281[] field9250;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method3826(int arg0) {
        int var1 = -70 / ((arg0 - 42) / 48);
        field9250 = null;
        field9251 = null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lqo;II[B)V")
    public class683(class22 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9252 = class412.method2551(false, arg3, 6406, arg2, arg0, -119, 6406, arg1);
        this.field9252.method3067(false, false, 10243);
    }
}
