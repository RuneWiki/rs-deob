import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class97 implements class230 {

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
    private boolean field1627 = false;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    private int field1630 = 50;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lek;")
    private class172 field1621;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lek;")
    private class172 field1638;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Loh;")
    private class15 field1624;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Loh;")
    private class15 field1634;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "[S")
    private short[] field1635;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "[Z")
    private boolean[] field1651;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "[B")
    private byte[] field1646;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[B")
    private byte[] field1623;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "[Z")
    private boolean[] field1639;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "[Z")
    private boolean[] field1663;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[B")
    private byte[] field1629;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "[Z")
    private boolean[] field1660;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "[Z")
    private boolean[] field1655;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "[B")
    private byte[] field1631;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Z")
    public static boolean field1626 = false;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "Lbe;")
    public static class283 field1648 = class153.method941(-82, "weiss:");

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Z")
    public static boolean field1618 = false;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field1656 = 0;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "[I")
    public static int[] field1659;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[[I")
    public static int[][] field1636;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(II)Z", line = 4)
    public final boolean method627(int arg0, int arg1) {
        if (arg1 != -1) {
            method647(82, -39, 44, (byte) -63, 77, 56);
        }
        field1654++;
        return this.field1651[arg0];
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)[I", line = 16)
    public final int[] method628(byte arg0, int arg1) {
        class295 var3 = this.method636(0, arg1);
        field1644++;
        if (var3 == null) {
            return null;
        } else {
            if (arg0 >= -49) {
                this.method641(107, (byte) 4);
            }
            return var3.method1997(-98, this.field1621, this, this.field1627 || this.field1663[arg1]);
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)I", line = 32)
    public final int method629(int arg0, int arg1) {
        field1653++;
        int var3 = 0 % ((9 - arg0) / 36);
        return this.field1623[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V", line = 46)
    public final void method630(boolean arg0, int arg1) {
        if (arg1 == -2) {
            this.field1627 = arg0;
            this.method635(arg1 + 117);
            field1661++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(II)Lwb;", line = 61)
    private final class144 method631(int arg0, int arg1) {
        if (arg1 < 81) {
            return (class144) null;
        }
        class144 var3 = (class144) this.field1634.method77((long) arg0, 12);
        field1640++;
        if (var3 == null) {
            class144 var4 = new class144(this.field1635[arg0] & 0xFFFF);
            this.field1634.method85(var4, (long) arg0, (byte) 96);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)Z", line = 79)
    public final boolean method632(byte arg0, int arg1) {
        field1625++;
        if (this.field1627 || this.field1663[arg1]) {
            return true;
        } else {
            return arg0 != 81;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(FBI)[I", line = 95)
    public final int[] method633(float arg0, byte arg1, int arg2) {
        field1647++;
        if (arg1 <= 26) {
            this.field1621 = (class172) null;
        }
        class295 var4 = this.method636(0, arg2);
        if (var4 == null) {
            return null;
        } else {
            var4.field4977 = true;
            return var4.method1995(this, this.field1627 || this.field1663[arg2], arg0, this.field1621, -76);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V", line = 113)
    public final void method634(int arg0, int arg1) {
        field1637++;
        class284.method1954(this.field1631[arg0] & 0xFF, (byte) -97, this.field1623[arg0] & 0xFF);
        if (arg1 != 773268577) {
            this.method630(false, 50);
        }
        boolean var3 = false;
        class295 var4 = this.method636(0, arg0);
        if (var4 != null) {
            var3 = var4.method1999(this.field1627 || this.field1663[arg0], (byte) -36, this, this.field1621);
        }
        if (!var3) {
            class144 var5 = this.method631(arg0, 127);
            var5.method906((byte) 58);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 144)
    public final void method635(int arg0) {
        this.field1624.method78(-3303);
        this.field1634.method78(-3303);
        field1641++;
        if (arg0 < 20) {
            this.method639(105, 34);
        }
    }

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "(II)Lpi;", line = 159)
    private final class295 method636(int arg0, int arg1) {
        field1622++;
        class295 var3 = (class295) this.field1624.method77((long) arg1, 12);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1638.method1107(arg1, arg0, 121);
        if (var4 == null) {
            return null;
        } else {
            class229 var5 = new class229(var4);
            class295 var6 = new class295(var5);
            this.field1624.method85(var6, (long) arg1, (byte) -79);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I", line = 184)
    public final int method637(int arg0, int arg1) {
        if (arg0 != -1) {
            method644(-85, (class172) null);
        }
        field1649++;
        return this.field1629[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I", line = 195)
    public final int method638(int arg0, int arg1) {
        field1615++;
        return arg0 == 255 ? this.field1631[arg1] & 0xFF : 106;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(II)Z", line = 213)
    public final boolean method639(int arg0, int arg1) {
        if (arg1 != 255) {
            field1636 = (int[][]) ((int[][]) null);
        }
        field1650++;
        class295 var3 = this.method636(0, arg0);
        return var3 == null ? false : var3.method2000((byte) 49, this, this.field1621);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lek;Z)V", line = 232)
    public static final void method640(class172 arg0, boolean arg1) {
        if (arg1) {
            field1657++;
            class190.field3253 = arg0;
            class297.field5034 = class190.field3253.method1108(16, -106);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)I", line = 245)
    public final int method641(int arg0, byte arg1) {
        field1645++;
        return arg1 == -92 ? this.field1635[arg0] & 0xFFFF : 89;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 260)
    public static void method642(int arg0) {
        field1636 = (int[][]) null;
        if (arg0 != 9868) {
            field1659 = (int[]) null;
        }
        field1648 = null;
        field1659 = null;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(II)I", line = 273)
    public final int method643(int arg0, int arg1) {
        if (arg0 > -16) {
            return 115;
        } else {
            field1642++;
            return this.field1646[arg1] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILek;)V", line = 294)
    public static final void method644(int arg0, class172 arg1) {
        if (arg0 != 14700) {
            field1626 = false;
        }
        field1620++;
        class34.field516 = arg1.method1097(class83.field1412, 0);
        class18.field210 = arg1.method1097(class291.field4936, 0);
        class226.field3804 = arg1.method1097(class18.field217, arg0 - 14700);
        class196.field3351 = arg1.method1097(class263.field4475, 0);
    }

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "(II)V", line = 310)
    public static final void method645(int arg0, int arg1) {
        field1632++;
        if (arg1 == -13734) {
            class72 var2 = class25.method174(arg0, (byte) -45, 7);
            var2.method479(123);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I", line = 328)
    public static final int method646(int arg0, int arg1, int arg2) {
        class74 var3 = (class74) class170.field2860.method1612((long) arg1, 96);
        field1643++;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1288.length; var5++) {
                if (var3.field1290[var5] == arg0) {
                    var4 += var3.field1288[var5];
                }
            }
            if (arg2 >= -73) {
                return 87;
            } else {
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIBII)V", line = 377)
    public static final void method647(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1652++;
        int var6 = arg0 - arg5;
        int var7 = arg1 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class16.method88(arg2, -30009, arg4, arg0, arg5);
            }
        } else if (var6 == 0) {
            class46.method269(arg4, arg2, arg1, (byte) 108, arg5);
        } else {
            if (arg3 < 39) {
                field1648 = (class283) null;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg4;
                arg4 = arg5;
                arg5 = var9;
                int var10 = arg1;
                arg1 = arg0;
                arg0 = var10;
            }
            if (arg4 > arg1) {
                int var11 = arg4;
                arg4 = arg1;
                arg1 = var11;
                int var12 = arg5;
                arg5 = arg0;
                arg0 = var12;
            }
            int var13 = arg5;
            int var14 = arg1 - arg4;
            int var15 = arg0 - arg5;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = arg0 <= arg5 ? -1 : 1;
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var19 = arg4; var19 <= arg1; var19++) {
                    var17 += var15;
                    field1636[var19][var13] = arg2;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            } else {
                for (int var18 = arg4; var18 <= arg1; var18++) {
                    field1636[var13][var18] = arg2;
                    var17 += var15;
                    if (var17 > 0) {
                        var13 += var16;
                        var17 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lek;Lek;I)V", line = 497)
    public static final void method648(class172 arg0, class172 arg1, int arg2) {
        int var3 = -84 % ((arg2 - 58) / 41);
        field1617++;
        class66.field926 = arg0;
        class92.field1563 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lek;Lek;Lek;IZ)V", line = 597)
    public class97(class172 arg0, class172 arg1, class172 arg2, int arg3, boolean arg4) {
        this.field1621 = arg2;
        this.field1630 = arg3;
        this.field1627 = arg4;
        this.field1638 = arg0;
        this.field1624 = new class15(this.field1630);
        this.field1634 = new class15(this.field1630);
        class229 var6 = new class229(arg1.method1107(0, 0, 119));
        int var7 = var6.method1496(true);
        this.field1635 = new short[var7];
        this.field1651 = new boolean[var7];
        this.field1646 = new byte[var7];
        this.field1623 = new byte[var7];
        this.field1639 = new boolean[var7];
        this.field1663 = new boolean[var7];
        this.field1629 = new byte[var7];
        this.field1660 = new boolean[var7];
        this.field1655 = new boolean[var7];
        this.field1631 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1655[var8] = var6.method1535((byte) 127) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1655[var9]) {
                this.field1660[var9] = var6.method1535((byte) 76) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1655[var10]) {
                this.field1651[var10] = var6.method1535((byte) 70) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1655[var11]) {
                this.field1663[var11] = var6.method1535((byte) 73) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1655[var12]) {
                this.field1639[var12] = var6.method1535((byte) 121) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1655[var13]) {
                this.field1629[var13] = var6.method1497(false);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1655[var14]) {
                this.field1646[var14] = var6.method1497(false);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1655[var15]) {
                this.field1623[var15] = var6.method1497(false);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1655[var16]) {
                this.field1631[var16] = var6.method1497(false);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1655[var17]) {
                this.field1635[var17] = (short) var6.method1496(true);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(II)Z", line = 526)
    public final boolean method649(int arg0, int arg1) {
        field1658++;
        if (arg0 != -27065) {
            field1659 = (int[]) null;
        }
        return this.field1639[arg1];
    }

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "(II)V", line = 539)
    public final void method650(int arg0, int arg1) {
        field1616++;
        if (arg0 != 0) {
            return;
        }
        for (class295 var3 = (class295) this.field1624.method82(-120); var3 != null; var3 = (class295) this.field1624.method87(8)) {
            if (var3.field4977) {
                var3.method2005(arg0 ^ 0xFFFFFF8A, arg1);
                var3.field4977 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(BI)I", line = 570)
    public static final int method651(byte arg0, int arg1) {
        field1662++;
        if (arg0 != -93) {
            method645(-57, -15);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z", line = 587)
    public final boolean method652(int arg0, byte arg1) {
        field1633++;
        if (arg1 <= 49) {
            this.method638(-102, -64);
        }
        return this.field1660[arg0];
    }
}
