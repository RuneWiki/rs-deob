import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class172 {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "F")
    public static float field2319 = 0.0F;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2320 = 0;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lwi;")
    public static class330 field2318 = new class330(4);

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
    public static int[] field2323;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILjava/awt/Canvas;Ll;)Lqa;")
    public static final class165 method1167(int arg0, int arg1, Canvas arg2, class15 arg3) {
        field2321++;
        return arg0 == -1 ? new class326(arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1168(int arg0) {
        field2323 = null;
        if (arg0 != 2) {
            field2320 = -65;
        }
        field2318 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILjava/lang/Class;)Lhi;")
    public static final class140 method1169(int arg0, int arg1, int arg2, Class arg3) {
        class452 var4 = class443.field6672[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class384 var5 = var4.field6814; var5 != null; var5 = var5.field5834) {
            class140 var6 = var5.field5832;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1868 == arg1 && var6.field1863 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public static final void method1170(int arg0, int arg1) {
        if (arg1 == 37) {
            class12.field224 = 3.0F;
        } else if (arg1 == 50) {
            class12.field224 = 4.0F;
        } else if (arg1 == 75) {
            class12.field224 = 6.0F;
        } else if (arg1 == 100) {
            class12.field224 = 8.0F;
        } else if (arg1 == 200) {
            class12.field224 = 16.0F;
        }
        class291.field4259 = -1;
        field2322++;
        if (arg0 < 64) {
            method1168(122);
        }
        class291.field4259 = -1;
    }

    static {
        new class446("Select", "Auswählen", "Sélectionner", "Selecionar");
        field2323 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
    }
}
