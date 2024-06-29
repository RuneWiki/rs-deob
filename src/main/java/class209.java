import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class209 extends class115 {

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static volatile int field3241 = -1;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Z")
    public static boolean field3246 = false;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3251 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Ljava/lang/String;")
    public String field3240;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Ljava/lang/String;")
    public String field3244;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
    public static void method1396(boolean arg0) {
        if (arg0) {
            field3251 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)I")
    public static final int method1397(int arg0, byte arg1) {
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 != 124) {
            field3251 = null;
        }
        int var3 = arg0 * 6 + -61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        ++field3250;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZIII)V")
    public static final void method1398(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field3254;
        if (!arg2) {
            field3248 = 82;
        }
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg3 * arg3;
        int var9 = arg4 * arg4;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg4 << 1;
        int var13 = (-var12 + 1) * var8 + var11;
        int var14 = var8 << 2;
        int var15 = -((var12 - 1) * var10) + var9;
        int var16 = var9 << 2;
        int var17 = ((arg4 << 1) + -3) * var10;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = (arg4 - 1) * var14;
        int var20 = (var6 + 1) * var16;
        if (~class271.field4289 >= ~arg0 && ~arg0 >= ~class113.field1779) {
            int var21 = class68.method533(class75.field1265, class261.field4025, arg5 - -arg3, (byte) 39);
            int var22 = class68.method533(class75.field1265, class261.field4025, -arg3 + arg5, (byte) 58);
            class263.method1788(var22, -18732, arg1, class156.field2379[arg0], var21);
        }
        while (var7 > 0) {
            if (~var13 > -1) {
                while (var13 < 0) {
                    var15 += var20;
                    var13 += var18;
                    var18 += var16;
                    var20 += var16;
                    ++var6;
                }
            }
            --var7;
            if (var15 < 0) {
                var15 += var20;
                var20 += var16;
                var13 += var18;
                ++var6;
                var18 += var16;
            }
            var13 += -var19;
            var19 -= var14;
            var15 += -var17;
            var17 -= var14;
            int var23 = -var7 + arg0;
            int var24 = arg0 + var7;
            if (~var24 <= ~class271.field4289 && ~var23 >= ~class113.field1779) {
                int var25 = class68.method533(class75.field1265, class261.field4025, arg5 + var6, (byte) 109);
                int var26 = class68.method533(class75.field1265, class261.field4025, arg5 - var6, (byte) 108);
                if (var23 >= class271.field4289) {
                    class263.method1788(var26, -18732, arg1, class156.field2379[var23], var25);
                }
                if (class113.field1779 >= var24) {
                    class263.method1788(var26, -18732, arg1, class156.field2379[var24], var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)La;")
    public static final class49 method1399(int arg0) {
        ++field3239;
        byte[] var1 = class289.field4554[arg0];
        int var2 = class270.field4281[0] * class107.field1717[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            var3[var4] = class35.field560[class3.method48(var1[var4], 255)];
        }
        class49 var5 = new class49(class205.field3187, class174.field2581, class184.field2764[0], class239.field3698[0], class270.field4281[0], class107.field1717[0], var3);
        class239.method1619(65306);
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Lra;")
    public final class238 method1400(int arg0) {
        ++field3247;
        return arg0 != 1 ? null : class66.field1044[super.field1785];
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public static final void method1401(int arg0, int arg1, int arg2) {
        ++field3249;
        class241 var3 = class73.method575(arg0, -117);
        int var4 = var3.field3719;
        int var5 = var3.field3721;
        int var6 = var3.field3720;
        int var7 = class196.field3090[-var5 + var6];
        if (~arg2 > arg1 || ~arg2 < ~var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class191.method1287((byte) -104, class289.field4560[var4] & ~var8 | arg2 << var5 & var8, var4);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lfg;I)V")
    public static final void method1402(class12 arg0, int arg1) {
        ++field3243;
        arg0.field215 = false;
        if (arg0.field217 != null) {
            arg0.field217.field1744 = 0;
        }
        if (arg1 != 0) {
            method1398(78, -99, true, -76, 77, 36);
        }
        for (class12 var2 = arg0.method123(); var2 != null; var2 = arg0.method125()) {
            method1402(var2, 0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
    public static final void method1403(int arg0, int arg1) {
        ++field3252;
        class295 var2 = class250.method1673(-128, 1, arg1);
        int var3 = -62 / ((arg0 - -3) / 33);
        var2.method1979(-8205);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)J")
    public static final long method1404(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        return var3 != null && var3.field363 != null ? var3.field363.field2686 : 0L;
    }
}
