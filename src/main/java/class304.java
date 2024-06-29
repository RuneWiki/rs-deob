import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class304 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4735 = 0;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static volatile int field4737 = 0;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[J")
    public static long[] field4736 = new long[32];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[I")
    public static int[] field4734 = new int[500];

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
    public static int[] field4740 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
    public static int[] field4741;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 5)
    public static void method2143(int arg0) {
        if (arg0 == 0) {
            field4734 = null;
            field4736 = null;
            field4741 = null;
            field4740 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 20)
    public static final void method2144(byte arg0) {
        if (arg0 != 15) {
            method2144((byte) 28);
        }
        field4738++;
        if (class101.field1354 != null) {
            class296 var1 = class101.field1354;
            synchronized (class101.field1354) {
                class101.field1354 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZB)V", line = 63)
    public static final void method2145(boolean arg0, byte arg1) {
        for (class337 var2 = (class337) class250.field3968.method1812(1); var2 != null; var2 = (class337) class250.field3968.method1809(128)) {
            if (var2.field5386 != null) {
                class20.field239.method2339(var2.field5386);
                var2.field5386 = null;
            }
            if (var2.field5392 != null) {
                class20.field239.method2339(var2.field5392);
                var2.field5392 = null;
            }
            var2.method1290(-34);
        }
        field4739++;
        if (arg1 != 8) {
            method2143(-20);
        }
        if (!arg0) {
            return;
        }
        for (class337 var3 = (class337) class257.field4069.method1812(1); var3 != null; var3 = (class337) class257.field4069.method1809(128)) {
            if (var3.field5386 != null) {
                class20.field239.method2339(var3.field5386);
                var3.field5386 = null;
            }
            var3.method1290(-81);
        }
        for (class337 var4 = (class337) class168.field2574.method761(122); var4 != null; var4 = (class337) class168.field2574.method757(-1)) {
            if (var4.field5386 != null) {
                class20.field239.method2339(var4.field5386);
                var4.field5386 = null;
            }
            var4.method1290(96);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIBIIIII)V", line = 137)
    public static final void method2146(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field4733++;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg6 - arg7;
        int var12 = arg1 - arg7;
        int var13 = arg1 * arg1;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = arg1 << 1;
        int var21 = var15 << 1;
        int var22 = (1 - var20) * var14 + var17;
        int var23 = var12 << 1;
        int var24 = var16 - (var23 - 1) * var21;
        if (arg2 != -26) {
            return;
        }
        int var25 = var13 - ((var20 - 1) * var18);
        int var26 = var14 << 2;
        int var27 = (1 - var23) * var15 + var19;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var20 - 3) * var18;
        int var33 = (var23 - 3) * var21;
        int var34 = (arg1 - 1) * var26;
        int var35 = var28;
        int var36 = var19 * 3;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class244.field3844 <= arg0 && arg0 <= class2.field22) {
            int[] var39 = class347.field5501[arg0];
            int var40 = class112.method728(arg4 - arg6, class337.field5389, class344.field5460, arg2 ^ 0x67);
            int var41 = class112.method728(arg4 + arg6, class337.field5389, class344.field5460, -24);
            int var42 = class112.method728(arg4 - var11, class337.field5389, class344.field5460, -86);
            int var43 = class112.method728(arg4 + var11, class337.field5389, class344.field5460, -47);
            class278.method1986(var40, var39, arg3, var42, (byte) 96);
            class278.method1986(var42, var39, arg5, var43, (byte) -110);
            class278.method1986(var43, var39, arg3, var41, (byte) 37);
        }
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var22 += var31;
                    var31 += var28;
                    var25 += var35;
                    var35 += var28;
                    var8++;
                }
            }
            if (var25 < 0) {
                var25 += var35;
                var8++;
                var22 += var31;
                var31 += var28;
                var35 += var28;
            }
            var22 += -var34;
            var34 -= var26;
            var25 += -var32;
            boolean var44 = var9 <= var12;
            var32 -= var26;
            var9--;
            int var45 = arg0 + var9;
            int var46 = arg0 - var9;
            if (var44) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        var24 += var37;
                        var27 += var36;
                        var36 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var24 < 0) {
                    var24 += var37;
                    var27 += var36;
                    var10++;
                    var36 += var30;
                    var37 += var30;
                }
                var27 += -var38;
                var38 -= var29;
                var24 += -var33;
                var33 -= var29;
            }
            if (class244.field3844 <= var45 && class2.field22 >= var46) {
                int var47 = class112.method728(arg4 + var8, class337.field5389, class344.field5460, arg2 ^ 0x3F);
                int var48 = class112.method728(arg4 - var8, class337.field5389, class344.field5460, -97);
                if (var44) {
                    int var49 = class112.method728(arg4 + var10, class337.field5389, class344.field5460, -46);
                    int var50 = class112.method728(arg4 - var10, class337.field5389, class344.field5460, -114);
                    if (class244.field3844 <= var46) {
                        int[] var51 = class347.field5501[var46];
                        class278.method1986(var48, var51, arg3, var50, (byte) -73);
                        class278.method1986(var50, var51, arg5, var49, (byte) 112);
                        class278.method1986(var49, var51, arg3, var47, (byte) 40);
                    }
                    if (var45 <= class2.field22) {
                        int[] var52 = class347.field5501[var45];
                        class278.method1986(var48, var52, arg3, var50, (byte) -98);
                        class278.method1986(var50, var52, arg5, var49, (byte) -71);
                        class278.method1986(var49, var52, arg3, var47, (byte) -106);
                    }
                } else {
                    if (var46 >= class244.field3844) {
                        class278.method1986(var48, class347.field5501[var46], arg3, var47, (byte) -115);
                    }
                    if (var45 <= class2.field22) {
                        class278.method1986(var48, class347.field5501[var45], arg3, var47, (byte) -67);
                    }
                }
            }
        }
    }
}
