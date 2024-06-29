import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class372 {

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    private int field5343 = 0;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field5336;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[Lefa;")
    public class184[] field5332;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Ljt;")
    public static class106 field5334 = new class106(20);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "J")
    private long field5337;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lefa;")
    private class184 field5335;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lefa;")
    private class184 field5347;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BJLefa;)V")
    public final void method2278(byte arg0, long arg1, class184 arg2) {
        if (arg2.field2819 != null) {
            arg2.method1304((byte) 7);
        }
        field5338++;
        if (arg0 > -16) {
            this.field5343 = 67;
        }
        class184 var5 = this.field5332[(int) (arg1 & (long) (this.field5336 - 1))];
        arg2.field2819 = var5.field2819;
        arg2.field2812 = var5;
        arg2.field2819.field2812 = arg2;
        arg2.field2810 = arg1;
        arg2.field2812.field2819 = arg2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method2279(byte arg0) {
        if (arg0 == -120) {
            field5342++;
            field5334.method809(true);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)Lefa;")
    public final class184 method2280(boolean arg0) {
        field5348++;
        if (this.field5335 == null) {
            return null;
        } else if (arg0) {
            class184 var2 = this.field5332[(int) (this.field5337 & (long) (this.field5336 - 1))];
            while (this.field5335 != var2) {
                if (this.field5335.field2810 == this.field5337) {
                    class184 var3 = this.field5335;
                    this.field5335 = this.field5335.field2812;
                    return var3;
                }
                this.field5335 = this.field5335.field2812;
            }
            this.field5335 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)I")
    public final int method2281(boolean arg0) {
        field5341++;
        int var2 = 0;
        if (arg0) {
            this.field5343 = -55;
        }
        for (int var3 = 0; var3 < this.field5336; var3++) {
            class184 var4 = this.field5332[var3];
            class184 var5 = var4.field2812;
            while (var4 != var5) {
                var5 = var5.field2812;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lefa;")
    public final class184 method2282(byte arg0) {
        field5333++;
        if (this.field5343 > 0 && this.field5332[this.field5343 - 1] != this.field5347) {
            class184 var2 = this.field5347;
            this.field5347 = var2.field2812;
            return var2;
        }
        while (this.field5336 > this.field5343) {
            class184 var3 = this.field5332[this.field5343++].field2812;
            if (this.field5332[this.field5343 - 1] != var3) {
                this.field5347 = var3.field2812;
                return var3;
            }
        }
        if (arg0 <= 6) {
            this.field5336 = 69;
        }
        return null;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)Lefa;")
    public final class184 method2283(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            this.field5343 = 0;
            field5340++;
            return this.method2282((byte) 109);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public static void method2284(byte arg0) {
        if (arg0 < 27) {
            method2284((byte) 125);
        }
        field5334 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
    public final int method2285(int arg0) {
        field5345++;
        if (arg0 != 0) {
            method2284((byte) -33);
        }
        return this.field5336;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Z")
    public static final boolean method2286(int arg0, int arg1) {
        field5346++;
        for (class342 var2 = (class342) class748.field10459.method1195(0); var2 != null; var2 = (class342) class748.field10459.method1201(2)) {
            if (class615.method3555(var2.field4972, 5066) && (long) arg1 == var2.field4971) {
                return true;
            }
        }
        if (arg0 <= 94) {
            field5334 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JB)Lefa;")
    public final class184 method2287(long arg0, byte arg1) {
        field5344++;
        if (arg1 != -117) {
            method2286(13, -73);
        }
        this.field5337 = arg0;
        class184 var4 = this.field5332[(int) ((long) (this.field5336 - 1) & arg0)];
        for (this.field5335 = var4.field2812; this.field5335 != var4; this.field5335 = this.field5335.field2812) {
            if (this.field5335.field2810 == arg0) {
                class184 var5 = this.field5335;
                this.field5335 = this.field5335.field2812;
                return var5;
            }
        }
        this.field5335 = null;
        return null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
    public class372(int arg0) {
        this.field5336 = arg0;
        this.field5332 = new class184[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class184 var3 = this.field5332[var2] = new class184();
            var3.field2819 = var3;
            var3.field2812 = var3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([Lefa;B)I")
    public final int method2288(class184[] arg0, byte arg1) {
        field5339++;
        int var3 = 0;
        if (arg1 > -1) {
            return -82;
        }
        for (int var4 = 0; var4 < this.field5336; var4++) {
            class184 var5 = this.field5332[var4];
            for (class184 var6 = var5.field2812; var6 != var5; var6 = var6.field2812) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public final void method2289(int arg0) {
        if (arg0 != 1393) {
            this.field5347 = null;
        }
        field5331++;
        for (int var2 = 0; var2 < this.field5336; var2++) {
            class184 var3 = this.field5332[var2];
            while (true) {
                class184 var4 = var3.field2812;
                if (var3 == var4) {
                    break;
                }
                var4.method1304((byte) 7);
            }
        }
        this.field5347 = null;
        this.field5335 = null;
    }
}
