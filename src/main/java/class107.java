import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class107 extends class232 {

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    private int field1893 = 3216;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "[I")
    private int[] field1895 = new int[3];

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    private int field1896 = 4096;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    private int field1900 = 3216;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "[[[Lam;")
    public static class277[][][] field1889 = new class277[4][104][104];

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field1891 = 0;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "[J")
    public static long[] field1903 = new long[200];

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "Lum;")
    public static class222 field1901;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "[I")
    public static int[] field1897;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "[[B")
    public static byte[][] field1902;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IB)[I", line = 7)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = -61 / ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -106, arg0);
        field1892++;
        if (this.field4008.field256) {
            int var5 = class131.field2278 * this.field1896 >> 12;
            int[] var6 = this.method1649(0, (byte) 55, class209.field3684 & arg0 - 1);
            int[] var7 = this.method1649(0, (byte) 68, arg0);
            int[] var8 = this.method1649(0, (byte) 127, class209.field3684 & arg0 + 1);
            for (int var9 = 0; var9 < class54.field858; var9++) {
                int var10 = (var7[var9 - 1 & class65.field1024] - var7[var9 + 1 & class65.field1024]) * var5 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = (var8[var9] - var6[var9]) * var5 >> 12;
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = var12 >> 4;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > 255) {
                    var13 = 255;
                }
                int var14 = class73.field1114[((var13 + 1) * var13 >> 1) + var11] & 0xFF;
                int var15 = var14 * 4096 >> 8;
                int var16 = var10 * var14 >> 8;
                int var17 = this.field1895[0] * var16 >> 12;
                int var18 = var12 * var14 >> 8;
                int var19 = this.field1895[2] * var15 >> 12;
                int var20 = this.field1895[1] * var18 >> 12;
                var4[var9] = var17 + var20 + var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V", line = 83)
    public final void method144(int arg0) {
        this.method734(1);
        field1894++;
        if (arg0 <= 48) {
            this.method81(79, (byte) -49, (class153) null);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V", line = 95)
    public static final void method733(int arg0, int arg1) {
        field1898++;
        if (arg0 > -60) {
            field1902 = (byte[][]) ((byte[][]) null);
        }
        if (arg1 == -1 || !class113.method777((byte) -32, arg1)) {
            return;
        }
        class75[] var2 = class277.field4660[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class75 var4 = var2[var3];
            if (var4.field1295 != null) {
                class331 var5 = new class331();
                var5.field5649 = var4;
                var5.field5635 = var4.field1295;
                class156.method1111(-16646, var5, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V", line = 134)
    private final void method734(int arg0) {
        field1899++;
        double var2 = Math.cos((double) ((float) this.field1900 / 4096.0F));
        this.field1895[0] = (int) (Math.sin((double) ((float) this.field1893 / 4096.0F)) * var2 * 4096.0D);
        this.field1895[1] = (int) (Math.cos((double) ((float) this.field1893 / 4096.0F)) * var2 * 4096.0D);
        this.field1895[2] = (int) (Math.sin((double) ((float) this.field1900 / 4096.0F)) * 4096.0D);
        int var4 = this.field1895[arg0] * this.field1895[1] >> 12;
        int var5 = this.field1895[0] * this.field1895[0] >> 12;
        int var6 = this.field1895[2] * this.field1895[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1895[2] = (this.field1895[2] << 12) / var7;
            this.field1895[1] = (this.field1895[1] << 12) / var7;
            this.field1895[0] = (this.field1895[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "(I)V", line = 160)
    public static void method735(int arg0) {
        field1903 = null;
        field1897 = null;
        field1902 = (byte[][]) null;
        field1889 = (class277[][][]) null;
        field1901 = null;
        if (arg0 != -16709) {
            field1901 = (class222) null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 179)
    public class107() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLbc;)V", line = 194)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            field1897 = (int[]) null;
        }
        field1890++;
        if (arg0 == 0) {
            this.field1896 = arg2.method1090(false);
        } else if (arg0 == 1) {
            this.field1893 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field1900 = arg2.method1090(false);
        }
    }
}
