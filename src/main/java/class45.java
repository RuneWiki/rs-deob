import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class45 implements Runnable {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lij;")
    public static class50 field823 = class78.method578(127, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "[Llj;")
    public static class44[] field826 = new class44[4];

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lij;")
    private static class50 field821 = class78.method578(123, "flash2:");

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lij;")
    public static class50 field829 = field821;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lij;")
    public static class50 field825 = field821;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Lij;")
    private static class50 field831 = class78.method578(121, "Choose Option");

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lij;")
    public static class50 field824 = field831;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
    public static int[] field833 = new int[128];

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lpe;")
    public static class100 field822 = new class100(260);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lce;")
    public static class10 field834;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lda;")
    public static class22 field827;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Ld;")
    public static class75 field835;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIILaa;IZJ)Z")
    public static final boolean method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class16 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class245.field4257 == class100.field1854;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class139.field2421 || var24 >= class54.field978) {
                    return false;
                }
                class65 var25 = class59.field1089[arg0][var15][var24];
                if (var25 != null && var25.field1244 >= 5) {
                    return false;
                }
            }
        }
        class106 var16 = new class106();
        var16.field1905 = arg11;
        var16.field1912 = arg0;
        var16.field1917 = arg5;
        var16.field1914 = arg6;
        var16.field1902 = arg7;
        var16.field1901 = arg8;
        var16.field1903 = arg9;
        var16.field1913 = arg1;
        var16.field1906 = arg2;
        var16.field1907 = arg1 + arg3 - 1;
        var16.field1919 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class59.field1089[var22][var17][var20] == null) {
                        class59.field1089[var22][var17][var20] = new class65(var22, var17, var20);
                    }
                }
                class65 var23 = class59.field1089[arg0][var17][var20];
                var23.field1236[var23.field1244] = var16;
                var23.field1239[var23.field1244] = var21;
                var23.field1240 |= var21;
                var23.field1244++;
                if (var13 && class139.field2422[var17][var20] != 0) {
                    var14 = class139.field2422[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class139.field2422[var18][var19] == 0) {
                        class139.field2422[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class187.field3064[class127.field2225++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method343(int arg0) {
        if (arg0 != 9895) {
            return;
        }
        field822 = null;
        field826 = null;
        field829 = null;
        field835 = null;
        field823 = null;
        field834 = null;
        field824 = null;
        field831 = null;
        field833 = null;
        field821 = null;
        field825 = null;
        field827 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB[Lij;I)Lij;")
    public static final class50 method344(int arg0, byte arg1, class50[] arg2, int arg3) {
        field828++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class217.field3647;
            }
            var4 += arg2[arg0 + var5].field898;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg1 >= -81) {
            field832 = -115;
        }
        for (int var8 = 0; var8 < arg3; var8++) {
            class50 var10 = arg2[arg0 + var8];
            class105.method792(var10.field909, 0, var6, var7, var10.field898);
            var7 += var10.field898;
        }
        class50 var9 = new class50();
        var9.field898 = var4;
        var9.field909 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static final void method345(int arg0) {
        class160 var1 = class89.field1696;
        synchronized (class89.field1696) {
            class229.field3850 = class54.field980;
            class91.field1723++;
            if (arg0 != 1) {
                field831 = null;
            }
            if (class61.field1125 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class46.field846[var2] = false;
                }
                class61.field1125 = class222.field3740;
            } else {
                while (class61.field1125 != class222.field3740) {
                    int var3 = class103.field1888[class222.field3740];
                    class222.field3740 = class222.field3740 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class46.field846[var3] = true;
                    } else {
                        class46.field846[~var3] = false;
                    }
                }
            }
            class54.field980 = class237.field3983;
        }
        field820++;
    }

    @OriginalMember(owner = "client!fa", name = "run", descriptor = "()V")
    public final void run() {
        field830++;
        try {
            while (true) {
                class86 var1 = class129.field2259;
                class124 var2;
                synchronized (class129.field2259) {
                    var2 = (class124) class129.field2259.method689(1001);
                }
                if (var2 == null) {
                    class162.method1137(-79, 100L);
                    Object var3 = class217.field3632;
                    synchronized (class217.field3632) {
                        if (class164.field2807 <= 1) {
                            class164.field2807 = 0;
                            class217.field3632.notifyAll();
                            return;
                        }
                        class164.field2807--;
                    }
                } else {
                    if (var2.field2178 == 0) {
                        var2.field2179.method351(var2.field2182, var2.field2182.length, 0, (int) var2.field635);
                        class86 var5 = class129.field2259;
                        synchronized (class129.field2259) {
                            var2.method267(-59);
                        }
                    } else if (var2.field2178 == 1) {
                        var2.field2182 = var2.field2179.method355((int) var2.field635, true);
                        class86 var4 = class129.field2259;
                        synchronized (class129.field2259) {
                            class78.field1447.method684(var2, (byte) 109);
                        }
                    }
                    Object var6 = class217.field3632;
                    synchronized (class217.field3632) {
                        if (class164.field2807 <= 1) {
                            class164.field2807 = 0;
                            class217.field3632.notifyAll();
                            return;
                        }
                        class164.field2807 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class121.method883((String) null, (byte) -100, var17);
        }
    }
}
