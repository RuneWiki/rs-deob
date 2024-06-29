import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class196 {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    private int field2331 = 0;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Ltm;")
    private class349 field2332;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field2329 = 104;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field2330 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lpn;")
    private class43 field2325;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIBIIII)V", line = 9)
    public static final void method1215(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2326++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg4 - arg6;
        int var12 = arg2 - arg6;
        int var13 = arg4 * arg4;
        int var14 = arg2 * arg2;
        int var15 = -76 % ((arg3 - 85) / 41);
        int var16 = var11 * var11;
        int var17 = var12 * var12;
        int var18 = var14 << 1;
        int var19 = var13 << 1;
        int var20 = var17 << 1;
        int var21 = var16 << 1;
        int var22 = arg2 << 1;
        int var23 = var12 << 1;
        int var24 = (1 - var22) * var13 + var18;
        int var25 = var14 - ((var22 - 1) * var19);
        int var26 = (1 - var23) * var16 + var20;
        int var27 = var17 - ((var23 - 1) * var21);
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var17 << 2;
        int var32 = var18 * 3;
        int var33 = (var22 - 3) * var19;
        int var34 = var20 * 3;
        int var35 = (var23 - 3) * var21;
        int var36 = var29;
        int var37 = (arg2 - 1) * var28;
        int var38 = var31;
        if (class53.field624 <= arg7 && arg7 <= class118.field1356) {
            int[] var39 = class228.field2877[arg7];
            int var40 = class65.method376(class295.field3937, class427.field5844, arg1 - arg4, (byte) 107);
            int var41 = class65.method376(class295.field3937, class427.field5844, arg1 + arg4, (byte) -51);
            int var42 = class65.method376(class295.field3937, class427.field5844, arg1 - var11, (byte) 86);
            int var43 = class65.method376(class295.field3937, class427.field5844, arg1 + var11, (byte) -44);
            class384.method2394(arg0, 118, var39, var42, var40);
            class384.method2394(arg5, 103, var39, var43, var42);
            class384.method2394(arg0, 120, var39, var41, var43);
        }
        int var44 = (var12 - 1) * var30;
        while (var9 > 0) {
            boolean var45 = var9 <= var12;
            if (var45) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var27 += var38;
                        var26 += var34;
                        var38 += var31;
                        var10++;
                        var34 += var31;
                    }
                }
                if (var27 < 0) {
                    var27 += var38;
                    var26 += var34;
                    var34 += var31;
                    var10++;
                    var38 += var31;
                }
                var26 += -var44;
                var27 += -var35;
                var35 -= var30;
                var44 -= var30;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var25 += var36;
                    var24 += var32;
                    var8++;
                    var36 += var29;
                    var32 += var29;
                }
            }
            if (var25 < 0) {
                var25 += var36;
                var24 += var32;
                var36 += var29;
                var8++;
                var32 += var29;
            }
            var24 += -var37;
            var25 += -var33;
            var9--;
            var33 -= var28;
            var37 -= var28;
            int var46 = arg7 - var9;
            int var47 = arg7 + var9;
            if (class53.field624 <= var47 && class118.field1356 >= var46) {
                int var48 = class65.method376(class295.field3937, class427.field5844, arg1 + var8, (byte) 117);
                int var49 = class65.method376(class295.field3937, class427.field5844, arg1 - var8, (byte) -86);
                if (var45) {
                    int var50 = class65.method376(class295.field3937, class427.field5844, arg1 + var10, (byte) 122);
                    int var51 = class65.method376(class295.field3937, class427.field5844, arg1 - var10, (byte) 110);
                    if (var46 >= class53.field624) {
                        int[] var52 = class228.field2877[var46];
                        class384.method2394(arg0, 127, var52, var51, var49);
                        class384.method2394(arg5, 116, var52, var50, var51);
                        class384.method2394(arg0, 116, var52, var48, var50);
                    }
                    if (class118.field1356 >= var47) {
                        int[] var53 = class228.field2877[var47];
                        class384.method2394(arg0, 98, var53, var51, var49);
                        class384.method2394(arg5, 103, var53, var50, var51);
                        class384.method2394(arg0, 123, var53, var48, var50);
                    }
                } else {
                    if (class53.field624 <= var46) {
                        class384.method2394(arg0, 114, class228.field2877[var46], var48, var49);
                    }
                    if (class118.field1356 >= var47) {
                        class384.method2394(arg0, 112, class228.field2877[var47], var48, var49);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lpn;", line = 212)
    public final class43 method1216(int arg0) {
        field2327++;
        if (arg0 >= -111) {
            this.field2331 = 102;
        }
        this.field2331 = 0;
        return this.method1217((byte) 49);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Lpn;", line = 228)
    public final class43 method1217(byte arg0) {
        if (arg0 != 49) {
            return null;
        }
        field2328++;
        if (this.field2331 > 0 && this.field2332.field4751[this.field2331 - 1] != this.field2325) {
            class43 var2 = this.field2325;
            this.field2325 = var2.field508;
            return var2;
        }
        while (this.field2332.field4742 > this.field2331) {
            class43 var3 = this.field2332.field4751[this.field2331++].field508;
            if (this.field2332.field4751[this.field2331 - 1] != var3) {
                this.field2325 = var3.field508;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Ltm;)V", line = 269)
    public class196(class349 arg0) {
        this.field2332 = arg0;
    }
}
