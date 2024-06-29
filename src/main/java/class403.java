import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class403 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Z")
    public boolean field5586 = false;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Lgca;")
    public static class209 field5587 = new class209(64);

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "F")
    public static float field5597 = 0.0F;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field5595 = 0;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "[I")
    public static int[] field5599 = new int[14];

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field5601 = 0;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public int field5600;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "Llg;")
    public class139 field5593;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLha;II)Lcw;")
    public final class21 method2445(boolean arg0, class545 arg1, int arg2, int arg3) {
        if (arg3 != 511638067) {
            this.field5593 = null;
        }
        field5590++;
        long var5 = (long) (this.field5600 | arg2 << 16 | (arg0 ? 262144 : 0) | arg1.field7688 << 19);
        class21 var7 = (class21) this.field5593.field1915.method3200(var5, -19983);
        if (var7 != null) {
            return var7;
        } else if (this.field5593.field1907.method3340(0, this.field5600)) {
            class320 var8 = class320.method1870(this.field5593.field1907, this.field5600, 0);
            if (var8 != null) {
                var8.field4120 = var8.field4127 = var8.field4126 = var8.field4123 = 0;
                if (arg0) {
                    var8.method1867();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1871();
                }
            }
            class21 var10 = arg1.method2126(var8, true);
            if (var10 != null) {
                this.field5593.field1915.method3199((byte) 78, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lvj;II)V")
    private final void method2446(class26 arg0, int arg1, int arg2) {
        field5591++;
        if (arg1 > -67) {
            field5594 = 0;
        }
        if (arg2 == 1) {
            this.field5600 = arg0.method193(2);
        } else if (arg2 == 2) {
            this.field5589 = arg0.method186((byte) 100);
        } else if (arg2 == 3) {
            this.field5586 = true;
        } else if (arg2 == 4) {
            this.field5600 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lul;II)V")
    public static final void method2447(class364 arg0, int arg1, int arg2) {
        int var3 = -115 % ((arg2 - 68) / 44);
        field5598++;
        if (class647.field9171) {
            class647.field9171 = false;
            arg1 = 0;
        }
        if (class72.field1015 != null && class72.field1015.method2045(arg0, false)) {
            return;
        }
        class72.field1015 = arg0;
        class409.field5687 = class224.method1457((byte) -62);
        class563.field7996 = arg1;
        class199.field2877 = arg1;
        if (class199.field2877 != 0) {
            class93.field1248 = class547.field7715;
            class7.field67 = class721.field10176;
            class137.field1832 = class644.field9131;
            class453.field6242 = class321.field4137;
            class641.field9102 = class478.field6514;
            class213.field3015 = class16.field212;
            class605.field8639 = class354.field4556;
            class336.field4306 = class504.field7053;
            class541.field7553 = class363.field4652;
            class330.field4228 = class541.field7575;
            return;
        }
        class541.method3222((byte) -96);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lvj;I)V")
    public final void method2448(class26 arg0, int arg1) {
        if (arg1 < 35) {
            return;
        }
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                field5596++;
                return;
            }
            this.method2446(arg0, -88, var3);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)I")
    public static final int method2449(int arg0, byte arg1, int arg2) {
        field5592++;
        double var3 = Math.log((double) arg2) / Math.log(2.0D);
        if (arg1 == -71) {
            double var5 = Math.log((double) arg0) / Math.log(2.0D);
            double var7 = (var3 - var5) * Math.random() + var5;
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        } else {
            return 42;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public static void method2450(byte arg0) {
        field5587 = null;
        if (arg0 >= -84) {
            method2450((byte) -52);
        }
        field5599 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
    public final boolean method2451(int arg0) {
        if (arg0 != 0) {
            method2447(null, -114, -107);
        }
        field5588++;
        return this.field5593.field1907.method3340(0, this.field5600);
    }
}
