import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class106 extends class114 {

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    private int field1610 = -32768;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    private int field1629 = 0;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    private int field1631 = -1;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "Z")
    public boolean field1620 = false;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    private int field1636 = 0;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Lcc;")
    private class215 field1619;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1612 = "Loaded config";

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field1613 = 1;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1627 = " ";

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "J")
    public static long field1614 = 0L;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field1625 = 0;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Z")
    public static boolean field1615 = false;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "Ls;")
    private class245 field1637;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Llj;")
    public static class26 field1622;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "[I")
    public static int[] field1634;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "[[I")
    public static int[][] field1618;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()I")
    public final int method81() {
        field1630++;
        return this.field1610;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method666(int arg0) {
        field1634 = null;
        field1622 = null;
        field1618 = null;
        if (arg0 != -17373) {
            method667(125, 85, 94);
        }
        field1627 = null;
        field1612 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)V")
    public static final void method667(int arg0, int arg1, int arg2) {
        class196.field2979.method1106(182, false);
        class289.field4494++;
        field1635++;
        if (arg0 < 9) {
            method667(19, 105, -118);
        }
        class196.field2979.method1588(arg1, (byte) 43);
        class196.field2979.method1561(arg2, 255);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V")
    public static final void method668(boolean arg0, int arg1) {
        field1617++;
        if (arg1 == 0 && arg0 != class107.field1669) {
            class107.field1669 = arg0;
            class297.method1990(-10393);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIIJILs;)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class245 arg10) {
        field1623++;
        class14 var13 = this.method669(26224);
        if (var13 != null) {
            var13.method90(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1637);
            this.field1610 = var13.method81();
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Lfk;")
    private final class14 method669(int arg0) {
        field1628++;
        if (arg0 != 26224) {
            method666(55);
        }
        class21 var2 = class236.method1498((byte) -121, this.field1633);
        class14 var3;
        if (this.field1620) {
            var3 = var2.method139(-1, (byte) -104, -1, 0);
        } else {
            var3 = var2.method139(this.field1631, (byte) -104, this.field1636, this.field1629);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1638++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
    public final void method670(int arg0, boolean arg1) {
        field1626++;
        if (this.field1620 || arg1) {
            return;
        }
        this.field1629 += arg0;
        while (this.field1629 > this.field1619.field3219[this.field1636]) {
            this.field1629 -= this.field1619.field3219[this.field1636];
            this.field1636++;
            if (this.field1636 >= this.field1619.field3215.length) {
                this.field1620 = true;
                break;
            }
        }
        if (!this.field1620) {
            client.method966((byte) 52, this.field1636, false, this.field1640, this.field1619, this.field1611);
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIIII)V")
    public class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1640 = arg3;
        this.field1621 = arg1;
        this.field1639 = arg5 + arg6;
        this.field1633 = arg0;
        this.field1632 = arg4;
        this.field1611 = arg2;
        int var8 = class236.method1498((byte) -117, this.field1633).field249;
        if (var8 == -1) {
            this.field1620 = true;
        } else {
            this.field1620 = false;
            this.field1619 = class276.method1829(var8, 29223);
        }
        if (this.field1639 == arg6) {
            client.method966((byte) 52, this.field1636, false, this.field1640, this.field1619, this.field1611);
        }
    }
}
