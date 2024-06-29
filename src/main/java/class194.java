import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class194 extends class160 {

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    private final int field3198;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    private final int field3202;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    private final int field3204;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    private final int field3197;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    private final int field3192;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    private final int field3187;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    private final int field3190;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    private final int field3193;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "Lve;")
    public static class255 field3207 = class87.method607(121, "compass");

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "[Lvi;")
    public static class5[] field3200;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 4)
    public class194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3198 = arg2;
        this.field3202 = arg5;
        this.field3204 = arg3;
        this.field3197 = arg7;
        this.field3192 = arg6;
        this.field3187 = arg0;
        this.field3190 = arg1;
        this.field3193 = arg4;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)V", line = 30)
    public static final void method1385(boolean arg0, int arg1) {
        field3196++;
        if (arg0 == class33.field537) {
            return;
        }
        if (arg1 != -28352) {
            field3205 = -81;
        }
        class33.field537 = arg0;
        class58.method354(284750128);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 45)
    public static final void method1386(byte arg0) {
        field3191++;
        if (arg0 != 4) {
            return;
        }
        for (class130 var1 = (class130) class218.field3692.method1471((byte) -115); var1 != null; var1 = (class130) class218.field3692.method1475((byte) 83)) {
            class128 var2 = var1.field2145;
            if (client.field4039 != var2.field2103 || var2.field2109) {
                var1.method1502((byte) -82);
            } else if (class277.field4768 >= var2.field2106) {
                var2.method949(41, class122.field2036);
                if (var2.field2109) {
                    var1.method1502((byte) -82);
                } else {
                    class112.method856(var2.field2103, var2.field2112, var2.field2118, var2.field2116, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILof;IIII)Lof;", line = 83)
    public static final class227 method1387(int arg0, int arg1, class227 arg2, int arg3, int arg4, int arg5, int arg6) {
        field3203++;
        long var7 = (long) arg4;
        class227 var9 = (class227) class304.field5202.method558(var7, true);
        if (var9 == null) {
            class200 var10 = class200.method1431(class97.field1675, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1440(64, 768, -50, -10, -50);
            class304.field5202.method555(var9, var7, 0);
        }
        int var11 = arg2.method1363();
        int var12 = arg2.method1339();
        int var13 = arg2.method1345();
        int var14 = arg2.method1338();
        class227 var15 = var9.method1360(true, true);
        if (arg5 != 0) {
            var15.method1349(arg5);
        }
        if (class281.field4827) {
            class193 var16 = (class193) var15;
            if (class113.method861((byte) -84, arg0 + var11, arg3 + var13, client.field4039) != arg6 || class113.method861((byte) 125, arg0 + var12, arg3 + var14, client.field4039) != arg6) {
                for (int var17 = 0; var17 < var16.field3137; var17++) {
                    var16.field3134[var17] += class113.method861((byte) 127, var16.field3136[var17] + arg0, var16.field3161[var17] + arg3, client.field4039) - arg6;
                }
                var16.field3131.field523 = false;
                var16.field3165.field2907 = false;
            }
        } else {
            class267 var18 = (class267) var15;
            if (arg6 != class113.method861((byte) 121, arg0 + var11, arg3 + var13, client.field4039) || class113.method861((byte) 127, arg0 + var12, arg3 + var14, client.field4039) != arg6) {
                for (int var19 = 0; var19 < var18.field4523; var19++) {
                    var18.field4534[var19] += class113.method861((byte) -40, var18.field4532[var19] + arg0, var18.field4546[var19] + arg3, client.field4039) - arg6;
                }
                var18.field4529 = false;
            }
        }
        return arg1 == -50 ? var15 : (class227) null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V", line = 172)
    public final void method163(byte arg0, int arg1, int arg2) {
        int var4 = this.field3187 * arg2 >> 12;
        int var5 = 88 % ((28 - arg0) / 63);
        field3195++;
        int var6 = this.field3190 * arg1 >> 12;
        int var7 = this.field3204 * arg1 >> 12;
        int var8 = this.field3198 * arg2 >> 12;
        int var9 = this.field3193 * arg2 >> 12;
        int var10 = this.field3197 * arg1 >> 12;
        int var11 = this.field3202 * arg1 >> 12;
        int var12 = this.field3192 * arg2 >> 12;
        class293.method2073(-4630, var4, var11, this.field2693, var9, var6, var8, var10, var7, var12);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IIIII)V", line = 199)
    public static final void method1388(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -1) {
            method1386((byte) -88);
        }
        field3206++;
        if (class125.field2082 <= arg3 && arg3 <= class30.field473) {
            int var5 = class198.method1425(class11.field156, false, arg2, class261.field4427);
            int var6 = class198.method1425(class11.field156, false, arg0, class261.field4427);
            class244.method1691(arg4, var6, false, var5, arg3);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I", line = 216)
    public static final int method1389(int arg0, int arg1) {
        field3201++;
        if (arg1 != 0) {
            method1390((byte) 56);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V", line = 228)
    public final void method160(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field3188++;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V", line = 246)
    public static void method1390(byte arg0) {
        field3200 = null;
        if (arg0 > -64) {
            field3200 = (class5[]) null;
        }
        field3207 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILrg;I)Lud;", line = 258)
    public static final class269 method1391(int arg0, int arg1, class88 arg2, int arg3) {
        if (arg0 >= -111) {
            return (class269) null;
        } else {
            field3189++;
            return class96.method763((byte) 109, arg1, arg3, arg2) ? class280.method1946(-104) : null;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(III)V", line = 280)
    public final void method158(int arg0, int arg1, int arg2) {
        field3199++;
        if (arg0 != -30729) {
            field3207 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lpb;I)Lve;", line = 290)
    public static final class255 method1392(class70 arg0, int arg1) {
        field3194++;
        return arg1 == 410623404 ? class101.method785((byte) 30, arg0, 32767) : (class255) null;
    }
}
