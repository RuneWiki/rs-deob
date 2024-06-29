import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class90 extends class26 {

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Ldd;")
    public static class35 field2000 = class180.method1196((byte) -85, "Okay");

    @OriginalMember(owner = "client!ja", name = "Bb", descriptor = "I")
    public static int field2003 = 0;

    @OriginalMember(owner = "client!ja", name = "Hb", descriptor = "Ldd;")
    public static class35 field2009 = class180.method1196((byte) -9, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!ja", name = "Cb", descriptor = "Ldd;")
    private static class35 field2004 = class180.method1196((byte) 127, "Members only world");

    @OriginalMember(owner = "client!ja", name = "Kb", descriptor = "Ldd;")
    private static class35 field2012 = class180.method1196((byte) 126, "Unable to find ");

    @OriginalMember(owner = "client!ja", name = "Lb", descriptor = "Ldd;")
    public static class35 field2013 = field2012;

    @OriginalMember(owner = "client!ja", name = "Mb", descriptor = "I")
    public static int field2014 = 0;

    @OriginalMember(owner = "client!ja", name = "Pb", descriptor = "Ldd;")
    public static class35 field2017 = field2004;

    @OriginalMember(owner = "client!ja", name = "Ob", descriptor = "Ldd;")
    public static class35 field2016 = class180.method1196((byte) 127, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!ja", name = "Tb", descriptor = "Ldd;")
    public static class35 field2021 = class180.method1196((byte) 127, "scrollen:");

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!ja", name = "zb", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ja", name = "Ab", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ja", name = "Db", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ja", name = "Eb", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ja", name = "Fb", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ja", name = "Gb", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ja", name = "Ib", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ja", name = "Jb", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ja", name = "Qb", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ja", name = "Rb", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ja", name = "Sb", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ja", name = "Nb", descriptor = "Lqh;")
    private class160 field2015;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "(B)V")
    public static final void method658(byte arg0) {
        class35.field746 = new class107(32);
        if (arg0 > -81) {
            method666(false, 106);
        }
        ++field2002;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IZ)V")
    public final void method659(int arg0, boolean arg1) {
        if (!arg1) {
            this.method664(true, -68);
        }
        ++field2006;
        super.field529[super.field527++] = (byte) (arg0 + this.field2015.method1069(-31078));
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(B)V")
    public static final void method660(byte arg0) {
        if (arg0 == 77) {
            class45.field971.method813(-112);
            ++field2019;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)I")
    public final int method661(int arg0, byte arg1) {
        ++field2018;
        int var3 = -(this.field1999 & 7) + 8;
        int var4 = this.field1999 >> 3;
        if (arg1 != -79) {
            field2017 = null;
        }
        this.field1999 += arg0;
        int var5 = 0;
        while (arg0 > var3) {
            var5 += (class30.field602[var3] & super.field529[var4++]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (class30.field602[var3] & super.field529[var4]) + var5;
        } else {
            var6 = (super.field529[var4] >> -arg0 + var3 & class30.field602[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
    public class90(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "(I)V")
    public final void method662(int arg0) {
        if (arg0 <= 32) {
            this.method662(-49);
        }
        ++field2008;
        this.field1999 = super.field527 * 8;
    }

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(B)V")
    public static void method663(byte arg0) {
        field2012 = null;
        field2009 = null;
        field2004 = null;
        field2000 = null;
        field2017 = null;
        field2016 = null;
        int var1 = -92 % ((arg0 - 51) / 59);
        field2013 = null;
        field2021 = null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(ZI)I")
    public final int method664(boolean arg0, int arg1) {
        if (arg0) {
            return 122;
        } else {
            ++field2010;
            return arg1 * 8 + -this.field1999;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B[I)V")
    public final void method665(byte arg0, int[] arg1) {
        this.field2015 = new class160(arg1);
        ++field2001;
        if (arg0 != 102) {
            field2021 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(ZI)Ldd;")
    public static final class35 method666(boolean arg0, int arg1) {
        ++field2005;
        class35 var2 = new class35();
        if (!arg0) {
            field2012 = null;
        }
        var2.field758 = 0;
        var2.field730 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(Z)V")
    public final void method667(boolean arg0) {
        super.field527 = (this.field1999 + 7) / 8;
        ++field2020;
        if (arg0) {
            field2003 = 117;
        }
    }

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "(I)I")
    public final int method668(int arg0) {
        ++field2011;
        return arg0 != 255 ? -6 : super.field529[super.field527++] + -this.field2015.method1069(arg0 ^ -31131) & 255;
    }
}
