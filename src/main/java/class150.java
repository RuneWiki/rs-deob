import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class150 extends class181 {

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    private int field2177;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    private int field2178;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    private int field2195;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    private int field2169;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    private int field2184;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "Z")
    public static boolean field2183 = false;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "[I")
    public static int[] field2189 = new int[100];

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field2174 = 0;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2170 = " more options";

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "Z")
    public static boolean field2187 = false;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "[Lob;")
    public static class152[] field2176 = new class152[14];

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "B")
    public static byte field2172;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "Lpk;")
    public static class237 field2179;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "Lji;")
    public static class256 field2185;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V")
    public static final void method1014(byte arg0) {
        field2188++;
        int var1 = class168.field2480.length;
        if (arg0 > -55) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class168.field2480[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class12.field179; var4++) {
                    if (class241.field3744[var4] == class18.field323[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class241.field3744[class12.field179] = class18.field323[var2];
                    var3 = class12.field179++;
                }
                class54 var5 = new class54(class168.field2480[var2]);
                int var6 = 0;
                while (var5.field887 < class168.field2480[var2].length && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method423(-77);
                    int var9 = var8 >> 7 & 0x3F;
                    int var10 = var8 >> 14;
                    int var11 = (class18.field323[var2] >> 8) * 64 - (class90.field1367 - var9);
                    int var12 = var8 & 0x3F;
                    int var13 = (class18.field323[var2] & 0xFF) * 64 + var12 - class188.field2774;
                    class189 var14 = class114.method820((byte) -62, var5.method423(-77));
                    if (class243.field3762[var7] == null && (var14.field2823 & 0x1) > 0 && class51.field832 == var10 && var11 >= 0 && (var14.field2813 + var11) < 104 && var13 >= 0 && (var14.field2813 + var13) < 104) {
                        class243.field3762[var7] = new class87();
                        class87 var15 = class243.field3762[var7];
                        class285.field4379[class207.field3093++] = var7;
                        var15.field486 = class120.field1794;
                        var15.method665(var14, (byte) -86);
                        var15.method169(var15.field1323.field2813, 23138);
                        var15.field484 = var15.field471 = class67.field1099[var15.field1323.field2859];
                        var15.field436 = var15.field1323.field2846;
                        var15.field432 = var15.field1323.field2865;
                        if (var15.field432 == 0) {
                            var15.field471 = 0;
                        }
                        var15.method167(var15.method168(-92), 0, var11, true, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V")
    public static void method1015(byte arg0) {
        field2176 = null;
        field2189 = null;
        field2179 = null;
        field2170 = null;
        field2185 = null;
        int var1 = -8 / ((86 - arg0) / 35);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIZ)Z")
    public final boolean method1016(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.method1016(-55, -17, -72, false);
        }
        field2191++;
        return this.field2169 == arg1 && arg0 >= this.field2195 && this.field2193 >= arg0 && arg2 >= this.field2184 && this.field2178 >= arg2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIB)Z")
    public final boolean method1017(int arg0, int arg1, byte arg2) {
        if (arg2 > -110) {
            method1015((byte) -84);
        }
        field2196++;
        return this.field2195 <= arg1 && this.field2193 >= arg1 && this.field2184 <= arg0 && this.field2178 >= arg0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)[I")
    public final int[] method1018(int arg0, int arg1, int arg2) {
        field2180++;
        if (arg0 < 67) {
            this.method1022(-68, (byte) 44, -103);
        }
        return new int[] { this.field2177, this.field2181 + arg2 - this.field2195, arg1 - this.field2184 - -this.field2173 };
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)[I")
    public final int[] method1019(int arg0, int arg1, int arg2) {
        int var4 = 4 / ((arg1 + 28) / 35);
        field2175++;
        return new int[] { this.field2169, this.field2195 + arg0 - this.field2181, -this.field2173 + this.field2184 + arg2 };
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZ)I")
    public static final int method1020(int arg0, boolean arg1) {
        if (!arg1) {
            field2183 = false;
        }
        field2194++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lpk;III)Lwh;")
    public static final class289 method1021(class237 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 27030) {
            field2174 = 108;
        }
        field2192++;
        return class223.method1526(arg1, arg3, (byte) 112, arg0) ? class148.method1007((byte) 98) : null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)Z")
    public final boolean method1022(int arg0, byte arg1, int arg2) {
        if (arg1 != 107) {
            method1020(-78, false);
        }
        field2186++;
        return arg2 >= this.field2181 && arg2 <= this.field2190 && arg0 >= this.field2173 && this.field2182 >= arg0;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2190 = arg8;
        this.field2177 = arg1;
        this.field2178 = arg5;
        this.field2181 = arg6;
        this.field2195 = arg2;
        this.field2169 = arg0;
        this.field2182 = arg9;
        this.field2193 = arg4;
        this.field2173 = arg7;
        this.field2184 = arg3;
    }
}
