import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class108 extends class229 {

    @OriginalMember(owner = "client!k", name = "Fb", descriptor = "Loc;")
    private static class151 field1900 = class137.method873(2, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!k", name = "Kb", descriptor = "Loc;")
    public static class151 field1905 = class137.method873(2, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!k", name = "Ib", descriptor = "Loc;")
    public static class151 field1903 = class137.method873(2, "compass");

    @OriginalMember(owner = "client!k", name = "Gb", descriptor = "Loc;")
    public static class151 field1901 = class137.method873(2, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!k", name = "Eb", descriptor = "Loc;")
    public static class151 field1899 = field1900;

    @OriginalMember(owner = "client!k", name = "Wb", descriptor = "Loc;")
    private static class151 field1917 = class137.method873(2, "Members object");

    @OriginalMember(owner = "client!k", name = "Qb", descriptor = "Loc;")
    public static class151 field1911 = field1917;

    @OriginalMember(owner = "client!k", name = "Tb", descriptor = "Luc;")
    public static class211 field1914 = new class211(100);

    @OriginalMember(owner = "client!k", name = "Bb", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!k", name = "Cb", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!k", name = "Db", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!k", name = "Jb", descriptor = "I")
    private int field1904;

    @OriginalMember(owner = "client!k", name = "Lb", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!k", name = "Mb", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!k", name = "Nb", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!k", name = "Ob", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!k", name = "Pb", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!k", name = "Rb", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!k", name = "Sb", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!k", name = "Ub", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!k", name = "Vb", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!k", name = "Hb", descriptor = "Lsi;")
    private class197 field1902;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "(B)V")
    public static void method643(byte arg0) {
        field1905 = null;
        field1914 = null;
        field1903 = null;
        field1917 = null;
        field1911 = null;
        if (arg0 != 78) {
            method653((class151) null, -126);
        }
        field1900 = null;
        field1901 = null;
        field1899 = null;
    }

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(I)V")
    public final void method644(int arg0) {
        if (arg0 != 0) {
            this.method651((byte[]) null, 35, -90, (byte) 45);
        }
        super.field4101 = (this.field1904 + 7) / 8;
        ++field1912;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
    public class108(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(IB)I")
    public final int method645(int arg0, byte arg1) {
        ++field1916;
        int var3 = this.field1904 >> 3;
        int var4 = 0;
        int var5 = -(this.field1904 & 7) + 8;
        this.field1904 += arg0;
        while (~var5 > ~arg0) {
            var4 += (super.field4087[var3++] & class153.field2777[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg0 == var5) {
            var6 = (super.field4087[var3] & class153.field2777[var5]) + var4;
        } else {
            var6 = (super.field4087[var3] >> -arg0 + var5 & class153.field2777[arg0]) + var4;
        }
        return arg1 != 10 ? -3 : var6;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lwg;III)V")
    public static final void method646(class235 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class228.field4032) {
            class72 var4 = class95.field1776[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1400 != null && var4.field1400.field1423.method75()) {
                arg0.method77(var4.field1400.field1423, 128, 0, 0, true);
            }
        }
        if (arg3 < class228.field4032) {
            class72 var5 = class95.field1776[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1400 != null && var5.field1400.field1423.method75()) {
                arg0.method77(var5.field1400.field1423, 0, 0, 128, true);
            }
        }
        if (arg2 < class228.field4032 && arg3 < class225.field3924) {
            class72 var6 = class95.field1776[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1400 != null && var6.field1400.field1423.method75()) {
                arg0.method77(var6.field1400.field1423, 128, 0, 128, true);
            }
        }
        if (arg2 < class228.field4032 && arg3 > 0) {
            class72 var7 = class95.field1776[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1400 != null && var7.field1400.field1423.method75()) {
                arg0.method77(var7.field1400.field1423, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(BI)I")
    public final int method647(byte arg0, int arg1) {
        if (arg0 != 0) {
            this.method654((byte) -4);
        }
        ++field1909;
        return arg1 * 8 - this.field1904;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(Z)V")
    public final void method648(boolean arg0) {
        this.field1904 = super.field4101 * 8;
        ++field1898;
        if (arg0) {
            this.method651((byte[]) null, -16, -94, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!k", name = "k", descriptor = "(II)V")
    public static final void method649(int arg0, int arg1) {
        int var2 = -112 / ((83 - arg1) / 39);
        ++field1907;
        if (class218.field3799 == 0) {
            class69.field1363.method801(arg0, true);
        } else {
            class227.field3967 = arg0;
        }
    }

    @OriginalMember(owner = "client!k", name = "l", descriptor = "(II)V")
    public final void method650(int arg0, int arg1) {
        ++field1910;
        if (arg0 == -13721) {
            super.field4087[super.field4101++] = (byte) (this.field1902.method1236(true) + arg1);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([BIIB)V")
    public final void method651(byte[] arg0, int arg1, int arg2, byte arg3) {
        ++field1897;
        for (int var5 = 0; ~var5 > ~arg2; ++var5) {
            arg0[arg1 + var5] = (byte) (super.field4087[super.field4101++] + -this.field1902.method1236(true));
        }
        if (arg3 > -90) {
            field1914 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(I)V")
    public static final void method652(int arg0) {
        class27.method208(true, class222.field3860);
        ++field1906;
        ++class31.field650;
        if (class123.field2192 && class222.field3844) {
            int var1 = class41.field857;
            int var2 = class57.field1149;
            int var3 = var2 - class2.field59;
            int var4 = var1 - class31.field646;
            if (arg0 < 34) {
                method653((class151) null, 45);
            }
            if (var3 < class144.field2601) {
                var3 = class144.field2601;
            }
            if (~var4 > ~class215.field3761) {
                var4 = class215.field3761;
            }
            if (~(class215.field3761 + class63.field1227.field4216) > ~(class222.field3860.field4216 + var4)) {
                var4 = class215.field3761 + class63.field1227.field4216 + -class222.field3860.field4216;
            }
            if (var3 - -class222.field3860.field4215 > class144.field2601 - -class63.field1227.field4215) {
                var3 = -class222.field3860.field4215 + class144.field2601 - -class63.field1227.field4215;
            }
            int var5 = var3 - class217.field3784;
            int var6 = -class204.field3630 + var4;
            int var7 = var3 - class144.field2601 + class63.field1227.field4137;
            int var8 = class222.field3860.field4164;
            int var9 = -class215.field3761 + class63.field1227.field4195 + var4;
            if (class222.field3860.field4157 < class31.field650 && (var8 < var5 || ~(-var8) < ~var5 || var8 < var6 || ~(-var8) < ~var6)) {
                class190.field3358 = true;
            }
            if (class222.field3860.field4228 != null && class190.field3358) {
                class224 var10 = new class224();
                var10.field3895 = class222.field3860.field4228;
                var10.field3905 = class222.field3860;
                var10.field3900 = var7;
                var10.field3897 = var9;
                class110.method664(1785261985, var10);
            }
            if (~class141.field2553 == -1) {
                if (class190.field3358) {
                    if (class222.field3860.field4221 != null) {
                        class224 var11 = new class224();
                        var11.field3895 = class222.field3860.field4221;
                        var11.field3907 = class73.field1422;
                        var11.field3905 = class222.field3860;
                        var11.field3900 = var7;
                        var11.field3897 = var9;
                        class110.method664(1785261985, var11);
                    }
                    if (class73.field1422 != null && class36.method267(12, class222.field3860) != null) {
                        class48.field984.method650(-13721, 58);
                        class48.field984.method1477(127, class222.field3860.field4261);
                        ++class94.field1762;
                        class48.field984.method1473(class73.field1422.field4174, (byte) -41);
                        class48.field984.method1463(-104, class222.field3860.field4174);
                        class48.field984.method1461(class73.field1422.field4261, (byte) 103);
                    }
                } else if ((~class228.field3987 == -2 || class117.method716(92, class117.field2108 + -1)) && class117.field2108 > 2) {
                    class195.method1226(100);
                } else if (class117.field2108 > 0) {
                    class111.method671(class117.field2108 + -1, 42);
                }
                class222.field3860 = null;
            }
        } else {
            if (class31.field650 > 1) {
                class222.field3860 = null;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Loc;I)Z")
    public static final boolean method653(class151 arg0, int arg1) {
        ++field1915;
        if (arg0 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg1 != 1) {
                return false;
            } else {
                while (var2 < class36.field758) {
                    if (arg0.method995((byte) -22, class146.field2616[var2])) {
                        return true;
                    }
                    ++var2;
                }
                return arg0.method995((byte) -22, class228.field3975.field416);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "m", descriptor = "(B)I")
    public final int method654(byte arg0) {
        ++field1908;
        return arg0 != 12 ? 49 : super.field4087[super.field4101++] - this.field1902.method1236(true) & 255;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([II)V")
    public final void method655(int[] arg0, int arg1) {
        ++field1896;
        if (arg1 != 0) {
            this.method647((byte) 80, 29);
        }
        this.field1902 = new class197(arg0);
    }
}
