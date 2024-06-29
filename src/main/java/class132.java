import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class132 extends class45 {

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "Lqj;")
    private static class196 field1875 = class80.method502("Fri", -48);

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Lqj;")
    private static class196 field1872 = class80.method502("Tue", -48);

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "Lqj;")
    private static class196 field1880 = class80.method502("Sun", -48);

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "Lqj;")
    private static class196 field1873 = class80.method502("Wed", -48);

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "Lqj;")
    private static class196 field1879 = class80.method502("Mon", -48);

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "Lqj;")
    private static class196 field1874 = class80.method502("Thu", -48);

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Lqj;")
    private static class196 field1884 = class80.method502("Sat", -48);

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "[Lqj;")
    public static class196[] field1882 = new class196[] { field1880, field1879, field1872, field1873, field1874, field1875, field1884 };

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "[B")
    public static byte[] field1886 = new byte[32896];

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "Ldf;")
    public static class231 field1887;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "Lqj;")
    public static class196 field1892;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "Lbk;")
    public static class136 field1870;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "Lo;")
    public static class182 field1888;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "Lci;")
    public static class187 field1891;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static void method801(int arg0) {
        field1888 = null;
        field1874 = null;
        field1873 = null;
        field1875 = null;
        field1887 = null;
        field1872 = null;
        field1892 = null;
        field1884 = null;
        field1886 = null;
        field1882 = null;
        field1870 = null;
        if (arg0 != -11553) {
            method803(null, -18, true);
        }
        field1880 = null;
        field1891 = null;
        field1879 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILbk;B)Lub;")
    public static final class43 method802(int arg0, class136 arg1, byte arg2) {
        field1881++;
        if (arg2 == 97) {
            return class47.method251(7172, arg1, arg0) ? class143.method882(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lec;IZ)I")
    public static final int method803(class178 arg0, int arg1, boolean arg2) {
        field1871++;
        if (arg0.field3079 == null || arg0.field3079.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg0.field3079[arg1];
            int var4 = 0;
            if (arg2) {
                return -85;
            }
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class104.field1511[var3[var6++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class104.field1505[var3[var6++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 3) {
                    var8 = class152.field2455[var3[var6++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class178 var12 = class201.method1356(var11, (byte) 104);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class178.method1154(false, var13).field3611 || class105.field1519)) {
                        for (int var14 = 0; var14 < var12.field3045.length; var14++) {
                            if (var13 + 1 == var12.field3045[var14]) {
                                var8 += var12.field2989[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class215.field3873[var3[var6++]];
                }
                if (var7 == 6) {
                    var8 = class177.field2986[class104.field1505[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class215.field3873[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class102.field1477.field1939;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class76.field1087[var15]) {
                            var8 += class104.field1505[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class178 var18 = class201.method1356(var17, (byte) -99);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class178.method1154(false, var19).field3611 || class105.field1519)) {
                        for (int var20 = 0; var20 < var18.field3045.length; var20++) {
                            if (var19 + 1 == var18.field3045[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class84.field1235;
                }
                if (var7 == 12) {
                    var8 = class29.field366;
                }
                if (var7 == 13) {
                    int var21 = class215.field3873[var3[var6++]];
                    int var22 = var3[var6++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var8 = class138.method864(0, var23);
                }
                if (var7 == 18) {
                    var8 = (class102.field1477.field2081 >> 7) + class106.field1523;
                }
                if (var7 == 19) {
                    var8 = (class102.field1477.field2085 >> 7) + class178.field3011;
                }
                if (var7 == 20) {
                    var8 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var4 += var8;
                    }
                    if (var5 == 1) {
                        var4 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var5 == 3) {
                        var4 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1886[var0++] = (byte) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F)));
            }
        }
        field1887 = new class231(16);
        field1892 = class80.method502("Benutzeroberfl-=che geladen)3", -48);
        field1890 = 0;
    }
}
