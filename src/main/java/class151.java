import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class151 extends class9 implements class317 {

    @OriginalMember(owner = "client!dca", name = "G", descriptor = "I")
    private int field1803 = -1;

    @OriginalMember(owner = "client!dca", name = "I", descriptor = "I")
    private int field1805 = -1;

    @OriginalMember(owner = "client!dca", name = "x", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!dca", name = "w", descriptor = "I")
    private int field1794;

    @OriginalMember(owner = "client!dca", name = "y", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!dca", name = "C", descriptor = "Lmh;")
    private class537 field1799;

    @OriginalMember(owner = "client!dca", name = "H", descriptor = "I")
    private int field1804;

    @OriginalMember(owner = "client!dca", name = "E", descriptor = "I")
    private int field1801;

    @OriginalMember(owner = "client!dca", name = "J", descriptor = "Lcea;")
    public static class180 field1806 = new class180("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!dca", name = "K", descriptor = "Lvj;")
    public static class373 field1807 = new class373(68, 8);

    @OriginalMember(owner = "client!dca", name = "L", descriptor = "Lrg;")
    public static class548 field1808 = new class548(30, 8);

    @OriginalMember(owner = "client!dca", name = "M", descriptor = "I")
    public static int field1809 = 0;

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!dca", name = "B", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!dca", name = "D", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!dca", name = "F", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(III)V")
    public final void method822(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field1804);
        if (arg0 != -1) {
            this.field1796 = 33;
        }
        field1802++;
        this.field1803 = arg1;
        this.field1805 = arg2;
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)V")
    public final void method823(int arg0) {
        field1797++;
        if (arg0 != 8) {
            this.method822(-30, -59, 42);
        }
        if (this.field1804 > 0) {
            this.field1799.method3065(16, this.field1804, this.field1801);
            this.field1804 = 0;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field1805, this.field1803, 36161, 0);
        field1800++;
        if (arg0 != 53) {
            this.method823(126);
        }
        this.field1805 = -1;
        this.field1803 = -1;
    }

    @OriginalMember(owner = "client!dca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method823(8);
        field1798++;
        super.finalize();
    }

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "(I)V")
    public static void method824(int arg0) {
        field1807 = null;
        field1808 = null;
        if (arg0 < -5) {
            field1806 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lmh;III)V")
    public class151(class537 arg0, int arg1, int arg2, int arg3) {
        this.field1795 = arg2;
        this.field1794 = arg1;
        this.field1796 = arg3;
        this.field1799 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class478.field6712, 0);
        this.field1804 = class478.field6712[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1804);
        OpenGL.glRenderbufferStorageEXT(36161, this.field1794, this.field1795, this.field1796);
        this.field1801 = this.field1795 * this.field1796 * this.field1799.method3128(this.field1794, (byte) 10);
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lmh;IIII)V")
    public class151(class537 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1799 = arg0;
        this.field1795 = arg2;
        this.field1796 = arg3;
        this.field1794 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class478.field6712, 0);
        this.field1804 = class478.field6712[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1804);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field1794, this.field1795, this.field1796);
        this.field1801 = this.field1796 * this.field1795 * this.field1799.method3128(this.field1794, (byte) 10);
    }
}
