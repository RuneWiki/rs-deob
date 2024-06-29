import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class73 extends class106 {

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public int field1542 = 0;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field1523 = 0;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Lrf;")
    public static class163 field1529 = class53.method392(-72, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "Lrf;")
    public static class163 field1527 = class53.method392(71, "Clientscript error in: ");

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "Lrf;")
    private static class163 field1525 = class53.method392(-67, "shake:");

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "Z")
    public static volatile boolean field1528 = true;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Lrf;")
    public static class163 field1531 = field1525;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Lrf;")
    public static class163 field1532 = class53.method392(74, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "Lrf;")
    public static class163 field1534 = class53.method392(-104, "hel");

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field1536 = 0;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "Lrf;")
    public static class163 field1543 = field1525;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "J")
    public static long field1533;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "[I")
    public static int[] field1524;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
    public static void method515(byte arg0) {
        field1525 = null;
        field1531 = null;
        field1534 = null;
        field1532 = null;
        field1527 = null;
        field1543 = null;
        field1524 = null;
        field1529 = null;
        if (arg0 >= -31) {
            field1532 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLrf;I)V")
    public static final void method516(byte arg0, class163 arg1, int arg2) {
        class163 var3 = arg1.method1044(arg0 ^ 0xFFFFFFE2).method1031(false);
        field1538++;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != 29) {
            method515((byte) -82);
        }
        while (class112.field2377 > var5) {
            class38 var6 = class121.field2553[class27.field504[var5]];
            if (var6 != null && var6.field758 != null && var6.field758.method1038(var3, arg0 ^ 0x1D)) {
                var4 = true;
                class15.method103(class56.field1136.field692[0], var6.field692[0], 0, 2, arg0 ^ 0xFFFFFF9A, 0, 1, class56.field1136.field718[0], var6.field718[0], 0, 1, false);
                if (arg2 == 1) {
                    class141.field2896.method326(arg0 + 75, 124);
                    class141.field2896.method364(class27.field504[var5], (byte) -35);
                    class172.field3492++;
                } else if (arg2 == 4) {
                    class141.field2896.method326(104, 152);
                    class166.field3374++;
                    class141.field2896.method361(-1810503640, class27.field504[var5]);
                } else if (arg2 == 6) {
                    class141.field2896.method326(104, 20);
                    class53.field1094++;
                    class141.field2896.method355(class27.field504[var5], (byte) 116);
                } else if (arg2 == 7) {
                    class141.field2896.method326(arg0 ^ 0x75, 180);
                    class11.field228++;
                    class141.field2896.method346(0, class27.field504[var5]);
                }
                break;
            }
            var5++;
        }
        if (!var4) {
            class43.method267((byte) -87, class180.method1216(new class163[] { class121.field2557, var3 }, false), class36.field728, 0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)Lrh;")
    public static final class165 method517(boolean arg0) {
        field1526++;
        class165 var1 = new class165();
        var1.field3364 = class108.field2242[0];
        var1.field3369 = class81.field1639;
        var1.field3365 = class57.field1158[0];
        int var2 = var1.field3365 * var1.field3364;
        var1.field3370 = new int[var2];
        var1.field3368 = class129.field2686[0];
        var1.field3367 = class206.field4036;
        var1.field3366 = class102.field2135[0];
        if (!arg0) {
            return null;
        }
        byte[] var3 = class202.field3980[0];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field3370[var4] = class167.field3393[class133.method887(255, var3[var4])];
        }
        class119.method814((byte) 84);
        return var1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lfa;I)V")
    public final void method518(class52 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method344(255);
            if (var3 == 0) {
                if (arg1 != -1) {
                    field1536 = -33;
                }
                field1535++;
                return;
            }
            this.method521((byte) -100, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)I")
    public static final int method519(int arg0, int arg1, int arg2, int arg3) {
        field1541++;
        int var4 = arg2 & arg3 - 1;
        int var5 = arg1 / arg3;
        int var6 = arg2 / arg3;
        if (arg0 != 2) {
            return -54;
        }
        int var7 = arg3 - 1 & arg1;
        int var8 = class135.method892(95, var6, var5);
        int var9 = class135.method892(107, var6 + 1, var5);
        int var10 = class135.method892(86, var6, var5 + 1);
        int var11 = class135.method892(88, var6 + 1, var5 - -1);
        int var12 = class70.method500(var4, var9, var8, (byte) -94, arg3);
        int var13 = class70.method500(var4, var11, var10, (byte) -90, arg3);
        return class70.method500(var7, var13, var12, (byte) -105, arg3);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIZILre;)V")
    public static final void method520(int arg0, int arg1, int arg2, boolean arg3, int arg4, class162 arg5) {
        field1540++;
        if (class95.field2033 >= 50 || (arg5.field3276 == null || arg5.field3276.length <= arg2)) {
            return;
        }
        int var6 = 57 % ((35 - arg1) / 37);
        int var7 = arg5.field3276[arg2];
        if (var7 == 0) {
            return;
        }
        int var8 = var7 >> 8;
        int var9 = var7 >> 4 & 0x7;
        int var10 = var7 & 0xF;
        if (var10 == 0) {
            if (arg3) {
                class175.method1184(-1, var8, 0, var9);
            }
        } else if (class151.field3113 != 0) {
            class16.field274[class95.field2033] = var8;
            client.field599[class95.field2033] = var9;
            class188.field3746[class95.field2033] = 0;
            class13.field247[class95.field2033] = null;
            int var11 = (arg0 - 64) / 128;
            int var12 = (arg4 - 64) / 128;
            class202.field3988[class95.field2033] = (var12 << 16) - (-(var11 << 8) - var10);
            class95.field2033++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLfa;I)V")
    private final void method521(byte arg0, class52 arg1, int arg2) {
        if (arg0 >= -98) {
            method516((byte) 104, null, 107);
        }
        if (arg2 == 5) {
            this.field1542 = arg1.method390((byte) 110);
        }
        field1530++;
    }
}
