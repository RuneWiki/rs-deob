import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class106 extends class241 {

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Loh;")
    private static class263 field1990 = class253.method1681(-127, "Nov");

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Loh;")
    private static class263 field1991 = class253.method1681(-121, "Feb");

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Loh;")
    private static class263 field1996 = class253.method1681(-119, "Jan");

    @OriginalMember(owner = "client!de", name = "F", descriptor = "Loh;")
    private static class263 field2007 = class253.method1681(-117, "Apr");

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Loh;")
    private static class263 field2001 = class253.method1681(-123, "Oct");

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Loh;")
    private static class263 field2000 = class253.method1681(-121, "May");

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Loh;")
    private static class263 field1993 = class253.method1681(-125, "Jun");

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Loh;")
    private static class263 field2010 = class253.method1681(-117, "Sep");

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Loh;")
    private static class263 field2004 = class253.method1681(-121, "Jul");

    @OriginalMember(owner = "client!de", name = "M", descriptor = "[I")
    public static int[] field2014 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!de", name = "A", descriptor = "[Loh;")
    public static class263[] field2002 = new class263[100];

    @OriginalMember(owner = "client!de", name = "x", descriptor = "Loh;")
    private static class263 field1999 = class253.method1681(-122, "Aug");

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Loh;")
    private static class263 field2011 = class253.method1681(-120, "Mar");

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Loh;")
    private static class263 field1992 = class253.method1681(-122, "Please remove ");

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Loh;")
    private static class263 field2006 = class253.method1681(-126, "Dec");

    @OriginalMember(owner = "client!de", name = "L", descriptor = "Loh;")
    public static class263 field2013 = field1992;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field2003 = 0;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "Loh;")
    public static class263 field2015 = field1992;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "[Loh;")
    public static class263[] field2008 = new class263[] { field1996, field1991, field2011, field2007, field2000, field1993, field2004, field1999, field2010, field2001, field1990, field2006 };

    @OriginalMember(owner = "client!de", name = "R", descriptor = "[I")
    public static int[] field2018 = new int[500];

    @OriginalMember(owner = "client!de", name = "P", descriptor = "F")
    public static float field2016;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([Loh;III)Loh;")
    public static final class263 method710(class263[] arg0, int arg1, int arg2, int arg3) {
        field1989++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class56.field1167;
            }
            var4 += arg0[arg2 + var5].field4591;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class263 var10 = arg0[arg2 + var8];
            class149.method977(var10.field4605, 0, var7, var6, var10.field4591);
            var6 += var10.field4591;
        }
        if (arg3 != 28777) {
            method710((class263[]) null, -110, 98, -5);
        }
        class263 var9 = new class263();
        var9.field4605 = var7;
        var9.field4591 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method711(boolean arg0, int arg1, Object arg2) {
        field2005++;
        if (arg1 <= 80) {
            return null;
        } else if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class114.method746(var3, (byte) -117) : var3;
        } else if (arg2 instanceof class258) {
            class258 var4 = (class258) arg2;
            return var4.method837(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZ)Z")
    public final boolean method712(int arg0, int arg1, boolean arg2) {
        field1998++;
        if (!arg2) {
            field2004 = null;
        }
        return this.field1997 <= arg1 && this.field1995 >= arg1 && this.field2012 <= arg0 && this.field1994 >= arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z")
    public static final boolean method713(int arg0, int arg1, int arg2) {
        if (arg2 == -11267) {
            field2009++;
            return (arg0 >> arg1 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIII)V")
    public class106(int arg0, int arg1, int arg2, int arg3) {
        this.field1994 = arg3;
        this.field1995 = arg2;
        this.field2012 = arg1;
        this.field1997 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static void method714(int arg0) {
        field2010 = null;
        field2014 = null;
        field2004 = null;
        field1991 = null;
        field2018 = null;
        if (arg0 != 1) {
            method710((class263[]) null, -71, 90, 3);
        }
        field2011 = null;
        field1993 = null;
        field2015 = null;
        field1990 = null;
        field1996 = null;
        field2002 = null;
        field2008 = null;
        field2007 = null;
        field1999 = null;
        field2001 = null;
        field2006 = null;
        field2013 = null;
        field2000 = null;
        field1992 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILdd;Ldd;ZI)I")
    public static final int method715(int arg0, class130 arg1, class130 arg2, boolean arg3, int arg4) {
        field2017++;
        if (arg0 == 1) {
            int var5 = arg2.field1765;
            int var6 = arg1.field1765;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg0 == 2) {
            return arg1.method842(23626).field1379.method1749((byte) 96, arg2.method842(23626).field1379);
        } else if (arg0 == 3) {
            if (arg1.field2395.method1788(-26006, class60.field1231)) {
                if (arg2.field2395.method1788(-26006, class60.field1231)) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field2395.method1788(arg4 - 26000, class60.field1231)) {
                return arg3 ? 1 : -1;
            } else {
                return arg1.field2395.method1749((byte) 87, arg2.field2395);
            }
        } else if (arg0 == 4) {
            if (arg1.method627(arg4 + 14)) {
                return arg2.method627(8) ? 0 : 1;
            } else if (arg2.method627(8)) {
                return -1;
            } else {
                return 0;
            }
        } else if (~arg0 == arg4) {
            if (arg1.method631(74)) {
                return arg2.method631(105) ? 0 : 1;
            } else if (arg2.method631(87)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg1.method628(arg4 ^ 0x73)) {
                return arg2.method628(-111) ? 0 : 1;
            } else if (arg2.method628(-95)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 7) {
            return arg1.field2397 - arg2.field2397;
        } else if (arg1.method629((byte) 26)) {
            return arg2.method629((byte) 26) ? 0 : 1;
        } else if (arg2.method629((byte) 26)) {
            return -1;
        } else {
            return 0;
        }
    }
}
