import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class248 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lmh;")
    public static class62 field4215 = class201.method1405(true, "Fallen lassen");

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lmh;")
    public static class62 field4214 = class201.method1405(true, "(U(Y");

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lmh;")
    private static class62 field4216 = class201.method1405(true, "glow1:");

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    public static int[] field4217 = new int[32];

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lmh;")
    public static class62 field4222 = field4216;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Lmh;")
    public static class62 field4221 = field4216;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lmh;")
    public static class62 field4218;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "[Lwg;")
    public static class24[] field4212;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[[B")
    public static byte[][] field4223;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lhi;IB)Z", line = 13)
    public static final boolean method1728(class26 arg0, int arg1, byte arg2) {
        field4225++;
        if (arg2 <= 16) {
            return false;
        }
        byte[] var3 = arg0.method137(arg1, (byte) 59);
        if (var3 == null) {
            return false;
        } else {
            class54.method354(var3, true);
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 52)
    public static void method1729(int arg0) {
        field4222 = null;
        field4212 = null;
        if (arg0 != -12176) {
            field4214 = (class62) null;
        }
        field4221 = null;
        field4216 = null;
        field4223 = (byte[][]) null;
        field4218 = null;
        field4217 = null;
        field4215 = null;
        field4214 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIZ)V", line = 87)
    public static final void method1730(int arg0, int arg1, int arg2, boolean arg3) {
        field4213++;
        class191 var4 = class52.method331((byte) -101, arg1, arg2);
        if (var4 != null && var4.field3053 != null) {
            class161 var5 = new class161();
            var5.field2598 = var4.field3053;
            var5.field2597 = var4;
            class262.method1818(var5, 33);
        }
        class206.field3490 = arg2;
        class141.field2271 = arg0;
        class106.field1728 = true;
        class153.field2410 = arg1;
        class250.method1744(var4, (byte) 105);
        if (arg3) {
            method1730(101, 41, -28, true);
        }
    }
}
