import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class115 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Li;")
    public static class88 field2075 = class208.method1425(105, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Li;")
    public static class88 field2077 = class208.method1425(105, "mapdots");

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Li;")
    private static class88 field2081 = class208.method1425(105, " from your friend list first)3");

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Li;")
    public static class88 field2082 = class208.method1425(105, "(U1");

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Li;")
    private static class88 field2079 = class208.method1425(105, "Free world");

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Li;")
    public static class88 field2087 = field2081;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Li;")
    public static class88 field2076 = field2079;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Li;")
    public static class88 field2083 = class208.method1425(105, "T");

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Li;")
    private static class88 field2074 = class208.method1425(105, "Loading fonts )2 ");

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2073 = 0;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Li;")
    public static class88 field2078 = field2074;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[J")
    public static long[] field2088 = new long[200];

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lkh;")
    public static final class117 method785(int arg0, int arg1) {
        field2085++;
        class117 var2 = (class117) class149.field2858.method666((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 4) {
            field2082 = null;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class62.field1146.method941((byte) 56, arg0, 0);
        } else {
            var3 = class66.field1199.method941((byte) 56, arg0 & 0x7FFF, 0);
        }
        class117 var4 = new class117();
        if (var3 != null) {
            var4.method796((byte) -45, new class46(var3));
        }
        if (arg0 >= 32768) {
            var4.method799(true);
        }
        class149.field2858.method664((long) arg0, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method786(int arg0) {
        field2083 = null;
        field2081 = null;
        field2087 = null;
        field2076 = null;
        if (arg0 != 0) {
            field2086 = 18;
        }
        field2078 = null;
        field2079 = null;
        field2082 = null;
        field2074 = null;
        field2088 = null;
        field2077 = null;
        field2075 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static final void method787(byte arg0) {
        field2089++;
        if (class33.field556 != null) {
            class33.field556.method919(true);
            class33.field556 = null;
        }
        class27.method167((byte) 61);
        class85.method579();
        for (int var1 = 0; var1 < 4; var1++) {
            class166.field3202[var1].method644((byte) 15);
        }
        class201.method1380(-83);
        System.gc();
        class117.method797(25335, 2);
        int var2 = 14 % ((arg0 + 76) / 46);
        class110.field2014 = false;
        class2.field25 = -1;
        class44.method288(-25844);
        class131.method883(10, 65536);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2084++;
        int var7 = arg2 + arg4;
        int var8 = arg3 - arg2;
        int var9 = arg2 + arg6;
        int var10 = arg0 - arg2;
        for (int var11 = arg4; var11 < var7; var11++) {
            class230.method1536(arg6, arg1, -7, arg0, class3.field42[var11]);
        }
        for (int var12 = arg3; var12 > var8; var12--) {
            class230.method1536(arg6, arg1, -7, arg0, class3.field42[var12]);
        }
        int var13 = var7;
        if (arg5) {
            return;
        }
        while (var8 >= var13) {
            int[] var14 = class3.field42[var13];
            class230.method1536(arg6, arg1, -7, var9, var14);
            class230.method1536(var10, arg1, -7, arg0, var14);
            var13++;
        }
    }
}
