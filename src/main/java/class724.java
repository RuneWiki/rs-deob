import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class724 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Leda;")
    public class14 field10166 = new class14(20);

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Leda;")
    private class14 field10175 = new class14(64);

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lla;")
    private class422 field10170;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lla;")
    public class422 field10168;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "J")
    public static long field10165 = -1L;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ltm;")
    public static class334 field10169 = new class334(89, 6);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field10167;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field10173;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method3992(int arg0) {
        field10169 = null;
        if (arg0 > -24) {
            method3992(-70);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public final void method3993(int arg0) {
        class14 var2 = this.field10175;
        synchronized (this.field10175) {
            this.field10175.method76(46);
        }
        field10172++;
        class14 var3 = this.field10166;
        synchronized (this.field10166) {
            this.field10166.method76(-123);
            if (arg0 != -1) {
                this.method3995(91, -36);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Lij;")
    public final class160 method3994(byte arg0, int arg1) {
        field10173++;
        class14 var3 = this.field10175;
        class160 var4;
        synchronized (this.field10175) {
            var4 = (class160) this.field10175.method80((byte) -33, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field10170;
        byte[] var6;
        synchronized (this.field10170) {
            var6 = this.field10170.method2624(0, 46, arg1);
        }
        class160 var7 = new class160();
        var7.field2487 = this;
        if (var6 != null) {
            var7.method1194(new class301(var6), true);
        }
        class14 var8 = this.field10175;
        synchronized (this.field10175) {
            this.field10175.method67((long) arg1, var7, arg0 ^ 0x1A7B);
            if (arg0 != -9) {
                this.method3996((byte) 89);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    public final void method3995(int arg0, int arg1) {
        field10174++;
        class14 var3 = this.field10175;
        synchronized (this.field10175) {
            this.field10175.method68(-16878, arg0);
        }
        if (arg1 != -31534) {
            field10169 = null;
        }
        class14 var4 = this.field10166;
        synchronized (this.field10166) {
            this.field10166.method68(arg1 + 14656, arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public final void method3996(byte arg0) {
        class14 var2 = this.field10175;
        synchronized (this.field10175) {
            this.field10175.method71((byte) 44);
        }
        field10167++;
        class14 var3 = this.field10166;
        synchronized (this.field10166) {
            if (arg0 != -70) {
                this.method3994((byte) 67, -17);
            }
            this.field10166.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([J[Ljava/lang/Object;B)V")
    public static final void method3997(long[] arg0, Object[] arg1, byte arg2) {
        class740.method4140(-1, arg0, arg1, arg0.length - 1, 0);
        field10171++;
        int var3 = -124 / ((-arg2 - 63) / 46);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lcr;ILla;Lla;)V")
    public class724(class292 arg0, int arg1, class422 arg2, class422 arg3) {
        this.field10170 = arg2;
        this.field10168 = arg3;
        this.field10170.method2615(0, 46);
    }
}
