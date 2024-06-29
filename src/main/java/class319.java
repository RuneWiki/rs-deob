import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class319 extends class110 {

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "[I")
    public static int[] field4951 = new int[100];

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4954 = new String[8];

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4957 = "green:";

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "[[B")
    public static byte[][] field4955 = new byte[250][];

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "[I")
    public static int[] field4959 = new int[25];

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)V", line = 13)
    public static void method2242(boolean arg0) {
        field4959 = null;
        field4957 = null;
        field4954 = null;
        field4955 = (byte[][]) null;
        field4951 = null;
        if (arg0) {
            field4957 = (String) null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILog;)Log;", line = 32)
    public static final class157 method2243(int arg0, class157 arg1) {
        field4952++;
        if (arg1.field2463 != -1) {
            return class142.method1053(arg1.field2463, 65535);
        } else if (arg0 == 21695) {
            int var2 = arg1.field2486 >>> 16;
            class60 var3 = new class60(class243.field3842);
            for (class90 var4 = (class90) var3.method405((byte) -49); var4 != null; var4 = (class90) var3.method407(-962)) {
                if (var4.field1249 == var2) {
                    return class142.method1053((int) var4.field2744, 65535);
                }
            }
            return null;
        } else {
            return (class157) null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V", line = 69)
    public static final void method2244(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class155 var5 = (class155) class240.field3813.method1240(3); var5 != null; var5 = (class155) class240.field3813.method1235(false)) {
            class212.method1528(arg3, arg0, arg4, arg1, var5, (byte) -83);
        }
        field4956++;
        if (arg2 > -17) {
            method2242(false);
        }
        for (class155 var6 = (class155) class229.field3636.method1240(3); var6 != null; var6 = (class155) class229.field3636.method1235(false)) {
            byte var7 = 1;
            class17 var8 = var6.field2386.method1876((byte) 125);
            if (var6.field2386.field4232 == var8.field200) {
                var7 = 0;
            } else if (var6.field2386.field4232 == var8.field229 || var6.field2386.field4232 == var8.field210 || var6.field2386.field4232 == var8.field217 || var6.field2386.field4232 == var8.field202) {
                var7 = 2;
            } else if (var6.field2386.field4232 == var8.field224 || var6.field2386.field4232 == var8.field208 || var6.field2386.field4232 == var8.field218 || var6.field2386.field4232 == var8.field199) {
                var7 = 3;
            }
            if (var6.field2381 != var7) {
                int var9 = class214.method1536(0, var6.field2386);
                if (var6.field2398 != var9) {
                    if (var6.field2375 != null) {
                        class191.field3127.method118(var6.field2375);
                        var6.field2375 = null;
                    }
                    var6.field2398 = var9;
                }
                var6.field2381 = var7;
            }
            var6.field2395 = var6.field2386.field4255;
            var6.field2374 = var6.field2386.field4255 + (var6.field2386.method1881(-20395) * 64);
            var6.field2389 = var6.field2386.field4264;
            var6.field2387 = var6.field2386.field4264 + (var6.field2386.method1881(-20395) * 64);
            class212.method1528(arg3, arg0, arg4, arg1, var6, (byte) -63);
        }
        for (class155 var10 = (class155) class77.field1091.method458((byte) -16); var10 != null; var10 = (class155) class77.field1091.method455((byte) -92)) {
            class17 var11 = var10.field2379.method1876((byte) 125);
            byte var12 = 1;
            if (var10.field2379.field4232 == var11.field200) {
                var12 = 0;
            } else if (var10.field2379.field4232 == var11.field229 || var10.field2379.field4232 == var11.field210 || var10.field2379.field4232 == var11.field217 || var10.field2379.field4232 == var11.field202) {
                var12 = 2;
            } else if (var10.field2379.field4232 == var11.field224 || var10.field2379.field4232 == var11.field208 || var10.field2379.field4232 == var11.field218 || var10.field2379.field4232 == var11.field199) {
                var12 = 3;
            }
            if (var10.field2381 != var12) {
                int var13 = class153.method1106(-2, var10.field2379);
                if (var10.field2398 != var13) {
                    if (var10.field2375 != null) {
                        class191.field3127.method118(var10.field2375);
                        var10.field2375 = null;
                    }
                    var10.field2398 = var13;
                }
                var10.field2381 = var12;
            }
            var10.field2395 = var10.field2379.field4255;
            var10.field2374 = var10.field2379.field4255 + var10.field2379.method1881(-20395) * 64;
            var10.field2389 = var10.field2379.field4264;
            var10.field2387 = var10.field2379.field4264 + (var10.field2379.method1881(-20395) * 64);
            class212.method1528(arg3, arg0, arg4, arg1, var10, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZZ)V", line = 182)
    public static final void method2245(boolean arg0, boolean arg1) {
        class76.method516((byte) -51);
        field4958++;
        if (class5.field75 != 30 && class5.field75 != 25) {
            return;
        }
        class298.field4700++;
        if (class298.field4700 < 50 && !arg0) {
            return;
        }
        if (arg1) {
            method2245(false, true);
        }
        class298.field4700 = 0;
        if (!class296.field4689 && class320.field4966 != null) {
            class194.field3175.method2375(183, 0);
            class322.field4997++;
            try {
                class320.field4966.method85((byte) -104, class194.field3175.field586, class194.field3175.field573, 0);
                class194.field3175.field586 = 0;
            } catch (IOException var3) {
                class296.field4689 = true;
            }
        }
        class76.method516((byte) -51);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)I", line = 238)
    public static final int method2246(int arg0) {
        if (arg0 != 2) {
            field4955 = (byte[][]) ((byte[][]) null);
        }
        field4953++;
        return class298.field4703;
    }
}
