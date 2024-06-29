import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class302 {

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "Lpca;")
    private class714 field4249 = new class714(16);

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "Lfp;")
    private class323 field4247;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "Las;")
    public static class151 field4244 = new class151(2, 4, 4, 0);

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "Lgda;")
    public static class53 field4250 = new class53(26, 7);

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "Z")
    public static boolean field4253;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V", line = 3)
    public final void method1975(int arg0) {
        field4248++;
        class714 var2 = this.field4249;
        synchronized (this.field4249) {
            this.field4249.method4023((byte) 36);
        }
        int var3 = -14 % ((arg0 - 35) / 32);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Ljha;", line = 17)
    private final class694 method1976(int arg0, int arg1) {
        field4246++;
        class714 var3 = this.field4249;
        class694 var4;
        synchronized (this.field4249) {
            var4 = (class694) this.field4249.method4022((long) arg1, (byte) 127);
            if (arg0 != 7) {
                this.method1976(-68, 60);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field4247;
        byte[] var6;
        synchronized (this.field4247) {
            var6 = this.field4247.method2100(arg1, (byte) 112, 29);
        }
        class694 var7 = new class694();
        if (var6 != null) {
            var7.method3915(new class675(var6), (byte) -101);
        }
        class714 var8 = this.field4249;
        synchronized (this.field4249) {
            this.field4249.method4018((byte) 127, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(II)V", line = 50)
    public final void method1977(int arg0, int arg1) {
        if (arg1 >= -126) {
            field4253 = false;
        }
        class714 var3 = this.field4249;
        synchronized (this.field4249) {
            this.field4249.method4016(arg0, (byte) -73);
        }
        field4252++;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V", line = 63)
    public static void method1978(int arg0) {
        field4244 = null;
        if (arg0 != 7) {
            method1978(116);
        }
        field4250 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IILgi;III)Lfh;", line = 74)
    public final class650 method1979(int arg0, int arg1, class677 arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 4) {
            method1978(-119);
        }
        field4245++;
        class585[] var7 = null;
        class694 var8 = this.method1976(7, arg5);
        if (var8.field9573 != null) {
            var7 = new class585[var8.field9573.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class345 var10 = arg2.method3775(var8.field9573[var9], -7588);
                var7[var9] = new class585(var10.field4863, var10.field4855, var10.field4859, var10.field4861, var10.field4852, var10.field4856, var10.field4857, var10.field4860);
            }
        }
        return new class650(var8.field9568, var7, var8.field9567, arg0, arg3, arg4);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V", line = 106)
    public final void method1980(boolean arg0) {
        field4251++;
        class714 var2 = this.field4249;
        synchronized (this.field4249) {
            this.field4249.method4024(0);
            if (!arg0) {
                this.field4249 = null;
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lsaa;ILfp;)V", line = 128)
    public class302(class326 arg0, int arg1, class323 arg2) {
        this.field4247 = arg2;
        this.field4247.method2084(29, 0);
    }
}
