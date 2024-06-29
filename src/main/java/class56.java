import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class56 extends class235 {

    @OriginalMember(owner = "client!r", name = "A", descriptor = "[I")
    public int[] field889 = new int[1];

    @OriginalMember(owner = "client!r", name = "F", descriptor = "[I")
    public int[] field893 = new int[] { -1 };

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lsb;")
    public static class98 field883 = class47.method368(")1p", 0);

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Lsb;")
    public static class98 field891 = class47.method368(")2", 0);

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Z")
    public static boolean field892 = false;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lsb;")
    private static class98 field882 = class47.method368(" more options", 0);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lsb;")
    public static class98 field885 = field882;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "[[I")
    public static int[][] field897 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLtg;)V")
    public static final void method409(boolean arg0, class75 arg1) {
        field888++;
        if (arg0) {
            class100.field1761 = arg1.method564(class162.field2936, -14783);
            class117.field2099 = arg1.method564(class99.field1749, -14783);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method410(int arg0) {
        int var1 = 10 / ((arg0 - 42) / 48);
        field883 = null;
        field897 = null;
        field885 = null;
        field882 = null;
        field891 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILq;I)V")
    public static final void method411(int arg0, int arg1, class148 arg2, int arg3) {
        field890++;
        if (class199.field3427 != null || class97.field1672 || arg2 == null || class176.method1226(arg0 - 13948, arg2) == null) {
            return;
        }
        class199.field3427 = arg2;
        class131.field2329 = class176.method1226(-13948, arg2);
        class102.field1814 = false;
        class133.field2359 = arg3;
        class144.field2530 = arg1;
        class154.field2806 = arg0;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static final void method412(int arg0) {
        class207.field3546.method1565(-1);
        class122.field2240.method1565(-1);
        if (arg0 != 1) {
            method412(-64);
        }
        class13.field246.method1565(arg0 - 2);
        field887++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLtg;Ltg;Ltg;)V")
    public static final void method413(byte arg0, class75 arg1, class75 arg2, class75 arg3) {
        class95.field1643 = arg2;
        field884++;
        class41.field678 = arg1;
        if (arg0 != 28) {
            method413((byte) -121, (class75) null, (class75) null, (class75) null);
        }
        class203.field3474 = arg3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ[BIII[Lqb;I)V")
    public static final void method414(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, class72[] arg6, int arg7) {
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field886++;
        if (!arg1) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg7 + var11 > 0 && (arg7 + var11) < 103) {
                            arg6[var9].field1175[arg3 + var10][arg7 + var11] = class214.method1427(arg6[var9].field1175[arg3 + var10][arg7 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class216 var12 = new class216(arg2);
        for (int var13 = arg0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class36.method304(arg5, arg7 + var15, arg0 ^ 0x6D, arg3 + var14, var12, 0, arg1, arg4, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLlj;)Loh;")
    public static final class140 method415(boolean arg0, class216 arg1) {
        if (arg0) {
            return null;
        } else {
            field894++;
            return new class140(arg1.method1483(-107), arg1.method1483(-97), arg1.method1483(-100), arg1.method1483(-103), arg1.method1483(-122), arg1.method1483(-86), arg1.method1483(-80), arg1.method1483(-90), arg1.method1448(26420), arg1.method1446(5350));
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public static final void method416(int arg0) {
        field898++;
        int var1 = class144.field2536.method483(arg0 ^ 0x9, 8);
        if (class97.field1671 > var1) {
            for (int var2 = var1; var2 < class97.field1671; var2++) {
                class115.field2071[class31.field557++] = class51.field831[var2];
            }
        }
        if (var1 > class97.field1671) {
            throw new RuntimeException("gppov1");
        }
        class97.field1671 = 0;
        if (arg0 != 1) {
            field892 = true;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class51.field831[var3];
            class192 var5 = class141.field2499[var4];
            int var6 = class144.field2536.method483(8, 1);
            if (var6 == 0) {
                class51.field831[class97.field1671++] = var4;
                var5.field4456 = class236.field4071;
            } else {
                int var7 = class144.field2536.method483(8, 2);
                if (var7 == 0) {
                    class51.field831[class97.field1671++] = var4;
                    var5.field4456 = class236.field4071;
                    class244.field4240[class104.field1855++] = var4;
                } else if (var7 == 1) {
                    class51.field831[class97.field1671++] = var4;
                    var5.field4456 = class236.field4071;
                    int var8 = class144.field2536.method483(8, 3);
                    var5.method1763(var8, false, (byte) 108);
                    int var9 = class144.field2536.method483(8, 1);
                    if (var9 == 1) {
                        class244.field4240[class104.field1855++] = var4;
                    }
                } else if (var7 == 2) {
                    class51.field831[class97.field1671++] = var4;
                    var5.field4456 = class236.field4071;
                    int var10 = class144.field2536.method483(8, 3);
                    var5.method1763(var10, true, (byte) 121);
                    int var11 = class144.field2536.method483(8, 3);
                    var5.method1763(var11, true, (byte) 126);
                    int var12 = class144.field2536.method483(8, 1);
                    if (var12 == 1) {
                        class244.field4240[class104.field1855++] = var4;
                    }
                } else if (var7 == 3) {
                    class115.field2071[class31.field557++] = var4;
                }
            }
        }
    }
}
