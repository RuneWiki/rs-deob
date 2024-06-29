import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class155 extends class555 {

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "F")
    private float field2181 = 0.0F;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "Lln;")
    private class96 field2174;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field2183 = 1;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)Z", line = 6)
    public final boolean method125(int arg0) {
        if (arg0 != -20112) {
            this.field2181 = -0.4552122F;
        }
        ++field2178;
        return this.field2174.method544((byte) -101);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V", line = 17)
    public final void method117(boolean arg0, int arg1) {
        ++field2177;
        if (arg1 == -13443) {
            super.field7580.method3672((byte) -115, class298.field3941, class274.field3642);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 28)
    public final void method121(byte arg0) {
        super.field7580.method3635(true, 1);
        ++field2180;
        super.field7580.method3672((byte) -123, class274.field3642, class274.field3642);
        super.field7580.method3624(class630.field8719, -123, 0);
        super.field7580.method3666(0, class630.field8719, (byte) -83);
        super.field7580.method2000(1, 0);
        super.field7580.method3613((byte) 109, (class222) null);
        super.field7580.method3635(true, 0);
        super.field7580.method3666(0, class630.field8719, (byte) -83);
        if (arg0 < 45) {
            this.field2174 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)V", line = 49)
    public static final void method903(int arg0, int arg1, int arg2) {
        if (arg0 == 3761) {
            ++field2182;
            class256 var3 = class592.method3279((byte) -70, 14, arg2);
            var3.method1549(-32042);
            var3.field3358 = arg1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZZ)V", line = 63)
    public final void method124(boolean arg0, boolean arg1) {
        ++field2185;
        super.field7580.method3635(true, 1);
        super.field7580.method3672((byte) 123, class298.field3941, class297.field3927);
        super.field7580.method2011(0, class630.field8719, 12080, false, arg0);
        super.field7580.method3666(0, class533.field7324, (byte) -83);
        super.field7580.method2000(0, 0);
        super.field7580.method3635(true, 0);
        super.field7580.method3678(-128, -16777216);
        super.field7580.method3666(0, class137.field1869, (byte) -83);
        this.method129(48);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V", line = 79)
    public final void method129(int arg0) {
        if (super.field7580.method3609((byte) 117) == 0) {
            class149 var2 = super.field7580.method3669(-15506);
            super.field7580.method3635(true, 1);
            class149 var3 = super.field7580.method3682(91);
            var3.method344(var2);
            var3.method869(29, 0.125F, 1.0F, 0.125F);
            var3.method873(11939, this.field2181, 0.0F, 0.0F);
            super.field7580.method3616(class166.field2383, false);
            super.field7580.method3635(true, 0);
        }
        ++field2175;
        if (arg0 <= 33) {
            this.method125(123);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lqq;Lln;)V", line = 105)
    public class155(class651 arg0, class96 arg1) {
        super(arg0);
        this.field2174 = arg1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V", line = 114)
    public final void method126(int arg0, int arg1, int arg2) {
        super.field7580.method3635(true, 1);
        ++field2179;
        if (~(128 & arg1) == -1) {
            if (~(arg2 & 1) != -2) {
                if (!this.field2174.field1153) {
                    super.field7580.method3613((byte) 103, this.field2174.field1160[0]);
                } else {
                    super.field7580.method3613((byte) 107, this.field2174.field1155);
                }
            } else if (!this.field2174.field1153) {
                int var4 = super.field7580.field9245 % 4000 * 16 / 4000;
                super.field7580.method3613((byte) 113, this.field2174.field1160[var4]);
            } else {
                this.field2181 = (float) (super.field7580.field9245 % 4000) / 4000.0F;
                super.field7580.method3613((byte) 119, this.field2174.field1155);
            }
        } else {
            super.field7580.method3613((byte) 121, (class222) null);
        }
        if (arg0 >= 81) {
            super.field7580.method3635(true, 0);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lot;BI)V", line = 166)
    public final void method127(class222 arg0, byte arg1, int arg2) {
        if (arg1 >= -93) {
            this.field2181 = 0.9502991F;
        }
        ++field2176;
        super.field7580.method3613((byte) 124, arg0);
    }
}
