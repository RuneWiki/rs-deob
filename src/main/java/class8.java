import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "Lhe;")
    public static class239 field136;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Lbk;")
    public static class242 field133;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Lqg;")
    public static class307 field135;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field140;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZI)B")
    public static final byte method65(int arg0, boolean arg1, int arg2) {
        field134++;
        if (arg2 == 9) {
            if (!arg1) {
                method67(73);
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z")
    public static final boolean method66(int arg0, int arg1, int arg2) {
        if (arg0 != 384) {
            field133 = null;
        }
        field138++;
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static void method67(int arg0) {
        field135 = null;
        field140 = null;
        field136 = null;
        field133 = null;
        if (arg0 != 0) {
            field133 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BZIIIFIII)[[I")
    public static final int[][] method68(byte arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8) {
        field137++;
        if (arg0 != -2) {
            return null;
        }
        int[][] var9 = new int[arg4][arg6];
        class306 var10 = new class306();
        var10.field4448 = arg3;
        var10.field4451 = arg8;
        var10.field4456 = arg2;
        var10.field4457 = (int) (arg5 * 4096.0F);
        var10.field4445 = arg1;
        var10.method24(255);
        class283.method1718(arg6, 74, arg4);
        for (int var11 = 0; var11 < arg4; var11++) {
            var10.method1839(var11, var9[var11], (byte) 55);
        }
        return var9;
    }
}
