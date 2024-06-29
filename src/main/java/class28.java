import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class28 extends class46 {

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public int field452 = 0;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field457 = 0;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)I")
    public static final int method204(byte arg0) {
        field449++;
        if (arg0 != 86) {
            method206(-66, -49, 26, -68, 122, -16);
        }
        int var1 = 3;
        if (class64.field1064 < 310) {
            int var2 = class47.field814 >> 7;
            int var3 = client.field545 >> 7;
            if ((class148.field2722[class139.field2615][var2][var3] & 0x4) != 0) {
                var1 = class139.field2615;
            }
            int var4 = class210.field3854.field723 >> 7;
            int var5;
            if (var3 >= var4) {
                var5 = var3 - var4;
            } else {
                var5 = var4 - var3;
            }
            int var6 = class210.field3854.field673 >> 7;
            int var7;
            if (var6 <= var2) {
                var7 = var2 - var6;
            } else {
                var7 = var6 - var2;
            }
            if (var5 < var7) {
                int var8 = 32768;
                int var9 = var5 * 65536 / var7;
                while (var2 != var6) {
                    var8 += var9;
                    if (var2 < var6) {
                        var2++;
                    } else if (var6 < var2) {
                        var2--;
                    }
                    if ((class148.field2722[class139.field2615][var2][var3] & 0x4) != 0) {
                        var1 = class139.field2615;
                    }
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var3 < var4) {
                            var3++;
                        } else if (var3 > var4) {
                            var3--;
                        }
                        if ((class148.field2722[class139.field2615][var2][var3] & 0x4) != 0) {
                            var1 = class139.field2615;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var5;
                int var11 = 32768;
                while (var3 != var4) {
                    var11 += var10;
                    if (var3 < var4) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    if ((class148.field2722[class139.field2615][var2][var3] & 0x4) != 0) {
                        var1 = class139.field2615;
                    }
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var6 > var2) {
                            var2++;
                        } else if (var6 < var2) {
                            var2--;
                        }
                        if ((class148.field2722[class139.field2615][var2][var3] & 0x4) != 0) {
                            var1 = class139.field2615;
                        }
                    }
                }
            }
        }
        if ((class148.field2722[class139.field2615][class210.field3854.field673 >> 7][class210.field3854.field723 >> 7] & 0x4) != 0) {
            var1 = class139.field2615;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILkd;)V")
    public final void method205(int arg0, class112 arg1) {
        field453++;
        if (arg0 >= -28) {
            this.field452 = -35;
        }
        while (true) {
            int var3 = arg1.method716(-1308);
            if (var3 == 0) {
                return;
            }
            this.method208(arg1, (byte) 65, var3);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIII)V")
    public static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class225.field4079 * 128) {
            arg0 = class225.field4079 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class14.field193 * 128) {
            arg2 = class14.field193 * 128 - 1;
        }
        class33.field520++;
        class203.field3723 = class50.field853[arg3];
        class40.field655 = class50.field851[arg3];
        class100.field1885 = class50.field853[arg4];
        class33.field524 = class50.field851[arg4];
        class213.field3897 = arg0;
        class58.field975 = arg1;
        class191.field3537 = arg2;
        class155.field2841 = arg0 / 128;
        class2.field29 = arg2 / 128;
        class167.field3047 = arg5;
        class191.field3557 = class155.field2841 - class205.field3756;
        if (class191.field3557 < 0) {
            class191.field3557 = 0;
        }
        class243.field4421 = class2.field29 - class205.field3756;
        if (class243.field4421 < 0) {
            class243.field4421 = 0;
        }
        class54.field918 = class205.field3756 + class155.field2841;
        if (class54.field918 > class225.field4079) {
            class54.field918 = class225.field4079;
        }
        class111.field2106 = class205.field3756 + class2.field29;
        if (class111.field2106 > class14.field193) {
            class111.field2106 = class14.field193;
        }
        short var6 = 3500;
        for (int var7 = 0; var7 < class205.field3756 + class205.field3756 + 2; var7++) {
            for (int var39 = 0; var39 < class205.field3756 + class205.field3756 + 2; var39++) {
                int var40 = (var7 - class205.field3756 << 7) - (arg0 & 0x7F);
                int var41 = (var39 - class205.field3756 << 7) - (arg2 & 0x7F);
                int var42 = class155.field2841 + var7 - class205.field3756;
                int var43 = class2.field29 + var39 - class205.field3756;
                if (var42 >= 0 && var43 >= 0 && var42 < class225.field4079 && var43 < class14.field193) {
                    int var44 = class78.field1364[0][var42][var43] + 128 - arg1;
                    int var45 = class78.field1364[3][var42][var43] - arg1 - 1000;
                    class97.field1859[var7][var39] = class89.method554(var40, var45, var44, var41, var6);
                } else {
                    class97.field1859[var7][var39] = false;
                }
            }
        }
        for (int var8 = 0; var8 < class205.field3756 + class205.field3756 + 1; var8++) {
            for (int var38 = 0; var38 < class205.field3756 + class205.field3756 + 1; var38++) {
                class9.field100[var8][var38] = class97.field1859[var8][var38] || class97.field1859[var8 + 1][var38] || class97.field1859[var8][var38 + 1] || class97.field1859[var8 + 1][var38 + 1];
            }
        }
        class184.method1175();
        class161.field2925 = 0;
        for (int var9 = class27.field448; var9 < class231.field4167; var9++) {
            class169[][] var34 = class101.field1900[var9];
            for (int var35 = class191.field3557; var35 < class54.field918; var35++) {
                for (int var36 = class243.field4421; var36 < class111.field2106; var36++) {
                    class169 var37 = var34[var35][var36];
                    if (var37 != null) {
                        if (var37.field3112 <= arg5 && class9.field100[var35 + class205.field3756 - class155.field2841][var36 + class205.field3756 - class2.field29]) {
                            var37.field3101 = true;
                            var37.field3113 = true;
                            if (var37.field3096 > 0) {
                                var37.field3090 = true;
                            } else {
                                var37.field3090 = false;
                            }
                            class161.field2925++;
                        } else {
                            var37.field3101 = false;
                            var37.field3113 = false;
                            var37.field3114 = 0;
                        }
                    }
                }
            }
        }
        for (int var10 = class27.field448; var10 < class231.field4167; var10++) {
            class169[][] var23 = class101.field1900[var10];
            for (int var24 = -class205.field3756; var24 <= 0; var24++) {
                int var25 = class155.field2841 + var24;
                int var26 = class155.field2841 - var24;
                if (var25 >= class191.field3557 || var26 < class54.field918) {
                    for (int var27 = -class205.field3756; var27 <= 0; var27++) {
                        int var28 = class2.field29 + var27;
                        int var29 = class2.field29 - var27;
                        if (var25 >= class191.field3557) {
                            if (var28 >= class243.field4421) {
                                class169 var30 = var23[var25][var28];
                                if (var30 != null && var30.field3101) {
                                    class73.method443(var30, true);
                                }
                            }
                            if (var29 < class111.field2106) {
                                class169 var31 = var23[var25][var29];
                                if (var31 != null && var31.field3101) {
                                    class73.method443(var31, true);
                                }
                            }
                        }
                        if (var26 < class54.field918) {
                            if (var28 >= class243.field4421) {
                                class169 var32 = var23[var26][var28];
                                if (var32 != null && var32.field3101) {
                                    class73.method443(var32, true);
                                }
                            }
                            if (var29 < class111.field2106) {
                                class169 var33 = var23[var26][var29];
                                if (var33 != null && var33.field3101) {
                                    class73.method443(var33, true);
                                }
                            }
                        }
                        if (class161.field2925 == 0) {
                            class154.field2818 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var11 = class27.field448; var11 < class231.field4167; var11++) {
            class169[][] var12 = class101.field1900[var11];
            for (int var13 = -class205.field3756; var13 <= 0; var13++) {
                int var14 = class155.field2841 + var13;
                int var15 = class155.field2841 - var13;
                if (var14 >= class191.field3557 || var15 < class54.field918) {
                    for (int var16 = -class205.field3756; var16 <= 0; var16++) {
                        int var17 = class2.field29 + var16;
                        int var18 = class2.field29 - var16;
                        if (var14 >= class191.field3557) {
                            if (var17 >= class243.field4421) {
                                class169 var19 = var12[var14][var17];
                                if (var19 != null && var19.field3101) {
                                    class73.method443(var19, false);
                                }
                            }
                            if (var18 < class111.field2106) {
                                class169 var20 = var12[var14][var18];
                                if (var20 != null && var20.field3101) {
                                    class73.method443(var20, false);
                                }
                            }
                        }
                        if (var15 < class54.field918) {
                            if (var17 >= class243.field4421) {
                                class169 var21 = var12[var15][var17];
                                if (var21 != null && var21.field3101) {
                                    class73.method443(var21, false);
                                }
                            }
                            if (var18 < class111.field2106) {
                                class169 var22 = var12[var15][var18];
                                if (var22 != null && var22.field3101) {
                                    class73.method443(var22, false);
                                }
                            }
                        }
                        if (class161.field2925 == 0) {
                            class154.field2818 = false;
                            return;
                        }
                    }
                }
            }
        }
        class154.field2818 = false;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(ILkd;)Lg;")
    public static final class67 method207(int arg0, class112 arg1) {
        field456++;
        if (arg0 != 3) {
            method209(null, null, null, (byte) -32);
        }
        return new class67(arg1.method750(65280), arg1.method750(65280), arg1.method750(65280), arg1.method750(65280), arg1.method718(false), arg1.method716(-1308));
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lkd;BI)V")
    private final void method208(class112 arg0, byte arg1, int arg2) {
        if (arg2 == 2) {
            this.field452 = arg0.method739(19);
        }
        if (arg1 != 65) {
            field457 = 25;
        }
        field454++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lmb;Lmb;Lpb;B)[Lrd;")
    public static final class188[] method209(class132 arg0, class132 arg1, class165 arg2, byte arg3) {
        field455++;
        int var4 = arg2.method1065(arg0, -1);
        if (arg3 < 81) {
            field457 = 68;
        }
        int var5 = arg2.method1090(-1, arg1, var4);
        return class97.method613(var4, true, arg2, var5);
    }
}
