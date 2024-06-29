import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class356 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field5268 = -1;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5271 = new String[100];

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public int field5267;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Ldj;")
    public static class320 field5273;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Lpl;")
    public class356 field5275;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Lro;")
    public class407 field5274;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLkg;)V", line = 3)
    public static final void method2336(byte arg0, class317 arg1) {
        field5277++;
        if (arg0 > -21) {
            field5270 = -91;
        }
        class144 var2 = (class144) class36.field553.method2826(false, (long) arg1.field2183);
        if (var2 == null) {
            return;
        }
        if (var2.field1840 != null) {
            class40.field602.method249(var2.field1840);
            var2.field1840 = null;
        }
        var2.method2632(true);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBZIIII)V", line = 36)
    public static final void method2337(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field5276++;
        class131.field1722 = arg4;
        if (arg1 != 120) {
            return;
        }
        class440.field6377 = arg5;
        class450.field6458 = arg0;
        class106.field1402 = arg6;
        class279.field4097 = arg3;
        if (arg2 && class131.field1722 >= 100) {
            class279.field4099 = class440.field6377 * 128 + 64;
            class326.field4829 = class450.field6458 * 128 + 64;
            class289.field4331 = class248.method1621(class326.field4829, class279.field4099, -13853, class268.field3973) - class106.field1402;
        }
        class212.field2884 = 2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIZIIIIII)Z", line = 62)
    public static final boolean method2338(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5280++;
        int var11 = class97.method767(-117, arg0, arg5, arg10, arg1, class290.field4357, class254.field3708, arg7, arg8, arg9, arg2, class383.field5609.method1091((byte) 27), arg6, arg4, class420.field6108[class268.field3973]);
        if (var11 < 1) {
            return false;
        }
        class47.field712 = class290.field4357[var11 - arg3];
        class142.field1805 = class254.field3708[var11 - 1];
        class400.field5859 = false;
        class147.method1015((byte) -75);
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILtj;Lm;I)V", line = 83)
    public static final void method2339(int arg0, int arg1, class298 arg2, class242 arg3, int arg4) {
        class394.field5730.method1574(arg1 ^ 0xFFFF8E5A);
        field5278++;
        if (class273.field4012) {
            return;
        }
        for (class27 var5 = (class27) arg3.method1575(arg1 ^ arg1); var5 != null; var5 = (class27) arg3.method1573((byte) -128)) {
            class170 var6 = class174.method1160(-28930, var5.field462);
            if (class283.method1940(var6, 5)) {
                boolean var7 = class435.method2725(arg2, arg0, arg1 - 3072, arg4, var5, var6);
                if (var7) {
                    class41.method302(var6, var5, arg2, (byte) -102);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 119)
    public static void method2340(int arg0) {
        field5273 = null;
        field5271 = null;
        if (arg0 != 12295) {
            field5271 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 130)
    public final void method2341(int arg0) {
        field5279++;
        if (arg0 != 262144) {
            method2338(-77, -32, -60, 48, true, 4, 76, -126, -66, -29, 114);
        }
        if (class192.field2678 >= 500) {
            return;
        }
        this.field5274 = null;
        this.field5267 = 0;
        this.field5275 = class277.field4070;
        class277.field4070 = this;
        class192.field2678++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 166)
    public static final void method2342(byte arg0) {
        field5269++;
        if (arg0 >= -102) {
            field5271 = null;
        }
        if (class39.field588 < 1024.0F) {
            class39.field588 = 1024.0F;
        }
        if (class39.field588 > 3072.0F) {
            class39.field588 = 3072.0F;
        }
        while (class247.field3479 >= 16384.0F) {
            class247.field3479 -= 16384.0F;
        }
        while (class247.field3479 < 0.0F) {
            class247.field3479 += 16384.0F;
        }
        int var1 = class357.field5297 >> 7;
        int var2 = class159.field2065 >> 7;
        int var3 = class248.method1621(class357.field5297, class159.field2065, -13853, class268.field3973);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class268.field3973;
                    if (var7 < 3 && class186.method1239(var6, 256, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class386.field5642 != null && class386.field5642[var7] != null) {
                        var8 = (class386.field5642[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 - (class266.field3950[var7].method722(var5, var6) - var3);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class391.field5710) {
            class391.field5710 += (var10 - class391.field5710) / 24;
        } else if (var10 < class391.field5710) {
            class391.field5710 += (var10 - class391.field5710) / 80;
            return;
        }
    }
}
