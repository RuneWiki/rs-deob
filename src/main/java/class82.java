import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 extends class66 {

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "Z")
    public boolean field1982 = false;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    private int field1988 = 0;

    @OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
    private int field1996 = 0;

    @OriginalMember(owner = "client!lf", name = "nb", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!lf", name = "sb", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!lf", name = "Ab", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "Lkc;")
    private class72 field1979;

    @OriginalMember(owner = "client!lf", name = "mb", descriptor = "Lv;")
    public static class146 field1993 = class159.method1226((byte) -37, "(U0a )2 in: ");

    @OriginalMember(owner = "client!lf", name = "ob", descriptor = "[I")
    public static int[] field1995 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "Lfd;")
    public static class40 field1990 = new class40(5000);

    @OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
    public static int field2002 = 0;

    @OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
    public static int field2006 = 0;

    @OriginalMember(owner = "client!lf", name = "yb", descriptor = "Lv;")
    private static class146 field2005 = class159.method1226((byte) -37, "yellow:");

    @OriginalMember(owner = "client!lf", name = "ub", descriptor = "Lv;")
    public static class146 field2001 = field2005;

    @OriginalMember(owner = "client!lf", name = "xb", descriptor = "Lv;")
    public static class146 field2004 = field2005;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!lf", name = "kb", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!lf", name = "lb", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!lf", name = "rb", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!lf", name = "tb", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lt;")
    public static class132 field1980;

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "Ldc;")
    public static class25 field1989;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "Lf;")
    public static class36 field1985;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
    public final void method622(int arg0, byte arg1) {
        field2000++;
        if (this.field1982) {
            return;
        }
        this.field1988 += arg0;
        if (arg1 >= -25) {
            return;
        }
        while (this.field1979.field1680[this.field1996] < this.field1988) {
            this.field1988 -= this.field1979.field1680[this.field1996];
            this.field1996++;
            if (this.field1979.field1651.length <= this.field1996) {
                this.field1982 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JI)V")
    public static final void method623(long arg0, int arg1) {
        field1983++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg1 != 1) {
            method625((byte) 33, null);
        }
        while (var3 < class54.field1233) {
            if (class37.field838[var3] == arg0) {
                class54.field1233--;
                class31.field660++;
                for (int var4 = var3; var4 < class54.field1233; var4++) {
                    class37.field838[var4] = class37.field838[var4 + 1];
                    class90.field2138[var4] = class90.field2138[var4 + 1];
                }
                class87.field2071 = class44.field1016;
                field1990.method265((byte) -85, 126);
                field1990.method746(arg0, 1101310632);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
    public static void method624(byte arg0) {
        field2005 = null;
        if (arg0 != -7) {
            method624((byte) -83);
        }
        field1990 = null;
        field2004 = null;
        field1980 = null;
        field1995 = null;
        field1985 = null;
        field1989 = null;
        field1993 = null;
        field2001 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Lu;")
    public final class139 method255(byte arg0) {
        class116 var2 = class100.method830(this.field1994, -18626);
        field1984++;
        class139 var3;
        if (this.field1982) {
            var3 = var2.method891(19631, -1);
        } else {
            var3 = var2.method891(19631, this.field1996);
        }
        if (arg0 >= -90) {
            field1980 = null;
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLla;)V")
    public static final void method625(byte arg0, class77 arg1) {
        if (arg0 != -20) {
            field1980 = null;
        }
        class58.field1292 = arg1;
        field1998++;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIII)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1994 = arg0;
        this.field1997 = arg3;
        this.field1999 = arg5 + arg6;
        this.field1981 = arg4;
        this.field2007 = arg2;
        this.field1986 = arg1;
        int var8 = class100.method830(this.field1994, -18626).field2710;
        if (var8 == -1) {
            this.field1982 = true;
        } else {
            this.field1982 = false;
            this.field1979 = class141.method1052(true, var8);
        }
    }
}
