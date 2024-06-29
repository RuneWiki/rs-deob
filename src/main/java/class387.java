import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class387 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "J")
    public long field5459;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lac;")
    private class541 field5462;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Loq;")
    public static class362 field5460 = new class362();

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "[I")
    public static int[] field5465 = new int[2];

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Lea;")
    public static class547 field5464 = new class547(54, 4);

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Lkba;")
    public static class108 field5466 = new class108();

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "[Lega;")
    public static class711[] field5467 = new class711[16];

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Lgm;")
    public static class125 field5468 = new class125("", 11);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I", line = 6)
    public static final int method2262(String arg0, String arg1, int arg2, int arg3) {
        field5463++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var5 > (var7 - var9)) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class105.method714(14561, var22);
            var9 = class105.method714(14561, var24);
            char var26 = class87.method630(var22, arg2, (byte) -85);
            char var27 = class87.method630(var24, arg2, (byte) -123);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class320.method1913(arg2, var28, (byte) -127) - class320.method1913(arg2, var29, (byte) -106);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class320.method1913(arg2, var20, (byte) -106) - class320.method1913(arg2, var21, (byte) -103);
                }
            }
        }
        if (arg3 != 1166845806) {
            method2262(null, null, 8, 52);
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class320.method1913(arg2, var14, (byte) -113) - class320.method1913(arg2, var15, (byte) -94);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIII[I)V", line = 131)
    public static final void method2263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field5457++;
        if (arg4 > 0 && !class143.method891(arg4, 0)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class143.method891(arg6, 0)) {
            throw new IllegalArgumentException("");
        } else if (arg5 == 32993) {
            int var8 = 0;
            int var9 = arg4 >= arg6 ? arg6 : arg4;
            int var10 = 27 / ((-arg1 - 13) / 57);
            int var11 = arg4 >> 1;
            int var12 = arg6 >> 1;
            int[] var13 = arg7;
            int[] var14 = new int[var11 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var8, arg0, arg4, arg6, 0, arg5, arg2, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg4 + var16;
                int[] var18 = var14;
                for (int var19 = 0; var19 < var12; var19++) {
                    for (int var20 = 0; var20 < var11; var20++) {
                        int var21 = var13[var16++];
                        int var22 = var13[var16++];
                        int var23 = var13[var17++];
                        int var24 = var13[var17++];
                        int var25 = (var21 & 0xFF9F) >> 8;
                        int var26 = var21 >> 24 & 0xFF;
                        int var27 = var21 & 0xFF;
                        int var28 = (var21 & 0xFF69B8) >> 16;
                        int var29 = ((var22 & 0xFF1C) >> 8) + var25;
                        int var30 = (var22 & 0xFF) + var27;
                        int var31 = (var22 >> 16 & 0xFF) + var28;
                        int var32 = (var22 >> 24 & 0xFF) + var26;
                        int var33 = (var23 & 0xFF) + var30;
                        int var34 = ((var23 & 0xFF241E) >> 16) + var31;
                        int var35 = (var23 >> 8 & 0xFF) + var29;
                        int var36 = (var23 >> 24 & 0xFF) + var32;
                        int var37 = (var24 >> 16 & 0xFF) + var34;
                        int var38 = (var24 & 0xFF) + var33;
                        int var39 = (var24 >> 24 & 0xFF) + var36;
                        int var40 = ((var24 & 0xFF74) >> 8) + var35;
                        var14[var15++] = class344.method2020(class344.method2020(class321.method1919(var40, 1020) << 6, class344.method2020(class321.method1919(var37, 1020) << 14, class321.method1919(-16777216, var39 << 22))), class321.method1919(255, var38 >> 2));
                    }
                    var16 += arg4;
                    var17 += arg4;
                }
                var14 = var13;
                arg6 = var12;
                var13 = var18;
                arg4 = var11;
                var11 >>= 0x1;
                var8++;
                var12 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!uj", name = "finalize", descriptor = "()V", line = 240)
    protected final void finalize() throws Throwable {
        this.field5462.method2998(false, this.field5459);
        field5456++;
        super.finalize();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 250)
    public static void method2264(int arg0) {
        if (arg0 != -43327976) {
            return;
        }
        field5467 = null;
        field5464 = null;
        field5465 = null;
        field5460 = null;
        field5466 = null;
        field5468 = null;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lac;J[Lv;)V", line = 267)
    public class387(class541 arg0, long arg1, class580[] arg2) {
        this.field5459 = arg1;
        this.field5462 = arg0;
    }
}
