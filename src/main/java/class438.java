import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class438 {

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "Lwh;")
    private class127 field6057 = null;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public int field6068;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "Z")
    private boolean field6050;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "Ltk;")
    private class288 field6069;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "[S")
    public static short[] field6037 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "Z")
    public static boolean field6051 = false;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "Lvj;")
    public static class373 field6062 = new class373(80, 16);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!dn", name = "Q", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "Ldj;")
    public static class287 field6043;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "[Ljava/lang/Object;")
    private Object[] field6053;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6049;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 3)
    public final void method2549(int arg0) {
        int var2 = 109 % ((29 - arg0) / 60);
        if (this.field6049 != null) {
            for (int var3 = 0; var3 < this.field6049.length; var3++) {
                this.field6049[var3] = null;
            }
        }
        field6061++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 27)
    public static void method2550(byte arg0) {
        field6037 = null;
        if (arg0 >= 121) {
            field6062 = null;
            field6043 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZ)Z", line = 41)
    private final boolean method2551(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        }
        field6035++;
        if (!this.method2552(-123)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field6057.field1569.length && this.field6057.field1569[arg0] != 0) {
            return true;
        } else if (class170.field2070) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)Z", line = 70)
    private final boolean method2552(int arg0) {
        field6074++;
        if (arg0 > -28) {
            field6062 = null;
        }
        if (this.field6057 == null) {
            this.field6057 = this.field6069.method1623(255);
            if (this.field6057 == null) {
                return false;
            }
            this.field6049 = new Object[this.field6057.field1555][];
            this.field6053 = new Object[this.field6057.field1555];
        }
        return true;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 96)
    public final boolean method2553(byte arg0, String arg1) {
        field6039++;
        if (!this.method2552(-106)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field6057.field1559.method1868(class370.method2076(var3, -9063), (byte) 66);
        if (var4 < 0) {
            return false;
        } else {
            int var5 = 64 / ((arg0 - 78) / 46);
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I", line = 121)
    public final int method2554(int arg0, int arg1) {
        field6058++;
        if (arg1 <= 122) {
            field6051 = false;
        }
        return this.method2551(arg0, false) ? this.field6057.field1569[arg0] : 0;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I", line = 136)
    private final int method2555(int arg0, int arg1) {
        field6065++;
        if (arg0 != 32516) {
            this.method2574(-120);
        }
        if (this.method2551(arg1, false)) {
            return this.field6053[arg1] == null ? this.field6069.method1619(arg1, (byte) -123) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)V", line = 155)
    private final void method2556(byte arg0, int arg1) {
        if (arg0 >= -45) {
            return;
        }
        if (this.field6050) {
            this.field6053[arg1] = this.field6069.method1620((byte) 51, arg1);
        } else {
            this.field6053[arg1] = class256.method1444((byte) 84, false, this.field6069.method1620((byte) 51, arg1));
        }
        field6066++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 170)
    public final void method2557(String arg0, int arg1) {
        field6036++;
        if (!this.method2552(arg1 - 111)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field6057.field1559.method1868(class370.method2076(var3, arg1 - 9064), (byte) 29);
        this.method2571((byte) -74, var4);
        if (arg1 != 1) {
            this.method2573(null, (byte) -42, -40, -57);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)[B", line = 188)
    public final byte[] method2558(int arg0, int arg1, int arg2) {
        if (arg0 != 100) {
            field6051 = false;
        }
        field6063++;
        return this.method2573(null, (byte) 52, arg2, arg1);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)[I", line = 202)
    public final int[] method2559(int arg0, byte arg1) {
        if (arg1 > -26) {
            return null;
        }
        field6044++;
        if (!this.method2551(arg0, false)) {
            return null;
        }
        int[] var3 = this.field6057.field1572[arg0];
        if (var3 == null) {
            var3 = new int[this.field6057.field1566[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)[B", line = 231)
    public final byte[] method2560(int arg0, int arg1) {
        field6055++;
        if (!this.method2552(-99)) {
            return null;
        } else if (this.field6057.field1569.length == 1) {
            return this.method2558(arg1 + 7014, arg0, 0);
        } else if (!this.method2551(arg0, false)) {
            return null;
        } else if (this.field6057.field1569[arg0] == 1) {
            return this.method2558(100, 0, arg0);
        } else if (arg1 == -6914) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[III)Z", line = 259)
    private final boolean method2561(int arg0, int[] arg1, int arg2, int arg3) {
        field6033++;
        if (!this.method2551(arg2, false)) {
            return false;
        } else if (this.field6053[arg2] == null) {
            return false;
        } else {
            int var5 = this.field6057.field1566[arg2];
            int[] var6 = this.field6057.field1572[arg2];
            if (this.field6049[arg2] == null) {
                this.field6049[arg2] = new Object[this.field6057.field1569[arg2]];
            }
            Object[] var7 = this.field6049[arg2];
            boolean var8 = true;
            for (int var9 = arg3; var9 < var5; var9++) {
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
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var11 = class258.method1451(false, this.field6053[arg2], 15);
            } else {
                var11 = class258.method1451(true, this.field6053[arg2], 15);
                class374 var12 = new class374(var11);
                var12.method2137(var12.field4929.length, 5, arg1, arg3 + 91);
            }
            byte[] var13;
            try {
                var13 = class268.method1502((byte) 49, var11);
            } catch (RuntimeException var49) {
                throw class595.method3448(var49, "T3 - " + (arg1 != null) + "," + arg2 + "," + var11.length + "," + class636.method3652(var11.length, var11, -32297) + "," + class636.method3652(var11.length - 2, var11, -32297) + "," + this.field6057.field1567[arg2] + "," + this.field6057.field1553);
            }
            if (this.field6050) {
                this.field6053[arg2] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field6068 == 0) {
                    var7[var48] = class256.method1444((byte) 75, false, var13);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field6068 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class374 var18 = new class374(var13);
                int var19 = 0;
                int var20 = 0;
                var18.field4966 = var17;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method2123(false);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg0 == var24) {
                            var19 += var22;
                            var20 = var24;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                int var26 = 0;
                var18.field4966 = var17;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method2123(false);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg0 == var31) {
                            class345.method1932(var13, var27, var25, var26, var29);
                            var26 += var29;
                        }
                        var27 += var29;
                    }
                }
                var7[var20] = var25;
            } else {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * 4 * var33;
                class374 var35 = new class374(var13);
                var35.field4966 = var34;
                int[] var36 = new int[var5];
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method2123(false);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field4966 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method2123(false);
                        class345.method1932(var13, var42, var40[var45], var36[var45], var44);
                        var42 += var44;
                        var36[var45] += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field6068 == 0) {
                        var7[var47] = class256.method1444((byte) 112, false, var40[var46]);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(III)Z", line = 541)
    private final boolean method2562(int arg0, int arg1, int arg2) {
        field6071++;
        if (arg2 != 16241) {
            field6062 = null;
        }
        if (!this.method2552(-86)) {
            return false;
        } else if (arg1 >= 0 && arg0 >= 0 && this.field6057.field1569.length > arg1 && this.field6057.field1569[arg1] > arg0) {
            return true;
        } else if (class170.field2070) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBI)Z", line = 568)
    public final boolean method2563(int arg0, byte arg1, int arg2) {
        field6052++;
        if (arg1 < 88) {
            return true;
        } else if (!this.method2562(arg2, arg0, 16241)) {
            return false;
        } else if (this.field6049[arg0] != null && this.field6049[arg0][arg2] != null) {
            return true;
        } else if (this.field6053[arg0] == null) {
            this.method2556((byte) -105, arg0);
            return this.field6053[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZZ)V", line = 598)
    public final void method2564(int arg0, boolean arg1, boolean arg2) {
        field6045++;
        if (!this.method2552(-62)) {
            return;
        }
        if (arg1) {
            this.field6057.field1559 = null;
            this.field6057.field1558 = null;
        }
        if (arg0 != 0) {
            this.method2572(86);
        }
        if (arg2) {
            this.field6057.field1561 = null;
            this.field6057.field1562 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I", line = 625)
    public final int method2565(byte arg0) {
        field6034++;
        if (this.method2552(-117)) {
            int var2 = -71 / ((46 - arg0) / 38);
            return this.field6057.field1569.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)Z", line = 640)
    public final boolean method2566(int arg0, int arg1) {
        field6042++;
        if (!this.method2552(-76)) {
            return false;
        } else if (this.field6057.field1569.length == 1) {
            return this.method2563(0, (byte) 112, arg1);
        } else if (!this.method2551(arg1, false)) {
            return false;
        } else if (arg0 < 67) {
            return true;
        } else if (this.field6057.field1569[arg1] == 1) {
            return this.method2563(arg1, (byte) 125, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 667)
    public final boolean method2567(String arg0, String arg1, int arg2) {
        field6059++;
        if (!this.method2552(-96)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field6057.field1559.method1868(class370.method2076(var4, -9063), (byte) 73);
        if (var6 < 0) {
            return false;
        }
        int var7 = this.field6057.field1561[var6].method1868(class370.method2076(var5, -9063), (byte) 111);
        if (arg2 <= 48) {
            this.field6069 = null;
        }
        return var7 >= 0;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)I", line = 693)
    public final int method2568(byte arg0) {
        field6070++;
        if (!this.method2552(-110)) {
            throw new IllegalStateException("");
        }
        int var2 = 41 / ((arg0 - 69) / 47);
        return this.field6057.field1553;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZII)V", line = 711)
    public static final void method2569(int arg0, boolean arg1, int arg2, int arg3) {
        field6047++;
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class474.method2757(1, false, var4, arg1);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B", line = 724)
    public final byte[] method2570(byte arg0, String arg1, String arg2) {
        field6048++;
        if (!this.method2552(-52)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        if (arg0 <= 10) {
            this.method2555(-29, -2);
        }
        int var6 = this.field6057.field1559.method1868(class370.method2076(var4, -9063), (byte) 48);
        if (this.method2551(var6, false)) {
            int var7 = this.field6057.field1561[var6].method1868(class370.method2076(var5, -9063), (byte) 88);
            return this.method2558(100, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(BI)V", line = 750)
    private final void method2571(byte arg0, int arg1) {
        int var3 = -106 / ((arg0 - 11) / 49);
        field6040++;
        this.field6069.method1617(arg1, 69);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)I", line = 760)
    public final int method2572(int arg0) {
        field6054++;
        if (!this.method2552(-123)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6053.length; var4++) {
            if (this.field6057.field1566[var4] > 0) {
                var3 += this.method2555(32516, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        }
        int var5 = var3 * 100 / var2;
        if (arg0 != 1726) {
            this.method2559(60, (byte) 24);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([IBII)[B", line = 798)
    public final byte[] method2573(int[] arg0, byte arg1, int arg2, int arg3) {
        field6041++;
        if (!this.method2562(arg3, arg2, 16241)) {
            return null;
        }
        if (this.field6049[arg2] == null || this.field6049[arg2][arg3] == null) {
            boolean var5 = this.method2561(arg3, arg0, arg2, 0);
            if (!var5) {
                this.method2556((byte) -48, arg2);
                boolean var6 = this.method2561(arg3, arg0, arg2, 0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class258.method1451(false, this.field6049[arg2][arg3], 15);
        if (this.field6068 == 1) {
            this.field6049[arg2][arg3] = null;
            if (this.field6057.field1569[arg2] == 1) {
                this.field6049[arg2] = null;
            }
        } else if (this.field6068 == 2) {
            this.field6049[arg2] = null;
        }
        if (arg1 != 52) {
            field6043 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z", line = 847)
    public final boolean method2574(int arg0) {
        field6046++;
        if (!this.method2552(-69)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 > -41) {
            return true;
        }
        while (this.field6057.field1560.length > var3) {
            int var4 = this.field6057.field1560[var3];
            if (this.field6053[var4] == null) {
                this.method2556((byte) -120, var4);
                if (this.field6053[var4] == null) {
                    var2 = false;
                }
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)V", line = 885)
    public final void method2575(byte arg0) {
        if (arg0 != 98) {
            return;
        }
        field6067++;
        if (this.field6053 != null) {
            for (int var2 = 0; var2 < this.field6053.length; var2++) {
                this.field6053[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(II)I", line = 923)
    public final int method2576(int arg0, int arg1) {
        field6038++;
        if (!this.method2552(-87)) {
            return -1;
        }
        int var3 = this.field6057.field1559.method1868(arg1, (byte) 90);
        if (arg0 <= 71) {
            return -86;
        } else if (this.method2551(var3, false)) {
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 945)
    public final int method2577(String arg0, int arg1) {
        field6060++;
        if (!this.method2552(-83)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 0) {
            this.field6069 = null;
        }
        int var4 = this.field6057.field1559.method1868(class370.method2076(var3, arg1 - 9063), (byte) 44);
        return this.method2555(arg1 ^ 0x7F04, var4);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 962)
    public final boolean method2578(int arg0, String arg1) {
        field6075++;
        if (!this.method2552(-34)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 >= -85) {
            this.field6053 = null;
        }
        int var4 = this.field6057.field1559.method1868(class370.method2076(var3, -9063), (byte) 115);
        return this.method2581(var4, false);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(ILjava/lang/String;)I", line = 981)
    public final int method2579(int arg0, String arg1) {
        field6073++;
        if (!this.method2552(-95)) {
            return -1;
        }
        if (arg0 != -1) {
            this.field6068 = 21;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field6057.field1559.method1868(class370.method2076(var3, -9063), (byte) 33);
        return this.method2551(var4, false) ? var4 : -1;
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(II)V", line = 1012)
    public final void method2580(int arg0, int arg1) {
        field6072++;
        if (this.method2551(arg1, false) && arg0 == 26424 && this.field6049 != null) {
            this.field6049[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(IZ)Z", line = 1032)
    public final boolean method2581(int arg0, boolean arg1) {
        if (arg1) {
            this.field6049 = null;
        }
        field6056++;
        if (!this.method2551(arg0, arg1)) {
            return false;
        } else if (this.field6053[arg0] == null) {
            this.method2556((byte) -91, arg0);
            return this.field6053[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ltk;ZI)V", line = 1063)
    public class438(class288 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6068 = arg2;
        this.field6050 = arg1;
        this.field6069 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 1085)
    public final boolean method2582(String arg0, String arg1, int arg2) {
        field6064++;
        if (!this.method2552(-95)) {
            return false;
        } else if (arg2 >= -110) {
            return false;
        } else {
            String var4 = arg0.toLowerCase();
            String var5 = arg1.toLowerCase();
            int var6 = this.field6057.field1559.method1868(class370.method2076(var4, -9063), (byte) 110);
            if (this.method2551(var6, false)) {
                int var7 = this.field6057.field1561[var6].method1868(class370.method2076(var5, -9063), (byte) 81);
                return this.method2563(var6, (byte) 105, var7);
            } else {
                return false;
            }
        }
    }
}
