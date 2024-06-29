import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class271 extends class288 {

    @OriginalMember(owner = "client!va", name = "r", descriptor = "[I")
    public static int[] field3956 = new int[64];

    @OriginalMember(owner = "client!va", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3971 = "wave2:";

    @OriginalMember(owner = "client!va", name = "N", descriptor = "[I")
    public static int[] field3978 = new int[500];

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public int field3966;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public int field3974;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lbb;")
    public class173 field3964;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Lr;")
    public class238 field3979;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Lqe;")
    public class278 field3972;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Lik;")
    public class295 field3961;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1733(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class158.field2285++;
        class152.field2209 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class88.field1202; var12 < class202.field2868; var12++) {
            class133[][] var38 = class6.field94[var12];
            for (int var39 = class255.field3674; var39 < class290.field4543; var39++) {
                for (int var40 = class68.field797; var40 < class203.field2882; var40++) {
                    class133 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class252.field3642[var39 + class46.field547 - class139.field2025][var40 + class46.field547 - class178.field2538] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1926 = true;
                            var41.field1923 = true;
                            if (var41.field1934 > 0) {
                                var41.field1931 = true;
                            } else {
                                var41.field1931 = false;
                            }
                            class152.field2209++;
                        } else {
                            var41.field1926 = false;
                            var41.field1923 = false;
                            var41.field1913 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1927 != null) {
                                    class118 var42 = var41.field1927;
                                    var42.field1672.method229(0, var12, var42.field1673, var42.field1670, var42.field1661);
                                    if (var42.field1659 != null) {
                                        var42.field1659.method229(0, var12, var42.field1673, var42.field1670, var42.field1661);
                                    }
                                }
                                if (var41.field1920 != null) {
                                    class163 var43 = var41.field1920;
                                    var43.field2335.method229(var43.field2329, var12, var43.field2336, var43.field2337, var43.field2331);
                                    if (var43.field2334 != null) {
                                        var43.field2334.method229(var43.field2329, var12, var43.field2336, var43.field2337, var43.field2331);
                                    }
                                }
                                if (var41.field1917 != null) {
                                    class50 var44 = var41.field1917;
                                    var44.field568.method229(0, var12, var44.field576, var44.field570, var44.field574);
                                }
                                if (var41.field1930 != null) {
                                    for (int var45 = 0; var45 < var41.field1934; var45++) {
                                        class243 var46 = var41.field1930[var45];
                                        var46.field3526.method229(var46.field3543, var12, var46.field3530, var46.field3538, var46.field3542);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class290.field4536 == class220.field3122;
        for (int var14 = class88.field1202; var14 < class202.field2868; var14++) {
            class133[][] var27 = class6.field94[var14];
            for (int var28 = -class46.field547; var28 <= 0; var28++) {
                int var29 = class139.field2025 + var28;
                int var30 = class139.field2025 - var28;
                if (var29 >= class255.field3674 || var30 < class290.field4543) {
                    for (int var31 = -class46.field547; var31 <= 0; var31++) {
                        int var32 = class178.field2538 + var31;
                        int var33 = class178.field2538 - var31;
                        if (var29 >= class255.field3674) {
                            if (var32 >= class68.field797) {
                                class133 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1926) {
                                    class193.method1256(var34, true);
                                }
                            }
                            if (var33 < class203.field2882) {
                                class133 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1926) {
                                    class193.method1256(var35, true);
                                }
                            }
                        }
                        if (var30 < class290.field4543) {
                            if (var32 >= class68.field797) {
                                class133 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1926) {
                                    class193.method1256(var36, true);
                                }
                            }
                            if (var33 < class203.field2882) {
                                class133 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1926) {
                                    class193.method1256(var37, true);
                                }
                            }
                        }
                        if (class152.field2209 == 0) {
                            if (!var13) {
                                class272.field3987 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class88.field1202; var15 < class202.field2868; var15++) {
            class133[][] var16 = class6.field94[var15];
            for (int var17 = -class46.field547; var17 <= 0; var17++) {
                int var18 = class139.field2025 + var17;
                int var19 = class139.field2025 - var17;
                if (var18 >= class255.field3674 || var19 < class290.field4543) {
                    for (int var20 = -class46.field547; var20 <= 0; var20++) {
                        int var21 = class178.field2538 + var20;
                        int var22 = class178.field2538 - var20;
                        if (var18 >= class255.field3674) {
                            if (var21 >= class68.field797) {
                                class133 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1926) {
                                    class193.method1256(var23, false);
                                }
                            }
                            if (var22 < class203.field2882) {
                                class133 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1926) {
                                    class193.method1256(var24, false);
                                }
                            }
                        }
                        if (var19 < class290.field4543) {
                            if (var21 >= class68.field797) {
                                class133 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1926) {
                                    class193.method1256(var25, false);
                                }
                            }
                            if (var22 < class203.field2882) {
                                class133 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1926) {
                                    class193.method1256(var26, false);
                                }
                            }
                        }
                        if (class152.field2209 == 0) {
                            if (!var13) {
                                class272.field3987 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class272.field3987 = false;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public static void method1734(int arg0) {
        field3956 = null;
        field3978 = null;
        if (arg0 == 10688) {
            field3971 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    public static final void method1735(int arg0) {
        if (arg0 <= 4) {
            method1735(100);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class112.field1496 - 1; var2++) {
                if (class190.field2749[var2] < 1000 && class190.field2749[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class240.field3482[var2];
                    class240.field3482[var2] = class240.field3482[var2 + 1];
                    class240.field3482[var2 + 1] = var3;
                    String var4 = class153.field2217[var2];
                    class153.field2217[var2] = class153.field2217[var2 + 1];
                    class153.field2217[var2 + 1] = var4;
                    int var5 = class240.field3485[var2];
                    class240.field3485[var2] = class240.field3485[var2 + 1];
                    class240.field3485[var2 + 1] = var5;
                    int var6 = field3978[var2];
                    field3978[var2] = field3978[var2 + 1];
                    field3978[var2 + 1] = var6;
                    int var7 = class209.field2944[var2];
                    class209.field2944[var2] = class209.field2944[var2 + 1];
                    class209.field2944[var2 + 1] = var7;
                    short var8 = class190.field2749[var2];
                    class190.field2749[var2] = class190.field2749[var2 + 1];
                    class190.field2749[var2 + 1] = var8;
                    long var9 = class6.field72[var2];
                    class6.field72[var2] = class6.field72[var2 + 1];
                    class6.field72[var2 + 1] = var9;
                }
            }
        }
        field3959++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
    public static final int method1736(int arg0, int arg1) {
        field3953++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 != -7289) {
            method1735(60);
        }
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
    public static final void method1737(byte arg0, int arg1) {
        class260.field3789.method62(-44, arg1);
        if (arg0 == 80) {
            class115.field1594.method62(-40, arg1);
            class276.field4201.method62(arg0 - 191, arg1);
            field3951++;
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
    public final void method1738(int arg0) {
        this.field3972 = null;
        this.field3979 = null;
        this.field3961 = null;
        field3973++;
        if (arg0 != -27935) {
            method1734(-44);
        }
        this.field3964 = null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
    public static final void method1739(int arg0, int arg1) {
        if (arg1 != 1) {
            field3971 = null;
        }
        class66 var2 = class6.method34(11, true, arg0);
        var2.method410(119);
        field3967++;
    }
}
