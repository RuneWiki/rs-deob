import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class512 extends class584 implements class308 {

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    private int field6423;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field6420 = 1;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[I")
    public static int[] field6427 = new int[1];

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lhd;")
    public static class694 field6430 = new class694(8);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
    public static final boolean method2788(int arg0, boolean arg1, String arg2, int arg3) {
        ++field6428;
        if (arg0 != 8) {
            method2789(-68);
        }
        if (~arg3 <= -3 && ~arg3 >= -37) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg2.length();
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                char var9 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (~var9 <= -66 && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || ~var9 < -123) {
                        return false;
                    }
                    var11 = var9 - 'W';
                }
                if (~arg3 >= ~var11) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var6 - -var11;
                if (~(var10 / arg3) != ~var6) {
                    return false;
                }
                var5 = true;
                var6 = var10;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static void method2789(int arg0) {
        field6427 = null;
        int var1 = -23 % ((-5 - arg0) / 47);
        field6430 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)J")
    public final long method1824(byte arg0) {
        ++field6431;
        if (arg0 != -80) {
            this.method1827(-108);
        }
        return super.field7848.getAddress();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
    public final int method1827(int arg0) {
        if (arg0 < 14) {
            field6420 = -109;
        }
        ++field6429;
        return this.field6423;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljaa;I[BI)V")
    public class512(class576 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6423 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public static final void method2790() {
        class247.method1479(1, class709.field9904);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
    public final int method1825(byte arg0) {
        if (arg0 != -109) {
            field6420 = -41;
        }
        ++field6425;
        return 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BI)V")
    public final void method1826(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field6421;
        this.method3242(arg2, arg3);
        if (arg1 != 29039) {
            this.method1825((byte) -100);
        }
        this.field6423 = arg0;
    }
}
