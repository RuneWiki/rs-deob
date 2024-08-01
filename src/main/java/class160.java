import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class class160 {

    @OriginalMember(owner = "rc", name = "c", descriptor = "Lph;")
    private class147 field2994 = new class147();

    @OriginalMember(owner = "rc", name = "t", descriptor = "Ll;")
    private class103 field3011 = new class103();

    @OriginalMember(owner = "rc", name = "s", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "rc", name = "q", descriptor = "I")
    private int field3008;

    @OriginalMember(owner = "rc", name = "r", descriptor = "Leh;")
    private class49 field3009;

    @OriginalMember(owner = "rc", name = "f", descriptor = "Llf;")
    public static class109 field2997 = class35.method275("Passwort: ", 2);

    @OriginalMember(owner = "rc", name = "d", descriptor = "Llf;")
    private static class109 field2995 = class35.method275("Service unavailable)3", 2);

    @OriginalMember(owner = "rc", name = "h", descriptor = "Llf;")
    public static class109 field2999 = class35.method275("(U0a )2 in: ", 2);

    @OriginalMember(owner = "rc", name = "k", descriptor = "I")
    public static int field3002 = 0;

    @OriginalMember(owner = "rc", name = "g", descriptor = "Llf;")
    public static class109 field2998 = field2995;

    @OriginalMember(owner = "rc", name = "u", descriptor = "Llf;")
    public static class109 field3012 = class35.method275("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 2);

    @OriginalMember(owner = "rc", name = "b", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "rc", name = "e", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "rc", name = "i", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "rc", name = "j", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "rc", name = "n", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "rc", name = "o", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "rc", name = "p", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "rc", name = "l", descriptor = "Lkf;")
    public static class100 field3003;

    @OriginalMember(owner = "rc", name = "a", descriptor = "[I")
    public static int[] field2992;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(JILph;)V")
    public final void method1082(long arg0, int arg1, class147 arg2) {
        if (this.field3010 == 0) {
            class147 var5 = this.field3011.method740((byte) -100);
            var5.method452(true);
            var5.method1031((byte) 3);
            if (this.field2994 == var5) {
                class147 var6 = this.field3011.method740((byte) -55);
                var6.method452(true);
                var6.method1031((byte) 3);
            }
        } else {
            this.field3010--;
        }
        field3006++;
        this.field3009.method339(arg0, false, arg2);
        int var7 = 93 % ((-arg1 - 71) / 33);
        this.field3011.method738(18619, arg2);
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(JB)V")
    public final void method1083(long arg0, byte arg1) {
        field3005++;
        if (arg1 != 40) {
            this.method1084(48);
        }
        class147 var4 = (class147) this.field3009.method337(arg0, (byte) -77);
        if (var4 != null) {
            var4.method452(true);
            var4.method1031((byte) 3);
            this.field3010++;
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(I)Lhb;")
    public final class71 method1084(int arg0) {
        if (arg0 <= 101) {
            field2998 = null;
        }
        field3007++;
        return this.field3009.method338((byte) 67);
    }

    @OriginalMember(owner = "rc", name = "b", descriptor = "(I)V")
    public static void method1085(int arg0) {
        if (arg0 != 1) {
            field3002 = -7;
        }
        field3012 = null;
        field2998 = null;
        field2997 = null;
        field2992 = null;
        field3003 = null;
        field2995 = null;
        field2999 = null;
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(JI)Lph;")
    public final class147 method1086(long arg0, int arg1) {
        if (arg1 >= -94) {
            return null;
        }
        class147 var4 = (class147) this.field3009.method337(arg0, (byte) -83);
        if (var4 != null) {
            this.field3011.method738(18619, var4);
        }
        field3001++;
        return var4;
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(B)Lhb;")
    public final class71 method1087(byte arg0) {
        field3000++;
        return arg0 == -70 ? this.field3009.method335(1) : null;
    }

    @OriginalMember(owner = "rc", name = "c", descriptor = "(I)V")
    public final void method1088(int arg0) {
        if (arg0 != -51) {
            return;
        }
        while (true) {
            class147 var2 = this.field3011.method740((byte) -71);
            if (var2 == null) {
                this.field3010 = this.field3008;
                field2993++;
                return;
            }
            var2.method452(true);
            var2.method1031((byte) 3);
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Lvg;I)Lvg;")
    public static final class200 method1089(class200 arg0, int arg1) {
        field2996++;
        class200 var2 = class4.method16(true, arg0);
        if (var2 == null) {
            var2 = arg0.field3841;
        }
        if (arg1 != -12633) {
            method1085(74);
        }
        return var2;
    }

    @OriginalMember(owner = "rc", name = "<init>", descriptor = "(I)V")
    public class160(int arg0) {
        this.field3010 = arg0;
        this.field3008 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3009 = new class49(var2);
    }
}
