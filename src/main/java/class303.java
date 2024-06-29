import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class303 {

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "Lhc;")
    private class127 field3953 = null;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "Z")
    private boolean field3951;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "Ltv;")
    private class512 field3959;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!jo", name = "M", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!jo", name = "N", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!jo", name = "O", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "[Ljava/lang/Object;")
    private Object[] field3955;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3974;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)I")
    private final int method1707(int arg0, boolean arg1) {
        field3944++;
        if (this.method1729(-1, arg0)) {
            if (!arg1) {
                this.method1708(32, (byte) -23);
            }
            return this.field3955[arg0] == null ? this.field3959.method1217(-120, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)[I")
    public final int[] method1708(int arg0, byte arg1) {
        field3950++;
        if (!this.method1729(-1, arg0)) {
            return null;
        }
        int[] var3 = this.field3953.field1439[arg0];
        if (arg1 > -57) {
            return null;
        }
        if (var3 == null) {
            var3 = new int[this.field3953.field1441[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[IB)[B")
    public final byte[] method1709(int arg0, int arg1, int[] arg2, byte arg3) {
        if (arg3 != -33) {
            this.method1728(null, null, 89);
        }
        field3952++;
        if (!this.method1725(arg0, true, arg1)) {
            return null;
        }
        if (this.field3974[arg0] == null || this.field3974[arg0][arg1] == null) {
            boolean var5 = this.method1723(arg1, arg0, arg2, -128);
            if (!var5) {
                this.method1712(arg3 + 160, arg0);
                boolean var6 = this.method1723(arg1, arg0, arg2, -119);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class548.method3100(false, (byte) 53, this.field3974[arg0][arg1]);
        if (this.field3945 == 1) {
            this.field3974[arg0][arg1] = null;
            if (this.field3953.field1436[arg0] == 1) {
                this.field3974[arg0] = null;
            }
        } else if (this.field3945 == 2) {
            this.field3974[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
    public final void method1710(int arg0, int arg1) {
        field3948++;
        if (arg0 != -182) {
            this.field3953 = null;
        }
        if (this.method1729(arg0 ^ 0xB5, arg1) && this.field3974 != null) {
            this.field3974[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)Z")
    public final boolean method1711(int arg0, int arg1) {
        field3949++;
        if (!this.method1718(0)) {
            return false;
        } else if (this.field3953.field1436.length == arg1) {
            return this.method1739(0, arg0, -2);
        } else if (!this.method1729(-1, arg0)) {
            return false;
        } else if (this.field3953.field1436[arg0] == 1) {
            return this.method1739(arg0, 0, -2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(II)V")
    private final void method1712(int arg0, int arg1) {
        int var3 = -36 % ((arg0 + 37) / 58);
        if (this.field3951) {
            this.field3955[arg1] = this.field3959.method1205(arg1, 7843);
        } else {
            this.field3955[arg1] = class356.method1967(this.field3959.method1205(arg1, 7843), 18, false);
        }
        field3954++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1713(String arg0, int arg1) {
        field3963++;
        if (this.method1718(arg1 + 1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3953.field1432.method3706(class417.method2257(1, var3), arg1);
            return ~var4 <= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)V")
    public static final void method1714(byte arg0, int arg1) {
        class645.field9139.method3691(false, arg1);
        field3938++;
        class522.field7475.method3691(false, arg1);
        class461.field6407.method3691(false, arg1);
        if (arg0 == -107) {
            class149.field1701.method3691(false, arg1);
            class591.field8401.method3691(false, arg1);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)I")
    public final int method1715(int arg0) {
        if (arg0 >= -102) {
            this.method1727(-13, 50);
        }
        field3967++;
        if (!this.method1718(0)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3955.length; var4++) {
            if (this.field3953.field1441[var4] > 0) {
                var2 += 100;
                var3 += this.method1707(var4, true);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public final int method1716(boolean arg0, String arg1) {
        field3965++;
        if (!this.method1718(0)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        if (!arg0) {
            this.method1728(null, null, 121);
        }
        int var4 = this.field3953.field1432.method3706(class417.method2257(1, var3), -1);
        return this.method1729(-1, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIILkv;Lkv;)V")
    public static final void method1717(int arg0, int arg1, int arg2, class244 arg3, class244 arg4) {
        class287 var5 = class396.method2161(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3697 = arg3;
            var5.field3690 = arg4;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)Z")
    private final boolean method1718(int arg0) {
        field3970++;
        if (arg0 != 0) {
            return true;
        }
        if (this.field3953 == null) {
            this.field3953 = this.field3959.method1214(-1);
            if (this.field3953 == null) {
                return false;
            }
            this.field3974 = new Object[this.field3953.field1447][];
            this.field3955 = new Object[this.field3953.field1447];
        }
        return true;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)[B")
    public final byte[] method1719(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            this.method1715(-106);
        }
        field3966++;
        return this.method1709(arg1, arg0, null, (byte) -33);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1720(int arg0, String arg1) {
        field3941++;
        if (!this.method1718(0)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3953.field1432.method3706(class417.method2257(1, var3), -1);
        if (arg0 < 60) {
            method1717(39, 80, -68, null, null);
        }
        this.method1733(var4, 23420);
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1721(String arg0, int arg1) {
        if (arg1 <= 122) {
            this.field3955 = null;
        }
        field3956++;
        if (this.method1718(0)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3953.field1432.method3706(class417.method2257(1, var3), -1);
            return this.method1730((byte) 124, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(II)[B")
    public final byte[] method1722(int arg0, int arg1) {
        field3960++;
        if (!this.method1718(arg1)) {
            return null;
        } else if (this.field3953.field1436.length == 1) {
            return this.method1719(arg0, 0, 4);
        } else if (!this.method1729(-1, arg0)) {
            return null;
        } else if (this.field3953.field1436[arg0] == 1) {
            return this.method1719(0, arg0, arg1 ^ 0x4);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[II)Z")
    private final boolean method1723(int arg0, int arg1, int[] arg2, int arg3) {
        field3976++;
        if (!this.method1729(-1, arg1)) {
            return false;
        } else if (this.field3955[arg1] == null) {
            return false;
        } else {
            int var5 = this.field3953.field1441[arg1];
            int[] var6 = this.field3953.field1439[arg1];
            if (this.field3974[arg1] == null) {
                this.field3974[arg1] = new Object[this.field3953.field1436[arg1]];
            }
            Object[] var7 = this.field3974[arg1];
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
            if (arg3 > -107) {
                this.method1735(false, (byte) -114, false);
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var11 = class548.method3100(true, (byte) 66, this.field3955[arg1]);
                class452 var12 = new class452(var11);
                var12.method2561(arg2, var12.field6209.length, 5, -957401312);
            } else {
                var11 = class548.method3100(false, (byte) 31, this.field3955[arg1]);
            }
            byte[] var13;
            try {
                var13 = class149.method817(9, var11);
            } catch (RuntimeException var49) {
                throw class234.method1361(var49, "T3 - " + (arg2 != null) + "," + arg1 + "," + var11.length + "," + class601.method3358(1, var11, var11.length) + "," + class601.method3358(1, var11, var11.length - 2) + "," + this.field3953.field1449[arg1] + "," + this.field3953.field1435);
            }
            if (this.field3951) {
                this.field3955[arg1] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field3945 == 0) {
                    var7[var48] = class356.method1967(var13, 96, false);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field3945 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var32 * 4 * var5;
                class452 var34 = new class452(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field6215 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method2575((byte) -48);
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
                var34.field6215 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method2575((byte) -48);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg0 == var47) {
                            class652.method3679(var13, var43, var41, var42, var45);
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
                class452 var18 = new class452(var13);
                var18.field6215 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method2575((byte) -48);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field6215 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method2575((byte) -48);
                        class652.method3679(var13, var25, var23[var28], var19[var28], var27);
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
                    if (this.field3945 == 0) {
                        var7[var30] = class356.method1967(var23[var29], 84, false);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public final boolean method1724(String arg0, byte arg1, String arg2) {
        if (arg1 >= -21) {
            return false;
        }
        field3964++;
        if (!this.method1718(0)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3953.field1432.method3706(class417.method2257(1, var4), -1);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field3953.field1446[var6].method3706(class417.method2257(1, var5), -1);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZI)Z")
    private final boolean method1725(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field3951 = true;
        }
        field3977++;
        if (!this.method1718(0)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && this.field3953.field1436.length > arg0 && this.field3953.field1436[arg0] > arg2) {
            return true;
        } else if (class671.field9538) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)Z")
    public final boolean method1726(boolean arg0) {
        field3943++;
        if (!this.method1718(0)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0) {
            return true;
        }
        while (this.field3953.field1445.length > var3) {
            int var4 = this.field3953.field1445[var3];
            if (this.field3955[var4] == null) {
                this.method1712(69, var4);
                if (this.field3955[var4] == null) {
                    var2 = false;
                }
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(II)I")
    public final int method1727(int arg0, int arg1) {
        field3975++;
        if (this.method1729(-1, arg1)) {
            if (arg0 != -77) {
                this.method1741(null, 85);
            }
            return this.field3953.field1436[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method1728(String arg0, String arg1, int arg2) {
        field3947++;
        if (!this.method1718(arg2)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3953.field1432.method3706(class417.method2257(1, var4), arg2 - 1);
        if (this.method1729(arg2 - 1, var6)) {
            int var7 = this.field3953.field1446[var6].method3706(class417.method2257(1, var5), arg2 - 1);
            return this.method1739(var6, var7, -2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(II)Z")
    private final boolean method1729(int arg0, int arg1) {
        field3972++;
        if (!this.method1718(0)) {
            return false;
        } else if (arg0 != -1) {
            return true;
        } else if (arg1 >= 0 && this.field3953.field1436.length > arg1 && this.field3953.field1436[arg1] != 0) {
            return true;
        } else if (class671.field9538) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(BI)Z")
    public final boolean method1730(byte arg0, int arg1) {
        field3973++;
        if (!this.method1729(-1, arg1)) {
            return false;
        } else if (this.field3955[arg1] == null) {
            this.method1712(-97, arg1);
            if (arg0 != 124) {
                this.field3959 = null;
            }
            return this.field3955[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public final void method1731(byte arg0) {
        if (this.field3955 != null) {
            for (int var2 = 0; var2 < this.field3955.length; var2++) {
                this.field3955[var2] = null;
            }
        }
        if (arg0 > -32) {
            this.method1708(107, (byte) -41);
        }
        field3946++;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V")
    public final void method1732(boolean arg0) {
        if (arg0) {
            this.field3945 = 77;
        }
        if (this.field3974 != null) {
            for (int var2 = 0; var2 < this.field3974.length; var2++) {
                this.field3974[var2] = null;
            }
        }
        field3958++;
    }

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "(II)V")
    private final void method1733(int arg0, int arg1) {
        if (arg1 != 23420) {
            this.method1730((byte) 64, -63);
        }
        this.field3959.method1218((byte) -122, arg0);
        field3971++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method1734(String arg0, int arg1, String arg2) {
        field3961++;
        if (!this.method1718(0)) {
            return null;
        }
        if (arg1 != 11434) {
            this.field3951 = true;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field3953.field1432.method3706(class417.method2257(1, var4), arg1 - 11435);
        if (this.method1729(-1, var6)) {
            int var7 = this.field3953.field1446[var6].method3706(class417.method2257(arg1 - 11433, var5), arg1 - 11435);
            return this.method1719(var7, var6, arg1 - 11430);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZBZ)V")
    public final void method1735(boolean arg0, byte arg1, boolean arg2) {
        field3939++;
        if (!this.method1718(0)) {
            return;
        }
        if (arg1 != 111) {
            this.method1739(46, 0, 95);
        }
        if (arg2) {
            this.field3953.field1440 = null;
            this.field3953.field1446 = null;
        }
        if (arg0) {
            this.field3953.field1442 = null;
            this.field3953.field1432 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "(II)I")
    public final int method1736(int arg0, int arg1) {
        field3968++;
        if (this.method1718(arg1)) {
            int var3 = this.field3953.field1432.method3706(arg0, -1);
            return this.method1729(-1, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(Z)I")
    public final int method1737(boolean arg0) {
        if (!arg0) {
            this.field3955 = null;
        }
        field3962++;
        if (!this.method1718(0)) {
            throw new IllegalStateException("");
        }
        return this.field3953.field1435;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILiaa;)V")
    public static final void method1738(int arg0, class452 arg1) {
        field3942++;
        int var2 = arg1.method2548(-29696);
        class385.field5152 = new class623[var2];
        for (int var3 = arg0; var3 < var2; var3++) {
            class385.field5152[var3] = new class623();
            class385.field5152[var3].field8834 = arg1.method2548(arg0 ^ 0xFFFF8C00);
            class385.field5152[var3].field8833 = arg1.method2520(4);
        }
        class309.field4009 = arg1.method2548(-29696);
        class87.field931 = arg1.method2548(arg0 - 29696);
        class212.field2565 = arg1.method2548(-29696);
        class13.field120 = new class620[class87.field931 + 1 - class309.field4009];
        for (int var4 = 0; var4 < class212.field2565; var4++) {
            int var5 = arg1.method2548(-29696);
            class620 var6 = class13.field120[var5] = new class620();
            var6.field7624 = arg1.method2541(arg0 ^ 0x5C);
            var6.field7626 = arg1.method2575((byte) -48);
            var6.field8720 = class309.field4009 + var5;
            var6.field8718 = arg1.method2520(4);
            var6.field8717 = arg1.method2520(arg0 ^ 0x4);
        }
        class657.field9372 = arg1.method2575((byte) -48);
        class384.field5139 = true;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)Z")
    public final boolean method1739(int arg0, int arg1, int arg2) {
        field3940++;
        if (arg2 != -2) {
            this.field3953 = null;
        }
        if (!this.method1725(arg0, true, arg1)) {
            return false;
        } else if (this.field3974[arg0] != null && this.field3974[arg0][arg1] != null) {
            return true;
        } else if (this.field3955[arg0] == null) {
            this.method1712(114, arg0);
            return this.field3955[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)I")
    public final int method1740(byte arg0) {
        if (arg0 < 26) {
            return -23;
        } else {
            field3969++;
            return this.method1718(0) ? this.field3953.field1436.length : -1;
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(Ljava/lang/String;I)I")
    public final int method1741(String arg0, int arg1) {
        field3957++;
        if (!this.method1718(0)) {
            return 0;
        }
        if (arg1 != 9312) {
            this.field3953 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3953.field1432.method3706(class417.method2257(arg1 - 9311, var3), -1);
        return this.method1707(var4, true);
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ltv;ZI)V")
    public class303(class512 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3951 = arg1;
        this.field3945 = arg2;
        this.field3959 = arg0;
    }
}
