import java.awt.Canvas;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class731 extends InputStream {

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Luv;")
    public static class755 field10159 = null;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lww;")
    public static class288 field10160 = new class288(0, 1);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field10161;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lhe;")
    public static class577 field10162;

    @OriginalMember(owner = "client!pf", name = "read", descriptor = "()I")
    public final int read() {
        class688.method3874(30000L, -7375);
        field10158++;
        return -1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILd;IILjava/awt/Canvas;)Lha;")
    public static final class548 method4076(int arg0, class270 arg1, int arg2, int arg3, Canvas arg4) {
        field10157++;
        int var5 = 2 % ((-arg2 - 58) / 59);
        return new class408(arg4, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static void method4077(boolean arg0) {
        field10160 = null;
        field10159 = null;
        if (arg0) {
            method4076(-19, null, 0, -104, null);
        }
        field10162 = null;
    }
}
