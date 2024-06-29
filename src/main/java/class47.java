import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class47 extends class247 {

    @OriginalMember(owner = "client!we", name = "p", descriptor = "[S")
    public static short[] field592 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field597 = 0;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
    public int[] field589;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[I")
    public int[] field591;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[I")
    public int[] field593;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "[Lvk;")
    public class160[] field590;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "[Lvk;")
    public class160[] field601;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "[[[B")
    public byte[][][] field588;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIZ)I")
    public static final int method267(int arg0, int arg1, boolean arg2) {
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg1--;
            arg0 >>>= 0x1;
        }
        if (arg2) {
            field595++;
            return var3;
        } else {
            return -24;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field600++;
        if (arg2 >= 1 && arg0 >= 1 && arg2 <= 102 && arg0 <= 102) {
            if (!class60.method384(-4) && (class74.field1121[0][arg2][arg0] & 0x2) == 0) {
                int var8 = arg3;
                if ((class74.field1121[arg3][arg2][arg0] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class250.field4051 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (arg3 < 3 && (class74.field1121[1][arg2][arg0] & 0x2) == 2) {
                var9 = arg3 + 1;
            }
            class222.method1576(arg1, class312.field4997[arg3], var9, arg2, arg3, arg0, (byte) -55);
            if (arg5 >= 0) {
                boolean var10 = class73.field1106;
                class73.field1106 = true;
                class291.method1980(false, var9, arg0, false, arg5, arg3, class312.field4997[arg3], arg7, arg4, arg2, 17);
                class73.field1106 = var10;
            }
        }
        if (arg6 >= -79) {
            field598 = -64;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method269(byte arg0) {
        if (arg0 == -99) {
            field592 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public static final String method270(boolean arg0) {
        if (!arg0) {
            method267(12, 51, true);
        }
        field594++;
        String var1 = "";
        if (class140.field2003 != null) {
            var1 = "/p=" + class140.field2003;
        }
        String var2 = "www";
        if (class73.field1104 != 0) {
            var2 = "www-wtqa";
        }
        return "http://" + var2 + ".runescape.com/l=" + class46.field571 + "/a=" + class158.field2371 + var1 + "/";
    }
}
