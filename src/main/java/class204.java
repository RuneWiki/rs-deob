import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class204 extends class26 {

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "Lcf;")
    public static class93 field3676 = class147.method1066(")3", -48);

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "[J")
    public static long[] field3677 = new long[256];

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "Lcf;")
    public static class93 field3673 = class147.method1066("W-=hlen Sie eine Option", -48);

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lcf;")
    public static class93 field3686 = class147.method1066("::mm", -48);

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "Lah;")
    public class277 field3684;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "Z")
    public static boolean field3687;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "[B")
    public byte[] field3678;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "[[B")
    public static byte[][] field3675;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V")
    public static final void method1448(int arg0, boolean arg1) {
        class9.field119.method298(true, arg0);
        if (arg1) {
            method1449(false);
        }
        ++field3683;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)[B")
    public final byte[] method144(int arg0) {
        ++field3680;
        if (super.field343) {
            throw new RuntimeException();
        } else {
            if (arg0 != -24385) {
                this.field3684 = null;
            }
            return this.field3678;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
    public final int method141(boolean arg0) {
        ++field3682;
        if (arg0) {
            return 34;
        } else {
            return super.field343 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public static void method1449(boolean arg0) {
        field3686 = null;
        field3673 = null;
        if (arg0) {
            field3676 = null;
            field3677 = null;
            field3675 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILee;)Lmg;")
    public static final class264 method1450(int arg0, class280 arg1) {
        arg1.method1907(16832);
        if (arg0 != -9170) {
            field3685 = 102;
        }
        ++field3674;
        int var2 = arg1.method1907(16832);
        class264 var3 = class57.method320(var2, (byte) 29);
        var3.field4707 = arg1.method1907(16832);
        int var4 = arg1.method1907(16832);
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            int var6 = arg1.method1907(arg0 ^ -25106);
            var3.method20(arg0 ^ -9139, var6, arg1);
        }
        var3.method64(-3);
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if ((1L & var1) != 1L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field3677[var0] = var1;
        }
    }
}
