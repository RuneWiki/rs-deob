import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class41 {

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lrb;")
    private class143 field547 = new class143(256);

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lrb;")
    private class143 field552 = new class143(256);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Llc;")
    private class270 field541;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Llc;")
    private class270 field544;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static final void method254(int arg0) {
        if (arg0 <= 90) {
            method255(28);
        }
        for (int var1 = -1; var1 < class103.field1791; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class162.field2518[var1];
            }
            class207 var6 = class92.field1475[var5];
            if (var6 != null && var6.field3755 > 0) {
                var6.field3755--;
                if (var6.field3755 == 0) {
                    var6.field3731 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class12.field135; var2++) {
            int var3 = class14.field159[var2];
            class12 var4 = class255.field3856[var3];
            if (var4 != null && var4.field3755 > 0) {
                var4.field3755--;
                if (var4.field3755 == 0) {
                    var4.field3731 = null;
                }
            }
        }
        field545++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)Lfi;")
    public static final class229 method255(int arg0) {
        class33.field407 = 0;
        if (arg0 == 8889) {
            field543++;
            return class43.method265(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB[II)Luk;")
    private final class105 method256(int arg0, byte arg1, int[] arg2, int arg3) {
        field550++;
        int var5 = arg0 ^ (arg3 << 4 & 0xFFFB | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class105 var9 = (class105) this.field552.method1073(-1, var7);
        if (arg1 <= 2) {
            return null;
        } else if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class178 var10 = class178.method1266(this.field544, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            class105 var11 = var10.method1264();
            this.field552.method1074((byte) 39, var11, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field1804.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[IBI)Luk;")
    private final class105 method257(int arg0, int[] arg1, byte arg2, int arg3) {
        int var5 = arg3 ^ (arg0 << 4 & 0xFFF8 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        field548++;
        class105 var9 = (class105) this.field552.method1073(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class67 var10 = (class67) this.field547.method1073(-1, var7);
            if (arg2 != -118) {
                return null;
            }
            if (var10 == null) {
                var10 = class67.method508(this.field541, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field547.method1074((byte) 39, var10, var7);
            }
            class105 var11 = var10.method510(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1781(5250);
                this.field552.method1074((byte) 39, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ldk;IBI)V")
    public static final void method258(class207 arg0, int arg1, byte arg2, int arg3) {
        if ((arg1 & 0x1) != 0) {
            int var4 = class92.field1488.method368(arg2 ^ 0xE1);
            int var5 = class92.field1488.method366(-16505);
            arg0.method1712(var4, class199.field2930, (byte) 123, var5);
            arg0.field3684 = class199.field2930 + 300;
            arg0.field3700 = class92.field1488.method377((byte) 25);
        }
        if (arg2 != -98) {
            method260(-96);
        }
        if ((arg1 & 0x2) != 0) {
            int var6 = class92.field1488.method331(arg2 ^ 0x5E);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class92.field1488.method366(-16505);
            class272.method1899(true, arg0, var7, var6);
        }
        field553++;
        if ((arg1 & 0x8) != 0) {
            int var8 = class92.field1488.method377((byte) 82);
            byte[] var9 = new byte[var8];
            class53 var10 = new class53(var9);
            class92.field1488.method370(var9, 0, 109, var8);
            class287.field4598[arg3] = var10;
            arg0.method1468(var10, -122);
        }
        if ((arg1 & 0x4) != 0) {
            arg0.field3659 = class92.field1488.method374((byte) 80);
            arg0.field3715 = class92.field1488.method331(-34);
        }
        if ((arg1 & 0x800) != 0) {
            int var11 = class92.field1488.method359(255);
            int[] var12 = new int[var11];
            int[] var13 = new int[var11];
            int[] var14 = new int[var11];
            for (int var15 = 0; var15 < var11; var15++) {
                int var16 = class92.field1488.method331(-62);
                if (var16 == 65535) {
                    var16 = -1;
                }
                var12[var15] = var16;
                var13[var15] = class92.field1488.method344((byte) -115);
                var14[var15] = class92.field1488.method327(65280);
            }
            class304.method2069(arg0, var14, var12, var13, -19443);
        }
        if ((arg1 & 0x10) != 0) {
            arg0.field3731 = class92.field1488.method326(88);
            if (arg0.field3731.charAt(0) == '~') {
                arg0.field3731 = arg0.field3731.substring(1);
                class258.method1777(-1, 2, arg0.method1469((byte) -4), arg0.field3731);
            } else if (class213.field3139 == arg0) {
                class258.method1777(-1, 2, arg0.method1469((byte) -4), arg0.field3731);
            }
            arg0.field3699 = 0;
            arg0.field3691 = 0;
            arg0.field3755 = 150;
        }
        if ((arg1 & 0x20) != 0) {
            int var17 = class92.field1488.method354(arg2 ^ 0x3A);
            int var18 = class92.field1488.method359(255);
            int var19 = class92.field1488.method344((byte) 14);
            int var20 = class92.field1488.field735;
            boolean var21 = (var17 & 0x8000) != 0;
            if (arg0.field3069 != null && arg0.field3063 != null) {
                long var22 = class143.method1064((byte) -80, arg0.field3069);
                boolean var24 = false;
                if (var18 <= 1) {
                    if (var21 || (!class284.field4567 || class291.field4630) && !class124.field2080) {
                        for (int var25 = 0; var25 < class47.field659; var25++) {
                            if (class203.field3007[var25] == var22) {
                                var24 = true;
                                break;
                            }
                        }
                    } else {
                        var24 = true;
                    }
                }
                if (!var24 && class146.field2349 == 0) {
                    class193.field2851.field735 = 0;
                    class92.field1488.method336((byte) -25, 0, var19, class193.field2851.field758);
                    class193.field2851.field735 = 0;
                    int var26 = -1;
                    String var28;
                    if (var21) {
                        var17 &= 0x7FFF;
                        class249 var27 = class200.method1411(true, class193.field2851);
                        var26 = var27.field3773;
                        var28 = var27.field3770.method697(5542, class193.field2851);
                    } else {
                        var28 = class10.method69(class188.method1346(false, class190.method1350(class193.field2851, arg2 + 14356)));
                    }
                    arg0.field3731 = var28.trim();
                    arg0.field3699 = var17 >> 8;
                    arg0.field3755 = 150;
                    arg0.field3691 = var17 & 0xFF;
                    if (var18 == 2) {
                        class194.method1376("<img=1>" + arg0.method1469((byte) -4), var21 ? 17 : 1, (byte) 38, (String) null, var26, var28);
                    } else if (var18 == 1) {
                        class194.method1376("<img=0>" + arg0.method1469((byte) -4), var21 ? 17 : 1, (byte) 38, (String) null, var26, var28);
                    } else {
                        class194.method1376(arg0.method1469((byte) -4), var21 ? 17 : 2, (byte) 38, (String) null, var26, var28);
                    }
                }
            }
            class92.field1488.field735 = var20 + var19;
        }
        if ((arg1 & 0x100) != 0) {
            int var29 = class92.field1488.method374((byte) 80);
            if (var29 == 65535) {
                var29 = -1;
            }
            boolean var30 = true;
            int var31 = class92.field1488.method340(-124);
            if (var29 != -1 && arg0.field3718 != -1 && class232.method1609((byte) -32, class152.method1126(var29, (byte) -1).field1944).field1214 < class232.method1609((byte) -32, class152.method1126(arg0.field3718, (byte) -1).field1944).field1214) {
                var30 = false;
            }
            if (var30) {
                arg0.field3663 = var31 >> 16;
                arg0.field3672 = 0;
                arg0.field3718 = var29;
                arg0.field3688 = 1;
                arg0.field3706 = (var31 & 0xFFFF) + class199.field2930;
                arg0.field3689 = 0;
                if (arg0.field3706 > class199.field2930) {
                    arg0.field3672 = -1;
                }
                if (arg0.field3718 != -1 && class199.field2930 == arg0.field3706) {
                    int var32 = class152.method1126(arg0.field3718, (byte) -1).field1944;
                    if (var32 != -1) {
                        class76 var33 = class232.method1609((byte) -32, var32);
                        if (var33 != null && var33.field1191 != null) {
                            class32.method208(arg0.field3660, 0, true, class213.field3139 == arg0, arg0.field3753, var33);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x40) != 0) {
            arg0.field3679 = class92.field1488.method354(-92);
            if (arg0.field3679 == 65535) {
                arg0.field3679 = -1;
            }
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field3667 = class92.field1488.method359(arg2 ^ 0xFFFFFF61);
            arg0.field3754 = class92.field1488.method366(-16505);
            arg0.field3744 = class92.field1488.method344((byte) -108);
            arg0.field3725 = class92.field1488.method359(255);
            arg0.field3682 = class92.field1488.method327(65280) + class199.field2930;
            arg0.field3658 = class92.field1488.method327(65280) + class199.field2930;
            arg0.field3671 = class92.field1488.method377((byte) 113);
            arg0.field3710 = 1;
            arg0.field3695 = 0;
        }
        if ((arg1 & 0x400) != 0) {
            int var34 = class92.field1488.method368(arg2 ^ 0xE1);
            int var35 = class92.field1488.method366(-16505);
            arg0.method1712(var34, class199.field2930, (byte) 123, var35);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIII)I")
    public static final int method259(int arg0, int arg1, int arg2, int arg3) {
        field551++;
        int var4 = arg2 / arg1;
        int var5 = arg1 - 1 & arg2;
        if (arg0 != 65531) {
            return -112;
        }
        int var6 = arg1 - 1 & arg3;
        int var7 = arg3 / arg1;
        int var8 = class107.method827((byte) -4, var4, var7);
        int var9 = class107.method827((byte) -4, var4 + 1, var7);
        int var10 = class107.method827((byte) -4, var4, var7 + 1);
        int var11 = class107.method827((byte) -4, var4 + 1, var7 + 1);
        int var12 = class158.method1154(arg1, var9, var5, arg0 ^ 0x986D8FBA, var8);
        int var13 = class158.method1154(arg1, var11, var5, -1737658303, var10);
        return class158.method1154(arg1, var13, var6, -1737658303, var12);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    public static final void method260(int arg0) {
        field549++;
        class17.field175.method1422((byte) 117);
        if (arg0 != 0) {
            method255(-43);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B[II)Luk;")
    public final class105 method261(byte arg0, int[] arg1, int arg2) {
        field554++;
        if (this.field544.method1880(-3333) == 1) {
            return this.method256(arg2, (byte) 60, arg1, 0);
        } else if (this.field544.method1891(arg2, arg0 ^ 0xFFFFFFEF) == 1) {
            return this.method256(0, (byte) 110, arg1, arg2);
        } else {
            if (arg0 != 70) {
                this.field541 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ[I)Luk;")
    public final class105 method262(int arg0, boolean arg1, int[] arg2) {
        field546++;
        if (this.field541.method1880(-3333) == 1) {
            return this.method257(0, arg2, (byte) -118, arg0);
        } else if (this.field541.method1891(arg0, -101) == 1) {
            return this.method257(arg0, arg2, (byte) -118, 0);
        } else {
            if (!arg1) {
                method254(78);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Llc;Llc;)V")
    public class41(class270 arg0, class270 arg1) {
        this.field541 = arg1;
        this.field544 = arg0;
    }
}
