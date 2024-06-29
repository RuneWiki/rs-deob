import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class73 implements Runnable {

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[Leh;")
    public volatile class47[] field1343 = new class47[2];

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
    public volatile boolean field1334 = false;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "Z")
    public volatile boolean field1347 = false;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
    public static int[] field1330 = new int[50];

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Lkb;")
    private static class93 field1336 = class76.method390("Existing User", 0);

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lkb;")
    public static class93 field1333 = field1336;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "[[S")
    public static short[][] field1335 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lkb;")
    public static class93 field1342 = class76.method390("Keine Antwort vom Server)3", 0);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lkb;")
    public static class93 field1332 = class76.method390("Angreifen", 0);

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Lkb;")
    public static class93 field1338 = class76.method390("zur-Uck auf die RuneScape)2Webseite gehen", 0);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lkb;")
    public static class93 field1329 = class76.method390("Der Anmelde)2Server ist offline)3", 0);

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "Lkb;")
    public static class93 field1345 = class76.method390("null", 0);

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "[I")
    public static int[] field1346 = new int[99];

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "Lh;")
    public static class65 field1348;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "Lkb;")
    private static class93 field1353;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "Lkb;")
    public static class93 field1351;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "Lkb;")
    public static class93 field1352;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "Lkb;")
    public static class93 field1349;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Lme;")
    public static class114 field1341;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lqd;")
    public class149 field1328;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "Lca;")
    public static class22 field1344;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    public static int[] field1327;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "[I")
    public static int[] field1350;

    @OriginalMember(owner = "client!hh", name = "run", descriptor = "()V")
    public final void run() {
        this.field1347 = true;
        field1331++;
        try {
            while (!this.field1334) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class47 var2 = this.field1343[var1];
                    if (var2 != null) {
                        var2.method253(-1772);
                    }
                }
                class39.method212(-103, 10L);
                class43.method232(null, this.field1328, 92);
            }
        } catch (Exception var9) {
            class141.method882(true, null, var9);
        } finally {
            Object var6 = null;
            this.field1347 = false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lkb;Lh;B)Lkb;")
    public static final class93 method382(class93 arg0, class65 arg1, byte arg2) {
        field1339++;
        int var3 = 69 % ((-arg2 - 61) / 55);
        if (arg0.method489((byte) 67, class23.field355) == -1) {
            return arg0;
        }
        while (true) {
            int var4 = arg0.method489((byte) 78, class197.field3836);
            if (var4 == -1) {
                while (true) {
                    int var5 = arg0.method489((byte) -116, class135.field2626);
                    if (var5 == -1) {
                        while (true) {
                            int var6 = arg0.method489((byte) -94, class64.field1020);
                            if (var6 == -1) {
                                while (true) {
                                    int var7 = arg0.method489((byte) 31, class34.field551);
                                    if (var7 == -1) {
                                        while (true) {
                                            int var8 = arg0.method489((byte) 70, class78.field1405);
                                            if (var8 == -1) {
                                                while (true) {
                                                    int var9 = arg0.method489((byte) 97, class175.field3454);
                                                    if (var9 == -1) {
                                                        return arg0;
                                                    }
                                                    class93 var10 = class43.field712;
                                                    if (class30.field508 != null) {
                                                        var10 = class117.method645(class30.field508.field343, 56);
                                                        try {
                                                            if (class30.field508.field342 != null) {
                                                                byte[] var11 = ((String) class30.field508.field342).getBytes("ISO-8859-1");
                                                                var10 = class113.method618(var11.length, var11, true, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg0 = class203.method1321(new class93[] { arg0.method497((byte) -120, var9, 0), var10, arg0.method514(93, var9 + 4) }, 99);
                                                }
                                            }
                                            arg0 = class203.method1321(new class93[] { arg0.method497((byte) -122, var8, 0), class183.method1190(29659, class117.method647(arg1, 4, (byte) -50)), arg0.method514(123, var8 + 2) }, 106);
                                        }
                                    }
                                    arg0 = class203.method1321(new class93[] { arg0.method497((byte) -128, var7, 0), class183.method1190(29659, class117.method647(arg1, 3, (byte) 37)), arg0.method514(88, var7 + 2) }, -4);
                                }
                            }
                            arg0 = class203.method1321(new class93[] { arg0.method497((byte) -126, var6, 0), class183.method1190(29659, class117.method647(arg1, 2, (byte) -125)), arg0.method514(62, var6 + 2) }, -21);
                        }
                    }
                    arg0 = class203.method1321(new class93[] { arg0.method497((byte) -89, var5, 0), class183.method1190(29659, class117.method647(arg1, 1, (byte) -127)), arg0.method514(50, var5 + 2) }, 113);
                }
            }
            arg0 = class203.method1321(new class93[] { arg0.method497((byte) -115, var4, 0), class183.method1190(29659, class117.method647(arg1, 0, (byte) 44)), arg0.method514(99, var4 + 2) }, 109);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method383(int arg0) {
        field1336 = null;
        field1338 = null;
        int var1 = -100 % ((arg0 - 7) / 39);
        field1351 = null;
        field1350 = null;
        field1342 = null;
        field1335 = null;
        field1341 = null;
        field1329 = null;
        field1327 = null;
        field1348 = null;
        field1345 = null;
        field1352 = null;
        field1353 = null;
        field1333 = null;
        field1346 = null;
        field1349 = null;
        field1332 = null;
        field1344 = null;
        field1330 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILrd;I)Lkb;")
    public static final class93 method384(int arg0, class158 arg1, int arg2) {
        field1340++;
        try {
            class93 var3 = new class93();
            var3.field1701 = arg1.method1072(arg2 ^ 0xFFFF9DA2);
            if (var3.field1701 > arg0) {
                var3.field1701 = arg0;
            }
            var3.field1726 = new byte[var3.field1701];
            arg1.field3153 += class64.field1014.method1158(var3.field1701, arg2, arg2 ^ 0xFFFFFF80, arg1.field3153, var3.field1726, arg1.field3162);
            return var3;
        } catch (Exception var4) {
            return class140.field2719;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method385(byte arg0) {
        if (arg0 != -86) {
            return;
        }
        field1337++;
        while (true) {
            class122 var1 = class182.field3590;
            class155 var2;
            synchronized (class182.field3590) {
                var2 = (class155) class166.field3305.method694((byte) -63);
            }
            if (var2 == null) {
                return;
            }
            var2.field3057.method634(var2.field3053, arg0 ^ 0x355, var2.field3045, (int) var2.field718, false);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1346[var1] = var0 / 4;
        }
        field1348 = null;
        field1353 = class76.method390("glow2:", 0);
        field1351 = class76.method390("Lade Sprites )2 ", 0);
        field1352 = field1353;
        field1349 = field1353;
    }
}
