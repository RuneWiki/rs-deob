import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class142 extends class159 {

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "[[B")
    public static byte[][] field2179 = new byte[1000][];

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[[[I")
    public static int[][][] field2176 = new int[2][][];

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "S")
    public static short field2178 = 205;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field2181 = 0;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Lok;")
    public static class41 field2183 = class137.method956("::clientjs5drop", 45);

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "F")
    public static float field2177;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 6)
    public static final void method990(int arg0) {
        field2182++;
        class289.field4692.method131(arg0 - 29432);
        if (arg0 != 29430) {
            field2176 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)V", line = 35)
    public static final void method991(int arg0, long arg1) {
        if (arg0 != 2) {
            return;
        }
        field2180++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V", line = 63)
    public static void method992(boolean arg0) {
        field2183 = null;
        field2176 = (int[][][]) null;
        if (arg0) {
            field2181 = 38;
        }
        field2179 = (byte[][]) null;
    }
}
