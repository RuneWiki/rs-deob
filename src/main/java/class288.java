import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class288 extends class85 implements class401 {

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    private int field3679 = -1;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
    private int field3681 = -1;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    private int field3682;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "Lgk;")
    private class463 field3683;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    private int field3675;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    private int field3680;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "[[F")
    public static float[][] field3690 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "Ldn;")
    public static class201 field3685;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIBIIIII[[[BLqa;I)V")
    public static final void method1744(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[][][] arg10, class129 arg11, int arg12) {
        field3674++;
        if (arg0 == 0 || arg5 == 0) {
            return;
        }
        int var13 = 99 % ((arg4 + 88) / 36);
        if (arg0 == 9) {
            arg0 = 1;
            arg3 = arg3 + 1 & 0x3;
        }
        if (arg0 == 10) {
            arg0 = 1;
            arg3 = arg3 + 3 & 0x3;
        }
        if (arg0 == 11) {
            arg3 = arg3 + 3 & 0x3;
            arg0 = 8;
        }
        arg11.method864(arg1, arg7, arg12, arg6, arg8, arg9, arg10[arg0 - 1][arg3], arg5, arg2);
    }

    @OriginalMember(owner = "client!hp", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1748(4325);
        field3676++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public final void method220(int arg0) {
        field3687++;
        OpenGL.glFramebufferRenderbufferEXT(this.field3681, this.field3679, 36161, arg0);
        this.field3681 = -1;
        this.field3679 = -1;
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)V")
    public static final void method1745(byte arg0) {
        if (class319.field4105 != null) {
            class319.field4105.method878((byte) -122);
            class67.field834 = null;
            class319.field4105 = null;
        }
        if (arg0 != 91) {
            field3690 = null;
        }
        field3673++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
    public static void method1746(boolean arg0) {
        if (arg0) {
            field3690 = null;
        }
        field3685 = null;
        field3690 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([[BLbi;I)V")
    public static final void method1747(byte[][] arg0, class381 arg1, int arg2) {
        field3684++;
        if (arg2 != 64) {
            field3685 = null;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class88 var11 = new class88(var10);
                int var12 = class194.field2507[var5] >> 8;
                int var13 = class194.field2507[var5] & 0xFF;
                int var14 = var12 * 64 - class35.field545;
                int var15 = var13 * 64 - class336.field4299;
                class100.method679(16384);
                arg1.method1410(var11, class336.field4299, class35.field545, false, var14, class171.field2215, var15);
                arg1.method2215(var3, 27056, var11, var14, class512.field7538, var15);
                if (!arg1.field2825 && class53.field719 / 8 == var12 && class415.field5529 / 8 == var13 && var3[0] != -1) {
                    class11.field190 = class264.field3355.method430(class261.field3316, var3[3], var3[2], 0, var3[0], var3[1]);
                    class103.field1418 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class194.field2507[var6] >> 8) * 64 - class35.field545;
            int var8 = (class194.field2507[var6] & 0xFF) * 64 - class336.field4299;
            byte[] var9 = arg0[var6];
            if (var9 == null && class415.field5529 < 800) {
                class100.method679(16384);
                arg1.method1408(-16132, var7, 64, var8, 64);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V")
    public final void method1748(int arg0) {
        if (this.field3675 > 0) {
            this.field3683.method2765(arg0 ^ 0x10E5, this.field3680, this.field3675);
            this.field3675 = 0;
        }
        if (arg0 == 4325) {
            field3678++;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZ)V")
    public final void method1749(int arg0, int arg1, boolean arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field3675);
        field3686++;
        this.field3681 = arg0;
        if (arg2) {
            this.field3679 = arg1;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lgk;III)V")
    public class288(class463 arg0, int arg1, int arg2, int arg3) {
        this.field3677 = arg2;
        this.field3682 = arg1;
        this.field3683 = arg0;
        this.field3688 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class109.field1517, 0);
        this.field3675 = class109.field1517[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3675);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3682, this.field3677, this.field3688);
        this.field3680 = this.field3688 * this.field3677 * this.field3683.method2784(-115, this.field3682);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lgk;IIII)V")
    public class288(class463 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3683 = arg0;
        this.field3688 = arg3;
        this.field3682 = arg1;
        this.field3677 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class109.field1517, 0);
        this.field3675 = class109.field1517[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3675);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3682, this.field3677, this.field3688);
        this.field3680 = this.field3688 * this.field3677 * this.field3683.method2784(-123, this.field3682);
    }
}
