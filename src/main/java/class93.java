import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class93 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Z")
    public boolean field1780 = false;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "[I")
    private int[] field1794 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public int field1797 = -1;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field1793 = 0;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1789 = new CRC32();

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Lcc;")
    public static class83 field1800 = new class83(5000);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "[I")
    private int[] field1791;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[Ljb;")
    public static class256[] field1785;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[Ldh;")
    public static class265[] field1788;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[S")
    private short[] field1783;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "[S")
    private short[] field1786;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "[S")
    private short[] field1796;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "[S")
    private short[] field1799;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/lang/String;)Lr;")
    public static final class66 method641(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        field1787++;
        int var3 = var2.length;
        class66 var4 = new class66();
        if (arg0 != 43) {
            return null;
        }
        var4.field1283 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1283[var4.field1308++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field1283[var4.field1308++] = (byte) var6;
            }
        }
        var4.method457(true);
        return var4.method492(arg0 + 4053);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)Lne;")
    public final class118 method642(boolean arg0) {
        field1790++;
        if (this.field1791 == null) {
            return null;
        }
        class118[] var2 = new class118[this.field1791.length];
        for (int var3 = 0; var3 < this.field1791.length; var3++) {
            var2[var3] = class118.method789(class151.field2714, this.field1791[var3], 0);
        }
        if (arg0) {
            field1800 = null;
        }
        class118 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class118(var2, var2.length);
        }
        if (this.field1799 != null) {
            for (int var5 = 0; var5 < this.field1799.length; var5++) {
                var4.method803(this.field1799[var5], this.field1796[var5]);
            }
        }
        if (this.field1783 != null) {
            for (int var6 = 0; var6 < this.field1783.length; var6++) {
                var4.method784(this.field1783[var6], this.field1786[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method643(int arg0) {
        if (arg0 != 133988164) {
            method644(-118, 57, 114);
        }
        field1788 = null;
        field1789 = null;
        field1800 = null;
        field1785 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
    public static final int method644(int arg0, int arg1, int arg2) {
        int var3 = arg2 + (arg1 * 57);
        if (arg0 != 133988164) {
            field1785 = null;
        }
        field1784++;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FC7F44) >> 19;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Lne;")
    public final class118 method645(int arg0) {
        field1792++;
        class118[] var2 = new class118[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1794[var4] != -1) {
                var2[var3++] = class118.method789(class151.field2714, this.field1794[var4], 0);
            }
        }
        if (arg0 >= -36) {
            this.method645(50);
        }
        class118 var5 = new class118(var2, var3);
        if (this.field1799 != null) {
            for (int var6 = 0; var6 < this.field1799.length; var6++) {
                var5.method803(this.field1799[var6], this.field1796[var6]);
            }
        }
        if (this.field1783 != null) {
            for (int var7 = 0; var7 < this.field1783.length; var7++) {
                var5.method784(this.field1783[var7], this.field1786[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)Z")
    public final boolean method646(int arg0) {
        boolean var2 = true;
        if (arg0 != -23720) {
            return true;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1794[var3] != -1 && !class151.field2714.method141(this.field1794[var3], 0, (byte) -128)) {
                var2 = false;
            }
        }
        field1782++;
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Z")
    public final boolean method647(byte arg0) {
        field1795++;
        if (this.field1791 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 >= -114) {
            field1781 = 21;
        }
        for (int var3 = 0; var3 < this.field1791.length; var3++) {
            if (!class151.field2714.method141(this.field1791[var3], 0, (byte) -117)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Llh;II)V")
    private final void method648(class249 arg0, int arg1, int arg2) {
        field1801++;
        if (arg1 == 1) {
            this.field1797 = arg0.method1677(-6677);
        } else if (arg1 == 2) {
            int var4 = arg0.method1677(-6677);
            this.field1791 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1791[var5] = arg0.method1674(1355769544);
            }
        } else if (arg1 == 3) {
            this.field1780 = true;
        } else if (arg1 == 40) {
            int var8 = arg0.method1677(arg2 ^ 0x1A3B);
            this.field1796 = new short[var8];
            this.field1799 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1799[var9] = (short) arg0.method1674(arg2 + 1355769592);
                this.field1796[var9] = (short) arg0.method1674(1355769544);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method1677(arg2 ^ 0x1A3B);
            this.field1783 = new short[var6];
            this.field1786 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1783[var7] = (short) arg0.method1674(1355769544);
                this.field1786[var7] = (short) arg0.method1674(arg2 + 1355769592);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1794[arg1 - 60] = arg0.method1674(class109.method741(arg2, -1355769576));
        }
        if (arg2 != -48) {
            field1793 = -103;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLlh;)V")
    public final void method649(boolean arg0, class249 arg1) {
        while (true) {
            int var3 = arg1.method1677(-6677);
            if (var3 == 0) {
                field1798++;
                if (!arg0) {
                    this.method647((byte) 87);
                    return;
                }
                return;
            }
            this.method648(arg1, var3, -48);
        }
    }
}
