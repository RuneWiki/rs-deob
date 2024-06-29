import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class36 extends class423 {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "[I")
    public static int[] field509 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Z")
    public static volatile boolean field508 = true;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field516 = -1;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lpc;")
    public class36 field510;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lpc;")
    public class36 field511;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Lvn;")
    public static class437 field518;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "[Z")
    public static boolean[] field512;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public final void method332(byte arg0) {
        field515++;
        if (this.field511 == null) {
            return;
        }
        if (arg0 >= -47) {
            field517 = -74;
        }
        this.field511.field510 = this.field510;
        this.field510.field511 = this.field511;
        this.field511 = null;
        this.field510 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)V")
    public static final void method333(byte arg0, int arg1) {
        int var2 = 127 % ((35 - arg0) / 41);
        field514++;
        class34.field492.method2300(arg1, true);
        class318.field4665.method2300(arg1, true);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method334(int arg0) {
        field512 = null;
        field518 = null;
        if (arg0 == -15147) {
            field509 = null;
        }
    }
}
