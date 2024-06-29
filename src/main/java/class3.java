import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Ltl;")
    public static class222 field21 = new class222(30);

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field26 = "Loading sprites - ";

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lkb;")
    public static class39 field22;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[[B")
    public static byte[][] field20;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BIII)V", line = 7)
    public static final void method12(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 100) {
            field26 = (String) null;
        }
        field24++;
        String var4 = "::tele " + arg1 + "," + (arg2 >> 6) + "," + (arg3 >> 6) + "," + (arg2 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class74.method483(var4, -31357);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(FZIIIIBI)[I", line = 27)
    public static final int[] method13(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int[] var8 = new int[arg4];
        class77 var9 = new class77();
        var9.field1156 = arg3;
        var9.field1152 = arg7;
        var9.field1154 = (int) (arg0 * 4096.0F);
        var9.field1162 = arg1;
        if (arg6 < 48) {
            field22 = (class39) null;
        }
        field19++;
        var9.field1153 = arg2;
        var9.field1170 = arg5;
        var9.method55((byte) 0);
        class93.method670((byte) 127, 1, arg4);
        var9.method568(var8, 0, -9);
        return var8;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 63)
    public static void method14(byte arg0) {
        field21 = null;
        if (arg0 == 61) {
            field26 = null;
            field20 = (byte[][]) null;
            field22 = null;
        }
    }
}
