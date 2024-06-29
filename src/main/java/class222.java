import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class222 {

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3447 = -1;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3455 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3452 = 2;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3450 = "Choose Option";

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3453 = 0;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Lrn;")
    public static class18 field3446;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1662(boolean arg0) {
        if (!arg0) {
            field3447 = 13;
        }
        class78.field1130.method655(-1);
        field3444++;
        class87.field1247.method655(-1);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)V", line = 17)
    public static void method1663(boolean arg0) {
        field3446 = null;
        field3450 = null;
        field3455 = null;
        if (!arg0) {
            field3450 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZZ)V", line = 40)
    public static final void method1664(boolean arg0, boolean arg1) {
        field3445++;
        byte var2;
        byte[][] var3;
        if (class240.field3737 && arg0) {
            var2 = 1;
            var3 = class244.field3797;
        } else {
            var2 = 4;
            var3 = class37.field570;
        }
        if (!arg1) {
            field3450 = (String) null;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var2; var5++) {
            class102.method886(arg1);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class74.field1090[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = (var9 & 0xFFE426) >> 14;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class292.field4540.length; var15++) {
                                if (class292.field4540[var15] == var14 && var3[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class329.method2326(var10, var13, arg0, var11, class57.field905, var5, (byte) 125, var3[var15], var6 * 8, var7 * 8, var12);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class192.method1466(8, arg1, var5, var6 * 8, var7 * 8, 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class308.field4760 = -1;
            return;
        }
        class309.field4772 = var4[4];
        class314.field4855 = var4[3];
        class337.field5172 = var4[2];
        class308.field4760 = var4[0];
        class346.field5507 = var4[1];
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lug;II)V", line = 149)
    private final void method1665(class25 arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            this.field3458 = arg0.method314((byte) 72);
            this.field3454 = arg0.method281(arg2 ^ 0x7A);
            this.field3449 = arg0.method281(18);
        }
        field3461++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lrn;BII)[Lho;", line = 168)
    public static final class215[] method1666(class18 arg0, byte arg1, int arg2, int arg3) {
        field3451++;
        if (arg1 != -112) {
            method1667(30, 60, -48, -114, 44, -87, 52);
        }
        return class282.method2056(arg2, arg1 ^ 0xFFFFFF90, arg0, arg3) ? class15.method163(true) : null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V", line = 184)
    public static final void method1667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3456++;
        int var7 = arg3 + arg6;
        int var8 = arg1 - arg6;
        int var9 = arg2 + arg6;
        for (int var10 = arg3; var10 < var7; var10++) {
            class283.method2059(arg0, class133.field2235[var10], (byte) 98, arg5, arg2);
        }
        int var11 = arg1;
        if (arg4 != -29872) {
            field3452 = 26;
        }
        while (var8 < var11) {
            class283.method2059(arg0, class133.field2235[var11], (byte) 114, arg5, arg2);
            var11--;
        }
        int var12 = arg5 - arg6;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class133.field2235[var13];
            class283.method2059(arg0, var14, (byte) 95, var9, arg2);
            class283.method2059(arg0, var14, (byte) 122, arg5, var12);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILrn;)V", line = 235)
    public static final void method1668(int arg0, class18 arg1) {
        class105.field1587 = arg1;
        if (arg0 == 8) {
            field3460++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V", line = 248)
    public static final void method1669(int arg0, int arg1, int arg2) {
        class222 var3 = class153.method1262(arg1, 69);
        int var4 = var3.field3458;
        if (arg0 > -37) {
            method1667(59, 81, 72, 15, 60, 87, 126);
        }
        field3448++;
        int var5 = var3.field3454;
        int var6 = var3.field3449;
        int var7 = class49.field773[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class363.method2549(arg2 << var5 & var8 | ~var8 & class329.field5058[var4], true, var4);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILug;)V", line = 275)
    public final void method1670(int arg0, class25 arg1) {
        if (arg0 != 24457) {
            field3452 = 41;
        }
        field3443++;
        while (true) {
            int var3 = arg1.method281(arg0 - 24583);
            if (var3 == 0) {
                return;
            }
            this.method1665(arg1, var3, -2);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BIIIIII)V", line = 297)
    public static final void method1671(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 - arg6) >= class43.field693 && class128.field2130 >= (arg1 + arg6) && class328.field5042 <= arg3 - arg6 && arg3 + arg6 <= class284.field4385) {
            class293.method2119(arg3, arg6, arg1, (byte) 105, arg2, arg5, arg4);
        } else {
            class324.method2295(arg1, arg2, arg4, -29588, arg6, arg3, arg5);
        }
        if (arg0 > -36) {
            method1672(-45, 105);
        }
        field3457++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V", line = 321)
    public static final void method1672(int arg0, int arg1) {
        if (arg0 == 8) {
            field3459++;
            if (class328.method2321(0, arg1)) {
                class167.method1331((byte) -124, -1, class334.field5108[arg1]);
            }
        }
    }
}
