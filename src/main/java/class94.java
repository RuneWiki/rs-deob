import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class94 extends class82 {

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    private int field1748 = -1;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "Ldj;")
    public static class44 field1736 = class89.method650(255, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "Ldj;")
    private static class44 field1744 = class89.method650(255, "flash3:");

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field1747 = 0;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "Ldj;")
    public static class44 field1739 = class89.method650(255, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "Ldj;")
    public static class44 field1742 = field1744;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "Ldj;")
    public static class44 field1752 = class89.method650(255, "");

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "Ldj;")
    public static class44 field1753 = field1744;

    @OriginalMember(owner = "client!ig", name = "mb", descriptor = "[Lnf;")
    public static class147[] field1759 = new class147[256];

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "Lvi;")
    public static class229 field1751;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "Lfj;")
    public static class66 field1743;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "[I")
    public static int[] field1737;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "[I")
    public static int[] field1740;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "[I")
    public static int[] field1745;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "[I")
    public int[] field1746;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)Z")
    public static final boolean method668(int arg0, int arg1, int arg2) {
        int var3 = class170.field2972[arg0][arg1][arg2];
        if (-class188.field3248 == var3) {
            return false;
        } else if (class188.field3248 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class57.method439(var4 + 1, class205.field3675[arg0][arg1][arg2], var5 + 1) && class57.method439(var4 + 128 - 1, class205.field3675[arg0][arg1 + 1][arg2], var5 + 1) && class57.method439(var4 + 128 - 1, class205.field3675[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class57.method439(var4 + 1, class205.field3675[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class170.field2972[arg0][arg1][arg2] = class188.field3248;
                return true;
            } else {
                class170.field2972[arg0][arg1][arg2] = -class188.field3248;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field1749;
        if (arg2 != 68) {
            method672(-47, 19);
        }
        if (~arg1 == -1) {
            this.field1748 = arg0.method500(80);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V")
    public static void method669(byte arg0) {
        field1740 = null;
        if (arg0 > 9) {
            field1742 = null;
            field1759 = null;
            field1752 = null;
            field1743 = null;
            field1753 = null;
            field1737 = null;
            field1751 = null;
            field1736 = null;
            field1744 = null;
            field1739 = null;
            field1745 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)I")
    private static final int method670(int arg0, byte arg1) {
        if (arg1 > -69) {
            method670(-69, (byte) -33);
        }
        ++field1738;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)Z")
    public final boolean method671(int arg0) {
        ++field1756;
        if (this.field1746 != null) {
            return true;
        } else {
            int var2 = 122 % ((arg0 - 22) / 63);
            if (~this.field1748 <= -1) {
                class155 var3 = class32.method218(class122.field2162, (byte) 42, this.field1748);
                var3.method1014();
                this.field1755 = var3.field2687;
                this.field1746 = var3.field2691;
                this.field1741 = var3.field2693;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class94() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)I")
    public final int method616(int arg0) {
        ++field1758;
        if (arg0 != -1) {
            this.method210(-100);
        }
        return this.field1748;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
    public final void method210(int arg0) {
        ++field1754;
        super.method210(arg0);
        this.field1746 = null;
        if (arg0 != 1) {
            field1740 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)[[I")
    public int[][] method6(int arg0, int arg1) {
        if (arg0 > -59) {
            this.field1741 = 65;
        }
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343 && this.method671(-75)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (client.field609 != this.field1755 ? this.field1755 * arg1 / client.field609 : arg1) * this.field1741;
            if (class129.field2287 == this.field1741) {
                for (int var8 = 0; class129.field2287 > var8; ++var8) {
                    int var9 = this.field1746[var7++];
                    var6[var8] = class29.method202(var9, 255) << 4;
                    var5[var8] = class29.method202(4080, var9 >> 4);
                    var4[var8] = class29.method202(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~class129.field2287 < ~var10; ++var10) {
                    int var11 = this.field1741 * var10 / class129.field2287;
                    int var12 = this.field1746[var7 + var11];
                    var6[var10] = class29.method202(4080, var12 << 4);
                    var5[var10] = class29.method202(var12 >> 4, 4080);
                    var4[var10] = class29.method202(4080, var12 >> 12);
                }
            }
        }
        ++field1757;
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)Ltd;")
    public static final class204 method672(int arg0, int arg1) {
        class204 var2 = (class204) class70.field1332.method1178((long) arg0, 14176);
        int var3 = -43 / ((-21 - arg1) / 61);
        ++field1750;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var4 = class133.field2379.method1466(method670(arg0, (byte) -109), class132.method897(arg0, false), (byte) -121);
            class204 var5 = new class204();
            if (var4 != null) {
                var5.method1324(-1, new class66(var4));
            }
            var5.method1321((byte) 18);
            class70.field1332.method1183((byte) 85, var5, (long) arg0);
            return var5;
        }
    }
}
