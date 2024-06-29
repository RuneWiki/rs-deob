import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class625 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lsca;")
    public static class46 field8742 = null;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
    public static int[] field8747 = new int[1];

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field8745;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public int field8746;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public int field8748;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field8749;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field8750;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field8751;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public int field8753;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "[B")
    public byte[] field8743;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "[B")
    public byte[] field8744;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I", line = 3)
    public static int method3600(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 12)
    public static void method3601(byte arg0) {
        field8742 = null;
        field8747 = null;
        int var1 = 109 % ((65 - arg0) / 58);
    }
}
