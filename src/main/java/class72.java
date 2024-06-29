import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 extends class5 {

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "Lec;")
    public static class32 field1803 = new class32(4096);

    @OriginalMember(owner = "client!kc", name = "pb", descriptor = "Lhe;")
    public static class54 field1806 = class6.method58("leuchten1:", false);

    @OriginalMember(owner = "client!kc", name = "rb", descriptor = "Lhe;")
    private static class54 field1808 = class6.method58("The server is being updated)3", false);

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "Lhe;")
    public static class54 field1805 = class6.method58(": ", false);

    @OriginalMember(owner = "client!kc", name = "qb", descriptor = "Lhe;")
    public static class54 field1807 = field1808;

    @OriginalMember(owner = "client!kc", name = "sb", descriptor = "Lhe;")
    private static class54 field1809 = class6.method58(" from your ignore list first", false);

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "Lhe;")
    public static class54 field1804 = field1809;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public int field1775;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    public int field1801;

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "Lq;")
    public class111 field1794;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "Lra;")
    public class119 field1786;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lub;")
    public class141 field1793;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "Lnb;")
    public class92 field1789;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "[Lqb;")
    public static class113[] field1780;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method562(int arg0) {
        field1780 = null;
        field1807 = null;
        field1808 = null;
        field1806 = null;
        field1803 = null;
        field1804 = null;
        field1805 = null;
        field1809 = null;
        if (arg0 != 0) {
            method565((byte) -104, 46);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lsc;")
    public static final class128 method563(int arg0, int arg1) {
        field1778++;
        class128 var2 = (class128) class67.field1675.method991((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field162.method266(16, (byte) 119, arg1);
        class128 var4 = new class128();
        int var5 = 99 % ((-arg0 - 23) / 54);
        if (var3 != null) {
            var4.method966(new class83(var3), 4606);
        }
        class67.field1675.method990(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public final void method564(byte arg0) {
        field1783++;
        this.field1789 = null;
        this.field1794 = null;
        if (arg0 != 74) {
            this.field1793 = null;
        }
        this.field1786 = null;
        this.field1793 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Lhe;")
    public static final class54 method565(byte arg0, int arg1) {
        field1790++;
        class54 var2 = new class54();
        var2.field1325 = 0;
        var2.field1323 = new byte[arg1];
        return arg0 >= -73 ? null : var2;
    }
}
