import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class76 {

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1176 = "slide:";

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1177 = 0;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
    public static int[] field1173;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[[[B")
    public static byte[][][] field1175;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method504(int arg0) {
        field1175 = null;
        field1173 = null;
        if (arg0 > 1) {
            field1176 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BB)V")
    public abstract void method505(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)Z")
    public static final boolean method506(int arg0, byte arg1) {
        field1172++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 != 73) {
            field1175 = null;
        }
        int var2 = class280.field4475[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1003;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)[B")
    public abstract byte[] method507(int arg0);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1174++;
        class39[] var7 = class210.field3024;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class39 var9 = var7[var8];
            if (var9 != null && var9.field574 == 2) {
                class110.method721(arg0, (var9.field576 - class95.field1445 << 7) + var9.field577, var9.field579 * 2, arg3 >> 1, (var9.field584 - class113.field1615 << 7) + var9.field580, (byte) -100, arg2 >> 1, arg5);
                if (class148.field2111 > -1 && class82.field1267 % 20 < 10) {
                    class257.field3902[var9.field573].method470(class148.field2111 + arg6 - 12, arg1 + -28 + class195.field2809);
                }
            }
        }
        if (arg4 <= 55) {
            field1176 = null;
        }
    }
}
