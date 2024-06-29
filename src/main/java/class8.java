import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 extends OutputStream {

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field166 = 0;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Loh;")
    public static class281 field163 = new class281(64);

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field169 = "Loading wordpack - ";

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lhc;")
    public static class235 field168;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg0 & arg6) == 1) {
            int var8 = arg2;
            arg2 = arg1;
            arg1 = var8;
        }
        field164++;
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 7 + 1 - arg5 - arg2;
        } else if (var7 == 2) {
            return 7 - arg4 - (arg1 - 1);
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method70(int arg0) {
        field169 = null;
        if (arg0 >= -97) {
            field169 = null;
        }
        field168 = null;
        field163 = null;
    }

    @OriginalMember(owner = "client!rj", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field165++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BB)V")
    public static final void method71(byte arg0, byte arg1) {
        field167++;
        if (class30.field441 == null) {
            class30.field441 = new byte[4][104][104];
        }
        if (arg1 >= -4) {
            method71((byte) 8, (byte) 55);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class30.field441[var2][var3][var4] = arg0;
                }
            }
        }
    }
}
