import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class102 implements class250 {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Z")
    private boolean field1622 = false;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    private int field1626 = 50;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Loe;")
    private class256 field1647;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Loe;")
    private class256 field1640;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lwc;")
    private class232 field1649;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[B")
    private byte[] field1633;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "[S")
    private short[] field1646;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "[Z")
    private boolean[] field1644;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[Z")
    private boolean[] field1619;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "[Z")
    private boolean[] field1636;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "[Z")
    private boolean[] field1630;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "[B")
    private byte[] field1638;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "[Z")
    private boolean[] field1637;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "[B")
    private byte[] field1635;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[B")
    private byte[] field1620;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lmj;")
    public static class129 field1625;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(II)V")
    public final void method673(int arg0, int arg1) {
        for (class255 var3 = (class255) this.field1649.method1495((byte) -111); var3 != null; var3 = (class255) this.field1649.method1496(false)) {
            if (var3.field4425) {
                var3.method1683(arg0 ^ 0x8F4EF9F7, arg1);
                var3.field4425 = false;
            }
        }
        if (arg0 != 255) {
            this.field1636 = null;
        }
        field1645++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
    public final int[] method674(int arg0, int arg1) {
        field1621++;
        class255 var3 = this.method677(48, arg0);
        if (arg1 != 1) {
            this.field1626 = -61;
        }
        return var3 == null ? null : var3.method1684(this.field1647, 255, this, this.field1622 || this.field1630[arg0]);
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(II)I")
    public static int method675(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)Z")
    public final boolean method676(int arg0, int arg1) {
        field1643++;
        if (arg0 != 26874) {
            this.field1649 = null;
        }
        class255 var3 = this.method677(100, arg1);
        return var3 == null ? false : var3.method1680(this, true, this.field1647);
    }

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "(II)Lhg;")
    private final class255 method677(int arg0, int arg1) {
        field1629++;
        class255 var3 = (class255) this.field1649.method1499(0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1640.method1712(0, arg1, -1);
        if (var4 == null) {
            return null;
        }
        class112 var5 = new class112(var4);
        class255 var6 = new class255(var5);
        if (arg0 <= 30) {
            method679(null, -119, 127, -17);
        }
        this.field1649.method1502((byte) -18, var6, (long) arg1);
        return var6;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZB)V")
    public final void method678(boolean arg0, byte arg1) {
        this.field1622 = arg0;
        field1627++;
        int var3 = -68 / ((-arg1 - 33) / 53);
        this.method685(25004);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Loe;III)[Luj;")
    public static final class158[] method679(class256 arg0, int arg1, int arg2, int arg3) {
        field1624++;
        if (class9.method34(arg2, arg0, (byte) -16, arg3)) {
            if (arg1 != -11892) {
                field1625 = null;
            }
            return class232.method1503(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(II)Z")
    public final boolean method680(int arg0, int arg1) {
        if (arg0 == 4437) {
            field1642++;
            return this.field1644[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)I")
    public final int method681(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field1644 = null;
        }
        field1634++;
        return this.field1646[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method682(int arg0) {
        class162.field2767.method1497((byte) 93);
        if (arg0 == 0) {
            field1623++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static void method683(int arg0) {
        if (arg0 == -6514) {
            field1625 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Z")
    public final boolean method684(int arg0, int arg1) {
        if (arg1 > -79) {
            this.method677(-111, -41);
        }
        field1641++;
        return this.field1636[arg0];
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public final void method685(int arg0) {
        this.field1649.method1497((byte) 49);
        if (arg0 == 25004) {
            field1639++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Loe;Loe;Loe;IZ)V")
    public class102(class256 arg0, class256 arg1, class256 arg2, int arg3, boolean arg4) {
        this.field1622 = arg4;
        this.field1647 = arg2;
        this.field1626 = arg3;
        this.field1640 = arg0;
        this.field1649 = new class232(this.field1626);
        class112 var6 = new class112(arg1.method1712(0, 0, -1));
        int var7 = var6.method731(false);
        this.field1633 = new byte[var7];
        this.field1646 = new short[var7];
        this.field1644 = new boolean[var7];
        this.field1619 = new boolean[var7];
        this.field1636 = new boolean[var7];
        this.field1630 = new boolean[var7];
        this.field1638 = new byte[var7];
        this.field1637 = new boolean[var7];
        this.field1635 = new byte[var7];
        this.field1620 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1637[var8] = var6.method758(true) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1637[var9]) {
                this.field1644[var9] = var6.method758(true) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1637[var10]) {
                this.field1636[var10] = var6.method758(true) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1637[var11]) {
                this.field1630[var11] = var6.method758(true) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1637[var12]) {
                this.field1619[var12] = var6.method758(true) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1637[var13]) {
                this.field1620[var13] = var6.method750(120);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1637[var14]) {
                this.field1635[var14] = var6.method750(82);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1637[var15]) {
                this.field1638[var15] = var6.method750(91);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1637[var16]) {
                this.field1633[var16] = var6.method750(-90);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1637[var17]) {
                this.field1646[var17] = (short) var6.method731(false);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Z")
    public final boolean method686(int arg0, byte arg1) {
        field1631++;
        if (this.field1622 || this.field1630[arg0]) {
            return true;
        } else {
            int var3 = -111 % ((-arg1 - 64) / 57);
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(FII)[I")
    public final int[] method687(float arg0, int arg1, int arg2) {
        field1628++;
        class255 var4 = this.method677(arg2 + 7001, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg2 != -6963) {
            this.method676(69, 119);
        }
        var4.field4425 = true;
        return var4.method1681(false, this.field1647, arg0, this, this.field1622 || this.field1630[arg1]);
    }
}
