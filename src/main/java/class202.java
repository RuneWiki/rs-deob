import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class202 extends class176 {

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "[I")
    public static int[] field2391 = new int[32];

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field2392++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg5 - arg2;
        int var12 = arg7 - arg2;
        int var13 = arg5 * arg5;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        if (arg6 != 111) {
            return;
        }
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class93.field949 <= arg0 && arg0 <= class360.field4834) {
            int[] var39 = class557.field7954[arg0];
            int var40 = class266.method1567(class412.field5526, true, class72.field740, arg3 - arg5);
            int var41 = class266.method1567(class412.field5526, true, class72.field740, arg3 + arg5);
            int var42 = class266.method1567(class412.field5526, true, class72.field740, arg3 - var11);
            int var43 = class266.method1567(class412.field5526, true, class72.field740, arg3 + var11);
            class315.method1809(var39, arg4, -128, var40, var42);
            class315.method1809(var39, arg1, -128, var42, var43);
            class315.method1809(var39, arg4, arg6 ^ 0xFFFFFFEF, var43, var41);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (var46 >= class93.field949 && var45 <= class360.field4834) {
                int var47 = class266.method1567(class412.field5526, true, class72.field740, arg3 + var8);
                int var48 = class266.method1567(class412.field5526, true, class72.field740, arg3 - var8);
                if (var44) {
                    int var49 = class266.method1567(class412.field5526, true, class72.field740, arg3 + var10);
                    int var50 = class266.method1567(class412.field5526, true, class72.field740, arg3 - var10);
                    if (class93.field949 <= var45) {
                        int[] var51 = class557.field7954[var45];
                        class315.method1809(var51, arg4, -128, var48, var50);
                        class315.method1809(var51, arg1, -128, var50, var49);
                        class315.method1809(var51, arg4, arg6 ^ 0xFFFFFFEF, var49, var47);
                    }
                    if (var46 <= class360.field4834) {
                        int[] var52 = class557.field7954[var46];
                        class315.method1809(var52, arg4, arg6 - 239, var48, var50);
                        class315.method1809(var52, arg1, -128, var50, var49);
                        class315.method1809(var52, arg4, -128, var49, var47);
                    }
                } else {
                    if (var45 >= class93.field949) {
                        class315.method1809(class557.field7954[var45], arg4, -128, var48, var47);
                    }
                    if (var46 <= class360.field4834) {
                        class315.method1809(class557.field7954[var46], arg4, -128, var48, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Ldba;Lpa;IIIIIIIII)V")
    public class202(class240 arg0, class648 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field2390 = arg9;
        this.field2389 = arg10;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
    public static final void method1208(int arg0, int arg1, int arg2) {
        class499 var3 = class487.field7044[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class220.method1274(var3.field7218);
        class220.method1274(var3.field7223);
        if (var3.field7218 != null) {
            var3.field7218 = null;
        }
        if (var3.field7223 != null) {
            var3.field7223 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public static void method1209(boolean arg0) {
        field2391 = null;
        if (!arg0) {
            method1207(-124, 7, 50, -59, 15, 21, (byte) 15, -18);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Lib;")
    public final class14 method203(byte arg0) {
        field2388++;
        if (arg0 != -92) {
            this.field2390 = 7;
        }
        return class655.field9231;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2391[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
