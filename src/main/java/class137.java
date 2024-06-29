import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class137 {

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lrb;")
    private class196 field2404 = new class196();

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    private int field2411;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    private int field2396;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Loa;")
    private class276 field2395;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Z")
    public static boolean field2399 = false;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[S")
    public static short[] field2400 = new short[500];

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lda;")
    public static class275 field2401 = class255.method1672(113, ")4a=");

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lda;")
    private static class275 field2408 = class255.method1672(122, "Please wait)3)3)3");

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2407 = 0;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lda;")
    public static class275 field2409 = field2408;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[I")
    public static int[] field2414 = new int[128];

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "[I")
    public static int[] field2413 = new int[5];

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method986(int arg0, long arg1, Object arg2) {
        field2405++;
        this.method991(5, arg1);
        if (this.field2396 == 0) {
            class191 var5 = (class191) this.field2404.method1273((byte) -121);
            var5.method741(arg0 ^ 0x3);
            var5.method843(22610);
        } else {
            this.field2396--;
        }
        class22 var6 = new class22(arg2);
        this.field2395.method1867(true, arg1, var6);
        this.field2404.method1282(var6, (byte) 15);
        var6.field2057 = (long) arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public final void method987(byte arg0) {
        field2403++;
        for (class191 var2 = (class191) this.field2404.method1281(false); var2 != null; var2 = (class191) this.field2404.method1280(-121)) {
            if (var2.method136((byte) -112)) {
                var2.method741(3);
                var2.method843(22610);
                this.field2396++;
            }
        }
        int var3 = -18 % ((arg0 + 49) / 51);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
    public final void method988(int arg0, int arg1) {
        if (arg1 >= -55) {
            method989(-123);
        }
        if (class114.field2017 != null) {
            for (class191 var3 = (class191) this.field2404.method1281(false); var3 != null; var3 = (class191) this.field2404.method1280(-123)) {
                if (var3.method136((byte) -125)) {
                    if (var3.method138(50) == null) {
                        var3.method741(3);
                        var3.method843(22610);
                        this.field2396++;
                    }
                } else if ((long) arg0 < ++var3.field2057) {
                    class191 var4 = class114.field2017.method897(var3, (byte) 58);
                    this.field2395.method1867(true, var3.field1707, var4);
                    class207.method1337((byte) -79, var3, var4);
                    var3.method741(3);
                    var3.method843(22610);
                }
            }
        }
        field2406++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method989(int arg0) {
        field2409 = null;
        if (arg0 != 1) {
            method989(-4);
        }
        field2408 = null;
        field2414 = null;
        field2413 = null;
        field2400 = null;
        field2401 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method990(long arg0, byte arg1) {
        field2398++;
        class191 var4 = (class191) this.field2395.method1871(0, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method138(50);
        int var6 = -114 / ((arg1 + 59) / 49);
        if (var5 == null) {
            var4.method741(3);
            var4.method843(22610);
            this.field2396++;
            return null;
        }
        if (var4.method136((byte) -128)) {
            class22 var7 = new class22(var5);
            this.field2395.method1867(true, var4.field1707, var7);
            this.field2404.method1282(var7, (byte) 15);
            var7.field2057 = 0L;
            var4.method741(3);
            var4.method843(22610);
        } else {
            this.field2404.method1282(var4, (byte) 15);
            var4.field2057 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)V")
    public final void method991(int arg0, long arg1) {
        field2412++;
        class191 var4 = (class191) this.field2395.method1871(arg0 - 5, arg1);
        if (arg0 != 5) {
            field2408 = null;
        }
        if (var4 != null) {
            var4.method741(3);
            var4.method843(22610);
            this.field2396++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V")
    public static final void method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 101) {
            method989(-60);
        }
        field2410++;
        if (arg5 >= class246.field4355 && arg1 <= class96.field1632 && arg0 >= class149.field2603 && class141.field2493 >= arg3) {
            class73.method481(arg1, arg2, arg3, arg0, arg5, -1);
        } else {
            class100.method713(arg3, arg2, false, arg0, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
    public class137(int arg0) {
        int var2 = 1;
        this.field2411 = arg0;
        this.field2396 = arg0;
        while ((var2 + var2) < arg0) {
            var2 += var2;
        }
        this.field2395 = new class276(var2);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public final void method993(int arg0) {
        field2397++;
        this.field2404.method1279((byte) -29);
        this.field2395.method1865(69);
        this.field2396 = this.field2411;
        if (arg0 <= 102) {
            this.method993(-74);
        }
    }
}
