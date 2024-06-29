import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class110 {

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lra;")
    private class63 field1645 = null;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Ldi;")
    private class73 field1644;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Z")
    private boolean field1661;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field1660 = 0;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "Lld;")
    public static class105 field1671 = new class105();

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field1676 = 0;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "[I")
    public static int[] field1678 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "[Lac;")
    public static class348[] field1680;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[Ljava/lang/Object;")
    private Object[] field1640;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1682;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)I", line = 3)
    private final int method680(byte arg0, int arg1) {
        field1681++;
        if (arg0 <= 33) {
            this.method699((byte) -8);
        }
        if (this.method715(108, arg1)) {
            return this.field1640[arg1] == null ? this.field1644.method475(arg1, (byte) 121) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 21)
    public final void method681(boolean arg0) {
        if (arg0) {
            field1676 = 31;
        }
        if (this.field1682 != null) {
            for (int var2 = 0; var2 < this.field1682.length; var2++) {
                this.field1682[var2] = null;
            }
        }
        field1647++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z", line = 42)
    private final boolean method682(int arg0, int arg1, int arg2) {
        field1667++;
        if (!this.method699((byte) 105)) {
            return false;
        } else if (arg1 >= ~arg2 && arg0 >= 0 && this.field1645.field831.length > arg2 && arg0 < this.field1645.field831[arg2]) {
            return true;
        } else if (class429.field5814) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIZ)V", line = 65)
    public final void method683(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 1) {
            field1680 = null;
        }
        field1638++;
        if (!this.method699((byte) 95)) {
            return;
        }
        if (arg0) {
            this.field1645.field827 = null;
            this.field1645.field837 = null;
        }
        if (arg2) {
            this.field1645.field839 = null;
            this.field1645.field825 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(BI)Z", line = 92)
    public final boolean method684(byte arg0, int arg1) {
        field1650++;
        if (!this.method715(71, arg1)) {
            return false;
        } else if (this.field1640[arg1] == null) {
            int var3 = 13 / ((arg0 - 45) / 33);
            this.method692((byte) -125, arg1);
            return this.field1640[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 115)
    public final boolean method685(String arg0, byte arg1) {
        field1666++;
        if (this.method699((byte) -43)) {
            int var3 = 26 % ((-arg1 - 40) / 60);
            String var4 = arg0.toLowerCase();
            int var5 = this.field1645.field825.method759(class135.method821(var4, 0), 84);
            return this.method684((byte) 103, var5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Z", line = 134)
    public final boolean method686(int arg0) {
        field1646++;
        if (!this.method699((byte) 86)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1645.field840.length; var3++) {
            int var4 = this.field1645.field840[var3];
            if (this.field1640[var4] == null) {
                this.method692((byte) -73, var4);
                if (this.field1640[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 > -49) {
            this.field1661 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII[I)Z", line = 172)
    private final boolean method687(byte arg0, int arg1, int arg2, int[] arg3) {
        field1642++;
        if (!this.method715(108, arg2)) {
            return false;
        } else if (this.field1640[arg2] == null) {
            return false;
        } else {
            int var5 = this.field1645.field830[arg2];
            int[] var6 = this.field1645.field828[arg2];
            if (arg0 != 111) {
                this.method702((byte) 70, -126, 79);
            }
            if (this.field1682[arg2] == null) {
                this.field1682[arg2] = new Object[this.field1645.field831[arg2]];
            }
            Object[] var7 = this.field1682[arg2];
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
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class422.method2499((byte) 122, false, this.field1640[arg2]);
            } else {
                var11 = class422.method2499((byte) 65, true, this.field1640[arg2]);
                class32 var12 = new class32(var11);
                var12.method207(5, arg0 - 233, arg3, var12.field472.length);
            }
            byte[] var13;
            try {
                var13 = class205.method1170(var11, 13112);
            } catch (RuntimeException var49) {
                throw class257.method1450(var49, "T3 - " + (arg3 != null) + "," + arg2 + "," + var11.length + "," + class111.method717(var11, var11.length, (byte) -50) + "," + class111.method717(var11, var11.length - 2, (byte) -50) + "," + this.field1645.field844[arg2] + "," + this.field1645.field833);
            }
            if (this.field1661) {
                this.field1640[arg2] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field1651 == 0) {
                    var7[var48] = class150.method891(93, false, var13);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field1651 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * var32 * 4;
                class32 var34 = new class32(var13);
                int var35 = 0;
                var34.field456 = var33;
                int var36 = 0;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method222(1024);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg1 == var40) {
                            var36 = var40;
                            var35 += var38;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field456 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method222(1024);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg1 == var47) {
                            class380.method2334(var13, var43, var41, var42, var45);
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
                int var17 = var50 - var5 * 4 * var16;
                class32 var18 = new class32(var13);
                int[] var19 = new int[var5];
                var18.field456 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method222(1024);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field456 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method222(1024);
                        class380.method2334(var13, var25, var23[var28], var19[var28], var27);
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
                    if (this.field1651 == 0) {
                        var7[var30] = class150.method891(-102, false, var23[var29]);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLjava/lang/String;)I", line = 457)
    public final int method688(byte arg0, String arg1) {
        field1672++;
        if (!this.method699((byte) -118)) {
            return -1;
        }
        if (arg0 != 87) {
            this.field1644 = null;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1645.field825.method759(class135.method821(var3, 0), arg0 + 24);
        return this.method715(arg0 ^ 0x16, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/lang/String;B)V", line = 481)
    public final void method689(String arg0, byte arg1) {
        field1643++;
        if (!this.method699((byte) -79)) {
            return;
        }
        if (arg1 != -83) {
            this.method703((byte) 5);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1645.field825.method759(class135.method821(var3, 0), 107);
        this.method696(var4, -1);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)[I", line = 505)
    public final int[] method690(int arg0, boolean arg1) {
        field1654++;
        if (!this.method715(94, arg0)) {
            return null;
        } else if (arg1) {
            int[] var3 = this.field1645.field828[arg0];
            if (var3 == null) {
                var3 = new int[this.field1645.field830[arg0]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)I", line = 537)
    public final int method691(byte arg0) {
        int var2 = -29 / ((52 - arg0) / 63);
        field1677++;
        if (!this.method699((byte) -46)) {
            throw new IllegalStateException("");
        }
        return this.field1645.field833;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(BI)V", line = 551)
    private final void method692(byte arg0, int arg1) {
        if (arg0 > -47) {
            return;
        }
        field1653++;
        if (this.field1661) {
            this.field1640[arg1] = this.field1644.method477(arg1, 0);
        } else {
            this.field1640[arg1] = class150.method891(-101, false, this.field1644.method477(arg1, 0));
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIII)[B", line = 568)
    public final byte[] method693(int[] arg0, int arg1, int arg2, int arg3) {
        field1673++;
        if (!this.method682(arg2, arg1 - 2, arg3)) {
            return null;
        }
        if (this.field1682[arg3] == null || this.field1682[arg3][arg2] == null) {
            boolean var5 = this.method687((byte) 111, arg2, arg3, arg0);
            if (!var5) {
                this.method692((byte) -99, arg3);
                boolean var6 = this.method687((byte) 111, arg2, arg3, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 != 1) {
            this.field1644 = null;
        }
        byte[] var7 = class422.method2499((byte) 71, false, this.field1682[arg3][arg2]);
        if (this.field1651 == 1) {
            this.field1682[arg3][arg2] = null;
            if (this.field1645.field831[arg3] == 1) {
                this.field1682[arg3] = null;
            }
        } else if (this.field1651 == 2) {
            this.field1682[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)I", line = 617)
    public final int method694(int arg0, byte arg1) {
        field1639++;
        if (this.method715(arg1 + 2, arg0)) {
            if (arg1 != 119) {
                this.method693((int[]) null, 75, 107, -94);
            }
            return this.field1645.field831[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[B", line = 632)
    public final byte[] method695(int arg0, int arg1) {
        int var3 = -103 / ((-arg1 - 61) / 46);
        field1657++;
        if (!this.method699((byte) 123)) {
            return null;
        } else if (this.field1645.field831.length == 1) {
            return this.method702((byte) -110, arg0, 0);
        } else if (!this.method715(59, arg0)) {
            return null;
        } else if (this.field1645.field831[arg0] == 1) {
            return this.method702((byte) 115, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V", line = 659)
    private final void method696(int arg0, int arg1) {
        field1662++;
        if (arg1 != -1) {
            this.field1682 = null;
        }
        this.field1644.method473(arg0, -20252);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 671)
    public final byte[] method697(String arg0, String arg1, int arg2) {
        field1670++;
        if (!this.method699((byte) 85)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field1645.field825.method759(class135.method821(var4, arg2 ^ arg2), arg2 ^ 0xFFFFFF8A);
        if (this.method715(94, var6)) {
            int var7 = this.field1645.field827[var6].method759(class135.method821(var5, 0), 115);
            return this.method702((byte) -126, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ldi;ZI)V", line = 1109)
    public class110(class73 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1644 = arg0;
        this.field1661 = arg1;
        this.field1651 = arg2;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/lang/String;B)I", line = 696)
    public final int method698(String arg0, byte arg1) {
        field1683++;
        if (this.method699((byte) -69)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1645.field825.method759(class135.method821(var3, 0), 127);
            return arg1 == 93 ? this.method680((byte) 43, var4) : -121;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z", line = 714)
    private final boolean method699(byte arg0) {
        int var2 = 22 % ((arg0 - 17) / 60);
        field1668++;
        if (this.field1645 == null) {
            this.field1645 = this.field1644.method472(true);
            if (this.field1645 == null) {
                return false;
            }
            this.field1640 = new Object[this.field1645.field841];
            this.field1682 = new Object[this.field1645.field841][];
        }
        return true;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(BI)Z", line = 736)
    public final boolean method700(byte arg0, int arg1) {
        field1659++;
        if (!this.method699((byte) -110)) {
            return false;
        }
        int var3 = -125 / ((arg0 - 29) / 46);
        if (this.field1645.field831.length == 1) {
            return this.method701(arg1, 13047, 0);
        } else if (!this.method715(110, arg1)) {
            return false;
        } else if (this.field1645.field831[arg1] == 1) {
            return this.method701(0, 13047, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(III)Z", line = 772)
    public final boolean method701(int arg0, int arg1, int arg2) {
        field1669++;
        if (!this.method682(arg0, -1, arg2)) {
            return false;
        } else if (this.field1682[arg2] != null && this.field1682[arg2][arg0] != null) {
            return true;
        } else if (this.field1640[arg2] == null) {
            if (arg1 != 13047) {
                this.field1640 = null;
            }
            this.method692((byte) -95, arg2);
            return this.field1640[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)[B", line = 799)
    public final byte[] method702(byte arg0, int arg1, int arg2) {
        field1679++;
        int var4 = 20 / ((-arg0 - 22) / 40);
        return this.method693((int[]) null, 1, arg1, arg2);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V", line = 809)
    public final void method703(byte arg0) {
        field1663++;
        if (arg0 > 44 && this.field1640 != null) {
            for (int var2 = 0; var2 < this.field1640.length; var2++) {
                this.field1640[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I", line = 845)
    public final int method704(byte arg0) {
        field1648++;
        if (!this.method699((byte) 88)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 77 % ((arg0 - 61) / 37);
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1640.length; var5++) {
            if (this.field1645.field830[var5] > 0) {
                var2 += 100;
                var4 += this.method680((byte) 65, var5);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var4 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)I", line = 886)
    public final int method705(byte arg0) {
        field1649++;
        if (arg0 >= -88) {
            return -30;
        } else if (this.method699((byte) -121)) {
            return this.field1645.field831.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(B)V", line = 906)
    public static void method706(byte arg0) {
        field1678 = null;
        if (arg0 == -40) {
            field1680 = null;
            field1671 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(B)V", line = 920)
    public static final void method707(byte arg0) {
        class453.field6145 = null;
        class245.field3268 = null;
        if (arg0 != 90) {
            return;
        }
        class302.field4031 = null;
        class431.field5879 = false;
        field1674++;
        class385.field5323 = null;
        class177.field2404 = null;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)V", line = 936)
    public final void method708(int arg0, int arg1) {
        field1655++;
        if (this.method715(55, arg1) && arg0 == 0 && this.field1682 != null) {
            this.field1682[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lnk;ZLnk;)V", line = 952)
    public static final void method709(class464 arg0, boolean arg1, class464 arg2) {
        field1652++;
        class491.method2861(class364.field5001, 1);
        class124.field1813++;
        if (arg1) {
            field1678 = null;
        }
        class203.field2751.method199((byte) -117, arg2.field6440);
        class203.field2751.method224(arg2.field6402, 0);
        class203.field2751.method241(arg2.field6397, (byte) -71);
        class203.field2751.method191(-839598448, arg0.field6440);
        class203.field2751.method224(arg0.field6402, 0);
        class203.field2751.method216(arg0.field6397, -1);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IZ)I", line = 971)
    public final int method710(int arg0, boolean arg1) {
        field1675++;
        if (!this.method699((byte) -75)) {
            return -1;
        }
        int var3 = this.field1645.field825.method759(arg0, 84);
        if (this.method715(89, var3)) {
            return arg1 ? 59 : var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z", line = 993)
    public final boolean method711(String arg0, String arg1, boolean arg2) {
        field1658++;
        if (!this.method699((byte) 109)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field1645.field825.method759(class135.method821(var4, 0), 105);
        if (!this.method715(125, var6)) {
            return false;
        } else if (arg2) {
            return false;
        } else {
            int var7 = this.field1645.field827[var6].method759(class135.method821(var5, 0), 98);
            return this.method701(var7, 13047, var6);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(III)I", line = 1031)
    public static final int method712(int arg0, int arg1, int arg2) {
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 != -1) {
            method707((byte) 21);
        }
        field1656++;
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IB)Ljs;", line = 1058)
    public static final class199 method713(int arg0, byte arg1) {
        field1664++;
        if (arg1 != -50) {
            return null;
        }
        class199 var2 = (class199) class384.field5309.method2635((long) arg0, (byte) -118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class262.field3477.method702((byte) 73, 0, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class199 var4 = class38.method278(var3, -39);
            class384.field5309.method2638((byte) -82, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 1084)
    public final boolean method714(int arg0, String arg1) {
        field1665++;
        if (this.method699((byte) 106)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1645.field825.method759(class135.method821(var3, 0), 123);
            return ~var4 <= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(II)Z", line = 1122)
    private final boolean method715(int arg0, int arg1) {
        field1641++;
        if (arg0 <= 53) {
            this.method699((byte) -61);
        }
        if (!this.method699((byte) -128)) {
            return false;
        } else if (arg1 >= 0 && this.field1645.field831.length > arg1 && this.field1645.field831[arg1] != 0) {
            return true;
        } else if (class429.field5814) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }
}
