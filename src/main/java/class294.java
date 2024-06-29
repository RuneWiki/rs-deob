import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class294 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4683 = 0;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4694 = "Loading - please wait.";

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[S")
    public static short[] field4689 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Z")
    public static boolean field4684 = true;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4693 = "Loading wordpack - ";

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lki;")
    public static class142 field4687;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "S")
    public short field4688;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Z")
    public boolean field4682;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Z")
    public boolean field4692;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Z")
    public boolean field4695;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Z")
    public boolean field4696;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1971(byte arg0, String arg1) {
        field4697++;
        if (arg0 <= 6) {
            return -14;
        }
        for (int var2 = 0; var2 < class44.field663.length; var2++) {
            if (class44.field663[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
    public static final void method1972(int arg0, int arg1) {
        class15.field267.method944(79);
        field4690++;
        class15.field267 = new class150(arg0);
        if (arg1 != 21364) {
            method1971((byte) 1, (String) null);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Z")
    public static final boolean method1973(int arg0) {
        if (arg0 != 2) {
            field4684 = true;
        }
        field4691++;
        return class26.field414;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method1974(int arg0) {
        if (arg0 < 86) {
            field4687 = null;
        }
        field4693 = null;
        field4689 = null;
        field4694 = null;
        field4687 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1975(boolean arg0, String arg1, int arg2) {
        if (arg2 > -97) {
            field4689 = null;
        }
        short[] var3 = new short[16];
        field4685++;
        int var4 = arg0 ? 32768 : 0;
        String var5 = arg1.toLowerCase();
        int var6 = 0;
        int var7 = var4 + (arg0 ? class71.field1029 : class189.field2866);
        for (int var8 = var4; var8 < var7; var8++) {
            class6 var11 = class158.method984((byte) -62, var8);
            if (var11.field58 && var11.method31(false).toLowerCase().indexOf(var5) != -1) {
                if (var6 >= 50) {
                    class21.field346 = -1;
                    class34.field512 = null;
                    return;
                }
                if (var6 >= var3.length) {
                    short[] var12 = new short[var3.length * 2];
                    for (int var13 = 0; var13 < var6; var13++) {
                        var12[var13] = var3[var13];
                    }
                    var3 = var12;
                }
                var3[var6++] = (short) var8;
            }
        }
        class34.field512 = var3;
        class21.field346 = var6;
        class101.field1456 = 0;
        String[] var9 = new String[class21.field346];
        for (int var10 = 0; var10 < class21.field346; var10++) {
            var9[var10] = class158.method984((byte) -62, var3[var10]).method31(false);
        }
        class120.method778(-90, var9, class34.field512);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lga;IIZILfa;ILvj;)V")
    public static final void method1976(class149 arg0, int arg1, int arg2, boolean arg3, int arg4, class238 arg5, int arg6, class187 arg7) {
        field4686++;
        if (arg2 != 8741) {
            method1973(94);
        }
        class67 var8 = null;
        if (arg0.field2044 == 0) {
            if ((double) class97.field1401 == 3.0D) {
                var8 = class75.field1059;
            }
            if ((double) class97.field1401 == 4.0D) {
                var8 = class292.field4667;
            }
            if ((double) class97.field1401 == 6.0D) {
                var8 = class284.field4558;
            }
            if ((double) class97.field1401 >= 8.0D) {
                var8 = class103.field1482;
            }
        } else if (arg0.field2044 == 1) {
            if ((double) class97.field1401 == 3.0D) {
                var8 = class284.field4558;
            }
            if ((double) class97.field1401 == 4.0D) {
                var8 = class103.field1482;
            }
            if ((double) class97.field1401 == 6.0D) {
                var8 = class267.field4290;
            }
            if ((double) class97.field1401 >= 8.0D) {
                var8 = class108.field1533;
            }
        } else if (arg0.field2044 == 2) {
            if ((double) class97.field1401 == 3.0D) {
                var8 = class267.field4290;
            }
            if ((double) class97.field1401 == 4.0D) {
                var8 = class108.field1533;
            }
            if ((double) class97.field1401 == 6.0D) {
                var8 = class175.field2472;
            }
            if ((double) class97.field1401 >= 8.0D) {
                var8 = class7.field83;
            }
        }
        if (var8 == null) {
            return;
        }
        int var9 = arg0.field2031;
        if (arg5.field3695 && arg0.field2053 != -1) {
            var9 = arg0.field2053;
        }
        int var10 = 0;
        int var11 = class301.field4788.method204(arg0.field2068, (int[]) null, class53.field758);
        int var12 = arg5.field3686;
        int var13;
        if (arg3) {
            var13 = var12 - var11 * var8.method442() / 2;
        } else {
            var13 = var12 - (arg4 + (var8.method439() * (var11 - 1) + (var8.method442() / 2)));
        }
        int var14 = var13 - var8.method442();
        int var15 = var13 + var8.method442() / 2;
        for (int var16 = 0; var16 < var11; var16++) {
            String var22 = class53.field758[var16];
            if (var11 - 1 > var16) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method440(var22);
            if (var23 > var10) {
                var10 = var23;
            }
        }
        arg7.field2835 = arg6 + var14;
        arg7.field2841 = arg5.field3687 - (-(var10 / 2) - arg1);
        arg7.field2839 = arg5.field3687 + arg1 - (var10 / 2);
        int var17 = var14 + 2;
        arg7.field2838 = var11 * var8.method439() + var14 + arg6;
        int var18 = arg5.field3687 - (var10 / 2) - 5;
        if (arg0.field2034 != 0) {
            class266.method1748(var18, var17, var10 + 10, var14 + 1 + (var11 * var8.method439() - var17), arg0.field2034, arg0.field2034 >>> 24);
        }
        if (arg0.field2038 != 0) {
            class266.method1723(var18, var17, var10 + 10, var14 + (var11 * var8.method439() - var17 - -1), arg0.field2038, arg0.field2038 >>> 24);
        }
        for (int var19 = 0; var19 < var11; var19++) {
            String var20 = class53.field758[var19];
            if (var11 - 1 > var19) {
                var20 = var20.substring(0, var20.length() - 4);
            }
            int var21 = var8.method440(var20);
            if (var10 < var21) {
                var10 = var21;
            }
            var8.method446(var20, arg5.field3687, var15, var9, true);
            var15 += var8.method439();
        }
    }
}
