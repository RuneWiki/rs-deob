import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class121 {

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Llh;")
    private class188 field1972 = null;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "Z")
    private boolean field2005;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Z")
    private boolean field1987;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lok;")
    private class89 field1971;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Le;")
    public static class191 field1973 = class54.method368("::", 2047);

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Le;")
    public static class191 field1983 = class54.method368("Spieler", 2047);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[I")
    public static int[] field1965 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    private int field1980;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[Ljava/lang/Object;")
    private Object[] field1981;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1969;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Z")
    public final boolean method794(byte arg0) {
        field2004++;
        if (!this.method795(2)) {
            return false;
        }
        if (arg0 < 11) {
            this.field1969 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1972.field3319.length; var3++) {
            int var4 = this.field1972.field3319[var3];
            if (this.field1981[var4] == null) {
                this.method815(var4, -128);
                if (this.field1981[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Z")
    private final boolean method795(int arg0) {
        field2001++;
        if (this.field1972 == null) {
            this.field1972 = this.field1971.method540(-125);
            if (this.field1972 == null) {
                return false;
            }
            this.field1981 = new Object[this.field1972.field3316];
            this.field1969 = new Object[this.field1972.field3316][];
        }
        if (arg0 != 2) {
            this.field1987 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIILng;)Z")
    public static final boolean method796(boolean arg0, int arg1, int arg2, class121 arg3) {
        field2000++;
        byte[] var4 = arg3.method826((byte) 35, arg1, arg2);
        if (var4 == null) {
            return false;
        }
        if (!arg0) {
            method827((byte) -28, 5, (class121) null);
        }
        class114.method726((byte) 111, var4);
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)Z")
    public final boolean method797(int arg0, byte arg1) {
        field1990++;
        if (!this.method814(-75, arg0)) {
            return false;
        } else if (this.field1981[arg0] == null) {
            this.method815(arg0, arg1 ^ 0xFFFFFFE2);
            if (this.field1981[arg0] == null) {
                if (arg1 != 105) {
                    method827((byte) -61, 83, (class121) null);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)I")
    public final int method798(int arg0) {
        if (arg0 >= -26) {
            this.method816(69, (class191) null);
        }
        field1999++;
        return this.method795(2) ? this.field1972.field3300.length : -1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[I)Z")
    private final boolean method799(int arg0, int arg1, int[] arg2) {
        field1967++;
        if (!this.method814(-85, arg0)) {
            return false;
        } else if (this.field1981[arg0] == null) {
            return false;
        } else {
            int var4 = this.field1972.field3308[arg0];
            int[] var5 = this.field1972.field3313[arg0];
            if (this.field1969[arg0] == null) {
                this.field1969[arg0] = new Object[this.field1972.field3300[arg0]];
            }
            boolean var6 = true;
            Object[] var7 = this.field1969[arg0];
            for (int var8 = arg1; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var10 = class119.method788(this.field1981[arg0], false, false);
            } else {
                var10 = class119.method788(this.field1981[arg0], true, false);
                class225 var11 = new class225(var10);
                var11.method1578(arg2, var11.field3995.length, 5, arg1 ^ 0x40);
            }
            byte[] var12;
            try {
                var12 = class102.method642(var10, (byte) -52);
            } catch (RuntimeException var31) {
                throw class261.method1788(var31, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + class38.method259(var10.length, -35, var10) + "," + class38.method259(var10.length - 2, 90, var10) + "," + this.field1972.field3310[arg0] + "," + this.field1980);
            }
            if (this.field1987) {
                this.field1981[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int[] var15 = new int[var4];
                int var32 = var14 - 1;
                int var16 = var12[var32] & 0xFF;
                int var17 = var32 - var4 * var16 * 4;
                class225 var18 = new class225(var12);
                var18.field3996 = var17;
                for (int var19 = 0; var19 < var16; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var18.method1562(21705);
                        var15[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var15[var23]];
                    var15[var23] = 0;
                }
                var18.field3996 = var17;
                int var24 = 0;
                for (int var25 = 0; var25 < var16; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var18.method1562(21705);
                        class58.method390(var12, var24, var22[var27], var15[var27], var26);
                        var24 += var26;
                        var15[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field2005) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class266.method1828(var22[var28], (byte) -13, false);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field2005) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class266.method1828(var12, (byte) -13, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZB)V")
    public final void method800(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 < 33) {
            return;
        }
        field1974++;
        if (!this.method795(2)) {
            return;
        }
        if (arg0) {
            this.field1972.field3296 = null;
            this.field1972.field3311 = null;
        }
        if (arg1) {
            this.field1972.field3303 = null;
            this.field1972.field3321 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Z")
    public final boolean method801(int arg0, int arg1, int arg2) {
        field2007++;
        if (arg2 != 0) {
            this.field1969 = null;
        }
        if (!this.method809(arg0, arg2 - 22797, arg1)) {
            return false;
        } else if (this.field1969[arg1] != null && this.field1969[arg1][arg0] != null) {
            return true;
        } else if (this.field1981[arg1] == null) {
            this.method815(arg1, -101);
            return this.field1981[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Le;BLe;)[B")
    public final byte[] method802(class191 arg0, byte arg1, class191 arg2) {
        field2002++;
        if (!this.method795(2)) {
            return null;
        }
        class191 var4 = arg0.method1324(0);
        class191 var5 = arg2.method1324(0);
        int var6 = this.field1972.field3321.method983((byte) -119, var4.method1347(126));
        if (this.method814(-46, var6)) {
            int var7 = 41 % ((arg1 + 14) / 61);
            int var8 = this.field1972.field3296[var6].method983((byte) -119, var5.method1347(111));
            return this.method826((byte) 35, var6, var8);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    private final void method803(int arg0, int arg1) {
        this.field1971.method536(arg1, -89);
        int var3 = -40 % ((arg0 + 35) / 44);
        field1970++;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IB)[B")
    public final byte[] method804(int arg0, byte arg1) {
        field1996++;
        if (arg1 != 124) {
            this.field1987 = false;
        }
        if (!this.method795(2)) {
            return null;
        } else if (this.field1972.field3300.length == 1) {
            return this.method826((byte) 35, 0, arg0);
        } else if (!this.method814(-19, arg0)) {
            return null;
        } else if (this.field1972.field3300[arg0] == 1) {
            return this.method826((byte) 35, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)I")
    public final int method805(byte arg0, int arg1) {
        if (arg0 < 11) {
            field1965 = null;
        }
        field1994++;
        return this.method814(-97, arg1) ? this.field1972.field3300[arg1] : 0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)[B")
    public final byte[] method806(int arg0, int arg1, byte arg2) {
        field1995++;
        if (!this.method809(arg0, -22797, arg1)) {
            return null;
        }
        if (arg2 != 115) {
            this.method808(-46, -1);
        }
        if (this.field1969[arg1] == null || this.field1969[arg1][arg0] == null) {
            boolean var4 = this.method799(arg1, 0, (int[]) null);
            if (!var4) {
                this.method815(arg1, -99);
                boolean var5 = this.method799(arg1, 0, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        return class119.method788(this.field1969[arg1][arg0], false, false);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public static final void method807(int arg0) {
        field1998++;
        if (class49.field894 == 0 || class49.field894 == 5) {
            return;
        }
        try {
            if ((++class209.field3703) > 2000) {
                if (class263.field4670 != null) {
                    class263.field4670.method174(-85);
                    class263.field4670 = null;
                }
                if (class210.field3732 >= 1) {
                    class49.field894 = 0;
                    class240.field4263 = -5;
                    return;
                }
                if (class261.field4624 == class205.field3640) {
                    class205.field3640 = class181.field3123;
                } else {
                    class205.field3640 = class261.field4624;
                }
                class210.field3732++;
                class49.field894 = 1;
                class209.field3703 = 0;
            }
            if (class49.field894 == 1) {
                class143.field2386 = class167.field2820.method1721((byte) -96, class95.field1548, class205.field3640);
                class49.field894 = 2;
            }
            if (class49.field894 == 2) {
                if (class143.field2386.field1356 == 2) {
                    throw new IOException();
                }
                if (class143.field2386.field1356 != 1) {
                    return;
                }
                class263.field4670 = new class24((Socket) class143.field2386.field1360, class167.field2820);
                class143.field2386 = null;
                long var1 = class199.field3564 = class26.field381.method1352(65);
                class53.field963.field3996 = 0;
                class53.field963.method1613(14, 21);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class53.field963.method1613(var3, 21);
                class263.field4670.method173((byte) -111, 2, class53.field963.field3995, 0);
                if (class199.field3539 != null) {
                    class199.field3539.method337((byte) -107);
                }
                if (class93.field1527 != null) {
                    class93.field1527.method337((byte) -107);
                }
                int var4 = class263.field4670.method171(-27105);
                if (class199.field3539 != null) {
                    class199.field3539.method337((byte) -107);
                }
                if (class93.field1527 != null) {
                    class93.field1527.method337((byte) -107);
                }
                if (var4 != 0) {
                    class49.field894 = 0;
                    class240.field4263 = var4;
                    class263.field4670.method174(85);
                    class263.field4670 = null;
                    return;
                }
                class49.field894 = 3;
            }
            if (class49.field894 == 3) {
                if (class263.field4670.method177((byte) 124) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class263.field4670.method175(8, class107.field1776.field3995, (byte) -28, 0);
                class107.field1776.field3996 = 0;
                class33.field632 = class107.field1776.method1605(arg0 - 2033532388);
                var5[3] = (int) class33.field632;
                var5[2] = (int) (class33.field632 >> 32);
                class53.field963.field3996 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class53.field963.method1613(10, 21);
                class53.field963.method1576(30289, var5[0]);
                class53.field963.method1576(30289, var5[1]);
                class53.field963.method1576(30289, var5[2]);
                class53.field963.method1576(30289, var5[3]);
                class53.field963.method1589(class26.field381.method1352(65), false);
                class53.field963.method1586(class26.field375, (byte) -117);
                class53.field963.method1569(0, class184.field3167, class266.field4700);
                class255.field4527.field3996 = 0;
                if (class47.field836 == 40) {
                    class255.field4527.method1613(18, 21);
                } else {
                    class255.field4527.method1613(16, 21);
                }
                class255.field4527.method1608(class53.field963.field3996 + class33.method230(29546, class198.field3528) + 153, false);
                class255.field4527.method1576(30289, 513);
                class255.field4527.method1613(class233.field4154, arg0 ^ 0x11);
                class255.field4527.method1613(0, arg0 + 17);
                class255.field4527.method1613(class149.method1017(0), 21);
                class255.field4527.method1608(class200.field3584, false);
                class255.field4527.method1608(class190.field3337, false);
                class8.method64((byte) 93, class255.field4527);
                class255.field4527.method1586(class198.field3528, (byte) -117);
                class255.field4527.method1576(30289, class235.field4190);
                class255.field4527.method1576(arg0 ^ 0x7655, class142.method935((byte) -100));
                class30.field427 = true;
                class255.field4527.method1608(class92.field1509, false);
                class255.field4527.method1576(30289, class27.field396.field1980);
                class255.field4527.method1576(30289, class68.field1188.field1980);
                class255.field4527.method1576(30289, class191.field3409.field1980);
                class255.field4527.method1576(30289, class37.field683.field1980);
                class255.field4527.method1576(arg0 + 30285, class137.field2303.field1980);
                class255.field4527.method1576(arg0 ^ 0x7655, class273.field4834.field1980);
                class255.field4527.method1576(30289, class102.field1653.field1980);
                class255.field4527.method1576(arg0 ^ 0x7655, class200.field3581.field1980);
                class255.field4527.method1576(30289, class215.field3792.field1980);
                class255.field4527.method1576(arg0 ^ 0x7655, class156.field2664.field1980);
                class255.field4527.method1576(30289, class245.field4359.field1980);
                class255.field4527.method1576(30289, class28.field409.field1980);
                class255.field4527.method1576(30289, class152.field2604.field1980);
                class255.field4527.method1576(30289, class256.field4545.field1980);
                class255.field4527.method1576(30289, class114.field1891.field1980);
                class255.field4527.method1576(30289, class168.field2827.field1980);
                class255.field4527.method1576(30289, class143.field2383.field1980);
                class255.field4527.method1576(arg0 + 30285, client.field1731.field1980);
                class255.field4527.method1576(30289, class128.field2128.field1980);
                class255.field4527.method1576(30289, class18.field238.field1980);
                class255.field4527.method1576(30289, class261.field4626.field1980);
                class255.field4527.method1576(30289, class166.field2802.field1980);
                class255.field4527.method1576(30289, class135.field2274.field1980);
                class255.field4527.method1576(arg0 ^ 0x7655, class190.field3332.field1980);
                class255.field4527.method1576(arg0 + 30285, class97.field1565.field1980);
                class255.field4527.method1576(30289, class54.field1011.field1980);
                class255.field4527.method1576(arg0 ^ 0x7655, class253.field4491.field1980);
                class255.field4527.method1566(class53.field963.field3995, 3, class53.field963.field3996, 0);
                class263.field4670.method173((byte) -32, class255.field4527.field3996, class255.field4527.field3995, 0);
                class53.field963.method1098(-112, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class107.field1776.method1098(-124, var5);
                class49.field894 = 4;
            }
            if (arg0 != 4) {
                field1983 = null;
            }
            if (class49.field894 == 4) {
                if (class263.field4670.method177((byte) 126) < 1) {
                    return;
                }
                int var7 = class263.field4670.method171(-27105);
                if (var7 == 21) {
                    class49.field894 = 7;
                } else if (var7 == 29) {
                    class49.field894 = 10;
                } else if (var7 == 1) {
                    class49.field894 = 5;
                    class240.field4263 = var7;
                    return;
                } else if (var7 == 2) {
                    class49.field894 = 8;
                } else if (var7 == 15) {
                    class49.field894 = 0;
                    class240.field4263 = var7;
                    return;
                } else if (var7 == 23 && class210.field3732 < 1) {
                    class49.field894 = 1;
                    class210.field3732++;
                    class209.field3703 = 0;
                    class263.field4670.method174(73);
                    class263.field4670 = null;
                    return;
                } else {
                    class49.field894 = 0;
                    class240.field4263 = var7;
                    class263.field4670.method174(arg0 ^ 0x48);
                    class263.field4670 = null;
                    return;
                }
            }
            if (class49.field894 == 6) {
                class53.field963.field3996 = 0;
                class53.field963.method1096(17, 0);
                class263.field4670.method173((byte) 123, class53.field963.field3996, class53.field963.field3995, 0);
                class49.field894 = 4;
            } else if (class49.field894 == 7) {
                if (class263.field4670.method177((byte) 126) >= 1) {
                    class100.field1602 = class263.field4670.method171(arg0 - 27109) * 60 + 180;
                    class240.field4263 = 21;
                    class49.field894 = 0;
                    class263.field4670.method174(arg0 - 58);
                    class263.field4670 = null;
                }
            } else if (class49.field894 != 10) {
                if (class49.field894 == 8) {
                    if (class263.field4670.method177((byte) 123) < 11) {
                        return;
                    }
                    class263.field4670.method175(11, class107.field1776.field3995, (byte) -128, 0);
                    class107.field1776.field3996 = 0;
                    class227.field4084 = class107.field1776.method1580(-2);
                    class232.field4152 = class107.field1776.method1580(arg0 - 75);
                    class42.field739 = class107.field1776.method1580(-72);
                    if (class42.field739 == 1) {
                        try {
                            class42.field741.method1357(false, class167.field2820.field4379);
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class172.field2888.method1357(false, class167.field2820.field4379);
                        } catch (Throwable var8) {
                        }
                    }
                    class39.field706 = class107.field1776.method1580(-17);
                    class236.field4201 = class107.field1776.method1580(-107) == 1;
                    class35.field641 = class107.field1776.method1593(true);
                    class180.field3090 = class107.field1776.method1580(arg0 - 15);
                    class18.field235 = class107.field1776.method1095(0);
                    class253.field4486 = class107.field1776.method1593(true);
                    class49.field894 = 9;
                }
                if (class49.field894 == 9 && class263.field4670.method177((byte) 126) >= class253.field4486) {
                    class107.field1776.field3996 = 0;
                    class263.field4670.method175(class253.field4486, class107.field1776.field3995, (byte) 67, 0);
                    class240.field4263 = 2;
                    class49.field894 = 0;
                    class162.method1094(0);
                    class14.field165 = -1;
                    class65.method430(false, (byte) 4);
                    class18.field235 = -1;
                }
            } else if (class263.field4670.method177((byte) 126) >= 1) {
                class209.field3713 = class263.field4670.method171(-27105);
                class240.field4263 = 29;
                class49.field894 = 0;
                class263.field4670.method174(97);
                class263.field4670 = null;
            }
        } catch (IOException var10) {
            if (class263.field4670 != null) {
                class263.field4670.method174(78);
                class263.field4670 = null;
            }
            if (class210.field3732 < 1) {
                class209.field3703 = 0;
                class210.field3732++;
                class49.field894 = 1;
                if (class261.field4624 == class205.field3640) {
                    class205.field3640 = class181.field3123;
                } else {
                    class205.field3640 = class261.field4624;
                }
            } else {
                class240.field4263 = -4;
                class49.field894 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)I")
    private final int method808(int arg0, int arg1) {
        field1985++;
        if (arg1 > -67) {
            return 4;
        } else if (this.method814(112, arg0)) {
            return this.field1981[arg0] == null ? this.field1971.method539(-421, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)Z")
    private final boolean method809(int arg0, int arg1, int arg2) {
        field1982++;
        if (!this.method795(2)) {
            return false;
        }
        if (arg1 != -22797) {
            method807(-100);
        }
        if (arg2 >= 0 && arg0 >= 0 && this.field1972.field3300.length > arg2 && this.field1972.field3300[arg2] > arg0) {
            return true;
        } else if (class256.field4544) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Le;B)Z")
    public final boolean method810(class191 arg0, byte arg1) {
        field1992++;
        int var3 = 108 % ((34 - arg1) / 60);
        if (this.method795(2)) {
            class191 var4 = arg0.method1324(0);
            int var5 = this.field1972.field3321.method983((byte) -119, var4.method1347(109));
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)[I")
    public final int[] method811(int arg0, int arg1) {
        field1968++;
        if (!this.method814(-42, arg0)) {
            return null;
        } else if (arg1 == 0) {
            int[] var3 = this.field1972.field3313[arg0];
            if (var3 == null) {
                var3 = new int[this.field1972.field3308[arg0]];
                int var4 = 0;
                while (var4 < var3.length) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
    public static final void method812(int arg0, boolean arg1) {
        if ((class175.field2946.field3003 >> 7) == class146.field2459 && (class175.field2946.field2972 >> 7) == class22.field317) {
            class146.field2459 = 0;
        }
        int var2 = class260.field4586;
        field1986++;
        if (arg1) {
            var2 = 1;
        }
        int var3 = -79 / ((-arg0 - 12) / 40);
        for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class76 var7;
            if (arg1) {
                var5 = 8791798054912L;
                var7 = class175.field2946;
            } else {
                var5 = (long) class73.field1271[var4] << 32;
                var7 = class245.field4357[class73.field1271[var4]];
            }
            if (var7 != null && var7.method489(50)) {
                int var8 = var7.field3003 >> 7;
                int var9 = var7.field2972 >> 7;
                var7.field1323 = false;
                if ((class41.field729 && class260.field4586 > 200 || class260.field4586 > 50) && !arg1 && var7.field2977 == var7.field2974) {
                    var7.field1323 = true;
                }
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var7.field1292 == null || var7.field1293 > class135.field2267 || var7.field1329 <= class135.field2267) {
                        if (var7.method490((byte) -4) == 1 && (var7.field3003 & 0x7F) == 64 && (var7.field2972 & 0x7F) == 64) {
                            if (class39.field707[var8][var9] == class182.field3131) {
                                continue;
                            }
                            class39.field707[var8][var9] = class182.field3131;
                        }
                        var7.field2949 = class222.method1546(class261.field4598, var7.field3003, var7.field2972, 247425607);
                        class165.method1110(class261.field4598, var7.field3003, var7.field2972, var7.field2949, (var7.method490((byte) -4) - 1) * 64 + 60, var7, var7.field2999, var5, var7.field2978);
                    } else {
                        var7.field1323 = false;
                        var7.field2949 = class222.method1546(class261.field4598, var7.field3003, var7.field2972, 247425607);
                        class114.method727(class261.field4598, var7.field3003, var7.field2972, var7.field2949, var7, var7.field2999, var5, var7.field1325, var7.field1321, var7.field1320, var7.field1316);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Le;BLe;)Z")
    public final boolean method813(class191 arg0, byte arg1, class191 arg2) {
        field1997++;
        if (!this.method795(2)) {
            return false;
        }
        if (arg1 != 85) {
            method827((byte) 36, -20, (class121) null);
        }
        class191 var4 = arg2.method1324(0);
        class191 var5 = arg0.method1324(arg1 ^ 0x55);
        int var6 = this.field1972.field3321.method983((byte) -119, var4.method1347(115));
        if (this.method814(120, var6)) {
            int var7 = this.field1972.field3296[var6].method983((byte) -119, var5.method1347(125));
            return this.method801(var7, var6, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(II)Z")
    private final boolean method814(int arg0, int arg1) {
        int var3 = -99 / ((arg0 - 49) / 62);
        field2008++;
        if (!this.method795(2)) {
            return false;
        } else if (arg1 >= 0 && this.field1972.field3300.length > arg1 && this.field1972.field3300[arg1] != 0) {
            return true;
        } else if (class256.field4544) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(II)V")
    private final void method815(int arg0, int arg1) {
        if (this.field1987) {
            this.field1981[arg0] = this.field1971.method537(-92, arg0);
        } else {
            this.field1981[arg0] = class266.method1828(this.field1971.method537(-97, arg0), (byte) -13, false);
        }
        field1993++;
        if (arg1 >= -75) {
            field1973 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILe;)V")
    public final void method816(int arg0, class191 arg1) {
        field1979++;
        if (arg0 == -761841721 && this.method795(arg0 ^ 0xD29737C5)) {
            class191 var3 = arg1.method1324(0);
            int var4 = this.field1972.field3321.method983((byte) -119, var3.method1347(arg0 + 761841848));
            this.method803(-112, var4);
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)I")
    public final int method817(int arg0) {
        if (arg0 < 92) {
            this.method799(125, 54, (int[]) null);
        }
        field1966++;
        if (!this.method795(2)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1981.length; var4++) {
            if (this.field1972.field3308[var4] > 0) {
                var3 += this.method808(var4, -68);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(II)Z")
    public final boolean method818(int arg0, int arg1) {
        field1989++;
        if (!this.method795(arg0 ^ 0x2)) {
            return false;
        } else if (this.field1972.field3300.length == 1) {
            return this.method801(arg1, 0, 0);
        } else if (!this.method814(-20, arg1)) {
            return false;
        } else if (this.field1972.field3300[arg1] == 1) {
            return this.method801(0, arg1, 0);
        } else {
            if (arg0 != 0) {
                method827((byte) 21, -74, (class121) null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(II)V")
    public final void method819(int arg0, int arg1) {
        if (arg1 > -104) {
            this.field1971 = null;
        }
        field1984++;
        if (this.method814(-17, arg0) && this.field1969 != null) {
            this.field1969[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLe;)I")
    public final int method820(byte arg0, class191 arg1) {
        if (arg0 != 62) {
            this.method824(true, (class191) null);
        }
        field1978++;
        if (this.method795(2)) {
            class191 var3 = arg1.method1324(arg0 ^ 0x3E);
            int var4 = this.field1972.field3321.method983((byte) -119, var3.method1347(arg0 ^ 0x4B));
            return this.method808(var4, -77);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public final void method821(byte arg0) {
        if (this.field1969 != null) {
            for (int var2 = 0; var2 < this.field1969.length; var2++) {
                this.field1969[var2] = null;
            }
        }
        if (arg0 <= -122) {
            field2003++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIII)V")
    public static final void method822(byte arg0, int arg1, int arg2, int arg3) {
        field2006++;
        class241 var4 = class14.method97(11, arg3, -111);
        if (arg0 > 96) {
            var4.method1694((byte) -90);
            var4.field4301 = arg1;
            var4.field4279 = arg2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
    public static void method823(int arg0) {
        field1983 = null;
        field1965 = null;
        if (arg0 <= -63) {
            field1973 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLe;)I")
    public final int method824(boolean arg0, class191 arg1) {
        if (!arg0) {
            this.field1969 = null;
        }
        field1976++;
        if (this.method795(2)) {
            class191 var3 = arg1.method1324(0);
            int var4 = this.field1972.field3321.method983((byte) -119, var3.method1347(118));
            return this.method814(-53, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(BLe;)Z")
    public final boolean method825(byte arg0, class191 arg1) {
        field1991++;
        if (!this.method795(2)) {
            return false;
        }
        class191 var3 = arg1.method1324(0);
        if (arg0 >= -37) {
            this.field1987 = false;
        }
        int var4 = this.field1972.field3321.method983((byte) -119, var3.method1347(122));
        return this.method797(var4, (byte) 105);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BII)[B")
    public final byte[] method826(byte arg0, int arg1, int arg2) {
        field1988++;
        if (arg0 != 35) {
            this.field1981 = null;
        }
        return this.method828(0, arg1, arg2, (int[]) null);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BILng;)[Lc;")
    public static final class60[] method827(byte arg0, int arg1, class121 arg2) {
        int var3 = -80 / ((arg0 + 48) / 55);
        field1975++;
        return class179.method1202(16748257, arg2, arg1) ? class53.method362(9568256) : null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lok;ZZ)V")
    public class121(class89 arg0, boolean arg1, boolean arg2) {
        this.field2005 = arg2;
        this.field1987 = arg1;
        this.field1971 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[I)[B")
    public final byte[] method828(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != 0) {
            this.method802((class191) null, (byte) 71, (class191) null);
        }
        field1977++;
        if (!this.method809(arg2, arg0 - 22797, arg1)) {
            return null;
        }
        if (this.field1969[arg1] == null || this.field1969[arg1][arg2] == null) {
            boolean var5 = this.method799(arg1, 0, arg3);
            if (!var5) {
                this.method815(arg1, -113);
                boolean var6 = this.method799(arg1, 0, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class119.method788(this.field1969[arg1][arg2], false, false);
        if (this.field2005) {
            this.field1969[arg1][arg2] = null;
            if (this.field1972.field3300[arg1] == 1) {
                this.field1969[arg1] = null;
            }
        }
        return var7;
    }
}
