import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class446 extends class507 implements class383 {

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    private int field6488 = -1;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "I")
    private int field6500 = -1;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "Lur;")
    private class377 field6491;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    private int field6489;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public int field6494;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public int field6487;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    private int field6497;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    private int field6501;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "Ljk;")
    public static class450 field6492 = null;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "Lke;")
    public static class426 field6499;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public final void method863(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field6488, this.field6500, 36161, 0);
        if (arg0 != 103) {
            this.field6488 = -67;
        }
        field6498++;
        this.field6500 = -1;
        this.field6488 = -1;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lza;Lfo;I)V")
    public static final void method2753(class287 arg0, class361 arg1, int arg2) {
        field6485++;
        if (class525.field7730) {
            return;
        }
        arg0.method1145(0);
        class337.field4467 = arg0.method1236(class491.method2963(arg1, class36.field371), true);
        class337.field4467.method144((class372.field5051 - class337.field4467.method155()) / 2, (class430.field6244 - class337.field4467.method153()) / 2);
        class34.field349 = arg0.method1236(class491.method2963(arg1, class339.field4486), true);
        class34.field349.method144((class372.field5051 - class34.field349.method155()) / 2, arg2);
        class525.field7730 = true;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Lgd;")
    public static final class227 method2754(int arg0, int arg1) {
        field6493++;
        if (arg1 <= 105) {
            field6492 = null;
        }
        if (arg0 == 0) {
            return new class394();
        } else if (arg0 == 1) {
            return new class243();
        } else if (arg0 == 2) {
            return new class444();
        } else if (arg0 == 3) {
            return new class146();
        } else if (arg0 == 4) {
            return new class223();
        } else if (arg0 == 5) {
            return new class66();
        } else if (arg0 == 6) {
            return new class329();
        } else if (arg0 == 7) {
            return new class134();
        } else if (arg0 == 8) {
            return new class385();
        } else if (arg0 == 9) {
            return new class265();
        } else if (arg0 == 10) {
            return new class259();
        } else if (arg0 == 11) {
            return new class80();
        } else if (arg0 == 12) {
            return new class258();
        } else if (arg0 == 13) {
            return new class401();
        } else if (arg0 == 14) {
            return new class9();
        } else if (arg0 == 15) {
            return new class434();
        } else if (arg0 == 16) {
            return new class413();
        } else if (arg0 == 17) {
            return new class153();
        } else if (arg0 == 18) {
            return new class456();
        } else if (arg0 == 19) {
            return new class161();
        } else if (arg0 == 20) {
            return new class128();
        } else if (arg0 == 21) {
            return new class109();
        } else if (arg0 == 22) {
            return new class32();
        } else if (arg0 == 23) {
            return new class20();
        } else if (arg0 == 24) {
            return new class76();
        } else if (arg0 == 25) {
            return new class384();
        } else if (arg0 == 26) {
            return new class307();
        } else if (arg0 == 27) {
            return new class424();
        } else if (arg0 == 28) {
            return new class143();
        } else if (arg0 == 29) {
            return new class308();
        } else if (arg0 == 30) {
            return new class431();
        } else if (arg0 == 31) {
            return new class152();
        } else if (arg0 == 32) {
            return new class162();
        } else if (arg0 == 33) {
            return new class410();
        } else if (arg0 == 34) {
            return new class427();
        } else if (arg0 == 35) {
            return new class477();
        } else if (arg0 == 36) {
            return new class522();
        } else if (arg0 == 37) {
            return new class159();
        } else if (arg0 == 38) {
            return new class173();
        } else if (arg0 == 39) {
            return new class443();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)V")
    public static void method2755(byte arg0) {
        field6499 = null;
        int var1 = -105 / ((-arg0 - 32) / 35);
        field6492 = null;
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(B)V")
    public final void method2756(byte arg0) {
        field6495++;
        int var2 = -109 / ((-arg0 - 72) / 44);
        if (this.field6497 > 0) {
            this.field6491.method2232((byte) 119, this.field6497, this.field6501);
            this.field6497 = 0;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)V")
    public final void method2757(int arg0, int arg1, int arg2) {
        field6490++;
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, arg0, this.field6497);
        this.field6500 = arg2;
        this.field6488 = arg1;
    }

    @OriginalMember(owner = "client!tq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6496++;
        this.method2756((byte) 93);
        super.finalize();
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lur;III)V")
    public class446(class377 arg0, int arg1, int arg2, int arg3) {
        this.field6491 = arg0;
        this.field6489 = arg1;
        this.field6494 = arg3;
        this.field6487 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class79.field973, 0);
        this.field6497 = class79.field973[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6497);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6489, this.field6487, this.field6494);
        this.field6501 = this.field6494 * this.field6487 * this.field6491.method2302(this.field6489, 34844);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lur;IIII)V")
    public class446(class377 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6491 = arg0;
        this.field6487 = arg2;
        this.field6494 = arg3;
        this.field6489 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class79.field973, 0);
        this.field6497 = class79.field973[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6497);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6489, this.field6487, this.field6494);
        this.field6501 = this.field6487 * this.field6494 * this.field6491.method2302(this.field6489, 34844);
    }
}
