import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class537 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field7566 = -50;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lda;")
    public static class59 field7568;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method3143(int arg0) {
        field7568 = null;
        if (arg0 != -1418) {
            field7566 = -44;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z")
    public static final boolean method3144(int arg0) {
        field7570++;
        if (arg0 <= 81) {
            method3144(14);
        }
        return class611.field8839 >= 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static final void method3145(boolean arg0) {
        field7567++;
        class747[] var1 = class42.field638;
        synchronized (class42.field638) {
            for (int var2 = 0; var2 < class42.field638.length; var2++) {
                class42.field638[var2] = new class747();
                class248.field3476[var2] = 0;
            }
            if (!arg0) {
                method3146(-75);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static final void method3146(int arg0) {
        class28.field389 = new class66(class281.field3945.method1839((byte) 45, class744.field10426), "", class458.field6611, 1008, arg0, 0L, 0, 0, true, false, 0L, true);
        field7565++;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public static final void method3147(int arg0) {
        field7571++;
        if (arg0 == -16548) {
            class46.field677.method3234(arg0 ^ 0x278B);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILfd;Lha;Lnd;)Z")
    public static final boolean method3148(int arg0, int arg1, int arg2, class524 arg3, class58 arg4, class541 arg5) {
        field7569++;
        int var6 = arg2;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field7440 != null) {
            var9 = class542.field7641 - ((arg3.field7426 - (class542.field7634 - arg5.field7601)) * (class542.field7641 - class542.field7647) / (class542.field7635 - class542.field7634));
            var8 = class542.field7641 - ((arg3.field7433 + arg5.field7601 - class542.field7634) * (class542.field7641 - class542.field7647) / (class542.field7635 - class542.field7634));
            var7 = (class542.field7646 - class542.field7651) * (arg3.field7439 + arg5.field7597 - class542.field7648) / (class542.field7638 - class542.field7648) + class542.field7651;
            var6 = (arg3.field7435 + arg5.field7597 - class542.field7648) * (class542.field7646 - class542.field7651) / (class542.field7638 - class542.field7648) + class542.field7651;
        }
        class743 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg3.field7434 != -1) {
            if (arg5.field7598 && arg3.field7445 != -1) {
                var10 = arg3.method3104(true, 112, arg4);
            } else {
                var10 = arg3.method3104(false, 71, arg4);
            }
            if (var10 != null) {
                var11 = arg5.field7606 - (var10.method82() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg5.field7606 + (var10.method82() + 1 >> 1);
                var13 = arg5.field7602 - (var10.method83() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg5.field7602 + (var10.method83() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class664 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg3.field7425 != null) {
            var15 = class157.method1192(28340, arg3.field7457);
            if (var15 != null) {
                var16 = class119.field1867.method2070(119, null, null, class692.field9741, arg3.field7425);
                var17 = (class542.field7646 - class542.field7651) * arg3.field7455 / (class542.field7638 - class542.field7648) + arg5.field7606;
                int var24 = arg5.field7602 - ((class542.field7641 - class542.field7647) * arg3.field7429 / (class542.field7635 - class542.field7634));
                if (var10 == null) {
                    var18 = var24 - var15.method3735() * var16 / 2;
                } else {
                    var18 = var24 - ((var10.method83() >> 1) + (var15.method3732() * var16));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class692.field9741[var25];
                    if (var25 < (var16 - 1)) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method3733(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg1 - (var19 / 2);
                var21 = var19 / 2 + var17 + arg1;
                if (var6 > var20) {
                    var6 = var20;
                }
                if (var21 > var7) {
                    var7 = var21;
                }
                var22 = var18 + arg0;
                if (var22 < var8) {
                    var8 = var22;
                }
                var23 = var18 + var15.method3732() * var16 + arg0;
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (class542.field7651 > var7 || var6 > class542.field7646 || var9 < class542.field7647 || var8 > class542.field7641) {
            return true;
        }
        class542.method3190(arg4, arg5, arg3);
        if (var10 != null) {
            if (class613.field8875 > 0 && (class495.field7063 != -1 && class495.field7063 == arg5.field7608 || class617.field8922 != -1 && class617.field8922 == arg3.field7414)) {
                int var28;
                if (class170.field2485 <= 50) {
                    var28 = class170.field2485 * 2;
                } else {
                    var28 = (100 - class170.field2485) * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg4.method633(arg2 ^ 0x80000062, var10.method93() / 2 + 7, var29, arg5.field7602, arg5.field7606);
                arg4.method633(arg2 ^ 0x7FFFFF93, var10.method93() / 2 + 5, var29, arg5.field7602, arg5.field7606);
                arg4.method633(105, var10.method93() / 2 + 3, var29, arg5.field7602, arg5.field7606);
                arg4.method633(-114, var10.method93() / 2 + 1, var29, arg5.field7602, arg5.field7606);
                arg4.method633(arg2 ^ 0x7FFFFF80, var10.method93() / 2, var29, arg5.field7602, arg5.field7606);
            }
            var10.method4135(arg5.field7606 - (var10.method82() >> 1), arg5.field7602 - (var10.method83() >> 1));
        }
        if (arg3.field7425 != null && var15 != null) {
            class249.method1657(var16, arg4, arg3, var18, var15, var17, (byte) -118, var19, arg5);
        }
        if (arg3.field7434 != -1 || arg3.field7425 != null) {
            class371 var30 = new class371(arg5);
            var30.field5210 = var21;
            var30.field5203 = var14;
            var30.field5205 = var12;
            var30.field5204 = var11;
            var30.field5208 = var13;
            var30.field5202 = var22;
            var30.field5206 = var20;
            var30.field5201 = var23;
            class353.field4969.method1526(var30, 111);
        }
        return false;
    }
}
