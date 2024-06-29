import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class531 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "F")
    public static float field7797;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Lla;")
    public static class296 field7796;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field7800;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3145(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[IIIBIII)V", line = 3)
    public static final void method3142(int arg0, int[] arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field7798++;
        if (arg7 > 0 && !class137.method1029(arg7, false)) {
            throw new IllegalArgumentException("");
        } else if (arg5 > 0 && !class137.method1029(arg5, false)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            int var8 = 0;
            int var9 = arg7 >= arg5 ? arg5 : arg7;
            int var10 = arg7 >> 1;
            int var11 = arg5 >> 1;
            if (arg4 != 7) {
                method3144(-81, true, -57, 118);
            }
            int[] var12 = arg1;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var8, arg0, arg7, arg5, 0, arg6, arg2, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg7 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 8 & 0xFF;
                        int var24 = var20 >> 24 & 0xFF;
                        int var25 = var20 & 0xFF;
                        int var26 = var12[var16++];
                        int var27 = var20 >> 16 & 0xFF;
                        int var28 = (var22 >> 24 & 0xFF) + var24;
                        int var29 = (var22 >> 16 & 0xFF) + var27;
                        int var30 = (var22 >> 8 & 0xFF) + var23;
                        int var31 = (var22 & 0xFF) + var25;
                        int var32 = ((var21 & 0xFFBE8C) >> 16) + var29;
                        int var33 = (var21 >> 8 & 0xFF) + var30;
                        int var34 = (var21 & 0xFF) + var31;
                        int var35 = (var21 >> 24 & 0xFF) + var28;
                        int var36 = (var26 >> 24 & 0xFF) + var35;
                        int var37 = (var26 & 0xFF) + var34;
                        int var38 = ((var26 & 0xFF6E) >> 8) + var33;
                        int var39 = (var26 >> 16 & 0xFF) + var32;
                        var13[var14++] = class338.method2141(class344.method2224(var37 >> 2, 255), class338.method2141(class344.method2224(var38 << 6, 65280), class338.method2141(class344.method2224(var36, 1020) << 22, class344.method2224(1020, var39) << 14)));
                    }
                    var15 += arg7;
                    var16 += arg7;
                }
                var13 = var12;
                arg7 = var10;
                arg5 = var11;
                var12 = var17;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 110)
    public static void method3143(int arg0) {
        if (arg0 != 17014) {
            method3142(110, null, -73, -9, (byte) -77, 91, -17, -63);
        }
        field7796 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZII)Z", line = 127)
    public static final boolean method3144(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return true;
        }
        field7799++;
        class518 var4 = (class518) class134.method1018(arg0, arg3, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class332.method2090(true, var4);
        }
        class518 var6 = (class518) class491.method2868(arg0, arg3, arg2, field7800 == null ? (field7800 = method3145("jg")) : field7800);
        if (var6 != null) {
            var5 &= class332.method2090(!arg1, var6);
        }
        class518 var7 = (class518) class373.method2346(arg0, arg3, arg2);
        if (var7 != null) {
            var5 &= class332.method2090(true, var7);
        }
        return var5;
    }
}
