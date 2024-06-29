import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class159 extends class359 {

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "J")
    public long field2259;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "Ljava/lang/String;")
    public String field2252;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "Ljava/lang/String;")
    public String field2250;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field2251 = -2;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "[[I")
    public static int[][] field2253 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "Z")
    public static boolean field2265 = false;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "Z")
    public static boolean field2255 = true;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "Lkh;")
    public static class11 field2260;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "[Lkh;")
    public static class11[] field2247;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "[Lkh;")
    public static class11[] field2258;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Ljava/lang/String;", line = 6)
    public static final String method1042(int arg0, int arg1) {
        field2262++;
        String var2 = Integer.toString(arg0);
        if (arg1 != 2) {
            method1042(66, 123);
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class50.field571 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class191.field2598 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)V", line = 39)
    public static final void method1043(int arg0, int arg1, int arg2) {
        field2264++;
        int var3 = class75.field834 * arg2 >> 8;
        if (arg0 == arg1 && !class343.field5049) {
            class260.method1624((byte) 50);
        } else if (arg1 != -1 && (class423.field6072 != arg1 || !class269.method1708((byte) -113)) && var3 != 0 && !class343.field5049) {
            class343.method2196(var3, 2, 0, class354.field5165, false, 1, arg1);
        }
        class423.field6072 = arg1;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V", line = 63)
    public static void method1044(int arg0) {
        if (arg0 == 1) {
            field2247 = null;
            field2260 = null;
            field2258 = null;
            field2253 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)V", line = 85)
    public static final void method1045(int arg0, int arg1) {
        class331 var2 = class424.field6079;
        synchronized (class424.field6079) {
            if (arg1 != 3) {
                method1046(-56, -115, 42, 53);
            }
            class424.field6079.method2054(arg1 - 125, arg0);
        }
        field2263++;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)I", line = 100)
    public static final int method1046(int arg0, int arg1, int arg2, int arg3) {
        field2254++;
        if (arg3 > -104) {
            field2265 = true;
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V", line = 130)
    public static final void method1047(byte arg0) {
        for (int var1 = -1; var1 < class148.field2082; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class294.field4217[var1];
            }
            class133 var6 = class375.field5473[var5];
            if (var6 != null && var6.field6301 > 0) {
                var6.field6301--;
                if (var6.field6301 == 0) {
                    var6.field6259 = null;
                }
            }
        }
        field2248++;
        for (int var2 = 0; var2 < class426.field6168; var2++) {
            int var3 = class201.field2770[var2];
            class358 var4 = class81.field917[var3];
            if (var4 != null && var4.field6301 > 0) {
                var4.field6301--;
                if (var4.field6301 == 0) {
                    var4.field6259 = null;
                }
            }
        }
        if (arg0 > -29) {
            method1045(-41, 78);
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V", line = 197)
    public class159(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field2259 = arg4;
        this.field2252 = arg1;
        this.field2257 = arg3;
        this.field2256 = arg2;
        this.field2249 = arg6;
        this.field2250 = arg0;
        this.field2266 = arg5;
    }
}
