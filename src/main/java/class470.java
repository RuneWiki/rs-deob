import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class470 extends class481 {

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "[I")
    public static int[] field6286 = new int[128];

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "B")
    public byte field6293;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public int field6291;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Lrea;")
    public static class195 field6288;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "Leh;")
    public class335 field6287;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)[B")
    public final byte[] method2645(int arg0) {
        ++field6289;
        if (arg0 != 35) {
            field6288 = null;
        }
        if (!super.field6415 && ~this.field6287.field4619 <= ~(this.field6287.field4600.length + -this.field6293)) {
            return this.field6287.field4600;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)I")
    public final int method2646(int arg0) {
        if (arg0 != -6774) {
            method2649((byte) -125, 96);
        }
        ++field6294;
        return this.field6287 == null ? 0 : this.field6287.field4619 * 100 / (this.field6287.field4600.length - this.field6293);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[BIIIII[B)V")
    public static final void method2647(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field6292;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 3);
        if (arg7 == 405816354) {
            for (int var11 = -arg3; var11 < 0; ++var11) {
                int var10001;
                for (int var12 = var9; var12 < 0; ++var12) {
                    var10001 = arg6++;
                    arg2[var10001] = (byte) (arg2[var10001] + -arg8[arg1++]);
                    int var14 = arg6++;
                    arg2[var14] = (byte) (arg2[var14] + -arg8[arg1++]);
                    int var15 = arg6++;
                    arg2[var15] = (byte) (arg2[var15] + -arg8[arg1++]);
                    int var16 = arg6++;
                    arg2[var16] = (byte) (arg2[var16] + -arg8[arg1++]);
                }
                for (int var13 = var10; var13 < 0; ++var13) {
                    var10001 = arg6++;
                    arg2[var10001] = (byte) (arg2[var10001] + -arg8[arg1++]);
                }
                arg1 += arg5;
                arg6 += arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    public static void method2648(byte arg0) {
        if (arg0 != 40) {
            field6286 = null;
        }
        field6286 = null;
        field6288 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I")
    public static final int method2649(byte arg0, int arg1) {
        if (arg0 < 25) {
            return 26;
        } else {
            ++field6295;
            return arg1 >>> 10;
        }
    }

    static {
        for (int var0 = 0; field6286.length > var0; ++var0) {
            field6286[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; ++var1) {
            field6286[var1] = var1 + -65;
        }
        for (int var2 = 97; ~var2 >= -123; ++var2) {
            field6286[var2] = var2 - 97 + 26;
        }
        for (int var3 = 48; ~var3 >= -58; ++var3) {
            field6286[var3] = var3 - -4;
        }
        field6286[45] = field6286[47] = 63;
        field6286[42] = field6286[43] = 62;
        field6290 = 0;
    }
}
