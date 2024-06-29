import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class22 extends class287 implements class536 {

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    private int field311 = -1;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    private int field309 = -1;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Lpg;")
    private class333 field312;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "[I")
    public static int[] field313;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Let;", line = 5)
    public static final class466 method135(int arg0, int arg1, int arg2) {
        field299++;
        class466 var3 = new class466();
        var3.field6732 = arg1 + arg2 + 5;
        var3.field6745 = -1;
        var3.field6736 = arg0 + 5 + 1;
        var3.field6739 = -1;
        var3.field6737 = new int[var3.field6732][var3.field6736];
        var3.method2713(arg2 ^ 0xFFFFFF8F);
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)V", line = 23)
    public final void method136(int arg0, byte arg1, int arg2) {
        if (arg1 != -12) {
            this.method137(true);
        }
        field297++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field300);
        this.field309 = arg2;
        this.field311 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V", line = 38)
    public final void method137(boolean arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field311, this.field309, 36161, 0);
        if (!arg0) {
            field304++;
            this.field311 = -1;
            this.field309 = -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lat;", line = 52)
    public static final class444 method138(int arg0, int arg1) {
        field306++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        int var4 = 85 / ((arg0 + 4) / 48);
        if (class505.field7387[var2] == null || class505.field7387[var2][var3] == null) {
            boolean var5 = class523.method3109((byte) -65, var2);
            if (!var5) {
                return null;
            }
        }
        return class505.field7387[var2][var3];
    }

    @OriginalMember(owner = "client!rc", name = "finalize", descriptor = "()V", line = 78)
    protected final void finalize() throws Throwable {
        field298++;
        this.method140(122);
        super.finalize();
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V", line = 92)
    public static void method139(int arg0) {
        field313 = null;
        if (arg0 != 36161) {
            field313 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V", line = 102)
    public final void method140(int arg0) {
        if (this.field300 > 0) {
            this.field312.method1968((byte) -103, this.field307, this.field300);
            this.field300 = 0;
        }
        field303++;
        int var2 = 12 % ((arg0 + 70) / 55);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lpg;III)V", line = 127)
    public class22(class333 arg0, int arg1, int arg2, int arg3) {
        this.field301 = arg2;
        this.field308 = arg3;
        this.field312 = arg0;
        this.field305 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class350.field5077, 0);
        this.field300 = class350.field5077[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field300);
        OpenGL.glRenderbufferStorageEXT(36161, this.field305, this.field301, this.field308);
        this.field307 = this.field308 * this.field301 * this.field312.method2019((byte) 104, this.field305);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lpg;IIII)V", line = 142)
    public class22(class333 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field301 = arg2;
        this.field312 = arg0;
        this.field305 = arg1;
        this.field308 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class350.field5077, 0);
        this.field300 = class350.field5077[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field300);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field305, this.field301, this.field308);
        this.field307 = this.field308 * this.field301 * this.field312.method2019((byte) 114, this.field305);
    }
}
