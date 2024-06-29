import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class213 extends class270 implements class520 {

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    private int field3377 = -1;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    private int field3382 = -1;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "Lih;")
    private class214 field3379;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    private int field3389;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    private int field3392;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    private int field3384;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "[I")
    public static int[] field3390 = new int[2];

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "Lbn;")
    public static class351 field3383;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "[[[Lut;")
    public static class465[][][] field3395;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)V", line = 9)
    public static final void method1398(int arg0, int arg1) {
        field3386++;
        if (arg1 != 0) {
            return;
        }
        if (class150.field2406 == 1) {
            class296.field4781 = arg0;
        } else if (class150.field2406 == 2 || class150.field2406 == 3) {
            class23.field300 = arg0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V", line = 27)
    public static final void method1399(byte arg0) {
        field3385++;
        client.field1166 = 0;
        class230.field4005 = 0;
        class157.field2547 = 0;
        class6.field66 = 0;
        if (arg0 != -87) {
            field3383 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 38)
    public final void method1213(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field3377, this.field3382, 36161, arg0);
        field3391++;
        this.field3377 = -1;
        this.field3382 = -1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V", line = 49)
    public final void method1400(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field3392);
        field3388++;
        this.field3382 = arg2;
        this.field3377 = arg1;
        if (arg0 != -18754) {
            field3383 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V", line = 64)
    public final void method1401(int arg0) {
        if (arg0 < 102) {
            return;
        }
        field3380++;
        if (this.field3392 > 0) {
            this.field3379.method1487(this.field3384, 0, this.field3392);
            this.field3392 = 0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIZ)V", line = 81)
    public static final void method1402(boolean arg0, int arg1, boolean arg2) {
        field3394++;
        if (arg2) {
            class165.field2616++;
            class265.method1769(98);
        }
        if (arg0) {
            class388.field5968++;
            class301.method1923((byte) -70);
        }
        if (arg1 != 640) {
            method1403((byte) 37);
        }
    }

    @OriginalMember(owner = "client!cj", name = "finalize", descriptor = "()V", line = 104)
    protected final void finalize() throws Throwable {
        this.method1401(109);
        field3393++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lih;III)V", line = 144)
    public class213(class214 arg0, int arg1, int arg2, int arg3) {
        this.field3379 = arg0;
        this.field3381 = arg3;
        this.field3389 = arg1;
        this.field3387 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class265.field4443, 0);
        this.field3392 = class265.field4443[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3392);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3389, this.field3387, this.field3381);
        this.field3384 = this.field3387 * this.field3381 * this.field3379.method1448(-48, this.field3389);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lih;IIII)V", line = 159)
    public class213(class214 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3381 = arg3;
        this.field3387 = arg2;
        this.field3389 = arg1;
        this.field3379 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class265.field4443, 0);
        this.field3392 = class265.field4443[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3392);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3389, this.field3387, this.field3381);
        this.field3384 = this.field3387 * this.field3381 * this.field3379.method1448(-110, this.field3389);
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(B)V", line = 117)
    public static void method1403(byte arg0) {
        if (arg0 == 24) {
            field3390 = null;
            field3383 = null;
            field3395 = null;
        }
    }
}
