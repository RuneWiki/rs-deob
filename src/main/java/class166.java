import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class166 extends class183 {

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Ldj;")
    public static class44 field2850 = class89.method650(255, "Art");

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
    public static int[] field2860 = new int[100];

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Ldj;")
    private static class44 field2856 = class89.method650(255, "level)2");

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "Ldj;")
    public static class44 field2864 = class89.method650(255, "Spieler");

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "[Lse;")
    public static class195[] field2865 = new class195[4];

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Ldj;")
    public static class44 field2851 = class89.method650(255, "(Y<)4col>");

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    public static int field2867 = -1;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "[S")
    public static short[] field2868 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "[J")
    public static long[] field2848 = new long[200];

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Ldj;")
    public static class44 field2861 = class89.method650(255, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "Ldj;")
    public static class44 field2869 = field2856;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "Ldj;")
    public static class44 field2873 = class89.method650(255, "null");

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lnf;")
    public static class147 field2853;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[I")
    public static int[] field2849;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "[I")
    public int[] field2854;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "[I")
    public int[] field2863;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "[I")
    public int[] field2866;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "[Lqe;")
    public class176[] field2857;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "[Lqe;")
    public class176[] field2858;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "[[[B")
    public byte[][][] field2862;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public static final void method1058(int arg0) {
        field2872++;
        if (class120.field2139 != null) {
            class120.field2139.method778((byte) -115);
        }
        if (arg0 >= -11) {
            field2851 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[Ldj;I)Ldj;")
    public static final class44 method1059(int arg0, int arg1, class44[] arg2, int arg3) {
        field2852++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg3 + var5] == null) {
                arg2[arg3 + var5] = class66.field1216;
            }
            var4 += arg2[arg3 + var5].field849;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class44 var10 = arg2[arg3 + var8];
            class18.method146(var10.field822, 0, var7, var6, var10.field849);
            var6 += var10.field849;
        }
        class44 var9 = new class44();
        var9.field822 = var7;
        var9.field849 = var4;
        return arg0 == -24702 ? var9 : null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        field2864 = null;
        field2853 = null;
        field2850 = null;
        int var1 = 107 % ((arg0 - 52) / 59);
        field2873 = null;
        field2860 = null;
        field2869 = null;
        field2865 = null;
        field2848 = null;
        field2868 = null;
        field2856 = null;
        field2851 = null;
        field2861 = null;
        field2849 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIB)I")
    public static final int method1061(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -65) {
            return 17;
        }
        int var4 = arg2 & 0x3;
        field2871++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }
}
