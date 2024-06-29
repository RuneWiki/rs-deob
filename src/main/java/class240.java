import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class240 extends class438 {

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "Z")
    private boolean field3387 = false;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "Z")
    public boolean field3390 = false;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public int field3392 = 0;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Lcp;")
    private class399 field3386 = new class399();

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    private int field3394 = 0;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "Ljm;")
    public class162 field3395 = new class162();

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "Z")
    private boolean field3401 = false;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    private int field3402 = 0;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "Lns;")
    public class174 field3398 = new class174();

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "[Lma;")
    public class308[] field3391 = new class308[8192];

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "J")
    private long field3389;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "J")
    private long field3385;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "[Z")
    private static boolean[] field3388 = new boolean[8];

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "[Z")
    private static boolean[] field3393 = new boolean[8];

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public int field3396;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public int field3397;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "()Lns;")
    public final class174 method1552() {
        return this.field3398;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([Lod;Z)V")
    private final void method1553(class138[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field3388[var3] = false;
        }
        label73: for (class298 var4 = (class298) this.field3395.method1173(0); var4 != null; var4 = (class298) this.field3395.method1165(true)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4088 || arg0[var7].field2031 == var4.field4088) {
                        field3388[var7] = true;
                        var4.method1818(115);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method1884(false);
                this.field3402--;
                if (var4.method1212(99)) {
                    var4.method1213((byte) 106);
                    class90.field1261--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field3402 != 8; var5++) {
            if (!field3388[var5]) {
                class298 var6 = null;
                if (class305.method1845(104, arg0[var5].field2030).field3353 == 1 && class90.field1261 < 32) {
                    var6 = new class298(arg0[var5], this);
                    class85.field1201.method1451((long) arg0[var5].field2030, var6, -110);
                    class90.field1261++;
                }
                if (var6 == null) {
                    var6 = new class298(arg0[var5], this);
                }
                this.field3395.method1162(118, var6);
                this.field3402++;
                field3388[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "()V")
    public final void method1554() {
        this.field3387 = true;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "()V")
    private final void method1555() {
        this.field3387 = false;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIII)V")
    public final void method1556(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3399 = arg0;
        this.field3400 = arg1;
        this.field3397 = arg3;
        this.field3396 = arg4;
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "()V")
    public final void method1557() {
        this.field3401 = true;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lea;[Lkg;Z)V")
    private final void method1558(class58 arg0, class217[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field3393[var4] = false;
        }
        label64: for (class228 var5 = (class228) this.field3386.method2480(7904); var5 != null; var5 = (class228) this.field3386.method2482(50)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3186 || arg1[var8].field3048 == var5.field3186) {
                        field3393[var8] = true;
                        var5.method1493((byte) 17);
                        var5.field3162 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3158 == 0) {
                    var5.method2695(0);
                    this.field3394--;
                } else {
                    var5.field3162 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field3394 != 8; var6++) {
            if (!field3393[var6]) {
                class228 var7 = new class228(arg0, arg1[var6], this, this.field3389);
                this.field3386.method2483(var7, 0);
                this.field3394++;
                field3393[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "()V")
    public final void method1559() {
        this.field3390 = true;
        for (class298 var1 = (class298) this.field3395.method1173(0); var1 != null; var1 = (class298) this.field3395.method1165(true)) {
            if (var1.field4092.field3353 == 1) {
                var1.method1213((byte) 106);
            }
        }
        this.field3391 = new class308[8192];
        this.field3392 = 0;
        this.field3386 = new class399();
        this.field3394 = 0;
        this.field3395 = new class162();
        this.field3402 = 0;
        this.method2695(0);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lea;J[Lkg;[Lod;Z)V")
    public final void method1560(class58 arg0, long arg1, class217[] arg2, class138[] arg3, boolean arg4) {
        if (!this.field3390) {
            this.method1558(arg0, arg2, arg4);
            this.method1553(arg3, arg4);
            this.field3389 = arg1;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(J)V")
    public final void method1561(long arg0) {
        this.field3389 = arg0;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lea;J)Z")
    public final boolean method1562(class58 arg0, long arg1) {
        if (this.field3389 == this.field3385) {
            this.method1555();
        } else {
            this.method1554();
        }
        if (arg1 - this.field3389 > 750L) {
            this.method1559();
            return false;
        }
        int var4 = (int) (arg1 - this.field3385);
        if (this.field3401) {
            for (class228 var5 = (class228) this.field3386.method2480(7904); var5 != null; var5 = (class228) this.field3386.method2482(50)) {
                for (int var6 = 0; var6 < var5.field3157.field6059; var6++) {
                    var5.method1486(arg1, -6164, arg0, !this.field3387, 1);
                }
            }
            this.field3401 = false;
        }
        for (class228 var7 = (class228) this.field3386.method2480(7904); var7 != null; var7 = (class228) this.field3386.method2482(50)) {
            var7.method1486(arg1, -6164, arg0, !this.field3387, var4);
        }
        this.field3385 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "()V")
    public final void method1563() {
        this.field3398.field2485.method386((byte) 47);
        for (class228 var1 = (class228) this.field3386.method2480(7904); var1 != null; var1 = (class228) this.field3386.method2482(50)) {
            var1.method1490(this.field3385, true);
        }
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "()V")
    public static void method1564() {
        field3393 = null;
        field3388 = null;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V")
    public class240(int arg0) {
        class337.field4558.method2483(this, 0);
        this.field3389 = (long) arg0;
        this.field3385 = (long) arg0;
        this.field3401 = true;
    }
}
