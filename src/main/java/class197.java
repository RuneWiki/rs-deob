import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class197 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
    private int[] field3025;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3030 = new String[5];

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V", line = 12)
    public static final void method1437(int arg0, boolean arg1) {
        if (arg0 >= -42) {
            method1438(-29);
        }
        class314.field4871 = arg1;
        field3031++;
        class198.field3038 = !class110.method841((byte) 88);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 24)
    public static void method1438(int arg0) {
        if (arg0 == -1648280255) {
            field3030 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([I)V", line = 44)
    public class197(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3025 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3025[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3025[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field3025[var5 + var5] = arg0[var4];
            this.field3025[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)I", line = 81)
    public final int method1439(int arg0, byte arg1) {
        field3027++;
        if (arg1 != -41) {
            this.method1439(-11, (byte) -94);
        }
        int var3 = (this.field3025.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field3025[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3025[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
