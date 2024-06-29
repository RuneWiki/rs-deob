import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class239 extends class236 {

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field4249 = 99;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lsg;")
    public static class30 field4250 = class167.method1221((byte) 33, "(Y");

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Lb;")
    public static class48 field4254 = new class48();

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "[[S")
    public static short[][] field4253;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method1693(byte arg0) {
        field4250 = null;
        field4253 = null;
        if (arg0 != 44) {
            field4249 = 104;
        }
        field4254 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1694(boolean arg0, int arg1) {
        if (arg0) {
            field4252++;
            return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 0) {
            return;
        }
        field4251++;
        if (arg0 < 1 || arg6 < 1 || arg0 > 102 || arg6 > 102) {
            return;
        }
        if (!class81.method703(arg4 - 15861) && (class272.field4771[0][arg0][arg6] & 0x2) == 0) {
            int var8 = arg2;
            if ((class272.field4771[arg2][arg0][arg6] & 0x8) != 0) {
                var8 = 0;
            }
            if (class109.field2191 != var8) {
                return;
            }
        }
        int var9 = arg2;
        if (arg2 < 3 && (class272.field4771[1][arg0][arg6] & 0x2) == 2) {
            var9 = arg2 + 1;
        }
        class21.method201((byte) 92, arg2, arg5, var9, arg6, class100.field2032[arg2], arg0);
        if (arg1 < 0) {
            return;
        }
        boolean var10 = class197.field3569;
        class197.field3569 = true;
        class255.method1774(class100.field2032[arg2], arg3, arg2, arg0, false, true, arg1, false, arg7, arg6, var9);
        class197.field3569 = var10;
        return;
    }
}
