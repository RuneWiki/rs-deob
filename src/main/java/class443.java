import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class443 extends class113 {

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "[I")
    public static int[] field5881 = new int[32];

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Liea;")
    private class481 field5879;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Lnd;")
    public static class547 field5876;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method369(int arg0) {
        ++field5878;
        return !super.method369(arg0) ? false : super.field1633.method3154(((class258) super.field1627).field3269, (byte) 98);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZBII)V", line = 18)
    public final void method891(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field5877;
        int var5 = this.method893(true) * super.field1627.field5988 / 10000;
        int[] var6 = new int[4];
        class386.field4930.method483(var6);
        class386.field4930.method534(arg3, arg2 + 2, arg3 + var5, super.field1627.field5978 + arg2);
        this.field5879.method2766(arg3, arg2 - -2, super.field1627.field5988, super.field1627.field5978);
        if (arg1 < -77) {
            class386.field4930.method534(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 36)
    public final void method366(int arg0) {
        ++field5882;
        super.method366(arg0);
        this.field5879 = class533.method3062(-19, ((class258) super.field1627).field3269, super.field1633);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZIZI)V", line = 48)
    public final void method892(boolean arg0, int arg1, boolean arg2, int arg3) {
        class386.field4930.method460(arg3 - 2, arg1, super.field1627.field5988 + 4, super.field1627.field5978 - -2, ((class258) super.field1627).field3273, 0);
        ++field5875;
        class386.field4930.method460(arg3 + -1, arg1 + 1, super.field1627.field5988 + 2, super.field1627.field5978, 0, 0);
        if (!arg0) {
            field5876 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)V", line = 65)
    public static void method2509(boolean arg0) {
        field5881 = null;
        if (!arg0) {
            field5876 = null;
        }
        field5876 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)I", line = 76)
    public static final int method2510(int arg0, byte arg1) {
        ++field5883;
        if (arg1 != -103) {
            field5880 = 17;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V", line = 89)
    public static final void method2511(int arg0) {
        ++field5884;
        class232.field3055 = 200;
        class180.field2530 = (int) ((double) class409.field5183 * 34.46D);
        class180.field2530 <<= 2;
        if (arg0 != -29079) {
            field5876 = null;
        }
        if (class386.field4930.method526()) {
            class180.field2530 += 512;
        }
        class297.method1781(false, arg0 ^ 29160);
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lnd;Lnd;Lfga;)V", line = 107)
    public class443(class547 arg0, class547 arg1, class258 arg2) {
        super(arg0, arg1, arg2);
    }
}
