import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class536 extends class108 {

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Liu;")
    public static class517 field7481 = new class517(98, 3);

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "[Z")
    public static boolean[] field7484 = new boolean[100];

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public int field7470;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public int field7472;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int field7473;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int field7475;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field7476;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field7477;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public int field7478;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public int field7480;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public int field7482;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public int field7483;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public int field7485;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public int field7488;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nc", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field7489;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "[I")
    public static int[] field7486;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method3020(int arg0) {
        field7481 = null;
        if (arg0 > 126) {
            field7486 = null;
            field7484 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLqa;I)Lr;")
    public final class519 method3021(boolean arg0, class167 arg1, int arg2) {
        if (!arg0) {
            return null;
        }
        field7479++;
        int var4 = class226.field3372[this.field7483];
        class519 var5 = null;
        if (var4 == 0) {
            class363 var12 = class507.method2859(this.field7485, this.field7472, this.field7475);
            if (var12 instanceof class121) {
                class121 var13 = (class121) var12;
                if (var13.field1933 != null) {
                    var5 = ((class231) var13.field1933).method254(arg2, arg1, false);
                }
            }
        } else if (var4 == 1) {
            class367 var10 = class485.method2786(this.field7485, this.field7472, this.field7475);
            if (var10 instanceof class280) {
                class280 var11 = (class280) var10;
                if (var11.field4091 != null) {
                    var5 = ((class231) var11.field4091).method254(arg2, arg1, !arg0);
                }
            }
        } else if (var4 == 2) {
            class360 var6 = class460.method2691(this.field7485, this.field7472, this.field7475, field7489 == null ? (field7489 = method3023("p")) : field7489);
            if (var6 instanceof class262) {
                class262 var7 = (class262) var6;
                if (var7.field3809 != null) {
                    var5 = ((class231) var7.field3809).method254(arg2, arg1, false);
                }
            }
        } else if (var4 == 3) {
            class493 var8 = class621.method3504(this.field7485, this.field7472, this.field7475);
            if (var8 instanceof class409) {
                class409 var9 = (class409) var8;
                if (var9.field6083 != null) {
                    var5 = ((class231) var9.field6083).method254(arg2, arg1, false);
                }
            }
        }
        return var5 == null ? null : var5.method765((byte) 0, arg2, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljba;Lbr;)V")
    public static final void method3022(class648 arg0, class184 arg1) {
        if (!arg1.field2661) {
            return;
        }
        short var2 = arg1.field2676;
        short var3 = arg1.field2655;
        byte var4 = arg1.field2656;
        byte var5 = arg1.field2668;
        int var6 = (var2 << class162.field2401) + class468.field6745;
        int var7 = (var3 << class162.field2401) + class468.field6745;
        class184[][] var8 = class277.field4051[var4];
        float var9;
        if (class88.field1594 == class73.field1360) {
            class103.field1747.method572(class587.field8363[0].method695(var6, var7), class531.method2989(var2, var3), class217.method1463(var2, var3), class367.method2215(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class103.field1747.method517(3000.0F, var9 * 1.5F);
        if (arg1.field2654) {
            if (class287.field4180) {
                if (var4 > 0) {
                    class184 var10 = class277.field4051[var4 - 1][var2][var3];
                    if (var10 != null && var10.field2661) {
                        return;
                    }
                }
                if (var2 <= class119.field1913 && var2 > class225.field3359) {
                    class184 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field2661 && (var11.field2654 || (arg1.field2671 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class119.field1913 && var2 < class387.field5759 - 1) {
                    class184 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field2661 && (var12.field2654 || (arg1.field2671 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class389.field5811 && var3 > class648.field9398) {
                    class184 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field2661 && (var13.field2654 || (arg1.field2671 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class389.field5811 && var3 < class440.field6418 - 1) {
                    class184 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field2661 && (var14.field2654 || (arg1.field2671 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class287.field4180 = true;
            }
            arg1.field2654 = false;
            if (arg1.field2667 != null) {
                class184 var15 = arg1.field2667;
                class103.field1747.method517(3000.0F, (201.5F - (float) (var15.field2668 + 1) * 50.0F) * 1.5F);
                if (!class343.method2091(var15.field2668, var2, var3)) {
                    class88.field1594[var15.field2668].method693(var2, var3);
                }
                class363 var16 = var15.field2669;
                if (var16 != null) {
                    if (class58.field823) {
                        if ((var16.field5149 & arg1.field2658) == 0) {
                            class321.method2002(arg0, var4, var2, var3);
                        } else {
                            class390.method2359(arg0, var16.field5149, var5, var2, var3);
                        }
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    var16.method267(class103.field1747, 2);
                }
                for (class277 var17 = var15.field2675; var17 != null; var17 = var17.field4045) {
                    class360 var18 = var17.field4044;
                    if (var18 != null) {
                        if (class58.field823) {
                            class321.method2002(arg0, var4, var2, var3);
                            class103.field1747.method586(arg0.field9393, arg0.field9399);
                        }
                        var18.method267(class103.field1747, 2);
                    }
                }
                class103.field1747.method517(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class343.method2091(var5, var2, var3);
            if (var19) {
                class88.field1594[var5].method693(var2, var3);
                class493 var20 = arg1.field2662;
                if (var20 != null && var20.field6924) {
                    if (var20.field6922) {
                        class103.field1747.method517(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class58.field823) {
                        class321.method2002(arg0, var4, var2, var3);
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    class465 var21 = var20.method267(class103.field1747, 2);
                    if (var21 != null) {
                        var21.field6710 = var20;
                        var21.field6712 = var4;
                        var21.field6709 = var2;
                        var21.field6713 = var3;
                        class578.field8241.method952((byte) 51, var21);
                    }
                    if (var20.field6922) {
                        class103.field1747.method517(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class363 var24 = arg1.field2669;
            class367 var25 = arg1.field2672;
            if (var24 != null || var25 != null) {
                if (class119.field1913 == var2) {
                    var22++;
                } else if (class119.field1913 < var2) {
                    var22 += 2;
                }
                if (class389.field5811 == var3) {
                    var22 += 3;
                } else if (class389.field5811 > var3) {
                    var22 += 6;
                }
                var23 = class33.field449[var22];
                arg1.field2658 = class516.field7186[var22];
            }
            if (var24 != null) {
                if ((var24.field5149 & class162.field2404[var22]) == 0) {
                    arg1.field2674 = 0;
                } else if (var24.field5149 == 16) {
                    arg1.field2674 = 3;
                    arg1.field2665 = class327.field4716[var22];
                    arg1.field2664 = (byte) (3 - arg1.field2665);
                } else if (var24.field5149 == 32) {
                    arg1.field2674 = 6;
                    arg1.field2665 = class393.field5891[var22];
                    arg1.field2664 = (byte) (6 - arg1.field2665);
                } else if (var24.field5149 == 64) {
                    arg1.field2674 = 12;
                    arg1.field2665 = class85.field1549[var22];
                    arg1.field2664 = (byte) (12 - arg1.field2665);
                } else {
                    arg1.field2674 = 9;
                    arg1.field2665 = class85.field1554[var22];
                    arg1.field2664 = (byte) (9 - arg1.field2665);
                }
                if ((var24.field5149 & var23) != 0 && !class526.method2969(var5, var2, var3, var24.field5149)) {
                    if (class58.field823) {
                        class321.method2002(arg0, var4, var2, var3);
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    class465 var26 = var24.method267(class103.field1747, 2);
                    if (var26 != null) {
                        var26.field6710 = var24;
                        var26.field6712 = var4;
                        var26.field6709 = var2;
                        var26.field6713 = var3;
                        class578.field8241.method952((byte) 27, var26);
                    }
                }
                class363 var27 = arg1.field2653;
                if (var27 != null && (var27.field5149 & var23) != 0 && !class526.method2969(var5, var2, var3, var27.field5149)) {
                    if (class58.field823) {
                        class321.method2002(arg0, var4, var2, var3);
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    class465 var28 = var27.method267(class103.field1747, 2);
                    if (var28 != null) {
                        var28.field6710 = var27;
                        var28.field6712 = var4;
                        var28.field6709 = var2;
                        var28.field6713 = var3;
                        class578.field8241.method952((byte) 19, var28);
                    }
                }
            }
            if (var25 != null && !class437.method2592(var5, var2, var3, var25.method261((byte) -127))) {
                class367 var29 = arg1.field2666;
                class103.field1747.method517(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field5211 & var23) != 0) {
                    if (class58.field823) {
                        class321.method2002(arg0, var4, var2, var3);
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    class465 var30 = var25.method267(class103.field1747, 2);
                    if (var30 != null) {
                        var30.field6710 = var25;
                        var30.field6712 = var4;
                        var30.field6709 = var2;
                        var30.field6713 = var3;
                        class578.field8241.method952((byte) 28, var30);
                    }
                } else if (var25.field5211 == 256) {
                    int var31 = var25.field5209 - class307.field4422;
                    int var32 = var25.field5198 - class358.field5090;
                    int var33 = var25.field5212;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class58.field823) {
                        class321.method2002(arg0, var4, var2, var3);
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    if (var35 < var34) {
                        class465 var36 = var25.method267(class103.field1747, 2);
                        if (var36 != null) {
                            var36.field6710 = var25;
                            var36.field6712 = var4;
                            var36.field6709 = var2;
                            var36.field6713 = var3;
                            class578.field8241.method952((byte) 109, var36);
                        }
                    } else if (var29 != null) {
                        class465 var37 = var29.method267(class103.field1747, 2);
                        if (var37 != null) {
                            var37.field6710 = var29;
                            var37.field6712 = var4;
                            var37.field6709 = var2;
                            var37.field6713 = var3;
                            class578.field8241.method952((byte) 100, var37);
                        }
                    }
                }
                class103.field1747.method517(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class493 var38 = arg1.field2662;
                if (var38 != null && !var38.field6924) {
                    if (var38.field6922) {
                        class103.field1747.method517(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class58.field823) {
                        class321.method2002(arg0, var4, var2, var3);
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    class465 var39 = var38.method267(class103.field1747, 2);
                    if (var39 != null) {
                        var39.field6710 = var38;
                        var39.field6712 = var4;
                        var39.field6709 = var2;
                        var39.field6713 = var3;
                        class578.field8241.method952((byte) 106, var39);
                    }
                    if (var38.field6922) {
                        class103.field1747.method517(3000.0F, var9 * 1.5F);
                    }
                }
                class382 var40 = arg1.field2657;
                if (var40 != null && !var40.field5675) {
                    if (class58.field823) {
                        class321.method2002(arg0, var4, var2, var3);
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    class465 var41 = var40.method267(class103.field1747, 2);
                    if (var41 != null) {
                        var41.field6710 = var40;
                        var41.field6712 = var4;
                        var41.field6709 = var2;
                        var41.field6713 = var3;
                        class578.field8241.method952((byte) 26, var41);
                    }
                }
            }
            byte var42 = arg1.field2671;
            if (var42 != 0) {
                if (var2 < class119.field1913 && (var42 & 0x4) != 0) {
                    class184 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field2661) {
                        class181.field2624.method854(true, var43);
                    }
                }
                if (var3 < class389.field5811 && (var42 & 0x2) != 0) {
                    class184 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field2661) {
                        class181.field2624.method854(true, var44);
                    }
                }
                if (var2 > class119.field1913 && (var42 & 0x1) != 0) {
                    class184 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field2661) {
                        class181.field2624.method854(true, var45);
                    }
                }
                if (var3 > class389.field5811 && (var42 & 0x8) != 0) {
                    class184 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field2661) {
                        class181.field2624.method854(true, var46);
                    }
                }
            }
        }
        if (arg1.field2674 != 0) {
            boolean var47 = true;
            for (class277 var48 = arg1.field2675; var48 != null; var48 = var48.field4045) {
                if (class115.field1893 != var48.field4044.field5114 && (var48.field4049 & arg1.field2674) == arg1.field2665) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class363 var49 = arg1.field2669;
                if (!class526.method2969(var5, var2, var3, var49.field5149)) {
                    if (class58.field823) {
                        label682: {
                            if (var49.field5149 >= 16) {
                                int var50 = var2 - class119.field1913;
                                int var51 = var3 - class389.field5811;
                                if (var49.field5149 == 16) {
                                    int var52 = var50 - class468.field6745;
                                    int var53 = class468.field6745 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class305.field4400) {
                                        class321.method2002(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field5149 == 32) {
                                    int var54 = class468.field6745 + var50;
                                    int var55 = class468.field6745 + var51;
                                    if (var55 < -var54 && var2 < class362.field5145 && var3 < class305.field4400) {
                                        class321.method2002(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field5149 == 64) {
                                    int var56 = class468.field6745 + var50;
                                    int var57 = var51 - class468.field6745;
                                    if (var57 > var56 && var2 < class362.field5145 && var3 > 0) {
                                        class321.method2002(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field5149 == 128) {
                                    int var58 = var50 - class468.field6745;
                                    int var59 = var51 - class468.field6745;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class321.method2002(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class321.method2002(arg0, var4, var2, var3);
                        }
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    class465 var60 = var49.method267(class103.field1747, 2);
                    if (var60 != null) {
                        var60.field6710 = var49;
                        var60.field6712 = var4;
                        var60.field6709 = var2;
                        var60.field6713 = var3;
                        class578.field8241.method952((byte) 81, var60);
                    }
                }
                arg1.field2674 = 0;
            }
        }
        if (arg1.field2670) {
            try {
                arg1.field2670 = false;
                int var61 = 0;
                label625: for (class277 var62 = arg1.field2675; var62 != null; var62 = var62.field4045) {
                    class360 var63 = var62.field4044;
                    if (class115.field1893 != var63.field5114) {
                        for (int var64 = var63.field5117; var64 <= var63.field5119; var64++) {
                            for (int var65 = var63.field5113; var65 <= var63.field5107; var65++) {
                                class184 var66 = var8[var64][var65];
                                if (var66.field2654) {
                                    arg1.field2670 = true;
                                    continue label625;
                                }
                                if (var66.field2674 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field5117) {
                                        var67++;
                                    }
                                    if (var64 < var63.field5119) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field5113) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field5107) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field2674) == arg1.field2664) {
                                        arg1.field2670 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class119.field1913 - var63.field5117;
                        int var69 = var63.field5119 - class119.field1913;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class389.field5811 - var63.field5113;
                        int var71 = var63.field5107 - class389.field5811;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field9396[var61] = var63;
                        arg0.field9395[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class360 var75 = arg0.field9396[var74];
                        if (class115.field1893 != var75.field5114) {
                            int var76 = arg0.field9395[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field5108 - class307.field4422;
                                int var78 = var75.field5109 - class358.field5090;
                                int var79 = arg0.field9396[var73].field5108 - class307.field4422;
                                int var80 = arg0.field9396[var73].field5109 - class358.field5090;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class360 var81 = arg0.field9396[var73];
                    var81.field5114 = class115.field1893;
                    if (!class403.method2460(var5, var81.field5117, var81.field5119, var81.field5113, var81.field5107, var81.method1175(false))) {
                        if (class58.field823) {
                            if (var81.field5110 == 0) {
                                class549.method3091(arg0, var4, var81.field5117, var81.field5113, var81.field5119, var81.field5107);
                            } else {
                                class321.method2002(arg0, var4, var2, var3);
                                int var82 = var2 - class119.field1913;
                                int var83 = var3 - class389.field5811;
                                if (var81.field5110 == 2) {
                                    if (var83 > -var82) {
                                        class27.method253(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class27.method253(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class27.method253(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class27.method253(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class103.field1747.method586(arg0.field9393, arg0.field9399);
                        }
                        class465 var84 = var81.method267(class103.field1747, 2);
                        if (var84 != null) {
                            var84.field6710 = var81;
                            var84.field6712 = var4;
                            var84.field6709 = var81.field5117;
                            var84.field6713 = var81.field5113;
                            class578.field8241.method952((byte) 105, var84);
                        }
                    }
                    for (int var85 = var81.field5117; var85 <= var81.field5119; var85++) {
                        for (int var86 = var81.field5113; var86 <= var81.field5107; var86++) {
                            class184 var87 = var8[var85][var86];
                            if (var87.field2674 != 0) {
                                class181.field2624.method854(true, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field2661) {
                                class181.field2624.method854(true, var87);
                            }
                        }
                    }
                }
                if (arg1.field2670) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field2670 = false;
            }
        }
        if (arg1.field2673 != null && (byte) (class513.field7102 & 0xFF) == arg1.field2660) {
            class616 var88 = arg1.field2673;
            int var89 = class88.field1594[var4].method694(var2, var3);
            int var90;
            if (var4 < class146.field2246 - 1) {
                var90 = class88.field1594[var4].method694(var2, var3) - class88.field1594[var4 + 1].method694(var2, var3);
            } else {
                var90 = 0x8 << class162.field2401;
            }
            class142.field2218.method880(var6, var89, var7, arg0.field9392);
            int var91 = arg0.field9392[2];
            class142.field2218.method880(var6, var89 - var90, var7, arg0.field9392);
            int var92 = arg0.field9392[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class434.field6377;
            int var96 = class434.field6377 + var94;
            var88.field8724 = var95;
            var88.field8725 = var96;
            var88.field8726 = true;
            class103.field1747.method563(var88);
        }
        if (!arg1.field2661) {
            return;
        }
        if (arg1.field2674 != 0) {
            return;
        }
        if (var2 <= class119.field1913 && var2 > class225.field3359) {
            class184 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field2661) {
                return;
            }
        }
        if (var2 >= class119.field1913 && var2 < class387.field5759 - 1) {
            class184 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field2661) {
                return;
            }
        }
        if (var3 <= class389.field5811 && var3 > class648.field9398) {
            class184 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field2661) {
                return;
            }
        }
        if (var3 >= class389.field5811 && var3 < class440.field6418 - 1) {
            class184 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field2661) {
                return;
            }
        }
        arg1.field2661 = false;
        class339.field4871--;
        class382 var101 = arg1.field2657;
        if (var101 != null && var101.field5675) {
            if (class58.field823) {
                class321.method2002(arg0, var4, var2, var3);
                class103.field1747.method586(arg0.field9393, arg0.field9399);
            }
            class465 var102 = var101.method267(class103.field1747, 2);
            if (var102 != null) {
                var102.field6710 = var101;
                var102.field6712 = var4;
                var102.field6709 = var2;
                var102.field6713 = var3;
                class578.field8241.method952((byte) 97, var102);
            }
        }
        if (arg1.field2658 != 0) {
            class367 var103 = arg1.field2672;
            if (var103 != null && !class437.method2592(var5, var2, var3, var103.method261((byte) -119))) {
                if ((var103.field5211 & arg1.field2658) != 0) {
                    if (class58.field823) {
                        class321.method2002(arg0, var4, var2, var3);
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    class465 var104 = var103.method267(class103.field1747, 2);
                    if (var104 != null) {
                        var104.field6710 = var103;
                        var104.field6712 = var4;
                        var104.field6709 = var2;
                        var104.field6713 = var3;
                        class578.field8241.method952((byte) 69, var104);
                    }
                } else if (var103.field5211 == 256) {
                    int var105 = var103.field5209 - class307.field4422;
                    int var106 = var103.field5198 - class358.field5090;
                    int var107 = var103.field5212;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class58.field823) {
                        class321.method2002(arg0, var4, var2, var3);
                        class103.field1747.method586(arg0.field9393, arg0.field9399);
                    }
                    class367 var110 = arg1.field2666;
                    if (var109 > var108) {
                        class465 var111 = var103.method267(class103.field1747, 2);
                        if (var111 != null) {
                            var111.field6710 = var103;
                            var111.field6712 = var4;
                            var111.field6709 = var2;
                            var111.field6713 = var3;
                            class578.field8241.method952((byte) 32, var111);
                        }
                    } else if (var110 != null) {
                        class465 var112 = var110.method267(class103.field1747, 2);
                        if (var112 != null) {
                            var112.field6710 = var110;
                            var112.field6712 = var4;
                            var112.field6709 = var2;
                            var112.field6713 = var3;
                            class578.field8241.method952((byte) 28, var112);
                        }
                    }
                }
            }
            class363 var113 = arg1.field2669;
            class363 var114 = arg1.field2653;
            if (var114 != null && (var114.field5149 & arg1.field2658) != 0 && !class526.method2969(var5, var2, var3, var114.field5149)) {
                if (class58.field823) {
                    class390.method2359(arg0, var114.field5149, var4, var2, var3);
                    class103.field1747.method586(arg0.field9393, arg0.field9399);
                }
                class465 var115 = var114.method267(class103.field1747, 2);
                if (var115 != null) {
                    var115.field6710 = var114;
                    var115.field6712 = var4;
                    var115.field6709 = var2;
                    var115.field6713 = var3;
                    class578.field8241.method952((byte) 126, var115);
                }
            }
            if (var113 != null && (var113.field5149 & arg1.field2658) != 0 && !class526.method2969(var5, var2, var3, var113.field5149)) {
                if (class58.field823) {
                    class390.method2359(arg0, var113.field5149, var4, var2, var3);
                    class103.field1747.method586(arg0.field9393, arg0.field9399);
                }
                class465 var116 = var113.method267(class103.field1747, 2);
                if (var116 != null) {
                    var116.field6710 = var113;
                    var116.field6712 = var4;
                    var116.field6709 = var2;
                    var116.field6713 = var3;
                    class578.field8241.method952((byte) 52, var116);
                }
            }
        }
        if (var4 < class146.field2246 - 1) {
            class184 var117 = class277.field4051[var4 + 1][var2][var3];
            if (var117 != null && var117.field2661) {
                class181.field2624.method850(var117, (byte) 31);
            }
        }
        if (var2 < class119.field1913) {
            class184 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field2661) {
                class181.field2624.method854(true, var118);
            }
        }
        if (var3 < class389.field5811) {
            class184 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field2661) {
                class181.field2624.method854(true, var119);
            }
        }
        if (var2 > class119.field1913) {
            class184 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field2661) {
                class181.field2624.method854(true, var120);
            }
        }
        if (var3 > class389.field5811) {
            class184 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field2661) {
                class181.field2624.method854(true, var121);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3023(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
