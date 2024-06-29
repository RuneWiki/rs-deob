import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class73 extends class383 {

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "Lkg;")
    public static class179 field939 = new class179(40, -1);

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZII)V")
    public static final void method634(boolean arg0, int arg1, int arg2) {
        field946++;
        if (arg1 == arg2) {
            class33.field416 = class38.method283((byte) -19, class407.field5817.field3621 * 2, class219.field2794, class8.field71, arg1, class79.field1024);
        } else {
            if (arg0) {
                class33.field416 = class38.method283((byte) -19, 0, class219.field2794, class8.field71, 0, class79.field1024);
                class33.field416.method325(0);
                class297 var3 = class21.method177(0, (byte) 100, class511.field7421, class323.field4103);
                class316 var4 = class33.field416.method300(var3, class311.method1819(class448.field6413, class323.field4103, 0), true);
                class151.method990(var4, (byte) 42, class101.field1225.method1936(-26539, class11.field177), true);
                class33.field416.method288();
                class160.method1032((byte) 75);
                class33.field416.method275((byte) -126);
            }
            try {
                class33.field416 = class38.method283((byte) -19, class407.field5817.field3621 * 2, class219.field2794, class8.field71, arg1, class79.field1024);
                if (class33.field416.method316()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class53 var6;
                    if (var5) {
                        var6 = class33.field416.method347(146800640);
                    } else {
                        var6 = class33.field416.method347(104857600);
                    }
                    class33.field416.method276(var6);
                }
            } catch (Throwable var8) {
                class33.field416 = class38.method283((byte) -19, 0, class219.field2794, class8.field71, 0, class79.field1024);
                arg1 = 0;
            }
        }
        class377.field4959 = arg1;
        class480.method2928(false);
        if (!class33.field416.method363()) {
            class517.field7489 = 1;
        }
        class33.field416.method336(class517.field7489);
        class33.field416.method279(0);
        class33.field416.method305(8);
        class208.field2695 = class33.field416.method371();
        class293.field3753 = class33.field416.method371();
        class109.method797(arg2);
        class33.field416.method346(!class407.field5817.field3634);
        if (class33.field416.method293()) {
            class176.method1131(class407.field5817.field3640, -62);
        }
        class162.method1041(class33.field416, class440.field6307 >> 3, (byte) 2, class452.field6526 >> 3);
        class38.method340(-21936);
        class236.field3006 = false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public static void method635(int arg0) {
        field939 = null;
        if (arg0 != 31996) {
            field939 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V")
    public static final void method636(boolean arg0) {
        class498.field7214.method2024(false);
        field945++;
        class414.field5893.method1396(-93);
        if (arg0) {
            class291.field3704.method1396(-62);
        }
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I")
    public final int method637(int arg0) {
        field941++;
        if (arg0 != 1942881) {
            this.field942 = 8;
        }
        return (this.field942 & 0x1DA561) >> 18;
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)[Ldq;")
    public static final class493[] method638(int arg0) {
        if (arg0 == 29317) {
            field947++;
            return new class493[] { class33.field412, class24.field348, class473.field6850, class513.field7441, class296.field3804, class340.field4275, class500.field7234, class63.field819, class411.field5862, class364.field4733, class402.field5726, class162.field2061, class54.field715, class534.field7858, class97.field1182, class288.field3680, class145.field1857, class140.field1799, class288.field3676, class106.field1345, class350.field4504, class421.field5971, class187.field2447, class64.field829, class252.field3217, class383.field5045, class180.field2375, class119.field1602, client.field2573, class128.field1704, class346.field4451, class523.field7628, class231.field2951, class523.field7693, class503.field7265, class479.field7011, class337.field4241, class197.field2552, class353.field4540, class420.field5949, class490.field7119, class205.field2674, class368.field4769, class314.field4008, class84.field1054, class328.field4141, client.field2566, class129.field1709, class385.field5062, class197.field2551, class76.field983, class228.field2919, class381.field5024, class405.field5792, class264.field3329, class230.field2941, class368.field4768, class343.field4368, class253.field3225, class283.field3598, class261.field3289, class354.field4552, class372.field4833, class465.field6709, class446.field6397, class450.field6442, class28.field394, class240.field3080, class52.field698, class251.field3211, class80.field1028, class33.field421, class11.field203, class48.field614, class101.field1220, class233.field2975, class181.field2391, class323.field4101, client.field2574, class447.field6398, class160.field2044, class364.field4737, class273.field3424, class102.field1269, class227.field2892, class447.field6399, class52.field697, class438.field6288, class11.field181, class143.field1841, class351.field4506, class46.field555, class109.field1474, class115.field1549, class204.field2649, class196.field2534, class219.field2791, class418.field5936, class517.field7486, class159.field2020, class506.field7286, class291.field3711, class92.field1123, class141.field1830, class320.field4061, class490.field7136, class442.field6352, class282.field3585, class226.field2876, class179.field2363, class135.field1744 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[FIIIIB)V")
    public static final void method639(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field943++;
        if (arg4 > 0 && !class351.method2014(10, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class351.method2014(10, arg0)) {
            int var7 = class303.method1789(1, arg2);
            int var8 = 0;
            int var9 = arg0 > arg4 ? arg4 : arg0;
            if (arg6 < 50) {
                method636(true);
            }
            int var10 = arg4 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg1;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg3, arg4, arg0, 0, arg2, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg4 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg4 = var10;
                arg0 = var11;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Z")
    public final boolean method640(byte arg0) {
        if (arg0 >= -125) {
            return true;
        } else {
            field935++;
            return ((this.field942 & 0x25E503) >> 21) != 0;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(II)V")
    public class73(int arg0, int arg1) {
        this.field937 = arg1;
        this.field942 = arg0;
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)Z")
    public final boolean method641(int arg0) {
        if (arg0 == 614752694) {
            field934++;
            return (this.field942 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Z")
    public final boolean method642(int arg0, int arg1) {
        field938++;
        if (arg0 == 1) {
            return (this.field942 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "(I)Z")
    public final boolean method643(int arg0) {
        if (arg0 == 29597) {
            field944++;
            return (this.field942 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)I")
    public final int method644(byte arg0) {
        field940++;
        if (arg0 != 51) {
            this.field937 = 102;
        }
        return class520.method3091(8841, this.field942);
    }
}
