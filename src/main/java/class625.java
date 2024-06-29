import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class625 {

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "J")
    public long field8603;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "Lbga;")
    private class358 field8599;

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "[I")
    public static int[] field8601 = new int[256];

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "J")
    public static long field8600;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field8601[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method3564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8604++;
        if (arg5 <= 80) {
            method3566(-7);
        }
        int var7 = arg0 + arg1;
        int var8 = arg4 - arg0;
        for (int var9 = arg1; var9 < var7; var9++) {
            class47.method550(-27, arg3, class691.field9345[var9], arg2, arg6);
        }
        int var10 = arg3 - arg0;
        for (int var11 = arg4; var11 > var8; var11--) {
            class47.method550(-27, arg3, class691.field9345[var11], arg2, arg6);
        }
        int var12 = arg0 + arg2;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class691.field9345[var13];
            class47.method550(-27, var12, var14, arg2, arg6);
            class47.method550(-27, arg3, var14, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!lha", name = "finalize", descriptor = "()V", line = 47)
    protected final void finalize() throws Throwable {
        field8602++;
        this.field8599.method2251(this.field8603, 34192);
        super.finalize();
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ljb;Z)Z", line = 62)
    public static final boolean method3565(class494 arg0, boolean arg1) {
        boolean var2 = class683.field9250 == class344.field4822;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method46((byte) -116);
        if (arg0.field6831 < 0 || arg0.field6838 < 0 || arg0.field6839 >= class434.field6208 || arg0.field6835 >= class432.field6185) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field6831; var7 <= arg0.field6839; var7++) {
            for (int var11 = arg0.field6838; var11 <= arg0.field6835; var11++) {
                class384 var12 = class410.method2541(arg0.field5926, var7, var11);
                if (var12 != null) {
                    class474 var13 = class347.method2187(arg0, 118);
                    class474 var14 = var12.field5567;
                    if (var14 == null) {
                        var12.field5567 = var13;
                    } else {
                        while (var14.field6621 != null) {
                            var14 = var14.field6621;
                        }
                        var14.field6621 = var13;
                    }
                    if (var2 && (class755.field10550[var7][var11] & 0xFF000000) != 0) {
                        var3 = class755.field10550[var7][var11];
                        var4 = class315.field4362[var7][var11];
                        var5 = class208.field2981[var7][var11];
                    }
                    if (!arg1 && var12.field5573 != null && var12.field5573.field2726 > var6) {
                        var6 = var12.field5573.field2726;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field6831; var8 <= arg0.field6839; var8++) {
                for (int var9 = arg0.field6838; var9 <= arg0.field6835; var9++) {
                    if ((class755.field10550[var8][var9] & 0xFF000000) == 0) {
                        class755.field10550[var8][var9] = var3;
                        class315.field4362[var8][var9] = var4;
                        class208.field2981[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class477.field6658[class612.field8367++] = arg0;
        } else {
            int var10 = class683.field9250 == class344.field4822 ? 1 : 0;
            if (!arg0.method45(-118)) {
                arg0.field5924 = class375.field5310[var10];
                class375.field5310[var10] = arg0;
            } else if (arg0.method49((byte) 122)) {
                arg0.field5924 = class391.field5762[var10];
                class391.field5762[var10] = arg0;
            } else {
                arg0.field5924 = class362.field5206[var10];
                class362.field5206[var10] = arg0;
                class30.field778 = true;
            }
        }
        if (arg1) {
            arg0.field5927 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V", line = 188)
    public static void method3566(int arg0) {
        if (arg0 == 1) {
            field8601 = null;
        }
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Lbga;J[Lifa;)V", line = 204)
    public class625(class358 arg0, long arg1, class428[] arg2) {
        this.field8603 = arg1;
        this.field8599 = arg0;
    }
}
