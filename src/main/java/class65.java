import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class65 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Le;")
    public static class191 field1135 = class54.method368("M", 2047);

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1138 = 0;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1141 = 99;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Le;")
    public static class191 field1137 = class54.method368(" )2> <col=ff9040>", 2047);

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Le;")
    public static class191 field1143 = class54.method368("welle2:", 2047);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "[[[I")
    public static int[][][] field1136;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method428(byte arg0) {
        field1137 = null;
        field1136 = null;
        int var1 = -100 % ((-arg0 - 5) / 40);
        field1135 = null;
        field1143 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)J")
    public static final long method429(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        return var3 == null || var3.field3541 == null ? 0L : var3.field3541.field86;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZB)V")
    public static final void method430(boolean arg0, byte arg1) {
        class71.field1241 = arg0;
        if (class71.field1241) {
            class107.field1776.method1093((byte) 86);
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class107.field1776.method1099((byte) 127, 1);
                        if (var37 == 1) {
                            class273.field4832[var15][var35][var36] = class107.field1776.method1099((byte) 121, 26);
                        } else {
                            class273.field4832[var15][var35][var36] = -1;
                        }
                    }
                }
            }
            class107.field1776.method1103((byte) -33);
            int var16 = (class253.field4486 - class107.field1776.field3996) / 16;
            class13.field163 = new int[var16][4];
            for (int var17 = 0; var17 < var16; var17++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class13.field163[var17][var34] = class107.field1776.method1601(89);
                }
            }
            int var18 = class107.field1776.method1599((byte) -98);
            int var19 = class107.field1776.method1563(true);
            int var20 = class107.field1776.method1593(true);
            int var21 = class107.field1776.method1593(true);
            int var22 = class107.field1776.method1598((byte) -87);
            class154.field2642 = new int[var16];
            class228.field4103 = new int[var16];
            class261.field4625 = null;
            class248.field4409 = new byte[var16][];
            class38.field685 = new int[var16];
            class75.field1277 = null;
            class69.field1214 = new byte[var16][];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class273.field4832[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 0x3FF;
                            int var29 = (var27 & 0x3FF8) >> 3;
                            int var30 = (var28 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class154.field2642[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                class154.field2642[var23] = var30;
                                int var32 = (var30 & 0xFFB1) >> 8;
                                int var33 = var30 & 0xFF;
                                class38.field685[var23] = class273.field4834.method824(true, class228.method1629(new class191[] { class105.field1756, class92.method563(-117, var32), class115.field1908, class92.method563(-81, var33) }, (byte) -115));
                                class228.field4103[var23] = class273.field4834.method824(true, class228.method1629(new class191[] { class130.field2165, class92.method563(arg1 - 65, var32), class115.field1908, class92.method563(-49, var33) }, (byte) -11));
                                var23++;
                            }
                        }
                    }
                }
            }
            class71.method471(var20, var18, var22, false, (byte) 76, var19, var21);
        } else {
            int var2 = class107.field1776.method1580(arg1 - 64);
            int var3 = class107.field1776.method1611((byte) -92);
            int var4 = class107.field1776.method1598((byte) -87);
            int var5 = (class253.field4486 - class107.field1776.field3996) / 16;
            class13.field163 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class13.field163[var6][var14] = class107.field1776.method1560(64);
                }
            }
            int var7 = class107.field1776.method1598((byte) -87);
            int var8 = class107.field1776.method1593(true);
            class248.field4409 = new byte[var5][];
            boolean var9 = false;
            class69.field1214 = new byte[var5][];
            if (((var7 / 8) == 48 || var7 / 8 == 49) && var3 / 8 == 48) {
                var9 = true;
            }
            class75.field1277 = null;
            if ((var7 / 8) == 48 && var3 / 8 == 148) {
                var9 = true;
            }
            class154.field2642 = new int[var5];
            class261.field4625 = null;
            class228.field4103 = new int[var5];
            class38.field685 = new int[var5];
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= ((var7 + 6) / 8); var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (var9 && var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || !(var11 != 49 || var12 != 47)) {
                        class154.field2642[var10] = var13;
                        class38.field685[var10] = -1;
                        class228.field4103[var10] = -1;
                    } else {
                        class154.field2642[var10] = var13;
                        class38.field685[var10] = class273.field4834.method824(true, class228.method1629(new class191[] { class105.field1756, class92.method563(-60, var11), class115.field1908, class92.method563(-78, var12) }, (byte) -17));
                        class228.field4103[var10] = class273.field4834.method824(true, class228.method1629(new class191[] { class130.field2165, class92.method563(-81, var11), class115.field1908, class92.method563(-62, var12) }, (byte) -76));
                    }
                    var10++;
                }
            }
            class71.method471(var3, var2, var4, false, (byte) 76, var7, var8);
        }
        if (arg1 != 4) {
            method429(109, 74, 71);
        }
        field1139++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lcg;I)V")
    public static final void method431(class44 arg0, int arg1) {
        arg0.method288(class211.field3743, class200.field3584 / 2, class190.field3337 / 2 - 26, 16777215, -1);
        field1140++;
        int var2 = class190.field3337 / 2 - 18;
        class7.method48(class200.field3584 / 2 - 152, var2, 304, 34, 9179409);
        class7.method48(class200.field3584 / 2 - 151, var2 + 1, 302, 32, 0);
        class7.method55(class200.field3584 / 2 - 150, var2 - -2, class185.field3237 * 3, 30, 9179409);
        class7.method55(class200.field3584 / 2 + (class185.field3237 * arg1) - 150, var2 + 2, 300 - class185.field3237 * 3, 30, 0);
        arg0.method288(class134.field2245, class200.field3584 / 2, class190.field3337 / 2 + 4, 16777215, -1);
    }
}
