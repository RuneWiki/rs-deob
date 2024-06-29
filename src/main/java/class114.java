import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class114 extends class472 {

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Lfn;")
    public static class52 field1605;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Ljava/lang/String;")
    public String field1611;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public static void method718(int arg0) {
        field1605 = null;
        if (arg0 >= -57) {
            field1605 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method719(byte arg0, String arg1) {
        field1603++;
        int var2 = arg1.length();
        if (arg0 != -27) {
            return 89L;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + ((var3 << 5) - var3);
        }
        return var3;
    }

    static {
        new class112(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field1608 = -1;
        field1605 = new class52(63, 8);
    }
}
