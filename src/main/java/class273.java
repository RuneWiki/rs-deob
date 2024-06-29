import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class273 {

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public int field4835 = -1;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field4831 = 2;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "Lsg;")
    public static class162 field4846 = new class162();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public int field4830;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public int field4834;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public int field4836;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public int field4838;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public int field4839;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public int field4843;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public int field4845;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "Lcc;")
    public static class209 field4849;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Lsj;")
    public static class49 field4840;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "[[B")
    public static byte[][] field4850;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZBZ)V")
    public static final void method1859(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4) {
        field4832++;
        class108.method786(arg1, arg0, false, arg2, 0, class9.field175.length - 1, arg4);
        if (arg3 != 126) {
            method1866(21, -58);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
    public static final void method1860(int arg0, int arg1) {
        field4844++;
        if (arg0 == -1 || !class161.method1111((byte) 110, arg0)) {
            return;
        }
        class42[] var2 = class50.field984[arg0];
        int var3 = 0;
        if (arg1 >= -123) {
            method1862(122, (class49) null, (byte) 99, 11, (class49) null);
        }
        while (var3 < var2.length) {
            class42 var4 = var2[var3];
            if (var4.field738 != null) {
                class227 var5 = new class227();
                var5.field4134 = var4.field738;
                var5.field4143 = var4;
                class174.method1199(49, var5, 2000000);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B[B)V")
    public static final void method1861(byte arg0, byte[] arg1) {
        field4837++;
        class106 var2 = new class106(arg1);
        var2.field2085 = arg1.length - 2;
        class191.field3465 = var2.method736(123);
        class202.field3638 = new byte[class191.field3465][];
        class76.field1435 = new boolean[class191.field3465];
        class185.field3332 = new int[class191.field3465];
        class271.field4815 = new int[class191.field3465];
        field4850 = new byte[class191.field3465][];
        class110.field2226 = new int[class191.field3465];
        class182.field3289 = new int[class191.field3465];
        var2.field2085 = arg1.length - (class191.field3465 * 8) - 7;
        class241.field4360 = var2.method736(124);
        class50.field996 = var2.method736(127);
        int var3 = (var2.method774((byte) 102) & 0xFF) + 1;
        for (int var4 = 0; var4 < class191.field3465; var4++) {
            class182.field3289[var4] = var2.method736(126);
        }
        for (int var5 = 0; var5 < class191.field3465; var5++) {
            class271.field4815[var5] = var2.method736(127);
        }
        if (arg0 < 36) {
            method1862(1, (class49) null, (byte) -35, 61, (class49) null);
        }
        for (int var6 = 0; var6 < class191.field3465; var6++) {
            class110.field2226[var6] = var2.method736(127);
        }
        for (int var7 = 0; var7 < class191.field3465; var7++) {
            class185.field3332[var7] = var2.method736(124);
        }
        var2.field2085 = arg1.length + 3 - (var3 * 3 + (class191.field3465 * 8)) - 7;
        class117.field2341 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class117.field2341[var8] = var2.method776(125);
            if (class117.field2341[var8] == 0) {
                class117.field2341[var8] = 1;
            }
        }
        var2.field2085 = 0;
        for (int var9 = 0; var9 < class191.field3465; var9++) {
            int var10 = class110.field2226[var9];
            int var11 = class185.field3332[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class202.field3638[var9] = var13;
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            field4850[var9] = var14;
            int var16 = var2.method774((byte) 77);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method777(62);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method777(106);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var10) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var14[var10 * var22 + var21] = var2.method777(101);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var13[var10 * var24 + var20] = var2.method777(62);
                    }
                    var20++;
                }
            }
            class76.field1435[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILsj;BILsj;)Lve;")
    public static final class188 method1862(int arg0, class49 arg1, byte arg2, int arg3, class49 arg4) {
        field4842++;
        int var5 = -94 / ((-arg2 - 19) / 40);
        return class117.method833(arg3, arg4, 896, arg0) ? class11.method92(arg1.method353(arg0, 108, arg3), (byte) 103) : null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lva;ILva;)V")
    public static final void method1863(class34 arg0, int arg1, class34 arg2) {
        field4848++;
        if (arg0.field598 != null) {
            arg0.method269(-214950896);
        }
        arg0.field595 = arg2;
        arg0.field598 = arg2.field598;
        arg0.field598.field595 = arg0;
        if (arg1 <= 39) {
            field4850 = null;
        }
        arg0.field595.field598 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZII[I[I)V")
    public static final void method1864(boolean arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (arg4[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method1864(arg0, arg1, var6 - 1, arg3, arg4);
            method1864(true, var6 + 1, arg2, arg3, arg4);
        }
        field4841++;
        if (!arg0) {
            field4846 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static final void method1865(int arg0) {
        class185.method1256();
        int var1 = 0;
        if (arg0 != 4) {
            method1860(63, 7);
        }
        while (var1 < 4) {
            class122.field2404[var1].method1170((byte) -128);
            var1++;
        }
        System.gc();
        field4847++;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)Llh;")
    public static final class288 method1866(int arg0, int arg1) {
        field4829++;
        class288 var2 = (class288) class22.field419.method1257((long) arg0, -43);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field2769.method353(arg0, 118, 11);
        class288 var4 = new class288();
        if (var3 != null) {
            var4.method1932(0, new class106(var3));
        }
        if (arg1 != -10249) {
            method1864(true, -64, 75, (int[]) null, (int[]) null);
        }
        class22.field419.method1259((long) arg0, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method1867(byte arg0) {
        field4840 = null;
        field4846 = null;
        field4850 = null;
        field4849 = null;
        if (arg0 < 118) {
            method1860(-77, 1);
        }
    }
}
