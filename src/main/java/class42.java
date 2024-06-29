import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class42 extends class45 implements class627 {

    @OriginalMember(owner = "client!kaa", name = "v", descriptor = "Lsd;")
    public static class80 field456 = new class80(64);

    @OriginalMember(owner = "client!kaa", name = "y", descriptor = "D")
    public static double field459 = -1.0D;

    @OriginalMember(owner = "client!kaa", name = "x", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "Lci;")
    public static class386 field457;

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lgf;IZ[[I)V")
    public class42(class234 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class538.field7742, class256.field3653, arg1 * 6 * arg1, arg2);
        super.field480.method1971((byte) -63, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method241(arg1, 12041, arg1, var5 + 34069, arg3[var5]);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, this.method243((byte) -99), arg1, arg1, 0, class442.method2756(super.field489, 126), super.field480.field3367, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public static void method225(int arg0) {
        field456 = null;
        field457 = null;
        if (arg0 != 34067) {
            field459 = 0.11970502047402085D;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
    public static final void method226(File arg0, String arg1, byte arg2) {
        class463.field6891.put(arg1, arg0);
        if (arg2 != 101) {
            method225(-76);
        }
        ++field458;
    }
}
