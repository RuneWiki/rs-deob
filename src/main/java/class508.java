import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class508 extends OutputStream {

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "Laj;")
    public static class287 field7190 = new class287(128, 4);

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "[[F")
    public static float[][] field7193 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "Z")
    public static boolean field7194 = false;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
    public static void method3012(int arg0) {
        field7193 = null;
        field7190 = null;
        if (arg0 < 86) {
            field7194 = false;
        }
    }

    @OriginalMember(owner = "client!kga", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field7192++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIII)I")
    public static final int method3013(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field7191++;
        if (var4 == 0) {
            return arg0;
        } else if (arg1 == var4) {
            return arg3;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg3;
        }
    }
}
