import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class194 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public int field2893 = 2048;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public int field2894 = 2048;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public int field2896 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public int field2892 = 0;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "[I")
    public static int[] field2895 = new int[128];

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "J")
    public static long field2901 = 0L;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2903 = "red:";

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "Z")
    public static boolean field2909 = false;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)Z", line = 8)
    public static final boolean method1378(byte arg0, int arg1) {
        field2900++;
        class341 var2 = class179.method1271(107, arg1);
        if (var2 == null) {
            return false;
        } else if (class180.field2718 == 1 || class180.field2718 == 2 || class60.field967 == 2) {
            class227.field3602 = var2.field5320;
            class219.field3328 = var2.field5319;
            if (class60.field967 != 0) {
                class25.field393 = class219.field3328 + 40000;
                class258.field4044 = class219.field3328 + 50000;
                class103.field1596 = class25.field393;
            }
            return true;
        } else {
            String var3 = "";
            if (arg0 <= 106) {
                method1378((byte) -17, -57);
            }
            if (class60.field967 != 0) {
                var3 = ":" + (var2.field5319 + 7000);
            }
            String var4 = "";
            if (class120.field1827 != null) {
                var4 = "/p=" + class120.field1827;
            }
            String var5 = "http://" + var2.field5320 + var3 + "/l=" + class195.field2920 + "/a=" + class233.field3708 + var4 + "/j" + (class296.field4571 ? "1" : "0") + ",o" + (class284.field4400 ? "1" : "0") + ",a2,m" + (class19.field259 ? "1" : "0");
            try {
                class317.field4958.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILkh;I)V", line = 61)
    public final void method1379(int arg0, class166 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1178(0);
            if (var4 == 0) {
                if (arg0 != 0) {
                    this.method1379(86, (class166) null, -35);
                }
                field2907++;
                return;
            }
            this.method1381(arg2, var4, (byte) -89, arg1);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 84)
    public static final void method1380(byte arg0) {
        int var1 = -108 / ((-arg0 - 31) / 49);
        class37.method313(0, 0, 0);
        field2908++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIBLkh;)V", line = 94)
    private final void method1381(int arg0, int arg1, byte arg2, class166 arg3) {
        field2899++;
        int var5 = -82 / ((arg2 - 16) / 63);
        if (arg1 == 1) {
            this.field2892 = arg3.method1178(0);
        } else if (arg1 == 2) {
            this.field2894 = arg3.method1151(-86);
        } else if (arg1 == 3) {
            this.field2893 = arg3.method1151(-69);
        } else if (arg1 == 4) {
            this.field2896 = arg3.method1166(52);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 136)
    public static void method1382(boolean arg0) {
        field2903 = null;
        field2895 = null;
        if (arg0) {
            field2904 = 32;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 149)
    public static final boolean method1383(String arg0, int arg1, String arg2) {
        int var3 = arg2.length();
        int var4 = arg0.length();
        field2898++;
        if (var3 < var4) {
            return false;
        }
        for (int var5 = arg1; var5 < var4; var5++) {
            char var6 = arg2.charAt(var5);
            char var7 = arg0.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 191)
    public static final void method1384(byte arg0) {
        class106.field1642.method753(123, 168);
        int var1 = -12 % ((arg0 - 65) / 36);
        class278.field4285++;
        for (class61 var2 = (class61) class276.field4257.method1228(true); var2 != null; var2 = (class61) class276.field4257.method1223((byte) 13)) {
            if (var2.field985 == 0) {
                class105.method761(var2, true, false);
            }
        }
        if (class303.field4728 != null) {
            class26.method241(3095, class303.field4728);
            class303.field4728 = null;
        }
        field2902++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILl;Ll;Ll;)V", line = 237)
    public static final void method1385(int arg0, class133 arg1, class133 arg2, class133 arg3) {
        field2905++;
        if (arg0 == 255) {
            class160.field2413 = arg2;
            class241.field3861 = arg3;
            class77.field1240 = arg1;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([[FZI[IZZIIIII[[ILfm;BIB[[F[[I[[FZI[Z)V", line = 251)
    public static final void method1386(float[][] arg0, boolean arg1, int arg2, int[] arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[][] arg11, class127 arg12, byte arg13, int arg14, byte arg15, float[][] arg16, int[][] arg17, float[][] arg18, boolean arg19, int arg20, boolean[] arg21) {
        int var22 = (arg4 ? 255 : 0) + (arg10 << 8);
        field2906++;
        int var23 = (arg8 << 8) + (arg5 ? 255 : 0);
        if (arg13 <= 121) {
            field2901 = 22L;
        }
        int var24 = (arg1 ? 255 : 0) + (arg9 << 8);
        int var25 = (arg14 << 8) + (arg19 ? 255 : 0);
        int[] var26 = new int[arg3.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg3[var27 + var27];
            int var29 = arg3[var27 + var27 + 1];
            int[][] var30 = arg11 == null || arg21 == null || !arg21[var27] ? arg17 : arg11;
            var26[var27] = class297.method2016(var24, arg18, var28, arg20, var25, (float) arg7, var29, arg0, false, arg11, arg12, arg16, (byte) -109, arg15, var30, var22, arg6, var23);
        }
        arg12.method923(arg2, arg6, arg20, var26, (int[]) null, false);
    }
}
