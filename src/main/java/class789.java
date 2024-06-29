import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class789 extends class334 {

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
    private int field10789;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "Z")
    public static boolean field10785 = false;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "[I")
    public static int[] field10790 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "I")
    public static int field10786;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    public static int field10787;

    @OriginalMember(owner = "client!dfa", name = "M", descriptor = "I")
    public static int field10792;

    @OriginalMember(owner = "client!dfa", name = "O", descriptor = "I")
    public static int field10794;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "[I")
    public static int[] field10788;

    @OriginalMember(owner = "client!dfa", name = "N", descriptor = "[I")
    public static int[] field10793;

    @OriginalMember(owner = "client!dfa", name = "L", descriptor = "[[B")
    public static byte[][] field10791;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field10792;
        if (arg1) {
            method4316((byte) -104);
        }
        if (~arg0 == -1) {
            this.field10789 = (arg2.method2557(14929) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V")
    public class789() {
        this(4096);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field10794;
        int[] var3 = super.field4743.method1027((byte) -87, arg0);
        if (arg1 != -22563988) {
            this.method28(-117, -82);
        }
        if (super.field4743.field1993) {
            class171.method1264(var3, 0, class439.field6099, this.field10789);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(BI)V")
    public static final void method4315(byte arg0, int arg1) {
        class33.field410 = 3;
        if (arg0 > -25) {
            method4316((byte) 78);
        }
        class727.field10134 = arg1;
        class752.field10460 = -1;
        class482.field6622 = 100;
        ++field10786;
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(B)V")
    public static void method4316(byte arg0) {
        field10791 = null;
        int var1 = 57 % ((18 - arg0) / 59);
        field10793 = null;
        field10788 = null;
        field10790 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V")
    public class789(int arg0) {
        super(0, true);
        this.field10789 = 4096;
        this.field10789 = arg0;
    }
}
