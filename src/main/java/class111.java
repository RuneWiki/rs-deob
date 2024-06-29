import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class111 extends class141 {

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    private final int field1941;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    private final int field1935;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    private final int field1942;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    private final int field1940;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Lvm;")
    public static class297 field1939 = new class297(30);

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "J")
    public static long field1949 = 0L;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "Z")
    public static boolean field1946 = true;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "Lke;")
    public static class256 field1950 = class316.method2202(" weitere Optionen", 27626);

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Lng;")
    public static class138 field1934;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "[I")
    public static int[] field1945;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "[Z")
    public static boolean[] field1944;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)V", line = 6)
    public final void method634(int arg0, int arg1, int arg2) {
        field1932++;
        if (arg1 != -1) {
            method769(true);
        }
        int var4 = this.field1935 * arg2 >> 12;
        int var5 = this.field1942 * arg2 >> 12;
        int var6 = this.field1941 * arg0 >> 12;
        int var7 = this.field1940 * arg0 >> 12;
        class38.method294(var6, var5, var7, 0, var4, this.field2485);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)V", line = 25)
    public final void method630(int arg0, int arg1, int arg2) {
        if (arg1 != 15015) {
            method769(true);
        }
        field1933++;
        int var4 = this.field1935 * arg0 >> 12;
        int var5 = this.field1941 * arg2 >> 12;
        int var6 = this.field1942 * arg0 >> 12;
        int var7 = this.field1940 * arg2 >> 12;
        class237.method1589(this.field2482, (byte) -101, var5, var6, this.field2485, var4, this.field2478, var7);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 47)
    public static void method769(boolean arg0) {
        field1945 = null;
        field1939 = null;
        if (!arg0) {
            field1934 = null;
            field1944 = null;
            field1950 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIII)V", line = 63)
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1941 = arg1;
        this.field1935 = arg0;
        this.field1942 = arg2;
        this.field1940 = arg3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V", line = 98)
    public final void method629(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field1951 = -118;
        }
        field1936++;
    }
}
