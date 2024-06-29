import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class465 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lgo;")
    public static class310 field6768 = null;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lgk;")
    public static class468 field6771 = new class468(new byte[5000]);

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Ldp;")
    public static class347 field6775;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[B)Z")
    public static final boolean method2698(int arg0, byte[] arg1) {
        field6773++;
        class468 var2 = new class468(arg1);
        int var3 = var2.method2765(67);
        if (var3 != 2) {
            return false;
        }
        if (arg0 >= -63) {
            method2699(75, 21, 120);
        }
        boolean var4 = var2.method2765(118) == 1;
        if (var4) {
            class376.method2229(var2, (byte) -123);
        }
        class342.method2083(var2, 0);
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Z")
    public static final boolean method2699(int arg0, int arg1, int arg2) {
        if (arg2 >= -12) {
            return true;
        } else {
            field6769++;
            return class330.method2043(arg0, true, arg1) & class58.method418(111, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static final void method2700(boolean arg0) {
        class452.field6647.method2287(66);
        if (arg0) {
            field6771 = null;
        }
        field6770++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method2701(byte arg0) {
        field6771 = null;
        field6775 = null;
        int var1 = -115 / ((arg0 - 1) / 59);
        field6768 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lmh;III)V")
    public static final void method2702(class112 arg0, int arg1, int arg2, int arg3) {
        class164.field2446[arg1][arg3] = arg0;
        field6774++;
        if (arg2 != 16764604) {
            method2702(null, -82, -47, -87);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III[IIBII)V")
    public static final void method2703(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        field6772++;
        if (arg0 > 0 && !class384.method2305(1, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class384.method2305(arg5 + 53, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg7 == 32993) {
            int var8 = 0;
            int var9 = arg4 > arg0 ? arg0 : arg4;
            int var10 = arg0 >> 1;
            int var11 = arg4 >> 1;
            if (arg5 == -52) {
                int[] var12 = arg3;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg1, var8, arg2, arg0, arg4, 0, arg7, arg6, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg0 + var15;
                    int[] var17 = var13;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var10; var19++) {
                            int var20 = var12[var15++];
                            int var21 = var12[var15++];
                            int var22 = var12[var16++];
                            int var23 = var20 & 0xFF;
                            int var24 = var12[var16++];
                            int var25 = var20 >> 16 & 0xFF;
                            int var26 = var20 >> 24 & 0xFF;
                            int var27 = (var20 & 0xFFBF) >> 8;
                            int var28 = (var21 >> 16 & 0xFF) + var25;
                            int var29 = ((var21 & 0xFFCD) >> 8) + var27;
                            int var30 = (var21 >> 24 & 0xFF) + var26;
                            int var31 = (var21 & 0xFF) + var23;
                            int var32 = (var22 & 0xFF) + var31;
                            int var33 = ((var22 & 0xFF1E) >> 8) + var29;
                            int var34 = (var22 >> 24 & 0xFF) + var30;
                            int var35 = ((var22 & 0xFFCEBC) >> 16) + var28;
                            int var36 = (var24 & 0xFF) + var32;
                            int var37 = ((var24 & 0xFFFE) >> 8) + var33;
                            int var38 = (var24 >> 16 & 0xFF) + var35;
                            int var39 = (var24 >> 24 & 0xFF) + var34;
                            var13[var14++] = class390.method2340(class140.method1023(255, var36 >> 2), class390.method2340(class140.method1023(var37 << 6, 65280), class390.method2340(class140.method1023(1020, var39) << 22, class140.method1023(var38, 1020) << 14)));
                        }
                        var16 += arg0;
                        var15 += arg0;
                    }
                    var13 = var12;
                    arg4 = var11;
                    var12 = var17;
                    arg0 = var10;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                    var8++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    static {
        new class347("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        field6775 = new class347("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
    }
}
