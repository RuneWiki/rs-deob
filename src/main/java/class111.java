import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class111 extends class397 {

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "Lbt;")
    public static class32 field1452 = new class32();

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "Z")
    public static boolean field1455 = false;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Lwt;")
    public static class194 field1453 = new class194("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1456 = 0;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class111() {
        this(4096);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
    public class111(int arg0) {
        super(0, true);
        this.field1451 = 4096;
        this.field1451 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (~arg0 == -1) {
            this.field1451 = (arg2.method941((byte) 124) << 12) / 255;
        }
        ++field1449;
        if (arg1 != 80) {
            this.field1451 = 120;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field1450;
        int[] var3 = super.field5854.method465(arg1, 104);
        if (arg0 != -780833076) {
            field1453 = null;
        }
        if (super.field5854.field991) {
            class268.method1644(var3, 0, class164.field2152, this.field1451);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    public static void method658(int arg0) {
        field1452 = null;
        if (arg0 == 4096) {
            field1453 = null;
        }
    }
}
