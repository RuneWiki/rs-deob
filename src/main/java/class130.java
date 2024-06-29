import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class130 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field1927 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Z")
    public static boolean field1929 = true;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field1939 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public int field1931;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    private int field1933;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[[B")
    public static byte[][] field1942;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method959(byte arg0) {
        field1942 = null;
        if (arg0 > -53) {
            field1929 = false;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILha;I)V")
    private final void method960(int arg0, int arg1, class31 arg2, int arg3) {
        if (arg0 == 1) {
            this.field1933 = arg2.method260((byte) -67);
        } else if (arg0 == 2) {
            this.field1938 = arg2.method265(-85);
            this.field1931 = arg2.method265(arg1 - 11207);
        }
        field1934++;
        if (arg1 != 11124) {
            field1929 = false;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method961(int arg0, int arg1) {
        field1928++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class157.field2350 += arg1 * 128;
        if (class157.field2350 > class220.field3365.length) {
            class157.field2350 -= class220.field3365.length;
            int var3 = (int) (Math.random() * 12.0D);
            class22.method193(class266.field4206[var3], 72);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class5.field78[var4 + var5] - (class220.field3365[class157.field2350 + var4 & class220.field3365.length + -1] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class5.field78[var4++] = var26;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class5.field78[var23 + var24] = 255;
                } else {
                    class5.field78[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = arg0; var9 < var2 - arg1; var9++) {
            class83.field1252[var9] = class83.field1252[arg1 + var9];
        }
        for (int var10 = var2 - arg1; var10 < var2; var10++) {
            class83.field1252[var10] = (int) (Math.sin((double) class92.field1468 / 14.0D) * 16.0D + Math.sin((double) class92.field1468 / 15.0D) * 14.0D + Math.sin((double) class92.field1468 / 16.0D) * 12.0D);
            class92.field1468++;
        }
        class137.field2067 += arg1;
        int var11 = ((class41.field686 & 0x1) + arg1) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class137.field2067; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class5.field78[var21 + (var22 << 7)] = 192;
        }
        class137.field2067 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var20 + var11) < 128) {
                    var18 += class5.field78[var11 + var20 + var19];
                }
                if (var20 - var11 - 1 >= 0) {
                    var18 -= class5.field78[var20 + var19 - (var11 + 1)];
                }
                if (var20 >= 0) {
                    class241.field3869[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if ((var11 + var16) < var2) {
                    var15 += class241.field3869[var14 + var17 + (var11 * 128)];
                }
                if ((var16 - var11 - 1) >= 0) {
                    var15 -= class241.field3869[var14 - (((var11 + 1) * 128) - var17)];
                }
                if (var16 >= 0) {
                    class5.field78[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLha;I)V")
    public final void method962(byte arg0, class31 arg1, int arg2) {
        field1932++;
        while (true) {
            int var4 = arg1.method265(-128);
            if (var4 == 0) {
                if (arg0 > -2) {
                    field1939 = -111;
                    return;
                } else {
                    return;
                }
            }
            this.method960(var4, 11124, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    public static final void method963(byte arg0) {
        field1935++;
        int var1 = 15 % ((4 - arg0) / 47);
        class150.field2219.method1172((byte) 127);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZILjava/lang/String;)I")
    public static final int method964(boolean arg0, int arg1, String arg2) {
        if (!arg0) {
            method965(-127, -95, 108, 11, (class55) null, (class55) null, 80, -2, -7, -16, 87L);
        }
        field1936++;
        return class33.method325(arg2, (byte) -93, true, arg1);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILnh;Lnh;IIIIJ)V")
    public static final void method965(int arg0, int arg1, int arg2, int arg3, class55 arg4, class55 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class56 var12 = new class56();
        var12.field880 = arg10;
        var12.field893 = arg1 * 128 + 64;
        var12.field881 = arg2 * 128 + 64;
        var12.field891 = arg3;
        var12.field886 = arg4;
        var12.field890 = arg5;
        var12.field879 = arg6;
        var12.field884 = arg7;
        var12.field892 = arg8;
        var12.field882 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class149.field2210[var13][arg1][arg2] == null) {
                class149.field2210[var13][arg1][arg2] = new class22(var13, arg1, arg2);
            }
        }
        class149.field2210[arg0][arg1][arg2].field364 = var12;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Lej;")
    public final class51 method966(int arg0) {
        field1930++;
        class51 var2 = (class51) class141.field2102.method1173((long) this.field1933, true);
        if (var2 != null) {
            return var2;
        }
        class51 var3 = class306.method2053(0, 0, this.field1933, class284.field4466);
        if (var3 != null) {
            class141.field2102.method1167((byte) -79, var3, (long) this.field1933);
        }
        if (arg0 >= -108) {
            this.field1933 = 70;
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method967(byte[] arg0, int arg1, int arg2, int arg3) {
        field1943++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var8 = arg0[arg3 + var6] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class156.field2332[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var5++] = (char) var8;
            }
        }
        int var7 = -46 / ((arg1 - 59) / 40);
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BII)I")
    public static final int method968(byte arg0, int arg1, int arg2) {
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        field1937++;
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg0 == 72 ? arg2 : -71;
    }
}
