import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 extends class80 {

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "Lpj;")
    public static class132 field211;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)Lhs;")
    public final class295 method52(int arg0) {
        field213++;
        return arg0 == -14151 ? class389.field5463 : null;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lfw;Ldg;IIIIIIII)V")
    public class11(class52 arg0, class377 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.field209 = arg9;
        this.field212 = arg8;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IBIIII)V")
    public static final void method53(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class648.field9190 = arg0;
        int var6 = -123 % ((27 - arg1) / 48);
        class407.field5738 = arg2;
        field210++;
        class576.field7745 = arg5;
        class528.field7231 = arg4;
        class527.field7223 = arg3;
        if (class576.field7745 >= 100) {
            int var7 = class407.field5738 * 512 + 256;
            int var8 = class528.field7231 * 512 + 256;
            int var9 = class203.method1355(var8, var7, 4, class233.field3305) - class527.field7223;
            int var10 = var7 - class172.field2572;
            int var11 = var9 - class628.field8762;
            int var12 = var8 - class117.field1563;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class492.field6794 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
            class591.field8245 = (int) (-2607.5945876176133D * Math.atan2((double) var10, (double) var12)) & 0x3FFF;
            class263.field3732 = 0;
            if (class492.field6794 < 1024) {
                class492.field6794 = 1024;
            }
            if (class492.field6794 > 3072) {
                class492.field6794 = 3072;
            }
        }
        class670.field9445 = 2;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)V")
    public static void method54(byte arg0) {
        field211 = null;
        if (arg0 != -11) {
            field211 = null;
        }
    }
}
