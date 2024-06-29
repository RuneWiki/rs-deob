import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class101 {

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Leb;")
    private class244 field1566 = null;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Z")
    private boolean field1585;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Z")
    private boolean field1568;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Lcb;")
    private class194 field1558;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "Leg;")
    public static class37 field1587 = class174.method1167("::fpson", -79);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lmc;")
    public static class46 field1560;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "[Ljava/lang/Object;")
    private Object[] field1562;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1583;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Z")
    public final boolean method651(int arg0) {
        field1590++;
        if (!this.method653(22663)) {
            return false;
        }
        int var2 = -69 / ((-arg0 - 50) / 62);
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1566.field4378.length; var4++) {
            int var5 = this.field1566.field4378[var4];
            if (this.field1562[var5] == null) {
                this.method668(0, var5);
                if (this.field1562[var5] == null) {
                    var3 = false;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Leg;I)I")
    public final int method652(class37 arg0, int arg1) {
        field1579++;
        if (!this.method653(22663)) {
            return -1;
        }
        if (arg1 < 104) {
            this.field1568 = true;
        }
        class37 var3 = arg0.method251((byte) -50);
        int var4 = this.field1566.field4391.method1018(var3.method245((byte) -91), (byte) 81);
        return this.method654((byte) -67, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Z")
    private final boolean method653(int arg0) {
        if (arg0 != 22663) {
            field1560 = null;
        }
        field1575++;
        if (this.field1566 == null) {
            this.field1566 = this.field1558.method1344(7672);
            if (this.field1566 == null) {
                return false;
            }
            this.field1562 = new Object[this.field1566.field4387];
            this.field1583 = new Object[this.field1566.field4387][];
        }
        return true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)Z")
    private final boolean method654(byte arg0, int arg1) {
        if (arg0 >= -40) {
            return false;
        }
        field1576++;
        if (!this.method653(22663)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field1566.field4401.length && this.field1566.field4401[arg1] != 0) {
            return true;
        } else if (class227.field3895) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)I")
    public final int method655(int arg0) {
        field1578++;
        if (!this.method653(22663)) {
            throw new IllegalStateException("");
        }
        return arg0 == -29577 ? this.field1566.field4396 : -7;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I")
    private final int method656(int arg0, int arg1) {
        field1557++;
        if (this.method654((byte) -90, arg0)) {
            if (arg1 < 51) {
                field1560 = null;
            }
            return this.field1562[arg0] == null ? this.field1558.method1343(arg0, (byte) 109) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILeg;)I")
    public final int method657(int arg0, class37 arg1) {
        field1567++;
        if (!this.method653(22663)) {
            return 0;
        }
        class37 var3 = arg1.method251((byte) -88);
        if (arg0 != -25325) {
            this.field1568 = true;
        }
        int var4 = this.field1566.field4391.method1018(var3.method245((byte) 62), (byte) 99);
        return this.method656(var4, 110);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)Z")
    public final boolean method658(int arg0, byte arg1) {
        field1574++;
        if (!this.method653(22663)) {
            return false;
        } else if (this.field1566.field4401.length == 1) {
            return this.method667(arg0, 0, (byte) -104);
        } else if (this.method654((byte) -73, arg0)) {
            if (arg1 <= 26) {
                field1560 = null;
            }
            if (this.field1566.field4401[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method667(0, arg0, (byte) -104);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)V")
    public final void method659(int arg0, int arg1) {
        field1589++;
        if (!this.method654((byte) -85, arg0)) {
            return;
        }
        if (arg1 != 0) {
            this.field1583 = null;
        }
        if (this.field1583 != null) {
            this.field1583[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Leg;BLeg;)[B")
    public final byte[] method660(class37 arg0, byte arg1, class37 arg2) {
        field1594++;
        if (!this.method653(22663)) {
            return null;
        }
        class37 var4 = arg0.method251((byte) -61);
        class37 var5 = arg2.method251((byte) -57);
        int var6 = this.field1566.field4391.method1018(var4.method245((byte) -89), (byte) 124);
        if (arg1 > -87) {
            this.method653(-67);
        }
        if (this.method654((byte) -88, var6)) {
            int var7 = this.field1566.field4382[var6].method1018(var5.method245((byte) 106), (byte) 115);
            return this.method666(var7, var6, (byte) -51);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
    public final void method661(int arg0) {
        field1591++;
        if (this.field1583 != null) {
            for (int var2 = 0; var2 < this.field1583.length; var2++) {
                this.field1583[var2] = null;
            }
        }
        if (arg0 > -86) {
            this.method664(-10, 110, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(BI)V")
    private final void method662(byte arg0, int arg1) {
        if (arg0 >= -8) {
            this.method657(43, (class37) null);
        }
        this.field1558.method1340(arg1, false);
        field1581++;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(II)Z")
    public final boolean method663(int arg0, int arg1) {
        field1564++;
        if (arg1 <= 70) {
            this.method668(-73, -52);
        }
        if (!this.method654((byte) -63, arg0)) {
            return false;
        } else if (this.field1562[arg0] == null) {
            this.method668(0, arg0);
            return this.field1562[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)Z")
    private final boolean method664(int arg0, int arg1, byte arg2) {
        field1593++;
        if (!this.method653(22663)) {
            return false;
        }
        if (arg2 != -120) {
            this.field1558 = null;
        }
        if (arg0 >= 0 && arg1 >= 0 && this.field1566.field4401.length > arg0 && arg1 < this.field1566.field4401[arg0]) {
            return true;
        } else if (class227.field3895) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZZB)V")
    public final void method665(boolean arg0, boolean arg1, byte arg2) {
        field1563++;
        if (!this.method653(22663)) {
            return;
        }
        if (arg1) {
            this.field1566.field4389 = null;
            this.field1566.field4391 = null;
        }
        if (arg0) {
            this.field1566.field4377 = null;
            this.field1566.field4382 = null;
        }
        if (arg2 <= 34) {
            this.method674((int[]) null, false, -20);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IIB)[B")
    public final byte[] method666(int arg0, int arg1, byte arg2) {
        field1588++;
        if (arg2 != -51) {
            this.field1568 = true;
        }
        return this.method675((int[]) null, arg1, arg0, (byte) -22);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(IIB)Z")
    public final boolean method667(int arg0, int arg1, byte arg2) {
        field1584++;
        if (!this.method664(arg1, arg0, (byte) -120)) {
            return false;
        } else if (this.field1583[arg1] != null && this.field1583[arg1][arg0] != null) {
            return true;
        } else if (this.field1562[arg1] == null) {
            if (arg2 != -104) {
                this.method666(126, 22, (byte) -112);
            }
            this.method668(arg2 ^ 0xFFFFFF98, arg1);
            return this.field1562[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(II)V")
    private final void method668(int arg0, int arg1) {
        if (this.field1568) {
            this.field1562[arg1] = this.field1558.method1341(arg1, (byte) 88);
        } else {
            this.field1562[arg1] = class43.method285(this.field1558.method1341(arg1, (byte) 77), class4.method24(arg0, -126), false);
        }
        if (arg0 != 0) {
            this.method668(16, -22);
        }
        field1595++;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IB)[B")
    public final byte[] method669(int arg0, byte arg1) {
        field1559++;
        if (!this.method653(22663)) {
            return null;
        } else if (this.field1566.field4401.length == 1) {
            return this.method666(arg0, 0, (byte) -51);
        } else if (this.method654((byte) -128, arg0)) {
            int var3 = 25 / ((-arg1 - 39) / 63);
            if (this.field1566.field4401[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method666(0, arg0, (byte) -51);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 <= 118) {
            method681((byte) -13);
        }
        for (int var9 = 0; var9 < class146.field2477.field74; var9++) {
            int var10 = class146.field2477.field69[var9] - class13.field205;
            int var11 = class228.field3921 + class118.field2004 - class146.field2477.field68[var9] - 1;
            int var12 = (arg0 - arg5) * (var10 - arg2) / (arg3 - arg2) + arg5;
            int var13 = (var11 - arg6) * (arg1 - arg8) / (arg4 - arg6) + arg8;
            int var14 = class146.field2477.method30((byte) -120, var9);
            int var15 = 16777215;
            class11 var16 = null;
            if (var14 == 0) {
                if ((double) class79.field1229 == 3.0D) {
                    var16 = class78.field1213;
                }
                if ((double) class79.field1229 == 4.0D) {
                    var16 = class242.field4356;
                }
                if ((double) class79.field1229 == 6.0D) {
                    var16 = class241.field4310;
                }
                if ((double) class79.field1229 == 8.0D) {
                    var16 = class7.field119;
                }
            }
            if (var14 == 1) {
                if ((double) class79.field1229 == 3.0D) {
                    var16 = class241.field4310;
                }
                if ((double) class79.field1229 == 4.0D) {
                    var16 = class7.field119;
                }
                if ((double) class79.field1229 == 6.0D) {
                    var16 = class2.field39;
                }
                if ((double) class79.field1229 == 8.0D) {
                    var16 = class85.field1330;
                }
            }
            if (var14 == 2) {
                if ((double) class79.field1229 == 3.0D) {
                    var16 = class2.field39;
                }
                if ((double) class79.field1229 == 4.0D) {
                    var16 = class85.field1330;
                }
                if ((double) class79.field1229 == 6.0D) {
                    var16 = class60.field984;
                }
                var15 = 16755200;
                if ((double) class79.field1229 == 8.0D) {
                    var16 = class108.field1686;
                }
            }
            if (class146.field2477.field72[var9] != -1) {
                var15 = class146.field2477.field72[var9];
            }
            if (var16 != null) {
                class37[] var17 = new class37[class146.field2477.field67[var9].method254(false, 60) + 1];
                class92.field1431.method1208(class146.field2477.field67[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - var16.method74() * (var18 - 1) / 2;
                int var20 = var19 + var16.method72() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class37 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method247(0, var17[var21].method222((byte) -119) - 4, 0);
                    var16.method76(var22, var12, var20, var15, true);
                    var20 += var16.method74();
                }
            }
        }
        field1572++;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(IB)[I")
    public final int[] method671(int arg0, byte arg1) {
        field1565++;
        if (!this.method654((byte) -64, arg0)) {
            return null;
        }
        int[] var3 = this.field1566.field4376[arg0];
        if (var3 == null) {
            var3 = new int[this.field1566.field4380[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        if (arg1 != 49) {
            field1560 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(IB)I")
    public final int method672(int arg0, byte arg1) {
        field1573++;
        if (this.method654((byte) -104, arg0)) {
            if (arg1 < 115) {
                this.field1566 = null;
            }
            return this.field1566.field4401[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Leg;ILeg;)Z")
    public final boolean method673(class37 arg0, int arg1, class37 arg2) {
        field1582++;
        if (!this.method653(22663)) {
            return false;
        }
        class37 var4 = arg0.method251((byte) -127);
        class37 var5 = arg2.method251((byte) -34);
        int var6 = this.field1566.field4391.method1018(var4.method245((byte) -101), (byte) 83);
        if (arg1 != -29616) {
            return false;
        } else if (this.method654((byte) -83, var6)) {
            int var7 = this.field1566.field4382[var6].method1018(var5.method245((byte) 50), (byte) 120);
            return this.method667(var7, var6, (byte) -104);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([IZI)Z")
    private final boolean method674(int[] arg0, boolean arg1, int arg2) {
        field1569++;
        if (!this.method654((byte) -103, arg2)) {
            return false;
        } else if (this.field1562[arg2] == null) {
            return false;
        } else {
            int var4 = this.field1566.field4380[arg2];
            int[] var5 = this.field1566.field4376[arg2];
            if (this.field1583[arg2] == null) {
                this.field1583[arg2] = new Object[this.field1566.field4401[arg2]];
            }
            Object[] var6 = this.field1583[arg2];
            boolean var7 = true;
            if (arg1) {
                return false;
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class162.method1089(true, this.field1562[arg2], 16825);
                class187 var11 = new class187(var10);
                var11.method1258(var11.field3175.length, -18205, arg0, 5);
            } else {
                var10 = class162.method1089(false, this.field1562[arg2], 16825);
            }
            byte[] var12;
            try {
                var12 = class242.method1672((byte) 4, var10);
            } catch (RuntimeException var31) {
                throw class268.method1799(var31, "T3 - " + (arg0 != null) + "," + arg2 + "," + var10.length + "," + class24.method145(true, var10.length, var10) + "," + class24.method145(true, var10.length - 2, var10) + "," + this.field1566.field4390[arg2] + "," + this.field1566.field4396);
            }
            if (this.field1568) {
                this.field1562[arg2] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var15 * 4 * var4;
                class187 var17 = new class187(var12);
                int[] var18 = new int[var4];
                var17.field3169 = var16;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var17.method1290((byte) 90);
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                var17.field3169 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var17.method1290((byte) 90);
                        class54.method355(var12, var24, var22[var27], var18[var27], var26);
                        var24 += var26;
                        var18[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field1585) {
                        var6[var29] = var22[var28];
                    } else {
                        var6[var29] = class43.method285(var22[var28], -117, false);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field1585) {
                    var6[var30] = var12;
                } else {
                    var6[var30] = class43.method285(var12, -115, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([IIIB)[B")
    public final byte[] method675(int[] arg0, int arg1, int arg2, byte arg3) {
        field1592++;
        if (!this.method664(arg1, arg2, (byte) -120)) {
            return null;
        }
        if (this.field1583[arg1] == null || this.field1583[arg1][arg2] == null) {
            boolean var5 = this.method674(arg0, false, arg1);
            if (!var5) {
                this.method668(0, arg1);
                boolean var6 = this.method674(arg0, false, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 != -22) {
            this.method678((class37) null, -119);
        }
        byte[] var7 = class162.method1089(false, this.field1583[arg1][arg2], 16825);
        if (this.field1585) {
            this.field1583[arg1][arg2] = null;
            if (this.field1566.field4401[arg1] == 1) {
                this.field1583[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I")
    public final int method676(boolean arg0) {
        field1577++;
        if (arg0) {
            this.method668(-24, -49);
        }
        return this.method653(22663) ? this.field1566.field4401.length : -1;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)I")
    public final int method677(int arg0) {
        field1580++;
        if (!this.method653(22663)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 < 63) {
            return 99;
        }
        for (int var4 = 0; var4 < this.field1562.length; var4++) {
            if (this.field1566.field4380[var4] > 0) {
                var3 += 100;
                var2 += this.method656(var4, 123);
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Leg;I)Z")
    public final boolean method678(class37 arg0, int arg1) {
        field1586++;
        if (arg1 != 0) {
            return true;
        } else if (this.method653(22663)) {
            class37 var3 = arg0.method251((byte) -59);
            int var4 = this.field1566.field4391.method1018(var3.method245((byte) -92), (byte) 81);
            return this.method663(var4, 124);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)[B")
    public final byte[] method679(int arg0, int arg1, int arg2) {
        field1596++;
        if (arg2 > -2) {
            this.method668(-114, -1);
        }
        if (!this.method664(arg0, arg1, (byte) -120)) {
            return null;
        }
        if (this.field1583[arg0] == null || this.field1583[arg0][arg1] == null) {
            boolean var4 = this.method674((int[]) null, false, arg0);
            if (!var4) {
                this.method668(0, arg0);
                boolean var5 = this.method674((int[]) null, false, arg0);
                if (!var5) {
                    return null;
                }
            }
        }
        return class162.method1089(false, this.field1583[arg0][arg1], 16825);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(ILeg;)Z")
    public final boolean method680(int arg0, class37 arg1) {
        field1570++;
        if (!this.method653(22663)) {
            return false;
        }
        class37 var3 = arg1.method251((byte) -85);
        int var4 = this.field1566.field4391.method1018(var3.method245((byte) -120), (byte) 80);
        if (var4 < 0) {
            return false;
        } else {
            if (arg0 != 1) {
                field1587 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lcb;ZZ)V")
    public class101(class194 arg0, boolean arg1, boolean arg2) {
        this.field1585 = arg2;
        this.field1568 = arg1;
        this.field1558 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static void method681(byte arg0) {
        field1587 = null;
        field1560 = null;
        if (arg0 < 56) {
            field1587 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Leg;Z)V")
    public final void method682(class37 arg0, boolean arg1) {
        field1571++;
        if (!this.method653(22663)) {
            return;
        }
        class37 var3 = arg0.method251((byte) -28);
        int var4 = this.field1566.field4391.method1018(var3.method245((byte) 62), (byte) 122);
        if (arg1) {
            this.method660((class37) null, (byte) 52, (class37) null);
        }
        this.method662((byte) -102, var4);
    }
}
