import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class295 {

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "Ljo;")
    private class382 field4414 = new class382(64);

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "Lok;")
    private class74 field4409;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Lni;")
    public static class521 field4411 = new class521();

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "[I")
    public static int[] field4420 = new int[32];

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "Laa;")
    public static class76 field4419 = new class76(4, 3);

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "Luv;")
    public static class2 field4421 = new class2(39, 8);

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "[Lfe;")
    public static class152[] field4418;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 5)
    public static final Object method1834(boolean arg0, byte[] arg1, int arg2) {
        field4410++;
        if (arg1 == null) {
            return null;
        }
        if (arg2 < arg1.length && !class228.field3209) {
            try {
                class33 var3 = (class33) Class.forName("cv").getDeclaredConstructor().newInstance();
                var3.method284(arg1, arg2 - 12);
                return var3;
            } catch (Throwable var4) {
                class228.field3209 = true;
            }
        }
        return arg0 ? class450.method2624(arg1, arg2 ^ 0xC2) : arg1;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)V", line = 35)
    public static final void method1835(byte arg0, int arg1) {
        class154.field2331 = arg1;
        field4412++;
        int var2 = 14 % ((-arg0 - 33) / 35);
        class341.field5244 = 3;
        class14.field191 = -1;
        class197.field2888 = 100;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 48)
    public static void method1836(byte arg0) {
        field4411 = null;
        if (arg0 != 34) {
            field4411 = null;
        }
        field4420 = null;
        field4421 = null;
        field4419 = null;
        field4418 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIZI)V", line = 70)
    public static final void method1837(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class291.field4366 = 0L;
        field4417++;
        int var5 = class437.method2568(-77);
        if (arg1 != 19) {
            method1836((byte) -66);
        }
        if (arg0 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class407.field6147.method146()) {
            arg3 = true;
        }
        class445.method2612(var5, arg4, arg0, (byte) -88, arg3, arg2);
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(BI)Ltl;", line = 93)
    public final class432 method1838(byte arg0, int arg1) {
        field4413++;
        class382 var3 = this.field4414;
        class432 var4;
        synchronized (this.field4414) {
            var4 = (class432) this.field4414.method2288((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field4409;
        byte[] var6;
        synchronized (this.field4409) {
            var6 = this.field4409.method541(arg1, 19, (byte) -122);
        }
        if (arg0 != 24) {
            return null;
        }
        class432 var7 = new class432();
        if (var6 != null) {
            var7.method2553(new class468(var6), (byte) -82);
        }
        class382 var8 = this.field4414;
        synchronized (this.field4414) {
            this.field4414.method2290((long) arg1, var7, 109);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 126)
    public class295(class262 arg0, int arg1, class74 arg2) {
        this.field4409 = arg2;
        this.field4415 = this.field4409.method536(false, 19);
    }
}
