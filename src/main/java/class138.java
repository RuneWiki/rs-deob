import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class138 {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "J")
    public long field2230 = 0L;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2220 = "glow1:";

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lie;")
    public class34 field2226;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lie;")
    public class34 field2227;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILie;Lie;IIIIJ)V")
    public static final void method953(int arg0, int arg1, int arg2, int arg3, class34 arg4, class34 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class219 var12 = new class219();
        var12.field3446 = arg10;
        var12.field3449 = arg1 * 128 + 64;
        var12.field3445 = arg2 * 128 + 64;
        var12.field3448 = arg3;
        var12.field3444 = arg4;
        var12.field3437 = arg5;
        var12.field3435 = arg6;
        var12.field3447 = arg7;
        var12.field3436 = arg8;
        var12.field3438 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class307.field4991[var13][arg1][arg2] == null) {
                class307.field4991[var13][arg1][arg2] = new class116(var13, arg1, arg2);
            }
        }
        class307.field4991[arg0][arg1][arg2].field1780 = var12;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method954(byte arg0) {
        int var1 = -26 / ((52 - arg0) / 44);
        field2220 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIZIIZLfj;Z)V")
    public static final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9, class274 arg10, boolean arg11) {
        field2219++;
        if (!arg9) {
            method953(-57, -72, 96, -106, (class34) null, (class34) null, 47, -15, -101, 77, 20L);
        }
        if (arg7 < 0 || arg7 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var14 = arg10.method1849(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method1849(255);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method1849(255);
                }
            }
        }
        if (!arg11 && !arg6) {
            class214.field3386[arg3][arg7][arg4] = 0;
        }
        while (true) {
            int var12 = arg10.method1849(255);
            if (var12 == 0) {
                if (arg11) {
                    class166.field2746[0][arg7 + arg0][arg4 + arg5] = class300.field4915[0][arg0 + arg7][arg4 + arg5];
                    return;
                } else if (arg3 == 0) {
                    class166.field2746[0][arg7 + arg0][arg4 + arg5] = -class157.method1065(123, arg8 + 556238, arg2 + 932731) * 8;
                    return;
                } else {
                    class166.field2746[arg3][arg0 + arg7][arg4 + arg5] = class166.field2746[arg3 - 1][arg7 + arg0][arg4 + arg5] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method1849(255);
                if (arg11) {
                    class166.field2746[0][arg0 + arg7][arg4 + arg5] = class300.field4915[0][arg0 + arg7][arg4 + arg5] + (var13 * 8);
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg3 != 0) {
                    class166.field2746[arg3][arg0 + arg7][arg4 + arg5] = class166.field2746[arg3 - 1][arg7 + arg0][arg4 + arg5] - (var13 * 8);
                    return;
                }
                class166.field2746[0][arg7 + arg0][arg4 + arg5] = -var13 * 8;
                return;
            }
            if (var12 <= 49) {
                if (arg6) {
                    arg10.method1849(255);
                } else {
                    class27.field480[arg3][arg7][arg4] = arg10.method1830((byte) 90);
                    class202.field3280[arg3][arg7][arg4] = (byte) ((var12 - 2) / 4);
                    class68.field1084[arg3][arg7][arg4] = (byte) class233.method1609(3, arg1 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!arg11 && !arg6) {
                    class214.field3386[arg3][arg7][arg4] = (byte) (var12 - 49);
                }
            } else if (!arg6) {
                class250.field4102[arg3][arg7][arg4] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLgi;)V")
    public static final void method956(byte arg0, class164 arg1) {
        field2222++;
        class247.field3885 = arg1;
        if (arg0 > -17) {
            method957(-55, (String) null);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method957(int arg0, String arg1) {
        field2223++;
        if (arg0 != 0) {
            field2220 = null;
        }
        String var2 = class177.method1247(arg0 - 16702, class162.method1114((byte) -114, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }
}
