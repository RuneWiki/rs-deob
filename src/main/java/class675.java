import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class675 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Lnga;")
    public static class514 field9436 = new class514();

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg4 && arg0 == arg8 && arg6 == arg7 && arg1 == arg2) {
            class518.method2855(arg5, arg0, arg2, arg7, (byte) -105, arg4);
        } else {
            int var10 = arg4;
            int var11 = arg0;
            int var12 = arg4 * 3;
            int var13 = arg0 * 3;
            int var14 = arg3 * 3;
            int var15 = arg8 * 3;
            int var16 = arg6 * 3;
            int var17 = arg1 * 3;
            int var18 = arg7 + var14 - var16 - arg4;
            int var19 = arg2 + var15 - var17 - arg0;
            int var20 = var16 - (var14 - var12) - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg4;
                int var34 = (var28 + var32 + var30 >> 12) + arg0;
                class518.method2855(arg5, var11, var34, var33, (byte) -36, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        field9438++;
        if (arg9 != 22024) {
            field9436 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3838(int arg0, String arg1) {
        field9439++;
        if (arg1 == null) {
            return;
        }
        if (!(class233.field3026 < 200 || class205.field2436) || class233.field3026 >= 200) {
            class247.method1484(class755.field10490.method4201(class723.field10095, (byte) 25), 4, (byte) 49);
            String var2 = class755.field10491.method4201(class723.field10095, (byte) 25);
            if (var2 != null) {
                class247.method1484(var2, 4, (byte) 127);
            }
            return;
        }
        String var3 = class540.method2966(-1, arg1);
        if (var3 == null || arg0 != 4) {
            return;
        }
        for (int var4 = 0; var4 < class233.field3026; var4++) {
            String var9 = class540.method2966(-1, class512.field6935[var4]);
            if (var9 != null && var9.equals(var3)) {
                class247.method1484(arg1 + class755.field10518.method4201(class723.field10095, (byte) 25), 4, (byte) -32);
                return;
            }
            if (class58.field621[var4] != null) {
                String var10 = class540.method2966(arg0 - 5, class58.field621[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class247.method1484(arg1 + class755.field10518.method4201(class723.field10095, (byte) 25), 4, (byte) 119);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class148.field1904; var5++) {
            String var7 = class540.method2966(arg0 ^ 0xFFFFFFFB, class554.field7827[var5]);
            if (var7 != null && var7.equals(var3)) {
                class247.method1484(class755.field10523.method4201(class723.field10095, (byte) 25) + arg1 + class755.field10524.method4201(class723.field10095, (byte) 25), 4, (byte) -96);
                return;
            }
            if (class270.field3568[var5] != null) {
                String var8 = class540.method2966(-1, class270.field3568[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class247.method1484(class755.field10523.method4201(class723.field10095, (byte) 25) + arg1 + class755.field10524.method4201(class723.field10095, (byte) 25), 4, (byte) -103);
                    return;
                }
            }
        }
        if (class540.method2966(-1, class653.field9086.field1148).equals(var3)) {
            class247.method1484(class755.field10521.method4201(class723.field10095, (byte) 25), 4, (byte) -100);
            return;
        }
        class60.field639++;
        class103 var6 = class752.method4186(260, class640.field8881, class449.field6285);
        var6.field1379.method3393(class601.method3326(arg1, (byte) 88), arg0 + 81);
        var6.field1379.method3387(arg1, (byte) 113);
        class27.method104(false, var6);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method3839(int arg0) {
        if (arg0 > 59) {
            field9436 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
    public static final void method3840(byte arg0) {
        class634.field8819 = null;
        class255.field3305 = null;
        class685.field9612 = null;
        class635.field8820 = null;
        class246.field3205 = null;
        field9437++;
        class702.field9863 = null;
        class497.field6764 = null;
        class713.field9956 = null;
        class214.field2575 = null;
        class563.field7963 = null;
        class205.field2434 = null;
        class127.field1664 = null;
        class15.field112 = null;
        class399.field5650 = null;
        class577.field8098 = null;
        class584.field8181 = null;
        class427.field6033 = null;
        if (arg0 >= 11) {
            class203.field2413 = null;
        }
    }
}
