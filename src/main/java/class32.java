import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class32 extends class230 {

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "[[B")
    public static byte[][] field526 = new byte[250][];

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field530 = 328;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method221(int arg0, int arg1) {
        if (arg0 == -1768728824) {
            field528++;
            return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFFB92C) >> 16) + "." + ((arg1 & 0xFFC9) >> 8) + "." + (arg1 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static void method222(int arg0) {
        field526 = null;
        if (arg0 != -1363843088) {
            method221(81, 32);
        }
    }
}
