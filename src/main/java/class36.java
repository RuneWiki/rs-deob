import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class36 extends class522 {

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "Z")
    public static boolean field688 = false;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "Ljk;")
    public static class585 field683 = new class585(1, 2);

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "Lla;")
    public static class419 field691;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "[B")
    private byte[] field693;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)V")
    public final void method415(int arg0, int arg1, byte arg2) {
        field685++;
        byte var4 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var5 = arg1 * 2;
        if (arg0 == 255) {
            this.field693[var5++] = var4;
            this.field693[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
    public static void method416(int arg0) {
        field691 = null;
        int var1 = -4 % ((28 - arg0) / 59);
        field683 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIBI)[B")
    public final byte[] method417(int arg0, int arg1, byte arg2, int arg3) {
        this.field693 = new byte[arg3 * 2 * arg0 * arg1];
        field690++;
        this.method2893(arg0, arg3, 0, arg1);
        if (arg2 >= -95) {
            field689 = -84;
        }
        return this.field693;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BZ)Z")
    public static final boolean method418(byte arg0, boolean arg1) {
        if (!arg1) {
            field683 = null;
        }
        field686++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class661.field9379[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class36() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([BIIIIIZI[B)V")
    public static final void method419(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, byte[] arg8) {
        field684++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        int var11 = -arg2;
        if (!arg6) {
            field691 = null;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg0[var10001] = (byte) (arg0[var10001] - arg8[arg7++]);
                int var14 = arg1++;
                arg0[var14] = (byte) (arg0[var14] - arg8[arg7++]);
                int var15 = arg1++;
                arg0[var15] = (byte) (arg0[var15] - arg8[arg7++]);
                int var16 = arg1++;
                arg0[var16] = (byte) (arg0[var16] - arg8[arg7++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg0[var10001] = (byte) (arg0[var10001] - arg8[arg7++]);
            }
            arg7 += arg5;
            arg1 += arg3;
            var11++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)V")
    public static final void method420(int arg0) {
        client.field3749.method1131((byte) -102);
        field687++;
        class13.field223.method1131((byte) -109);
        for (class377 var1 = (class377) class34.field679.method1132((byte) 52); var1 != null; var1 = (class377) class34.field679.method1134(8446)) {
            int var18 = var1.field5062;
            if (var18 < 1000) {
                var1.method3045(true);
                if (var18 == 57 || var18 == 44 || var18 == 20 || var18 == 58 || var18 == 16 || var18 == 50 || var18 == 3) {
                    class13.field223.method1129(var1, 262144);
                } else {
                    client.field3749.method1129(var1, 262144);
                }
            }
        }
        if (arg0 > -113) {
            method419(null, 119, 0, -121, 59, 26, false, -85, null);
        }
        client.field3749.method1138(26268, class34.field679);
        class13.field223.method1138(26268, class34.field679);
        if (class271.field3704 <= 1) {
            class590.field8544 = null;
        } else if (class189.field2310 && class376.field5043.method1687(-7653, 81) && class271.field3704 > 2) {
            class590.field8544 = (class377) class34.field679.field2232.field7522.field7522;
        } else {
            class590.field8544 = (class377) class34.field679.field2232.field7522;
        }
        int var2 = -1;
        class471 var3 = (class471) class404.field5707.method1132((byte) 60);
        if (var3 != null) {
            var2 = var3.method1730(true);
        }
        if (!class361.field4805) {
            if (var2 == 0 && (class380.field5095 == 1 && class271.field3704 > 2 || class268.method1623(117))) {
                var2 = 2;
            }
            if (var2 == 2 && class271.field3704 > 0 && var3 != null) {
                if (class386.field5135 == null && class160.field1948 == 0) {
                    class25.method369(var3.method1733((byte) 103), var3.method1729(false), 126);
                } else {
                    class188.field2297 = 2;
                }
            }
            if (var2 == 0 && class271.field3704 > 0) {
                class469.method2755(90);
            }
            if (class386.field5135 != null || class160.field1948 != 0) {
                return;
            }
            class188.field2297 = 0;
            class115.field1496 = null;
            return;
        }
        if (var2 == -1) {
            int var4 = class478.field6713.method1349(-117);
            int var5 = class478.field6713.method1338(1);
            if (var4 < class22.field548 - 10 || (class675.field9685 + class22.field548 + 10) < var4 || class1.field2 - 10 > var5 || var5 > (class1.field2 + class84.field1195 + 10)) {
                class404.method2437((byte) 5);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class22.field548;
        int var7 = class1.field2;
        int var8 = class675.field9685;
        int var9 = var3.method1729(false);
        int var10 = var3.method1733((byte) 76);
        int var11 = -1;
        for (int var12 = 0; var12 < class271.field3704; var12++) {
            if (class120.field1561) {
                int var17 = (class271.field3704 - var12 - 1) * 16 + (var7 + 33);
                if (var9 > var6 && var9 < var6 + var8 && var10 > (var17 - 13) && var10 < var17 + 4) {
                    var11 = var12;
                }
            } else {
                int var16 = (class271.field3704 - var12 - 1) * 16 + var7 + 31;
                if (var6 < var9 && (var6 + var8) > var9 && var10 > (var16 - 13) && var10 < var16 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class106 var14 = new class106(class34.field679);
            for (class377 var15 = (class377) var14.method774(99); var15 != null; var15 = (class377) var14.method772(104)) {
                if (var11 == var13) {
                    class397.method2402(var9, -31964, var15, var10);
                }
                var13++;
            }
        }
        class404.method2437((byte) 5);
        return;
    }
}
