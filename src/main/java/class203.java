import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class203 extends class32 {

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field3371 = 0;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public int field3385 = -1;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field3377 = 0;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field3379 = 127;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Z")
    public static boolean field3378 = false;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field3375 = 0;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "[[[B")
    public static byte[][][] field3374;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "[[[B")
    public static byte[][][] field3383;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Lij;")
    public static final class50 method1374(byte arg0, int arg1) {
        class50 var2 = new class50();
        var2.field909 = new byte[arg1];
        var2.field898 = 0;
        field3381++;
        if (arg0 < 73) {
            method1375(-64);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public static void method1375(int arg0) {
        field3383 = null;
        field3374 = null;
        if (arg0 != 0) {
            field3383 = null;
        }
    }
}
