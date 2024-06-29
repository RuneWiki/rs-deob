import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class393 extends class100 {

    @OriginalMember(owner = "client!mea", name = "K", descriptor = "Ljn;")
    public static class134 field5592 = new class134(102, -1);

    @OriginalMember(owner = "client!mea", name = "H", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!mea", name = "J", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!mea", name = "L", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!mea", name = "N", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!mea", name = "I", descriptor = "[B")
    private byte[] field5590;

    @OriginalMember(owner = "client!mea", name = "M", descriptor = "[Lbka;")
    public static class560[] field5594;

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V", line = 7)
    public class393() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method2423(boolean arg0) {
        field5595++;
        if (class329.field4620 == null || class654.field9189 == null) {
            class329.field4620 = new int[256];
            class654.field9189 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class329.field4620[var1] = (int) (Math.sin(var2) * 4096.0D);
                class654.field9189[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (!arg0) {
            method2425((byte) 120, 48, 32, null);
        }
    }

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "(B)V", line = 41)
    public static void method2424(byte arg0) {
        if (arg0 < 64) {
            method2423(true);
        }
        field5592 = null;
        field5594 = null;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BIILqf;)V", line = 53)
    public static final void method2425(byte arg0, int arg1, int arg2, class783 arg3) {
        field5591++;
        if (arg0 != 123) {
            field5592 = null;
        }
        class405.field5707[arg1][arg2] = arg3;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIB)V", line = 65)
    public final void method713(int arg0, int arg1, byte arg2) {
        field5589++;
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg2 & 0xFF) >> 1) + arg1);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5590[var10001] = var5;
        this.field5590[var6] = var5;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIII)[B", line = 81)
    public final byte[] method2426(int arg0, int arg1, int arg2, int arg3) {
        this.field5590 = new byte[arg1 * arg3 * arg0 * 2];
        if (arg2 != 0) {
            this.method2426(77, 92, -119, -10);
        }
        field5593++;
        this.method1806(arg3, arg1, (byte) -85, arg0);
        return this.field5590;
    }
}
