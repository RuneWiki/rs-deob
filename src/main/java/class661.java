import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class661 extends class388 {

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "Z")
    public volatile boolean field9450 = true;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "[[I")
    public static int[][] field9446 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "F")
    public static float field9447;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Z")
    public boolean field9444;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
    public boolean field9445;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "[[B")
    public static byte[][] field9449;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 6)
    public static void method3769(byte arg0) {
        field9449 = null;
        if (arg0 != -127) {
            method3770(-62, 26);
        }
        field9446 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V", line = 25)
    public static final void method3770(int arg0, int arg1) {
        if (arg0 != 9) {
            method3769((byte) -101);
        }
        field9451++;
        class325.field4417 = arg1;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I")
    public abstract int method1306(int arg0);

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)[B")
    public abstract byte[] method1304(int arg0);
}
