import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class257 {

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field4419 = -1;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lhi;")
    public static class82 field4420 = class95.method664((byte) -113, "Votre liste noire est pleine (X100 noms maximum(Y)3");

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field4423 = -1;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "[I")
    public static int[] field4415 = new int[4];

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Lhi;")
    public static class82 field4426 = class95.method664((byte) -78, ":assistreq:");

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Z")
    public static boolean field4414 = false;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lme;I)V", line = 5)
    public static final void method1839(class75 arg0, int arg1) {
        field4422++;
        if (arg1 != -1) {
            method1840(false, 7, 110);
        }
        class75 var2 = class38.method295(1860, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class260.field4462;
            var4 = class180.field3078;
        } else {
            var4 = var2.field1205;
            var3 = var2.field1216;
        }
        class187.method1291(arg0, (byte) -7, var4, var3, false);
        class200.method1405(var3, (byte) 44, arg0, var4);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZII)Lme;", line = 40)
    public static final class75 method1840(boolean arg0, int arg1, int arg2) {
        class75 var3 = class282.method1965(arg1, (byte) 6);
        field4417++;
        if (arg2 == -1) {
            return var3;
        } else {
            if (arg0) {
                field4415 = (int[]) null;
            }
            return var3 == null || var3.field1274 == null || arg2 >= var3.field1274.length ? null : var3.field1274[arg2];
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)V", line = 65)
    public static final void method1841(byte arg0, int arg1) {
        class28.field388 = new int[arg1];
        class224.field3892 = new int[arg1];
        field4418++;
        class98.field1775 = new int[arg1];
        if (arg0 != 51) {
            field4420 = (class82) null;
        }
        class291.field4883 = new int[arg1];
        class44.field761 = new int[arg1];
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 93)
    public static void method1842(int arg0) {
        field4426 = null;
        if (arg0 == 24745) {
            field4420 = null;
            field4415 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZIIII)Ljf;", line = 112)
    public static final class86 method1843(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4425++;
        int var7 = arg2 + ((arg1 ? 65536 : 0) - (-(arg3 << 17) - (arg4 << 19)));
        if (arg0 != 1114) {
            field4415 = (int[]) null;
        }
        long var8 = (long) arg5 * 3147483667L + ((long) var7 * 3849834839L);
        class86 var10 = (class86) class189.field3166.method2175(var8, arg0 ^ 0xF9A);
        if (var10 != null) {
            return var10;
        }
        class102.field1812 = false;
        class86 var11 = class136.method928(arg4, (byte) 127, arg2, false, false, arg5, arg3, arg1);
        if (var11 != null && !class102.field1812) {
            class189.field3166.method2169(var11, var8, (byte) 94);
        }
        return var11;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIZI)V", line = 146)
    public static final void method1844(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        field4416++;
        int var11 = arg1 - arg0;
        int var12 = arg7 - arg0;
        int var13 = arg1 * arg1;
        int var14 = var11 * var11;
        int var15 = arg7 * arg7;
        int var16 = var12 * var12;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = (1 - var21) * var13 + var20;
        int var23 = var12 << 1;
        int var24 = (1 - var23) * var14 + var19;
        int var25 = var15 - ((var21 - 1) * var17);
        int var26 = var16 - (var23 - 1) * var18;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var16 << 2;
        int var30 = var14 << 2;
        int var31 = var20 * 3;
        int var32 = (var21 - 3) * var17;
        int var33 = var19 * 3;
        if (arg6) {
            method1841((byte) -12, -74);
        }
        int var34 = var28;
        int var35 = (var23 - 3) * var18;
        int var36 = (arg7 - 1) * var27;
        int var37 = var29;
        int var38 = (var12 - 1) * var30;
        int[] var39 = class73.field1117[arg4];
        class114.method780(84, arg3 - arg1, -var11 + arg3, arg2, var39);
        class114.method780(127, arg3 - var11, arg3 - -var11, arg5, var39);
        class114.method780(89, arg3 + var11, arg1 + arg3, arg2, var39);
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var22 += var31;
                    var8++;
                    var25 += var34;
                    var34 += var28;
                    var31 += var28;
                }
            }
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var26 += var37;
                        var37 += var29;
                        var10++;
                        var24 += var33;
                        var33 += var29;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var37 += var29;
                    var24 += var33;
                    var10++;
                    var33 += var29;
                }
                var26 += -var35;
                var24 += -var38;
                var38 -= var30;
                var35 -= var30;
            }
            var9--;
            int var41 = arg4 - var9;
            if (var25 < 0) {
                var22 += var31;
                var8++;
                var25 += var34;
                var34 += var28;
                var31 += var28;
            }
            var22 += -var36;
            var36 -= var27;
            int var42 = arg3 - var8;
            int var43 = arg3 + var8;
            var25 += -var32;
            int var44 = arg4 + var9;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class114.method780(87, var42, var46, arg2, class73.field1117[var41]);
                class114.method780(105, var46, var45, arg5, class73.field1117[var41]);
                class114.method780(-63, var45, var43, arg2, class73.field1117[var41]);
                class114.method780(104, var42, var46, arg2, class73.field1117[var44]);
                class114.method780(101, var46, var45, arg5, class73.field1117[var44]);
                class114.method780(105, var45, var43, arg2, class73.field1117[var44]);
            } else {
                class114.method780(87, var42, var43, arg2, class73.field1117[var41]);
                class114.method780(81, var42, var43, arg2, class73.field1117[var44]);
            }
            var32 -= var27;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([BI)V")
    public abstract void method2(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1(int arg0);
}
