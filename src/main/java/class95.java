import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class95 extends class466 {

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "Lbi;")
    public static class408 field1455 = new class408(1);

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "F")
    public static float field1457;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V")
    public static void method686(int arg0) {
        field1455 = null;
        if (arg0 != 0) {
            method686(-61);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
    public class95() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field1458;
        if (arg1 != 0) {
            method686(115);
        }
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (super.field6557.field1163) {
            class416.method2495(var3, 0, class312.field4207, class63.field1085[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method687(int arg0, String arg1) {
        ++field1456;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = arg0; var2 > var5; ++var5) {
            var3 = (long) arg1.charAt(var5) + -var3 + (var3 << 5);
        }
        return var3;
    }

    static {
        new class104(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }
}
