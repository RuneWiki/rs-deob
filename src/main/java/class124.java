import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class124 extends class273 {

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "[I")
    private int[] field1941 = new int[3];

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    private int field1943 = 4096;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    private int field1945 = 3216;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    private int field1949 = 3216;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Z")
    public static boolean field1935 = true;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1936 = "green:";

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1940 = null;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "J")
    public static long field1948 = 0L;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field1944 = -1;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "Lnh;")
    public static class247 field1938;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Z)V", line = 5)
    public static void method838(boolean arg0) {
        field1936 = null;
        field1938 = null;
        if (arg0) {
            field1944 = -87;
        }
        field1940 = null;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V", line = 25)
    private final void method839(int arg0) {
        field1934++;
        double var2 = Math.cos((double) ((float) this.field1949 / 4096.0F));
        this.field1941[0] = (int) (Math.sin((double) ((float) this.field1945 / 4096.0F)) * 4096.0D * var2);
        if (arg0 <= 50) {
            this.method349(79);
        }
        this.field1941[1] = (int) (Math.cos((double) ((float) this.field1945 / 4096.0F)) * var2 * 4096.0D);
        this.field1941[2] = (int) (Math.sin((double) ((float) this.field1949 / 4096.0F)) * 4096.0D);
        int var4 = this.field1941[0] * this.field1941[0] >> 12;
        int var5 = this.field1941[2] * this.field1941[2] >> 12;
        int var6 = this.field1941[1] * this.field1941[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1941[0] = (this.field1941[0] << 12) / var7;
            this.field1941[1] = (this.field1941[1] << 12) / var7;
            this.field1941[2] = (this.field1941[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I", line = 64)
    public final int[] method331(int arg0, int arg1) {
        int[] var3 = this.field4204.method365(arg0, 0);
        field1939++;
        if (this.field4204.field792) {
            int var4 = class158.field2473 * this.field1943 >> 12;
            int[] var5 = this.method1790(0, class117.field1819 & arg0 - 1, 0);
            int[] var6 = this.method1790(0, arg0, 0);
            int[] var7 = this.method1790(0, class117.field1819 & arg0 + 1, 0);
            for (int var8 = 0; var8 < class27.field346; var8++) {
                int var9 = (var6[var8 - 1 & class197.field2963] - var6[class197.field2963 & var8 + 1]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class282.field4335[var11 + ((var12 + 1) * var12 >> 1)] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field1941[2] * var14 >> 12;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field1941[0] * var16 >> 12;
                int var18 = var10 * var13 >> 8;
                int var19 = this.field1941[1] * var18 >> 12;
                var3[var8] = var15 + var19 + var17;
            }
        }
        return arg1 == -14650 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)[F", line = 136)
    public static final float[] method840(byte arg0) {
        field1942++;
        float var1 = class326.method2216() + class326.method2210();
        int var2 = -109 / ((arg0 - 76) / 36);
        int var3 = class326.method2219();
        float var4 = (float) ((var3 & 0xFF345B) >> 16) / 255.0F;
        float var5 = 0.58823526F;
        class107.field1648[0] = class113.field1726[0] * var4 * var5 * var1;
        float var6 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        class107.field1648[2] = class113.field1726[2] * var7 * var5 * var1;
        class107.field1648[3] = 1.0F;
        class107.field1648[1] = class113.field1726[1] * var6 * var5 * var1;
        return class107.field1648;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 258)
    public class124() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BILgn;)V", line = 177)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field1947++;
        if (arg1 == 0) {
            this.field1943 = arg2.method1994(false);
        } else if (arg1 == 1) {
            this.field1945 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field1949 = arg2.method1994(false);
        }
        if (arg0 <= 27) {
            field1940 = (String) null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 220)
    public final void method349(int arg0) {
        this.method839(75);
        if (arg0 != 1) {
            method838(false);
        }
        field1946++;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V", line = 239)
    public static final void method841(byte arg0) {
        field1937++;
        if (arg0 == -44) {
            class336.field5221.method1296(255);
            class183.field2802.method1296(255);
        }
    }
}
