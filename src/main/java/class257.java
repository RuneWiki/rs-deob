import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class257 extends class445 {

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
    public int[] field3415 = new int[1];

    @OriginalMember(owner = "client!we", name = "x", descriptor = "[I")
    public int[] field3418 = new int[] { -1 };

    @OriginalMember(owner = "client!we", name = "y", descriptor = "[I")
    public static int[] field3419 = new int[13];

    @OriginalMember(owner = "client!we", name = "C", descriptor = "Lgd;")
    public static class206 field3423 = new class206("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Lmc;")
    public static class78 field3424 = new class78(49, -1);

    @OriginalMember(owner = "client!we", name = "F", descriptor = "Lmc;")
    public static class78 field3426 = new class78(50, 3);

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Lmc;")
    public static class78 field3427;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "Lmc;")
    public static class78 field3428;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "Lmc;")
    public static class78 field3430;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIZLnb;IILjo;Lwm;)Lgn;")
    public final class456 method1446(int arg0, int arg1, int arg2, int arg3, boolean arg4, class181 arg5, int arg6, int arg7, class202 arg8, class364 arg9) {
        field3421++;
        class456 var11 = null;
        int var12 = arg2;
        class280 var13 = null;
        if (arg3 != -1) {
            var13 = class193.field2611.method1203(arg3, -73);
        }
        int[] var14 = this.field3418;
        if (var13 != null && var13.field3720 != null) {
            var14 = new int[var13.field3720.length];
            for (int var15 = 0; var15 < var13.field3720.length; var15++) {
                int var16 = var13.field3720[var15];
                if (var16 >= 0 && this.field3418.length > var16) {
                    var14[var15] = this.field3418[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        if (arg7 >= -74) {
            return null;
        }
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class134 var23 = null;
        class134 var24 = null;
        if (arg5 != null) {
            int var25 = arg5.field2468[arg0];
            var12 = arg2 | 0x20;
            int var26 = var25 >>> 16;
            var20 = var25 & 0xFFFF;
            var23 = class395.field5477.method263(-16777216, var26);
            if (var23 != null) {
                var18 |= var23.method816(255, var20);
                var17 |= var23.method814(var20, (byte) 103);
                var19 |= arg5.field2487;
            }
            if ((arg5.field2490 || class293.field3917) && arg6 != -1 && arg5.field2468.length > arg6) {
                var22 = arg5.field2466[arg0];
                int var27 = arg5.field2468[arg6];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class395.field5477.method263(-16777216, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method816(255, var21);
                    var17 |= var24.method814(var21, (byte) 55);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var29 = this.method1449(arg8 == null ? null : arg8.field2740, -100, var14, arg4, arg3);
        if (class300.field4012 != null) {
            var11 = (class456) class300.field4012.method493((byte) 19, var29);
        }
        if (var11 == null || arg9.method2103(var11.method1863(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method1979(var12, var11.method1863());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class175.field2385.method1557(var14[var33], 21992).method2587((byte) -75, arg4)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class284[] var34 = new class284[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class175.field2385.method1557(var14[var35], 21992).method2596((byte) -103, arg4);
                }
            }
            if (var13 != null && var13.field3732 != null) {
                for (int var36 = 0; var36 < var13.field3732.length; var36++) {
                    if (var13.field3732[var36] != null && var34[var36] != null) {
                        int var37 = var13.field3732[var36][0];
                        int var38 = var13.field3732[var36][1];
                        int var39 = var13.field3732[var36][2];
                        int var40 = var13.field3732[var36][3];
                        int var41 = var13.field3732[var36][4];
                        int var42 = var13.field3732[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method1612(var41, var42, var40, 58);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method1604(var37, var39, 104, var38);
                        }
                    }
                }
            }
            class284 var43 = new class284(var34, var34.length);
            if (arg8 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg9.method2094(var43, var31, class309.field4088, 64, 850);
            if (arg8 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (arg8.field2740[var44] < class138.field2004[var44].length) {
                        var11.method1872(class188.field2577[var44], class138.field2004[var44][arg8.field2740[var44]]);
                    }
                    if (arg8.field2740[var44] < class312.field4111[var44].length) {
                        var11.method1872(class419.field5689[var44], class312.field4111[var44][arg8.field2740[var44]]);
                    }
                }
            }
            if (class300.field4012 != null) {
                var11.method1841(var12);
                class300.field4012.method505(var29, var11, 95);
            }
        }
        if (arg5 == null || var23 == null) {
            return var11;
        } else {
            class456 var45 = var11.method1893((byte) 1, var12, true);
            var45.method2680(var22, var24, var21, (byte) 97, arg5.field2487, arg1 - 1, var20, var23, 0);
            return var45;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method1447(int arg0, int arg1, Random arg2) {
        field3417++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (arg0 != 20094) {
            return 93;
        } else if (class123.method761(true, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class212.method1202(-16100, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lr;I)V")
    public static final void method1448(class110 arg0, int arg1) {
        class455.field6174 = 0;
        class136.field1981 = arg1;
        field3414++;
        class125.field1822 = new class472();
        class480.field6626 = new class255[1024];
        class324.method1808(-3227, arg0);
        class277.method1566(-124, arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([II[IZI)J")
    private final long method1449(int[] arg0, int arg1, int[] arg2, boolean arg3, int arg4) {
        field3420++;
        long[] var6 = class268.field3579;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg4 >> 8)) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg4 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var18 = var11 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 24) ^ var11) & 0xFFL)];
            long var20 = var6[(int) ((var18 ^ (long) (arg2[var13] >> 16)) & 0xFFL)] ^ var18 >>> 8;
            long var22 = var6[(int) (((long) (arg2[var13] >> 8) ^ var20) & 0xFFL)] ^ var20 >>> 8;
            var11 = var22 >>> 8 ^ var6[(int) (((long) arg2[var13] ^ var22) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        long var15 = var6[(int) ((var11 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
        int var17 = 1 / ((arg1 + 41) / 56);
        return var15;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhk;")
    public static final class59 method1450(Throwable arg0, String arg1) {
        field3416++;
        class59 var2;
        if (arg0 instanceof class59) {
            var2 = (class59) arg0;
            var2.field785 = var2.field785 + ' ' + arg1;
        } else {
            var2 = new class59(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZI)Lcu;")
    public static final class132 method1451(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3422++;
        class132 var5 = new class132();
        var5.field1939 = arg4;
        var5.field1942 = arg1;
        class214.field2883.method1525((byte) 19, var5, (long) arg0);
        class130.method799(0, arg4);
        class464 var6 = class150.method888((byte) -115, arg0);
        if (var6 != null) {
            class490.method2854(var6, (byte) 120);
        }
        if (class16.field231 != null) {
            class490.method2854(class16.field231, (byte) 103);
            class16.field231 = null;
        }
        class181.method1061(true);
        int var7 = 27 / ((arg2 - 42) / 45);
        if (var6 != null) {
            class265.method1499(!arg3, var6, (byte) 125);
        }
        if (!arg3) {
            class382.method2347(arg4);
        }
        if (!arg3 && class196.field2674 != -1) {
            class291.method1636(class196.field2674, 1, (byte) 78);
        }
        return var5;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method1452(byte arg0) {
        field3419 = null;
        field3430 = null;
        field3428 = null;
        field3427 = null;
        field3423 = null;
        if (arg0 != -3) {
            field3427 = null;
        }
        field3426 = null;
        field3424 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I")
    public static final int method1453(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 <= 110) {
            return -55;
        }
        field3413++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg3;
        }
    }

    static {
        new class206("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field3427 = new class78(47, 7);
        field3428 = new class78(1, -1);
        field3430 = new class78(79, 7);
    }
}
