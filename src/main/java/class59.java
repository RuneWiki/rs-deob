import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class59 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1489 = 0;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lgd;")
    public static class40 field1496 = class14.method90(false, "null");

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[[[Loe;")
    public static class89[][][] field1494 = new class89[4][104][104];

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lgd;")
    private static class40 field1493 = class14.method90(false, "Checking for updates )2 ");

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lgd;")
    public static class40 field1501 = class14.method90(false, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lgd;")
    public static class40 field1499 = field1493;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1497 = 0;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lgd;")
    public static class40 field1500 = class14.method90(false, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lfc;")
    public static class33 field1491;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lmb;")
    public static class73 field1488;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[BI)I", line = 3)
    public static final int method441(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 1) {
            field1497 = -78;
        }
        field1492++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class80.field1824[(var4 ^ arg2[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lgd;ILrb;Lgd;)[Lmb;", line = 33)
    public static final class73[] method442(class40 arg0, int arg1, class103 arg2, class40 arg3) {
        int var4 = arg2.method749(arg3, 1);
        if (arg1 == 0) {
            int var5 = arg2.method740(var4, false, arg0);
            field1487++;
            return class58.method435(arg2, -30624, var5, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 49)
    public static final void method443(int arg0) {
        field1490++;
        if (arg0 < 32 || class89.field2009 == null) {
            return;
        }
        class30 var1 = class89.field2009;
        class30 var2 = class96.method644(var1, true);
        if (var2 == null) {
            class89.field2009 = null;
            return;
        }
        class77.field1779++;
        int[] var3 = class52.method405(var2, (byte) 60);
        int[] var4 = class52.method405(var1, (byte) 109);
        int var5 = class135.field3282 - class67.field1647;
        int var6 = class40.field1001 - class108.field2643;
        if (var1.field657 >= var6 && var6 >= -var1.field657 && var5 <= var1.field657 && var5 >= -var1.field657 && !class74.field1728) {
            var5 = 0;
            var6 = 0;
        } else if (class77.field1779 > var1.field669 || class74.field1728) {
            class74.field1728 = true;
        } else {
            var5 = 0;
            var6 = 0;
        }
        int var7 = var4[1] + var5 - var3[1];
        int var8 = var4[0] + var6 - var3[0];
        if (var8 < 0) {
            var8 = 0;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (var1.field684 + var7 > var2.field684) {
            var7 = var2.field684 - var1.field684;
        }
        if (var8 + var1.field700 > var2.field700) {
            var8 = var2.field700 - var1.field700;
        }
        if (class89.field2009.field739 != null && class74.field1728) {
            class45.method312(var1.field739, var7, var8, var1, 85, 0);
        }
        if (class106.field2572 != 0) {
            return;
        }
        if (!class74.field1728) {
            if (class89.field2009.field707 != null) {
                class45.method312(var1.field707, var7, var8, var1, 68, 0);
            }
            if ((class125.field2970 == 1 || class135.method1057(-1, class48.field1231 - 1)) && class48.field1231 > 2) {
                class126.method998(-206);
            } else if (class48.field1231 > 0) {
                class10.method57(0, class48.field1231 - 1);
            }
        } else if (class89.field2009.field731 != null) {
            class45.method312(var1.field731, var7, var8, var1, 71, 0);
        }
        class89.field2009 = null;
        return;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 156)
    public static final void method444(boolean arg0) {
        if (arg0) {
            field1494 = null;
        }
        field1495++;
        while (true) {
            class89 var1 = class58.field1475;
            class53 var2;
            synchronized (class58.field1475) {
                var2 = (class53) class51.field1299.method594(!arg0);
            }
            if (var2 == null) {
                return;
            }
            var2.field1344.method1061(var2.field1341, var2.field1339, (int) var2.field2647, (byte) -117, false);
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V", line = 210)
    public static void method445(int arg0) {
        field1500 = null;
        if (arg0 < 111) {
            field1497 = 62;
        }
        field1496 = null;
        field1499 = null;
        field1494 = null;
        field1488 = null;
        field1501 = null;
        field1493 = null;
        field1491 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I")
    public abstract int method231(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public abstract void method233(int arg0);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
    public abstract void method232(boolean arg0);
}
