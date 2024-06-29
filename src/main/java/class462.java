import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class462 extends class555 {

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "Lhga;")
    public class158 field6582 = new class158();

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "Lak;")
    public class322 field6587 = new class322();

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "Ldp;")
    private class3 field6586;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "Z")
    public static boolean field6584 = false;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!iaa", name = "v", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!iaa", name = "w", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "[Llk;")
    public static class545[] field6574;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "()I")
    public final int method193() {
        field6578++;
        return 0;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "([III)V")
    public final void method224(int[] arg0, int arg1, int arg2) {
        field6579++;
        this.field6587.method224(arg0, arg1, arg2);
        for (class348 var4 = (class348) this.field6582.method1224(-2); var4 != null; var4 = (class348) this.field6582.method1232(-2)) {
            if (!this.field6586.method207(128, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field5189 >= var6) {
                        this.method2767(true, var6, var4, arg0, var5, var5 + var6);
                        var4.field5189 -= var6;
                        break;
                    }
                    this.method2767(true, var4.field5189, var4, arg0, var5, var5 + var6);
                    var6 -= var4.field5189;
                    var5 += var4.field5189;
                } while (!this.field6586.method208(var4, var5, var6, arg0, 122));
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public final void method204(int arg0) {
        this.field6587.method204(arg0);
        field6577++;
        for (class348 var2 = (class348) this.field6582.method1224(-2); var2 != null; var2 = (class348) this.field6582.method1232(-2)) {
            if (!this.field6586.method207(128, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field5189 >= var3) {
                        this.method2766(var2, var3, -10076);
                        var2.field5189 -= var3;
                        break;
                    }
                    this.method2766(var2, var2.field5189, -10076);
                    var3 -= var2.field5189;
                } while (!this.field6586.method208(var2, 0, var3, null, -78));
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2762(int arg0, int arg1, byte arg2) {
        int var3 = 30 % ((arg2 + 89) / 37);
        field6573++;
        return class183.method1340(540800, arg0, arg1) || class629.method3599(arg1, -91, arg0);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
    public static final void method2763(int arg0, int arg1) {
        field6572++;
        class37.field1050 = 2;
        class163.field2735 = arg0;
        long var2 = 0L;
        if (class687.field9733 == null) {
            class705.method3936(35, false);
            return;
        }
        class61 var4 = new class61(class234.method1575(class358.method2294((byte) -121, class687.field9733), arg1 ^ 0xFFFFF19B));
        long var5 = var4.method742(23386);
        class350.field5249 = var4.method742(arg1 ^ 0x553F);
        class210.method1471(true, class424.method2586(var5, (byte) -42), (byte) -128, "");
        if (arg1 != 3685) {
            field6584 = true;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "(I)V")
    public static final void method2764(int arg0) {
        field6576++;
        for (class616 var1 = (class616) class81.field1588.method1224(-2); var1 != null; var1 = (class616) class81.field1588.method1232(-2)) {
            if (var1.field8951 > 0) {
                var1.field8951--;
            }
            if (var1.field8951 != 0) {
                if (var1.field8947 > 0) {
                    var1.field8947--;
                }
                if (var1.field8947 == 0 && var1.field8953 >= 1 && var1.field8949 >= 1 && var1.field8953 <= (class675.field9604 - 2) && (class218.field3316 - 2) >= var1.field8949 && (var1.field8942 < 0 || class693.method3880(10, var1.field8955, var1.field8942))) {
                    class445.method2678(var1.field8944, -2, -1, var1.field8953, var1.field8954, var1.field8942, var1.field8949, var1.field8955, var1.field8952);
                    var1.field8947 = -1;
                    if (var1.field8950 == var1.field8942 && var1.field8950 == -1) {
                        var1.method2588(300);
                    } else if (var1.field8950 == var1.field8942 && var1.field8954 == var1.field8946 && var1.field8955 == var1.field8948) {
                        var1.method2588(300);
                    }
                }
            } else if (var1.field8950 < 0 || class693.method3880(arg0 + 24884, var1.field8948, var1.field8950)) {
                class445.method2678(var1.field8944, arg0 + 24872, -1, var1.field8953, var1.field8946, var1.field8950, var1.field8949, var1.field8948, var1.field8952);
                var1.method2588(300);
            }
        }
        if (arg0 != -24874) {
            method2763(-35, 84);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)V")
    public static void method2765(boolean arg0) {
        if (arg0) {
            method2765(false);
        }
        field6574 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "()Loea;")
    public final class555 method227() {
        field6583++;
        class348 var1;
        do {
            var1 = (class348) this.field6582.method1232(-2);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5177 == null);
        return var1.field5177;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lat;II)V")
    private final void method2766(class348 arg0, int arg1, int arg2) {
        if (arg2 != -10076) {
            this.method224(null, -102, -109);
        }
        if ((this.field6586.field441[arg0.field5181] & 0x4) != 0 && arg0.field5173 < 0) {
            int var4 = this.field6586.field392[arg0.field5181] / class195.field3068;
            int var5 = (var4 + 1048575 - arg0.field5186) / var4;
            arg0.field5186 = arg1 * var4 + arg0.field5186 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field6586.field443[arg0.field5181] == 0) {
                    arg0.field5177 = class245.method1628(arg0.field5174, arg0.field5177.method1638(), arg0.field5177.method1661(), arg0.field5177.method1651());
                } else {
                    arg0.field5177 = class245.method1628(arg0.field5174, arg0.field5177.method1638(), 0, arg0.field5177.method1651());
                    this.field6586.method212((byte) -15, arg0.field5182.field4144[arg0.field5171] < 0, arg0);
                }
                if (arg0.field5182.field4144[arg0.field5171] < 0) {
                    arg0.field5177.method1653(-1);
                }
                arg1 = arg0.field5186 / var4;
            }
        }
        field6575++;
        arg0.field5177.method204(arg1);
    }

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "()Loea;")
    public final class555 method233() {
        field6585++;
        class348 var1 = (class348) this.field6582.method1224(-2);
        if (var1 == null) {
            return null;
        } else if (var1.field5177 == null) {
            return this.method227();
        } else {
            return var1.field5177;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZILat;[III)V")
    private final void method2767(boolean arg0, int arg1, class348 arg2, int[] arg3, int arg4, int arg5) {
        field6580++;
        if ((this.field6586.field441[arg2.field5181] & 0x4) != 0 && arg2.field5173 < 0) {
            int var7 = this.field6586.field392[arg2.field5181] / class195.field3068;
            while (true) {
                int var8 = (1048575 - (arg2.field5186 - var7)) / var7;
                if (var8 > arg1) {
                    arg2.field5186 += arg1 * var7;
                    break;
                }
                arg2.field5177.method224(arg3, arg4, var8);
                arg1 -= var8;
                arg2.field5186 += var7 * var8 - 1048576;
                arg4 += var8;
                int var9 = class195.field3068 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class245 var11 = arg2.field5177;
                if (this.field6586.field443[arg2.field5181] == 0) {
                    arg2.field5177 = class245.method1628(arg2.field5174, var11.method1638(), var11.method1661(), var11.method1651());
                } else {
                    arg2.field5177 = class245.method1628(arg2.field5174, var11.method1638(), 0, var11.method1651());
                    this.field6586.method212((byte) -71, arg2.field5182.field4144[arg2.field5171] < 0, arg2);
                    arg2.field5177.method1658(var9, var11.method1661());
                }
                if (arg2.field5182.field4144[arg2.field5171] < 0) {
                    arg2.field5177.method1653(-1);
                }
                var11.method1631(var9);
                var11.method224(arg3, arg4, arg5 - arg4);
                if (var11.method1648()) {
                    this.field6587.method2067(var11);
                }
            }
        }
        if (!arg0) {
            this.field6582 = null;
        }
        arg2.field5177.method224(arg3, arg4, arg1);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lqh;II)V")
    public static final void method2768(class61 arg0, int arg1, int arg2) {
        int var3 = 43 / ((arg1 - 22) / 53);
        field6581++;
        if (class109.field1916 == null) {
            return;
        }
        try {
            class109.field1916.method2260((byte) -118, 0L);
            class109.field1916.method2259(arg0.field1397, arg2, 24, false);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ldp;)V")
    public class462(class3 arg0) {
        this.field6586 = arg0;
    }
}
