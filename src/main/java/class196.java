import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class196 extends class366 {

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "[B")
    public byte[] field2812;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Lkn;")
    public static class442 field2811 = new class442();

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "Lse;")
    public static class139 field2816 = new class139();

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Ltj;")
    public static class108 field2813;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lsf;Z)Z", line = 7)
    public static final boolean method1395(class306 arg0, boolean arg1) {
        boolean var2 = class439.field6280 == class241.field3567;
        int var3 = 0;
        arg0.method2064((byte) -18);
        if (arg0.field4465 < 0 || arg0.field4462 < 0 || arg0.field4460 >= class394.field5548 || arg0.field4471 >= class407.field5751) {
            return false;
        }
        for (int var4 = arg0.field4465; var4 <= arg0.field4460; var4++) {
            for (int var7 = arg0.field4462; var7 <= arg0.field4471; var7++) {
                int var8 = 0;
                if (var4 > arg0.field4465) {
                    var8++;
                }
                if (var4 < arg0.field4460) {
                    var8 += 4;
                }
                if (var7 > arg0.field4462) {
                    var8 += 8;
                }
                if (var7 < arg0.field4471) {
                    var8 += 2;
                }
                class197.method1400(arg0.field4464, var4, var7);
                class74 var9 = class385.field5449[arg0.field4464][var4][var7];
                class353 var10 = class204.method1423(arg0, var8, 82);
                class353 var11 = var9.field970;
                if (var11 == null) {
                    var9.field970 = var10;
                } else {
                    while (var11.field5127 != null) {
                        var11 = var11.field5127;
                    }
                    var11.field5127 = var10;
                }
                var9.field956 = (byte) (var9.field956 | var8);
                if (var2 && class25.field314[var4][var7] != 0) {
                    var3 = class25.field314[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field4465; var5 <= arg0.field4460; var5++) {
                for (int var6 = arg0.field4462; var6 <= arg0.field4471; var6++) {
                    if (class25.field314[var5][var6] == 0) {
                        class25.field314[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class448.field6398[class91.field1179++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 95)
    public static final void method1396(String arg0, byte arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field2815++;
        System.exit(1);
        if (arg1 != 76) {
            field2817 = -47;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 108)
    public static void method1397(int arg0) {
        if (arg0 > -3) {
            field2813 = null;
        }
        field2813 = null;
        field2816 = null;
        field2811 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V", line = 119)
    public class196(byte[] arg0) {
        this.field2812 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIII)V", line = 135)
    public static final void method1398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2814++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg7 - arg5;
        int var12 = arg2 - arg5;
        int var13 = arg7 * arg7;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = arg4 * var17;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class440.field6288[arg1];
        class5.method17(var39, arg0 - var11, arg6, (byte) 73, arg0 - arg7);
        class5.method17(var39, arg0 + var11, arg3, (byte) 73, arg0 - var11);
        class5.method17(var39, arg0 + arg7, arg6, (byte) 114, arg0 + var11);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg1 - var9;
            int var42 = arg1 + var9;
            int var43 = arg0 + var8;
            int var44 = arg0 - var8;
            if (var40) {
                int var45 = arg0 + var10;
                int var46 = arg0 - var10;
                class5.method17(class440.field6288[var41], var46, arg6, (byte) 84, var44);
                class5.method17(class440.field6288[var41], var45, arg3, (byte) 76, var46);
                class5.method17(class440.field6288[var41], var43, arg6, (byte) 116, var45);
                class5.method17(class440.field6288[var42], var46, arg6, (byte) 104, var44);
                class5.method17(class440.field6288[var42], var45, arg3, (byte) 82, var46);
                class5.method17(class440.field6288[var42], var43, arg6, (byte) 75, var45);
            } else {
                class5.method17(class440.field6288[var41], var43, arg6, (byte) 87, var44);
                class5.method17(class440.field6288[var42], var43, arg6, (byte) 98, var44);
            }
        }
    }
}
