import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lrd;")
    public static class117 field2184 = class95.method812("backright1", (byte) 8);

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "[I")
    public static int[] field2190 = new int[1000];

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Laa;")
    public static class2 field2191 = new class2(32);

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
    public static int[] field2193 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Z")
    public static boolean field2197 = false;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field2192 = 0;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field2196 = 0;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lrd;")
    public static class117 field2195 = class95.method812("Registrierter Benutzer", (byte) 8);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Lra;")
    public static class114 field2199;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "[Ll;")
    public static class76[] field2202;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method758(int arg0) {
        field2190 = null;
        field2195 = null;
        field2193 = null;
        field2202 = null;
        field2184 = null;
        field2199 = null;
        if (arg0 == 10804) {
            field2191 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static final void method759(byte arg0) {
        try {
            Graphics var1 = class42.field1216.getGraphics();
            class64.field1837.method485(205, 553, -6898, var1);
            if (arg0 != -122) {
                method758(-127);
            }
        } catch (Exception var2) {
            class42.field1216.repaint();
        }
        field2194++;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method760(int arg0) {
        class47.field1329 = 0;
        class79.field2123 = arg0;
        class96.method821(false);
        class109.method896((byte) -9);
        class1.method7(-679);
        for (int var1 = 0; var1 < class79.field2123; var1++) {
            int var3 = class105.field2616[var1];
            if (class85.field2236 != class93.field2334[var3].field722) {
                class93.field2334[var3].field1061 = null;
                class93.field2334[var3] = null;
            }
        }
        field2200++;
        if (class17.field395 != class104.field2588.field314) {
            throw new RuntimeException("gnp1 pos:" + class104.field2588.field314 + " psize:" + class17.field395);
        }
        for (int var2 = 0; var2 < class24.field678; var2++) {
            if (class93.field2334[class95.field2379[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class24.field678);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Lwa;")
    public static final class144 method761(int arg0, int arg1, int arg2) {
        field2185++;
        class144 var3 = class15.method172(arg2, arg1 ^ 0xFFFFCA2E);
        if (~arg0 == arg1) {
            return var3;
        } else if (var3 == null || var3.field3448 == null || arg0 >= var3.field3448.length) {
            return null;
        } else {
            return var3.field3448[arg0];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBIIIII)Z")
    public static final boolean method762(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2187++;
        if (!class40.method463(-121, arg4)) {
            return false;
        }
        class71.field1998 = null;
        if (arg1 < 44) {
            field2196 = 127;
        }
        boolean var7 = class99.method843(class77.field2090[arg4], arg5, (byte) 107, arg2, arg0, 0, arg3, arg6, 0, -1);
        if (class71.field1998 != null) {
            class99.method843(class71.field1998, arg5, (byte) 66, arg2, arg0, class102.field2575, arg3, arg6, class35.field1021, -1412584499);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I")
    public static int method763(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BILrd;Lrd;Lge;ZI)V")
    public static final void method764(byte arg0, int arg1, class117 arg2, class117 arg3, class47 arg4, boolean arg5, int arg6) {
        field2189++;
        if (arg0 == -103) {
            int var7 = arg4.method509(arg3, arg0 + 103);
            int var8 = arg4.method523(var7, arg2, arg0 + 102);
            class67.method663(arg1, var8, var7, arg4, 1, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static final void method765(byte arg0) {
        field2188++;
        if (class141.field3358 == 2 && arg0 == 107) {
            class105.method872(class25.field755 * 2, (class52.field1459 - class108.field2678 << 7) + class5.field123, -1, (class116.field2832 - class95.field2371 << 7) + class93.field2335);
            if (class118.field2910 > -1 && class85.field2236 % 20 < 10) {
                class2.field45[0].method712(class118.field2910 - 12, class144.field3415 - 28);
            }
        }
    }
}
