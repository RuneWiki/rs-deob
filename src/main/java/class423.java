import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class class423 extends class390 {

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "Z")
    public static boolean field5983 = false;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "Z")
    public static boolean field5981 = false;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "Lic;")
    public static class417 field5985;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
    public static final void method2680(int arg0) {
        class142.method979(class42.field614, -77);
        field5982++;
        int var1 = (class212.field2968 >> 3) + (class106.field1447 >> 10);
        int var2 = (class20.field376 >> 10) + (class447.field6269 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        if (arg0 != 10) {
            return;
        }
        byte var5 = 8;
        byte var6 = 18;
        class155.field2191 = new int[var6];
        class161.field2249 = new byte[var6][];
        class276.field3839 = new int[var6];
        class406.field5776 = new int[var6][4];
        class446.field6257 = new byte[var6][];
        class5.field91 = new int[var6];
        class247.field3495 = new byte[var6][];
        class67.field1014 = new byte[var6][];
        class268.field3742 = new int[var6];
        class403.field5718 = new byte[var6][];
        class426.field5997 = new int[var6];
        class284.field4005 = new int[var6];
        int var7 = 0;
        for (int var8 = (var1 - (class211.field2954 >> 4)) / 8; var8 <= ((var1 + (class211.field2954 >> 4)) / 8); var8++) {
            for (int var10 = (var2 - (class290.field4061 >> 4)) / 8; var10 <= ((var2 + (class290.field4061 >> 4)) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class155.field2191[var7] = var11;
                class276.field3839[var7] = class20.field375.method1751(class108.method765(arg0, 76), "m" + var8 + "_" + var10);
                class426.field5997[var7] = class20.field375.method1751(class108.method765(arg0, 120), "l" + var8 + "_" + var10);
                class5.field91[var7] = class20.field375.method1751(26, "n" + var8 + "_" + var10);
                class268.field3742[var7] = class20.field375.method1751(55, "um" + var8 + "_" + var10);
                class284.field4005[var7] = class20.field375.method1751(102, "ul" + var8 + "_" + var10);
                if (class5.field91[var7] == -1) {
                    class276.field3839[var7] = -1;
                    class426.field5997[var7] = -1;
                    class268.field3742[var7] = -1;
                    class284.field4005[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class5.field91.length; var9++) {
            class5.field91[var9] = -1;
            class276.field3839[var9] = -1;
            class426.field5997[var9] = -1;
            class268.field3742[var9] = -1;
            class284.field4005[var9] = -1;
        }
        class316.method2051(true, var5, var1, false, -62, var4, var2, var3);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lmc;III[Z)V")
    public static final void method2681(class69 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class375.field5354 == class214.field2979) {
            return;
        }
        int var5 = class418.field5939[arg1].method725(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class242 var7 = class418.field5939[var6];
                if (var7 != null) {
                    var7.method736(arg0, arg2, var5 - var7.method725(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII)I")
    public static final int method2682(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -9 % ((arg2 + 46) / 61);
        field5986++;
        if ((class368.field5193[arg0][arg3][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (class368.field5193[1][arg3][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIZLuo;Lbe;Lco;Lbo;)V")
    public static final void method2683(int arg0, int arg1, int arg2, boolean arg3, class345 arg4, class25 arg5, class62 arg6, class435 arg7) {
        field5984++;
        int var8 = arg6.field848 - (arg1 / 2) - 5;
        int var9 = arg2 + 2;
        if (arg5.field427 != 0) {
            arg4.method2182(var8, var9, arg1 + 10, arg5.field427, 78, arg2 + arg0 * arg7.method2739() + 1 - var9);
        }
        if (arg5.field454 != 0) {
            arg4.method2188(arg1 + 10, arg0 * arg7.method2739() + (-var9 + arg2 - -1), var8, var9, arg5.field454, (byte) -34);
        }
        if (!arg3) {
            return;
        }
        int var10 = arg5.field437;
        if (arg6.field850 && arg5.field438 != -1) {
            var10 = arg5.field438;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            String var12 = class267.field3694[var11];
            if ((arg0 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg7.method2734(arg4, var12, arg6.field848, arg2, var10, true);
            arg2 += arg7.method2739();
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)V")
    public static void method2684(byte arg0) {
        field5985 = null;
        int var1 = -4 % ((arg0 + 49) / 41);
    }
}
