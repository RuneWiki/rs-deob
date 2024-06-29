import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class335 {

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    private int field5213 = -1;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    private int field5218 = 0;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "La;")
    private class281 field5222 = new class281();

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Z")
    public boolean field5223 = false;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    private int field5208;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[[I")
    private int[][] field5215;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    private int field5207;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[Lac;")
    private class241[] field5201;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "[I")
    public static int[] field5210 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "[B")
    public static byte[] field5206 = new byte[520];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field5203 = 0;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Z")
    public static boolean field5216 = false;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5219 = "glow1:";

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field5220 = -1;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "[[[I")
    public static int[][][] field5214;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V", line = 4)
    public static final void method2335(int arg0, int arg1, int arg2) {
        if (arg1 != 24081) {
            method2343(82, -93, -31, 103);
        }
        class188 var3 = class147.method1111(-7, arg0, 12);
        var3.method1392((byte) -48);
        var3.field2959 = arg2;
        field5221++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)V", line = 20)
    public static final void method2336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg3 - 334;
        if (arg4 != 30921) {
            method2340((String) null, 52);
        }
        field5202++;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class118.field1838 - class227.field3468) * var8 / 100 + class227.field3468;
        int var10 = 2048 - arg0 & 0x7FF;
        int var11 = arg7 * var9 >> 8;
        int var12 = 2048 - arg5 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var11;
        if (var10 != 0) {
            int var16 = class164.field2650[var10];
            var13 = -var11 * var16 >> 16;
            int var17 = class164.field2664[var10];
            var15 = var11 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class164.field2664[var12];
            int var19 = class164.field2650[var12];
            var14 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class190.field2976 = arg6 - var14;
        class193.field3015 = arg0;
        class7.field111 = arg1 - var13;
        class197.field3028 = arg2 - var15;
        class200.field3047 = arg5;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 81)
    public final void method2337(int arg0) {
        for (int var2 = arg0; var2 < this.field5208; var2++) {
            this.field5215[var2] = null;
        }
        field5205++;
        this.field5215 = (int[][]) null;
        this.field5201 = null;
        this.field5222.method1951(29532);
        this.field5222 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 97)
    public static void method2338(byte arg0) {
        field5210 = null;
        field5206 = null;
        int var1 = -63 % ((arg0 + 54) / 36);
        field5214 = (int[][][]) null;
        field5219 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V", line = 114)
    public static final void method2339(int arg0, int arg1) {
        if (arg1 <= 11) {
            method2340((String) null, 79);
        }
        field5204++;
        class111.field1676 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 128)
    public static final int method2340(String arg0, int arg1) {
        field5211++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class152.method1145((byte) -34, arg0.charAt(var4)) + (var3 << 5) - var3;
        }
        if (arg1 != 12596) {
            field5219 = (String) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)[[I", line = 156)
    public final int[][] method2341(byte arg0) {
        field5209++;
        if (this.field5208 != this.field5207) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field5208; var2++) {
            this.field5201[var2] = class275.field4279;
        }
        if (arg0 > -96) {
            field5216 = true;
        }
        return this.field5215;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[I", line = 186)
    public final int[] method2342(int arg0, int arg1) {
        if (arg0 != -28750) {
            this.field5222 = (class281) null;
        }
        field5217++;
        if (this.field5208 == this.field5207) {
            this.field5223 = this.field5201[arg1] == null;
            this.field5201[arg1] = class275.field4279;
            return this.field5215[arg1];
        } else if (this.field5208 == 1) {
            this.field5223 = this.field5213 != arg1;
            this.field5213 = arg1;
            return this.field5215[0];
        } else {
            class241 var3 = this.field5201[arg1];
            if (var3 == null) {
                this.field5223 = true;
                if (this.field5208 <= this.field5218) {
                    class241 var4 = (class241) this.field5222.method1945((byte) 71);
                    var3 = new class241(arg1, var4.field3675);
                    this.field5201[var4.field3674] = null;
                    var4.method39(10717);
                } else {
                    var3 = new class241(arg1, this.field5218);
                    this.field5218++;
                }
                this.field5201[arg1] = var3;
            } else {
                this.field5223 = false;
            }
            this.field5222.method1949(var3, (byte) 91);
            return this.field5215[var3.field3675];
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(III)V", line = 295)
    public class335(int arg0, int arg1, int arg2) {
        this.field5208 = arg0;
        this.field5215 = new int[this.field5208][arg2];
        this.field5207 = arg1;
        this.field5201 = new class241[this.field5207];
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)I", line = 271)
    public static final int method2343(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -1) {
            method2340((String) null, -77);
        }
        field5212++;
        return arg2 < arg1 ? arg1 : (arg3 < arg2 ? arg3 : arg2);
    }
}
