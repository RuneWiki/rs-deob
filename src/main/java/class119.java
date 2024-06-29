import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class119 {

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[B")
    private byte[] field1655;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    private int[] field1653;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[I")
    private int[] field1652;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lvh;")
    public static class62 field1648 = new class62(100);

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
    public static int[] field1656 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "S")
    public static short field1650 = 320;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lvh;")
    public static class62 field1659 = new class62(64);

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field1662 = 0;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lnk;")
    public static class16 field1651;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[I")
    public static int[] field1664;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[[B")
    public static byte[][] field1658;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lnk;Lnk;ILnk;)V", line = 7)
    public static final void method772(class16 arg0, class16 arg1, int arg2, class16 arg3) {
        class208.field3150 = arg3;
        class215.field3261 = arg1;
        field1660++;
        if (arg2 == 15099) {
            class139.field2079 = arg0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 27)
    public static void method773(int arg0) {
        field1659 = null;
        if (arg0 != 11245) {
            field1663 = -24;
        }
        field1664 = null;
        field1651 = null;
        field1656 = null;
        field1648 = null;
        field1658 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[BIII[B)I", line = 43)
    public final int method774(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field1649++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg2 + arg4;
        int var8 = arg3;
        int var9 = arg0;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field1652[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1652[var8]) < 0) {
                arg5[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1652[var8];
            }
            int var12;
            if ((var12 = this.field1652[var8]) < 0) {
                arg5[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1652[var8];
            }
            int var13;
            if ((var13 = this.field1652[var8]) < 0) {
                arg5[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1652[var8];
            }
            int var14;
            if ((var14 = this.field1652[var8]) < 0) {
                arg5[arg2++] = (byte) (~var14);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1652[var8];
            }
            int var15;
            if ((var15 = this.field1652[var8]) < 0) {
                arg5[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1652[var8];
            }
            int var16;
            if ((var16 = this.field1652[var8]) < 0) {
                arg5[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1652[var8];
            }
            int var17;
            if ((var17 = this.field1652[var8]) < 0) {
                arg5[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1652[var8];
            }
            int var18;
            if ((var18 = this.field1652[var8]) < 0) {
                arg5[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 186)
    public static final void method775(int arg0, int arg1) {
        class196 var2 = class194.field2947[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class196 var4 = class194.field2947[var3][arg0][arg1] = class194.field2947[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2991--;
                for (int var5 = 0; var5 < var4.field2979; var5++) {
                    class44 var6 = var4.field2998[var5];
                    if ((var6.field502 >> 29 & 0x3L) == 2L && var6.field504 == arg0 && var6.field497 == arg1) {
                        var6.field510--;
                    }
                }
            }
        }
        if (class194.field2947[0][arg0][arg1] == null) {
            class194.field2947[0][arg0][arg1] = new class196(0, arg0, arg1);
        }
        class194.field2947[0][arg0][arg1].field2990 = var2;
        class194.field2947[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BI[BIII)I", line = 225)
    public final int method776(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 + arg5;
        field1661++;
        int var8 = arg1;
        int var9 = arg4 << 3;
        while (arg5 < var7) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field1653[var10];
            byte var12 = this.field1655[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            var9 += var12;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class77.method492(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILvj;ILvj;Z)I", line = 303)
    public static final int method777(int arg0, class122 arg1, int arg2, class122 arg3, boolean arg4) {
        field1654++;
        if (arg2 == 1) {
            int var5 = arg1.field1505;
            int var6 = arg3.field1505;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class280.method2008(class234.field3567, -1, arg3.method782((byte) -122).field4530, arg1.method782((byte) -113).field4530);
        } else if (arg0 == arg2) {
            if (arg1.field1684.equals("-")) {
                if (arg3.field1684.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field1684.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class280.method2008(class234.field3567, -1, arg3.field1684, arg1.field1684);
            }
        } else if (arg2 == 4) {
            return arg1.method707(arg0 ^ 0x79) ? (arg3.method707(arg0 + 29) ? 0 : 1) : (arg3.method707(arg0 - 56) ? -1 : 0);
        } else if (arg2 == 5) {
            return arg1.method704(0) ? (arg3.method704(arg0 - 3) ? 0 : 1) : (arg3.method704(0) ? -1 : 0);
        } else if (arg2 == 6) {
            return arg1.method705(0) ? (arg3.method705(0) ? 0 : 1) : (arg3.method705(0) ? -1 : 0);
        } else if (arg2 == 7) {
            return arg1.method708(true) ? (arg3.method708(true) ? 0 : 1) : (arg3.method708(true) ? -1 : 0);
        } else {
            return arg1.field1678 - arg3.field1678;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V", line = 371)
    public class119(byte[] arg0) {
        int var2 = arg0.length;
        this.field1655 = arg0;
        this.field1653 = new int[var2];
        int[] var3 = new int[33];
        this.field1652 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1653[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class77.method492(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1652[var14] == 0) {
                            this.field1652[var14] = var4;
                        }
                        var14 = this.field1652[var14];
                    }
                    if (this.field1652.length <= var14) {
                        int[] var17 = new int[this.field1652.length * 2];
                        for (int var18 = 0; var18 < this.field1652.length; var18++) {
                            var17[var18] = this.field1652[var18];
                        }
                        this.field1652 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field1652[var14] = ~var5;
            }
        }
    }
}
