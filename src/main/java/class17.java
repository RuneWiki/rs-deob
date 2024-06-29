import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 extends class227 implements class334 {

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "Ll;")
    public static class16 field233;

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lef;ILjaggl/memory/NativeBuffer;IZ)V")
    public class17(class338 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field225 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[BII)V")
    public final void method103(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field227;
        if (arg0 != -13851) {
            this.method108((byte) 113);
        }
        this.method1412(arg3, arg1, false);
        this.field225 = arg2;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)I")
    public final int method104(boolean arg0) {
        ++field223;
        if (arg0) {
            this.field225 = 62;
        }
        return super.field3226;
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V")
    public static void method105(int arg0) {
        if (arg0 == 2) {
            field233 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IILmg;)Ldq;")
    public static final class490 method106(int arg0, int arg1, class101 arg2) {
        ++field232;
        if (arg0 < 117) {
            field231 = -69;
        }
        byte[] var3 = arg2.method742(arg1, 1);
        return var3 == null ? null : new class490(var3);
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)V")
    public static final void method107(int arg0, int arg1) {
        ++field226;
        class512.field7585 = arg0;
        class162 var2 = class442.field6544;
        synchronized (class442.field6544) {
            class442.field6544.method1068(arg1);
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lef;I[BIZ)V")
    public class17(class338 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field225 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V")
    public final void method108(byte arg0) {
        super.field3227.method1962(this, 34962);
        ++field229;
        int var2 = -88 % ((arg0 - 40) / 62);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIBIIII)V")
    public static final void method109(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        class317.method1854(-128, arg4);
        ++field230;
        int var7 = 0;
        int var8 = -arg0 + arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class437.field6400[arg6];
        if (arg2 > -123) {
            field233 = null;
        }
        int var16 = arg3 - var8;
        int var17 = arg3 + var8;
        class210.method1300(arg3 - arg4, var15, (byte) 87, var16, arg1);
        class210.method1300(var16, var15, (byte) 113, var17, arg5);
        class210.method1300(var17, var15, (byte) 72, arg3 - -arg4, arg1);
        while (~var9 < ~var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class485.field7088[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                if (~var8 < ~var9) {
                    int[] var18 = class437.field6400[arg6 + var9];
                    int[] var19 = class437.field6400[-var9 + arg6];
                    int var20 = class485.field7088[var9];
                    int var21 = arg3 + var7;
                    int var22 = -var7 + arg3;
                    int var23 = arg3 + var20;
                    int var24 = -var20 + arg3;
                    class210.method1300(var22, var18, (byte) 110, var24, arg1);
                    class210.method1300(var24, var18, (byte) 111, var23, arg5);
                    class210.method1300(var23, var18, (byte) 118, var21, arg1);
                    class210.method1300(var22, var19, (byte) 126, var24, arg1);
                    class210.method1300(var24, var19, (byte) 96, var23, arg5);
                    class210.method1300(var23, var19, (byte) 84, var21, arg1);
                } else {
                    int[] var25 = class437.field6400[arg6 + var9];
                    int[] var26 = class437.field6400[arg6 - var9];
                    int var27 = arg3 + var7;
                    int var28 = -var7 + arg3;
                    class210.method1300(var28, var25, (byte) 114, var27, arg1);
                    class210.method1300(var28, var26, (byte) 87, var27, arg1);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class437.field6400[arg6 + var7];
            int[] var30 = class437.field6400[arg6 - var7];
            int var31 = arg3 + var9;
            int var32 = -var9 + arg3;
            if (~var7 > ~var8) {
                int var33 = var11 >= var7 ? var11 : class485.field7088[var7];
                int var34 = arg3 - -var33;
                int var35 = -var33 + arg3;
                class210.method1300(var32, var29, (byte) 111, var35, arg1);
                class210.method1300(var35, var29, (byte) 91, var34, arg5);
                class210.method1300(var34, var29, (byte) 85, var31, arg1);
                class210.method1300(var32, var30, (byte) 77, var35, arg1);
                class210.method1300(var35, var30, (byte) 113, var34, arg5);
                class210.method1300(var34, var30, (byte) 103, var31, arg1);
            } else {
                class210.method1300(var32, var29, (byte) 113, var31, arg1);
                class210.method1300(var32, var30, (byte) 110, var31, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)J")
    public final long method110(byte arg0) {
        ++field224;
        if (arg0 > -66) {
            this.method104(false);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I")
    public final int method111(int arg0) {
        ++field228;
        if (arg0 != -28487) {
            method109(119, 65, (byte) -65, -50, 32, -76, 5);
        }
        return this.field225;
    }
}
