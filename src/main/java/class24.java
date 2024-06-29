import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class24 extends class530 {

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field270 = 1;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(ILah;)V")
    public class24(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lah;)V")
    public class24(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        super.field7419 = arg0;
        if (arg1 > -38) {
            field266 = -79;
        }
        ++field269;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field264;
        int var3 = 53 % ((63 - arg1) / 60);
        return !class712.method4009((byte) -64, super.field7418.field5158.method1006(0)) ? 3 : 1;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        if (arg0 != 0) {
            this.method134(false);
        }
        ++field272;
        return 0;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)I")
    public final int method133(int arg0) {
        if (arg0 != 0) {
            method135(-75);
        }
        ++field265;
        return super.field7419;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(Z)Z")
    public final boolean method134(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field263;
            return class712.method4009((byte) 126, super.field7418.field5158.method1006(0));
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (!arg0) {
            this.method75(-116, 9);
        }
        ++field268;
        if (super.field7418.field5158.method1005(-107) && !class712.method4009((byte) -2, super.field7418.field5158.method1006(0))) {
            super.field7419 = 0;
        }
        if (~super.field7419 > -1 || ~super.field7419 < -3) {
            super.field7419 = this.method74(0);
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
    public static final void method135(int arg0) {
        ++field267;
        if (class666.field9389 != null) {
            class562.field7995 = new class248();
            class562.field7995.method1579(class666.field9389.field6432, class666.field9389, class666.field9389.field6435.method891(-2041650704, class369.field4721), class612.field8700, (byte) 83);
            class494.field6942 = new Thread(class562.field7995, "");
            class494.field6942.start();
            int var1 = 81 / ((arg0 - 63) / 35);
        }
    }
}
