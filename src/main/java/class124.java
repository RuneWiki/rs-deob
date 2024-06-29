import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class124 {

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1930 = 0;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lte;")
    public static class244 field1929 = new class244(64);

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1932 = null;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    private int field1920;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public int field1931;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Leh;")
    public static class137 field1933;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lfh;")
    public static class261 field1924;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lra;")
    public static class38 field1934;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIII)V")
    public static final void method813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3;
        field1927++;
        class78.method433(arg4 + arg5, -arg5 + arg4, class14.field186[arg1], arg2, (byte) 123);
        int var7 = arg0;
        int var8 = arg5 * arg5;
        int var9 = var8 << 1;
        int var10 = arg0 * arg0;
        int var11 = var10 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var10 - ((var12 - 1) * var9);
        int var15 = var8 << 2;
        int var16 = var10 << 2;
        int var17 = ((arg3 << 1) + 3) * var11;
        int var18 = ((arg0 << 1) - 3) * var9;
        int var19 = (arg3 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var14 += var19;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var6++;
                var13 += var17;
                var17 += var16;
                var14 += var19;
                var19 += var16;
            }
            var14 += -var18;
            var18 -= var15;
            var7--;
            var13 += -var20;
            int var21 = arg1 - var7;
            var20 -= var15;
            int var22 = arg4 - var6;
            int var23 = arg4 + var6;
            class78.method433(var23, var22, class14.field186[var21], arg2, (byte) 123);
            int var24 = arg1 + var7;
            class78.method433(var23, var22, class14.field186[var24], arg2, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILpd;Z)V")
    private final void method814(int arg0, int arg1, class96 arg2, boolean arg3) {
        if (arg0 == 1) {
            this.field1920 = arg2.method549(255);
        } else if (arg0 == 2) {
            this.field1931 = arg2.method584(255);
            this.field1921 = arg2.method584(255);
        }
        field1925++;
        if (arg3) {
            field1929 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method815(long arg0, byte arg1) {
        field1928++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 >= -20) {
                field1934 = null;
            }
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class94.field1191[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method816(byte arg0) {
        if (arg0 >= -105) {
            method813(-53, 106, -44, -78, 97, -109);
        }
        field1926++;
        if (class118.field1672 == 5) {
            class118.field1672 = 6;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public static void method817(byte arg0) {
        field1924 = null;
        field1929 = null;
        field1932 = null;
        field1933 = null;
        if (arg0 != 116) {
            field1933 = null;
        }
        field1934 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lpd;IZ)V")
    public final void method818(class96 arg0, int arg1, boolean arg2) {
        field1923++;
        if (!arg2) {
            method816((byte) -24);
        }
        while (true) {
            int var4 = arg0.method584(255);
            if (var4 == 0) {
                return;
            }
            this.method814(var4, arg1, arg0, false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lnf;")
    public final class227 method819(int arg0) {
        field1922++;
        class227 var2 = (class227) class36.field466.method1693((long) this.field1920, 120);
        if (var2 != null) {
            return var2;
        }
        class227 var3 = class45.method253((byte) 26, 0, this.field1920, class27.field363);
        if (arg0 != 31858) {
            method813(-93, 118, 53, -70, 61, 92);
        }
        if (var3 != null) {
            class36.field466.method1694(true, (long) this.field1920, var3);
        }
        return var3;
    }
}
