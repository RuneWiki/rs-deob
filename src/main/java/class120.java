import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class120 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "B")
    private byte field2010;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lce;")
    public static class126 field2009 = class206.method1445(-7923, "vert:");

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "J")
    public static long field2013 = 0L;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[I")
    public static int[] field2018;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[BI)I", line = 28)
    public static final int method787(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 0) {
            field2013 = -72L;
        }
        field2020++;
        return class298.method2007(arg0, 0, arg1, 785922280);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)I", line = 43)
    public final int method788(byte arg0) {
        if (arg0 == -66) {
            field2012++;
            return this.field2010 & 0x7;
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I", line = 56)
    public final int method789(int arg0) {
        field2016++;
        if (arg0 == 8) {
            return (this.field2010 & 0x8) == 8 ? 1 : 0;
        } else {
            return 66;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 75)
    public static void method790(int arg0) {
        if (arg0 != -30597) {
            method790(-5);
        }
        field2018 = null;
        field2009 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 90)
    public class120() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lbb;)V", line = 92)
    public class120(class134 arg0) {
        this.field2010 = arg0.method977(19773);
        this.field2015 = arg0.method942(true);
        this.field2017 = arg0.method957(496113200);
        this.field2011 = arg0.method957(496113200);
        this.field2021 = arg0.method957(496113200);
        this.field2014 = arg0.method957(496113200);
    }
}
