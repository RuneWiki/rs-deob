import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class356 {

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Lgw;")
    private class690 field5115 = new class690(64);

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "Luu;")
    private class237 field5118;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "Ljha;")
    public static class32 field5116 = new class32();

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "[I")
    public static int[] field5119;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public static void method2278(int arg0) {
        field5116 = null;
        if (arg0 != -5295) {
            method2278(123);
        }
        field5119 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Lfia;")
    public final class648 method2279(int arg0, int arg1) {
        field5114++;
        class690 var3 = this.field5115;
        class648 var4;
        synchronized (this.field5115) {
            var4 = (class648) this.field5115.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field5118;
        byte[] var6;
        synchronized (this.field5118) {
            var6 = this.field5118.method1572(11, 0, arg1);
        }
        class648 var7 = new class648();
        if (var6 != null) {
            var7.method3629(0, new class63(var6));
        }
        class690 var8 = this.field5115;
        synchronized (this.field5115) {
            this.field5115.method3899(-66, var7, (long) arg1);
            if (arg0 >= -65) {
                this.method2283((byte) -111);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)V")
    private final void method2280(int arg0, int arg1) {
        class690 var3 = this.field5115;
        synchronized (this.field5115) {
            this.field5115.method3896(1, arg0);
            if (arg1 != 5) {
                this.method2280(76, -91);
            }
        }
        field5111++;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
    public final void method2281(int arg0) {
        field5113++;
        class690 var2 = this.field5115;
        synchronized (this.field5115) {
            this.field5115.method3906(-101);
            if (arg0 != 50) {
                this.method2281(-19);
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
    public static final void method2282(int arg0) {
        class34.field447.method3237(arg0 ^ 0x2, 5);
        field5112++;
        class228.field3059.method1908(true, 5);
        class145.field2041.method2586(5, arg0 + 111);
        class20.field192.method717(true, 5);
        class525.field7291.method152((byte) -3, 5);
        class291.field4179.method1318(arg0 + 3791, 5);
        class607.field8188.method3002((byte) 94, 5);
        class129.field1776.method4071(arg0, (byte) 75);
        class601.field8138.method1902(5, 0);
        class131.field1846.method530(5, false);
        class464.field6461.method555(5, -58);
        class700.field9771.method2(5, (byte) 85);
        class71.field1078.method3009(0, 5);
        class360.field5161.method2280(5, 5);
        class248.field3649.method3634((byte) 125, 5);
        class463.field6453.method3342(5, 96);
        class560.field7796.method1001(5, -51);
        class95.field1312.method1214(5, 93);
        class481.field6713.method2286((byte) -65, 5);
        class664.field8919.method3534(5, (byte) -53);
        class594.field8074.method3061(true, 5);
        class656.method3660(-2, 5);
        class141.method930(1, 50);
        class240.method1623(50, -99);
        class292.method1936(arg0 ^ 0x8005, 5);
        class306.method2010(false, 5);
        class84.field1194.method3896(1, 5);
        class697.field9697.method3896(1, 5);
        class319.field4442.method3896(arg0 - 4, 5);
        class117.field1551.method3896(arg0 - 4, 5);
        class546.field7592.method3896(arg0 - 4, 5);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
    public final void method2283(byte arg0) {
        if (arg0 != -70) {
            return;
        }
        field5117++;
        class690 var2 = this.field5115;
        synchronized (this.field5115) {
            this.field5115.method3902(0);
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lgp;ILuu;)V")
    public class356(class553 arg0, int arg1, class237 arg2) {
        this.field5118 = arg2;
        if (this.field5118 != null) {
            this.field5118.method1597(11, 0);
        }
    }
}
