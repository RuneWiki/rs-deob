import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class198 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Z")
    public static volatile boolean field3420 = true;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lqe;")
    public static class168 field3419 = class66.method448("; Max)2Age=", -112);

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
    public static int[] field3424 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3422 = 0;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lwc;")
    public static class232 field3427 = new class232(20);

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Lqe;")
    public static class168 field3429 = class66.method448("m-Ochte mit Ihnen handeln)3", 97);

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Lwd;")
    public static class67 field3430;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[[[B")
    public static byte[][][] field3418;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
    public static final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class232.method1501(arg3, arg2 - arg4, (byte) -108, class241.field4117[arg1], arg2 + arg4);
        int var5 = 0;
        if (arg0 <= 124) {
            method1274(103);
        }
        field3426++;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        while (var6 > var5) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class241.field4117[arg1 + var6];
                int var10 = arg2 + var5;
                int[] var11 = class241.field4117[arg1 - var6];
                int var12 = arg2 - var5;
                var7 -= var6 << 1;
                class232.method1501(arg3, var12, (byte) -108, var9, var10);
                class232.method1501(arg3, var12, (byte) -108, var11, var10);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class241.field4117[arg1 + var5];
            int[] var16 = class241.field4117[arg1 - var5];
            class232.method1501(arg3, var14, (byte) -108, var15, var13);
            class232.method1501(arg3, var14, (byte) -108, var16, var13);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1270(int arg0) {
        field3419 = null;
        field3427 = null;
        field3430 = null;
        if (arg0 != 0) {
            method1271(-5, -116, 49, 126, 40, -62);
        }
        field3424 = null;
        field3418 = null;
        field3429 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 > -2) {
            field3430 = null;
        }
        field3425++;
        if (class196.field3402 < arg3 || arg1 < class222.field3811) {
            return;
        }
        boolean var6;
        if (class174.field3055 > arg5) {
            var6 = false;
            arg5 = class174.field3055;
        } else if (class249.field4314 < arg5) {
            var6 = false;
            arg5 = class249.field4314;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class174.field3055 > arg2) {
            var7 = false;
            arg2 = class174.field3055;
        } else if (arg2 > class249.field4314) {
            arg2 = class249.field4314;
            var7 = false;
        } else {
            var7 = true;
        }
        if (arg3 < class222.field3811) {
            arg3 = class222.field3811;
        } else {
            class232.method1501(arg4, arg5, (byte) -108, class241.field4117[arg3++], arg2);
        }
        if (class196.field3402 < arg1) {
            arg1 = class196.field3402;
        } else {
            class232.method1501(arg4, arg5, (byte) -108, class241.field4117[arg1--], arg2);
        }
        if (var6 && var7) {
            for (int var8 = arg3; var8 <= arg1; var8++) {
                int[] var9 = class241.field4117[var8];
                var9[arg5] = var9[arg2] = arg4;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg3; var10 <= arg1; var10++) {
                class241.field4117[var10][arg5] = arg4;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg3; var11 <= arg1; var11++) {
                class241.field4117[var11][arg2] = arg4;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIIIII)V")
    public static final void method1272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3423++;
        int var6 = arg3 - arg1;
        int var7 = arg5 - arg0;
        if (arg4 == var7) {
            if (var6 != 0) {
                class190.method1231(arg1, true, arg2, arg3, arg0);
            }
        } else if (var6 == 0) {
            class204.method1326(0, arg1, arg0, arg5, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                arg0 = arg1;
                arg1 = var9;
                int var10 = arg5;
                arg5 = arg3;
                arg3 = var10;
            }
            if (arg5 < arg0) {
                int var11 = arg0;
                arg0 = arg5;
                int var12 = arg1;
                arg1 = arg3;
                arg5 = var11;
                arg3 = var12;
            }
            int var13 = arg3 - arg1;
            if (var13 < 0) {
                var13 = -var13;
            }
            int var14 = arg5 - arg0;
            int var15 = -(var14 >> 1);
            int var16 = arg1;
            int var17 = arg1 >= arg3 ? -1 : 1;
            if (var8) {
                for (int var19 = arg0; var19 <= arg5; var19++) {
                    var15 += var13;
                    class241.field4117[var19][var16] = arg2;
                    if (var15 > 0) {
                        var15 -= var14;
                        var16 += var17;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg5; var18++) {
                    var15 += var13;
                    class241.field4117[var16][var18] = arg2;
                    if (var15 > 0) {
                        var16 += var17;
                        var15 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method261(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
    public abstract int method262(byte arg0);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Log;B)V")
    public static final void method1273(class18 arg0, byte arg1) {
        field3421++;
        if (arg1 > -8) {
            field3424 = null;
        }
        if (arg0.field179 == 0) {
            return;
        }
        if (arg0.field181 != -1 && arg0.field181 < 32768) {
            class222 var2 = class229.field3898[arg0.field181];
            if (var2 != null) {
                int var3 = arg0.field190 - var2.field190;
                int var4 = arg0.field166 - var2.field166;
                if (var3 != 0 || var4 != 0) {
                    arg0.field193 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field181 >= 32768) {
            int var5 = arg0.field181 - 32768;
            if (class81.field1233 == var5) {
                var5 = 2047;
            }
            class121 var6 = class104.field1677[var5];
            if (var6 != null) {
                int var7 = arg0.field190 - var6.field190;
                int var8 = arg0.field166 - var6.field166;
                if (var7 != 0 || var8 != 0) {
                    arg0.field193 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field207 != 0 || arg0.field175 != 0) && (arg0.field228 == 0 || arg0.field172 > 0)) {
            int var9 = arg0.field190 + (arg0.field171 - 1) * 64 - (-class246.field4261 + -class246.field4261 + arg0.field207) * 64;
            int var10 = arg0.field166 + arg0.field171 * 64 - (arg0.field175 - class125.field2060 - class125.field2060) * 64 - 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field193 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field207 = 0;
            arg0.field175 = 0;
        }
        int var11 = arg0.field193 - arg0.field194 & 0x7FF;
        if (var11 == 0) {
            arg0.field164 = 0;
            return;
        }
        arg0.field164++;
        if (var11 <= 1024) {
            arg0.field194 += arg0.field179;
            boolean var12 = true;
            if (arg0.field179 > var11 || 2048 - arg0.field179 < var11) {
                arg0.field194 = arg0.field193;
                var12 = false;
            }
            if (arg0.field224 == arg0.field223 && (arg0.field164 > 25 || var12)) {
                if (arg0.field188 == -1) {
                    arg0.field223 = arg0.field225;
                } else {
                    arg0.field223 = arg0.field188;
                }
            }
        } else {
            boolean var13 = true;
            arg0.field194 -= arg0.field179;
            if (arg0.field179 > var11 || var11 > 2048 - arg0.field179) {
                arg0.field194 = arg0.field193;
                var13 = false;
            }
            if (arg0.field224 == arg0.field223 && (arg0.field164 > 25 || var13)) {
                if (arg0.field208 == -1) {
                    arg0.field223 = arg0.field225;
                } else {
                    arg0.field223 = arg0.field208;
                }
            }
        }
        arg0.field194 &= 0x7FF;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method260(Component arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Lgd;")
    public static final class65 method1274(int arg0) {
        int var1 = class85.field1332[0] * class69.field978[0];
        byte[] var2 = class7.field84[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class92.field1457[class86.method571(255, var2[var4])];
        }
        field3428++;
        class15 var5 = new class15(class243.field4225, class150.field2597, class33.field415[0], class54.field746[0], class85.field1332[0], class69.field978[0], var3);
        class246.method1613(arg0);
        return var5;
    }
}
