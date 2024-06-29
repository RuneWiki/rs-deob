import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class425 {

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "Z")
    public boolean field522;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "[F")
    public static float[] field512 = new float[4];

    @OriginalMember(owner = "client!il", name = "t", descriptor = "Z")
    public static boolean field521 = false;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "[[Lgfa;")
    public static class697[][] field513;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method259(int arg0) {
        field513 = null;
        if (arg0 >= 27) {
            field512 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IIIIIZ)V")
    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field519 = arg4;
        this.field516 = arg2;
        this.field520 = arg1;
        this.field511 = arg3;
        this.field522 = arg5;
        this.field517 = arg0;
    }
}
