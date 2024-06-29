import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class467 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Lwa;")
    public static class433 field6839 = new class433("LIVE", 0);

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Lqp;")
    public static class466 field6846 = new class466("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "Lrt;")
    public class151 field6845;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field6849;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field6841;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2740(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 4)
    public static void method2734(int arg0) {
        field6846 = null;
        field6841 = null;
        field6839 = null;
        if (arg0 != -18799) {
            field6846 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)I", line = 17)
    public static final int method2735(int arg0, int arg1, int arg2) {
        field6848++;
        if (arg0 == -2) {
            return 12345678;
        } else if (~arg0 == arg2) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(III)V", line = 49)
    public static final void method2736(int arg0, int arg1, int arg2) {
        field6847++;
        if (class256.method1534(32554, arg0)) {
            if (arg1 != 9380) {
                field6846 = null;
            }
            class469.method2746(64, class495.field7226[arg0], arg2);
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V", line = 72)
    public static final void method2737(int arg0) {
        field6840++;
        if (arg0 < 21) {
            method2738(null, false, 101);
        }
        if (class174.field2587 > 0) {
            class285.method1701(-24827);
        } else {
            class154.field2356 = class33.field438;
            class33.field438 = null;
            class448.method2651(40, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lya;ZI)Z", line = 94)
    public static final boolean method2738(class38 arg0, boolean arg1, int arg2) {
        field6843++;
        int var3 = (class527.field7799 - 104) / 2;
        int var4 = (class422.field6182 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class6.method39(arg2, var52, (byte) -107, var51, var6)) {
                        int var53 = var52;
                        if (class360.method2159(var51, false, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class308.method1787(var6, var53, var51, 2);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        if (arg1) {
            field6841 = null;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class230.field3253 = arg0.method244(var7, 0, 512, 512, 512);
        class233.method1437(77);
        int var9 = (int) (Math.random() * 20.0D) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 228 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 228 | 0x114CFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class487.field7127][class487.field7127];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class487.field7127) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class487.field7127) {
                arg0.method279(0, 0, class487.field7127 * 4, class487.field7127 * 4);
                arg0.method246(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class487.field7127; var44++) {
                        for (int var50 = 0; var50 < class487.field7127; var50++) {
                            var12[var44][var50] = class6.method39(arg2, var37, (byte) -107, var36 + var50, var13 + var44);
                        }
                    }
                    class385.field5608[var37].method356(0, 0, 1024, var13, var36, class487.field7127 + var13, var36 - -class487.field7127, var12);
                    if (!class413.field6030) {
                        for (int var45 = -4; var45 < class487.field7127; var45++) {
                            for (int var46 = -4; var46 < class487.field7127; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var4 <= var48 && class6.method39(arg2, var37, (byte) -107, var48, var47)) {
                                    int var49 = var37;
                                    if (class360.method2159(var48, false, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class12.method59(var48, var45 * 4, (byte) 125, var10, var47, var49, var9, (class487.field7127 - var46) * 4 - 4, arg0);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class413.field6030) {
                    class141 var38 = class82.field1229[arg2];
                    for (int var39 = 0; var39 < class487.field7127; var39++) {
                        for (int var40 = 0; var40 < class487.field7127; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field2013[var41 - var38.field1992][var42 - var38.field1994];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method325(var39 * 4, 4, -1713569622, 1, (class487.field7127 - var40) * 4 - 4, 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method230(-1713569622, 4, (class487.field7127 - var40) * 4 - 4, (byte) -97, var39 * 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method307((class487.field7127 - var40) * 4 - 4, 4, var39 * 4 + 3, -94, -1713569622);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method230(-1713569622, 4, (class487.field7127 - var40) * 4 + 3 - 4, (byte) -110, var39 * 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method307((class487.field7127 - var40) * 4 - 4, 4, var39 * 4, -108, -1713569622);
                            }
                        }
                    }
                }
                arg0.method243(0, 0, class487.field7127 * 4, class487.field7127 * 4, var11, 2);
                class230.field3253.method88((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class487.field7127 * 4), class487.field7127 * 4, class487.field7127 * 4, 0, 0);
            }
        }
        arg0.method260();
        arg0.method246(-16777215);
        class361.method2180(!arg1);
        class168.field2514 = 0;
        class434.field6361.method2814((byte) 91);
        if (!class413.field6030) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; var21 <= arg2 + 1 && var21 <= 3; var21++) {
                        if (class6.method39(arg2, var21, (byte) -107, var20, var14)) {
                            class503 var22 = (class503) class509.method3048(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class503) class38.method295(var21, var14, var20, field6849 == null ? (field6849 = method2740("jn")) : field6849);
                            }
                            if (var22 == null) {
                                var22 = (class503) class176.method1135(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class503) class131.method899(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class220 var23 = class78.field1141.method2103(var22.method490(-29679), true);
                                if (!var23.field3115 || class64.field870) {
                                    int var24 = var23.field3129;
                                    if (var23.field3080 != null) {
                                        for (int var25 = 0; var25 < var23.field3080.length; var25++) {
                                            if (var23.field3080[var25] != -1) {
                                                class220 var26 = class78.field1141.method2103(var23.field3080[var25], true);
                                                if (var26.field3129 >= 0) {
                                                    var24 = var26.field3129;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class146 var28 = class362.field5299.method141(var24, false);
                                            if (var28 != null && var28.field2088) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class82.field1229[var21].field2013;
                                            int var32 = class82.field1229[var21].field1992;
                                            int var33 = class82.field1229[var21].field1994;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 104 - 1) && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class95.field1461[class168.field2514] = var23.field3110;
                                        class26.field351[class168.field2514] = var29;
                                        class515.field7615[class168.field2514] = var30;
                                        class168.field2514++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class398.field5823 != null) {
                class356.field5196.field1541 = 1;
                class362.field5299.method146(64, 1024, 105);
                for (int var15 = 0; var15 < class398.field5823.field6045; var15++) {
                    int var16 = class398.field5823.field6043[var15];
                    if ((var16 >> 28) == class316.field4324.field1738) {
                        int var17 = ((var16 & 0xFFFF021) >> 14) - class510.field7566;
                        int var18 = (var16 & 0x3FFF) - class14.field204;
                        if (var17 >= 0 && class527.field7799 > var17 && var18 >= 0 && var18 < class422.field6182) {
                            class434.field6361.method2809(new class500(var15), 2);
                        } else {
                            class146 var19 = class362.field5299.method141(class398.field5823.field6038[var15], arg1);
                            if (var19.field2090 != null && var17 + var19.field2108 >= 0 && class527.field7799 > (var19.field2104 + var17) && var19.field2103 + var18 >= 0 && class422.field6182 > var19.field2102 + var18) {
                                class434.field6361.method2809(new class500(var15), 2);
                            }
                        }
                    }
                }
                class362.field5299.method146(64, 128, -79);
                class356.field5196.field1541 = 2;
                class356.field5196.method748(0);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIIII)V", line = 509)
    public static final void method2739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6842++;
        int var8 = class46.method425(true, arg1, class224.field3193, class417.field6057);
        int var9 = class46.method425(true, arg4, class224.field3193, class417.field6057);
        int var10 = class46.method425(true, arg5, class76.field1021, class424.field6204);
        int var11 = class46.method425(true, arg7, class76.field1021, class424.field6204);
        int var12 = class46.method425(true, arg1 + arg3, class224.field3193, class417.field6057);
        int var13 = class46.method425(true, arg4 - arg3, class224.field3193, class417.field6057);
        for (int var14 = var8; var14 < var12; var14++) {
            class210.method1300(var10, class437.field6400[var14], (byte) 105, var11, arg0);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class210.method1300(var10, class437.field6400[var15], (byte) 97, var11, arg0);
        }
        int var16 = class46.method425(true, arg3 + arg5, class76.field1021, class424.field6204);
        int var17 = class46.method425(true, arg7 - arg3, class76.field1021, class424.field6204);
        int var18 = var12;
        if (arg2 != 159) {
            method2736(117, -98, 12);
        }
        while (var13 >= var18) {
            int[] var19 = class437.field6400[var18];
            class210.method1300(var10, var19, (byte) 115, var16, arg0);
            class210.method1300(var16, var19, (byte) 104, var17, arg6);
            class210.method1300(var17, var19, (byte) 121, var11, arg0);
            var18++;
        }
    }
}
