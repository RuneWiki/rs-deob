import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class382 {

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lgm;")
    private class108 field5405;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    private int field5407;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    private int field5402;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Lkea;")
    private class213 field5410;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "[I")
    public static int[] field5404 = new int[1];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Ltf;")
    public static class264 field5391 = new class264(6, 7);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lvg;")
    public static class49 field5392;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V", line = 4)
    public class382(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 11)
    public final void method2279(int arg0) {
        if (arg0 != 0) {
            this.method2280(78);
        }
        for (class547 var2 = (class547) this.field5405.method849((byte) 58); var2 != null; var2 = (class547) this.field5405.method854((byte) 91)) {
            if (var2.method1160((byte) -41)) {
                var2.method3678(-1);
                var2.method2258((byte) 114);
                this.field5402 += var2.field7688;
            }
        }
        field5394++;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 41)
    public final Object method2280(int arg0) {
        field5395++;
        if (arg0 != 7) {
            field5392 = null;
        }
        class547 var2 = (class547) this.field5410.method1413(true);
        while (var2 != null) {
            Object var3 = var2.method1161((byte) 38);
            if (var3 != null) {
                return var3;
            }
            class547 var4 = var2;
            var2 = (class547) this.field5410.method1413(true);
            var4.method3678(-1);
            var4.method2258((byte) 111);
            this.field5402 += var4.field7688;
        }
        return null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILvs;)V", line = 72)
    private final void method2281(int arg0, class547 arg1) {
        if (arg0 != 24395) {
            return;
        }
        if (arg1 != null) {
            arg1.method3678(-1);
            arg1.method2258((byte) 121);
            this.field5402 += arg1.field7688;
        }
        field5398++;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 90)
    public final Object method2282(int arg0) {
        int var2 = -60 % ((arg0 + 56) / 43);
        field5400++;
        class547 var3 = (class547) this.field5410.method1407(6);
        while (var3 != null) {
            Object var4 = var3.method1161((byte) 32);
            if (var4 != null) {
                return var4;
            }
            class547 var5 = var3;
            var3 = (class547) this.field5410.method1413(true);
            var5.method3678(-1);
            var5.method2258((byte) 123);
            this.field5402 += var5.field7688;
        }
        return null;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)I", line = 123)
    public final int method2283(int arg0) {
        if (arg0 != 0) {
            field5392 = null;
        }
        field5401++;
        return this.field5402;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I", line = 134)
    public final int method2284(boolean arg0) {
        field5393++;
        int var2 = 0;
        if (!arg0) {
            method2288(false);
        }
        for (class547 var3 = (class547) this.field5405.method849((byte) -120); var3 != null; var3 = (class547) this.field5405.method854((byte) 89)) {
            if (!var3.method1160((byte) -41)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 159)
    public final void method2285(byte arg0) {
        if (arg0 < -72) {
            this.field5405.method846((byte) 99);
            field5403++;
            this.field5410.method1409((byte) 119);
            this.field5402 = this.field5407;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IJ)V", line = 172)
    private final void method2286(int arg0, long arg1) {
        field5399++;
        class547 var4 = (class547) this.field5410.method1405(arg1, (byte) -109);
        this.method2281(24395, var4);
        if (arg0 != -7111) {
            this.method2283(62);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IJ)Ljava/lang/Object;", line = 185)
    public final Object method2287(int arg0, long arg1) {
        field5409++;
        class547 var4 = (class547) this.field5410.method1405(arg1, (byte) -92);
        if (var4 == null) {
            return null;
        } else if (arg0 == 1) {
            Object var5 = var4.method1161((byte) 104);
            if (var5 == null) {
                var4.method3678(-1);
                var4.method2258((byte) 117);
                this.field5402 += var4.field7688;
                return null;
            }
            if (var4.method1160((byte) -41)) {
                class181 var6 = new class181(var5, var4.field7688);
                this.field5410.method1403((byte) -18, var6, var4.field9386);
                this.field5405.method852(true, var6);
                var6.field5344 = 0L;
                var4.method3678(-1);
                var4.method2258((byte) 126);
            } else {
                this.field5405.method852(true, var4);
                var4.field5344 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V", line = 230)
    public static void method2288(boolean arg0) {
        if (!arg0) {
            field5404 = null;
            field5392 = null;
            field5391 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I", line = 243)
    public final int method2289(int arg0) {
        if (arg0 <= 88) {
            this.method2281(-16, null);
        }
        field5406++;
        return this.field5407;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V", line = 259)
    public final void method2290(boolean arg0, int arg1) {
        field5397++;
        if (arg0 || class514.field7262 == null) {
            return;
        }
        for (class547 var3 = (class547) this.field5405.method849((byte) -113); var3 != null; var3 = (class547) this.field5405.method854((byte) 114)) {
            if (var3.method1160((byte) -41)) {
                if (var3.method1161((byte) 111) == null) {
                    var3.method3678(-1);
                    var3.method2258((byte) 120);
                    this.field5402++;
                }
            } else if (++var3.field5344 > (long) arg1) {
                class547 var4 = class514.field7262.method2679(var3, -125);
                this.field5410.method1403((byte) -18, var4, var3.field9386);
                class522.method3005((byte) 73, var4, var3);
                var3.method3678(-1);
                var3.method2258((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(II)V", line = 317)
    public class382(int arg0, int arg1) {
        this.field5405 = new class108();
        this.field5407 = arg0;
        this.field5402 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field5410 = new class213(var3);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/Object;JI)V", line = 332)
    public final void method2291(Object arg0, long arg1, int arg2) {
        this.method2292(true, arg2, arg0, arg1);
        field5408++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILjava/lang/Object;J)V", line = 340)
    public final void method2292(boolean arg0, int arg1, Object arg2, long arg3) {
        field5396++;
        if (arg1 > this.field5407) {
            throw new IllegalStateException("s>cs");
        }
        this.method2286(-7111, arg3);
        this.field5402 -= arg1;
        while (this.field5402 < 0) {
            class547 var7 = (class547) this.field5405.method847(0);
            this.method2281(24395, var7);
        }
        class181 var6 = new class181(arg2, arg1);
        this.field5410.method1403((byte) -18, var6, arg3);
        this.field5405.method852(arg0, var6);
        var6.field5344 = 0L;
    }
}
