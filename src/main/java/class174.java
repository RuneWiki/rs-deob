import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class174 {

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public int field2937 = -1;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lqj;")
    public static class196 field2925 = class80.method502("Schlie-8en", -48);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lqj;")
    public static class196 field2932 = class80.method502("null", -48);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field2929 = 0;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Z")
    public static boolean field2935 = true;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lqj;")
    public static class196 field2931 = class80.method502("W-=hlen Sie eine Option", -48);

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[Z")
    public static boolean[] field2936 = new boolean[112];

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lak;")
    public class100 field2933;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lnb;")
    public static class95 field2934;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[I")
    public int[] field2924;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[Lqj;")
    public class196[] field2927;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZII)V")
    public static final void method1135(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            method1137(-78, -13, 110, -98, -122, 53);
        }
        class120.field1732[0].method442(arg4, arg0);
        class120.field1732[1].method442(arg4, arg0 + arg5 - 16);
        field2928++;
        int var6 = (arg5 - 32) * arg5 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg2 / (arg1 - arg5);
        class55.method295(arg4, arg0 + 16, 16, arg5 - 32, class63.field865);
        class55.method295(arg4, arg0 + var7 + 16, 16, var6, class22.field288);
        class55.method283(arg4, arg0 + var7 + 16, var6, class48.field575);
        class55.method283(arg4 + 1, arg0 + var7 - -16, var6, class48.field575);
        class55.method291(arg4, arg0 + var7 + 16, 16, class48.field575);
        class55.method291(arg4, arg0 + var7 + 17, 16, class48.field575);
        class55.method283(arg4 + 15, arg0 + 16 + var7, var6, class196.field3451);
        class55.method283(arg4 + 14, arg0 + 17 + var7, var6 - 1, class196.field3451);
        class55.method291(arg4, arg0 + var6 + var7 + 15, 16, class196.field3451);
        class55.method291(arg4 + 1, arg0 - -var6 + var7 + 14, 15, class196.field3451);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method1136(int arg0) {
        if (arg0 <= 19) {
            return;
        }
        field2932 = null;
        field2934 = null;
        field2925 = null;
        field2931 = null;
        field2936 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII)V")
    public static final void method1137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 16) {
            field2931 = null;
        }
        field2923++;
        int var6 = class186.method1217(class93.field1361, class23.field291, arg3, 18291);
        int var7 = class186.method1217(class93.field1361, class23.field291, arg4, 18291);
        int var8 = class186.method1217(class188.field3296, class95.field1388, arg5, 18291);
        int var9 = class186.method1217(class188.field3296, class95.field1388, arg1, arg2 + 18275);
        for (int var10 = var6; var10 <= var7; var10++) {
            class25.method147(arg0, 7, var8, class95.field1380[var10], var9);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)Z")
    public static final boolean method1138(byte arg0, int arg1) {
        if (arg0 >= -124) {
            field2934 = null;
        }
        field2926++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1139(String arg0, int arg1) throws ClassNotFoundException {
        field2930++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else {
            int var2 = 8 % (-arg1 / 50);
            if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }
}
