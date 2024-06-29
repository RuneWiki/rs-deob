import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class45 extends class165 {

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field626 = 0;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "[Z")
    public static boolean[] field638 = new boolean[100];

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field634 = 0;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "Lhh;")
    public static class169 field639 = new class169();

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "Lak;")
    public static class172 field632;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILak;I)Lek;", line = 6)
    public static final class220 method288(int arg0, class172 arg1, int arg2) {
        field630++;
        if (arg2 == -16711936) {
            return class284.method2041(arg1, 66, arg0) ? class278.method2015((byte) 89) : null;
        } else {
            return (class220) null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I[B)Lkh;", line = 33)
    public static final class251 method289(int arg0, byte[] arg1) {
        field637++;
        if (arg1 == null) {
            return null;
        }
        class251 var2;
        if (class232.field3690) {
            var2 = new class35(arg1, class270.field4364, class51.field732, class102.field1489, class184.field3046, class278.field4481);
        } else {
            var2 = new class345(arg1, class270.field4364, class51.field732, class102.field1489, class184.field3046, class278.field4481);
        }
        if (arg0 > -114) {
            field639 = (class169) null;
        }
        class106.method727(true);
        return var2;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZI)I", line = 63)
    public static final int method290(int arg0, int arg1, boolean arg2, int arg3) {
        field627++;
        int var4 = class170.field2812[class250.method1777(arg1, arg3)];
        if (!arg2) {
            return 116;
        }
        if (arg0 > 0) {
            int var5 = class170.field2814.method937(arg2, arg0 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg3 < 0) {
                    var6 = 0;
                } else if (arg3 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg3 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class170.field2814.method956(arg0 & 0xFFFF, -29034);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 8 & 0xFF) * var9;
                int var11 = (var4 >> 16 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = ((var11 & 0xB00FF00) << 8) + (var12 >> 8) + (var10 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)I", line = 134)
    public static final int method291(int arg0, int arg1, int arg2) {
        if (arg1 != 1908952360) {
            field638 = (boolean[]) null;
        }
        field631++;
        class111 var3 = (class111) class76.field1064.method451((long) arg2, (byte) 100);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field1643.length > arg0) {
            return var3.field1643[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZB)V", line = 158)
    public static final void method292(boolean arg0, byte arg1) {
        if (arg1 != 4) {
            method292(false, (byte) 104);
        }
        class221.field3548 = arg0;
        field635++;
        if (!class221.field3548) {
            int var2 = class247.field3898.method267((byte) -63);
            int var3 = class247.field3898.method226(-16384);
            boolean var4 = class106.method732(class247.field3898.method221((byte) -78), (byte) -50);
            int var5 = class247.field3898.method286((byte) -119);
            int var6 = class247.field3898.method282((byte) -97);
            int var7 = class247.field3898.method226(arg1 - 16388);
            int var8 = (class219.field3540 - class247.field3898.field586) / 16;
            class23.field317 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var10 = 0; var10 < 4; var10++) {
                    class23.field317[var9][var10] = class247.field3898.method237(arg1 - 126);
                }
            }
            class4.field69 = new byte[var8][];
            class110.field1641 = new int[var8];
            class157.field2594 = null;
            class143.field2233 = (byte[][]) null;
            class156.field2413 = new byte[var8][];
            class342.field5328 = new int[var8];
            class256.field4120 = new byte[var8][];
            class150.field2321 = new int[var8];
            class330.field5109 = new int[var8];
            boolean var11 = false;
            class129.field2017 = new byte[var8][];
            if (((var6 / 8) == 48 || (var6 / 8) == 49) && var3 / 8 == 48) {
                var11 = true;
            }
            if ((var6 / 8) == 48 && (var3 / 8) == 148) {
                var11 = true;
            }
            class342.field5319 = new int[var8];
            int var12 = 0;
            for (int var13 = (var6 - 6) / 8; var13 <= (var6 + 6) / 8; var13++) {
                for (int var14 = (var3 - 6) / 8; var14 <= ((var3 + 6) / 8); var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class330.field5109[var12] = var15;
                        class150.field2321[var12] = -1;
                        class110.field1641[var12] = -1;
                        class342.field5328[var12] = -1;
                        class342.field5319[var12] = -1;
                    } else {
                        class330.field5109[var12] = var15;
                        class150.field2321[var12] = class234.field3748.method1298((byte) -55, "m" + var13 + "_" + var14);
                        class110.field1641[var12] = class234.field3748.method1298((byte) -73, "l" + var13 + "_" + var14);
                        class342.field5328[var12] = class234.field3748.method1298((byte) -117, "um" + var13 + "_" + var14);
                        class342.field5319[var12] = class234.field3748.method1298((byte) 127, "ul" + var13 + "_" + var14);
                    }
                    var12++;
                }
            }
            class227.method1610(false, -794, var2, var5, var3, var6, var7, var4);
            return;
        }
        int var16 = class247.field3898.method226(arg1 - 16388);
        int var17 = class247.field3898.method248(true);
        int var18 = class247.field3898.method226(-16384);
        int var19 = class247.field3898.method267((byte) -83);
        class247.field3898.method2371(0);
        for (int var20 = 0; var20 < 4; var20++) {
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    int var23 = class247.field3898.method2374(1, (byte) -36);
                    if (var23 == 1) {
                        class83.field1172[var20][var21][var22] = class247.field3898.method2374(26, (byte) -36);
                    } else {
                        class83.field1172[var20][var21][var22] = -1;
                    }
                }
            }
        }
        class247.field3898.method2377((byte) 122);
        int var24 = (class219.field3540 - class247.field3898.field586) / 16;
        class23.field317 = new int[var24][4];
        for (int var25 = 0; var25 < var24; var25++) {
            for (int var26 = 0; var26 < 4; var26++) {
                class23.field317[var25][var26] = class247.field3898.method237(-117);
            }
        }
        int var27 = class247.field3898.method226(-16384);
        boolean var28 = class106.method732(class247.field3898.method286((byte) -87), (byte) -50);
        class4.field69 = new byte[var24][];
        class150.field2321 = new int[var24];
        class256.field4120 = new byte[var24][];
        class156.field2413 = new byte[var24][];
        class157.field2594 = null;
        class342.field5319 = new int[var24];
        class330.field5109 = new int[var24];
        class143.field2233 = (byte[][]) null;
        class110.field1641 = new int[var24];
        class342.field5328 = new int[var24];
        class129.field2017 = new byte[var24][];
        int var29 = 0;
        for (int var30 = 0; var30 < 4; var30++) {
            for (int var31 = 0; var31 < 13; var31++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class83.field1172[var30][var31][var32];
                    if (var33 != -1) {
                        int var34 = (var33 & 0xFFCDCC) >> 14;
                        int var35 = (var33 & 0x3FF8) >> 3;
                        int var36 = (var34 / 8 << 8) + var35 / 8;
                        for (int var37 = 0; var37 < var29; var37++) {
                            if (class330.field5109[var37] == var36) {
                                var36 = -1;
                                break;
                            }
                        }
                        if (var36 != -1) {
                            int var38 = var36 >> 8 & 0xFF;
                            class330.field5109[var29] = var36;
                            int var39 = var36 & 0xFF;
                            class150.field2321[var29] = class234.field3748.method1298((byte) -116, "m" + var38 + "_" + var39);
                            class110.field1641[var29] = class234.field3748.method1298((byte) 116, "l" + var38 + "_" + var39);
                            class342.field5328[var29] = class234.field3748.method1298((byte) 110, "um" + var38 + "_" + var39);
                            class342.field5319[var29] = class234.field3748.method1298((byte) 86, "ul" + var38 + "_" + var39);
                            var29++;
                        }
                    }
                }
            }
        }
        class227.method1610(false, -794, var16, var17, var27, var18, var19, var28);
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(II)V", line = 407)
    public class45(int arg0, int arg1) {
        this.field629 = arg1;
        this.field636 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 417)
    public static void method293(int arg0) {
        field639 = null;
        if (arg0 != -1) {
            field632 = (class172) null;
        }
        field638 = null;
        field632 = null;
    }
}
