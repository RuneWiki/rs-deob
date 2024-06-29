import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class115 {

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "B")
    private byte field2207;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lai;")
    public static class10 field2197 = class44.method278("jolt", 93);

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lai;")
    private static class10 field2202 = class44.method278("Your account is already logged in)3", 92);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lai;")
    public static class10 field2198 = field2202;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "[J")
    public static long[] field2205 = new long[200];

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "[J")
    public static long[] field2213 = new long[32];

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lai;")
    public static class10 field2199 = class44.method278("Passwort: ", 108);

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lwa;")
    public static class200 field2214;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lmb;ILje;I)V")
    public static final void method815(class111 arg0, int arg1, class87 arg2, int arg3) {
        field2203++;
        if (arg3 != 16910) {
            field2202 = null;
        }
        byte[] var4 = null;
        class192 var5 = class30.field460;
        synchronized (class30.field460) {
            for (class82 var6 = (class82) class30.field460.method1223(true); var6 != null; var6 = (class82) class30.field460.method1226((byte) -57)) {
                if ((long) arg1 == var6.field2291 && var6.field1439 == arg2 && var6.field1441 == 0) {
                    var4 = var6.field1440;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg2.method537(arg1, 75);
            arg0.method711(arg1, var7, true, arg2, arg3 ^ 0x42F1);
        } else {
            arg0.method711(arg1, var4, true, arg2, 255);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLc;Lc;)I")
    public static final int method816(boolean arg0, class21 arg1, class21 arg2) {
        field2201++;
        int var3 = 0;
        if (arg1.method143(class10.field136, -100, class15.field250)) {
            var3++;
        }
        if (arg2.method143(class10.field136, -118, class205.field3985)) {
            var3++;
        }
        if (arg2.method143(class10.field136, -122, class207.field4046)) {
            var3++;
        }
        if (arg2.method143(class10.field136, -77, class146.field2796)) {
            var3++;
        }
        if (arg2.method143(class10.field136, -96, class192.field3656)) {
            var3++;
        }
        if (!arg0) {
            field2197 = null;
        }
        if (arg2.method143(class10.field136, -54, class151.field2890)) {
            var3++;
        }
        arg2.method143(class10.field136, -104, class195.field3702);
        arg2.method143(class10.field136, -96, class58.field1027);
        arg2.method143(class10.field136, -83, class101.field1906);
        arg2.method143(class10.field136, -62, class122.field2346);
        arg2.method143(class10.field136, -89, class163.field3125);
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method817(int arg0) {
        if (arg0 != 0) {
            method816(true, null, null);
        }
        field2198 = null;
        field2205 = null;
        field2199 = null;
        field2214 = null;
        field2202 = null;
        field2213 = null;
        field2197 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I")
    public final int method818(int arg0) {
        if (arg0 == 7) {
            field2200++;
            return this.field2207 & 0x7;
        } else {
            return -16;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I")
    public final int method819(int arg0) {
        if (arg0 == 8) {
            field2210++;
            return (this.field2207 & 0x8) == 8 ? 1 : 0;
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class115() {
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lme;)V")
    public class115(class114 arg0) {
        this.field2207 = arg0.method759((byte) 127);
        this.field2212 = arg0.method762((byte) 70);
        this.field2209 = arg0.method761(255);
        this.field2211 = arg0.method761(255);
        this.field2204 = arg0.method761(255);
        this.field2208 = arg0.method761(255);
    }
}
