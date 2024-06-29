import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class83 extends class200 {

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "[I")
    public static int[] field1615 = new int[4000];

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "Ldj;")
    public static class44 field1622 = class89.method650(255, "<br>");

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public static int field1626 = -1;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "Ldj;")
    public static class44 field1628 = class89.method650(255, "rect_debug=");

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "Lvi;")
    public static class229 field1627;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "Ldj;")
    public class44 field1613;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "[I")
    public int[] field1616;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "[I")
    public int[] field1621;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "[I")
    public int[] field1623;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "[I")
    public int[] field1625;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)I")
    public static final int method621(int arg0, boolean arg1) {
        if (arg1) {
            field1619++;
            return arg0 >>> 8;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lfj;B)V")
    public final void method622(class66 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method506(255);
            if (var3 == 0) {
                int var4 = -84 / ((arg1 - 32) / 56);
                field1620++;
                return;
            }
            this.method626(var3, arg0, -128);
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public static void method623(byte arg0) {
        field1622 = null;
        if (arg0 < 5) {
            field1626 = 57;
        }
        field1627 = null;
        field1628 = null;
        field1615 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)I")
    public final int method624(int arg0, byte arg1) {
        field1624++;
        if (this.field1621 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != -5) {
            this.field1623 = null;
        }
        while (var3 < this.field1621.length) {
            if (this.field1625[var3] == arg0) {
                return this.field1621[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)I")
    public final int method625(boolean arg0, int arg1) {
        field1614++;
        if (this.field1623 == null) {
            return -1;
        } else if (arg0) {
            for (int var3 = 0; var3 < this.field1623.length; var3++) {
                if (this.field1616[var3] == arg1) {
                    return this.field1623[var3];
                }
            }
            return -1;
        } else {
            return 69;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILfj;I)V")
    private final void method626(int arg0, class66 arg1, int arg2) {
        if (arg0 == 1) {
            this.field1613 = arg1.method496(true);
        } else if (arg0 == 2) {
            int var7 = arg1.method506(255);
            this.field1623 = new int[var7];
            this.field1616 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1623[var8] = arg1.method500(106);
                int var9 = arg1.method506(255);
                if (var9 == 0) {
                    this.field1616[var8] = -1;
                } else {
                    this.field1616[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method506(255);
            this.field1621 = new int[var4];
            this.field1625 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1621[var5] = arg1.method500(92);
                int var6 = arg1.method506(255);
                if (var6 == 0) {
                    this.field1625[var5] = -1;
                } else {
                    this.field1625[var5] = var6;
                }
            }
        }
        if (arg2 > -120) {
            field1626 = 79;
        }
        field1612++;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)Z")
    public static final boolean method627(byte arg0) {
        field1617++;
        long var1 = class27.method193((byte) 78);
        int var3 = (int) (var1 - class151.field2627);
        if (var3 > 200) {
            var3 = 200;
        }
        class151.field2627 = var1;
        class77.field1497 += var3;
        if (class207.field3720 == 0 && class163.field2819 == 0 && class54.field991 == 0 && class3.field44 == 0) {
            return true;
        }
        if (arg0 < 15) {
            method627((byte) -82);
        }
        if (class120.field2139 == null) {
            return false;
        }
        try {
            if (class77.field1497 > 30000) {
                throw new IOException();
            }
            while (class163.field2819 < 20 && class3.field44 > 0) {
                class236 var4 = (class236) class186.field3215.method832(-72);
                class66 var5 = new class66(4);
                var5.method488(124, 1);
                var5.method483(2554, (int) var4.field3186);
                class120.field2139.method782(111, var5.field1219, 4, 0);
                class200.field3544.method830(var4, var4.field3186, 1);
                class3.field44--;
                class163.field2819++;
            }
            while (class207.field3720 < 20 && class54.field991 > 0) {
                class236 var6 = (class236) class87.field1664.method847(15731);
                class66 var7 = new class66(4);
                var7.method488(120, 0);
                var7.method483(2554, (int) var6.field3186);
                class120.field2139.method782(71, var7.field1219, 4, 0);
                var6.method1288(false);
                class116.field2072.method830(var6, var6.field3186, 1);
                class54.field991--;
                class207.field3720++;
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = class120.field2139.method783(true);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                class77.field1497 = 0;
                byte var10 = 0;
                if (class235.field4361 == null) {
                    var10 = 8;
                } else if (class184.field3196 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = class94.field1743.field1219.length - class235.field4361.field4384;
                    int var12 = 512 - class184.field3196;
                    if (var11 - class94.field1743.field1195 < var12) {
                        var12 = var11 - class94.field1743.field1195;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    class120.field2139.method784(class94.field1743.field1219, class94.field1743.field1195, var12, (byte) -127);
                    if (class57.field1074 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            class94.field1743.field1219[class94.field1743.field1195 + var13] = (byte) class13.method116(class94.field1743.field1219[class94.field1743.field1195 + var13], class57.field1074);
                        }
                    }
                    class94.field1743.field1195 += var12;
                    class184.field3196 += var12;
                    if (class94.field1743.field1195 == var11) {
                        if (class235.field4361.field3186 == 16711935L) {
                            class120.field2137 = class94.field1743;
                            for (int var14 = 0; var14 < 256; var14++) {
                                class147 var15 = class94.field1759[var14];
                                if (var15 != null) {
                                    class120.field2137.field1195 = var14 * 8 + 5;
                                    int var16 = class120.field2137.method528(true);
                                    int var17 = class120.field2137.method528(true);
                                    var15.method965(var17, false, var16);
                                }
                            }
                        } else {
                            class73.field1385.reset();
                            class73.field1385.update(class94.field1743.field1219, 0, var11);
                            int var18 = (int) class73.field1385.getValue();
                            if (class235.field4361.field4382 != var18) {
                                try {
                                    class120.field2139.method778((byte) -128);
                                } catch (Exception var30) {
                                }
                                class120.field2139 = null;
                                class57.field1074 = (byte) (Math.random() * 255.0D + 1.0D);
                                class55.field1005++;
                                return false;
                            }
                            class54.field999 = 0;
                            class55.field1005 = 0;
                            class235.field4361.field4383.method959(class92.field1720, (class235.field4361.field3186 & 0xFF0000L) == 16711680L, class94.field1743.field1219, -2, (int) (class235.field4361.field3186 & 0xFFFFL));
                        }
                        class235.field4361.method1148(-13215);
                        class235.field4361 = null;
                        class94.field1743 = null;
                        class184.field3196 = 0;
                        if (class92.field1720) {
                            class163.field2819--;
                        } else {
                            class207.field3720--;
                        }
                    } else {
                        if (class184.field3196 != 512) {
                            break;
                        }
                        class184.field3196 = 0;
                    }
                } else {
                    int var19 = var10 - class198.field3505.field1195;
                    if (var9 < var19) {
                        var19 = var9;
                    }
                    class120.field2139.method784(class198.field3505.field1219, class198.field3505.field1195, var19, (byte) -127);
                    if (class57.field1074 != 0) {
                        for (int var20 = 0; var20 < var19; var20++) {
                            class198.field3505.field1219[class198.field3505.field1195 + var20] = (byte) class13.method116(class198.field3505.field1219[class198.field3505.field1195 + var20], class57.field1074);
                        }
                    }
                    class198.field3505.field1195 += var19;
                    if (class198.field3505.field1195 < var10) {
                        break;
                    }
                    if (class235.field4361 == null) {
                        class198.field3505.field1195 = 0;
                        int var21 = class198.field3505.method506(255);
                        int var22 = class198.field3505.method500(81);
                        int var23 = class198.field3505.method506(255);
                        int var24 = class198.field3505.method528(true);
                        long var25 = (long) ((var21 << 16) + var22);
                        class236 var27 = (class236) class200.field3544.method828(var25, (byte) -40);
                        class92.field1720 = true;
                        if (var27 == null) {
                            var27 = (class236) class116.field2072.method828(var25, (byte) -40);
                            class92.field1720 = false;
                        }
                        if (var27 == null) {
                            throw new IOException();
                        }
                        class235.field4361 = var27;
                        int var28 = var23 == 0 ? 5 : 9;
                        class94.field1743 = new class66(var24 + var28 + class235.field4361.field4384);
                        class94.field1743.method488(121, var23);
                        class94.field1743.method489(var24, -50);
                        class184.field3196 = 8;
                        class198.field3505.field1195 = 0;
                    } else if (class184.field3196 == 0) {
                        if (class198.field3505.field1219[0] == -1) {
                            class184.field3196 = 1;
                            class198.field3505.field1195 = 0;
                        } else {
                            class235.field4361 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                class120.field2139.method778((byte) 13);
            } catch (Exception var29) {
            }
            class54.field999++;
            class120.field2139 = null;
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[B)V")
    public static final void method628(int arg0, byte[] arg1) {
        if (arg0 >= -100) {
            method623((byte) -86);
        }
        field1611++;
        int var2 = 0;
        while (true) {
            while (arg1.length > var2) {
                int var3 = arg1[var2++] * 64 - class198.field3502;
                int var4 = arg1[var2++] * 64 - class136.field2431;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class168.field2896 && var4 + 64 < class214.field3851) {
                    int var5 = var3 >> 6;
                    int var6 = class214.field3851 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if ((var9 & 0x1) == 1) {
                                    byte var10 = arg1[var2++];
                                    if (class79.field1535[var5][var6] == null) {
                                        class79.field1535[var5][var6] = new byte[4096];
                                    }
                                    class79.field1535[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) var10;
                                }
                                if ((var9 & 0x2) == 2) {
                                    byte var11 = arg1[var2++];
                                    if (class180.field3121[var5][var6] == null) {
                                        class180.field3121[var5][var6] = new byte[4096];
                                    }
                                    class180.field3121[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) (var11 - 28);
                                }
                                if ((var9 & 0x4) == 4) {
                                    var2 += 3;
                                    int var12 = ((arg1[var2 - 2] & 0xFF) << 8) + (((arg1[var2 - 3] & 0xFF) << 16) + (arg1[var2 - 1] & 0xFF));
                                    if (class72.field1378[var5][var6] == null) {
                                        class72.field1378[var5][var6] = new int[4096];
                                    }
                                    var12--;
                                    class39 var13 = class40.method281(true, var12);
                                    if (var13.field737 != null) {
                                        var13 = var13.method274(103);
                                        if (var13 == null || var13.field696 == -1) {
                                            continue;
                                        }
                                    }
                                    class72.field1378[var5][var6][(-(var8 + 1) << 6) + var7] = var13.field733 + 1;
                                    class210 var14 = new class210();
                                    var14.field3756 = var13.field696;
                                    var14.field3746 = class214.field3851 - var4;
                                    var14.field3753 = var3;
                                    class192.field3315.method1185(var14, (byte) -110);
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < 64; var15++) {
                        for (int var16 = -64; var16 < 0; var16++) {
                            byte var17 = arg1[var2++];
                            if (var17 != 0) {
                                if ((var17 & 0x1) == 1) {
                                    var2++;
                                }
                                if ((var17 & 0x2) == 2) {
                                    var2++;
                                }
                                if ((var17 & 0x4) == 4) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)V")
    public static final void method629(byte arg0) {
        if (arg0 != 122) {
            return;
        }
        if (class229.field4294.toLowerCase().indexOf("microsoft") == -1) {
            class78.field1507[59] = 57;
            class78.field1507[91] = 42;
            class78.field1507[45] = 26;
            class78.field1507[61] = 27;
            class78.field1507[93] = 43;
            class78.field1507[47] = 73;
            class78.field1507[44] = 71;
            class78.field1507[92] = 74;
            if (class229.field4304 == null) {
                class78.field1507[192] = 58;
                class78.field1507[222] = 59;
            } else {
                class78.field1507[192] = 28;
                class78.field1507[222] = 58;
                class78.field1507[520] = 59;
            }
            class78.field1507[46] = 72;
        } else {
            class78.field1507[220] = 74;
            class78.field1507[188] = 71;
            class78.field1507[186] = 57;
            class78.field1507[191] = 73;
            class78.field1507[219] = 42;
            class78.field1507[190] = 72;
            class78.field1507[187] = 27;
            class78.field1507[221] = 43;
            class78.field1507[222] = 59;
            class78.field1507[189] = 26;
            class78.field1507[192] = 58;
            class78.field1507[223] = 28;
        }
        field1618++;
    }
}
