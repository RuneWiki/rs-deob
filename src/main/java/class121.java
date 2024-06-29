import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class121 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1884 = 0;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[J")
    public static long[] field1890 = new long[200];

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1892 = 0;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lna;")
    public static class26 field1895 = class69.method505("null", (byte) -126);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lna;")
    private static class26 field1898 = class69.method505(" has logged out)3", (byte) -121);

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lna;")
    private static class26 field1891 = class69.method505("purple:", (byte) -119);

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lna;")
    public static class26 field1889 = field1891;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lna;")
    public static class26 field1886 = field1898;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lna;")
    public static class26 field1899 = field1891;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lqf;")
    public static class148 field1888;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V", line = 13)
    public static final void method836(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= 0 && arg4 >= 0 && arg6 < 103 && arg4 < 103) {
            if (arg5 == 0) {
                class267 var8 = class307.method2149(arg0, arg6, arg4);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field4408 >>> 32);
                    if (arg3 == 2) {
                        var8.field4409 = new class109(var9, 2, arg2 + 4, arg0, arg6, arg4, arg7, false, var8.field4409);
                        var8.field4412 = new class109(var9, 2, arg2 + 1 & 0x3, arg0, arg6, arg4, arg7, false, var8.field4412);
                    } else {
                        var8.field4409 = new class109(var9, arg3, arg2, arg0, arg6, arg4, arg7, false, var8.field4409);
                    }
                }
            }
            if (arg5 == 1) {
                class164 var10 = class229.method1541(arg0, arg6, arg4);
                if (var10 != null) {
                    int var11 = (int) (var10.field2549 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 4 || arg3 == 5) {
                        var10.field2550 = new class109(var11, 4, arg2, arg0, arg6, arg4, arg7, false, var10.field2550);
                    } else if (arg3 == 6) {
                        var10.field2550 = new class109(var11, 4, arg2 + 4, arg0, arg6, arg4, arg7, false, var10.field2550);
                    } else if (arg3 == 7) {
                        var10.field2550 = new class109(var11, 4, (arg2 + 2 & 0x3) + 4, arg0, arg6, arg4, arg7, false, var10.field2550);
                    } else if (arg3 == 8) {
                        var10.field2550 = new class109(var11, 4, arg2 + 4, arg0, arg6, arg4, arg7, false, var10.field2550);
                        var10.field2544 = new class109(var11, 4, (arg2 + 2 & 0x3) + 4, arg0, arg6, arg4, arg7, false, var10.field2544);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 11) {
                    arg3 = 10;
                }
                class39 var12 = class222.method1483(arg0, arg6, arg4);
                if (var12 != null) {
                    var12.field632 = new class109((int) (var12.field656 >>> 32) & Integer.MAX_VALUE, arg3, arg2, arg0, arg6, arg4, arg7, false, var12.field632);
                }
            }
            if (arg5 == 3) {
                class137 var13 = class82.method623(arg0, arg6, arg4);
                if (var13 != null) {
                    var13.field2095 = new class109(Integer.MAX_VALUE & (int) (var13.field2105 >>> 32), 22, arg2, arg0, arg6, arg4, arg7, false, var13.field2095);
                }
            }
        }
        if (arg1 <= 104) {
            method837(-79);
        }
        field1893++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 109)
    public static final void method837(int arg0) {
        class244.field4009.method1986((byte) -111);
        field1894++;
        if (arg0 != 103) {
            method837(14);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 140)
    public static void method838(byte arg0) {
        field1899 = null;
        field1886 = null;
        field1891 = null;
        field1895 = null;
        if (arg0 != 81) {
            field1899 = (class26) null;
        }
        field1898 = null;
        field1889 = null;
        field1890 = null;
        field1888 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 171)
    public class121() {
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lhd;)V", line = 173)
    public class121(class121 arg0) {
        this.field1887 = arg0.field1887;
        this.field1897 = arg0.field1897;
        this.field1885 = arg0.field1885;
        this.field1896 = arg0.field1896;
    }
}
