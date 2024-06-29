import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class395 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Ljt;")
    private class106 field5930 = new class106(256);

    @OriginalMember(owner = "client!br", name = "e", descriptor = "Lwh;")
    private class148 field5934;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Ld;")
    private class151 field5932;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Lej;")
    public static class123 field5936 = new class123();

    @OriginalMember(owner = "client!br", name = "h", descriptor = "Ljt;")
    public static class106 field5937 = new class106(64);

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public final void method2523(int arg0) {
        this.field5930.method809(true);
        field5935++;
        if (arg0 != 24588) {
            this.method2525(105, true);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public static void method2524(int arg0) {
        field5936 = null;
        field5937 = null;
        if (arg0 != 16129) {
            method2524(-77);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)Law;")
    public final class76 method2525(int arg0, boolean arg1) {
        if (!arg1) {
            this.field5930 = null;
        }
        field5931++;
        Object var3 = this.field5930.method803(112, (long) arg0);
        if (var3 != null) {
            return (class76) var3;
        } else if (this.field5932.method1121(-30695, arg0)) {
            class293 var4 = this.field5932.method1124((byte) -124, arg0);
            int var5 = var4.field4174 ? 64 : this.field5934.field2161;
            class76 var7;
            if (var4.field4181 && this.field5934.method441()) {
                float[] var6 = this.field5932.method1122(16614, arg0, var5, var5, 0.7F, false);
                var7 = new class76(this.field5934, 3553, 34842, var5, var5, var4.field4180 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field4192 != 2 && class412.method2618((byte) -99, var4.field4185)) {
                    var8 = this.field5932.method1123((byte) 95, 0.7F, true, arg0, var5, var5);
                } else {
                    var8 = this.field5932.method1126(false, arg0, (byte) 83, 0.7F, var5, var5);
                }
                var7 = new class76(this.field5934, 3553, 6408, var5, var5, var4.field4180 != 0, var8, 0, 0, false);
            }
            var7.method636(var4.field4186, 10497, var4.field4189);
            this.field5930.method801(1, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
    public final void method2526(int arg0) {
        if (arg0 == 18648) {
            this.field5930.method807(5, -1);
            field5933++;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lwh;Ld;)V")
    public class395(class148 arg0, class151 arg1) {
        this.field5934 = arg0;
        this.field5932 = arg1;
    }
}
