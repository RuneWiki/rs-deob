import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class450 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2675(String arg0, byte arg1) {
        field6464++;
        if (arg0 == null) {
            return;
        }
        if (!(class525.field7289 < 200 || class254.field3755) || class525.field7289 >= 200) {
            class743.method4082(arg1 ^ 0x1A, 4, class58.field708.method365(class55.field647, (byte) 124));
            return;
        }
        String var2 = class703.method3895(arg0, (byte) -84);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class525.field7289; var3++) {
            String var8 = class703.method3895(class316.field4458[var3], (byte) -112);
            if (var8 != null && var8.equals(var2)) {
                class743.method4082(-125, 4, arg0 + class58.field735.method365(class55.field647, (byte) 86));
                return;
            }
            if (class758.field10398[var3] != null) {
                String var9 = class703.method3895(class758.field10398[var3], (byte) -88);
                if (var9 != null && var9.equals(var2)) {
                    class743.method4082(-128, 4, arg0 + class58.field735.method365(class55.field647, (byte) 99));
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class664.field8915; var4++) {
            String var6 = class703.method3895(class98.field1438[var4], (byte) 120);
            if (var6 != null && var6.equals(var2)) {
                class743.method4082(-126, 4, class58.field740.method365(class55.field647, (byte) 84) + arg0 + class58.field741.method365(class55.field647, (byte) 65));
                return;
            }
            if (class194.field2533[var4] != null) {
                String var7 = class703.method3895(class194.field2533[var4], (byte) 78);
                if (var7 != null && var7.equals(var2)) {
                    class743.method4082(-126, 4, class58.field740.method365(class55.field647, (byte) 79) + arg0 + class58.field741.method365(class55.field647, (byte) 68));
                    return;
                }
            }
        }
        if (class703.method3895(class625.field8475.field10367, (byte) -80).equals(var2)) {
            class743.method4082(arg1 ^ 0x1B, 4, class58.field738.method365(class55.field647, (byte) 111));
            return;
        }
        class371.field5411++;
        if (arg1 == -103) {
            class43 var5 = class492.method2903(class259.field3850, 0, class73.field983);
            var5.field457.method1725(class525.method3045(81, arg0), arg1 ^ 0xFFFFFFCB);
            var5.field457.method1678(arg0, (byte) 102);
            class409.method2457((byte) -100, var5);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILuq;I)Lc;")
    public static final class199 method2676(int arg0, int arg1, class172 arg2, int arg3) {
        if (arg3 != -30772) {
            return null;
        }
        field6468++;
        class254 var4 = new class254(arg2.method1188(arg0, -18047, arg1));
        class199 var5 = new class199(arg1, var4.method1699(-113), var4.method1699(arg3 + 30682), var4.method1672(-16516), var4.method1672(-16516), var4.method1731((byte) 64) == 1, var4.method1731((byte) 64), var4.method1731((byte) 64));
        int var6 = var4.method1731((byte) 64);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field2581.method689(new class324(var4.method1731((byte) 64), var4.method1728((byte) 64), var4.method1728((byte) 18), var4.method1728((byte) 112), var4.method1728((byte) 19), var4.method1728((byte) 59), var4.method1728((byte) 61), var4.method1728((byte) 2), var4.method1728((byte) 49)), -70);
        }
        var5.method1301(-86);
        return var5;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IFFF)I")
    public static final int method2677(int arg0, float arg1, float arg2, float arg3) {
        field6467++;
        float var4 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        int var6 = -77 / ((arg0 + 42) / 60);
        float var7 = (arg1 < 0.0F) ? -arg1 : arg1;
        if (var4 < var5 && var5 > var7) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var7 > var4 && var7 > var5) {
            return arg1 > 0.0F ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Z")
    public static final boolean method2678(int arg0, int arg1) {
        field6465++;
        if (arg0 != -49) {
            method2675(null, (byte) -44);
        }
        if (arg1 == 45 || arg1 == 20 || arg1 == 22 || arg1 == 58 || arg1 == 50) {
            return true;
        } else {
            return arg1 == 13 || arg1 == 1009;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIIIII)V")
    public static final void method2679(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class667.method3680((byte) -88, arg6);
        field6466++;
        if (arg0 != -125) {
            return;
        }
        int var7 = 0;
        int var8 = arg6 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class228.field2951[arg4];
        int var16 = arg2 - var8;
        int var17 = arg2 + var8;
        class464.method2733(arg5, arg2 - arg6, var16, -22816, var15);
        class464.method2733(arg1, var16, var17, -22816, var15);
        class464.method2733(arg5, var17, arg2 + arg6, arg0 ^ 0x5963, var15);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class460.field6560[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class228.field2951[arg4 + var9];
                    int[] var19 = class228.field2951[arg4 - var9];
                    int var20 = class460.field6560[var9];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var20;
                    int var24 = arg2 - var20;
                    class464.method2733(arg5, var22, var24, arg0 ^ 0x5963, var18);
                    class464.method2733(arg1, var24, var23, -22816, var18);
                    class464.method2733(arg5, var23, var21, -22816, var18);
                    class464.method2733(arg5, var22, var24, arg0 ^ 0x5963, var19);
                    class464.method2733(arg1, var24, var23, -22816, var19);
                    class464.method2733(arg5, var23, var21, -22816, var19);
                } else {
                    int[] var25 = class228.field2951[arg4 + var9];
                    int[] var26 = class228.field2951[arg4 - var9];
                    int var27 = arg2 + var7;
                    int var28 = arg2 - var7;
                    class464.method2733(arg5, var28, var27, arg0 ^ 0x5963, var25);
                    class464.method2733(arg5, var28, var27, -22816, var26);
                }
            }
            int[] var29 = class228.field2951[arg4 + var7];
            int[] var30 = class228.field2951[arg4 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var8 <= var7) {
                class464.method2733(arg5, var32, var31, arg0 ^ 0x5963, var29);
                class464.method2733(arg5, var32, var31, -22816, var30);
            } else {
                int var33 = var11 < var7 ? class460.field6560[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class464.method2733(arg5, var32, var35, -22816, var29);
                class464.method2733(arg1, var35, var34, -22816, var29);
                class464.method2733(arg5, var34, var31, -22816, var29);
                class464.method2733(arg5, var32, var35, arg0 ^ 0x5963, var30);
                class464.method2733(arg1, var35, var34, -22816, var30);
                class464.method2733(arg5, var34, var31, -22816, var30);
            }
        }
    }
}
