import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class166 {

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public int field1985 = 128;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public int field1999 = 128;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "Lfv;")
    public static class108 field1988 = new class108(10, 2, 2, 0);

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "F")
    public static float field1998 = 1.0F;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "[I")
    public static int[] field2001 = new int[6];

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public static int field1997 = 0;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "Lvv;")
    public static class293 field2002;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V", line = 7)
    public static void method995(byte arg0) {
        field1988 = null;
        field2002 = null;
        field2001 = null;
        if (arg0 < 125) {
            field1988 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method996(int arg0, int arg1, int arg2) {
        if (arg1 == 30405) {
            field1996++;
            return (class379.field4922[1][arg0][arg2] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)Lvda;", line = 41)
    public final class166 method997(int arg0) {
        field1992++;
        return arg0 == 2 ? new class166(this.field1995, this.field1985, this.field1999, this.field1993, this.field1987, this.field2000) : null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lvda;Z)V", line = 65)
    public final void method998(class166 arg0, boolean arg1) {
        this.field1993 = arg0.field1993;
        this.field1987 = arg0.field1987;
        this.field2000 = arg0.field2000;
        this.field1995 = arg0.field1995;
        this.field1999 = arg0.field1999;
        field1994++;
        this.field1985 = arg0.field1985;
        if (!arg1) {
            field1988 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(I)V", line = 96)
    public class166(int arg0) {
        this.field1995 = arg0;
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(IIIIII)V", line = 103)
    private class166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1995 = arg0;
        this.field1985 = arg1;
        this.field1987 = arg4;
        this.field2000 = arg5;
        this.field1999 = arg2;
        this.field1993 = arg3;
    }
}
