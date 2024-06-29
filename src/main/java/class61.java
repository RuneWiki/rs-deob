import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class61 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1157 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "J")
    public long field1162;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lje;")
    public class61 field1158;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lje;")
    public class61 field1164;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Z")
    public final boolean method345(int arg0) {
        field1163++;
        if (this.field1158 == null) {
            return false;
        } else {
            int var2 = -121 % ((38 - arg0) / 43);
            return true;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILqk;JZ)V")
    public static final void method346(int arg0, int arg1, int arg2, int arg3, class51 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class140 var8 = new class140();
        var8.field2445 = arg4;
        var8.field2443 = arg1 * 128 + 64;
        var8.field2441 = arg2 * 128 + 64;
        var8.field2447 = arg3;
        var8.field2437 = arg5;
        if (class7.field122[arg0][arg1][arg2] == null) {
            class7.field122[arg0][arg1][arg2] = new class120(arg0, arg1, arg2);
        }
        class7.field122[arg0][arg1][arg2].field2129 = var8;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V")
    public static final void method347(long arg0, int arg1) {
        field1161++;
        if (arg1 != 1) {
            method347(42L, 83);
        }
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class47.method286(arg1 ^ 0x27F3DB51, arg0 - 1L);
            class47.method286(670292816, 1L);
        } else {
            class47.method286(670292816, arg0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method348(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = arg6;
        int var11 = arg1 - arg0;
        field1156++;
        int var12 = arg6 - arg0;
        int var13 = arg6 * arg6;
        int var14 = arg1 * arg1;
        int var15 = var12 * var12;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var15 << 1;
        int var20 = arg6 << 1;
        int var21 = (1 - var20) * var14 + var17;
        int var22 = var13 - ((var20 - 1) * var18);
        int var23 = var12 << 1;
        int var24 = var16 << 1;
        int var25 = (1 - var23) * var16 + var19;
        int var26 = var15 - ((var23 - 1) * var24);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var17 * 3;
        int var31 = var15 << 2;
        int var32 = (var20 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (arg6 - 1) * var28;
        int var35 = (var23 - 3) * var24;
        int var36 = var27;
        if (arg7 >= class188.field3398 && class239.field4321 >= arg7) {
            int[] var37 = class15.field268[arg7];
            int var38 = class83.method476(arg5, class31.field481, arg2 - arg1, class9.field173);
            int var39 = class83.method476(true, class31.field481, arg2 + arg1, class9.field173);
            int var40 = class83.method476(true, class31.field481, arg2 - var11, class9.field173);
            int var41 = class83.method476(true, class31.field481, arg2 + var11, class9.field173);
            class289.method1927(var37, arg4, var38, -92, var40);
            class289.method1927(var37, arg3, var40, -63, var41);
            class289.method1927(var37, arg4, var41, -61, var39);
        }
        if (!arg5) {
            return;
        }
        int var42 = (var12 - 1) * var29;
        int var43 = var31;
        while (var10 > 0) {
            if (var21 < 0) {
                while (var21 < 0) {
                    var21 += var30;
                    var22 += var36;
                    var9++;
                    var30 += var27;
                    var36 += var27;
                }
            }
            if (var22 < 0) {
                var22 += var36;
                var36 += var27;
                var9++;
                var21 += var30;
                var30 += var27;
            }
            var22 += -var32;
            var32 -= var28;
            var21 += -var34;
            boolean var44 = var12 >= var10;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var43;
                        var43 += var31;
                        var33 += var31;
                        var8++;
                    }
                }
                if (var26 < 0) {
                    var26 += var43;
                    var8++;
                    var25 += var33;
                    var43 += var31;
                    var33 += var31;
                }
                var25 += -var42;
                var42 -= var29;
                var26 += -var35;
                var35 -= var29;
            }
            var34 -= var28;
            var10--;
            int var45 = arg7 - var10;
            int var46 = arg7 + var10;
            if (var46 >= class188.field3398 && var45 <= class239.field4321) {
                int var47 = class83.method476(arg5, class31.field481, arg2 + var9, class9.field173);
                int var48 = class83.method476(true, class31.field481, arg2 - var9, class9.field173);
                if (var44) {
                    int var49 = class83.method476(true, class31.field481, arg2 + var8, class9.field173);
                    int var50 = class83.method476(true, class31.field481, arg2 - var8, class9.field173);
                    if (var45 >= class188.field3398) {
                        int[] var51 = class15.field268[var45];
                        class289.method1927(var51, arg4, var48, -86, var50);
                        class289.method1927(var51, arg3, var50, -73, var49);
                        class289.method1927(var51, arg4, var49, -73, var47);
                    }
                    if (class239.field4321 >= var46) {
                        int[] var52 = class15.field268[var46];
                        class289.method1927(var52, arg4, var48, -84, var50);
                        class289.method1927(var52, arg3, var50, -67, var49);
                        class289.method1927(var52, arg4, var49, -62, var47);
                    }
                } else {
                    if (class188.field3398 <= var45) {
                        class289.method1927(class15.field268[var45], arg4, var48, -98, var47);
                    }
                    if (var46 <= class239.field4321) {
                        class289.method1927(class15.field268[var46], arg4, var48, -100, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public final void method349(int arg0) {
        field1160++;
        if (this.field1158 == null) {
            return;
        }
        this.field1158.field1164 = this.field1164;
        if (arg0 != 0) {
            this.field1164 = null;
        }
        this.field1164.field1158 = this.field1158;
        this.field1164 = null;
        this.field1158 = null;
    }
}
