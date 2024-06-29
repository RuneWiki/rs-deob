import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class23 extends class376 {

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field302 = -1;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "[I")
    public static int[] field304 = new int[14];

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Ljava/lang/String;")
    public static String field306 = " has logged out.";

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field309 = 2;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Lb;")
    public static class183 field311;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public static void method150(byte arg0) {
        int var1 = -56 / ((-arg0 - 29) / 60);
        field304 = null;
        field306 = null;
        field311 = null;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static final void method151(int arg0) {
        if (arg0 > -72) {
            method151(62);
        }
        field301++;
        if (class408.field5920.method1759()) {
            class94.method640(-115);
            class408.field5920.method1772(class41.field617);
            class210.method1362(17612);
        } else {
            class99.method702(-17666, class16.field205);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Laa;I[Lie;IZI[B)V")
    public static final void method152(class281 arg0, int arg1, class4[] arg2, int arg3, boolean arg4, int arg5, byte[] arg6) {
        field308++;
        if (arg3 != 14) {
            method151(31);
        }
        class371 var7 = new class371(arg6);
        int var8 = -1;
        while (true) {
            int var9 = var7.method2398(114);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2433(-46);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = (var10 & 0xFD8) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2429(arg3 - 14);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = var12 + arg1;
                if (var18 > 0 && var19 > 0 && var18 < class432.field6220 - 1 && class267.field3646 - 1 > var19) {
                    class4 var20 = null;
                    if (!arg4) {
                        int var21 = var14;
                        if ((class221.field2910[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg2[var21];
                        }
                    }
                    class196.method1311(var20, var17, -1, true, arg0, var19, var14, var18, arg4, var16, -3, var14, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public static final void method153(int arg0, int arg1) {
        field313++;
        class190 var2 = class233.field3157;
        synchronized (class233.field3157) {
            class233.field3157.method1254(arg0, -12);
        }
        class190 var3 = class260.field3555;
        synchronized (class260.field3555) {
            class260.field3555.method1254(arg0, -92);
        }
        if (arg1 != -1) {
            field305 = -128;
        }
        class190 var4 = class184.field2576;
        synchronized (class184.field2576) {
            class184.field2576.method1254(arg0, 122);
        }
        class190 var5 = class326.field4447;
        synchronized (class326.field4447) {
            class326.field4447.method1254(arg0, arg1 + 126);
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Z")
    public static final boolean method154(int arg0) {
        field315++;
        if (arg0 != 3459) {
            return true;
        }
        if (class318.field4370) {
            try {
                if ((Boolean) class274.method1687(class204.field2772.field4888, -5778, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
    public static final void method155(int arg0, int arg1) {
        field307++;
        class399 var2 = class269.method1655(10, arg1, -68);
        var2.method2582(0);
        if (arg0 > -35) {
            field304 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class23() {
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
    public class23(int arg0) {
        this.field316 = arg0;
    }
}
