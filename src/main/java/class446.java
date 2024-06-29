import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class446 extends class557 {

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    private int field6416 = -1;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Z")
    public static boolean field6417 = false;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field6419 = 0;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
    public static int[] field6413 = new int[4];

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lhh;")
    public static class140 field6414;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ltn;I)V", line = 5)
    public final void method32(class95 arg0, int arg1) {
        field6415++;
        if (arg1 != -29265) {
            method2658((byte) -56);
        }
        arg0.method736((byte) -128, this.field6416);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLdt;)V", line = 23)
    public final void method30(byte arg0, class254 arg1) {
        field6418++;
        this.field6416 = arg1.method1728((byte) 81);
        if (arg0 != 110) {
            field6413 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V", line = 37)
    public static void method2658(byte arg0) {
        field6413 = null;
        int var1 = -67 % ((arg0 + 48) / 63);
        field6414 = null;
    }
}
