import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class425 {

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Z")
    public static boolean field5711 = false;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method2442(int arg0, int arg1, int arg2) {
        field5709++;
        if (arg0 != 3504) {
            method2442(-97, 107, -92);
        }
        return (arg2 & 0x60000) != 0 | class309.method1857(arg2, arg0 - 33246, arg1) || class688.method3867(arg2, 0, arg1) || class319.method1880(arg2, (byte) 62, arg1);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIBLrca;)J", line = 33)
    public static final long method2443(int arg0, int arg1, byte arg2, class457 arg3) {
        field5713++;
        if (arg2 <= 13) {
            field5710 = -50;
        }
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class543 var8 = client.field3995.method3384(arg3.method745((byte) 98), false);
        long var9 = (long) (arg3.method758(true) | 0x10000 << 14 | arg0 << 7 | arg1 | arg3.method743(-30968) << 20);
        if (var8.field7550 == 0) {
            var9 |= var6;
        }
        if (var8.field7513 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg3.method745((byte) 89) << 32;
    }
}
