import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 extends class125 {

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public int field1405 = 0;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field1401 = -1;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "Loa;")
    public static class99 field1418 = class221.method1463(2844, "::clientdrop");

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "Lni;")
    public class153 field1411;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "Lgi;")
    public class156 field1420;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "Led;")
    public class183 field1403;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "Lp;")
    public class286 field1402;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "Lp;")
    public class286 field1425;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "Z")
    public boolean field1404;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "[I")
    public int[] field1407;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "[I")
    public static int[] field1416;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "[I")
    public static int[] field1421;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "[Lpi;")
    public static class139[] field1417;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "[Loa;")
    public static class99[] field1412;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public final void method554(int arg0) {
        field1406++;
        int var2 = this.field1426;
        if (this.field1411 != null) {
            class153 var5 = this.field1411.method1023(-119);
            if (var5 == null) {
                this.field1410 = 0;
                this.field1422 = 0;
                this.field1426 = -1;
                this.field1407 = null;
                this.field1419 = 0;
            } else {
                this.field1410 = var5.field2732 * 128;
                this.field1419 = var5.field2697;
                this.field1407 = var5.field2694;
                this.field1426 = var5.field2748;
                this.field1422 = var5.field2742;
            }
        } else if (this.field1420 != null) {
            int var3 = class30.method255(80, this.field1420);
            if (var2 != var3) {
                this.field1426 = var3;
                class257 var4 = this.field1420.field2793;
                if (var4.field4491 != null) {
                    var4 = var4.method1667(105);
                }
                if (var4 == null) {
                    this.field1410 = 0;
                } else {
                    this.field1410 = var4.field4462 * 128;
                }
            }
        } else if (this.field1403 != null) {
            this.field1426 = class281.method1852(true, this.field1403);
            this.field1410 = this.field1403.field3245 * 128;
        }
        if (this.field1426 != var2 && this.field1425 != null) {
            class165.field2899.method1076(this.field1425);
            this.field1425 = null;
        }
        if (arg0 != -30438) {
            this.field1405 = -116;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1414++;
        int var8 = arg3;
        int var9 = 0;
        int var10 = arg1 - arg0;
        int var11 = 0;
        int var12 = arg3 - arg0;
        int var13 = arg3 * arg3;
        int var14 = arg1 * arg1;
        int var15 = var12 * var12;
        int var16 = var13 << 1;
        int var17 = var10 * var10;
        int var18 = var14 << 1;
        int var19 = var15 << 1;
        int var20 = var17 << 1;
        int var21 = var12 << 1;
        int var22 = (1 - var21) * var17 + var19;
        int var23 = var14 << 2;
        int var24 = var15 - ((var21 - 1) * var20);
        int var25 = arg3 << 1;
        int var26 = var13 - ((var25 - 1) * var18);
        int var27 = var17 << 2;
        int var28 = (1 - var25) * var14 + var16;
        int var29 = var13 << 2;
        int var30 = var16 * 3;
        int var31 = (var25 - 3) * var18;
        int var32 = var15 << 2;
        int var33 = var19 * 3;
        int var34 = (var21 - 3) * var20;
        int var35 = var29;
        int var36 = (arg3 + arg4) * var23;
        int var37 = var32;
        int[] var38 = class124.field2177[arg5];
        class175.method1174(var38, arg7, -7, arg6 - arg1, -var10 + arg6);
        int var39 = (var12 - 1) * var27;
        class175.method1174(var38, arg2, -7, arg6 - var10, arg6 + var10);
        class175.method1174(var38, arg7, -7, arg6 + var10, arg1 + arg6);
        while (var8 > 0) {
            if (var28 < 0) {
                while (var28 < 0) {
                    var9++;
                    var26 += var35;
                    var28 += var30;
                    var35 += var29;
                    var30 += var29;
                }
            }
            if (var26 < 0) {
                var28 += var30;
                var30 += var29;
                var26 += var35;
                var9++;
                var35 += var29;
            }
            var26 += -var31;
            boolean var40 = var8 <= var12;
            if (var40) {
                if (var22 < 0) {
                    while (var22 < 0) {
                        var11++;
                        var22 += var33;
                        var24 += var37;
                        var33 += var32;
                        var37 += var32;
                    }
                }
                if (var24 < 0) {
                    var11++;
                    var24 += var37;
                    var22 += var33;
                    var37 += var32;
                    var33 += var32;
                }
                var24 += -var34;
                var22 += -var39;
                var34 -= var27;
                var39 -= var27;
            }
            var28 += -var36;
            var8--;
            var36 -= var23;
            int var41 = arg5 - var8;
            int var42 = arg6 + var9;
            int var43 = arg5 + var8;
            int var44 = arg6 - var9;
            var31 -= var23;
            if (var40) {
                int var45 = arg6 - var11;
                class175.method1174(class124.field2177[var41], arg7, -7, var44, var45);
                int var46 = arg6 + var11;
                class175.method1174(class124.field2177[var41], arg2, -7, var45, var46);
                class175.method1174(class124.field2177[var41], arg7, -7, var46, var42);
                class175.method1174(class124.field2177[var43], arg7, arg4 ^ 0x6, var44, var45);
                class175.method1174(class124.field2177[var43], arg2, -7, var45, var46);
                class175.method1174(class124.field2177[var43], arg7, -7, var46, var42);
            } else {
                class175.method1174(class124.field2177[var41], arg7, -7, var44, var42);
                class175.method1174(class124.field2177[var43], arg7, arg4 - 6, var44, var42);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
    public static void method556(byte arg0) {
        field1416 = null;
        field1417 = null;
        field1412 = null;
        field1421 = null;
        if (arg0 < 91) {
            method555(-66, -53, 27, 42, -22, -13, -128, 57);
        }
        field1418 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLtg;)V")
    public static final void method557(byte arg0, class182 arg1) {
        field1413++;
        if (class284.field4937 || arg0 != 56) {
            return;
        }
        class68.method456();
        class160.field2837 = class270.method1783(class99.field1681, (byte) -7, arg1);
        int var2 = class24.field373;
        int var3 = var2 * 956 / 503;
        class160.field2837.method30((class199.field3458 - var3) / 2, 0, var3, var2);
        class190.field3349 = class149.method1001(class105.field1760, (byte) -80, arg1);
        class190.field3349.method751(class199.field3458 / 2 - (class190.field3349.field3023 / 2), 18);
        class284.field4937 = true;
    }
}
