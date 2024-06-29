import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class128 extends class256 {

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    private final int field2003;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    private final int field1998;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    private final int field1992;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    private final int field1993;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "Luf;")
    private static class168 field2000 = class148.method1019(-1720, " is already on your friend list)3");

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Luf;")
    public static class168 field1999 = class148.method1019(-1720, "Benutzen");

    @OriginalMember(owner = "client!al", name = "x", descriptor = "Luf;")
    public static class168 field2001 = class148.method1019(-1720, ":assistreq:");

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Luf;")
    public static class168 field1990 = field2000;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Lej;")
    public static class204 field1995 = new class204(50);

    @OriginalMember(owner = "client!al", name = "B", descriptor = "Luf;")
    public static class168 field2005 = class148.method1019(-1720, "not yet implemented");

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "[I")
    public static int[] field2004;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 9)
    public static void method902(byte arg0) {
        int var1 = -89 / ((-arg0 - 58) / 54);
        field2001 = null;
        field2000 = null;
        field1999 = null;
        field1990 = null;
        field2004 = null;
        field1995 = null;
        field2005 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIII)V", line = 24)
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2003 = arg3;
        this.field1998 = arg1;
        this.field1992 = arg2;
        this.field1993 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V", line = 36)
    public final void method903(int arg0, int arg1, int arg2) {
        field1994++;
        int var4 = this.field1993 * arg0 >> 12;
        int var5 = this.field1992 * arg0 >> 12;
        int var6 = this.field1998 * arg1 >> 12;
        if (arg2 > -28) {
            field2004 = (int[]) null;
        }
        int var7 = this.field2003 * arg1 >> 12;
        class111.method824(var7, -56, this.field4356, var5, var4, this.field4351, var6);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(BII)V", line = 59)
    public final void method904(byte arg0, int arg1, int arg2) {
        if (arg0 != 117) {
            method902((byte) -64);
        }
        int var4 = this.field1993 * arg2 >> 12;
        field1997++;
        int var5 = this.field1992 * arg2 >> 12;
        int var6 = this.field2003 * arg1 >> 12;
        int var7 = this.field1998 * arg1 >> 12;
        class127.method899(var6, (byte) -65, var7, var5, this.field4351, var4, this.field4352, this.field4356);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V", line = 80)
    public final void method905(int arg0, byte arg1, int arg2) {
        field1996++;
        if (arg1 <= 10) {
            this.method905(54, (byte) 125, -56);
        }
        int var4 = this.field1998 * arg0 >> 12;
        int var5 = this.field1992 * arg2 >> 12;
        int var6 = this.field1993 * arg2 >> 12;
        int var7 = this.field2003 * arg0 >> 12;
        class251.method1717(var7, this.field4352, false, var4, var6, var5);
    }
}
