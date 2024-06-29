import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class325 extends class141 {

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[B")
    public byte[] field5577;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field5576 = -1;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field5580 = 0;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
    public static int[] field5581 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field5574 = 0;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lhi;")
    public static class82 field5579 = class95.method664((byte) -63, ")1a2)1m");

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Z")
    public static boolean field5575 = false;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Lag;")
    public static class301 field5584;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "[[[I")
    public static int[][][] field5582;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BILsa;II)V", line = 19)
    public static final void method2237(byte arg0, int arg1, class81 arg2, int arg3, int arg4) {
        field5583++;
        if (class168.field2932 == arg2 || class309.field5262 >= 400 || arg0 >= -89) {
            return;
        }
        class82 var10;
        if (arg2.field1416 == 0) {
            boolean var5 = true;
            if (class168.field2932.field1374 != -1 && arg2.field1374 != -1) {
                int var6 = arg2.field1374 <= class168.field2932.field1374 ? arg2.field1374 : class168.field2932.field1374;
                int var7 = class168.field2932.field1407 <= arg2.field1407 ? arg2.field1407 : class168.field2932.field1407;
                int var8 = var7 * 10 / 100 + var6 + 5;
                int var9 = class168.field2932.field1407 - arg2.field1407;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            if (arg2.field1389 > arg2.field1407) {
                var10 = class29.method182(-6039, new class82[] { arg2.method517(false), var5 ? class61.method400(arg2.field1407, 10874, class168.field2932.field1407) : class281.field4718, class72.field1108, class281.field4716, class327.method2240((byte) -74, arg2.field1407), class218.field3785, class327.method2240((byte) -74, arg2.field1389 - arg2.field1407), class28.field385 });
            } else {
                var10 = class29.method182(-6039, new class82[] { arg2.method517(false), var5 ? class61.method400(arg2.field1407, 10874, class168.field2932.field1407) : class281.field4718, class72.field1108, class281.field4716, class327.method2240((byte) -74, arg2.field1407), class28.field385 });
            }
        } else {
            var10 = class29.method182(-6039, new class82[] { arg2.method517(false), class72.field1108, class28.field386, class327.method2240((byte) -74, arg2.field1416), class28.field385 });
        }
        if (class271.field4578 == 1) {
            class249.field4295++;
            class47.method341(2300, (long) arg1, (short) 6, arg4, class29.method182(-6039, new class82[] { class321.field5537, class305.field5172, var10 }), arg3, class19.field238);
        } else if (!class256.field4406) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class191.field3191[var11] != null) {
                    class220.field3807++;
                    boolean var12 = false;
                    short var13 = 0;
                    if (class22.field307 == 0 && class191.field3191[var11].method543(class198.field3396, (byte) -113)) {
                        if (class168.field2932.field1407 < arg2.field1407) {
                            var13 = 2000;
                        }
                        if (class168.field2932.field1403 != 0 && arg2.field1403 != 0) {
                            if (class168.field2932.field1403 == arg2.field1403) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class200.field3442[var11]) {
                        var13 = 2000;
                    }
                    short var14 = class250.field4314[var11];
                    short var15 = (short) (var13 + var14);
                    class47.method341(2300, (long) arg1, var15, arg4, class29.method182(-6039, new class82[] { class281.field4718, var10 }), arg3, class191.field3191[var11]);
                }
            }
        } else if ((class193.field3272 & 0x8) == 8) {
            class47.method341(2300, (long) arg1, (short) 25, arg4, class29.method182(-6039, new class82[] { class48.field800, class305.field5172, var10 }), arg3, class119.field2105);
            class189.field3158++;
        }
        for (int var16 = 0; var16 < class309.field5262; var16++) {
            if (class135.field2333[var16] == 3) {
                class157.field2727[var16] = class29.method182(-6039, new class82[] { class281.field4718, var10 });
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 147)
    public static void method2238(byte arg0) {
        field5579 = null;
        field5584 = null;
        if (arg0 != 78) {
            field5574 = -49;
        }
        field5582 = (int[][][]) null;
        field5581 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V", line = 165)
    public class325(byte[] arg0) {
        this.field5577 = arg0;
    }
}
