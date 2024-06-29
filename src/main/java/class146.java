import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class146 {

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Lof;")
    private class620 field1616 = new class620(64);

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "Lof;")
    public class620 field1626 = new class620(50);

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "Lgf;")
    public class275 field1627 = new class275(250);

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Lkea;")
    private class237 field1628 = new class237();

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "Lqia;")
    private class21 field1632;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Loh;")
    private class404 field1618;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Z")
    private boolean field1625;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Loh;")
    public class404 field1623;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field1630;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field1631;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[I")
    public static int[] field1609 = new int[1000];

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[I")
    public static int[] field1610 = new int[2];

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Ljava/lang/Object;")
    public static Object field1621;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V", line = 4)
    public final void method903(int arg0, int arg1) {
        int var3 = 29 / ((-arg1 - 36) / 43);
        field1620++;
        this.field1629 = arg0;
        class620 var4 = this.field1626;
        synchronized (this.field1626) {
            this.field1626.method3549(0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILda;Lha;IZLuba;Lha;IZ)Lhu;", line = 17)
    public final class131 method904(int arg0, int arg1, int arg2, int arg3, class59 arg4, class58 arg5, int arg6, boolean arg7, class429 arg8, class58 arg9, int arg10, boolean arg11) {
        field1607++;
        class131 var13 = this.method905(arg10, arg3, arg6, arg5, arg2, arg8, 17302, arg0);
        if (var13 != null) {
            return var13;
        }
        class431 var14 = this.method912((byte) 1, arg2);
        if (arg6 > 1 && var14.field6316 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg6 >= var14.field6280[var16] && var14.field6280[var16] != 0) {
                    var15 = var14.field6316[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method912((byte) 1, var15);
            }
        }
        int[] var17 = var14.method2698(arg0, arg6, 21549, arg5, arg10, arg4, arg9, arg3, arg11, arg8);
        if (var17 == null) {
            return null;
        }
        class131 var18;
        if (arg7) {
            var18 = arg9.method430(32, -103, var17, 36, 36, 0);
        } else {
            var18 = arg5.method430(32, arg1 ^ 0xFFFFFFA8, var17, 36, 36, 0);
        }
        if (arg1 != 0) {
            this.method909(112);
        }
        if (!arg7) {
            class237 var19 = new class237();
            var19.field2819 = arg10;
            var19.field2814 = arg3;
            var19.field2825 = arg5.field581;
            var19.field2818 = arg0;
            var19.field2822 = arg8 != null;
            var19.field2816 = arg2;
            var19.field2817 = arg6;
            this.field1627.method1623((byte) -100, var19, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILha;ILuba;II)Lhu;", line = 85)
    public final class131 method905(int arg0, int arg1, int arg2, class58 arg3, int arg4, class429 arg5, int arg6, int arg7) {
        field1624++;
        this.field1628.field2825 = arg3.field581;
        if (arg6 != 17302) {
            this.field1614 = -25;
        }
        this.field1628.field2817 = arg2;
        this.field1628.field2816 = arg4;
        this.field1628.field2819 = arg0;
        this.field1628.field2822 = arg5 != null;
        this.field1628.field2818 = arg7;
        this.field1628.field2814 = arg1;
        return (class131) this.field1627.method1634(this.field1628, 0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 103)
    public final void method906(int arg0) {
        class620 var2 = this.field1626;
        synchronized (this.field1626) {
            this.field1626.method3549(0);
            if (arg0 != 16246) {
                this.field1608 = -73;
            }
        }
        field1617++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 126)
    public final void method907(byte arg0) {
        class620 var2 = this.field1616;
        synchronized (this.field1616) {
            this.field1616.method3549(0);
        }
        field1612++;
        class620 var3 = this.field1626;
        synchronized (this.field1626) {
            this.field1626.method3549(0);
            if (arg0 < 51) {
                this.field1632 = null;
            }
        }
        class275 var4 = this.field1627;
        synchronized (this.field1627) {
            this.field1627.method1626(0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)V", line = 146)
    public final void method908(int arg0, int arg1) {
        class620 var3 = this.field1616;
        synchronized (this.field1616) {
            this.field1616.method3539((byte) 2, arg1);
        }
        field1615++;
        class620 var4 = this.field1626;
        synchronized (this.field1626) {
            if (arg0 <= 42) {
                this.field1623 = null;
            }
            this.field1626.method3539((byte) 116, arg1);
        }
        class275 var5 = this.field1627;
        synchronized (this.field1627) {
            this.field1627.method1629(0, arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 165)
    public final void method909(int arg0) {
        class275 var2 = this.field1627;
        synchronized (this.field1627) {
            this.field1627.method1626(arg0);
        }
        field1613++;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V", line = 182)
    public final void method910(int arg0) {
        field1611++;
        if (arg0 < 84) {
            return;
        }
        class620 var2 = this.field1616;
        synchronized (this.field1616) {
            this.field1616.method3541(-647);
        }
        class620 var3 = this.field1626;
        synchronized (this.field1626) {
            this.field1626.method3541(-647);
        }
        class275 var4 = this.field1627;
        synchronized (this.field1627) {
            this.field1627.method1628(7347);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V", line = 204)
    public final void method911(int arg0, boolean arg1) {
        if (arg0 > -89) {
            return;
        }
        field1622++;
        if (arg1 != this.field1625) {
            this.field1625 = arg1;
            this.method907((byte) 73);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Lrba;", line = 219)
    public final class431 method912(byte arg0, int arg1) {
        field1619++;
        class620 var3 = this.field1616;
        class431 var4;
        synchronized (this.field1616) {
            var4 = (class431) this.field1616.method3538((long) arg1, arg0 ^ 0x1);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field1618;
        byte[] var6;
        synchronized (this.field1618) {
            var6 = this.field1618.method2481(class190.method1159(arg0 - 98, arg1), class147.method917((byte) 34, arg1), (byte) 103);
        }
        class431 var7 = new class431();
        var7.field6288 = this;
        var7.field6257 = arg1;
        var7.field6281 = new String[] { null, null, class486.field6911.method2936(this.field1608, -88), null, null };
        var7.field6253 = new String[] { null, null, null, null, class486.field6912.method2936(this.field1608, 73) };
        if (var6 != null) {
            var7.method2701(new class244(var6), 127);
        }
        var7.method2704(arg0 ^ 0xFFFFC51A);
        if (var7.field6319 != -1) {
            var7.method2695(this.method912((byte) 1, var7.field6313), this.method912((byte) 1, var7.field6319), arg0 ^ 0xFFFFFF85);
        }
        if (var7.field6303 != -1) {
            var7.method2711(this.method912((byte) 1, var7.field6303), this.method912((byte) 1, var7.field6256), -32768);
        }
        if (arg0 != 1) {
            this.field1616 = null;
        }
        if (!this.field1625 && var7.field6277) {
            var7.field6294 = class486.field6909.method2936(this.field1608, -105);
            var7.field6299 = false;
            var7.field6253 = this.field1631;
            var7.field6331 = 0;
            var7.field6258 = null;
            var7.field6281 = this.field1630;
            if (var7.field6308 != null) {
                boolean var8 = false;
                for (class134 var9 = var7.field6308.method1753(0); var9 != null; var9 = var7.field6308.method1755(arg0 ^ 0xFFFFFF84)) {
                    class703 var10 = this.field1632.method98(true, (int) var9.field1522);
                    if (var10.field9908) {
                        var9.method864(12983);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field6308 = null;
                }
            }
        }
        class620 var11 = this.field1616;
        synchronized (this.field1616) {
            this.field1616.method3537(-58, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V", line = 299)
    public static void method913(int arg0) {
        field1610 = null;
        if (arg0 != 0) {
            field1609 = null;
        }
        field1621 = null;
        field1609 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lnb;IZLqia;Loh;Loh;)V", line = 331)
    public class146(class301 arg0, int arg1, boolean arg2, class21 arg3, class404 arg4, class404 arg5) {
        this.field1632 = arg3;
        this.field1618 = arg4;
        this.field1625 = arg2;
        this.field1623 = arg5;
        this.field1608 = arg1;
        if (this.field1618 == null) {
            this.field1614 = 0;
        } else {
            int var7 = this.field1618.method2478((byte) -49) - 1;
            this.field1614 = this.field1618.method2482(0, var7) + var7 * 256;
        }
        this.field1630 = new String[] { null, null, class486.field6911.method2936(this.field1608, 99), null, null };
        this.field1631 = new String[] { null, null, null, null, class486.field6912.method2936(this.field1608, 74) };
    }
}
