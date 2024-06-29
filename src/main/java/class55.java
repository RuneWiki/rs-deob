import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class55 extends class68 {

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "Lce;")
    public class126 field834;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "[B")
    public static byte[] field827 = new byte[520];

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "Lce;")
    public static class126 field832 = class206.method1445(-7923, "::breakcon");

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "Lce;")
    public static class126 field831 = class206.method1445(-7923, "Chargement des textures )2 ");

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    public static int field836 = 2;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "Lce;")
    public static class126 field837 = class206.method1445(-7923, "glissement:");

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "[I")
    public static int[] field838 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Lsg;")
    public static class164 field829;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "Lsg;")
    public static class164 field833;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIILwd;I)V", line = 6)
    public static final void method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class112 arg6, int arg7) {
        if (class229.field3857) {
            class234.field3945 = 32;
        } else {
            class234.field3945 = 0;
        }
        field835++;
        if (arg1 != -27265) {
            method346(34, 16, -96, 61, -50, 71, (class112) null, 116);
        }
        class229.field3857 = false;
        if (class317.field5442 != 0) {
            if (arg0 <= arg2 && arg0 + 16 > arg2 && arg5 >= arg3 && arg5 < arg3 + 16) {
                arg6.field1827 -= 4;
                class23.method114(arg6, (byte) 94);
            } else if (arg2 >= arg0 && arg0 + 16 > arg2 && (arg3 + arg4 - 16) <= arg5 && arg5 < arg3 + arg4) {
                arg6.field1827 += 4;
                class23.method114(arg6, (byte) 94);
            } else if (arg0 - class234.field3945 <= arg2 && arg2 < arg0 - (-class234.field3945 - 16) && (arg3 + 16) <= arg5 && arg5 < (arg3 + arg4 - 16)) {
                int var8 = (arg4 - 32) * arg4 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - var8 - 32;
                int var10 = arg5 - arg3 - (var8 / 2) - 16;
                arg6.field1827 = (arg7 - arg4) * var10 / var9;
                class23.method114(arg6, (byte) 94);
                class229.field3857 = true;
            }
        }
        if (class75.field1212 == 0) {
            return;
        }
        int var11 = arg6.field1766;
        if (arg2 >= arg0 - var11 && arg3 <= arg5 && arg2 < (arg0 + 16) && arg5 <= arg3 + arg4) {
            arg6.field1827 += class75.field1212 * 45;
            class23.method114(arg6, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V", line = 71)
    public static final void method347(boolean arg0, int arg1) {
        field826++;
        if (arg1 != -32) {
            field832 = (class126) null;
        }
        if (class5.field66 != arg0) {
            class5.field66 = arg0;
            class226.method1540(arg1 ^ 0x6E);
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(B)V", line = 90)
    public static void method348(byte arg0) {
        if (arg0 < 30) {
            return;
        }
        field833 = null;
        field832 = null;
        field838 = null;
        field827 = null;
        field829 = null;
        field837 = null;
        field831 = null;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 130)
    public class55() {
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lce;I)V", line = 135)
    public class55(class126 arg0, int arg1) {
        this.field834 = arg0;
    }
}
