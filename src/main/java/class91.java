import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class91 {

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Lvw;")
    private class307 field1587 = null;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "Lci;")
    private class451 field1617;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "Z")
    private boolean field1613;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "Lej;")
    public static class124 field1601 = new class124(3, -1);

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public static int field1624 = 100;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "F")
    public static float field1628;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "J")
    public static long field1625;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "[Ljava/lang/Object;")
    private Object[] field1614;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1622;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)I")
    public final int method842(int arg0) {
        int var2 = -117 / ((-arg0 - 60) / 33);
        field1615++;
        if (!this.method852(false)) {
            throw new IllegalStateException("");
        }
        return this.field1587.field4247;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static void method843(byte arg0) {
        field1601 = null;
        if (arg0 != 10) {
            method843((byte) -3);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method844(String arg0, String arg1, int arg2) {
        field1605++;
        if (!this.method852(false)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field1587.field4251.method3873(1, class276.method1819(var4, -29286));
        if (!this.method845(var6, (byte) -40)) {
            return null;
        }
        if (arg2 != -29832) {
            this.method845(22, (byte) 12);
        }
        int var7 = this.field1587.field4256[var6].method3873(arg2 ^ 0xFFFF8B79, class276.method1819(var5, -29286));
        return this.method863(-1860, var6, var7);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)Z")
    private final boolean method845(int arg0, byte arg1) {
        field1604++;
        if (!this.method852(false)) {
            return false;
        } else if (arg0 >= 0 && this.field1587.field4252.length > arg0 && this.field1587.field4252[arg0] != 0) {
            return arg1 == -40;
        } else if (class539.field7453) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III[I)[B")
    public final byte[] method846(int arg0, int arg1, int arg2, int[] arg3) {
        field1597++;
        if (arg2 != 2) {
            field1627 = 51;
        }
        if (!this.method871(arg1, arg2 - 2, arg0)) {
            return null;
        }
        if (this.field1622[arg0] == null || this.field1622[arg0][arg1] == null) {
            boolean var5 = this.method847(arg1, (byte) -78, arg3, arg0);
            if (!var5) {
                this.method859(arg0, -117);
                boolean var6 = this.method847(arg1, (byte) -103, arg3, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class216.method1547(false, this.field1622[arg0][arg1], 53146732);
        if (this.field1592 == 1) {
            this.field1622[arg0][arg1] = null;
            if (this.field1587.field4252[arg0] == 1) {
                this.field1622[arg0] = null;
            }
        } else if (this.field1592 == 2) {
            this.field1622[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB[II)Z")
    private final boolean method847(int arg0, byte arg1, int[] arg2, int arg3) {
        field1586++;
        if (!this.method845(arg3, (byte) -40)) {
            return false;
        } else if (this.field1614[arg3] == null) {
            return false;
        } else {
            int var5 = this.field1587.field4253[arg3];
            int[] var6 = this.field1587.field4249[arg3];
            if (this.field1622[arg3] == null) {
                this.field1622[arg3] = new Object[this.field1587.field4252[arg3]];
            }
            Object[] var7 = this.field1622[arg3];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var11 = class216.method1547(true, this.field1614[arg3], 53146732);
                class215 var12 = new class215(var11);
                var12.method1515(607818341, arg2, 5, var12.field3066.length);
            } else {
                var11 = class216.method1547(false, this.field1614[arg3], 53146732);
            }
            byte[] var13;
            try {
                var13 = class432.method2628(var11, -120);
            } catch (RuntimeException var49) {
                throw class217.method1551(var49, "T3 - " + (arg2 != null) + "," + arg3 + "," + var11.length + "," + class241.method1672(5126, var11.length, var11) + "," + class241.method1672(5126, var11.length - 2, var11) + "," + this.field1587.field4257[arg3] + "," + this.field1587.field4247);
            }
            if (this.field1613) {
                this.field1614[arg3] = null;
            }
            if (arg1 >= -17) {
                this.method868((byte) 70, -7);
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field1592 == 0) {
                    var7[var48] = class727.method4021(var13, false, (byte) 104);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field1592 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * var32 * 4;
                class215 var34 = new class215(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field3109 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method1533((byte) -126);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg0 == var40) {
                            var36 = var40;
                            var35 += var38;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field3109 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method1533((byte) -126);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg0 == var47) {
                            class363.method2319(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class215 var18 = new class215(var13);
                int[] var19 = new int[var5];
                var18.field3109 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method1533((byte) -126);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field3109 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method1533((byte) -126);
                        class363.method2319(var13, var25, var23[var28], var19[var28], var27);
                        var25 += var27;
                        var19[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field1592 == 0) {
                        var7[var30] = class727.method4021(var23[var29], false, (byte) 126);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public static final void method848(int arg0) throws class721 {
        if (class215.field3119 == 1) {
            class569.field7823.method348(class501.field7002, class512.field7129);
        } else {
            class569.field7823.method348(0, 0);
        }
        if (arg0 >= 73) {
            field1600++;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I")
    public final int[] method849(int arg0, int arg1) {
        field1598++;
        if (arg1 != 0) {
            this.method842(-55);
        }
        if (!this.method845(arg0, (byte) -40)) {
            return null;
        }
        int[] var3 = this.field1587.field4249[arg0];
        if (var3 == null) {
            var3 = new int[this.field1587.field4253[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method850(String arg0, int arg1) {
        field1591++;
        if (!this.method852(false)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 0) {
            this.field1617 = null;
        }
        int var4 = this.field1587.field4251.method3873(1, class276.method1819(var3, arg1 ^ 0xFFFF8D9A));
        return this.method872(arg1, var4);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)I")
    public final int method851(byte arg0) {
        field1599++;
        if (!this.method852(false)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != -31) {
            return 50;
        }
        while (this.field1614.length > var4) {
            if (this.field1587.field4253[var4] > 0) {
                var3 += this.method872(0, var4);
                var2 += 100;
            }
            var4++;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)Z")
    private final boolean method852(boolean arg0) {
        field1610++;
        if (this.field1587 == null) {
            this.field1587 = this.field1617.method437((byte) 56);
            if (this.field1587 == null) {
                return false;
            }
            this.field1614 = new Object[this.field1587.field4262];
            this.field1622 = new Object[this.field1587.field4262][];
        }
        if (arg0) {
            this.field1617 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method853(int arg0, String arg1) {
        field1593++;
        if (!this.method852(false)) {
            return false;
        } else if (arg0 == -18308) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1587.field4251.method3873(1, class276.method1819(var3, -29286));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
    public final boolean method854(int arg0) {
        field1606++;
        if (!this.method852(false)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1587.field4266.length; var3++) {
            int var4 = this.field1587.field4266[var3];
            if (this.field1614[var4] == null) {
                this.method859(var4, -128);
                if (this.field1614[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 < 33) {
            this.method860(100, -92);
        }
        return var2;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BI)V")
    private final void method855(byte arg0, int arg1) {
        field1616++;
        if (arg0 < -70) {
            this.field1617.method430((byte) -52, arg1);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    private final boolean method856(String arg0, int arg1, String arg2) {
        field1584++;
        if (!this.method852(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1587.field4251.method3873(arg1 ^ 0x1C1A, class276.method1819(var4, -29286));
        if (arg1 != 7195) {
            this.method856(null, -20, null);
        }
        if (this.method845(var6, (byte) -40)) {
            int var7 = this.field1587.field4256[var6].method3873(1, class276.method1819(var5, -29286));
            return this.method873(arg1 - 17694, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZZ)V")
    public final void method857(int arg0, boolean arg1, boolean arg2) {
        field1602++;
        if (arg0 != 0) {
            this.method844(null, null, -3);
        }
        if (!this.method852(false)) {
            return;
        }
        if (arg2) {
            this.field1587.field4261 = null;
            this.field1587.field4251 = null;
        }
        if (arg1) {
            this.field1587.field4263 = null;
            this.field1587.field4256 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
    public final void method858(int arg0) {
        field1608++;
        if (arg0 != 0) {
            this.method869((byte) -45, null);
        }
        if (this.field1614 != null) {
            for (int var2 = 0; var2 < this.field1614.length; var2++) {
                this.field1614[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
    private final void method859(int arg0, int arg1) {
        if (arg1 > -105) {
            this.field1622 = null;
        }
        if (this.field1613) {
            this.field1614[arg0] = this.field1617.method428(arg0, (byte) 12);
        } else {
            this.field1614[arg0] = class727.method4021(this.field1617.method428(arg0, (byte) 73), false, (byte) 123);
        }
        field1623++;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(II)I")
    public final int method860(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method842(-61);
        }
        field1603++;
        return this.method845(arg1, (byte) -40) ? this.field1587.field4252[arg1] : 0;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(BI)Z")
    public final boolean method861(byte arg0, int arg1) {
        field1590++;
        if (!this.method845(arg1, (byte) -40)) {
            return false;
        } else if (this.field1614[arg1] == null) {
            this.method859(arg1, -124);
            if (this.field1614[arg1] == null) {
                if (arg0 > -112) {
                    this.field1592 = -26;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method862(String arg0, boolean arg1) {
        field1621++;
        if (arg1 && this.method852(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1587.field4251.method3873(1, class276.method1819(var3, -29286));
            this.method855((byte) -86, var4);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)[B")
    public final byte[] method863(int arg0, int arg1, int arg2) {
        if (arg0 != -1860) {
            this.field1622 = null;
        }
        field1609++;
        return this.method846(arg1, arg2, arg0 ^ 0xFFFFF8BE, null);
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(II)V")
    public final void method864(int arg0, int arg1) {
        field1585++;
        if (arg1 > -9) {
            this.method847(-111, (byte) -98, null, -71);
        }
        if (this.method845(arg0, (byte) -40) && this.field1622 != null) {
            this.field1622[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V")
    public final void method865(byte arg0) {
        if (this.field1622 != null) {
            for (int var2 = 0; var2 < this.field1622.length; var2++) {
                this.field1622[var2] = null;
            }
        }
        int var3 = 52 % ((-arg0 - 46) / 62);
        field1618++;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method866(int arg0, String arg1) {
        field1594++;
        if (!this.method852(false)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1587.field4251.method3873(arg0 - 99, class276.method1819(var3, -29286));
        if (arg0 != 100) {
            field1628 = 0.37849286F;
        }
        return this.method861((byte) -120, var4);
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)I")
    public final int method867(int arg0) {
        field1595++;
        if (arg0 == -1) {
            return this.method852(false) ? this.field1587.field4252.length : -1;
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(BI)[B")
    public final byte[] method868(byte arg0, int arg1) {
        field1588++;
        if (!this.method852(false)) {
            return null;
        } else if (this.field1587.field4252.length == 1) {
            return this.method863(arg0 ^ 0xFFFFF8F5, 0, arg1);
        } else if (this.method845(arg1, (byte) -40)) {
            if (arg0 != 73) {
                this.field1622 = null;
            }
            if (this.field1587.field4252[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method863(arg0 ^ 0xFFFFF8F5, arg1, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method869(byte arg0, String arg1) {
        field1589++;
        int var3 = this.method870("", arg0 + 74);
        if (var3 == -1) {
            return arg0 == -74 ? this.method856(arg1, 7195, "") : false;
        } else {
            return this.method856("", 7195, arg1);
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method870(String arg0, int arg1) {
        if (arg1 != 0) {
            return 113;
        }
        field1612++;
        if (this.method852(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1587.field4251.method3873(1, class276.method1819(var3, -29286));
            return this.method845(var4, (byte) -40) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(III)Z")
    private final boolean method871(int arg0, int arg1, int arg2) {
        field1620++;
        if (!this.method852(false)) {
            return false;
        } else if (arg2 >= arg1 && arg0 >= 0 && arg2 < this.field1587.field4252.length && arg0 < this.field1587.field4252[arg2]) {
            return true;
        } else if (class539.field7453) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(II)I")
    private final int method872(int arg0, int arg1) {
        if (arg0 != 0) {
            return -117;
        }
        field1611++;
        if (this.method845(arg1, (byte) -40)) {
            return this.field1614[arg1] == null ? this.field1617.method434(arg1, arg0 - 22197) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(III)Z")
    public final boolean method873(int arg0, int arg1, int arg2) {
        field1596++;
        if (!this.method871(arg2, 0, arg1)) {
            return false;
        } else if (this.field1622[arg1] != null && this.field1622[arg1][arg2] != null) {
            return true;
        } else if (arg0 != -10499) {
            return true;
        } else if (this.field1614[arg1] == null) {
            this.method859(arg1, -125);
            return this.field1614[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)Z")
    public final boolean method874(boolean arg0, int arg1) {
        field1619++;
        if (!this.method852(arg0)) {
            return false;
        } else if (this.field1587.field4252.length == 1) {
            return this.method873(-10499, 0, arg1);
        } else if (!this.method845(arg1, (byte) -40)) {
            return false;
        } else if (this.field1587.field4252[arg1] == 1) {
            return this.method873(-10499, arg1, 0);
        } else if (arg0) {
            return false;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method875(String arg0, String arg1, int arg2) {
        field1626++;
        if (!this.method852(false)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg2 > -18) {
            field1627 = 40;
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field1587.field4251.method3873(1, class276.method1819(var4, -29286));
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field1587.field4256[var6].method3873(1, class276.method1819(var5, -29286));
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IB)I")
    public final int method876(int arg0, byte arg1) {
        field1607++;
        if (!this.method852(false)) {
            return -1;
        }
        int var3 = this.field1587.field4251.method3873(1, arg0);
        if (this.method845(var3, (byte) -40)) {
            int var4 = -60 / ((arg1 + 4) / 56);
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lci;ZI)V")
    public class91(class451 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1617 = arg0;
        this.field1613 = arg1;
        this.field1592 = arg2;
    }
}
