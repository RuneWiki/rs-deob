import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class145 {

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "J")
    public static volatile long field2310 = 0L;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 12)
    public static final void method1073(byte arg0) {
        class253.method1795(98);
        class117.method762(-14711);
        class176.method1226((byte) 63);
        field2308++;
        class128.method873(-57);
        class220.method1535((byte) 124);
        class28.method209((byte) -118);
        class72.method449(0);
        class103.method652((byte) 95);
        class7.method41(108);
        class56.method336(51);
        class18.method133(-12301);
        class184.method1270(false);
        class273.method1967((byte) 74);
        class185.method1278((byte) -90);
        class166.method1186((byte) 107);
        class28.method204(1024);
        class64.method391((byte) 120);
        class172.method1209(120);
        class65.method395((byte) -107);
        if (class313.field4898 != 0) {
            for (int var1 = 0; var1 < class19.field234.length; var1++) {
                class19.field234[var1] = null;
            }
            class72.field892 = 0;
        }
        class267.method1876((byte) 102);
        class57.method342(28355);
        class324.method2258(-127);
        class165.method1181(63);
        class290.field4561.method383((byte) -48);
        if (!class272.field4317) {
            ((class138) class104.field1438).method948(-121);
        }
        class267.field4201.method2003(-57);
        class327.field5227.method121((byte) -14);
        class79.field1045.method121((byte) -14);
        class353.field5630.method121((byte) -14);
        if (arg0 >= -73) {
            field2310 = 82L;
        }
        class69.field856.method121((byte) -14);
        class102.field1380.method121((byte) -14);
        class60.field714.method121((byte) -14);
        class166.field2567.method121((byte) -14);
        class65.field786.method121((byte) -14);
        class169.field2583.method121((byte) -14);
        class276.field4351.method121((byte) -14);
        class309.field4821.method121((byte) -14);
        class110.field1516.method383((byte) -48);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIII)V", line = 80)
    public static final void method1074(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2305++;
        class99.field1345 = 0L;
        int var5 = -12 % ((76 - arg4) / 33);
        boolean var6 = false;
        int var7 = class117.method768(-108);
        if (arg1 <= 0 != var7 <= 0) {
            var6 = true;
        }
        if (arg1 == 3 || var7 == 3) {
            arg0 = true;
        }
        if (class22.field262.startsWith("mac") && arg1 > 0) {
            arg0 = true;
        }
        if (arg0 && arg1 > 0) {
            var6 = true;
        }
        class12.method71(-128, arg1, var7, arg2, var6, arg0, arg3);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lwk;Z)V", line = 110)
    public static final void method1075(class196 arg0, boolean arg1) {
        class294.field4628.method1814(arg0, true);
        while (true) {
            class196 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class196[][] var7;
            class196 var120;
            do {
                class196 var119;
                do {
                    class196 var118;
                    do {
                        class196 var117;
                        do {
                            do {
                                do {
                                    float var8;
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class196) class294.field4628.method1808(0);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3000);
                                            var3 = var2.field2986;
                                            var4 = var2.field2982;
                                            var5 = var2.field2991;
                                            var6 = var2.field2992;
                                            var7 = class194.field2947[var5];
                                            var8 = 0.0F;
                                            if (class272.field4317) {
                                                if (class72.field902 == class349.field5572) {
                                                    int var9 = class161.field2484[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class357.field5671 != var10) {
                                                        class357.field5671 = var10;
                                                        class187.method1286(12506, var10);
                                                        class26.method196(class70.method439((byte) 120));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class311.field4881 != var11) {
                                                        class311.field4881 = var11;
                                                        class27.method203(false, var11);
                                                    }
                                                    int var12 = class214.field3247[0][var3 + 1][var4] + class214.field3247[0][var3][var4] + class214.field3247[0][var3][var4 + 1] + class214.field3247[0][var3 + 1][var4 + 1] >> 2;
                                                    class11.method69(-114, -var12, 3);
                                                    var8 = 201.5F;
                                                    class272.method1924(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class272.method1924(var8);
                                                }
                                            }
                                            if (!var2.field2983) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class196 var13 = class194.field2947[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field3000) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class282.field4461 && var3 > class185.field2788) {
                                                    class196 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field3000 && (var14.field2983 || (var2.field2981 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class282.field4461 && var3 < class13.field133 - 1) {
                                                    class196 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field3000 && (var15.field2983 || (var2.field2981 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class55.field652 && var4 > class238.field3660) {
                                                    class196 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field3000 && (var16.field2983 || (var2.field2981 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class55.field652 && var4 < class294.field4629 - 1) {
                                                    class196 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field3000 && (var17.field2983 || (var2.field2981 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2983 = false;
                                            if (var2.field2990 != null) {
                                                class196 var18 = var2.field2990;
                                                if (class272.field4317) {
                                                    class272.method1924(201.5F - (float) (var18.field2992 + 1) * 50.0F);
                                                }
                                                if (var18.field2997 == null) {
                                                    if (var18.field2987 != null) {
                                                        if (class355.method2451(0, var3, var4)) {
                                                            class265.method1871(var18.field2987, class58.field682, class4.field46, class210.field3161, class251.field3981, var3, var4, true);
                                                        } else {
                                                            class265.method1871(var18.field2987, class58.field682, class4.field46, class210.field3161, class251.field3981, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class355.method2451(0, var3, var4)) {
                                                    class117.method765(var18.field2997, 0, class58.field682, class4.field46, class210.field3161, class251.field3981, var3, var4, true);
                                                } else {
                                                    class117.method765(var18.field2997, 0, class58.field682, class4.field46, class210.field3161, class251.field3981, var3, var4, false);
                                                }
                                                class123 var19 = var18.field2999;
                                                if (var19 != null) {
                                                    if (class272.field4317) {
                                                        if ((var19.field1690 & var2.field2980) == 0) {
                                                            class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                        } else {
                                                            class195.method1360(var19.field1690, class245.field3859, class36.field415, class42.field457, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field1697.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var19.field1688 - class245.field3859, var19.field1698 - class36.field415, var19.field1695 - class42.field457, var19.field1702, var5, (class141) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field2979; var20++) {
                                                    class44 var21 = var18.field2998[var20];
                                                    if (var21 != null) {
                                                        if (class272.field4317) {
                                                            class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                        }
                                                        var21.field494.method410(var21.field496, class58.field682, class4.field46, class210.field3161, class251.field3981, var21.field503 - class245.field3859, var21.field499 - class36.field415, var21.field509 - class42.field457, var21.field502, var5, (class141) null);
                                                    }
                                                }
                                                if (class272.field4317) {
                                                    class272.method1924(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field2997 == null) {
                                                if (var2.field2987 != null) {
                                                    if (class355.method2451(var6, var3, var4)) {
                                                        class265.method1871(var2.field2987, class58.field682, class4.field46, class210.field3161, class251.field3981, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class265.method1871(var2.field2987, class58.field682, class4.field46, class210.field3161, class251.field3981, var3, var4, false);
                                                    }
                                                }
                                            } else if (class355.method2451(var6, var3, var4)) {
                                                class117.method765(var2.field2997, var6, class58.field682, class4.field46, class210.field3161, class251.field3981, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field2997.field385 != 12345678 || class226.field3412 && var5 <= class76.field997) {
                                                    class117.method765(var2.field2997, var6, class58.field682, class4.field46, class210.field3161, class251.field3981, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class360 var23 = var2.field3003;
                                                if (var23 != null && (var23.field5699 & 0x80000000L) != 0L) {
                                                    if (class272.field4317 && var23.field5695) {
                                                        class272.method1924(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class272.field4317) {
                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                    }
                                                    var23.field5697.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var23.field5698 - class245.field3859, var23.field5702 - class36.field415, var23.field5694 - class42.field457, var23.field5699, var5, (class141) null);
                                                    if (class272.field4317 && var23.field5695) {
                                                        class272.method1924(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class123 var26 = var2.field2999;
                                            class54 var27 = var2.field2994;
                                            if (var26 != null || var27 != null) {
                                                if (class282.field4461 == var3) {
                                                    var24++;
                                                } else if (class282.field4461 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class55.field652 == var4) {
                                                    var24 += 3;
                                                } else if (class55.field652 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class4.field47[var24];
                                                var2.field2980 = class74.field929[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field1690 & class54.field619[var24]) == 0) {
                                                    var2.field3002 = 0;
                                                } else if (var26.field1690 == 16) {
                                                    var2.field3002 = 3;
                                                    var2.field2995 = class256.field4056[var24];
                                                    var2.field2993 = 3 - var2.field2995;
                                                } else if (var26.field1690 == 32) {
                                                    var2.field3002 = 6;
                                                    var2.field2995 = class163.field2518[var24];
                                                    var2.field2993 = 6 - var2.field2995;
                                                } else if (var26.field1690 == 64) {
                                                    var2.field3002 = 12;
                                                    var2.field2995 = class305.field4745[var24];
                                                    var2.field2993 = 12 - var2.field2995;
                                                } else {
                                                    var2.field3002 = 9;
                                                    var2.field2995 = class349.field5570[var24];
                                                    var2.field2993 = 9 - var2.field2995;
                                                }
                                                if ((var26.field1690 & var25) != 0 && !class108.method700(var6, var3, var4, var26.field1690)) {
                                                    if (class272.field4317) {
                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                    }
                                                    var26.field1697.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var26.field1688 - class245.field3859, var26.field1698 - class36.field415, var26.field1695 - class42.field457, var26.field1702, var5, (class141) null);
                                                }
                                                if ((var26.field1689 & var25) != 0 && !class108.method700(var6, var3, var4, var26.field1689)) {
                                                    if (class272.field4317) {
                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                    }
                                                    var26.field1705.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var26.field1688 - class245.field3859, var26.field1698 - class36.field415, var26.field1695 - class42.field457, var26.field1702, var5, (class141) null);
                                                }
                                            }
                                            if (var27 != null && !class93.method617(var6, var3, var4, var27.field630.method417())) {
                                                if (class272.field4317) {
                                                    class272.method1924(var8 - 0.5F);
                                                }
                                                if ((var27.field620 & var25) != 0) {
                                                    if (class272.field4317) {
                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                    }
                                                    var27.field630.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var27.field624 + var27.field615 - class245.field3859, var27.field625 - class36.field415, var27.field622 + var27.field634 - class42.field457, var27.field627, var5, (class141) null);
                                                } else if (var27.field620 == 256) {
                                                    int var28 = var27.field624 - class245.field3859;
                                                    int var29 = var27.field625 - class36.field415;
                                                    int var30 = var27.field622 - class42.field457;
                                                    int var31 = var27.field631;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class272.field4317) {
                                                            class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                        }
                                                        var27.field630.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var27.field615 + var28, var29, var27.field634 + var30, var27.field627, var5, (class141) null);
                                                    } else if (var27.field632 != null) {
                                                        if (class272.field4317) {
                                                            class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                        }
                                                        var27.field632.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var28, var29, var30, var27.field627, var5, (class141) null);
                                                    }
                                                }
                                                if (class272.field4317) {
                                                    class272.method1924(var8);
                                                }
                                            }
                                            if (var22) {
                                                class360 var34 = var2.field3003;
                                                if (var34 != null && (var34.field5699 & 0x80000000L) == 0L) {
                                                    if (class272.field4317 && var34.field5695) {
                                                        class272.method1924(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class272.field4317) {
                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                    }
                                                    var34.field5697.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var34.field5698 - class245.field3859, var34.field5702 - class36.field415, var34.field5694 - class42.field457, var34.field5699, var5, (class141) null);
                                                    if (class272.field4317 && var34.field5695) {
                                                        class272.method1924(var8);
                                                    }
                                                }
                                                class353 var35 = var2.field2985;
                                                if (var35 != null && var35.field5632 == 0) {
                                                    if (class272.field4317) {
                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                    }
                                                    if (var35.field5622 != null) {
                                                        var35.field5622.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var35.field5621 - class245.field3859, var35.field5626 - class36.field415, var35.field5623 - class42.field457, var35.field5634, var5, (class141) null);
                                                    }
                                                    if (var35.field5618 != null) {
                                                        var35.field5618.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var35.field5621 - class245.field3859, var35.field5626 - class36.field415, var35.field5623 - class42.field457, var35.field5634, var5, (class141) null);
                                                    }
                                                    if (var35.field5619 != null) {
                                                        var35.field5619.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var35.field5621 - class245.field3859, var35.field5626 - class36.field415, var35.field5623 - class42.field457, var35.field5634, var5, (class141) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field2981;
                                            if (var36 != 0) {
                                                if (var3 < class282.field4461 && (var36 & 0x4) != 0) {
                                                    class196 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field3000) {
                                                        class294.field4628.method1814(var37, true);
                                                    }
                                                }
                                                if (var4 < class55.field652 && (var36 & 0x2) != 0) {
                                                    class196 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field3000) {
                                                        class294.field4628.method1814(var38, true);
                                                    }
                                                }
                                                if (var3 > class282.field4461 && (var36 & 0x1) != 0) {
                                                    class196 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field3000) {
                                                        class294.field4628.method1814(var39, true);
                                                    }
                                                }
                                                if (var4 > class55.field652 && (var36 & 0x8) != 0) {
                                                    class196 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field3000) {
                                                        class294.field4628.method1814(var40, true);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3002 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field2979; var42++) {
                                                if (class262.field4160 != var2.field2998[var42].field495 && (var2.field2988[var42] & var2.field3002) == var2.field2995) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class123 var43 = var2.field2999;
                                                if (!class108.method700(var6, var3, var4, var43.field1690)) {
                                                    if (class272.field4317) {
                                                        label1037: {
                                                            if ((var43.field1702 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field1688 - class245.field3859;
                                                                int var45 = var43.field1695 - class42.field457;
                                                                int var46 = (int) (var43.field1702 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class293.field4607 - 1) {
                                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3 - 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class236.field3633 - 1 && var4 < class293.field4607 - 1) {
                                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3 + 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class236.field3633 - 1 && var4 > 0) {
                                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3 + 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3 - 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                }
                                                            }
                                                            class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field1697.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var43.field1688 - class245.field3859, var43.field1698 - class36.field415, var43.field1695 - class42.field457, var43.field1702, var5, (class141) null);
                                                }
                                                var2.field3002 = 0;
                                            }
                                        }
                                        if (!var2.field2984) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field2979;
                                            var2.field2984 = false;
                                            int var48 = 0;
                                            label844: for (int var49 = 0; var49 < var47; var49++) {
                                                class44 var50 = var2.field2998[var49];
                                                if (class262.field4160 != var50.field495) {
                                                    for (int var51 = var50.field504; var51 <= var50.field501; var51++) {
                                                        for (int var52 = var50.field497; var52 <= var50.field498; var52++) {
                                                            class196 var53 = var7[var51][var52];
                                                            if (var53.field2983) {
                                                                var2.field2984 = true;
                                                                continue label844;
                                                            }
                                                            if (var53.field3002 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field504) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field501) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field497) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field498) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field3002) == var2.field2993) {
                                                                    var2.field2984 = true;
                                                                    continue label844;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class301.field4699[var48++] = var50;
                                                    int var55 = class282.field4461 - var50.field504;
                                                    int var56 = var50.field501 - class282.field4461;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class55.field652 - var50.field497;
                                                    int var58 = var50.field498 - class55.field652;
                                                    if (var58 > var57) {
                                                        var50.field507 = var55 + var58;
                                                    } else {
                                                        var50.field507 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class44 var62 = class301.field4699[var61];
                                                    if (class262.field4160 != var62.field495) {
                                                        if (var62.field507 > var59) {
                                                            var59 = var62.field507;
                                                            var60 = var61;
                                                        } else if (var62.field507 == var59) {
                                                            int var63 = var62.field503 - class245.field3859;
                                                            int var64 = var62.field509 - class42.field457;
                                                            int var65 = class301.field4699[var60].field503 - class245.field3859;
                                                            int var66 = class301.field4699[var60].field509 - class42.field457;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class44 var67 = class301.field4699[var60];
                                                var67.field495 = class262.field4160;
                                                if (!class292.method2080(var6, var67.field504, var67.field501, var67.field497, var67.field498, var67.field494.method417())) {
                                                    if (class272.field4317) {
                                                        if ((var67.field502 & 0xFC000L) == 147456L) {
                                                            class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                                                            int var68 = var67.field503 - class245.field3859;
                                                            int var69 = var67.field509 - class42.field457;
                                                            int var70 = (int) (var67.field502 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class195.method1363(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class195.method1363(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class195.method1363(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class195.method1363(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class195.method1366(class245.field3859, class36.field415, class42.field457, var5, var67.field504, var67.field497, var67.field501, var67.field498);
                                                        }
                                                    }
                                                    var67.field494.method410(var67.field496, class58.field682, class4.field46, class210.field3161, class251.field3981, var67.field503 - class245.field3859, var67.field499 - class36.field415, var67.field509 - class42.field457, var67.field502, var5, (class141) null);
                                                }
                                                for (int var71 = var67.field504; var71 <= var67.field501; var71++) {
                                                    for (int var72 = var67.field497; var72 <= var67.field498; var72++) {
                                                        class196 var73 = var7[var71][var72];
                                                        if (var73.field3002 != 0) {
                                                            class294.field4628.method1814(var73, true);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field3000) {
                                                            class294.field4628.method1814(var73, true);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2984) {
                                                break;
                                            }
                                        } catch (Exception var135) {
                                            var2.field2984 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field3001 != null) {
                                        if (class272.field4317) {
                                            GL var75 = class272.field4310;
                                            class272.method1924(var8);
                                            class141.method990(class245.field3859, class36.field415, class42.field457);
                                            int var76 = var2.field2986 * 128 + 64 - class245.field3859;
                                            int var77 = class72.field902[var5][var2.field2986][var2.field2982] - class36.field415;
                                            int var78 = var2.field2982 * 128 + 64 - class42.field457;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class72.field902[var5][var2.field2986][var2.field2982] - class72.field902[var5 + 1][var2.field2986][var2.field2982];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class251.field3981 * var78 - class210.field3161 * var76 >> 16;
                                            int var81 = class58.field682 * var77 + class4.field46 * var80 >> 16;
                                            int var82 = (class58.field682 * 0 + class4.field46 * 91 >> 16) + var81;
                                            int var83 = (class4.field46 * -91 - class58.field682 * var79 >> 16) + var81;
                                            if (var83 < var82 - 1597) {
                                                var83 = var82 - 1597;
                                            }
                                            int var84 = var82 + 2 - var83;
                                            class83 var85 = null;
                                            class165 var86 = null;
                                            int var87 = -1;
                                            class83 var88 = (class83) var2.field3001.method2033(19696);
                                            while (true) {
                                                label1054: {
                                                    if (var88 != null) {
                                                        if (var88.field1086 == null || var88.field1086.field2532.field2175) {
                                                            var88.method222((byte) -108);
                                                            break label1054;
                                                        }
                                                        if ((byte) ((int) (var88.field1086.field2532.field2173 & 0xFFL)) != var2.field2989) {
                                                            var2.field3001 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field1086;
                                                            var87 = var86.field2557.field1811;
                                                            break label1054;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field1086 != var86 || var88.field1086.field2557.field1811 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class141.field2192[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class141.field2190[var90] = 0;
                                                        }
                                                        class141.field2194 = 0;
                                                        for (class83 var91 = var85; var91 != var88; var91 = (class83) var91.field450) {
                                                            if (var91.field1086 != null) {
                                                                int var92 = (var91.field1079 >> 12) - class245.field3859;
                                                                int var93 = (var91.field1078 >> 12) - class36.field415;
                                                                int var94 = (var91.field1083 >> 12) - class42.field457;
                                                                int var95 = class251.field3981 * var94 - class210.field3161 * var92 >> 16;
                                                                int var96 = (class58.field682 * var93 + class4.field46 * var95 >> 16) - var83;
                                                                if (class141.field2192[var96] < 32) {
                                                                    class141.field2188[var96][class141.field2192[var96]++] = var91.field1075;
                                                                } else {
                                                                    if (class141.field2192[var96] == 32) {
                                                                        if (class141.field2194 == 32) {
                                                                            if (class141.field2183) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class141.field2192[var96] += class141.field2194++ + 1;
                                                                    }
                                                                    int var97 = class141.field2190[class141.field2192[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class141.field2186[class141.field2192[var96] - 32 - 1];
                                                                        int var10002 = class141.field2192[var96] - 32 - 1;
                                                                        int var10004 = class141.field2190[class141.field2192[var96] - 32 - 1];
                                                                        class141.field2190[var10002] = class141.field2190[class141.field2192[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field1075;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field3001.field4449 == var91.field450) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class141.field2177 && var86.field2557.field1853 != -1) {
                                                            class104.field1438.method883((byte) -20, var86.field2557.field1853);
                                                            var98 = true;
                                                        } else {
                                                            class272.method1965(-1);
                                                        }
                                                        float var99 = (float) var87 * class141.field2211;
                                                        if (var99 > 64.0F) {
                                                            var99 = 64.0F;
                                                        }
                                                        var75.glPointSize(var99);
                                                        var86.field2532.method973(var75, var84, var98, var86.field2557.field1804);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field1086;
                                                            var87 = var88.field1086.field2557.field1811;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class83) var2.field3001.method2029(false);
                                            }
                                            class141.method971();
                                        } else {
                                            int var100 = class141.field2182 + class104.field1427;
                                            int var101 = class141.field2181 + class104.field1431;
                                            class41 var102 = var2.field3001.field4449;
                                            for (class41 var103 = var102.field450; var103 != var102; var103 = var103.field450) {
                                                class83 var104 = (class83) var103;
                                                if (var104.field1086 != null && !var104.field1086.field2532.field2175) {
                                                    if ((byte) ((int) (var104.field1086.field2532.field2173 & 0xFFL)) != var2.field2989) {
                                                        var2.field3001 = null;
                                                        break;
                                                    }
                                                    int var105 = (var104.field1079 >> 12) - class245.field3859;
                                                    int var106 = (var104.field1078 >> 12) - class36.field415;
                                                    int var107 = (var104.field1083 >> 12) - class42.field457;
                                                    int var108 = class251.field3981 * var105 + class210.field3161 * var107 >> 16;
                                                    int var109 = class251.field3981 * var107 - class210.field3161 * var105 >> 16;
                                                    int var111 = class4.field46 * var106 - class58.field682 * var109 >> 16;
                                                    int var112 = class58.field682 * var106 + class4.field46 * var109 >> 16;
                                                    if (var112 >= 50) {
                                                        int var114 = (var108 << 9) / var112 + var100;
                                                        int var115 = (var111 << 9) / var112 + var101;
                                                        int var116 = var112 * 400;
                                                        if (var116 == 0) {
                                                            var116 = 1;
                                                        }
                                                        class343.method2358(var114, var115, (var104.field1086.field2557.field1811 << 16) / var116, var104.field1087, var104.field1087 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field3000);
                            } while (var2.field3002 != 0);
                            if (var3 > class282.field4461 || var3 <= class185.field2788) {
                                break;
                            }
                            var117 = var7[var3 - 1][var4];
                        } while (var117 != null && var117.field3000);
                        if (var3 < class282.field4461 || var3 >= class13.field133 - 1) {
                            break;
                        }
                        var118 = var7[var3 + 1][var4];
                    } while (var118 != null && var118.field3000);
                    if (var4 > class55.field652 || var4 <= class238.field3660) {
                        break;
                    }
                    var119 = var7[var3][var4 - 1];
                } while (var119 != null && var119.field3000);
                if (var4 < class55.field652 || var4 >= class294.field4629 - 1) {
                    break;
                }
                var120 = var7[var3][var4 + 1];
            } while (var120 != null && var120.field3000);
            var2.field3000 = false;
            class89.field1172--;
            class353 var121 = var2.field2985;
            if (var121 != null && var121.field5632 != 0) {
                if (class272.field4317) {
                    class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                }
                if (var121.field5622 != null) {
                    var121.field5622.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var121.field5621 - class245.field3859, var121.field5626 - class36.field415 - var121.field5632, var121.field5623 - class42.field457, var121.field5634, var5, (class141) null);
                }
                if (var121.field5618 != null) {
                    var121.field5618.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var121.field5621 - class245.field3859, var121.field5626 - class36.field415 - var121.field5632, var121.field5623 - class42.field457, var121.field5634, var5, (class141) null);
                }
                if (var121.field5619 != null) {
                    var121.field5619.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var121.field5621 - class245.field3859, var121.field5626 - class36.field415 - var121.field5632, var121.field5623 - class42.field457, var121.field5634, var5, (class141) null);
                }
            }
            if (var2.field2980 != 0) {
                class54 var122 = var2.field2994;
                if (var122 != null && !class93.method617(var6, var3, var4, var122.field630.method417())) {
                    if ((var122.field620 & var2.field2980) != 0) {
                        if (class272.field4317) {
                            class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                        }
                        var122.field630.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var122.field624 + var122.field615 - class245.field3859, var122.field625 - class36.field415, var122.field622 + var122.field634 - class42.field457, var122.field627, var5, (class141) null);
                    } else if (var122.field620 == 256) {
                        int var123 = var122.field624 - class245.field3859;
                        int var124 = var122.field625 - class36.field415;
                        int var125 = var122.field622 - class42.field457;
                        int var126 = var122.field631;
                        int var127;
                        if (var126 == 1 || var126 == 2) {
                            var127 = -var123;
                        } else {
                            var127 = var123;
                        }
                        int var128;
                        if (var126 == 2 || var126 == 3) {
                            var128 = -var125;
                        } else {
                            var128 = var125;
                        }
                        if (var128 >= var127) {
                            if (class272.field4317) {
                                class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                            }
                            var122.field630.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var122.field615 + var123, var124, var122.field634 + var125, var122.field627, var5, (class141) null);
                        } else if (var122.field632 != null) {
                            if (class272.field4317) {
                                class195.method1353(class245.field3859, class36.field415, class42.field457, var5, var3, var4);
                            }
                            var122.field632.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var123, var124, var125, var122.field627, var5, (class141) null);
                        }
                    }
                }
                class123 var129 = var2.field2999;
                if (var129 != null) {
                    if ((var129.field1689 & var2.field2980) != 0 && !class108.method700(var6, var3, var4, var129.field1689)) {
                        if (class272.field4317) {
                            class195.method1360(var129.field1689, class245.field3859, class36.field415, class42.field457, var6, var3, var4);
                        }
                        var129.field1705.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var129.field1688 - class245.field3859, var129.field1698 - class36.field415, var129.field1695 - class42.field457, var129.field1702, var5, (class141) null);
                    }
                    if ((var129.field1690 & var2.field2980) != 0 && !class108.method700(var6, var3, var4, var129.field1690)) {
                        if (class272.field4317) {
                            class195.method1360(var129.field1690, class245.field3859, class36.field415, class42.field457, var6, var3, var4);
                        }
                        var129.field1697.method410(0, class58.field682, class4.field46, class210.field3161, class251.field3981, var129.field1688 - class245.field3859, var129.field1698 - class36.field415, var129.field1695 - class42.field457, var129.field1702, var5, (class141) null);
                    }
                }
            }
            if (var5 < class196.field2973 - 1) {
                class196 var130 = class194.field2947[var5 + 1][var3][var4];
                if (var130 != null && var130.field3000) {
                    class294.field4628.method1814(var130, true);
                }
            }
            if (var3 < class282.field4461) {
                class196 var131 = var7[var3 + 1][var4];
                if (var131 != null && var131.field3000) {
                    class294.field4628.method1814(var131, true);
                }
            }
            if (var4 < class55.field652) {
                class196 var132 = var7[var3][var4 + 1];
                if (var132 != null && var132.field3000) {
                    class294.field4628.method1814(var132, true);
                }
            }
            if (var3 > class282.field4461) {
                class196 var133 = var7[var3 - 1][var4];
                if (var133 != null && var133.field3000) {
                    class294.field4628.method1814(var133, true);
                }
            }
            if (var4 > class55.field652) {
                class196 var134 = var7[var3][var4 - 1];
                if (var134 != null && var134.field3000) {
                    class294.field4628.method1814(var134, true);
                }
            }
        }
    }
}
