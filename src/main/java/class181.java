import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class181 {

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lrj;")
    private class254 field3206 = new class254(256);

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Lrj;")
    private class254 field3218 = new class254(256);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lng;")
    private class138 field3209;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lng;")
    private class138 field3199;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field3195 = 0;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field3196 = 0;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lke;")
    private static class256 field3204 = class316.method2202("RuneScape is loading )2 please wait)3)3)3", 27626);

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "S")
    public static short field3208 = 320;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lke;")
    public static class256 field3213 = field3204;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field3214 = 0;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lke;")
    public static class256 field3205 = class316.method2202("T", 27626);

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lke;")
    private static class256 field3211 = class316.method2202("wave:", 27626);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lke;")
    public static class256 field3198 = class316.method2202("Monde de jeu cr-B-B", 27626);

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lke;")
    public static class256 field3202 = field3211;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lke;")
    public static class256 field3197 = field3211;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Z")
    public static boolean field3216 = true;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lke;")
    private static class256 field3215 = class316.method2202("level: ", 27626);

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lke;")
    public static class256 field3201 = field3215;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lhj;")
    public static class243 field3212;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([III)Lof;", line = 4)
    public final class268 method1325(int[] arg0, int arg1, int arg2) {
        field3200++;
        if (arg2 != -2753) {
            field3213 = (class256) null;
        }
        if (this.field3199.method997(28402) == 1) {
            return this.method1326(arg0, arg1, 1216589680, 0);
        } else if (this.field3199.method991(arg1, -1) == 1) {
            return this.method1326(arg0, 0, arg2 ^ 0xB77C5A4F, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIII)Lof;", line = 59)
    private final class268 method1326(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg3 >>> 12 | (arg3 & 0x90000FFF) << 4) ^ arg1;
        field3210++;
        int var6 = var5 | arg3 << 16;
        if (arg2 != 1216589680) {
            this.method1326((int[]) null, -104, 123, -94);
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class268 var9 = (class268) this.field3218.method1744((byte) 126, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class151 var10 = (class151) this.field3206.method1744((byte) 125, var7);
            if (var10 == null) {
                var10 = class151.method1134(this.field3199, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field3206.method1749(true, var10, var7);
            }
            class268 var11 = var10.method1132(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1199(21966);
                this.field3218.method1749(true, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 106)
    public static void method1327(byte arg0) {
        field3211 = null;
        field3201 = null;
        field3202 = null;
        if (arg0 != -11) {
            method1327((byte) 105);
        }
        field3205 = null;
        field3213 = null;
        field3215 = null;
        field3198 = null;
        field3204 = null;
        field3197 = null;
        field3212 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IBI)Lof;", line = 125)
    public final class268 method1328(int[] arg0, byte arg1, int arg2) {
        field3203++;
        if (this.field3209.method997(28402) == 1) {
            return this.method1329(arg0, 0, arg2, false);
        }
        if (arg1 <= 59) {
            field3196 = 127;
        }
        if (this.field3209.method991(arg2, -1) != 1) {
            throw new RuntimeException();
        }
        return this.method1329(arg0, arg2, 0, false);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIIZ)Lof;", line = 156)
    private final class268 method1329(int[] arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return (class268) null;
        }
        field3207++;
        int var5 = arg2 ^ ((arg1 & 0x20000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class268 var9 = (class268) this.field3218.method1744((byte) 123, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class306 var10 = class306.method2131(this.field3209, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class268 var11 = var10.method2132();
            this.field3218.method1749(true, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field4576.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lng;Lng;)V", line = 242)
    public class181(class138 arg0, class138 arg1) {
        this.field3209 = arg0;
        this.field3199 = arg1;
    }
}
