import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class228 {

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public int field3356;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "B")
    public byte field3342;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Z")
    public boolean field3343;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "S")
    public short field3348;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "S")
    public short field3355;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "S")
    public short field3358;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field3349 = 0;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field3346 = 0;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "[Z")
    public static boolean[] field3352 = new boolean[100];

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public static int field3361 = 0;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Lqe;")
    public static class469 field3347 = new class469(58, 4);

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Lvd;")
    public static class39 field3345;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Lvd;")
    public static class39 field3354;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "Lqq;")
    public static class477 field3353;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIIB)I", line = 11)
    public static final int method1537(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3362++;
        if (arg4 >= -29) {
            field3347 = null;
        }
        int var5 = 65536 - class373.field5549[arg3 * 8192 / arg0] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;IILwh;)Lqi;", line = 31)
    public static final class569 method1538(String arg0, int arg1, int arg2, class148 arg3) {
        field3351++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg0);
        int var5 = -95 % ((-arg1 - 41) / 45);
        OpenGL.glGetIntegerv(34379, class625.field8747, 0);
        if (class625.field8747[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class569(arg3, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)I", line = 56)
    public static final int method1539(int arg0, int arg1, int arg2) {
        field3363++;
        if (arg0 != 100) {
            return 32;
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 88)
    public static void method1540(int arg0) {
        if (arg0 != 0) {
            method1539(83, 126, -12);
        }
        field3352 = null;
        field3353 = null;
        field3354 = null;
        field3345 = null;
        field3347 = null;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 106)
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3356 = arg11;
        this.field3342 = (byte) arg8;
        this.field3350 = arg2;
        this.field3357 = arg3;
        this.field3344 = arg1;
        this.field3359 = arg0;
        this.field3343 = arg10;
        this.field3348 = (short) arg6;
        this.field3355 = (short) arg4;
        this.field3358 = (short) arg5;
    }
}
