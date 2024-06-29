import jaggl.OpenGL;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class325 extends class143 implements class220 {

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    private int field4527 = -1;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    private int field4537 = -1;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "Lkfa;")
    private class382 field4524;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    private int field4533;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    private int field4534;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "[I")
    public static int[] field4528 = new int[5];

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() throws Throwable {
        field4529++;
        this.method1940(-78);
        super.finalize();
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V", line = 17)
    public final void method1940(int arg0) {
        if (arg0 > -44) {
            this.field4527 = 116;
        }
        field4532++;
        if (this.field4534 > 0) {
            this.field4524.method2317(4615, this.field4523, this.field4534);
            this.field4534 = 0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 37)
    public final void method1475(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field4527, this.field4537, 36161, 0);
        field4525++;
        this.field4537 = -1;
        if (arg0 < 49) {
            this.method1475(-100);
        }
        this.field4527 = -1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILjava/io/File;B)[B", line = 50)
    public static final byte[] method1941(int arg0, File arg1, byte arg2) {
        field4530++;
        if (arg2 != 127) {
            method1941(63, null, (byte) 37);
        }
        try {
            byte[] var3 = new byte[arg0];
            class407.method2442(arg0, var3, (byte) -112, arg1);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V", line = 74)
    public final void method1942(int arg0, int arg1, int arg2) {
        if (arg0 != -4993) {
            this.field4523 = 71;
        }
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field4534);
        field4538++;
        this.field4527 = arg2;
        this.field4537 = arg1;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lkfa;III)V", line = 121)
    public class325(class382 arg0, int arg1, int arg2, int arg3) {
        this.field4524 = arg0;
        this.field4536 = arg3;
        this.field4522 = arg2;
        this.field4533 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class550.field8067, 0);
        this.field4534 = class550.field8067[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4534);
        OpenGL.glRenderbufferStorageEXT(36161, this.field4533, this.field4522, this.field4536);
        this.field4523 = this.field4522 * this.field4536 * this.field4524.method2323((byte) -87, this.field4533);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lkfa;IIII)V", line = 136)
    public class325(class382 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4536 = arg3;
        this.field4524 = arg0;
        this.field4533 = arg1;
        this.field4522 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class550.field8067, 0);
        this.field4534 = class550.field8067[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4534);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field4533, this.field4522, this.field4536);
        this.field4523 = this.field4522 * this.field4536 * this.field4524.method2323((byte) -87, this.field4533);
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Lqba;", line = 92)
    public static final class369 method1943(int arg0) {
        if (arg0 != -1) {
            field4528 = null;
        }
        field4535++;
        return class161.field2607;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)V", line = 112)
    public static void method1944(byte arg0) {
        if (arg0 != 93) {
            field4528 = null;
        }
        field4528 = null;
    }
}
