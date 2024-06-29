import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class393 extends class435 {

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public int field5673;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public int field5675;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public int field5680;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "Z")
    public boolean field5676;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public int field5679;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public int field5674;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field5678 = 765;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Lao;")
    public static class191 field5681 = new class191(72, -1);

    @OriginalMember(owner = "client!po", name = "u", descriptor = "[I")
    public static int[] field5682 = new int[32];

    @OriginalMember(owner = "client!po", name = "p", descriptor = "[Ljk;")
    public static class450[] field5677;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V", line = 13)
    public static void method2371(int arg0) {
        if (arg0 == 11760) {
            field5677 = null;
            field5682 = null;
            field5681 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIIZ)V", line = 36)
    public class393(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field5673 = arg1;
        this.field5675 = arg2;
        this.field5680 = arg0;
        this.field5676 = arg5;
        this.field5679 = arg4;
        this.field5674 = arg3;
    }
}
