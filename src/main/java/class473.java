import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class473 extends class453 {

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "F")
    public static float field6790 = 0.0F;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "Lf;")
    public static class257 field6795;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "[B")
    private byte[] field6791;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZII)[B")
    public final byte[] method2777(int arg0, boolean arg1, int arg2, int arg3) {
        field6796++;
        this.field6791 = new byte[arg0 * arg2 * arg3 * 2];
        this.method1936(arg3, arg2, arg0, arg1);
        return this.field6791;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z")
    public static final boolean method2778(int arg0, int arg1, int arg2) {
        field6797++;
        if (arg0 < 1) {
            field6790 = -1.9191533F;
        }
        return (arg2 & 0x40000) != 0 | class184.method1323(false, arg2, arg1) || class229.method1499(arg1, arg2, 24314);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
    public static final void method2779(boolean arg0, int arg1) {
        if (arg0) {
            if (class557.field8146 != -1) {
                class417.method2475((byte) -64, class557.field8146);
            }
            for (class259 var2 = (class259) class199.field3098.method2815(0); var2 != null; var2 = (class259) class199.field3098.method2814(4)) {
                if (!var2.method2555(19742)) {
                    var2 = (class259) class199.field3098.method2815(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class270.method1705(true, 108, var2, false);
            }
            class557.field8146 = -1;
            class199.field3098 = new class482(8);
            class544.method3196(0);
            class557.field8146 = class486.field6938;
            class7.method29(false, 22739);
            class498.method2983(-121);
            class362.method2167(class557.field8146);
        }
        field6792++;
        class436.field6278 = false;
        int var3 = -79 / ((46 - arg1) / 46);
        class330.field4563 = "";
        class616.field8808 = "";
        class30.method285(1);
        class324.field4521 = -1;
        class260.method1650(class266.field3822, 448389448);
        class103.field1708 = new class270();
        class103.field1708.field2454[0] = class430.field6136 / 2;
        class103.field1708.field3154 = class580.field8504 * 512 / 2;
        class103.field1708.field3155 = class430.field6136 * 512 / 2;
        class322.field4478 = 0;
        class551.field8078 = 0;
        class103.field1708.field2459[0] = class580.field8504 / 2;
        if (class40.field544 == 2) {
            class551.field8078 = class88.field1318 << 9;
            class322.field4478 = class522.field7694 << 9;
        } else {
            class692.method3898(1);
        }
        class403.method2433(-100);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class473() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)V")
    public static void method2780(boolean arg0) {
        if (arg0) {
            field6790 = 0.66504294F;
        }
        field6795 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)V")
    public final void method1674(int arg0, byte arg1, int arg2) {
        field6794++;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var5 = arg2 * 2;
        if (arg0 != 21395) {
            method2779(true, -83);
        }
        this.field6791[var5++] = var4;
        this.field6791[var5] = var4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILis;IB)V")
    public static final void method2781(int arg0, class101 arg1, int arg2, byte arg3) {
        int var4 = 44 / ((-arg3 - 86) / 39);
        field6793++;
        if (class512.field7616 != null || class324.field4519 || arg1 == null || class468.method2765(arg1, (byte) -89) == null) {
            return;
        }
        class512.field7616 = arg1;
        class456.field6557 = class468.method2765(arg1, (byte) -102);
        class494.field7088 = 0;
        class586.field8575 = arg0;
        class655.field9260 = arg2;
        class205.field3169 = false;
    }
}
