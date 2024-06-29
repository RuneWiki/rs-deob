import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class632 extends class177 {

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public int field9089;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "J")
    public static long field9091 = 0L;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Lom;")
    public static class344 field9092;

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V")
    public class632(int arg0) {
        this.field9089 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method3607(byte arg0) {
        if (arg0 <= -16) {
            field9092 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILr;IIII)Lda;")
    public static final class55 method3608(int arg0, int arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6) {
        field9090++;
        long var7 = (long) arg3;
        class55 var9 = (class55) class601.field8616.method1900(var7, arg1 ^ 0x47A3);
        short var10 = 2055;
        if (var9 == null) {
            class519 var11 = class79.method826(arg3, 0, 4096, class344.field5127);
            if (var11 == null) {
                return null;
            }
            if (var11.field7312 < 13) {
                var11.method3060((byte) -116, 2);
            }
            var9 = arg2.method37(var11, var10, class236.field3517, 64, 768);
            class601.field8616.method1904(var9, var7, -1);
        }
        class55 var12 = var9.method357((byte) 2, var10, true);
        if (arg4 != 0) {
            var12.method349(arg4);
        }
        if (arg0 != 0) {
            var12.method356(arg0);
        }
        if (arg1 != 18416) {
            method3607((byte) 92);
        }
        if (arg6 != 0) {
            var12.method366(arg6);
        }
        if (arg5 != 0) {
            var12.method337(0, arg5, 0);
        }
        return var12;
    }
}
