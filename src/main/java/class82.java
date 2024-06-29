import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class82 extends class139 {

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    private int field1621 = -1;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    private int field1623 = -32768;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Lbb;")
    private class88 field1629 = null;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    private int field1639 = -1;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lfa;")
    private class240 field1620;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "[Z")
    public static boolean[] field1633 = new boolean[200];

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "[I")
    public static int[] field1630 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "[I")
    public static int[] field1638;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method549(int arg0, Component arg1) {
        arg1.removeMouseListener(class13.field346);
        int var2 = 127 / ((arg0 - 26) / 63);
        field1619++;
        arg1.removeMouseMotionListener(class13.field346);
        arg1.removeFocusListener(class13.field346);
        class138.field2557 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static void method550(int arg0) {
        if (arg0 == 4) {
            field1633 = null;
            field1638 = null;
            field1630 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([Loh;I)[Loh;")
    public static final class263[] method551(class263[] arg0, int arg1) {
        if (arg1 != 24526) {
            return null;
        }
        field1626++;
        class263[] var2 = new class263[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class124.method797(-44, new class263[] { class136.method891(-113, var3), class223.field3946 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class124.method797(-81, new class263[] { var2[var3], arg0[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZZ)Lnj;")
    private final class139 method552(boolean arg0, boolean arg1) {
        field1616++;
        boolean var3 = class163.field2968 != class112.field2102;
        class12 var4 = class117.method763(this.field1635, (byte) 33);
        if (var4.field328 != null) {
            var4 = var4.method97(105);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field1622 & 0x3;
        if (arg1) {
            return null;
        }
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field308;
            var7 = var4.field329;
        } else {
            var6 = var4.field329;
            var7 = var4.field308;
        }
        int var8 = (var6 >> 1) + this.field1636;
        int var9 = (var6 + 1 >> 1) + this.field1636;
        int var10 = (var7 >> 1) + this.field1618;
        int var11 = (var7 + 1 >> 1) + this.field1618;
        this.method554(var10 * 128, var8 * 128, -1);
        boolean var12 = !var3 && var4.field265 && (this.field1639 != var4.field335 || this.field1632 != this.field1621 && class277.field4853 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class112.field2102[this.field1628];
        int var14 = (this.field1636 << 7) + (var6 << 6);
        int var15 = var13[var8][var10] + var13[var9][var10] + var13[var8][var11] + var13[var9][var11] >> 2;
        int[][] var16 = null;
        int var17 = (this.field1618 << 7) + (var7 << 6);
        if (var3) {
            var16 = class163.field2968[0];
        } else if (this.field1628 < 3) {
            var16 = class112.field2102[this.field1628 + 1];
        }
        boolean var18 = this.field1629 == null;
        class100 var19;
        if (this.field1620 == null) {
            var19 = var4.method93(var16, var15, var17, var12, var13, false, var14, this.field1637, var18 ? class70.field1417 : this.field1629, -27556, this.field1622);
        } else {
            var19 = var4.method98(this.field1622, var18 ? class70.field1417 : this.field1629, this.field1632, var13, var12, this.field1620, var14, var17, var15, var16, -35, this.field1637);
        }
        return var19 == null ? null : var19.field1911;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IZ)V")
    public static final void method553(int arg0, boolean arg1) {
        field1634++;
        class99.method678(arg1, arg0 + 32772, class143.field2616, class186.field3353, class138.field2558);
        if (arg0 != -32768) {
            method550(11);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()I")
    public final int method106() {
        field1617++;
        return this.field1623;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(III)V")
    private final void method554(int arg0, int arg1, int arg2) {
        if (this.field1620 != null) {
            int var4 = class228.field4012 - this.field1625;
            if (var4 > 100 && this.field1620.field4223 > 0) {
                int var5 = this.field1620.field4211.length - this.field1620.field4223;
                while (var5 > this.field1632 && var4 > this.field1620.field4219[this.field1632]) {
                    var4 -= this.field1620.field4219[this.field1632];
                    this.field1632++;
                }
                if (var5 <= this.field1632) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1620.field4211.length; var7++) {
                        var6 += this.field1620.field4219[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (this.field1620.field4219[this.field1632] >= var4) {
                            break label62;
                        }
                        class219.method1490(false, arg0, this.field1632, -64, this.field1620, arg1);
                        var4 -= this.field1620.field4219[this.field1632];
                        this.field1632++;
                    } while (this.field1632 < this.field1620.field4211.length);
                    this.field1632 -= this.field1620.field4223;
                } while (this.field1632 >= 0 && this.field1632 < this.field1620.field4211.length);
                this.field1620 = null;
            }
            this.field1625 = class228.field4012 - var4;
        }
        if (arg2 != -1) {
            method550(34);
        }
        field1613++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lnj;")
    private final class139 method555(byte arg0) {
        field1624++;
        if (arg0 < 19) {
            method549(92, (Component) null);
        }
        return this.method552(false, false);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1614++;
        class139 var11 = this.method555((byte) 112);
        if (var11 != null) {
            var11.method105(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1623 = var11.method106();
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 54) {
            this.field1618 = 15;
        }
        this.method554((arg3 + (arg0 - arg3 >> 1)) * 128 + 64, ((-arg4 + arg2 >> 1) + arg4) * 128 - -64, -1);
        field1631++;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIIIZLnj;)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class139 arg8) {
        this.field1637 = arg1;
        this.field1628 = arg3;
        this.field1618 = arg5;
        this.field1636 = arg4;
        this.field1622 = arg2;
        this.field1635 = arg0;
        if (arg6 != -1) {
            this.field1620 = class186.method1226(12828, arg6);
            this.field1632 = 0;
            this.field1625 = class228.field4012 - 1;
            if (this.field1620.field4193 == 0 && arg8 != null && arg8 instanceof class82) {
                class82 var10 = (class82) arg8;
                if (this.field1620 == var10.field1620) {
                    this.field1625 = var10.field1625;
                    this.field1632 = var10.field1632;
                    return;
                }
            }
            if (arg7 && this.field1620.field4223 != -1) {
                this.field1632 = (int) ((double) this.field1620.field4211.length * Math.random());
                this.field1625 -= (int) (Math.random() * (double) this.field1620.field4219[this.field1632]);
                return;
            }
        }
    }
}
