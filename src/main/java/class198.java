import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class198 {

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "Lbba;")
    public static class125 field2996 = new class125(64);

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "Lfja;")
    public static class783 field2997 = new class783(124, 1);

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "Lwg;")
    public static class450 field2998 = new class450(4, 1, 1, 1);

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "[I")
    public static int[] field2999 = new int[256];

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)V", line = 9)
    public static final void method1427(int arg0, int arg1, int arg2) {
        field2995++;
        class747.field10318 = arg0;
        class547.field7439 = arg1;
        if (arg2 != 359767393) {
            return;
        }
        if (class278.field3847 == 0) {
            class256.field3597 = class466.field6317 * 2 + class547.field7439;
            class663.field9209 = class747.field10318 + (class537.field7300 * 2);
        } else if (class278.field3847 == 1) {
            class262.field3681 = class547.field7439 / class658.field9108 + class765.field10553 + 2;
            class317.field4324 = class747.field10318 / class471.field6394 + class746.field10303 + 2;
            class256.field3597 = class658.field9108 * class262.field3681;
            class663.field9209 = class471.field6394 * class317.field4324;
            class466.field6317 = class256.field3597 - class547.field7439 >> 1;
            class537.field7300 = class663.field9209 - class747.field10318 >> 1;
        } else if (class278.field3847 == 2) {
            class256.field3597 = class547.field7439;
            class663.field9209 = class747.field10318;
            return;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Lqj;", line = 52)
    public static final class537 method1428(int arg0) {
        field2994++;
        if (class148.field2477 == 0) {
            return new class537();
        } else {
            if (arg0 != -16316) {
                field2996 = null;
            }
            return class661.field9160[--class148.field2477];
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V", line = 70)
    public static void method1429(int arg0) {
        field2998 = null;
        field2997 = null;
        field2996 = null;
        if (arg0 != 2) {
            method1429(-104);
        }
        field2999 = null;
    }
}
