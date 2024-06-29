import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class582 {

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "[I")
    public static int[] field8230 = new int[1];

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Ldh;")
    public static class320 field8226 = new class320(1, 2);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public int field8222;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public int field8223;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public int field8224;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public int field8225;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public int field8227;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public int field8231;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public int field8233;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[B")
    public byte[] field8220;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "[B")
    public byte[] field8229;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "[I")
    public static int[] field8221;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 3)
    public static void method3348(int arg0) {
        field8221 = null;
        if (arg0 != 2) {
            field8226 = null;
        }
        field8226 = null;
        field8230 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 22)
    public static final void method3349(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class563.field8026 = arg0;
        class128.field1340 = arg1;
        class625.field8980 = class128.field1340 > 1 && class563.field8026.method411();
        class748.field10430 = arg2;
        class559.field7987 = 0x1 << class748.field10430;
        class598.field8523 = class559.field7987 >> 1;
        Math.sqrt((double) (class598.field8523 * class598.field8523 + class598.field8523 * class598.field8523));
        class723.field10134 = arg3;
        class284.field3473 = arg4;
        class151.field1664 = arg5;
        class626.field8992 = arg6;
        class30.field349 = class436.method2720(112);
        class514.method3034(-79);
        class735.field10270 = new class691[arg3][class284.field3473][class151.field1664];
        class11.field88 = new class278[arg3];
        if (arg7) {
            class248.field3011 = new int[class284.field3473][class151.field1664];
            class703.field9910 = new byte[class284.field3473][class151.field1664];
            class648.field9262 = new short[class284.field3473][class151.field1664];
            class316.field3973 = new class691[1][class284.field3473][class151.field1664];
            class159.field1758 = new class278[1];
        } else {
            class248.field3011 = null;
            class703.field9910 = null;
            class648.field9262 = null;
            class316.field3973 = null;
            class159.field1758 = null;
        }
        if (arg8) {
            class210.field2482 = new long[arg3][arg4][arg5];
            class745.field10409 = new class614[65535];
            class284.field3450 = new boolean[65535];
            class275.field3367 = 0;
        } else {
            class210.field2482 = null;
            class745.field10409 = null;
            class284.field3450 = null;
            class275.field3367 = 0;
        }
        class78.method552(false);
        class436.field6357 = new class361[2];
        class300.field3729 = new class361[2];
        class228.field2626 = new class361[2];
        class119.field1228 = new class361[10000];
        class479.field6842 = 0;
        class461.field6573 = new class361[5000];
        class211.field2489 = 0;
        class139.field1560 = new class340[5000];
        class485.field6894 = 0;
        class233.field2770 = new boolean[class626.field8992 + class626.field8992 + 1][class626.field8992 + class626.field8992 + 1];
        class511.field7298 = new boolean[class626.field8992 + class626.field8992 + 2][class626.field8992 + class626.field8992 + 2];
        class255.field3122 = new int[class626.field8992 + class626.field8992 + 2];
        class36.field387 = class36.field383;
        if (class625.field8980) {
            class391.field5395 = new boolean[arg3][class626.field8992 + class626.field8992 + 1][class626.field8992 + class626.field8992 + 1];
            class486.field6968 = new boolean[arg3][][];
            if (class472.field6766 != null) {
                class390.method2406();
            }
            class472.field6766 = new class81[class128.field1340];
            class563.field8026.method390(class472.field6766.length + 1);
            class563.field8026.method392(0);
            for (int var9 = 0; var9 < class472.field6766.length; var9++) {
                class472.field6766[var9] = new class81(var9 + 1, class563.field8026);
                (new Thread(class472.field6766[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class128.field1340 == 2) {
                var10 = 4;
                class577.field8147 = 2;
            } else if (class128.field1340 == 3) {
                var10 = 6;
                class577.field8147 = 3;
            } else {
                var10 = 8;
                class577.field8147 = 4;
            }
            class727.field10181 = new class588[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class727.field10181[var11] = new class588(class27.field289[class128.field1340 - 2][var11]);
            }
        } else {
            class577.field8147 = 1;
        }
        class394.field5413 = new int[class577.field8147 - 1];
        class439.field6376 = new int[class577.field8147 - 1];
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIZ)I", line = 142)
    public static final int method3350(int arg0, int arg1, int arg2, boolean arg3) {
        field8232++;
        if ((class100.field1043[arg0][arg2][arg1] & 0x8) == 0) {
            if (!arg3) {
                method3350(124, 123, 15, true);
            }
            return arg0 <= 0 || (class100.field1043[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 173)
    public static final void method3351(int arg0) {
        class340.field4392++;
        field8228++;
        if (arg0 != 28398) {
            method3351(86);
        }
        class249 var1 = class289.method1715(class271.field3349, 123, class41.field470);
        var1.field3016.method1460(0, 24710);
        class510.method3017(var1, arg0 - 28293);
    }
}
