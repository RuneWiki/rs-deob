import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class297 {

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field5174 = 0;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public int field5171;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public int field5173;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public int field5178;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public int field5179;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public int field5182;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "Ldm;")
    public static class289 field5180;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "[B")
    public byte[] field5177;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "[B")
    public byte[] field5181;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 10)
    public static void method2103(int arg0) {
        field5180 = null;
        if (arg0 != 24) {
            field5180 = (class289) null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Z", line = 30)
    public static final boolean method2104(int arg0, int arg1) {
        if (arg0 == 30332) {
            field5172++;
            return ((arg1 & 0x72EB8CA0) >> 30) != 0;
        } else {
            return true;
        }
    }
}
