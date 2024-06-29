import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class65 {

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field1159 = -1;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "[I")
    public static int[] field1154 = new int[32];

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lid;")
    public static class149 field1160 = class60.method382(" zuerst von Ihrer Freunde)2Liste(Q", (byte) 20);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
    public static final int method404(int arg0) {
        field1162++;
        if (arg0 < 100) {
            field1159 = 33;
        }
        return ((class133.field2432 == 0 ? 0 : 1) << 22) + ((class57.field1005 == 0 ? 0 : 1) << 20) + ((class38.field571 ? 1 : 0) << 16) + ((class111.field1921 ? 1 : 0) << 13) + ((class116.field1989 ? 1 : 0) << 10) + ((class283.field5003 ? 1 : 0) << 7) + ((class83.field1512 ? 1 : 0) << 6) + ((class211.field3761 ? 1 : 0) << 5) + (class140.field2573 & 0x7) + ((class8.field99 ? 1 : 0) << 3) + ((class80.field1489 ? 1 : 0) << 4) + ((class86.field1573 ? 1 : 0) << 8) + ((class211.field3762 ? 1 : 0) << 9) + ((class281.field4997 & 0x3 << 11) - (-((class278.field4958 ? 1 : 0) << 15) - ((class126.field2209 ? 1 : 0) << 19))) + ((class44.field667 == 0 ? 0 : 1) << 21) + (class88.method652() << 23);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Laj;B)Z")
    public static final boolean method405(class47 arg0, byte arg1) {
        field1155++;
        if (arg0.field851 == null) {
            return false;
        }
        int var2 = 0;
        int var3 = 127 / ((40 - arg1) / 40);
        while (arg0.field851.length > var2) {
            int var4 = class113.method795(arg0, var2, (byte) -32);
            int var5 = arg0.field750[var2];
            if (arg0.field851[var2] == 2) {
                if (var4 >= var5) {
                    return false;
                }
            } else if (arg0.field851[var2] == 3) {
                if (var4 <= var5) {
                    return false;
                }
            } else if (arg0.field851[var2] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg4 - arg6;
        field1158++;
        int var12 = arg8 - arg3;
        int var13 = 983040 / arg9;
        int var14 = -1;
        if (arg1 != 30079) {
            field1159 = -83;
        }
        int var15 = 983040 / arg0;
        if (class118.field2030 > 0) {
            if (class11.field162 > 10) {
                var14 = 50 - ((class11.field162 - 10) * 5);
            } else {
                var14 = class11.field162 * 5;
            }
        }
        for (int var16 = -var13; var16 < var11 + var13; var16++) {
            int var18 = arg2 + (arg9 * var16) >> 16;
            int var19 = (var16 + 1) * arg9 + arg2 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg5 + var18;
                int var10000 = arg5 + var19;
                int var23 = arg6 + var16 >> 6;
                if (var23 >= 0 && class147.field2661.length - 1 >= var23) {
                    int[][] var24 = class147.field2661[var23];
                    for (int var25 = -var15; var25 < (var12 + var15); var25++) {
                        int var26 = arg0 * var25 + arg7 >> 16;
                        int var27 = arg7 + ((var25 + 1) * arg0) >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            var10000 = arg10 + var27;
                            int var30 = arg10 + var26;
                            int var31 = arg3 + var25 >> 6;
                            if (var31 >= 0 && var24.length - 1 >= var31 && var24[var31] != null) {
                                int var32 = (arg3 + var25 & 0x3F << 6) + (var16 + arg6 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class268 var34 = class108.method755(arg1 - 18554, var33 + -1);
                                    if (!class210.field3745[var34.field4772]) {
                                        if (var14 != -1 && class195.field3502 == var34.field4772) {
                                            class258 var35 = new class258();
                                            var35.field4508 = var34.field4772;
                                            var35.field4520 = var21;
                                            var35.field4515 = var30;
                                            class251.field4400.method1131(var35, false);
                                        } else {
                                            class143.field2609[var34.field4772].method263(var21 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class258 var17 = (class258) class251.field4400.method1140(0); var17 != null; var17 = (class258) class251.field4400.method1127(0)) {
            class72.method450(var17.field4520, var17.field4515, 15, 16776960, var14);
            class72.method450(var17.field4520, var17.field4515, 13, 16776960, var14);
            class72.method450(var17.field4520, var17.field4515, 11, 16776960, var14);
            class72.method450(var17.field4520, var17.field4515, 9, 16776960, var14);
            class143.field2609[var17.field4508].method263(var17.field4520 - 7, var17.field4515 - 7);
        }
        class251.field4400.method1132((byte) 127);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
    public static final boolean method407(int arg0, int arg1) {
        field1156++;
        if (arg0 != 50) {
            field1160 = null;
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Z")
    public static final boolean method408(int arg0) {
        field1157++;
        try {
            return arg0 > -39 ? false : class226.method1517((byte) 57);
        } catch (IOException var4) {
            class198.method1357(-58);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class246.field4327 + "," + class96.field1690 + "," + class283.field5010 + " - " + class68.field1188 + "," + (class77.field1449.field2333[0] + class125.field2199) + "," + (class77.field1449.field2400[0] + class115.field1969) + " - ";
            for (int var3 = 0; class68.field1188 > var3 && var3 < 50; var3++) {
                var2 = var2 + class11.field150.field1321[var3] + ",";
            }
            class100.method720(var5, var2, 1);
            class9.method51(81);
            return true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public abstract void method193(byte arg0);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public static void method409(int arg0) {
        field1160 = null;
        field1154 = null;
        if (arg0 != 0) {
            field1154 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)I")
    public abstract int method194(byte arg0, int arg1, int arg2);
}
