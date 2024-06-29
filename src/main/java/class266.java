import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class266 {

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public int field3636 = -1;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public int field3631 = -1;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "Z")
    public static boolean field3633 = false;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3634 = "Loaded config";

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field3637 = 0;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "[I")
    public int[] field3627;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILeb;)V")
    public final void method1646(int arg0, int arg1, class371 arg2) {
        while (true) {
            int var4 = arg2.method2429(0);
            if (var4 == 0) {
                field3635++;
                if (arg1 != 0) {
                    field3637 = 120;
                    return;
                }
                return;
            }
            this.method1647(arg1 - 1, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILeb;I)V")
    private final void method1647(int arg0, int arg1, class371 arg2, int arg3) {
        if (arg1 == 1) {
            this.field3631 = arg2.method2403((byte) 99);
        } else if (arg1 == 2) {
            this.field3627 = new int[arg2.method2429(0)];
            for (int var5 = 0; var5 < this.field3627.length; var5++) {
                this.field3627[var5] = arg2.method2403((byte) 69);
            }
        } else if (arg1 == 3) {
            this.field3636 = arg2.method2429(0);
        }
        if (arg0 == -1) {
            field3629++;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method1648(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3632++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg7 - arg4;
        int var12 = arg2 - arg4;
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
        if (arg0) {
            return;
        }
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class84.field1286[arg6];
        class73.method486(arg1 - arg7, var39, arg5, 84, arg1 - var11);
        class73.method486(arg1 - var11, var39, arg3, -116, arg1 + var11);
        class73.method486(arg1 + var11, var39, arg5, -112, arg1 + arg7);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg6 - var9;
            int var42 = arg6 + var9;
            int var43 = arg1 + var8;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class73.method486(var44, class84.field1286[var41], arg5, -11, var46);
                class73.method486(var46, class84.field1286[var41], arg3, -127, var45);
                class73.method486(var45, class84.field1286[var41], arg5, 86, var43);
                class73.method486(var44, class84.field1286[var42], arg5, -122, var46);
                class73.method486(var46, class84.field1286[var42], arg3, -101, var45);
                class73.method486(var45, class84.field1286[var42], arg5, -93, var43);
            } else {
                class73.method486(var44, class84.field1286[var41], arg5, 29, var43);
                class73.method486(var44, class84.field1286[var42], arg5, 38, var43);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILke;)V")
    public static final void method1649(int arg0, class354 arg1) {
        field3630++;
        if (class390.field5740 >= 400) {
            return;
        }
        if (arg0 != -18536) {
            method1651((class296) null, 50, (class296) null, (class281) null);
        }
        if (class307.field4211 == arg1) {
            return;
        }
        String var8;
        if (arg1.field4978 == 0) {
            boolean var2 = true;
            if (class307.field4211.field4992 != -1 && arg1.field4992 != -1) {
                int var3 = class307.field4211.field5000 <= arg1.field5000 ? arg1.field5000 : class307.field4211.field5000;
                int var4 = arg1.field4992 <= class307.field4211.field4992 ? arg1.field4992 : class307.field4211.field4992;
                int var5 = var3 * 10 / 100 + var4 + 5;
                int var6 = class307.field4211.field5000 - arg1.field5000;
                if (var6 < 0) {
                    var6 = -var6;
                }
                if (var6 > var5) {
                    var2 = false;
                }
            }
            String var7 = class180.field2521 == 1 ? class366.field5133 : class65.field1030;
            if (arg1.field5000 < arg1.field4983) {
                var8 = arg1.method2291(true, (byte) 117) + (var2 ? class358.method2317(class307.field4211.field5000, arg1.field5000, (byte) 1) : "<col=ffffff>") + " (" + var7 + arg1.field5000 + "+" + (arg1.field4983 - arg1.field5000) + ")";
            } else {
                var8 = arg1.method2291(true, (byte) 115) + (var2 ? class358.method2317(class307.field4211.field5000, arg1.field5000, (byte) 1) : "<col=ffffff>") + " (" + var7 + arg1.field5000 + ")";
            }
        } else {
            var8 = arg1.method2291(true, (byte) 114) + " (" + class279.field3795 + arg1.field4978 + ")";
        }
        if (class222.field2980 == 1) {
            class442.field6406++;
            class336.method2092(class243.field3355, 0, class265.field3624 + " -> <col=ffffff>" + var8, (long) arg1.field862, (byte) 108, 38, 0, class259.field3547);
        } else if (!class309.field4235) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class346.field4854[var9] != null) {
                    short var10 = 0;
                    if (class180.field2521 == 0 && class346.field4854[var9].equalsIgnoreCase(class220.field2898)) {
                        if (class307.field4211.field5000 < arg1.field5000) {
                            var10 = 2000;
                        }
                        if (class307.field4211.field4982 != 0 && arg1.field4982 != 0) {
                            if (class307.field4211.field4982 == arg1.field4982) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        }
                    } else if (class374.field5344[var9]) {
                        var10 = 2000;
                    }
                    short var11 = (short) (class393.field5753[var9] + var10);
                    int var12 = class376.field5362[var9] == -1 ? class3.field36 : class376.field5362[var9];
                    class336.method2092(var12, 0, "<col=ffffff>" + var8, (long) arg1.field862, (byte) 70, var11, 0, class346.field4854[var9]);
                    class62.field967++;
                }
            }
        } else if ((class439.field6373 & 0x8) != 0) {
            class336.method2092(class289.field3993, 0, class125.field1770 + " -> <col=ffffff>" + var8, (long) arg1.field862, (byte) 89, 18, 0, class25.field359);
            class14.field169++;
        }
        for (class207 var13 = (class207) class167.field2393.method1312((byte) 25); var13 != null; var13 = (class207) class167.field2393.method1304(-33)) {
            if (var13.field2797 == 11) {
                var13.field2798 = "<col=ffffff>" + var8;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public static void method1650(int arg0) {
        field3634 = null;
        if (arg0 < 52) {
            field3634 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lqj;ILqj;Laa;)V")
    public static final void method1651(class296 arg0, int arg1, class296 arg2, class281 arg3) {
        class439.field6374 = class349.method2234(arg2, class153.field2163, true, arg1);
        field3628++;
        class403.field5875 = arg3.method1791(class439.field6374, class18.method107(arg0, class153.field2163, 0), true);
        class235.field3194 = class349.method2234(arg2, class8.field121, true, 0);
        class216.field2867 = arg3.method1791(class235.field3194, class18.method107(arg0, class8.field121, 0), true);
        class204.field2769 = class349.method2234(arg2, class132.field1838, true, 0);
        class220.field2899 = arg3.method1791(class204.field2769, class18.method107(arg0, class132.field1838, 0), true);
    }
}
