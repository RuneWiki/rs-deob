import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class611 {

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public int field8475;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Ltl;")
    public class575 field8477;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field8473;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "[I")
    public int[] field8471;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "[[[S")
    public static short[][][] field8470;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V", line = 9)
    public static void method3424(byte arg0) {
        if (arg0 >= -4) {
            method3425(null, -24);
        }
        field8470 = null;
        field8473 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([BI)[B", line = 28)
    public static final byte[] method3425(byte[] arg0, int arg1) {
        field8479++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class359.method2053(arg0, 0, var3, arg1, var2);
        return var3;
    }
}
