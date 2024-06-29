import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class146 extends class452 implements class526 {

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    private int field2218 = -1;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    private int field2224 = -1;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    private int field2225;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Lkd;")
    private class188 field2214;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    private int field2221;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Lhn;")
    public static class509 field2222 = new class509(61, 7);

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "Lhn;")
    public static class509 field2226 = new class509(83, 2);

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Lie;")
    public static class6 field2227 = new class6("WIP", 2);

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "Lhn;")
    public static class509 field2228 = new class509(27, 8);

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public final void method1031(int arg0) {
        field2220++;
        OpenGL.glFramebufferRenderbufferEXT(this.field2218, this.field2224, 36161, 0);
        this.field2218 = -1;
        if (arg0 <= 98) {
            this.method1032(117);
        }
        this.field2224 = -1;
    }

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "(I)V")
    public final void method1032(int arg0) {
        if (this.field2221 > 0) {
            this.field2214.method1262(-73, this.field2221, this.field2217);
            this.field2221 = 0;
        }
        if (arg0 == -10755) {
            field2212++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2215++;
        this.method1032(-10755);
        super.finalize();
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static final void method1033(boolean arg0) {
        field2223++;
        class74.method640(-29627, class356.field5262);
        class135.field2059++;
        class71.field1020.method1545(class32.method223((byte) 123), -115);
        class71.field1020.method1542(class80.field1163, -2756);
        class71.field1020.method1542(class76.field1105, -2756);
        class71.field1020.method1545(class193.field3258.field7248, -106);
        if (!arg0) {
            method1035(-7);
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)V")
    public final void method1034(int arg0, int arg1, int arg2) {
        field2213++;
        if (arg1 != -9307) {
            this.field2219 = 50;
        }
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg0, 36161, this.field2221);
        this.field2224 = arg0;
        this.field2218 = arg2;
    }

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "(I)V")
    public static void method1035(int arg0) {
        field2227 = null;
        if (arg0 > -65) {
            method1035(41);
        }
        field2228 = null;
        field2222 = null;
        field2226 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lkd;III)V")
    public class146(class188 arg0, int arg1, int arg2, int arg3) {
        this.field2225 = arg1;
        this.field2216 = arg2;
        this.field2219 = arg3;
        this.field2214 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class221.field3629, 0);
        this.field2221 = class221.field3629[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field2221);
        OpenGL.glRenderbufferStorageEXT(36161, this.field2225, this.field2216, this.field2219);
        this.field2217 = this.field2219 * this.field2216 * this.field2214.method1306(false, this.field2225);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lkd;IIII)V")
    public class146(class188 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2225 = arg1;
        this.field2214 = arg0;
        this.field2216 = arg2;
        this.field2219 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class221.field3629, 0);
        this.field2221 = class221.field3629[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field2221);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field2225, this.field2216, this.field2219);
        this.field2217 = this.field2216 * this.field2219 * this.field2214.method1306(false, this.field2225);
    }
}
