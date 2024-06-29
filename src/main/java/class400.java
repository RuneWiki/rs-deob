import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class400 extends class644 implements class200 {

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    private int field5094 = -1;

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
    private int field5087 = -1;

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "I")
    public int field5093;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    private int field5080;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "Lbi;")
    private class483 field5091;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    public int field5082;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
    private int field5086;

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "Lsf;")
    public static class526 field5092 = new class526("", 15);

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "[Lcaa;")
    public static class306[] field5095;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V", line = 3)
    public static void method2236(byte arg0) {
        field5092 = null;
        field5095 = null;
        int var1 = -5 / ((-arg0 - 10) / 57);
    }

    @OriginalMember(owner = "client!mt", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() throws Throwable {
        field5088++;
        this.method2237(81);
        super.finalize();
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)V", line = 24)
    public final void method2237(int arg0) {
        if (this.field5081 > 0) {
            this.field5091.method2778(this.field5081, this.field5086, true);
            this.field5081 = 0;
        }
        if (arg0 < 69) {
            this.field5082 = -2;
        }
        field5090++;
    }

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "(I)V", line = 41)
    public static final void method2238(int arg0) {
        field5084++;
        if (arg0 < 20) {
            field5095 = null;
        }
        if (class625.field8601 == null) {
            return;
        }
        if (class625.field8601.field2538 == 1) {
            class625.field8601 = null;
            return;
        }
        if (class625.field8601.field2538 == 2) {
            class37.method233(class660.field9193, (byte) 69, class285.field3595, 2);
            class625.field8601 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(III)V", line = 72)
    public final void method2239(int arg0, int arg1, int arg2) {
        field5083++;
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, arg0, this.field5081);
        this.field5094 = arg2;
        this.field5087 = arg1;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 91)
    public final void method633(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field5094, this.field5087, 36161, 0);
        field5085++;
        this.field5087 = -1;
        if (arg0 >= -70) {
            this.field5093 = 114;
        }
        this.field5094 = -1;
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(III)V", line = 108)
    public static final void method2240(int arg0, int arg1, int arg2) {
        field5089++;
        if (arg2 > -103) {
            method2240(-120, 43, 33);
        }
        if (class15.field299 == 1) {
            class86.method715(class547.field7656, false, arg1, arg0);
        } else if (class15.field299 == 2) {
            if (class676.field9448) {
                class548.method3186(class453.method2540(-83) + arg1, class209.method1347(0) + arg0, 0);
            } else {
                class548.method3186(arg1, arg0, 0);
            }
        }
        class547.field7656 = null;
        class15.field299 = 0;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lbi;III)V", line = 144)
    public class400(class483 arg0, int arg1, int arg2, int arg3) {
        this.field5093 = arg3;
        this.field5080 = arg1;
        this.field5091 = arg0;
        this.field5082 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class108.field1571, 0);
        this.field5081 = class108.field1571[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5081);
        OpenGL.glRenderbufferStorageEXT(36161, this.field5080, this.field5082, this.field5093);
        this.field5086 = this.field5093 * this.field5082 * this.field5091.method2837(this.field5080, -1);
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lbi;IIII)V", line = 159)
    public class400(class483 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5082 = arg2;
        this.field5093 = arg3;
        this.field5091 = arg0;
        this.field5080 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class108.field1571, 0);
        this.field5081 = class108.field1571[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5081);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field5080, this.field5082, this.field5093);
        this.field5086 = this.field5093 * this.field5082 * this.field5091.method2837(this.field5080, -1);
    }
}
