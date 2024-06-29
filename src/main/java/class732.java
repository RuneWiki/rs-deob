import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class732 {

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "Ljava/lang/String;")
    public String field10246;

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "I")
    public int field10244;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "J")
    public long field10242;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "Ljava/lang/String;")
    public String field10245;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
    public int field10247;

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "I")
    public static int field10243;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method4075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field10243++;
        class226 var10 = null;
        for (class226 var11 = (class226) class476.field6811.method1522(true); var11 != null; var11 = (class226) class476.field6811.method1527((byte) 121)) {
            if (var11.field3235 == arg0 && var11.field3237 == arg8 && var11.field3225 == arg4 && var11.field3230 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class226();
            var10.field3237 = arg8;
            var10.field3230 = arg9;
            var10.field3235 = arg0;
            var10.field3225 = arg4;
            if (arg8 >= 0 && arg4 >= 0 && arg8 < class174.field2540 && class716.field9999 > arg4) {
                class224.method1550(var10, 121);
            }
            class476.field6811.method1526(var10, 78);
        }
        var10.field3222 = arg2;
        int var12 = -15 % ((arg6 + 51) / 35);
        var10.field3231 = arg3;
        var10.field3233 = arg1;
        var10.field3236 = arg7;
        var10.field3234 = arg5;
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class732(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field10246 = arg3;
        this.field10244 = arg0;
        this.field10242 = arg4;
        this.field10245 = arg1;
        this.field10247 = arg2;
    }
}
