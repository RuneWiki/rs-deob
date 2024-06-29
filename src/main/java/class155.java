import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class155 extends class283 {

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    private int field2414 = 4096;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    private int field2422 = 4096;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    private int field2420 = 4096;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "Lna;")
    private static class26 field2417 = class69.method505("flash1:", (byte) -119);

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field2413 = 0;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "Lna;")
    public static class26 field2419 = field2417;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "Lna;")
    public static class26 field2421 = class69.method505("M-Bmoire attribu-Be", (byte) -121);

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "Lna;")
    public static class26 field2416 = field2417;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILwa;Z)V", line = 24)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field2422 = arg1.method576(1);
        } else if (arg0 == 1) {
            this.field2414 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field2420 = arg1.method576(1);
        }
        if (!arg2) {
            method1048(12);
        }
        field2412++;
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V", line = 61)
    public static void method1048(int arg0) {
        field2419 = null;
        field2417 = null;
        if (arg0 == -1443422260) {
            field2416 = null;
            field2421 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 176)
    public class155() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[[I", line = 112)
    public final int[][] method3(int arg0, int arg1) {
        field2415++;
        if (arg0 != -1) {
            field2413 = -40;
        }
        int[][] var3 = this.field4719.method2182((byte) -115, arg1);
        if (this.field4719.field5381) {
            int[][] var4 = this.method1994(arg1, 0, (byte) -74);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class101.field1632; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 == var14 && var13 == var14) {
                    var9[var11] = this.field2422 * var12 >> 12;
                    var8[var11] = this.field2414 * var14 >> 12;
                    var10[var11] = this.field2420 * var13 >> 12;
                } else {
                    var9[var11] = this.field2422;
                    var8[var11] = this.field2414;
                    var10[var11] = this.field2420;
                }
            }
        }
        return var3;
    }
}
