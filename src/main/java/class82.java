import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class82 {

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1326 = "white:";

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field1324 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "J")
    public long field1321;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Loi;")
    public class82 field1314;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Loi;")
    public class82 field1318;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
    public static int[] field1312;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[Lsb;")
    public static class230[] field1316;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static final void method537(int arg0) {
        field1312 = null;
        class10.field139 = null;
        class10.field129 = null;
        field1322++;
        if (arg0 != 0) {
            field1320 = -12;
        }
        class183.field2775 = null;
        class220.field3315 = null;
        class273.field4104 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public final void method538(int arg0) {
        field1323++;
        if (this.field1314 == null) {
            return;
        }
        if (arg0 <= 51) {
            this.field1318 = null;
        }
        this.field1314.field1318 = this.field1318;
        this.field1318.field1314 = this.field1314;
        this.field1314 = null;
        this.field1318 = null;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public static void method539(int arg0) {
        field1326 = null;
        field1316 = null;
        if (arg0 != -9585) {
            field1320 = -69;
        }
        field1312 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZII)I")
    public static final int method540(boolean arg0, int arg1, int arg2) {
        field1311++;
        if (!arg0) {
            field1312 = null;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIILsk;IJ)Z")
    public static final boolean method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class114 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class284.method1869(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZIJ)V")
    public static final void method542(boolean arg0, int arg1, long arg2) {
        field1317++;
        if (arg2 == 0L) {
            return;
        }
        if (class154.field2307 >= 100) {
            class48.method321(0, "", class115.field1753, 34);
            return;
        }
        String var4 = class200.method1255(arg2, false);
        for (int var5 = 0; var5 < class154.field2307; var5++) {
            if (class35.field493[var5] == arg2) {
                class48.method321(0, "", var4 + class23.field277, 71);
                return;
            }
        }
        for (int var6 = 0; var6 < class150.field2164; var6++) {
            if (class259.field3944[var6] == arg2) {
                class48.method321(0, "", class259.field3948 + var4 + class246.field3673, arg1 ^ 0xFFFFFFA8);
                return;
            }
        }
        if (var4.equals(class165.field2537.field1663)) {
            class48.method321(0, "", class61.field971, arg1 ^ 0x3A);
            return;
        }
        class22.field263++;
        class35.field493[class154.field2307] = arg2;
        class71.field1130[class154.field2307] = class86.method566(arg2, -15715);
        class27.field335[class154.field2307++] = arg0;
        class112.field1724 = class68.field1077;
        class196.field2979.method1106(arg1, false);
        class196.field2979.method1610(791715792, arg2);
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)Ljava/lang/String;")
    public static final String method543(int arg0) {
        String var1 = "www";
        field1315++;
        if (class112.field1726 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class189.field2904 != null) {
            var2 = "/p=" + class189.field2904;
        }
        if (arg0 != 1806444415) {
            method540(false, 122, 82);
        }
        return "http://" + var1 + ".runescape.com/l=" + class48.field780 + "/a=" + class259.field3946 + var2 + "/";
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static final void method544(byte arg0) {
        if (arg0 != 54) {
            return;
        }
        for (int var1 = 0; var1 < class24.field295; var1++) {
            int var2 = class169.field2586[var1];
            class61 var3 = class18.field220[var2];
            if (var3 != null) {
                class118.method751(var3.field959.field1148, var3, 64);
            }
        }
        field1319++;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Z")
    public final boolean method545(byte arg0) {
        field1313++;
        if (this.field1314 == null) {
            return false;
        } else {
            int var2 = 23 / ((-arg0 - 54) / 59);
            return true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
    public static final void method546(int arg0) {
        if (arg0 != -13376) {
            return;
        }
        field1325++;
        if (class97.field1523 != null && class175.field2661 != null) {
            return;
        }
        class97.field1523 = new int[256];
        class175.field2661 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class97.field1523[var1] = (int) (Math.sin(var2) * 4096.0D);
            class175.field2661[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }
}
