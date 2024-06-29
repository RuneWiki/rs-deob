import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class457 {

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    private int field6285 = 0;

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "I")
    private int field6294 = 0;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    private int field6282 = 0;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "Lep;")
    private class371 field6288;

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "Lfa;")
    private class565 field6298;

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "[Leha;")
    private class165[] field6291;

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "Lfn;")
    public class233 field6289;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "Z")
    public static boolean field6283 = false;

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "I")
    public static int field6296 = 0;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field6286;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)Z")
    public final boolean method2742(byte arg0, int arg1) {
        field6292++;
        if (arg0 != -94) {
            method2743(-99);
        }
        return this.field6291[arg1].method672((byte) 60);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
    public static final void method2743(int arg0) {
        field6287++;
        class352.field4523.method3210(false);
        if (arg0 == -1423170879) {
            class555.field7836.method3210(false);
            class678.field9542.method3210(false);
            class694.field9695.method3210(false);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method2744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field6284++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg0 - arg2;
        int var12 = arg4 - arg2;
        int var13 = arg0 * arg0;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        if (!arg6) {
            field6297 = -96;
        }
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class675.field9512 <= arg7 && arg7 <= class395.field5484) {
            int[] var39 = class591.field8480[arg7];
            int var40 = class325.method1901(arg3 - arg0, class490.field6592, class116.field1628, arg6);
            int var41 = class325.method1901(arg0 + arg3, class490.field6592, class116.field1628, true);
            int var42 = class325.method1901(arg3 - var11, class490.field6592, class116.field1628, arg6);
            int var43 = class325.method1901(arg3 + var11, class490.field6592, class116.field1628, true);
            class721.method4044(var39, var40, (byte) -121, var42, arg1);
            class721.method4044(var39, var42, (byte) -119, var43, arg5);
            class721.method4044(var39, var43, (byte) -122, var41, arg1);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
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
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (class675.field9512 <= var46 && class395.field5484 >= var45) {
                int var47 = class325.method1901(arg3 + var8, class490.field6592, class116.field1628, arg6);
                int var48 = class325.method1901(arg3 - var8, class490.field6592, class116.field1628, arg6);
                if (var44) {
                    int var49 = class325.method1901(arg3 + var10, class490.field6592, class116.field1628, true);
                    int var50 = class325.method1901(arg3 - var10, class490.field6592, class116.field1628, true);
                    if (class675.field9512 <= var45) {
                        int[] var51 = class591.field8480[var45];
                        class721.method4044(var51, var48, (byte) -126, var50, arg1);
                        class721.method4044(var51, var50, (byte) -121, var49, arg5);
                        class721.method4044(var51, var49, (byte) -119, var47, arg1);
                    }
                    if (var46 <= class395.field5484) {
                        int[] var52 = class591.field8480[var46];
                        class721.method4044(var52, var48, (byte) -128, var50, arg1);
                        class721.method4044(var52, var50, (byte) -127, var49, arg5);
                        class721.method4044(var52, var49, (byte) -121, var47, arg1);
                    }
                } else {
                    if (class675.field9512 <= var45) {
                        class721.method4044(class591.field8480[var45], var48, (byte) -128, var47, arg1);
                    }
                    if (class395.field5484 >= var46) {
                        class721.method4044(class591.field8480[var46], var48, (byte) -120, var47, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZIIIZ)V")
    public final void method2745(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 != 9) {
            field6296 = 77;
        }
        boolean var7 = arg1 & this.field6288.method2170();
        field6293++;
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg4 = arg0;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg5) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field6294 != arg2) {
            if (this.field6294 != 0) {
                this.field6291[Integer.MAX_VALUE & this.field6294].method679((byte) -111);
            }
            if (arg2 != 0) {
                this.field6291[Integer.MAX_VALUE & arg2].method673(arg3 - 129, arg5);
                this.field6291[arg2 & Integer.MAX_VALUE].method678(arg5, 0);
                this.field6291[arg2 & Integer.MAX_VALUE].method675(arg0, (byte) 56, arg4);
            }
            this.field6285 = arg4;
            this.field6294 = arg2;
            this.field6282 = arg0;
        } else if (this.field6294 != 0) {
            this.field6291[Integer.MAX_VALUE & this.field6294].method678(arg5, 0);
            if (this.field6282 != arg0 || this.field6285 != arg4) {
                this.field6291[this.field6294 & Integer.MAX_VALUE].method675(arg0, (byte) 98, arg4);
                this.field6282 = arg0;
                this.field6285 = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lhl;II)Z")
    public final boolean method2746(class396 arg0, int arg1, int arg2) {
        if (arg2 < 116) {
            field6296 = -118;
        }
        field6290++;
        if (this.field6294 == 0) {
            return false;
        } else {
            this.field6291[Integer.MAX_VALUE & this.field6294].method671(arg1, true, arg0);
            return true;
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lep;)V")
    public class457(class371 arg0) {
        this.field6288 = arg0;
        this.field6298 = new class565(arg0);
        this.field6291 = new class165[10];
        this.field6291[1] = new class664(arg0);
        this.field6291[2] = new class99(arg0, this.field6298);
        this.field6291[4] = new class593(arg0, this.field6298);
        this.field6291[5] = new class600(arg0, this.field6298);
        this.field6291[6] = new class689(arg0);
        this.field6291[7] = new class367(arg0);
        this.field6291[3] = this.field6289 = new class233(arg0);
        this.field6291[8] = new class661(arg0, this.field6298);
        this.field6291[9] = new class262(arg0, this.field6298);
        if (!this.field6291[8].method672((byte) 48)) {
            this.field6291[8] = this.field6291[4];
        }
        if (!this.field6291[9].method672((byte) 70)) {
            this.field6291[9] = this.field6291[8];
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V")
    public static void method2747(int arg0) {
        field6286 = null;
        if (arg0 != Integer.MAX_VALUE) {
            method2744(85, 53, 64, 110, -72, -88, false, -31);
        }
    }
}
