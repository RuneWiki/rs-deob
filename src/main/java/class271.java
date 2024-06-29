import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class271 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3970 = "Select";

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    public static int[] field3972 = new int[128];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lnr;IILao;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method1735(class437 arg0, int arg1, int arg2, class116 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class310.field4442 = arg0;
        class204.field2953 = arg1;
        class196.field2800 = arg3;
        class164.field2130 = class310.field4442.method2110() > 0;
        class308.field4398 = arg4 >> 7;
        class383.field5729 = arg6 >> 7;
        class146.field1926 = arg4;
        class239.field3369 = arg6;
        class145.field1902 = arg5;
        class398.field5961 = class308.field4398 - class27.field480;
        if (class398.field5961 < 0) {
            class169.field2236 = -class398.field5961;
            class398.field5961 = 0;
        } else {
            class169.field2236 = 0;
        }
        class349.field5181 = class383.field5729 - class27.field480;
        if (class349.field5181 < 0) {
            class120.field1614 = -class349.field5181;
            class349.field5181 = 0;
        } else {
            class120.field1614 = 0;
        }
        class110.field1519 = class308.field4398 + class27.field480;
        if (class110.field1519 > class308.field4403) {
            class110.field1519 = class308.field4403;
        }
        class265.field3905 = class383.field5729 + class27.field480;
        if (class265.field3905 > class413.field6175) {
            class265.field3905 = class413.field6175;
        }
        for (int var18 = 0; var18 < class27.field480 + class27.field480 + 2; var18++) {
            for (int var23 = 0; var23 < class27.field480 + class27.field480 + 2; var23++) {
                int var24 = class308.field4398 + var18 - class27.field480;
                int var25 = class383.field5729 + var23 - class27.field480;
                if (var24 >= 0 && var25 >= 0 && var24 < class308.field4403 && var25 < class413.field6175) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class198.field2829[3].method781(var24, var25) - 1000;
                    int var29 = class425.field6324 == null ? class198.field2829[0].method781(var24, var25) + 128 : class425.field6324[0].method781(var24, var25) + 128;
                    class19.field325[var18][var23] = class310.field4442.method2145(var26, var28, var27, var26, var29, var27);
                } else {
                    class19.field325[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class27.field480 + class27.field480 + 1; var19++) {
            for (int var22 = 0; var22 < class27.field480 + class27.field480 + 1; var22++) {
                class337.field4974[var19][var22] = class19.field325[var19][var22] || class19.field325[var19 + 1][var22] || class19.field325[var19][var22 + 1] || class19.field325[var19 + 1][var22 + 1];
            }
        }
        class339.field4983 = arg8;
        class383.field5728 = arg9;
        class188.field2546 = arg10;
        class214.field3045 = arg11;
        class180.field2399 = arg12;
        class367.method2425();
        class390.method2548((byte) -97);
        for (class433 var20 = (class433) class357.field5232.method976((byte) 42); var20 != null; var20 = (class433) class357.field5232.method979(90)) {
            var20.method1754((byte) 71);
            class360.method2367(var20, true);
        }
        if (class164.field2130) {
            for (int var21 = 0; var21 < class134.field1789; var21++) {
                class74.field997[var21].method2677(arg17, arg1, 1536);
            }
        }
        if (arg2 > 1) {
            class310.field4442.method2120(0);
            if (class30.field514 == null || class30.field514 instanceof class110) {
                class30.field514 = new class32();
            }
        } else if (class30.field514 == null || class30.field514 instanceof class32) {
            class30.field514 = new class110();
        }
        class30.field514.method274(arg2, (byte) 126);
        class30.field514.method271(-46);
        if (class39.field633 != null) {
            class247.method1523(true);
            class30.field514.method273(22, (byte) -127);
            class103.method702(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class30.field514.method271(124);
            class30.field514.method273(23, (byte) -128);
            class247.method1523(false);
        }
        class103.method702(arg2, arg7, arg13, arg14, arg15, arg16);
        class30.field514.method271(-76);
        class30.field514.method268(15226);
        class30.field514.method271(-103);
        if (arg2 > 1) {
            class310.field4442.method2161(0);
        }
        class310.field4442.method2151(0, (class403[]) null);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1736(byte arg0, Throwable arg1) throws IOException {
        field3974++;
        String var2;
        if ((arg1 instanceof class139)) {
            class139 var3 = (class139) arg1;
            var2 = var3.field1860 + " | ";
            arg1 = var3.field1852;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg0 <= 99) {
            field3972 = null;
        }
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static final void method1737(byte arg0) {
        field3969++;
        class24 var1 = class23.field395;
        synchronized (class23.field395) {
            if (arg0 != 40) {
                method1738(44);
            }
            class23.field395.method212(arg0 - 115);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1738(int arg0) {
        field3970 = null;
        if (arg0 != 1) {
            field3970 = null;
        }
        field3972 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
    public static final void method1739(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3973++;
        for (int var5 = 0; var5 < class442.field6463; var5++) {
            Rectangle var6 = class94.field1303[var5];
            if (var6.x + var6.width > arg0 && var6.x < arg0 + arg3 && arg2 < var6.y + var6.height && (arg1 + arg2) > var6.y) {
                class85.field1178[var5] = true;
            }
        }
        if (arg4 >= -71) {
            method1735((class437) null, -113, 99, (class116) null, 41, 122, 85, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 21, (byte) 58, 5, 67, false);
        }
    }
}
