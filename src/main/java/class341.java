import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class341 extends RuntimeException {

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "Ljava/lang/String;")
    public String field5091;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5090;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "Z")
    public static boolean field5092 = false;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "[[I")
    public static int[][] field5094 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "[[S")
    public static short[][] field5093;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 4)
    public static void method2198(int arg0) {
        field5093 = null;
        if (arg0 != 1) {
            field5092 = true;
        }
        field5094 = null;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IFIIIBIZ)[I", line = 16)
    public static final int[] method2199(int arg0, float arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7) {
        field5095++;
        if (arg5 >= -22) {
            return null;
        }
        int[] var8 = new int[arg4];
        class47 var9 = new class47();
        var9.field742 = arg0;
        var9.field735 = arg6;
        var9.field753 = (int) (arg1 * 4096.0F);
        var9.field740 = arg7;
        var9.field749 = arg3;
        var9.field751 = arg2;
        var9.method17((byte) -62);
        class178.method1258(true, 1, arg4);
        var9.method322(var8, 0, (byte) 56);
        return var8;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 43)
    public class341(Throwable arg0, String arg1) {
        this.field5091 = arg1;
        this.field5090 = arg0;
    }
}
