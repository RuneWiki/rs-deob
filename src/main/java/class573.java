import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class573 {

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "B")
    public byte field8129;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public int field8127;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Ljava/lang/String;")
    public String field8123;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "Ljava/lang/String;")
    public String field8124;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Ljava/lang/String;")
    public String field8125;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Ljava/lang/String;")
    public String field8128;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([BIIB)I")
    public static final int method3334(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -53) {
            method3334(null, -40, 114, (byte) 110);
        }
        field8126++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = class197.field2823[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }
}
