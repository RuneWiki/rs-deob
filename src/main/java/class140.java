import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class140 extends class540 {

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "[I")
    public static int[] field1810 = new int[1];

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public int field1801;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "Lwq;")
    public class176 field1802;

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "Lwq;")
    public class176 field1804;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "Ljava/lang/String;")
    public String field1811;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "Z")
    public boolean field1803;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "[Lqda;")
    public static class112[] field1798;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field1808;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public static final void method974(int arg0) {
        field1805++;
        if (class259.field3639 != null) {
            for (int var1 = 0; var1 < class259.field3639.length; var1++) {
                for (int var2 = 0; var2 < class259.field3639[var1].length; var2++) {
                    class259.field3639[var1][var2] = class111.field1412;
                }
            }
        }
        if (arg0 <= 52) {
            method975((byte) -84);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)Lib;")
    public static final class162 method975(byte arg0) {
        class384.field5475 = 0;
        field1799++;
        if (arg0 != -116) {
            field1798 = null;
        }
        return class220.method1519(1);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)I")
    public static final int method976(int arg0, int arg1, int arg2) {
        field1796++;
        int var3 = class108.method728(arg2 + 45365, 4, arg1 + 91923, -1) + (class108.method728(arg2 + 10294, 2, arg1 + 37821, -1) - 128 >> 1) + (class108.method728(arg2, 1, arg1, -1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 != 60) {
            return 15;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
    public static void method977(int arg0) {
        field1798 = null;
        field1810 = null;
        if (arg0 != -125) {
            field1798 = null;
        }
    }
}
