import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class140 extends class256 {

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    private final int field2155;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    private final int field2162;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    private final int field2174;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    private final int field2159;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "[I")
    public static int[] field2158 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "Ljk;")
    public static class76 field2163 = new class76();

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "[I")
    public static int[] field2171 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "Luf;")
    public static class168 field2168 = class148.method1019(-1720, "Lade)3)3)3");

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "S")
    public static short field2170 = 205;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "Z")
    public static boolean field2173 = false;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field2175 = 0;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "[Lcg;")
    public static class253[] field2176 = new class253[4];

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lcj;")
    public static class75 field2156;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V", line = 19)
    public final void method903(int arg0, int arg1, int arg2) {
        field2154++;
        if (arg2 > -28) {
            field2171 = (int[]) null;
        }
        int var4 = this.field2162 * arg0 >> 12;
        int var5 = this.field2159 * arg0 >> 12;
        int var6 = this.field2155 * arg1 >> 12;
        int var7 = this.field2174 * arg1 >> 12;
        class126.method892(var6, this.field4356, var5, var4, var7, 861304876);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(BII)V", line = 42)
    public final void method904(byte arg0, int arg1, int arg2) {
        field2167++;
        if (arg0 != 117) {
            field2175 = -128;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 53)
    public static void method963(byte arg0) {
        field2158 = null;
        field2163 = null;
        int var1 = -25 % ((73 - arg0) / 32);
        field2171 = null;
        field2168 = null;
        field2176 = null;
        field2156 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 73)
    public static final Class method964(byte arg0, String arg1) throws ClassNotFoundException {
        field2164++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg0 != 54) {
                method969((byte) -77);
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILj;)V", line = 113)
    public static final void method965(int arg0, class153 arg1) {
        if (arg0 > -24) {
            field2173 = true;
        }
        field2160++;
        while (true) {
            while (arg1.field2359.length > arg1.field2367) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1042((byte) -52) == 1) {
                    var4 = arg1.method1042((byte) -126);
                    var2 = true;
                    var3 = arg1.method1042((byte) 109);
                }
                int var5 = arg1.method1042((byte) -71);
                int var6 = arg1.method1042((byte) 95);
                int var7 = class261.field4420 + class172.field2801 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class40.field506;
                if (var8 >= 0 && var7 - 63 >= 0 && field2161 > (var8 + 63) && class172.field2801 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var4 * 8 && (var4 * 8 + 8) > var11 && (var3 * 8) <= var12 && var3 * 8 + 8 > var12) {
                                int var13 = arg1.method1042((byte) -121);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1042((byte) -41);
                                        if (class200.field3299[var9][var10] == null) {
                                            class200.field3299[var9][var10] = new byte[4096];
                                        }
                                        class200.field3299[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1069(81);
                                        if (class207.field3400[var9][var10] == null) {
                                            class207.field3400[var9][var10] = new short[4096];
                                        }
                                        class207.field3400[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg1.method1042((byte) -18) & 0xFF << 16) + (arg1.method1042((byte) -70) & 0xFF << 8) + (arg1.method1042((byte) -96) & 0xFF);
                                        if (class63.field832[var9][var10] == null) {
                                            class63.field832[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class161 var17 = class15.method64(var16, false);
                                        if (var17.field2553 != null) {
                                            var17 = var17.method1135(-116);
                                            if (var17 == null || var17.field2556 == -1) {
                                                continue;
                                            }
                                        }
                                        class63.field832[var9][var10][(63 - var12 << 6) + var11] = var17.field2579 + 1;
                                        class297 var18 = new class297();
                                        var18.field5031 = var7;
                                        var18.field5015 = var8;
                                        var18.field5034 = var17.field2556;
                                        class113.field1757.method451(-91453648, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1042((byte) -19);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field2367++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field2367 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field2367 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V", line = 263)
    public static final void method966(int arg0, int arg1) {
        field2165++;
        class26 var2 = class77.method455(2, -59, arg0);
        var2.method136(arg1 - 4088);
        if (arg1 != 4096) {
            method967(-41);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBI)V", line = 283)
    public final void method905(int arg0, byte arg1, int arg2) {
        field2172++;
        if (arg1 <= 10) {
            method965(-77, (class153) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 295)
    public static final void method967(int arg0) {
        int var1 = 67 % ((arg0 + 3) / 32);
        field2166++;
        class39.field485.method1429((byte) 120);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIIII)V", line = 314)
    public class140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2155 = arg3;
        this.field2162 = arg0;
        this.field2174 = arg1;
        this.field2159 = arg2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIIB)V", line = 338)
    public static final void method968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        int var8 = -89 % ((arg7 + 7) / 54);
        field2152++;
        int var9 = class54.method301(class44.field538, arg5, class9.field112, 76);
        int var10 = class54.method301(class44.field538, arg0, class9.field112, 96);
        int var11 = class54.method301(class65.field874, arg4, class150.field2331, -93);
        int var12 = class54.method301(class65.field874, arg6, class150.field2331, 125);
        int var13 = class54.method301(class44.field538, arg1 + arg5, class9.field112, -84);
        int var14 = class54.method301(class44.field538, arg0 - arg1, class9.field112, -99);
        for (int var15 = var9; var15 < var13; var15++) {
            class133.method925(14678, var11, arg3, var12, class284.field4810[var15]);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class133.method925(14678, var11, arg3, var12, class284.field4810[var16]);
        }
        int var17 = class54.method301(class65.field874, arg1 + arg4, class150.field2331, 81);
        int var18 = class54.method301(class65.field874, arg6 - arg1, class150.field2331, -44);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class284.field4810[var19];
            class133.method925(14678, var11, arg3, var17, var20);
            class133.method925(14678, var17, arg2, var18, var20);
            class133.method925(14678, var18, arg3, var12, var20);
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V", line = 390)
    public static final void method969(byte arg0) {
        for (class227 var1 = (class227) class53.field655.method442(arg0 ^ 0xFF4E); var1 != null; var1 = (class227) class53.field655.method440(3)) {
            class282 var2 = var1.field3688;
            if (class79.field1127 != var2.field4766 || var2.field4740 < class203.field3335) {
                var1.method124((byte) 41);
            } else if (class203.field3335 >= var2.field4730) {
                if (var2.field4736 > 0) {
                    class22 var3 = class190.field3065[var2.field4736 - 1];
                    if (var3 != null && var3.field3027 >= 0 && var3.field3027 < 13312 && var3.field3021 >= 0 && var3.field3021 < 13312) {
                        var2.method1948(class62.method349(arg0 + 61, var2.field4766, var3.field3021, var3.field3027) - var2.field4755, false, class203.field3335, var3.field3027, var3.field3021);
                    }
                }
                if (var2.field4736 < 0) {
                    int var4 = -var2.field4736 - 1;
                    class54 var5;
                    if (class65.field873 == var4) {
                        var5 = class266.field4489;
                    } else {
                        var5 = class9.field117[var4];
                    }
                    if (var5 != null && var5.field3027 >= 0 && var5.field3027 < 13312 && var5.field3021 >= 0 && var5.field3021 < 13312) {
                        var2.method1948(class62.method349(128, var2.field4766, var5.field3021, var5.field3027) - var2.field4755, false, class203.field3335, var5.field3027, var5.field3021);
                    }
                }
                var2.method1945(class274.field4619, -27);
                class2.method6(class79.field1127, (int) var2.field4743, (int) var2.field4745, (int) var2.field4734, 60, var2, var2.field4763, -1L, false);
            }
        }
        field2157++;
        if (arg0 != 67) {
            field2173 = false;
        }
    }
}
