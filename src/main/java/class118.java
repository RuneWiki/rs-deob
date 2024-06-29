import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class118 {

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lub;")
    public static class227 field2153 = class257.method1749("cross", 17263);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public static int[] field2149 = new int[128];

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
    public static int[] field2156 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lub;")
    private static class227 field2157 = class257.method1749("Take", 17263);

    @OriginalMember(owner = "client!te", name = "h", descriptor = "J")
    public static long field2155 = 0L;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lub;")
    public static class227 field2148 = field2157;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "[Lwh;")
    public static class163[] field2159;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[Lnf;")
    public static class213[] field2158;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lqc;")
    public static final class241 method742(int arg0, int arg1) {
        field2154++;
        class241 var2 = (class241) class31.field499.method1735((long) arg1, (byte) -69);
        if (var2 != null) {
            return var2;
        }
        class241 var3 = class134.method829(class86.field1486, arg1, false, arg0 + 12282, class91.field1560);
        if (var3 != null) {
            class31.field499.method1730(var3, (long) arg1, (byte) 67);
        }
        if (arg0 != 37) {
            method746(124, 108, -50, -10, -124, 45, -45);
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method743(int arg0) {
        if (arg0 < 38) {
            method744(-79L, -19);
        }
        field2148 = null;
        field2153 = null;
        field2156 = null;
        field2149 = null;
        field2159 = null;
        field2158 = null;
        field2157 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(JI)Lub;")
    public static final class227 method744(long arg0, int arg1) {
        field2160++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else if (arg1 >= -112) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class14.field272[(int) (var8 - (arg0 * 37L))];
            }
            class227 var7 = new class227();
            var7.field3955 = var6;
            var7.field3915 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lta;ZB)V")
    public static final void method745(class105 arg0, boolean arg1, byte arg2) {
        field2151++;
        int var3 = arg0.field1935 == 0 ? arg0.field1952 : arg0.field1935;
        int var4 = arg0.field1842 == 0 ? arg0.field1977 : arg0.field1842;
        class51.method303(-65, arg0.field1861, var3, arg1, var4, class102.field1792[arg0.field1861 >> 16]);
        if (arg2 != 34) {
            return;
        }
        if (arg0.field1956 != null) {
            class51.method303(-77, arg0.field1861, var3, arg1, var4, arg0.field1956);
        }
        class182 var5 = (class182) class58.field1070.method1298(-115, (long) arg0.field1861);
        if (var5 != null) {
            class225.method1422((byte) -75, var4, arg1, var3, var5.field3106);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V")
    public static final void method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 + arg5;
        field2152++;
        int var8 = 117 % ((arg2 - 52) / 51);
        int var9 = arg4 - arg3;
        for (int var10 = arg5; var10 < var7; var10++) {
            class246.method1644(arg6, class59.field1094[var10], arg1, arg0, 1);
        }
        int var11 = arg0 + arg3;
        int var12 = arg1 - arg3;
        for (int var13 = arg4; var13 > var9; var13--) {
            class246.method1644(arg6, class59.field1094[var13], arg1, arg0, 1);
        }
        for (int var14 = var7; var14 <= var9; var14++) {
            int[] var15 = class59.field1094[var14];
            class246.method1644(arg6, var15, var11, arg0, 1);
            class246.method1644(arg6, var15, arg1, var12, 1);
        }
    }
}
