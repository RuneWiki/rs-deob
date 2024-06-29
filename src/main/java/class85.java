import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class85 extends class334 implements class455 {

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
    private int field1246 = -1;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    private int field1241 = -1;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "Lna;")
    private class211 field1232;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "Lgs;")
    public static class294 field1242;

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "Lsc;")
    public static class29 field1245;

    @OriginalMember(owner = "client!tr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method593((byte) -110);
        field1234++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BII)V")
    public final void method592(byte arg0, int arg1, int arg2) {
        field1244++;
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field1236);
        if (arg0 != -100) {
            this.method593((byte) 124);
        }
        this.field1246 = arg2;
        this.field1241 = arg1;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public final void method82(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field1246, this.field1241, 36161, 0);
        if (arg0 > 16) {
            field1247++;
            this.field1246 = -1;
            this.field1241 = -1;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public final void method593(byte arg0) {
        field1233++;
        if (this.field1236 > 0) {
            this.field1232.method1547(this.field1236, this.field1235, true);
            this.field1236 = 0;
        }
        int var2 = -58 % ((arg0 + 43) / 54);
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
    public static void method594(byte arg0) {
        field1242 = null;
        field1245 = null;
        if (arg0 != -36) {
            field1245 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Lsj;")
    public static final class284 method595(int arg0, int arg1, int arg2) {
        field1243++;
        class284 var3 = new class284();
        var3.field4486 = arg1 + 1 + 5;
        if (arg0 >= -121) {
            return null;
        }
        var3.field4494 = -1;
        var3.field4480 = -1;
        var3.field4490 = arg2 + 1 + 5;
        var3.field4485 = new int[var3.field4490][var3.field4486];
        var3.method1907(-118);
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lna;III)V")
    public class85(class211 arg0, int arg1, int arg2, int arg3) {
        this.field1232 = arg0;
        this.field1240 = arg3;
        this.field1237 = arg2;
        this.field1238 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class270.field4319, 0);
        this.field1236 = class270.field4319[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1236);
        OpenGL.glRenderbufferStorageEXT(36161, this.field1238, this.field1237, this.field1240);
        this.field1235 = this.field1237 * this.field1240 * this.field1232.method1493(103, this.field1238);
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lna;IIII)V")
    public class85(class211 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1238 = arg1;
        this.field1232 = arg0;
        this.field1240 = arg3;
        this.field1237 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class270.field4319, 0);
        this.field1236 = class270.field4319[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1236);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field1238, this.field1237, this.field1240);
        this.field1235 = this.field1240 * this.field1237 * this.field1232.method1493(84, this.field1238);
    }
}
