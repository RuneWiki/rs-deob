import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class422 extends InputStream {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lwl;")
    public static class452 field6212 = new class452(72, 9);

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field6216 = 20;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lpf;")
    public static class425 field6215 = new class425(76, -1);

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[I")
    private static int[] field6217 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Liq;")
    public static class134 field6213;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLwn;)V")
    public static final void method2606(byte arg0, class155 arg1) {
        field6211++;
        int var2 = -122 / ((11 - arg0) / 50);
        for (class71 var3 = (class71) class281.field4298.method2514((byte) 61); var3 != null; var3 = (class71) class281.field4298.method2511(56)) {
            if (var3.field915 == arg1) {
                if (var3.field919 != null) {
                    class267.field4077.method2135(var3.field919);
                    var3.field919 = null;
                }
                var3.method625((byte) -50);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method2607(int arg0) {
        field6213 = null;
        if (arg0 > 100) {
            field6217 = null;
            field6212 = null;
            field6215 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIB)I")
    public static final int method2608(int arg0, int arg1, byte arg2) {
        if (arg2 != 33) {
            method2606((byte) -46, (class155) null);
        }
        field6209++;
        return arg0 == 1 || arg0 == 3 ? class466.field6860[arg1 & 0x3] : field6217[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!ri", name = "read", descriptor = "()I")
    public final int read() {
        field6214++;
        class109.method674((byte) 99, 30000L);
        return -1;
    }
}
