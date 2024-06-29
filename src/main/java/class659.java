import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class659 extends class241 {

    @OriginalMember(owner = "client!sv", name = "R", descriptor = "Lkn;")
    public static class737 field9026 = new class737(6, 5);

    @OriginalMember(owner = "client!sv", name = "S", descriptor = "[I")
    public static int[] field9027 = new int[120];

    @OriginalMember(owner = "client!sv", name = "T", descriptor = "Luw;")
    public static class418 field9028;

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!sv", name = "U", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!sv", name = "P", descriptor = "[B")
    private byte[] field9024;

    @OriginalMember(owner = "client!sv", name = "V", descriptor = "[I")
    public static int[] field9030;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field9027[var1] = var0 / 4;
        }
        field9028 = new class418("", 17);
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V", line = 3)
    public class659() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)V", line = 9)
    public static void method3710(int arg0) {
        field9026 = null;
        if (arg0 != 120) {
            method3710(-85);
        }
        field9030 = null;
        field9027 = null;
        field9028 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBB)V", line = 22)
    public final void method1668(int arg0, byte arg1, byte arg2) {
        field9023++;
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field9024[var10001] = (byte) (var5 * 3 >> 5);
        if (arg2 == 14) {
            this.field9024[var6] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIBI)[B", line = 38)
    public final byte[] method3711(int arg0, int arg1, byte arg2, int arg3) {
        this.field9024 = new byte[arg0 * arg1 * arg3 * 2];
        if (arg2 <= 85) {
            field9028 = null;
        }
        field9025++;
        this.method2236(arg1, arg0, 0, arg3);
        return this.field9024;
    }
}
