import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 extends class457 {

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Lea;")
    public static class547 field109 = new class547(56, 10);

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "Llga;")
    public static class712 field111 = new class712(54, 7);

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "S")
    public static short field114 = 1;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "[I")
    public static int[] field113 = new int[16384];

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "[I")
    public static int[] field115 = new int[16384];

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "Ld;")
    public static class152 field116;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "Lufa;")
    public static class680 field112;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "[B")
    private byte[] field108;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
    public static void method64(int arg0) {
        field109 = null;
        field111 = null;
        field115 = null;
        field113 = null;
        field116 = null;
        if (arg0 == 8) {
            field112 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class15() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIB)V")
    public final void method65(int arg0, int arg1, byte arg2) {
        int var4 = -22 % ((-arg1 - 46) / 44);
        field110++;
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var7 = var5 + 1;
        this.field108[var10001] = -1;
        int var6 = arg2 & 0xFF;
        this.field108[var7] = (byte) (var6 * 3 >> 5);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)[B")
    public final byte[] method66(int arg0, int arg1, int arg2, int arg3) {
        field107++;
        if (arg1 == 20283) {
            this.field108 = new byte[arg3 * 2 * arg2 * arg0];
            this.method1624((byte) -116, arg3, arg2, arg0);
            return this.field108;
        } else {
            return null;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field113[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field115[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }
}
