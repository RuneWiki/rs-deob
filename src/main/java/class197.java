import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class197 extends class263 {

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "J")
    public long field2315;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
    public static int field2313 = -60;

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!uga", name = "n", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!uga", name = "o", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!uga", name = "q", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!uga", name = "m", descriptor = "J")
    public static long field2319;

    @OriginalMember(owner = "client!uga", name = "p", descriptor = "[I")
    public static int[] field2322;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BII)Z", line = 10)
    public static final boolean method1152(byte arg0, int arg1, int arg2) {
        if (arg0 == 19) {
            field2321++;
            return (arg2 & 0x10000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIII[BII[BI)V", line = 23)
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field2323++;
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 0x3);
        if (arg1 != 0) {
            return;
        }
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg7[var10001] += arg4[arg0++];
                int var14 = arg5++;
                arg7[var14] += arg4[arg0++];
                int var15 = arg5++;
                arg7[var15] += arg4[arg0++];
                int var16 = arg5++;
                arg7[var16] += arg4[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg7[var10001] += arg4[arg0++];
            }
            arg0 += arg3;
            arg5 += arg2;
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(BII)V", line = 67)
    public static final void method1154(byte arg0, int arg1, int arg2) {
        class668.field9055++;
        field2316++;
        class124 var3 = class336.method1924(class505.field6310, class636.field8620, (byte) -127);
        var3.field1516.method3089((byte) -31, arg2);
        var3.field1516.method3067(1370571624, arg1);
        method1156((byte) 122, var3);
        if (arg0 != 1) {
            field2322 = null;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V", line = 86)
    public static void method1155(int arg0) {
        field2322 = null;
        if (arg0 > -81) {
            field2318 = 61;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BLmc;)V", line = 96)
    public static final void method1156(byte arg0, class124 arg1) {
        class394.field5025.method1904(arg1, -71);
        field2320++;
        if (arg0 > 80) {
            arg1.field1515 = arg1.field1516.field7313;
            arg1.field1516.field7313 = 0;
            class95.field1235 += arg1.field1515;
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(III)I", line = 114)
    public static final int method1157(int arg0, int arg1, int arg2) {
        field2314++;
        if (arg2 == 1 || arg2 == 3) {
            return class665.field9033[arg0 & 0x3];
        } else {
            if (arg1 != 3) {
                method1153(-117, 40, 5, 45, null, -47, 54, null, 92);
            }
            return class621.field8437[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V", line = 127)
    public class197() {
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(J)V", line = 129)
    public class197(long arg0) {
        this.field2315 = arg0;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILjaa;Ljava/lang/String;Z)Lfb;", line = 137)
    public static final class631 method1158(int arg0, class576 arg1, String arg2, boolean arg3) {
        if (arg3) {
            return null;
        }
        field2317++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class237.field3070, 0);
        if (class237.field3070[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class631(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }
}
