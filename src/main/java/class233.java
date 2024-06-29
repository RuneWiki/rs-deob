import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class233 {

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "B")
    public byte field3295;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Lqp;")
    public static class466 field3285 = new class466("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "Lsb;")
    public class191 field3284;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "Lum;")
    public class363 field3293;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "Lck;")
    public class452 field3288;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Lhn;")
    public class505 field3287;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V", line = 4)
    public static void method1436(byte arg0) {
        if (arg0 == -9) {
            field3285 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V", line = 14)
    public static final void method1437(int arg0) {
        class485.field7085.method252(((float) class20.field269.field7666 * 0.1F + 0.7F) * 1.1523438F);
        field3289++;
        if (arg0 <= 44) {
            field3285 = null;
        }
        class485.field7085.method232(class305.field4168, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class485.field7085.method241(class442.field6546, -1, 256);
        class485.field7085.method315(class402.field5903);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lgl;IFFIIIFIFF)[B", line = 44)
    public static final byte[] method1438(class425 arg0, int arg1, float arg2, float arg3, int arg4, int arg5, int arg6, float arg7, int arg8, float arg9, float arg10) {
        field3294++;
        byte[] var11 = new byte[arg1 * arg4 * arg8];
        if (arg6 == 23531) {
            class144.method975(arg3, arg10, arg9, arg7, arg0, arg1, 0, var11, arg5, -473, arg8, arg2, arg4);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(BIIIII)V", line = 61)
    public class233(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3290 = arg5;
        this.field3295 = arg0;
        this.field3286 = arg3;
        this.field3283 = arg4;
        this.field3282 = arg1;
        this.field3291 = arg2;
    }
}
