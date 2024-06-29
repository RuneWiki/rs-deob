import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class116 {

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "Ljr;")
    private class112 field1983 = new class112(64);

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "Ljr;")
    private class112 field1987 = new class112(100);

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "Lin;")
    private class91 field1984;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
    public final void method1020(byte arg0) {
        class112 var2 = this.field1983;
        synchronized (this.field1983) {
            this.field1983.method999(0);
            if (arg0 >= -43) {
                this.method1024(-67);
            }
        }
        field1986++;
        class112 var3 = this.field1987;
        synchronized (this.field1987) {
            this.field1987.method999(0);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)Lhg;")
    public final class691 method1021(int arg0, int arg1) {
        field1979++;
        class112 var3 = this.field1983;
        class691 var4;
        synchronized (this.field1983) {
            var4 = (class691) this.field1983.method992((long) arg0, arg1 - 68);
        }
        if (arg1 != 7) {
            this.field1987 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field1984;
        byte[] var6;
        synchronized (this.field1984) {
            var6 = this.field1984.method863(-1860, class425.method2603(arg0, (byte) 125), class684.method3831(arg1 ^ 0x55, arg0));
        }
        class691 var7 = new class691();
        var7.field9359 = arg0;
        var7.field9341 = this;
        if (var6 != null) {
            var7.method3864(new class215(var6), false);
        }
        var7.method3867((byte) 124);
        class112 var8 = this.field1983;
        synchronized (this.field1983) {
            this.field1983.method991(var7, (long) arg0, (byte) -126);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(II)V")
    public final void method1022(int arg0, int arg1) {
        field1981++;
        class112 var3 = this.field1983;
        synchronized (this.field1983) {
            this.field1983.method987(2, arg0);
        }
        class112 var4 = this.field1987;
        synchronized (this.field1987) {
            this.field1987.method987(2, arg0);
        }
        int var5 = -75 % ((arg1 - 26) / 35);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZII)I")
    public static final int method1023(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field1982++;
        if (var4 == 0) {
            return arg2;
        } else if (!arg1) {
            return -75;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public final void method1024(int arg0) {
        class112 var2 = this.field1983;
        synchronized (this.field1983) {
            this.field1983.method996(-121);
        }
        if (arg0 != 7) {
            this.method1024(-111);
        }
        field1985++;
        class112 var3 = this.field1987;
        synchronized (this.field1987) {
            this.field1987.method996(-127);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "(II)Lgw;")
    public final class172 method1025(int arg0, int arg1) {
        field1980++;
        class112 var3 = this.field1987;
        synchronized (this.field1987) {
            if (arg1 != 3) {
                this.field1983 = null;
            }
            class172 var4 = (class172) this.field1987.method992((long) arg0, -60);
            if (var4 == null) {
                var4 = new class172(arg0);
                this.field1987.method991(var4, (long) arg0, (byte) -127);
            }
            return var4.method1288(-122) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lsj;ILin;Lin;Lin;)V")
    public class116(class460 arg0, int arg1, class91 arg2, class91 arg3, class91 arg4) {
        this.field1984 = arg2;
        if (this.field1984 != null) {
            int var6 = this.field1984.method867(-1) - 1;
            this.field1984.method860(0, var6);
        }
        class212.method1454(7, arg3, 2, arg4);
    }
}
