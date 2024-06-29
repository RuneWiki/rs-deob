import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class132 extends class23 {

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    private int field2478 = 0;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "I")
    private int field2477 = 1;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
    private int field2480 = 0;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "Li;")
    public static class88 field2464 = class208.method1425(105, "<col=00ff80>");

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "Li;")
    private static class88 field2469 = class208.method1425(105, "M");

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "Li;")
    public static class88 field2466 = field2469;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "Li;")
    public static class88 field2471 = field2469;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "[I")
    public static int[] field2473 = new int[100];

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "Li;")
    private static class88 field2479 = class208.method1425(105, "Error loading your profile)3");

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "Li;")
    public static class88 field2472 = field2479;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "Li;")
    private static class88 field2476 = class208.method1425(105, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "Z")
    public static boolean field2467 = false;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "Li;")
    public static class88 field2468 = field2476;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class132() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field2477 = arg0.method347(26119);
                }
            } else {
                this.field2480 = arg0.method347(26119);
            }
        } else {
            this.field2478 = arg0.method347(arg1 ^ -26118);
        }
        if (arg1 != -3) {
            method890((byte) -44);
        }
        ++field2475;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIII)V")
    public static final void method889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -31025) {
            field2466 = null;
        }
        ++field2481;
        if (~class67.field1207 >= ~arg6 && arg3 <= class12.field183 && arg2 >= class49.field919 && ~class18.field279 <= ~arg4) {
            if (arg0 != 1) {
                class115.method788(arg3, arg5, arg0, arg4, arg2, false, arg6);
            } else {
                class207.method1422(arg6, arg3, (byte) -81, arg4, arg2, arg5);
            }
        } else if (arg0 != 1) {
            class21.method101(arg4, arg0, arg6, arg2, arg3, arg5, (byte) -120);
        } else {
            class150.method1030(arg4, arg5, arg6, true, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (arg0 != -69) {
            field2476 = null;
        }
        class108.method742(arg0 + -10729);
        ++field2465;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        if (arg1 < 19) {
            return null;
        } else {
            int[] var3 = super.field379.method1080(false, arg0);
            if (super.field379.field3100) {
                int var4 = class111.field2023[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class70.field1276; ++var6) {
                    int var7 = class22.field351[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (~this.field2478 == -1) {
                        var9 = (-var4 + var7) * this.field2477;
                    } else {
                        int var10 = var5 * var5 + var8 * var8 >> 12;
                        int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                        var9 = (int) ((double) (this.field2477 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (-4096 & var9);
                    if (~this.field2480 != -1) {
                        if (this.field2480 == 2) {
                            var12 -= 2048;
                            if (var12 < 0) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class92.field1735[(4080 & var12) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            ++field2470;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
    public static void method890(byte arg0) {
        field2476 = null;
        field2472 = null;
        int var1 = -27 / ((arg0 - 86) / 37);
        field2473 = null;
        field2469 = null;
        field2479 = null;
        field2471 = null;
        field2468 = null;
        field2466 = null;
        field2464 = null;
    }
}
