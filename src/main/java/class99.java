import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class99 extends class35 {

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "I")
    private int field1740;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    private int field1724;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    private int field1728;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "Lab;")
    public static class279 field1736 = new class279(200);

    @OriginalMember(owner = "client!vm", name = "R", descriptor = "[I")
    public static int[] field1751 = new int[32];

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "[I")
    public static int[] field1746 = new int[64];

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!vm", name = "Q", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "[[[B")
    public static byte[][][] field1749;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "[[[I")
    public static int[][][] field1748;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V", line = 8)
    public static final void method646(int arg0, int arg1) {
        class35.field699.method1883(2047773287, arg0);
        field1735++;
        class151.field2463.method1883(2047773287, arg0);
        if (arg1 <= 59) {
            field1751 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBI)Z", line = 22)
    public final boolean method647(int arg0, byte arg1, int arg2) {
        if (arg1 != 89) {
            method646(6, 46);
        }
        field1729++;
        return arg2 >= this.field1728 && this.field1738 >= arg2 && this.field1724 <= arg0 && this.field1740 >= arg0;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(ZI)I", line = 37)
    public static final int method648(boolean arg0, int arg1) {
        field1737++;
        long var2 = class338.method2339((byte) -120);
        for (class256 var4 = arg0 ? (class256) class123.field2125.method306(0) : (class256) class123.field2125.method300(1); var4 != null; var4 = (class256) class123.field2125.method300(1)) {
            if ((var4.field3999 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3999 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field702;
                    class40.field771[var5] = class23.field468[var5];
                    var4.method278((byte) -105);
                    return var5;
                }
                var4.method278((byte) -105);
            }
        }
        if (arg1 >= -29) {
            field1748 = (int[][][]) ((int[][][]) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(IBI)[I", line = 82)
    public final int[] method649(int arg0, byte arg1, int arg2) {
        field1732++;
        int var4 = 125 / ((-arg1 - 78) / 45);
        return new int[] { this.field1739, this.field1728 - (this.field1725 - arg0), -this.field1741 - (-this.field1724 - arg2) };
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)Lfb;", line = 101)
    private static final class237 method650(int arg0, int arg1) {
        class237 var2 = (class237) class21.field445.method1881(true, (long) arg1);
        field1733++;
        if (arg0 != 113) {
            return (class237) null;
        } else if (var2 == null) {
            byte[] var3 = class18.field330.method2036(arg1, 0, (byte) 89);
            class237 var4 = new class237(var3);
            var4.method2125(class344.field5343, (int[]) null);
            class21.field445.method1880(var4, (long) arg1, 114);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII)Z", line = 124)
    public final boolean method651(int arg0, int arg1, int arg2, int arg3) {
        field1726++;
        if (arg1 != 31272) {
            this.field1725 = -70;
        }
        return this.field1739 == arg2 && this.field1728 <= arg3 && this.field1738 >= arg3 && this.field1724 <= arg0 && this.field1740 >= arg0;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)Z", line = 141)
    public final boolean method652(int arg0, int arg1, int arg2) {
        field1727++;
        if (arg0 == 5218) {
            return arg1 >= this.field1725 && this.field1742 >= arg1 && arg2 >= this.field1741 && arg2 <= this.field1730;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZIIIIZ)V", line = 161)
    public static final void method653(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var7 = 19 % ((arg2 - 38) / 43);
        if (arg0 > arg5) {
            int var8 = (arg0 + arg5) / 2;
            int var9 = arg5;
            class103 var10 = class236.field3715[var8];
            class236.field3715[var8] = class236.field3715[arg0];
            class236.field3715[arg0] = var10;
            for (int var11 = arg5; var11 < arg0; var11++) {
                if (class240.method1589(arg6, (byte) -82, var10, arg4, class236.field3715[var11], arg1, arg3) <= 0) {
                    class103 var12 = class236.field3715[var11];
                    class236.field3715[var11] = class236.field3715[var9];
                    class236.field3715[var9++] = var12;
                }
            }
            class236.field3715[arg0] = class236.field3715[var9];
            class236.field3715[var9] = var10;
            method653(var9 - 1, arg1, -20, arg3, arg4, arg5, arg6);
            method653(arg0, arg1, 84, arg3, arg4, var9 + 1, arg6);
        }
        field1747++;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)[I", line = 204)
    public final int[] method654(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            field1731++;
            return new int[] { this.field1744, this.field1725 + arg0 - this.field1728, arg1 - this.field1724 - -this.field1741 };
        } else {
            return (int[]) null;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1751[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILbm;II)[Lmg;", line = 219)
    public static final class113[] method655(int arg0, class307 arg1, int arg2, int arg3) {
        field1734++;
        if (class135.method885(arg3, arg1, -10948, arg0)) {
            if (arg2 != -201) {
                field1749 = (byte[][][]) ((byte[][][]) null);
            }
            return class180.method1135((byte) 92);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 237)
    public static final void method656(int arg0) {
        class337.field5237 = class38.method295(0.4F, 4, -8, 35, true, 8, 8, 2048);
        if (arg0 == -17937) {
            field1745++;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lmn;BI)V", line = 254)
    public static final void method657(class106 arg0, byte arg1, int arg2) {
        field1743++;
        Object[] var3 = arg0.field1841;
        int var4 = (Integer) var3[0];
        class203 var5 = class33.method270(-122, var4);
        if (var5 == null) {
            return;
        }
        if (arg1 != -61) {
            field1746 = (int[]) null;
        }
        int var6 = 0;
        class15.field280 = 0;
        int[] var7 = var5.field3300;
        int var8 = -1;
        int var9 = 0;
        int[] var10 = var5.field3304;
        byte var11 = -1;
        try {
            class158.field2574 = new String[var5.field3305];
            class18.field328 = new int[var5.field3311];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1831;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1824;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1823 == null ? -1 : arg0.field1823.field1284;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1843;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1823 == null ? -1 : arg0.field1823.field1365;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1842 == null ? -1 : arg0.field1842.field1284;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1842 == null ? -1 : arg0.field1842.field1365;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1835;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1833;
                    }
                    class18.field328[var12++] = var16;
                } else if (var3[var14] instanceof String) {
                    String var15 = (String) var3[var14];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1832;
                    }
                    class158.field2574[var13++] = var15;
                }
            }
            int var17 = 0;
            label4454: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var528 = var7[var8];
                int var10000;
                if (var528 < 100) {
                    if (var528 == 0) {
                        class341.field5298[var9++] = var10[var8];
                        continue;
                    }
                    if (var528 == 1) {
                        int var18 = var10[var8];
                        class341.field5298[var9++] = class40.field771[var18];
                        continue;
                    }
                    if (var528 == 2) {
                        int var19 = var10[var8];
                        var10000 = arg1 + 10433;
                        var9--;
                        class236.method1568(var10000, class341.field5298[var9], var19);
                        continue;
                    }
                    if (var528 == 3) {
                        class178.field2869[var6++] = var5.field3309[var8];
                        continue;
                    }
                    if (var528 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var528 == 7) {
                        var9 -= 2;
                        if (class341.field5298[var9 + 1] != class341.field5298[var9]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 8) {
                        var9 -= 2;
                        if (class341.field5298[var9 + 1] == class341.field5298[var9]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 9) {
                        var9 -= 2;
                        if (class341.field5298[var9] < class341.field5298[var9 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 10) {
                        var9 -= 2;
                        if (class341.field5298[var9] > class341.field5298[var9 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 21) {
                        if (class15.field280 == 0) {
                            return;
                        }
                        class136 var20 = class197.field3171[--class15.field280];
                        class158.field2574 = var20.field2273;
                        var8 = var20.field2281;
                        var5 = var20.field2286;
                        class18.field328 = var20.field2277;
                        var7 = var5.field3300;
                        var10 = var5.field3304;
                        continue;
                    }
                    if (var528 == 25) {
                        int var21 = var10[var8];
                        class341.field5298[var9++] = class281.method1893((byte) 40, var21);
                        continue;
                    }
                    if (var528 == 27) {
                        int var22 = var10[var8];
                        var9--;
                        class204.method1369(class341.field5298[var9], var22, true);
                        continue;
                    }
                    if (var528 == 31) {
                        var9 -= 2;
                        if (class341.field5298[var9] <= class341.field5298[var9 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 32) {
                        var9 -= 2;
                        if (class341.field5298[var9] >= class341.field5298[var9 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var528 == 33) {
                        class341.field5298[var9++] = class18.field328[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var528 == 34) {
                        var10001 = var10[var8];
                        var9--;
                        class18.field328[var10001] = class341.field5298[var9];
                        continue;
                    }
                    if (var528 == 35) {
                        class178.field2869[var6++] = class158.field2574[var10[var8]];
                        continue;
                    }
                    if (var528 == 36) {
                        var10001 = var10[var8];
                        var6--;
                        class158.field2574[var10001] = class178.field2869[var6];
                        continue;
                    }
                    if (var528 == 37) {
                        int var23 = var10[var8];
                        var6 -= var23;
                        String var24 = class179.method1125((byte) -78, var23, var6, class178.field2869);
                        class178.field2869[var6++] = var24;
                        continue;
                    }
                    if (var528 == 38) {
                        var9--;
                        continue;
                    }
                    if (var528 == 39) {
                        var6--;
                        continue;
                    }
                    if (var528 == 40) {
                        int var25 = var10[var8];
                        class203 var26 = class33.method270(106, var25);
                        String[] var27 = new String[var26.field3305];
                        int[] var28 = new int[var26.field3311];
                        for (int var29 = 0; var29 < var26.field3302; var29++) {
                            var28[var29] = class341.field5298[var9 - (var26.field3302 - var29)];
                        }
                        for (int var30 = 0; var30 < var26.field3310; var30++) {
                            var27[var30] = class178.field2869[var6 + var30 - var26.field3310];
                        }
                        var9 -= var26.field3302;
                        var6 -= var26.field3310;
                        class136 var31 = new class136();
                        var31.field2286 = var5;
                        var31.field2277 = class18.field328;
                        var31.field2273 = class158.field2574;
                        var31.field2281 = var8;
                        if (class15.field280 >= class197.field3171.length) {
                            throw new RuntimeException();
                        }
                        class197.field3171[class15.field280++] = var31;
                        var5 = var26;
                        class18.field328 = var28;
                        class158.field2574 = var27;
                        var8 = -1;
                        var10 = var26.field3304;
                        var7 = var26.field3300;
                        continue;
                    }
                    if (var528 == 42) {
                        class341.field5298[var9++] = class61.field1176[var10[var8]];
                        continue;
                    }
                    if (var528 == 43) {
                        int var32 = var10[var8];
                        var9--;
                        class61.field1176[var32] = class341.field5298[var9];
                        class103.method674(1, var32);
                        continue;
                    }
                    if (var528 == 44) {
                        int var33 = var10[var8] >> 16;
                        int var34 = var10[var8] & 0xFFFF;
                        var9--;
                        int var35 = class341.field5298[var9];
                        if (var35 >= 0 && var35 <= 5000) {
                            class212.field3415[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label4454;
                                }
                                class196.field3156[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 45) {
                        var9--;
                        int var38 = class341.field5298[var9];
                        int var39 = var10[var8];
                        if (var38 >= 0 && var38 < class212.field3415[var39]) {
                            class341.field5298[var9++] = class196.field3156[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 46) {
                        int var40 = var10[var8];
                        var9 -= 2;
                        int var41 = class341.field5298[var9];
                        if (var41 >= 0 && var41 < class212.field3415[var40]) {
                            class196.field3156[var40][var41] = class341.field5298[var9 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 47) {
                        String var42 = class100.field1753[var10[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class178.field2869[var6++] = var42;
                        continue;
                    }
                    if (var528 == 48) {
                        int var43 = var10[var8];
                        var6--;
                        class100.field1753[var43] = class178.field2869[var6];
                        class163.method1044(var43, false);
                        continue;
                    }
                    if (var528 == 51) {
                        class39 var44 = var5.field3299[var10[var8]];
                        var9--;
                        class166 var45 = (class166) var44.method303((long) class341.field5298[var9], (byte) 106);
                        if (var45 != null) {
                            var8 += var45.field2682;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var528 < 300) {
                    if (var528 == 100) {
                        var9 -= 3;
                        int var508 = class341.field5298[var9];
                        int var509 = class341.field5298[var9 + 1];
                        int var510 = class341.field5298[var9 + 2];
                        if (var509 == 0) {
                            throw new RuntimeException();
                        }
                        class68 var511 = class319.method2196(-1351736944, var508);
                        if (var511.field1372 == null) {
                            var511.field1372 = new class68[var510 + 1];
                        }
                        if (var510 >= var511.field1372.length) {
                            class68[] var512 = new class68[var510 + 1];
                            for (int var513 = 0; var513 < var511.field1372.length; var513++) {
                                var512[var513] = var511.field1372[var513];
                            }
                            var511.field1372 = var512;
                        }
                        if (var510 > 0 && var511.field1372[var510 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var510 - 1));
                        }
                        class68 var514 = new class68();
                        var514.field1429 = true;
                        var514.field1308 = var514.field1284 = var511.field1284;
                        var514.field1358 = var509;
                        var514.field1365 = var510;
                        var511.field1372[var510] = var514;
                        if (var46) {
                            class189.field3069 = var514;
                        } else {
                            class140.field2320 = var514;
                        }
                        class317.method2183((byte) -7, var511);
                        continue;
                    }
                    if (var528 == 101) {
                        class68 var515 = var46 ? class189.field3069 : class140.field2320;
                        if (var515.field1365 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class68 var516 = class319.method2196(-1351736944, var515.field1284);
                        var516.field1372[var515.field1365] = null;
                        class317.method2183((byte) -7, var516);
                        continue;
                    }
                    if (var528 == 102) {
                        var9--;
                        class68 var517 = class319.method2196(-1351736944, class341.field5298[var9]);
                        var517.field1372 = null;
                        class317.method2183((byte) -7, var517);
                        continue;
                    }
                    if (var528 == 200) {
                        var9 -= 2;
                        int var518 = class341.field5298[var9 + 1];
                        int var519 = class341.field5298[var9];
                        class68 var520 = class233.method1548((byte) -124, var519, var518);
                        if (var520 != null && var518 != -1) {
                            class341.field5298[var9++] = 1;
                            if (var46) {
                                class189.field3069 = var520;
                            } else {
                                class140.field2320 = var520;
                            }
                            continue;
                        }
                        class341.field5298[var9++] = 0;
                        continue;
                    }
                    if (var528 == 201) {
                        var9--;
                        int var521 = class341.field5298[var9];
                        class68 var522 = class319.method2196(-1351736944, var521);
                        if (var522 == null) {
                            class341.field5298[var9++] = 0;
                        } else {
                            class341.field5298[var9++] = 1;
                            if (var46) {
                                class189.field3069 = var522;
                            } else {
                                class140.field2320 = var522;
                            }
                        }
                        continue;
                    }
                } else if (var528 < 500) {
                    if (var528 == 403) {
                        var9 -= 2;
                        int var501 = class341.field5298[var9];
                        int var502 = class341.field5298[var9 + 1];
                        for (int var503 = 0; var503 < class228.field3608.length; var503++) {
                            if (class228.field3608[var503] == var501) {
                                class66.field1265.field4281.method1519(var503, var502, (byte) 44);
                                continue label4454;
                            }
                        }
                        int var504 = 0;
                        while (true) {
                            if (class313.field4758.length <= var504) {
                                continue label4454;
                            }
                            if (class313.field4758[var504] == var501) {
                                class66.field1265.field4281.method1519(var504, var502, (byte) 44);
                                continue label4454;
                            }
                            var504++;
                        }
                    }
                    if (var528 == 404) {
                        var9 -= 2;
                        int var505 = class341.field5298[var9 + 1];
                        int var506 = class341.field5298[var9];
                        class66.field1265.field4281.method1523(var506, arg1 ^ 0xFFFFFFC3, var505);
                        continue;
                    }
                    if (var528 == 410) {
                        var9--;
                        boolean var507 = class341.field5298[var9] != 0;
                        class66.field1265.field4281.method1517(var507, (byte) -119);
                        continue;
                    }
                } else if (!(var528 < 1000 || var528 >= 1100) || !(var528 < 2000 || var528 >= 2100)) {
                    class68 var495;
                    if (var528 < 2000) {
                        var495 = var46 ? class189.field3069 : class140.field2320;
                    } else {
                        var528 -= 1000;
                        var9--;
                        var495 = class319.method2196(-1351736944, class341.field5298[var9]);
                    }
                    if (var528 == 1000) {
                        var9 -= 4;
                        var495.field1350 = class341.field5298[var9];
                        var495.field1291 = class341.field5298[var9 + 1];
                        int var496 = class341.field5298[var9 + 2];
                        int var497 = class341.field5298[var9 + 3];
                        if (var497 < 0) {
                            var497 = 0;
                        } else if (var497 > 5) {
                            var497 = 5;
                        }
                        if (var496 < 0) {
                            var496 = 0;
                        } else if (var496 > 5) {
                            var496 = 5;
                        }
                        var495.field1309 = (byte) var496;
                        var495.field1363 = (byte) var497;
                        class317.method2183((byte) -7, var495);
                        class165.method1052(109, var495);
                        if (var495.field1365 == -1) {
                            class58.method452(false, var495.field1284);
                        }
                        continue;
                    }
                    if (var528 == 1001) {
                        var9 -= 4;
                        var495.field1381 = class341.field5298[var9];
                        var495.field1386 = class341.field5298[var9 + 1];
                        var495.field1399 = 0;
                        var495.field1430 = 0;
                        int var498 = class341.field5298[var9 + 3];
                        int var499 = class341.field5298[var9 + 2];
                        if (var498 < 0) {
                            var498 = 0;
                        } else if (var498 > 4) {
                            var498 = 4;
                        }
                        var495.field1347 = (byte) var498;
                        if (var499 < 0) {
                            var499 = 0;
                        } else if (var499 > 4) {
                            var499 = 4;
                        }
                        var495.field1442 = (byte) var499;
                        class317.method2183((byte) -7, var495);
                        class165.method1052(127, var495);
                        if (var495.field1358 == 0) {
                            class218.method1453(false, (byte) -116, var495);
                        }
                        continue;
                    }
                    if (var528 == 1003) {
                        var9--;
                        boolean var500 = class341.field5298[var9] == 1;
                        if (var495.field1435 != var500) {
                            var495.field1435 = var500;
                            class317.method2183((byte) -7, var495);
                        }
                        if (var495.field1365 == -1) {
                            class4.method55(var495.field1284, 126);
                        }
                        continue;
                    }
                    if (var528 == 1004) {
                        var9 -= 2;
                        var495.field1432 = class341.field5298[var9];
                        var495.field1379 = class341.field5298[var9 + 1];
                        class317.method2183((byte) -7, var495);
                        class165.method1052(108, var495);
                        if (var495.field1358 == 0) {
                            class218.method1453(false, (byte) -69, var495);
                        }
                        continue;
                    }
                    if (var528 == 1005) {
                        var9--;
                        var495.field1456 = class341.field5298[var9] == 1;
                        continue;
                    }
                } else if (var528 >= 1100 && var528 < 1200 || var528 >= 2100 && var528 < 2200) {
                    class68 var47;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var10000 = arg1 - 1351736883;
                        var9--;
                        var47 = class319.method2196(var10000, class341.field5298[var9]);
                    } else {
                        var47 = var46 ? class189.field3069 : class140.field2320;
                    }
                    if (var528 == 1100) {
                        var9 -= 2;
                        var47.field1288 = class341.field5298[var9];
                        if (var47.field1288 > var47.field1388 - var47.field1416) {
                            var47.field1288 = var47.field1388 - var47.field1416;
                        }
                        if (var47.field1288 < 0) {
                            var47.field1288 = 0;
                        }
                        var47.field1419 = class341.field5298[var9 + 1];
                        if (var47.field1419 > var47.field1401 - var47.field1414) {
                            var47.field1419 = var47.field1401 - var47.field1414;
                        }
                        if (var47.field1419 < 0) {
                            var47.field1419 = 0;
                        }
                        class317.method2183((byte) -7, var47);
                        if (var47.field1365 == -1) {
                            class290.method1951(91, var47.field1284);
                        }
                        continue;
                    }
                    if (var528 == 1101) {
                        var9--;
                        var47.field1355 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        if (var47.field1365 == -1) {
                            class37.method291(6, var47.field1284);
                        }
                        continue;
                    }
                    if (var528 == 1102) {
                        var9--;
                        var47.field1320 = class341.field5298[var9] == 1;
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1103) {
                        var9--;
                        var47.field1455 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1104) {
                        var9--;
                        var47.field1394 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1105) {
                        var9--;
                        var47.field1285 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1106) {
                        var9--;
                        var47.field1337 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1107) {
                        var9--;
                        var47.field1412 = class341.field5298[var9] == 1;
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1108) {
                        var47.field1423 = 1;
                        var9--;
                        var47.field1431 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        if (var47.field1365 == -1) {
                            class12.method99(var47.field1284, arg1 ^ 0x7B);
                        }
                        continue;
                    }
                    if (var528 == 1109) {
                        var9 -= 6;
                        var47.field1300 = class341.field5298[var9];
                        var47.field1335 = class341.field5298[var9 + 1];
                        var47.field1342 = class341.field5298[var9 + 2];
                        var47.field1400 = class341.field5298[var9 + 3];
                        var47.field1336 = class341.field5298[var9 + 4];
                        var47.field1294 = class341.field5298[var9 + 5];
                        class317.method2183((byte) -7, var47);
                        if (var47.field1365 == -1) {
                            class68.method520(true, var47.field1284);
                            class12.method94(10, var47.field1284);
                        }
                        continue;
                    }
                    if (var528 == 1110) {
                        var9--;
                        int var48 = class341.field5298[var9];
                        if (var47.field1439 != var48) {
                            var47.field1433 = 0;
                            var47.field1437 = 0;
                            var47.field1338 = 1;
                            var47.field1439 = var48;
                            class317.method2183((byte) -7, var47);
                        }
                        if (var47.field1365 == -1) {
                            class218.method1456(false, var47.field1284);
                        }
                        continue;
                    }
                    if (var528 == 1111) {
                        var9--;
                        var47.field1286 = class341.field5298[var9] == 1;
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1112) {
                        var6--;
                        String var49 = class178.field2869[var6];
                        if (!var49.equals(var47.field1295)) {
                            var47.field1295 = var49;
                            class317.method2183((byte) -7, var47);
                        }
                        if (var47.field1365 == -1) {
                            class151.method981(var47.field1284, 3);
                        }
                        continue;
                    }
                    if (var528 == 1113) {
                        var9--;
                        var47.field1463 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1114) {
                        var9 -= 3;
                        var47.field1446 = class341.field5298[var9];
                        var47.field1397 = class341.field5298[var9 + 1];
                        var47.field1319 = class341.field5298[var9 + 2];
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1115) {
                        var9--;
                        var47.field1282 = class341.field5298[var9] == 1;
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1116) {
                        var9--;
                        var47.field1357 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1117) {
                        var9--;
                        var47.field1299 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1118) {
                        var9--;
                        var47.field1348 = class341.field5298[var9] == 1;
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1119) {
                        var9--;
                        var47.field1330 = class341.field5298[var9] == 1;
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1120) {
                        var9 -= 2;
                        var47.field1388 = class341.field5298[var9];
                        var47.field1401 = class341.field5298[var9 + 1];
                        class317.method2183((byte) -7, var47);
                        if (var47.field1358 == 0) {
                            class218.method1453(false, (byte) -125, var47);
                        }
                        continue;
                    }
                    if (var528 == 1121) {
                        var9 -= 2;
                        var47.field1296 = (short) class341.field5298[var9];
                        var47.field1293 = (short) class341.field5298[var9 + 1];
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1122) {
                        var9--;
                        var47.field1459 = class341.field5298[var9] == 1;
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                    if (var528 == 1123) {
                        var9--;
                        var47.field1294 = class341.field5298[var9];
                        class317.method2183((byte) -7, var47);
                        if (var47.field1365 == -1) {
                            class68.method520(true, var47.field1284);
                        }
                        continue;
                    }
                    if (var528 == 1124) {
                        var9--;
                        int var50 = class341.field5298[var9];
                        var47.field1332 = var50 == 1;
                        class317.method2183((byte) -7, var47);
                        continue;
                    }
                } else if (var528 >= 1200 && var528 < 1300 || var528 >= 2200 && var528 < 2300) {
                    class68 var491;
                    if (var528 < 2000) {
                        var491 = var46 ? class189.field3069 : class140.field2320;
                    } else {
                        var528 -= 1000;
                        var9--;
                        var491 = class319.method2196(-1351736944, class341.field5298[var9]);
                    }
                    class317.method2183((byte) -7, var491);
                    if (var528 == 1200 || var528 == 1205 || var528 == 1208 || var528 == 1209) {
                        var9 -= 2;
                        int var492 = class341.field5298[var9];
                        int var493 = class341.field5298[var9 + 1];
                        if (var491.field1365 == -1) {
                            class72.method550(var491.field1284, arg1 ^ 0xFFFFFFE3);
                            class68.method520(true, var491.field1284);
                            class12.method94(arg1 + 71, var491.field1284);
                        }
                        if (var492 == -1) {
                            var491.field1431 = -1;
                            var491.field1423 = 1;
                            var491.field1290 = -1;
                            continue;
                        }
                        var491.field1392 = var493;
                        if (var528 == 1208 || var528 == 1209) {
                            var491.field1447 = true;
                        } else {
                            var491.field1447 = false;
                        }
                        var491.field1290 = var492;
                        class337 var494 = class95.method636(22111, var492);
                        var491.field1300 = var494.field5207;
                        var491.field1342 = var494.field5182;
                        var491.field1294 = var494.field5187;
                        if (var491.field1430 > 0) {
                            var491.field1294 = var491.field1294 * 32 / var491.field1430;
                        } else if (var491.field1381 > 0) {
                            var491.field1294 = var491.field1294 * 32 / var491.field1381;
                        }
                        if (var528 == 1205) {
                            var491.field1460 = false;
                        } else {
                            var491.field1460 = true;
                        }
                        var491.field1336 = var494.field5224;
                        var491.field1400 = var494.field5180;
                        var491.field1335 = var494.field5175;
                        continue;
                    }
                    if (var528 == 1201) {
                        var491.field1423 = 2;
                        var9--;
                        var491.field1431 = class341.field5298[var9];
                        if (var491.field1365 == -1) {
                            class12.method99(var491.field1284, -22);
                        }
                        continue;
                    }
                    if (var528 == 1202) {
                        var491.field1423 = 3;
                        var491.field1431 = class66.field1265.field4281.method1527(true);
                        if (var491.field1365 == -1) {
                            class12.method99(var491.field1284, 112);
                        }
                        continue;
                    }
                    if (var528 == 1203) {
                        var491.field1423 = 6;
                        var9--;
                        var491.field1431 = class341.field5298[var9];
                        if (var491.field1365 == -1) {
                            class12.method99(var491.field1284, 118);
                        }
                        continue;
                    }
                    if (var528 == 1204) {
                        var491.field1423 = 5;
                        var9--;
                        var491.field1431 = class341.field5298[var9];
                        if (var491.field1365 == -1) {
                            class12.method99(var491.field1284, -33);
                        }
                        continue;
                    }
                    if (var528 == 1206) {
                        var9 -= 4;
                        var491.field1453 = class341.field5298[var9];
                        var491.field1451 = class341.field5298[var9 + 1];
                        var491.field1283 = class341.field5298[var9 + 2];
                        var491.field1360 = class341.field5298[var9 + 3];
                        class317.method2183((byte) -7, var491);
                        continue;
                    }
                    if (var528 == 1207) {
                        var9 -= 2;
                        var491.field1368 = class341.field5298[var9];
                        var491.field1390 = class341.field5298[var9 + 1];
                        class317.method2183((byte) -7, var491);
                        continue;
                    }
                } else if ((var528 < 1300 || var528 >= 1400) && (var528 < 2300 || var528 >= 2400)) {
                    if (var528 >= 1400 && var528 < 1500 || var528 >= 2400 && var528 < 2500) {
                        int[] var57 = null;
                        class68 var58;
                        if (var528 >= 2000) {
                            var528 -= 1000;
                            var9--;
                            var58 = class319.method2196(-1351736944, class341.field5298[var9]);
                        } else {
                            var58 = var46 ? class189.field3069 : class140.field2320;
                        }
                        var6--;
                        String var59 = class178.field2869[var6];
                        if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                            var9--;
                            int var60 = class341.field5298[var9];
                            if (var60 > 0) {
                                var57 = new int[var60];
                                while ((var60--) > 0) {
                                    var9--;
                                    var57[var60] = class341.field5298[var9];
                                }
                            }
                            var59 = var59.substring(0, var59.length() - 1);
                        }
                        Object[] var61 = new Object[var59.length() + 1];
                        for (int var62 = var61.length - 1; var62 >= 1; var62--) {
                            if (var59.charAt(var62 - 1) == 's') {
                                var6--;
                                var61[var62] = class178.field2869[var6];
                            } else {
                                var9--;
                                var61[var62] = Integer.valueOf(class341.field5298[var9]);
                            }
                        }
                        var9--;
                        int var63 = class341.field5298[var9];
                        if (var63 == -1) {
                            var61 = null;
                        } else {
                            var61[0] = Integer.valueOf(var63);
                        }
                        if (var528 == 1400) {
                            var58.field1387 = var61;
                        } else if (var528 == 1401) {
                            var58.field1373 = var61;
                        } else if (var528 == 1402) {
                            var58.field1316 = var61;
                        } else if (var528 == 1403) {
                            var58.field1307 = var61;
                        } else if (var528 == 1404) {
                            var58.field1313 = var61;
                        } else if (var528 == 1405) {
                            var58.field1445 = var61;
                        } else if (var528 == 1406) {
                            var58.field1345 = var61;
                        } else if (var528 == 1407) {
                            var58.field1289 = var61;
                            var58.field1440 = var57;
                        } else if (var528 == 1408) {
                            var58.field1353 = var61;
                        } else if (var528 == 1409) {
                            var58.field1334 = var61;
                        } else if (var528 == 1410) {
                            var58.field1352 = var61;
                        } else if (var528 == 1411) {
                            var58.field1331 = var61;
                        } else if (var528 == 1412) {
                            var58.field1292 = var61;
                        } else if (var528 == 1414) {
                            var58.field1280 = var57;
                            var58.field1391 = var61;
                        } else if (var528 == 1415) {
                            var58.field1361 = var61;
                            var58.field1398 = var57;
                        } else if (var528 == 1416) {
                            var58.field1443 = var61;
                        } else if (var528 == 1417) {
                            var58.field1452 = var61;
                        } else if (var528 == 1418) {
                            var58.field1377 = var61;
                        } else if (var528 == 1419) {
                            var58.field1302 = var61;
                        } else if (var528 == 1420) {
                            var58.field1328 = var61;
                        } else if (var528 == 1421) {
                            var58.field1279 = var61;
                        } else if (var528 == 1422) {
                            var58.field1411 = var61;
                        } else if (var528 == 1423) {
                            var58.field1305 = var61;
                        } else if (var528 == 1424) {
                            var58.field1449 = var61;
                        } else if (var528 == 1425) {
                            var58.field1413 = var61;
                        } else if (var528 == 1426) {
                            var58.field1457 = var61;
                        } else if (var528 == 1427) {
                            var58.field1315 = var61;
                        } else if (var528 == 1428) {
                            var58.field1339 = var61;
                            var58.field1409 = var57;
                        } else if (var528 == 1429) {
                            var58.field1434 = var61;
                            var58.field1298 = var57;
                        }
                        var58.field1406 = true;
                        continue;
                    }
                    if (var528 < 1600) {
                        class68 var64 = var46 ? class189.field3069 : class140.field2320;
                        if (var528 == 1500) {
                            class341.field5298[var9++] = var64.field1324;
                            continue;
                        }
                        if (var528 == 1501) {
                            class341.field5298[var9++] = var64.field1340;
                            continue;
                        }
                        if (var528 == 1502) {
                            class341.field5298[var9++] = var64.field1416;
                            continue;
                        }
                        if (var528 == 1503) {
                            class341.field5298[var9++] = var64.field1414;
                            continue;
                        }
                        if (var528 == 1504) {
                            class341.field5298[var9++] = var64.field1435 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 1505) {
                            class341.field5298[var9++] = var64.field1308;
                            continue;
                        }
                    } else if (var528 < 1700) {
                        class68 var490 = var46 ? class189.field3069 : class140.field2320;
                        if (var528 == 1600) {
                            class341.field5298[var9++] = var490.field1288;
                            continue;
                        }
                        if (var528 == 1601) {
                            class341.field5298[var9++] = var490.field1419;
                            continue;
                        }
                        if (var528 == 1602) {
                            class178.field2869[var6++] = var490.field1295;
                            continue;
                        }
                        if (var528 == 1603) {
                            class341.field5298[var9++] = var490.field1388;
                            continue;
                        }
                        if (var528 == 1604) {
                            class341.field5298[var9++] = var490.field1401;
                            continue;
                        }
                        if (var528 == 1605) {
                            class341.field5298[var9++] = var490.field1294;
                            continue;
                        }
                        if (var528 == 1606) {
                            class341.field5298[var9++] = var490.field1342;
                            continue;
                        }
                        if (var528 == 1607) {
                            class341.field5298[var9++] = var490.field1336;
                            continue;
                        }
                        if (var528 == 1608) {
                            class341.field5298[var9++] = var490.field1400;
                            continue;
                        }
                        if (var528 == 1609) {
                            class341.field5298[var9++] = var490.field1455;
                            continue;
                        }
                        if (var528 == 1610) {
                            class341.field5298[var9++] = var490.field1300;
                            continue;
                        }
                        if (var528 == 1611) {
                            class341.field5298[var9++] = var490.field1335;
                            continue;
                        }
                        if (var528 == 1612) {
                            class341.field5298[var9++] = var490.field1285;
                            continue;
                        }
                    } else if (var528 < 1800) {
                        class68 var489 = var46 ? class189.field3069 : class140.field2320;
                        if (var528 == 1700) {
                            class341.field5298[var9++] = var489.field1290;
                            continue;
                        }
                        if (var528 == 1701) {
                            if (var489.field1290 == -1) {
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var489.field1392;
                            }
                            continue;
                        }
                        if (var528 == 1702) {
                            class341.field5298[var9++] = var489.field1365;
                            continue;
                        }
                    } else if (var528 < 1900) {
                        class68 var487 = var46 ? class189.field3069 : class140.field2320;
                        if (var528 == 1800) {
                            class341.field5298[var9++] = client.method359(var487).method1783(arg1 + 60);
                            continue;
                        }
                        if (var528 == 1801) {
                            var9--;
                            int var488 = class341.field5298[var9];
                            int var530 = var488 - 1;
                            if (var487.field1369 != null && var530 < var487.field1369.length && var487.field1369[var530] != null) {
                                class178.field2869[var6++] = var487.field1369[var530];
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 1802) {
                            if (var487.field1346 == null) {
                                class178.field2869[var6++] = "";
                            } else {
                                class178.field2869[var6++] = var487.field1346;
                            }
                            continue;
                        }
                    } else if (var528 < 2600) {
                        var9--;
                        class68 var65 = class319.method2196(-1351736944, class341.field5298[var9]);
                        if (var528 == 2500) {
                            class341.field5298[var9++] = var65.field1324;
                            continue;
                        }
                        if (var528 == 2501) {
                            class341.field5298[var9++] = var65.field1340;
                            continue;
                        }
                        if (var528 == 2502) {
                            class341.field5298[var9++] = var65.field1416;
                            continue;
                        }
                        if (var528 == 2503) {
                            class341.field5298[var9++] = var65.field1414;
                            continue;
                        }
                        if (var528 == 2504) {
                            class341.field5298[var9++] = var65.field1435 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 2505) {
                            class341.field5298[var9++] = var65.field1308;
                            continue;
                        }
                    } else if (var528 < 2700) {
                        var9--;
                        class68 var66 = class319.method2196(-1351736944, class341.field5298[var9]);
                        if (var528 == 2600) {
                            class341.field5298[var9++] = var66.field1288;
                            continue;
                        }
                        if (var528 == 2601) {
                            class341.field5298[var9++] = var66.field1419;
                            continue;
                        }
                        if (var528 == 2602) {
                            class178.field2869[var6++] = var66.field1295;
                            continue;
                        }
                        if (var528 == 2603) {
                            class341.field5298[var9++] = var66.field1388;
                            continue;
                        }
                        if (var528 == 2604) {
                            class341.field5298[var9++] = var66.field1401;
                            continue;
                        }
                        if (var528 == 2605) {
                            class341.field5298[var9++] = var66.field1294;
                            continue;
                        }
                        if (var528 == 2606) {
                            class341.field5298[var9++] = var66.field1342;
                            continue;
                        }
                        if (var528 == 2607) {
                            class341.field5298[var9++] = var66.field1336;
                            continue;
                        }
                        if (var528 == 2608) {
                            class341.field5298[var9++] = var66.field1400;
                            continue;
                        }
                        if (var528 == 2609) {
                            class341.field5298[var9++] = var66.field1455;
                            continue;
                        }
                        if (var528 == 2610) {
                            class341.field5298[var9++] = var66.field1300;
                            continue;
                        }
                        if (var528 == 2611) {
                            class341.field5298[var9++] = var66.field1335;
                            continue;
                        }
                        if (var528 == 2612) {
                            class341.field5298[var9++] = var66.field1285;
                            continue;
                        }
                    } else if (var528 < 2800) {
                        if (var528 == 2700) {
                            var9--;
                            class68 var477 = class319.method2196(-1351736944, class341.field5298[var9]);
                            class341.field5298[var9++] = var477.field1290;
                            continue;
                        }
                        if (var528 == 2701) {
                            var10000 = arg1 - 1351736883;
                            var9--;
                            class68 var478 = class319.method2196(var10000, class341.field5298[var9]);
                            if (var478.field1290 == -1) {
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var478.field1392;
                            }
                            continue;
                        }
                        if (var528 == 2702) {
                            var9--;
                            int var479 = class341.field5298[var9];
                            class222 var480 = (class222) class185.field3013.method303((long) var479, (byte) 108);
                            if (var480 == null) {
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = 1;
                            }
                            continue;
                        }
                        if (var528 == 2703) {
                            var9--;
                            class68 var481 = class319.method2196(-1351736944, class341.field5298[var9]);
                            if (var481.field1372 == null) {
                                class341.field5298[var9++] = 0;
                                continue;
                            }
                            int var482 = var481.field1372.length;
                            for (int var483 = 0; var483 < var481.field1372.length; var483++) {
                                if (var481.field1372[var483] == null) {
                                    var482 = var483;
                                    break;
                                }
                            }
                            class341.field5298[var9++] = var482;
                            continue;
                        }
                        if (var528 == 2704 || var528 == 2705) {
                            var9 -= 2;
                            int var484 = class341.field5298[var9];
                            int var485 = class341.field5298[var9 + 1];
                            class222 var486 = (class222) class185.field3013.method303((long) var484, (byte) 113);
                            if (var486 != null && var486.field3514 == var485) {
                                class341.field5298[var9++] = 1;
                            } else {
                                class341.field5298[var9++] = 0;
                            }
                            continue;
                        }
                    } else if (var528 < 2900) {
                        var9--;
                        class68 var475 = class319.method2196(-1351736944, class341.field5298[var9]);
                        if (var528 == 2800) {
                            class341.field5298[var9++] = client.method359(var475).method1783(-1);
                            continue;
                        }
                        if (var528 == 2801) {
                            var9--;
                            int var476 = class341.field5298[var9];
                            int var529 = var476 - 1;
                            if (var475.field1369 != null && var529 < var475.field1369.length && var475.field1369[var529] != null) {
                                class178.field2869[var6++] = var475.field1369[var529];
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 2802) {
                            if (var475.field1346 == null) {
                                class178.field2869[var6++] = "";
                            } else {
                                class178.field2869[var6++] = var475.field1346;
                            }
                            continue;
                        }
                    } else if (var528 < 3200) {
                        if (var528 == 3100) {
                            var6--;
                            String var460 = class178.field2869[var6];
                            class42.method321(var460, 0, 1, "");
                            continue;
                        }
                        if (var528 == 3101) {
                            var9 -= 2;
                            class88.method617(class66.field1265, class341.field5298[var9], (byte) -68, class341.field5298[var9 + 1]);
                            continue;
                        }
                        if (var528 == 3103) {
                            class208.method1410((byte) 49);
                            continue;
                        }
                        if (var528 == 3104) {
                            class172.field2768++;
                            var6--;
                            String var461 = class178.field2869[var6];
                            int var462 = 0;
                            if (class343.method2377(var461, (byte) -41)) {
                                var462 = class321.method2236(var461, 88);
                            }
                            class14.field263.method80(178, (byte) 112);
                            class14.field263.method1359(arg1 ^ 0xFFFFBE82, var462);
                            continue;
                        }
                        if (var528 == 3105) {
                            var6--;
                            String var463 = class178.field2869[var6];
                            class14.field263.method80(252, (byte) 110);
                            class14.field263.method1353((byte) -105, class116.method767(-126, var463));
                            class26.field514++;
                            continue;
                        }
                        if (var528 == 3106) {
                            class293.field4476++;
                            var6--;
                            String var464 = class178.field2869[var6];
                            class14.field263.method80(41, (byte) 102);
                            class14.field263.method1311(var464.length() + 1, arg1 + 11025);
                            class14.field263.method1309(65, var464);
                            continue;
                        }
                        if (var528 == 3107) {
                            var6--;
                            String var465 = class178.field2869[var6];
                            var9--;
                            int var466 = class341.field5298[var9];
                            class34.method274(var465, var466, -85);
                            continue;
                        }
                        if (var528 == 3108) {
                            var9 -= 3;
                            int var467 = class341.field5298[var9];
                            int var468 = class341.field5298[var9 + 1];
                            int var469 = class341.field5298[var9 + 2];
                            class68 var470 = class319.method2196(-1351736944, var469);
                            class177.method1115((byte) -4, var468, var467, var470);
                            continue;
                        }
                        if (var528 == 3109) {
                            var9 -= 2;
                            int var471 = class341.field5298[var9];
                            class68 var472 = var46 ? class189.field3069 : class140.field2320;
                            int var473 = class341.field5298[var9 + 1];
                            class177.method1115((byte) -4, var473, var471, var472);
                            continue;
                        }
                        if (var528 == 3110) {
                            var9--;
                            int var474 = class341.field5298[var9];
                            class213.field3424++;
                            class14.field263.method80(77, (byte) 121);
                            class14.field263.method1313(var474, -376480);
                            continue;
                        }
                    } else if (var528 < 3300) {
                        if (var528 == 3200) {
                            var9 -= 3;
                            class104.method675(255, class341.field5298[var9 + 1], class341.field5298[var9], (byte) -65, class341.field5298[var9 + 2]);
                            continue;
                        }
                        if (var528 == 3201) {
                            var9--;
                            class210.method1424(255, (byte) -59, class341.field5298[var9]);
                            continue;
                        }
                        if (var528 == 3202) {
                            var9 -= 2;
                            class325.method2252(1, class341.field5298[var9 + 1], 255, class341.field5298[var9]);
                            continue;
                        }
                    } else if (var528 < 3400) {
                        if (var528 == 3300) {
                            class341.field5298[var9++] = class25.field494;
                            continue;
                        }
                        if (var528 == 3301) {
                            var9 -= 2;
                            int var426 = class341.field5298[var9 + 1];
                            int var427 = class341.field5298[var9];
                            class341.field5298[var9++] = class114.method744(var426, var427, false);
                            continue;
                        }
                        if (var528 == 3302) {
                            var9 -= 2;
                            int var428 = class341.field5298[var9 + 1];
                            int var429 = class341.field5298[var9];
                            class341.field5298[var9++] = class221.method1475(var429, 91, var428);
                            continue;
                        }
                        if (var528 == 3303) {
                            var9 -= 2;
                            int var430 = class341.field5298[var9 + 1];
                            int var431 = class341.field5298[var9];
                            class341.field5298[var9++] = class269.method1792((byte) -112, var431, var430);
                            continue;
                        }
                        if (var528 == 3304) {
                            var9--;
                            int var432 = class341.field5298[var9];
                            class341.field5298[var9++] = class280.method1887(true, var432).field2662;
                            continue;
                        }
                        if (var528 == 3305) {
                            var9--;
                            int var433 = class341.field5298[var9];
                            class341.field5298[var9++] = class327.field5008[var433];
                            continue;
                        }
                        if (var528 == 3306) {
                            var9--;
                            int var434 = class341.field5298[var9];
                            class341.field5298[var9++] = class248.field3866[var434];
                            continue;
                        }
                        if (var528 == 3307) {
                            var9--;
                            int var435 = class341.field5298[var9];
                            class341.field5298[var9++] = class72.field1507[var435];
                            continue;
                        }
                        if (var528 == 3308) {
                            int var436 = (class66.field1265.field1872 >> 7) + class101.field1769;
                            int var437 = class289.field4438;
                            int var438 = (class66.field1265.field1869 >> 7) + class246.field3818;
                            class341.field5298[var9++] = (var437 << 28) + (var438 << 14) + var436;
                            continue;
                        }
                        if (var528 == 3309) {
                            var9--;
                            int var439 = class341.field5298[var9];
                            class341.field5298[var9++] = class61.method475(var439, 268428070) >> 14;
                            continue;
                        }
                        if (var528 == 3310) {
                            var9--;
                            int var440 = class341.field5298[var9];
                            class341.field5298[var9++] = var440 >> 28;
                            continue;
                        }
                        if (var528 == 3311) {
                            var9--;
                            int var441 = class341.field5298[var9];
                            class341.field5298[var9++] = class61.method475(16383, var441);
                            continue;
                        }
                        if (var528 == 3312) {
                            class341.field5298[var9++] = class15.field277 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3313) {
                            var9 -= 2;
                            int var442 = class341.field5298[var9 + 1];
                            int var443 = class341.field5298[var9] + 32768;
                            class341.field5298[var9++] = class114.method744(var442, var443, false);
                            continue;
                        }
                        if (var528 == 3314) {
                            var9 -= 2;
                            int var444 = class341.field5298[var9 + 1];
                            int var445 = class341.field5298[var9] + 32768;
                            class341.field5298[var9++] = class221.method1475(var445, 124, var444);
                            continue;
                        }
                        if (var528 == 3315) {
                            var9 -= 2;
                            int var446 = class341.field5298[var9 + 1];
                            int var447 = class341.field5298[var9] + 32768;
                            class341.field5298[var9++] = class269.method1792((byte) -106, var447, var446);
                            continue;
                        }
                        if (var528 == 3316) {
                            if (class29.field545 >= 2) {
                                class341.field5298[var9++] = class29.field545;
                            } else {
                                class341.field5298[var9++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 3317) {
                            class341.field5298[var9++] = class85.field1607;
                            continue;
                        }
                        if (var528 == 3318) {
                            class341.field5298[var9++] = class109.field1940;
                            continue;
                        }
                        if (var528 == 3321) {
                            class341.field5298[var9++] = class246.field3812;
                            continue;
                        }
                        if (var528 == 3322) {
                            class341.field5298[var9++] = class116.field2046;
                            continue;
                        }
                        if (var528 == 3323) {
                            if (class84.field1595 >= 5 && class84.field1595 <= 9) {
                                class341.field5298[var9++] = 1;
                                continue;
                            }
                            class341.field5298[var9++] = 0;
                            continue;
                        }
                        if (var528 == 3324) {
                            if (class84.field1595 >= 5 && class84.field1595 <= 9) {
                                class341.field5298[var9++] = class84.field1595;
                                continue;
                            }
                            class341.field5298[var9++] = 0;
                            continue;
                        }
                        if (var528 == 3325) {
                            class341.field5298[var9++] = class77.field1534 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3326) {
                            class341.field5298[var9++] = class66.field1265.field4261;
                            continue;
                        }
                        if (var528 == 3327) {
                            class341.field5298[var9++] = class66.field1265.field4281.field3612 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3328) {
                            class341.field5298[var9++] = class294.field4494 && !class211.field3400 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3329) {
                            class341.field5298[var9++] = class188.field3047 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3330) {
                            var9--;
                            int var448 = class341.field5298[var9];
                            class341.field5298[var9++] = class66.method506(var448, (byte) -57);
                            continue;
                        }
                        if (var528 == 3331) {
                            var9 -= 2;
                            int var449 = class341.field5298[var9 + 1];
                            int var450 = class341.field5298[var9];
                            class341.field5298[var9++] = class151.method984(var450, var449, (byte) -15, false);
                            continue;
                        }
                        if (var528 == 3332) {
                            var9 -= 2;
                            int var451 = class341.field5298[var9];
                            int var452 = class341.field5298[var9 + 1];
                            class341.field5298[var9++] = class151.method984(var451, var452, (byte) -15, true);
                            continue;
                        }
                        if (var528 == 3333) {
                            class341.field5298[var9++] = class119.field2080;
                            continue;
                        }
                        if (var528 == 3335) {
                            class341.field5298[var9++] = class321.field4894;
                            continue;
                        }
                        if (var528 == 3336) {
                            var9 -= 4;
                            int var453 = class341.field5298[var9];
                            int var454 = class341.field5298[var9 + 1];
                            int var455 = class341.field5298[var9 + 3];
                            int var456 = (var454 << 14) + var453;
                            int var457 = class341.field5298[var9 + 2];
                            int var458 = (var457 << 28) + var456;
                            int var459 = var455 + var458;
                            class341.field5298[var9++] = var459;
                            continue;
                        }
                        if (var528 == 3337) {
                            class341.field5298[var9++] = class190.field3090;
                            continue;
                        }
                    } else if (var528 < 3500) {
                        if (var528 == 3400) {
                            var9 -= 2;
                            int var409 = class341.field5298[var9 + 1];
                            int var410 = class341.field5298[var9];
                            class125 var411 = class208.method1408((byte) 17, var410);
                            if (var411.field2162 != 's') {
                            }
                            class178.field2869[var6++] = var411.method825(var409, -9614);
                            continue;
                        }
                        if (var528 == 3408) {
                            var9 -= 4;
                            int var412 = class341.field5298[var9];
                            int var413 = class341.field5298[var9 + 1];
                            int var414 = class341.field5298[var9 + 2];
                            int var415 = class341.field5298[var9 + 3];
                            class125 var416 = class208.method1408((byte) 17, var414);
                            if (var416.field2170 == var412 && var416.field2162 == var413) {
                                if (var413 == 115) {
                                    class178.field2869[var6++] = var416.method825(var415, -9614);
                                } else {
                                    class341.field5298[var9++] = var416.method827(-3, var415);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var528 == 3409) {
                            var9 -= 3;
                            int var417 = class341.field5298[var9];
                            int var418 = class341.field5298[var9 + 1];
                            int var419 = class341.field5298[var9 + 2];
                            if (var418 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class125 var420 = class208.method1408((byte) 17, var418);
                            if (var420.field2162 != var417) {
                                throw new RuntimeException("C3409-1");
                            }
                            class341.field5298[var9++] = var420.method831(var419, false) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3410) {
                            var9--;
                            int var421 = class341.field5298[var9];
                            var6--;
                            String var422 = class178.field2869[var6];
                            if (var421 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class125 var423 = class208.method1408((byte) 17, var421);
                            if (var423.field2162 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class341.field5298[var9++] = var423.method833(arg1 - 33, var422) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3411) {
                            var9--;
                            int var424 = class341.field5298[var9];
                            class125 var425 = class208.method1408((byte) 17, var424);
                            class341.field5298[var9++] = var425.field2158.method304(-113);
                            continue;
                        }
                    } else if (var528 < 3700) {
                        if (var528 == 3600) {
                            if (class294.field4490 == 0) {
                                class341.field5298[var9++] = -2;
                            } else if (class294.field4490 == 1) {
                                class341.field5298[var9++] = -1;
                            } else {
                                class341.field5298[var9++] = class274.field4197;
                            }
                            continue;
                        }
                        if (var528 == 3601) {
                            var9--;
                            int var385 = class341.field5298[var9];
                            if (class294.field4490 == 2 && var385 < class274.field4197) {
                                class178.field2869[var6++] = class296.field4509[var385];
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 3602) {
                            var9--;
                            int var386 = class341.field5298[var9];
                            if (class294.field4490 == 2 && class274.field4197 > var386) {
                                class341.field5298[var9++] = class306.field4633[var386];
                                continue;
                            }
                            class341.field5298[var9++] = 0;
                            continue;
                        }
                        if (var528 == 3603) {
                            var9--;
                            int var387 = class341.field5298[var9];
                            if (class294.field4490 == 2 && class274.field4197 > var387) {
                                class341.field5298[var9++] = class1.field16[var387];
                                continue;
                            }
                            class341.field5298[var9++] = 0;
                            continue;
                        }
                        if (var528 == 3604) {
                            var6--;
                            String var388 = class178.field2869[var6];
                            var9--;
                            int var389 = class341.field5298[var9];
                            class319.method2223(0, var389, var388);
                            continue;
                        }
                        if (var528 == 3605) {
                            var6--;
                            String var390 = class178.field2869[var6];
                            class147.method956(class116.method767(arg1 - 67, var390), true);
                            continue;
                        }
                        if (var528 == 3606) {
                            var6--;
                            String var391 = class178.field2869[var6];
                            class245.method1623((byte) 102, class116.method767(-128, var391));
                            continue;
                        }
                        if (var528 == 3607) {
                            var6--;
                            String var392 = class178.field2869[var6];
                            class191.method1226(class116.method767(arg1 ^ 0x43, var392), false, (byte) -40);
                            continue;
                        }
                        if (var528 == 3608) {
                            var6--;
                            String var393 = class178.field2869[var6];
                            class85.method596(class116.method767(-127, var393), arg1 ^ 0xFFFFFFC3);
                            continue;
                        }
                        if (var528 == 3609) {
                            var6--;
                            String var394 = class178.field2869[var6];
                            if (var394.startsWith("<img=0>") || var394.startsWith("<img=1>")) {
                                var394 = var394.substring(7);
                            }
                            class341.field5298[var9++] = class87.method610(0, var394) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3610) {
                            var9--;
                            int var395 = class341.field5298[var9];
                            if (class294.field4490 == 2 && var395 < class274.field4197) {
                                class178.field2869[var6++] = class293.field4485[var395];
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 3611) {
                            if (class343.field5335 == null) {
                                class178.field2869[var6++] = "";
                            } else {
                                class178.field2869[var6++] = class69.method532(arg1 + 103, class343.field5335);
                            }
                            continue;
                        }
                        if (var528 == 3612) {
                            if (class343.field5335 == null) {
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = class220.field3483;
                            }
                            continue;
                        }
                        if (var528 == 3613) {
                            var9--;
                            int var396 = class341.field5298[var9];
                            if (class343.field5335 != null && var396 < class220.field3483) {
                                class178.field2869[var6++] = class69.method532(110, class327.field5009[var396].field2452);
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 3614) {
                            var9--;
                            int var397 = class341.field5298[var9];
                            if (class343.field5335 != null && var397 < class220.field3483) {
                                class341.field5298[var9++] = class327.field5009[var397].field2453;
                                continue;
                            }
                            class341.field5298[var9++] = 0;
                            continue;
                        }
                        if (var528 == 3615) {
                            var9--;
                            int var398 = class341.field5298[var9];
                            if (class343.field5335 != null && var398 < class220.field3483) {
                                class341.field5298[var9++] = class327.field5009[var398].field2460;
                                continue;
                            }
                            class341.field5298[var9++] = 0;
                            continue;
                        }
                        if (var528 == 3616) {
                            class341.field5298[var9++] = class197.field3165;
                            continue;
                        }
                        if (var528 == 3617) {
                            var6--;
                            String var399 = class178.field2869[var6];
                            class220.method1469(0, var399);
                            continue;
                        }
                        if (var528 == 3618) {
                            class341.field5298[var9++] = class94.field1690;
                            continue;
                        }
                        if (var528 == 3619) {
                            var6--;
                            String var400 = class178.field2869[var6];
                            class148.method967((byte) 108, class116.method767(arg1 - 64, var400));
                            continue;
                        }
                        if (var528 == 3620) {
                            class51.method384(61);
                            continue;
                        }
                        if (var528 == 3621) {
                            if (class294.field4490 == 0) {
                                class341.field5298[var9++] = -1;
                            } else {
                                class341.field5298[var9++] = class77.field1538;
                            }
                            continue;
                        }
                        if (var528 == 3622) {
                            var9--;
                            int var401 = class341.field5298[var9];
                            if (class294.field4490 != 0 && class77.field1538 > var401) {
                                class178.field2869[var6++] = class159.method1024(class291.field4471[var401], (byte) 83);
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 3623) {
                            var6--;
                            String var402 = class178.field2869[var6];
                            if (var402.startsWith("<img=0>") || var402.startsWith("<img=1>")) {
                                var402 = var402.substring(7);
                            }
                            class341.field5298[var9++] = class322.method2241(var402, arg1 - 30757) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3624) {
                            var9--;
                            int var403 = class341.field5298[var9];
                            if (class327.field5009 != null && class220.field3483 > var403 && class327.field5009[var403].field2452.equalsIgnoreCase(class66.field1265.field4269)) {
                                class341.field5298[var9++] = 1;
                                continue;
                            }
                            class341.field5298[var9++] = 0;
                            continue;
                        }
                        if (var528 == 3625) {
                            if (class220.field3494 == null) {
                                class178.field2869[var6++] = "";
                            } else {
                                class178.field2869[var6++] = class69.method532(-103, class220.field3494);
                            }
                            continue;
                        }
                        if (var528 == 3626) {
                            var9--;
                            int var404 = class341.field5298[var9];
                            if (class343.field5335 != null && class220.field3483 > var404) {
                                class178.field2869[var6++] = class327.field5009[var404].field2454;
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 3627) {
                            var9--;
                            int var405 = class341.field5298[var9];
                            if (class294.field4490 == 2 && var405 >= 0 && class274.field4197 > var405) {
                                class341.field5298[var9++] = class95.field1707[var405] ? 1 : 0;
                                continue;
                            }
                            class341.field5298[var9++] = 0;
                            continue;
                        }
                        if (var528 == 3628) {
                            var6--;
                            String var406 = class178.field2869[var6];
                            if (var406.startsWith("<img=0>") || var406.startsWith("<img=1>")) {
                                var406 = var406.substring(7);
                            }
                            class341.field5298[var9++] = class218.method1451((byte) -95, var406);
                            continue;
                        }
                        if (var528 == 3629) {
                            class341.field5298[var9++] = class307.field4674;
                            continue;
                        }
                        if (var528 == 3630) {
                            var6--;
                            String var407 = class178.field2869[var6];
                            class191.method1226(class116.method767(-125, var407), true, (byte) -40);
                            continue;
                        }
                        if (var528 == 3631) {
                            var9--;
                            int var408 = class341.field5298[var9];
                            class341.field5298[var9++] = class131.field2221[var408] ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4000) {
                        if (var528 == 3903) {
                            var9--;
                            int var67 = class341.field5298[var9];
                            class341.field5298[var9++] = class260.field4049[var67].method1415(3);
                            continue;
                        }
                        if (var528 == 3904) {
                            var9--;
                            int var68 = class341.field5298[var9];
                            class341.field5298[var9++] = class260.field4049[var68].field3379;
                            continue;
                        }
                        if (var528 == 3905) {
                            var9--;
                            int var69 = class341.field5298[var9];
                            class341.field5298[var9++] = class260.field4049[var69].field3370;
                            continue;
                        }
                        if (var528 == 3906) {
                            var9--;
                            int var70 = class341.field5298[var9];
                            class341.field5298[var9++] = class260.field4049[var70].field3376;
                            continue;
                        }
                        if (var528 == 3907) {
                            var9--;
                            int var71 = class341.field5298[var9];
                            class341.field5298[var9++] = class260.field4049[var71].field3372;
                            continue;
                        }
                        if (var528 == 3908) {
                            var9--;
                            int var72 = class341.field5298[var9];
                            class341.field5298[var9++] = class260.field4049[var72].field3368;
                            continue;
                        }
                        if (var528 == 3910) {
                            var9--;
                            int var73 = class341.field5298[var9];
                            int var74 = class260.field4049[var73].method1416((byte) -86);
                            class341.field5298[var9++] = var74 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3911) {
                            var9--;
                            int var75 = class341.field5298[var9];
                            int var76 = class260.field4049[var75].method1416((byte) -105);
                            class341.field5298[var9++] = var76 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3912) {
                            var9--;
                            int var77 = class341.field5298[var9];
                            int var78 = class260.field4049[var77].method1416((byte) -104);
                            class341.field5298[var9++] = var78 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3913) {
                            var9--;
                            int var79 = class341.field5298[var9];
                            int var80 = class260.field4049[var79].method1416((byte) -106);
                            class341.field5298[var9++] = var80 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4100) {
                        if (var528 == 4000) {
                            var9 -= 2;
                            int var340 = class341.field5298[var9 + 1];
                            int var341 = class341.field5298[var9];
                            class341.field5298[var9++] = var340 + var341;
                            continue;
                        }
                        if (var528 == 4001) {
                            var9 -= 2;
                            int var342 = class341.field5298[var9 + 1];
                            int var343 = class341.field5298[var9];
                            class341.field5298[var9++] = var343 - var342;
                            continue;
                        }
                        if (var528 == 4002) {
                            var9 -= 2;
                            int var344 = class341.field5298[var9];
                            int var345 = class341.field5298[var9 + 1];
                            class341.field5298[var9++] = var344 * var345;
                            continue;
                        }
                        if (var528 == 4003) {
                            var9 -= 2;
                            int var346 = class341.field5298[var9 + 1];
                            int var347 = class341.field5298[var9];
                            class341.field5298[var9++] = var347 / var346;
                            continue;
                        }
                        if (var528 == 4004) {
                            var9--;
                            int var348 = class341.field5298[var9];
                            class341.field5298[var9++] = (int) ((double) var348 * Math.random());
                            continue;
                        }
                        if (var528 == 4005) {
                            var9--;
                            int var349 = class341.field5298[var9];
                            class341.field5298[var9++] = (int) (Math.random() * (double) (var349 + 1));
                            continue;
                        }
                        if (var528 == 4006) {
                            var9 -= 5;
                            int var350 = class341.field5298[var9];
                            int var351 = class341.field5298[var9 + 1];
                            int var352 = class341.field5298[var9 + 2];
                            int var353 = class341.field5298[var9 + 3];
                            int var354 = class341.field5298[var9 + 4];
                            class341.field5298[var9++] = (var351 - var350) * (var354 - var352) / (var353 - var352) + var350;
                            continue;
                        }
                        if (var528 == 4007) {
                            var9 -= 2;
                            long var355 = (long) class341.field5298[var9];
                            long var357 = (long) class341.field5298[var9 + 1];
                            class341.field5298[var9++] = (int) (var355 + (var355 * var357 / 100L));
                            continue;
                        }
                        if (var528 == 4008) {
                            var9 -= 2;
                            int var359 = class341.field5298[var9];
                            int var360 = class341.field5298[var9 + 1];
                            class341.field5298[var9++] = class212.method1434(0x1 << var360, var359);
                            continue;
                        }
                        if (var528 == 4009) {
                            var9 -= 2;
                            int var361 = class341.field5298[var9 + 1];
                            int var362 = class341.field5298[var9];
                            class341.field5298[var9++] = class61.method475(-(0x1 << var361) - 1, var362);
                            continue;
                        }
                        if (var528 == 4010) {
                            var9 -= 2;
                            int var363 = class341.field5298[var9 + 1];
                            int var364 = class341.field5298[var9];
                            class341.field5298[var9++] = class61.method475(0x1 << var363, var364) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var528 == 4011) {
                            var9 -= 2;
                            int var365 = class341.field5298[var9];
                            int var366 = class341.field5298[var9 + 1];
                            class341.field5298[var9++] = var365 % var366;
                            continue;
                        }
                        if (var528 == 4012) {
                            var9 -= 2;
                            int var367 = class341.field5298[var9];
                            int var368 = class341.field5298[var9 + 1];
                            if (var367 == 0) {
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = (int) Math.pow((double) var367, (double) var368);
                            }
                            continue;
                        }
                        if (var528 == 4013) {
                            var9 -= 2;
                            int var369 = class341.field5298[var9 + 1];
                            int var370 = class341.field5298[var9];
                            if (var370 == 0) {
                                class341.field5298[var9++] = 0;
                            } else if (var369 == 0) {
                                class341.field5298[var9++] = Integer.MAX_VALUE;
                            } else {
                                class341.field5298[var9++] = (int) Math.pow((double) var370, 1.0D / (double) var369);
                            }
                            continue;
                        }
                        if (var528 == 4014) {
                            var9 -= 2;
                            int var371 = class341.field5298[var9 + 1];
                            int var372 = class341.field5298[var9];
                            class341.field5298[var9++] = class61.method475(var372, var371);
                            continue;
                        }
                        if (var528 == 4015) {
                            var9 -= 2;
                            int var373 = class341.field5298[var9];
                            int var374 = class341.field5298[var9 + 1];
                            class341.field5298[var9++] = class212.method1434(var373, var374);
                            continue;
                        }
                        if (var528 == 4016) {
                            var9 -= 2;
                            int var375 = class341.field5298[var9 + 1];
                            int var376 = class341.field5298[var9];
                            class341.field5298[var9++] = var376 < var375 ? var376 : var375;
                            continue;
                        }
                        if (var528 == 4017) {
                            var9 -= 2;
                            int var377 = class341.field5298[var9];
                            int var378 = class341.field5298[var9 + 1];
                            class341.field5298[var9++] = var377 > var378 ? var377 : var378;
                            continue;
                        }
                        if (var528 == 4018) {
                            var9 -= 3;
                            long var379 = (long) class341.field5298[var9];
                            long var381 = (long) class341.field5298[var9 + 1];
                            long var383 = (long) class341.field5298[var9 + 2];
                            class341.field5298[var9++] = (int) (var379 * var383 / var381);
                            continue;
                        }
                    } else if (var528 < 4200) {
                        if (var528 == 4100) {
                            var6--;
                            String var81 = class178.field2869[var6];
                            var9--;
                            int var82 = class341.field5298[var9];
                            class178.field2869[var6++] = var81 + var82;
                            continue;
                        }
                        if (var528 == 4101) {
                            var6 -= 2;
                            String var83 = class178.field2869[var6];
                            String var84 = class178.field2869[var6 + 1];
                            class178.field2869[var6++] = var83 + var84;
                            continue;
                        }
                        if (var528 == 4102) {
                            var9--;
                            int var85 = class341.field5298[var9];
                            var6--;
                            String var86 = class178.field2869[var6];
                            class178.field2869[var6++] = var86 + class335.method2315(var85, (byte) 74, true);
                            continue;
                        }
                        if (var528 == 4103) {
                            var6--;
                            String var87 = class178.field2869[var6];
                            class178.field2869[var6++] = var87.toLowerCase();
                            continue;
                        }
                        if (var528 == 4104) {
                            var9--;
                            int var88 = class341.field5298[var9];
                            long var89 = ((long) var88 + 11745L) * 86400000L;
                            class327.field5001.setTime(new Date(var89));
                            int var91 = class327.field5001.get(5);
                            int var92 = class327.field5001.get(2);
                            int var93 = class327.field5001.get(1);
                            class178.field2869[var6++] = var91 + "-" + class186.field3027[var92] + "-" + var93;
                            continue;
                        }
                        if (var528 == 4105) {
                            var6 -= 2;
                            String var94 = class178.field2869[var6];
                            String var95 = class178.field2869[var6 + 1];
                            if (class66.field1265.field4281 != null && class66.field1265.field4281.field3612) {
                                class178.field2869[var6++] = var95;
                                continue;
                            }
                            class178.field2869[var6++] = var94;
                            continue;
                        }
                        if (var528 == 4106) {
                            var9--;
                            int var96 = class341.field5298[var9];
                            class178.field2869[var6++] = Integer.toString(var96);
                            continue;
                        }
                        if (var528 == 4107) {
                            var6 -= 2;
                            class341.field5298[var9++] = class241.method1593(126, class303.method2010(class321.field4894, class178.field2869[var6 + 1], class178.field2869[var6], arg1 - 30));
                            continue;
                        }
                        if (var528 == 4108) {
                            var9 -= 2;
                            var6--;
                            String var97 = class178.field2869[var6];
                            int var98 = class341.field5298[var9 + 1];
                            int var99 = class341.field5298[var9];
                            class341.field5298[var9++] = method650(113, var98).method2115(var97, var99);
                            continue;
                        }
                        if (var528 == 4109) {
                            var9 -= 2;
                            var6--;
                            String var100 = class178.field2869[var6];
                            int var101 = class341.field5298[var9 + 1];
                            int var102 = class341.field5298[var9];
                            class341.field5298[var9++] = method650(113, var101).method2129(var100, var102);
                            continue;
                        }
                        if (var528 == 4110) {
                            var6 -= 2;
                            String var103 = class178.field2869[var6];
                            String var104 = class178.field2869[var6 + 1];
                            var9--;
                            if (class341.field5298[var9] == 1) {
                                class178.field2869[var6++] = var103;
                            } else {
                                class178.field2869[var6++] = var104;
                            }
                            continue;
                        }
                        if (var528 == 4111) {
                            var6--;
                            String var105 = class178.field2869[var6];
                            class178.field2869[var6++] = class312.method2119(var105);
                            continue;
                        }
                        if (var528 == 4112) {
                            var6--;
                            String var106 = class178.field2869[var6];
                            var9--;
                            int var107 = class341.field5298[var9];
                            if (var107 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class178.field2869[var6++] = var106 + (char) var107;
                            continue;
                        }
                        if (var528 == 4113) {
                            var9--;
                            int var108 = class341.field5298[var9];
                            class341.field5298[var9++] = class336.method2317(4659, (char) var108) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4114) {
                            var9--;
                            int var109 = class341.field5298[var9];
                            class341.field5298[var9++] = class298.method1988((char) var109, false) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4115) {
                            var9--;
                            int var110 = class341.field5298[var9];
                            class341.field5298[var9++] = class305.method2021((char) var110, (byte) -115) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4116) {
                            var9--;
                            int var111 = class341.field5298[var9];
                            class341.field5298[var9++] = class100.method660((char) var111, 57) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4117) {
                            var6--;
                            String var112 = class178.field2869[var6];
                            if (var112 == null) {
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var112.length();
                            }
                            continue;
                        }
                        if (var528 == 4118) {
                            var9 -= 2;
                            var6--;
                            String var113 = class178.field2869[var6];
                            int var114 = class341.field5298[var9];
                            int var115 = class341.field5298[var9 + 1];
                            class178.field2869[var6++] = var113.substring(var114, var115);
                            continue;
                        }
                        if (var528 == 4119) {
                            var6--;
                            String var116 = class178.field2869[var6];
                            StringBuffer var117 = new StringBuffer(var116.length());
                            boolean var118 = false;
                            for (int var119 = 0; var116.length() > var119; var119++) {
                                char var120 = var116.charAt(var119);
                                if (var120 == '<') {
                                    var118 = true;
                                } else if (var120 == '>') {
                                    var118 = false;
                                } else if (!var118) {
                                    var117.append(var120);
                                }
                            }
                            class178.field2869[var6++] = var117.toString();
                            continue;
                        }
                        if (var528 == 4120) {
                            var6--;
                            String var121 = class178.field2869[var6];
                            var9 -= 2;
                            int var122 = class341.field5298[var9 + 1];
                            int var123 = class341.field5298[var9];
                            class341.field5298[var9++] = var121.indexOf(var123, var122);
                            continue;
                        }
                        if (var528 == 4121) {
                            var9--;
                            int var124 = class341.field5298[var9];
                            var6 -= 2;
                            String var125 = class178.field2869[var6];
                            String var126 = class178.field2869[var6 + 1];
                            class341.field5298[var9++] = var125.indexOf(var126, var124);
                            continue;
                        }
                        if (var528 == 4122) {
                            var9--;
                            int var127 = class341.field5298[var9];
                            class341.field5298[var9++] = Character.toLowerCase((char) var127);
                            continue;
                        }
                        if (var528 == 4123) {
                            var9--;
                            int var128 = class341.field5298[var9];
                            class341.field5298[var9++] = Character.toUpperCase((char) var128);
                            continue;
                        }
                        if (var528 == 4124) {
                            var9--;
                            boolean var129 = class341.field5298[var9] != 0;
                            var9--;
                            int var130 = class341.field5298[var9];
                            class178.field2869[var6++] = class240.method1591(class321.field4894, var129, 0, -88, (long) var130);
                            continue;
                        }
                    } else if (var528 < 4300) {
                        if (var528 == 4200) {
                            var9--;
                            int var321 = class341.field5298[var9];
                            class178.field2869[var6++] = class95.method636(22111, var321).field5227;
                            continue;
                        }
                        if (var528 == 4201) {
                            var9 -= 2;
                            int var322 = class341.field5298[var9];
                            int var323 = class341.field5298[var9 + 1];
                            class337 var324 = class95.method636(arg1 ^ 0xFFFFA99C, var322);
                            if (var323 >= 1 && var323 <= 5 && var324.field5221[var323 - 1] != null) {
                                class178.field2869[var6++] = var324.field5221[var323 - 1];
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 4202) {
                            var9 -= 2;
                            int var325 = class341.field5298[var9];
                            int var326 = class341.field5298[var9 + 1];
                            class337 var327 = class95.method636(arg1 ^ 0xFFFFA99C, var325);
                            if (var326 >= 1 && var326 <= 5 && var327.field5199[var326 - 1] != null) {
                                class178.field2869[var6++] = var327.field5199[var326 - 1];
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 4203) {
                            var9--;
                            int var328 = class341.field5298[var9];
                            class341.field5298[var9++] = class95.method636(22111, var328).field5191;
                            continue;
                        }
                        if (var528 == 4204) {
                            var9--;
                            int var329 = class341.field5298[var9];
                            class341.field5298[var9++] = class95.method636(22111, var329).field5200 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4205) {
                            var9--;
                            int var330 = class341.field5298[var9];
                            class337 var331 = class95.method636(22111, var330);
                            if (var331.field5226 == -1 && var331.field5201 >= 0) {
                                class341.field5298[var9++] = var331.field5201;
                                continue;
                            }
                            class341.field5298[var9++] = var330;
                            continue;
                        }
                        if (var528 == 4206) {
                            var9--;
                            int var332 = class341.field5298[var9];
                            class337 var333 = class95.method636(22111, var332);
                            if (var333.field5226 >= 0 && var333.field5201 >= 0) {
                                class341.field5298[var9++] = var333.field5201;
                                continue;
                            }
                            class341.field5298[var9++] = var332;
                            continue;
                        }
                        if (var528 == 4207) {
                            var9--;
                            int var334 = class341.field5298[var9];
                            class341.field5298[var9++] = class95.method636(22111, var334).field5178 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4208) {
                            var9 -= 2;
                            int var335 = class341.field5298[var9];
                            int var336 = class341.field5298[var9 + 1];
                            class74 var337 = class121.method784(11, var336);
                            if (var337.method559((byte) -34)) {
                                class178.field2869[var6++] = class95.method636(22111, var335).method2333(100, var336, var337.field1517);
                            } else {
                                class341.field5298[var9++] = class95.method636(22111, var335).method2332(var336, (byte) -55, var337.field1515);
                            }
                            continue;
                        }
                        if (var528 == 4210) {
                            var6--;
                            String var338 = class178.field2869[var6];
                            var9--;
                            int var339 = class341.field5298[var9];
                            class135.method887((byte) 110, var339 == 1, var338);
                            class341.field5298[var9++] = class201.field3214;
                            continue;
                        }
                        if (var528 == 4211) {
                            if (class220.field3487 != null && class189.field3076 < class201.field3214) {
                                class341.field5298[var9++] = class61.method475(65535, class220.field3487[class189.field3076++]);
                                continue;
                            }
                            class341.field5298[var9++] = -1;
                            continue;
                        }
                        if (var528 == 4212) {
                            class189.field3076 = 0;
                            continue;
                        }
                    } else if (var528 < 4400) {
                        if (var528 == 4300) {
                            var9 -= 2;
                            int var131 = class341.field5298[var9 + 1];
                            int var132 = class341.field5298[var9];
                            class74 var133 = class121.method784(11, var131);
                            if (var133.method559((byte) -34)) {
                                class178.field2869[var6++] = class19.method130(var132, -5881).method335(var133.field1517, -94, var131);
                            } else {
                                class341.field5298[var9++] = class19.method130(var132, -5881).method339(var133.field1515, var131, arg1 + 183);
                            }
                            continue;
                        }
                    } else if (var528 < 4500) {
                        if (var528 == 4400) {
                            var9 -= 2;
                            int var134 = class341.field5298[var9];
                            int var135 = class341.field5298[var9 + 1];
                            class74 var136 = class121.method784(arg1 + 72, var135);
                            if (var136.method559((byte) -34)) {
                                class178.field2869[var6++] = class277.method1864(var134, 0).method256(var136.field1517, var135, 28);
                            } else {
                                class341.field5298[var9++] = class277.method1864(var134, class331.method2296(arg1, -61)).method253((byte) -78, var135, var136.field1515);
                            }
                            continue;
                        }
                    } else if (var528 < 4600) {
                        if (var528 == 4500) {
                            var9 -= 2;
                            int var137 = class341.field5298[var9 + 1];
                            int var138 = class341.field5298[var9];
                            class74 var139 = class121.method784(11, var137);
                            if (var139.method559((byte) -34)) {
                                class178.field2869[var6++] = class90.method622((byte) -127, var138).method1502(var137, -123, var139.field1517);
                            } else {
                                class341.field5298[var9++] = class90.method622((byte) -45, var138).method1504(var137, var139.field1515, (byte) -11);
                            }
                            continue;
                        }
                    } else if (var528 < 5100) {
                        if (var528 == 5000) {
                            class341.field5298[var9++] = class260.field4066;
                            continue;
                        }
                        if (var528 == 5001) {
                            var9 -= 3;
                            class260.field4066 = class341.field5298[var9];
                            class112.field1980++;
                            class276.field4229 = class341.field5298[var9 + 1];
                            class11.field225 = class341.field5298[var9 + 2];
                            class14.field263.method80(175, (byte) 118);
                            class14.field263.method1311(class260.field4066, arg1 + 11025);
                            class14.field263.method1311(class276.field4229, 10964);
                            class14.field263.method1311(class11.field225, 10964);
                            continue;
                        }
                        if (var528 == 5002) {
                            var9 -= 2;
                            class216.field3452++;
                            var6--;
                            String var140 = class178.field2869[var6];
                            int var141 = class341.field5298[var9];
                            int var142 = class341.field5298[var9 + 1];
                            class14.field263.method80(71, (byte) 108);
                            class14.field263.method1353((byte) -105, class116.method767(-125, var140));
                            class14.field263.method1311(var141 - 1, arg1 ^ 0xFFFFD517);
                            class14.field263.method1311(var142, arg1 + 11025);
                            continue;
                        }
                        if (var528 == 5003) {
                            var9--;
                            int var143 = class341.field5298[var9];
                            String var144 = null;
                            if (var143 < 100) {
                                var144 = class39.field769[var143];
                            }
                            if (var144 == null) {
                                var144 = "";
                            }
                            class178.field2869[var6++] = var144;
                            continue;
                        }
                        if (var528 == 5004) {
                            var9--;
                            int var145 = class341.field5298[var9];
                            int var146 = -1;
                            if (var145 < 100 && class39.field769[var145] != null) {
                                var146 = class42.field811[var145];
                            }
                            class341.field5298[var9++] = var146;
                            continue;
                        }
                        if (var528 == 5005) {
                            class341.field5298[var9++] = class276.field4229;
                            continue;
                        }
                        if (var528 == 5008) {
                            var6--;
                            String var147 = class178.field2869[var6];
                            if (var147.startsWith("::")) {
                                class244.method1618(var147, -119);
                                continue;
                            }
                            if (class29.field545 == 0 && (class294.field4494 && !class211.field3400 || class188.field3047)) {
                                continue;
                            }
                            class114.field2028++;
                            String var148 = var147.toLowerCase();
                            byte var149 = 0;
                            byte var150 = 0;
                            if (var148.startsWith(class245.field3806)) {
                                var147 = var147.substring(class245.field3806.length());
                                var150 = 0;
                            } else if (var148.startsWith(class239.field3745)) {
                                var147 = var147.substring(class239.field3745.length());
                                var150 = 1;
                            } else if (var148.startsWith(client.field906)) {
                                var150 = 2;
                                var147 = var147.substring(client.field906.length());
                            } else if (var148.startsWith(class335.field5145)) {
                                var150 = 3;
                                var147 = var147.substring(class335.field5145.length());
                            } else if (var148.startsWith(class239.field3749)) {
                                var147 = var147.substring(class239.field3749.length());
                                var150 = 4;
                            } else if (var148.startsWith(class264.field4101)) {
                                var147 = var147.substring(class264.field4101.length());
                                var150 = 5;
                            } else if (var148.startsWith(class26.field512)) {
                                var147 = var147.substring(class26.field512.length());
                                var150 = 6;
                            } else if (var148.startsWith(class264.field4097)) {
                                var147 = var147.substring(class264.field4097.length());
                                var150 = 7;
                            } else if (var148.startsWith(class281.field4325)) {
                                var150 = 8;
                                var147 = var147.substring(class281.field4325.length());
                            } else if (var148.startsWith(class293.field4481)) {
                                var147 = var147.substring(class293.field4481.length());
                                var150 = 9;
                            } else if (var148.startsWith(class211.field3394)) {
                                var150 = 10;
                                var147 = var147.substring(class211.field3394.length());
                            } else if (var148.startsWith(class101.field1761)) {
                                var150 = 11;
                                var147 = var147.substring(class101.field1761.length());
                            } else if (class321.field4894 != 0) {
                                if (var148.startsWith(class123.field2127)) {
                                    var150 = 0;
                                    var147 = var147.substring(class123.field2127.length());
                                } else if (var148.startsWith(class104.field1798)) {
                                    var150 = 1;
                                    var147 = var147.substring(class104.field1798.length());
                                } else if (var148.startsWith(class210.field3385)) {
                                    var147 = var147.substring(class210.field3385.length());
                                    var150 = 2;
                                } else if (var148.startsWith(class24.field479)) {
                                    var147 = var147.substring(class24.field479.length());
                                    var150 = 3;
                                } else if (var148.startsWith(class42.field807)) {
                                    var147 = var147.substring(class42.field807.length());
                                    var150 = 4;
                                } else if (var148.startsWith(class46.field958)) {
                                    var150 = 5;
                                    var147 = var147.substring(class46.field958.length());
                                } else if (var148.startsWith(class125.field2165)) {
                                    var150 = 6;
                                    var147 = var147.substring(class125.field2165.length());
                                } else if (var148.startsWith(client.field911)) {
                                    var147 = var147.substring(client.field911.length());
                                    var150 = 7;
                                } else if (var148.startsWith(class179.field2878)) {
                                    var150 = 8;
                                    var147 = var147.substring(class179.field2878.length());
                                } else if (var148.startsWith(class41.field792)) {
                                    var150 = 9;
                                    var147 = var147.substring(class41.field792.length());
                                } else if (var148.startsWith(class155.field2527)) {
                                    var147 = var147.substring(class155.field2527.length());
                                    var150 = 10;
                                } else if (var148.startsWith(class240.field3757)) {
                                    var150 = 11;
                                    var147 = var147.substring(class240.field3757.length());
                                }
                            }
                            String var151 = var147.toLowerCase();
                            if (var151.startsWith(class306.field4626)) {
                                var147 = var147.substring(class306.field4626.length());
                                var149 = 1;
                            } else if (var151.startsWith(class138.field2299)) {
                                var149 = 2;
                                var147 = var147.substring(class138.field2299.length());
                            } else if (var151.startsWith(class179.field2872)) {
                                var149 = 3;
                                var147 = var147.substring(class179.field2872.length());
                            } else if (var151.startsWith(class142.field2354)) {
                                var149 = 4;
                                var147 = var147.substring(class142.field2354.length());
                            } else if (var151.startsWith(class74.field1521)) {
                                var149 = 5;
                                var147 = var147.substring(class74.field1521.length());
                            } else if (class321.field4894 != 0) {
                                if (var151.startsWith(class67.field1273)) {
                                    var149 = 1;
                                    var147 = var147.substring(class67.field1273.length());
                                } else if (var151.startsWith(class268.field4122)) {
                                    var147 = var147.substring(class268.field4122.length());
                                    var149 = 2;
                                } else if (var151.startsWith(class183.field2929)) {
                                    var149 = 3;
                                    var147 = var147.substring(class183.field2929.length());
                                } else if (var151.startsWith(class319.field4867)) {
                                    var149 = 4;
                                    var147 = var147.substring(class319.field4867.length());
                                } else if (var151.startsWith(class277.field4253)) {
                                    var149 = 5;
                                    var147 = var147.substring(class277.field4253.length());
                                }
                            }
                            class14.field263.method80(88, (byte) 109);
                            class14.field263.method1311(0, arg1 ^ 0xFFFFD517);
                            int var152 = class14.field263.field3249;
                            class14.field263.method1311(var150, 10964);
                            class14.field263.method1311(var149, 10964);
                            class214.method1440(-29, var147, class14.field263);
                            class14.field263.method1318(class14.field263.field3249 - var152, (byte) -19);
                            continue;
                        }
                        if (var528 == 5009) {
                            var6 -= 2;
                            String var153 = class178.field2869[var6 + 1];
                            String var154 = class178.field2869[var6];
                            if (class29.field545 != 0 || (!class294.field4494 || class211.field3400) && !class188.field3047) {
                                class14.field263.method80(129, (byte) 120);
                                class223.field3519++;
                                class14.field263.method1311(0, arg1 ^ 0xFFFFD517);
                                int var155 = class14.field263.field3249;
                                class14.field263.method1353((byte) -105, class116.method767(arg1 - 64, var154));
                                class214.method1440(arg1 ^ 0xFFFFFFB6, var153, class14.field263);
                                class14.field263.method1318(class14.field263.field3249 - var155, (byte) -19);
                            }
                            continue;
                        }
                        if (var528 == 5010) {
                            var9--;
                            int var156 = class341.field5298[var9];
                            String var157 = null;
                            if (var156 < 100) {
                                var157 = client.field910[var156];
                            }
                            if (var157 == null) {
                                var157 = "";
                            }
                            class178.field2869[var6++] = var157;
                            continue;
                        }
                        if (var528 == 5011) {
                            var9--;
                            int var158 = class341.field5298[var9];
                            String var159 = null;
                            if (var158 < 100) {
                                var159 = class187.field3039[var158];
                            }
                            if (var159 == null) {
                                var159 = "";
                            }
                            class178.field2869[var6++] = var159;
                            continue;
                        }
                        if (var528 == 5012) {
                            var9--;
                            int var160 = class341.field5298[var9];
                            int var161 = -1;
                            if (var160 < 100) {
                                var161 = class67.field1278[var160];
                            }
                            class341.field5298[var9++] = var161;
                            continue;
                        }
                        if (var528 == 5015) {
                            String var162;
                            if (class66.field1265 == null || class66.field1265.field4269 == null) {
                                var162 = class120.field2082;
                            } else {
                                var162 = class66.field1265.method1871(arg1 ^ 0x6B);
                            }
                            class178.field2869[var6++] = var162;
                            continue;
                        }
                        if (var528 == 5016) {
                            class341.field5298[var9++] = class11.field225;
                            continue;
                        }
                        if (var528 == 5017) {
                            class341.field5298[var9++] = class85.field1610;
                            continue;
                        }
                        if (var528 == 5050) {
                            var9--;
                            int var163 = class341.field5298[var9];
                            class178.field2869[var6++] = class274.method1839(-73, var163).field2808;
                            continue;
                        }
                        if (var528 == 5051) {
                            var9--;
                            int var164 = class341.field5298[var9];
                            class175 var165 = class274.method1839(arg1 ^ 0x58, var164);
                            if (var165.field2820 == null) {
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var165.field2820.length;
                            }
                            continue;
                        }
                        if (var528 == 5052) {
                            var9 -= 2;
                            int var166 = class341.field5298[var9];
                            int var167 = class341.field5298[var9 + 1];
                            class175 var168 = class274.method1839(-98, var166);
                            int var169 = var168.field2820[var167];
                            class341.field5298[var9++] = var169;
                            continue;
                        }
                        if (var528 == 5053) {
                            var9--;
                            int var170 = class341.field5298[var9];
                            class175 var171 = class274.method1839(-49, var170);
                            if (var171.field2810 == null) {
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var171.field2810.length;
                            }
                            continue;
                        }
                        if (var528 == 5054) {
                            var9 -= 2;
                            int var172 = class341.field5298[var9 + 1];
                            int var173 = class341.field5298[var9];
                            class341.field5298[var9++] = class274.method1839(class331.method2296(arg1, 64), var173).field2810[var172];
                            continue;
                        }
                        if (var528 == 5055) {
                            var9--;
                            int var174 = class341.field5298[var9];
                            class178.field2869[var6++] = class169.method1079(var174, (byte) 46).method1538((byte) -71);
                            continue;
                        }
                        if (var528 == 5056) {
                            var9--;
                            int var175 = class341.field5298[var9];
                            class233 var176 = class169.method1079(var175, (byte) -115);
                            if (var176.field3655 == null) {
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var176.field3655.length;
                            }
                            continue;
                        }
                        if (var528 == 5057) {
                            var9 -= 2;
                            int var177 = class341.field5298[var9 + 1];
                            int var178 = class341.field5298[var9];
                            class341.field5298[var9++] = class169.method1079(var178, (byte) -76).field3655[var177];
                            continue;
                        }
                        if (var528 == 5058) {
                            class165.field2674 = new class228();
                            var9--;
                            class165.field2674.field3596 = class341.field5298[var9];
                            class165.field2674.field3609 = class169.method1079(class165.field2674.field3596, (byte) 100);
                            class165.field2674.field3600 = new int[class165.field2674.field3609.method1539(80)];
                            continue;
                        }
                        if (var528 == 5059) {
                            class132.field2235++;
                            class14.field263.method80(79, (byte) 101);
                            class14.field263.method1311(0, 10964);
                            int var179 = class14.field263.field3249;
                            class14.field263.method1311(0, arg1 ^ 0xFFFFD517);
                            class14.field263.method1313(class165.field2674.field3596, -376480);
                            class165.field2674.field3609.method1549(class165.field2674.field3600, 80, class14.field263);
                            class14.field263.method1318(class14.field263.field3249 - var179, (byte) -19);
                            continue;
                        }
                        if (var528 == 5060) {
                            class341.field5299++;
                            var6--;
                            String var180 = class178.field2869[var6];
                            class14.field263.method80(113, (byte) 122);
                            class14.field263.method1311(0, 10964);
                            int var181 = class14.field263.field3249;
                            class14.field263.method1353((byte) -105, class116.method767(arg1 ^ 0x41, var180));
                            class14.field263.method1313(class165.field2674.field3596, -376480);
                            class165.field2674.field3609.method1549(class165.field2674.field3600, 80, class14.field263);
                            class14.field263.method1318(class14.field263.field3249 - var181, (byte) -19);
                            continue;
                        }
                        if (var528 == 5061) {
                            class14.field263.method80(79, (byte) 103);
                            class14.field263.method1311(0, 10964);
                            class132.field2235++;
                            int var182 = class14.field263.field3249;
                            class14.field263.method1311(1, arg1 + 11025);
                            class14.field263.method1313(class165.field2674.field3596, -376480);
                            class165.field2674.field3609.method1549(class165.field2674.field3600, 80, class14.field263);
                            class14.field263.method1318(class14.field263.field3249 - var182, (byte) -19);
                            continue;
                        }
                        if (var528 == 5062) {
                            var9 -= 2;
                            int var183 = class341.field5298[var9];
                            int var184 = class341.field5298[var9 + 1];
                            class341.field5298[var9++] = class274.method1839(-50, var183).field2809[var184];
                            continue;
                        }
                        if (var528 == 5063) {
                            var9 -= 2;
                            int var185 = class341.field5298[var9 + 1];
                            int var186 = class341.field5298[var9];
                            class341.field5298[var9++] = class274.method1839(-84, var186).field2817[var185];
                            continue;
                        }
                        if (var528 == 5064) {
                            var9 -= 2;
                            int var187 = class341.field5298[var9];
                            int var188 = class341.field5298[var9 + 1];
                            if (var188 == -1) {
                                class341.field5298[var9++] = -1;
                            } else {
                                class341.field5298[var9++] = class274.method1839(arg1 - 1, var187).method1104((char) var188, (byte) 127);
                            }
                            continue;
                        }
                        if (var528 == 5065) {
                            var9 -= 2;
                            int var189 = class341.field5298[var9];
                            int var190 = class341.field5298[var9 + 1];
                            if (var190 == -1) {
                                class341.field5298[var9++] = -1;
                            } else {
                                class341.field5298[var9++] = class274.method1839(-45, var189).method1101(false, (char) var190);
                            }
                            continue;
                        }
                        if (var528 == 5066) {
                            var9--;
                            int var191 = class341.field5298[var9];
                            class341.field5298[var9++] = class169.method1079(var191, (byte) 106).method1539(class331.method2296(arg1, -109));
                            continue;
                        }
                        if (var528 == 5067) {
                            var9 -= 2;
                            int var192 = class341.field5298[var9 + 1];
                            int var193 = class341.field5298[var9];
                            int var194 = class169.method1079(var193, (byte) -114).method1544((byte) 104, var192);
                            class341.field5298[var9++] = var194;
                            continue;
                        }
                        if (var528 == 5068) {
                            var9 -= 2;
                            int var195 = class341.field5298[var9];
                            int var196 = class341.field5298[var9 + 1];
                            class165.field2674.field3600[var195] = var196;
                            continue;
                        }
                        if (var528 == 5069) {
                            var9 -= 2;
                            int var197 = class341.field5298[var9 + 1];
                            int var198 = class341.field5298[var9];
                            class165.field2674.field3600[var198] = var197;
                            continue;
                        }
                        if (var528 == 5070) {
                            var9 -= 3;
                            int var199 = class341.field5298[var9 + 1];
                            int var200 = class341.field5298[var9 + 2];
                            int var201 = class341.field5298[var9];
                            class233 var202 = class169.method1079(var201, (byte) -37);
                            if (var202.method1544((byte) 104, var199) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class341.field5298[var9++] = var202.method1542(var199, -1, var200);
                            continue;
                        }
                        if (var528 == 5071) {
                            var6--;
                            String var203 = class178.field2869[var6];
                            var9--;
                            boolean var204 = class341.field5298[var9] == 1;
                            class341.method2363((byte) -128, var204, var203);
                            class341.field5298[var9++] = class201.field3214;
                            continue;
                        }
                        if (var528 == 5072) {
                            if (class220.field3487 != null && class189.field3076 < class201.field3214) {
                                class341.field5298[var9++] = class61.method475(65535, class220.field3487[class189.field3076++]);
                                continue;
                            }
                            class341.field5298[var9++] = -1;
                            continue;
                        }
                        if (var528 == 5073) {
                            class189.field3076 = 0;
                            continue;
                        }
                    } else if (var528 < 5200) {
                        if (var528 == 5100) {
                            if (class342.field5317[86]) {
                                class341.field5298[var9++] = 1;
                            } else {
                                class341.field5298[var9++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 5101) {
                            if (class342.field5317[82]) {
                                class341.field5298[var9++] = 1;
                            } else {
                                class341.field5298[var9++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 5102) {
                            if (class342.field5317[81]) {
                                class341.field5298[var9++] = 1;
                            } else {
                                class341.field5298[var9++] = 0;
                            }
                            continue;
                        }
                    } else if (var528 < 5300) {
                        if (var528 == 5200) {
                            var9--;
                            class268.method1775(class341.field5298[var9], false);
                            continue;
                        }
                        if (var528 == 5201) {
                            class341.field5298[var9++] = class93.method628(-109);
                            continue;
                        }
                        if (var528 == 5202) {
                            var9--;
                            class259.method1735(class341.field5298[var9], 30412);
                            continue;
                        }
                        if (var528 == 5203) {
                            var6--;
                            class230.method1524(false, class178.field2869[var6]);
                            continue;
                        }
                        if (var528 == 5204) {
                            class178.field2869[var6 - 1] = class28.method230(false, class178.field2869[var6 - 1]);
                            continue;
                        }
                        if (var528 == 5205) {
                            var9--;
                            class95.method635(false, -1, -1, class341.field5298[var9]);
                            continue;
                        }
                        if (var528 == 5206) {
                            var9--;
                            int var205 = class341.field5298[var9];
                            class328 var206 = class44.method333(var205 >> 14 & 0x3FFF, (byte) -57, var205 & 0x3FFF);
                            if (var206 == null) {
                                class341.field5298[var9++] = -1;
                            } else {
                                class341.field5298[var9++] = var206.field5017;
                            }
                            continue;
                        }
                        if (var528 == 5207) {
                            var9--;
                            class328 var207 = class19.method129((byte) -128, class341.field5298[var9]);
                            if (var207 != null && var207.field5022 != null) {
                                class178.field2869[var6++] = var207.field5022;
                                continue;
                            }
                            class178.field2869[var6++] = "";
                            continue;
                        }
                        if (var528 == 5208) {
                            class341.field5298[var9++] = field1752;
                            class341.field5298[var9++] = class202.field3258;
                            continue;
                        }
                        if (var528 == 5209) {
                            class341.field5298[var9++] = class318.field4808 + class38.field734;
                            class341.field5298[var9++] = class17.field322 + class9.field199 - class250.field3923 - 1;
                            continue;
                        }
                        if (var528 == 5210) {
                            var9--;
                            int var208 = class341.field5298[var9];
                            class328 var209 = class19.method129((byte) -128, var208);
                            if (var209 == null) {
                                class341.field5298[var9++] = 0;
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = class61.method475(268435339, var209.field5018) >> 14;
                                class341.field5298[var9++] = class61.method475(var209.field5018, 16383);
                            }
                            continue;
                        }
                        if (var528 == 5211) {
                            var9--;
                            int var210 = class341.field5298[var9];
                            class328 var211 = class19.method129((byte) -128, var210);
                            if (var211 == null) {
                                class341.field5298[var9++] = 0;
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var211.field5014 - var211.field5023;
                                class341.field5298[var9++] = var211.field5024 - var211.field5026;
                            }
                            continue;
                        }
                        if (var528 == 5212) {
                            int var212 = class185.method1181(0);
                            int var213 = 0;
                            String var214;
                            if (var212 == -1) {
                                var214 = "";
                            } else {
                                var214 = class222.field3517.field3673[var212];
                                var213 = class222.field3517.method1556(arg1 + 107, var212);
                            }
                            String var215 = class208.method1407(var214, "<br>", " ", -89);
                            class178.field2869[var6++] = var215;
                            class341.field5298[var9++] = var213;
                            continue;
                        }
                        if (var528 == 5213) {
                            int var216 = class171.method1085(-1);
                            int var217 = 0;
                            String var218;
                            if (var216 == -1) {
                                var218 = "";
                            } else {
                                var218 = class222.field3517.field3673[var216];
                                var217 = class222.field3517.method1556(60, var216);
                            }
                            String var219 = class208.method1407(var218, "<br>", " ", 38);
                            class178.field2869[var6++] = var219;
                            class341.field5298[var9++] = var217;
                            continue;
                        }
                        if (var528 == 5214) {
                            var9--;
                            int var220 = class341.field5298[var9];
                            class328 var221 = class194.method1242(false);
                            if (var221 != null) {
                                int[] var222 = var221.method2274(var220 & 0x3FFF, (var220 & 0x3425E58B) >> 28, (var220 & 0xFFFEF9A) >> 14, true);
                                if (var222 != null) {
                                    class256.method1714(-18606, var222[1], var222[2]);
                                }
                            }
                            continue;
                        }
                        if (var528 == 5215) {
                            var9 -= 2;
                            int var223 = class341.field5298[var9 + 1];
                            int var224 = class341.field5298[var9];
                            boolean var225 = false;
                            class79 var226 = class42.method319((var224 & 0xFFFF927) >> 14, -121, var224 & 0x3FFF);
                            for (class328 var227 = (class328) var226.method576((byte) -126); var227 != null; var227 = (class328) var226.method579(0)) {
                                if (var227.field5017 == var223) {
                                    var225 = true;
                                    break;
                                }
                            }
                            if (var225) {
                                class341.field5298[var9++] = 1;
                            } else {
                                class341.field5298[var9++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 5216) {
                            var9--;
                            int var228 = class341.field5298[var9];
                            class140.method912(var228, (byte) -34);
                            continue;
                        }
                        if (var528 == 5217) {
                            var9--;
                            int var229 = class341.field5298[var9];
                            if (class334.method2302(var229, (byte) 119)) {
                                class341.field5298[var9++] = 1;
                            } else {
                                class341.field5298[var9++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 5218) {
                            var9--;
                            int var230 = class341.field5298[var9];
                            class328 var231 = class19.method129((byte) -128, var230);
                            if (var231 == null) {
                                class341.field5298[var9++] = -1;
                            } else {
                                class341.field5298[var9++] = var231.field5013;
                            }
                            continue;
                        }
                        if (var528 == 5219) {
                            var6--;
                            class305.method2023(class178.field2869[var6], 108);
                            continue;
                        }
                        if (var528 == 5220) {
                            class341.field5298[var9++] = class196.field3152 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 5221) {
                            var9--;
                            int var232 = class341.field5298[var9];
                            class256.method1714(arg1 - 18545, (var232 & 0xFFFF2B2) >> 14, var232 & 0x3FFF);
                            continue;
                        }
                        if (var528 == 5222) {
                            class328 var233 = class194.method1242(false);
                            if (var233 == null) {
                                class341.field5298[var9++] = -1;
                                class341.field5298[var9++] = -1;
                            } else {
                                int[] var234 = var233.method2275(class38.field734 + class318.field4808, -class250.field3923 + class17.field322 + class9.field199 + -1, -110);
                                if (var234 == null) {
                                    class341.field5298[var9++] = -1;
                                    class341.field5298[var9++] = -1;
                                } else {
                                    class341.field5298[var9++] = var234[1];
                                    class341.field5298[var9++] = var234[2];
                                }
                            }
                            continue;
                        }
                        if (var528 == 5223) {
                            var9 -= 2;
                            int var235 = class341.field5298[var9];
                            int var236 = class341.field5298[var9 + 1];
                            class95.method635(false, var236 >> 14 & 0x3FFF, var236 & 0x3FFF, var235);
                            continue;
                        }
                        if (var528 == 5224) {
                            var9--;
                            int var237 = class341.field5298[var9];
                            class328 var238 = class194.method1242(false);
                            if (var238 == null) {
                                class341.field5298[var9++] = -1;
                                class341.field5298[var9++] = -1;
                            } else {
                                int[] var239 = var238.method2274(var237 & 0x3FFF, var237 >> 28 & 0x3, (var237 & 0xFFFF9C8) >> 14, true);
                                if (var239 == null) {
                                    class341.field5298[var9++] = -1;
                                    class341.field5298[var9++] = -1;
                                } else {
                                    class341.field5298[var9++] = var239[1];
                                    class341.field5298[var9++] = var239[2];
                                }
                            }
                            continue;
                        }
                        if (var528 == 5225) {
                            var9--;
                            int var240 = class341.field5298[var9];
                            class328 var241 = class194.method1242(false);
                            if (var241 == null) {
                                class341.field5298[var9++] = -1;
                                class341.field5298[var9++] = -1;
                            } else {
                                int[] var242 = var241.method2275(var240 >> 14 & 0x3FFF, var240 & 0x3FFF, 28);
                                if (var242 == null) {
                                    class341.field5298[var9++] = -1;
                                    class341.field5298[var9++] = -1;
                                } else {
                                    class341.field5298[var9++] = var242[1];
                                    class341.field5298[var9++] = var242[2];
                                }
                            }
                            continue;
                        }
                    } else if (var528 < 5400) {
                        if (var528 == 5300) {
                            var9 -= 2;
                            int var308 = class341.field5298[var9 + 1];
                            int var309 = class341.field5298[var9];
                            class119.method777(false, (byte) 25, var309, 3, var308);
                            class341.field5298[var9++] = class177.field2866 == null ? 0 : 1;
                            continue;
                        }
                        if (var528 == 5301) {
                            if (class177.field2866 != null) {
                                class119.method777(false, (byte) 67, -1, class52.field1051, -1);
                            }
                            continue;
                        }
                        if (var528 == 5302) {
                            class197[] var310 = class274.method1837(arg1 - 25766);
                            class341.field5298[var9++] = var310.length;
                            continue;
                        }
                        if (var528 == 5303) {
                            var9--;
                            int var311 = class341.field5298[var9];
                            class197[] var312 = class274.method1837(-25827);
                            class341.field5298[var9++] = var312[var311].field3173;
                            class341.field5298[var9++] = var312[var311].field3172;
                            continue;
                        }
                        if (var528 == 5305) {
                            int var313 = class180.field2902;
                            int var314 = class171.field2757;
                            int var315 = -1;
                            class197[] var316 = class274.method1837(-25827);
                            for (int var317 = 0; var317 < var316.length; var317++) {
                                class197 var318 = var316[var317];
                                if (var318.field3173 == var313 && var318.field3172 == var314) {
                                    var315 = var317;
                                    break;
                                }
                            }
                            class341.field5298[var9++] = var315;
                            continue;
                        }
                        if (var528 == 5306) {
                            class341.field5298[var9++] = class241.method1595(2);
                            continue;
                        }
                        if (var528 == 5307) {
                            var9--;
                            int var319 = class341.field5298[var9];
                            if (var319 < 0 || var319 > 2) {
                                var319 = 0;
                            }
                            class119.method777(false, (byte) 110, -1, var319, -1);
                            continue;
                        }
                        if (var528 == 5308) {
                            class341.field5298[var9++] = class52.field1051;
                            continue;
                        }
                        if (var528 == 5309) {
                            var9--;
                            int var320 = class341.field5298[var9];
                            if (var320 < 0 || var320 > 2) {
                                var320 = 0;
                            }
                            class52.field1051 = var320;
                            class271.method1824(114, class177.field2849);
                            continue;
                        }
                    } else if (var528 < 5500) {
                        if (var528 == 5400) {
                            var6 -= 2;
                            String var286 = class178.field2869[var6];
                            String var287 = class178.field2869[var6 + 1];
                            var9--;
                            int var288 = class341.field5298[var9];
                            class14.field263.method80(135, (byte) 118);
                            client.field915++;
                            class14.field263.method1311(class295.method1975((byte) 110, var286) + class295.method1975((byte) 113, var287) + 1, 10964);
                            class14.field263.method1309(arg1 ^ 0xFFFFFF8F, var286);
                            class14.field263.method1309(120, var287);
                            class14.field263.method1311(var288, 10964);
                            continue;
                        }
                        if (var528 == 5401) {
                            var9 -= 2;
                            class46.field952[class341.field5298[var9]] = (short) class71.method541(0, class341.field5298[var9 + 1]);
                            class25.method214(2);
                            class204.method1373(arg1 ^ 0x44);
                            class248.method1646((byte) -3);
                            class61.method476(123);
                            class147.method961(0);
                            continue;
                        }
                        if (var528 == 5405) {
                            var9 -= 2;
                            int var289 = class341.field5298[var9];
                            int var290 = class341.field5298[var9 + 1];
                            if (var289 >= 0 && var289 < 2) {
                                class31.field598[var289] = new int[var290 << 1][4];
                            }
                            continue;
                        }
                        if (var528 == 5406) {
                            var9 -= 7;
                            int var291 = class341.field5298[var9];
                            int var292 = class341.field5298[var9 + 1] << 1;
                            int var293 = class341.field5298[var9 + 2];
                            int var294 = class341.field5298[var9 + 5];
                            int var295 = class341.field5298[var9 + 3];
                            int var296 = class341.field5298[var9 + 4];
                            int var297 = class341.field5298[var9 + 6];
                            if (var291 >= 0 && var291 < 2 && class31.field598[var291] != null && var292 >= 0 && var292 < class31.field598[var291].length) {
                                class31.field598[var291][var292] = new int[] { (class61.method475(var293, 268419975) >> 14) * 128, var295, class61.method475(var293, 16383) * 128, var297 };
                                class31.field598[var291][var292 + 1] = new int[] { class61.method475(var296 >> 14, 16383) * 128, var294, class61.method475(var296, 16383) * 128 };
                            }
                            continue;
                        }
                        if (var528 == 5407) {
                            var9--;
                            int var298 = class31.field598[class341.field5298[var9]].length >> 1;
                            class341.field5298[var9++] = var298;
                            continue;
                        }
                        if (var528 == 5411) {
                            if (class177.field2866 != null) {
                                class119.method777(false, (byte) 6, -1, class52.field1051, -1);
                            }
                            if (class283.field4376 == null) {
                                class173.method1092(true, false, class187.method1195((byte) 111));
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var528 == 5419) {
                            String var299 = "";
                            if (class326.field4986 != null) {
                                if (class326.field4986.field1853 == null) {
                                    var299 = class147.method955(arg1 + 4864, class326.field4986.field1850);
                                } else {
                                    var299 = (String) class326.field4986.field1853;
                                }
                            }
                            class178.field2869[var6++] = var299;
                            continue;
                        }
                        if (var528 == 5420) {
                            class341.field5298[var9++] = class124.field2149 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 5421) {
                            if (class177.field2866 != null) {
                                class119.method777(false, (byte) 36, -1, class52.field1051, -1);
                            }
                            var6--;
                            String var300 = class178.field2869[var6];
                            var9--;
                            boolean var301 = class341.field5298[var9] == 1;
                            String var302 = class187.method1195((byte) 106) + var300;
                            if (class283.field4376 == null && (!var301 || class124.field2149 == 3 || !class124.field2140.startsWith("win") || class246.field3814)) {
                                class173.method1092(true, var301, var302);
                                continue;
                            }
                            class45.field931 = var302;
                            class294.field4499 = var301;
                            class306.field4628 = class177.field2849.method817(-10972, var302);
                            continue;
                        }
                        if (var528 == 5422) {
                            var6 -= 2;
                            String var303 = class178.field2869[var6];
                            String var304 = class178.field2869[var6 + 1];
                            var9--;
                            int var305 = class341.field5298[var9];
                            if (var303.length() > 0) {
                                if (class288.field4437 == null) {
                                    class288.field4437 = new String[class40.field780[class324.field4954]];
                                }
                                class288.field4437[var305] = var303;
                            }
                            if (var304.length() > 0) {
                                if (class263.field4090 == null) {
                                    class263.field4090 = new String[class40.field780[class324.field4954]];
                                }
                                class263.field4090[var305] = var304;
                            }
                            continue;
                        }
                        if (var528 == 5423) {
                            var6--;
                            System.out.println(class178.field2869[var6]);
                            continue;
                        }
                        if (var528 == 5424) {
                            var9 -= 11;
                            class183.field2935 = class341.field5298[var9];
                            class208.field3365 = class341.field5298[var9 + 1];
                            class172.field2769 = class341.field5298[var9 + 2];
                            class106.field1829 = class341.field5298[var9 + 3];
                            class335.field5136 = class341.field5298[var9 + 4];
                            class2.field36 = class341.field5298[var9 + 5];
                            class327.field5006 = class341.field5298[var9 + 6];
                            class326.field4979 = class341.field5298[var9 + 7];
                            class263.field4092 = class341.field5298[var9 + 8];
                            class46.field955 = class341.field5298[var9 + 9];
                            class177.field2852 = class341.field5298[var9 + 10];
                            class154.field2514.method2051(arg1 - 45, class335.field5136);
                            class154.field2514.method2051(arg1 - 59, class2.field36);
                            class154.field2514.method2051(64, class327.field5006);
                            class154.field2514.method2051(101, class326.field4979);
                            class154.field2514.method2051(99, class263.field4092);
                            class267.field4117 = true;
                            continue;
                        }
                        if (var528 == 5425) {
                            class55.method421(0);
                            class267.field4117 = false;
                            continue;
                        }
                        if (var528 == 5426) {
                            var9--;
                            class321.field4896 = class341.field5298[var9];
                            continue;
                        }
                        if (var528 == 5427) {
                            var9 -= 2;
                            class114.field1989 = class341.field5298[var9];
                            class116.field2040 = class341.field5298[var9 + 1];
                            continue;
                        }
                        if (var528 == 5428) {
                            var9 -= 2;
                            int var306 = class341.field5298[var9];
                            int var307 = class341.field5298[var9 + 1];
                            class341.field5298[var9++] = class233.method1550(var307, var306, class331.method2296(arg1, 32173)) ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 5600) {
                        if (var528 == 5500) {
                            var9 -= 4;
                            int var274 = class341.field5298[var9];
                            int var275 = class341.field5298[var9 + 1];
                            int var276 = class341.field5298[var9 + 2];
                            int var277 = class341.field5298[var9 + 3];
                            class180.method1132(((var274 & 0xFFFD599) >> 14) - class246.field3818, var275, false, var276, (var274 & 0x3FFF) - class101.field1769, var277, false);
                            continue;
                        }
                        if (var528 == 5501) {
                            var9 -= 4;
                            int var278 = class341.field5298[var9];
                            int var279 = class341.field5298[var9 + 2];
                            int var280 = class341.field5298[var9 + 1];
                            int var281 = class341.field5298[var9 + 3];
                            class58.method450((byte) 40, var279, (var278 & 0x3FFF) - class101.field1769, var281, (var278 >> 14 & 0x3FFF) - class246.field3818, var280);
                            continue;
                        }
                        if (var528 == 5502) {
                            var9 -= 6;
                            int var282 = class341.field5298[var9];
                            if (var282 >= 2) {
                                throw new RuntimeException();
                            }
                            class344.field5340 = var282;
                            int var283 = class341.field5298[var9 + 1];
                            if (class31.field598[class344.field5340].length >> 1 <= var283 + 1) {
                                throw new RuntimeException();
                            }
                            class173.field2775 = 0;
                            class156.field2536 = var283;
                            class343.field5333 = class341.field5298[var9 + 2];
                            class290.field4452 = class341.field5298[var9 + 3];
                            int var284 = class341.field5298[var9 + 4];
                            if (var284 >= 2) {
                                throw new RuntimeException();
                            }
                            class220.field3497 = var284;
                            int var285 = class341.field5298[var9 + 5];
                            if ((var285 + 1) >= (class31.field598[class220.field3497].length >> 1)) {
                                throw new RuntimeException();
                            }
                            class343.field5330 = var285;
                            class135.field2271 = 3;
                            continue;
                        }
                        if (var528 == 5503) {
                            class327.method2265(0);
                            continue;
                        }
                        if (var528 == 5504) {
                            var9 -= 2;
                            class302.method2009(99, class341.field5298[var9], class341.field5298[var9 + 1]);
                            continue;
                        }
                        if (var528 == 5505) {
                            class341.field5298[var9++] = (int) class120.field2090;
                            continue;
                        }
                        if (var528 == 5506) {
                            class341.field5298[var9++] = (int) class95.field1709;
                            continue;
                        }
                        if (var528 == 5507) {
                            class324.method2243(-28121);
                            continue;
                        }
                        if (var528 == 5508) {
                            class127.method841((byte) -91);
                            continue;
                        }
                        if (var528 == 5509) {
                            class293.method1967(2);
                            continue;
                        }
                        if (var528 == 5510) {
                            class33.method263((byte) 91);
                            continue;
                        }
                        if (var528 == 5512) {
                            class55.method423((byte) 59);
                            continue;
                        }
                    } else if (var528 < 5700) {
                        if (var528 == 5600) {
                            var6 -= 2;
                            var9--;
                            int var243 = class341.field5298[var9];
                            String var244 = class178.field2869[var6 + 1];
                            String var245 = class178.field2869[var6];
                            if (class38.field730 == 10 && class175.field2813 == 0 && class322.field4911 == 0 && class53.field1075 == 0 && class125.field2174 == 0) {
                                class236.method1566(var245, (byte) -98, var243, var244);
                            }
                            continue;
                        }
                        if (var528 == 5601) {
                            class329.method2283(true);
                            continue;
                        }
                        if (var528 == 5602) {
                            if (class322.field4911 == 0) {
                                class157.field2565 = -2;
                            }
                            continue;
                        }
                        if (var528 == 5603) {
                            var9 -= 4;
                            if (class38.field730 == 10 && class175.field2813 == 0 && class322.field4911 == 0 && class53.field1075 == 0 && class125.field2174 == 0) {
                                class269.method1796(class341.field5298[var9 + 3], class341.field5298[var9], 0, class341.field5298[var9 + 2], class341.field5298[var9 + 1]);
                            }
                            continue;
                        }
                        if (var528 == 5604) {
                            var6--;
                            if (class38.field730 == 10 && class175.field2813 == 0 && class322.field4911 == 0 && class53.field1075 == 0 && class125.field2174 == 0) {
                                class21.method176(class116.method767(-128, class178.field2869[var6]), 21);
                            }
                            continue;
                        }
                        if (var528 == 5605) {
                            var9 -= 7;
                            var6 -= 3;
                            if (class38.field730 == 10 && class175.field2813 == 0 && class322.field4911 == 0 && class53.field1075 == 0 && class125.field2174 == 0) {
                                class86.method603(class341.field5298[var9 + 3], class341.field5298[var9 + 4] == 1, class341.field5298[var9 + 6] == 1, class116.method767(-126, class178.field2869[var6]), class178.field2869[var6 + 1], class341.field5298[var9 + 5] == 1, 123, class341.field5298[var9 + 2], class341.field5298[var9 + 1], class178.field2869[var6 + 2], class341.field5298[var9]);
                            }
                            continue;
                        }
                        if (var528 == 5606) {
                            if (class53.field1075 == 0) {
                                class40.field775 = -2;
                            }
                            continue;
                        }
                        if (var528 == 5607) {
                            class341.field5298[var9++] = class157.field2565;
                            continue;
                        }
                        if (var528 == 5608) {
                            class341.field5298[var9++] = class166.field2676;
                            continue;
                        }
                        if (var528 == 5609) {
                            class341.field5298[var9++] = class40.field775;
                            continue;
                        }
                        if (var528 == 5610) {
                            for (int var246 = 0; var246 < 5; var246++) {
                                class178.field2869[var6++] = class112.field1975.length <= var246 ? "" : class69.method532(-126, class112.field1975[var246]);
                            }
                            class112.field1975 = null;
                            continue;
                        }
                        if (var528 == 5611) {
                            class341.field5298[var9++] = class171.field2754;
                            continue;
                        }
                    } else if (var528 < 6100) {
                        if (var528 == 6001) {
                            var9--;
                            int var264 = class341.field5298[var9];
                            if (var264 < 1) {
                                var264 = 1;
                            }
                            if (var264 > 4) {
                                var264 = 4;
                            }
                            class331.field5068 = var264;
                            if (!class249.field3893 || !class334.field5115) {
                                if (class331.field5068 == 1) {
                                    class284.method1920(0.9F);
                                }
                                if (class331.field5068 == 2) {
                                    class284.method1920(0.8F);
                                }
                                if (class331.field5068 == 3) {
                                    class284.method1920(0.7F);
                                }
                                if (class331.field5068 == 4) {
                                    class284.method1920(0.6F);
                                }
                            }
                            if (class249.field3893) {
                                class158.method1019(-4096);
                                if (!class334.field5115) {
                                    class53.method411(-11);
                                }
                            }
                            class204.method1373(-120);
                            class271.method1824(112, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6002) {
                            var9--;
                            class17.method122((byte) 121, class341.field5298[var9] == 1);
                            class146.method950(32);
                            class53.method411(-11);
                            class210.method1423((byte) 104);
                            class271.method1824(96, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6003) {
                            var9--;
                            class104.field1794 = class341.field5298[var9] == 1;
                            class210.method1423((byte) -95);
                            class271.method1824(arg1 + 158, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6005) {
                            var9--;
                            class64.field1227 = class341.field5298[var9] == 1;
                            class53.method411(-11);
                            class271.method1824(118, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6006) {
                            var9--;
                            class318.field4809 = class341.field5298[var9] == 1;
                            ((class52) class284.field4393).method396(26392, !class318.field4809);
                            class271.method1824(105, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6007) {
                            var9--;
                            class79.field1555 = class341.field5298[var9] == 1;
                            class271.method1824(102, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6008) {
                            var9--;
                            client.field902 = class341.field5298[var9] == 1;
                            class271.method1824(111, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6009) {
                            var9--;
                            class157.field2572 = class341.field5298[var9] == 1;
                            class271.method1824(109, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6010) {
                            var9--;
                            class259.field4030 = class341.field5298[var9] == 1;
                            class271.method1824(127, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6011) {
                            var9--;
                            int var265 = class341.field5298[var9];
                            if (var265 < 0 || var265 > 2) {
                                var265 = 0;
                            }
                            class305.field4620 = var265;
                            class271.method1824(92, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6012) {
                            if (class249.field3893) {
                                class128.method844(0, 0, (byte) -62);
                            }
                            var9--;
                            class334.field5115 = class341.field5298[var9] == 1;
                            if (class249.field3893 && class334.field5115) {
                                class284.method1920(0.7F);
                            } else {
                                if (class331.field5068 == 1) {
                                    class284.method1920(0.9F);
                                }
                                if (class331.field5068 == 2) {
                                    class284.method1920(0.8F);
                                }
                                if (class331.field5068 == 3) {
                                    class284.method1920(0.7F);
                                }
                                if (class331.field5068 == 4) {
                                    class284.method1920(0.6F);
                                }
                            }
                            class53.method411(-11);
                            class271.method1824(96, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6014) {
                            var9--;
                            class45.field926 = class341.field5298[var9] == 1;
                            if (class249.field3893) {
                                class53.method411(-11);
                            }
                            class271.method1824(103, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6015) {
                            var9--;
                            class140.field2314 = class341.field5298[var9] == 1;
                            if (class249.field3893) {
                                class158.method1019(-4096);
                            }
                            class271.method1824(117, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6016) {
                            var9--;
                            int var266 = class341.field5298[var9];
                            if (class249.field3893) {
                                class104.field1796 = true;
                            }
                            if (var266 < 0 || var266 > 2) {
                                var266 = 0;
                            }
                            class219.field3477 = var266;
                            continue;
                        }
                        if (var528 == 6017) {
                            var9--;
                            class191.field3110 = class341.field5298[var9] == 1;
                            class252.method1696((byte) 108);
                            class271.method1824(111, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6018) {
                            var9--;
                            int var267 = class341.field5298[var9];
                            if (var267 < 0) {
                                var267 = 0;
                            }
                            if (var267 > 127) {
                                var267 = 127;
                            }
                            class202.field3278 = var267;
                            class271.method1824(98, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6019) {
                            var9--;
                            int var268 = class341.field5298[var9];
                            if (var268 < 0) {
                                var268 = 0;
                            }
                            if (var268 > 255) {
                                var268 = 255;
                            }
                            if (class171.field2751 != var268) {
                                if (class171.field2751 == 0 && class328.field5039 != -1) {
                                    class164.method1048(0, class75.field1530, (byte) 69, class328.field5039, false, var268);
                                    class146.field2389 = false;
                                } else if (var268 == 0) {
                                    class269.method1793(-27795);
                                    class146.field2389 = false;
                                } else {
                                    class1.method1(var268, (byte) -117);
                                }
                                class171.field2751 = var268;
                            }
                            class271.method1824(arg1 ^ 0xFFFFFFB9, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6020) {
                            var9--;
                            int var269 = class341.field5298[var9];
                            if (var269 < 0) {
                                var269 = 0;
                            }
                            if (var269 > 127) {
                                var269 = 127;
                            }
                            class80.field1573 = var269;
                            class271.method1824(107, class177.field2849);
                            class1.field13 = false;
                            continue;
                        }
                        if (var528 == 6021) {
                            var9--;
                            class24.field485 = class341.field5298[var9] == 1;
                            class210.method1423((byte) 54);
                            continue;
                        }
                        if (var528 == 6023) {
                            var9--;
                            int var270 = class341.field5298[var9];
                            boolean var271 = false;
                            if (var270 < 0) {
                                var270 = 0;
                            }
                            if (var270 > 2) {
                                var270 = 2;
                            }
                            if (class318.field4807 < 96) {
                                var270 = 0;
                                var271 = true;
                            }
                            class275.method1840(var270);
                            class271.method1824(117, class177.field2849);
                            class1.field13 = false;
                            class341.field5298[var9++] = var271 ? 0 : 1;
                            continue;
                        }
                        if (var528 == 6024) {
                            var9--;
                            int var272 = class341.field5298[var9];
                            if (var272 < 0 || var272 > 2) {
                                var272 = 0;
                            }
                            class337.field5238 = var272;
                            class271.method1824(113, class177.field2849);
                            continue;
                        }
                        if (var528 == 6027) {
                            var9--;
                            int var273 = class341.field5298[var9];
                            if (!class249.field3893) {
                                continue;
                            }
                            if (var273 < 0 || var273 > 1) {
                                var273 = 0;
                            }
                            class321.method2234((byte) 121, var273 == 1);
                            continue;
                        }
                        if (var528 == 6028) {
                            var9--;
                            class290.field4460 = class341.field5298[var9] != 0;
                            class271.method1824(98, class177.field2849);
                            continue;
                        }
                    } else if (var528 < 6200) {
                        if (var528 == 6101) {
                            class341.field5298[var9++] = class331.field5068;
                            continue;
                        }
                        if (var528 == 6102) {
                            class341.field5298[var9++] = class19.method127(40) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6103) {
                            class341.field5298[var9++] = class104.field1794 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6105) {
                            class341.field5298[var9++] = class64.field1227 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6106) {
                            class341.field5298[var9++] = class318.field4809 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6107) {
                            class341.field5298[var9++] = class79.field1555 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6108) {
                            class341.field5298[var9++] = client.field902 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6109) {
                            class341.field5298[var9++] = class157.field2572 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6110) {
                            class341.field5298[var9++] = class259.field4030 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6111) {
                            class341.field5298[var9++] = class305.field4620;
                            continue;
                        }
                        if (var528 == 6112) {
                            class341.field5298[var9++] = class334.field5115 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6114) {
                            class341.field5298[var9++] = class45.field926 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6115) {
                            class341.field5298[var9++] = class140.field2314 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6116) {
                            class341.field5298[var9++] = class219.field3477;
                            continue;
                        }
                        if (var528 == 6117) {
                            class341.field5298[var9++] = class191.field3110 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6118) {
                            class341.field5298[var9++] = class202.field3278;
                            continue;
                        }
                        if (var528 == 6119) {
                            class341.field5298[var9++] = class171.field2751;
                            continue;
                        }
                        if (var528 == 6120) {
                            class341.field5298[var9++] = class80.field1573;
                            continue;
                        }
                        if (var528 == 6121) {
                            if (class249.field3893) {
                                class341.field5298[var9++] = class249.field3900 ? 1 : 0;
                            } else {
                                class341.field5298[var9++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 6123) {
                            class341.field5298[var9++] = class275.method1842();
                            continue;
                        }
                        if (var528 == 6124) {
                            class341.field5298[var9++] = class337.field5238;
                            continue;
                        }
                        if (var528 == 6126) {
                            if (class249.field3893) {
                                class341.field5298[var9++] = class195.method1246() ? 1 : 0;
                            } else {
                                class341.field5298[var9++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 6127) {
                            class341.field5298[var9++] = class28.field539 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6128) {
                            class341.field5298[var9++] = class290.field4460 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 6300) {
                        if (var528 == 6200) {
                            var9 -= 2;
                            class254.field3969 = (short) class341.field5298[var9];
                            if (class254.field3969 <= 0) {
                                class254.field3969 = 256;
                            }
                            class187.field3038 = (short) class341.field5298[var9 + 1];
                            if (class187.field3038 <= 0) {
                                class187.field3038 = 205;
                            }
                            continue;
                        }
                        if (var528 == 6201) {
                            var9 -= 2;
                            class138.field2306 = (short) class341.field5298[var9];
                            if (class138.field2306 <= 0) {
                                class138.field2306 = 256;
                            }
                            class189.field3073 = (short) class341.field5298[var9 + 1];
                            if (class189.field3073 <= 0) {
                                class189.field3073 = 320;
                            }
                            continue;
                        }
                        if (var528 == 6202) {
                            var9 -= 4;
                            class39.field765 = (short) class341.field5298[var9];
                            if (class39.field765 <= 0) {
                                class39.field765 = 1;
                            }
                            class168.field2699 = (short) class341.field5298[var9 + 1];
                            if (class168.field2699 <= 0) {
                                class168.field2699 = 32767;
                            } else if (class39.field765 > class168.field2699) {
                                class168.field2699 = class39.field765;
                            }
                            class228.field3607 = (short) class341.field5298[var9 + 2];
                            if (class228.field3607 <= 0) {
                                class228.field3607 = 1;
                            }
                            class256.field3997 = (short) class341.field5298[var9 + 3];
                            if (class256.field3997 <= 0) {
                                class256.field3997 = 32767;
                            } else if (class228.field3607 > class256.field3997) {
                                class256.field3997 = class228.field3607;
                            }
                            continue;
                        }
                        if (var528 == 6203) {
                            class69.method533(client.field908.field1416, 0, 0, client.field908.field1414, 0, false);
                            class341.field5298[var9++] = class146.field2393;
                            class341.field5298[var9++] = class50.field1016;
                            continue;
                        }
                        if (var528 == 6204) {
                            class341.field5298[var9++] = class138.field2306;
                            class341.field5298[var9++] = class189.field3073;
                            continue;
                        }
                        if (var528 == 6205) {
                            class341.field5298[var9++] = class254.field3969;
                            class341.field5298[var9++] = class187.field3038;
                            continue;
                        }
                    } else if (var528 < 6400) {
                        if (var528 == 6300) {
                            class341.field5298[var9++] = (int) (class338.method2339((byte) -120) / 60000L);
                            continue;
                        }
                        if (var528 == 6301) {
                            class341.field5298[var9++] = (int) (class338.method2339((byte) -120) / 86400000L) - 11745;
                            continue;
                        }
                        if (var528 == 6302) {
                            var9 -= 3;
                            int var259 = class341.field5298[var9];
                            int var260 = class341.field5298[var9 + 2];
                            int var261 = class341.field5298[var9 + 1];
                            class327.field5001.clear();
                            class327.field5001.set(11, 12);
                            class327.field5001.set(var260, var261, var259);
                            class341.field5298[var9++] = (int) (class327.field5001.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var528 == 6303) {
                            class327.field5001.clear();
                            class327.field5001.setTime(new Date(class338.method2339((byte) -120)));
                            class341.field5298[var9++] = class327.field5001.get(1);
                            continue;
                        }
                        if (var528 == 6304) {
                            var9--;
                            int var262 = class341.field5298[var9];
                            boolean var263 = true;
                            if (var262 < 0) {
                                var263 = ((var262 + 1) % 4) == 0;
                            } else if (var262 < 1582) {
                                var263 = var262 % 4 == 0;
                            } else if (var262 % 4 != 0) {
                                var263 = false;
                            } else if (var262 % 100 != 0) {
                                var263 = true;
                            } else if (var262 % 400 != 0) {
                                var263 = false;
                            }
                            class341.field5298[var9++] = var263 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 6500) {
                        if (var528 == 6405) {
                            class341.field5298[var9++] = class165.method1055(69) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 6406) {
                            class341.field5298[var9++] = class51.method383(-105) ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 6600) {
                        if (var528 == 6500) {
                            if (class38.field730 == 10 && class175.field2813 == 0 && class322.field4911 == 0 && class53.field1075 == 0) {
                                class341.field5298[var9++] = class12.method98((byte) 122) == -1 ? 0 : 1;
                                continue;
                            }
                            class341.field5298[var9++] = 1;
                            continue;
                        }
                        if (var528 == 6501) {
                            class103 var247 = class223.method1479((byte) 71);
                            if (var247 == null) {
                                class341.field5298[var9++] = -1;
                                class341.field5298[var9++] = 0;
                                class178.field2869[var6++] = "";
                                class341.field5298[var9++] = 0;
                                class178.field2869[var6++] = "";
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var247.field1791;
                                class341.field5298[var9++] = var247.field3345;
                                class178.field2869[var6++] = var247.field1792;
                                class241 var248 = var247.method669(123);
                                class341.field5298[var9++] = var248.field3760;
                                class178.field2869[var6++] = var248.field3761;
                                class341.field5298[var9++] = var247.field3350;
                            }
                            continue;
                        }
                        if (var528 == 6502) {
                            class103 var249 = class204.method1368(16711680);
                            if (var249 == null) {
                                class341.field5298[var9++] = -1;
                                class341.field5298[var9++] = 0;
                                class178.field2869[var6++] = "";
                                class341.field5298[var9++] = 0;
                                class178.field2869[var6++] = "";
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var249.field1791;
                                class341.field5298[var9++] = var249.field3345;
                                class178.field2869[var6++] = var249.field1792;
                                class241 var250 = var249.method669(123);
                                class341.field5298[var9++] = var250.field3760;
                                class178.field2869[var6++] = var250.field3761;
                                class341.field5298[var9++] = var249.field3350;
                            }
                            continue;
                        }
                        if (var528 == 6503) {
                            var9--;
                            int var251 = class341.field5298[var9];
                            if (class38.field730 == 10 && class175.field2813 == 0 && class322.field4911 == 0 && class53.field1075 == 0) {
                                class341.field5298[var9++] = class168.method1063(var251, 0) ? 1 : 0;
                                continue;
                            }
                            class341.field5298[var9++] = 0;
                            continue;
                        }
                        if (var528 == 6504) {
                            var9--;
                            class211.field3397 = class341.field5298[var9];
                            class271.method1824(91, class177.field2849);
                            continue;
                        }
                        if (var528 == 6505) {
                            class341.field5298[var9++] = class211.field3397;
                            continue;
                        }
                        if (var528 == 6506) {
                            var9--;
                            int var252 = class341.field5298[var9];
                            class103 var253 = class335.method2311(true, var252);
                            if (var253 == null) {
                                class341.field5298[var9++] = -1;
                                class178.field2869[var6++] = "";
                                class341.field5298[var9++] = 0;
                                class178.field2869[var6++] = "";
                                class341.field5298[var9++] = 0;
                            } else {
                                class341.field5298[var9++] = var253.field3345;
                                class178.field2869[var6++] = var253.field1792;
                                class241 var254 = var253.method669(126);
                                class341.field5298[var9++] = var254.field3760;
                                class178.field2869[var6++] = var254.field3761;
                                class341.field5298[var9++] = var253.field3350;
                            }
                            continue;
                        }
                        if (var528 == 6507) {
                            var9 -= 4;
                            int var255 = class341.field5298[var9];
                            boolean var256 = class341.field5298[var9 + 1] == 1;
                            int var257 = class341.field5298[var9 + 2];
                            boolean var258 = class341.field5298[var9 + 3] == 1;
                            class344.method2385(var258, var256, var255, (byte) -122, var257);
                            continue;
                        }
                    } else if (var528 < 6700) {
                        if (var528 == 6600) {
                            var9--;
                            class6.field136 = class341.field5298[var9] == 1;
                            class271.method1824(arg1 ^ 0xFFFFFFA4, class177.field2849);
                            continue;
                        }
                        if (var528 == 6601) {
                            class341.field5298[var9++] = class6.field136 ? 1 : 0;
                            continue;
                        }
                    }
                } else {
                    class68 var51;
                    if (var528 < 2000) {
                        var51 = var46 ? class189.field3069 : class140.field2320;
                    } else {
                        var10000 = arg1 - 1351736883;
                        var9--;
                        var51 = class319.method2196(var10000, class341.field5298[var9]);
                        var528 -= 1000;
                    }
                    if (var528 == 1300) {
                        var9--;
                        int var52 = class341.field5298[var9] - 1;
                        if (var52 >= 0 && var52 <= 9) {
                            var6--;
                            var51.method517((byte) 58, var52, class178.field2869[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var528 == 1301) {
                        var9 -= 2;
                        int var53 = class341.field5298[var9 + 1];
                        int var54 = class341.field5298[var9];
                        var51.field1441 = class233.method1548((byte) -126, var54, var53);
                        continue;
                    }
                    if (var528 == 1302) {
                        var9--;
                        var51.field1396 = class341.field5298[var9] == 1;
                        continue;
                    }
                    if (var528 == 1303) {
                        var9--;
                        var51.field1382 = class341.field5298[var9];
                        continue;
                    }
                    if (var528 == 1304) {
                        var9--;
                        var51.field1287 = class341.field5298[var9];
                        continue;
                    }
                    if (var528 == 1305) {
                        var6--;
                        var51.field1346 = class178.field2869[var6];
                        continue;
                    }
                    if (var528 == 1306) {
                        var6--;
                        var51.field1325 = class178.field2869[var6];
                        continue;
                    }
                    if (var528 == 1307) {
                        var51.field1369 = null;
                        continue;
                    }
                    if (var528 == 1308) {
                        var9--;
                        var51.field1311 = class341.field5298[var9];
                        var9--;
                        var51.field1359 = class341.field5298[var9];
                        continue;
                    }
                    if (var528 == 1309) {
                        var9--;
                        int var55 = class341.field5298[var9];
                        var9--;
                        int var56 = class341.field5298[var9];
                        if (var56 >= 1 && var56 <= 10) {
                            var51.method519(var56 - 1, var55, (byte) 80);
                        }
                        continue;
                    }
                    if (var528 == 1310) {
                        var6--;
                        var51.field1321 = class178.field2869[var6];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var527) {
            if (var5.field3307 == null) {
                if (class260.field4068 != 0) {
                    class42.method321("Clientscript error - check log for details", 0, 1, "");
                }
                class106.method694(var527, "CS2 - scr:" + var5.field702 + " op:" + var11, (byte) -105);
            } else {
                StringBuffer var524 = new StringBuffer(30);
                var524.append("%0a - in: ").append(var5.field3307);
                for (int var525 = class15.field280 - 1; var525 >= 0; var525--) {
                    var524.append("%0a - via: ").append(class197.field3171[var525].field2286.field3307);
                }
                if (var11 == 40) {
                    int var526 = var10[var8];
                    var524.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var526));
                }
                if (class260.field4068 != 0) {
                    class42.method321("Clientscript error in: " + var5.field3307, 0, arg1 + 62, "");
                }
                class106.method694(var527, "CS2 - scr:" + var5.field702 + " op:" + var11 + var524.toString(), (byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 6786)
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1730 = arg9;
        this.field1740 = arg5;
        this.field1725 = arg6;
        this.field1724 = arg3;
        this.field1744 = arg1;
        this.field1742 = arg8;
        this.field1738 = arg4;
        this.field1739 = arg0;
        this.field1728 = arg2;
        this.field1741 = arg7;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V", line = 6804)
    public static void method658(boolean arg0) {
        field1748 = (int[][][]) null;
        field1746 = null;
        field1751 = null;
        if (arg0) {
            field1746 = (int[]) null;
        }
        field1736 = null;
        field1749 = (byte[][][]) null;
    }
}
