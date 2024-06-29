import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class131 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field1993 = -1;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public int field2011 = 5;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field2000 = -1;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Z")
    public boolean field1995 = false;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public int field2004 = 2;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field1986 = -1;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public int field2008 = 99;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Z")
    public boolean field2009 = false;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public int field2014 = -1;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Z")
    public boolean field2005 = false;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Z")
    public boolean field2015 = false;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public int field2016 = -1;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[S")
    public static short[] field1997 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lqk;")
    public static class10 field1992;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "Lfk;")
    public static class314 field2012;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public int[] field1988;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
    private int[] field1991;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "[I")
    public static int[] field1996;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[I")
    public int[] field2002;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[Z")
    public boolean[] field1998;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[[I")
    public int[][] field1987;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 7)
    public static final void method848(int arg0) {
        field2007++;
        class48.field691.method651(0);
        if (arg0 == -4) {
            class154.field2511.method651(0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILsm;ZIII)Lsm;", line = 24)
    public final class128 method849(int arg0, class128 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1985++;
        int var7 = this.field2002[arg4];
        int var8 = this.field1988[arg4];
        class146 var9 = class17.method114(var8 >> 16, arg2);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method145(true, true, true);
        }
        class146 var11 = null;
        int var12 = arg3 & 0x3;
        if ((this.field1995 || class241.field3780) && arg0 != -1 && arg0 < this.field1988.length) {
            int var13 = this.field1988[arg0];
            var11 = class17.method114(var13 >> 16, arg2);
            arg0 = var13 & 0xFFFF;
        }
        class128 var14;
        if (var11 == null) {
            var14 = arg1.method145(!var9.method1041(var10, 0), !var9.method1040(14678, var10), !this.field2005);
        } else {
            var14 = arg1.method145(!var9.method1041(var10, 0) & !var11.method1041(arg0, 0), !var9.method1040(14678, var10) & !var11.method1040(14678, arg0), !this.field2005);
        }
        if (class245.field3886 && this.field2005) {
            if (var12 == 1) {
                ((class22) var14).method184();
            } else if (var12 == 2) {
                ((class22) var14).method168();
            } else if (var12 == 3) {
                ((class22) var14).method147();
            }
        } else if (var12 == 1) {
            var14.method166();
        } else if (var12 == 2) {
            var14.method167();
        } else if (var12 == 3) {
            var14.method171();
        }
        var14.method838(var9, var10, var11, arg0, arg5 - 1, var7, this.field2005);
        if (class245.field3886 && this.field2005) {
            if (var12 == 1) {
                ((class22) var14).method147();
            } else if (var12 == 2) {
                ((class22) var14).method168();
            } else if (var12 == 3) {
                ((class22) var14).method184();
            }
        } else if (var12 == 1) {
            var14.method171();
        } else if (var12 == 2) {
            var14.method167();
        } else if (var12 == 3) {
            var14.method166();
        }
        return var14;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILfh;)V", line = 130)
    public final void method850(int arg0, class313 arg1) {
        while (true) {
            int var3 = arg1.method2224(-125);
            if (var3 == 0) {
                field2006++;
                int var4 = 27 / ((-arg0 - 25) / 32);
                return;
            }
            this.method855(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILsm;III)Lsm;", line = 165)
    public final class128 method851(int arg0, class128 arg1, int arg2, int arg3, int arg4) {
        field1990++;
        int var6 = this.field2002[arg0];
        if (arg2 < 107) {
            this.method855((class313) null, true, 87);
        }
        int var7 = this.field1988[arg0];
        class146 var8 = class17.method114(var7 >> 16, false);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method181(true, true, true);
        }
        class146 var10 = null;
        if ((this.field1995 || class241.field3780) && arg4 != -1 && arg4 < this.field1988.length) {
            int var11 = this.field1988[arg4];
            var10 = class17.method114(var11 >> 16, false);
            arg4 = var11 & 0xFFFF;
        }
        class146 var12 = null;
        class146 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field1991 != null) {
            if (arg0 < this.field1991.length) {
                var14 = this.field1991[arg0];
                if (var14 != 65535) {
                    var12 = class17.method114(var14 >> 16, false);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field1995 || class241.field3780) && arg4 != -1 && this.field1991.length > arg4) {
                var15 = this.field1991[arg4];
                if (var15 != 65535) {
                    var13 = class17.method114(var15 >> 16, false);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1041(var9, 0);
        boolean var17 = !var8.method1040(14678, var9);
        if (var12 != null) {
            var16 &= !var12.method1041(var14, 0);
            var17 &= !var12.method1040(14678, var14);
        }
        if (var10 != null) {
            var16 &= !var10.method1041(arg4, 0);
            var17 &= !var10.method1040(14678, arg4);
        }
        if (var13 != null) {
            var16 &= !var13.method1041(var15, 0);
            var17 &= !var13.method1040(14678, var15);
        }
        class128 var18 = arg1.method181(var16, var17, !this.field2005);
        var18.method838(var8, var9, var10, arg4, arg3 - 1, var6, this.field2005);
        if (var12 != null) {
            var18.method838(var12, var14, var13, var15, arg3 - 1, var6, this.field2005);
        }
        return var18;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILsm;III)Lsm;", line = 284)
    public final class128 method852(int arg0, int arg1, class128 arg2, int arg3, int arg4, int arg5) {
        field1994++;
        if (arg0 != -15119) {
            this.field2002 = (int[]) null;
        }
        int var7 = this.field2002[arg4];
        int var8 = this.field1988[arg4];
        class146 var9 = class17.method114(var8 >> 16, false);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method181(true, true, true);
        }
        int var11 = arg1 & 0x3;
        class146 var12 = null;
        if ((this.field1995 || class241.field3780) && arg3 != -1 && arg3 < this.field1988.length) {
            int var13 = this.field1988[arg3];
            var12 = class17.method114(var13 >> 16, false);
            arg3 = var13 & 0xFFFF;
        }
        class128 var14;
        if (var12 == null) {
            var14 = arg2.method181(!var9.method1041(var10, 0), !var9.method1040(14678, var10), !this.field2005);
        } else {
            var14 = arg2.method181(!var9.method1041(var10, 0) & !var12.method1041(arg3, arg0 ^ 0xFFFFC4F1), !var9.method1040(14678, var10) & !var12.method1040(14678, arg3), !this.field2005);
        }
        if (this.field2005 && class245.field3886) {
            if (var11 == 1) {
                ((class22) var14).method184();
            } else if (var11 == 2) {
                ((class22) var14).method168();
            } else if (var11 == 3) {
                ((class22) var14).method147();
            }
        } else if (var11 == 1) {
            var14.method166();
        } else if (var11 == 2) {
            var14.method167();
        } else if (var11 == 3) {
            var14.method171();
        }
        var14.method838(var9, var10, var12, arg3, arg5 - 1, var7, this.field2005);
        if (this.field2005 && class245.field3886) {
            if (var11 == 1) {
                ((class22) var14).method147();
            } else if (var11 == 2) {
                ((class22) var14).method168();
            } else if (var11 == 3) {
                ((class22) var14).method184();
            }
        } else if (var11 == 1) {
            var14.method171();
        } else if (var11 == 2) {
            var14.method167();
        } else if (var11 == 3) {
            var14.method166();
        }
        return var14;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIILsm;)Lsm;", line = 391)
    public final class128 method853(int arg0, int arg1, int arg2, int arg3, class128 arg4) {
        field2003++;
        int var6 = this.field2002[arg1];
        int var7 = this.field1988[arg1];
        class146 var8 = class17.method114(var7 >> 16, false);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method198(true, true, true);
        }
        if (arg3 != 650731984) {
            this.field2004 = -117;
        }
        class146 var10 = null;
        if ((this.field1995 || class241.field3780) && arg0 != -1 && arg0 < this.field1988.length) {
            int var11 = this.field1988[arg0];
            var10 = class17.method114(var11 >> 16, false);
            arg0 = var11 & 0xFFFF;
        }
        class128 var12;
        if (var10 == null) {
            var12 = arg4.method198(!var8.method1041(var9, arg3 ^ 0x26C961D0), !var8.method1040(14678, var9), !this.field2005);
        } else {
            var12 = arg4.method198(!var8.method1041(var9, 0) & !var10.method1041(arg0, arg3 - 650731984), !var8.method1040(14678, var9) & !var10.method1040(14678, arg0), !this.field2005);
        }
        var12.method838(var8, var9, var10, arg0, arg2 - 1, var6, this.field2005);
        return var12;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 428)
    public static final void method854(boolean arg0, int arg1, String arg2) {
        short[] var3 = new short[16];
        int var4 = 0;
        String var5 = arg2.toLowerCase();
        field2010++;
        for (int var6 = 0; var6 < class6.field82; var6++) {
            class109 var7 = class322.method2311(var6, -94);
            if ((!arg0 || var7.field1607) && var7.field1555 == -1 && var7.field1557 == -1 && var7.field1552 == 0 && var7.field1596.toLowerCase().indexOf(var5) != -1) {
                if (var4 >= 250) {
                    class123.field1829 = null;
                    class30.field464 = -1;
                    return;
                }
                if (var4 >= var3.length) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var4++] = (short) var6;
            }
        }
        class123.field1829 = var3;
        class30.field464 = var4;
        if (arg1 < 27) {
            method854(true, 42, (String) null);
        }
        class334.field5419 = 0;
        String[] var10 = new String[class30.field464];
        for (int var11 = 0; var11 < class30.field464; var11++) {
            var10[var11] = class322.method2311(var3[var11], -101).field1596;
        }
        class182.method1267(var10, 0, class123.field1829);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lfh;ZI)V", line = 505)
    private final void method855(class313 arg0, boolean arg1, int arg2) {
        field1989++;
        if (arg2 == 1) {
            int var4 = arg0.method2250(-1613178296);
            this.field2002 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2002[var5] = arg0.method2250(-1613178296);
            }
            this.field1988 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1988[var6] = arg0.method2250(-1613178296);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1988[var7] = (arg0.method2250(-1613178296) << 16) + this.field1988[var7];
            }
        } else if (arg2 == 2) {
            this.field1986 = arg0.method2250(-1613178296);
        } else if (arg2 == 3) {
            this.field1998 = new boolean[256];
            int var15 = arg0.method2224(-122);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field1998[arg0.method2224(-120)] = true;
            }
        } else if (arg2 == 4) {
            this.field2009 = true;
        } else if (arg2 == 5) {
            this.field2011 = arg0.method2224(-128);
        } else if (arg2 == 6) {
            this.field1993 = arg0.method2250(-1613178296);
        } else if (arg2 == 7) {
            this.field2014 = arg0.method2250(-1613178296);
        } else if (arg2 == 8) {
            this.field2008 = arg0.method2224(-124);
        } else if (arg2 == 9) {
            this.field2000 = arg0.method2224(-121);
        } else if (arg2 == 10) {
            this.field2016 = arg0.method2224(-122);
        } else if (arg2 == 11) {
            this.field2004 = arg0.method2224(-128);
        } else if (arg2 == 12) {
            int var12 = arg0.method2224(-125);
            this.field1991 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1991[var13] = arg0.method2250(-1613178296);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field1991[var14] = (arg0.method2250(-1613178296) << 16) + this.field1991[var14];
            }
        } else if (arg2 == 13) {
            int var8 = arg0.method2250(-1613178296);
            this.field1987 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method2224(-128);
                if (var10 > 0) {
                    this.field1987[var9] = new int[var10];
                    this.field1987[var9][0] = arg0.method2249(-106);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field1987[var9][var11] = arg0.method2250(-1613178296);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field2005 = true;
        } else if (arg2 == 15) {
            this.field1995 = true;
        } else if (arg2 == 16) {
            this.field2015 = true;
        }
        if (!arg1) {
            method854(false, 14, (String) null);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 663)
    public static void method856(boolean arg0) {
        field1992 = null;
        field1996 = null;
        if (arg0) {
            field2012 = null;
            field1997 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 693)
    public final void method857(int arg0) {
        if (arg0 != 0) {
            this.method853(69, 58, 104, 54, (class128) null);
        }
        if (this.field2016 == -1) {
            if (this.field1998 == null) {
                this.field2016 = 0;
            } else {
                this.field2016 = 2;
            }
        }
        if (this.field2000 == -1) {
            if (this.field1998 == null) {
                this.field2000 = 0;
            } else {
                this.field2000 = 2;
            }
        }
        field1999++;
    }
}
