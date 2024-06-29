import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class64 implements Runnable {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lp;")
    private class272 field1267 = new class272();

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Z")
    private boolean field1273 = false;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public int field1277 = 0;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field1278;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lak;")
    public static class135 field1276 = new class135(64);

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lpj;")
    public static class237 field1279 = class33.method353("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 65);

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lge;")
    public static class69 field1280 = new class69(32);

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field1282 = 0;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lpj;")
    public static class237 field1281 = class33.method353("Lade Schrifts-=tze )2 ", 23);

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field1285 = 0;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
    public static int[] field1284;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BILob;)Lbf;")
    public final class195 method530(byte arg0, int arg1, class128 arg2) {
        field1272++;
        class195 var4 = new class195();
        var4.field3395 = 1;
        class272 var5 = this.field1267;
        synchronized (this.field1267) {
            class195 var6 = (class195) this.field1267.method1808(13801);
            while (true) {
                if (var6 == null) {
                    if (arg0 != 121) {
                        this.method534(-26, (class195) null);
                    }
                    break;
                }
                if ((long) arg1 == var6.field2730 && var6.field3399 == arg2 && var6.field3395 == 2) {
                    var4.field2175 = false;
                    var4.field3397 = var6.field3397;
                    return var4;
                }
                var6 = (class195) this.field1267.method1812(false);
            }
        }
        var4.field3397 = arg2.method907(arg1, arg0 ^ 0x79);
        var4.field2185 = true;
        var4.field2175 = false;
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1273) {
            class272 var1 = this.field1267;
            class195 var2;
            synchronized (this.field1267) {
                var2 = (class195) this.field1267.method1815(-118);
                if (var2 == null) {
                    try {
                        this.field1267.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1277--;
            }
            try {
                if (var2.field3395 == 2) {
                    var2.field3399.method906(var2.field3397.length, (int) var2.field2730, var2.field3397, (byte) -19);
                } else if (var2.field3395 == 3) {
                    var2.field3397 = var2.field3399.method907((int) var2.field2730, 0);
                }
            } catch (Exception var6) {
                class158.method1123((String) null, (byte) -122, var6);
            }
            var2.field2175 = false;
        }
        field1269++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public final void method531(int arg0) {
        this.field1273 = true;
        class272 var2 = this.field1267;
        synchronized (this.field1267) {
            this.field1267.notifyAll();
            if (arg0 != -1) {
                field1282 = -75;
            }
        }
        field1270++;
        try {
            this.field1278.join();
        } catch (InterruptedException var3) {
        }
        this.field1278 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILob;)Lbf;")
    public final class195 method532(int arg0, int arg1, class128 arg2) {
        field1268++;
        class195 var4 = new class195();
        var4.field2730 = (long) arg1;
        var4.field2185 = false;
        if (arg0 > -59) {
            return null;
        } else {
            var4.field3395 = 3;
            var4.field3399 = arg2;
            this.method534(10, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static void method533(int arg0) {
        if (arg0 != 64) {
            return;
        }
        field1281 = null;
        field1279 = null;
        field1276 = null;
        field1280 = null;
        field1284 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILbf;)V")
    private final void method534(int arg0, class195 arg1) {
        class272 var3 = this.field1267;
        synchronized (this.field1267) {
            this.field1267.method1819(arg0 ^ 0xFFFF9697, arg1);
            this.field1277++;
            this.field1267.notifyAll();
            if (arg0 != 10) {
                this.method530((byte) -70, 124, (class128) null);
            }
        }
        field1271++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[BLob;)Lbf;")
    public final class195 method535(int arg0, int arg1, byte[] arg2, class128 arg3) {
        class195 var5 = new class195();
        var5.field2730 = (long) arg1;
        var5.field3399 = arg3;
        var5.field3395 = arg0;
        var5.field2185 = false;
        var5.field3397 = arg2;
        this.method534(10, var5);
        field1274++;
        return var5;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static final void method536(boolean arg0) {
        field1275++;
        class273.field4730.method942(0);
        if (arg0) {
            method533(-7);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class64() {
        class103 var1 = class268.field4572.method542(this, 0, 5);
        while (var1.field1823 == 0) {
            class84.method645(1, 10L);
        }
        if (var1.field1823 == 2) {
            throw new RuntimeException();
        }
        this.field1278 = (Thread) var1.field1826;
    }
}
