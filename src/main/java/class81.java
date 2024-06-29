import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 extends class121 {

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public int field1992 = -1;

    @OriginalMember(owner = "client!le", name = "jb", descriptor = "Z")
    public boolean field2010 = false;

    @OriginalMember(owner = "client!le", name = "hb", descriptor = "I")
    public int field2008 = -1;

    @OriginalMember(owner = "client!le", name = "tb", descriptor = "I")
    public int field2020 = 5;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "I")
    public int field2005 = -1;

    @OriginalMember(owner = "client!le", name = "kb", descriptor = "I")
    public int field2011 = -1;

    @OriginalMember(owner = "client!le", name = "ob", descriptor = "I")
    public int field2015 = 2;

    @OriginalMember(owner = "client!le", name = "yb", descriptor = "I")
    public int field2025 = -1;

    @OriginalMember(owner = "client!le", name = "wb", descriptor = "I")
    public int field2023 = 99;

    @OriginalMember(owner = "client!le", name = "gb", descriptor = "I")
    public static int field2007 = 2;

    @OriginalMember(owner = "client!le", name = "mb", descriptor = "I")
    public static int field2013 = 127;

    @OriginalMember(owner = "client!le", name = "qb", descriptor = "Loc;")
    private static class99 field2017 = class48.method402((byte) -104, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!le", name = "lb", descriptor = "I")
    public static int field2012 = 0;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "Loc;")
    public static class99 field2001 = field2017;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "[Loc;")
    public static class99[] field2003 = new class99[100];

    @OriginalMember(owner = "client!le", name = "xb", descriptor = "[Z")
    public static boolean[] field2024 = new boolean[5];

    @OriginalMember(owner = "client!le", name = "Bb", descriptor = "[[[B")
    public static byte[][][] field2028 = new byte[4][104][104];

    @OriginalMember(owner = "client!le", name = "ub", descriptor = "I")
    public static int field2021 = 20;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!le", name = "ib", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!le", name = "rb", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!le", name = "vb", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!le", name = "Ab", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!le", name = "sb", descriptor = "Loe;")
    public static class102 field2019;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "Lve;")
    public static class144 field2000;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "[I")
    public int[] field1995;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "[I")
    private int[] field2006;

    @OriginalMember(owner = "client!le", name = "nb", descriptor = "[I")
    private int[] field2014;

    @OriginalMember(owner = "client!le", name = "pb", descriptor = "[I")
    public int[] field2016;

    @OriginalMember(owner = "client!le", name = "zb", descriptor = "[I")
    public int[] field2026;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILib;)V")
    public final void method696(int arg0, class57 arg1) {
        if (arg0 != -1) {
            this.method701(61, (byte) -90, -76, null);
        }
        field1994++;
        while (true) {
            int var3 = arg1.method510(-114);
            if (var3 == 0) {
                return;
            }
            this.method702(var3, 9999999, arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZLdd;)Ldd;")
    public final class26 method697(int arg0, boolean arg1, class26 arg2) {
        field1993++;
        int var4 = this.field2026[arg0];
        class39 var5 = class148.method1203(3410, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (!arg1) {
            field2021 = -116;
        }
        if (var5 == null) {
            return arg2.method250(true);
        } else {
            class26 var7 = arg2.method250(!var5.method324(0, var6));
            var7.method231(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLdd;I)Ldd;")
    public final class26 method698(byte arg0, class26 arg1, int arg2) {
        field1998++;
        int var4 = this.field2026[arg2];
        class39 var5 = class148.method1203(3410, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg0 < 56) {
            this.field2023 = -37;
        }
        if (var5 == null) {
            return arg1.method240(true);
        }
        class39 var7 = null;
        int var8 = 0;
        if (this.field2014 != null && arg2 < this.field2014.length) {
            int var9 = this.field2014[arg2];
            var7 = class148.method1203(3410, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class26 var11 = arg1.method240(!var5.method324(0, var6));
            var11.method231(var5, var6);
            return var11;
        } else {
            class26 var10 = arg1.method240(!var5.method324(0, var6) & !var7.method324(0, var8));
            var10.method231(var5, var6);
            var10.method231(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public static void method699(boolean arg0) {
        field2017 = null;
        field2003 = null;
        field2019 = null;
        field2028 = null;
        if (arg0) {
            field2001 = null;
            field2024 = null;
            field2000 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
    public static final void method700(int arg0, int arg1) {
        field2004++;
        class148.method1202(true);
        int var2 = class105.method899(-124, arg0).field1199;
        if (var2 == 0) {
            return;
        }
        int var3 = class94.field2283[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class40.method331(0.9D);
                ((class79) class40.field989).method688((byte) -122, 0.9D);
            }
            if (var3 == 2) {
                class40.method331(0.8D);
                ((class79) class40.field989).method688((byte) -123, 0.8D);
            }
            if (var3 == 3) {
                class40.method331(0.7D);
                ((class79) class40.field989).method688((byte) 51, 0.7D);
            }
            if (var3 == 4) {
                class40.method331(0.6D);
                ((class79) class40.field989).method688((byte) 111, 0.6D);
            }
            class125.method1026(1000);
            class80.field1971 = true;
        }
        if (arg1 != 2) {
            return;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class60.field1603 != var4) {
                if (class60.field1603 == 0 && class61.field1628 != -1) {
                    class79.method683(class99.field2372, var4, false, false, class61.field1628, 0);
                    class72.field1837 = false;
                } else if (var4 == 0) {
                    class49.method410(arg1 ^ 0x2BEE);
                    class72.field1837 = false;
                } else {
                    class150.method1210(0, var4);
                }
                class60.field1603 = var4;
            }
        }
        if (var2 == 6) {
            class15.field356 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field2013 = 127;
            }
            if (var3 == 1) {
                field2013 = 96;
            }
            if (var3 == 2) {
                field2013 = 64;
            }
            if (var3 == 3) {
                field2013 = 32;
            }
            if (var3 == 4) {
                field2013 = 0;
            }
        }
        if (var2 == 5) {
            class132.field3211 = var3;
        }
        if (var2 == 8) {
            class113.field2832 = true;
            class105.field2593 = var3;
        }
        if (var2 == 9) {
            class109.field2699 = var3;
        }
        if (var2 != 4) {
            return;
        }
        if (var3 == 0) {
            class100.field2441 = 127;
        }
        if (var3 == 1) {
            class100.field2441 = 96;
        }
        if (var3 == 2) {
            class100.field2441 = 64;
        }
        if (var3 == 3) {
            class100.field2441 = 32;
        }
        if (var3 == 4) {
            class100.field2441 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBILdd;)Ldd;")
    public final class26 method701(int arg0, byte arg1, int arg2, class26 arg3) {
        field2002++;
        int var5 = this.field2026[arg2];
        class39 var6 = class148.method1203(3410, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method240(true);
        }
        int var8 = arg0 & 0x3;
        class26 var9 = arg3.method240(!var6.method324(0, var7));
        if (var8 == 1) {
            var9.method248();
        } else if (var8 == 2) {
            var9.method244();
        } else if (var8 == 3) {
            var9.method249();
        }
        var9.method231(var6, var7);
        if (var8 == 1) {
            var9.method249();
        } else if (var8 == 2) {
            var9.method244();
        } else if (var8 == 3) {
            var9.method248();
        }
        if (arg1 < 105) {
            this.method698((byte) 85, null, 57);
        }
        return var9;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILib;)V")
    private final void method702(int arg0, int arg1, class57 arg2) {
        field2027++;
        if (arg0 == 1) {
            int var11 = arg2.method510(-125);
            this.field2016 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2016[var12] = arg2.method506(-1);
            }
            this.field2026 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field2026[var13] = arg2.method506(-1);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field2026[var14] = (arg2.method506(-1) << 16) + this.field2026[var14];
            }
        } else if (arg0 == 2) {
            this.field2008 = arg2.method506(-1);
        } else if (arg0 == 3) {
            int var4 = arg2.method510(-125);
            this.field2006 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2006[var5] = arg2.method510(arg1 - 10000122);
            }
            this.field2006[var4] = 9999999;
        } else if (arg0 == 4) {
            this.field2010 = true;
        } else if (arg0 == 5) {
            this.field2020 = arg2.method510(-115);
        } else if (arg0 == 6) {
            this.field2011 = arg2.method506(-1);
        } else if (arg0 == 7) {
            this.field2025 = arg2.method506(-1);
        } else if (arg0 == 8) {
            this.field2023 = arg2.method510(arg1 - 10000112);
        } else if (arg0 == 9) {
            this.field2005 = arg2.method510(arg1 - 10000112);
        } else if (arg0 == 10) {
            this.field1992 = arg2.method510(-115);
        } else if (arg0 == 11) {
            this.field2015 = arg2.method510(-127);
        } else if (arg0 == 12) {
            int var8 = arg2.method510(arg1 - 10000114);
            this.field2014 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2014[var9] = arg2.method506(-1);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2014[var10] += arg2.method506(-1) << 16;
            }
        } else if (arg0 == 13) {
            int var6 = arg2.method510(-113);
            this.field1995 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1995[var7] = arg2.method483(false);
            }
        }
        if (arg1 != 9999999) {
            field2024 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ldd;IILle;B)Ldd;")
    public final class26 method703(class26 arg0, int arg1, int arg2, class81 arg3, byte arg4) {
        field1996++;
        int var6 = this.field2026[arg1];
        if (arg4 != 94) {
            field2021 = 24;
        }
        class39 var7 = class148.method1203(3410, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method705((byte) -114, arg2, arg0);
        }
        int var9 = arg3.field2026[arg2];
        class39 var10 = class148.method1203(3410, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class26 var12 = arg0.method240(!var7.method324(arg4 ^ 0x5E, var8));
            var12.method231(var7, var8);
            return var12;
        } else {
            class26 var13 = arg0.method240(!var7.method324(0, var8) & !var10.method324(0, var11));
            var13.method238(var7, var8, var10, var11, this.field2006);
            return var13;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V")
    public static final void method704(byte arg0) {
        class74.field1897 = null;
        field2022++;
        class107.field2626 = null;
        int var1 = -112 / ((arg0 + 2) / 49);
        class93.field2264 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BILdd;)Ldd;")
    public final class26 method705(byte arg0, int arg1, class26 arg2) {
        field2018++;
        int var4 = this.field2026[arg1];
        if (arg0 != -114) {
            return null;
        }
        class39 var5 = class148.method1203(3410, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method240(true);
        } else {
            class26 var7 = arg2.method240(!var5.method324(arg0 ^ 0xFFFFFF8E, var6));
            var7.method231(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public final void method706(int arg0) {
        if (this.field2005 == -1) {
            if (this.field2006 == null) {
                this.field2005 = 0;
            } else {
                this.field2005 = 2;
            }
        }
        field1997++;
        if (this.field1992 == -1) {
            if (this.field2006 == null) {
                this.field1992 = 0;
            } else {
                this.field1992 = 2;
            }
        }
        if (arg0 <= 7) {
            field2021 = -87;
        }
    }
}
