import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class389 {

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Lft;")
    public static class285 field4983 = new class285(10, 3);

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "Lgaa;")
    public static class432 field4987 = new class432();

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "Lgs;")
    public class389 field4988;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Lgs;")
    public class389 field4989;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lpe;")
    public static class615 field4986;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 5)
    public static void method2225(int arg0) {
        field4983 = null;
        if (arg0 != 9573) {
            method2226(-109, 5, 120, -124, 19, -86, -72, 34, null, null);
        }
        field4986 = null;
        field4987 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIIIILwk;Lwk;)V", line = 31)
    public static final void method2226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class227 arg8, class227 arg9) {
        field4985++;
        int var10 = arg8.method1276((byte) -127);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class511 var12 = (class511) class425.field5516.method3655(-126, (long) var10);
        if (var12 == null) {
            class506[] var13 = class506.method2731(class90.field1186, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class520.field6799.method325(var13[0], true);
            class425.field5516.method3650((long) var10, -123, var12);
        }
        class89.method677(0, 0, arg9.method1265(110) * 256, arg3, arg5 >> 1, arg9.field506, arg0 >> 1, arg9.field508, arg1, arg9.field503);
        int var14 = class483.field6441[0] + arg2 - 18;
        int var15 = arg4 / 4 * 18 + var14;
        int var16 = class483.field6441[arg6] + arg7 - 54 - 16;
        int var17 = arg4 % 4 * 18 + var16;
        var12.method2751(var15, var17);
        if (arg8 == arg9) {
            class520.field6799.method354(18, -256, -80, var15 - 1, 18, var17 - 1);
        }
        class126 var18 = class294.method1739(true);
        var18.field1629 = var17 + 16;
        var18.field1631 = var15;
        var18.field1634 = var17;
        var18.field1627 = var15 + 16;
        var18.field1632 = arg8;
        class600.field8094.method2104((byte) -22, var18);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V", line = 82)
    public final void method2227(int arg0) {
        field4982++;
        if (this.field4988 == null) {
            return;
        }
        this.field4988.field4989 = this.field4989;
        if (arg0 < 10) {
            field4983 = null;
        }
        this.field4989.field4988 = this.field4988;
        this.field4988 = null;
        this.field4989 = null;
    }
}
