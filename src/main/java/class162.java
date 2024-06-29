import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class162 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Laf;")
    private class102 field2166 = new class102();

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[I")
    public static int[] field2163 = new int[128];

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Laf;")
    private class102 field2169;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIIII)V")
    public static final void method996(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -11) {
            field2163 = null;
        }
        for (int var5 = 0; var5 < class1.field13; var5++) {
            Rectangle var6 = class229.field3062[var5];
            if (arg2 < (var6.x + var6.width) && arg2 + arg4 > var6.x && var6.y + var6.height > arg3 && var6.y < arg1 + arg3) {
                class57.field775[var5] = true;
            }
        }
        field2170++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Laf;")
    public final class102 method997(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2168++;
        class102 var2 = this.field2166.field1415;
        if (this.field2166 == var2) {
            return null;
        } else {
            var2.method686(126);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public final void method998(byte arg0) {
        while (true) {
            class102 var2 = this.field2166.field1415;
            if (this.field2166 == var2) {
                field2179++;
                this.field2169 = null;
                int var3 = -20 / ((24 - arg0) / 58);
                return;
            }
            var2.method686(111);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Laf;")
    public final class102 method999(int arg0) {
        field2174++;
        class102 var2 = this.field2166.field1412;
        if (this.field2166 == var2) {
            this.field2169 = null;
            return null;
        } else if (arg0 == -1) {
            this.field2169 = var2.field1412;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILii;)V")
    public static final void method1000(int arg0, class405 arg1) {
        field2167++;
        if (arg0 != -19285) {
            field2163 = null;
        }
        if (class2.field26) {
            class194.method1164(arg1, false);
        } else {
            class180.method1099((byte) -116, arg1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)I")
    public final int method1001(int arg0) {
        if (arg0 != 3144) {
            return -15;
        }
        field2164++;
        int var2 = 0;
        for (class102 var3 = this.field2166.field1415; var3 != this.field2166; var3 = var3.field1415) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Z")
    public final boolean method1002(int arg0) {
        if (arg0 != -24376) {
            this.field2169 = null;
        }
        field2181++;
        return this.field2166.field1415 == this.field2166;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILaf;)V")
    public final void method1003(int arg0, class102 arg1) {
        field2165++;
        if (arg1.field1412 != null) {
            arg1.method686(-119);
        }
        arg1.field1415 = this.field2166;
        arg1.field1412 = this.field2166.field1412;
        if (arg0 != 2166) {
            field2172 = -83;
        }
        arg1.field1412.field1415 = arg1;
        arg1.field1415.field1412 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2176++;
        class261.method1801(arg2 - 1150804386, arg1);
        int var7 = 0;
        int var8 = arg1 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        if (arg2 != 1150835649) {
            return;
        }
        int var12 = -var8;
        int var13 = -1;
        if (arg5 >= class379.field5521 && class125.field1751 >= arg5) {
            int[] var14 = class384.field5560[arg5];
            int var15 = class304.method2068(class87.field1227, arg6 - arg1, -118, class299.field4382);
            int var16 = class304.method2068(class87.field1227, arg6 + arg1, -127, class299.field4382);
            int var17 = class304.method2068(class87.field1227, arg6 - var8, -113, class299.field4382);
            int var18 = class304.method2068(class87.field1227, arg6 + var8, -93, class299.field4382);
            class207.method1221((byte) -126, var15, var17, var14, arg3);
            class207.method1221((byte) -123, var17, var18, var14, arg4);
            class207.method1221((byte) -128, var18, var16, var14, arg3);
        }
        int var19 = -1;
        while (var7 < var9) {
            var13 += 2;
            var19 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class317.field4644[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (class379.field5521 <= var21 && var20 <= class125.field1751) {
                    if (var9 < var8) {
                        int var22 = class317.field4644[var9];
                        int var23 = class304.method2068(class87.field1227, arg6 + var7, -96, class299.field4382);
                        int var24 = class304.method2068(class87.field1227, arg6 - var7, arg2 + -1150835744, class299.field4382);
                        int var25 = class304.method2068(class87.field1227, arg6 + var22, -120, class299.field4382);
                        int var26 = class304.method2068(class87.field1227, arg6 - var22, -107, class299.field4382);
                        if (class125.field1751 >= var21) {
                            int[] var27 = class384.field5560[var21];
                            class207.method1221((byte) -123, var24, var26, var27, arg3);
                            class207.method1221((byte) -122, var26, var25, var27, arg4);
                            class207.method1221((byte) -128, var25, var23, var27, arg3);
                        }
                        if (var20 >= class379.field5521) {
                            int[] var28 = class384.field5560[var20];
                            class207.method1221((byte) -124, var24, var26, var28, arg3);
                            class207.method1221((byte) -122, var26, var25, var28, arg4);
                            class207.method1221((byte) -125, var25, var23, var28, arg3);
                        }
                    } else {
                        int var29 = class304.method2068(class87.field1227, arg6 + var7, arg2 ^ 0xBB67A443, class299.field4382);
                        int var30 = class304.method2068(class87.field1227, arg6 - var7, -107, class299.field4382);
                        if (var21 <= class125.field1751) {
                            class207.method1221((byte) -124, var30, var29, class384.field5560[var21], arg3);
                        }
                        if (class379.field5521 <= var20) {
                            class207.method1221((byte) -125, var30, var29, class384.field5560[var20], arg3);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (class379.field5521 <= var32 && var31 <= class125.field1751) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (class87.field1227 <= var33 && class299.field4382 >= var34) {
                    int var35 = class304.method2068(class87.field1227, var33, -97, class299.field4382);
                    int var36 = class304.method2068(class87.field1227, var34, arg2 ^ 0xBB67A444, class299.field4382);
                    if (var7 < var8) {
                        int var37 = var11 < var7 ? class317.field4644[var7] : var11;
                        int var38 = class304.method2068(class87.field1227, arg6 + var37, -96, class299.field4382);
                        int var39 = class304.method2068(class87.field1227, arg6 - var37, -109, class299.field4382);
                        if (var32 <= class125.field1751) {
                            int[] var40 = class384.field5560[var32];
                            class207.method1221((byte) -125, var36, var39, var40, arg3);
                            class207.method1221((byte) -123, var39, var38, var40, arg4);
                            class207.method1221((byte) -126, var38, var35, var40, arg3);
                        }
                        if (class379.field5521 <= var31) {
                            int[] var41 = class384.field5560[var31];
                            class207.method1221((byte) -124, var36, var39, var41, arg3);
                            class207.method1221((byte) -122, var39, var38, var41, arg4);
                            class207.method1221((byte) -124, var38, var35, var41, arg3);
                        }
                    } else {
                        if (class125.field1751 >= var32) {
                            class207.method1221((byte) -125, var36, var35, class384.field5560[var32], arg3);
                        }
                        if (class379.field5521 <= var31) {
                            class207.method1221((byte) -126, var36, var35, class384.field5560[var31], arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)Laf;")
    public final class102 method1005(int arg0) {
        int var2 = -110 / ((-arg0 - 14) / 59);
        field2173++;
        class102 var3 = this.field2166.field1415;
        if (this.field2166 == var3) {
            this.field2169 = null;
            return null;
        } else {
            this.field2169 = var3.field1415;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method1006(byte arg0) {
        field2163 = null;
        if (arg0 != 62) {
            field2163 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
    public static final void method1007(byte arg0) {
        if (arg0 != -38) {
            return;
        }
        field2180++;
        for (class434 var1 = (class434) class178.field2366.method332(arg0 - 2130841146); var1 != null; var1 = (class434) class178.field2366.method343((byte) -100)) {
            class71 var2 = var1.field6381;
            if (class227.field2981 != var2.field727 || class28.field418 > var2.field1028) {
                var1.method322(arg0 + 49);
                var2.method521(-4);
            } else if (var2.field984 <= class28.field418) {
                if (var2.field985 > 0) {
                    class43 var3 = class306.field4496[var2.field985 - 1];
                    if (var3 != null && var3.field740 >= 0 && var3.field740 < (class192.field2574 * 128) && var3.field734 >= 0 && var3.field734 < (class364.field5262 * 128)) {
                        var2.method522(var3.field740, class28.field418, (byte) -83, class52.method359((byte) -116, var3.field734, var3.field740, var2.field727) - var2.field1012, var3.field734);
                    }
                }
                if (var2.field985 < 0) {
                    int var4 = -var2.field985 - 1;
                    class25 var5;
                    if (class272.field3950 == var4) {
                        var5 = class227.field2988;
                    } else {
                        var5 = class206.field2777[var4];
                    }
                    if (var5 != null && var5.field740 >= 0 && var5.field740 < (class192.field2574 * 128) && var5.field734 >= 0 && (class364.field5262 * 128) > var5.field734) {
                        var2.method522(var5.field740, class28.field418, (byte) -83, class52.method359((byte) -116, var5.field734, var5.field740, var2.field727) - var2.field1012, var5.field734);
                    }
                }
                var2.method515(class379.field5514, false);
                class21.method146(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
    public static final void method1008(int arg0, int arg1, int arg2) {
        field2177++;
        class373 var3 = class16.method97(arg2, (byte) 89);
        int var4 = var3.field5431;
        int var5 = var3.field5420;
        int var6 = 60 % ((arg0 + 23) / 37);
        int var7 = var3.field5427;
        int var8 = class125.field1753[var7 - var5];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var5;
        class171.method1063(arg1 << var5 & var9 | ~var9 & class191.field2561[var4], var4, (byte) 77);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class162() {
        this.field2166.field1412 = this.field2166;
        this.field2166.field1415 = this.field2166;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)Laf;")
    public final class102 method1009(boolean arg0) {
        field2178++;
        class102 var2 = this.field2169;
        if (arg0) {
            field2172 = -29;
        }
        if (this.field2166 == var2) {
            this.field2169 = null;
            return null;
        } else {
            this.field2169 = var2.field1415;
            return var2;
        }
    }
}
