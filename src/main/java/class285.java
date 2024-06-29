import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class285 extends class202 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field4493 = 0;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public int field4498 = -1;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field4492 = 0;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4508 = "Face here";

    @OriginalMember(owner = "client!p", name = "w", descriptor = "[I")
    public static int[] field4504 = new int[32];

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field4513 = -1;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "[Z")
    public static boolean[] field4514;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4515;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public int field4499;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public int field4501;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lf;")
    public static class36 field4503;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method1914(int arg0, byte[] arg1, int arg2, int arg3) {
        field4500++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        int var6 = 0;
        if (arg3 != -1) {
            field4492 = -60;
        }
        while (var6 < arg0) {
            int var7 = arg1[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                label31: {
                    if (var7 >= 128 && var7 < 160) {
                        char var8 = class40.field748[var7 - 128];
                        if (var8 == '\u0000') {
                            break label31;
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            var6++;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)I")
    public static final int method1915(int arg0) {
        int var1 = 57 / ((46 - arg0) / 53);
        field4507++;
        return 2;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public static final void method1916(int arg0) {
        class67.field1103.method530(255);
        field4506++;
        int var1 = class67.field1103.method540(8, 882786883);
        if (var1 < class141.field2287) {
            for (int var2 = var1; var2 < class141.field2287; var2++) {
                class33.field522[class149.field2394++] = class221.field3648[var2];
            }
        }
        if (class141.field2287 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class141.field2287 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class221.field3648[var3];
            class15 var5 = class137.field2260[var4];
            int var6 = class67.field1103.method540(1, 882786883);
            if (var6 == 0) {
                class221.field3648[class141.field2287++] = var4;
                var5.field3376 = class222.field3682;
            } else {
                int var7 = class67.field1103.method540(2, 882786883);
                if (var7 == 0) {
                    class221.field3648[class141.field2287++] = var4;
                    var5.field3376 = class222.field3682;
                    class106.field1701[class43.field802++] = var4;
                } else if (var7 == 1) {
                    class221.field3648[class141.field2287++] = var4;
                    var5.field3376 = class222.field3682;
                    int var8 = class67.field1103.method540(3, 882786883);
                    var5.method1426(1, var8, -1);
                    int var9 = class67.field1103.method540(1, arg0 + 882786882);
                    if (var9 == 1) {
                        class106.field1701[class43.field802++] = var4;
                    }
                } else if (var7 == 2) {
                    class221.field3648[class141.field2287++] = var4;
                    var5.field3376 = class222.field3682;
                    if (class67.field1103.method540(1, 882786883) == 1) {
                        int var10 = class67.field1103.method540(3, arg0 ^ 0x349E4242);
                        var5.method1426(2, var10, -1);
                        int var11 = class67.field1103.method540(3, 882786883);
                        var5.method1426(2, var11, -1);
                    } else {
                        int var12 = class67.field1103.method540(3, 882786883);
                        var5.method1426(0, var12, -1);
                    }
                    int var13 = class67.field1103.method540(1, 882786883);
                    if (var13 == 1) {
                        class106.field1701[class43.field802++] = var4;
                    }
                } else if (var7 == 3) {
                    class33.field522[class149.field2394++] = var4;
                }
            }
        }
        if (arg0 != 1) {
            method1917(103, -71, 79, -28, true);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1917(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4495++;
        boolean var5 = false;
        class1.field13 = 0L;
        int var6 = class259.method1764(arg0 + 1);
        if (arg1 == 3 || var6 == 3) {
            arg4 = true;
        }
        if (class165.field2624.startsWith("mac") && arg1 > 0) {
            arg4 = true;
        }
        if (~arg1 < arg0 == var6 <= 0) {
            var5 = true;
        }
        if (arg4 && arg1 > 0) {
            var5 = true;
        }
        class254.method1729(var5, arg2, 0, arg3, var6, arg4, arg1);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILik;Lik;IIIIJ)V")
    public static final void method1918(int arg0, int arg1, int arg2, int arg3, class260 arg4, class260 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class278 var12 = new class278();
        var12.field4372 = arg10;
        var12.field4382 = arg1 * 128 + 64;
        var12.field4384 = arg2 * 128 + 64;
        var12.field4379 = arg3;
        var12.field4390 = arg4;
        var12.field4375 = arg5;
        var12.field4391 = arg6;
        var12.field4378 = arg7;
        var12.field4369 = arg8;
        var12.field4374 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class288.field4563[var13][arg1][arg2] == null) {
                class288.field4563[var13][arg1][arg2] = new class134(var13, arg1, arg2);
            }
        }
        class288.field4563[arg0][arg1][arg2].field2143 = var12;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(Z)V")
    public static void method1919(boolean arg0) {
        field4503 = null;
        if (arg0) {
            method1914(49, (byte[]) null, -16, -24);
        }
        field4515 = null;
        field4514 = null;
        field4504 = null;
        field4508 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4504[var1] = var0 - 1;
            var0 += var0;
        }
        field4514 = new boolean[5];
        field4515 = "flash2:";
    }
}
