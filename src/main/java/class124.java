import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 extends class99 {

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field2831 = 0;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "[I")
    public static int[] field2833 = new int[] { 17, 30, 20, 13, 9, 37, 39, 32 };

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "Lr;")
    private static class118 field2830 = class153.method1136(110, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "Lr;")
    public static class118 field2844 = class153.method1136(96, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "Lr;")
    public static class118 field2841 = field2830;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "Lr;")
    public static class118 field2846 = class153.method1136(103, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field2847 = 0;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Lrf;")
    public class124 field2837;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "Lrf;")
    public class124 field2843;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Ljava/awt/Font;")
    public static Font field2836;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "[Ln;")
    public static class90[] field2842;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lke;I)Z")
    public static final boolean method961(class74 arg0, int arg1) {
        field2839++;
        if (arg0.field1738 == null) {
            return false;
        }
        if (arg1 != -12225) {
            field2831 = 110;
        }
        for (int var2 = 0; var2 < arg0.field1738.length; var2++) {
            int var3 = class45.method371(0, arg0, var2);
            int var4 = arg0.field1698[var2];
            if (arg0.field1738[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field1738[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field1738[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method962(int arg0) {
        if (arg0 <= 86) {
            method965(-11);
        }
        field2834++;
        if (this.field2837 != null) {
            this.field2837.field2843 = this.field2843;
            this.field2843.field2837 = this.field2837;
            this.field2837 = null;
            this.field2843 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lr;Lr;ILff;Lff;)Ldf;")
    public static final class28 method963(class118 arg0, class118 arg1, int arg2, class42 arg3, class42 arg4) {
        field2838++;
        int var5 = arg4.method356(arg0, 0);
        int var6 = -93 / ((-arg2 - 35) / 43);
        int var7 = arg4.method351(5, arg1, var5);
        return class65.method568(var5, (byte) -60, var7, arg4, arg3);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZIII)V")
    public static final void method964(boolean arg0, int arg1, int arg2, int arg3) {
        field2845++;
        if (!arg0 || (class33.field841 == 0 || arg3 == 0 || class108.field2525 >= 50)) {
            return;
        }
        class127.field2908[class108.field2525] = arg2;
        class74.field1839[class108.field2525] = arg3;
        class142.field3220[class108.field2525] = arg1;
        class51.field1218[class108.field2525] = null;
        class11.field262[class108.field2525] = 0;
        class108.field2525++;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public static void method965(int arg0) {
        field2842 = null;
        field2830 = null;
        field2844 = null;
        field2846 = null;
        field2833 = null;
        field2841 = null;
        field2836 = null;
        if (arg0 <= 78) {
            method961(null, 23);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Lvd;")
    public static final class150 method966(boolean arg0) {
        field2832++;
        class150 var1 = new class150();
        var1.field3366 = class65.field1488[0];
        var1.field3363 = class153.field3467[0];
        if (!arg0) {
            method964(false, -67, 108, 16);
        }
        var1.field3365 = class54.field1293[0];
        var1.field3364 = class56.field1313[0];
        var1.field3368 = class105.field2458;
        var1.field3369 = class106.field2476;
        byte[] var2 = class74.field1830[0];
        int var3 = var1.field3366 * var1.field3364;
        var1.field3367 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field3367[var4] = class127.field2904[class79.method669(255, var2[var4])];
        }
        class97.method755((byte) -83);
        return var1;
    }
}
