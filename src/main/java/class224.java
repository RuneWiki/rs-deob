import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class224 extends class88 {

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "Z")
    public volatile boolean field3610 = true;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "Z")
    public static boolean field3602 = false;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "Lab;")
    public static class269 field3608 = new class269();

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "S")
    public static short field3611 = 256;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "Ldd;")
    public static class282 field3612 = null;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "Lj;")
    public static class209 field3609 = new class209(64);

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "Z")
    public boolean field3603;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "Z")
    public boolean field3604;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IB)Lfe;")
    public static final class225 method1585(int arg0, byte arg1) {
        field3605++;
        class225 var2 = (class225) class246.field4034.method1693((long) arg0, 94);
        if (var2 != null) {
            return var2;
        }
        int var3 = 19 % ((-arg1 - 20) / 55);
        byte[] var4 = class45.field575.method928(4, (byte) 117, arg0);
        class225 var5 = new class225();
        if (var4 != null) {
            var5.method1595((byte) 116, arg0, new class96(var4));
        }
        class246.field4034.method1694(true, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public static void method1586(int arg0) {
        if (arg0 < 113) {
            method1585(84, (byte) -13);
        }
        field3609 = null;
        field3608 = null;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)[B")
    public abstract byte[] method917(int arg0);

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)I")
    public abstract int method916(byte arg0);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZB)I")
    public static final int method1587(boolean arg0, byte arg1) {
        if (arg1 != 76) {
            method1585(116, (byte) 95);
        }
        field3607++;
        long var2 = class249.method1723((byte) 56);
        for (class238 var4 = arg0 ? (class238) class144.field2276.method710((byte) -61) : (class238) class144.field2276.method709(false); var4 != null; var4 = (class238) class144.field2276.method709(false)) {
            if ((var4.field3930 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3930 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3923;
                    class135.field2141[var5] = class238.field3939[var5];
                    var4.method1673(arg1 + 14434);
                    return var5;
                }
                var4.method1673(14510);
            }
        }
        return -1;
    }
}
