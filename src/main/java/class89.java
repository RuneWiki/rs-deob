import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class89 implements class121 {

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    private int field1603 = 50;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Z")
    private boolean field1612 = false;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lum;")
    private class222 field1577;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lum;")
    private class222 field1588;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lqc;")
    private class329 field1602;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lqc;")
    private class329 field1583;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[Z")
    private boolean[] field1579;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[B")
    private byte[] field1580;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "[B")
    private byte[] field1599;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[B")
    private byte[] field1601;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[Z")
    private boolean[] field1576;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[Z")
    private boolean[] field1587;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[B")
    private byte[] field1604;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[S")
    private short[] field1581;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[Z")
    private boolean[] field1584;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "[Z")
    private boolean[] field1607;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "[[I")
    public static int[][] field1591 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field1592 = 0;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "[[[I")
    public static int[][][] field1600 = new int[4][13][13];

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)Z", line = 4)
    public final boolean method619(int arg0, boolean arg1) {
        field1611++;
        if (arg1) {
            this.method627(-94, 127);
        }
        return this.field1587[arg0];
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(II)[I", line = 16)
    public final int[] method620(int arg0, int arg1) {
        if (arg1 < 8) {
            return (int[]) null;
        } else {
            class36 var3 = this.method636(0, arg0);
            field1615++;
            return var3 == null ? null : var3.method283(64, this, this.field1612 || this.field1579[arg0], this.field1588);
        }
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(II)V", line = 36)
    public final void method621(int arg0, int arg1) {
        class171.method1211(this.field1580[arg1] & 0xFF, this.field1604[arg1] & 0xFF, false);
        field1582++;
        boolean var3 = false;
        class36 var4 = this.method636(arg0 ^ arg0, arg1);
        if (var4 != null) {
            var3 = var4.method281(this.field1588, this.field1612 || this.field1579[arg1], false, this);
        }
        if (!var3) {
            class281 var5 = this.method630(arg1, 0);
            var5.method1956(arg0 - 247);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I", line = 61)
    public final int method622(int arg0, int arg1) {
        if (arg0 == 255) {
            field1590++;
            return this.field1604[arg1] & 0xFF;
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(BI)V", line = 83)
    public final void method623(byte arg0, int arg1) {
        field1589++;
        if (arg0 > -54) {
            return;
        }
        this.field1603 = arg1;
        this.field1602 = new class329(this.field1603);
        if (class147.field2485) {
            this.field1583 = new class329(this.field1603);
        } else {
            this.field1583 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IFB)[I", line = 110)
    public final int[] method624(int arg0, float arg1, byte arg2) {
        field1578++;
        if (arg2 <= 61) {
            field1600 = (int[][][]) ((int[][][]) null);
        }
        class36 var4 = this.method636(0, arg0);
        if (var4 == null) {
            return null;
        } else {
            var4.field589 = true;
            return var4.method279(arg1, this, this.field1612 || this.field1579[arg0], 123, this.field1588);
        }
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "(II)Z", line = 133)
    public final boolean method625(int arg0, int arg1) {
        field1595++;
        if (arg0 <= 52) {
            field1605 = 34;
        }
        return this.field1584[arg1];
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(II)Z", line = 144)
    public final boolean method626(int arg0, int arg1) {
        field1593++;
        return arg0 == 255 ? this.field1607[arg1] : true;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(II)I", line = 159)
    public final int method627(int arg0, int arg1) {
        field1585++;
        if (arg1 > -111) {
            this.method625(0, -56);
        }
        return this.field1581[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I", line = 173)
    public final int method628(int arg0, int arg1) {
        field1609++;
        if (arg0 < 124) {
            field1605 = 117;
        }
        return this.field1580[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V", line = 188)
    public final void method629(boolean arg0, int arg1) {
        field1610++;
        this.field1612 = arg0;
        this.method633((byte) 35);
        if (arg1 != 128) {
            this.field1576 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lum;Lum;Lum;IZ)V", line = 314)
    public class89(class222 arg0, class222 arg1, class222 arg2, int arg3, boolean arg4) {
        this.field1577 = arg0;
        this.field1603 = arg3;
        this.field1588 = arg2;
        this.field1612 = arg4;
        this.field1602 = new class329(this.field1603);
        if (class147.field2485) {
            this.field1583 = new class329(this.field1603);
        } else {
            this.field1583 = null;
        }
        class153 var6 = new class153(arg1.method1577(0, 0, -29569));
        int var7 = var6.method1090(false);
        this.field1579 = new boolean[var7];
        this.field1580 = new byte[var7];
        this.field1599 = new byte[var7];
        this.field1601 = new byte[var7];
        this.field1576 = new boolean[var7];
        this.field1587 = new boolean[var7];
        this.field1604 = new byte[var7];
        this.field1581 = new short[var7];
        this.field1584 = new boolean[var7];
        this.field1607 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1576[var8] = var6.method1082(-32) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1576[var9]) {
                this.field1584[var9] = var6.method1082(-50) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1576[var10]) {
                this.field1607[var10] = var6.method1082(-72) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1576[var11]) {
                this.field1579[var11] = var6.method1082(-38) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1576[var12]) {
                this.field1587[var12] = var6.method1082(-85) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1576[var13]) {
                this.field1599[var13] = var6.method1104(-1);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1576[var14]) {
                this.field1601[var14] = var6.method1104(-1);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1576[var15]) {
                this.field1580[var15] = var6.method1104(-1);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1576[var16]) {
                this.field1604[var16] = var6.method1104(-1);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1576[var17]) {
                this.field1581[var17] = (short) var6.method1090(false);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "(II)Lrg;", line = 209)
    private final class281 method630(int arg0, int arg1) {
        field1597++;
        class281 var3 = (class281) this.field1583.method2250((long) arg0, false);
        if (var3 != null) {
            return var3;
        }
        class281 var4 = new class281(this.field1581[arg0] & 0xFFFF);
        if (arg1 != 0) {
            this.method619(-74, true);
        }
        this.field1583.method2255(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 232)
    public static void method631(int arg0) {
        if (arg0 != 4520) {
            method631(17);
        }
        field1600 = (int[][][]) null;
        field1591 = (int[][]) null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)I", line = 248)
    public final int method632(int arg0, byte arg1) {
        if (arg1 >= -12) {
            return -10;
        } else {
            field1606++;
            return this.field1601[arg0] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 259)
    public final void method633(byte arg0) {
        field1614++;
        if (arg0 != 35) {
            this.method632(70, (byte) 56);
        }
        this.field1602.method2254(-2705);
        if (this.field1583 != null) {
            this.field1583.method2254(arg0 - 2740);
        }
    }

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "(II)I", line = 274)
    public final int method634(int arg0, int arg1) {
        if (arg1 != 64) {
            this.method625(68, 121);
        }
        field1586++;
        return this.field1599[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "(II)V", line = 288)
    public final void method635(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        field1596++;
        for (class36 var3 = (class36) this.field1602.method2251((byte) 87); var3 != null; var3 = (class36) this.field1602.method2252(-1462)) {
            if (var3.field589) {
                var3.method280(90, arg1);
                var3.field589 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "(II)Lrf;", line = 441)
    private final class36 method636(int arg0, int arg1) {
        field1608++;
        class36 var3 = (class36) this.field1602.method2250((long) arg1, false);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1577.method1577(arg1, 0, arg0 ^ 0xFFFF8C7F);
        if (var4 == null) {
            return null;
        }
        class153 var5 = new class153(var4);
        class36 var6 = new class36(var5);
        this.field1602.method2255(var6, (long) arg1, false);
        if (arg0 != 0) {
            this.method636(97, -123);
        }
        return var6;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Z", line = 468)
    public final boolean method637(byte arg0, int arg1) {
        field1613++;
        class36 var3 = this.method636(arg0 ^ 0xF, arg1);
        if (arg0 == 15) {
            return var3 == null ? false : var3.method278(this, this.field1588, 31060);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)Z", line = 486)
    public final boolean method638(int arg0, int arg1) {
        field1594++;
        if (this.field1612 || this.field1579[arg1]) {
            return true;
        } else if (arg0 == 0) {
            return false;
        } else {
            return false;
        }
    }
}
