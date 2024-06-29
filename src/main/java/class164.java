import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class164 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Loa;")
    public static class99 field2886 = class221.method1463(2844, "Cach-B");

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Loa;")
    public static class99 field2884 = class221.method1463(2844, "Chargement en cours)3)3)3");

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Z")
    public static boolean field2876 = true;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Ltg;")
    public static class182 field2878;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[Lde;")
    public static class109[] field2880;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[[B")
    public static byte[][] field2877;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Llj;")
    public static final class25 method1105(int arg0, int arg1) {
        class25 var2 = (class25) class258.field4499.method1811((long) arg0, -70);
        field2879++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -9) {
            field2876 = true;
        }
        byte[] var3 = class115.field2044.method1242(arg0, 0, 6801);
        class25 var4 = new class25();
        if (var3 != null) {
            var4.method191(new class261(var3), 109);
        }
        var4.method193(10851);
        class258.field4499.method1817((long) arg0, 16, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1106(byte arg0) {
        field2877 = null;
        field2880 = null;
        field2878 = null;
        if (arg0 != 65) {
            method1106((byte) 38);
        }
        field2884 = null;
        field2886 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2885++;
        if (class137.field2414 >= arg4 && class178.field3101 <= arg5) {
            boolean var6;
            if (arg2 < class197.field3437) {
                var6 = false;
                arg2 = class197.field3437;
            } else if (arg2 <= class79.field1395) {
                var6 = true;
            } else {
                var6 = false;
                arg2 = class79.field1395;
            }
            boolean var7;
            if (arg0 < class197.field3437) {
                arg0 = class197.field3437;
                var7 = false;
            } else if (class79.field1395 >= arg0) {
                var7 = true;
            } else {
                var7 = false;
                arg0 = class79.field1395;
            }
            if (class178.field3101 > arg4) {
                arg4 = class178.field3101;
            } else {
                class175.method1174(class124.field2177[arg4++], arg1, arg3 + 24708, arg2, arg0);
            }
            if (arg5 > class137.field2414) {
                arg5 = class137.field2414;
            } else {
                class175.method1174(class124.field2177[arg5--], arg1, -7, arg2, arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg5; var8++) {
                    int[] var9 = class124.field2177[var8];
                    var9[arg2] = var9[arg0] = arg1;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg5; var10++) {
                    class124.field2177[var10][arg2] = arg1;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg5; var11++) {
                    class124.field2177[var11][arg0] = arg1;
                }
            }
        }
        if (arg3 != -24715) {
            method1107(97, -50, 95, -26, -65, 89);
        }
    }
}
