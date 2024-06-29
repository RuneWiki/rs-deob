import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class88 extends IOException {

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    public static int[] field1224 = new int[1024];

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "S")
    public static short field1222 = 1;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Luw;")
    public static class208 field1225 = new class208(74, 4);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[Lpu;")
    public static class772[] field1220;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 5)
    public class88(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIII)V", line = 10)
    public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1223++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class178.field2341 - class721.field9475) * var8 / 100 + class721.field9475;
        int var10 = arg3 * var9 >> 8;
        class628.field7974 = class628.field7979 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class541.field6805[var11] * -var10 >> 14;
            var15 = class541.field6806[var11] * var10 >> 14;
        }
        if (arg6 > -19) {
            field1221 = 115;
        }
        if (var12 != 0) {
            var13 = class541.field6805[var12] * var15 >> 14;
            var15 = class541.field6806[var12] * var15 >> 14;
        }
        class511.field6521 = 0;
        class97.field1309 = arg4 - var13;
        class232.field3122 = arg5;
        class439.field5770 = arg7 - var14;
        class463.field6022 = arg0;
        class148.field1890 = arg1 - var15;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 65)
    public static void method540(byte arg0) {
        field1220 = null;
        field1225 = null;
        int var1 = 26 / ((-arg0 - 1) / 35);
        field1224 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 76)
    public static final void method541(byte arg0) {
        class765 var1 = (class765) class595.field7563.method3591(0);
        int var2 = -67 / ((-arg0 - 59) / 38);
        while (var1 != null) {
            if (class554.method3012(-31703, var1.field10412)) {
                class53.method331(-119, var1);
            }
            var1 = (class765) class595.field7563.method3600((byte) 104);
        }
        field1226++;
    }
}
