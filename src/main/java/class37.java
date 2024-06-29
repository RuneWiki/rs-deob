import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 extends class123 {

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public int field912 = -1;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public int field914 = 0;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "Loa;")
    private static class98 field909 = class38.method349(255, "Loaded fonts");

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "Loa;")
    public static class98 field910 = field909;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Loa;")
    private static class98 field907 = class38.method349(255, "Please wait)3)3)3");

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Loa;")
    public static class98 field906 = field907;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Loa;")
    public static class98 field905 = class38.method349(255, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field918 = 0;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "Loa;")
    public static class98 field921 = field907;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field916 = 0;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "Loa;")
    public static class98 field922 = class38.method349(255, "Schlie-8en");

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "Loa;")
    public static class98 field927 = class38.method349(255, "l");

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "Z")
    public static volatile boolean field929 = true;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "Loc;")
    public static class100 field920;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[I[III[Lv;)V")
    public static final void method345(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, class140[] arg5) {
        field913++;
        if (arg0 >= -87) {
            method347((byte) 12);
        }
        if (arg3 >= arg4) {
            return;
        }
        int var6 = arg3 - 1;
        int var7 = (arg3 + arg4) / 2;
        int var8 = arg4 + 1;
        class140 var9 = arg5[var7];
        arg5[var7] = arg5[arg3];
        arg5[arg3] = var9;
        while (var6 < var8) {
            boolean var10 = true;
            do {
                var8--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg2[var11] == 2) {
                        var12 = arg5[var8].field3410;
                        var13 = var9.field3410;
                    } else if (arg2[var11] == 1) {
                        var13 = var9.field3421;
                        if (var13 == -1 && arg1[var11] == 1) {
                            var13 = 2001;
                        }
                        var12 = arg5[var8].field3421;
                        if (var12 == -1 && arg1[var11] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg2[var11] == 3) {
                        var12 = arg5[var8].field3414 ? 1 : 0;
                        var13 = var9.field3414 ? 1 : 0;
                    } else {
                        var13 = var9.field3417;
                        var12 = arg5[var8].field3417;
                    }
                    if (var12 != var13) {
                        if ((arg1[var11] != 1 || var13 >= var12) && (arg1[var11] != 0 || var12 >= var13)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var6++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg2[var15] == 2) {
                        var17 = var9.field3410;
                        var16 = arg5[var6].field3410;
                    } else if (arg2[var15] == 1) {
                        var16 = arg5[var6].field3421;
                        if (var16 == -1 && arg1[var15] == 1) {
                            var16 = 2001;
                        }
                        var17 = var9.field3421;
                        if (var17 == -1 && arg1[var15] == 1) {
                            var17 = 2001;
                        }
                    } else if (arg2[var15] == 3) {
                        var17 = var9.field3414 ? 1 : 0;
                        var16 = arg5[var6].field3414 ? 1 : 0;
                    } else {
                        var17 = var9.field3417;
                        var16 = arg5[var6].field3417;
                    }
                    if (var16 != var17) {
                        if ((arg1[var15] != 1 || var16 >= var17) && (arg1[var15] != 0 || var16 <= var17)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var8 > var6) {
                class140 var18 = arg5[var6];
                arg5[var6] = arg5[var8];
                arg5[var8] = var18;
            }
        }
        method345(-99, arg1, arg2, arg3, var8, arg5);
        method345(-88, arg1, arg2, var8 + 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZ)Loa;")
    public static final class98 method346(int arg0, int arg1, boolean arg2) {
        int var3 = 65 % ((-arg1 - 16) / 54);
        field917++;
        return class24.method265(arg0, 922465136, 10, arg2);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
    public static void method347(byte arg0) {
        field909 = null;
        field922 = null;
        field906 = null;
        field907 = null;
        field905 = null;
        field910 = null;
        field920 = null;
        field927 = null;
        if (arg0 < 67) {
            method346(69, -10, false);
        }
        field921 = null;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Z")
    public static final boolean method348(int arg0) {
        long var1 = class44.method375((byte) 83);
        int var3 = (int) (var1 - class77.field1693);
        if (var3 > 200) {
            var3 = 200;
        }
        class77.field1693 = var1;
        class54.field1196 += var3;
        field904++;
        if (arg0 != 13918) {
            method347((byte) -105);
        }
        if (class25.field610 == 0 && client.field509 == 0 && class98.field2268 == 0 && class58.field1301 == 0) {
            return true;
        } else if (class78.field1706 == null) {
            return false;
        } else {
            try {
                if (class54.field1196 > 30000) {
                    throw new IOException();
                }
                while (client.field509 < 20 && class58.field1301 > 0) {
                    class118 var4 = (class118) class130.field3051.method10((byte) 54);
                    class8 var5 = new class8(4);
                    var5.method95(1, true);
                    var5.method74((int) var4.field2729, (byte) -35);
                    class78.field1706.method278(var5.field132, (byte) -102, 4, 0);
                    class112.field2507.method12(var4, -31636, var4.field2729);
                    class58.field1301--;
                    client.field509++;
                }
                while (class25.field610 < 20 && class98.field2268 > 0) {
                    class118 var6 = (class118) class6.field111.method982(-46);
                    class8 var7 = new class8(4);
                    var7.method95(0, true);
                    var7.method74((int) var6.field2729, (byte) -35);
                    class78.field1706.method278(var7.field132, (byte) -104, 4, 0);
                    var6.method22(arg0 - 13918);
                    class106.field2430.method12(var6, -31636, var6.field2729);
                    class98.field2268--;
                    class25.field610++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class78.field1706.method284(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class54.field1196 = 0;
                    byte var10 = 0;
                    if (class62.field1317 == null) {
                        var10 = 8;
                    } else if (class67.field1426 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = 512 - class67.field1426;
                        int var12 = class79.field1741.field132.length - class62.field1317.field2632;
                        if (var11 > var12 - class79.field1741.field182) {
                            var11 = var12 - class79.field1741.field182;
                        }
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class78.field1706.method285(class79.field1741.field182, var11, class79.field1741.field132, 5000);
                        if (class46.field1051 != 0) {
                            for (int var13 = 0; var13 < var11; var13++) {
                                class79.field1741.field132[class79.field1741.field182 + var13] = (byte) class18.method172(class79.field1741.field132[class79.field1741.field182 + var13], class46.field1051);
                            }
                        }
                        class67.field1426 += var11;
                        class79.field1741.field182 += var11;
                        if (class79.field1741.field182 == var12) {
                            if (class62.field1317.field2729 == 16711935L) {
                                class55.field1230 = class79.field1741;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class73 var15 = class132.field3185[var14];
                                    if (var15 != null) {
                                        class55.field1230.field182 = var14 * 4 + 5;
                                        int var16 = class55.field1230.method70(false);
                                        var15.method598(arg0 + 8777, var16);
                                    }
                                }
                            } else {
                                class111.field2491.reset();
                                class111.field2491.update(class79.field1741.field132, 0, var12);
                                int var17 = (int) class111.field2491.getValue();
                                if (class62.field1317.field2624 != var17) {
                                    try {
                                        class78.field1706.method283(-30232);
                                    } catch (Exception var29) {
                                    }
                                    class78.field1706 = null;
                                    class46.field1051 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class14.field297++;
                                    return false;
                                }
                                class14.field297 = 0;
                                class36.field882 = 0;
                                class62.field1317.field2633.method593((class62.field1317.field2729 & 0xFF0000L) == 16711680L, (byte) 65, class26.field627, (int) (class62.field1317.field2729 & 0xFFFFL), class79.field1741.field132);
                            }
                            class62.field1317.method975(67);
                            if (class26.field627) {
                                client.field509--;
                            } else {
                                class25.field610--;
                            }
                            class67.field1426 = 0;
                            class79.field1741 = null;
                            class62.field1317 = null;
                        } else {
                            if (class67.field1426 != 512) {
                                break;
                            }
                            class67.field1426 = 0;
                        }
                    } else {
                        int var18 = var10 - class6.field105.field182;
                        if (var18 > var9) {
                            var18 = var9;
                        }
                        class78.field1706.method285(class6.field105.field182, var18, class6.field105.field132, 5000);
                        if (class46.field1051 != 0) {
                            for (int var19 = 0; var19 < var18; var19++) {
                                class6.field105.field132[class6.field105.field182 + var19] = (byte) class18.method172(class6.field105.field132[class6.field105.field182 + var19], class46.field1051);
                            }
                        }
                        class6.field105.field182 += var18;
                        if (class6.field105.field182 < var10) {
                            break;
                        }
                        if (class62.field1317 == null) {
                            class6.field105.field182 = 0;
                            int var20 = class6.field105.method62((byte) 103);
                            int var21 = class6.field105.method68(-2);
                            int var22 = class6.field105.method62((byte) 86);
                            long var23 = (long) ((var20 << 16) + var21);
                            int var25 = class6.field105.method70(false);
                            class118 var26 = (class118) class112.field2507.method17(-16, var23);
                            class26.field627 = true;
                            if (var26 == null) {
                                var26 = (class118) class106.field2430.method17(arg0 - 13934, var23);
                                class26.field627 = false;
                            }
                            if (var26 == null) {
                                throw new IOException();
                            }
                            class62.field1317 = var26;
                            int var27 = var22 == 0 ? 5 : 9;
                            class79.field1741 = new class8(var25 + var27 + class62.field1317.field2632);
                            class79.field1741.method95(var22, true);
                            class79.field1741.method72((byte) -106, var25);
                            class6.field105.field182 = 0;
                            class67.field1426 = 8;
                        } else if (class67.field1426 == 0) {
                            if (class6.field105.field132[0] == -1) {
                                class6.field105.field182 = 0;
                                class67.field1426 = 1;
                            } else {
                                class62.field1317 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class78.field1706.method283(arg0 ^ 0xFFFFBFB6);
                } catch (Exception var28) {
                }
                class36.field882++;
                class78.field1706 = null;
                return false;
            }
        }
    }
}
