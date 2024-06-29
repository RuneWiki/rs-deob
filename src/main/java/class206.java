import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class206 extends OutputStream {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3138 = -50;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
    public static int[] field3142 = new int[50];

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Llk;")
    public static class423 field3141 = null;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!le", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        field3140++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)Lfh;", line = 14)
    public static final class470 method1413(byte arg0, int arg1) {
        field3139++;
        class470[] var2 = class471.method2788(1);
        if (arg0 != -93) {
            method1414(3);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class470 var4 = var2[var3];
            if (var4.field6820 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 41)
    public static void method1414(int arg0) {
        field3141 = null;
        if (arg0 != 0) {
            method1413((byte) -89, -127);
        }
        field3142 = null;
    }
}
