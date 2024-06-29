import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class94 extends class113 {

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public int field1962 = 2;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public int field1971 = 5;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public int field1978 = -1;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public int field1983 = 99;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public int field1984 = -1;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public int field1985 = -1;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public int field1968 = -1;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "Z")
    public boolean field1976 = false;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public int field1974 = -1;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "[I")
    public static int[] field1967 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "Lcd;")
    private static class23 field1975 = class54.method414("Prepared sound engine", -1);

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "Lcd;")
    public static class23 field1964 = class54.method414("Angreifen", -1);

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "Lcd;")
    public static class23 field1986 = class54.method414("und die Schaltfl-=che (WSpielkonto erstellen(W am", -1);

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "Lcd;")
    public static class23 field1990 = field1975;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "[Lea;")
    public static class38[] field1993 = new class38[1000];

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "J")
    public static long field1991;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "[I")
    private int[] field1972;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "[I")
    public int[] field1973;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "[I")
    public int[] field1977;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "[I")
    private int[] field1982;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "[I")
    public int[] field1992;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "[Loe;")
    public static class130[] field1979;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZZIZZ)Lgd;")
    public static final class58 method612(boolean arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        class186 var5 = null;
        if (class135.field2798 != null) {
            var5 = new class186(arg2, class135.field2798, class72.field1650[arg2], 1000000);
        }
        if (!arg3) {
            method612(true, false, 53, true, false);
        }
        field1966++;
        return new class58(var5, class181.field3582, arg2, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
    public final void method613(int arg0) {
        if (this.field1984 == -1) {
            if (this.field1982 == null) {
                this.field1984 = 0;
            } else {
                this.field1984 = 2;
            }
        }
        if (this.field1968 == -1) {
            if (this.field1982 == null) {
                this.field1968 = 0;
            } else {
                this.field1968 = 2;
            }
        }
        field1981++;
        if (arg0 != 25963) {
            this.field1973 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILva;)V")
    private final void method614(int arg0, int arg1, class189 arg2) {
        if (arg1 > -17) {
            this.field1984 = -52;
        }
        field1969++;
        if (arg0 == 1) {
            int var11 = arg2.method1197(-1);
            this.field1992 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1992[var12] = arg2.method1197(-1);
            }
            this.field1973 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field1973[var13] = arg2.method1197(-1);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field1973[var14] = (arg2.method1197(-1) << 16) + this.field1973[var14];
            }
        } else if (arg0 == 2) {
            this.field1978 = arg2.method1197(-1);
        } else if (arg0 == 3) {
            int var9 = arg2.method1202(115);
            this.field1982 = new int[var9 + 1];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1982[var10] = arg2.method1202(121);
            }
            this.field1982[var9] = 9999999;
        } else if (arg0 == 4) {
            this.field1976 = true;
        } else if (arg0 == 5) {
            this.field1971 = arg2.method1202(-122);
        } else if (arg0 == 6) {
            this.field1985 = arg2.method1197(-1);
        } else if (arg0 == 7) {
            this.field1974 = arg2.method1197(-1);
        } else if (arg0 == 8) {
            this.field1983 = arg2.method1202(108);
        } else if (arg0 == 9) {
            this.field1984 = arg2.method1202(105);
        } else if (arg0 == 10) {
            this.field1968 = arg2.method1202(-61);
        } else if (arg0 == 11) {
            this.field1962 = arg2.method1202(-92);
        } else if (arg0 == 12) {
            int var6 = arg2.method1202(-29);
            this.field1972 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1972[var7] = arg2.method1197(-1);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field1972[var8] = (arg2.method1197(-1) << 16) + this.field1972[var8];
            }
        } else if (arg0 == 13) {
            int var4 = arg2.method1202(-70);
            this.field1977 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1977[var5] = arg2.method1177(true);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lbh;II)Lbh;")
    public final class18 method615(class18 arg0, int arg1, int arg2) {
        field1961++;
        int var4 = this.field1973[arg2];
        class2 var5 = class156.method958(1, var4 >> 16);
        if (arg1 != 2) {
            this.method614(27, -79, null);
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method106(true);
        } else {
            class18 var7 = arg0.method106(!var5.method9(var6, -51));
            var7.method113(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lva;I)V")
    public final void method616(class189 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1202(-81);
            if (var3 == 0) {
                if (arg1 != -4) {
                    this.field1977 = null;
                }
                field1965++;
                return;
            }
            this.method614(var3, arg1 ^ 0x6B, arg0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
    public static final void method617(int arg0) {
        field1987++;
        class200.field3967.method997(false);
        if (arg0 <= 112) {
            method612(false, true, -63, false, true);
        }
        class56.field1306.method997(false);
        class159.field3170.method997(false);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
    public static void method618(int arg0) {
        field1993 = null;
        if (arg0 != 65535) {
            return;
        }
        field1967 = null;
        field1979 = null;
        field1975 = null;
        field1990 = null;
        field1986 = null;
        field1964 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILbh;I)Lbh;")
    public final class18 method619(int arg0, class18 arg1, int arg2) {
        field1980++;
        int var4 = this.field1973[arg0];
        class2 var5 = class156.method958(1, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg2 != -1) {
            this.method620(null, -71, 65, 80, null);
        }
        if (var5 == null) {
            return arg1.method116(true);
        } else {
            class18 var7 = arg1.method116(!var5.method9(var6, -88));
            var7.method113(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lke;IIILbh;)Lbh;")
    public final class18 method620(class94 arg0, int arg1, int arg2, int arg3, class18 arg4) {
        field1988++;
        int var6 = this.field1973[arg2];
        class2 var7 = class156.method958(1, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method615(arg4, 2, arg1);
        }
        int var9 = arg0.field1973[arg1];
        class2 var10 = class156.method958(1, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class18 var12 = arg4.method106(!var7.method9(var8, -98));
            var12.method113(var7, var8);
            return var12;
        }
        class18 var13 = arg4.method106(!var7.method9(var8, -50) & !var10.method9(var11, arg3 ^ 0xFFFFB7BE));
        var13.method107(var7, var8, var10, var11, this.field1982);
        if (arg3 != 18454) {
            this.field1985 = -26;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLbh;I)Lbh;")
    public final class18 method621(boolean arg0, class18 arg1, int arg2) {
        int var4 = this.field1973[arg2];
        field1970++;
        class2 var5 = class156.method958(1, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method106(true);
        }
        class2 var7 = null;
        int var8 = 0;
        if (arg0) {
            return null;
        }
        if (this.field1972 != null && this.field1972.length > arg2) {
            int var9 = this.field1972[arg2];
            var7 = class156.method958(1, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class18 var11 = arg1.method106(!var5.method9(var6, -97));
            var11.method113(var5, var6);
            return var11;
        } else {
            class18 var10 = arg1.method106(!var5.method9(var6, -91) & !var7.method9(var8, -72));
            var10.method113(var5, var6);
            var10.method113(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lbh;III)Lbh;")
    public final class18 method622(class18 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1973[arg3];
        field1963++;
        class2 var6 = class156.method958(1, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method106(true);
        }
        int var8 = arg1 & 0x3;
        class18 var9 = arg0.method106(!var6.method9(var7, -109));
        int var10 = -24 % ((arg2 - 51) / 57);
        if (var8 == 1) {
            var9.method112();
        } else if (var8 == 2) {
            var9.method117();
        } else if (var8 == 3) {
            var9.method114();
        }
        var9.method113(var6, var7);
        if (var8 == 1) {
            var9.method114();
        } else if (var8 == 2) {
            var9.method117();
        } else if (var8 == 3) {
            var9.method112();
        }
        return var9;
    }
}
