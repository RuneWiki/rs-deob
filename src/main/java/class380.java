import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class380 extends class428 {

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public int field5379 = 0;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "Z")
    public boolean field5380 = false;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "Z")
    private boolean field5384 = false;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "Lre;")
    private class388 field5376 = new class388();

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    private int field5386 = 0;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "Lvf;")
    public class166 field5385 = new class166();

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    private int field5390 = 0;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "Z")
    private boolean field5393 = false;

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "Lcd;")
    public class46 field5391 = new class46();

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "[Lbl;")
    public class59[] field5378 = new class59[8192];

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "J")
    private long field5382;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "J")
    private long field5381;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "[Z")
    private static boolean[] field5383 = new boolean[8];

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "[Z")
    private static boolean[] field5377 = new boolean[8];

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
    public int field5387;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    public int field5388;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public int field5389;

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
    public int field5392;

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
    public int field5394;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Loj;J[Ltn;[Lgp;Z)V", line = 4)
    public final void method2271(class280 arg0, long arg1, class118[] arg2, class282[] arg3, boolean arg4) {
        if (!this.field5380) {
            this.method2283(arg0, arg2, arg4);
            this.method2275(arg3, arg4);
            this.field5382 = arg1;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "()Lcd;", line = 13)
    public final class46 method2272() {
        return this.field5391;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Loj;J)Z", line = 16)
    public final boolean method2273(class280 arg0, long arg1) {
        if (this.field5382 == this.field5381) {
            this.method2282();
        } else {
            this.method2281();
        }
        if (arg1 - this.field5382 > 750L) {
            this.method2280();
            return false;
        }
        int var4 = (int) (arg1 - this.field5381);
        if (this.field5393) {
            for (class184 var5 = (class184) this.field5376.method2334(-103); var5 != null; var5 = (class184) this.field5376.method2340(-113)) {
                for (int var6 = 0; var6 < var5.field2395.field3037; var6++) {
                    var5.method996(1, arg0, 0, !this.field5384, arg1);
                }
            }
            this.field5393 = false;
        }
        for (class184 var7 = (class184) this.field5376.method2334(-103); var7 != null; var7 = (class184) this.field5376.method2340(-121)) {
            var7.method996(var4, arg0, 0, !this.field5384, arg1);
        }
        this.field5381 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIII)V", line = 64)
    public final void method2274(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5392 = arg0;
        this.field5388 = arg1;
        this.field5387 = arg2;
        this.field5389 = arg3;
        this.field5394 = arg4;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([Lgp;Z)V", line = 75)
    private final void method2275(class282[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field5377[var3] = false;
        }
        label73: for (class53 var4 = (class53) this.field5385.method802((byte) 114); var4 != null; var4 = (class53) this.field5385.method806((byte) 104)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field696 || arg0[var7].field4098 == var4.field696) {
                        field5377[var7] = true;
                        var4.method285(10468);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method702((byte) -114);
                this.field5390--;
                if (var4.method102((byte) 103)) {
                    var4.method104((byte) -99);
                    class188.field2554--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field5390 != 8; var5++) {
            if (!field5377[var5]) {
                class53 var6 = null;
                if (class140.method664(arg0[var5].field4099, (byte) -124).field2055 == 1 && class188.field2554 < 32) {
                    var6 = new class53(arg0[var5], this);
                    class101.field1227.method2399((byte) 112, var6, (long) arg0[var5].field4099);
                    class188.field2554++;
                }
                if (var6 == null) {
                    var6 = new class53(arg0[var5], this);
                }
                this.field5385.method803(var6, 50);
                this.field5390++;
                field5377[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "()V", line = 161)
    public final void method2276() {
        this.field5393 = true;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "()V", line = 164)
    public final void method2277() {
        this.field5391.field599.method586((byte) -122);
        for (class184 var1 = (class184) this.field5376.method2334(-122); var1 != null; var1 = (class184) this.field5376.method2340(-110)) {
            var1.method1002((byte) -81, this.field5381);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(J)V", line = 177)
    public final void method2278(long arg0) {
        this.field5382 = arg0;
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "()V", line = 180)
    public static void method2279() {
        field5383 = null;
        field5377 = null;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V", line = 331)
    public class380(int arg0) {
        class224.field3110.method2336(this, (byte) -56);
        this.field5382 = (long) arg0;
        this.field5381 = (long) arg0;
        this.field5393 = true;
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "()V", line = 189)
    public final void method2280() {
        this.field5380 = true;
        for (class53 var1 = (class53) this.field5385.method802((byte) 105); var1 != null; var1 = (class53) this.field5385.method806((byte) 104)) {
            if (var1.field688.field2055 == 1) {
                var1.method104((byte) -97);
            }
        }
        this.field5378 = new class59[8192];
        this.field5379 = 0;
        this.field5376 = new class388();
        this.field5386 = 0;
        this.field5385 = new class166();
        this.field5390 = 0;
        this.method2550(false);
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "()V", line = 211)
    public final void method2281() {
        this.field5384 = true;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "()V", line = 217)
    private final void method2282() {
        this.field5384 = false;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Loj;[Ltn;Z)V", line = 232)
    private final void method2283(class280 arg0, class118[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field5383[var4] = false;
        }
        label64: for (class184 var5 = (class184) this.field5376.method2334(-125); var5 != null; var5 = (class184) this.field5376.method2340(-76)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field2398 || arg1[var8].field1457 == var5.field2398) {
                        field5383[var8] = true;
                        var5.method1000(1338076472);
                        var5.field2375 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field2366 == 0) {
                    var5.method2550(false);
                    this.field5386--;
                } else {
                    var5.field2375 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field5386 != 8; var6++) {
            if (!field5383[var6]) {
                class184 var7 = new class184(arg0, arg1[var6], this, this.field5382);
                this.field5376.method2336(var7, (byte) -56);
                this.field5386++;
                field5383[var6] = true;
            }
        }
    }
}
