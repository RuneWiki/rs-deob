import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class45 {

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Ljd;")
    public static class216 field613 = new class216(5, 1);

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Ldr;")
    public static class675 field615 = new class675(108, 6);

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 6)
    public static void method275(int arg0) {
        field613 = null;
        field615 = null;
        if (arg0 != 0) {
            field615 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method276(int arg0, int arg1, int arg2) {
        field614++;
        if (arg1 != 1895) {
            method275(27);
        }
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lkaa;IILoa;Lfca;IILki;)V", line = 35)
    public static final void method277(class44 arg0, int arg1, int arg2, class650 arg3, class79 arg4, int arg5, int arg6, class663 arg7) {
        field612++;
        int var8 = arg4.field1032 - (arg6 / 2) - 5;
        int var9 = arg5 + 2;
        if (arg7.field9013 != arg1) {
            arg3.method3630((byte) -120, arg6 + 10, var9, var8, arg7.field9013, arg0.method268() * arg2 + arg5 + 1 - var9);
        }
        if (arg7.field8997 != 0) {
            arg3.method3636(arg2 * arg0.method268() + arg5 + 1 - var9, arg7.field8997, var8, var9, arg6 + 10, (byte) -101);
        }
        int var10 = arg7.field8999;
        if (arg4.field1022 && arg7.field8980 != -1) {
            var10 = arg7.field8980;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            String var12 = class208.field2474[var11];
            if ((arg2 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg0.method269(arg3, var12, arg4.field1032, arg5, var10, true);
            arg5 += arg0.method268();
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIZZ)V", line = 76)
    public static final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class480.field5972 = arg0;
        class97.field1256 = 0x1 << class480.field5972;
        class660.field8949 = class97.field1256 >> 1;
        class522.field6613 = (int) Math.sqrt((double) (class660.field8949 * class660.field8949 + class660.field8949 * class660.field8949));
        class266.field3361 = class97.field1256 >> 2;
        class397.field5043 = class97.field1256;
        class546.field6871 = arg2;
        class36.field538 = arg3;
        class664.field9021 = arg4;
        class126.field1539 = new class565[arg1][class546.field6871][class36.field538];
        class252.field3250 = new class140[arg1];
        if (arg5) {
            class612.field8321 = new int[class546.field6871][class36.field538];
            class29.field349 = new byte[class546.field6871][class36.field538];
            class493.field6143 = new short[class546.field6871][class36.field538];
            class19.field205 = new class565[1][class546.field6871][class36.field538];
            class286.field3633 = new class140[1];
        } else {
            class612.field8321 = null;
            class29.field349 = null;
            class493.field6143 = null;
            class19.field205 = null;
            class286.field3633 = null;
        }
        if (arg6) {
            class189.field2250 = new long[arg1][arg2][arg3];
            class370.field4785 = new class660[65535];
            class686.field9370 = new boolean[65535];
            class303.field3838 = 0;
        } else {
            class189.field2250 = null;
            class370.field4785 = null;
            class686.field9370 = null;
            class303.field3838 = 0;
        }
        class689.method3809(false);
        class290.field3670 = new class352[1000];
        class370.field4782 = 0;
        class352.field4547 = new class352[1000];
        class510.field6382 = 0;
        class188.field2224 = new int[arg1][class546.field6871 + 1][class36.field538 + 1];
        class469.field5797 = new class597[5000];
        class459.field5722 = 0;
        class82.field1060 = new boolean[class664.field9021 + class664.field9021 + 1][class664.field9021 + class664.field9021 + 1];
        class42.field597 = new boolean[class664.field9021 + class664.field9021 + 2][class664.field9021 + class664.field9021 + 2];
        class489.field6114 = null;
    }
}
