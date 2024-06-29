import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class56 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Liq;")
    public static class134 field749;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "[I")
    public static int[] field748;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIBI)Z")
    public static final boolean method319(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field747++;
        if ((class341.field5085[0][arg0][arg1] & 0x2) != 0) {
            return true;
        } else if ((class341.field5085[arg4][arg0][arg1] & 0x10) != 0) {
            return false;
        } else if (arg3 <= 2) {
            return true;
        } else {
            return class371.method2233(false, arg1, arg4, arg0) == arg2;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IC)Z")
    public static final boolean method320(int arg0, char arg1) {
        if (arg0 != -1) {
            field749 = null;
        }
        field746++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public static void method321(int arg0) {
        field749 = null;
        field748 = null;
        if (arg0 != -1) {
            field749 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
    public static final void method322(int arg0, int arg1) {
        field745++;
        if (!class15.field188) {
            arg1 = -1;
        }
        if (class189.field2839 == arg1) {
            return;
        }
        if (~arg1 != arg0) {
            class57 var2 = class313.method1909(-87, arg1);
            class4 var3 = var2.method325(-7702);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class79.field1043.method1441(new Point(var2.field754, var2.field757), var3.method38(), true, var3.method31(), var3.method28(), class170.field2631);
                class189.field2839 = arg1;
            }
        }
        if (arg1 == -1 && class189.field2839 != -1) {
            class79.field1043.method1441(new Point(), (int[]) null, true, -1, -1, class170.field2631);
            class189.field2839 = -1;
        }
    }

    static {
        new class151("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}
