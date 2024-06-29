import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class31 {

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Luaa;")
    private class395 field423 = new class395(64);

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Luaa;")
    public class395 field433 = new class395(50);

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Luaa;")
    public class395 field434 = new class395(5);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lgp;")
    public class561 field420;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Z")
    public boolean field421;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lgp;")
    private class561 field427;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Ljc;")
    public class584 field424;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lpp;")
    public static class464 field430 = new class464(19, 8);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public final void method286(int arg0) {
        field426++;
        class395 var2 = this.field423;
        synchronized (this.field423) {
            if (arg0 != 5) {
                return;
            }
            this.field423.method2406(arg0 - 123);
        }
        class395 var3 = this.field433;
        synchronized (this.field433) {
            this.field433.method2406(arg0 ^ 0xFFFFFF83);
        }
        class395 var4 = this.field434;
        synchronized (this.field434) {
            this.field434.method2406(96);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lvq;")
    public final class432 method287(int arg0, int arg1) {
        field425++;
        class395 var3 = this.field423;
        class432 var4;
        synchronized (this.field423) {
            var4 = (class432) this.field423.method2407(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field427;
        byte[] var6;
        synchronized (this.field427) {
            var6 = this.field427.method3175(class179.method1217(-4, arg0), (byte) -53, class209.method1339(arg1 + 201943423, arg0));
        }
        class432 var7 = new class432();
        if (arg1 != 8) {
            this.field433 = null;
        }
        var7.field6322 = this;
        var7.field6323 = arg0;
        if (var6 != null) {
            var7.method2572((byte) 16, new class268(var6));
        }
        var7.method2575(false);
        class395 var8 = this.field423;
        synchronized (this.field423) {
            this.field423.method2408(var7, (long) arg0, -126);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
    public final void method288(boolean arg0, int arg1) {
        field422++;
        if (this.field421 != arg0) {
            this.field421 = arg0;
            if (arg1 == 64) {
                this.method286(5);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
    public static void method289(int arg0) {
        field430 = null;
        if (arg0 != 5886) {
            method289(5);
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public final void method290(int arg0) {
        field428++;
        class395 var2 = this.field433;
        synchronized (this.field433) {
            this.field433.method2406(-123);
            if (arg0 != 50) {
                this.method291(-93, (byte) 116);
            }
        }
        class395 var3 = this.field434;
        synchronized (this.field434) {
            this.field434.method2406(-128);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V")
    public final void method291(int arg0, byte arg1) {
        this.field435 = arg0;
        field432++;
        int var3 = 20 % ((68 - arg1) / 48);
        class395 var4 = this.field433;
        synchronized (this.field433) {
            this.field433.method2406(120);
        }
        class395 var5 = this.field434;
        synchronized (this.field434) {
            this.field434.method2406(9);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
    public final void method292(byte arg0, int arg1) {
        class395 var3 = this.field423;
        synchronized (this.field423) {
            this.field423.method2397(arg1, (byte) -62);
        }
        field431++;
        class395 var4 = this.field433;
        synchronized (this.field433) {
            this.field433.method2397(arg1, (byte) -104);
        }
        class395 var5 = this.field434;
        synchronized (this.field434) {
            this.field434.method2397(arg1, (byte) -101);
        }
        int var6 = 81 / ((arg0 - 69) / 57);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public final void method293(byte arg0) {
        class395 var2 = this.field423;
        synchronized (this.field423) {
            this.field423.method2404((byte) -56);
            if (arg0 != -117) {
                this.field433 = null;
            }
        }
        field429++;
        class395 var3 = this.field433;
        synchronized (this.field433) {
            this.field433.method2404((byte) -56);
        }
        class395 var4 = this.field434;
        synchronized (this.field434) {
            this.field434.method2404((byte) -112);
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Ljc;IZLgp;Lgp;)V")
    public class31(class584 arg0, int arg1, boolean arg2, class561 arg3, class561 arg4) {
        this.field420 = arg4;
        this.field421 = arg2;
        this.field427 = arg3;
        this.field424 = arg0;
        if (this.field427 != null) {
            int var6 = this.field427.method3185(-123) - 1;
            this.field427.method3164(var6, true);
        }
    }
}
