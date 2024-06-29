import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class386 extends class54 {

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    private int field5512 = -1;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "[I")
    public static int[] field5514 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Lda;")
    public static class442 field5515;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "[Lcaa;")
    public static class602[] field5508;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lgga;B)V")
    public final void method422(class511 arg0, byte arg1) {
        field5511++;
        this.field5512 = arg0.method3002(arg1 ^ 0x14);
        arg0.method3013(arg1 + 43);
        if (arg1 == -21 && arg0.method3013(-104) != 255) {
            arg0.field6962--;
            arg0.method3020(true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
    public static final void method2393(byte arg0, int arg1) {
        class41.method326(false);
        if (arg0 <= 114) {
            method2394(-112);
        }
        field5510++;
        int var2 = class206.field2895.method1925(arg1, (byte) -23).field6863;
        if (var2 == 0) {
            return;
        }
        int var3 = class173.field2192.field8128[arg1];
        if (var2 == 6) {
            class116.field1571 = var3;
        }
        if (var2 == 5) {
            class232.field3488 = var3;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public static void method2394(int arg0) {
        field5508 = null;
        if (arg0 >= -48) {
            field5508 = null;
        }
        field5515 = null;
        field5514 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
    public static final void method2395(boolean arg0) {
        if (!class263.field3850) {
            class48.field577 = class400.field5649 != -1 && class400.field5649 <= class640.field8992 || class640.field8992 * 16 + (class474.field6578 ? 26 : 22) > class249.field3700;
        }
        field5513++;
        class640.field9000.method1046((byte) 125);
        class655.field9223.method1046((byte) -102);
        for (class171 var1 = (class171) class646.field9038.method1041(1048832); var1 != null; var1 = (class171) class646.field9038.method1033(-1)) {
            int var38 = var1.field2174;
            if (var38 < 1000) {
                var1.method527(-11229);
                if (var38 == 15 || var38 == 12 || var38 == 47 || var38 == 46 || var38 == 8 || var38 == 6 || var38 == 22) {
                    class655.field9223.method1039(var1, 0);
                } else {
                    class640.field9000.method1039(var1, 0);
                }
            }
        }
        class640.field9000.method1040(class646.field9038, 11656);
        class655.field9223.method1040(class646.field9038, 11656);
        if (class640.field8992 > 1) {
            if (class152.field1997 && class479.field6647.method273(81, Integer.MAX_VALUE) && class640.field8992 > 2) {
                class99.field1151 = (class171) class646.field9038.field2103.field760.field760;
            } else {
                class99.field1151 = (class171) class646.field9038.field2103.field760;
            }
            class723.field10007 = (class171) class646.field9038.field2103.field760;
        } else {
            class723.field10007 = null;
            class99.field1151 = null;
        }
        if (arg0) {
            field5514 = null;
        }
        int var2 = -1;
        class620 var3 = (class620) class297.field4326.method1041(1048832);
        if (var3 != null) {
            var2 = var3.method1627(arg0);
        }
        if (!class263.field3850) {
            if (var2 == 0 && (class232.field3488 == 1 && class640.field8992 > 2 || class361.method2270((byte) -34))) {
                var2 = 2;
            }
            if (var2 == 2 && class640.field8992 > 0 && var3 != null) {
                if (class81.field906 == null && class559.field7871 == 0) {
                    class59.method480(var3.method1626(34), var3.method1623(true), 0);
                } else {
                    class114.field1375 = 2;
                }
            }
            if (var2 == 0) {
                if (class99.field1151 != null) {
                    class367.method2290(-6169);
                } else if (class773.field10644) {
                    class76.method561(-1);
                }
            }
            if (class81.field906 != null || class559.field7871 != 0) {
                return;
            }
            class114.field1375 = 0;
            class268.field3884 = null;
            return;
        }
        if (var2 == -1) {
            int var4 = class205.field2881.method354((byte) -20);
            int var5 = class205.field2881.method351(-25269);
            boolean var6 = false;
            if (class694.field9684 != null) {
                if ((class49.field587 - 10) <= var4 && class49.field587 + class339.field4914 + 10 >= var4 && var5 >= (class79.field894 - 10) && (class79.field894 + class78.field874 + 10) >= var5) {
                    var6 = true;
                } else {
                    class361.method2268(-120);
                }
            }
            if (!var6) {
                if (var4 < (class689.field9609 - 10) || var4 > class689.field9609 - (-class788.field10819 - 10) || (class221.field3026 - 10) > var5 || class221.field3026 + class625.field8753 + 10 < var5) {
                    class735.method4080(0);
                } else if (class48.field577) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class367.field5278; var9++) {
                        if (class474.field6578) {
                            int var11 = var9 * 16 + class221.field3026 + 33;
                            if (var11 - 13 < var5 && var5 < var11 + 4) {
                                var7 = var9;
                                var8 = var11 - 13;
                                break;
                            }
                        } else {
                            int var10 = class221.field3026 + (var9 * 16) + 31;
                            if (var10 - 13 < var5 && (var10 + 3) > var5) {
                                var8 = var10 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class384 var13 = new class384(class362.field5218);
                        for (class498 var14 = (class498) var13.method2388(12); var14 != null; var14 = (class498) var13.method2390(82)) {
                            if (var7 == var12) {
                                if (var14.field6833 > 1) {
                                    class270.method1758(var8, (byte) -72, var14, var5);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method1623(!arg0);
        int var16 = var3.method1626(24);
        if (class694.field9684 != null && class49.field587 <= var15 && (class49.field587 + class339.field4914) >= var15 && class79.field894 <= var16 && class79.field894 + class78.field874 >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class694.field9684.field6833; var18++) {
                if (class474.field6578) {
                    int var22 = var18 * 16 + class79.field894 + 33;
                    if (var22 - 13 < var16 && (var22 + 4) > var16) {
                        var17 = var18;
                    }
                } else {
                    int var23 = var18 * 16 + (class79.field894 + 31);
                    if (var16 > (var23 - 13) && (var23 + 3) > var16) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class384 var20 = new class384(class694.field9684.field6826);
                for (class171 var21 = (class171) var20.method2388(-116); var21 != null; var21 = (class171) var20.method2390(-48)) {
                    if (var17 == var19) {
                        class49.method413(var16, (byte) 90, var21, var15);
                        break;
                    }
                    var19++;
                }
            }
            class735.method4080(0);
            return;
        }
        if (var15 < class689.field9609 || (class689.field9609 + class788.field10819) < var15 || class221.field3026 > var16 || (class221.field3026 + class625.field8753) < var16) {
            return;
        }
        if (!class48.field577) {
            int var24 = -1;
            for (int var25 = 0; var25 < class640.field8992; var25++) {
                if (class474.field6578) {
                    int var29 = (class640.field8992 - var25 - 1) * 16 + class221.field3026 + 33;
                    if (var16 > var29 - 13 && var29 + 4 > var16) {
                        var24 = var25;
                    }
                } else {
                    int var30 = (class640.field8992 - var25 - 1) * 16 + class221.field3026 + 31;
                    if (var16 > var30 - 13 && var16 < var30 + 3) {
                        var24 = var25;
                    }
                }
            }
            if (var24 != -1) {
                int var26 = 0;
                class395 var27 = new class395(class646.field9038);
                for (class171 var28 = (class171) var27.method2437(1316); var28 != null; var28 = (class171) var27.method2439(5154)) {
                    if (var24 == var26) {
                        class49.method413(var16, (byte) 127, var28, var15);
                        break;
                    }
                    var26++;
                }
            }
            class735.method4080(0);
            return;
        }
        int var31 = -1;
        for (int var32 = 0; var32 < class367.field5278; var32++) {
            if (class474.field6578) {
                int var34 = var32 * 16 + class221.field3026 + 33;
                if (var34 - 13 < var16 && var16 < var34 + 4) {
                    var31 = var32;
                    break;
                }
            } else {
                int var33 = class221.field3026 + (var32 * 16) + 31;
                if (var16 > (var33 - 13) && var33 + 3 > var16) {
                    var31 = var32;
                    break;
                }
            }
        }
        if (var31 == -1) {
            return;
        }
        int var35 = 0;
        class384 var36 = new class384(class362.field5218);
        for (class498 var37 = (class498) var36.method2388(-27); var37 != null; var37 = (class498) var36.method2390(113)) {
            if (var31 == var35) {
                class49.method413(var16, (byte) 126, (class171) var37.field6826.field2266.field591, var15);
                class735.method4080(0);
                return;
            }
            var35++;
        }
        return;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lag;I)V")
    public final void method419(class459 arg0, int arg1) {
        if (arg1 == -33) {
            arg0.method2759(this.field5512, (byte) 86);
            field5507++;
        }
    }
}
