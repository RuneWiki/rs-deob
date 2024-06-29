import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class156 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lmb;")
    private static class96 field2727 = class243.method1708("Loading textures )2 ", (byte) 106);

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[I")
    public static int[] field2729 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lmb;")
    public static class96 field2723 = class243.method1708("null", (byte) 94);

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lmb;")
    public static class96 field2730 = class243.method1708(" zuerst von Ihrer Freunde)2Liste(Q", (byte) 109);

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lmb;")
    public static class96 field2725 = field2727;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1134(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field2728++;
        if (class225.method1534(-1, arg2)) {
            class135.field2432 = null;
            class89.method636(arg0, arg1, arg6, arg3, -1, class100.field1704[arg2], (byte) -124, arg5, arg8, arg7);
            if (class135.field2432 != null) {
                class89.method636(arg0, class203.field3514, arg6, arg3, -1412584499, class135.field2432, (byte) -122, arg5, class187.field3263, arg7);
                class135.field2432 = null;
            }
            if (arg4 != -17) {
                method1135(47, (byte) 106, -26, 125);
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class176.field3059[var9] = true;
            }
        } else {
            class176.field3059[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)Lsj;")
    public static final class168 method1135(int arg0, byte arg1, int arg2, int arg3) {
        field2726++;
        class168 var4 = new class168();
        var4.field2961 = arg0;
        var4.field2952 = arg3;
        class34.field606.method1085(-1, var4, (long) arg2);
        class244.method1714(arg0, true);
        class107 var5 = class55.method408(arg2, 251234864);
        if (var5 != null) {
            class53.method403(-78, var5);
        }
        if (class27.field459 != null) {
            class53.method403(-73, class27.field459);
            class27.field459 = null;
        }
        int var6 = class73.field1254;
        if (arg1 <= 50) {
            method1135(-102, (byte) 82, -58, 44);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class54.method406(-94, class79.field1346[var7])) {
                class146.method1083(var7, (byte) -106);
            }
        }
        if (class73.field1254 == 1) {
            class170.field2981 = false;
            class52.method399(true, class232.field3980, class64.field1095, class145.field2574, class55.field950);
        } else {
            class52.method399(true, class232.field3980, class64.field1095, class145.field2574, class55.field950);
            int var8 = class71.field1216.method125(class206.field3538);
            for (int var9 = 0; var9 < class73.field1254; var9++) {
                int var10 = class71.field1216.method125(class93.method656((byte) 66, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class64.field1095 = var8 + 8;
            class232.field3980 = class73.field1254 * 15 + 22;
        }
        if (var5 != null) {
            class148.method1092(var5, false, false);
        }
        class137.method1023(arg0, (byte) 37);
        if (class107.field1825 != -1) {
            class221.method1517(1, class107.field1825, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Component;III)Luk;")
    public static final class95 method1136(Component arg0, int arg1, int arg2, int arg3) {
        field2724++;
        try {
            if (arg2 != -19558) {
                field2730 = null;
            }
            Class var4 = Class.forName("l");
            class95 var5 = (class95) var4.getDeclaredConstructor().newInstance();
            var5.method67(arg0, arg1, -115, arg3);
            return var5;
        } catch (Throwable var7) {
            class27 var6 = new class27();
            var6.method67(arg0, arg1, -120, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1137(int arg0) {
        field2730 = null;
        field2723 = null;
        field2729 = null;
        if (arg0 == 15826) {
            field2727 = null;
            field2725 = null;
        }
    }
}
