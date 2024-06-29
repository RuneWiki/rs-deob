import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class575 extends class340 {

    @OriginalMember(owner = "client!pda", name = "K", descriptor = "[I")
    public static int[] field7730 = new int[256];

    @OriginalMember(owner = "client!pda", name = "N", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!pda", name = "O", descriptor = "[I")
    public static int[] field7734;

    @OriginalMember(owner = "client!pda", name = "I", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!pda", name = "J", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!pda", name = "M", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!pda", name = "L", descriptor = "[B")
    private byte[] field7731;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(BII)V")
    public final void method1541(byte arg0, int arg1, int arg2) {
        field7728++;
        if (arg2 != 0) {
            this.field7731 = null;
        }
        int var4 = arg1 * 2;
        int var6 = var4 + 1;
        this.field7731[var4] = -1;
        int var5 = arg0 & 0xFF;
        this.field7731[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "(B)V")
    public static final void method3158(byte arg0) {
        field7729++;
        class552.field7475 = new class264(8);
        class500.field6863 = 0;
        class401 var1 = (class401) class381.field5356.method3676((byte) 97);
        int var2 = 93 % ((47 - arg0) / 46);
        while (var1 != null) {
            var1.method2279();
            var1 = (class401) class381.field5356.method3682(-18176);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIBI)[B")
    public final byte[] method3159(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -16) {
            field7734 = null;
        }
        field7732++;
        this.field7731 = new byte[arg0 * arg1 * arg3 * 2];
        this.method1824(arg1, 255, arg3, arg0);
        return this.field7731;
    }

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "(B)V")
    public static void method3160(byte arg0) {
        field7734 = null;
        if (arg0 == -72) {
            field7730 = null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
    public class575() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
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
            field7730[var0] = var1;
        }
        field7733 = 2;
        field7734 = new int[200];
    }
}
