import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class227 extends class102 {

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    private final int field4180;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    private final int field4174;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    private final int field4158;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    private final int field4175;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    private final int field4176;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    private final int field4168;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    private final int field4179;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    private final int field4159;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Lqk;")
    public static class207 field4157 = class24.method212(255, "loc");

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Z")
    public static volatile boolean field4166 = false;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "[S")
    public static short[] field4164 = new short[256];

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field4171 = 0;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "Lqk;")
    public static class207 field4177 = class24.method212(255, "(Z");

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Lqk;")
    public static class207 field4165 = class24.method212(255, ": ");

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "Lnk;")
    public static class127 field4170;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "[[Lmd;")
    public static class220[][] field4162;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static void method1618(int arg0) {
        field4165 = null;
        int var1 = 22 % ((arg0 - -82) / 32);
        field4177 = null;
        field4157 = null;
        field4162 = null;
        field4164 = null;
        field4170 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4180 = arg6;
        this.field4174 = arg5;
        this.field4158 = arg1;
        this.field4175 = arg0;
        this.field4176 = arg2;
        this.field4168 = arg3;
        this.field4179 = arg4;
        this.field4159 = arg7;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZI)V")
    public final void method23(int arg0, boolean arg1, int arg2) {
        ++field4173;
        if (!arg1) {
            field4170 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)V")
    public final void method22(int arg0, int arg1, int arg2) {
        if (arg0 == 29635) {
            ++field4161;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[BIII[Lgi;ZIII)V")
    public static final void method1619(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class155[] arg6, boolean arg7, int arg8, int arg9, int arg10) {
        ++field4163;
        if (arg8 != 8) {
            field4170 = null;
        }
        class149 var11 = new class149(arg2);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1064((byte) 119);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1067(-32768);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 63;
                int var17 = var11.method1045((byte) 99);
                int var18 = (4091 & var14) >> 6;
                int var19 = 3 & var17;
                int var20 = var17 >> 2;
                int var21 = var14 >> 12;
                if (~arg3 == ~var21 && var18 >= arg10 && var18 < arg10 + 8 && var16 >= arg1 && var16 < arg1 + 8) {
                    class22 var22 = class33.method251(0, var12);
                    int var23 = arg9 + class127.method890(var22.field392, var19, arg4, var22.field414, 7 & var16, -18030, var18 & 7);
                    int var24 = class159.method1157(var22.field392, 7 & var16, arg4, 7 & var18, arg8 ^ 8167, var22.field414, var19) + arg5;
                    if (var23 > 0 && ~var24 < -1 && ~var23 > -104 && var24 < 103) {
                        class155 var25 = null;
                        if (!arg7) {
                            int var26 = arg0;
                            if (~(class271.field4791[1][var23][var24] & 2) == -3) {
                                var26 = arg0 - 1;
                            }
                            if (~var26 <= -1) {
                                var25 = arg6[var26];
                            }
                        }
                        class110.method787(var23, arg7, !arg7, var12, 3 & arg4 + var19, var20, arg0, arg0, Integer.MAX_VALUE, var25, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V")
    public static final void method1620(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 - arg4 >= class124.field2158 && ~class88.field1599 <= ~(arg1 - -arg4) && class204.field3580 <= -arg4 + arg3 && ~class204.field3602 <= ~(arg3 - -arg4)) {
            class124.method868(arg3, arg2, arg1, arg4, false);
        } else {
            class161.method1175(arg1, arg4, arg2, (byte) -33, arg3);
        }
        int var5 = -44 / ((arg0 - -51) / 46);
        ++field4155;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
    public final void method25(int arg0, int arg1, int arg2) {
        ++field4156;
        int var4 = this.field4158 * arg2 >> 12;
        int var5 = this.field4168 * arg2 >> 12;
        int var6 = this.field4175 * arg0 >> 12;
        int var7 = this.field4179 * arg0 >> 12;
        int var8 = this.field4176 * arg0 >> 12;
        if (arg1 != 1) {
            field4171 = 96;
        }
        int var9 = this.field4174 * arg2 >> 12;
        int var10 = this.field4180 * arg0 >> 12;
        int var11 = this.field4159 * arg2 >> 12;
        class62.method454(var6, var9, var7, var8, var5, var11, var4, var10, (byte) -64, super.field1834);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)I")
    public static final int method1621(int arg0, int arg1, int arg2, int arg3) {
        ++field4169;
        int var4 = arg0 / arg2;
        int var5 = arg2 + -1 & arg0;
        if (arg3 != 17114) {
            field4160 = -88;
        }
        int var6 = arg1 / arg2;
        int var7 = arg2 + -1 & arg1;
        int var8 = class97.method688(-1, var6, var4);
        int var9 = class97.method688(-1, var6, var4 + 1);
        int var10 = class97.method688(-1, var6 - -1, var4);
        int var11 = class97.method688(arg3 + -17115, var6 + 1, var4 + 1);
        int var12 = class155.method1136(var8, var5, 4096, arg2, var9);
        int var13 = class155.method1136(var10, var5, arg3 ^ 21210, arg2, var11);
        return class155.method1136(var12, var7, 4096, arg2, var13);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method1622(int arg0) {
        ++field4167;
        int var1 = class182.field3250;
        int var2 = class17.field268;
        int var3 = class214.field3806;
        int var4 = class132.field2279;
        if (class111.field1931 == null || class186.field3292 == null) {
            if (class101.field1832.method723(class215.field3834, true) && class101.field1832.method723(class28.field578, true)) {
                class111.field1931 = class240.method1697(class101.field1832, 0, (byte) 34, class215.field3834);
                class186.field3292 = class240.method1697(class101.field1832, 0, (byte) 34, class28.field578);
            } else {
                class23.method159(var1, var2, var4, 20, class57.field1059, -class27.field553 + 256);
            }
        }
        if (class111.field1931 != null && class186.field3292 != null) {
            int var5 = var4 / class111.field1931.field1802;
            for (int var6 = 0; var5 > var6; ++var6) {
                class111.field1931.method381(class111.field1931.field1802 * var6 + var1, var2);
            }
            class186.field3292.method381(var1, var2);
            class186.field3292.method379(var1 + var4 - class186.field3292.field1802, var2);
        }
        class284.field4996.method1613(class83.field1533, var1 + 3, var2 + 14, class235.field4349, -1);
        class23.method159(var1, var2 + 20, var4, var3 - 20, class57.field1059, -class27.field553 + 256);
        int var7 = class20.field322;
        int var8 = class268.field4747;
        if (arg0 >= -14) {
            field4166 = true;
        }
        for (int var9 = 0; ~var9 > ~class268.field4751; ++var9) {
            int var17 = var2 - -35 - -((class268.field4751 - var9 + -1) * 15);
            if (~var7 < ~var1 && var7 < var1 - -var4 && ~(var17 + -13) > ~var8 && var8 < var17 + 3) {
                class23.method159(var1, var17 + -13, var4, 16, class85.field1538, 256 - class9.field125);
            }
        }
        if ((class100.field1797 == null || class31.field632 == null || class47.field943 == null) && class101.field1832.method723(class71.field1269, true) && class101.field1832.method723(class162.field2870, true) && class101.field1832.method723(class69.field1240, true)) {
            class100.field1797 = class240.method1697(class101.field1832, 0, (byte) 34, class71.field1269);
            class31.field632 = class240.method1697(class101.field1832, 0, (byte) 34, class162.field2870);
            class47.field943 = class240.method1697(class101.field1832, 0, (byte) 34, class69.field1240);
        }
        if (class100.field1797 != null && class31.field632 != null && class47.field943 != null) {
            int var10 = var4 / class100.field1797.field1802;
            for (int var11 = 0; ~var10 < ~var11; ++var11) {
                class100.field1797.method381(class100.field1797.field1802 * var11 + var1, var2 - -var3 + -class100.field1797.field1811);
            }
            int var12 = (var3 + -20) / class31.field632.field1811;
            for (int var13 = 0; ~var12 < ~var13; ++var13) {
                class31.field632.method381(var1, var2 - -20 - -(class31.field632.field1811 * var13));
                class31.field632.method379(var1 - class31.field632.field1802 + var4, class31.field632.field1811 * var13 + var2 + 20);
            }
            class47.field943.method381(var1, var2 - -var3 + -class47.field943.field1811);
            class47.field943.method379(var1 + var4 + -class47.field943.field1802, var2 + var3 + -class47.field943.field1811);
        }
        for (int var14 = 0; var14 < class268.field4751; ++var14) {
            int var15 = var2 - -35 - -((class268.field4751 + -1 - var14) * 15);
            int var16 = class235.field4349;
            if (var7 > var1 && ~(var1 + var4) < ~var7 && var15 + -13 < var8 && var15 + 3 > var8) {
                var16 = class101.field1831;
            }
            class284.field4996.method1613(class244.method1718(var14, 0), var1 - -3, var15, var16, 0);
        }
        class140.method973(class132.field2279, class182.field3250, (byte) -120, class17.field268, class214.field3806);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(III)I")
    public static final int method1623(int arg0, int arg1, int arg2) {
        ++field4172;
        int var3 = 0;
        while (arg1 > 0) {
            --arg1;
            var3 = var3 << 1 | arg2 & 1;
            arg2 >>>= 1;
        }
        if (arg0 <= 20) {
            method1621(43, 87, 29, 27);
        }
        return var3;
    }
}
