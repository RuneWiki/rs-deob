import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 extends class128 {

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field1799 = 0;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field1803 = -1;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field1802 = 0;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "Lid;")
    private static class60 field1806 = class11.method72("wave2:", (byte) -106);

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Lid;")
    public static class60 field1798 = field1806;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "Lid;")
    private static class60 field1812 = class11.method72("white:", (byte) 119);

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Lid;")
    public static class60 field1810 = field1812;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public static int field1814 = -1;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lid;")
    public static class60 field1800 = field1806;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "Lid;")
    public static class60 field1801 = field1812;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "Lid;")
    public static class60 field1815 = class11.method72("title)3jpg", (byte) 111);

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "B")
    public byte field1805;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public int field1804;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lid;")
    public class60 field1795;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "Lie;")
    public static class61 field1816;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "Z")
    public static boolean field1811;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "[Le;")
    public static class29[] field1813;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)I")
    public static final int method568(byte arg0, int arg1) {
        field1807++;
        class7 var2 = class124.method980(arg0 ^ 0xFFFFFFC7, arg1);
        int var3 = var2.field97;
        int var4 = var2.field113;
        int var5 = var2.field94;
        int var6 = class74.field1776[var5 - var4];
        if (arg0 != -105) {
            method570(-41);
        }
        return class43.field1158[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILgd;II)V")
    public static final void method569(int arg0, int arg1, class46 arg2, int arg3, int arg4) {
        field1808++;
        if (class34.field789 >= 50 || class74.field1784 == 0 || (arg2.field1219 == null || arg0 >= arg2.field1219.length)) {
            return;
        }
        int var5 = arg2.field1219[arg0];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class133.field3042[class34.field789] = var6;
        int var7 = var5 >> 4 & 0x7;
        class19.field473[class34.field789] = var7;
        class33.field773[class34.field789] = 0;
        if (arg3 != 333) {
            field1799 = -10;
        }
        class9.field138[class34.field789] = null;
        int var8 = var5 & 0xF;
        int var9 = (arg4 - 64) / 128;
        int var10 = (arg1 - 64) / 128;
        class116.field2739[class34.field789] = (var10 << 8) + (var9 << 16) + var8;
        class34.field789++;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public static void method570(int arg0) {
        field1810 = null;
        field1798 = null;
        field1815 = null;
        field1800 = null;
        field1812 = null;
        field1801 = null;
        field1816 = null;
        field1813 = null;
        if (arg0 != 12223) {
            method568((byte) 38, 104);
        }
        field1806 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)[Lae;")
    public static final class6[] method571(boolean arg0) {
        field1796++;
        class6[] var1 = new class6[class35.field886];
        for (int var2 = 0; var2 < class35.field886; var2++) {
            class6 var3 = var1[var2] = new class6();
            var3.field88 = class146.field3281;
            var3.field93 = class90.field2237;
            var3.field91 = class90.field2236[var2];
            var3.field87 = class100.field2442[var2];
            var3.field92 = class104.field2551[var2];
            var3.field90 = class136.field3098[var2];
            int var4 = var3.field92 * var3.field90;
            byte[] var5 = class89.field2205[var2];
            var3.field89 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field89[var6] = class35.field879[class80.method680(255, var5[var6])];
            }
        }
        if (!arg0) {
            field1797 = 15;
        }
        class7.method47(12711);
        return var1;
    }
}
