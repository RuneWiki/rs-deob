import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class104 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lsf;")
    private static class108 field1805 = class140.method973(255, "Walk here");

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lsf;")
    public static class108 field1811 = field1805;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[Lvd;")
    public static class135[] field1813;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[[[I")
    public static int[][][] field1809;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfi;", line = 31)
    public static final class265 method713(Throwable arg0, String arg1) {
        field1810++;
        class265 var2;
        if ((arg0 instanceof class265)) {
            var2 = (class265) arg0;
            var2.field4672 = var2.field4672 + ' ' + arg1;
        } else {
            var2 = new class265(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)V", line = 51)
    public static final void method714(byte arg0, int arg1) {
        if (arg1 == -1 && !class95.field1524) {
            class247.method1694(false);
        } else if (arg1 != -1 && (class155.field2797 != arg1 || !class99.method692(122)) && class203.field3671 != 0 && !class95.field1524) {
            class3.method24((byte) -79, class203.field3671, arg1, 0, false, class96.field1535, 2);
        }
        field1806++;
        if (arg0 > -47) {
            field1805 = (class108) null;
        }
        class155.field2797 = arg1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I", line = 83)
    public static final int method715(int arg0, int arg1) {
        int var2 = 57 / ((arg1 + 10) / 40);
        field1812++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLca;I)Lsf;", line = 146)
    public static final class108 method716(boolean arg0, class98 arg1, int arg2) {
        field1807++;
        if (!class212.method1462((byte) -86, arg2, client.method1815(arg1)) && arg1.field1657 == null) {
            return null;
        } else if (!arg0) {
            return (class108) null;
        } else if (arg1.field1585 == null || arg1.field1585.length <= arg2 || arg1.field1585[arg2] == null || arg1.field1585[arg2].method769(-8001).method776(0) == 0) {
            return class46.field673 ? class117.method833(new class108[] { class184.field3386, class79.method518(false, arg2) }, false) : null;
        } else {
            return arg1.field1585[arg2];
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 179)
    public static void method717(int arg0) {
        field1809 = (int[][][]) null;
        field1813 = null;
        int var1 = -49 / ((6 - arg0) / 61);
        field1805 = null;
        field1811 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZLsf;)V", line = 235)
    public static final void method718(int arg0, boolean arg1, class108 arg2) {
        field1808++;
        short[] var3 = new short[arg0];
        class108 var4 = arg2.method764(false);
        int var5 = 0;
        for (int var6 = 0; var6 < class197.field3553; var6++) {
            class145 var7 = class144.method994(true, var6);
            if ((!arg1 || var7.field2580) && var7.field2607 == -1 && var7.field2567 == -1 && var7.field2554 == 0 && var7.field2610.method764(false).method762(var4, arg0 ^ -126) != -1) {
                if (var5 >= 250) {
                    class282.field4940 = -1;
                    class143.field2524 = null;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var5++] = (short) var6;
            }
        }
        class282.field4940 = var5;
        class176.field3202 = 0;
        class108[] var10 = new class108[class282.field4940];
        class143.field2524 = var3;
        for (int var11 = 0; var11 < class282.field4940; var11++) {
            var10[var11] = class144.method994(true, var3[var11]).field2610;
        }
        class213.method1473(class143.field2524, var10, (byte) -27);
    }
}
