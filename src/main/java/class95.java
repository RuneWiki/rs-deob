import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class95 extends class44 {

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "[I")
    private int[] field2356 = new int[6];

    @OriginalMember(owner = "client!pe", name = "Gb", descriptor = "I")
    public int field2369 = -1;

    @OriginalMember(owner = "client!pe", name = "Nb", descriptor = "Z")
    public boolean field2376 = false;

    @OriginalMember(owner = "client!pe", name = "Rb", descriptor = "[I")
    private int[] field2380 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pe", name = "Bb", descriptor = "[I")
    private int[] field2364 = new int[6];

    @OriginalMember(owner = "client!pe", name = "Fb", descriptor = "I")
    public static int field2368 = 0;

    @OriginalMember(owner = "client!pe", name = "Eb", descriptor = "Z")
    public static boolean field2367 = false;

    @OriginalMember(owner = "client!pe", name = "zb", descriptor = "La;")
    public static class1 field2362 = class113.method934(-11538, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!pe", name = "Sb", descriptor = "La;")
    public static class1 field2381 = class113.method934(-11538, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!pe", name = "Jb", descriptor = "[I")
    public static int[] field2372 = new int[50];

    @OriginalMember(owner = "client!pe", name = "yb", descriptor = "I")
    public static int field2361 = 0;

    @OriginalMember(owner = "client!pe", name = "Cb", descriptor = "La;")
    private static class1 field2365 = class113.method934(-11538, "K");

    @OriginalMember(owner = "client!pe", name = "Ab", descriptor = "La;")
    public static class1 field2363 = field2365;

    @OriginalMember(owner = "client!pe", name = "vb", descriptor = "La;")
    public static class1 field2358 = class113.method934(-11538, "backvmid2");

    @OriginalMember(owner = "client!pe", name = "ub", descriptor = "La;")
    public static class1 field2357 = field2365;

    @OriginalMember(owner = "client!pe", name = "Lb", descriptor = "Lpb;")
    public static class92 field2374 = new class92();

    @OriginalMember(owner = "client!pe", name = "Vb", descriptor = "La;")
    public static class1 field2384 = class113.method934(-11538, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!pe", name = "Ub", descriptor = "I")
    public static int field2383 = 0;

    @OriginalMember(owner = "client!pe", name = "Xb", descriptor = "La;")
    private static class1 field2386 = class113.method934(-11538, "Bad session id)3");

    @OriginalMember(owner = "client!pe", name = "Wb", descriptor = "La;")
    public static class1 field2385 = field2386;

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!pe", name = "wb", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!pe", name = "Db", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!pe", name = "Ib", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!pe", name = "Kb", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!pe", name = "Mb", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!pe", name = "Ob", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!pe", name = "Pb", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!pe", name = "Tb", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!pe", name = "Qb", descriptor = "Lu;")
    public static class120 field2379;

    @OriginalMember(owner = "client!pe", name = "xb", descriptor = "Lwa;")
    public static class132 field2360;

    @OriginalMember(owner = "client!pe", name = "Yb", descriptor = "Z")
    public static boolean field2387;

    @OriginalMember(owner = "client!pe", name = "Hb", descriptor = "[I")
    private int[] field2370;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLba;)V", line = 6)
    public final void method823(byte arg0, class8 arg1) {
        field2366++;
        while (true) {
            int var3 = arg1.method145(false);
            if (var3 == 0) {
                if (arg0 == 58) {
                    return;
                } else {
                    this.method830((byte) -73);
                    return;
                }
            }
            this.method829(arg1, var3, arg0 + 1341);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)Z", line = 26)
    public final boolean method824(boolean arg0) {
        field2371++;
        if (this.field2370 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field2370.length; var3++) {
            if (!class63.field1586.method219(this.field2370[var3], (byte) -10, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)Z", line = 48)
    public final boolean method825(boolean arg0) {
        boolean var2 = true;
        field2373++;
        int var3 = 0;
        if (arg0) {
            return false;
        }
        while (var3 < 5) {
            if (this.field2380[var3] != -1 && !class63.field1586.method219(this.field2380[var3], (byte) -10, 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V", line = 77)
    public static void method826(int arg0) {
        field2365 = null;
        field2385 = null;
        field2381 = null;
        field2358 = null;
        field2379 = null;
        field2360 = null;
        field2386 = null;
        field2384 = null;
        field2362 = null;
        if (arg0 != 0) {
            method826(-67);
        }
        field2357 = null;
        field2374 = null;
        field2372 = null;
        field2363 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lcc;", line = 102)
    public static final class16 method827(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg1 << 16) + arg0);
        field2382++;
        class16 var5 = (class16) class31.field831.method264(var3, (byte) 72);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class109.field2742.method216(class54.field1440, class116.method959(53, new class1[] { class48.method504(arg1, -1), class44.field1162, class48.method504(arg0, -1) }), 1);
        if (arg2 <= 4) {
            return null;
        }
        class8 var7 = new class8(var6);
        class16 var8 = new class16();
        var7.field268 = var7.field285.length - 12;
        int var9 = var7.method168(-4750);
        int var10 = 0;
        var8.field519 = var7.method146(65280);
        var8.field515 = var7.method146(65280);
        var8.field511 = var7.method146(65280);
        var8.field514 = var7.method146(65280);
        var8.field518 = new class1[var9];
        var8.field510 = new int[var9];
        var7.field268 = 0;
        var8.field520 = new int[var9];
        while (var7.field268 < var7.field285.length - 12) {
            int var11 = var7.method146(65280);
            if (var11 == 3) {
                var8.field518[var10] = var7.method141(-10721);
            } else if (var11 >= 100 || var11 == 21 || var11 == 38 || var11 == 39) {
                var8.field510[var10] = var7.method145(false);
            } else {
                var8.field510[var10] = var7.method168(-4750);
            }
            var8.field520[var10++] = var11;
        }
        class31.field831.method263(-7208, var3, var8);
        return var8;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[La;)La;", line = 171)
    public static final class1 method828(int arg0, int arg1, int arg2, class1[] arg3) {
        field2378++;
        int var4 = 0;
        int var5 = 6 / ((arg0 - 6) / 52);
        for (int var6 = 0; var6 < arg1; var6++) {
            if (arg3[arg2 + var6] == null) {
                arg3[arg2 + var6] = class64.field1628;
            }
            var4 += arg3[arg2 + var6].field26;
        }
        byte[] var7 = new byte[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class1 var11 = arg3[arg2 + var9];
            class33.method393(var11.field38, 0, var7, var8, var11.field26);
            var8 += var11.field26;
        }
        class1 var10 = new class1();
        var10.field26 = var4;
        var10.field38 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lba;II)V", line = 233)
    private final void method829(class8 arg0, int arg1, int arg2) {
        if (arg2 != 1399) {
            method827(-122, -98, -44);
        }
        if (arg1 == 1) {
            this.field2369 = arg0.method145(false);
        } else if (arg1 == 2) {
            int var4 = arg0.method145(false);
            this.field2370 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2370[var5] = arg0.method146(65280);
            }
        } else if (arg1 == 3) {
            this.field2376 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2356[arg1 - 40] = arg0.method146(65280);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2364[arg1 - 50] = arg0.method146(65280);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2380[arg1 - 60] = arg0.method146(arg2 + 63881);
        }
        field2359++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Lpa;", line = 280)
    public final class91 method830(byte arg0) {
        field2377++;
        class91[] var2 = new class91[5];
        int var3 = 0;
        if (arg0 != -100) {
            return null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2380[var4] != -1) {
                var2[var3++] = class91.method801(class63.field1586, this.field2380[var4], 0);
            }
        }
        class91 var5 = new class91(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field2356[var6] != 0; var6++) {
            var5.method774(this.field2356[var6], this.field2364[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(Z)Lpa;", line = 328)
    public final class91 method831(boolean arg0) {
        field2355++;
        if (this.field2370 == null) {
            return null;
        }
        class91[] var2 = new class91[this.field2370.length];
        for (int var3 = 0; var3 < this.field2370.length; var3++) {
            var2[var3] = class91.method801(class63.field1586, this.field2370[var3], 0);
        }
        class91 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class91(var2, var2.length);
        }
        if (arg0) {
            return null;
        } else {
            for (int var5 = 0; var5 < 6 && this.field2356[var5] != 0; var5++) {
                var4.method774(this.field2356[var5], this.field2364[var5]);
            }
            return var4;
        }
    }
}
