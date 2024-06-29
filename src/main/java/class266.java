import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class266 {

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "[F")
    public static float[] field3753 = new float[4];

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "Lea;")
    public static class474 field3756 = new class474("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "Ldw;")
    public static class622 field3755;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 6)
    public static void method1749(int arg0) {
        if (arg0 != -20543) {
            field3755 = null;
        }
        field3756 = null;
        field3755 = null;
        field3753 = null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([BLjava/io/File;II)V", line = 19)
    public static final void method1750(byte[] arg0, File arg1, int arg2, int arg3) throws IOException {
        if (arg2 != -5341) {
            field3756 = null;
        }
        field3754++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            var4.readFully(arg0, 0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIIII)V", line = 51)
    public static final void method1751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3752++;
        if (arg8 != -6102) {
            method1751(121, 127, 73, -13, 109, 77, -106, -12, 27);
        }
        if (class227.method1477(arg2, -1)) {
            if (class114.field1431[arg2] == null) {
                class390.method2513(arg5, 1, arg7, -1, arg1, arg6, arg4, arg0, arg3, class297.field4403[arg2]);
            } else {
                class390.method2513(arg5, 1, arg7, -1, arg1, arg6, arg4, arg0, arg3, class114.field1431[arg2]);
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class136.field1692[var9] = true;
            }
        } else {
            class136.field1692[arg5] = true;
        }
    }
}
