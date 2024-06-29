import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class592 {

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    private int field8539;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    private int field8536;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lep;")
    public class371 field8540;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Z")
    private boolean field8535;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field8534;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field8541 = 0;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lgca;")
    public static class209 field8538 = new class209(32);

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Lqk;")
    public static class148 field8543 = new class148(28, 2);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[I")
    public static int[] field8537;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public abstract void method3178(int arg0);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZZLjava/lang/String;Lmr;)V")
    public static final void method3516(int arg0, boolean arg1, boolean arg2, String arg3, class613 arg4) {
        field8532++;
        if (arg2) {
            if (class613.field8710.startsWith("win") && arg4.field8732) {
                String var5 = null;
                if (class622.field8847 != null) {
                    var5 = class622.field8847.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class436 var6 = class550.method3289(0, 0, arg4, arg3);
                    class599.field8599 = arg4;
                    class175.field2390 = var6;
                    class670.field9425 = arg3;
                    return;
                }
            }
            if (class613.field8710.startsWith("mac")) {
                String var7 = null;
                if (class622.field8847 != null) {
                    var7 = class622.field8847.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg1) {
                    class550.method3289(0, 1, arg4, arg3);
                    return;
                }
            }
            class550.method3289(0, 2, arg4, arg3);
        } else {
            class550.method3289(0, 3, arg4, arg3);
        }
        if (arg0 != 9834) {
            method3517(-8);
        }
    }

    @OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8540.method2128(8146, this.field8534, this.field8536);
        field8533++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V")
    public static void method3517(int arg0) {
        if (arg0 != 35044) {
            field8537 = null;
        }
        field8538 = null;
        field8537 = null;
        field8543 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[B)V")
    public final void method3518(int arg0, int arg1, byte[] arg2) {
        if (arg1 != 35040) {
            return;
        }
        field8542++;
        this.method3178(34963);
        if (this.field8536 >= arg0) {
            OpenGL.glBufferSubDataARBub(this.field8539, 0, arg0, arg2, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field8539, arg0, arg2, 0, this.field8535 ? 35040 : 35044);
            this.field8540.field4965 += arg0 - this.field8536;
            this.field8536 = arg0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lep;I[BIZ)V")
    public class592(class371 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field8539 = arg1;
        this.field8536 = arg3;
        this.field8540 = arg0;
        this.field8535 = arg4;
        OpenGL.glGenBuffersARB(1, class682.field9589, 0);
        this.field8534 = class682.field9589[0];
        this.method3178(34963);
        OpenGL.glBufferDataARBub(arg1, this.field8536, arg2, 0, this.field8535 ? 35040 : 35044);
        this.field8540.field4965 += this.field8536;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lep;ILjaclib/memory/Buffer;IZ)V")
    public class592(class371 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field8536 = arg3;
        this.field8539 = arg1;
        this.field8540 = arg0;
        this.field8535 = arg4;
        OpenGL.glGenBuffersARB(1, class682.field9589, 0);
        this.field8534 = class682.field9589[0];
        this.method3178(34963);
        OpenGL.glBufferDataARBa(arg1, this.field8536, arg2.getAddress(), this.field8535 ? 35040 : 35044);
        this.field8540.field4965 += this.field8536;
    }
}
