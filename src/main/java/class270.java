import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class270 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[Lbd;")
    public static class43[] field3697 = new class43[128];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Z")
    public static boolean field3695;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    public static int[] field3694;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIZII[II)V")
    public static final void method1540(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field3698++;
        if (arg5 > 0 && !class455.method2685(arg5, 20721)) {
            throw new IllegalArgumentException("");
        } else if (arg7 > 0 && !class455.method2685(arg7, 20721)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var8 = 0;
            int var9 = arg5 >= arg7 ? arg7 : arg5;
            if (!arg3) {
                method1544(-7, -59, 88, 20, 75, 24, -28);
            }
            int var10 = arg5 >> 1;
            int var11 = arg7 >> 1;
            int[] var12 = arg6;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var8, arg1, arg5, arg7, 0, arg4, arg0, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg5 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = (var20 & 0xFF9B) >> 8;
                        int var24 = var20 >> 16 & 0xFF;
                        int var25 = var20 >> 24 & 0xFF;
                        int var26 = var12[var16++];
                        int var27 = var20 & 0xFF;
                        int var28 = (var21 >> 16 & 0xFF) + var24;
                        int var29 = (var21 & 0xFF) + var27;
                        int var30 = (var21 >> 24 & 0xFF) + var25;
                        int var31 = (var21 >> 8 & 0xFF) + var23;
                        int var32 = (var22 & 0xFF) + var29;
                        int var33 = ((var22 & 0xFF3FBF) >> 16) + var28;
                        int var34 = (var22 >> 8 & 0xFF) + var31;
                        int var35 = (var22 >> 24 & 0xFF) + var30;
                        int var36 = (var26 & 0xFF) + var32;
                        int var37 = ((var26 & 0xFF2B) >> 8) + var34;
                        int var38 = ((var26 & 0xFFCB8C) >> 16) + var33;
                        int var39 = (var26 >> 24 & 0xFF) + var35;
                        var13[var14++] = class25.method183(class25.method183(class118.method750(var37, 1020) << 6, class25.method183(class118.method750(1020, var39) << 22, class118.method750(var38 << 14, 16711680))), class118.method750(255, var36 >> 2));
                    }
                    var15 += arg5;
                    var16 += arg5;
                }
                int[] var18 = var13;
                var13 = var12;
                arg7 = var11;
                arg5 = var10;
                var12 = var18;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1541(String arg0, int arg1) {
        field3696++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        if (arg1 != 1) {
            field3694 = null;
        }
        String var2 = class451.method2659(arg0, (byte) -120);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class223.field3106; var3++) {
            String var4 = class52.field702[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class451.method2659(var4, (byte) -120);
            if (var5 != null && var5.equals(var2)) {
                class223.field3106--;
                for (int var6 = var3; var6 < class223.field3106; var6++) {
                    class52.field702[var6] = class52.field702[var6 + 1];
                    class133.field1926[var6] = class133.field1926[var6 + 1];
                    class405.field5628[var6] = class405.field5628[var6 + 1];
                    class467.field6831[var6] = class467.field6831[var6 + 1];
                    class403.field5592[var6] = class403.field5592[var6 + 1];
                    class348.field4775[var6] = class348.field4775[var6 + 1];
                }
                class297.field4103++;
                class137.field1959 = class234.field3240;
                class356.method1978((byte) 69, class489.field7134);
                class244.field3395.method2084(class121.method780(arg0, (byte) 54), false);
                class244.field3395.method2073(68, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1542(int arg0, int arg1, int arg2, Class arg3) {
        class61 var4 = class385.field5410[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class302 var5 = var4.field819; var5 != null; var5 = var5.field4140) {
            class33 var6 = var5.field4136;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field463 == arg1 && var6.field468 == arg2) {
                class329.method1831(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method1543(int arg0) {
        if (arg0 != -2) {
            method1544(-60, -87, 82, 65, -109, -72, 56);
        }
        field3694 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3691++;
        int var7 = class497.method2935(class54.field753, arg6, class343.field4727, -125);
        int var8 = class497.method2935(class54.field753, arg1, class343.field4727, -125);
        int var9 = class497.method2935(class175.field2497, arg5, class382.field5379, -128);
        int var10 = class497.method2935(class175.field2497, arg4, class382.field5379, -127);
        int var11 = class497.method2935(class54.field753, arg2 + arg6, class343.field4727, -126);
        int var12 = class497.method2935(class54.field753, arg1 - arg2, class343.field4727, -128);
        for (int var13 = var7; var13 < var11; var13++) {
            class419.method2511(class225.field3174[var13], var9, arg0, var10, -74);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class419.method2511(class225.field3174[var14], var9, arg0, var10, 92);
        }
        int var15 = class497.method2935(class175.field2497, arg2 + arg5, class382.field5379, -125);
        int var16 = class497.method2935(class175.field2497, arg4 - arg2, class382.field5379, -125);
        if (arg3 >= -73) {
            return;
        }
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class225.field3174[var17];
            class419.method2511(var18, var9, arg0, var15, -84);
            class419.method2511(var18, var16, arg0, var10, -99);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZ)V")
    public static final void method1545(byte arg0, boolean arg1) {
        class503.method2959(false);
        int var2 = -61 / ((43 - arg0) / 54);
        field3693++;
        if (class137.field1958 != 30 && class137.field1958 != 25) {
            return;
        }
        class415.field6085++;
        if (class415.field6085 < 50 && !arg1) {
            return;
        }
        class415.field6085 = 0;
        if (!class261.field3592 && class117.field1578 != null) {
            class356.method1978((byte) 50, class226.field3178);
            class162.field2304++;
            try {
                class117.field1578.method643(class244.field3395.field5073, class244.field3395.field5069, -1, 0);
                class244.field3395.field5069 = 0;
            } catch (IOException var3) {
                class261.field3592 = true;
            }
        }
        class503.method2959(false);
    }
}
