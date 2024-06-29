import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class548 extends class203 {

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIBIII)I")
    public static final int method3080(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field7421++;
        int var6 = 69 / ((34 - arg2) / 50);
        if (class409.field5812 == null) {
            return 0;
        } else if (arg5 < 3) {
            int var7 = arg3 >> 9;
            int var8 = arg4 >> 9;
            if (arg0 < 0 || arg1 < 0 || arg0 > (class401.field5620 - 1) || arg1 > class257.field3508 - 1) {
                return 0;
            } else if (var7 >= 1 && var8 >= 1 && class401.field5620 - 1 >= var7 && var8 <= class257.field3508 - 1) {
                boolean var9 = (class492.field6720[1][arg3 >> 9][arg4 >> 9] & 0x2) != 0;
                if ((arg3 & 0x1FF) == 0) {
                    boolean var10 = (class492.field6720[1][var7 - 1][arg4 >> 9] & 0x2) != 0;
                    boolean var11 = (class492.field6720[1][var7][arg4 >> 9] & 0x2) != 0;
                    if (var10 != var11) {
                        var9 = (class492.field6720[1][arg0][arg1] & 0x2) != 0;
                    }
                }
                if ((arg4 & 0x1FF) == 0) {
                    boolean var12 = (class492.field6720[1][arg3 >> 9][var8 - 1] & 0x2) != 0;
                    boolean var13 = (class492.field6720[1][arg3 >> 9][var8] & 0x2) != 0;
                    if (var12 != var13) {
                        var9 = (class492.field6720[1][arg0][arg1] & 0x2) != 0;
                    }
                }
                if (var9) {
                    arg5++;
                }
                return class409.field5812[arg5].method331(arg4, (byte) 50, arg3);
            } else {
                return 0;
            }
        } else {
            return class409.field5812[arg5].method331(arg4, (byte) 50, arg3);
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(B)I")
    public static final int method3081(byte arg0) {
        field7419++;
        int var1 = 9 / ((45 - arg0) / 39);
        return class688.method3878((byte) 121, false);
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
    public static final void method3082(int arg0) {
        field7420++;
        for (int var1 = arg0; var1 < class166.field2420; var1++) {
            class437 var3 = class130.field1873[var1];
            boolean var4 = false;
            if (var3.field6086 == null) {
                var3.field6074--;
                if (var3.field6074 < (var3.method2498((byte) 2) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field6083 == 1 && var3.field6075 == null) {
                        var3.field6075 = class237.method1484(class23.field279, var3.field6072, 0);
                        if (var3.field6075 == null) {
                            continue;
                        }
                        var3.field6074 += var3.field6075.method1486();
                    } else if (var3.method2498((byte) 2) && (var3.field6078 == null || var3.field6087 == null)) {
                        if (var3.field6078 == null) {
                            var3.field6078 = class172.method1216(class76.field992, var3.field6072);
                        }
                        if (var3.field6078 == null) {
                            continue;
                        }
                        if (var3.field6087 == null) {
                            var3.field6087 = var3.field6078.method1215(new int[] { 22050 });
                            if (var3.field6087 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field6074 < 0) {
                        int var5 = 8192;
                        int var7;
                        if (var3.field6079 == 0) {
                            var7 = (var3.field6083 == 3 ? class366.field4875.field9381 : class366.field4875.field9346) * var3.field6070 >> 2;
                        } else {
                            int var6 = var3.field6079 >> 24 & 0x3;
                            if (class143.field2063.field4053 == var6) {
                                int var8 = var3.field6079 & 0xFF << 9;
                                int var9 = class143.field2063.method881(-117) << 8;
                                int var10 = var3.field6079 >> 16 & 0xFF;
                                int var11 = (var10 << 9) + var9 + 256 - class143.field2063.field4042;
                                int var12 = var3.field6079 >> 8 & 0xFF;
                                int var13 = (var12 << 9) - class143.field2063.field4047 - (-var9 + -256);
                                int var14 = Math.abs(var11) - (512 - Math.abs(var13));
                                if (var8 < var14) {
                                    var3.field6074 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var7 = class366.field4875.field9364 * var3.field6070 * (var8 - var14) / var8 >> 2;
                                if (var3.field6067 != null && var3.field6067 instanceof class210) {
                                    class210 var15 = (class210) var3.field6067;
                                    short var16 = var15.field2963;
                                    short var17 = var15.field2972;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = -class41.field475 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) + 4096) & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = (8192 - var14) / 4096 + 8192;
                                    }
                                    var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                }
                            } else {
                                var7 = 0;
                            }
                        }
                        if (var7 > 0) {
                            class19 var20 = null;
                            if (var3.field6083 == 1) {
                                var20 = var3.field6075.method1485().method206(class408.field5803);
                            } else if (var3.method2498((byte) 2)) {
                                var20 = var3.field6087;
                            }
                            class484 var21 = var3.field6086 = class484.method2751(var20, var3.field6085, var7, var5);
                            var21.method2754(var3.field6080 - 1);
                            class61.field680.method1462(var21);
                        }
                    }
                }
            } else if (!var3.field6086.method2339(119)) {
                var4 = true;
            }
            if (var4) {
                class166.field2420--;
                for (int var22 = var1; var22 < class166.field2420; var22++) {
                    class130.field1873[var22] = class130.field1873[var22 + 1];
                }
                var1--;
            }
        }
        if (class636.field8795 && !class338.method1979(true)) {
            if (class366.field4875.field9352 != 0 && class507.field6950 != -1) {
                if (class80.field1211 == null) {
                    class56.method471(class507.field6950, class366.field4875.field9352, 0, false, ~arg0, class481.field6621);
                } else {
                    class48.method386(false, class507.field6950, class481.field6621, class366.field4875.field9352, class80.field1211, (byte) 87, 0);
                }
            }
            class636.field8795 = false;
            class80.field1211 = null;
        } else if (class366.field4875.field9352 != 0 && class507.field6950 != -1 && !class338.method1979(true)) {
            class450.field6167++;
            class352 var2 = class290.method1786(arg0 ^ 0x62, class199.field2836, class389.field5489);
            var2.field4686.method2836(class507.field6950, arg0 ^ 0xFFFFA96C);
            class602.method3388(var2, (byte) 28);
            class507.field6950 = -1;
        }
    }
}
