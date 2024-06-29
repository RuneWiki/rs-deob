import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class120 extends class46 {

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    private final int field2011;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    private final int field2012;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    private final int field2004;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    private final int field2010;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lmh;")
    public static class62 field2002 = class201.method1405(true, "<br>");

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "[I")
    public static int[] field2005 = new int[] { 2, -2, 8, 6, 0, 5, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 14, 0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 5, -1, 8, 0, 10, 0, 0, -1, 0, 6, 1, 0, 6, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 0, 8, 7, 3, 0, 15, 5, 5, 2, -2, 0, 0, 6, 0, 0, 0, 5, 0, 0, 0, 0, -1, 5, -2, 2, 0, 0, 0, 6, 0, 0, 7, -1, 0, 0, 0, 14, 0, 0, 15, 8, 0, 3, 0, 0, 4, 0, 5, 0, 0, 0, 0, 0, 0, 0, 9, 0, 1, 0, 1, 0, -2, 12, -2, 4, 0, 0, 1, 0, 0, 0, 0, 0, 20, 0, 0, 0, -1, 0, 0, 0, -1, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -1, 0, 0, 0, 0, -1, 0, 7, 0, 4, 6, -1, 6, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 10, 0, 0, 10, 12, 0, 0, 0, 0, 7, 8, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 8, 4, 0, 0, 0, 2, 0, 0, 6, 0, 0, 0, 0, -1, 0, -1, -1, 0, 2, 0, 0, 0, -2, 0, -2, 0, 0, -2, -2, 0, 0, 0, 24, 0, 10, 0, -1, 6, 0, 0, 0, 0, 0, -2, 9, -1, 0, -2, 0, 0 };

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "J")
    public static volatile long field2013 = 0L;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V", line = 13)
    public static final void method927(int arg0, int arg1) {
        if (arg0 != 7) {
            field2000 = 24;
        }
        field2009++;
        class229.field3984.method1390(arg1, -80);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIII)V", line = 23)
    public class120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2011 = arg3;
        this.field2012 = arg0;
        this.field2004 = arg1;
        this.field2010 = arg2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZI)V", line = 36)
    public final void method298(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field2007++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 51)
    public static final void method928(int arg0) {
        if (arg0 != 0) {
            field2002 = (class62) null;
        }
        field2001++;
        class46.field688.method1395((byte) -43);
        class183.field2916.method1395((byte) -43);
        class36.field498.method1395((byte) -43);
        class71.field1078.method1395((byte) -43);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)V", line = 79)
    public final void method301(int arg0, byte arg1, int arg2) {
        field2008++;
        int var4 = this.field2012 * arg0 >> 12;
        if (arg1 != -13) {
            this.method301(104, (byte) -73, -8);
        }
        int var5 = this.field2010 * arg0 >> 12;
        int var6 = this.field2011 * arg2 >> 12;
        int var7 = this.field2004 * arg2 >> 12;
        class101.method806(this.field687, var7, (byte) 102, var5, var6, var4);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 99)
    public static void method929(byte arg0) {
        int var1 = -66 % ((-arg0 - 48) / 33);
        field2005 = null;
        field2002 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V", line = 116)
    public final void method297(int arg0, int arg1, int arg2) {
        if (arg2 == 31462) {
            field2003++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V", line = 126)
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= -5) {
            method929((byte) 81);
        }
        field2014++;
        if (class176.field2819 <= arg2 && arg3 <= class52.field755 && arg1 >= class99.field1630 && arg4 <= class81.field1348) {
            class114.method894(arg3, arg5, -38, arg1, arg2, arg4);
        } else {
            class228.method1612(arg1, arg3, arg5, arg4, -116, arg2);
        }
    }
}
