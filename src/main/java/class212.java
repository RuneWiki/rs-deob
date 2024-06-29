import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class212 extends class254 {

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "[Lef;")
    public static class215[] field3882 = new class215[50];

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Lnh;")
    public static class54 field3887 = new class54(64);

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lcf;")
    public static class93 field3891 = class147.method1066("p11_full", -48);

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field3893 = 0;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Lcf;")
    public class93 field3895;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "[[[B")
    public static byte[][][] field3896;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public final void method1493(int arg0) {
        super.field4598 |= Long.MIN_VALUE;
        if (arg0 != 13) {
            this.field3883 = -103;
        }
        if (this.method1500(-84) == 0L) {
            class165.field2914.method1190(64, this);
        }
        ++field3886;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)I")
    public final int method1494(int arg0) {
        if (arg0 >= 0) {
            this.method1500(114);
        }
        ++field3888;
        return (int) (super.field4006 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)I")
    public final int method1495(int arg0) {
        if (arg0 >= -101) {
            return 16;
        } else {
            ++field3885;
            return (int) super.field4006;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIBII)V")
    public static final void method1496(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field3897;
        int var9 = arg4 + 1;
        class58.method337(arg2, class76.field1406[arg4], arg1, arg5, false);
        int var8 = arg0 - 1;
        class58.method337(arg2, class76.field1406[arg0], arg1, arg5, false);
        for (int var6 = var9; ~var6 >= ~var8; ++var6) {
            int[] var7 = class76.field1406[var6];
            var7[arg2] = var7[arg5] = arg1;
        }
        if (arg3 != -90) {
            field3891 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLcf;)V")
    public static final void method1497(byte arg0, class93 arg1) {
        ++field3881;
        if (arg0 <= 61) {
            method1498(-37);
        }
        for (class157 var2 = (class157) class85.field1538.method1151(126); var2 != null; var2 = (class157) class85.field1538.method1159(60)) {
            if (var2.field2773.method667(arg1, (byte) -124)) {
                class164.field2886 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static final void method1498(int arg0) {
        ++field3898;
        class53 var1 = (class53) class284.field5093.method1151(117);
        int var2 = 120 / ((76 - arg0) / 33);
        while (var1 != null) {
            if (~var1.field863 != 0) {
                var1.method1544((byte) -111);
            } else {
                var1.field864 = 0;
                class177.method1272(var1, (byte) -113);
            }
            var1 = (class53) class284.field5093.method1159(27);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lee;II)Lcf;")
    public static final class93 method1499(class280 arg0, int arg1, int arg2) {
        ++field3880;
        try {
            int var3 = arg0.method1924(8100);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field5027 += class37.field562.method691(arg0.field5027, var4, arg0.field5011, arg2, false, var3);
            return class65.method450(var3, 0, 19, var4);
        } catch (Exception var6) {
            return class224.field4039;
        }
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)J")
    public final long method1500(int arg0) {
        ++field3884;
        if (arg0 > -38) {
            this.method1493(-62);
        }
        return Long.MAX_VALUE & super.field4598;
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V")
    public static void method1501(int arg0) {
        field3896 = null;
        field3887 = null;
        if (arg0 == 18352) {
            field3882 = null;
            field3891 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)V")
    public final void method1502(int arg0) {
        if (arg0 == 255) {
            ++field3890;
            super.field4598 = Long.MIN_VALUE & super.field4598 | 500L + class28.method155((byte) -43);
            class40.field614.method1190(arg0 ^ 191, this);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(II)V")
    public class212(int arg0, int arg1) {
        super.field4006 = (long) arg0 << 32 | (long) arg1;
    }
}
