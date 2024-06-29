import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class472 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ltq;")
    private class536 field6145 = new class536(128);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lwm;")
    private class30 field6142;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Luw;")
    public static class208 field6149 = new class208(116, 3);

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lkka;")
    public static class542 field6150 = new class542();

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Luw;")
    public static class208 field6152 = new class208(48, 10);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public final void method2660(boolean arg0) {
        if (!arg0) {
            method2662(true);
        }
        class536 var2 = this.field6145;
        synchronized (this.field6145) {
            this.field6145.method2932((byte) 80);
        }
        field6144++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Luaa;Laa;IIILha;III)V")
    public static final void method2661(class391 arg0, class596 arg1, int arg2, int arg3, int arg4, class570 arg5, int arg6, int arg7, int arg8) {
        if (arg7 < 47) {
            method2662(true);
        }
        field6141++;
        class624 var9 = class272.field3575.method2323(arg6, true);
        if (var9 == null || !var9.field7916 || !var9.method3344(-26373, class381.field4705)) {
            return;
        }
        if (var9.field7953 != null) {
            int[] var10 = new int[var9.field7953.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var28;
                if (class507.field6476 == 4) {
                    var28 = (int) class698.field9250 & 0x3FFF;
                } else {
                    var28 = (int) class698.field9250 + class757.field10329 & 0x3FFF;
                }
                int var29 = class541.field6805[var28];
                int var30 = class541.field6806[var28];
                if (class507.field6476 != 4) {
                    var29 = var29 * 256 / (class718.field9432 + 256);
                    var30 = var30 * 256 / (class718.field9432 + 256);
                }
                var10[var11 * 2] = ((arg2 + (var9.field7953[var11 * 2] * 4)) * var30 + (var9.field7953[var11 * 2 + 1] * 4 + arg3) * var29 >> 14) + (arg8 + (arg0.field5117 / 2));
                var10[var11 * 2 + 1] = arg0.field5031 / 2 + arg4 - ((var9.field7953[var11 * 2 + 1] * 4 + arg3) * var30 - (var9.field7953[var11 * 2] * 4 + arg2) * var29 >> 14);
            }
            class584.method3128(arg5, var10, var9.field7955, arg0.field5086, arg0.field5105);
            if (var9.field7943 > 0) {
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    int var20 = var10[var12 * 2];
                    int var21 = var10[var12 * 2 + 1];
                    int var22 = var10[var12 * 2 + 2];
                    int var23 = var10[var12 * 2 + 3];
                    if (var22 < var20) {
                        int var24 = var20;
                        int var25 = var21;
                        var20 = var22;
                        var22 = var24;
                        var21 = var23;
                        var23 = var25;
                    } else if (var20 == var22 && var23 < var21) {
                        int var26 = var21;
                        var21 = var23;
                        var23 = var26;
                    }
                    arg5.method932(var20, var21, var22, var23, var9.field7944[var9.field7956[var12] & 0xFF], 1, arg1, arg8, arg4, var9.field7943, var9.field7920, var9.field7906);
                }
                int var13 = var10[var10.length - 2];
                int var14 = var10[var10.length - 1];
                int var15 = var10[0];
                int var16 = var10[1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var15 = var17;
                    var14 = var16;
                    var16 = var18;
                } else if (var13 == var15 && var14 > var16) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg5.method932(var13, var14, var15, var16, var9.field7944[var9.field7956[var9.field7956.length - 1] & 0xFF], 1, arg1, arg8, arg4, var9.field7943, var9.field7920, var9.field7906);
            } else {
                for (int var27 = 0; var27 < (var10.length / 2 - 1); var27++) {
                    arg5.method964(var10[var27 * 2], var10[var27 * 2 + 1], var10[(var27 + 1) * 2], var10[var27 * 2 + 1 + 2], var9.field7944[var9.field7956[var27] & 0xFF], 1, arg1, arg8, arg4);
                }
                arg5.method964(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field7944[var9.field7956[var9.field7956.length - 1] & 0xFF], 1, arg1, arg8, arg4);
            }
        }
        class772 var31 = null;
        if (var9.field7941 != -1) {
            var31 = var9.method3343(false, 2, arg5);
            if (var31 != null) {
                class510.method2817(arg1, arg0, var31, arg8, (byte) -85, arg2, arg3, arg4);
            }
        }
        if (var9.field7946 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method612();
        }
        class420 var33 = class399.field5278;
        class166 var34 = class364.field4453;
        if (var9.field7939 == 1) {
            var33 = class225.field3058;
            var34 = class411.field5453;
        }
        if (var9.field7939 == 2) {
            var33 = class595.field7562;
            var34 = class66.field868;
        }
        class482.method2709(arg2, 80, var9.field7925, arg3, var33, arg0, arg1, arg8, arg4, var32, var9.field7946, var34);
        return;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
    public static void method2662(boolean arg0) {
        field6152 = null;
        if (!arg0) {
            method2662(false);
        }
        field6150 = null;
        field6149 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Ltg;")
    public final class631 method2663(int arg0, byte arg1) {
        field6147++;
        class536 var3 = this.field6145;
        class631 var4;
        synchronized (this.field6145) {
            var4 = (class631) this.field6145.method2931((long) arg0, (byte) -103);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field6142;
        byte[] var6;
        synchronized (this.field6142) {
            var6 = this.field6142.method139(1, (byte) -94, arg0);
        }
        class631 var7 = new class631();
        if (var6 != null) {
            var7.method3369(new class234(var6), -53);
        }
        class536 var8 = this.field6145;
        synchronized (this.field6145) {
            if (arg1 != -54) {
                this.field6145 = null;
            }
            this.field6145.method2918((long) arg0, var7, 126);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Z")
    public static final boolean method2664(int arg0, int arg1, int arg2) {
        field6151++;
        if (arg2 != -8056) {
            method2664(19, -73, -70);
        }
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public final void method2665(int arg0, int arg1) {
        field6148++;
        int var3 = -23 / ((arg0 - 46) / 40);
        class536 var4 = this.field6145;
        synchronized (this.field6145) {
            this.field6145.method2928(true, arg1);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static final void method2666(byte arg0) {
        field6146++;
        class425.method2448(false);
        if (arg0 >= -71) {
            field6149 = null;
        }
        class602.field7657 = false;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public final void method2667(byte arg0) {
        class536 var2 = this.field6145;
        synchronized (this.field6145) {
            if (arg0 >= -111) {
                return;
            }
            this.field6145.method2919(0);
        }
        field6143++;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class472(class473 arg0, int arg1, class30 arg2) {
        this.field6142 = arg2;
        this.field6142.method138(0, 1);
    }
}
