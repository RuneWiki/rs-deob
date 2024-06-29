import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class85 {

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "[[I")
    public static int[][] field1207 = new int[128][128];

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1205 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "B")
    public byte field1209;

    @OriginalMember(owner = "client!dha", name = "f", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "Lfka;")
    public static class741 field1208;

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "Ljava/lang/String;")
    public String field1206;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)V", line = 10)
    public static void method691(byte arg0) {
        field1205 = null;
        field1207 = null;
        field1208 = null;
        if (arg0 >= -90) {
            method691((byte) -73);
        }
    }
}
