import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class300 extends class306 {

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4683 = "cyan:";

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4686 = "Allocating memory";

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "[I")
    public static int[] field4685;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "[[[B")
    public static byte[][][] field4687;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method47(int arg0, int arg1) {
        field4691++;
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        int[] var3 = this.field4757.method903(arg0, arg1 + 1546337477);
        if (this.field4757.field1898) {
            class8.method49(var3, 0, class31.field367, class111.field1553[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(B)V", line = 35)
    public static void method2115(byte arg0) {
        field4683 = null;
        field4687 = (byte[][][]) null;
        field4686 = null;
        field4685 = null;
        if (arg0 != -63) {
            field4687 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLlf;I)Luc;", line = 50)
    public static final class212 method2116(byte arg0, class143 arg1, int arg2) {
        class212 var3 = new class212(arg2, arg1.method1040((byte) -127), arg1.method1040((byte) -127), arg1.method1057(-102), arg1.method1057(-119), arg1.method1043(true) == 1, arg1.method1043(true));
        field4688++;
        int var4 = arg1.method1043(true);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field3230.method1814(new class260(arg1.method1043(true), arg1.method1043(true), arg1.method1051(1), arg1.method1051(1), arg1.method1051(1), arg1.method1051(1), arg1.method1051(1), arg1.method1051(1), arg1.method1051(1), arg1.method1051(1)), true);
        }
        if (arg0 >= -74) {
            field4687 = (byte[][][]) ((byte[][][]) null);
        }
        var3.method1485((byte) -66);
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLnk;)I", line = 76)
    public static final int method2117(byte arg0, class16 arg1) {
        field4692++;
        if (arg0 >= -61) {
            field4685 = (int[]) null;
        }
        int var2 = 0;
        if (arg1.method125(class271.field4265, 109)) {
            var2++;
        }
        if (arg1.method125(class156.field2441, -34)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 95)
    public class300() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V", line = 103)
    public static final void method2118(int arg0) {
        field4690++;
        if (arg0 != -21112) {
            field4683 = (String) null;
        }
        for (int var1 = 0; var1 < class218.field3280; var1++) {
            int var2 = class127.field1864[var1];
            class67 var3 = class105.field1443[var2];
            int var4 = class282.field4499.method1043(true);
            if ((var4 & 0x40) != 0) {
                var4 += class282.field4499.method1043(true) << 8;
            }
            class79.method518(0, var2, var4, var3);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZIIIIIIIIII)V", line = 136)
    public static final void method2119(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class227.field3428[var12][var13] = 0;
                class171.field2606[var12][var13] = 99999999;
            }
        }
        field4684++;
        int var14 = arg0;
        int var15 = arg9;
        int var16 = 0;
        byte var17 = 0;
        class227.field3428[arg0][arg9] = 99;
        class171.field2606[arg0][arg9] = 0;
        boolean var18 = false;
        class291.field4585[var17] = arg0;
        int var38 = var17 + 1;
        class63.field761[var17] = arg9;
        int[][] var19 = class247.field3914[class219.field3290].field4156;
        label331: while (var16 != var38) {
            var14 = class291.field4585[var16];
            var15 = class63.field761[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg2 == var14 && arg6 == var15) {
                var18 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class247.field3914[class219.field3290].method1856(arg7, arg6, var14, arg11 - 1, arg5, (byte) 100, var15, arg2)) {
                    var18 = true;
                    break;
                }
                if (arg11 < 10 && class247.field3914[class219.field3290].method1852(arg11 - 1, arg5, (byte) 82, arg6, var15, arg7, var14, arg2)) {
                    var18 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg3 != 0 && class247.field3914[class219.field3290].method1847(arg10, arg6, var14, arg4, var15, arg3, arg2, (byte) -91, arg7)) {
                var18 = true;
                break;
            }
            int var20 = class171.field2606[var14][var15] + 1;
            if (var14 > 0 && class227.field3428[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x2C010E) == 0 && (var19[var14 - 1][arg7 + var15 - 1] & 0x2C0138) == 0) {
                int var21 = 1;
                while (true) {
                    if (var21 >= (arg7 - 1)) {
                        class291.field4585[var38] = var14 - 1;
                        class63.field761[var38] = var15;
                        var38 = var38 + 1 & 0xFFF;
                        class227.field3428[var14 - 1][var15] = 2;
                        class171.field2606[var14 - 1][var15] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var21] & 0x2C013E) != 0) {
                        break;
                    }
                    var21++;
                }
            }
            if (var14 < 102 && class227.field3428[var14 + 1][var15] == 0 && (var19[arg7 + var14][var15] & 0x2C0183) == 0 && (var19[var14 + arg7][arg7 + var15 - 1] & 0x2C01E0) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= (arg7 - 1)) {
                        class291.field4585[var38] = var14 + 1;
                        class63.field761[var38] = var15;
                        var38 = var38 + 1 & 0xFFF;
                        class227.field3428[var14 + 1][var15] = 8;
                        class171.field2606[var14 + 1][var15] = var20;
                        break;
                    }
                    if ((var19[arg7 + var14][var15 + var22] & 0x2C01E3) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 > 0 && class227.field3428[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x2C010E) == 0 && (var19[arg7 + var14 - 1][var15 - 1] & 0x2C0183) == 0) {
                int var23 = 1;
                while (true) {
                    if (arg7 - 1 <= var23) {
                        class291.field4585[var38] = var14;
                        class63.field761[var38] = var15 - 1;
                        var38 = var38 + 1 & 0xFFF;
                        class227.field3428[var14][var15 - 1] = 1;
                        class171.field2606[var14][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[var14 + var23][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var15 < 102 && class227.field3428[var14][var15 + 1] == 0 && (var19[var14][arg7 + var15] & 0x2C0138) == 0 && (var19[var14 + arg7 - 1][arg7 + var15] & 0x2C01E0) == 0) {
                int var24 = 1;
                while (true) {
                    if ((arg7 - 1) <= var24) {
                        class291.field4585[var38] = var14;
                        class63.field761[var38] = var15 + 1;
                        class227.field3428[var14][var15 + 1] = 4;
                        class171.field2606[var14][var15 + 1] = var20;
                        var38 = var38 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var24][var15 + arg7] & 0x2C01F8) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var14 > 0 && var15 > 0 && class227.field3428[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x2C010E) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= arg7) {
                        class291.field4585[var38] = var14 - 1;
                        class63.field761[var38] = var15 - 1;
                        class227.field3428[var14 - 1][var15 - 1] = 3;
                        var38 = var38 + 1 & 0xFFF;
                        class171.field2606[var14 - 1][var15 - 1] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var25 - 1] & 0x2C013E) != 0 || (var19[var14 + var25 - 1][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var14 < 102 && var15 > 0 && class227.field3428[var14 + 1][var15 - 1] == 0 && (var19[arg7 + var14][var15 - 1] & 0x2C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (arg7 <= var26) {
                        class291.field4585[var38] = var14 + 1;
                        class63.field761[var38] = var15 - 1;
                        class227.field3428[var14 + 1][var15 - 1] = 9;
                        class171.field2606[var14 + 1][var15 - 1] = var20;
                        var38 = var38 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg7 + var14][var15 - (1 - var26)] & 0x2C01E3) != 0 || (var19[var14 + var26][var15 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var14 > 0 && var15 < 102 && class227.field3428[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][arg7 + var15] & 0x2C0138) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg7 <= var27) {
                        class291.field4585[var38] = var14 - 1;
                        class63.field761[var38] = var15 + 1;
                        class227.field3428[var14 - 1][var15 + 1] = 6;
                        var38 = var38 + 1 & 0xFFF;
                        class171.field2606[var14 - 1][var15 + 1] = var20;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var27] & 0x2C013E) != 0 || (var19[var14 + var27 - 1][arg7 + var15] & 0x2C01F8) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var14 < 102 && var15 < 102 && class227.field3428[var14 + 1][var15 + 1] == 0 && (var19[arg7 + var14][arg7 + var15] & 0x2C01E0) == 0) {
                for (int var28 = 1; var28 < arg7; var28++) {
                    if ((var19[var14 + var28][arg7 + var15] & 0x2C01F8) != 0 || (var19[arg7 + var14][var15 + var28] & 0x2C01E3) != 0) {
                        continue label331;
                    }
                }
                class291.field4585[var38] = var14 + 1;
                class63.field761[var38] = var15 + 1;
                class227.field3428[var14 + 1][var15 + 1] = 12;
                class171.field2606[var14 + 1][var15 + 1] = var20;
                var38 = var38 + 1 & 0xFFF;
            }
        }
        int var29 = 33 / ((arg8 + 49) / 49);
        if (!var18) {
            if (!arg1) {
                return;
            }
            int var30 = 1000;
            byte var31 = 10;
            int var32 = 100;
            for (int var33 = arg2 - var31; var33 <= arg2 + var31; var33++) {
                for (int var34 = arg6 - var31; var34 <= arg6 + var31; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class171.field2606[var33][var34] < 100) {
                        int var35 = 0;
                        if (var33 < arg2) {
                            var35 = arg2 - var33;
                        } else if (arg2 + arg4 - 1 < var33) {
                            var35 = var33 + 1 - (arg2 - -arg4);
                        }
                        int var36 = 0;
                        if (var34 < arg6) {
                            var36 = arg6 - var34;
                        } else if (var34 > arg3 + arg6 - 1) {
                            var36 = var34 + 1 - (arg3 + arg6);
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var30 > var37 || var30 == var37 && class171.field2606[var33][var34] < var32) {
                            var30 = var37;
                            var15 = var34;
                            var14 = var33;
                            var32 = class171.field2606[var33][var34];
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return;
            }
            if (arg0 == var14 && arg9 == var15) {
                return;
            }
        }
        class5.field57 = var15;
        class237.field3650 = false;
        class309.field4795 = var14;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BC)B", line = 567)
    public static final byte method2120(byte arg0, char arg1) {
        if (arg0 != 73) {
            return -117;
        }
        field4689++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }
}
