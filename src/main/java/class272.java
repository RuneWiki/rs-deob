import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class272 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public int field3813;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[[B")
    public static byte[][] field3808;

    @OriginalMember(owner = "client!db", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field3810++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZIIILfb;)V", line = 12)
    public static final void method1780(int arg0, boolean arg1, int arg2, int arg3, int arg4, class588 arg5) {
        field3809++;
        if (arg5.field8436 == -1 && arg5.field8435 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class595.field8694.field6544 * arg5.field8437 >> 8;
        if (arg2 > arg5.field8444) {
            var6 += arg2 - arg5.field8444;
        } else if (arg5.field8462 > arg2) {
            var6 += arg5.field8462 - arg2;
        }
        if (arg5.field8463 < arg3) {
            var6 += arg3 - arg5.field8463;
        } else if (arg5.field8452 > arg3) {
            var6 += arg5.field8452 - arg3;
        }
        if (arg5.field8454 == 0 || (var6 - 256) > arg5.field8454 || class595.field8694.field6544 == 0 || arg5.field8456 != arg4) {
            if (arg5.field8455 != null) {
                class44.field469.method934(arg5.field8455);
                arg5.field8443 = null;
                arg5.field8447 = null;
                arg5.field8455 = null;
            }
            if (arg5.field8457 != null) {
                class44.field469.method934(arg5.field8457);
                arg5.field8451 = null;
                arg5.field8448 = null;
                arg5.field8457 = null;
            }
            return;
        }
        if (!arg1) {
            field3808 = null;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg5.field8454 - var6) * var7 / arg5.field8454;
        if (arg5.field8455 != null) {
            arg5.field8455.method1086(var8);
        } else if (arg5.field8436 >= 0) {
            if (arg5.field8461) {
                if (arg5.field8447 == null) {
                    arg5.field8447 = class654.method3725(class110.field1356, arg5.field8436);
                }
                if (arg5.field8447 != null) {
                    if (arg5.field8443 == null) {
                        arg5.field8443 = arg5.field8447.method3733(new int[] { 22050 });
                    }
                    if (arg5.field8443 != null) {
                        class189 var9 = class189.method1089(arg5.field8443, 100, var8);
                        var9.method1112(-1);
                        class44.field469.method936(var9);
                        arg5.field8455 = var9;
                    }
                }
            } else {
                class205 var10 = class205.method1317(class573.field8275, arg5.field8436, 0);
                if (var10 != null) {
                    class534 var11 = var10.method1316().method3117(class94.field1116);
                    class189 var12 = class189.method1089(var11, 100, var8);
                    var12.method1112(-1);
                    class44.field469.method936(var12);
                    arg5.field8455 = var12;
                }
            }
        }
        if (arg5.field8457 != null) {
            arg5.field8457.method1086(var8);
            if (!arg5.field8457.method2109(11574)) {
                arg5.field8448 = null;
                arg5.field8457 = null;
                arg5.field8451 = null;
            }
        } else if (arg5.field8435 != null && (arg5.field8453 -= arg0) <= 0) {
            if (!arg5.field8449) {
                int var13 = (int) ((double) arg5.field8435.length * Math.random());
                class205 var14 = class205.method1317(class573.field8275, arg5.field8435[var13], 0);
                if (var14 != null) {
                    class534 var15 = var14.method1316().method3117(class94.field1116);
                    class189 var16 = class189.method1089(var15, 100, var8);
                    var16.method1112(0);
                    class44.field469.method936(var16);
                    arg5.field8453 = arg5.field8439 + (int) (Math.random() * (double) (arg5.field8459 - arg5.field8439));
                    arg5.field8457 = var16;
                    return;
                }
                return;
            }
            if (arg5.field8451 == null) {
                int var17 = (int) ((double) arg5.field8435.length * Math.random());
                arg5.field8451 = class654.method3725(class110.field1356, arg5.field8435[var17]);
            }
            if (arg5.field8451 != null) {
                if (arg5.field8448 == null) {
                    arg5.field8448 = arg5.field8451.method3733(new int[] { 22050 });
                }
                if (arg5.field8448 != null) {
                    class189 var18 = class189.method1089(arg5.field8448, 100, var8);
                    var18.method1112(0);
                    class44.field469.method936(var18);
                    arg5.field8453 = (int) (Math.random() * (double) (arg5.field8459 - arg5.field8439)) + arg5.field8439;
                    arg5.field8457 = var18;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 217)
    public static void method1781(int arg0) {
        if (arg0 != 0) {
            method1781(7);
        }
        field3808 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIII)V", line = 227)
    public class272(int arg0, int arg1, int arg2, int arg3) {
        this.field3807 = arg1;
        this.field3812 = arg0;
        this.field3811 = arg3;
        this.field3813 = arg2;
    }
}
