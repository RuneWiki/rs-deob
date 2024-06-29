import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class749 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lrf;")
    public static class749 field10445 = new class749();

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field10447;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field10448;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field10449;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public static void method4174(boolean arg0) {
        if (!arg0) {
            method4175(108);
        }
        field10445 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method4175(int arg0) {
        field10448++;
        for (int var1 = 0; var1 < class311.field4226; var1++) {
            class633.field8932[var1] = null;
        }
        class311.field4226 = 0;
        for (int var2 = 0; var2 < class433.field6202; var2++) {
            for (int var42 = 0; var42 < class439.field6264; var42++) {
                for (int var43 = 0; var43 < class408.field5806; var43++) {
                    class375 var44 = class565.field8185[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field5434 > 0) {
                            var44.field5434 = (short) (var44.field5434 * -1);
                        }
                        if (var44.field5436 > 0) {
                            var44.field5436 = (short) (var44.field5436 * -1);
                        }
                    }
                }
            }
        }
        int var3 = 0;
        if (arg0 < 84) {
            return;
        }
        while (var3 < class433.field6202) {
            for (int var4 = 0; var4 < class439.field6264; var4++) {
                for (int var5 = 0; var5 < class408.field5806; var5++) {
                    class375 var6 = class565.field8185[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class565.field8185[0][var5][var4] != null && class565.field8185[0][var5][var4].field5433 != null;
                        if (var6.field5434 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class375 var12 = class565.field8185[var3][var5][var4 - 1];
                            int var13 = class491.field7079[var3].method2087(108, var5, var4);
                            while (var8 > 0 && var12 != null && var12.field5434 < 0 && var6.field5434 == var12.field5434 && var6.field5426 == var12.field5426 && class491.field7079[var3].method2087(58, var5, var8 - 1) == var13 && ((var8 - 1) <= 0 || var13 == class491.field7079[var3].method2087(102, var5, var8 - 2))) {
                                var8--;
                                var12 = class565.field8185[var3][var5][var8 - 1];
                            }
                            for (class375 var14 = class565.field8185[var3][var5][var4 + 1]; var9 < class408.field5806 && var14 != null && var14.field5434 < 0 && var6.field5434 == var14.field5434 && var6.field5426 == var14.field5426 && class491.field7079[var3].method2087(95, var5, var9 + 1) == var13 && (class408.field5806 <= (var9 + 1) || var13 == class491.field7079[var3].method2087(88, var5, var9 + 2)); var14 = class565.field8185[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class491.field7079[var7 ? var3 + 1 : var3].method2087(58, var5, var8);
                            int var17 = var6.field5434 * var15 + var16;
                            int var18 = class491.field7079[var7 ? var3 + 1 : var3].method2087(78, var5, var9 + 1);
                            int var19 = var6.field5434 * var15 + var18;
                            int var20 = var5 << class639.field9095;
                            int var21 = var8 << class639.field9095;
                            int var22 = (var9 << class639.field9095) + class150.field2190;
                            class633.field8932[class311.field4226++] = new class151(1, var3, var6.field5426 + var20, var20 - -var6.field5426, var6.field5426 + var20, var6.field5426 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class565.field8185[var23][var5][var24].field5434 = (short) (class565.field8185[var23][var5][var24].field5434 * -1);
                                }
                            }
                        }
                        if (var6.field5436 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class375 var29 = class565.field8185[var3][var5 - 1][var4];
                            int var30 = class491.field7079[var3].method2087(85, var5, var4);
                            while (var25 > 0 && var29 != null && var29.field5436 < 0 && var6.field5436 == var29.field5436 && var6.field5437 == var29.field5437 && class491.field7079[var3].method2087(65, var25 - 1, var4) == var30 && ((var25 - 1) <= 0 || var30 == class491.field7079[var3].method2087(104, var25 - 2, var4))) {
                                var25--;
                                var29 = class565.field8185[var3][var25 - 1][var4];
                            }
                            for (class375 var31 = class565.field8185[var3][var5 + 1][var4]; var26 < class439.field6264 && var31 != null && var31.field5436 < 0 && var6.field5436 == var31.field5436 && var6.field5437 == var31.field5437 && class491.field7079[var3].method2087(62, var26 + 1, var4) == var30 && (var26 + 1 >= class439.field6264 || var30 == class491.field7079[var3].method2087(122, var26 + 2, var4)); var31 = class565.field8185[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class491.field7079[var7 ? var3 + 1 : var3].method2087(99, var25, var4);
                            int var34 = var6.field5436 * var32 + var33;
                            int var35 = class491.field7079[var7 ? var3 + 1 : var3].method2087(127, var26 + 1, var4);
                            int var36 = var35 + (var6.field5436 * var32);
                            int var37 = var25 << class639.field9095;
                            int var38 = (var26 << class639.field9095) + class150.field2190;
                            int var39 = var4 << class639.field9095;
                            class633.field8932[class311.field4226++] = new class151(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field5437 + var39, var6.field5437 + var39, var6.field5437 + var39, var6.field5437 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class565.field8185[var40][var41][var4].field5436 = (short) (class565.field8185[var40][var41][var4].field5436 * -1);
                                }
                            }
                        }
                    }
                }
            }
            var3++;
        }
        class704.field9921 = true;
    }

    @OriginalMember(owner = "client!rf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10444++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Z")
    public static final boolean method4176(int arg0) {
        field10447++;
        if (arg0 != 2) {
            method4176(-60);
        }
        return class249.field3628 != 0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)I")
    public static final int method4177(int arg0, int arg1, int arg2, int arg3) {
        field10446++;
        if (arg0 != 1970794817) {
            field10449 = -11;
        }
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        return ((arg1 & 0xFF) >> 2 << 10) + (arg2 >> 1) + (arg3 >> 5 << 7);
    }
}
