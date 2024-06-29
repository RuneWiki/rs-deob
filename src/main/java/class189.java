import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class189 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Z")
    public static boolean field3520 = true;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lhi;")
    public static class250 field3524;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Ltg;")
    public static class270 field3523;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Lb;")
    public static final class49 method1361(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3627; var4++) {
            class49 var5 = var3.field3646[var4];
            if ((var5.field802 >> 29 & 0x3L) == 2L && var5.field816 == arg1 && var5.field796 == arg2) {
                class179.method1267(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lti;Z)I")
    public static final int method1362(class188 arg0, boolean arg1) {
        if (!arg1) {
            field3523 = null;
        }
        field3521++;
        int var2 = arg0.field3504;
        if (arg0.field2693 == arg0.field2654) {
            var2 = arg0.field3482;
        } else if (arg0.field2667 == arg0.field2654) {
            var2 = arg0.field3518;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lhi;ZLhi;Lhi;)V")
    public static final void method1363(class250 arg0, boolean arg1, class250 arg2, class250 arg3) {
        if (!arg1) {
            method1365(21);
        }
        class47.field769 = arg0;
        field3522++;
        class27.field452 = arg3;
        class123.field2227 = arg2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZIII)V")
    public static final void method1364(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        field3526++;
        class94.field1784 = (short) arg3;
        if (arg0 != 0) {
            method1365(68);
        }
        class66.field1162 = (short) arg1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1365(int arg0) {
        field3523 = null;
        if (arg0 >= -93) {
            field3523 = null;
        }
        field3524 = null;
    }
}
