import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class97 {

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lit;")
    private class599 field1544 = null;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "Z")
    private boolean field1569;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "Lfc;")
    private class238 field1568;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "[I")
    public static int[] field1542 = new int[5];

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Lor;")
    public static class594 field1548 = new class594();

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "[Ljava/lang/Object;")
    private Object[] field1580;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1563;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "[[[I")
    public static int[][][] field1577;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method916(int arg0) {
        field1571++;
        if (!this.method950((byte) 107)) {
            return false;
        }
        if (arg0 <= 28) {
            this.method943(null, (byte) 28);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1544.field8523.length; var3++) {
            int var4 = this.field1544.field8523[var3];
            if (this.field1580[var4] == null) {
                this.method934(var4, 0);
                if (this.field1580[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)I", line = 42)
    public final int method917(boolean arg0) {
        field1579++;
        if (!arg0) {
            this.method946((byte) -76, -8);
        }
        return this.method950((byte) 107) ? this.field1544.field8534.length : -1;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 57)
    public static void method918(int arg0) {
        field1548 = null;
        if (arg0 == -22387) {
            field1577 = null;
            field1542 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I", line = 70)
    public final int[] method919(byte arg0, int arg1) {
        field1566++;
        if (arg0 != 54) {
            return null;
        } else if (this.method933(arg1, 127)) {
            int[] var3 = this.field1544.field8526[arg1];
            if (var3 == null) {
                var3 = new int[this.field1544.field8522[arg1]];
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

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 106)
    public final boolean method920(String arg0, int arg1) {
        field1553++;
        int var3 = this.method928(false, "");
        if (arg1 != 17852) {
            this.method919((byte) -127, 18);
        }
        return var3 == -1 ? this.method938(-2, "", arg0) : this.method938(-2, arg0, "");
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 122)
    public final void method921(String arg0, int arg1) {
        field1572++;
        if (!this.method950((byte) 107)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == -14517) {
            int var4 = this.field1544.field8530.method1325(class651.method3756(var3, arg1 + 14517), 125);
            this.method924(var4, 0);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V", line = 139)
    public final void method922(int arg0, int arg1) {
        field1573++;
        if (!this.method933(arg1, 126)) {
            return;
        }
        if (this.field1563 != null) {
            this.field1563[arg1] = null;
        }
        if (arg0 != 0) {
            this.field1580 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B", line = 156)
    public final byte[] method923(String arg0, int arg1, String arg2) {
        field1547++;
        if (!this.method950((byte) 107)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1544.field8530.method1325(class651.method3756(var4, 0), arg1 + 25000);
        if (!this.method933(var6, arg1 ^ 0xFFFF9DA2)) {
            return null;
        }
        if (arg1 != -25124) {
            this.method933(-79, 12);
        }
        int var7 = this.field1544.field8528[var6].method1325(class651.method3756(var5, 0), -74);
        return this.method926(var6, -124, var7);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V", line = 180)
    private final void method924(int arg0, int arg1) {
        if (arg1 != 0) {
            method940(-64, null);
        }
        this.field1568.method1711(true, arg0);
        field1559++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[II)[B", line = 192)
    public final byte[] method925(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 > -67) {
            this.field1544 = null;
        }
        field1551++;
        if (!this.method932(arg3, -2, arg0)) {
            return null;
        }
        if (this.field1563[arg3] == null || this.field1563[arg3][arg0] == null) {
            boolean var5 = this.method939(arg3, arg2, 19482, arg0);
            if (!var5) {
                this.method934(arg3, 0);
                boolean var6 = this.method939(arg3, arg2, 19482, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class642.method3721(false, -1, this.field1563[arg3][arg0]);
        if (this.field1555 == 1) {
            this.field1563[arg3][arg0] = null;
            if (this.field1544.field8534[arg3] == 1) {
                this.field1563[arg3] = null;
            }
        } else if (this.field1555 == 2) {
            this.field1563[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)[B", line = 241)
    public final byte[] method926(int arg0, int arg1, int arg2) {
        field1560++;
        return arg1 > -123 ? null : this.method925(arg2, -85, null, arg0);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)I", line = 265)
    public final int method927(boolean arg0) {
        if (arg0) {
            this.field1544 = null;
        }
        field1537++;
        if (!this.method950((byte) 107)) {
            throw new IllegalStateException("");
        }
        return this.field1544.field8540;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 280)
    public final int method928(boolean arg0, String arg1) {
        field1539++;
        if (!this.method950((byte) 107)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        if (arg0) {
            this.field1555 = 83;
        }
        int var4 = this.field1544.field8530.method1325(class651.method3756(var3, 0), 126);
        return this.method933(var4, 127) ? var4 : -1;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V", line = 301)
    public final void method929(int arg0) {
        if (this.field1563 != null) {
            for (int var2 = 0; var2 < this.field1563.length; var2++) {
                this.field1563[var2] = null;
            }
        }
        int var3 = 126 / ((arg0 - 15) / 40);
        field1549++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZZ)V", line = 322)
    public final void method930(int arg0, boolean arg1, boolean arg2) {
        field1558++;
        if (!this.method950((byte) 107)) {
            return;
        }
        if (arg1) {
            this.field1544.field8528 = null;
            this.field1544.field8531 = null;
        }
        if (arg0 == -1 && arg2) {
            this.field1544.field8524 = null;
            this.field1544.field8530 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)Z", line = 349)
    public final boolean method931(int arg0, int arg1, int arg2) {
        field1578++;
        if (!this.method932(arg1, arg0 + arg0, arg2)) {
            return false;
        } else if (this.field1563[arg1] != null && this.field1563[arg1][arg2] != null) {
            return true;
        } else if (this.field1580[arg1] == null) {
            this.method934(arg1, 0);
            return this.field1580[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)Z", line = 373)
    private final boolean method932(int arg0, int arg1, int arg2) {
        field1536++;
        if (arg1 != -2) {
            method940(-39, null);
        }
        if (!this.method950((byte) 107)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && this.field1544.field8534.length > arg0 && this.field1544.field8534[arg0] > arg2) {
            return true;
        } else if (class255.field4063) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)Z", line = 397)
    private final boolean method933(int arg0, int arg1) {
        field1576++;
        if (arg1 < 124) {
            return false;
        } else if (!this.method950((byte) 107)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field1544.field8534.length && this.field1544.field8534[arg0] != 0) {
            return true;
        } else if (class255.field4063) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)V", line = 428)
    private final void method934(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field1567++;
        if (this.field1569) {
            this.field1580[arg0] = this.field1568.method1717(true, arg0);
        } else {
            this.field1580[arg0] = class129.method1126(false, (byte) -78, this.field1568.method1717(true, arg0));
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Ljava/lang/String;I)I", line = 445)
    public final int method935(String arg0, int arg1) {
        field1554++;
        if (this.method950((byte) 107)) {
            String var3 = arg0.toLowerCase();
            int var4 = 109 % ((77 - arg1) / 48);
            int var5 = this.field1544.field8530.method1325(class651.method3756(var3, 0), 123);
            return this.method948(var5, false);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 466)
    public final void method936(int arg0) {
        if (this.field1580 != null) {
            for (int var2 = 0; var2 < this.field1580.length; var2++) {
                this.field1580[var2] = null;
            }
        }
        if (arg0 != -26392) {
            this.field1568 = null;
        }
        field1541++;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(II)I", line = 488)
    public static final int method937(int arg0, int arg1) {
        field1574++;
        return arg1 == 9138 ? arg0 & 0xFF : -62;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lfc;ZI)V", line = 1129)
    public class97(class238 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1555 = arg2;
        this.field1569 = arg1;
        this.field1568 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 504)
    private final boolean method938(int arg0, String arg1, String arg2) {
        field1562++;
        if (arg0 != -2) {
            return true;
        } else if (this.method950((byte) 107)) {
            String var4 = arg2.toLowerCase();
            String var5 = arg1.toLowerCase();
            int var6 = this.field1544.field8530.method1325(class651.method3756(var4, 0), 119);
            if (this.method933(var6, 127)) {
                int var7 = this.field1544.field8528[var6].method1325(class651.method3756(var5, 0), 124);
                return this.method931(-1, var6, var7);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[III)Z", line = 531)
    private final boolean method939(int arg0, int[] arg1, int arg2, int arg3) {
        field1564++;
        if (!this.method933(arg0, arg2 - 19356)) {
            return false;
        } else if (this.field1580[arg0] == null) {
            return false;
        } else {
            int var5 = this.field1544.field8522[arg0];
            int[] var6 = this.field1544.field8526[arg0];
            if (this.field1563[arg0] == null) {
                this.field1563[arg0] = new Object[this.field1544.field8534[arg0]];
            }
            Object[] var7 = this.field1563[arg0];
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
            if (arg2 != 19482) {
                return true;
            } else if (var8) {
                return true;
            } else {
                byte[] var11;
                if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                    var11 = class642.method3721(true, arg2 ^ 0xFFFFB3E5, this.field1580[arg0]);
                    class6 var12 = new class6(var11);
                    var12.method87(arg1, var12.field96.length, arg2 + 8234, 5);
                } else {
                    var11 = class642.method3721(false, -1, this.field1580[arg0]);
                }
                byte[] var13;
                try {
                    var13 = class186.method1504(var11, true);
                } catch (RuntimeException var49) {
                    throw class413.method2631(var49, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class530.method3208(false, var11.length, var11) + "," + class530.method3208(false, var11.length - 2, var11) + "," + this.field1544.field8525[arg0] + "," + this.field1544.field8540);
                }
                if (this.field1569) {
                    this.field1580[arg0] = null;
                }
                if (var5 <= 1) {
                    int var15;
                    if (var6 == null) {
                        var15 = 0;
                    } else {
                        var15 = var6[0];
                    }
                    if (this.field1555 == 0) {
                        var7[var15] = class129.method1126(false, (byte) -97, var13);
                    } else {
                        var7[var15] = var13;
                    }
                } else if (this.field1555 == 2) {
                    int var16 = var13.length;
                    int var50 = var16 - 1;
                    int var17 = var13[var50] & 0xFF;
                    int var18 = var50 - var5 * 4 * var17;
                    class6 var19 = new class6(var13);
                    int var20 = 0;
                    var19.field57 = var18;
                    int var21 = 0;
                    for (int var22 = 0; var22 < var17; var22++) {
                        int var23 = 0;
                        for (int var24 = 0; var24 < var5; var24++) {
                            var23 += var19.method72(-35);
                            int var25;
                            if (var6 == null) {
                                var25 = var24;
                            } else {
                                var25 = var6[var24];
                            }
                            if (arg3 == var25) {
                                var21 = var25;
                                var20 += var23;
                            }
                        }
                    }
                    if (var20 == 0) {
                        return true;
                    }
                    byte[] var26 = new byte[var20];
                    var19.field57 = var18;
                    int var27 = 0;
                    int var28 = 0;
                    for (int var29 = 0; var29 < var17; var29++) {
                        int var30 = 0;
                        for (int var31 = 0; var31 < var5; var31++) {
                            var30 += var19.method72(-45);
                            int var32;
                            if (var6 == null) {
                                var32 = var31;
                            } else {
                                var32 = var6[var31];
                            }
                            if (arg3 == var32) {
                                class398.method2566(var13, var28, var26, var27, var30);
                                var27 += var30;
                            }
                            var28 += var30;
                        }
                    }
                    var7[var21] = var26;
                } else {
                    int var33 = var13.length;
                    int var51 = var33 - 1;
                    int var34 = var13[var51] & 0xFF;
                    int var35 = var51 - var5 * var34 * 4;
                    class6 var36 = new class6(var13);
                    var36.field57 = var35;
                    int[] var37 = new int[var5];
                    for (int var38 = 0; var38 < var34; var38++) {
                        int var39 = 0;
                        for (int var40 = 0; var40 < var5; var40++) {
                            var39 += var36.method72(-84);
                            var37[var40] += var39;
                        }
                    }
                    byte[][] var41 = new byte[var5][];
                    for (int var42 = 0; var42 < var5; var42++) {
                        var41[var42] = new byte[var37[var42]];
                        var37[var42] = 0;
                    }
                    var36.field57 = var35;
                    int var43 = 0;
                    for (int var44 = 0; var44 < var34; var44++) {
                        int var45 = 0;
                        for (int var46 = 0; var46 < var5; var46++) {
                            var45 += var36.method72(-124);
                            class398.method2566(var13, var43, var41[var46], var37[var46], var45);
                            var43 += var45;
                            var37[var46] += var45;
                        }
                    }
                    for (int var47 = 0; var47 < var5; var47++) {
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (this.field1555 == 0) {
                            var7[var48] = class129.method1126(false, (byte) 86, var41[var47]);
                        } else {
                            var7[var48] = var41[var47];
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 818)
    public static final String method940(int arg0, String arg1) {
        field1535++;
        String var2 = class683.method3887(class595.method3477(31485, arg1), 68);
        int var3 = -94 % ((arg0 + 26) / 52);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(II)Z", line = 833)
    public static final boolean method941(int arg0, int arg1) {
        field1545++;
        if (arg1 > -38) {
            return true;
        } else {
            return arg0 == 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(II)Z", line = 844)
    public final boolean method942(int arg0, int arg1) {
        field1561++;
        if (!this.method950((byte) 107)) {
            return false;
        } else if (this.field1544.field8534.length == 1) {
            return this.method931(-1, 0, arg1);
        } else {
            if (arg0 != 0) {
                this.field1569 = false;
            }
            if (!this.method933(arg1, 127)) {
                return false;
            } else if (this.field1544.field8534[arg1] == 1) {
                return this.method931(-1, arg1, 0);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 878)
    public final boolean method943(String arg0, byte arg1) {
        field1556++;
        if (!this.method950((byte) 107)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1544.field8530.method1325(class651.method3756(var3, arg1 ^ 0xFFFFFFDC), -80);
        if (var4 < 0) {
            return false;
        } else {
            if (arg1 != -36) {
                this.method919((byte) -80, -89);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(BI)Z", line = 902)
    public final boolean method944(byte arg0, int arg1) {
        field1538++;
        if (!this.method933(arg1, 127)) {
            return false;
        } else if (this.field1580[arg1] == null) {
            this.method934(arg1, 0);
            if (this.field1580[arg1] == null) {
                int var3 = 104 / ((arg0 + 54) / 59);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)I", line = 922)
    public final int method945(byte arg0) {
        field1546++;
        if (!this.method950((byte) 107)) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != 119) {
            return 37;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1580.length; var4++) {
            if (this.field1544.field8522[var4] > 0) {
                var3 += this.method948(var4, false);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(BI)I", line = 960)
    public final int method946(byte arg0, int arg1) {
        field1552++;
        if (!this.method950((byte) 107)) {
            return -1;
        }
        int var3 = this.field1544.field8530.method1325(arg1, arg0 - 5);
        if (arg0 != -105) {
            this.method942(-48, -44);
        }
        return this.method933(var3, 125) ? var3 : -1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 987)
    public final boolean method947(byte arg0, String arg1) {
        field1575++;
        if (!this.method950((byte) 107)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 > -78) {
            field1570 = -105;
        }
        int var4 = this.field1544.field8530.method1325(class651.method3756(var3, 0), 125);
        return this.method944((byte) 53, var4);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)I", line = 1006)
    private final int method948(int arg0, boolean arg1) {
        if (arg1) {
            return 3;
        }
        field1557++;
        if (this.method933(arg0, 125)) {
            return this.field1580[arg0] == null ? this.field1568.method1710(arg0, 100) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "(II)I", line = 1034)
    public final int method949(int arg0, int arg1) {
        field1565++;
        if (this.method933(arg0, 126)) {
            if (arg1 != 0) {
                this.method935(null, -83);
            }
            return this.field1544.field8534[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)Z", line = 1051)
    private final boolean method950(byte arg0) {
        field1550++;
        if (this.field1544 == null) {
            this.field1544 = this.field1568.method1713(arg0 + 13);
            if (this.field1544 == null) {
                return false;
            }
            this.field1563 = new Object[this.field1544.field8529][];
            this.field1580 = new Object[this.field1544.field8529];
        }
        return arg0 == 107;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 1074)
    public final boolean method951(String arg0, String arg1, int arg2) {
        field1543++;
        if (!this.method950((byte) 107)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        if (arg2 < 19) {
            return true;
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field1544.field8530.method1325(class651.method3756(var4, 0), 122);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field1544.field8528[var6].method1325(class651.method3756(var5, 0), 124);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "(II)[B", line = 1103)
    public final byte[] method952(int arg0, int arg1) {
        field1540++;
        if (!this.method950((byte) 107)) {
            return null;
        } else if (this.field1544.field8534.length == 1) {
            return this.method926(0, -124, arg1);
        } else if (this.method933(arg1, 126)) {
            if (arg0 < 59) {
                field1548 = null;
            }
            if (this.field1544.field8534[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method926(arg1, -128, 0);
        } else {
            return null;
        }
    }
}
