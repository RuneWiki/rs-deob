import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class362 extends class6 implements class313 {

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    private int field5297 = -1;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    private int field5287 = -1;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    private int field5290;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "Lef;")
    private class338 field5286;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public int field5294;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    private int field5295;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    private int field5293;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field5292 = 1400;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "Lmg;")
    public static class101 field5296;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "Lrk;")
    public static class25 field5299;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)V")
    public final void method2181(int arg0, byte arg1, int arg2) {
        field5289++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field5295);
        this.field5297 = arg0;
        this.field5287 = arg2;
        if (arg1 >= -103) {
            this.method2181(18, (byte) 68, -24);
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    public static void method2182(byte arg0) {
        if (arg0 != -21) {
            field5296 = null;
        }
        field5299 = null;
        field5296 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public final void method332(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field5297, this.field5287, 36161, 0);
        field5298++;
        if (arg0 == 37) {
            this.field5297 = -1;
            this.field5287 = -1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5285++;
        this.method2184(2);
        super.finalize();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lem;III)V")
    public static final void method2183(class150 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -5) {
            return;
        }
        if (arg0.field2258 == 0) {
            arg0.field2247 = arg0.field2197;
        } else if (arg0.field2258 == 1) {
            arg0.field2247 = (arg1 - arg0.field2322) / 2 + arg0.field2197;
        } else if (arg0.field2258 == 2) {
            arg0.field2247 = arg1 - arg0.field2322 - arg0.field2197;
        } else if (arg0.field2258 == 3) {
            arg0.field2247 = arg0.field2197 * arg1 >> 14;
        } else if (arg0.field2258 == 4) {
            arg0.field2247 = (arg1 - arg0.field2322) / 2 + (arg0.field2197 * arg1 >> 14);
        } else {
            arg0.field2247 = arg1 - (arg0.field2197 * arg1 >> 14) - arg0.field2322;
        }
        field5291++;
        if (arg0.field2280 == 0) {
            arg0.field2309 = arg0.field2166;
        } else if (arg0.field2280 == 1) {
            arg0.field2309 = (arg2 - arg0.field2204) / 2 + arg0.field2166;
        } else if (arg0.field2280 == 2) {
            arg0.field2309 = arg2 - arg0.field2204 - arg0.field2166;
        } else if (arg0.field2280 == 3) {
            arg0.field2309 = arg0.field2166 * arg2 >> 14;
        } else if (arg0.field2280 == 4) {
            arg0.field2309 = (arg2 - arg0.field2204) / 2 + (arg0.field2166 * arg2 >> 14);
        } else {
            arg0.field2309 = arg2 - (arg0.field2166 * arg2 >> 14) - arg0.field2204;
        }
        if (!class214.field2982 || client.method1228(arg0).field2719 == 0 && arg0.field2315 != 0) {
            return;
        }
        if (arg0.field2309 < 0) {
            arg0.field2309 = 0;
        } else if (arg2 < (arg0.field2309 + arg0.field2204)) {
            arg0.field2309 = arg2 - arg0.field2204;
        }
        if (arg0.field2247 < 0) {
            arg0.field2247 = 0;
        } else if (arg0.field2322 + arg0.field2247 > arg1) {
            arg0.field2247 = arg1 - arg0.field2322;
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
    public final void method2184(int arg0) {
        if (arg0 != 2) {
            this.method2181(-64, (byte) -32, 107);
        }
        if (this.field5295 > 0) {
            this.field5286.method1993(this.field5293, this.field5295, 32616);
            this.field5295 = 0;
        }
        field5288++;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lef;III)V")
    public class362(class338 arg0, int arg1, int arg2, int arg3) {
        this.field5290 = arg1;
        this.field5286 = arg0;
        this.field5294 = arg3;
        this.field5284 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class146.field2086, 0);
        this.field5295 = class146.field2086[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5295);
        OpenGL.glRenderbufferStorageEXT(36161, this.field5290, this.field5284, this.field5294);
        this.field5293 = this.field5294 * this.field5284 * this.field5286.method1956(this.field5290, 6410);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lef;IIII)V")
    public class362(class338 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5294 = arg3;
        this.field5290 = arg1;
        this.field5286 = arg0;
        this.field5284 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class146.field2086, 0);
        this.field5295 = class146.field2086[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5295);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field5290, this.field5284, this.field5294);
        this.field5293 = this.field5294 * this.field5284 * this.field5286.method1956(this.field5290, 6410);
    }
}
