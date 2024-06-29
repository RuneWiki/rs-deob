import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class177 extends class729 {

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "Lce;")
    public class590 field2658;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "[B")
    public byte[] field2661;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "(I)V", line = 3)
    public static final void method1292(int arg0) {
        ++field2660;
        if (arg0 == 0) {
            if (class254.field3643 == null || class615.field8725 == null) {
                class254.field3643 = new int[256];
                class615.field8725 = new int[256];
                for (int var1 = 0; var1 < 256; ++var1) {
                    double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                    class254.field3643[var1] = (int) (4096.0D * Math.sin(var2));
                    class615.field8725[var1] = (int) (Math.cos(var2) * 4096.0D);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILnea;)I", line = 37)
    public static final int method1293(int arg0, class600 arg1) {
        ++field2663;
        if (arg0 < 18) {
            field2659 = 69;
        }
        if (class498.field6845 != arg1) {
            if (class133.field2225 == arg1) {
                return 6408;
            } else if (class547.field7573 == arg1) {
                return 6406;
            } else if (class94.field1350 != arg1) {
                if (class505.field6931 != arg1) {
                    if (class459.field6273 == arg1) {
                        return 6145;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    return 6410;
                }
            } else {
                return 6409;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I", line = 72)
    public final int method715(int arg0) {
        ++field2657;
        if (super.field10169) {
            return 0;
        } else {
            return arg0 != 0 ? 79 : 100;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIBII)V", line = 88)
    public static final void method1294(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field2664;
        int var7 = arg0 - arg6;
        int var8 = arg3 - -arg6;
        for (int var9 = arg3; var9 < var8; ++var9) {
            class379.method2284(arg5, arg1, class74.field1144[var9], arg2, 2);
        }
        int var10 = arg5 + arg6;
        for (int var11 = arg0; var11 > var7; --var11) {
            class379.method2284(arg5, arg1, class74.field1144[var11], arg2, 2);
        }
        int var12 = -arg6 + arg1;
        if (arg4 != -30) {
            field2659 = 71;
        }
        for (int var13 = var8; ~var13 >= ~var7; ++var13) {
            int[] var14 = class74.field1144[var13];
            class379.method2284(arg5, var10, var14, arg2, arg4 ^ -32);
            class379.method2284(var12, arg1, var14, arg2, 2);
        }
    }

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)[B", line = 132)
    public final byte[] method713(int arg0) {
        int var2 = 83 % ((55 - arg0) / 40);
        ++field2662;
        if (super.field10169) {
            throw new RuntimeException();
        } else {
            return this.field2661;
        }
    }
}
