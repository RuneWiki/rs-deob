import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class455 extends class101 {

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public int field6263 = 0;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Z")
    private boolean field6268 = false;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "Z")
    public boolean field6266 = false;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "Lmf;")
    private class354 field6270 = new class354();

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    private int field6273 = 0;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "Lui;")
    public class193 field6272 = new class193();

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    private int field6276 = 0;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "Z")
    private boolean field6279 = false;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "Lka;")
    public class400 field6274 = new class400();

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "[Ljv;")
    public class68[] field6265 = new class68[8192];

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "[Z")
    private static boolean[] field6269 = new boolean[8];

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "[Z")
    private static boolean[] field6271 = new boolean[8];

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public int field6275;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public int field6277;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public int field6278;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public int field6280;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public int field6281;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "J")
    private long field6264;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "J")
    private long field6267;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lqa;)V", line = 3)
    public final void method2649(class206 arg0) {
        this.field6274.field5256.method2382(false);
        for (class344 var2 = (class344) this.field6270.method1987(true); var2 != null; var2 = (class344) this.field6270.method1994(6408)) {
            var2.method1919(this.field6264, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "()Lka;", line = 15)
    public final class400 method2650() {
        return this.field6274;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([Lfr;Z)V", line = 20)
    private final void method2651(class348[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field6271[var3] = false;
        }
        label73: for (class168 var4 = (class168) this.field6272.method1050((byte) 73); var4 != null; var4 = (class168) this.field6272.method1047(-7962)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2056 || arg0[var7].field4485 == var4.field2056) {
                        field6271[var7] = true;
                        var4.method946((byte) 80);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method3187(true);
                this.field6276--;
                if (var4.method47((byte) 119)) {
                    var4.method48(-1);
                    class454.field6261--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field6276 != 8; var5++) {
            if (!field6271[var5]) {
                class168 var6 = null;
                if (arg0[var5].method1942(false).field8976 == 1 && class454.field6261 < 32) {
                    var6 = new class168(arg0[var5], this);
                    class53.field446.method3407(var6, (long) arg0[var5].field4474, false);
                    class454.field6261++;
                }
                if (var6 == null) {
                    var6 = new class168(arg0[var5], this);
                }
                this.field6272.method1040(var6, -104);
                this.field6276++;
                field6271[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Lts;", line = 105)
    public static final class455 method2652(int arg0) {
        if (class48.field402 == class413.field5364) {
            return new class455(arg0);
        } else {
            class455 var1 = class546.field8042[class413.field5364];
            class413.field5364 = class413.field5364 + 1 & class230.field2853[class557.field8210];
            var1.method2661(arg0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lqa;[Ldl;Z)V", line = 120)
    private final void method2653(class206 arg0, class55[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field6269[var4] = false;
        }
        label64: for (class344 var5 = (class344) this.field6270.method1987(true); var5 != null; var5 = (class344) this.field6270.method1994(6408)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field4454 || arg1[var8].field468 == var5.field4454) {
                        field6269[var8] = true;
                        var5.method1923((byte) 95);
                        var5.field4430 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field4453 == 0) {
                    var5.method610((byte) -83);
                    this.field6273--;
                } else {
                    var5.field4430 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field6273 != 8; var6++) {
            if (!field6269[var6]) {
                class344 var7 = new class344(arg0, arg1[var6], this, this.field6267);
                this.field6270.method1991(var7, 17);
                this.field6273++;
                field6269[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "()V", line = 192)
    public final void method2654() {
        this.field6268 = true;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lqa;J)Z", line = 195)
    public final boolean method2655(class206 arg0, long arg1) {
        if (this.field6267 == this.field6264) {
            this.method2663();
        } else {
            this.method2654();
        }
        if (arg1 - this.field6267 > 750L) {
            this.method2660();
            return false;
        }
        int var4 = (int) (arg1 - this.field6264);
        if (this.field6279) {
            for (class344 var5 = (class344) this.field6270.method1987(true); var5 != null; var5 = (class344) this.field6270.method1994(6408)) {
                for (int var6 = 0; var6 < var5.field4464.field2939; var6++) {
                    var5.method1922(arg1, true, !this.field6268, arg0, 1);
                }
            }
            this.field6279 = false;
        }
        for (class344 var7 = (class344) this.field6270.method1987(true); var7 != null; var7 = (class344) this.field6270.method1994(6408)) {
            var7.method1922(arg1, true, !this.field6268, arg0, var4);
        }
        this.field6264 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lqa;J[Ldl;[Lfr;Z)V", line = 244)
    public final void method2656(class206 arg0, long arg1, class55[] arg2, class348[] arg3, boolean arg4) {
        if (!this.field6266) {
            this.method2653(arg0, arg2, arg4);
            this.method2651(arg3, arg4);
            this.field6267 = arg1;
        }
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "()V", line = 252)
    public final void method2657() {
        this.field6279 = true;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(J)V", line = 256)
    public final void method2658(long arg0) {
        this.field6267 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "()V", line = 259)
    public static void method2659() {
        field6269 = null;
        field6271 = null;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V", line = 365)
    private class455(int arg0) {
        this.method2661(arg0);
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "()V", line = 267)
    public final void method2660() {
        this.field6266 = true;
        for (class168 var1 = (class168) this.field6272.method1050((byte) 73); var1 != null; var1 = (class168) this.field6272.method1047(-7962)) {
            if (var1.field2060.field8976 == 1) {
                var1.method48(-1);
            }
        }
        for (int var2 = 0; var2 < this.field6265.length; var2++) {
            if (this.field6265[var2] != null) {
                this.field6265[var2].method379();
                this.field6265[var2] = null;
            }
        }
        this.field6263 = 0;
        this.field6270 = new class354();
        this.field6273 = 0;
        this.field6272 = new class193();
        this.field6276 = 0;
        this.method610((byte) -110);
        class546.field8042[class48.field402] = this;
        class48.field402 = class48.field402 + 1 & class230.field2853[class557.field8210];
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V", line = 303)
    private final void method2661(int arg0) {
        class388.field5129.method1991(this, -91);
        this.field6267 = arg0;
        this.field6264 = arg0;
        this.field6279 = true;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIII)V", line = 310)
    public final void method2662(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6277 = arg0;
        this.field6281 = arg1;
        this.field6278 = arg2;
        this.field6275 = arg3;
        this.field6280 = arg4;
    }

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "()V", line = 325)
    private final void method2663() {
        this.field6268 = false;
    }
}
