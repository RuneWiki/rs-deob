import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class59 extends class273 {

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    private int field829 = 4096;

    @OriginalMember(owner = "client!nn", name = "U", descriptor = "I")
    private int field837 = 4096;

    @OriginalMember(owner = "client!nn", name = "V", descriptor = "I")
    private int field838 = 4096;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "[B")
    public static byte[] field828 = new byte[520];

    @OriginalMember(owner = "client!nn", name = "Y", descriptor = "I")
    public static int field841 = 0;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
    public static int field831 = 0;

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "Lkn;")
    public static class52 field830 = new class52(64);

    @OriginalMember(owner = "client!nn", name = "P", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!nn", name = "Q", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!nn", name = "R", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!nn", name = "X", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!nn", name = "Z", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!nn", name = "W", descriptor = "Lph;")
    public static class79 field839;

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 215)
    public class59() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BILgn;)V", line = 24)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 < 27) {
            return;
        }
        if (arg1 == 0) {
            this.field837 = arg2.method1994(false);
        } else if (arg1 == 1) {
            this.field829 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field838 = arg2.method1994(false);
        }
        field835++;
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V", line = 66)
    public static final void method401(int arg0) {
        class7.field83 = 0;
        field833++;
        int var1 = (class79.field1173.field537 >> 7) + class30.field374;
        int var2 = (class79.field1173.field519 >> 7) + class294.field4535;
        if (arg0 != -6726) {
            return;
        }
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class7.field83 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class7.field83 = 1;
        }
        if (class7.field83 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class7.field83 = 0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V", line = 92)
    public static void method402(int arg0) {
        field839 = null;
        if (arg0 >= -92) {
            method402(54);
        }
        field828 = null;
        field830 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)[[I", line = 105)
    public final int[][] method170(int arg0, byte arg1) {
        field834++;
        int[][] var3 = this.field4200.method539(arg1 + 84, arg0);
        if (arg1 != 68) {
            this.method167((byte) -109, -82, (class303) null);
        }
        if (this.field4200.field1147) {
            int[][] var4 = this.method1795(arg0, -124, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class27.field346; var11++) {
                int var12 = var6[var11];
                int var13 = var8[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var7[var11] = this.field837 * var12 >> 12;
                    var9[var11] = this.field829 * var13 >> 12;
                    var10[var11] = this.field838 * var14 >> 12;
                } else {
                    var7[var11] = this.field837;
                    var9[var11] = this.field829;
                    var10[var11] = this.field838;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I[B)[B", line = 167)
    public static final byte[] method403(int arg0, byte[] arg1) {
        if (arg0 != -28343) {
            return (byte[]) null;
        }
        field842++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class223.method1501(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)V", line = 189)
    public static final void method404(byte arg0) {
        field832++;
        if (!class138.field2137) {
            return;
        }
        class208.field3317 = null;
        if (arg0 == -65) {
            field839 = null;
            class138.field2137 = false;
        }
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)Lbd;", line = 220)
    public static final class20 method405(int arg0) {
        class20 var1 = new class20(class116.field1798, class168.field2567, class276.field4257[0], class123.field1919[0], class68.field1011[0], class107.field1652[arg0], class46.field644[0], class154.field2417);
        class345.method2394((byte) -92);
        field840++;
        return var1;
    }
}
