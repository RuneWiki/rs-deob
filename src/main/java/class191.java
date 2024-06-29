import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class191 extends class120 {

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Z")
    public boolean field3111 = false;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "Z")
    public boolean field3119 = false;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "Z")
    public static volatile boolean field3117 = false;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Lal;")
    public static class52 field3116 = new class52(64);

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Z")
    public static boolean field3120 = false;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "F")
    public static float field3114;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V", line = 3)
    public static final void method1337(boolean arg0) {
        field3115++;
        if (!arg0) {
            field3117 = false;
        }
        class409.field6049 = null;
        class166.field2641 = null;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)V", line = 26)
    public static void method1338(byte arg0) {
        field3116 = null;
        if (arg0 != 94) {
            method1338((byte) 74);
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIIZZ)V", line = 54)
    public class191(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field3112 = arg0;
        this.field3119 = arg4;
        this.field3111 = arg3;
        this.field3118 = arg2;
        this.field3113 = arg1;
    }
}
