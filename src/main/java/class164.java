import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class164 {

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "Ltl;")
    private class400 field2275 = new class400(128);

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "Ltl;")
    public class400 field2280 = new class400(64);

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lui;")
    public class451 field2272;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "Lui;")
    private class451 field2279;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Lo;")
    public static class332 field2276;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "[Lvm;")
    public static class293[] field2281;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field2282;

    static {
        new class332((String) null, "geschickt werden.", (String) null, (String) null);
        field2276 = new class332(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
        field2281 = new class293[128];
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 4)
    public static void method1109(int arg0) {
        if (arg0 != -24624) {
            method1115(119, (class451) null, 71, false);
        }
        field2281 = null;
        field2276 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V", line = 15)
    public final void method1110(int arg0, int arg1) {
        class400 var3 = this.field2275;
        synchronized (this.field2275) {
            this.field2275.method2389(false, arg1);
        }
        field2277++;
        class400 var4 = this.field2280;
        synchronized (this.field2280) {
            this.field2280.method2389(false, arg1);
            if (arg0 != 1) {
                this.field2279 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)Lgu;", line = 31)
    public final class94 method1111(int arg0, int arg1) {
        field2273++;
        class400 var3 = this.field2275;
        class94 var4;
        synchronized (this.field2275) {
            var4 = (class94) this.field2275.method2393(-121, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2279.method2691(arg0, 36, 0);
        class94 var6 = new class94();
        var6.field1312 = arg0;
        var6.field1318 = this;
        if (var5 != null) {
            var6.method728(new class446(var5), -15757);
        }
        if (arg1 != -13516) {
            field2281 = null;
        }
        var6.method725(0);
        class400 var7 = this.field2275;
        synchronized (this.field2275) {
            this.field2275.method2395(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V", line = 68)
    public final void method1112(int arg0, int arg1, int arg2) {
        field2274++;
        this.field2275 = new class400(arg0);
        this.field2280 = new class400(arg2);
        if (arg1 != 128) {
            this.method1110(-23, -12);
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lgp;ILui;Lui;)V", line = 164)
    public class164(class430 arg0, int arg1, class451 arg2, class451 arg3) {
        this.field2272 = arg3;
        this.field2279 = arg2;
        this.field2279.method2662(36, (byte) -7);
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 99)
    public final void method1113(int arg0) {
        field2271++;
        class400 var2 = this.field2275;
        synchronized (this.field2275) {
            if (arg0 != -9620) {
                this.method1112(95, -74, -28);
            }
            this.field2275.method2388(123);
        }
        class400 var3 = this.field2280;
        synchronized (this.field2280) {
            this.field2280.method2388(9);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 116)
    public final void method1114(byte arg0) {
        class400 var2 = this.field2275;
        synchronized (this.field2275) {
            this.field2275.method2401((byte) -108);
        }
        if (arg0 <= 18) {
            this.method1113(-47);
        }
        field2282++;
        class400 var3 = this.field2280;
        synchronized (this.field2280) {
            this.field2280.method2401((byte) -122);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILui;IZ)Lfo;", line = 135)
    public static final class12 method1115(int arg0, class451 arg1, int arg2, boolean arg3) {
        field2278++;
        class446 var4 = new class446(arg1.method2691(arg0, arg2, 0));
        class12 var5 = new class12(arg0, var4.method2582((byte) -53), var4.method2582((byte) -114), var4.method2604(49), var4.method2604(-116), var4.method2628(49152) == 1, var4.method2628(49152), var4.method2628(49152));
        int var6 = var4.method2628(49152);
        if (!arg3) {
            return null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field161.method2453((byte) -124, new class17(var4.method2628(49152), var4.method2631(2530), var4.method2631(2530), var4.method2631(2530), var4.method2631(2530), var4.method2631(2530), var4.method2631(2530), var4.method2631(2530), var4.method2631(2530)));
        }
        var5.method119(!arg3);
        return var5;
    }
}
