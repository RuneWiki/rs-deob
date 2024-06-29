import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class518 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
    private int[] field7650;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "[I")
    public static int[] field7652;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3064(int arg0, byte arg1, int arg2) {
        field7648++;
        int var3 = -55 / ((arg1 + 29) / 45);
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method3065(int arg0) {
        if (arg0 == 15730) {
            field7652 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
    public static final void method3066(byte arg0, int arg1) {
        if (arg0 != -26) {
            field7649 = -38;
        }
        field7651++;
        class449 var2 = class611.method3463(arg1, (byte) -124, 16);
        var2.method2614(63);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)I")
    public final int method3067(byte arg0, int arg1) {
        field7654++;
        int var3 = (this.field7650.length >> 1) - 1;
        if (arg0 <= 49) {
            field7649 = 120;
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field7650[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field7650[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([I)V")
    public class518(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field7650 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field7650[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field7650[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field7650[var5 + var5] = arg0[var4];
            this.field7650[var5 + var5 + 1] = var4++;
        }
    }
}
