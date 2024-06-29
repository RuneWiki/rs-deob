import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class26 extends class28 {

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public static int field703 = -1;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "[I")
    public static int[] field709 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "Lgk;")
    public static class6 field707 = null;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "Lvf;")
    public static class265 field711 = class87.method582(-46, "Texturen geladen)3");

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "Lvf;")
    public class265 field713;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "[I")
    public int[] field712;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "[I")
    public int[] field714;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "[Lvf;")
    public class265[] field700;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "[Lak;")
    public class269[] field701;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
    public static void method232(byte arg0) {
        field709 = null;
        field707 = null;
        field711 = null;
        int var1 = 16 % ((7 - arg0) / 59);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILgk;)I")
    public static final int method233(byte arg0, int arg1, class6 arg2) {
        field702++;
        if (arg2.field128 == null || arg1 >= arg2.field128.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field128[arg1];
            int var5 = 44 % ((38 - arg0) / 42);
            int var6 = 0;
            byte var7 = 0;
            while (true) {
                int var8 = var4[var6++];
                int var9 = 0;
                byte var10 = 0;
                if (var8 == 0) {
                    return var3;
                }
                if (var8 == 1) {
                    var9 = class50.field1055[var4[var6++]];
                }
                if (var8 == 15) {
                    var10 = 1;
                }
                if (var8 == 16) {
                    var10 = 2;
                }
                if (var8 == 17) {
                    var10 = 3;
                }
                if (var8 == 2) {
                    var9 = class39.field904[var4[var6++]];
                }
                if (var8 == 3) {
                    var9 = class49.field1036[var4[var6++]];
                }
                if (var8 == 4) {
                    int var11 = var4[var6++] << 16;
                    int var12 = var11 + var4[var6++];
                    class6 var13 = class21.method204(var12, -16257);
                    int var14 = var4[var6++];
                    if (var14 != -1 && (!class54.method418(var14, 0).field4533 || class91.field1632)) {
                        for (int var15 = 0; var15 < var13.field92.length; var15++) {
                            if (var14 + 1 == var13.field92[var15]) {
                                var9 += var13.field218[var15];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var9 = class256.field4385[var4[var6++]];
                }
                if (var8 == 6) {
                    var9 = class216.field3901[class39.field904[var4[var6++]] - 1];
                }
                if (var8 == 7) {
                    var9 = class256.field4385[var4[var6++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class214.field3827.field2177;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class148.field2756[var16]) {
                            var9 += class39.field904[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var4[var6++] << 16;
                    int var18 = var17 + var4[var6++];
                    class6 var19 = class21.method204(var18, -16257);
                    int var20 = var4[var6++];
                    if (var20 != -1 && (!class54.method418(var20, 0).field4533 || class91.field1632)) {
                        for (int var21 = 0; var21 < var19.field92.length; var21++) {
                            if (var20 + 1 == var19.field92[var21]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class15.field448;
                }
                if (var8 == 12) {
                    var9 = class200.field3579;
                }
                if (var8 == 13) {
                    int var22 = class256.field4385[var4[var6++]];
                    int var23 = var4[var6++];
                    var9 = (var22 & 0x1 << var23) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var4[var6++];
                    var9 = class13.method101(-1, var24);
                }
                if (var8 == 18) {
                    var9 = (class214.field3827.field2600 >> 7) + class64.field1248;
                }
                if (var8 == 19) {
                    var9 = (class214.field3827.field2564 >> 7) + class231.field4073;
                }
                if (var8 == 20) {
                    var9 = var4[var6++];
                }
                if (var10 == 0) {
                    if (var7 == 0) {
                        var3 += var9;
                    }
                    if (var7 == 1) {
                        var3 -= var9;
                    }
                    if (var7 == 2 && var9 != 0) {
                        var3 /= var9;
                    }
                    if (var7 == 3) {
                        var3 *= var9;
                    }
                    var7 = 0;
                } else {
                    var7 = var10;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(B)Lva;")
    public static final class123 method234(byte arg0) {
        field708++;
        try {
            return arg0 == -35 ? (class123) Class.forName("o").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return new class50();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
    public static final void method235(int arg0, byte arg1) {
        field699++;
        class171.field3088.method1891(-23549, arg0);
        if (arg1 != -37) {
            field703 = 42;
        }
    }
}
