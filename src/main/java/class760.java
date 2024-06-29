import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class760 implements Runnable {

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "[Leca;")
    public volatile class793[] field11174 = new class793[2];

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "Z")
    public volatile boolean field11164 = false;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "Z")
    public volatile boolean field11169 = false;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11179 = new String[] { method5497(method5496("\u0003\u0017R\u000e\u007fJ")), method5497(method5496("\u0003\u0017R\u000eK\u0017\u001a\u001b")), method5497(method5496("\u0003\u0017R\u000e~J")), method5497(method5496("\u0003\u0017R\u000e{J")), method5497(method5496("\f\u0001_L")), method5497(method5496("\u0003\u0017R\u000e|J")), method5497(method5496("\u0019Z\u001d\u000eD")), method5497(method5496("\u0003\u0017R\u000e}J")), method5497(method5496("\n\u0006\tLK")), method5497(method5496("\u0003\u0017R\u000exJ")), method5497(method5496("\u0003\u0017R\u000ezJ")) };

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "Lhl;")
    public static class556 field11165 = new class556(56, 2);

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "D")
    public static double field11170 = -1.0D;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "Lvn;")
    public static class330 field11175 = new class330(42, 4);

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "[[J")
    public static long[][] field11177 = new long[8][256];

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "I")
    public static int field11176 = -1;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "[J")
    public static long[] field11178 = new long[11];

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    public static int field11162;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
    public static int field11163;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
    public static int field11166;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
    public static int field11167;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public static int field11168;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    public static int field11171;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    public static int field11172;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
    public static int field11173;

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "Ltga;")
    public class61 field11161;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZI)V")
    public static final void method5489(boolean arg0, int arg1) {
        try {
            class116.field1695 = -1;
            class62.field822 = -1;
            if (!arg0) {
                method5490(-70);
            }
            field11173++;
            class95.field1383 = arg1;
            class130.method1239((byte) -86);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11179[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)I")
    public static final int method5490(int arg0) {
        try {
            field11163++;
            if ((double) class770.field11265 == 3.0D) {
                return 37;
            } else if ((double) class770.field11265 == 4.0D) {
                return 50;
            } else if ((double) class770.field11265 == 6.0D) {
                return 75;
            } else if ((double) class770.field11265 == 8.0D) {
                return 100;
            } else {
                if (arg0 != 0) {
                    field11175 = null;
                }
                return 200;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11179[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
    public static void method5491(boolean arg0) {
        try {
            field11178 = null;
            field11165 = null;
            if (arg0) {
                field11177 = null;
                field11175 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11179[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILrv;I)Z")
    public static final boolean method5492(int arg0, class117 arg1, int arg2) {
        try {
            field11168++;
            int var3 = arg1.method1163(2, -122);
            if (var3 == 0) {
                if (arg1.method1163(1, 87) != 0) {
                    method5492(arg0, arg1, -121);
                }
                int var4 = arg1.method1163(6, -88);
                int var5 = arg1.method1163(6, -126);
                boolean var6 = arg1.method1163(1, -126) == 1;
                if (var6) {
                    class594.field8590[class133.field1893++] = arg0;
                }
                if (class33.field395[arg0] != null) {
                    throw new RuntimeException(field11179[8]);
                }
                class94 var7 = class203.field3191[arg0];
                class738 var8 = class33.field395[arg0] = new class738();
                var8.field1129 = arg0;
                if (class762.field11186[arg0] != null) {
                    var8.method5368(class762.field11186[arg0], false);
                }
                var8.method808(true, 125, var7.field1374);
                var8.field1155 = var7.field1372;
                int var9 = var7.field1375;
                int var10 = var9 >> 28;
                int var11 = (var9 & 0x3FF5A8) >> 14;
                int var12 = var9 & 0xFF;
                int var13 = (var11 << 6) + var4 - class397.field6289;
                int var14 = (var12 << 6) + var5 - class141.field2011;
                var8.field10849 = var7.field1368;
                var8.field10853 = var7.field1373;
                var8.field1198[0] = class284.field4605[arg0];
                var8.field9975 = var8.field9974 = (byte) var10;
                if (class541.method4028(var14, var13, (byte) 113)) {
                    var8.field9974++;
                }
                var8.method5362(var13, var14, (byte) -59);
                var8.field10833 = false;
                class203.field3191[arg0] = null;
                return true;
            } else if (var3 == 1) {
                int var15 = arg1.method1163(2, 81);
                int var16 = class203.field3191[arg0].field1375;
                class203.field3191[arg0].field1375 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
                return false;
            } else if (var3 == 2) {
                int var17 = arg1.method1163(5, 18);
                int var18 = var17 >> 3;
                int var19 = var17 & 0x7;
                int var20 = class203.field3191[arg0].field1375;
                int var21 = (var20 >> 28) + var18 & 0x3;
                int var22 = var20 >> 14 & 0xFF;
                int var23 = var20 & 0xFF;
                if (var19 == 0) {
                    var22--;
                    var23--;
                }
                if (var19 == 1) {
                    var23--;
                }
                if (var19 == 2) {
                    var23--;
                    var22++;
                }
                if (var19 == 3) {
                    var22--;
                }
                if (var19 == 4) {
                    var22++;
                }
                if (var19 == 5) {
                    var22--;
                    var23++;
                }
                if (var19 == 6) {
                    var23++;
                }
                if (var19 == 7) {
                    var23++;
                    var22++;
                }
                class203.field3191[arg0].field1375 = (var21 << 28) - (-(var22 << 14) - var23);
                return false;
            } else {
                int var24 = arg1.method1163(18, -116);
                int var25 = var24 >> 16;
                int var26 = (var24 & 0xFF5C) >> 8;
                int var27 = var24 & 0xFF;
                int var28 = class203.field3191[arg0].field1375;
                int var29 = (var28 >> 28) + var25 & 0x3;
                int var30 = -13 / ((arg2 - 11) / 60);
                int var31 = (var28 >> 14) + var26 & 0xFF;
                int var32 = var27 + var28 & 0xFF;
                class203.field3191[arg0].field1375 = (var29 << 28) + (var31 << 14) + var32;
                return false;
            }
        } catch (RuntimeException var34) {
            throw class590.method4333(var34, field11179[9] + arg0 + ',' + (arg1 == null ? field11179[4] : field11179[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method5493(int arg0, int arg1, byte[] arg2) {
        try {
            field11172++;
            byte[] var3 = new byte[arg1];
            class405.method3259(arg2, arg0, var3, 0, arg1);
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11179[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11179[4] : field11179[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "run", descriptor = "()V")
    public final void run() {
        try {
            this.field11169 = true;
            field11162++;
            try {
                while (!this.field11164) {
                    for (int var1 = 0; var1 < 2; var1++) {
                        class793 var2 = this.field11174[var1];
                        if (var2 != null) {
                            var2.method5700(false);
                        }
                    }
                    class524.method3918(-4, 10L);
                    class225.method1980(this.field11161, null, -32);
                }
            } catch (Exception var11) {
                class622.method4544(var11, null, true);
            } finally {
                Object var7 = null;
                this.field11169 = false;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field11179[1] + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)Lpja;")
    public static final class40 method5494(byte arg0) {
        try {
            field11167++;
            if (arg0 != 89) {
                field11178 = null;
            }
            return class770.field11258;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11179[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lwq;B)Lfca;")
    public static final class90 method5495(class176 arg0, byte arg1) {
        try {
            if (arg1 != 85) {
                method5490(-75);
            }
            field11166++;
            class90 var2 = new class90();
            var2.field1340 = arg0.method1687((byte) -95);
            var2.field1338 = class321.field5228.method4826(var2.field1340, 1);
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11179[5] + (arg0 == null ? field11179[4] : field11179[6]) + ',' + arg1 + ')');
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = method5497(method5496("ᡁ욜螋ů㚟튗礛酡悜鮷ꍮ筁ᷓퟢ\u2e72︵ᔃ㟖鿐䫣墫⥾놓殥뵤႖쭊Ք\ue407䆲ꜟ閬ﯝ籆\udd2e䟼쩙뼴굺茊捠ꨅ젪䧹\uf2da寪驒㊃\ue92f햹뺯㐼ｉ避⁑ᫌ될錑擑猫䁪쎘\udb92贝霹콉盶혨떏橩䖑゛㽦ꋊ斃⾢\ude68ﵾ鉕ڳ늄\u0e6b拧ꢶ識┻萆㥿幘㢵퇇\ue215댒鰾䏾ﱦ凭派\ufaff縝㯉칥载럋㲸钕륧Ⳡ\ue74e쐺嘦翝⪈셳\udc32鴎\u3100\uf675격ᓘᙘ楽炅탍챻飆⠨\uf8b5")).charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var4 ^ var12;
            field11177[0][var0] = class96.method927(var14, class96.method927(class96.method927(var10 << 16, class96.method927(var12 << 24, class96.method927(var4 << 32, class96.method927(class96.method927(var4 << 48, var4 << 56), var8 << 40)))), var6 << 8));
            for (int var16 = 1; var16 < 8; var16++) {
                field11177[var16][var0] = class96.method927(field11177[var16 - 1][var0] >>> 8, field11177[var16 - 1][var0] << 56);
            }
        }
        field11178[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field11178[var1] = class423.method3362(class488.method3706(field11177[7][var2 + 7], 255L), class423.method3362(class423.method3362(class488.method3706(field11177[5][var2 + 5], 16711680L), class423.method3362(class488.method3706(field11177[4][var2 + 4], 4278190080L), class423.method3362(class488.method3706(field11177[3][var2 + 3], 1095216660480L), class423.method3362(class488.method3706(280375465082880L, field11177[2][var2 + 2]), class423.method3362(class488.method3706(-72057594037927936L, field11177[0][var2]), class488.method3706(field11177[1][var2 + 1], 71776119061217280L)))))), class488.method3706(field11177[6][var2 + 6], 65280L)));
        }
    }

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5496(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5497(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
