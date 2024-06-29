import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class226 {

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "Lpca;")
    private class714 field3052 = new class714(64);

    @OriginalMember(owner = "client!aia", name = "n", descriptor = "Lpca;")
    public class714 field3053 = new class714(64);

    @OriginalMember(owner = "client!aia", name = "g", descriptor = "Lfp;")
    public class323 field3046;

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "Lfp;")
    private class323 field3041;

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "Lqfa;")
    public static class98 field3044 = new class98(112, 6);

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!aia", name = "f", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "Lfp;")
    public static class323 field3049;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IILhba;II)V")
    public static final void method1410(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        if (arg4 != 16131) {
            return;
        }
        field3043++;
        for (class231 var5 = (class231) class35.field445.method2765(-12261); var5 != null; var5 = (class231) class35.field445.method2759(-15361)) {
            if (var5.field3116 == arg0 && arg3 << 9 == var5.field3121 && arg1 << 9 == var5.field3107 && var5.field3133.field236 == arg2.field236) {
                if (var5.field3123 != null) {
                    class192.field2560.method1733(var5.field3123);
                    var5.field3123 = null;
                }
                if (var5.field3131 != null) {
                    class192.field2560.method1733(var5.field3131);
                    var5.field3131 = null;
                }
                var5.method1185(-87);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
    public final void method1411(int arg0) {
        field3042++;
        class714 var2 = this.field3052;
        synchronized (this.field3052) {
            this.field3052.method4023((byte) -22);
            if (arg0 != 2060105417) {
                this.field3053 = null;
            }
        }
        class714 var3 = this.field3053;
        synchronized (this.field3053) {
            this.field3053.method4023((byte) 76);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)Lgb;")
    public final class212 method1412(int arg0, int arg1) {
        if (arg0 != 9) {
            this.field3052 = null;
        }
        field3047++;
        class714 var3 = this.field3052;
        class212 var4;
        synchronized (this.field3052) {
            var4 = (class212) this.field3052.method4022((long) arg1, (byte) 86);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field3041;
        byte[] var6;
        synchronized (this.field3041) {
            var6 = this.field3041.method2100(arg1, (byte) 112, 34);
        }
        class212 var7 = new class212();
        var7.field2796 = this;
        if (var6 != null) {
            var7.method1304(new class675(var6), arg0 + 248098343);
        }
        class714 var8 = this.field3052;
        synchronized (this.field3052) {
            this.field3052.method4018((byte) 124, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
    public static void method1413(byte arg0) {
        field3044 = null;
        field3049 = null;
        if (arg0 < 10) {
            method1418(36, -7);
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(II)I")
    public static final int method1414(int arg0, int arg1) {
        return class130.field1565 == null ? 0 : class130.field1565[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB)V")
    public final void method1415(int arg0, byte arg1) {
        class714 var3 = this.field3052;
        synchronized (this.field3052) {
            this.field3052.method4016(arg0, (byte) -73);
        }
        if (arg1 >= -65) {
            return;
        }
        field3040++;
        class714 var4 = this.field3053;
        synchronized (this.field3053) {
            this.field3053.method4016(arg0, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)V")
    public final void method1416(int arg0, int arg1, int arg2) {
        if (arg0 == 2060105417) {
            this.field3052 = new class714(arg1);
            field3051++;
            this.field3053 = new class714(arg2);
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V")
    public final void method1417(int arg0) {
        class714 var2 = this.field3052;
        synchronized (this.field3052) {
            if (arg0 >= -21) {
                return;
            }
            this.field3052.method4024(0);
        }
        field3045++;
        class714 var3 = this.field3053;
        synchronized (this.field3053) {
            this.field3053.method4024(0);
        }
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(II)Z")
    public static final boolean method1418(int arg0, int arg1) {
        if (arg1 < 72) {
            field3044 = null;
        }
        field3048++;
        return arg0 == 7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lsaa;ILfp;Lfp;)V")
    public class226(class326 arg0, int arg1, class323 arg2, class323 arg3) {
        this.field3046 = arg3;
        this.field3041 = arg2;
        this.field3041.method2084(34, 0);
    }
}
