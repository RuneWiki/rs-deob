import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class219 {

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "[I")
    public int[] field5;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "[I")
    public int[] field6;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Ldr;")
    public static class675 field7 = new class675(3, -1);

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Lnba;")
    public static class278 field8 = new class278();

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "Z")
    public static boolean field9 = false;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "Ldr;")
    public static class675 field10 = new class675(25, -2);

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "[I")
    public static int[] field11 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Lwn;")
    public static class678 field12;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V", line = 10)
    public static void method4(int arg0) {
        field12 = null;
        if (arg0 < -56) {
            field10 = null;
            field11 = null;
            field7 = null;
            field8 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(II[I[I)V", line = 24)
    public class2(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5 = arg3;
        this.field6 = arg2;
    }
}
