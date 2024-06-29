import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class128 {

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "Lrn;")
    public static class380 field1626 = new class380();

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "Lpq;")
    public static class159 field1628;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLjava/lang/String;)I", line = 9)
    public static final int method770(byte arg0, String arg1) {
        if (arg0 > -114) {
            return -29;
        }
        field1629++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + class9.method61(arg1.charAt(var4), 2174)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V", line = 32)
    public static void method771(byte arg0) {
        field1626 = null;
        if (arg0 != -100) {
            method771((byte) -61);
        }
        field1628 = null;
    }
}
