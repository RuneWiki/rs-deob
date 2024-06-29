import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class169 {

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "Lbh;")
    private class538 field2311 = new class538(64);

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Lbh;")
    public class538 field2313 = new class538(2);

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "Lwu;")
    public class557 field2302;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "Lwu;")
    private class557 field2306;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "Lqk;")
    public static class148 field2309 = new class148(51, -1);

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "Lwu;")
    public static class557 field2312;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "[I")
    public static int[] field2314;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method1065(int arg0) {
        field2312 = null;
        field2314 = null;
        field2309 = null;
        if (arg0 != 2) {
            method1069(true, 27, null);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Lnh;")
    public final class754 method1066(int arg0, int arg1) {
        field2303++;
        if (arg0 <= 104) {
            method1069(false, 94, null);
        }
        class538 var3 = this.field2311;
        class754 var4;
        synchronized (this.field2311) {
            var4 = (class754) this.field2311.method3200((long) arg1, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field2306;
        byte[] var6;
        synchronized (this.field2306) {
            var6 = this.field2306.method3322(33, arg1, (byte) 97);
        }
        class754 var7 = new class754();
        var7.field10477 = this;
        if (var6 != null) {
            var7.method4181(new class26(var6), (byte) -119);
        }
        class538 var8 = this.field2311;
        synchronized (this.field2311) {
            this.field2311.method3199((byte) 78, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1067(int arg0, String arg1) {
        field2305++;
        String var2 = class75.method465((byte) 78, class45.method306(arg1, -48));
        if (arg0 != 51) {
            field2312 = null;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)V")
    public final void method1068(int arg0, int arg1) {
        class538 var3 = this.field2311;
        synchronized (this.field2311) {
            this.field2311.method3204((byte) 78, arg0);
        }
        field2310++;
        class538 var4 = this.field2313;
        synchronized (this.field2313) {
            this.field2313.method3204((byte) 124, arg0);
        }
        if (arg1 != 64) {
            this.field2311 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1069(boolean arg0, int arg1, String arg2) {
        if (arg1 > 84) {
            class213.method1406(arg2, (byte) 91, -1, arg0, -1);
            field2308++;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
    public final void method1070(int arg0) {
        class538 var2 = this.field2311;
        synchronized (this.field2311) {
            this.field2311.method3202((byte) 127);
            int var3 = 35 % ((-arg0 - 85) / 34);
        }
        field2307++;
        class538 var4 = this.field2313;
        synchronized (this.field2313) {
            this.field2313.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public final void method1071(byte arg0) {
        class538 var2 = this.field2311;
        synchronized (this.field2311) {
            this.field2311.method3210(false);
        }
        field2304++;
        class538 var3 = this.field2313;
        synchronized (this.field2313) {
            int var4 = 104 / ((arg0 - 67) / 41);
            this.field2313.method3210(false);
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lwj;ILwu;Lwu;)V")
    public class169(class121 arg0, int arg1, class557 arg2, class557 arg3) {
        this.field2302 = arg3;
        this.field2306 = arg2;
        this.field2306.method3333(33, 3443);
    }
}
