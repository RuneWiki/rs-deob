import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class280 extends class84 {

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field4343 = -16 + (int) (33.0D * Math.random());

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "[I")
    public static int[] field4339 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    public static int field4345 = 0;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "Lpl;")
    public static class293 field4341;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "Ljava/lang/String;")
    public String field4336;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "[[[I")
    public static int[][][] field4333;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)Lq;")
    private static final class128 method1869(int arg0) {
        int var1 = class50.field729[0] * class39.field576[0];
        byte[] var2 = class140.field1956[0];
        if (arg0 != 255) {
            method1874(-99, -48, -57);
        }
        ++field4340;
        class128 var6;
        if (class284.field4429[0]) {
            byte[] var3 = class154.field2142[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; ++var5) {
                var4[var5] = class54.method339(class9.field79[class235.method1572(255, var2[var5])], class235.method1572(var3[var5], 255) << 24);
            }
            var6 = new class243(class21.field296, class287.field4535, class273.field4208[0], class198.field2749[0], class50.field729[0], class39.field576[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; ~var8 > ~var1; ++var8) {
                var7[var8] = class9.field79[class235.method1572(var2[var8], 255)];
            }
            var6 = new class128(class21.field296, class287.field4535, class273.field4208[0], class198.field2749[0], class50.field729[0], class39.field576[0], var7);
        }
        class15.method88(-15971);
        return var6;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
    public static final void method1870(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 == -1) {
            ++class295.field4653;
            class281.field4359.method1864(71, (byte) -69);
            class281.field4359.method1447(5, 17363472);
        }
        int var4 = -77 % ((-39 - arg3) / 45);
        if (~arg0 == -2) {
            ++class42.field628;
            class281.field4359.method1864(118, (byte) -69);
            class281.field4359.method1447(19, 17363472);
        }
        class281.field4359.method1477(arg1 - -class37.field565, -61);
        ++field4332;
        class281.field4359.method1447(class138.field1928[82] ? 1 : 0, 17363472);
        class281.field4359.method1488(arg2 - -class216.field3255, -122);
        class234.field3535 = arg1;
        class199.field2768 = arg2;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V")
    public final void method1871(byte arg0) {
        super.field1148 = super.field1148 & Long.MIN_VALUE | 500L + class223.method1433((byte) 83);
        ++field4335;
        if (arg0 != 26) {
            this.field4338 = 88;
        }
        class205.field2854.method1890(this, 0);
    }

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "(I)I")
    public final int method1872(int arg0) {
        if (arg0 != -28395) {
            method1870(41, 104, 88, -66);
        }
        ++field4342;
        return (int) (255L & super.field2369 >>> 32);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZILhc;)Lq;")
    public static final class128 method1873(int arg0, boolean arg1, int arg2, class235 arg3) {
        ++field4331;
        if (!class57.method351(arg3, arg2, arg0, (byte) -65)) {
            return null;
        } else {
            if (arg1) {
                method1875(false);
            }
            return method1869(255);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
    public static final void method1874(int arg0, int arg1, int arg2) {
        class65.field885 = true;
        class252.field3851 = arg0;
        class68.field914 = arg1;
        class44.field660 = arg2;
        class233.field3520 = -1;
        class172.field2400 = -1;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
    public static void method1875(boolean arg0) {
        if (arg0) {
            field4339 = null;
        }
        field4341 = null;
        field4339 = null;
        field4333 = null;
    }

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "(I)V")
    public final void method1876(int arg0) {
        super.field1148 |= Long.MIN_VALUE;
        if (arg0 != 1840457248) {
            this.field4329 = -51;
        }
        if (~this.method1877(false) == -1L) {
            class118.field1672.method1890(this, 0);
        }
        ++field4328;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)J")
    public final long method1877(boolean arg0) {
        ++field4334;
        if (arg0) {
            field4343 = -19;
        }
        return super.field1148 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "(I)I")
    public final int method1878(int arg0) {
        ++field4337;
        if (arg0 < 29) {
            field4339 = null;
        }
        return (int) super.field2369;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(II)V")
    public class280(int arg0, int arg1) {
        super.field2369 = (long) arg1 | (long) arg0 << 32;
    }
}
