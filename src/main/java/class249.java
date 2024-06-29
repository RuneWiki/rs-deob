import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class249 {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lha;")
    public static class46 field4390 = class271.method1828("logo", -46);

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lha;")
    public static class46 field4388 = class271.method1828("blinken3:", -46);

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public int field4392;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public int field4393;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public int field4394;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public int field4395;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public int field4408;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public int field4410;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public int field4413;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static final void method1688(byte arg0) {
        class74.field1332.method83(25216);
        field4411++;
        if (arg0 != -61) {
            method1693(36);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILha;I)V")
    public static final void method1689(int arg0, class46 arg1, int arg2) {
        class46 var3 = arg1.method328(-102).method306(true);
        if (arg0 != 1) {
            return;
        }
        field4389++;
        boolean var4 = false;
        for (int var5 = 0; var5 < class156.field2783; var5++) {
            class81 var6 = class1.field6[class129.field2373[var5]];
            if (var6 != null && var6.field1528 != null && var6.field1528.method315((byte) -38, var3)) {
                var4 = true;
                class112.method916(0, -10543, class277.field4824.field2523[0], var6.field2517[0], class277.field4824.field2517[0], var6.field2523[0], 2, 1, 0, 0, false, 1);
                if (arg2 == 1) {
                    class58.field967.method285((byte) -90, 172);
                    class58.field967.method547((byte) -67, class129.field2373[var5]);
                    class208.field3730++;
                } else if (arg2 == 4) {
                    class115.field2174++;
                    class58.field967.method285((byte) -90, 41);
                    class58.field967.method587(class129.field2373[var5], -32389656);
                } else if (arg2 == 5) {
                    class58.field967.method285((byte) -90, 247);
                    class58.field967.method582(118, class129.field2373[var5]);
                    class193.field3468++;
                } else if (arg2 == 6) {
                    class58.field967.method285((byte) -90, 232);
                    class58.field967.method582(arg0 - 124, class129.field2373[var5]);
                    class15.field221++;
                } else if (arg2 == 7) {
                    class6.field92++;
                    class58.field967.method285((byte) -90, 1);
                    class58.field967.method587(class129.field2373[var5], -32389656);
                }
                break;
            }
        }
        if (!var4) {
            class155.method1136(93, class85.field1613, 0, class109.method855(arg0 - 1, new class46[] { class74.field1321, var3 }));
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lpi;IB)Ltf;")
    public static final class277 method1690(class181 arg0, int arg1, byte arg2) {
        if (arg2 < 115) {
            field4388 = null;
        }
        field4412++;
        byte[] var3 = arg0.method1303(arg1, 78);
        return var3 == null ? null : new class277(var3);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    public static final void method1691(byte arg0) {
        if (arg0 >= -107) {
            field4388 = null;
        }
        field4387++;
        class252.field4442++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBIII)V")
    public static final void method1692(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4415++;
        int var6 = 0;
        int var7 = arg3 * arg3;
        if (arg2 < 20) {
            method1691((byte) 106);
        }
        int var8 = arg3;
        int var9 = arg4 * arg4;
        int var10 = var7 << 1;
        int var11 = arg3 << 1;
        int var12 = var9 << 1;
        int var13 = var7 - ((var11 - 1) * var12);
        int var14 = var9 << 2;
        int var15 = (1 - var11) * var9 + var10;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = ((arg3 << 1) - 3) * var12;
        int var18 = var7 << 2;
        int var19 = (var6 + 1) * var18;
        if (arg1 >= class4.field70 && arg1 <= class70.field1205) {
            int var20 = class15.method77(arg5 + arg4, class135.field2445, class73.field1309, -92);
            int var21 = class15.method77(arg5 - arg4, class135.field2445, class73.field1309, -49);
            class24.method170((byte) 33, var21, class6.field100[arg1], var20, arg0);
        }
        int var22 = (arg3 - 1) * var14;
        while (var8 > 0) {
            if (var15 < 0) {
                while (var15 < 0) {
                    var15 += var16;
                    var16 += var18;
                    var6++;
                    var13 += var19;
                    var19 += var18;
                }
            }
            var8--;
            if (var13 < 0) {
                var13 += var19;
                var15 += var16;
                var6++;
                var16 += var18;
                var19 += var18;
            }
            var13 += -var17;
            var15 += -var22;
            var17 -= var14;
            var22 -= var14;
            int var23 = arg1 + var8;
            int var24 = arg1 - var8;
            if (var23 >= class4.field70 && class70.field1205 >= var24) {
                int var25 = class15.method77(arg5 + var6, class135.field2445, class73.field1309, -92);
                int var26 = class15.method77(arg5 - var6, class135.field2445, class73.field1309, -65);
                if (class4.field70 <= var24) {
                    class24.method170((byte) 33, var26, class6.field100[var24], var25, arg0);
                }
                if (var23 <= class70.field1205) {
                    class24.method170((byte) 33, var26, class6.field100[var23], var25, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static final void method1693(int arg0) {
        field4404++;
        if (arg0 == 0) {
            class193.field3462.method84(arg0 ^ 0xFFFF8187);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
    public static final void method1694() {
        for (int var0 = 0; var0 < class134.field2421; var0++) {
            class197 var1 = class254.field4459[var0];
            class120.method958(var1);
            class254.field4459[var0] = null;
        }
        class134.field2421 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public static void method1695(int arg0) {
        field4390 = null;
        field4388 = null;
        if (arg0 != 41) {
            field4414 = 90;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBI)I")
    public static final int method1696(int arg0, byte arg1, int arg2) {
        field4391++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg1 < 64) {
                method1694();
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
