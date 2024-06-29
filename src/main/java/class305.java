import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class305 extends class188 {

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4746 = 2;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
    public static int[] field4745 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4750 = "wave:";

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method2147(byte arg0, int arg1) {
        field4749++;
        if (arg0 != -29) {
            field4746 = 60;
        }
        for (class188 var2 = class186.field2804.method761(arg0 + 56); var2 != null; var2 = class186.field2804.method757(-1)) {
            if ((long) arg1 == (var2.field2834 >> 48 & 0xFFFFL)) {
                var2.method1290(97);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZIIII)V", line = 29)
    public static final void method2148(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            return;
        }
        if (class119.field1662 == 0) {
            int var7 = class212.field3212;
            int var8 = class253.field4012;
            int var9 = class73.field917;
            int var10 = (arg3 - arg4) * (var8 - var7) / arg1 + var7;
            int var11 = class76.field1003;
            int var12 = (arg6 - arg5) * (var11 - var9) / arg0 + var9;
            if (class101.field1371 && (class139.field2088 & 0x40) != 0) {
                class323 var13 = class291.method2078(class225.field3393, class196.field2978, 0);
                if (var13 == null) {
                    class92.method574(8180);
                } else {
                    class67.method413(var10, 0, class5.field48, " ->", class260.field4110, (short) 10, 0L, var12);
                }
            } else {
                if (class199.field3024 == 1) {
                    class67.method413(var10, 0, -1, "", class212.field3226, (short) 6, 0L, var12);
                }
                class67.method413(var10, 0, -1, "", class78.field1032, (short) 28, 0L, var12);
                class67.field822++;
            }
        }
        long var14 = -1L;
        field4744++;
        for (int var16 = 0; var16 < class49.field562; var16++) {
            long var17 = class313.field4900[var16];
            int var19 = ((int) var17 & 0x71AD1C5F) >> 29;
            int var20 = ((int) var17 & 0x3F9E) >> 7;
            int var21 = (int) var17 & 0x7F;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var19 == 2 && class180.method1242(class219.field3290, var21, var20, var17)) {
                    class234 var23 = class123.method795(0, var22);
                    if (var23.field3588 != null) {
                        var23 = var23.method1624(true);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class119.field1662 == 1) {
                        class136.field2035++;
                        class67.method413(var21, 0, class212.field3224, class201.field3074 + " -> <col=00ffff>" + var23.field3540, class50.field576, (short) 24, var17, var20);
                    } else if (class101.field1371) {
                        class303 var24 = class283.field4515 == -1 ? null : class113.method733(class283.field4515, arg2);
                        if ((class139.field2088 & 0x4) != 0 && (var24 == null || var23.method1621(class283.field4515, 127, var24.field4714) != var24.field4714)) {
                            class67.method413(var21, 0, class5.field48, class191.field2868 + " -> <col=00ffff>" + var23.field3540, class260.field4110, (short) 60, var17, var20);
                            class32.field375++;
                        }
                    } else {
                        class291.field4579++;
                        String[] var25 = var23.field3562;
                        if (class91.field1198) {
                            var25 = class130.method894(var25, (byte) 48);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class42.field463++;
                                    int var27 = -1;
                                    short var28 = 0;
                                    if (var23.field3584 == var26) {
                                        var27 = var23.field3554;
                                    }
                                    if (var26 == 0) {
                                        var28 = 22;
                                    }
                                    if (var23.field3535 == var26) {
                                        var27 = var23.field3596;
                                    }
                                    if (var26 == 1) {
                                        var28 = 44;
                                    }
                                    if (var26 == 2) {
                                        var28 = 40;
                                    }
                                    if (var26 == 3) {
                                        var28 = 33;
                                    }
                                    if (var26 == 4) {
                                        var28 = 1010;
                                    }
                                    class67.method413(var21, 0, var27, "<col=00ffff>" + var23.field3540, var25[var26], var28, var17, var20);
                                }
                            }
                        }
                        class67.method413(var21, 0, class109.field1503, "<col=00ffff>" + var23.field3540, class291.field4584, (short) 1012, (long) var23.field3594, var20);
                    }
                }
                if (var19 == 1) {
                    class231 var29 = class251.field3974[var22];
                    if ((var29.field3503.field2111 & 0x1) == 0 && (var29.field3767 & 0x7F) == 0 && (var29.field3763 & 0x7F) == 0 || (var29.field3503.field2111 & 0x1) == 1 && (var29.field3767 & 0x7F) == 64 && (var29.field3763 & 0x7F) == 64) {
                        int var30 = var29.field3763 - ((var29.field3503.field2111 - 1) * 64);
                        int var31 = var29.field3767 + 64 - (var29.field3503.field2111 * 64);
                        for (int var32 = 0; var32 < class296.field4667; var32++) {
                            class231 var33 = class251.field3974[class225.field3392[var32]];
                            if (var33 != null && !var33.field3797 && var29 != var33 && var33.field3706) {
                                int var34 = var33.field3767 + 64 - (var33.field3503.field2111 * 64);
                                int var35 = 64 - (var33.field3503.field2111 * 64 - var33.field3763);
                                if (var34 >= var31 && var33.field3503.field2111 <= (var29.field3503.field2111 - (var34 - var31 >> 7)) && var30 <= var35 && var33.field3503.field2111 <= var29.field3503.field2111 - (var35 - var30 >> 7)) {
                                    class67.method406(var21, class225.field3392[var32], -119, var33.field3503, var20);
                                    var33.field3797 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class302.field4704; var36++) {
                            class67 var37 = class105.field1443[class80.field1067[var36]];
                            if (var37 != null && !var37.field3797 && var37.field3706) {
                                int var38 = var37.field3767 - (var37.method412((byte) 75) - 1) * 64;
                                int var39 = var37.field3763 - ((var37.method412((byte) 97) - 1) * 64);
                                if (var38 >= var31 && var37.method412((byte) 118) <= var29.field3503.field2111 - (var38 - var31 >> 7) && var30 <= var39 && var37.method412((byte) 127) <= var29.field3503.field2111 - (var39 - var30 >> 7)) {
                                    class61.method374(class80.field1067[var36], var20, var37, 30856, var21);
                                    var37.field3797 = true;
                                }
                            }
                        }
                    }
                    if (var29.field3797) {
                        continue;
                    }
                    class67.method406(var21, var22, 98, var29.field3503, var20);
                    var29.field3797 = true;
                }
                if (var19 == 0) {
                    class67 var40 = class105.field1443[var22];
                    if ((var40.field3767 & 0x7F) == 64 && (var40.field3763 & 0x7F) == 64) {
                        int var41 = var40.field3767 - (var40.method412((byte) 90) - 1) * 64;
                        int var42 = var40.field3763 - (var40.method412((byte) 92) * 64 - 64);
                        for (int var43 = 0; var43 < class296.field4667; var43++) {
                            class231 var44 = class251.field3974[class225.field3392[var43]];
                            if (var44 != null && !var44.field3797 && var44.field3706) {
                                int var45 = var44.field3767 - ((var44.field3503.field2111 - 1) * 64);
                                int var46 = var44.field3763 - (var44.field3503.field2111 - 1) * 64;
                                if (var45 >= var41 && var44.field3503.field2111 <= (var40.method412((byte) 96) - (var45 - var41 >> 7)) && var42 <= var46 && var44.field3503.field2111 <= (var40.method412((byte) 85) - (var46 - var42 >> 7))) {
                                    class67.method406(var21, class225.field3392[var43], -38, var44.field3503, var20);
                                    var44.field3797 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class302.field4704; var47++) {
                            class67 var48 = class105.field1443[class80.field1067[var47]];
                            if (var48 != null && !var48.field3797 && var40 != var48 && var48.field3706) {
                                int var49 = var48.field3767 + 64 - (var48.method412((byte) 82) * 64);
                                int var50 = var48.field3763 + 64 - (var48.method412((byte) 92) * 64);
                                if (var41 <= var49 && var48.method412((byte) 77) <= (var40.method412((byte) 127) - (var49 - var41 >> 7)) && var42 <= var50 && var48.method412((byte) 121) <= (var40.method412((byte) 105) - (var50 - var42 >> 7))) {
                                    class61.method374(class80.field1067[var47], var20, var48, 30856, var21);
                                    var48.field3797 = true;
                                }
                            }
                        }
                    }
                    if (var40.field3797) {
                        continue;
                    }
                    class61.method374(var22, var20, var40, 30856, var21);
                    var40.field3797 = true;
                }
                if (var19 == 3) {
                    class257 var51 = class345.field5472[class219.field3290][var21][var20];
                    if (var51 != null) {
                        for (class91 var52 = (class91) var51.method1816((byte) 121); var52 != null; var52 = (class91) var51.method1818((byte) -95)) {
                            int var53 = var52.field1193.field5409;
                            class309 var54 = class190.method1302(var53, (byte) 7);
                            if (class119.field1662 == 1) {
                                class332.field5311++;
                                class67.method413(var21, 0, class212.field3224, class201.field3074 + " -> <col=ff9040>" + var54.field4868, class50.field576, (short) 48, (long) var53, var20);
                            } else if (class101.field1371) {
                                class303 var55 = class283.field4515 == -1 ? null : class113.method733(class283.field4515, arg2);
                                if ((class139.field2088 & 0x1) != 0 && (var55 == null || var54.method2180(var55.field4714, class283.field4515, !arg2) != var55.field4714)) {
                                    class67.method413(var21, 0, class5.field48, class191.field2868 + " -> <col=ff9040>" + var54.field4868, class260.field4110, (short) 1, (long) var53, var20);
                                    class163.field2514++;
                                }
                            } else {
                                class10.field103++;
                                String[] var56 = var54.field4850;
                                if (class91.field1198) {
                                    var56 = class130.method894(var56, (byte) -116);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        class32.field371++;
                                        int var58 = -1;
                                        byte var59 = 0;
                                        if (var54.field4792 == var57) {
                                            var58 = var54.field4831;
                                        }
                                        if (var57 == 0) {
                                            var59 = 18;
                                        }
                                        if (var54.field4838 == var57) {
                                            var58 = var54.field4837;
                                        }
                                        if (var57 == 1) {
                                            var59 = 8;
                                        }
                                        if (var57 == 2) {
                                            var59 = 57;
                                        }
                                        if (var57 == 3) {
                                            var59 = 17;
                                        }
                                        if (var57 == 4) {
                                            var59 = 3;
                                        }
                                        class67.method413(var21, 0, var58, "<col=ff9040>" + var54.field4868, var56[var57], var59, (long) var53, var20);
                                    }
                                }
                                class67.method413(var21, 0, class109.field1503, "<col=ff9040>" + var54.field4868, class291.field4584, (short) 1002, (long) var53, var20);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 428)
    public static void method2149(int arg0) {
        field4750 = null;
        if (arg0 != -3) {
            field4750 = (String) null;
        }
        field4745 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lli;", line = 439)
    public static final class245 method2150(int arg0, int arg1) {
        field4742++;
        class245 var2 = (class245) class244.field3822.method1998(-1114531641, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 110) {
            method2151(103);
        }
        byte[] var3 = class276.field4350.method100(26, arg0, (byte) -107);
        class245 var4 = new class245();
        if (var3 != null) {
            var4.method1733(-75, new class143(var3));
        }
        class244.field3822.method2000(var4, (byte) 107, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V", line = 463)
    public static final void method2151(int arg0) {
        field4743++;
        class309.field4795 = 0;
        class333.field5333 = 0;
        class355.field5641 = 0;
        class237.field3650 = false;
        class346.field5485 = -1;
        class5.field57 = 0;
        if (arg0 <= 123) {
            method2151(-33);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 486)
    public static final void method2152(boolean arg0, String arg1, int arg2) {
        byte var3 = 4;
        int var4 = var3 + 6;
        field4747++;
        int var5 = var3 + 6;
        int var6 = class41.field446.method1689(arg1, 250);
        if (arg2 != -9223) {
            field4745 = (int[]) null;
        }
        int var7 = class41.field446.method1694(arg1, 250) * 13;
        if (class272.field4317) {
            class239.method1659(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
            class239.method1665(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 + var3, 16777215);
        } else {
            class343.method2352(var4 - var3, -var3 + var5, var3 + var3 + var6, var7 - -var3 + var3, 0);
            class343.method2369(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var7 - -var3, 16777215);
        }
        class41.field446.method1673(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class181.method1251(var5 - var3, var4 - var3, false, var3 + var6 + var3, var3 + var3 + var7);
        if (!arg0) {
            class356.method2455(var5, var6, 119, var4, var7);
        } else if (class272.field4317) {
            class272.method1928();
        } else {
            try {
                Graphics var8 = class328.field5287.getGraphics();
                class10.field107.method58(0, -113, 0, var8);
            } catch (Exception var10) {
                class328.field5287.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 537)
    public class305() {
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(I)V", line = 539)
    public class305(int arg0) {
        this.field4748 = arg0;
    }
}
