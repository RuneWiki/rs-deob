import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class7 extends class20 {

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    private int field68 = -32768;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field64 = 0;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
    public static boolean field61 = true;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Ldd;")
    public static class43 field62;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field58;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "[Lpc;")
    public static class29[] field71;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "[[I")
    public static int[][] field59;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class262 var11 = class40.method242(-25672, this.field60).method1077(this.field65, (class224) null, 0, 13895);
        field67++;
        if (var11 != null) {
            var11.method25(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field68 = var11.method28();
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public static void method26(int arg0) {
        if (arg0 != 31756) {
            field61 = true;
        }
        field58 = null;
        field59 = null;
        field71 = null;
        field62 = null;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public static final void method27(int arg0) {
        class44.field778.method254((byte) 87);
        field70++;
        if (arg0 > -122) {
            method27(111);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
    public final int method28() {
        field63++;
        return this.field68;
    }
}
