import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class49 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
    public static int[] field1036 = new int[25];

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Z")
    public static boolean field1043 = false;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lak;")
    public static class269 field1042 = new class269(8);

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lvf;")
    public static class265 field1046 = class87.method582(-46, "<col=00ffff>");

    @OriginalMember(owner = "client!b", name = "n", descriptor = "[I")
    public static int[] field1048 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lvf;")
    public static class265 field1047 = class87.method582(-46, "www)2wtqa");

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lhi;")
    public static class250 field1039;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field1044;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
    public static int[] field1038;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[Lvf;")
    public static class265[] field1045;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[[B")
    public static byte[][] field1035;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public static final void method396() {
        for (int var0 = 0; var0 < class16.field454; var0++) {
            class146 var1 = class33.field817[var0];
            class106.method709(var1);
            class33.field817[var0] = null;
        }
        class16.field454 = 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method397(int arg0) {
        if (arg0 != -21439) {
            field1047 = null;
        }
        field1040++;
        class67.field1275 = new class117();
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method398(int arg0) {
        field1035 = null;
        field1048 = null;
        field1044 = null;
        field1038 = null;
        if (arg0 <= 54) {
            return;
        }
        field1046 = null;
        field1045 = null;
        field1039 = null;
        field1036 = null;
        field1042 = null;
        field1047 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvf;I)I")
    public static final int method399(class265 arg0, int arg1) {
        field1037++;
        if (class126.field2260 == null || arg0.method1808((byte) -15) == 0) {
            return -1;
        }
        if (arg1 >= -43) {
            method399((class265) null, -54);
        }
        for (int var2 = 0; var2 < class126.field2260.field2713; var2++) {
            if (class126.field2260.field2702[var2].method1763(class147.field2752, 255, class31.field799).method1794((byte) -38, arg0)) {
                return var2;
            }
        }
        return -1;
    }
}
