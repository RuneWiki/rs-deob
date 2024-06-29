import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class108 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field1761 = 0;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "F")
    public static float field1765;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    public static int[] field1764;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 5)
    public static void method890(int arg0) {
        if (arg0 >= -47) {
            method890(32);
        }
        field1764 = null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)I", line = 25)
    public static final int method891(int arg0) {
        field1762++;
        int var1 = 114 / ((arg0 - 1) / 39);
        int var2 = class230.field3406.method3023((byte) 8);
        if (var2 < (class242.field3547.length - 1)) {
            class230.field3406 = class242.field3547[var2 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(FFIIF[FBIIIF)V")
    public abstract void method892(float arg0, float arg1, int arg2, int arg3, float arg4, float[] arg5, byte arg6, int arg7, int arg8, int arg9, float arg10);
}
