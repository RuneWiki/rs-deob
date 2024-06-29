import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class220 extends class30 {

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lrd;")
    private static class173 field4234 = class133.method843("Connecting to update server", -95);

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "Lrd;")
    public static class173 field4233 = class133.method843("zur-Uck auf die RuneScape)2Webseite gehen", -114);

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "Lrd;")
    public static class173 field4229 = field4234;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Lrd;")
    public static class173 field4238 = class133.method843("Lade Wordpack )2 ", -117);

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "Lrd;")
    private static class173 field4239 = class133.method843(" seconds)3", -88);

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "Lrd;")
    public static class173 field4237 = field4239;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lrd;")
    public static class173 field4230 = class133.method843("Diese Welt ist voll)3", -100);

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "B")
    public byte field4228;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "La;")
    public class1 field4232;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
    public static final void method1433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4240++;
        for (class87 var5 = (class87) class35.field757.method915(-1); var5 != null; var5 = (class87) class35.field757.method910((byte) 88)) {
            if (var5.field1680 != -1 || var5.field1697 != null) {
                int var6 = 0;
                if (arg3 > var5.field1701) {
                    var6 += arg3 - var5.field1701;
                } else if (var5.field1683 > arg3) {
                    var6 += var5.field1683 - arg3;
                }
                if (arg4 > var5.field1678) {
                    var6 += arg4 - var5.field1678;
                } else if (var5.field1687 > arg4) {
                    var6 += var5.field1687 - arg4;
                }
                if (var5.field1679 < var6 - 64 || class31.field667 == 0 || var5.field1700 != arg0) {
                    if (var5.field1704 != null) {
                        class171.field3308.method686(var5.field1704);
                        var5.field1704 = null;
                    }
                    if (var5.field1705 != null) {
                        class171.field3308.method686(var5.field1705);
                        var5.field1705 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1679 - var6) * class31.field667 / var5.field1679;
                    if (var5.field1704 != null) {
                        var5.field1704.method935(var7);
                    } else if (var5.field1680 >= 0) {
                        class154 var8 = class154.method1017(class74.field1444, var5.field1680, 0);
                        if (var8 != null) {
                            class142 var9 = var8.method1016().method901(class182.field3573);
                            class146 var10 = class146.method955(var9, 100, var7);
                            var10.method944(-1);
                            class171.field3308.method685(var10);
                            var5.field1704 = var10;
                        }
                    }
                    if (var5.field1705 != null) {
                        var5.field1705.method935(var7);
                        if (!var5.field1705.method822(327)) {
                            var5.field1705 = null;
                        }
                    } else if (var5.field1697 != null && (var5.field1689 -= arg2) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field1697.length);
                        class154 var12 = class154.method1017(class74.field1444, var5.field1697[var11], 0);
                        if (var12 != null) {
                            class142 var13 = var12.method1016().method901(class182.field3573);
                            class146 var14 = class146.method955(var13, 100, var7);
                            var14.method944(0);
                            class171.field3308.method685(var14);
                            var5.field1689 = (int) (Math.random() * (double) (var5.field1681 - var5.field1702)) + var5.field1702;
                            var5.field1705 = var14;
                        }
                    }
                }
            }
        }
        if (arg1 != 0) {
            field4233 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ILqf;)Z")
    public static final boolean method1434(int arg0, class165 arg1) {
        if (arg0 != 28267) {
            return true;
        }
        field4231++;
        if (arg1.field3169 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field3169.length; var2++) {
            int var3 = class149.method981((byte) 124, arg1, var2);
            int var4 = arg1.field3154[var2];
            if (arg1.field3169[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field3169[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field3169[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = arg1;
        field4235++;
        int var11 = arg0 - arg3;
        int var12 = arg1 - arg3;
        int var13 = arg0 * arg0;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        if (arg2 != 814691650) {
            field4229 = null;
        }
        int var21 = var12 << 1;
        int var22 = arg1 << 1;
        int var23 = (1 - var22) * var13 + var17;
        int var24 = (1 - var21) * var15 + var19;
        int var25 = var16 - (var21 - 1) * var20;
        int var26 = var13 << 2;
        int var27 = var15 << 2;
        int var28 = var16 << 2;
        int var29 = var14 << 2;
        int var30 = var17 * 3;
        int var31 = var14 - (var22 - 1) * var18;
        int var32 = (var22 - 3) * var18;
        int var33 = (var21 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = var29;
        int var36 = (arg1 - 1) * var26;
        int var37 = var28;
        int var38 = (var12 - 1) * var27;
        int[] var39 = class107.field1998[arg6];
        class51.method350(arg5 - arg0, arg4, (byte) -121, var39, arg5 - var11);
        class51.method350(arg5 - var11, arg7, (byte) -118, var39, arg5 + var11);
        class51.method350(arg5 + var11, arg4, (byte) -118, var39, arg5 + arg0);
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var30;
                    var30 += var29;
                    var8++;
                    var31 += var35;
                    var35 += var29;
                }
            }
            if (var31 < 0) {
                var23 += var30;
                var30 += var29;
                var31 += var35;
                var35 += var29;
                var8++;
            }
            var23 += -var36;
            var31 += -var32;
            var36 -= var26;
            boolean var40 = var12 >= var10;
            var10--;
            int var41 = arg6 + var10;
            var32 -= var26;
            int var42 = arg6 - var10;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var34;
                        var9++;
                        var34 += var28;
                        var25 += var37;
                        var37 += var28;
                    }
                }
                if (var25 < 0) {
                    var25 += var37;
                    var24 += var34;
                    var9++;
                    var37 += var28;
                    var34 += var28;
                }
                var25 += -var33;
                var33 -= var27;
                var24 += -var38;
                var38 -= var27;
            }
            int var43 = arg5 + var8;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 + var9;
                int var46 = arg5 - var9;
                class51.method350(var44, arg4, (byte) -118, class107.field1998[var42], var46);
                class51.method350(var46, arg7, (byte) -122, class107.field1998[var42], var45);
                class51.method350(var45, arg4, (byte) -122, class107.field1998[var42], var43);
                class51.method350(var44, arg4, (byte) -119, class107.field1998[var41], var46);
                class51.method350(var46, arg7, (byte) -124, class107.field1998[var41], var45);
                class51.method350(var45, arg4, (byte) -123, class107.field1998[var41], var43);
            } else {
                class51.method350(var44, arg4, (byte) -120, class107.field1998[var42], var43);
                class51.method350(var44, arg4, (byte) -126, class107.field1998[var41], var43);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public static void method1436(int arg0) {
        field4239 = null;
        field4233 = null;
        field4229 = null;
        field4230 = null;
        field4234 = null;
        if (arg0 != -3) {
            field4233 = null;
        }
        field4238 = null;
        field4237 = null;
    }
}
