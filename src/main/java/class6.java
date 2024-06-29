import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class47 {

    @OriginalMember(owner = "client!ae", name = "Zc", descriptor = "I")
    public static int field149 = 0;

    @OriginalMember(owner = "client!ae", name = "id", descriptor = "I")
    public static int field158 = -1;

    @OriginalMember(owner = "client!ae", name = "jd", descriptor = "Lgg;")
    public static class63 field159 = class116.method911(43, "Null");

    @OriginalMember(owner = "client!ae", name = "gd", descriptor = "B")
    public static byte field156 = 0;

    @OriginalMember(owner = "client!ae", name = "ld", descriptor = "Lgg;")
    public static class63 field161 = class116.method911(43, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!ae", name = "bd", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ae", name = "cd", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ae", name = "dd", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ae", name = "ed", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ae", name = "fd", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ae", name = "hd", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ae", name = "kd", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ae", name = "ad", descriptor = "Lcg;")
    public class28 field150;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public static final void method91(int arg0, int arg1) {
        ++field154;
        if (class144.method1026((byte) -124, arg1)) {
            class54[] var2 = class23.field539[arg1];
            int var3 = 0;
            if (arg0 >= 61) {
                while (~var2.length < ~var3) {
                    class54 var4 = var2[var3];
                    if (var4 != null) {
                        var4.field1307 = 0;
                        var4.field1429 = 0;
                    }
                    ++var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V")
    public static void method92(byte arg0) {
        field161 = null;
        field159 = null;
        if (arg0 >= -55) {
            method93((byte) -98, 61, 2, (class54) null, -48, -59, (class200) null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIILff;IILwb;)V")
    public static final void method93(byte arg0, int arg1, int arg2, class54 arg3, int arg4, int arg5, class200 arg6) {
        ++field151;
        if (arg6 != null) {
            int var7 = class68.field1710 + class121.field2690 & 2047;
            int var8 = Math.max(arg3.field1302 / 2, arg3.field1435 / 2) + 10;
            int var9 = arg1 * arg1 + arg4 * arg4;
            if (~(var8 * var8) <= ~var9) {
                int var10 = class25.field571[var7];
                int var11 = class25.field576[var7];
                if (arg0 != -54) {
                    field161 = null;
                }
                int var12 = var11 * 256 / (class199.field3977 - -256);
                int var13 = var10 * 256 / (class199.field3977 + 256);
                int var14 = arg1 * var12 + -(arg4 * var13) >> 16;
                int var15 = arg1 * var13 - -(arg4 * var12) >> 16;
                arg6.method1318(arg2 - -var15 + arg3.field1302 / 2 + -(arg6.field3991 / 2), arg3.field1435 / 2 + arg5 + -var14 + -(arg6.field3989 / 2), arg3.field1413, arg3.field1310);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(Z)V")
    public static final void method94(boolean arg0) {
        class18.field430 = false;
        ++field155;
        if (!arg0) {
            method93((byte) 16, -31, -31, (class54) null, -15, 121, (class200) null);
        }
        class198.field3964 = false;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field153;
        if (this.field150 != null) {
            class9 var11 = ~super.field1167 != 0 && ~super.field1152 == -1 ? class49.method480(1000, super.field1167) : null;
            class9 var12 = ~super.field1108 == 0 || super.field1110 == super.field1108 && var11 != null ? null : class49.method480(1000, super.field1108);
            class36 var13 = this.field150.method275(var11, super.field1097, super.field1119, var12, 64);
            if (var13 != null) {
                var13.method331();
                super.field728 = var13.field728;
                if (~this.field150.field649 != -1 && ~this.field150.field640 != -1) {
                    int var14 = class25.field571[arg0];
                    short var15 = this.field150.field649;
                    int var16 = class25.field576[arg0];
                    int var17 = -var15 / 2;
                    short var18 = this.field150.field640;
                    int var19 = -var18 / 2;
                    int var20 = var16 * var19 + -(var14 * var17) >> 16;
                    int var21 = var14 * var19 + var16 * var17 >> 16;
                    int var22 = class112.method894(-109, class112.field2528, super.field1141 + var21, super.field1144 + var20);
                    int var23 = var15 / 2;
                    int var24 = -var18 / 2;
                    int var25 = var14 * var24 - -(var16 * var23) >> 16;
                    int var26 = var16 * var24 + -(var14 * var23) >> 16;
                    int var27 = class112.method894(-111, class112.field2528, super.field1141 + var25, super.field1144 + var26);
                    int var28 = -var15 / 2;
                    int var29 = var18 / 2;
                    int var30 = var16 * var29 + -(var14 * var28) >> 16;
                    int var31 = var14 * var29 + var16 * var28 >> 16;
                    int var32 = class112.method894(-96, class112.field2528, super.field1141 - -var31, super.field1144 + var30);
                    int var33 = var15 / 2;
                    int var34 = var18 / 2;
                    int var35 = var16 * var34 + -(var14 * var33) >> 16;
                    int var36 = var14 * var34 + var16 * var33 >> 16;
                    int var37 = class112.method894(-125, class112.field2528, super.field1141 + var36, super.field1144 + var35);
                    int var38 = ~var27 >= ~var22 ? var27 : var22;
                    int var39 = var32 < var37 ? var32 : var37;
                    int var40 = var22 < var32 ? var22 : var32;
                    int var41 = (int) (320.0D * Math.atan2((double) (-var39 + var38), (double) var18)) & 2047;
                    int var42 = ~var27 <= ~var37 ? var37 : var27;
                    int var43 = (var38 + var39 + var42 + var40) / 4;
                    var13.method329(var41);
                    int var44 = (int) (320.0D * Math.atan2((double) (-var42 + var40), (double) var15)) & 2047;
                    var13.method337(var44);
                    var13.method338(0, var43 - super.field1143, 0);
                }
                class36 var45 = null;
                if (super.field1135 != -1 && ~super.field1114 != 0) {
                    var45 = class19.method198(116, super.field1135).method464(-129, super.field1114);
                    if (var45 != null) {
                        var45.method338(0, -super.field1116, 0);
                    }
                }
                if (var45 != null) {
                    var13 = ((class66) var13).method622(var45);
                }
                if (this.field150.field647 == 1) {
                    var13.field843 = true;
                }
                var13.method95(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZILmc;IBII)V")
    public static final void method96(boolean arg0, int arg1, class111 arg2, int arg3, byte arg4, int arg5, int arg6) {
        long var7 = (long) ((arg6 << 16) + arg1);
        ++field152;
        class112 var9 = (class112) class168.field3475.method694(-23979, var7);
        if (var9 == null) {
            class112 var10 = (class112) class130.field2833.method694(-23979, var7);
            if (var10 == null) {
                class112 var11 = (class112) class162.field3336.method694(-23979, var7);
                if (var11 != null) {
                    if (arg0) {
                        var11.method962((byte) 28);
                        class168.field3475.method702((byte) 82, var11, var7);
                        ++class199.field3973;
                        --class45.field1074;
                    }
                } else {
                    if (!arg0) {
                        class112 var12 = (class112) class59.field1510.method694(-23979, var7);
                        if (var12 != null) {
                            return;
                        }
                    }
                    class112 var13 = new class112();
                    var13.field2520 = arg4;
                    if (arg3 == -641280144) {
                        var13.field2525 = arg2;
                        var13.field2527 = arg5;
                        if (!arg0) {
                            class134.field2908.method133(-101, var13);
                            class162.field3336.method702((byte) 87, var13, var7);
                            ++class45.field1074;
                        } else {
                            class168.field3475.method702((byte) 88, var13, var7);
                            ++class199.field3973;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Z")
    public final boolean method97(int arg0) {
        if (arg0 != 4365) {
            return false;
        } else {
            ++field157;
            return this.field150 != null;
        }
    }
}
