import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 extends class6 {

    @OriginalMember(owner = "client!kd", name = "Gb", descriptor = "Z")
    public boolean field1676 = false;

    @OriginalMember(owner = "client!kd", name = "Rb", descriptor = "I")
    private int field1687 = 0;

    @OriginalMember(owner = "client!kd", name = "Tb", descriptor = "I")
    private int field1689 = 0;

    @OriginalMember(owner = "client!kd", name = "wb", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!kd", name = "Lb", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!kd", name = "Fb", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!kd", name = "Sb", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
    private int field1665;

    @OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Laa;")
    private class1 field1670;

    @OriginalMember(owner = "client!kd", name = "Db", descriptor = "I")
    public static int field1673 = 0;

    @OriginalMember(owner = "client!kd", name = "Ib", descriptor = "Lke;")
    public static class65 field1678 = class1.method17("Abbrechen", -128);

    @OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
    public static int field1660 = 0;

    @OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lke;")
    public static class65 field1684 = class1.method17("Unerwartete Antwort vom Anmelde)2Server", -115);

    @OriginalMember(owner = "client!kd", name = "Kb", descriptor = "Lke;")
    private static class65 field1680 = class1.method17("To create a new account you need to", -115);

    @OriginalMember(owner = "client!kd", name = "sb", descriptor = "Lke;")
    public static class65 field1662 = class1.method17("Texturen geladen)3", -112);

    @OriginalMember(owner = "client!kd", name = "Jb", descriptor = "I")
    public static volatile int field1679 = 0;

    @OriginalMember(owner = "client!kd", name = "Nb", descriptor = "Z")
    public static boolean field1683 = false;

    @OriginalMember(owner = "client!kd", name = "Pb", descriptor = "[I")
    public static int[] field1685 = new int[1000];

    @OriginalMember(owner = "client!kd", name = "tb", descriptor = "Lke;")
    public static class65 field1663 = field1680;

    @OriginalMember(owner = "client!kd", name = "Bb", descriptor = "Lke;")
    public static class65 field1671 = class1.method17("Ein kostenloses Spielkonto erstellen)3", -124);

    @OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!kd", name = "Eb", descriptor = "Lqd;")
    public static class100 field1674 = new class100(64);

    @OriginalMember(owner = "client!kd", name = "Vb", descriptor = "[[[Lie;")
    public static class53[][][] field1691 = new class53[4][104][104];

    @OriginalMember(owner = "client!kd", name = "Wb", descriptor = "Lke;")
    public static class65 field1692 = class1.method17("redstone3", -127);

    @OriginalMember(owner = "client!kd", name = "Xb", descriptor = "I")
    public static int field1693 = 50;

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!kd", name = "zb", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!kd", name = "Hb", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!kd", name = "Mb", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!kd", name = "Ub", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!kd", name = "Qb", descriptor = "Luc;")
    public static class119 field1686;

    @OriginalMember(owner = "client!kd", name = "yb", descriptor = "Lpa;")
    public static class90 field1668;

    @OriginalMember(owner = "client!kd", name = "Cb", descriptor = "Lpa;")
    public static class90 field1672;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)Lga;", line = 14)
    public final class37 method45(int arg0) {
        field1659++;
        int var2 = -76 % ((-arg0 - 6) / 52);
        class79 var3 = class5.method36(this.field1665, -128);
        class37 var4;
        if (this.field1676) {
            var4 = var3.method696((byte) 93, -1);
        } else {
            var4 = var3.method696((byte) 112, this.field1689);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 40)
    public static void method523(boolean arg0) {
        field1663 = null;
        field1678 = null;
        field1662 = null;
        field1671 = null;
        field1686 = null;
        field1672 = null;
        field1668 = null;
        field1692 = null;
        field1684 = null;
        field1691 = null;
        field1680 = null;
        field1685 = null;
        if (!arg0) {
            method523(false);
        }
        field1674 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V", line = 88)
    public final void method524(int arg0, int arg1) {
        field1669++;
        if (this.field1676) {
            return;
        }
        this.field1687 += arg1;
        while (this.field1670.field24[this.field1689] < this.field1687) {
            this.field1687 -= this.field1670.field24[this.field1689];
            this.field1689++;
            if (this.field1689 >= this.field1670.field21.length) {
                this.field1676 = true;
                break;
            }
        }
        if (arg0 != -31023) {
            method523(false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIII)V", line = 253)
    public class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1666 = arg1;
        this.field1681 = arg2;
        this.field1675 = arg3;
        this.field1688 = arg4;
        this.field1667 = arg5 + arg6;
        this.field1665 = arg0;
        int var8 = class5.method36(this.field1665, -124).field2110;
        if (var8 == -1) {
            this.field1676 = true;
        } else {
            this.field1676 = false;
            this.field1670 = class80.method702(122, var8);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)I", line = 161)
    public static final int method525(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 / arg3;
        field1677++;
        int var5 = arg2 & arg3 - 1;
        int var6 = arg1 / arg3;
        int var7 = arg1 & arg3 - 1;
        int var8 = class65.method554(var4, var6, (byte) -79);
        int var9 = class65.method554(var4 + 1, var6, (byte) 95);
        int var10 = class65.method554(var4, var6 + 1, (byte) -66);
        if (arg0 < 75) {
            field1683 = false;
        }
        int var11 = class65.method554(var4 + 1, var6 - -1, (byte) -35);
        int var12 = class90.method794(arg3, var5, var8, var9, -121);
        int var13 = class90.method794(arg3, var5, var10, var11, -103);
        return class90.method794(arg3, var7, var12, var13, -52);
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V", line = 194)
    public static final void method526(int arg0) {
        field1682++;
        class89.field2363 = true;
        class83.method738((byte) -89);
        if (class66.field1767 != -1) {
            boolean var1 = class6.method44(190, 0, 0, class66.field1767, -1, 0, 0, 1, 261);
            if (!var1) {
                class116.field2910 = true;
            }
        } else if (class27.field728[class89.field2368] != -1) {
            boolean var2 = class6.method44(190, 0, 0, class27.field728[class89.field2368], -1, 0, 0, 1, 261);
            if (!var2) {
                class116.field2910 = true;
            }
        }
        if (arg0 <= 106) {
            field1685 = null;
        }
        if (class24.field614 && class10.field215 == 1) {
            if (class53.field1343 == 1) {
                class55.method449(16);
            } else {
                class28.method234(18);
            }
        }
        class89.method786(true);
    }
}
