import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class425 extends class207 {

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    private int field6328 = 0;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Lcg;")
    private class93 field6334 = new class93();

    @OriginalMember(owner = "client!th", name = "y", descriptor = "[I")
    public static int[] field6333 = new int[13];

    @OriginalMember(owner = "client!th", name = "w", descriptor = "Lkh;")
    public static class13 field6331 = new class13(260);

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Lob;")
    public static class521 field6338 = new class521(10, -1);

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field6337;

    // $FF: synthetic field
    @OriginalMember(owner = "client!th", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field6339;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "[Ll;")
    public static class16[] field6324;

    // $FF: synthetic method
    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2658(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(FZILta;I)V", line = 6)
    public final void method1432(float arg0, boolean arg1, int arg2, class145 arg3, int arg4) {
        ++field6329;
        super.field3392[super.field3386] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
        super.field3389[super.field3386] = arg3;
        super.field3393[super.field3386] = arg0;
        if (arg4 != -20295) {
            this.method1432(0.06939064F, true, 94, (class145) null, 74);
        }
        ++super.field3386;
        if (super.field3386 >= 5000) {
            super.field3386 = 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)Lkn;", line = 25)
    public static final class523 method2652(int arg0) {
        ++field6330;
        if (class7.field89 != null && class95.field1365 != null) {
            if (arg0 != 0) {
                method2654((class155) null, (byte) -62);
            }
            class95.field1365.method1681((byte) -112, class7.field89);
            class523 var1 = (class523) class95.field1365.method1679(56);
            if (var1 == null) {
                return null;
            } else {
                class519 var2 = class7.field75.method3071(-109, var1.field7645);
                return var2 != null && var2.field7560 && var2.method3082(class7.field82, -113) ? var1 : class363.method2274((byte) -71);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V", line = 53)
    public static void method2653(byte arg0) {
        field6324 = null;
        field6331 = null;
        if (arg0 > -79) {
            field6333 = null;
        }
        field6338 = null;
        field6333 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lui;B)V", line = 67)
    public static final void method2654(class155 arg0, byte arg1) {
        ++field6336;
        if (client.field3311 != null) {
            class164 var2 = null;
            if (~arg0.field2301 == -1) {
                var2 = (class164) class85.method713(arg0.field2298, arg0.field2306, arg0.field2302);
            }
            if (arg0.field2301 == 1) {
                var2 = (class164) class188.method1263(arg0.field2298, arg0.field2306, arg0.field2302);
            }
            if (~arg0.field2301 == -3) {
                var2 = (class164) class154.method1057(arg0.field2298, arg0.field2306, arg0.field2302, field6339 != null ? field6339 : (field6339 = method2658("ig")));
            }
            if (~arg0.field2301 == -4) {
                var2 = (class164) class446.method2736(arg0.field2298, arg0.field2306, arg0.field2302);
            }
            int var3 = 59 % ((arg1 - 35) / 45);
            if (var2 == null) {
                arg0.field2300 = 0;
                arg0.field2294 = 0;
                arg0.field2307 = -1;
            } else {
                arg0.field2307 = var2.method624((byte) -123);
                arg0.field2300 = var2.method627(23326);
                arg0.field2294 = var2.method621(3021);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lfq;I)V", line = 109)
    public final void method1429(class138 arg0, int arg1) {
        super.field3392[super.field3386] = 20;
        if (arg1 == 5000) {
            ++field6335;
            super.field3389[super.field3386] = arg0;
            ++super.field3386;
            if (~super.field3386 <= -5001) {
                super.field3386 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Z", line = 125)
    public static final boolean method2655(byte arg0, int arg1) {
        if (arg0 <= 73) {
            return false;
        } else {
            ++field6337;
            return ~arg1 == -3 || arg1 == 3;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLfq;)V", line = 136)
    public final void method1437(byte arg0, class138 arg1) {
        ++field6325;
        --super.field3391;
        if (~super.field3391 > -1) {
            super.field3391 = 4999;
        }
        if (arg0 < -46) {
            super.field3392[super.field3391] = 21;
            super.field3389[super.field3391] = arg1;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLfq;)V", line = 154)
    public final void method1438(boolean arg0, class138 arg1) {
        if (!arg0) {
            method2655((byte) 74, -116);
        }
        ++field6321;
        super.field3392[super.field3386] = 21;
        super.field3389[super.field3386] = arg1;
        ++super.field3386;
        if (~super.field3386 <= -5001) {
            super.field3386 = 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 185)
    public final void method1435(int arg0) {
        while (super.field3391 != super.field3386) {
            this.method2657(82);
        }
        if (arg0 <= 104) {
            this.method1428((byte) 63);
        }
        ++field6322;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(II)I", line = 200)
    public static int method2656(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V", line = 212)
    public final void method1434(int arg0, int arg1) {
        super.field3392[super.field3386] = (byte) arg0;
        ++field6326;
        ++super.field3386;
        int var3 = 28 % ((-80 - arg1) / 46);
        if (~super.field3386 <= -5001) {
            super.field3386 = 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 227)
    public final void method1428(byte arg0) {
        ++field6327;
        if (arg0 != 12) {
            this.method1432(-0.6963939F, true, 9, (class145) null, 113);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 241)
    public final void method1431(int arg0, int arg1) {
        ++field6323;
        if (arg1 != 0) {
            this.field6328 = -37;
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V", line = 251)
    private final void method2657(int arg0) {
        ++field6332;
        int var2 = super.field3391++;
        if (super.field3391 >= 5000) {
            super.field3391 = 0;
        }
        this.field6328 = super.field3392[var2];
        if (arg0 < 5) {
            this.method1432(1.3959968F, false, -4, (class145) null, 22);
        }
        Object var3 = super.field3389[var2];
        super.field3389[var2] = null;
        if (this.field6328 == 21) {
            class530.method3142(this.field6334, (class138) var3);
        } else if (~this.field6328 != -21) {
            if (~this.field6328 <= -31 && ~this.field6328 >= -34) {
                class291.field4407.method365(3000.0F, super.field3393[var2] * 1.5F);
                ((class145) var3).method404(class395.field5900, class284.field4314, class46.field602, class265.field4070, ~(this.field6328 - 30) == -1);
            } else if (~this.field6328 <= -41 && this.field6328 <= 43) {
                class291.field4407.method365(3000.0F, super.field3393[var2] * 1.5F);
                ((class145) var3).method404(class395.field5900, class284.field4314, class46.field602, class60.field721, ~(this.field6328 - 40) == -1);
            } else {
                if (~this.field6328 != -23) {
                    if (~this.field6328 == -24) {
                        class291.field4407.method331();
                        return;
                    }
                    if (this.field6328 == 24) {
                        class291.field4407.method359(0, (class470[]) null);
                        return;
                    }
                } else {
                    class291.field4407.method309(-1, 1583160, 40, 127);
                }
            }
        } else {
            class138 var4 = (class138) var3;
            if (var4.field2114 != null) {
                var4.field2114.method25(class291.field4407, false);
            }
            if (var4.field2104 != null) {
                var4.field2104.method25(class291.field4407, false);
            }
            if (var4.field2115 != null) {
                var4.field2115.method25(class291.field4407, false);
            }
            if (var4.field2106 != null) {
                var4.field2106.method25(class291.field4407, false);
            }
            if (var4.field2105 != null) {
                var4.field2105.method25(class291.field4407, false);
            }
            for (class327 var5 = var4.field2118; var5 != null; var5 = var5.field4922) {
                var5.field4921.method25(class291.field4407, false);
            }
        }
    }
}
