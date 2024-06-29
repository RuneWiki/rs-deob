import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class355 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field5138 = -2;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lku;")
    public static class232 field5137 = new class232(4);

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lb;")
    public static class201 field5139;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method2213(int arg0) {
        field5137 = null;
        field5139 = null;
        if (arg0 != 1) {
            method2213(68);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method2214(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class216.field3242 = arg0;
        class418.field5845 = 0x1 << class216.field3242;
        class248.field3674 = class418.field5845 >> 1;
        class190.field2823 = (int) Math.sqrt((double) (class248.field3674 * class248.field3674 + class248.field3674 * class248.field3674));
        class287.field4186 = arg2;
        class360.field5188 = arg3;
        class36.field463 = arg4;
        class169.field2475 = new class88[arg1][class287.field4186][class360.field5188];
        class178.field2556 = new class426[arg1];
        if (arg5) {
            class114.field1465 = new int[class287.field4186][class360.field5188];
            class191.field2841 = new byte[class287.field4186][class360.field5188];
            class135.field1788 = new byte[class287.field4186][class360.field5188];
            class311.field4394 = new class88[1][class287.field4186][class360.field5188];
            class28.field388 = new class426[1];
        } else {
            class114.field1465 = null;
            class191.field2841 = null;
            class135.field1788 = null;
            class311.field4394 = null;
            class28.field388 = null;
        }
        if (arg6) {
            class337.field4910 = new long[arg1][arg2][arg3];
            class478.field6712 = new class94[65535];
            class213.field3212 = new boolean[65535];
            class480.field6737 = 0;
        } else {
            class337.field4910 = null;
            class478.field6712 = null;
            class213.field3212 = null;
            class480.field6737 = 0;
        }
        class434.method2566(false);
        class451.field6241 = new class9[500];
        class23.field302 = 0;
        class279.field4118 = new class9[500];
        class382.field5458 = 0;
        class177.field2542 = new int[arg1][class287.field4186 + 1][class360.field5188 + 1];
        class293.field4249 = new class304[5000];
        class231.field3493 = 0;
        class386.field5483 = new boolean[class36.field463 + class36.field463 + 1][class36.field463 + class36.field463 + 1];
        class271.field3950 = new boolean[class36.field463 + class36.field463 + 2][class36.field463 + class36.field463 + 2];
        class405.field5702 = null;
    }
}
