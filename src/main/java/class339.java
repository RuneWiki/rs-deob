import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class339 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public int field5252 = -1;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[I")
    public static int[] field5261 = new int[4096];

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public int field5249;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public int field5256;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public int field5257;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public int field5258;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public int field5260;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I", line = 6)
    public static final int method2340(int arg0, int arg1) {
        field5253++;
        if (arg1 <= 72) {
            field5261 = (int[]) null;
        }
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 34)
    public static void method2341(byte arg0) {
        if (arg0 <= 64) {
            field5261 = (int[]) null;
        }
        field5261 = null;
    }
}
