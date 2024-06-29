import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class279 extends class165 {

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Ldb;")
    public static class102 field4492 = new class102(64);

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field4497 = 100;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "Log;")
    public static class157 field4504;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "Lak;")
    public static class172 field4502;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Lbf;")
    public static class58 field4499;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)I", line = 5)
    public final int method2016(int arg0) {
        if (arg0 != 21782) {
            this.method2023(61);
        }
        field4510++;
        return this.field4503 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V", line = 17)
    public static final void method2017(int arg0) {
        class194.field3175.method2375(59, 0);
        if (arg0 <= -15) {
            class173.field2871++;
            class194.field3175.method255(false, 0L);
            field4500++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)Z", line = 30)
    public final boolean method2018(int arg0) {
        if (arg0 != 17065) {
            method2019(55, -29, 55, -62, (class108) null, 63, -76);
        }
        field4501++;
        return (this.field4503 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIILac;II)V", line = 41)
    public static final void method2019(int arg0, int arg1, int arg2, int arg3, class108 arg4, int arg5, int arg6) {
        field4505++;
        long var7 = 0L;
        if (~arg1 == arg6) {
            var7 = class156.method1119(arg0, arg5, arg3);
        } else if (arg1 == 1) {
            var7 = class192.method1424(arg0, arg5, arg3);
        } else if (arg1 == 2) {
            var7 = class129.method933(arg0, arg5, arg3);
        } else if (arg1 == 3) {
            var7 = class297.method2117(arg0, arg5, arg3);
        }
        boolean var9 = false;
        boolean var10 = true;
        int var11 = (int) var7 >> 14 & 0x1F;
        boolean var12 = false;
        int var13 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class97 var14 = class69.method454(false, var13);
        int var15 = (int) var7 >> 20 & 0x3;
        if (var14.method647(93)) {
            class205.method1492(var14, arg5, arg3, (byte) -126, arg0);
        }
        if (var7 == 0L) {
            return;
        }
        class7 var16 = null;
        class7 var17 = null;
        if (arg1 == 0) {
            class225 var21 = class83.method559(arg0, arg5, arg3);
            if (var21 != null) {
                var17 = var21.field3594;
                var16 = var21.field3599;
            }
            if (var14.field1333 != 0) {
                arg4.method740(arg3, !var14.field1349, var11, var14.field1338, arg6 - 125, var15, arg5);
            }
        } else if (arg1 == 1) {
            class38 var18 = class142.method1048(arg0, arg5, arg3);
            if (var18 != null) {
                var16 = var18.field485;
                var17 = var18.field494;
            }
        } else if (arg1 == 2) {
            class153 var19 = class137.method1016(arg0, arg5, arg3);
            if (var19 != null) {
                var16 = var19.field2373;
            }
            if (var14.field1333 != 0 && var14.field1337 + arg5 < 104 && var14.field1337 + arg3 < 104 && (var14.field1343 + arg5) < 104 && var14.field1343 + arg3 < 104) {
                arg4.method744(var14.field1338, var14.field1337, !var14.field1349, var15, var14.field1343, arg5, -76, arg3);
            }
        } else if (arg1 == 3) {
            class113 var20 = class89.method602(arg0, arg5, arg3);
            if (var20 != null) {
                var16 = var20.field1728;
            }
            if (var14.field1333 == 1) {
                arg4.method738(arg3, true, arg5);
            }
        }
        if (var14.field1387 != null) {
            var14 = var14.method656((byte) 7);
        }
        if (!class232.field3690 || var14 == null || !var14.field1364) {
            return;
        }
        if (var11 == 2) {
            if ((var16 instanceof class175)) {
                ((class175) var16).method1316((byte) -56);
            } else {
                class217.method1549(0, var11, var15 + 4, var14, 0, arg3, arg2, 24, arg5);
            }
            if ((var17 instanceof class175)) {
                ((class175) var17).method1316((byte) -13);
            } else {
                class217.method1549(0, var11, var15 + 1 & 0x3, var14, 0, arg3, arg2, 24, arg5);
            }
        } else if (var11 == 5) {
            if ((var16 instanceof class175)) {
                ((class175) var16).method1316((byte) -30);
            } else {
                class217.method1549(class106.field1578[var15] * 8, 4, var15, var14, class334.field5217[var15] * 8, arg3, arg2, 24, arg5);
            }
        } else if (var11 == 6) {
            if ((var16 instanceof class175)) {
                ((class175) var16).method1316((byte) 122);
            } else {
                class217.method1549(class135.field2152[var15] * 8, 4, var15 + 4, var14, class157.field2510[var15] * 8, arg3, arg2, 24, arg5);
            }
        } else if (var11 == 7) {
            if (var16 instanceof class175) {
                ((class175) var16).method1316((byte) 88);
            } else {
                class217.method1549(0, 4, (var15 + 2 & 0x3) + 4, var14, 0, arg3, arg2, 24, arg5);
            }
        } else if (var11 == 8) {
            if ((var16 instanceof class175)) {
                ((class175) var16).method1316((byte) -51);
            } else {
                class217.method1549(class135.field2152[var15] * 8, 4, var15 + 4, var14, class157.field2510[var15] * 8, arg3, arg2, 24, arg5);
            }
            if (var17 instanceof class175) {
                ((class175) var17).method1316((byte) -76);
            } else {
                class217.method1549(class135.field2152[var15] * 8, 4, (var15 + 2 & 0x3) + 4, var14, class157.field2510[var15] * 8, arg3, arg2, 24, arg5);
            }
        } else if (var11 == 11) {
            if (var16 instanceof class175) {
                ((class175) var16).method1316((byte) 117);
            } else {
                class217.method1549(0, 10, var15 + 4, var14, 0, arg3, arg2, arg6 + 25, arg5);
            }
        } else if ((var16 instanceof class175)) {
            ((class175) var16).method1316((byte) 112);
        } else {
            class217.method1549(0, var11, var15, var14, 0, arg3, arg2, 24, arg5);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)Z", line = 234)
    public final boolean method2020(boolean arg0) {
        field4493++;
        if (!arg0) {
            this.field4503 = -67;
        }
        return (this.field4503 & 0x5329B3) >> 22 != 0;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V", line = 256)
    public static void method2021(int arg0) {
        if (arg0 < 69) {
            method2027(15);
        }
        field4492 = null;
        field4502 = null;
        field4504 = null;
        field4499 = null;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)Z", line = 271)
    public final boolean method2022(byte arg0) {
        int var2 = -89 / ((-arg0 - 49) / 57);
        field4508++;
        return (this.field4503 & 0x11D9DC22) >> 28 != 0;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)Z", line = 282)
    public final boolean method2023(int arg0) {
        field4496++;
        if (arg0 >= -62) {
            field4497 = -28;
        }
        return (this.field4503 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)Z", line = 296)
    public final boolean method2024(int arg0) {
        field4507++;
        if (arg0 < 85) {
            field4502 = (class172) null;
        }
        return (this.field4503 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)Z", line = 313)
    public final boolean method2025(boolean arg0) {
        field4511++;
        if (arg0) {
            return true;
        } else {
            return (this.field4503 >> 21 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)Z", line = 325)
    public final boolean method2026(boolean arg0) {
        if (!arg0) {
            method2017(-117);
        }
        field4506++;
        return ((this.field4503 & 0x760560F7) >> 30) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)V", line = 341)
    public static final void method2027(int arg0) {
        int var1 = -59 / ((24 - arg0) / 36);
        class233.field3734 = null;
        class307.field4795 = null;
        field4498++;
        class103.field1506 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)Z", line = 353)
    public final boolean method2028(byte arg0, int arg1) {
        if (arg0 < 105) {
            this.method2024(55);
        }
        field4494++;
        return (this.field4503 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)I", line = 364)
    public final int method2029(byte arg0) {
        field4512++;
        if (arg0 >= -45) {
            field4504 = (class157) null;
        }
        return class310.method2187(true, this.field4503);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V", line = 373)
    public class279(int arg0, int arg1) {
        this.field4503 = arg0;
        this.field4495 = arg1;
    }
}
