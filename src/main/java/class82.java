import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class82 extends class108 {

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "[Z")
    public boolean[] field1112;

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "[I")
    public int[] field1104;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "[[I")
    public int[][] field1111;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "[I")
    public int[] field1108;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field1115 = 0;

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "Lpaa;")
    public static class317 field1106 = new class317(3, 7);

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "Lm;")
    public static class105 field1116;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "Ljava/lang/Object;")
    public static Object field1117;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "[I")
    public static int[] field1118;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lr;IIIB)Lud;")
    public static final class119 method459(class521 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1114++;
        if (arg0 == null) {
            return null;
        } else {
            if (arg4 != -101) {
                field1116 = null;
            }
            return new class119(arg3, arg2, arg1, arg0.method1590(), arg0.method1561(), arg0.method1563(), arg0.method1579(), arg0.method1592(), arg0.method1565(), arg0.method1597());
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
    public static void method460(int arg0) {
        field1106 = null;
        field1117 = null;
        field1116 = null;
        field1118 = null;
        if (arg0 != -695742778) {
            method459(null, -4, 46, 41, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILjava/lang/String;I[B)I")
    public static final int method461(int arg0, String arg1, int arg2, byte[] arg3) {
        field1113++;
        int var4 = arg0;
        int var5 = arg1.length();
        if (arg2 != 1020) {
            field1117 = null;
        }
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class375.method2294(-6279, arg1.charAt(var6));
            int var8 = (var6 + 1) >= var5 ? -1 : class375.method2294(-6279, arg1.charAt(var6 + 1));
            int var9 = (var6 + 2) >= var5 ? -1 : class375.method2294(-6279, arg1.charAt(var6 + 2));
            int var10 = var6 + 3 < var5 ? class375.method2294(arg2 - 7299, arg1.charAt(var6 + 3)) : -1;
            arg3[arg0++] = (byte) class292.method1790(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg3[arg0++] = (byte) class292.method1790(class143.method783(var8 << 4, 240), var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg3[arg0++] = (byte) class292.method1790(class143.method783(var9, 3) << 6, var10);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lfu;)V")
    public static final void method462(class450 arg0) {
        for (int var1 = arg0.field6361; var1 <= arg0.field6357; var1++) {
            for (int var2 = arg0.field6359; var2 <= arg0.field6367; var2++) {
                class563 var3 = class199.field2605[arg0.field6358][var1][var2];
                if (var3 != null) {
                    class15 var4 = var3.field7894;
                    class15 var5 = null;
                    while (var4 != null) {
                        if (var4.field161 == arg0) {
                            if (var5 == null) {
                                var3.field7894 = var4.field158;
                            } else {
                                var5.field158 = var4.field158;
                            }
                            var4.method71(86);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field158;
                    }
                    var3.field7892 = 0;
                    for (class15 var6 = var3.field7894; var6 != null; var6 = var6.field158) {
                        var3.field7892 = (byte) (var3.field7892 | var6.field160);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I[B)V")
    public class82(int arg0, byte[] arg1) {
        this.field1109 = arg0;
        class551 var3 = new class551(arg1);
        this.field1107 = var3.method3045(-128);
        this.field1112 = new boolean[this.field1107];
        this.field1104 = new int[this.field1107];
        this.field1111 = new int[this.field1107][];
        this.field1108 = new int[this.field1107];
        for (int var4 = 0; var4 < this.field1107; var4++) {
            this.field1104[var4] = var3.method3045(-126);
            if (this.field1104[var4] == 6) {
                this.field1104[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field1107; var5++) {
            this.field1112[var5] = var3.method3045(-125) == 1;
        }
        for (int var6 = 0; var6 < this.field1107; var6++) {
            this.field1108[var6] = var3.method3090(-106);
        }
        for (int var7 = 0; var7 < this.field1107; var7++) {
            this.field1111[var7] = new int[var3.method3045(-127)];
        }
        for (int var8 = 0; var8 < this.field1107; var8++) {
            for (int var9 = 0; var9 < this.field1111[var8].length; var9++) {
                this.field1111[var8][var9] = var3.method3045(-126);
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(III[IIIII)V")
    public static final void method463(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field1105++;
        if (arg7 > 0 && !class506.method2832(arg7, arg4 + 32997)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class506.method2832(arg2, 3)) {
            throw new IllegalArgumentException("");
        } else if (~arg0 == arg4) {
            int var8 = 0;
            int var9 = arg7 < arg2 ? arg7 : arg2;
            int var10 = arg7 >> 1;
            int var11 = arg2 >> 1;
            int[] var12 = arg3;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var8, arg6, arg7, arg2, 0, arg0, arg5, var12, 0);
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
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = (var20 & 0xFF835A) >> 16;
                        int var24 = var12[var16++];
                        int var25 = var20 & 0xFF;
                        int var26 = var20 >> 24 & 0xFF;
                        int var27 = (var20 & 0xFFB9) >> 8;
                        int var28 = (var21 & 0xFF) + var25;
                        int var29 = (var21 >> 8 & 0xFF) + var27;
                        int var30 = ((var21 & 0xFF9A30) >> 16) + var23;
                        int var31 = (var21 >> 24 & 0xFF) + var26;
                        int var32 = (var22 >> 8 & 0xFF) + var29;
                        int var33 = (var22 >> 24 & 0xFF) + var31;
                        int var34 = (var22 >> 16 & 0xFF) + var30;
                        int var35 = (var22 & 0xFF) + var28;
                        int var36 = (var24 >> 8 & 0xFF) + var32;
                        int var37 = (var24 >> 16 & 0xFF) + var34;
                        int var38 = (var24 >> 24 & 0xFF) + var33;
                        int var39 = (var24 & 0xFF) + var35;
                        var13[var14++] = class292.method1790(class292.method1790(class292.method1790(class143.method783(16711680, var37 << 14), class143.method783(var38 << 22, -16777216)), class143.method783(1020, var36) << 6), class143.method783(var39, 1020) >> 2);
                    }
                    var16 += arg7;
                    var15 += arg7;
                }
                var13 = var12;
                arg7 = var10;
                arg2 = var11;
                var12 = var17;
                var10 >>= 0x1;
                var8++;
                var9 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
