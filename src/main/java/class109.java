import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class109 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static volatile int field1677 = 0;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1679 = "wave:";

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field1676 = 64;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Leg;")
    public static class188 field1685 = new class188(100);

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field1691 = 0;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field1693 = 0;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "Ljava/util/Random;")
    public static Random field1692 = new Random();

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "[B")
    public byte[] field1686;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "[B")
    public byte[] field1690;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V", line = 21)
    public static final void method738() {
        for (int var0 = 0; var0 < class33.field420; var0++) {
            class272 var1 = class118.field1828[var0];
            class319.method2165(var1);
            class118.field1828[var0] = null;
        }
        class33.field420 = 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 40)
    public static void method739(int arg0) {
        if (arg0 == -13496) {
            field1685 = null;
            field1679 = null;
            field1692 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 58)
    public static final void method740(int arg0) {
        field1682++;
        class336.field5221.method1298((byte) 110);
        class183.field2802.method1298((byte) 110);
        if (arg0 != 64) {
            method739(-127);
        }
    }
}
