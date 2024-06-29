import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class452 extends class46 {

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "[I")
    private int[] field6570 = new int[this.field770];

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "J")
    public static long field6573 = 0L;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "Laia;")
    public static class257 field6572 = new class257("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
    private int field6576;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    private int field6582;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "Lvh;")
    public static class626 field6575;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "[B")
    private byte[] field6581;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)V")
    public static void method2770(byte arg0) {
        field6572 = null;
        field6575 = null;
        if (arg0 != 68) {
            field6575 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZILlca;)V")
    public static final void method2771(int arg0, int arg1, boolean arg2, int arg3, class51 arg4) {
        ++field6571;
        long var5 = (long) (arg0 << 28 | arg1 << 14 | arg3);
        class477 var7 = (class477) class665.field9441.method3512(arg2, var5);
        if (var7 == null) {
            class477 var8 = new class477();
            class665.field9441.method3516(255, var5, var8);
            var8.field6929.method3472(102, arg4);
        } else {
            class688 var9 = class556.field7917.method741(-39, arg4.field823);
            int var10 = var9.field9751;
            if (~var9.field9761 == -2) {
                var10 = (arg4.field819 + 1) * var10;
            }
            for (class51 var11 = (class51) var7.field6929.method3463((byte) -50); var11 != null; var11 = (class51) var7.field6929.method3469((byte) 107)) {
                class688 var12 = class556.field7917.method741(127, var11.field823);
                int var13 = var12.field9751;
                if (~var12.field9761 == -2) {
                    var13 = (var11.field819 - -1) * var13;
                }
                if (~var13 > ~var10) {
                    class357.method2283((byte) -83, var11, arg4);
                    return;
                }
            }
            if (!arg2) {
                field6573 = 65L;
            }
            var7.field6929.method3472(91, arg4);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(IIIIIF)V")
    public class452(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field770 < ~var7; ++var7) {
            this.field6570[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
    public final void method474(int arg0) {
        if (arg0 != 4095) {
            method2772(-107, (long[]) null, 19, (byte) 60, (int[]) null);
        }
        ++field6574;
        this.field6582 = Math.abs(this.field6582);
        if (~this.field6582 <= -4097) {
            this.field6582 = 4095;
        }
        this.method2006(-26325, (byte) (this.field6582 >> 4), this.field6576++);
        this.field6582 = 0;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I[JIB[I)V")
    public static final void method2772(int arg0, long[] arg1, int arg2, byte arg3, int[] arg4) {
        ++field6580;
        if (arg0 > arg2) {
            int var5 = (arg2 - -arg0) / 2;
            int var6 = arg2;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg0; ++var11) {
                if (var7 - -((long) (var10 & var11)) > arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var9;
            method2772(var6 + -1, arg1, arg2, (byte) -29, arg4);
            method2772(arg0, arg1, var6 - -1, (byte) -29, arg4);
        }
        if (arg3 != -29) {
            field6573 = 81L;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III)V")
    public final void method468(int arg0, int arg1, int arg2) {
        this.field6582 += this.field6570[arg0] * arg1 >> 12;
        if (arg2 != 4095) {
            method2770((byte) -85);
        }
        ++field6577;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBI)V")
    public void method2006(int arg0, byte arg1, int arg2) {
        this.field6581[this.field6576++] = (byte) (127 + (class636.method3603(255, arg1) >> 1));
        ++field6579;
        if (arg0 != -26325) {
            this.method473(93);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
    public final void method473(int arg0) {
        this.field6576 = 0;
        if (arg0 != 1861690668) {
            method2770((byte) -22);
        }
        this.field6582 = 0;
        ++field6578;
    }
}
