import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class11 extends class194 {

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "Z")
    public static boolean field132 = false;

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "Z")
    public static boolean field131 = false;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "[I")
    public static int[] field135 = new int[4096];

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!cn", name = "J", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)V")
    public static final void method53(int arg0) {
        for (int var1 = 0; var1 < 100; ++var1) {
            class65.field786[var1] = true;
        }
        if (arg0 != 16026) {
            field135 = null;
        }
        ++field130;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field137;
        if (~arg0 == -1) {
            super.field2278 = ~arg2.method1563(-128) == -2;
        }
        int var4 = -77 % ((arg1 - 52) / 61);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        int var3 = 115 % ((arg1 - 57) / 46);
        ++field129;
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            for (int var5 = 0; var5 < class138.field1579; ++var5) {
                this.method56(arg0, 20036, var5);
                int[] var6 = this.method1203(0, 57, class356.field4831);
                var4[var5] = var6[class394.field5368];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(III)V")
    private final void method56(int arg0, int arg1, int arg2) {
        ++field136;
        int var4 = class277.field3585[arg2];
        int var5 = class249.field3283[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if (arg1 != 20036) {
            this.method54(29, 100, (class242) null);
        }
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class394.field5368 = arg2;
            class356.field4831 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class356.field4831 = arg2;
            class394.field5368 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class394.field5368 = class138.field1579 - arg0;
            class356.field4831 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class394.field5368 = arg2;
            class356.field4831 = -arg0 + class250.field3286;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class394.field5368 = -arg2 + class138.field1579;
            class356.field4831 = -arg0 + class250.field3286;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class394.field5368 = -arg0 + class138.field1579;
            class356.field4831 = class250.field3286 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class394.field5368 = arg0;
            class356.field4831 = class250.field3286 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class356.field4831 = arg0;
            class394.field5368 = -arg2 + class138.field1579;
        }
        class394.field5368 &= class442.field6113;
        class356.field4831 &= class210.field2551;
    }

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "(I)V")
    public static void method57(int arg0) {
        if (arg0 == 32575) {
            field135 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
    public class11() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method58(int arg0, String arg1) {
        ++field133;
        int var2 = arg1.length();
        long var3 = 0L;
        int var5 = 79 % ((arg0 - 2) / 43);
        for (int var6 = 0; var2 > var6; ++var6) {
            var3 = (long) arg1.charAt(var6) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field134;
        if (arg0 != -730) {
            return null;
        } else {
            int[][] var3 = super.field2283.method1667(arg1, arg0 ^ 676);
            if (super.field2283.field3451) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class138.field1579; ++var7) {
                    this.method56(arg1, 20036, var7);
                    int[][] var8 = this.method1200(arg0 + 790, class356.field4831, 0);
                    var4[var7] = var8[0][class394.field5368];
                    var5[var7] = var8[1][class394.field5368];
                    var6[var7] = var8[2][class394.field5368];
                }
            }
            return var3;
        }
    }
}
