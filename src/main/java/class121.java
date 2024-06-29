import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class121 {

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lvf;")
    public static class265 field2136 = class87.method582(-46, "Chargement du module texte )2 ");

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Lvf;")
    public static class265 field2157 = class87.method582(-46, ":clan:");

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lmc;")
    public class154 field2144;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lsb;")
    public static class92 field2135;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
    public int[] field2137;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
    public int[] field2139;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
    public int[] field2140;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[I")
    public int[] field2141;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[I")
    public int[] field2145;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[I")
    public static int[] field2146;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "[I")
    public int[] field2154;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lmc;")
    public class154[] field2149;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[[I")
    public int[][] field2142;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[[I")
    public int[][] field2151;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILng;)V")
    public static final void method808(int arg0, class135 arg1) {
        field2155++;
        if (class166.field3011 != null) {
            try {
                class166.field3011.method252(0L, arg0 + 6);
                class166.field3011.method256((byte) -77, 24, arg1.field2483, arg1.field2449);
            } catch (Exception var2) {
            }
        }
        if (arg0 == -6) {
            arg1.field2449 += 24;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method809(byte arg0) {
        field2146 = null;
        int var1 = -3 / ((66 - arg0) / 49);
        field2157 = null;
        field2135 = null;
        field2136 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZIIII)V")
    public static final void method810(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2143++;
        if (!arg1) {
            field2135 = null;
        }
        if (arg2 == arg3) {
            class168.method1110(arg0, arg5, arg4, (byte) 16, arg3);
        } else if (class107.field1890 <= (arg0 - arg3) && class79.field1510 >= arg0 + arg3 && class81.field1521 <= arg4 - arg2 && class205.field3681 >= arg2 + arg4) {
            class277.method1897(-20506, arg0, arg4, arg3, arg2, arg5);
        } else {
            class244.method1623(arg4, (byte) 118, arg5, arg2, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILfl;)V")
    public static final void method811(int arg0, class192 arg1) {
        class43.field961 = class148.method1017(arg0 ^ 0x40, class184.field3297, arg1);
        class103.field1826 = new int[256];
        for (int var2 = arg0; var2 < 3; var2++) {
            float var4 = (float) ((class45.field1008[var2] & 0xFF0000) >> 16);
            int var5 = class45.field1008[var2 + 1] >> 16 & 0xFF;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) ((class45.field1008[var2] & 0xFF00) >> 8);
            int var8 = (class45.field1008[var2 + 1] & 0xFF00) >> 8;
            float var9 = ((float) var8 - var7) / 64.0F;
            float var10 = (float) (class45.field1008[var2] & 0xFF);
            int var11 = class45.field1008[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class103.field1826[var2 * 64 + var13] = class144.method992(class144.method992((int) var7 << 8, (int) var4 << 16), (int) var10);
                var7 += var9;
                var4 += var6;
                var10 += var12;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class103.field1826[var3] = class45.field1008[3];
        }
        field2148++;
        class242.field4224 = new int[32768];
        class199.field3553 = new int[32768];
        class45.method377(1, (class34) null);
        class124.field2226 = new int[32768];
        class51.field1066 = new int[32768];
        class252.field4330 = new class88(128, 254);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[B)V")
    private final void method812(int arg0, byte[] arg1) {
        class135 var3 = new class135(class45.method376(-91, arg1));
        field2156++;
        int var4 = var3.method920((byte) 47);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2158 = 0;
        } else {
            this.field2158 = var3.method949(arg0 ^ 0xF5D);
        }
        int var5 = var3.method920((byte) 65);
        this.field2153 = var3.method927(arg0 ^ 0x7D);
        this.field2140 = new int[this.field2153];
        int var6 = arg0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field2153; var8++) {
            this.field2140[var8] = var6 += var3.method927(127);
            if (this.field2140[var8] > var7) {
                var7 = this.field2140[var8];
            }
        }
        this.field2138 = var7 + 1;
        this.field2141 = new int[this.field2138];
        this.field2145 = new int[this.field2138];
        this.field2142 = new int[this.field2138][];
        this.field2139 = new int[this.field2138];
        this.field2154 = new int[this.field2138];
        if (var5 != 0) {
            this.field2137 = new int[this.field2138];
            for (int var9 = 0; var9 < this.field2138; var9++) {
                this.field2137[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2153; var10++) {
                this.field2137[this.field2140[var10]] = var3.method949(3933);
            }
            this.field2144 = new class154(this.field2137);
        }
        for (int var11 = 0; var11 < this.field2153; var11++) {
            this.field2141[this.field2140[var11]] = var3.method949(3933);
        }
        for (int var12 = 0; var12 < this.field2153; var12++) {
            this.field2139[this.field2140[var12]] = var3.method949(3933);
        }
        for (int var13 = 0; var13 < this.field2153; var13++) {
            this.field2154[this.field2140[var13]] = var3.method927(125);
        }
        for (int var14 = 0; var14 < this.field2153; var14++) {
            int var21 = 0;
            int var22 = -1;
            int var23 = this.field2140[var14];
            int var24 = this.field2154[var23];
            this.field2142[var23] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field2142[var23][var25] = var21 += var3.method927(127);
                if (var22 < var26) {
                    var22 = var26;
                }
            }
            this.field2145[var23] = var22 + 1;
            if (var22 + 1 == var24) {
                this.field2142[var23] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field2151 = new int[var7 + 1][];
        this.field2149 = new class154[var7 + 1];
        for (int var15 = 0; var15 < this.field2153; var15++) {
            int var16 = this.field2140[var15];
            int var17 = this.field2154[var16];
            this.field2151[var16] = new int[this.field2145[var16]];
            for (int var18 = 0; var18 < this.field2145[var16]; var18++) {
                this.field2151[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field2142[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field2142[var16][var19];
                }
                this.field2151[var16][var20] = var3.method949(3933);
            }
            this.field2149[var16] = new class154(this.field2151[var16]);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([BI)V")
    public class121(byte[] arg0, int arg1) {
        this.field2152 = class238.method1587(arg0, true, arg0.length);
        if (this.field2152 != arg1) {
            throw new RuntimeException();
        }
        this.method812(0, arg0);
    }
}
