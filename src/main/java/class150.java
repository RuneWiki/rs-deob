import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class150 {

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Loh;")
    public static class263 field2709 = class253.method1681(-127, "(U (X");

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field2711 = 0;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Llb;")
    public static class127 field2704 = new class127(64);

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Loh;")
    public static class263 field2712 = class253.method1681(-123, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "[Lt;")
    public static class193[] field2713 = new class193[50];

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Lmc;")
    public static class192 field2707;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lpc;")
    public static class21 field2705;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method982(int arg0, String arg1) {
        field2710++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg0 != 25914) {
            field2712 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method983(int arg0) {
        class189.field3394.method1511(Integer.MAX_VALUE);
        int var1 = class189.field3394.method1512(8, 126);
        if (class13.field345 > var1) {
            for (int var2 = var1; var2 < class13.field345; var2++) {
                class137.field2499[class70.field1411++] = class117.field2191[var2];
            }
        }
        field2703++;
        if (class13.field345 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class13.field345 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class117.field2191[var3];
            class90 var5 = class31.field774[var4];
            int var6 = class189.field3394.method1512(1, 127);
            if (var6 == 0) {
                class117.field2191[class13.field345++] = var4;
                var5.field4670 = class228.field4012;
            } else {
                int var7 = class189.field3394.method1512(2, 126);
                if (var7 == 0) {
                    class117.field2191[class13.field345++] = var4;
                    var5.field4670 = class228.field4012;
                    class21.field627[class249.field4355++] = var4;
                } else if (var7 == 1) {
                    class117.field2191[class13.field345++] = var4;
                    var5.field4670 = class228.field4012;
                    int var8 = class189.field3394.method1512(3, 126);
                    var5.method1809(false, var8, (byte) 84);
                    int var9 = class189.field3394.method1512(1, 127);
                    if (var9 == 1) {
                        class21.field627[class249.field4355++] = var4;
                    }
                } else if (var7 == 2) {
                    class117.field2191[class13.field345++] = var4;
                    var5.field4670 = class228.field4012;
                    int var10 = class189.field3394.method1512(3, 126);
                    var5.method1809(true, var10, (byte) 84);
                    int var11 = class189.field3394.method1512(3, 126);
                    var5.method1809(true, var11, (byte) 84);
                    int var12 = class189.field3394.method1512(1, 126);
                    if (var12 == 1) {
                        class21.field627[class249.field4355++] = var4;
                    }
                } else if (var7 == 3) {
                    class137.field2499[class70.field1411++] = var4;
                }
            }
        }
        if (arg0 > -25) {
            field2704 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static void method984(boolean arg0) {
        field2713 = null;
        field2704 = null;
        field2705 = null;
        field2712 = null;
        if (!arg0) {
            field2707 = null;
            field2709 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILsi;)V")
    public static final void method985(int arg0, class194 arg1) {
        if (arg0 != -21353) {
            field2711 = 81;
        }
        field2708++;
        byte[] var2 = new byte[24];
        if (class217.field3864 != null) {
            try {
                int var3 = 0;
                class217.field3864.method1329(0L, 95);
                class217.field3864.method1331(var2, -53);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1271(24, 0, var2, arg0 ^ 0xFFFFE4D2);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static final void method986(int arg0) {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var3 = 0; var3 < (class252.field4384 - 1); var3++) {
                if (class202.field3645[var3] < 1000 && class202.field3645[var3 + 1] > 1000) {
                    var1 = false;
                    class263 var4 = class68.field1382[var3];
                    class68.field1382[var3] = class68.field1382[var3 + 1];
                    class68.field1382[var3 + 1] = var4;
                    class263 var5 = class156.field2811[var3];
                    class156.field2811[var3] = class156.field2811[var3 + 1];
                    class156.field2811[var3 + 1] = var5;
                    int var6 = class106.field2018[var3];
                    class106.field2018[var3] = class106.field2018[var3 + 1];
                    class106.field2018[var3 + 1] = var6;
                    int var7 = class41.field918[var3];
                    class41.field918[var3] = class41.field918[var3 + 1];
                    class41.field918[var3 + 1] = var7;
                    short var8 = class202.field3645[var3];
                    class202.field3645[var3] = class202.field3645[var3 + 1];
                    class202.field3645[var3 + 1] = var8;
                    long var9 = class215.field3814[var3];
                    class215.field3814[var3] = class215.field3814[var3 + 1];
                    class215.field3814[var3 + 1] = var9;
                }
            }
        }
        int var2 = -87 % ((arg0 - 17) / 46);
        field2706++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Ltd;")
    public static final class70 method987(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field27; var4++) {
            class70 var5 = var3.field37[var4];
            if ((var5.field1408 >> 29 & 0x3L) == 2L && var5.field1405 == arg1 && var5.field1403 == arg2) {
                class271.method1848(var5);
                return var5;
            }
        }
        return null;
    }
}
