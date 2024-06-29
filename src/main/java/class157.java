import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class157 extends class34 {

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "Z")
    public boolean field2877;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "[Lnf;")
    public class157[] field2874;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "Lcc;")
    private static class209 field2869 = class95.method669(104, " more options");

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "[I")
    public static int[] field2867 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "J")
    public static long field2868 = 0L;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "Lcc;")
    private static class209 field2880 = class95.method669(118, "Loading fonts )2 ");

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Lcc;")
    public static class209 field2859 = field2869;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "Lcc;")
    public static class209 field2865 = field2880;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "[I")
    public static int[] field2862 = new int[64];

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Lla;")
    public static class95 field2861 = new class95(100);

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "Lcc;")
    public static class209 field2882 = class95.method669(114, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "Ldj;")
    public class186 field2879;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "Lng;")
    public class76 field2872;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)[[I")
    public final int[][] method1093(int arg0, int arg1, int arg2) {
        if (arg2 != 64) {
            return null;
        }
        field2875++;
        if (this.field2874[arg1].field2877) {
            int[] var4 = this.field2874[arg1].method4((byte) -98, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2874[arg1].method250(1, arg0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILji;)Z")
    public static final boolean method1094(int arg0, class42 arg1) {
        if (arg0 != 250) {
            field2868 = -12L;
        }
        field2873++;
        if (arg1.field715 == 205) {
            class1.field22 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[[I")
    public int[][] method250(int arg0, int arg1) {
        if (arg0 == 1) {
            field2863++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)I")
    public int method1095(int arg0) {
        field2866++;
        if (arg0 != -1) {
            field2869 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBLtf;)V")
    public void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 <= -29) {
            field2876++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)I")
    public int method808(int arg0) {
        int var2 = -86 / ((arg0 + 91) / 32);
        field2871++;
        return -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)[I")
    public int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            field2880 = null;
        }
        field2881++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public void method3(byte arg0) {
        int var2 = -44 / ((-arg0 - 51) / 52);
        field2858++;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public void method807(byte arg0) {
        if (arg0 != -95) {
            field2862 = null;
        }
        if (this.field2877) {
            this.field2879.method1265((byte) 40);
            this.field2879 = null;
        } else {
            this.field2872.method536(false);
            this.field2872 = null;
        }
        field2857++;
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
    public static void method1096(int arg0) {
        field2859 = null;
        field2869 = null;
        field2880 = null;
        field2865 = null;
        field2867 = null;
        field2862 = null;
        if (arg0 != -19151) {
            field2862 = null;
        }
        field2882 = null;
        field2861 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IZ)V")
    public class157(int arg0, boolean arg1) {
        this.field2877 = arg1;
        this.field2874 = new class157[arg0];
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)[I")
    public final int[] method1097(byte arg0, int arg1, int arg2) {
        field2860++;
        if (arg0 != 75) {
            field2882 = null;
        }
        return this.field2874[arg1].field2877 ? this.field2874[arg1].method4((byte) -98, arg2) : this.field2874[arg1].method250(1, arg2)[0];
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V")
    public final void method1098(int arg0, int arg1, int arg2) {
        field2878++;
        int var4 = ~this.field2870 == arg1 ? arg0 : this.field2870;
        if (this.field2877) {
            this.field2879 = new class186(var4, arg0, arg2);
        } else {
            this.field2872 = new class76(var4, arg0, arg2);
        }
    }
}
