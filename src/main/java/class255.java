import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class255 {

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Ltb;")
    private class450 field3115 = new class450(64);

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Ltb;")
    public class450 field3122 = new class450(50);

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Ltb;")
    public class450 field3124 = new class450(5);

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lpl;")
    private class612 field3117;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lpl;")
    public class612 field3113;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Z")
    public boolean field3111;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lrf;")
    public class112 field3119;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[I")
    public static int[] field3116 = new int[13];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 5)
    public final void method1487(byte arg0) {
        field3120++;
        class450 var2 = this.field3115;
        synchronized (this.field3115) {
            this.field3115.method2412((byte) -125);
        }
        class450 var3 = this.field3122;
        synchronized (this.field3122) {
            if (arg0 <= 27) {
                this.method1487((byte) 0);
            }
            this.field3122.method2412((byte) -119);
        }
        class450 var4 = this.field3124;
        synchronized (this.field3124) {
            this.field3124.method2412((byte) -125);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 25)
    public static void method1488(byte arg0) {
        if (arg0 < -36) {
            field3116 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 36)
    public final void method1489(int arg0, int arg1) {
        this.field3125 = arg1;
        field3114++;
        class450 var3 = this.field3122;
        synchronized (this.field3122) {
            if (arg0 >= -90) {
                this.method1492((byte) 96);
            }
            this.field3122.method2406(18385);
        }
        class450 var4 = this.field3124;
        synchronized (this.field3124) {
            this.field3124.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Ldu;", line = 55)
    public final class586 method1490(int arg0, byte arg1) {
        field3121++;
        class450 var3 = this.field3115;
        class586 var4;
        synchronized (this.field3115) {
            if (arg1 > -49) {
                method1488((byte) -14);
            }
            var4 = (class586) this.field3115.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field3117;
        byte[] var6;
        synchronized (this.field3117) {
            var6 = this.field3117.method3365(class81.method471(24231, arg0), 1, class544.method2938(arg0, 766538279));
        }
        class586 var7 = new class586();
        var7.field8199 = arg0;
        var7.field8223 = this;
        if (var6 != null) {
            var7.method3222(new class630(var6), true);
        }
        var7.method3218(16);
        class450 var8 = this.field3115;
        synchronized (this.field3115) {
            this.field3115.method2409((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V", line = 95)
    public final void method1491(int arg0, int arg1) {
        class450 var3 = this.field3115;
        synchronized (this.field3115) {
            if (arg0 < 91) {
                this.field3111 = false;
            }
            this.field3115.method2411(true, arg1);
        }
        field3109++;
        class450 var4 = this.field3122;
        synchronized (this.field3122) {
            this.field3122.method2411(true, arg1);
        }
        class450 var5 = this.field3124;
        synchronized (this.field3124) {
            this.field3124.method2411(true, arg1);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V", line = 114)
    public final void method1492(byte arg0) {
        field3118++;
        class450 var2 = this.field3122;
        synchronized (this.field3122) {
            this.field3122.method2406(18385);
        }
        class450 var3 = this.field3124;
        synchronized (this.field3124) {
            this.field3124.method2406(18385);
        }
        int var4 = -83 / ((arg0 + 48) / 58);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZB)V", line = 134)
    public final void method1493(boolean arg0, byte arg1) {
        if (arg1 < 114) {
            this.field3111 = true;
        }
        field3110++;
        if (arg0 != this.field3111) {
            this.field3111 = arg0;
            this.method1494(116);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 150)
    public final void method1494(int arg0) {
        class450 var2 = this.field3115;
        synchronized (this.field3115) {
            this.field3115.method2406(18385);
        }
        field3112++;
        class450 var3 = this.field3122;
        synchronized (this.field3122) {
            this.field3122.method2406(18385);
        }
        class450 var4 = this.field3124;
        synchronized (this.field3124) {
            this.field3124.method2406(18385);
            if (arg0 < 80) {
                this.method1494(-97);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lrf;IZLpl;Lpl;)V", line = 185)
    public class255(class112 arg0, int arg1, boolean arg2, class612 arg3, class612 arg4) {
        this.field3117 = arg3;
        this.field3113 = arg4;
        this.field3111 = arg2;
        this.field3119 = arg0;
        if (this.field3117 != null) {
            int var6 = this.field3117.method3342((byte) -107) - 1;
            this.field3117.method3349(var6, true);
        }
    }
}
