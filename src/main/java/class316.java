import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class316 extends class678 {

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "[B")
    public byte[] field4658;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field4654 = 0;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI[BLjq;)Lrga;")
    public static final class220 method2041(byte arg0, int arg1, byte[] arg2, class475 arg3) {
        field4655++;
        if (arg2 == null) {
            return null;
        } else if (arg0 < 52) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg1, var4);
            OpenGL.glProgramRawARB(arg1, 34933, arg2);
            OpenGL.glGetIntegerv(34379, class404.field5832, 0);
            if (class404.field5832[0] == -1) {
                OpenGL.glBindProgramARB(arg1, 0);
                return new class220(arg3, arg1, var4);
            } else {
                OpenGL.glBindProgramARB(arg1, 0);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V")
    public static final void method2042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4657++;
        int var6 = arg1 - arg3;
        int var7 = arg4 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class236.method1577(arg3, arg2, arg1, arg5 - 16156, arg0);
            }
        } else if (var6 == 0) {
            class634.method3616(arg3, arg5 - 120, arg2, arg4, arg0);
        } else {
            if (arg5 < ~var7) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                arg0 = arg3;
                int var10 = arg4;
                arg3 = var9;
                arg4 = arg1;
                arg1 = var10;
            }
            if (arg4 < arg0) {
                int var11 = arg0;
                int var12 = arg3;
                arg0 = arg4;
                arg3 = arg1;
                arg4 = var11;
                arg1 = var12;
            }
            int var13 = arg3;
            int var14 = arg4 - arg0;
            int var15 = arg1 - arg3;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg1 > arg3 ? 1 : -1;
            if (var8) {
                for (int var18 = arg0; var18 <= arg4; var18++) {
                    var16 += var15;
                    class582.field8429[var18][var13] = arg2;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg4; var19++) {
                    var16 += var15;
                    class582.field8429[var13][var19] = arg2;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([B)V")
    public class316(byte[] arg0) {
        this.field4658 = arg0;
    }
}
