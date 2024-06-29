import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class355 {

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "Lfba;")
    private class348 field5239 = new class348(64);

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "Lfba;")
    public class348 field5249 = new class348(60);

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "Lla;")
    public class423 field5234;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "Lla;")
    private class423 field5244;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "Z")
    public static boolean field5245 = false;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "[I")
    public static int[] field5247 = new int[25];

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field5240 = -1;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "Llc;")
    public static class435 field5238 = new class435(120, 3);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "[I")
    public static int[] field5248;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method2256(boolean arg0, int arg1) {
        field5235++;
        this.field5250 = arg1;
        class348 var3 = this.field5249;
        synchronized (this.field5249) {
            if (arg0) {
                this.method2263(47, -48);
            }
            this.field5249.method2220(arg0);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IB)V", line = 19)
    public final void method2257(int arg0, byte arg1) {
        class348 var3 = this.field5239;
        synchronized (this.field5239) {
            this.field5239.method2207(arg0, 1);
        }
        field5243++;
        if (arg1 <= -34) {
            class348 var4 = this.field5249;
            synchronized (this.field5249) {
                this.field5249.method2207(arg0, 1);
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V", line = 35)
    public final void method2258(byte arg0) {
        class348 var2 = this.field5239;
        synchronized (this.field5239) {
            int var3 = 36 % ((68 - arg0) / 54);
            this.field5239.method2219(-5300);
        }
        field5237++;
        class348 var4 = this.field5249;
        synchronized (this.field5249) {
            this.field5249.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 51)
    public static final boolean method2259(String arg0, byte arg1) {
        field5232++;
        if (arg1 < 9) {
            field5245 = false;
        }
        return class183.method1298(true, 48, arg0, 10);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILqk;II)V", line = 65)
    public static final void method2260(int arg0, class146 arg1, int arg2, int arg3) {
        field5236++;
        if (arg1 == null) {
            return;
        }
        if (arg1.field2064 != null) {
            class362 var4 = new class362();
            var4.field5304 = arg1;
            var4.field5297 = arg1.field2064;
            class529.method3207(var4);
        }
        class231.field3475 = arg1.field2079;
        class549.field7997 = true;
        class76.field1107 = arg0;
        class191.field2688 = arg1.field2131;
        class250.field3640 = arg1.field2010;
        if (arg2 == 0) {
            class243.field3582 = arg1.field1991;
            class538.field7820 = arg3;
            class548.field7953 = arg1.field2045;
            class401.method2439(1723, arg1);
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)V", line = 98)
    public final void method2261(byte arg0) {
        class348 var2 = this.field5239;
        synchronized (this.field5239) {
            this.field5239.method2220(false);
            if (arg0 >= -45) {
                field5240 = -14;
            }
        }
        field5242++;
        class348 var3 = this.field5249;
        synchronized (this.field5249) {
            this.field5249.method2220(false);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(JB)V", line = 119)
    public static final void method2262(long arg0, byte arg1) {
        if (class565.field8185 != null) {
            if (class165.field2351 == 1 || class165.field2351 == 5) {
                class65.method585(arg0, -1);
            } else if (class165.field2351 == 4) {
                class73.method631(-2, arg0);
            }
        }
        field5246++;
        class593.method3479(false, (long) class703.field9918, class211.field3164);
        if (class346.field4771 != -1) {
            class339.method2088(class346.field4771, 3705);
        }
        for (int var3 = 0; var3 < class727.field10212; var3++) {
            if (class108.field1545[var3]) {
                class567.field8200[var3] = true;
            }
            class486.field7003[var3] = class108.field1545[var3];
            class108.field1545[var3] = false;
        }
        class207.field3140 = class703.field9918;
        class512.method3115(-1, null, -1, false);
        class303.method1893(0, null, -1, -1);
        if (class346.field4771 != -1) {
            class727.field10212 = 0;
            class495.method3009(-1);
        }
        class211.field3164.method328();
        class493.method3002(3, class211.field3164);
        int var4 = class683.method3877(126);
        if (var4 == -1) {
            var4 = class548.field7953;
        }
        if (arg1 <= 49) {
            field5248 = null;
        }
        if (var4 == -1) {
            var4 = class718.field10132;
        }
        class174.method1258((byte) 126, var4);
        int var5 = class108.field1536.method2053(true) << 8;
        class66.method589(class108.field1536.field3920, class731.field10244, class108.field1536.field3923 + var5, class108.field1536.field3916 + var5, (byte) -111);
        class731.field10244 = 0;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)Lhq;", line = 192)
    public final class365 method2263(int arg0, int arg1) {
        field5233++;
        class348 var3 = this.field5239;
        class365 var4;
        synchronized (this.field5239) {
            if (arg1 >= -102) {
                field5245 = true;
            }
            var4 = (class365) this.field5239.method2216(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field5244;
        byte[] var6;
        synchronized (this.field5244) {
            var6 = this.field5244.method2600(0, class26.method118(arg0, (byte) 31), class68.method605(arg0, 55));
        }
        class365 var7 = new class365();
        var7.field5344 = arg0;
        var7.field5350 = this;
        if (var6 != null) {
            var7.method2299(new class479(var6), true);
        }
        class348 var8 = this.field5239;
        synchronized (this.field5239) {
            this.field5239.method2213((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lmp;ILla;Lla;)V", line = 284)
    public class355(class315 arg0, int arg1, class423 arg2, class423 arg3) {
        this.field5234 = arg3;
        this.field5244 = arg2;
        int var5 = this.field5244.method2623(-1) - 1;
        this.field5244.method2616(var5, 0);
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(Ljava/lang/String;B)I", line = 237)
    public static final int method2264(String arg0, byte arg1) {
        field5241++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 <= 57) {
            method2265(111);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class594.method3483(arg0.charAt(var4), (byte) -117) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 262)
    public static void method2265(int arg0) {
        field5238 = null;
        field5248 = null;
        if (arg0 != -21917) {
            field5240 = 43;
        }
        field5247 = null;
    }
}
