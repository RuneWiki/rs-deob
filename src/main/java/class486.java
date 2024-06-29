import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class486 {

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "J")
    public long field7133;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "Lbv;")
    private class282 field7128;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field7131 = 0;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "[I")
    public static int[] field7130 = new int[256];

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Lof;")
    public static class321 field7134;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "Lns;")
    public static class438 field7135;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I")
    public static final int method2899(int arg0) {
        field7129++;
        if (arg0 != 256) {
            method2900(-12);
        }
        if ((double) class135.field1966 == 3.0D) {
            return 37;
        } else if ((double) class135.field1966 == 4.0D) {
            return 50;
        } else if ((double) class135.field1966 == 6.0D) {
            return 75;
        } else if ((double) class135.field1966 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
    public static void method2900(int arg0) {
        field7130 = null;
        if (arg0 != 37) {
            method2900(57);
        }
        field7135 = null;
        field7134 = null;
    }

    @OriginalMember(owner = "client!rs", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7128.method1820(897494512, this.field7133);
        field7132++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lbv;J[Lfk;)V")
    public class486(class282 arg0, long arg1, class238[] arg2) {
        this.field7133 = arg1;
        this.field7128 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7130[var0] = var1;
        }
        field7134 = new class321(5000);
    }
}
