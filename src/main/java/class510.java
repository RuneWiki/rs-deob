import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class510 extends class5 {

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "S")
    public short field7492;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[[Z")
    public static boolean[][] field7491 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "[I")
    public static int[] field7489;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[I")
    public static int[] field7490;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[[B")
    public static byte[][] field7488;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3051(int arg0, byte arg1, int arg2) {
        if (arg1 != 32) {
            field7489 = null;
        }
        field7493++;
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static void method3052(boolean arg0) {
        field7491 = null;
        field7489 = null;
        field7490 = null;
        if (arg0) {
            field7488 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class510() {
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(S)V")
    public class510(short arg0) {
        this.field7492 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
    public static final int method3053(int arg0, int arg1) {
        return class113.field1574 == null ? 0 : class113.field1574[arg0][arg1] & 0xFF;
    }
}
