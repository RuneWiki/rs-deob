import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class393 extends class409 {

    @OriginalMember(owner = "client!qba", name = "J", descriptor = "I")
    public static int field5484 = 0;

    @OriginalMember(owner = "client!qba", name = "I", descriptor = "Lus;")
    public static class328 field5483 = new class328(84, 7);

    @OriginalMember(owner = "client!qba", name = "L", descriptor = "Lqia;")
    public static class547 field5486 = new class547();

    @OriginalMember(owner = "client!qba", name = "M", descriptor = "Lofa;")
    public static class139 field5487 = new class139("WIP", 2);

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!qba", name = "K", descriptor = "[B")
    private byte[] field5485;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIB)V", line = 3)
    public final void method2343(int arg0, int arg1, byte arg2) {
        if (arg0 < 43) {
            this.method2343(66, 60, (byte) 115);
        }
        field5482++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5485[var10001] = -1;
        this.field5485[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "(I)V", line = 21)
    public static void method2344(int arg0) {
        field5487 = null;
        field5483 = null;
        field5486 = null;
        if (arg0 > -11) {
            field5486 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V", line = 35)
    public class393() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIII)[B", line = 50)
    public final byte[] method2345(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            field5483 = null;
        }
        field5481++;
        this.field5485 = new byte[arg2 * arg3 * arg0 * 2];
        this.method2260(arg0, arg2, arg3, (byte) 119);
        return this.field5485;
    }
}
