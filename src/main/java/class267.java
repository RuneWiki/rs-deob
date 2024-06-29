import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class267 {

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "[I")
    public static int[] field3843 = new int[13];

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "[[I")
    public static int[][] field3841 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field3840 = 12;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "[I")
    public static int[] field3842 = new int[8];

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Z")
    public static boolean field3844 = false;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)Leh;")
    public static final class241 method1716(int arg0, int arg1, int arg2) {
        class429 var3 = class380.field5761[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6365;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method1717(int arg0) {
        field3843 = null;
        if (arg0 != 9) {
            field3840 = 30;
        }
        field3841 = null;
        field3842 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(FIFFIIIFLgi;FI)[B")
    public static final byte[] method1718(float arg0, int arg1, float arg2, float arg3, int arg4, int arg5, int arg6, float arg7, class477 arg8, float arg9, int arg10) {
        field3845++;
        byte[] var11 = new byte[arg1 * arg10 * arg6];
        class215.method1438(arg8, arg3, arg5, arg9, arg10, arg7, arg1, arg0, arg6, arg2, arg4, (byte) 113, var11);
        return var11;
    }
}
