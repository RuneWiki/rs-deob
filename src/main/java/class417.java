import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class417 extends class276 {

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public int field6315 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field6314 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public int field6320 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public int field6319 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public int field6318 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
    public int field6323 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public int field6322 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public int field6325 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Lmo;")
    public class366 field6313;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "[[I")
    public static int[][] field6317 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "[[[Lut;")
    public static class465[][][] field6321;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLza;Lco;Lmo;)V")
    public static final void method2567(byte arg0, class491 arg1, class445 arg2, class366 arg3) {
        field6324++;
        class138 var4 = arg2.method2677(arg1, arg0 ^ 0x2B);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method204();
        if (var5 < var4.method210()) {
            var5 = var4.method210();
        }
        byte var6 = 10;
        int var7 = arg3.field5695;
        int var8 = arg3.field5687;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field6629 != null) {
            var9 = class66.field978.method2083(null, false, arg2.field6629, null, class165.field2607);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class165.field2607[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class166.field2667.method3039(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class166.field2667.method3045() * var9 + (class166.field2667.method3044() / 2);
        }
        int var15 = arg3.field5695 + (var5 / 2);
        if (var7 < class210.field3344 + var5) {
            var7 = class210.field3344;
            var15 = var5 / 2 + var6 + class210.field3344 + (var10 / 2) + 5;
        } else if ((class210.field3361 - var5) < var7) {
            var7 = class210.field3361 - var5;
            var15 = class210.field3361 - var5 / 2 - (var10 / 2) - var6 - 5;
        }
        int var16 = arg3.field5687;
        if ((class210.field3356 + var5) > var8) {
            var8 = class210.field3356;
            var16 = var5 / 2 + class210.field3356 + var6;
        } else if (var8 > class210.field3346 - var5) {
            var8 = class210.field3346 - var5;
            var16 = class210.field3346 - var5 / 2 - var6 - var11;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg3.field5695), (double) (var8 - arg3.field5687)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method1034((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        if (arg0 != -96) {
            return;
        }
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field6629 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var9 * class166.field2667.method3045() + var16 + 3;
            var20 = var10 + var18 + 10;
            if (arg2.field6648 != 0) {
                arg1.method2864(var16, (byte) 13, var20 - var18, var18, var21 - var16, arg2.field6648);
            }
            if (arg2.field6655 != 0) {
                arg1.method2859(var20 - var18, arg2.field6655, -48, var21 - var16, var16, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class165.field2607[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class166.field2667.method3041(arg1, var23, var15, var16, arg2.field6624, true);
                var16 += class166.field2667.method3045();
            }
        }
        if (arg2.field6653 == -1 && arg2.field6629 == null) {
            return;
        }
        class417 var24 = new class417(arg3);
        int var25 = var5 >> 1;
        var24.field6320 = var7 + var25;
        var24.field6323 = var21;
        var24.field6315 = var7 - var25;
        var24.field6325 = var8 + var25;
        var24.field6314 = var8 - var25;
        var24.field6318 = var19;
        var24.field6319 = var20;
        var24.field6322 = var18;
        class536.field7873.method2541(0, var24);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method2568(int arg0) {
        field6317 = null;
        field6321 = null;
        if (arg0 != 31239) {
            field6317 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Z")
    public final boolean method2569(int arg0, int arg1, int arg2) {
        field6316++;
        if (arg1 >= this.field6315 && arg1 <= this.field6320 && this.field6314 <= arg0 && this.field6325 >= arg0) {
            return true;
        } else {
            if (arg2 != 1) {
                this.method2569(-86, -125, 20);
            }
            return arg1 >= this.field6322 && this.field6319 >= arg1 && this.field6318 <= arg0 && arg0 <= this.field6323;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lpt;IIII)V")
    public static final void method2570(class398 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class534.method3168(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class236.field4089) {
            class534.method3168(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class534.method3168(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class276.field4537) {
            class534.method3168(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class276.field4537) {
            class534.method3168(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class236.field4089 && arg4 <= class276.field4537) {
            class534.method3168(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class534.method3168(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class236.field4089 && arg4 > 0) {
            class534.method3168(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lmo;)V")
    public class417(class366 arg0) {
        this.field6313 = arg0;
    }
}
