import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class193 {

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lhm;")
    private class208 field2285 = new class208(64);

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lhm;")
    private class208 field2288 = new class208(100);

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lpfa;")
    private class275 field2284;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Ldr;")
    public static class675 field2281 = new class675(115, -2);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 6)
    public final void method1135(byte arg0) {
        field2283++;
        class208 var2 = this.field2285;
        synchronized (this.field2285) {
            this.field2285.method1224(false);
        }
        if (arg0 >= -83) {
            method1139(-7, -33, 108);
        }
        class208 var3 = this.field2288;
        synchronized (this.field2288) {
            this.field2288.method1224(false);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 22)
    public static void method1136(int arg0) {
        if (arg0 != 64) {
            field2286 = 115;
        }
        field2281 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Ltn;", line = 33)
    public final class81 method1137(int arg0, int arg1) {
        field2278++;
        class208 var3 = this.field2288;
        class81 var4;
        synchronized (this.field2288) {
            var4 = (class81) this.field2288.method1221((long) arg1, true);
            if (var4 == null) {
                var4 = new class81(arg1);
                this.field2288.method1230((byte) -109, (long) arg1, var4);
            }
        }
        synchronized (var4) {
            if (var4.method622((byte) -21)) {
                if (arg0 < 124) {
                    method1139(-55, -30, -6);
                }
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)V", line = 61)
    public final void method1138(int arg0, int arg1) {
        if (arg0 < 123) {
            this.field2288 = null;
        }
        field2287++;
        class208 var3 = this.field2285;
        synchronized (this.field2285) {
            this.field2285.method1222(14564, arg1);
        }
        class208 var4 = this.field2288;
        synchronized (this.field2288) {
            this.field2288.method1222(14564, arg1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Z", line = 83)
    public static final boolean method1139(int arg0, int arg1, int arg2) {
        field2280++;
        if (arg2 == -2) {
            return class252.method1518(arg0, arg1, 540800) || class587.method3261(arg1, arg0, -1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 94)
    public final void method1140(int arg0) {
        field2279++;
        class208 var2 = this.field2285;
        synchronized (this.field2285) {
            this.field2285.method1218(123);
        }
        class208 var3 = this.field2288;
        synchronized (this.field2288) {
            this.field2288.method1218(97);
        }
        if (arg0 != -9506) {
            this.method1138(97, 34);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)Lcu;", line = 116)
    public final class207 method1141(int arg0, byte arg1) {
        field2282++;
        int var3 = -128 % ((62 - arg1) / 45);
        class208 var4 = this.field2285;
        class207 var5;
        synchronized (this.field2285) {
            var5 = (class207) this.field2285.method1221((long) arg0, true);
        }
        if (var5 != null) {
            return var5;
        }
        class275 var6 = this.field2284;
        byte[] var7;
        synchronized (this.field2284) {
            var7 = this.field2284.method1659(-45, class163.method997(arg0, 127), class523.method2827(arg0, 124));
        }
        class207 var8 = new class207();
        var8.field2445 = this;
        var8.field2437 = arg0;
        if (var7 != null) {
            var8.method1210(118, new class572(var7));
        }
        var8.method1216(true);
        class208 var9 = this.field2285;
        synchronized (this.field2285) {
            this.field2285.method1230((byte) -108, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lbs;ILpfa;Lpfa;Lpfa;)V", line = 156)
    public class193(class643 arg0, int arg1, class275 arg2, class275 arg3, class275 arg4) {
        this.field2284 = arg2;
        if (this.field2284 != null) {
            int var6 = this.field2284.method1642(-128) - 1;
            this.field2284.method1655(var6, (byte) -82);
        }
        class85.method644(2, arg3, arg4, (byte) -128);
    }
}
