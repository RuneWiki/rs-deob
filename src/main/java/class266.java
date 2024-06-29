import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class266 {

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lkh;")
    private class13 field4077 = new class13(256);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lga;")
    private class279 field4076;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lkd;")
    private class188 field4079;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field4083 = 0;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lhn;")
    public static class509 field4082 = new class509(59, -1);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lwt;")
    public static class205 field4074;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public final void method1770(byte arg0) {
        field4078++;
        this.field4077.method93((byte) 124);
        if (arg0 <= 122) {
            this.method1770((byte) -29);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lfo;")
    public final class361 method1771(byte arg0, int arg1) {
        field4075++;
        Object var3 = this.field4077.method87((long) arg1, -2062335807);
        if (var3 != null) {
            return (class361) var3;
        }
        int var4 = 60 % ((20 - arg0) / 58);
        if (!this.field4076.method579(arg1, true)) {
            return null;
        }
        class281 var5 = this.field4076.method584(true, arg1);
        int var6 = var5.field4257 ? 64 : this.field4079.field3016;
        class361 var8;
        if (var5.field4262 && this.field4079.method340()) {
            float[] var7 = this.field4076.method582(arg1, false, 0.7F, var6, var6, 10080);
            var8 = new class361(this.field4079, 3553, 34842, var6, var6, var5.field4265 != 0, var7, 6408);
        } else {
            int[] var9;
            short var10;
            if (var5.field4274 && class300.method1940(false, var5.field4261)) {
                var9 = this.field4076.method583(var6, var6, arg1, 0.7F, (byte) -121, false);
                var10 = 6407;
            } else {
                var9 = this.field4076.method581(arg1, false, var6, 124, var6, 0.7F);
                var10 = 6408;
            }
            var8 = new class361(this.field4079, 3553, var10, var6, var6, var5.field4265 != 0, var9, false);
        }
        var8.method2270(var5.field4267, var5.field4260, 10243);
        this.field4077.method84((long) arg1, var8, (byte) 27);
        return var8;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lkd;Lga;)V")
    public class266(class188 arg0, class279 arg1) {
        this.field4076 = arg1;
        this.field4079 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public static void method1772(byte arg0) {
        field4074 = null;
        field4082 = null;
        if (arg0 != 103) {
            field4083 = 5;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1773(int arg0, byte arg1, int arg2) {
        if (arg1 >= -126) {
            return false;
        } else {
            field4080++;
            return (arg2 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method1774(int arg0) {
        this.field4077.method91(arg0 + 116, arg0);
        field4081++;
    }
}
