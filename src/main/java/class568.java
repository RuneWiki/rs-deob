import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class568 extends class371 {

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "Lnj;")
    public static class487 field8417 = new class487("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V", line = 3)
    public class568() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(Z)V", line = 6)
    public static void method3314(boolean arg0) {
        field8417 = null;
        if (!arg0) {
            field8417 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(BI)[I", line = 16)
    public final int[] method79(byte arg0, int arg1) {
        ++field8416;
        if (arg0 >= -80) {
            field8417 = null;
        }
        int[] var3 = super.field5378.method1451(-117, arg1);
        if (super.field5378.field3254) {
            int var4 = class614.field9004[arg1];
            for (int var5 = 0; ~class41.field455 < ~var5; ++var5) {
                var3[var5] = this.method3318(true, var4, class287.field4215[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(Z)V", line = 52)
    public static final void method3315(boolean arg0) {
        if (class212.field3118 == null || class289.field4252 == null) {
            class212.field3118 = new int[256];
            class289.field4252 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class212.field3118[var1] = (int) (4096.0D * Math.sin(var2));
                class289.field4252[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
        ++field8418;
        if (arg0) {
            method3317((Object) null, (byte) -2, true);
        }
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)Lls;", line = 82)
    public static final class418 method3316(int arg0) {
        ++field8414;
        if (~class626.field9173.length < ~class49.field572) {
            return class626.field9173[class49.field572++];
        } else {
            if (arg0 != Integer.MAX_VALUE) {
                field8417 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B", line = 97)
    public static final byte[] method3317(Object arg0, byte arg1, boolean arg2) {
        ++field8415;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return !arg2 ? var3 : class292.method1815(var3, (byte) -85);
        } else if (arg1 != 51) {
            return null;
        } else if (arg0 instanceof class282) {
            class282 var4 = (class282) arg0;
            return var4.method427((byte) 19);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZII)I", line = 139)
    private final int method3318(boolean arg0, int arg1, int arg2) {
        ++field8419;
        int var4 = arg2 - -(arg1 * 57);
        int var5 = var4 ^ var4 << 1;
        if (!arg0) {
            field8417 = null;
        }
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
