import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class94 {

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "Ler;")
    private class157 field1360 = new class157(64);

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public int field1366 = 0;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Lns;")
    private class438 field1357;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "[J")
    public static long[] field1364 = new long[256];

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Lpg;")
    public static class492 field1367;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Lui;")
    public static class375 field1368;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "Lvr;")
    public static class306 field1369;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "F")
    public static float field1370;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "Lf;")
    public static class191 field1372;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "Lns;")
    public static class438 field1371;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public static final void method654(int arg0) {
        field1363++;
        if (arg0 == 2100623105) {
            for (class134 var1 = (class134) class13.field215.method2358((byte) 82); var1 != null; var1 = (class134) class13.field215.method2363(31844)) {
                var1.method864();
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
    public final void method655(boolean arg0, int arg1) {
        field1361++;
        if (arg0) {
            class157 var3 = this.field1360;
            synchronized (this.field1360) {
                this.field1360.method1016(arg1, (byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public static void method656(int arg0) {
        if (arg0 != 100) {
            return;
        }
        field1372 = null;
        field1364 = null;
        field1371 = null;
        field1369 = null;
        field1367 = null;
        field1368 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)Lcw;")
    public final class95 method657(int arg0, int arg1) {
        field1358++;
        class157 var3 = this.field1360;
        class95 var4;
        synchronized (this.field1360) {
            var4 = (class95) this.field1360.method1013((long) arg1, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1357.method2650(arg1, -128, 4);
        class95 var6 = new class95();
        var6.field1393 = arg1;
        var6.field1380 = this;
        if (var5 != null) {
            var6.method662(new class91(var5), 0);
        }
        var6.method663(arg0 - 32203);
        class157 var7 = this.field1360;
        synchronized (this.field1360) {
            this.field1360.method1012(-84, (long) arg1, var6);
            if (arg0 != 1) {
                method654(46);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
    public final void method658(int arg0) {
        class157 var2 = this.field1360;
        synchronized (this.field1360) {
            if (arg0 >= -4) {
                this.field1366 = 121;
            }
            this.field1360.method1022((byte) -34);
        }
        field1359++;
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
    public final void method659(int arg0) {
        field1365++;
        class157 var2 = this.field1360;
        synchronized (this.field1360) {
            this.field1360.method1015((byte) 105);
        }
        if (arg0 < 109) {
            this.method657(-46, 12);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lgo;ILns;)V")
    public class94(class331 arg0, int arg1, class438 arg2) {
        this.field1357 = arg2;
        this.field1362 = this.field1357.method2645(1, 4);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1364[var0] = var1;
        }
        field1367 = new class492(100, 7);
        field1368 = new class375("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
        field1369 = new class306();
        new class375("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }
}
