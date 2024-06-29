import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class267 extends class321 implements class113 {

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    private int field3480 = -1;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    private int field3493 = -1;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    private int field3484;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "Luca;")
    private class287 field3491;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    private int field3477;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "[I")
    public static int[] field3481 = new int[2];

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "[I")
    public static int[] field3478 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public static int field3483 = 0;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field3485 = 0;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "Lks;")
    public static class421 field3489;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "[[S")
    public static short[][] field3482;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "[[[J")
    public static long[][][] field3487;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
    public final void method1598(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field3477);
        field3488++;
        this.field3493 = arg2;
        this.field3480 = arg1;
        if (arg0 <= 45) {
            this.method1599(-2);
        }
    }

    @OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1599(36161);
        field3475++;
        super.finalize();
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
    public final void method1599(int arg0) {
        if (this.field3477 > 0) {
            this.field3491.method1708(arg0 ^ 0xF99D, this.field3477, this.field3479);
            this.field3477 = 0;
        }
        if (arg0 != 36161) {
            field3487 = null;
        }
        field3486++;
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V")
    public static void method1600(int arg0) {
        field3482 = null;
        field3478 = null;
        field3489 = null;
        field3487 = null;
        if (arg0 != 0) {
            field3483 = 70;
        }
        field3481 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public final void method847(byte arg0) {
        field3490++;
        OpenGL.glFramebufferRenderbufferEXT(this.field3493, this.field3480, 36161, 0);
        if (arg0 != -79) {
            this.field3493 = -3;
        }
        this.field3480 = -1;
        this.field3493 = -1;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Luca;III)V")
    public class267(class287 arg0, int arg1, int arg2, int arg3) {
        this.field3476 = arg2;
        this.field3492 = arg3;
        this.field3484 = arg1;
        this.field3491 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class300.field4412, 0);
        this.field3477 = class300.field4412[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3477);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3484, this.field3476, this.field3492);
        this.field3479 = this.field3492 * this.field3476 * this.field3491.method1768((byte) 91, this.field3484);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Luca;IIII)V")
    public class267(class287 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3492 = arg3;
        this.field3484 = arg1;
        this.field3476 = arg2;
        this.field3491 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class300.field4412, 0);
        this.field3477 = class300.field4412[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3477);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3484, this.field3476, this.field3492);
        this.field3479 = this.field3492 * this.field3476 * this.field3491.method1768((byte) 91, this.field3484);
    }
}
