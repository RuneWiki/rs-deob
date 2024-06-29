import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class254 extends class104 {

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "[I")
    public static int[] field3856 = new int[128];

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "[B")
    public static byte[] field3863 = new byte[520];

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field3864 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3870 = "Loading config - ";

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "[I")
    public static int[] field3872 = new int[14];

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "Z")
    public static boolean field3873 = false;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "Llc;")
    public static class175 field3862;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "Ljava/lang/String;")
    public String field3867;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "[C")
    public char[] field3865;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "[C")
    public char[] field3871;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "[I")
    public int[] field3859;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "[I")
    public int[] field3860;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BC)I", line = 7)
    public final int method1844(byte arg0, char arg1) {
        field3855++;
        if (this.field3860 == null) {
            return -1;
        } else if (arg0 <= 35) {
            return -88;
        } else {
            for (int var3 = 0; var3 < this.field3860.length; var3++) {
                if (this.field3871[var3] == arg1) {
                    return this.field3860[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BILp;)V", line = 41)
    private final void method1845(byte arg0, int arg1, class107 arg2) {
        if (arg1 == 1) {
            this.field3867 = arg2.method628(false);
        } else if (arg1 == 2) {
            int var4 = arg2.method661(arg0 ^ 0xFFFFFFDC);
            this.field3860 = new int[var4];
            this.field3871 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3860[var5] = arg2.method624(14612);
                byte var6 = arg2.method679(-3);
                this.field3871[var5] = var6 == 0 ? 0 : class236.method1678(var6, -1);
            }
        } else if (arg1 == 3) {
            int var7 = arg2.method661(arg0 ^ 0xFFFFFFDC);
            this.field3865 = new char[var7];
            this.field3859 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3859[var8] = arg2.method624(14612);
                byte var9 = arg2.method679(-3);
                this.field3865[var8] = var9 == 0 ? 0 : class236.method1678(var9, class312.method2192(arg0, -36));
            }
        } else if (arg1 == 4) {
        }
        field3861++;
        if (arg0 != 35) {
            this.method1850('\u000b', 41);
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V", line = 111)
    public static void method1846(int arg0) {
        field3862 = null;
        field3863 = null;
        field3856 = null;
        field3864 = null;
        field3870 = null;
        field3872 = null;
        if (arg0 != 520) {
            method1848(-59, (class175) null, -83, (class175) null, -46);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V", line = 128)
    public final void method1847(byte arg0) {
        if (this.field3859 != null) {
            for (int var2 = 0; var2 < this.field3859.length; var2++) {
                this.field3859[var2] = class48.method283(this.field3859[var2], 32768);
            }
        }
        int var3 = 112 / ((90 - arg0) / 36);
        if (this.field3860 != null) {
            for (int var4 = 0; var4 < this.field3860.length; var4++) {
                this.field3860[var4] = class48.method283(this.field3860[var4], 32768);
            }
        }
        field3868++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILlc;ILlc;I)Lwh;", line = 162)
    public static final class11 method1848(int arg0, class175 arg1, int arg2, class175 arg3, int arg4) {
        if (arg0 != -1) {
            method1846(41);
        }
        field3857++;
        return class304.method2132((byte) -84, arg2, arg4, arg3) ? class177.method1213(-93, arg1.method1199(arg0 + 28816, arg4, arg2)) : null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILp;)V", line = 177)
    public final void method1849(int arg0, class107 arg1) {
        if (arg0 != -1) {
            field3872 = (int[]) null;
        }
        field3866++;
        while (true) {
            int var3 = arg1.method661(arg0 ^ 0x0);
            if (var3 == 0) {
                return;
            }
            this.method1845((byte) 35, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(CI)I", line = 227)
    public final int method1850(char arg0, int arg1) {
        field3874++;
        if (this.field3859 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field3859.length; var3++) {
            if (this.field3865[var3] == arg0) {
                return this.field3859[var3];
            }
        }
        return -1;
    }
}
