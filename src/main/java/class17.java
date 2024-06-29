import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class17 {

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field212 = "Loaded textures";

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lte;")
    public static class244 field201 = new class244(4);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Leh;")
    public static class137 field204;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[Lvf;")
    public static class55[] field203;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[S")
    public static short[] field206;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[[[I")
    public static int[][][] field209;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static final void method87(int arg0) {
        field213++;
        class129.method875((byte) -21, class5.field75);
        class262.field4244++;
        if (class80.field991 && class287.field4582) {
            int var1 = class92.field1156;
            int var2 = var1 - class189.field3069;
            int var3 = class113.field1623;
            int var4 = var3 - class148.field2331;
            if (class289.field4602 > var2) {
                var2 = class289.field4602;
            }
            int var5 = class5.field75.field1840;
            if (class128.field2055 > var4) {
                var4 = class128.field2055;
            }
            if (class5.field75.field1879 + var4 > class128.field2055 + class150.field2343.field1879) {
                var4 = class150.field2343.field1879 + class128.field2055 - class5.field75.field1879;
            }
            if (class5.field75.field1809 + var2 > class289.field4602 + class150.field2343.field1809) {
                var2 = class289.field4602 + class150.field2343.field1809 - class5.field75.field1809;
            }
            int var6 = var2 - class214.field3434;
            int var7 = class150.field2343.field1872 + var2 - class289.field4602;
            int var8 = var4 - class215.field3455;
            if (class5.field75.field1750 < class262.field4244 && (var8 > var5 || -var5 > var8 || var5 < var6 || var6 < -var5)) {
                class293.field4652 = true;
            }
            int var9 = var4 + class150.field2343.field1835 - class128.field2055;
            if (class5.field75.field1912 != null && class293.field4652) {
                class156 var10 = new class156();
                var10.field2516 = class5.field75;
                var10.field2514 = var7;
                var10.field2506 = var9;
                var10.field2512 = class5.field75.field1912;
                class296.method1985(var10, arg0 + 200000);
            }
            if (class113.field1626 == arg0) {
                if (class293.field4652) {
                    if (class5.field75.field1877 != null) {
                        class156 var11 = new class156();
                        var11.field2514 = var7;
                        var11.field2506 = var9;
                        var11.field2512 = class5.field75.field1877;
                        var11.field2516 = class5.field75;
                        var11.field2507 = class121.field1714;
                        class296.method1985(var11, arg0 + 200000);
                    }
                    if (class121.field1714 != null && client.method728(class5.field75) != null) {
                        class204.field3221++;
                        class4.field57.method1932(false, 156);
                        class4.field57.method574(class5.field75.field1844, -1);
                        class4.field57.method572(true, class5.field75.field1829);
                        class4.field57.method568(class121.field1714.field1829, (byte) 113);
                        class4.field57.method594(class121.field1714.field1844, (byte) 117);
                    }
                } else if ((class233.field3851 == 1 || class82.method453(119, class34.field437 - 1)) && class34.field437 > 2) {
                    class237.method1677(-81);
                } else if (class34.field437 > 0) {
                    class178.method1240(4095);
                }
                class5.field75 = null;
            }
        } else if (class262.field4244 > 1) {
            class5.field75 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public static void method88(boolean arg0) {
        field206 = null;
        field201 = null;
        field212 = null;
        if (!arg0) {
            field204 = null;
            field209 = null;
            field203 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBIII)Llc;")
    public static final class257 method89(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field211++;
        long var5 = (long) arg2 & 0xFFFFL | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 << 48 & 0xFFFFL << 48 | (long) arg4 << 32 & 0xFFFFL << 32;
        class257 var7 = (class257) field201.method1693(var5, arg1 + 38);
        if (var7 != null) {
            return var7;
        }
        class223[] var8 = null;
        class202 var9 = class166.method1152(arg2, arg1 - 150);
        if (var9.field3195 != null) {
            var8 = new class223[var9.field3195.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class183 var11 = class262.method1778(false, var9.field3195[var10]);
                var8[var10] = new class223(var11.field2917, var11.field2923, var11.field2915, var11.field2905, var11.field2916, var11.field2922, var11.field2919, var11.field2907);
            }
        }
        if (arg1 == 56) {
            class257 var12 = new class257(var9.field3196, var8, var9.field3200, arg0, arg4, arg3);
            field201.method1694(true, var5, var12);
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)I")
    public static final int method90(int arg0) {
        field210++;
        try {
            if (class252.field4110 == 0) {
                if (class120.field1703 > (class249.method1723((byte) 71) - 5000L)) {
                    return 0;
                }
                class108.field1455 = class194.field3107.method269((byte) 25, class70.field873, class131.field2092);
                class77.field958 = class249.method1723((byte) 26);
                class252.field4110 = 1;
            }
            if (class249.method1723((byte) 36) > (class77.field958 + 30000L)) {
                return class237.method1676(1000, 24573);
            }
            if (class252.field4110 == 1) {
                if (class108.field1455.field3995 == 2) {
                    return class237.method1676(1001, 24573);
                }
                if (class108.field1455.field3995 != 1) {
                    return -1;
                }
                class28.field400 = new class175((Socket) class108.field1455.field3992, class194.field3107);
                class4.field57.field1228 = 0;
                class108.field1455 = null;
                int var1 = 0;
                if (class294.field4667) {
                    var1 = class4.field61;
                }
                class4.field57.method580((byte) 85, 23);
                class4.field57.method574(var1, arg0 ^ 0xFFFFFFFC);
                class28.field400.method1211(class4.field57.field1228, true, 0, class4.field57.field1218);
                if (class128.field2048 != null) {
                    class128.field2048.method155(arg0 ^ 0x3);
                }
                if (class47.field597 != null) {
                    class47.field597.method155(0);
                }
                int var2 = class28.field400.method1216((byte) 29);
                if (class128.field2048 != null) {
                    class128.field2048.method155(0);
                }
                if (class47.field597 != null) {
                    class47.field597.method155(0);
                }
                if (var2 != 0) {
                    return class237.method1676(var2, 24573);
                }
                class252.field4110 = 2;
            }
            if (arg0 != 3) {
                field207 = 102;
            }
            if (class252.field4110 == 2) {
                if (class28.field400.method1217(arg0 - 118) < 2) {
                    return -1;
                }
                class281.field4459 = class28.field400.method1216((byte) 29);
                class281.field4459 <<= 0x8;
                class281.field4459 += class28.field400.method1216((byte) 29);
                class208.field3322 = new byte[class281.field4459];
                class250.field4086 = 0;
                class252.field4110 = 3;
            }
            if (class252.field4110 != 3) {
                return -1;
            }
            int var3 = class28.field400.method1217(-119);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class281.field4459 - class250.field4086)) {
                var3 = class281.field4459 - class250.field4086;
            }
            class28.field400.method1209(arg0 + 110, var3, class208.field3322, class250.field4086);
            class250.field4086 += var3;
            if (class281.field4459 > class250.field4086) {
                return -1;
            } else if (class263.method1782(class208.field3322, 88)) {
                int var4 = 0;
                class79.field989 = new class216[class75.field936];
                for (int var5 = class44.field560; var5 <= class82.field1023; var5++) {
                    class216 var6 = class266.method1791(var5, (byte) -65);
                    if (var6 != null) {
                        class79.field989[var4++] = var6;
                    }
                }
                class28.field400.method1210(-1);
                class208.field3322 = null;
                class202.field3197 = 0;
                class28.field400 = null;
                class252.field4110 = 0;
                class120.field1703 = class249.method1723((byte) 113);
                return 0;
            } else {
                return class237.method1676(1002, 24573);
            }
        } catch (IOException var7) {
            return class237.method1676(1003, 24573);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
    public static final void method91(boolean arg0) {
        field208++;
        if (arg0) {
            field202 = 117;
        }
        class67.field848.method1062(16);
        class190.field3070 = 1;
        class160.field2558 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lbg;")
    public static final class180 method92(int arg0, int arg1) {
        field205++;
        class180 var2 = (class180) class19.field243.method1693((long) arg0, 95);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class293.field4647.method928(3, (byte) 118, arg0);
        class180 var4 = new class180();
        if (arg1 != 570591392) {
            method90(-73);
        }
        if (var3 != null) {
            var4.method1253((byte) -128, new class96(var3));
        }
        class19.field243.method1694(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIILpb;JZ)V")
    public static final void method93(int arg0, int arg1, int arg2, int arg3, class264 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class11 var8 = new class11();
        var8.field127 = arg4;
        var8.field125 = arg1 * 128 + 64;
        var8.field128 = arg2 * 128 + 64;
        var8.field124 = arg3;
        var8.field118 = arg5;
        if (class46.field585[arg0][arg1][arg2] == null) {
            class46.field585[arg0][arg1][arg2] = new class246(arg0, arg1, arg2);
        }
        class46.field585[arg0][arg1][arg2].field4056 = var8;
    }
}
