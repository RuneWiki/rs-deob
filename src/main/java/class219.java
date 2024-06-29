import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class219 {

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lau;")
    private class692 field2915 = new class692(64);

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lmv;")
    private class295 field2913;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 12)
    public static final void method1377(boolean arg0, String arg1) {
        if (!arg0) {
            return;
        }
        field2910++;
        if (arg1.equals("")) {
            return;
        }
        class629.field9112++;
        class654 var2 = class631.method3628(class186.field2521, (byte) -51, class357.field5280);
        var2.field9358.method3110(class420.method2543(1, arg1), 89);
        var2.field9358.method3132(arg1, 3);
        class444.method2623(125, var2);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 31)
    public final void method1378(int arg0) {
        if (arg0 != 29445) {
            this.method1378(-50);
        }
        field2911++;
        class692 var2 = this.field2915;
        synchronized (this.field2915) {
            this.field2915.method3891(arg0 ^ 0x46B6);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)V", line = 45)
    public final void method1379(boolean arg0, int arg1) {
        class692 var3 = this.field2915;
        synchronized (this.field2915) {
            this.field2915.method3900(arg1, 0);
            if (!arg0) {
                this.field2909 = 42;
            }
        }
        field2914++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lbd;", line = 59)
    public final class434 method1380(int arg0, int arg1) {
        field2916++;
        class692 var3 = this.field2915;
        class434 var4;
        synchronized (this.field2915) {
            var4 = (class434) this.field2915.method3901((long) arg0, -117);
            if (arg1 <= 4) {
                this.field2915 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field2913;
        byte[] var6;
        synchronized (this.field2913) {
            var6 = this.field2913.method1844(16, 31330, arg0);
        }
        class434 var7 = new class434();
        if (var6 != null) {
            var7.method2582(new class540(var6), 104);
        }
        class692 var8 = this.field2915;
        synchronized (this.field2915) {
            this.field2915.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 92)
    public class219(class373 arg0, int arg1, class295 arg2) {
        this.field2913 = arg2;
        if (this.field2913 == null) {
            this.field2909 = 0;
        } else {
            this.field2909 = this.field2913.method1845(16, true);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 110)
    public final void method1381(int arg0) {
        if (arg0 != 16) {
            this.method1379(true, 110);
        }
        class692 var2 = this.field2915;
        synchronized (this.field2915) {
            this.field2915.method3890(arg0 ^ 0xFFFFFFEF);
        }
        field2912++;
    }
}
