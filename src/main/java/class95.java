import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class95 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field1996 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field1994 = 0;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2003 = 5063219;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[Lgb;")
    public static class57[] field2007 = new class57[2048];

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2004 = 0;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lcd;")
    private static class23 field2009 = class54.method414("Loading wordpack )2 ", -1);

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lcd;")
    public static class23 field2012 = class54.method414("bevor Sie den Vorgang wiederholen)3", -1);

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Lcd;")
    public static class23 field2013 = field2009;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field2008;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lsh;")
    public class169 field2010;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lkh;")
    public static class97 field2000;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    public static int[] field1995;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static final void method623(boolean arg0) {
        field2001++;
        if (arg0) {
            method625(100);
        }
        for (int var1 = 0; var1 < class67.field1583; var1++) {
            int var2 = class8.field161[var1];
            class182 var3 = class91.field1944[var2];
            if (var3 != null) {
                class51.method399(var3.field3595.field69, (byte) -13, var3);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILfa;)Z")
    public static final boolean method624(int arg0, class47 arg1) {
        field2002++;
        if (arg0 != -1) {
            method625(58);
        }
        if (class57.field1338) {
            if (class141.method909(arg1, 99) != 0) {
                return false;
            }
            if (arg1.field1127 == 0) {
                return false;
            }
        }
        return arg1.field1143;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method625(int arg0) {
        field2012 = null;
        field2007 = null;
        field2009 = null;
        field2000 = null;
        field1995 = null;
        field2013 = null;
        if (arg0 != -1) {
            field2007 = null;
        }
    }
}
