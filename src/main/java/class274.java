import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class274 extends class285 {

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static volatile int field4414 = 0;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field4415 = 0;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4422 = "Discard";

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)[I", line = 7)
    public final int[] method60(boolean arg0, int arg1) {
        field4421++;
        if (!arg0) {
            method1984((byte) -32);
        }
        int[] var3 = this.field4573.method1116(126, arg1);
        if (this.field4573.field2420) {
            int[][] var4 = this.method2053((byte) -111, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class287.field4599; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[[I)V", line = 53)
    public static final void method1982(int arg0, int[][] arg1) {
        field4418++;
        int var2 = 6 % ((arg0 + 56) / 33);
        class281.field4523 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V", line = 67)
    public static final void method1983(int arg0) {
        if (arg0 != -7864) {
            return;
        }
        if (class29.field396 != null) {
            class23 var1 = class29.field396;
            synchronized (class29.field396) {
                class29.field396 = null;
            }
        }
        field4413++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 86)
    public class274() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V", line = 96)
    public static final void method1984(byte arg0) {
        field4417++;
        class227.field3621.method707(0);
        int var1 = 90 / ((-arg0 - 48) / 61);
        class302.field4750.method707(0);
        class5.field76.method707(0);
    }

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "(I)V", line = 108)
    public static final void method1985(int arg0) {
        class343.method2380(5, arg0 - 23932);
        field4420++;
        class5.method28(arg0 + 61, 5);
        class86.method586(89, 5);
        class48.method310(107, 5);
        class256.method1844(arg0 ^ 0xFFFFFFCD, 5);
        class109.method748(5, -129);
        class194.method1434(-1, 5);
        class54.method350(5, 1);
        class64.method433(arg0 - 203, 5);
        class324.method2273(4, 5);
        class320.method2254(0, 5);
        class100.method688(38, 5);
        class302.method2153((byte) -21, 5);
        class330.method2309(-1, 5);
        class310.method2192(arg0 - 7685, 5);
        class17.method95(2063, 5);
        class184.method1375(2, 5);
        class223.method1586(arg0, arg0 ^ 0x2);
        class113.method788(-78, 5);
        class320.method2251((byte) -101, 5);
        class93.field1270.method708(5, true);
        class339.field5285.method708(5, true);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)V", line = 140)
    public static void method1986(byte arg0) {
        field4422 = null;
        if (arg0 != -40) {
            field4414 = 66;
        }
    }
}
