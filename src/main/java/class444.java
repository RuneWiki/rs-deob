import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class444 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6143 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Loh;")
    public static class370 field6144 = new class370(5, 1);

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lem;")
    public static class206 field6146 = new class206(70, 8);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Lit;")
    public static class599 field6147;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lr;IIIIIIZZ)V")
    public static final void method2518(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class401.field5619 = arg0;
        class152.field2223 = arg1;
        class17.field174 = class152.field2223 > 1 && class401.field5619.method178();
        class588.field8259 = arg2;
        class631.field8750 = 0x1 << class588.field8259;
        class265.field3586 = class631.field8750 >> 1;
        Math.sqrt((double) (class265.field3586 * class265.field3586 + class265.field3586 * class265.field3586));
        class107.field1493 = arg3;
        class335.field4511 = arg4;
        class643.field8878 = arg5;
        class36.field428 = arg6;
        class10.field95 = class155.method1108(14898);
        class365.method2111((byte) 72);
        class468.field6438 = new class390[arg3][class335.field4511][class643.field8878];
        class497.field6766 = new class37[arg3];
        if (arg7) {
            class437.field6073 = new int[class335.field4511][class643.field8878];
            class523.field7099 = new byte[class335.field4511][class643.field8878];
            class24.field305 = new short[class335.field4511][class643.field8878];
            class310.field4290 = new class390[1][class335.field4511][class643.field8878];
            class52.field606 = new class37[1];
        } else {
            class437.field6073 = null;
            class523.field7099 = null;
            class24.field305 = null;
            class310.field4290 = null;
            class52.field606 = null;
        }
        if (arg8) {
            class508.field6965 = new long[arg3][arg4][arg5];
            class334.field4501 = new class130[65535];
            class706.field9975 = new boolean[65535];
            class53.field609 = 0;
        } else {
            class508.field6965 = null;
            class334.field4501 = null;
            class706.field9975 = null;
            class53.field609 = 0;
        }
        class503.method2881(false);
        class383.field5425 = new class295[2][];
        class383.field5425[0] = new class295[class220.field3078[0]];
        class383.field5425[1] = new class295[class220.field3078[1]];
        class89.field1287 = new int[2];
        class216.field3061 = new class295[2][];
        class216.field3061[0] = new class295[class167.field2441[0]];
        class216.field3061[1] = new class295[class167.field2441[1]];
        class582.field8197 = new int[2];
        class420.field5921 = new class295[2][];
        class420.field5921[0] = new class295[class629.field8728[0]];
        class420.field5921[1] = new class295[class629.field8728[1]];
        class466.field6417 = new int[2];
        class401.field5627 = new class295[10000];
        class333.field4494 = 0;
        class635.field8784 = new class295[5000];
        class419.field5917 = 0;
        class544.field7388 = new class210[5000];
        class590.field8286 = 0;
        class147.field2093 = new boolean[class36.field428 + class36.field428 + 1][class36.field428 + class36.field428 + 1];
        class133.field1903 = new boolean[class36.field428 + class36.field428 + 2][class36.field428 + class36.field428 + 2];
        if (class17.field174) {
            class598.field8354 = new boolean[arg3][class36.field428 + class36.field428 + 1][class36.field428 + class36.field428 + 1];
            class497.field6756 = new boolean[arg3][][];
            if (class494.field6736 != null) {
                class65.method558();
            }
            class494.field6736 = new class161[class152.field2223];
            class401.field5619.method191(class494.field6736.length + 1);
            class401.field5619.method173(0);
            for (int var9 = 0; var9 < class494.field6736.length; var9++) {
                class494.field6736[var9] = new class161(var9 + 1, class401.field5619);
                (new Thread(class494.field6736[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class152.field2223 == 2) {
                var10 = 4;
                class259.field3519 = 2;
            } else if (class152.field2223 == 3) {
                var10 = 6;
                class259.field3519 = 3;
            } else {
                var10 = 8;
                class259.field3519 = 4;
            }
            class672.field9424 = new class216[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class672.field9424[var11] = new class216(class284.field3888[class152.field2223 - 2][var11]);
            }
        } else {
            class259.field3519 = 1;
        }
        class645.field8917 = new int[class259.field3519 - 1];
        class479.field6610 = new int[class259.field3519 - 1];
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static void method2519(boolean arg0) {
        field6143 = null;
        field6146 = null;
        if (arg0) {
            field6147 = null;
            field6144 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method2520(int arg0, int arg1, byte[] arg2) {
        field6142++;
        byte[] var3 = new byte[arg1];
        if (arg0 <= 123) {
            return null;
        } else {
            class359.method2053(arg2, 0, var3, 0, arg1);
            return var3;
        }
    }
}
