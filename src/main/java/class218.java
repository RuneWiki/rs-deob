import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class218 {

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lji;")
    public class106 field3803 = new class106();

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Loc;")
    public static class151 field3798 = class137.method873(2, ":assistreq:");

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Loc;")
    public static class151 field3797 = class137.method873(2, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
    public static int[] field3800 = new int[2048];

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Loc;")
    public static class151 field3796 = class137.method873(2, "Versteckt");

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Loc;")
    public static class151 field3806 = class137.method873(2, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3799 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Lji;")
    private class106 field3808;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[[[I")
    public static int[][][] field3792;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Lji;")
    public final class106 method1352(int arg0) {
        if (arg0 != 46) {
            return null;
        }
        field3805++;
        class106 var2 = this.field3808;
        if (this.field3803 == var2) {
            this.field3808 = null;
            return null;
        } else {
            this.field3808 = var2.field1889;
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V")
    public static final void method1353(long arg0, int arg1) {
        field3791++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = arg1; var3 < class36.field758; var3++) {
            if (class233.field4290[var3] == arg0) {
                class11.field204++;
                class36.field758--;
                for (int var4 = var3; var4 < class36.field758; var4++) {
                    class146.field2616[var4] = class146.field2616[var4 + 1];
                    class9.field138[var4] = class9.field138[var4 + 1];
                    class57.field1147[var4] = class57.field1147[var4 + 1];
                    class233.field4290[var4] = class233.field4290[var4 + 1];
                    class50.field1014[var4] = class50.field1014[var4 + 1];
                }
                class75.field1441 = class1.field35;
                class48.field984.method650(-13721, 46);
                class48.field984.method1458((byte) 70, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lji;ILji;)V")
    public final void method1354(class106 arg0, int arg1, class106 arg2) {
        if (arg0.field1889 != null) {
            arg0.method636(arg1 - 1950);
        }
        field3807++;
        arg0.field1887 = arg2;
        arg0.field1889 = arg2.field1889;
        if (arg1 != 2048) {
            method1353(-34L, 56);
        }
        arg0.field1889.field1887 = arg0;
        arg0.field1887.field1889 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lji;")
    public final class106 method1355(int arg0) {
        field3794++;
        class106 var2 = this.field3803.field1887;
        if (arg0 != -12348) {
            this.method1357(-32);
        }
        if (this.field3803 == var2) {
            return null;
        } else {
            var2.method636(76);
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lji;I)V")
    public final void method1356(class106 arg0, int arg1) {
        field3795++;
        if (arg0.field1889 != null) {
            arg0.method636(arg1 + 87);
        }
        if (arg1 != 1) {
            this.method1356(null, 39);
        }
        arg0.field1889 = this.field3803;
        arg0.field1887 = this.field3803.field1887;
        arg0.field1889.field1887 = arg0;
        arg0.field1887.field1889 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public final void method1357(int arg0) {
        field3801++;
        if (arg0 != 4) {
            method1363(-86, 93, -80, -31, 89, -85, 87, -71, null, -32, false, 78L);
        }
        while (true) {
            class106 var2 = this.field3803.field1887;
            if (this.field3803 == var2) {
                return;
            }
            var2.method636(arg0 + 64);
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lji;")
    public final class106 method1358(int arg0) {
        if (arg0 != -29726) {
            field3800 = null;
        }
        field3804++;
        class106 var2 = this.field3803.field1887;
        if (this.field3803 == var2) {
            this.field3808 = null;
            return null;
        } else {
            this.field3808 = var2.field1887;
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Lji;")
    public final class106 method1359(int arg0) {
        field3789++;
        class106 var2 = this.field3803.field1889;
        if (this.field3803 == var2) {
            this.field3808 = null;
            return null;
        } else {
            int var3 = -52 % ((33 - arg0) / 55);
            this.field3808 = var2.field1889;
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Lji;")
    public final class106 method1360(boolean arg0) {
        field3793++;
        if (!arg0) {
            return null;
        }
        class106 var2 = this.field3808;
        if (this.field3803 == var2) {
            this.field3808 = null;
            return null;
        } else {
            this.field3808 = var2.field1887;
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lji;B)V")
    public final void method1361(class106 arg0, byte arg1) {
        if (arg0.field1889 != null) {
            arg0.method636(105);
        }
        arg0.field1889 = this.field3803.field1889;
        arg0.field1887 = this.field3803;
        field3802++;
        arg0.field1889.field1887 = arg0;
        arg0.field1887.field1889 = arg0;
        if (arg1 != 71) {
            field3799 = 21;
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public static void method1362(int arg0) {
        field3798 = null;
        if (arg0 != -18219) {
            method1364(120, 75, -2, 41);
        }
        field3792 = null;
        field3796 = null;
        field3800 = null;
        field3797 = null;
        field3806 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIILwg;IZJ)Z")
    public static final boolean method1363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class235 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class228.field4032 || var20 >= class225.field3924) {
                    return false;
                }
                class72 var21 = class95.field1776[arg0][var13][var20];
                if (var21 != null && var21.field1397 >= 5) {
                    return false;
                }
            }
        }
        class124 var14 = new class124();
        var14.field2230 = arg11;
        var14.field2223 = arg0;
        var14.field2226 = arg5;
        var14.field2215 = arg6;
        var14.field2235 = arg7;
        var14.field2220 = arg8;
        var14.field2217 = arg9;
        var14.field2224 = arg1;
        var14.field2214 = arg2;
        var14.field2218 = arg1 + arg3 - 1;
        var14.field2225 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class95.field1776[var18][var15][var16] == null) {
                        class95.field1776[var18][var15][var16] = new class72(var18, var15, var16);
                    }
                }
                class72 var19 = class95.field1776[arg0][var15][var16];
                var19.field1405[var19.field1397] = var14;
                var19.field1404[var19.field1397] = var17;
                var19.field1395 |= var17;
                var19.field1397++;
            }
        }
        if (arg10) {
            class219.field3817[class44.field919++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public static final void method1364(int arg0, int arg1, int arg2, int arg3) {
        class72 var4 = class95.field1776[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class213 var5 = var4.field1419;
        if (var5 != null) {
            var5.field3738 = var5.field3738 * arg3 / 16;
            var5.field3741 = var5.field3741 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class218() {
        this.field3803.field1887 = this.field3803;
        this.field3803.field1889 = this.field3803;
    }
}
