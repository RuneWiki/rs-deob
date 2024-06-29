import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class122 implements class96 {

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Z")
    private boolean field2161 = false;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    private int field2168 = 50;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "Lge;")
    private class68 field2167;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lge;")
    private class68 field2155;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Lsb;")
    private class214 field2165;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "[Z")
    private boolean[] field2169;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[Z")
    private boolean[] field2147;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "[B")
    private byte[] field2172;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "[Z")
    private boolean[] field2144;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[Z")
    private boolean[] field2141;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "[B")
    private byte[] field2173;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[Z")
    private boolean[] field2145;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "[B")
    private byte[] field2151;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "[S")
    private short[] field2175;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "[B")
    private byte[] field2164;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2146 = 3353893;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Ljd;")
    public static class85 field2150 = class221.method1499("::tele ", (byte) 125);

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Ljd;")
    public static class85 field2157 = class221.method1499(" weitere Optionen", (byte) -45);

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Ljd;")
    public static class85 field2162 = class221.method1499(")4a=", (byte) 107);

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Ljd;")
    public static class85 field2154 = class221.method1499("Hidden)2", (byte) -123);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[[B")
    public static byte[][] field2139;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method835(int arg0) {
        class137.field2382 = (long) arg0;
        field2153++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIF)[I")
    public final int[] method682(int arg0, int arg1, float arg2) {
        field2166++;
        class142 var4 = this.method841(0, arg1);
        if (arg0 != 255) {
            field2150 = null;
        }
        if (var4 == null) {
            return null;
        } else {
            var4.field2447 = true;
            return var4.method935(arg0 ^ 0x4A3D, arg2, this.field2155, this, this.field2161 || this.field2141[arg1]);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method836(byte arg0) {
        field2154 = null;
        field2150 = null;
        field2139 = null;
        field2157 = null;
        int var1 = -72 % ((arg0 + 33) / 51);
        field2162 = null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public final void method837(int arg0) {
        this.field2165.method1469((byte) 69);
        int var2 = 122 / ((arg0 + 12) / 62);
        field2148++;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(II)V")
    public final void method838(int arg0, int arg1) {
        int var3 = 94 % ((arg0 - 53) / 55);
        for (class142 var4 = (class142) this.field2165.method1466((byte) -61); var4 != null; var4 = (class142) this.field2165.method1474(117)) {
            if (var4.field2447) {
                var4.method932(arg1, -25862);
                var4.field2447 = false;
            }
        }
        field2156++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)I")
    public final int method681(byte arg0, int arg1) {
        field2149++;
        if (arg0 != 78) {
            this.method682(-48, -85, -1.0039023F);
        }
        return this.field2175[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)Z")
    public final boolean method685(boolean arg0, int arg1) {
        if (!arg0) {
            this.field2147 = null;
        }
        field2174++;
        return this.field2161 || this.field2141[arg1];
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(BI)[I")
    public final int[] method684(byte arg0, int arg1) {
        int var3 = 107 / ((arg0 - 61) / 59);
        class142 var4 = this.method841(0, arg1);
        field2142++;
        return var4 == null ? null : var4.method931(this, this.field2161 || this.field2141[arg1], this.field2155, -96);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(ZI)Z")
    public final boolean method686(boolean arg0, int arg1) {
        field2152++;
        if (arg0) {
            return false;
        } else {
            class142 var3 = this.method841(0, arg1);
            return var3 == null ? false : var3.method934(this.field2155, this, true);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)Z")
    public static final boolean method839(int arg0) {
        field2158++;
        if (class268.field4765 != arg0) {
            try {
                if ((Boolean) class16.field236.method580(true, class107.field1882.field1478)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Z")
    public final boolean method683(int arg0, int arg1) {
        if (arg0 <= 4) {
            this.field2169 = null;
        }
        field2159++;
        return this.field2169[arg1];
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)Z")
    public final boolean method687(int arg0, int arg1) {
        field2163++;
        if (arg1 != -28992) {
            this.method683(-84, 16);
        }
        return this.field2145[arg0];
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(ZI)V")
    public final void method840(boolean arg0, int arg1) {
        field2143++;
        if (arg1 != 255) {
            field2157 = null;
        }
        this.field2161 = arg0;
        this.method837(arg1 - 372);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(II)Lab;")
    private final class142 method841(int arg0, int arg1) {
        field2170++;
        class142 var3 = (class142) this.field2165.method1472((long) arg1, -27162);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2167.method464(-1, arg1, 0);
        if (var4 == null) {
            return null;
        } else {
            class247 var5 = new class247(var4);
            class142 var6 = new class142(var5);
            this.field2165.method1468(arg0, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lge;Lge;Lge;IZ)V")
    public class122(class68 arg0, class68 arg1, class68 arg2, int arg3, boolean arg4) {
        this.field2161 = arg4;
        this.field2167 = arg0;
        this.field2168 = arg3;
        this.field2155 = arg2;
        this.field2165 = new class214(this.field2168);
        class247 var6 = new class247(arg1.method464(-1, 0, 0));
        int var7 = var6.method1694((byte) -100);
        this.field2169 = new boolean[var7];
        this.field2147 = new boolean[var7];
        this.field2172 = new byte[var7];
        this.field2144 = new boolean[var7];
        this.field2141 = new boolean[var7];
        this.field2173 = new byte[var7];
        this.field2145 = new boolean[var7];
        this.field2151 = new byte[var7];
        this.field2175 = new short[var7];
        this.field2164 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2144[var8] = var6.method1711((byte) -67) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field2144[var9]) {
                this.field2169[var9] = var6.method1711((byte) -67) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field2144[var10]) {
                this.field2145[var10] = var6.method1711((byte) -67) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field2144[var11]) {
                this.field2141[var11] = var6.method1711((byte) -67) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field2144[var12]) {
                this.field2147[var12] = var6.method1711((byte) -67) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field2144[var13]) {
                this.field2173[var13] = var6.method1690(true);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field2144[var14]) {
                this.field2151[var14] = var6.method1690(true);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field2144[var15]) {
                this.field2164[var15] = var6.method1690(true);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field2144[var16]) {
                this.field2172[var16] = var6.method1690(true);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field2144[var17]) {
                this.field2175[var17] = (short) var6.method1694((byte) -100);
            }
        }
    }
}
