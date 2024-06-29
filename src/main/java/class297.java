import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class297 {

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Llh;")
    private class364 field4244 = new class364(128);

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "Llh;")
    public class364 field4251 = new class364(64);

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "Lhh;")
    private class84 field4245;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "Lhh;")
    public class84 field4248;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Lvp;")
    public static class123 field4241 = new class123(75, 0);

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lvp;")
    public static class123 field4243 = new class123(6, 8);

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "F")
    public static float field4250;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "Lao;")
    public static class188 field4247;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIILeb;)V", line = 5)
    public static final void method1830(int arg0, int arg1, int arg2, int arg3, class438 arg4) {
        class165 var5 = class524.method3094(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field6385 = (arg1 << class225.field3278) + class495.field7211;
        arg4.field6380 = arg3;
        arg4.field6382 = (arg2 << class225.field3278) + class495.field7211;
        for (class525 var7 = var5.field2490; var7 != null; var7 = var7.field7716) {
            if (var7.field7711.field5543) {
                int var8 = var7.field7711.method107(false);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field6380 += var6;
            arg4.field6386 = true;
        }
        var5.field2489 = arg4;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 46)
    public static void method1831(int arg0) {
        field4247 = null;
        field4243 = null;
        field4241 = null;
        if (arg0 > -42) {
            method1831(108);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)V", line = 59)
    public final void method1832(byte arg0, int arg1) {
        class364 var3 = this.field4244;
        synchronized (this.field4244) {
            this.field4244.method2348(arg1, 40);
            if (arg0 < 21) {
                this.method1836((byte) 66);
            }
        }
        field4240++;
        class364 var4 = this.field4251;
        synchronized (this.field4251) {
            this.field4251.method2348(arg1, -128);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 81)
    public final void method1833(byte arg0) {
        class364 var2 = this.field4244;
        synchronized (this.field4244) {
            this.field4244.method2349(0);
        }
        field4239++;
        int var3 = 27 % ((arg0 + 13) / 43);
        class364 var4 = this.field4251;
        synchronized (this.field4251) {
            this.field4251.method2349(0);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)V", line = 101)
    public final void method1834(byte arg0, int arg1, int arg2) {
        field4249++;
        if (arg0 != -3) {
            field4243 = null;
        }
        this.field4244 = new class364(arg1);
        this.field4251 = new class364(arg2);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Ldb;", line = 113)
    public final class210 method1835(int arg0, int arg1) {
        field4246++;
        class364 var3 = this.field4244;
        class210 var4;
        synchronized (this.field4244) {
            var4 = (class210) this.field4244.method2339(arg0 - 125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4245.method683(arg0, arg1, 5);
        class210 var6 = new class210();
        var6.field3023 = arg1;
        var6.field3005 = this;
        if (var5 != null) {
            var6.method1394(new class303(var5), (byte) -124);
        }
        var6.method1407(arg0 + 106);
        class364 var7 = this.field4244;
        synchronized (this.field4244) {
            this.field4244.method2342((long) arg1, var6, -120);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lmt;ILhh;Lhh;)V", line = 168)
    public class297(class271 arg0, int arg1, class84 arg2, class84 arg3) {
        this.field4245 = arg2;
        this.field4248 = arg3;
        this.field4245.method656((byte) 122, 36);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V", line = 149)
    public final void method1836(byte arg0) {
        class364 var2 = this.field4244;
        synchronized (this.field4244) {
            this.field4244.method2350((byte) 112);
        }
        field4242++;
        class364 var3 = this.field4251;
        synchronized (this.field4251) {
            this.field4251.method2350((byte) 112);
        }
        if (arg0 != 99) {
            this.field4244 = null;
        }
    }
}
