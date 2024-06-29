import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class276 implements class386 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lop;")
    private class353 field4045 = new class353(256);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lqj;")
    private class238 field4052;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lqj;")
    private class238 field4048;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[Ldp;")
    private class175[] field4055;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4053 = new String[8];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field4043 = -2;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[I")
    public static int[] field4044 = new int[4096];

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field4060;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4044[var0] = class402.method2608(6, var0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)Z", line = 3)
    public final boolean method1756(boolean arg0, int arg1) {
        field4060++;
        class313 var3 = this.method1765(322, arg1);
        if (arg0) {
            this.field4048 = null;
        }
        return var3 != null && var3.method1957(126, this, this.field4048);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FIIIZZ)[I", line = 16)
    public final int[] method1757(float arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        field4047++;
        if (arg4) {
            field4043 = 53;
        }
        return this.method1765(322, arg2).method1959(arg4, arg1, (double) arg0, arg3, this.field4048, this, this.field4055[arg2].field2289, arg5);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZIFI)[I", line = 31)
    public final int[] method1758(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
        if (arg3 == -11047) {
            field4056++;
            return this.method1765(322, arg1).method1953(arg0, this, this.field4055[arg1].field2289, (double) arg4, arg5, this.field4048, (byte) -37);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method1759(boolean arg0) {
        field4054++;
        if (!arg0) {
            class392.field5886.method204((byte) 56);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Ldp;", line = 56)
    public final class175 method1760(int arg0, int arg1) {
        if (arg0 == -19907) {
            field4051++;
            return this.field4055[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBLdr;ZILnr;I)V", line = 68)
    public static final void method1761(int arg0, byte arg1, class213 arg2, boolean arg3, int arg4, class437 arg5, int arg6) {
        field4058++;
        if (arg3) {
            class39.field629.method1499((class345.field5120 - class39.field629.method1088()) / 2, (class274.field4034 - class39.field629.method1091()) / 2);
            class252.field3658.method1499((class345.field5120 - class252.field3658.method1088()) / 2, 18);
        }
        arg2.method1318((byte) 106, -1, ~class126.field1679 == -2 ? class138.field1847 : class311.field4447, arg0, class345.field5120 / 2, class274.field4034 / 2 - 26);
        int var7 = class274.field4034 / 2 - 18;
        arg5.method2057(class345.field5120 / 2 - 152, var7, 304, 34, arg6, 0);
        arg5.method2057(class345.field5120 / 2 - 151, var7 - -1, 302, 32, 0, 0);
        arg5.method2188(class345.field5120 / 2 - 150, var7 + 2, class370.field5501 * 3, 30, arg4, 0);
        int var8 = 126 % ((63 - arg1) / 59);
        arg5.method2188(class345.field5120 / 2 + (class370.field5501 * 3) - 150, var7 + 2, 300 - (class370.field5501 * 3), 30, 0, 0);
        arg2.method1318((byte) 110, -1, class228.field3225, arg0, class345.field5120 / 2, class274.field4034 / 2 + 4);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lnr;I)V", line = 98)
    public static final void method1762(class437 arg0, int arg1) {
        if (arg1 >= -52) {
            method1761(44, (byte) -14, (class213) null, true, 81, (class437) null, 9);
        }
        field4059++;
        if (class284.field4148.method2652(-115) == 0) {
            return;
        }
        if (class265.field3854 == 0 || class265.field3854 == 2) {
            for (class84 var4 = (class84) class284.field4148.method2649(0); var4 != null; var4 = (class84) class284.field4148.method2656(0)) {
                class30.method258(var4.field1174, arg0, 0, class318.field4547, var4.field1170, false, false, var4.field1169, var4.field1172, var4.field1167 ? class100.field1350.field2778 : null, var4.field1176, arg0);
                var4.method2574((byte) 118);
            }
            class176.method1075((byte) -125);
            return;
        }
        if (class138.field1845 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class138.field1845 = class437.method2760(0, -9426, class361.field5285, var2, 0, class364.field5327);
            class45.field673 = class138.field1845.method2179(class85.method527(class208.field2987, (byte) -35, 0, class27.field483), class25.method222(class247.field3446, class27.field483, 0), true);
        }
        for (class84 var3 = (class84) class284.field4148.method2649(0); var3 != null; var3 = (class84) class284.field4148.method2656(0)) {
            class30.method258(var3.field1174, arg0, 0, class45.field673, var3.field1170, false, false, var3.field1169, var3.field1172, var3.field1167 ? class100.field1350.field2778 : null, var3.field1176, class138.field1845);
            var3.method2574((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBZFII)[F", line = 157)
    public final float[] method1763(int arg0, byte arg1, boolean arg2, float arg3, int arg4, int arg5) {
        if (arg1 != -88) {
            method1761(-118, (byte) -66, (class213) null, false, -57, (class437) null, 119);
        }
        field4049++;
        return this.method1765(arg1 ^ 0xFFFFFEEA, arg4).method1955(this.field4048, arg5, arg1 ^ 0xFFFFFFD0, this, arg0, this.field4055[arg4].field2289);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 168)
    public static void method1764(int arg0) {
        field4053 = null;
        field4044 = null;
        if (arg0 != -151) {
            field4053 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lqj;Lqj;Lqj;)V", line = 228)
    public class276(class238 arg0, class238 arg1, class238 arg2) {
        this.field4052 = arg1;
        this.field4048 = arg2;
        class265 var4 = new class265(arg0.method1472(0, 0, 0));
        int var5 = var4.method1685(8104);
        this.field4055 = new class175[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1697(-119) == 1) {
                this.field4055[var6] = new class175();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field4055[var7] != null) {
                this.field4055[var7].field2273 = var4.method1697(56) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field4055[var8] != null) {
                this.field4055[var8].field2274 = var4.method1697(77) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4055[var9] != null) {
                this.field4055[var9].field2281 = var4.method1697(90) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field4055[var10] != null) {
                this.field4055[var10].field2286 = var4.method1697(123) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field4055[var11] != null) {
                this.field4055[var11].field2294 = var4.method1708((byte) 127);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field4055[var12] != null) {
                this.field4055[var12].field2287 = var4.method1708((byte) 127);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field4055[var13] != null) {
                this.field4055[var13].field2293 = var4.method1708((byte) 127);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field4055[var14] != null) {
                this.field4055[var14].field2279 = var4.method1708((byte) 127);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field4055[var15] != null) {
                this.field4055[var15].field2295 = (short) var4.method1685(8104);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field4055[var16] != null) {
                this.field4055[var16].field2282 = var4.method1708((byte) 127);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field4055[var17] != null) {
                this.field4055[var17].field2276 = var4.method1708((byte) 127);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field4055[var18] != null) {
                this.field4055[var18].field2275 = var4.method1697(110) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field4055[var19] != null) {
                this.field4055[var19].field2289 = var4.method1697(-44) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field4055[var20] != null) {
                this.field4055[var20].field2278 = var4.method1708((byte) 127);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field4055[var21] != null) {
                this.field4055[var21].field2277 = var4.method1697(72) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field4055[var22] != null) {
                this.field4055[var22].field2285 = var4.method1697(-87) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field4055[var23] != null) {
                this.field4055[var23].field2292 = var4.method1697(121) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Lwh;", line = 185)
    private final class313 method1765(int arg0, int arg1) {
        field4046++;
        class235 var3 = this.field4045.method2319(-12, (long) arg1);
        if (var3 != null) {
            return (class313) var3;
        }
        if (arg0 != 322) {
            this.field4055 = null;
        }
        byte[] var4 = this.field4052.method1466(arg1, 70);
        if (var4 == null) {
            return null;
        } else {
            class313 var5 = new class313(new class265(var4));
            this.field4045.method2318(var5, false, (long) arg1);
            return var5;
        }
    }
}
