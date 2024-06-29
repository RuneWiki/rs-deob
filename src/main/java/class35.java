import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class35 extends class577 implements class522 {

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "([SII)[S")
    public static final short[] method443(short[] arg0, int arg1, int arg2) {
        ++field862;
        if (arg2 < 87) {
            method443((short[]) null, 22, -24);
        }
        short[] var3 = new short[arg1];
        class363.method2318(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)I")
    public final int method444(int arg0) {
        if (arg0 != -23923) {
            return 92;
        } else {
            ++field863;
            return 0;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)J")
    public final long method445(byte arg0) {
        if (arg0 <= 76) {
            this.field860 = 68;
        }
        ++field865;
        return super.field7931.getAddress();
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)I")
    public static final int method446(int arg0, int arg1, int arg2, int arg3) {
        ++field859;
        if (arg0 != 4095) {
            return 14;
        } else {
            int var4 = arg1 & 3;
            if (var4 == 0) {
                return arg2;
            } else if (~var4 == -2) {
                return 4095 - arg3;
            } else {
                return ~var4 == -3 ? -arg2 + 4095 : arg3;
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)I")
    public final int method447(int arg0) {
        ++field864;
        if (arg0 != -5711) {
            this.method448((byte[]) null, -107, -123, -39);
        }
        return this.field860;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "([BIII)V")
    public final void method448(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method3324(arg0, arg3);
        ++field861;
        this.field860 = arg1;
        if (arg2 < 18) {
            this.field860 = -41;
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lqo;I[BI)V")
    public class35(class22 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field860 = arg1;
    }
}
