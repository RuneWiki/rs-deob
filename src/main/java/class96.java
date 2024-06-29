import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class96 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lhh;")
    public static class163 field1805 = class137.method1065("lila:", 17);

    @OriginalMember(owner = "client!si", name = "h", descriptor = "[I")
    public static int[] field1811 = new int[5];

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lhh;")
    public static class163 field1808 = class137.method1065("Schlie-8en", 17);

    @OriginalMember(owner = "client!si", name = "j", descriptor = "[S")
    public static short[] field1813 = new short[256];

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Lhh;")
    public static class163 field1814 = class137.method1065(":duelstake:", 17);

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Lhh;")
    private static class163 field1817 = class137.method1065("Type", 17);

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field1815 = 0;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lhh;")
    public static class163 field1809 = field1817;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[I")
    public static int[] field1816 = new int[4096];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static final void method759(byte arg0) {
        field1812++;
        if (arg0 >= 71) {
            class182.field3358.method120((byte) -111);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method760(int arg0) {
        if (arg0 <= 4) {
            return;
        }
        field1811 = null;
        field1808 = null;
        field1805 = null;
        field1814 = null;
        field1817 = null;
        field1816 = null;
        field1809 = null;
        field1813 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
    public static final void method761(byte arg0) {
        field1810++;
        int var1 = 111 / ((arg0 + 14) / 36);
        class169.field3096.method111((byte) -52);
        class115.field2190.method111((byte) -52);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)I")
    public static final int method762(byte arg0, int arg1) {
        field1804++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg0 != -27) {
            method760(101);
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
    public static final void method763(int arg0, byte arg1) {
        field1806++;
        if (class114.method906(0, arg0)) {
            class186.method1377(class109.field2060[arg0], -1, (byte) -85);
            if (arg1 != 46) {
                method762((byte) 47, 47);
            }
        }
    }
}
