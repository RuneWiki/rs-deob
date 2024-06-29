import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class141 extends class275 {

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "[I")
    public static int[] field2277 = new int[500];

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field2280 = -1;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Lpi;")
    public static class201 field2274 = new class201(64);

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public static void method1054(byte arg0) {
        if (arg0 == 49) {
            field2277 = null;
            field2274 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIILff;JLff;Lff;)V")
    public static final void method1055(int arg0, int arg1, int arg2, int arg3, class4 arg4, long arg5, class4 arg6, class4 arg7) {
        class226 var9 = new class226();
        var9.field3313 = arg4;
        var9.field3317 = arg1 * 128 + 64;
        var9.field3320 = arg2 * 128 + 64;
        var9.field3314 = arg3;
        var9.field3318 = arg5;
        var9.field3326 = arg6;
        var9.field3315 = arg7;
        int var10 = 0;
        class313 var11 = class223.field3286[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field5022; var12++) {
                class156 var13 = var11.field5037[var12];
                if ((var13.field2431 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2436.method17();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3325 = -var10;
        if (class223.field3286[arg0][arg1][arg2] == null) {
            class223.field3286[arg0][arg1][arg2] = new class313(arg0, arg1, arg2);
        }
        class223.field3286[arg0][arg1][arg2].field5013 = var9;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZILlc;II)V")
    public static final void method1056(int arg0, int arg1, boolean arg2, int arg3, class270 arg4, int arg5, int arg6) {
        field2278++;
        class287.field4604 = arg5;
        class286.field4588 = arg4;
        class35.field451 = arg2;
        class192.field2833 = arg1;
        class207.field3062 = 1;
        if (arg3 == -32768) {
            class210.field3103 = arg6;
            class263.field4133 = arg0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZ)V")
    public static final void method1057(boolean arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field2275++;
        if (class7.field73 != arg0) {
            class7.field73 = arg0;
            class44.method266(arg1);
        }
    }
}
