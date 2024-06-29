import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class123 {

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Leg;")
    public static class37 field2061 = class174.method1167("", -86);

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Leg;")
    public static class37 field2066 = class174.method1167("(U1", 60);

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[I")
    public static int[] field2065 = new int[99];

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lva;")
    public static class187 field2068;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Leg;")
    public static class37 field2069;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Leg;")
    public static class37 field2071;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Llc;")
    public static class251 field2070;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
    public static int[] field2059;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZ)V")
    public static final void method883(boolean arg0, boolean arg1) {
        field2063++;
        byte[][] var2 = class47.field740;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class210.field3615[var5] >> 8) * 64 - class40.field642;
            int var12 = (class210.field3615[var5] & 0xFF) * 64 - class144.field2456;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class126.method898((byte) 83);
                class274.method1837(arg1, (byte) -122, var11, var12, class215.field3719, var13, (class68.field1073 - 6) * 8, class260.field4598 * 8 - 48);
            }
        }
        if (!arg0) {
            method886(-127, 115);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class210.field3615[var6] >> 8) * 64 - class40.field642;
            int var8 = (class210.field3615[var6] & 0xFF) * 64 - class144.field2456;
            byte[] var9 = var2[var6];
            if (var9 == null && class68.field1073 < 800) {
                class126.method898((byte) 83);
                for (int var10 = 0; var10 < var3; var10++) {
                    class289.method1941(64, 64, var7, var10, 8571, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)Z")
    public static final boolean method884(int arg0, byte arg1) {
        int var2 = 61 / ((arg1 + 33) / 61);
        field2060++;
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Z")
    public static final boolean method885(int arg0, int arg1) {
        field2067++;
        if (arg1 >= -124) {
            method886(-46, -24);
        }
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)I")
    public static final int method886(int arg0, int arg1) {
        if (arg1 != -1) {
            field2059 = null;
        }
        field2057++;
        return arg0 == 16711935 ? -1 : class62.method444((byte) 123, arg0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method887(int arg0) {
        field2066 = null;
        field2068 = null;
        field2071 = null;
        field2070 = null;
        field2069 = null;
        field2059 = null;
        field2061 = null;
        if (arg0 <= 55) {
            field2059 = null;
        }
        field2065 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLva;)V")
    public static final void method888(byte arg0, class187 arg1) {
        while (arg1.field3169 < arg1.field3175.length) {
            boolean var3 = false;
            int var4 = 0;
            int var5 = 0;
            if (arg1.method1268(255) == 1) {
                var3 = true;
                var5 = arg1.method1268(255);
                var4 = arg1.method1268(255);
            }
            int var6 = arg1.method1268(255);
            int var7 = arg1.method1268(255);
            int var8 = class228.field3921 + class118.field2004 - (var7 * 64) - 1;
            int var9 = var6 * 64 - class13.field205;
            if (var9 >= 0 && (var8 - 63) >= 0 && var9 + 63 < class243.field4368 && class118.field2004 > var8) {
                int var10 = var9 >> 6;
                int var11 = var8 >> 6;
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        if (!var3 || (var5 * 8) <= var12 && var12 < var5 * 8 + 8 && (var4 * 8) <= var13 && (var4 * 8 + 8) > var13) {
                            byte var14 = arg1.method1269(255);
                            if (var14 != 0) {
                                if (class190.field3265[var10][var11] == null) {
                                    class190.field3265[var10][var11] = new byte[4096];
                                }
                                class190.field3265[var10][var11][(63 - var13 << 6) + var12] = var14;
                                byte var15 = arg1.method1269(255);
                                if (class27.field390[var10][var11] == null) {
                                    class27.field390[var10][var11] = new byte[4096];
                                }
                                class27.field390[var10][var11][(63 - var13 << 6) + var12] = var15;
                            }
                        }
                    }
                }
            } else {
                for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                    byte var17 = arg1.method1269(255);
                    if (var17 != 0) {
                        arg1.field3169++;
                    }
                }
            }
        }
        field2064++;
        int var2 = -101 % ((92 - arg0) / 33);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)V")
    public static final void method889(int arg0, int arg1) {
        class82.field1291 = -1;
        class217.field3738 = arg1;
        class153.field2572 = -1;
        field2062++;
        class78.method530(-1);
        if (arg0 > -110) {
            field2069 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public static final void method890(int arg0, int arg1, int arg2) {
        class160.field2672 = true;
        class60.field993 = arg0;
        class265.field4650 = arg1;
        class270.field4713 = arg2;
        class172.field2886 = -1;
        class83.field1313 = -1;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2065[var1] = var0 / 4;
        }
        field2068 = new class187(new byte[5000]);
        field2069 = class174.method1167("Musik)2Engine vorbereitet)3", -26);
        field2071 = class174.method1167("Lade Titelbild )2 ", -55);
    }
}
