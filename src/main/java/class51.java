import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class51 extends class174 {

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    private int field901 = -32768;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Ljf;")
    public static class229 field895 = class212.method1457((byte) 68, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Z")
    public static boolean field896;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "[I")
    public static int[] field893;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()I", line = 11)
    public final int method201() {
        field900++;
        return this.field901;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIIJILki;)V", line = 27)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class164 arg10) {
        field897++;
        class196 var13 = class113.method799(this.field894, (byte) 50).method2117(0, 72, (class194) null, this.field898);
        if (var13 != null) {
            var13.method190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field901 = var13.method201();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V", line = 54)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field899++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 69)
    public static final void method416(int arg0, int arg1) {
        if (arg1 == 0) {
            field892++;
            class293.field5016.method231((byte) 113, arg0);
            class214.field3683.method231((byte) 113, arg0);
            class273.field4665.method231((byte) 113, arg0);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 83)
    public static void method417(byte arg0) {
        if (arg0 <= -30) {
            field895 = null;
            field893 = null;
        }
    }
}
