import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class241 {

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Llq;")
    private class5 field3626 = new class5();

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lcm;")
    private class382 field3616;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field3631 = 0;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "[I")
    public static int[] field3625 = new int[2048];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Liq;")
    public static class134 field3627;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1477(byte arg0) {
        field3629++;
        if (arg0 <= 114) {
            return null;
        }
        class6 var2 = (class6) this.field3616.method2296(5773);
        while (var2 != null) {
            Object var3 = var2.method54(16);
            if (var3 != null) {
                return var3;
            }
            class6 var4 = var2;
            var2 = (class6) this.field3616.method2304(100);
            var4.method625((byte) -50);
            var4.method2627(0);
            this.field3621 += var2.field74;
        }
        return null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
    public final int method1478(int arg0) {
        field3634++;
        int var2 = arg0;
        for (class6 var3 = (class6) this.field3626.method42(true); var3 != null; var3 = (class6) this.field3626.method43(arg0 ^ 0x9)) {
            if (!var3.method53(true)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjava/lang/Object;IJ)V")
    private final void method1479(byte arg0, Object arg1, int arg2, long arg3) {
        field3617++;
        int var6 = 84 / ((19 - arg0) / 50);
        if (this.field3620 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method1483((byte) -124, arg3);
        this.field3621 -= arg2;
        while (this.field3621 < 0) {
            class6 var8 = (class6) this.field3626.method47(17795);
            this.method1492(var8, 124);
        }
        class50 var7 = new class50(arg1, arg2);
        this.field3616.method2301(56, var7, arg3);
        this.field3626.method40(var7, 17478);
        var7.field6254 = 0L;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
    public final int method1480(int arg0) {
        if (arg0 == 0) {
            field3619++;
            return this.field3620;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public final void method1481(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method1480(92);
        }
        if (class81.field1078 != null) {
            for (class6 var3 = (class6) this.field3626.method42(true); var3 != null; var3 = (class6) this.field3626.method43(9)) {
                if (var3.method53(true)) {
                    if (var3.method54(16) == null) {
                        var3.method625((byte) -50);
                        var3.method2627(0);
                        this.field3621++;
                    }
                } else if ((++var3.field6254) > ((long) arg1)) {
                    class6 var4 = class81.field1078.method1529(var3, (byte) -2);
                    this.field3616.method2301(107, var4, var3.field1339);
                    class47.method265(var3, -121, var4);
                    var3.method625((byte) -50);
                    var3.method2627(0);
                }
            }
        }
        field3614++;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public final void method1482(byte arg0) {
        for (class6 var2 = (class6) this.field3626.method42(true); var2 != null; var2 = (class6) this.field3626.method43(9)) {
            if (var2.method53(true)) {
                var2.method625((byte) -50);
                var2.method2627(0);
                this.field3621 += var2.field74;
            }
        }
        int var3 = 64 % ((-arg0 - 23) / 47);
        field3612++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BJ)V")
    private final void method1483(byte arg0, long arg1) {
        field3633++;
        class6 var4 = (class6) this.field3616.method2302(arg1, arg0 ^ 0xFFFFA39C);
        if (arg0 != -124) {
            this.method1478(-19);
        }
        this.method1492(var4, 107);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method1484(boolean arg0) {
        field3627 = null;
        field3625 = null;
        if (!arg0) {
            method1490(17, 101, 92, 21, 53, 92, 21, 1, 79, -51);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public final void method1485(int arg0) {
        this.field3626.method45(12);
        field3613++;
        this.field3616.method2307(5142);
        this.field3621 = this.field3620;
        if (arg0 != -22032) {
            this.method1478(99);
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)I")
    public final int method1486(int arg0) {
        int var2 = -103 / ((35 - arg0) / 37);
        field3624++;
        return this.field3621;
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V")
    public static final void method1487(int arg0) {
        if (arg0 != 30721) {
            method1487(-85);
        }
        if (class5.field56 >= 0) {
            long var1 = class445.method2750(-27580);
            class5.field56 = (int) ((long) class5.field56 - (var1 - class432.field6336));
            if (class5.field56 > 0) {
                int var3 = (class5.field56 << 8) / class344.field5145;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class95.field1327 = ((class91.field1290 & 0xFF00) * var3 + (class81.field1083.field6654 & 0xFF00) * var4 & 0xFF0000) + ((class91.field1290 & 0xFF00FF) * var3 + (class81.field1083.field6654 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class412.field6130 = (class81.field1083.field6656 - class150.field2071) * var6 + class150.field2071;
                class213.field3200 = class390.field5760 * var3 + class81.field1083.field6642 * var4 >> 8;
                class409.field6099 = (class81.field1083.field6640 - class173.field2656) * var6 + class173.field2656;
                class355.field5245 = (class81.field1083.field6632 - class111.field1461) * var6 + class111.field1461;
                class140.field1881 = (class81.field1083.field6643 - class416.field6176) * var6 + class416.field6176;
                class169.field2458 = (class81.field1083.field6634 - class306.field4629) * var6 + class306.field4629;
                class162.field2252 = ((class172.field2641 & 0xFF00FF) * var3 + ((class81.field1083.field6633 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class172.field2641 & 0xFF00) * var3 + (class81.field1083.field6633 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class227.field3438 = (class81.field1083.field6657 - class220.field3359) * var6 + class220.field3359;
                if (class303.field4581 != class81.field1083.field6644) {
                    class8.field91 = class375.field5461.method432(class303.field4581, class81.field1083.field6644, var6, class8.field91);
                }
            } else {
                class169.field2458 = class81.field1083.field6634;
                class8.field91 = class81.field1083.field6644;
                class162.field2252 = class81.field1083.field6633;
                class355.field5245 = class81.field1083.field6632;
                class95.field1327 = class81.field1083.field6654;
                class412.field6130 = class81.field1083.field6656;
                class5.field56 = -1;
                class227.field3438 = class81.field1083.field6657;
                class213.field3200 = class81.field1083.field6642;
                class140.field1881 = class81.field1083.field6643;
                class409.field6099 = class81.field1083.field6640;
            }
            class432.field6336 = var1;
        }
        field3618++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method1488(int arg0, long arg1, Object arg2) {
        if (arg0 == 128) {
            field3628++;
            this.method1479((byte) 98, arg2, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1489(byte arg0) {
        if (arg0 <= 14) {
            this.method1480(-55);
        }
        field3623++;
        class6 var2 = (class6) this.field3616.method2304(100);
        while (var2 != null) {
            Object var3 = var2.method54(16);
            if (var3 != null) {
                return var3;
            }
            class6 var4 = var2;
            var2 = (class6) this.field3616.method2304(100);
            var4.method625((byte) -50);
            var4.method2627(0);
            this.field3621 += var2.field74;
        }
        return null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3622++;
        if (arg6 == arg9 && arg2 == arg7 && arg0 == arg8 && arg1 == arg3) {
            class374.method2245(arg5 - 223616821, arg7, arg1, arg6, arg8, arg4);
        } else {
            int var10 = arg6;
            int var11 = arg7;
            int var12 = arg6 * 3;
            int var13 = arg7 * 3;
            int var14 = arg9 * 3;
            int var15 = arg2 * 3;
            int var16 = arg0 * 3;
            int var17 = arg3 * 3;
            int var18 = arg8 + var14 - var16 - arg6;
            int var19 = arg1 + var15 - arg7 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg6;
                int var34 = (var30 + var32 + var28 >> 12) + arg7;
                class374.method2245(-223616820, var11, var34, var10, var33, arg4);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg5 != 1) {
            field3627 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1491(long arg0, int arg1) {
        field3630++;
        class6 var4 = (class6) this.field3616.method2302(arg0, 23576);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method54(16);
        if (var5 == null) {
            var4.method625((byte) -50);
            var4.method2627(0);
            this.field3621 += var4.field74;
            return null;
        }
        if (arg1 != 0) {
            this.method1485(23);
        }
        if (var4.method53(true)) {
            class50 var6 = new class50(var5, var4.field74);
            this.field3616.method2301(127, var6, var4.field1339);
            this.field3626.method40(var6, 17478);
            var6.field6254 = 0L;
            var4.method625((byte) -50);
            var4.method2627(0);
        } else {
            this.field3626.method40(var4, 17478);
            var4.field6254 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lqk;I)V")
    private final void method1492(class6 arg0, int arg1) {
        field3632++;
        if (arg0 != null) {
            arg0.method625((byte) -50);
            arg0.method2627(0);
            this.field3621 += arg0.field74;
        }
        if (arg1 < 95) {
            this.method1481(-97, 28);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
    public class241(int arg0) {
        this.field3620 = arg0;
        this.field3621 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3616 = new class382(var2);
    }
}
