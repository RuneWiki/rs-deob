import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class473 extends class4 implements class635 {

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
    private int field6551 = -1;

    @OriginalMember(owner = "client!bca", name = "C", descriptor = "I")
    private int field6554 = -1;

    @OriginalMember(owner = "client!bca", name = "E", descriptor = "Ldw;")
    private class664 field6556;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
    public int field6546;

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
    private int field6549;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
    public int field6545;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "I")
    private int field6548;

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "I")
    private int field6544;

    @OriginalMember(owner = "client!bca", name = "y", descriptor = "[I")
    public static int[] field6550 = new int[4];

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    public static int field6558 = 0;

    @OriginalMember(owner = "client!bca", name = "B", descriptor = "[I")
    public static int[] field6553 = new int[200];

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "Lkr;")
    public static class602 field6557 = new class602(9, -1);

    @OriginalMember(owner = "client!bca", name = "H", descriptor = "Lkr;")
    public static class602 field6559 = new class602(83, 10);

    @OriginalMember(owner = "client!bca", name = "J", descriptor = "[J")
    public static long[] field6561 = new long[32];

    @OriginalMember(owner = "client!bca", name = "I", descriptor = "[I")
    public static int[] field6560 = new int[1];

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!bca", name = "A", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!bca", name = "D", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    public final void method2235(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field6551, this.field6554, 36161, arg0);
        field6547++;
        this.field6551 = -1;
        this.field6554 = -1;
    }

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "(I)V")
    public static void method2868(int arg0) {
        field6550 = null;
        field6561 = null;
        field6559 = null;
        field6560 = null;
        if (arg0 != 36161) {
            method2868(-61);
        }
        field6553 = null;
        field6557 = null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
    public final void method2869(byte arg0) {
        int var2 = 59 % ((arg0 - 71) / 55);
        field6555++;
        if (this.field6548 > 0) {
            this.field6556.method3701(this.field6544, this.field6548, (byte) -30);
            this.field6548 = 0;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BII)V")
    public final void method2870(byte arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field6548);
        int var4 = -82 / ((arg0 + 17) / 39);
        field6543++;
        this.field6554 = arg2;
        this.field6551 = arg1;
    }

    @OriginalMember(owner = "client!bca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6552++;
        this.method2869((byte) 126);
        super.finalize();
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Ldw;III)V")
    public class473(class664 arg0, int arg1, int arg2, int arg3) {
        this.field6556 = arg0;
        this.field6546 = arg3;
        this.field6549 = arg1;
        this.field6545 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class432.field6034, 0);
        this.field6548 = class432.field6034[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6548);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6549, this.field6545, this.field6546);
        this.field6544 = this.field6546 * this.field6545 * this.field6556.method3677(this.field6549, 3283);
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Ldw;IIII)V")
    public class473(class664 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6556 = arg0;
        this.field6549 = arg1;
        this.field6546 = arg3;
        this.field6545 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class432.field6034, 0);
        this.field6548 = class432.field6034[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6548);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6549, this.field6545, this.field6546);
        this.field6544 = this.field6546 * this.field6545 * this.field6556.method3677(this.field6549, 3283);
    }
}
