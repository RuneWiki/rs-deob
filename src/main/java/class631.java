import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class631 {

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "Lbja;")
    private class34 field8859;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    private int field8861;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public int field8862;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public int field8864;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "Liq;")
    public static class631 field8865 = new class631(0, 3, class34.field461);

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "Liq;")
    public static class631 field8867 = new class631(1, 3, class34.field461);

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "Liq;")
    public static class631 field8868 = new class631(2, 4, class34.field457);

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "Liq;")
    public static class631 field8869 = new class631(3, 1, class34.field461);

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "Liq;")
    public static class631 field8870 = new class631(4, 2, class34.field461);

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "Liq;")
    public static class631 field8871 = new class631(5, 3, class34.field461);

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "Liq;")
    public static class631 field8872 = new class631(6, 4, class34.field461);

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field8873 = class89.method668(16, (byte) 45);

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "[[[Z")
    public static boolean[][][] field8875;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method3615(String arg0, byte arg1) {
        if (arg1 != 88) {
            field8872 = null;
        }
        field8860++;
        return arg0.length() + 2;
    }

    @OriginalMember(owner = "client!iq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8866++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
    public static final void method3616(int arg0, int arg1) {
        class194 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class294 var4 = class411.field5572[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class48.field615; var5++) {
                    for (int var6 = 0; var6 < class81.field902; var6++) {
                        var2 = var4.method1902(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class645.field9018;
                            int var8 = var5 << class645.field9018;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class294 var10 = class411.field5572[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1904(var5, (byte) 56, var6) - var10.method1904(var5, (byte) 98, var6);
                                    int var12 = var4.method1904(var5, (byte) -124, var6 + 1) - var10.method1904(var5, (byte) -125, var6 + 1);
                                    int var13 = var4.method1904(var5 + 1, (byte) -127, var6 + 1) - var10.method1904(var5 + 1, (byte) 19, var6 + 1);
                                    int var14 = var4.method1904(var5 + 1, (byte) 81, var6) - var10.method1904(var5 + 1, (byte) -126, var6);
                                    var10.method1911(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)Liq;")
    public static final class631 method3617(byte arg0, int arg1) {
        field8863++;
        if (arg0 >= -117) {
            field8872 = null;
        }
        if (arg1 == 0) {
            return field8865;
        } else if (arg1 == 1) {
            return field8867;
        } else if (arg1 == 2) {
            return field8868;
        } else if (arg1 == 3) {
            return field8869;
        } else if (arg1 == 4) {
            return field8870;
        } else if (arg1 == 5) {
            return field8871;
        } else if (arg1 == 6) {
            return field8872;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public static void method3618(byte arg0) {
        field8869 = null;
        field8867 = null;
        field8870 = null;
        if (arg0 != 125) {
            return;
        }
        field8868 = null;
        field8872 = null;
        field8875 = null;
        field8865 = null;
        field8871 = null;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IILbja;)V")
    private class631(int arg0, int arg1, class34 arg2) {
        this.field8859 = arg2;
        this.field8861 = arg1;
        this.field8862 = arg0;
        this.field8864 = this.field8859.field453 * this.field8861;
        if (this.field8862 >= 16) {
            throw new RuntimeException();
        }
    }
}
