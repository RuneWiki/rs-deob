import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class107 implements class161 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    private int field1641 = 50;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Z")
    private boolean field1646 = false;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Ljl;")
    private class101 field1661;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Ljl;")
    private class101 field1640;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lmg;")
    private class53 field1657;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lmg;")
    private class53 field1659;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[Z")
    private boolean[] field1644;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "[B")
    private byte[] field1652;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[B")
    private byte[] field1648;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[Z")
    private boolean[] field1647;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "[B")
    private byte[] field1654;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[Z")
    private boolean[] field1660;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "[S")
    private short[] field1664;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "[Z")
    private boolean[] field1655;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "[B")
    private byte[] field1658;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[Z")
    private boolean[] field1649;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Leg;")
    public static class37 field1651 = class174.method1167("Clientscript error in: ", -45);

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "[I")
    public static int[] field1670 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lbf;")
    public static class202 field1662 = new class202(100);

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "Leg;")
    public static class37 field1673 = class174.method1167(")1", 78);

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Leg;")
    public static class37 field1674 = class174.method1167("comp-Btence ", -60);

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "Leg;")
    public static class37 field1675 = class174.method1167("overlay2", -119);

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Leg;")
    public static class37 field1672 = class174.method1167(" )2> <col=ff9040>", -19);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "[Lja;")
    public static class105[] field1671;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "[[[S")
    public static short[][][] field1676;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)Z")
    public final boolean method708(boolean arg0, int arg1) {
        field1665++;
        if (!arg0) {
            method720((byte) 61);
        }
        return this.field1655[arg1];
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)Z")
    public final boolean method709(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1641 = -58;
        }
        field1642++;
        return this.field1646 || this.field1649[arg0];
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)[I")
    public final int[] method710(int arg0, int arg1) {
        class210 var3 = this.method715(arg1, false);
        field1668++;
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -28433) {
                field1662 = null;
            }
            return var3.method1474(this.field1646 || this.field1649[arg1], this.field1661, this, 64);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
    public final boolean method711(int arg0, int arg1) {
        if (arg0 == -2283) {
            field1666++;
            return this.field1660[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public final void method712(int arg0) {
        this.field1657.method346(29);
        field1639++;
        int var2 = -72 / ((48 - arg0) / 53);
        if (this.field1659 != null) {
            this.field1659.method346(73);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V")
    public final void method713(boolean arg0, int arg1) {
        if (arg1 == 255) {
            field1663++;
            this.field1646 = arg0;
            this.method712(arg1 ^ 0x96);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FBI)[I")
    public final int[] method714(float arg0, byte arg1, int arg2) {
        field1645++;
        class210 var4 = this.method715(arg2, false);
        if (arg1 != -17) {
            this.field1658 = null;
        }
        if (var4 == null) {
            return null;
        } else {
            var4.field3609 = true;
            return var4.method1475(arg0, this, this.field1661, this.field1646 || this.field1649[arg2], (byte) -86);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)Lea;")
    private final class210 method715(int arg0, boolean arg1) {
        field1656++;
        class210 var3 = (class210) this.field1657.method344((byte) 14, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        if (arg1) {
            this.field1660 = null;
        }
        byte[] var4 = this.field1640.method666(0, arg0, (byte) -51);
        if (var4 == null) {
            return null;
        } else {
            class187 var5 = new class187(var4);
            class210 var6 = new class210(var5);
            this.field1657.method341((byte) 16, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
    public final void method716(byte arg0, int arg1) {
        field1643++;
        for (class210 var3 = (class210) this.field1657.method348((byte) 110); var3 != null; var3 = (class210) this.field1657.method347(64)) {
            if (var3.field3609) {
                var3.method1473(arg1, 128);
                var3.field3609 = false;
            }
        }
        if (arg0 >= -123) {
            this.field1658 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)I")
    public final int method717(int arg0, int arg1) {
        if (arg0 == 0) {
            field1650++;
            return this.field1664[arg1] & 0xFFFF;
        } else {
            return -33;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)Z")
    public final boolean method718(int arg0, int arg1) {
        field1667++;
        class210 var3 = this.method715(arg1, false);
        if (arg0 != 255) {
            this.field1647 = null;
        }
        return var3 == null ? false : var3.method1477(this.field1661, this, arg0 - 256);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILeg;)I")
    public static final int method719(int arg0, class37 arg1) {
        field1669++;
        if (class146.field2477 == null || arg1.method222((byte) 84) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class146.field2477.field74; var2++) {
            if (class146.field2477.field67[var2].method214((byte) 68, class56.field853, class241.field4337).method225(arg1, 0)) {
                return var2;
            }
        }
        if (arg0 != 4) {
            method720((byte) 112);
        }
        return -1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method720(byte arg0) {
        field1673 = null;
        field1675 = null;
        field1662 = null;
        field1672 = null;
        field1651 = null;
        field1674 = null;
        field1670 = null;
        if (arg0 != -71) {
            method720((byte) 15);
        }
        field1676 = null;
        field1671 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljl;Ljl;Ljl;IZ)V")
    public class107(class101 arg0, class101 arg1, class101 arg2, int arg3, boolean arg4) {
        this.field1646 = arg4;
        this.field1641 = arg3;
        this.field1661 = arg2;
        this.field1640 = arg0;
        this.field1657 = new class53(this.field1641);
        this.field1659 = null;
        class187 var6 = new class187(arg1.method666(0, 0, (byte) -51));
        int var7 = var6.method1244(false);
        this.field1644 = new boolean[var7];
        this.field1652 = new byte[var7];
        this.field1648 = new byte[var7];
        this.field1647 = new boolean[var7];
        this.field1654 = new byte[var7];
        this.field1660 = new boolean[var7];
        this.field1664 = new short[var7];
        this.field1655 = new boolean[var7];
        this.field1658 = new byte[var7];
        this.field1649 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1647[var8] = var6.method1268(255) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1647[var9]) {
                this.field1655[var9] = var6.method1268(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1647[var10]) {
                this.field1660[var10] = var6.method1268(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1647[var11]) {
                this.field1649[var11] = var6.method1268(255) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1647[var12]) {
                this.field1644[var12] = var6.method1268(255) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1647[var13]) {
                this.field1652[var13] = var6.method1269(255);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1647[var14]) {
                this.field1654[var14] = var6.method1269(255);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1647[var15]) {
                this.field1648[var15] = var6.method1269(255);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1647[var16]) {
                this.field1658[var16] = var6.method1269(255);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1647[var17]) {
                this.field1664[var17] = (short) var6.method1244(false);
            }
        }
    }
}
