import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class140 {

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "B")
    public byte field1996;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lpd;")
    public class140 field1984;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field1982 = 0;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Z")
    public static boolean field1986 = false;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Z")
    public static boolean field1998 = false;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "S")
    public static short field2003 = 32767;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Ltc;")
    public static class196 field1993 = new class196();

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "Z")
    public static boolean field2005 = false;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Lre;")
    public static class357 field2004 = new class357();

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "F")
    public static float field2007 = 1024.0F;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[Llf;")
    public static class130[] field1992;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "[[[B")
    public static byte[][][] field2006;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        field2006 = null;
        if (arg0 != 14033) {
            field1982 = -62;
        }
        field2004 = null;
        field1993 = null;
        field1992 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIB)V")
    public class140(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1996 = arg4;
        this.field1995 = arg3;
        this.field1983 = arg0;
        this.field1991 = arg1;
        this.field1985 = arg2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
    public static final int method959(int arg0, int arg1, int arg2) {
        field1987++;
        if (arg0 == 4 || arg0 == 5) {
            return class289.field3996[arg1 & 0x3];
        } else {
            if (arg2 >= -116) {
                field2003 = -88;
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lpd;I)V")
    public class140(class140 arg0, int arg1) {
        this.field1984 = arg0;
        this.field1985 = this.field1984.field1985 + arg1;
        this.field1996 = this.field1984.field1996;
        this.field1983 = this.field1984.field1983;
        this.field1991 = this.field1984.field1991 + arg1;
        this.field1995 = this.field1984.field1995 + arg1;
    }
}
