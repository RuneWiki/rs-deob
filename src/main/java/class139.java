import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class139 extends class280 {

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2243 = "red:";

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "S")
    public static short field2248 = 256;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Z")
    public static boolean field2246 = true;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "J")
    public long field2242;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lhf;")
    public class139 field2249;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Lhf;")
    public class139 field2250;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V")
    public static void method984(boolean arg0) {
        if (arg0) {
            field2248 = 123;
        }
        field2243 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIILwg;Lwg;IIJ)V")
    public static final void method985(int arg0, int arg1, int arg2, int arg3, class178 arg4, class178 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class99 var10 = new class99();
        var10.field1464 = arg8;
        var10.field1463 = arg1 * 128 + 64;
        var10.field1459 = arg2 * 128 + 64;
        var10.field1457 = arg3;
        var10.field1466 = arg4;
        var10.field1458 = arg5;
        var10.field1462 = arg6;
        var10.field1453 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class220.field3525[var11][arg1][arg2] == null) {
                class220.field3525[var11][arg1][arg2] = new class286(var11, arg1, arg2);
            }
        }
        class220.field3525[arg0][arg1][arg2].field4526 = var10;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public final void method986(int arg0) {
        field2247++;
        if (this.field2249 == null) {
            return;
        }
        this.field2249.field2250 = this.field2250;
        this.field2250.field2249 = this.field2249;
        if (arg0 == 0) {
            this.field2250 = null;
            this.field2249 = null;
        }
    }
}
