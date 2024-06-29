import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class234 {

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field3391 = 0;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public int field3393 = 0;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Lpa;")
    private class387 field3386 = new class387(64);

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Luj;")
    private class401 field3395 = null;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lcb;")
    private class544 field3382;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Lcb;")
    private class544 field3383;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Liv;")
    public static class106 field3384 = new class106("runescape", 0);

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Ljo;")
    public static class351 field3390 = new class351(18, 3);

    @OriginalMember(owner = "client!em", name = "m", descriptor = "[Lmja;")
    public static class438[] field3394 = new class438[4];

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field3392 = -1;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[Lqda;")
    public static class112[] field3387;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)Laga;", line = 4)
    public final class693 method1614(int arg0, byte arg1) {
        if (arg1 != 72) {
            this.method1614(66, (byte) -113);
        }
        field3389++;
        class693 var3 = (class693) this.field3386.method2373((long) arg0, arg1 + 31);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field3382.method3150(arg0 & 0x7FFF, arg1 ^ 0xFFFFFFFC, 1);
        } else {
            var4 = this.field3383.method3150(arg0, 84, 1);
        }
        class693 var5 = new class693();
        var5.field9792 = this;
        if (var4 != null) {
            var5.method3910(new class120(var4), 0);
        }
        if (arg0 >= 32768) {
            var5.method3909(arg1 ^ 0x7B);
        }
        this.field3386.method2362(var5, 0, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 37)
    public static void method1615(byte arg0) {
        field3387 = null;
        field3390 = null;
        field3384 = null;
        field3394 = null;
        if (arg0 >= -68) {
            method1615((byte) -84);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(JJ)J", line = 50)
    public static long method1616(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([IJLrh;B)Ljava/lang/String;", line = 60)
    public final String method1617(int[] arg0, long arg1, class275 arg2, byte arg3) {
        field3385++;
        if (arg3 <= 30) {
            return null;
        }
        if (this.field3395 != null) {
            String var6 = this.field3395.method695(arg1, (byte) -126, arg0, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(ILcb;Lcb;Luj;)V", line = 119)
    public class234(int arg0, class544 arg1, class544 arg2, class401 arg3) {
        this.field3395 = arg3;
        this.field3382 = arg2;
        this.field3383 = arg1;
        if (this.field3383 != null) {
            this.field3391 = this.field3383.method3147(1, -100);
        }
        if (this.field3382 != null) {
            this.field3393 = this.field3382.method3147(1, -56);
        }
    }
}
