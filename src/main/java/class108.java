import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class108 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lmb;")
    public static class132 field2039 = class166.method1092("m", 122);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lmb;")
    private static class132 field2040 = class166.method1092("glow2:", 126);

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lmb;")
    public static class132 field2042 = field2040;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Lmb;")
    public static class132 field2044 = field2040;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[J")
    public static long[] field2047 = new long[32];

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lmb;")
    public static class132 field2049 = class166.method1092("Regeln versto-8en hat)3", 116);

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lbf;")
    public static class18 field2050;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
    public static final void method688(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class231.field4167; var3++) {
            for (int var4 = 0; var4 < class225.field4079; var4++) {
                for (int var5 = 0; var5 < class14.field193; var5++) {
                    class169 var6 = class101.field1900[var3][var4][var5];
                    if (var6 != null) {
                        class186 var7 = var6.field3098;
                        if (var7 != null && var7.field3440.method467()) {
                            class133.method909(var7.field3440, var3, var4, var5, 1, 1);
                            if (var7.field3449 != null && var7.field3449.method467()) {
                                class133.method909(var7.field3449, var3, var4, var5, 1, 1);
                                var7.field3440.method463(var7.field3449, 0, 0, 0, false);
                                var7.field3449 = var7.field3449.method474(arg0, arg1, arg2);
                            }
                            var7.field3440 = var7.field3440.method474(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3096; var8++) {
                            class78 var10 = var6.field3103[var8];
                            if (var10 != null && var10.field1363.method467()) {
                                class133.method909(var10.field1363, var3, var4, var5, var10.field1358 + 1 - var10.field1353, var10.field1360 - var10.field1362 + 1);
                                var10.field1363 = var10.field1363.method474(arg0, arg1, arg2);
                            }
                        }
                        class15 var9 = var6.field3100;
                        if (var9 != null && var9.field227.method467()) {
                            class102.method632(var9.field227, var3, var4, var5);
                            var9.field227 = var9.field227.method474(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Luc;")
    public static final class217 method689(int arg0, int arg1) {
        class217 var2 = (class217) class119.field2259.method777(-1, (long) arg0);
        field2043++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class157.field2854.method1079(class158.method1028(arg0, -15768), 122, class2.method10(arg0, false));
        if (arg1 != 1) {
            field2050 = null;
        }
        class217 var4 = new class217();
        var4.field3978 = arg0;
        if (var3 != null) {
            var4.method1354(-122, new class112(var3));
        }
        class119.field2259.method774((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method690(byte arg0) {
        if (arg0 != -37) {
            method692(-99, null);
        }
        field2047 = null;
        field2050 = null;
        field2042 = null;
        field2040 = null;
        field2039 = null;
        field2044 = null;
        field2049 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2048++;
        int var8 = class159.method1034(arg0, (byte) 20, class169.field3161, class17.field254);
        int var9 = class159.method1034(arg6, (byte) 81, class169.field3161, class17.field254);
        int var10 = class159.method1034(arg5, (byte) 28, class135.field2542, class168.field3083);
        int var11 = class159.method1034(arg3, (byte) 97, class135.field2542, class168.field3083);
        int var12 = class159.method1034(arg0 + arg2, (byte) 39, class169.field3161, class17.field254);
        int var13 = class159.method1034(arg6 - arg2, (byte) 20, class169.field3161, class17.field254);
        for (int var14 = var8; var14 < var12; var14++) {
            class23.method153(arg4, class61.field1033[var14], true, var10, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class23.method153(arg4, class61.field1033[var15], true, var10, var11);
        }
        int var16 = class159.method1034(arg2 + arg5, (byte) 64, class135.field2542, class168.field3083);
        int var17 = class159.method1034(arg3 - arg2, (byte) 94, class135.field2542, class168.field3083);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class61.field1033[var18];
            class23.method153(arg4, var19, true, var10, var16);
            class23.method153(arg1, var19, true, var16, var17);
            class23.method153(arg4, var19, true, var17, var11);
        }
        if (arg7 != 21888) {
            method691(-30, -18, 27, 57, -83, 99, 64, 11);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILii;)Z")
    public static final boolean method692(int arg0, class96 arg1) {
        field2045++;
        if (arg1.field1805 == 205) {
            class208.field3784 = 250;
            return true;
        } else {
            int var2 = 33 % ((-arg0 - 71) / 36);
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lmb;Lmb;IJSII)V")
    public static final void method693(class132 arg0, class132 arg1, int arg2, long arg3, short arg4, int arg5, int arg6) {
        field2041++;
        if (class202.field3721 || ~class57.field974 <= arg2) {
            return;
        }
        class8.field82[class57.field974] = arg1;
        class95.field1679[class57.field974] = arg0;
        class31.field488[class57.field974] = arg4;
        class165.field2971[class57.field974] = arg3;
        class162.field2940[class57.field974] = arg6;
        class111.field2097[class57.field974] = arg5;
        class57.field974++;
    }
}
