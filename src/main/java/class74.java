import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class74 extends class97 {

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1793 = 0;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field1803 = 0;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "[I")
    public static int[] field1813 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "[Lea;")
    public static class38[] field1809 = new class38[100];

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "[I")
    public static int[] field1820 = new int[25];

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public int field1801;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public int field1804;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Lnc;")
    public class119 field1807;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "Lrd;")
    public class156 field1812;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Lid;")
    public class76 field1800;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lih;")
    public class79 field1814;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static final void method588(int arg0) {
        field1805++;
        int var1 = class192.field3794.method176(8, 103);
        if (class50.field1247 > var1) {
            for (int var2 = var1; var2 < class50.field1247; var2++) {
                class39.field868[class136.field2850++] = class65.field1556[var2];
            }
        }
        if (class50.field1247 < var1) {
            throw new RuntimeException("gppov1");
        }
        class50.field1247 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class65.field1556[var3];
            class144 var5 = class175.field3550[var4];
            int var6 = class192.field3794.method176(1, 97);
            if (var6 == 0) {
                class65.field1556[class50.field1247++] = var4;
                var5.field381 = class45.field1098;
            } else {
                int var7 = class192.field3794.method176(2, 83);
                if (var7 == 0) {
                    class65.field1556[class50.field1247++] = var4;
                    var5.field381 = class45.field1098;
                    class96.field2163[class90.field2056++] = var4;
                } else if (var7 == 1) {
                    class65.field1556[class50.field1247++] = var4;
                    var5.field381 = class45.field1098;
                    int var8 = class192.field3794.method176(3, 19);
                    var5.method106(false, -3523, var8);
                    int var9 = class192.field3794.method176(1, 43);
                    if (var9 == 1) {
                        class96.field2163[class90.field2056++] = var4;
                    }
                } else if (var7 == 2) {
                    class65.field1556[class50.field1247++] = var4;
                    var5.field381 = class45.field1098;
                    int var10 = class192.field3794.method176(3, 122);
                    var5.method106(true, -3523, var10);
                    int var11 = class192.field3794.method176(3, 116);
                    var5.method106(true, -3523, var11);
                    int var12 = class192.field3794.method176(1, 63);
                    if (var12 == 1) {
                        class96.field2163[class90.field2056++] = var4;
                    }
                } else if (var7 == 3) {
                    class39.field868[class136.field2850++] = var4;
                }
            }
        }
        if (arg0 > -44) {
            field1793 = 82;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI[BI)Lea;")
    public static final class38 method589(byte arg0, int arg1, byte[] arg2, int arg3) {
        field1810++;
        class38 var4 = new class38();
        var4.field802 = 0;
        var4.field821 = new byte[arg1];
        if (arg0 != -17) {
            return null;
        }
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field821[var4.field802++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1809 = null;
        field1820 = null;
        if (arg0 == 16491) {
            field1813 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public final void method591(byte arg0) {
        this.field1800 = null;
        this.field1807 = null;
        this.field1812 = null;
        this.field1814 = null;
        int var2 = 44 / ((-arg0 - 55) / 38);
        field1791++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILdd;BI)Z")
    public static final boolean method592(int arg0, class32 arg1, byte arg2, int arg3) {
        if (arg2 != 124) {
            field1820 = null;
        }
        byte[] var4 = arg1.method215(arg0, arg3, 1);
        field1817++;
        if (var4 == null) {
            return false;
        } else {
            class126.method936(false, var4);
            return true;
        }
    }
}
