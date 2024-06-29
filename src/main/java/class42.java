import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class42 {

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field628 = 0;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Z")
    public static boolean field631;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "F")
    public static float field620;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "J")
    public long field622;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lda;")
    public class42 field619;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lda;")
    public class42 field630;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[B")
    public static byte[] field621;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method298(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class530.field7813 = arg0;
        class220.field2979 = 0x1 << class530.field7813;
        class497.field6892 = class220.field2979 >> 1;
        class354.field4783 = (int) Math.sqrt((double) (class497.field6892 * class497.field6892 + class497.field6892 * class497.field6892));
        class1.field94 = class220.field2979 >> 2;
        class258.field3413 = class220.field2979;
        class439.field6036 = arg2;
        class318.field4170 = arg3;
        class22.field388 = arg4;
        class490.field6821 = new class409[arg1][class439.field6036][class318.field4170];
        class209.field2868 = new class35[arg1];
        if (arg5) {
            class209.field2863 = new int[class439.field6036][class318.field4170];
            class156.field2280 = new byte[class439.field6036][class318.field4170];
            class257.field3401 = new byte[class439.field6036][class318.field4170];
            class376.field5102 = new class409[1][class439.field6036][class318.field4170];
            class37.field582 = new class35[1];
        } else {
            class209.field2863 = null;
            class156.field2280 = null;
            class257.field3401 = null;
            class376.field5102 = null;
            class37.field582 = null;
        }
        if (arg6) {
            class203.field2818 = new long[arg1][arg2][arg3];
            class37.field586 = new class360[65535];
            class118.field1709 = new boolean[65535];
            class249.field3300 = 0;
        } else {
            class203.field2818 = null;
            class37.field586 = null;
            class118.field1709 = null;
            class249.field3300 = 0;
        }
        class301.method1754(false);
        class466.field6426 = new class435[1000];
        class234.field3151 = 0;
        class508.field7059 = new class435[1000];
        class40.field607 = 0;
        class85.field1296 = new int[arg1][class439.field6036 + 1][class318.field4170 + 1];
        class32.field525 = new class37[5000];
        class238.field3189 = 0;
        class461.field6365 = new boolean[class22.field388 + class22.field388 + 1][class22.field388 + class22.field388 + 1];
        class245.field3273 = new boolean[class22.field388 + class22.field388 + 2][class22.field388 + class22.field388 + 2];
        class399.field5370 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method299(byte arg0) {
        if (arg0 < 94) {
            method298(-84, 26, 42, 73, 119, false, true);
        }
        field621 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public final void method300(boolean arg0) {
        field627++;
        if (this.field630 == null) {
            return;
        }
        this.field630.field619 = this.field619;
        this.field619.field630 = this.field630;
        this.field630 = null;
        this.field619 = null;
        if (arg0) {
            method299((byte) -52);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)Lpn;")
    public static final class523 method301(int arg0) {
        if (arg0 != 2515) {
            method299((byte) 18);
        }
        field624++;
        try {
            return (class523) Class.forName("nl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)Z")
    public final boolean method302(int arg0) {
        field626++;
        if (this.field630 == null) {
            return false;
        } else {
            if (arg0 != -25575) {
                field628 = 70;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI[B)I")
    public static final int method303(byte arg0, int arg1, byte[] arg2) {
        int var3 = 38 / ((-arg0 - 3) / 33);
        field629++;
        return class96.method690(arg2, 1, 0, arg1);
    }

    static {
        new class304("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field631 = false;
    }
}
