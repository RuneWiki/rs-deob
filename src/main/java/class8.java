import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "J")
    public static long field109 = 0L;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "Z")
    public static boolean field116 = true;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Lgo;")
    public static class441 field110 = new class441(9, 0, 4, 1);

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Lic;")
    public static class491 field117;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "Lf;")
    public static class529 field114;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 6)
    public static final void method45(byte arg0) {
        field112++;
        if (arg0 != -86) {
            field116 = true;
        }
        for (class278 var1 = (class278) class422.field6338.method816(arg0 + 187); var1 != null; var1 = (class278) class422.field6338.method812(102)) {
            if (var1.field4004 == -1) {
                var1.field4005 = 0;
                if (var1.field4008 >= 0 && var1.field4002 >= 0 && var1.field4008 < class30.field323 && var1.field4002 < class182.field2661) {
                    class65.method384(arg0 - 12182, var1);
                }
            } else {
                var1.method2049(arg0 ^ 0x11);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 34)
    public static final void method46(int arg0) {
        class474.field6982 = class66.field1009.method1469(128);
        if (arg0 > -55) {
            return;
        }
        field111++;
        int var1 = class66.field1009.method1465((byte) 64);
        boolean var2 = class66.field1009.method1428(32122) == 1;
        int var3 = class66.field1009.method1451((byte) -47);
        int var4 = class66.field1009.method1469(128);
        class233.method1589(873005891, var4);
        class66.field1009.method1695(104);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class30.field323 >> 3); var20++) {
                for (int var21 = 0; var21 < class182.field2661 >> 3; var21++) {
                    int var22 = class66.field1009.method1690((byte) 1, 1);
                    if (var22 == 1) {
                        class168.field2493[var5][var20][var21] = class66.field1009.method1690((byte) 1, 26);
                    } else {
                        class168.field2493[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class66.field1009.method1691(false);
        int var6 = (class352.field5395 - class66.field1009.field3037) / 16;
        class41.field617 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class41.field617[var7][var19] = class66.field1009.method1452(65280);
            }
        }
        class234.field3482 = new byte[var6][];
        class257.field3788 = new int[var6];
        class145.field2151 = null;
        class424.field6364 = new int[var6];
        class331.field4689 = new int[var6];
        class13.field165 = new byte[var6][];
        class480.field7048 = new int[var6];
        class57.field878 = new int[var6];
        class150.field2230 = null;
        class169.field2510 = new byte[var6][];
        class434.field6501 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class30.field323 >> 3; var10++) {
                for (int var11 = 0; var11 < (class182.field2661 >> 3); var11++) {
                    int var12 = class168.field2493[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class331.field4689[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class331.field4689[var8] = var15;
                            int var17 = (var15 & 0xFF91) >> 8;
                            int var18 = var15 & 0xFF;
                            class57.field878[var8] = class132.field2035.method2940("m" + var17 + "_" + var18, false);
                            class424.field6364[var8] = class132.field2035.method2940("l" + var17 + "_" + var18, false);
                            class480.field7048[var8] = class132.field2035.method2940("um" + var17 + "_" + var18, false);
                            class257.field3788[var8] = class132.field2035.method2940("ul" + var17 + "_" + var18, false);
                            var8++;
                        }
                    }
                }
            }
        }
        class185.method1274(var3, var1, false, var2, (byte) -43);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILdr;)V", line = 182)
    public static final void method47(int arg0, class504 arg1) {
        if (arg0 > -93) {
            method47(-24, null);
        }
        class284.field4084 = arg1;
        field119++;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V", line = 193)
    public static void method48(byte arg0) {
        if (arg0 != -81) {
            field117 = null;
        }
        field114 = null;
        field117 = null;
        field110 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V", line = 209)
    public static final void method49(int arg0, int arg1, int arg2) {
        field118++;
        class338 var3 = class230.method1580(5, arg1 - 544374875, arg0);
        var3.method2053(-104);
        var3.field4756 = arg2;
        if (arg1 != -787791453) {
            field110 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V", line = 231)
    public static final void method50(byte arg0) {
        field115++;
        int var1 = -37 % ((76 - arg0) / 39);
        if (class348.field5015 == null) {
            return;
        }
        class118.field1784.method1881(2);
        class261.method1734();
        class264.method1758(20841);
        class527.method3114(1999147020);
        class474.method2837(true);
        class490.method2920(-37);
        if (class323.field4623 != null) {
            class323.field4623.method1482((byte) 93);
        }
        class192.method1301(2);
        class426.method2554(123);
        class400.method2417(102);
        class307.method1935(false, -115);
        class62.method367(false);
        for (int var2 = 0; var2 < 2048; var2++) {
            class239 var6 = class44.field707[var2];
            if (var6 != null) {
                var6.field1993 = null;
                for (int var7 = 0; var7 < var6.field1994.length; var7++) {
                    var6.field1994[var7] = null;
                }
            }
        }
        for (int var3 = 0; var3 < class193.field2821.length; var3++) {
            class167 var4 = class193.field2821[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < var4.field1994.length; var5++) {
                    var4.field1994[var5] = null;
                }
            }
        }
        class348.field5015.method1108(-7682);
        class348.field5015 = null;
    }
}
