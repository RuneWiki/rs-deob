import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class82 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lhe;")
    public static class54 field2009 = class6.method58("Mem:", false);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field2011 = 2301979;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lhe;")
    public static class54 field2012 = class6.method58("Schlie-8en", false);

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2014 = 0;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lhe;")
    public static class54 field2015 = class6.method58("Lade Sprites )2 ", false);

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lhe;")
    public static class54 field2013 = class6.method58(" <col=ffff00>", false);

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lhe;")
    public static class54 field2016 = class6.method58("<col=ff7000>", false);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2010 = Calendar.getInstance();

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[B)V")
    public abstract void method625(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method626(boolean arg0);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method627(int arg0) {
        field2010 = null;
        field2012 = null;
        field2009 = null;
        field2013 = null;
        field2016 = null;
        field2015 = null;
        if (arg0 > -109) {
            method627(102);
        }
    }
}
