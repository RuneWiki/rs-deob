import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class750 {

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Z")
    public boolean field10409 = false;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Ltja;")
    private class288 field10408 = new class288(64);

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "Ltja;")
    public class288 field10416 = new class288(500);

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Ltja;")
    public class288 field10419 = new class288(30);

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "Ltja;")
    public class288 field10420 = new class288(50);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Lbt;")
    public class48 field10401;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Z")
    public boolean field10405;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lbt;")
    private class48 field10404;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "[[[I")
    public static int[][][] field10402 = new int[2][][];

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field10403;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field10410;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field10412;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public static int field10414;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public static int field10418;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    public int field10421;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method4187(boolean arg0, int arg1) {
        if (arg0) {
            this.field10405 = false;
        }
        this.field10408 = new class288(arg1);
        field10410++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V", line = 14)
    public final void method4188(int arg0, int arg1) {
        class288 var3 = this.field10408;
        synchronized (this.field10408) {
            this.field10408.method1694(arg0, -116);
        }
        field10411++;
        class288 var4 = this.field10416;
        synchronized (this.field10416) {
            this.field10416.method1694(arg0, -59);
            if (arg1 != 19008) {
                this.field10421 = -57;
            }
        }
        class288 var5 = this.field10419;
        synchronized (this.field10419) {
            this.field10419.method1694(arg0, -95);
        }
        class288 var6 = this.field10420;
        synchronized (this.field10420) {
            this.field10420.method1694(arg0, -46);
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)V", line = 42)
    public final void method4189(int arg0, int arg1) {
        this.field10421 = arg0;
        field10414++;
        class288 var3 = this.field10416;
        synchronized (this.field10416) {
            this.field10416.method1690(arg1);
        }
        class288 var4 = this.field10419;
        synchronized (this.field10419) {
            this.field10419.method1690(arg1);
        }
        class288 var5 = this.field10420;
        synchronized (this.field10420) {
            this.field10420.method1690(0);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 69)
    public static void method4190(int arg0) {
        if (arg0 != 32) {
            method4194(-118);
        }
        field10402 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZB)V", line = 80)
    public final void method4191(boolean arg0, byte arg1) {
        field10407++;
        if (arg0 == this.field10405) {
            return;
        }
        if (arg1 >= -76) {
            this.method4195(56);
        }
        this.field10405 = arg0;
        this.method4193((byte) -43);
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(II)Ltba;", line = 98)
    public final class174 method4192(int arg0, int arg1) {
        field10412++;
        class288 var3 = this.field10408;
        class174 var4;
        synchronized (this.field10408) {
            var4 = (class174) this.field10408.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field10404;
        byte[] var6;
        synchronized (this.field10404) {
            var6 = this.field10404.method437(class282.method1624(arg1, arg0 - 6916), (byte) -72, class30.method283(true, arg1));
        }
        class174 var7 = new class174();
        if (arg0 != 27324) {
            this.field10416 = null;
        }
        var7.field2100 = this;
        var7.field2166 = arg1;
        if (var6 != null) {
            var7.method1190(-1, new class403(var6));
        }
        var7.method1176((byte) 70);
        if (var7.field2143) {
            var7.field2087 = false;
            var7.field2110 = 0;
        }
        if (!this.field10405 && var7.field2161) {
            var7.field2142 = null;
            var7.field2136 = null;
        }
        class288 var8 = this.field10408;
        synchronized (this.field10408) {
            this.field10408.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lmja;IZLbt;Lbt;)V", line = 252)
    public class750(class441 arg0, int arg1, boolean arg2, class48 arg3, class48 arg4) {
        this.field10401 = arg4;
        this.field10405 = arg2;
        this.field10404 = arg3;
        if (this.field10404 != null) {
            int var6 = this.field10404.method445(-96) - 1;
            this.field10404.method431(4, var6);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 147)
    public final void method4193(byte arg0) {
        class288 var2 = this.field10408;
        synchronized (this.field10408) {
            this.field10408.method1690(0);
        }
        field10403++;
        int var3 = -10 % ((arg0 + 80) / 32);
        class288 var4 = this.field10416;
        synchronized (this.field10416) {
            this.field10416.method1690(0);
        }
        class288 var5 = this.field10419;
        synchronized (this.field10419) {
            this.field10419.method1690(0);
        }
        class288 var6 = this.field10420;
        synchronized (this.field10420) {
            this.field10420.method1690(0);
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V", line = 168)
    public static final void method4194(int arg0) {
        field10413++;
        class253.field2957.method1833((byte) 123);
        for (int var1 = 0; var1 < 32; var1++) {
            class274.field3215[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class398.field5206[var2] = 0L;
        }
        class706.field9923 = 0;
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V", line = 196)
    public final void method4195(int arg0) {
        class288 var2 = this.field10408;
        synchronized (this.field10408) {
            if (arg0 < 89) {
                this.field10419 = null;
            }
            this.field10408.method1687((byte) 61);
        }
        field10415++;
        class288 var3 = this.field10416;
        synchronized (this.field10416) {
            this.field10416.method1687((byte) 61);
        }
        class288 var4 = this.field10419;
        synchronized (this.field10419) {
            this.field10419.method1687((byte) 61);
        }
        class288 var5 = this.field10420;
        synchronized (this.field10420) {
            this.field10420.method1687((byte) 61);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BZ)V", line = 222)
    public final void method4196(byte arg0, boolean arg1) {
        field10406++;
        if (arg0 == -47 && arg1 != this.field10409) {
            this.field10409 = arg1;
            this.method4193((byte) 127);
        }
    }
}
