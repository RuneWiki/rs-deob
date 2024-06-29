import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class237 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Z")
    public boolean field4103 = true;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public int field4117;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lub;")
    public static class227 field4104 = class257.method1749("http:)4)4", 17263);

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Lub;")
    public static class227 field4111 = class257.method1749("Hidden)2use", 17263);

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lub;")
    public static class227 field4116 = class257.method1749("null", 17263);

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "Lub;")
    public static class227 field4118 = class257.method1749("mapfunction", 17263);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method1577(byte arg0) {
        field4104 = null;
        field4118 = null;
        field4116 = null;
        int var1 = 101 % ((7 - arg0) / 46);
        field4111 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field4107++;
        int var9 = arg7;
        int var10 = arg3 - arg0;
        int var11 = arg7 - arg0;
        int var12 = 0;
        int var13 = arg7 * arg7;
        int var14 = arg3 * arg3;
        int var15 = var13 << 1;
        int var16 = var10 * var10;
        int var17 = var11 * var11;
        int var18 = var16 << 1;
        int var19 = var14 << 1;
        int var20 = var17 << 1;
        int var21 = arg7 << 1;
        int var22 = var13 - ((var21 - 1) * var19);
        int var23 = var11 << 1;
        int var24 = (1 - var23) * var16 + var20;
        int var25 = var17 - ((var23 - 1) * var18);
        int var26 = var14 << 2;
        int var27 = (1 - var21) * var14 + var15;
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var17 << 2;
        int var31 = var15 * 3;
        int var32 = (var21 - 3) * var19;
        int var33 = (var23 - 3) * var18;
        int var34 = var20 * 3;
        int var35 = var28;
        int var36 = (arg7 - 1) * var26;
        int var37 = var30;
        int[] var38 = class59.field1094[arg6];
        class246.method1644(arg2, var38, arg1 - var10, -arg3 + arg1, 1);
        int var39 = (var11 - 1) * var29;
        if (arg5 != 22069) {
            return;
        }
        class246.method1644(arg4, var38, arg1 + var10, -var10 + arg1, 1);
        class246.method1644(arg2, var38, arg1 + arg3, arg1 + var10, 1);
        while (var9 > 0) {
            if (var27 < 0) {
                while (var27 < 0) {
                    var22 += var35;
                    var35 += var28;
                    var27 += var31;
                    var31 += var28;
                    var8++;
                }
            }
            if (var22 < 0) {
                var22 += var35;
                var8++;
                var27 += var31;
                var35 += var28;
                var31 += var28;
            }
            var27 += -var36;
            var22 += -var32;
            var32 -= var26;
            boolean var40 = var11 >= var9;
            int var41 = arg1 + var8;
            var36 -= var26;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var25 += var37;
                        var24 += var34;
                        var12++;
                        var37 += var30;
                        var34 += var30;
                    }
                }
                if (var25 < 0) {
                    var24 += var34;
                    var12++;
                    var34 += var30;
                    var25 += var37;
                    var37 += var30;
                }
                var24 += -var39;
                var39 -= var29;
                var25 += -var33;
                var33 -= var29;
            }
            var9--;
            int var42 = arg6 + var9;
            int var43 = arg1 - var8;
            int var44 = arg6 - var9;
            if (var40) {
                int var45 = arg1 + var12;
                int var46 = arg1 - var12;
                class246.method1644(arg2, class59.field1094[var44], var46, var43, 1);
                class246.method1644(arg4, class59.field1094[var44], var45, var46, 1);
                class246.method1644(arg2, class59.field1094[var44], var41, var45, 1);
                class246.method1644(arg2, class59.field1094[var42], var46, var43, 1);
                class246.method1644(arg4, class59.field1094[var42], var45, var46, arg5 - 22068);
                class246.method1644(arg2, class59.field1094[var42], var41, var45, 1);
            } else {
                class246.method1644(arg2, class59.field1094[var44], var41, var43, 1);
                class246.method1644(arg2, class59.field1094[var42], var41, var43, 1);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static final void method1579(boolean arg0) {
        class236.field4094 = 0;
        field4108++;
        class147.field2572 = 0;
        class27.method134(36);
        class145.method910((byte) -4);
        class214.method1358(-95);
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < class236.field4094; var1++) {
            int var3 = class8.field164[var1];
            if (class253.field4393 != class220.field3715[var3].field73) {
                if (class220.field3715[var3].field3315.method930((byte) 92)) {
                    class188.method1197(false, class220.field3715[var3]);
                }
                class220.field3715[var3].field3315 = null;
                class220.field3715[var3] = null;
            }
        }
        if (class179.field3073 != class32.field512.field3879) {
            throw new RuntimeException("gnp1 pos:" + class32.field512.field3879 + " psize:" + class179.field3073);
        }
        for (int var2 = 0; var2 < class71.field1254; var2++) {
            if (class220.field3715[class146.field2517[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class71.field1254);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Z")
    public static final boolean method1580(int arg0, int arg1, int arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        field4109++;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        if (arg2 != 4) {
            field4104 = null;
        }
        class45 var3 = class220.method1389(arg0, (byte) -128);
        return var3.method241(arg1, arg2 ^ 0x78E1);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
    public static final void method1581(int arg0, int arg1, int arg2) {
        class152 var3 = class175.method1119(128, arg2);
        if (arg0 > -21) {
            return;
        }
        int var4 = var3.field2647;
        field4102++;
        int var5 = var3.field2642;
        int var6 = var3.field2640;
        int var7 = class200.field3425[var5 - var6];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class204.method1308(var4, (byte) 45, ~var8 & class139.field2416[var4] | arg1 << var6 & var8);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BJ)Lub;")
    public static final class227 method1582(byte arg0, long arg1) {
        int var3 = 84 / ((arg0 + 35) / 55);
        field4110++;
        return class14.method67(false, 10, -2, arg1);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4105 = arg1;
        this.field4117 = arg3;
        this.field4106 = arg0;
        this.field4112 = arg4;
        this.field4114 = arg5;
        this.field4113 = arg2;
        this.field4103 = arg6;
    }
}
