import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class228 extends class40 {

    @OriginalMember(owner = "client!df", name = "W", descriptor = "Z")
    public static boolean field3390 = false;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "Lub;")
    public static class15 field3379 = new class15(64);

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Lkn;")
    public static class442 field3392 = new class442();

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    private int field3378;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    private int field3380;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    private int field3389;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIZIIIF)[I", line = 3)
    public static final int[] method1585(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, float arg7) {
        ++field3391;
        int[] var8 = new int[arg1];
        class32 var9 = new class32();
        var9.field392 = arg0;
        var9.field400 = arg2;
        var9.field396 = arg3;
        var9.field402 = arg6;
        var9.field410 = arg4;
        var9.field394 = (int) (arg7 * 4096.0F);
        var9.method39((byte) -23);
        class397.method2492((byte) 110, arg1, arg5);
        var9.method174(0, (byte) 116, var8);
        return var8;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 24)
    public static final String method1586(long arg0, byte arg1) {
        ++field3385;
        if (arg1 != -80) {
            return null;
        } else if (arg0 > 0L && ~arg0 > -6582952005840035282L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg0 != 0L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class434.field6205[(int) (var7 - arg0 * 37L)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V", line = 64)
    public static final void method1587(int arg0, int arg1) {
        class19.field256 = new class15(arg1);
        ++field3381;
        if (arg0 != -4299) {
            method1592(16, 85, false, 48, -73, true, 61);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 75)
    public class228() {
        this(0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[[I", line = 79)
    public final int[][] method112(int arg0, int arg1) {
        ++field3382;
        if (arg0 != 1) {
            return null;
        } else {
            int[][] var3 = super.field555.method2070(0, arg1);
            if (super.field555.field4489) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class410.field5886 > var7; ++var7) {
                    var4[var7] = this.field3378;
                    var5[var7] = this.field3380;
                    var6[var7] = this.field3389;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V", line = 124)
    private class228(int arg0) {
        super(0, false);
        this.method1591(arg0, true);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V", line = 132)
    public static final void method1588(boolean arg0) {
        if (arg0) {
            class385.field5449 = class24.field306;
            class439.field6280 = class241.field3567;
        } else {
            class385.field5449 = class401.field5633;
            class439.field6280 = class126.field1734;
        }
        class243.field3603 = class385.field5449.length;
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(B)V", line = 147)
    public static void method1589(byte arg0) {
        field3379 = null;
        if (arg0 == -35) {
            field3392 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 165)
    public static final void method1590(int arg0) {
        ++field3388;
        class15 var1 = class19.field256;
        synchronized (class19.field256) {
            class19.field256.method102((byte) -77);
        }
        if (arg0 != 4096) {
            field3379 = null;
        }
        class15 var2 = class245.field3657;
        synchronized (class245.field3657) {
            class245.field3657.method102((byte) -126);
        }
        class15 var3 = class142.field2146;
        synchronized (class142.field2146) {
            class142.field2146.method102((byte) -99);
        }
        class15 var4 = class397.field5583;
        synchronized (class397.field5583) {
            class397.field5583.method102((byte) -115);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILlf;)V", line = 188)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field3384;
        if (~arg0 == -1) {
            this.method1591(arg2.method839((byte) -92), true);
        }
        if (arg1 <= 79) {
            method1588(false);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V", line = 215)
    private final void method1591(int arg0, boolean arg1) {
        if (arg1) {
            this.field3378 = (16711680 & arg0) >> 12;
            ++field3383;
            this.field3389 = (arg0 & 255) << 4;
            this.field3380 = 4080 & arg0 >> 4;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZIIZI)V", line = 239)
    public static final void method1592(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (~arg3 < ~arg4) {
            int var7 = (arg3 + arg4) / 2;
            int var8 = arg4;
            class158 var9 = class241.field3561[var7];
            class241.field3561[var7] = class241.field3561[arg3];
            class241.field3561[arg3] = var9;
            for (int var10 = arg4; ~var10 > ~arg3; ++var10) {
                if (class247.method1726(arg0, arg5, arg6, var9, (byte) -123, arg2, class241.field3561[var10]) <= 0) {
                    class158 var11 = class241.field3561[var10];
                    class241.field3561[var10] = class241.field3561[var8];
                    class241.field3561[var8++] = var11;
                }
            }
            class241.field3561[arg3] = class241.field3561[var8];
            class241.field3561[var8] = var9;
            method1592(arg0, 37, arg2, var8 + -1, arg4, arg5, arg6);
            method1592(arg0, arg1, arg2, arg3, var8 + 1, arg5, arg6);
        }
        ++field3387;
        if (arg1 != 37) {
            field3386 = 120;
        }
    }
}
