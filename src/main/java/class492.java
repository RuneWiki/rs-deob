import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class492 {

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "Lqj;")
    public class535 field6923 = new class535(20);

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "Lqj;")
    private class535 field6931 = new class535(64);

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Luq;")
    public class172 field6922;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "Luq;")
    private class172 field6930;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "[S")
    public static short[] field6924 = new short[256];

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "Z")
    public static boolean field6929 = false;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "D")
    public static double field6926;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static final void method2898(int arg0) throws class283 {
        field6918++;
        if (class206.field2664 == 1) {
            class685.field9171.method471(class16.field155, class90.field1281);
        } else {
            class685.field9171.method471(0, 0);
        }
        if (arg0 != 0) {
            method2904((byte) 45);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)V")
    public final void method2899(byte arg0, int arg1) {
        field6928++;
        if (arg0 > -96) {
            method2904((byte) -9);
        }
        class535 var3 = this.field6931;
        synchronized (this.field6931) {
            this.field6931.method3101(false, arg1);
        }
        class535 var4 = this.field6923;
        synchronized (this.field6923) {
            this.field6923.method3101(false, arg1);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Lve;")
    public final class529 method2900(int arg0, int arg1) {
        field6925++;
        class535 var3 = this.field6931;
        class529 var4;
        synchronized (this.field6931) {
            var4 = (class529) this.field6931.method3109((byte) 111, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field6930;
        byte[] var6;
        synchronized (this.field6930) {
            var6 = this.field6930.method1188(46, -18047, arg0);
        }
        class529 var7 = new class529();
        var7.field7329 = this;
        if (var6 != null) {
            var7.method3062((byte) 62, new class254(var6));
        }
        int var8 = -49 % ((-arg1 - 53) / 37);
        class535 var9 = this.field6931;
        synchronized (this.field6931) {
            this.field6931.method3108((long) arg0, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
    public final void method2901(int arg0) {
        field6917++;
        class535 var2 = this.field6931;
        synchronized (this.field6931) {
            this.field6931.method3103(arg0 ^ 0x2C1C);
        }
        class535 var3 = this.field6923;
        synchronized (this.field6923) {
            this.field6923.method3103(-11294);
            if (arg0 != -2) {
                this.method2899((byte) -66, -45);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
    public final void method2902(int arg0) {
        field6920++;
        class535 var2 = this.field6931;
        synchronized (this.field6931) {
            if (arg0 != 20) {
                return;
            }
            this.field6931.method3113(-128);
        }
        class535 var3 = this.field6923;
        synchronized (this.field6923) {
            this.field6923.method3113(-127);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lmw;ILhda;)Lpja;")
    public static final class43 method2903(class517 arg0, int arg1, class780 arg2) {
        field6919++;
        class43 var3 = class309.method1997(69);
        var3.field454 = arg0.field7187;
        var3.field464 = arg0;
        if (var3.field454 == -1) {
            var3.field457 = new class459(260);
        } else if (var3.field454 == -2) {
            var3.field457 = new class459(10000);
        } else if (var3.field454 <= 18) {
            var3.field457 = new class459(20);
        } else if (var3.field454 <= 98) {
            var3.field457 = new class459(100);
        } else {
            var3.field457 = new class459(260);
        }
        var3.field457.method2716(arg2, -3551);
        var3.field457.method2723((byte) -52, var3.field464.method3012(arg1 ^ 0xFFFFFFBC));
        var3.field459 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public static void method2904(byte arg0) {
        if (arg0 != -96) {
            method2904((byte) 31);
        }
        field6924 = null;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lkw;ILuq;Luq;)V")
    public class492(class263 arg0, int arg1, class172 arg2, class172 arg3) {
        this.field6922 = arg3;
        this.field6930 = arg2;
        this.field6930.method1175(46, (byte) 96);
    }
}
